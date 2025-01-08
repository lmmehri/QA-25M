class MyReg{

    getName(){
        return cy.get(':nth-child(1) > .form-control')
        

}
   getemail(){
    return  cy.get(':nth-child(2) > .form-control')
}
}



export default MyRegReg;