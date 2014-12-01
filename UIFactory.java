/**
 * 
 */
package com.mistkafka.empmis.ui;

/**
 * UI部件工程。通过工厂模式+单例模式实现。
 * @author Mistkafka Nov 17, 2014
 *
 */
public class UIFactory {
	
	/** 工厂类的唯一实例 */
	private static final UIFactory UI_FACTORY_INSTANCE = new UIFactory();
	
	/**
	 * 构造函数私有化
	 */
	private UIFactory() { }
	
	/**
	 * 获取工厂实例
	 * @return 工厂实例
	 */
	public UIFactory getInstance() {
		return UI_FACTORY_INSTANCE;
	}
	
	/**
	 * UI部件生产函数。用于new出对应类型的UI部件。
	 * @param UIType UI部件的类型
	 * @return 生成的UI部件
	 */
	public BaseUI getComponent(String UIType) {
		return null;
	}

}
