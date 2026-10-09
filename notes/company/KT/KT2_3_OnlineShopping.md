he can do the purchase, he can spy the car and do the purchase in any point of sale or online or  e-commerce anywhere he can do the swiping at the merchant and they can swipe the card.

So what  happens once he swipes the card how the process will flow through all these three entities that  we have discussed just now.

So once he swipes his card at any  any merchant.

So the merchant will have his own bank called merchant bank or  aquarier bank.

So this aquarier bank it will send a request so it will see this  aquarier bank will have the bin pool and it will able to see the card  number.

So in the card number we have the bank identification number.

So it  will take that number and it will see which bank it is related to.

So it will  send that request to the that sponsor bank through the whatever the network we  have the payment network we have opted for let's say PISA.

So now  this request will come to a sponsor bank saying and it will go to the from sponsor bank it will  go to the vendor that is a card processor that we have discussed so now this card processor will  send a request to the Vanguard system because if you see all the customer information his account  information how much balance he have all the literal details all the  all the details will be present in the VamGaR.

So the card processor and the sponsor bank  does not know like how much balance does the customer have.

So what the card processor  will do is it will send the request to the VamGaR system that request is called delegated  auth.

So it will ask for the VamGaR system whether a particular customer is asked have  the end of balance or not.

So, that is it.

Once the Vanguard system receives that request, it will check in his lecture account, in the  lecture table, like whether he has sufficient amount to process this amount or not.

So along with that, we will also do the fraud checks and any business rules that we want.

So we will do all the checks and finally we will send an approval or dis-line request.

So if everything is fine, we will send the approval request.

So now this is an authorization.

Here we are sending the amount he is going to purchase let's say 5000 EES 1 to Shop  that 5000 EEM 1 we are asking Vanguard application whether he has that 5000 available or not  like that right?

Yes so let's say I go to any shop like Ikea and I swipe my cart and I want to purchase  an item worth 500 dollars now merchant will have his own bank like we call it as a Quarer  Bank and this request goes through all the payment network and the sponsor bank and finally  to cart processor and from cart processor it will send a payment to the customer and  request to Vanguard system because all the systems does not have any details about whether  the particular person has 500 dollars or not.

So it will ask the Vanguard system, so also  person is asking for the 500 dollars, should I accept or dislike this request.

So Vanguard  system will do all the fraud checks and other checks, business rules and everything and  it will also check whether the particular person have sufficient amount and if everything  is satisfied then it will say yes he will have the...  amount so it will send the request back to the processor and back to this one.

So once the this is called authorization authorization so Vanguard is authorizing that this particular  person has sufficient amount.

Now the so once the authorization is done so then the merchant will have like so merchant  will say that payment is successful payment is successful till now the amount is not  moved but the payment is successful so once payment is successful then again this aqua  ed bank will send the clearing request.  clearing request in the sense that this particular amount what we have sent before for the authorization  you have given the co-authorized it so now we want to get that amount.

So it will again send the clearing request to the sponsor bank.

Now the sponsor bank will have the amount and the amount will be  So amount will be debited and it will give to the Acquirer Bank.

It will go to the Acquirer Bank.

So like this we have like some thousands of transactions will be happening in a day or in a week.

So all the transactions amount will be debited in the sponsor bank.

At the end of the day or at the end of the week, the sponsor bank communicates to the Vanguard  This this much amount is been spent by the  spent by the customers so we want to settle that amount so again the vanguard and the sponsor bank  will go for the settlements and transfer the amount from vanguard to the sponsor bank.

So when the clearing request comes so it will go to the vanguard and it will update its lecture  like so the particular amount whatever we have asked previously so that lecture amount will be  debited let's suppose he has a thousand dollars so when the clearing request comes so since we  have authorized like a 500 dollar so the thousand dollars will be updated to 500 dollars 500 dollars  will be removed from the lecture account so we will maintain all the transaction and literature  data in our systems and also the amount will be sent from the sponsor bank at the end of the day  or a week, sponsor bank and Vanguard will  and if there are any issues they will check all the records and settle the amount between  the vanguard and sponsor bank.

So this is the flow.

Okay.

At the time of authentication are we locking anything amount on the user side?

Because suppose after sometime he said, suppose let's say user have 1000 amount and he authentication  is done with fine write.

After sometime he transfer from other places also right.

He can transfer right.

Are we doing any authenticate locking kind of thing so that  it cannot be, suppose in the clearing time it's sometimes delayed in that case it will  not get any problem.

Means if the lock is kind of thing anything is happening in this?

Yeah, yeah, we will, once we get the authorization request and once we do all our checks and  once we give the approved, approved to the card processor we will hold that amount.

Hold that amount.

Even though he has a thousand dollars in the account, since we have given the authorization  for the 500 dollars, so we will hold that amount so we will only show only 500 dollars  left in his account.

Okay, at the authentication time itself it will show in his account it's debited, right?

No, not exactly  But yeah, he will he will able to spend only the remaining five hundred dollars  That means even if you want to spend here.

Yeah, that means he has seen a five hundred debited from his account  He's seeing that five hundred can I consider?

After playing only it will be shown in the debited amount  Yes, but... Yeah, actually there is a, let's say 500 amount, 1000 amount is there in Van God customer  and he purchased 500 dollars.

So an authentication happened, are we keeping any hold on the Van God customer amount related  place?

Because after 5 minutes or he can do transfer right, if you are not locking anything.

So are we showing as soon as he authentication request and immediately we are showing the  user to debited amount or are we clear after clearing request comes then only we are debiting  from his account.  that information what we are showing you.

Usually as soon as it should show immediately  as soon as authentication request sent in the background the expectation I am expecting  it should be immediately it will be debited from easy.

But for user it will appear like  a debited in the background it hold that way it will be yeah it's my understanding correct.  at the time of clearance  in the right direction  you are thinking in the right direction  so only thing is  our team is not handling all of that  there is a different team we are discussing this process  just for a understanding  so we will continue on the discussion  just that  when the yes no decision is made  then the funds are hold  kept on hold and as you are saying  if they go to let's say from one shop  to another now she was example  he purchased at Ikea  then he goes to the next  shop which is maybe a grocery shop  there he will purchase for let's say  200  So first 500 in IKEA that is put on hold next he purchases 200 that is put on hold  so remaining is 300 then if you go somewhere and then if you make a 500  purchase again then you will get declined because balance check will be  insufficient yes yes yes makes sense so this is the overall flow of the  a transaction but this transaction  will be handled by the different team.

So whatever the first part I have covered,  like the card enrollment part,  so our team is responsible for this card enrollment part.

So as a part of this, we have two services  and we have done the infrastructure  and we are starting with the two web services  like ZM2 and ZM3.

And we will discuss those details further  as a motor on X-Fections.

Okay.

Any other questions?

No.

So we will be sharing this video link that Abhishek explained  where clearly like flow.

So you can go through it once and we'll also share if any related  documentations.

Sure.

Yeah if you have any doubts you can reach out to us anytime.

Thank you.

And also option make your understanding and prepare a conference page or any documentation  because again tomorrow is Friday right again maybe you can give a reverse KT on your understanding  until maybe on today's session because today's one is the important flow like how the card  management and the transaction flows flow goes on right.

So maybe you can give a reverse KT on this tomorrow.

Yes sir.

I'll share you the document links and whatever required for these things.

I'll share those in some time.

Okay, thank you.

Do you have anything to be shared with us?

We can't inform tomorrow on the topic.

No, I think good unless there are any questions, anything you want to revisit or share with us.

No, I don't have any.

Actually once I write the points, maybe if I get any questions, I will reach out to you or Shilpita or Shiva.

Yeah, sure.

It's already for you.

It's very live on it, right?

It's very live for you, right?

Yeah, I'll get used to it.

Yeah, we will make it in the morning.

Yeah, I will reach out to the team.

If I have any.

Yes, sure.

Okay, so just quick reminder days.

Today we are going to have the DRT.

I hope you all have the invite.

We will do some exercise around the items that we are trying to line up.

And then more or less we will have some discussions and stories and  we will have a quick fix with whatever time we have there.

Just checking it.

There is no other overlap. 
