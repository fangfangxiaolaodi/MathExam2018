package com.java.Task01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MathExam6353 {
	public static void main(String[] args) throws IOException {

		int x;
		int y;
		int f;
		
		File file = new File("out353.txt");
		//����ָ���ļ������������
		DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Сѧһ�꼶��ѧ�Ӽ�������");
		System.out.println("��������Ŀ������");
		//��ȡ����̨������Ŀ����n
		
	
		int n = input.nextInt();

		//������Ŀ
		for (int i = 1; i <= n; i++) {
			//�������������
			x = (int)(Math.random()*100+1);
			y = (int)(Math.random()*100+1);
			f = (int)(Math.random()*2);
			//�жϼӷ��ͼ���  0Ϊ�ӷ�
			if(f==0) {
				//���ɼ���
				System.out.println("("+ i +") " + x +" - "+ y + " =");
				String str1 = ("("+ i +") " + x +" - "+ y + " = " + (x-y));
				//д������
				out.writeUTF(str1);
//				System.out.println(str);
			}	
			else {
				//���ɼӷ�
				System.out.println("("+ i +") " + x +" + "+ y + " =");
				String str1 = ("("+ i +") " + x +" + "+ y + " = " + (x+y));
				//д�����ݰ�
				out.writeUTF(str1);
//				System.out.println(str);
			}
		}
		out.close();
		
		System.out.println("------------------��׼��------------------");
		
		//����ָ���ļ�������������
		DataInputStream in = new DataInputStream(new FileInputStream(file));
		//������
		for (int i = 0; i < n; i++) {
			System.out.println(in.readUTF());
		}
		in.close();
		//������ں�ѧ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm");
		System.out.println("              211606353 �������±���  " +sdf.format(new Date(n)));
	}//main

	
	
}

