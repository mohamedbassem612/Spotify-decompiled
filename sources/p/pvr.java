package p;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pvr implements Closeable {
    public final Cursor a;

    public pvr(Cursor cursor) {
        this.a = cursor;
    }

    public final kru a() {
        return qvr.e(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final boolean moveToNext() {
        Cursor cursor = this.a;
        return cursor.moveToPosition(cursor.getPosition() + 1);
    }
}
