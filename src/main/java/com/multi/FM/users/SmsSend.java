package com.multi.FM.users;

import org.springframework.web.bind.annotation.RestController;

import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.MessageListRequest;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.MessageListResponse;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;

@RestController
public class SmsSend {
	
//	@GetMapping("/get-message-list")
	public MessageListResponse getMessageList(String receive) {
		MessageListRequest request = new MessageListRequest();
		return this.messageService.getMessageList(request);
	}

	private String apiKey = "NCSC2AZXNKGTMGC3";
	private String apiSecretKey = "GGEZPQA2GDMUZQVVQLMVYL8RAFGLJUMU";

	final DefaultMessageService messageService;

	public SmsSend() { // �ݵ�� ���� �� ��ϵ� ��ȿ�� API Ű, API Secret Key��
		this.messageService = NurigoApp.INSTANCE.initialize(apiKey, apiSecretKey, "https://api.coolsms.co.kr");
	}

	public SingleMessageSentResponse sendOne(String receive,String num) {
		Message message = new Message();
		// �߽Ź�ȣ �� ���Ź�ȣ�� �ݵ�� 01012345678 ���·� �ԷµǾ�� �մϴ�.
		message.setFrom("01041784636");
		message.setTo(receive);
		message.setText("[�ν���] �Ʒ��� ������ȣ�� �Է����ּ���\n" + num);

		SingleMessageSentResponse response = this.messageService.sendOne(new SingleMessageSendingRequest(message));
		System.out.println(response);
		
		return response;
	}

}
