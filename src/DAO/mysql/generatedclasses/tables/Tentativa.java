/**
 * This class is generated by jOOQ
 */
package DAO.mysql.generatedclasses.tables;


import DAO.mysql.generatedclasses.Ensinoindividualizado;
import DAO.mysql.generatedclasses.Keys;
import DAO.mysql.generatedclasses.tables.records.TentativaRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class Tentativa extends TableImpl<TentativaRecord> {

	private static final long serialVersionUID = -1337701943;

	/**
	 * The reference instance of <code>ensinoindividualizado.tentativa</code>
	 */
	public static final Tentativa TENTATIVA = new Tentativa();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TentativaRecord> getRecordType() {
		return TentativaRecord.class;
	}

	/**
	 * The column <code>ensinoindividualizado.tentativa.idtentativa</code>.
	 */
	public final TableField<TentativaRecord, Integer> IDTENTATIVA = createField("idtentativa", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.tentativa.idbloco</code>.
	 */
	public final TableField<TentativaRecord, Integer> IDBLOCO = createField("idbloco", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.tentativa.idenunciado</code>.
	 */
	public final TableField<TentativaRecord, Integer> IDENUNCIADO = createField("idenunciado", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>ensinoindividualizado.tentativa</code> table reference
	 */
	public Tentativa() {
		this("tentativa", null);
	}

	/**
	 * Create an aliased <code>ensinoindividualizado.tentativa</code> table reference
	 */
	public Tentativa(String alias) {
		this(alias, TENTATIVA);
	}

	private Tentativa(String alias, Table<TentativaRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tentativa(String alias, Table<TentativaRecord> aliased, Field<?>[] parameters) {
		super(alias, Ensinoindividualizado.ENSINOINDIVIDUALIZADO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TentativaRecord, Integer> getIdentity() {
		return Keys.IDENTITY_TENTATIVA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TentativaRecord> getPrimaryKey() {
		return Keys.KEY_TENTATIVA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TentativaRecord>> getKeys() {
		return Arrays.<UniqueKey<TentativaRecord>>asList(Keys.KEY_TENTATIVA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<TentativaRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TentativaRecord, ?>>asList(Keys.FK_TENTATIVA_BLOCO1, Keys.FK_TENTATIVA_ENUNCIADO1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Tentativa as(String alias) {
		return new Tentativa(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Tentativa rename(String name) {
		return new Tentativa(name, null);
	}
}