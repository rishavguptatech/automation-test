package com.petstore.automationtest.api.model.petstore.response;

import java.util.List;

public class GetPetByStatusResponse{
	private List<GetPetByStatusResponseItem> getPetByStatusResponse;

	public void setGetPetByStatusResponse(List<GetPetByStatusResponseItem> getPetByStatusResponse){
		this.getPetByStatusResponse = getPetByStatusResponse;
	}

	public List<GetPetByStatusResponseItem> getGetPetByStatusResponse(){
		return getPetByStatusResponse;
	}

	@Override
 	public String toString(){
		return 
			"GetPetByStatusResponse{" + 
			"getPetByStatusResponse = '" + getPetByStatusResponse + '\'' + 
			"}";
		}
}