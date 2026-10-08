#Notes

- [Project Notes 1](Project/ProjectNotes1.md)
- [KT Day 1(i)](KT/Ajile.md)
- [KT Day 1(ii)](KT/DevOps.md)




Hi everyone, so today I will be covering the topic on why Vanguard, why are we going with the debit card engagement and what's the role in that and how this debit card flow chain, flow takes place and all the related processes and everything will be discussing today.

Yeah, so actually today I thought if we were in person we will be explaining pictorial, so it is easy for us too and maybe once you come to office again we can have a brief discussion if you have any questions there. just I am repeating because I think you didn't hear it previously.

Let me start with.

So first as you know as Abhishek mentioned in the intro call that regarding the Vanguard and the current ecosystem in Vanguard process.

So to again rephrase that Vanguard is nothing but an American investment company where it's the largest provider of the mutual funds or ETFs or brokerage accounts and many like financial planning and all of those.

So currently in Vanguard we have cashless account.

You can just note it down so that you can go and read about that.

So we have the cashless account where the customers keep their money like invest their money in that cashless account in Vanguard.

So like whole money they will put it in that so that they will get some like.

If they keep that money, as you know, we'll get to grow our amount depending on the competitive offering like per annual yield like 3.35 or something that may increase depending on the market situations.

But as you know that they will invest and they'll be getting some amount of offering.

And so what happens is that, so let's say now you have the cash plus account in Vanguard and when you want to use those money, let's say you have your money in your bank account and you have to transfer to the cash plus account.

So what do you do is you transfer the money from your bank account and to the cash plus account.

So let's say after some days you want to use those amount from the cash plus account.

So again what you have to do is you have to transfer the amount from cash plus account back to your bank account.

So this is the flow.

So we have cash transfer application in Vangad currently where users can add money from their bank account to cash plus account.

So vice versa, like from bank account to cash plus account.

Do you have clear correct now?

Yes, as of now clear.

Yeah, only the cash plus account and what the current transfers are going from?

Yeah.

It's like in India we have the grow, we have account we are keeping the money right in the wallet kind of thing right?

Can I consider or that we have a separate account ID we have created we need to separately create in the vanguard or separate cash place account we need to create or is it whenever we register as a vanguard broker account in our system it automatically creates cash place account.

No you have to create like you have to invest your money there right so you will be having a cash place account for particular user ID there is a particular customer.

So like that yeah I think I am.

So there is a difference for both so we were meeting separate like vanguard broker account separate and cash place account separate separate accounts can I consider there are two separate accounts.

Brokerage is separate, brokerage is typically where you will buy all stocks, mutual funds, ETFs and everything.

Cash account, technically it's kind of a brokerage account only, but you do not want to or you cannot purchase anything based out of cash account directly.

It's just like money sits there like a savings account and then you can earn interest on it.

Suppose if any user wants to send money to Vanguard, we need to send separately for Vanguard brokerage account as well as we need to send Vanguard cash plus account.

So that we can utilize for two purposes, Vanguard brokerage account for investing the amounts in ETFs, mutual funds and stocks whereas cash plus is for interest purpose.

Is my understanding correct?

Yes, so if you have a bank account and if you move money from that bank account to brokerage, fine, that can happen.

If you move money from your bank account to your cash account, yes, that can happen separately.

You are looking to earn safe 3.25 interest for 3 months, great.

Now you are ready to take risk, move from cash to brokerage also is fine.

Okay, makes sense.

Yes.

So, yeah, as I said, like money will be transferred from here and there.

So now currently what, how they will be transferring is using ACH and wire transfers.

ACH is nothing but is the payment network between the transaction between two banks, your cash plus account and the bank and the bank account you have.

So you can go and read it out on ACH and wire transfer.

So here, yeah, here what we are trying to add is for this, so transferring from money from here and there.

So for this, we are adding a new layer to withdraw money directly from the cash plus account.

So now it's, if we, so we are going to add a Bye. at this debit card functionality so that we can directly withdraw money from like customers can directly withdraw money from cash bliss account so that users can use their card to make transactions wherever they need it.

So you understood the use case why the debit card function is.

It's similar to now ATM card savings account it will be here.

Yeah we can do all bill payments everything debit card with credit card. differential between normal savings card other than the interest rates. on the card?

Yeah normal savings bank account card and this cash plus account yeah cash plus account is nothing but you are investing money in that cash account right or van get cash plus so as is told in the starting like I'll ping you a link where van get how much offering competitive offering per annual percentage that will be giving like I think currently it is 3.35 percent or something yeah so based on that you will get the interest amount right so that main cash I'll ping you a link on that van get cash plus account sure Yeah, so apart from this so coming to van Gad ecosystem so in van Gad all the repositories or all the applications that we have will be abbreviated with three alpha numeric characters.

Let's say we are we have created few applications for our debit card functionality.

So those those will be activated with three letter R or three alpha numeric characters like for example we have the main applications in van Gad is ET1 and ET3.

If you see ET1 three letter three alpha numeric characters so ET1 and ET3 is nothing but applications related to the cash transfer.

Okay, so to elaborate on this, show you are a diagram.

Yeah, so to elaborate on this, so EET1 is the, assume that EET1 is the cash transfer core application and EET3 is the cash transfer application.

Okay, EET3 is nothing but business process and EET1 is a core.

That means any, this core web service will directly talk to the database.

Thank you. any traffic that will be operated to ET1 that will come from ET3.

Let's say we will be like any database operation will not be directly calling to ET1.

Are you going to share it with me?

Okay, okay.

I think it's not sharing yet.

Share it again.

I hope my screen is visible now Amsh.

Yes, it's visible.

Yeah, this is just a small diagram.

Just ignore the left one.

So let's say this E3 is the business web service and E1 is our core web, E1 is the core transfer web service, core transfer, this directly talks to database.

Let's say if we want to consume or get some, get some records from E1, will not be directly consuming E1.

It should talk from E3.

Okay.

It should route the traffic should be routed only from 83.

So along with this, so now we will be having card management functionalities, right?

So for that we have again, we will be covering this ZM3 and ZM2 things in other session, but just to just to check or make the connectivity between 83 and 81, like in the same way we have created our ZM3 and ZM2 application.

Our ZM3 is nothing but our business web service.

So any client or any request that is coming directly will hit directly will hit our ZM3 application.

Here we don't have that.

I'm just explaining orally.

I am just relate this ET3 to our GM3.

Okay, it's a wrapper kind of thing.

I can consider ET3 wrapper is a GM3.

It's an application business where all the business logic, it's a separate application where all the business logic stays for the cash transfer functionalities.

In the same way, we have our business logic, everything written in the ZM3 application.

What is there in the ETH3 application?

It's ETH3 business process web service.

What operations in this service?

Yeah, that is that that things we are not dealing with but actually ETH3 will be taking care of all the cash transfer related business logic.

Here we are not directly involved in the ETH3 or we are not directly working for the ETH3 functionalities.

I am just trying to relate the current functionality how in vanguards take place so that you can relate ETH3 to the ZM3 application.

It's nothing but the front end facing application like back end application where everything talks to that ZM3 in our case.

Don't think like E3 we are going to work in the E3 application.

Just as you said.

Yeah, so the theme there is what she's mentioning also every web service, right?

Whether it's business process web service, core web service, any kind of thing. will come with 3 letter alpha numeric.

It will not have any importance like you will not say like E is for something T is for something 3 is for something just you will have to put some initials kind of thing right?

E T3, E T1, AWG, ZVI, BM9 like this people will basically call it.

She is just giving you an example that there is an ecosystem out there that is E T3 and to the E.T. one.

E3 they call it their business process.

If E3 is their business process, our business process is going to be ZM3.

Right?

Like that.

But yeah, go ahead Shilpa.

Yeah, thank you.

Babshi you are clear right?

Yes.

Do you want an explanation on E3?

Yeah.

Yeah.

Like Abhishek also added so every web service like every operations or every web service will start calling to E3 like wherever it required and that internally calls this core web service that is in our case it is ZM2.

So I am not just going deep dive into that because we will explain whole things what we are doing in our application in ZM3 and all the infrastructure in other sessions just I am just relating to this to our applications.

Okay?

So regarding this cash transfer, let's say I'll just give an example of what is happening currently.

So let's say this cash transfer application as I told it is used to move the money to EnFro right from our account to the cash plus and to EnFro.

So let's say you have a account, a money in your account, it might be any bank account and now you want to transfer that to your cash place account.

The same thing I'm just giving it in the pictorial view.

Like let's say you wanted to fund your cash plus account from your account.

So WGUI is the UI application where it starts, cash transfer UI.

So let's say you are sending in money from here.

It goes to the E3, as I said, business web service.

And internally it calls the database operations core web service.

And when that EG1 is called internally,


±++±+++++++++++++++++++++++++++++++++++

--_-------------

Are you able to see my screen?

Yes, yes you.

Yeah, so, Bamshi, do you have any questions till now what we have discussed?

Um, as of now, yeah.

Yeah, so I will just summarize what she'll be the said.

So we expand what 80183, so that is a general working flow of how things happen in the Vanguard.

So, when we come to our team, so our team will come under spend experience.

So, we will say we will have a cash plus account and we will.

We will give a customer a card or debit card to spend their money in the cash place account.

So they'll have their money in the cash place account because it gives a relatively higher interest than the outside.

But they also want to spend that money.

So to facilitate this option, so we want to give them a debit card option so that they can withdraw funds from their account and spend wherever they want.

So our team comes into the picture where we want to enroll a user into the BitCard process and also I will explain how the transaction things are happening.

So I'll just give you an overview of how this process works.

So first, here we have three main entities.

So first one is a Vanguard and second one is a Card Processor and third one is a Bank.

So when we want to give a debit card to the customer, we cannot directly give because we are not a bank and to give a debit card to issue a card to the customer, there needs to be some compliance need to be fulfilled.

And if the Vanguard goes through all the compliances, it will be very hectic.

So what Vanguard will do is it will give that job to some other entity where they already completed all the compliances and everything.

So that is an entity which is a card processor.

So the card processor have all the complaints related to issuing the card and all the security measurements they'll have.

So we will just take the help of the card processor to issue the debit card.

So that we will not be in a state that we should be in compliance to all the bank related stuff.

So this is why we are going for the card processor.

So along with the card processor we will also have a sponsor bank.

So I will explain why a sponsor bank comes into picture.

So first we'll go through step by step.

Suppose Vanguard have a cashblow account.

So there will be an existing customer.

So there will be some new customers which will be on board to the Vanguard.

So when customer on board to the go through the Vanguard website and if he wants to enroll for the debit card. debit card program.

So I will click on like get the debit card.

So what happens is when we when he click on that, so then we will, so before that I will explain a few things before explaining this flow.

So this debit card processor is the main functions of this processor will be it will it will send a so whenever there is an account transactions, it will send a webbooks to the our Vanguard system and also it will maintain the shipment and logistics so that the physical debit card will be reached to the appropriate customer.

So it can do it itself or it can depend on some third party for the shipping and logistics operations.

So those operations will be covered by the card cluster.

So this sponsor bank will come to sponsor bank.

So each bank will be associated with the payment networks.

I think you have heard like we have a few payment networks like Visa, Mastercard, and India it is a rupee.

So these are the payment networks where they when we do any transaction through the card.

So the transaction flow go through these payment networks.

So this sponsor bank is already partnered with the Visa, Mastercard, and Discord different payment networks.

So that... So it will issue some bin identification number, bin number.

So bin means business identification number.

It will issue that number.

So what happens is when the user enrolls for the debit card, so it will go to the request, go to the card processor.

So card processor will capture all the details of the user, like is all, chikrofil locations, ah name, everything.

Whatever it is required for the card processor to deliver that card.

So again, it will send a request to its third party shipment and printing the physical card.

So it will send request to that form or it can do by itself if it has a facility.

So now the shipment and the printing, card facility will ask for I will issue a debit card but what number should I print on it.

So I think you have seen that every debit card will have a unique number it's called pan number so it will be a 16 digit number.

So it will ask which what kind of number what number should I print.

So there comes the idea of pan number so it is basically combination of bin plus some value.

So bin is nothing but it is a business identification number where it will be like four or six digits.

Bank identification number, sorry.

So it will be like four and six digits for each payment network.

So, and some value, it will be generated by using some algorithms, based on some algorithms.

So now to print the card, it requires two numbers.

So now what code processor will do is it will ask the sponsor bank to give that bank identification number.

So according to what we sell it to, which payment network we prefer.

So each payment network will have its own... bin identification number.

So let's suppose we saw a payment network starts with four digits and discover a payment network starts with six digits and marks a card some two digits.

So based on what network we choose so the associated bin number will be given to the card processor and the card processor will give their number to the card printing form.

So it will print the number bin identification number and the associated value for the card that card. and it will be issued to the customer who is requesting for the debit card.

So this is the flow of how a customer enrolls into the debit card and he will get back his physical debit card through this process.

So now once the, I will stop here and if you have any questions in this process, come and ask. and other it is what?

yeah other it is will be a some value which will be generated using some algorithms unique criteria for the number unique yeah based on the customer and details so the card processor will generate that number using some algorithms will be there okay so that's a unique identification card number because yes that is a pan number what will show this card processor is a microservices it is expected No, so this is the Vanguard, so all the applications we build is inside the Vanguard.

This CardProcess is an external third party service.

And the sponsor bank also, third party service, we will collaborate with them and for this process.

Okay, so in our Vanguard we have the microservice that consumes CardProcess and Bank application.

These are two microservices I can consider, right?

These two are we are consuming and we are preparing the debit card and shipping related by preparing this all 16 digit by using these differentiation, a unique debit card number.

Can I consider like that?

Actually, so the red color box whatever you are seeing, this is only the Vanguard related applications will be present inside it.

So we will have some micro service and application which will talk to the card processor or sponsor bank.

This card processors are third party applications, so not the Vanguard related applications.

We are giving inputs to that card processor.

Okay.

Yes, we will talk to the some other some other So this card processor and sponsor branch.

Yeah, go ahead.

No, no.

So this card processor and… No, my question is we are giving inputs to the card processor and sponsor branch, then finally we are generating the card number in this application.

Yes, yes.

We are generating, yeah, we are generating and we are shipping the card to the user.

User.

We in the sense we will take the help of the card processor which is a third partition.

So we will not handle any kind of this pin generation or value generation or printing the cards and shipment.

We do not deal with any of this stuff.

So this will be taken care of by this card processor which is a third party outside the Vangadot.

Okay, but is there any... We can call them as vendors, sure.

Vendors.

So these card processor and the sponsor banks are talking to each other or we need to, in our Vangadot application, we need to pop... let's say we are using VISA.

We saw related 4 digit number 4001.

These information we are taking from our Vanguard application.

We are providing this input to Card Processor.

Or directly these are, we just specify those information.

It will take that Card Processor itself and it will prepare the 16 digit number.

Yeah, so some Card Processor, they will have their own sponsor bank associated.

Some vendors, like Card Processor, will have their own sponsor bank associated.

So all the process will be taken care by them. but comes to VG or come to Vanguard.

So we will have separate vendor for the card processor and we will also associated with the separate sponsor bank.

So it is a choice, like we want to go with the, whether we want to have both sponsor bank and the vendor at the same place or we want to bring our own sponsor bank, it is an option.

So for now, we are going with the separate sponsor bank and separate vendor.

So we will have the communication between all these three things, like a sponsor bank, Vanguard and the card processor.

Okay, yeah.

As Shiva mentioned, whether they have worked before or they are working for first time, Vanguard has to talk to bank, Vanguard has to talk to processor and we have to make processor talk to bank as well.

So they will have their own communication going on, parallelly also, so that they know each other and they work, you know, for compliance and other regulatory processes.

Do you see the dotted line joining the two?

A debit card processor to a sponsor bank, right?

Correct, yeah.

So internally they have to get contracted and connected to each other, which is a black box for us, but just good to know.

Yeah, okay.

I will continue.

So, you have understood the first flow where user endows for the debit card and all this process will take takes place in the backend.

And finally user's kit is debit card ship 2 is

--------++++
