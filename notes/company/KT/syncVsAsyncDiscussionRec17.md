that will be consumed by the fraud systems at GM1 right, that event.

So, will they consume individually?

I mean, for example, if any fraud system detected any suspicious thing in that payload,  what happened in that case?

Will that be processed by GM1 or by a particular request?

Yeah, good question.

We are trying to get more clarity on this.

So for now think about it.

It is  there is a fraud service called FRO this fraud here right this is this is another web service  that is called the FRO I can say with limited information with me I don't have any final  conclusions but there typically these things come with something called as rules or there is rules  engine as well but in this case I would assume let's say someone is  new to cash rate.

So I would say someone is opening a cash account today itself and today  only they are asking for debit card.

They might say totally a new customer hold off  until the cash KYC goes through something like that.

Now one person is opening an account  they might be putting too much money into it like first day only and they are putting  one million dollars.  somebody would put that much in cash I don't know but just making up an example here.  1 million in cash account fraud would be like wait wait wait something odd is happening here  why would someone open cash account and this hold off on the debit card something like  this could happen so just one scenario that I would want to put there.

Now how do we engineer this is a different situation do we want to hold off that record  in DB do we want to flag that record in DB all those things we will have to see.

Thank you.  question and we will learn more from here as we integrate with fraud on board with fraud  and you know have them customer over events or it could be that fine you continue with  the enrollment we have flagged this client second use case could be or second scenario  could be FRO will flag that point saying that who is this person why are they trying to  get so much things in one cash account and things later and FRO might integrate with other  that we might not be aware of and they might flag that profile somewhere like your account is put on hold but  Something like that.

So as we learn more about it, you will get more clarity  But honestly at this moment I have no I don't have an engineer to the solution around this year  But yeah, very good question feel free to think through such scenarios and try to bring them or ask them  But yeah, roof out anyone else  One more question.

So in the discussions Swetha mentioned for the court locker active to do the court activation court locker  Unbox, so we are not going through the SDK.

We are building an arrest API in GM 3 she mentioned  So is the trust API, will the UX people directly call the trust API or a trust API will be  also on board at the supergroup?

How that call will happen?

Good question.

As I mentioned, so let's cover the first part.

So there are two ways about it.

Two schools of thoughts here.

One, this is our CM3 here.

So for sure it is going to be ZM32 accept any kind of requests.

Now before ZM3 accepts any kind of requests, puts it in ZM2 and this pipeline will stay  the same.

Now the question remains, do you want to?

Let's take lock and lock as an example.  doing this on purpose so  There are three scenarios that could happen.

Now first scenario is if you see this purple color, this is a Veej or the magenta or pink  color, this is a Veej Ui, this is a Veej Ui and this is a Veej Ui.

This is green color which means it is a crew Ui.

This is pink color.

This means this is a client Ui.  and this is purple color, this is SDK UI or UI with SDK.

The scenario we are talking here is lock, unlock  and others associated with it.

Now, can we do pin setting in this manner?

Absolutely not.

Can we do reveal pin in this manner?

Absolutely not.

Can you do show pan and other details?

No.

But there are some features that are available in SDK.

Okay, such as lock unlock which may or may not be a which ideally is not a PCI compliant operation  That is where our archetypes and leadership is thinking about it like it is not PCI compliant  So why use SDK if you have API use API try to use as less of market as possible again same reason  No contracts have been signed yet anything can go wrong if something goes wrong.

We don't want to lose our build  So from that point of view they are thinking  Let's try to reduce as much as dependency on marketer as possible.

If we can build it with custom Vanguard experiences, build it.

If we can build it through API, build it.

If it is not PCI-Complanted, API preferred over SDK.

So the least possible use of SDK is the underline principle for this.

So what will happen?

Either if you use SDK, this API call will never come to our ecosystem.  it will go out and out to the market or platform.

Correct.

We are never going to use our ecosystem in here.

We use SDK route.

Now the second part is if we want to do API  or if you want to do the client event, crew event, communicate through CM3  there are two ways to do it.

Either you put a mutation  or you put a rest API.

The other way to do this is to do a mutation.

Because that part of the request payload is filled in the mutation query, you create mutations  for all those operations.

Let the people decide on what they want to mutate on.

If they want to mutate on,  the worst example that I believe, the lock unlock, then let them fill out the lock unlock  pin.

If they want to fill out, mute it on any other operation such as submit a request  to replace a card, because replace is also part of SDK.

For that I would go to SDK and  look at various features that are available under card management.

So there are I think  Thank you.  lock and lock, lost, stolen, revealed, been, set, been and bunch of other features.

So under card management you can say card and this is your card here.

So we don't want to do this as we talked the other day.

Like this is exposing users to fraud.

So no need to do this.

Then you have activate card, the first one to begin with.

Virtual card we are trying to set it to active.  physically.  pending activation and then you send a request to activate.

So you would think of a mutation  to activate card.

People want to activate it, fill out the activation part of it.

I would  have preferred REST APIs. I will push for it and see what happens.

But let's see if  you can get it done through mutations first.

Then set pin definitely not, reveal pin absolutely  not card, not preferred, replace card.  put a request to replace card because it is lost, stolen or damaged.

Either you click  here and replace card request or you build this UI with UX people.

They will design  and then they will put screens and everything.

We just have to make APIs and mutations available  for this.

So, okay, you are trying to replace card.

Why do you want to replace?

Is your  card lost?

Is your card stolen or is your card damaged?

Then we will have to make those  arrangements prepare the payload.  then it's ZM1's job, they will basically decide which API call to make, which reason to put  it in there, that all we will give, but they will just slot it in that appropriate sections  and they will move it forward.

So how it will look is, we have a punch of mutations that are available, you fill out  which one is there, that would get transformed into a payload, you fill out this section  that will get transformed into payload, you fill out this section that will get transformed  into payload, we will give that payload to ZM1, they will make the outbound calls.

Now actions are here, lock, then view pins have been not required, replaced cut.

So again it's a condensed component with all the options there.

So there are such other things as well.

I'm not sure about the disputes yet.

On-boarding definitely we are going to custom.

So this is also one of the examples if you can see.

Do you want to on-board or enroll a customer with their SDK form?

So.

You would want a custom Vanguard build UI hitting our ZM3 mutation, getting translated  or stored in ZM2, getting translated by ZM1 out the door from Vanguard ecosystem to marketer.

So if these examples, if you think about it, in summary, some features are available in  SDK, which you can do it by API, which do not fall under PCI compliance, do it with API  and custom UI for the features for which absolutely you must use SDK will only be those scenarios  where  PCI DSS compliance is mandatory pin setting, reveal pin, view card number, those things.

Does that give you a good summary of that?

Yes, I am sure.

Questions, follow-ups, any other thoughts anyone?

Yes, sure.

So, if we implement any of those operations?

Yes.

So since we are using the asynchronous communication in our architecture like putting the payload  into the topic, if there are any operations which are synchronous in marketer, we cannot  able to do those operations here.

If the user want to lock his card, so in case of marketer like when user clicks on UI like  lock my card, then it will be a synchronous call and it will be updated.  at the same time and it will be shown to the user.

But in our example, we will make a payload and put it in the topic and we will wait for  the web book and we will confirm for the user.

Did I lose you?

Hello?

Yeah.

Okay.

So, yeah.

Come here, sir, please.

Yeah, so I am thinking like, if there are any operations which is synchronous, which  market handles.  through their SDK like locking the card.

So when user clips on the UI to lock his card,  then since it is a synchronous one,  then a marketer will immediately send the response  to the user.

But if we implement that API in our architecture,  since we are getting the request  and making a payload and putting in the topic,  and we are sending that request to marketer,  and we will wait for the webhook to come and update our DB and then only we can confirm  that cart is properly locked.

So if you want to implement any synchronous kind of operation  in our architecture, would it be possible?

Yeah, absolutely.

Is the architecture set in stone?

Absolutely not.

This is a very  initial, I would say, third revision of this architecture.

First was not with this.

There  are two or three revisions.

This is the third revision I have in front of me.  scenario that you mentioned that is applicable even for the enrollment so  there are a lot of debates that are going on that UX is telling why do you  want to go into asynchronous and everything architecture and engineering  saying no we need to keep it loosely coupled and also all those debates are  going on UX wants everything synchronous ideally they are saying  that our clients will feel like this and as you brought up that scenario same  thing for not even for lock and lock even for enrollment they are saying like  no have the user on the screen and then give them the enroll card versus the other parties  just accept the submission and say that your card will be provisioned  So, since everyone is new, I mean, the group itself is new, right?

The leadership and other departments are also new.

So, everyone is trying to come to the same page.

And as this evolves, these things will come up where I anticipate that scenarios like  lock or replace might be a simple thing, like it can be a sink.

But lock is one of them.

What might need an urgent response could be... If they go down the view details that could be like one of the important ones.

Future it is required.

Pushprivige and I think they are doing with SDK.

So these things will come up.

So currently this is one of the hot topics that you asked.

Synchronous versus asynchronous.

You talked in context of lock and lock but already the discussions are going on on the  enrollment side itself.  we want synchronous enrollment.

We have committed to give the card in under one minute.

Why are you doing it is in the same way.

So, evolving situation I would say.

Okay, got it.

Good question.

Yes.

So we are not going to use a spring model at this point.

No, so we have to scrap the spring  model experiment for now.

So yesterday mentioned like we're going to use Apache fling  How can you explain more about where we use it?

Yeah, Apache fling I'll keep it for a separate discussion.

We'll have it tomorrow at the after.

But I bring that up and we'll talk about it.

Because we have to now go at 9.30 so I'm just... It might take 30 minutes of that whole discussion.

Any other thoughts, questions?

is everyone following this one?

are you good?

are you learning along?

yeah actually i am more into concentrated and still locates  i am going to this flow whatever you explain  i need to go over more  Whatever the questions they raised I understand but once I go into deep that diagram more  I will get more information on that.

I will focus on this one.

I think my focus next to be this diagram only.

How the flow will be?

Yeah, follow along.

Draft any questions if you get.

Not necessarily you should have same questions.

Even any basic question is fine.

Like what is even market is also a fair question from your point of view.

So feel free to ask that.  as you get smart on items do one round on Friday Friday we have time for you 6 to 6  36 to 7 whatever you want to present you can present in 20 30 minutes we'll try and  understand where we are at and then Monday maybe we'll catch up on any of the items  that we need to fill in for you missions yeah I think better I will give tomorrow  some session have an artist diagram.  like whatever Shilpita said and Shiva said right online cash flow and what is cash plus  account and debit card integration that I will cover tomorrow.

Maybe I can focus so that diagram whatever we are discussing there are more because this  diagram is core right for our whatever your flow you are saying because I can concentrate  more on that.

Understood.

Sure, no, absolutely open.

If you feel that you would want a first pass tomorrow, go for it.

And we can do a quick pulse check like, okay, in what direction we are heading into and then we can fill you in infinite.

Thank you.

Okay.

I'll... tomorrow at what time you are...  ...prevising me to view?

Same meeting.

This is... so yeah, I'll have to give you context about this meeting, right?

This is an open office meeting.

So this is for all of our team members to come together.

Ideally, we try to end it as early as possible, but it's like a quick sync up.  forum where you can bring questions so there are no client representatives in  here right so you have all of our EY team here so safe space for you to bring up  any issues more or less on you know syncing up if you need any help if you  need anything to collaborate whatever you did throughout the day if you want to  reach out you can reach out during your daytime as well but just in case if you  want to bring anything to the surface if you have immediate questions or  concerns that need to be addressed by me Venkatish or anyone on the team you can  bring those so this is  some of those forums.

So let's say it could be the case that I might get pulled into another  meeting.

You can discuss with everyone.

If me and Venkatish are not available, still  this meeting is for everyone.

If no one is available, you can drop a message in the chat  when people are available then help your response.

So this is an open forum for this team exclusively.

So anything that you have to ask, discuss, solution happens in this meeting.  rest all our formalities where you will have product on that is from the client.

So product on Ashweta will be there, our leadership will be there.

So more or less if you want to understand, learn, discuss anything you have this forum  for you and wherever you have client represented is that is where outcome driven discussions  happen.

Yes. 
