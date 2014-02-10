package com.javacreed.examples.deadlock.part2;

import com.javacreed.examples.deadlock.utils.ThreadUtils;

public class Example1 {

  public static void main(final String[] args) throws Exception {

    final Object lockX = new Object();
    final Object lockY = new Object();

    final Thread threadA = new Thread(new Runnable() {
      @Override
      public void run() {
        ThreadUtils.log("Acquire lock-X");
        synchronized (lockX) {
          ThreadUtils.log("Acquire lock-Y");
          synchronized (lockY) {
            ThreadUtils.log("Both locks are acquired");
          }
          ThreadUtils.log("Release lock-Y");
        }
        ThreadUtils.log("Release lock-X");
      }
    }, "Thread-A");
    threadA.start();

    /* Wait for the thread to stop */
    threadA.join();
  }
}