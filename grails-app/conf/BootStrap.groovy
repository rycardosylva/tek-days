import com.tekdays.*
class BootStrap {
	def init = { servletContext ->

		new TekUser(fullName: 'John Doe',
		userName: 'jdoe',
		password: 't0ps3cr3t',
		email: 'jdoe@johnsgroovyshop.com',
		website: 'blog.johnsgroovyshop.com',
		bio: 'John has been programming for over 40 years. ...').save()

		new TekUser(fullName: 'John Deere',
		userName: 'tractorman',
		password: 't0ps3cr3t',
		email: 'john.deere@porkproducers.org',
		website: 'www.perl.porkproducers.org',
		bio: 'John is a top notch Perl programmer and a ...').save()

		def event1 = new TekEvent(name: 'Gateway Code Camp',
		city: 'Saint Louis, MO',
		organizer: TekUser.findByFullName('John Doe'),
		venue: 'TBD',
		startDate: new Date('11/21/2013'),
		endDate: new Date('11/21/2013'),
		description: '''This conference will bring
						coders ...''').save()

		def event2 = new TekEvent(name: 'Perl Before Swine',
		city: 'Austin, MN',
		organizer: TekUser.findByFullName('John Deere'),
		venue: 'SPAM Museum',
		startDate: new Date('11/2/2013'),
		endDate: new Date('11/2/2013'),
		description: 'Join the Perl programmers of the ...').save()

		def g1 = TekEvent.findByName('Gateway Code Camp')
		g1.addToVolunteers(new TekUser(fullName: 'Sarah Martin',
		userName: 'sarah',
		password: '54321',
		email: 'sarah@martinworld.com',
		website: 'www.martinworld.com',
		bio: 'Web designer and Grails afficianado.'))
		g1.addToVolunteers(new TekUser(fullName: 'Bill Smith',
		userName: 'Mr_Bill',
		password: '12345',
		email: 'mrbill@email.com',
		website: 'www.mrbillswebsite.com',
		bio: 'Software developer, claymation artist.'))
		g1.addToVolunteers(new TekUser(fullName: 'Bill Smith',
		userName: 'Mr_Bill',
		password: '12345',
		email: 'mrbill@email.com',
		website: 'www.mrbillswebsite.com',
		bio: 'Software developer, claymation artist.'))
		g1.addToRespondents('ben@grailsmail.com')
		g1.addToRespondents('zachary@linuxgurus.org')
		g1.addToRespondents('solomon@bootstrapwelding.com')
		g1.save()
	}
	def destroy = {
	}
}
