all the different use cases that we will be doing.

So first things first, we need to define who we are, what are we doing and where are we  sitting.

So in this section, just highlight our infrastructure in black again.

This is us.

Then you have some serverless frontends here, right?

So there will be web teams, mobile teams, what not.

We might have to do a little bit of supergraph as well.

We will be on Supergraph.

This is our topic where we will publish stuff.

I think key parts I have marked.

So what will happen is any request right now, think about it.

Either someone is going to enroll for something.

So that is all post request.

Someone is going to query some information.

All get requests.

Someone is going to try and update something.

Either patch requests, put requests or mutations.  even in the sense of post.

Now from that point of view if you look you have client or crew use it and then they will  more or less have the UIs for them and then all those requests more or less would lie  into our ZM3 ecosystem.

The ZM3 ecosystem has to cater to post-put patch mutations any kind of those.

Delete I am not sure if you are going to delete anything.  just a high level overview of that.

CM3 being our business process will talk to our core and then  Ilty will also talk to any other outside web services if we had to make any arrangements.

So will this diagram be in point to each and every connection that we will be making?

No, this is a very high level, maybe level 1 diagram, if not level 0.

But I am not having like level 2 or 3 or 4 diagrams chopped out.

This usually is more than enough just for a high level alignment and understanding.

So we want pin point to each and every one.  that we will be doing time permits.

There is no time actually.

But whatever is out there,  this is it.

So then there is CM2, particularly we have to put everything into our ROR.

So  this is our ZM2 card core ROR database.

Connectivity has been established.

You are able to perform  all the operations all of our team members have tested.  all the credit operations on this one and using a set of sample schema.

So one quick note here, how do you create schema on table?

Are we going to create it?

No.

A different theme is going to create on it and there are tools to do it.

It's called Liquibase.

So let them use the libraries and Liquibase and everything that is going to be used.  might import it in ZM2 and then see it in action.  more to come on that but at this point item number one we need ZM3 item number  two we have ZM2 number three we have database so API API database then we  have Kafka topic now where is this going to come into picture as you can see  here any enrollment request any outward API call outbound API call that  that should happen to marketer.  is not happening in real time.

It could be near real time but it is definitely asynchronous.

So that is the appropriate definition for it.

It is going to be asynchronous.

I am  going to draw a critical path here in purple.

So first things first, anyone who wants to  enroll they will enroll through this UI.

That UI is going to call our super graph.

What  is it?

How is it?

I'll come to that.

The mutation operation basically it's going to hit our ecosystem here.

This is where we will do enrichment or more or less all kinds of data enhancement kind of thing.

We will pass on that information to core, store a section of it in database, make an event out of it at the same time.  publish it onto the topic.

So this is going to be transactional.

Now because this is going to be transactional,  so both of them  must happen at the same time.

Like, we'll have to ensure that both  happen  domically.

Once you drop an event  onto the topic,  This is the adapter that is going to make all the API calls on our behalf.

Now it is this adapter's responsibility to listen to those events.

So it will listen to those events.

It is then going to make API calls on our behalf outside to marketer.

Now here it is written where books I have been pushing to.  right response here as well.

So it will come in coming days that people will start acknowledging  that yes there is response.

I have been able to get that alignment done today.

As I mentioned  today morning that we need lot of alignments to do so good that they are acknowledging  now.

That is response and webhooks need to be treated fairly.

Market is going to give  What's up?

API response and because ZM1 is making the request ZM1 is going to get the response.

So let's talk only about responses at this moment not about webbooks.

So you got the, you made the API call you got the response.

Now ZM1 has to convert that API response JSON into a specific schema and drop it onto this  topic.

Any questions?

for.

I am good at this question.

I am good at this question.

No, no, no.

Good.

Great.

So, any response, any APA response that is going to come in  this ZM1, ZM1, it has to drop it on to this Ventra topic.

Now, we will do is  We have to listen to this topic also.

So the other team, Arbiters has created this topic.

It will then be moved to lab patterns.

But we will listen to those events  and bring it into our ecosystem.

And then based on the information that we got,  we will make another API call, another call to the DB.  maybe mutate or update a few things in here.

Now additionally, you will also get webbooks.

Imagine you had enrolled for a card, right?

You enrolled the user, created cards for them,  the physical card, fulfillment.

So something happened here, fulfillment, right?

the webhook came in.

So now the webhook is in discussion.

Imagine a webhook came in.

That will hit ZM1.

ZM1 has to take that webhook, put it on for this topic.

Then we will have  to listen to it, make those updates into our team.

See, so three parts into our DB1 during enrollment, two response bodies, three webbooks, fourth  one will be queries.

Someone is now going to use Supergraph.

Now what is Supergraph?

Earlier with GraphQL, great.

If you are not quick.

GraphQL for your query mutation.

Yes, I have an idea.

Great.

So we will build queries and mutations such that we will support each and everything that  is available within our domain.

It could be let's say card user.

It can be card itself.

So, we will allow users to query whatever they want.

We will use it as a combination of mutations to accept any mutations within our domain.

Once we build this, let's call this as ZM2.

We will be a sub graph.

We will onboard our application such that  That is going to be a big big big big big big big big really big  Vanguard  Craft and somewhere we will be here inside that will be somebody inside that also will be like small Jason somewhere  This is the ZM2 and then there will be like client address  Many people are now trying to modernize one of which we have seen ledger and things like that  And anything and everything within Vanguard will be there  But we have to get it somewhere small, so sub graph for ourselves  If someone wants to use this, they will have only one big Vanguard Graph QL endpoint.

If you want to do anything within Vanguard, just use this one.

Coincidentally, if someone fills out this section for mutation, then our graph will be invoked,  our ecosystem will be invoked and then we will handle that particular operation.

That's the broader idea.

If someone wants to query, they will query.

Hit our ecosystem, we will go to cm2, go to our DB,  get the data, give it back to the user.

So you can support query, we can support mutations,  if required for dedicated features and functionalities,  we can have rest in points.

And that concludes our architecture discussion  for this section.  and there  Yeah, for example, to reconnect to our database  update the...  to insert the transaction information  This one here, right?

So, at this point what's happening is for any incoming webhooks responses, ZM1 has to process  it and put it on this topic.

Anything that is related to card management, fulfillment and enrollment, we are going  to take this up in GM3.

But anything that is transaction related, it is going to go to GM4.

In our same DB, there is now going to be ZM2 schema.

You have seen that in, not to recall, PGArmin.

If you go to your PGArmin, you will see that.  you will see cm2 schema.

Now inside that schema there will be two domains.

Our domain or our  tables will be created under card management domain and cm2 schema there will be transactions  domain.

This can have let's say auth records or in general transaction records with status  auth and everything.  like auth completed or now it is cleared and all those kind of things.

So because we are sharing the database infrastructure, our set of tables are different, our set  of credentials are different, the one that we will be using for card management it is  the CM2 credentials, the one that they will be using will be ZM4 credentials.  their web service will be able to talk to their set of tables independently of our connections.

Any other questions?

Who is using graph super graph?

The BUI means AI and users I am asking, real users, customers.

So, real world clients, they will pick even interfaces, right?

Obviously, they will have a portal where you can enter your ID password, you can log  in to your account, see your cash account, like how you see your bank account.

Same thing.  they will have various screens on their or various screens in their application or view  you can fill out some forms for enrollment or maybe that will be a UX discussion but  when they hit the button within their angular react whatever they are doing it should call  our super graduate point.  to our team in particular to do all of that.

What we discussed or what you might have heard  in my video there is a theoretical explanation I would say just to get our team the essence  of what a deputy ecosystem is.  generally looks like on paper to answer your specific question.

Yes, the program or sponsor  bank you should say, the sponsor bank bin range that has to be given to marketer who  is going to give that not us.

So definitely there will be higher ups at you know admin  level and above who would interact with the bank who would have marketer and bank talk  to each other and have them exchange those details.  under the supervision of Vanguard but an abstract for us at this point our job is to just get  a confirmation from them saying that yeah your market ecosystem is configured, your  bank is configured, they have talked to each other and you are now good to use the card  enrollment APIs and your things are ready for you.

Good question.  just some function fraud management related from mark data what is different and our side  means card related fraud they will only take care right and from our side we are not doing any  rules or checks right card numbers are related everything we are relying on the card data  processor mark data right give me one example of what you are thinking so that we can use that as a  discussion point.

Like suppose I have seen one example like one user purchased using the debit card today  itself like 10,000 rupees, 10,000 dollars.

In one minute or two minutes he purchased another item in next another country from the  let's say India he purchased today 10 am in America he purchased again in one minute  he purchased another product like say another 10,000 15,000 rupees product so this kind of  a fraud right so these identification it happens on the card data processor like on the market  data right.  we are not doing or are we doing that activity?

Yeah, good question.

So think about it.

Do you want to do anything in ZM3, ZM2 for this?

Are we going to write any business logic  to do fraud checks in our applications?

No, our job is integration.

Fraud checks are a separate department in Vanguard.

They have their own set of web services,  which are marked here.

So just... FYI it is FRO so that is their prefix for the fraud web services now what will they do  how will they do what is the current state of FRO what should be the future state of  FRO that is a business and fraud with fraud related items so it's their thing to handle  our job could come down to dropping the topic  dropping the payload on the topic that payload might be checked for information by FRO team.

For us it's not about transactions at this point Wapshi it's more about card management  I'll answer your question for broader description but I also want to acknowledge what we will  be interfacing with fraud for.

So imagine there is a cash flask client they have an account maybe they just opened the  account just now.  and they are also asking for debit card immediately  and they are putting no money or maybe putting millions of dollars in one go  Existing cash account creation also might be validated by this FRO fraud checks  and we are now trying to enroll them into the debit card  we might have to drop our payload on the topic and then FRO will listen to it and maybe flag that user  So those things could happen.

Second, now coming to your transaction point of view,  you should look at ZM1 here.

So ZM1 is going to get webhooks.

Now, during what Shilpita was presenting,  you saw transaction simulation, what Shiva was showing was PGFS.

So all those things are abstracted out of our ecosystem.

We don't get to initiate anything in real world.

We are just listeners of what is happening on the visa network, marketa and outside.

All our sister teams are going to get his webbooks.

They will keep on getting webbooks.

Auth, authorization, clearing, authorization, clearing, clearing, clearing, authorization,  Earth, Earth, Earth, Earth, Earth, clearing, clearing, Earth, whatever it is.  they will keep on getting these events.

They would want to run those through fraud, the bottom one here.

So they would want to check at this point within Vanguard ecosystem.

We got this notification.

Now for this, is there a possibility of suspicion?

There are engines for it.

They will calculate the percentage of fraud and all those things for Vanguard purposes.  your question falls in a little different domain that what will happen here.

This is  Visa network here.

Then there is bunch of things in middle.

Then there is POS here and  then the user is standing here.

The user is using the POS that is going to go through  all of this and then hit market ecosystem.  to Eve.  something is happening at this level definitely they will have their own fraud checks which  is going to be industry standard if they flag anything for fraud this web book might have  some information in it so this is point one where you will have something this is point  two where you will get some info and then as you mentioned the scenario for someone did  10,000 rupees.  in India or let's say at one point something happened maybe in Hyderabad and then in two  minutes there is another activity in Chennai and then in third minute there is another activity  in Bangalore and another activity in Mumbai.

One minute, one minute, one minute, one minute, four times it happened.

Highly susceptible to fraud.

Person is like, what happened?

Great credit card of debit together in this.

Disputes.

Investigation.

Settlement.

All that complains related life cycles you will do.

Whatever it is, 7 to 10 days or what not.

So, not the expert on that one.  more or less that is where it will go.

Will they do it?

That is a thing that is being discussed.

The program has just started with  implementations.

Team are just getting started up from last two three weeks.

So many teams are  learning what they are going to do in coming days.

So let them figure it out with the appropriate  departments.

Second, in broader sense, yes, there has to be a collaboration with Vanguard,  with market and others in general.

Does it translate anything that our team has to implement?

Not like 
