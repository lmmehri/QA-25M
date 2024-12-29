describe('Test confirm', () => {
    it('Test confirm',() => {
      cy.visit("https://rahulshettyacademy.com/AutomationPractice/");
      cy.get('#confirmbtn').click()

      cy.on("window:alert",(str)=>{
        expect(str).to.be.equal("Hello , Are you sure you want to confirm?")
      })
    })
})