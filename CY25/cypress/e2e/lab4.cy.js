describe('Test Alert,Table andMouse hover', () => {
    it.only('Test Alert',() => {
      cy.visit("https://rahulshettyacademy.com/AutomationPractice/");
      cy.get('#alertbtn').click()

      cy.on("window:alert",(str)=>{
        expect(str).to.be.equal("Hello , share this practice page and share your knowledge")
      })
    });
    it('Test Table',() =>{
      cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
      cy.get('tr td:nth-child(2)').each(($el,$index, $list ) =>{
        const txt =$el.text()
        if(txt.includes('Receptionist')){
            cy.get("tr td:nth-child(2)").eq($index).next().then(function(name){
               // const p =City.text()
                expect(p).to.equal(25)
            })
       }
      
      })
    });
    //it('Test mouse hover( =>))

    })
