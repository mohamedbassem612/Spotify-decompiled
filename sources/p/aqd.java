package p;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aqd extends AsyncQueryHandler {
    public final /* synthetic */ bqd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqd(bqd bqdVar, ContentResolver contentResolver) {
        super(contentResolver);
        this.a = bqdVar;
    }

    @Override // android.content.AsyncQueryHandler
    public final void onQueryComplete(int i, Object obj, Cursor cursor) {
        bqd bqdVar = this.a;
        if (cursor == null) {
            bqdVar.j(0);
            return;
        }
        int columnIndex = cursor.getColumnIndex("CarConnectionState");
        if (columnIndex < 0) {
            bqdVar.j(0);
        } else if (cursor.moveToNext()) {
            bqdVar.j(Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            bqdVar.j(0);
        }
    }
}
