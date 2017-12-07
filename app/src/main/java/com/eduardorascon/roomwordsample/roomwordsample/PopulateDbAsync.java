package com.eduardorascon.roomwordsample.roomwordsample;

import android.os.AsyncTask;

public class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
    private final WordDao mDao;

    PopulateDbAsync(WordRoomDatabase db) {
        mDao = db.wordDao();
    }

    @Override
    protected Void doInBackground(final Void... voids) {
        mDao.deleteAll();
        Word word = new Word("Hello");
        mDao.insert(word);
        word = new Word("World");
        mDao.insert(word);
        return null;
    }
}
