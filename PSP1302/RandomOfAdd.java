public class RandomOfAdd extends RandomNumber {
	// ����һ�꼶�ӷ��������Ŀ A+B
	// AΪ��λ��
	// BΪ��λ��������ʮ��
	public void createRandomAandB(Bean bean) {
		// A��ȡֵ��ΧΪ [1-9]
		int randomA = random.nextInt(9) + 1;
		int randomB = 0;
		// BΪ��λ��������ʮ��
		// true���� ��λ��,false������ʮ��
		if (random.nextBoolean()) {
			randomB = random.nextInt(9) + 1;
		} else {
			randomB = 10 * (random.nextInt(9) + 1);
		}
		
		bean.setNumberA(randomA);
		bean.setNumberB(randomB);
	}

}