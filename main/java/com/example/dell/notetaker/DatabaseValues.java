package com.example.dell.notetaker;

/**
 * Created by DELL on 9/18/2017.
 */

public class DatabaseValues {
    public static final int DATABASE_VERSION=1;

    public static final String DATABASE_NAME="myDatabase";

    public static final String TABLE_NOTES="notes";

    public static final String NOTES_ID="id";

    public static final String NOTES_TITLE="title";

    public static final String NOTES_DESCRIPTION="description";

    public static final String TABLE_NOTES_CREATE="CREATE TABLE IF NOT EXISTS "+TABLE_NOTES+"("+NOTES_ID+"INTEGER PRIMARY KEY,"+NOTES_TITLE+"TEXT,"+NOTES_DESCRIPTION+"TEXT)";

    public static final String TABLE_NOTES_DROP="DROP TABLE IF EXISTS"+TABLE_NOTES;
}



