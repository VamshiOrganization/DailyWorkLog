So please keep me honest here if I say anything otherwise, Karen.

So first things first, and I'm going on a very generic system design or basic understanding  of what alerts usually are.

I might pull in any of the examples that you might see in day to day.

So first things first, for any of the notifications that you get, right, whether, so this is your  phone here.  on any of the...  things that you get on your phone would classify those into three things.

First, SMS.

October 10th, your credit card payment of $10, $15, minimum $40 is due.

Can you make sure that you pay it off?

SMS alerts.

You go to a pharmacy.

Your prescription is ready for pick-up.

SMS alert.

Your delivery driver or delivery partner is approaching.

Please be ready with OTP and all those kind of things.

Your cab is ready.

Those kind of things.

Now, email alerts.

Your bank statement is ready for October 2026, November 2026.

Email alert.

Then the third one is push notification.

Festival coming up interested in some shopping order from Mitra ads notifications push notifications  100% cash back up to 10 rupees  Free charge I'm going back in the day  So all these kinds of push notifications you'll get once you install some apps, right?

then SMS is SMS I basically just  keep getting those in van god context what's happening.

Person or a client once or  individuals they have to become a van god client they might have to end roll  into something they might have to purchase in a service of product  particularly let's say if they enroll in advice related kind of arrangement if  they open a cash account if they open a brokerage account any kind of  ecosystem but they have to first become a client.

Assume that there is a persona here, John.

Now this client of ours has enrolled in cash.

They might have enrolled in VBA.

They might  have enrolled in advice or any kind of associated or allied products that Banker would have  done first.

Now this client, they have to receive some or the other notifications regarding  whatever is happening with your account regarding any of the other notifications.  in general I am just keeping it very generic before we fill in the gaps because we are  talking about alerts for the first time.

At this point in time there would be classification of alerts into two sections in my opinion.

One is mandatory alerts and then these could be preferred alerts.

I wouldn't say optional but preferred alerts.

What are mandatory alerts?

Something is happening on your account.

You are currently in state of Hyderabad which is your office location.

You typically stay there, you work there, your phone is basically logged in with Gmail  and everything.

First thing I am saying, you travel to your hometown, a different location.

For some reason your app got updated, you were logging in maybe from a browser and you  sign into your Gmail.

You get a notification.

Suspicious activity alert was this you did you log in from XYZ location mandatory alert  Did you ever opt for it from Google Gmail or any other preferred email services?

You might have no but it is kind of a mandatory alert  Similarly, you made a transaction you do any FD you do IMPs its ACS and wire equivalent carrots in India  So any FD IMPs any kind of transaction you do  Your account has been deputed by this much and it is posted to family member, Mandate  Realms.

Any kind of activity on your Vanguard products or offerings that might get classified under  Mandate Realms.

It might hit your phone, it might hit your SMS, it's your email, it's your push notification.  other parties this was about mobile but on the web UI  If this is your web UI, you are logged in or the client here in consideration John, they  have logged on to the Vanguard web UI, everything is here as per our nice UX components and  there could be a bell icon here, right?

You click on that bell icon, a drawer opens and then more or less you start seeing notifications  here.

Actions required or any kind of things.  these are also.  some kind of notifications on the web UI.

No, other kind of alerts are preferred alerts.

Think of it from a general perspective.

I want to get alert from my bank if,  and then you can think about the various options  that they give.

You,  go to any of online or e-commerce portals, enroll me in optional promotions, enroll me  in seasonal discounts, first early bird offers those kind of things, prefer dollars.

Because you get to choose as a customer, you get to choose as a user, what am I bothered  with?

You install an app, let's put names just for example, you install Zomato, Blink it, those  kind of apps and they start bugging you unnecessarily.

It's raining outside, try some tea and bhajiya.

It is cold outside, get some warm clothes delivered at your house from Mithra, those  kind of things.

Those are commercial or advertisements.

Did you sign up for them?

What would you do?

Unsubscribe.  immediately you can say unsubscribe.

I don't want to receive all these alerts.

SMSs reply stop to stop receiving these alerts or reply can whatever that is.

Now these are kind of preferred which you would want to stop mandatory.

Now this  thing has started right weather alerts there is severe thunderstorm in your  area those kind of alerts you might have seen few months ago there was a broad  in DIY testing.

Can you prefer for those?

No, it's emergency.

They have tied up with all phone companies and network companies.

Now those things are getting pushed onto you.

Whether you like it or not, whether you put your phone non-silent or not, those are ultra high emergency alerts.

I'm not going there, but just putting perspective out there.

Bring all of that into Vanguard ecosystem, whatever we know.

Think about mandatory alerts as something that Vanguard would want to or Vanguard must notify.  the clients, whether it is SMS, email or push or web, whatever is the appropriate mechanism  for that mandatory alert, they must do it for regulatory compliance reasons.

Questions until this part?

Preferred?

There is an input from the user.

So when we talk about preferred now, there is going to be input from the user.

So whenever it is input from the user, always there has to be a... UI or some kind of experience.

Now, do you want to receive question?

And you will have option number one, option number two, option number three, option number four.

Yes, no, right?

Yes, no.

I know it's radio buttons but I'm going it for check marks.

So you say yes for this, yes for this, yes for this.

Don't send me this.

These are your preferred alerts.

So if you use this experience,  it has to more or less go and sit in some database.

Let's take John.

John's point is one, two, three, four, five.

Let's call this as alerts DB.

Alerts DB.

In this alerts DB, John's preferences, John is 1, 2, 3, 4, 5, preferences are listed here.

There has to be some service, some application, some bad job, some utility that is now going to work out of this database.

So tomorrow, any kind of activity that is happening on John's Vanguard's utilities, whether it is Advice, whether it is cash, VPA, ETF, anything.

Send me an alert if this ETF goes below this price.

I want to sell it off, something like that.

Send me an alert if this rises above this particular amount.

I want to maybe make sure that I buy before that  or I try to build my portfolio around it  and things like that.

Any kind of such activity.

Now, if this is a web service that is looking for,  or any event driven structure that is going to look  for this TV.

It has to take into consideration John's preferences.

Mandatory though it will do always.

It has to do, it must do.

But for preferred alerts, something is happening.

Has John opted for it?

There could be another client, 56789.

This client is Jane.

Now Jane is like, I don't want anything extra.

Don't bother me unless it is too much.

So 5678, right?

Now if this web service, bad job, event driven,  if they are looking for such preferences.  they would see yes John wants to receive for this particular event that occurred Jane is not opting for it and then  This web service or this utility then has to  Maybe build a template around it.

Yeah, even even has occurred or even  Template T1 is there so T1 even mapping is there the templates T1 so there will be a template engine here  template T1, T2, T3, T4 and up to T and minus 1 whatever number of templates they are.

Then medium, okay T1 or E1 is an event for which the medium of communication has to be  SMS.

So it will take SMS alerts.

E1 has to or if the medium was that E1 send this as an email or send this as a push notification.

Now based upon whether you or whether this e1 event is configured for SMS, email or push  it will be mapped to relevant template.

If it is SMS, you can think about SMS being template t1.

Your account xxxx1234 or you can say your VDA account.  was credited by $510.85 as it jumped by let's say 3% today.

Something like this.

T2.

T2 template maybe could be for email.

So email would be like thank you for calling us today.

We are sending you a follow up based on your discussions with your advisor Mr. XYZ.

As per the discussion, these are your notes, follow up for advice, appointments, November,  December 12th, that email template.

So whatever is the preferred event classification that is getting here, whether SMS, email or  push.  appropriate templates would be attached and there has to be some entity, some team, some  web service, some utility, some batch job that will do this outward combination.

They will have to send it.

There are services and tools and products to do that, to not end up in spam works, to  not end up in blocked by true caller kind of thing.

So MailChimp and other things are some, but I am not sure at this moment what Vanguard  use, maybe it could be Salesforce, marketing, cloud, SFMC or any of the other tools, but  I would reserve the comment there.

So more or less this is in a nutshell what alerts ecosystem in my opinion looks like.

Now in Vanguard Context or in our debit card ecosystem  Where is it going to come in handy?

Think about it.

Our users definitely would be on Vanguard apps or they must be on Vanguard apps and on the  UI as well.

Any kind of activity related to debit, what could be one or few of the activities?

Your card was used.  debit card ending with 1111 was  Debted by $1.50 today at Walmart timestamp whatever timestamp is TZ  I mean it will be a MPM but in general  SMS this SMS you have to get read that your card was debited then you you can opt for email  You can you might get email of the same  Then, Prod alert, activity alert, we think this is a fraud, was this you, if not reach  out to the disputes as early as possible by the time it is on hold right.

So, such kind of debit related alerts.

So, our business, our UX, our product, they are exploring what would be various alerts  or various scenarios in which alerts have to be sent.

Those are almost 90 different scenarios that are coming up, which will get reduced as business  meets those decisions.

And what is important for us is to understand the ecosystem in general, try to get smart  on where to send it, how to send it, which service to integrate with it, which template  to use, all such kind of nitty-gritty details are being figured out.

Some teams have some existing set of web services.

Some teams are building some new set of web services.

We might have to build something around it to make sure that a webhook is coming in.  your card was shipped get that translate that web book into some template give it to some service that service will  basically drop off that to appropriate medium  Then do we want to give users our debit card users cash plus clientele of  600 plus to 700 plus clients  You would want to give them some UI like this or do we want to give them a UI like this so that they can say yes  Or no to some kind of alerts.

Yes or no to some kind of alerts that I don't want to get those kind of things  So we want to think about cash users or debit card users preferred alerts debit card users mandatory alerts store them somewhere  maybe in our TP or you know as we as those decisions are made we want to  understand what has to be translated into an alert related mechanism or alert  related template and we have to ship it to the appropriate team who can then  more or less send out that alert to appropriate media so this thing is  evolving it's a very complex scenario because there are lots of different  different elements to this.  anything in vanguard context if anything has to be displayed to a client on a website,  on an app, in an email, in an sms, in a push notification, in a physical letter, in a form  that might go out for them to fill out, in a vanguard inbound check related form submissions,  anything in general that has to be approved by fraud, legal, compliance, regulatory division  in such a way that you do not even put one full stop comma semicolon  hyphen, double codes, nothing that is going to you know, even if it is not reviewed you  don't even send out any kind of thing.

So the templates in particular here, whatever verbiage we would have to build or whatever  verbiage we will have to say, your account, you should not say the account, no it's your  account ending with xxxx last four.

Then there will be a big discussion on whether should you display the last phupravarna.

So all these things have to go into consideration.

Was debited by or credited by these these these are not.

So all such discussions are happening or they will happen.

For us the important part are in my opinion at this point four points.

First understanding the whole ecosystem and what constitutes as mandatory versus preferred alerts.

Should we build an ecosystem to capture the preferences for these alerts?

Third, what are different mediums?

First, SMS, email, R1 medium,  push notification falls into mobile division.

So how do we collaborate with them?

And then as we get overall leadership guidance  on architecture and technical design of this,  we will have to translate this into  epics and pieces of work and infrastructure  and web services and whatnot.

And then we will have to support the build  and maintenance around this.

It's a long-term evolving thing,  but I will stop here for any questions  or get achieved to suggest if I missed out on anything.

Yeah, it all looks good to me.

Sorry, I was eating a little something.

No, no, you're good.

Yeah, I'm not going into the snow birds or that part, but I just wanted to do a brief overview.

I think the main thing is, we're going to have a listener off of our topic.

Whether it might even be off of the topic that comes from the CVAA team,  or it might be our card management topic, I'm not.

That's still to be determined. 
