lines with the lines.

I am not seeing the lines, I am just seeing the dot red color.

That's what happens.

So if you are not able to see the lines, let me switch to a different  one.

This case is to create a web service.

That's it.

This entire, we are not worried  about what happens in the other parts.

We are at this section here.

This is part one.  is us.

We are only worried about this section but  We are going to get some requests into our ecosystem.

These are these requests, either it  is going to come from a mobile or a web application.

Accordingly, our job there is to do three things.

First things first, any user.

So you imagine this as a Vanguard client who  is going to use a web UI or a mobile UI.  then they will have all the traffic coming in and then in this web service we will have  to parse and process and work on that information.

So from this point of view what do we need to do for it?

We need to more or less get the authorized details.

So as part of this the SDK that is going to be loaded in this, this is going to generate  something called as a Deepop token or a Deepop JWT you can call it.

This will be the header.

So this is your item number one.

Item number two is going to be as input we are going to get in Vanguard.

They call it as XUP token or EUP is the appropriate word.

EUPJOT.

Using this EUPJOT, we are going to get a void in Vanguard.

We call  any id as poid so 12345 is the point that they will give us any customer is recognized  by point this is a random number that I have taken what we will have to do is we will have  to convert the point into a user token now as you learnt today that user enrollment card  and roll manner variants flows as a part of your  user enrollment flow you will get something called as a user token.

So this point in Vanguard is mapped to this user token in market ecosystem.

So this is your item number 2 that we will have to work on this part.

So what will happen, how it will work, either request will come in.

They will have the EUPJOT basically as the header.

We will have to extract the point here 12345,  hit our card for API that will talk to database.

Lots of things are abstracted here.

From this database we will get user token and towards the market adder for now.

So what we are going to do is,  We are going to send three things, one the DeepOp Jot, then second is User Token.

And the third thing that we are going to do is have marketer adapter first talk to platform  and then get its access Jot.

And then we are going to make use of one, two and three headers.  send it to marketer, get back the SDK token.

Our job on this architecture is,  we are going to give it back to this web and mobile UI's,  then they will do all of their functionalities,  whatever they want to do, particularly with anything  related to the direct API connectivity  that should happen on this line,  and then we are good.

Any questions?

Last token you said right, access token or from how we can get that and user token,  last third one which token you mentioned I missed that point.

Sure so string data you generate GQWTs right.

So for market also if you have to connect you have to connect with some security mechanism.

So market is going to give you client ID, client secret.

Bye.

So either we will do this or maybe this market adapter team will do it,  we will talk about it, but in general sense,  we need the client ID client secret first to get the JWT from market.

And then you have Deepop and you have user token,  which is user ID basically market as user user ID that will be  required to identify a user on market.

Call it a primary key for that user on market.  for us it's a foreign key difference and then  We need the GWT itself authorization header kind of thing to connect to the server right.

And then it will give a new token which is called SDK token that is needed for this application.

Any questions?

No.

Anyone any questions?

So what we are going to do is.

We are going to put an endpoint and go over tasks here.

So we are going to put one endpoint out here.

We have to write business logic, maybe a function  or two in service layer to make call to the card for API.

Get some details for now.

We will get it hard coded only,  but maybe have that hard coded coming from ZM2.

So tomorrow we can make it, you know, scale it  to the actual query and things like that.

So we'll take some.  and makes adjustments ready.

And then going forward, once user enrollment flow is done,  then we will more or less replace it  with appropriate functions and queries and what to do.

So that would be very high level implementation plan  for this.

We are trying to do this in one to two strats,  dependencies based on when marketer provides the SDK  So this end point will be the rest end point on the right of the issue.

I would like to say so.

And also in the previous discussion there are some points like we might create a new report  but for now we will be creating in card management.

Yeah there are a lot of opinions now.

I don't want to go into too much there but just that  someone is saying totally new repo, other opinions are new app prefix new repo and  some guidance is not just put it in C and get started as fast as possible.

So it's a difficult one but let's see I'll try to get some answers there.

So every time it changes there is.

Okay, it's fine.

Happens.

So now let's go to this one here.

Let me grab it.

I'm sorry.

Again, bunch of things here, we are going to be sitting in only this zone here, this section.

That is us, that is our boundary. 
