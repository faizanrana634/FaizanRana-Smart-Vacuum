/**
 * 
 */
package com.IRobotRoomba.src;

import javax.swing.text.html.HTMLEditorKit.Parser;

/**
 * @author faizan
 *
 */
public abstract class Vacuum extends Parser{

	private final double suctionPower = 0; 
	@SuppressWarnings("unused")
	private void dustbin() {}
	@SuppressWarnings("unused")
	private void brushes() {}

	public double getSuctionPower() {
		return suctionPower;
	}

	public boolean suctions;
}
