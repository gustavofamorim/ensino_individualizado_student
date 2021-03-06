/**
 * This class is generated by jOOQ
 */
package DAO.mysql.generatedclasses.tables;


import DAO.mysql.generatedclasses.Ensinoindividualizado;
import DAO.mysql.generatedclasses.Keys;
import DAO.mysql.generatedclasses.tables.records.RealizaRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;


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
public class Realiza extends TableImpl<RealizaRecord> {

	private static final long serialVersionUID = 497148936;

	/**
	 * The reference instance of <code>ensinoindividualizado.realiza</code>
	 */
	public static final Realiza REALIZA = new Realiza();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RealizaRecord> getRecordType() {
		return RealizaRecord.class;
	}

	/**
	 * The column <code>ensinoindividualizado.realiza.idaluno</code>.
	 */
	public final TableField<RealizaRecord, Integer> IDALUNO = createField("idaluno", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.realiza.idavaliacao</code>.
	 */
	public final TableField<RealizaRecord, Integer> IDAVALIACAO = createField("idavaliacao", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.realiza.dataRealizacao</code>.
	 */
	public final TableField<RealizaRecord, Date> DATAREALIZACAO = createField("dataRealizacao", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.realiza.estado</code>.
	 */
	public final TableField<RealizaRecord, Byte> ESTADO = createField("estado", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * Create a <code>ensinoindividualizado.realiza</code> table reference
	 */
	public Realiza() {
		this("realiza", null);
	}

	/**
	 * Create an aliased <code>ensinoindividualizado.realiza</code> table reference
	 */
	public Realiza(String alias) {
		this(alias, REALIZA);
	}

	private Realiza(String alias, Table<RealizaRecord> aliased) {
		this(alias, aliased, null);
	}

	private Realiza(String alias, Table<RealizaRecord> aliased, Field<?>[] parameters) {
		super(alias, Ensinoindividualizado.ENSINOINDIVIDUALIZADO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RealizaRecord> getPrimaryKey() {
		return Keys.KEY_REALIZA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RealizaRecord>> getKeys() {
		return Arrays.<UniqueKey<RealizaRecord>>asList(Keys.KEY_REALIZA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<RealizaRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<RealizaRecord, ?>>asList(Keys.FK_ALUNO_HAS_AVALIACAO_ALUNO1, Keys.FK_ALUNO_HAS_AVALIACAO_AVALIACAO1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Realiza as(String alias) {
		return new Realiza(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Realiza rename(String name) {
		return new Realiza(name, null);
	}
}
