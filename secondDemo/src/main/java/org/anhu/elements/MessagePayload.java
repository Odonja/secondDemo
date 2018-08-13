package org.anhu.elements;

public class MessagePayload {

	private Tag body;
	private String resource;

	public MessagePayload() {
	}

	public MessagePayload(Tag body, String resource) {
		this.body = body;
		this.resource = resource;
	}

	public Tag getBody() {
		return body;
	}

	public void setBody(Tag body) {
		this.body = body;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	@Override
	public String toString() {
		return "Payload [body=" + body + ", resource=" + resource + "]";
	}

}
