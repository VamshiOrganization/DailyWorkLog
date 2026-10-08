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