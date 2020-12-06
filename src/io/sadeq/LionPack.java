package io.sadeq;

import java.util.ArrayList;
import java.util.List;

public class LionPack {

	// attributes
	private String name;
	private Lion leader;
	private List<Lion> members;

	// constructor
	public LionPack(String name, Lion leader) {
		this.name = name;
		this.leader = leader;
		this.members = new ArrayList<Lion>();
	}


	// ==================================================================
	// getters and setters
	// ==================================================================
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLeader() {
		return this.leader.getName();
	}

	public void setLeader(Lion leader) {
		this.leader = leader;
	}

	// ==================================================================
	public void addMember(Lion lion) {
		this.members.add(lion);
	}

	public void printMembers() {
		for (Lion member : this.members) {
			System.out.println(member.getName());
		}
	}

}