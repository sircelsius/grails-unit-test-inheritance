package com.test

class ExtendController {

    def index() { }

    def list(){
    	return Abstract.list(params)
    }
}
