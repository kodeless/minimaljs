package br.com.kodeless.minimojs.parser;

public class XComment extends XText {

	public XComment() {
		this.addString("<!--");
	}

	public void close() {
		this.addString("-->");
	}

	@Override
	public String toJson() {
		return "";
	}
}
