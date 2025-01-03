import "cypress-iframe"
describe('Handling iframe and fixture', ()=>  {
    let d
before(() =>{

cy.fixture("data").then(function(x){
    d = x

})


})
 
    it.only('datadriving(fixture)', ()=>{
        cy.visit("https://rahulshettyacademy.com/angularpractice/")
        cy.get(':nth-child(1) > .form-control').type(d.Name)
       // cy.get(':nth-child(2) > .form-control').type(d.emai)

       cy.get(':nth-child(1) > .form-control').type(d.kb[0])
        cy.get('input[name="email"]').type(d.kb[1])

    })


    describe('iframe testing', ()=>  {
    it('iframe', () => {
    cy.visit("https://rahulshettyacademy.com/AutomationPractice/");
    cy.frameLoaded('#courses-iframe')  //used to load the iframe

//css formula == tagname[attribbute='value']
   //<a href="mentorship"Mentorship</a>

    cy.iframe().find("a[href='mentorship").eq(0).click()

    })  
})
})