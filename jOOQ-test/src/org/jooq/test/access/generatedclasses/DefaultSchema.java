/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 901450636;

	/**
	 * The singleton instance of <code></code>
	 */
	public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

	/**
	 * No further instances allowed
	 */
	private DefaultSchema() {
		super("");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.access.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.access.generatedclasses.tables.T_785.T_785,
			org.jooq.test.access.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.access.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.access.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.access.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.access.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.access.generatedclasses.tables.TDates.T_DATES,
			org.jooq.test.access.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES,
			org.jooq.test.access.generatedclasses.tables.TIdentity.T_IDENTITY,
			org.jooq.test.access.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK,
			org.jooq.test.access.generatedclasses.tables.TLanguage.T_LANGUAGE,
			org.jooq.test.access.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.access.generatedclasses.tables.TUnsigned.T_UNSIGNED);
	}
}
