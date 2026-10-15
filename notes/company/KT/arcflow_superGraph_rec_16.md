So what happened as we were reviewing it with Karath?

So first things first, our idea that we were proposing is,  or what we had learnt until now is we will put the ZM3 on Supergraph, right?

That we will do query as well as mutations here.

Now this will be hosted on Supergraph, every request that is going to come in will basically hit ZM3  and then go to ZM2.

So what they're saying is  he would view is he is thinking that cm3 to cm2 particularly for queries would be an additional  hop.

Anyway you are going to get the request in cm3 then you will modify it and connect it  to cm2 and then you will go here and get the data.

So now what Gareth is telling is do this as it is denoted in the diagram for some reason  Bye.  the line is correct but maybe I might have missed out on explaining this or understanding  my part of it.

So now what he is saying is any submission part.

Now here we are talking about user enrollment, we are talking about card enrollment, we  are talking about card product update, we are talking about even card product creation  also he wants to do here.

So I put card product here from crew level.

So Gareth is thinking of even having card product created via APIs, not only update.

So he would want create an update done from our APIs.

Then, PJFS I believe is going to be with marketer, so I don't anticipate creating API calls for it.

So, I wouldn't bring that here, but as far as I know, then there will be card transitions.  if any then there will be user transitions.

So split this into such APIs. Now if you imagine  more or less such these all API calls they fall under post call.

So the post call would  mostly take care of it.

So that can go to ZM3 and what API calls or what graph you will  get.

Mutations should flow through ZM3 or why should they flow through ZM3 because you  want to connect to some other web service.

You want to have some kind of business logic  in it.

You want to have some kind of enrichment or refinement done to the data that you are  getting.

So from that sense you would basically  want to have post in particular or going to CM3.

Okay, now what happens for query?

Now he's saying if you try query,  now what is going to be your query?

Any UI that will, you know, maybe a crew facing UI,  you never know, right?

I need a UI that will tell me who all are the card users  from Cache Plus.

So let's say for Cache Plus,  they pulled 600k clients in a paginated format.  on a UI saying that ok first 100 are here then you can go like 600 pages or 6000 pages  here like that there if they prepare any UI for which you would want to make get calls  then there are let's say a user logs in or a client logs in on the portal and they maybe  want to see their card transition history or something like that.

I am just making a big example here as we speak but all such operations when they will  hit the UI.  it will hit the super graph but in this call it will make a query operation rate.

So for query the data that will get supplied that has to come from ZM2.

So he is saying anyway if it goes through ZM3 you will have to then again make some transformation  unnecessarily and then give back to or forward the call to ZM2 instead.

ZM21 Supergraph and for query operations you get  information directly from here is his preferred way of doing things.

He's advising us to do that to avoid this rework here or duplication of work or forwarding  the API code.

But long story short, for any post operations use ZM3 because you would want to perform  some or the other business logic or validation and for ZM2 you would want to, you can directly  source your information from ZM2 because you don't need to do any business logic transformations  there.

Would that answer your question?

So core API also will be the graph Q and Y.

Correct.

It will be graph and then mostly it will be query and this will be mutation.

Any questions anyone?

Any same thoughts or same questions?

Question of Shaka.

Yeah.

So GMT is allowed to publish an event in the Kafka?

Yes.

When we are getting any webhook from the market, so while consuming, that is going to the GM3 and again, that call will comes to GM2 Red.

So I mean, why don't we consume directly from GM2, Adventer topic, why GM3?

Any...  particular reason.

Okay, so this one you are saying right?

Yeah, so when we are publishing  any event GMT is directly pushing that topic, pushing that event to the top right, but while  consuming the call comes from GM32, GM2, so any specific reason I have that question.

Sure, do you have a theory or thought on what could be the reason?

you want to take your case?

Maybe in GM3 any validations.

Okay go ahead come continue.

Validations and any transformations.

So think about it this is our GM3 I will abstract  it out from that entire thing so this is GM3.

GM3 is putting  making APA call to seem to good until this point simple yes now you want to  enroll what do you do for enrollment you know from working on market APA is  while testing that you need to put a payload this payload is per let's say  card enrollment what do you need for card enrollment you need card product  that I want to create a card under this card product and then I also need a user  token user token  So you'll say card product token and use a product token and order some other details  that you will fill it out here.

Now as you do this, this more or less, this is the final market app payload rate.

So that final market app payload is going to be in CM1.

Now it is not our responsibility to prepare the market app payload.

So this one here with like card product token.

This is going to be card, product, fill out something.

Then you will have user, iPhone.

These all things will be done by CM1.

That is not our job to prepare this payload.

Our job is to  work on vanguard data so we might get let's say a point or something right we might get a point here  so from the UI we might get a point so our job in cm3 will be to convert point to user token  our job in cm3 will be to convert maybe the addresses and everything if we want to fetch  those addresses for the user so we might make a super graph call here outside and get the data  such kind of things we will have to do as part of our business logic now  What will happen?

GM3 will build a JSON to the final JSON that we want.

Will this JSON and this JSON be same?

That is the question.

So if we build this JSON, if we build this JSON,  what is marketer JSON or marketer request body payload,  then GM3 is going to be tightly coupled.  in very loose terms, this is called as marrying the vendor system.

We are not going to do that.

We are trying to keep it loosely coupled.

How we do that?

Or what Gairith is designing here is, he is saying,  we will build a very generic Pojo object here.

So this Pojo or this entity that we will build,  this will be simple, let's say event type.  create card json.

So first of all, we will put this information whatever we get into  db.

I did one exercise with Venkatish long ago, 3-4 months ago, where we were trying to suggest  an architecture to keep things consistent.

So one of the discussions we had was how do you maintain consistency across what we are  going to share with someone versus what we have.

Let's say I make an API call to marketer, but marketer is down.

What will I tell the user?

I got your form but I never completed for it.

Submit again, not a good experience.

If I take that form submission from user,  I store it in my database but I'm never able  to make the API call, then what happens?

Or I got the response from marketer,  but I lost it somewhere.

Like marketer is saying I gave you the response,  I don't know what happened.

I could not communicate it back to the user.

All these consistency issues,  So what we are going to do is first put the payload here and maybe maintain a flag on  it, processed, yes or no, something like that.

And at the same time drop that payload onto the Kafka topic.

Now this is where our job finishes for part one.

So we are like okay, we start the relay race or we are number two in the relay race.

Number one is a UIT.

They will run their 100 m into 4 relay.

They are going to give us that particular pattern.

We are going to run our 100 m, drop it in Kafka.

Now, CM1 team, yeah, that JSON from this Kafka.

What is CM1's job?

CM1's job is to basically understand the payload  and convert it into market JSON.  whatever you need for marketer create card and that is where this event type is going  to help this event type we will have an agreement with ZM1 team saying that okay create card  I will give you this JSON you convert it into marketer JSON update card I am going  to give you this JSON you give it to marketer or you convert it into marketer formatted  you send it out.

Now comes your question.

To answer your question, this section is important to understand.

Why is this arrangement being done?

First, we are trying to make it loosely coupled.

Second, tomorrow and still there are no contracts signed with marketer.

We are doing this agnostic as possible but something goes down the line and something  does not work correctly.

When God says no, this cannot happen.

And they say finish, no marketer for you.

No visa DPS.

But that does not happen.

Never know.  this will still stay the same, more or less 90% this will stay the same unless  visa DPS needs something else.

So, GM1 they just have to convert this same  information into visa DPS which we have seen how does it work.

Does answer your question for first part I still have one more part  hopefully you're getting clarity on it but does it give you a good direction.

Right?

So, this is first part of the puzzle second.

That is where GM2 is important because GM2 has to make it loosely coupled, GM2 has to  ensure that it is performing the core transactional operation and it is making same decisions  here like okay I put it on Kafka only when I am having the record in DB and now comes  your second part of the question.

So in interest of sanity I will remove this.  hope all these nonsense doesn't happen in the down the line.

Now ZM1 is going to return either or ZM1 is going to get either a webhook which we know  are events from  marketer or we are going to get responses, API responses.

I have not marked that on the  diagram but API response is also one part of it.

Because create a card is an API call  outset for which we are going to get response.

The fulfillment, the authorizations, the  clearings those are the webbooks part of it.

Now whether you get an API response or whether  that you get.  of a book, CM1 is your interface.

Now CM1 they have to convert the API response back  into such structures that can be again kept agnostic.

So they will translate maybe a card  product or user token something like create card response, create card, create a card,  response, event type and then they will put a payload in this.

Similarly they can put  authorization webhook, they will put a JSON, then they will put clearing webhook on something  like this or they can put fulfillment webhook.  is fulfillment webbook your card is being printed your card has been shipped your card  has been delivered those are fulfillment webbooks nothing about it think about this diagram now  a zm1 you got all the responses either you get api calls sorry api responses or you got webbooks  right this is delegated author skip that but either you'll get api responses or you'll get  This adapter will put it on this topic.

Because this is only one interface or adapter that we have for the entire ecosystem.

It will put on the topic and if there are authorization webhooks, there are clearing webhooks,  because we are going to or ZM1 is going to typecast it for us or put it in appropriate types for us,  create card, API response, which team should work on this, who should listen in on and process on this result.

Can you please come again?

Yeah, so we got create card, create card, API response, we got authorization of a book  and we got fulfillment of a book.

ZM1, it translated the API responses and webbooks basically into this structure.

And now these three things are waiting on the topic, correct?

Now everyone is listening to it.  create card response which team should work or process this response?

Our team, our team GM3  Correct, GM3  Now why GM3?

Now your second part of your answer is  because we now have to take that API response  perform business logic if any  and then pass it on to GM2 so that you can put it in appropriate entities and in appropriate tables  correct?

Yeah.

No, same thing.

Authorization web book.

Should we even touch the authorization web book?

No, GM4 will handle it.

GM4 will handle it because it is related to transactions.

Transactions.

Correct.

So, from this topic, if there is any authorization, GM4 will pick it up.

Now, next is fulfillment.

Should they worry about fulfillment?

No, we will take about fulfillment.

So, we will put.  any kind of operator that market a payload or anything that we will eliminate whatever  is not required.

We will transform it into our structure that we have in the DB tables and then we will  map it accordingly.

So because we have to do those transformations, we will have ZM3 listen to it.

But ZM2 when it publishes out to the Kafka topic management topic, it is having the  enriched payload which is ready to go from our site.

So that's why one topic is outbound, one topic is inbound, outbound of ZM2 basically has  all the data loaded in it.

The inbound is raw.  structure that we got which we now have to process and then put it into the  database.

Does it answer your question?

Reception.

Any other questions? 
