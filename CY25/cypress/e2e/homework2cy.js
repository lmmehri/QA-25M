describe("dropdown", () =>{
    it.only('Test checkbox and dropdown ',() =>{
        cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
        cy.get('#autocomplete').type('ne')  
        cy.get('.ui-menu-item div').each(($el, $index, $list)=>{ 

            const ctr =$el.text()
            if(ctr==='Philippines'){
                $el.click()
            }
        });
    })
    
});
    
        
       
        
            
           

        
    
