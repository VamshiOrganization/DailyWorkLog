o the architecture directly so first let's understand why we are using the market ix toolkit  what are what we are?

i got some right?

yeah just i got some disturbance can you repeat one second  yeah yeah sure sure so the topic for the today is market ix toolkit SDK so now let's understand  how we integrate uh uh ix toolkit in vanguard ecosystem okay  So first let's understand why we are using a market I X toolkit before jumping into the  architecture.

So at the Vanguard we want our clients to have a seamless card management experience through  our mobile app and web application.

So users expect to able to access the card related features directly from our platforms  without having to go somewhere else.

So now the challenge is that many of these card operations involves the sensitive and  card information.

So if Vanguard were to build and manage all that ourselves, so these request and responses  would have to pass through our systems.

So which would increase our PCI DSS compliance responsibilities.

So that's where the market I X toolkit comes in.

Give me a minute and share my screen.

I hope my screen is in system.

Yes.

So this is the marketer documentation.

So instead of Vanguard building all these card capabilities,  marketer provides us a secure SDK that can integrate into our applications.

So our responsibility is to authenticate the user,  authorize the SDK and help it to obtain the required access to again.

So once the SDK is authorized, it can directly communicate with marketer from car related  operations without bringing sensitive card information into our Vanguard ecosystem.

So Vanguard goal is to provide a seamless and secure card experience for our clients  while at the same time minimizing our PCI DSS compliance scope and keeping the sensitive card  data out of the Vanguard ecosystem.

So with this understanding, let's now walk you through how  we integrate the marketer UX toolkit and how the complete authentication at the UI rendering  flow works from start to end.

So the main purpose of using UX toolkit is to display the  card related information such as card details, transactions, without our application directly  handling the sensitive data.

So instead of us building and hosting these cards,  card UI components ourselves.

Our market provides the secure pre-built UI components that are  rendering by their platform.

This helps us to reduce the PCI compliance button and provides  a secure way to display our card data.

So now why do we need UX toolkit?

Normally if  we want to display the card information in our application, we would need to handle the  sensitive card data ourselves.

So but with UX toolkit, here our marketer hosts and renders  the UI components.

Sensitive card data remains protected, but we do not directly manage the  PCI data.

Security is handled through a 2.0 and D-POP authentication.

So, Friendtrend can safely display and card information while Marketer handles the security tracks.

So, here we have three main parts involved.

First one is the Friendtrend application.

This is our web or mobile application where users interact.

And second we have a backend service.

So, this handles authentication and communicates with the Marketer Auth Service.

And third one we have Marketer platform.

So, Marketer provides us the UX toolkit components, Auth services and card transaction data and a translation management.

So here one of the important thing is the front end never directly request the ORT token  from the market.

Everything goes through our backend for security reasons.

So before starting the integration we need some items from both our Vanguard side and  the Market side.

So first our side was we need a backend application ability to generate the JWT tokens and secure  storage for the private keys.  and from marketer, a marketer need to provide us the program short code client ID, sandbox  or production access and authentication script and odd boarding support.

With these, without these the integration cannot be completed.

You can also go through this documentation for more information.

I will be sharing you the link.

So the first thing we do is to load the marketer UX toolkit script into our application.

So we replace the program short code with the one provided by the marketer.

So at this stage, nothing is rendered.

We are simply loading the UX toolkit library into our application.

Think of it like importing a dependency.

The toolkit is available, but it is not authenticated yet.

Next step is authentication book for you.

So this is the most important part of the integration.

So UX toolkit cannot work without authentication.

So Marketer uses an earth client credential flow  and debug.

Book provides the strongest security  because two cons are tired to our application  and cannot easily be reused by the client.  others or some attackers and we have two authenticate UX toolkit.

We first need to  create a public and the private key.

So the private key stays securely in our  packet and the public key is shared with the marketer.

So once marketer receives  her public key, they register it and enables authentication and generates a  client ID.

So this client ID becomes our identity when communicating with the  marketer.

So next, we create an endpoint in our backend.

So this endpoint is mandatory  because UX toolkit depends on it.

So whenever UX toolkit needs authentication,  it calls this backend endpoint.

The backend endpoint performs in SaberNet pass  like receiving the request from the UX toolkit  and then generates the client JWT  and creates the DeepOp proof  and then calls the marketer or service.

These are the brown APIs we can communicate right?

Mark data.

Yes.

Yeah.

So once after generating the JWT, so our backend sensor request to the marketer that request  contains client ID and client JWT and DIPO proof.

So this marketer validates these everything.

If it's successful, marketer returns and access to them.

So our backend.  then our backend returns the access toolkit to the UX toolkit.

So at this point, the front end become authenticated.

Now UX toolkit can communicate easily  with the market services.

Like, a tool can is involved  and the new DPPO proof is generated.

So this can be prevent from our attackers  and improves our security.

How often we call this RTP only once?

Only once.

When?

Once we render it on UI, we will never call again.

Okay.

Yeah, we never need to call again.

So the next step was bootstrap US toolkit.

So once the authentication is ready, we initialize the US toolkit.

So bootstrapping does these three things like registers are to an endpoint, initialize  the authentication configuration and loads the theme for the configuration.

Still here, we know, still we don't have UI is rendered at this stage.

So we are just preparing the toolkit.

So once after bootstrap is completed, we'll start rendering the market or components.

So now marketer components are like cut and account information transactions and cut active  screens and all.

Now without us building these screens manually this is the biggest benefit of having the  UX to be kept.

Can I repeat one second?

So now I am telling that now marketer components are automatically displaying the information  for account and the card and transaction details and all those things.

So we don't need to create the screens manually.

So, this is the benefits of the UX to be kept.

But this is not the team is asking right because it will not secure again we need to talk to  back end that is what the discussion happened right.

Yes, just to have an overview understanding of this and just.

Yes, these are the possibilities are there.

Yeah, we got it.

So the main our responsibility is not to build or manage the UI market already provides is  the pre-built UI components through the UX toolkit.

So our responsibility is ensure the secure communication between front end and market  by implementing the authentication and token management flow.

So UX2EQT allows a quick, well-secured card management experience.

So now let's look into our architecture diagram and see how these components interact with  each other in our actual implementation.

So, the process starts when the user opens the card detail screen from either the web  UI or the mobile app.

As the screen loads the marketer SDK bootstrap function is involved, the SDK needs to authenticate  before it can display any card related information.

Then SDK then sends an authentication request into the vanguard ecosystem to the con external  Thank you very much.

The next step was the con gateway routes to the request to appropriate BFF  Which sequence you are telling from 2 to 3  We can say web UI to card management you are talking about  Card management yes  So this web UI BFF also on the mark data side or is our side?

This is our side our users are using right?

Okay  and from one to that is marked data symbol that symbol we are seeing one to one to web  ui bff one is there right that is marked data symbol mark okay is that my  question correct that symbol is marked okay from mark data we are calling web ui  web ui our system we are calling this is also card management business also our  system yeah okay thank you yeah go ahead and then the bff validates the users  authenticated session and formulates the request to the ZN3 card business  API.

Here line number from 2 to 3 we are card management called as a BE3.

So first from  the users it was going through web UI or CX mobile VFF and from here it going to the card  management business process API.

BE3 we call it as a card management.

Yeah card management 3.

So once the forwarded request includes so one guide access the JWT.  and market SDK generates the tip of proof.

So these services to service calls the user identity  and authorization and manage throughout the flow.

And step three is the retrieve card required credentials.

So the ZM3 card management business process  act has the orchestration layer.

It retrieves the required vendor credentials  and authentication configuration needed  to interact with the market.  and it needs to support the D-POP based authentication model.

So Marketer requires the user token to generate the SDK access token.

So since the application and SDK do not have access to this value, so ZM3 calls the ZM2  card core API.

So the card core API converts the Vanguard client ID into the corresponding Marketer user  token and returns it to the ZM3.

Okay, are we storing that token information in core cart core api?

Yeah, we need to store it.

It's coming from market adapter and we are going to store again to... Yeah.

Why are we storing this one cart core api?

Because tokens are valid like a time frame, right?

It will be... So... After 1 minute or after 30 minutes, it will be expired.

So we get the market at token from ZM2  Once used we cannot reuse it again, it may have the limited period of time for the expiry.

Okay, why are we storing this one?

We are only storing purpose just you are using or anything we are retrieving also just storing in the cart core AP.

After retrieving market adapter we are receiving the token right?

We are just storing in that or are we retrieving the token and checking the validity to show the card information.

So, Mamshi we will not store the SDK token, we will get from marketer, we directly give  it to the UI.

Okay, here in the fourth point, Cardcore API we are storing the token that's what.

Yeah, but this is not the token, this is like, so first when we register the user to the  marketer platform, so he will have a user ID related to marketer, so they will register  the user with some ID.

So we will store that user ID in our cart core API.

So that whenever we want to send a request when a particular user request comes to our  Banger system, we will take that user ID  And make a call to market platform so that it can identify that which user we are talking about.

Okay user ID  Got it.

Yeah.

Yeah.

Thank you.

Go ahead.

Yeah continue  The Banger type ID is to corresponding the market or user record  And the step five is so once the required credentials and the user token are available  So ZN3 forwards the request to the market adapter  So this marketer adapter serves as the marketer's integration layer with marketer.

Sorry, this Vanguard integration layer with marketer.

So the marketer adapter builds the auth request and sends it to the marketer's auth endpoint.

So this request includes the client credentials, user token and all the DIPOP information  will be there in this generated axis.

So marketer validates the incoming request by verifying the D-POP proof user authorization  and program configuration all this.

Once after successful validated the marketer generates the Auth access token.

So after generating the Auth access token it is written to our marketer adapter which  Axe has a Vanguard integration layer with Market.

So this market I adapted then pass the token back to the ZM3 management API.

So after a ZM3 receives the access token, it sends back through the same path where the request comes from.

So once the token flows through the ZM3 to the appropriate BFF, then through the con gate,  it will come back to the user device where the market SDK is currently running on the system.

Okay.

And then, yeah.

And the step 10 was SDK initialization.

So once the token we received from the market SDK, running with the Vanguard UI or the mobile  application.

So here we can have the SDK bootstrap was completed and SDK authentication is done.

And SDK is ready to perform the card-related operations.  and SDK is like a normal dependency like AWS SDK or how it will be in the UI  marked at SDK I just want to know how it will be like  we want to connect AWS we use AWS SDK right similar to like that marked at SDK also  so mark it as SDK it's like a it's like a secure SDK which can be integrated into our applications  So, to handle the PCI sensitive data for our Vanguard, so we don't directly having that.

So we are taking the Vanguard market as pre-built UI components.

Yeah, that's clear.

Can you go to the one second you have called from the UI related stuff?

Can you go to back one second?

I just want to see once.

Revis screen, not the screen, UI calling, yeah this one, code ops, still top, yeah first  one, yeah this one, wait, wait, step by step, load the UX toolkit, here are we just loading  the index.js, so here are we, means SDK related information anything we are having here in  the UX toolkit?

No, so here we are just giving the HTML script, like script, so we will be  replacing the program short code, so which will be provided from the market.

We can simply think like a toolkit library in our application like a dependency on super  A.

Like a decorum in that JS kind of.

Yeah, yes.

Actually SDK related can you elaborate?

I am just confused.

It's from UI it's going or from the ZM3 it's SDK information how we got that or can you  just confuse it on that SDK related.

So you want me to go first and let you know on the starting step or?

No, actually the flow is clear for me.

But how the RFC? 
