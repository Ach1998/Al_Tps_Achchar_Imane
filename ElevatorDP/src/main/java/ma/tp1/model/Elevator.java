package ma.tp1.model;

import lombok.Data;

import ma.tp1.model.elevatorStates.StopedState;

@Data
public class Elevator {
    private Long id;
    private Integer position;
    private ElevatorState state;

    Integer getDistanceFromPosition(int position,Integer nbrOfFloors){
        return state.getDistanceFromPosition(position,nbrOfFloors,this);
    }


    Integer getDistanceFromTop(Integer nbrOfFloors){
        return state.getDistanceFromTop(nbrOfFloors,this);
    }

    public void moveDown(Integer maxFloors){
        state.moveDown(this,maxFloors);
    }

    public void moveUp(){
        state.moveUp(this);
    }


    public void stop(int position){
        this.position=position;
        state=new StopedState();
    }


	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}


	public void setPosition(Integer pos) {
		// TODO Auto-generated method stub
		
	}


	public ElevatorState getState() {
		return state;
	}


	public void setState(ElevatorState state) {
		this.state = state;
	}


	

	public Integer getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
}
