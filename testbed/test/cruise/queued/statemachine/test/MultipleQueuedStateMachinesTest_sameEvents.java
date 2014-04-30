//package cruise.queued.statemachine.test;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class MultipleQueuedStateMachinesTest_sameEvents
//{ 
//
//  @Test 
//  public void numberOfMessagesInMessageType()
//  {
//	  // compare the number of messages in MessageType is equal to the number of events in State Machine except timed events and auto-transition
//	  Assert.assertEquals(6, MultipleQueuedSMs_sameEvents.MessageType.values().length);
//	  Assert.assertEquals(true, MultipleQueuedSMs_sameEvents.MessageType.valueOf("ev1_M").equals(MultipleQueuedSMs_sameEvents.MessageType.ev1_M));
//	  Assert.assertEquals(true, MultipleQueuedSMs_sameEvents.MessageType.valueOf("ev2_M").equals(MultipleQueuedSMs_sameEvents.MessageType.ev2_M));
//	  Assert.assertEquals(true, MultipleQueuedSMs_sameEvents.MessageType.valueOf("ev3_M").equals(MultipleQueuedSMs_sameEvents.MessageType.ev3_M));
//	  Assert.assertEquals(true, MultipleQueuedSMs_sameEvents.MessageType.valueOf("ev4_M").equals(MultipleQueuedSMs_sameEvents.MessageType.ev4_M));
//	  Assert.assertEquals(true, MultipleQueuedSMs_sameEvents.MessageType.valueOf("ev5_M").equals(MultipleQueuedSMs_sameEvents.MessageType.ev5_M));
//	  Assert.assertEquals(true, MultipleQueuedSMs_sameEvents.MessageType.valueOf("ev7_M").equals(MultipleQueuedSMs_sameEvents.MessageType.ev7_M));
//  }
//  
//  @Test 
//  public void processEvents() throws InterruptedException
//  {
//	  MultipleQueuedSMs_sameEvents psm = new MultipleQueuedSMs_sameEvents();
//	  
//	  // check initial states are s1 - s21
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s1, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s21, psm.getSm1());
//	  
//	  //event ev1 is called
//	  psm.ev1();//event ev1 is added to the queue
//	  Thread.sleep(10);
//	  // event ev1 is taken off the queue and is processed
//	  // state machine sm: transition to: s2 
//	  // state machine sm1: transition to: s22
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s2, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//	  
//	  //event ev2 is called
//	  psm.ev2();//event ev2 is added to the queue
//	  Thread.sleep(10);
//	  // event ev2 is taken off the queue and is processed
//	  // state machine sm: transition to: s3 
//	  // state machine sm1: transition to: s22
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s3, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//	  
//	  //event ev2 is called
//	  psm.ev2();//event ev2 is added to the queue
//	  Thread.sleep(10);
//	  //event ev2 is unspecified, it is ignored, current states are not changed
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s3, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//	 
//	  //event ev4 is called
//	  psm.ev4();//event ev4 is added to the queue
//	  Thread.sleep(10);
//	  //event ev4 is unspecified, it is ignored, current states are not changed
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s3, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//
//	  //event ev1 is called
//	  psm.ev1();//event ev1 is added to the queue
//	  Thread.sleep(10);
//	  //event ev1 is unspecified, it is ignored, current states are not changed
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s3, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//
//	  //event ev1 is called
//	  psm.ev1();//event ev1 is added to the queue
//	  Thread.sleep(10);
//	  //event ev1 is unspecified, it is ignored, current states are not changed
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s3, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//	 
//	  //event ev3 is called
//	  psm.ev3();//event ev3 is added to the queue
//	  Thread.sleep(10);  
//	  // event ev3 is taken off the queue and is processed 
//	  // state machine sm: transition to: s4 
//	  // state machine sm1: transition to: s22
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s4, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//
//	  //event ev3 is called
//	  psm.ev3();//event ev3 is added to the queue
//	  Thread.sleep(10);
//	  //event ev3 is unspecified, it is ignored, current states are not changed
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s4, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//	  
//	  //event ev4 is called
//	  psm.ev4();//event ev4 is added to the queue
//	  Thread.sleep(10);
//	  // event ev4 is taken off the queue and is processed
//	  // state machine sm: transition to: s1 
//	  // state machine sm1: transition to: s22
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s1, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//	  
//	  //event ev7 is called
//	  psm.ev7();//event ev7 is added to the queue
//	  Thread.sleep(10);
//	  // event ev7 is taken off the queue and is processed
//	  // state machine sm: transition to: s1 
//	  // state machine sm1: transition to: s21
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s1, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s21, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//	  
//	  
//	  //event ev4 is called
//	  psm.ev4();//event ev4 is added to the queue
//	  Thread.sleep(10);
//	  //event ev4 is unspecified, it is ignored, current states are not changed
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s1, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s21, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());
//
//      //event ev1 is called
//	  psm.ev1();//event ev1 is added to the queue
//	  Thread.sleep(10);
//	  // event ev1 is taken off the queue and is processed
//	  // state machine sm: transition to: s2 
//	  // state machine sm1: transition to: s22
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s2, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());	 
//	  
//      //event ev2 is called
//	  psm.ev2();//event ev2 is added to the queue
//	  Thread.sleep(10);
//	  // event ev2 is taken off the queue and is processed
//	  // state machine sm: transition to: s3 
//	  // state machine sm1: transition to: s22
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s3, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());	  
//	  	  
//      //event ev3 is called
//	  psm.ev3();//event ev3 is added to the queue
//	  Thread.sleep(10);
//	  // event ev3 is taken off the queue and is processed
//	  // state machine sm: transition to: s4
//	  // state machine sm1: transition to: s22
//	  // process event ev4 state machine sm: transition to: s1
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm.s4, psm.getSm());
//	  Assert.assertEquals(MultipleQueuedSMs_sameEvents.Sm1.s22, psm.getSm1());
//	  // queue is empty
//	  Assert.assertEquals(0, psm.pool.messages.size());	
//	  
//	  
//	  //check that there is no event left in the queue
//	  Assert.assertEquals(0, psm.pool.messages.size());	 
//  }
//}