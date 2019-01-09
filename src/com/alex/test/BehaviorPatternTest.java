package com.alex.test;

import org.junit.Test;

import com.alex.pattern.b1_template.DownloadAPKService;
import com.alex.pattern.b1_template.DownloadService;
import com.alex.pattern.b2_chain_of_responsibility.AbstractLogger;
import com.alex.pattern.b2_chain_of_responsibility.ChainOfResponsibility;
import com.alex.pattern.b2_command.Broker;
import com.alex.pattern.b2_command.BuyStock;
import com.alex.pattern.b2_command.IOrder;
import com.alex.pattern.b2_command.Stock;
import com.alex.pattern.b2_iterator.IIterator;
import com.alex.pattern.b2_iterator.NameRepository;
import com.alex.pattern.b2_observer.Student;
import com.alex.pattern.b2_observer.Teacher;
import com.alex.pattern.b3_state.Context;
import com.alex.pattern.b3_state.EndState;
import com.alex.pattern.b3_state.IState;
import com.alex.pattern.b3_state.StartState;
import com.alex.pattern.b4_mediator.User;
import com.alex.pattern.b4_visitor.Computer;
import com.alex.pattern.b4_visitor.ComputerPartDisplayVisitor;
import com.alex.pattern.b4_visitor.IComputerPart;
import com.alex.pattern.s_adapter.AudioPlayer;

/**
 * http://www.runoob.com/design-pattern/template-pattern.html
 * https://www.cnblogs.com/geek6/p/3951677.html
 * https://blog.csdn.net/zhangerqing/article/details/8245560
 * 
 * @author xiyu
 *
 */
public class BehaviorPatternTest {

	@Test
	public void chatRoomTest() {
		User user = new User("alex");
		user.sendMessage("hello jack");

		User u2 = new User("jack");
		u2.sendMessage("hi alex");
	}

	@Test
	public void visitorTest() {
		IComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

	@Test
	public void commandTest() {
		Stock stock = new Stock();

		IOrder buy = new BuyStock(stock);
		Broker broker = new Broker();
		broker.takeOrder(buy);

		broker.placeOrders();
	}

	@Test
	public void responsibilityTest() {
		AbstractLogger logger = ChainOfResponsibility.getChainOfLogger();
		logger.logMessage(3, "xxx");
	}

	@Test
	public void iteratorTest() {
		NameRepository nameRes = new NameRepository();
		for (IIterator iterator = nameRes.getIterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
		}
	}

	@Test
	public void stateTest() {
		Context context = new Context();
		IState state = new StartState();
		state.doAction(context);
		System.out.println("current state:" + context.getState().toString());
		IState end = new EndState();
		end.doAction(context);
		System.out.println("current state:" + context.getState().toString());
	}

	@Test
	public void observerTest() {
		Teacher teacher = new Teacher();
		Student stu1 = new Student("alex", teacher);
		Student stu2 = new Student("jack", teacher);

		teacher.setPhone("11111");
		stu1.show();
		stu2.show();
		teacher.setPhone("22222");
		stu1.show();
		stu2.show();
	}

	@Test
	public void adapterTest() {
		AudioPlayer player = new AudioPlayer();
		player.play("mp4", "test.mp4");
		player.play("mp3", "test.mp3");
		player.play("lvc", "test.lvc");
		player.play("aa", "test.aa");
	}

	@Test
	public void templateTest() {
		DownloadService down = new DownloadAPKService();
		down.onHandleIntent();
	}
}
