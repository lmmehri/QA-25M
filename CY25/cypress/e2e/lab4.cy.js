describe('Test Alert,Table andMouse hover', () => {
    it('Test Alert',() => {
      cy.visit("https://rahulshettyacademy.com/AutomationPractice/");
      cy.get('#alertbtn').click()

      cy.on("window:alert",(str)=>{
        expect(str).to.be.equal("Hello , share this practice page and share your knowledge")
      })
    });
    it.only('Test Table',() =>{
      cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
      cy.get('tr td:nth-child(2)').each(($el,$index, $list ) =>{
        const txt =$el.text()
        if(txt.includes('Python')){
            cy.get("tr td:nth-child(2)").eq($index).next().then(function(price) {
           const p = price.text() 
           
           expect(p).to.be.equal('25') 
           //cy.log(25)
        }) 
        cy.get("tr td:nth-child(2)").eq($index).prev().then(function(price) {
            const p = price.text()  
           // expect(p).to.be.equal('25') 
            cy.log(p)   
       })
      
        }
    });
})
})
    //it('Test mouse hover( =>))
