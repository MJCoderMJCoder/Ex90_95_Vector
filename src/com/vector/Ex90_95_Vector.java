package com.vector;

import java.util.Vector;

public class Ex90_95_Vector {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>(); //����vector����Ĭ�ϳ���Ϊ10(Ĭ�������Ŀռ��С)
		vct.add("�����1��");
		vct.add("�����2��");
		vct.add("�����3��");
		System.out.println("������ʼԪ��Ϊ��" + vct);
		
		//capacity()����ȡ���������пɹ��ṩ�洢�Ŀռ��С��size()����ȡ����������ʵ�ʴ洢��Ԫ�ظ���
		System.out.println("�������Ŀռ��СΪ��" + vct.capacity());
		System.out.println("��������Ԫ�ظ���Ϊ��" + vct.size());
		vct.setSize(5); //������������Ϊ5
		System.out.println("��һ���޸ĺ�����Ԫ��Ϊ��" + vct);
		System.out.println("�������Ŀռ��СΪ��" + vct.capacity());
		System.out.println("��������Ԫ�ظ���Ϊ��" + vct.size());
		vct.setSize(2); //������������Ϊ2
		System.out.println("�ڶ����޸ĺ�����Ԫ��Ϊ��" + vct);
		System.out.println("�������Ŀռ��СΪ��" + vct.capacity());
		System.out.println("��������Ԫ�ظ���Ϊ��" + vct.size());
	}

}
