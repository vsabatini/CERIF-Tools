package gr.ekt.cerif.xml.service;


/**
 * Options for CERIF XML service.
 */
public class XmlCERIFOptions {

	/**
	 * The source database attribute of the root element. 
	 */
	private String sourceDatabase;
	
	/**
	 * The output file path.
	 */
	private String outputFilePath;
	
	/**
	 * The encoding.
	 */
	private String encoding;

	/**
	 * Returns the source database.
	 * @return the source database.
	 */
	public String getSourceDatabase() {
		return sourceDatabase;
	}

	/**
	 * Sets the source database.
	 * @param sourceDatabase the source database.
	 */
	public void setSourceDatabase(String sourceDatabase) {
		this.sourceDatabase = sourceDatabase;
	}

	/**
	 * Returns the output file path.
	 * @return a path.
	 */
	public String getOutputFilePath() {
		return outputFilePath;
	}

	/**
	 * Sets the output file path.
	 * @param outputFilePath a path.
	 */
	public void setOutputFilePath(String outputFilePath) {
		this.outputFilePath = outputFilePath;
	}

	/**
	 * Returns the encoding.
	 * @return the encoding.
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * Sets the encoding.
	 * @param encoding the encoding.
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	
}
