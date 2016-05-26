/**
 * This class is generated by jOOQ
 */
package DAO.mysql.generatedclasses.tables.records;


import DAO.mysql.generatedclasses.tables.Video;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VideoRecord extends UpdatableRecordImpl<VideoRecord> implements Record4<Integer, String, byte[], String> {

	private static final long serialVersionUID = -1440168778;

	/**
	 * Setter for <code>ensinoindividualizado.video.idvideo</code>.
	 */
	public void setIdvideo(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.video.idvideo</code>.
	 */
	public Integer getIdvideo() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ensinoindividualizado.video.descricao</code>.
	 */
	public void setDescricao(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.video.descricao</code>.
	 */
	public String getDescricao() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>ensinoindividualizado.video.video</code>.
	 */
	public void setVideo(byte[] value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.video.video</code>.
	 */
	public byte[] getVideo() {
		return (byte[]) getValue(2);
	}

	/**
	 * Setter for <code>ensinoindividualizado.video.nome_original</code>.
	 */
	public void setNomeOriginal(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.video.nome_original</code>.
	 */
	public String getNomeOriginal() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, byte[], String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, byte[], String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Video.VIDEO.IDVIDEO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Video.VIDEO.DESCRICAO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field3() {
		return Video.VIDEO.VIDEO_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Video.VIDEO.NOME_ORIGINAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdvideo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getDescricao();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value3() {
		return getVideo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getNomeOriginal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VideoRecord value1(Integer value) {
		setIdvideo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VideoRecord value2(String value) {
		setDescricao(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VideoRecord value3(byte[] value) {
		setVideo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VideoRecord value4(String value) {
		setNomeOriginal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VideoRecord values(Integer value1, String value2, byte[] value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VideoRecord
	 */
	public VideoRecord() {
		super(Video.VIDEO);
	}

	/**
	 * Create a detached, initialised VideoRecord
	 */
	public VideoRecord(Integer idvideo, String descricao, byte[] video, String nomeOriginal) {
		super(Video.VIDEO);

		setValue(0, idvideo);
		setValue(1, descricao);
		setValue(2, video);
		setValue(3, nomeOriginal);
	}
}