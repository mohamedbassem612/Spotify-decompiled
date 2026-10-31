package p;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uhn implements k2t, plh0, a441, cdd1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uhn(Object obj, long j, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    public Object apply(Object obj) {
        String str = (String) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((cse0) this.c).a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.a;
            if (z) {
                sQLiteDatabase.execSQL(gvg.f(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(b)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(b));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void b(lly0 lly0Var) {
        ((shn) lly0Var.get()).c((String) this.b, this.a, (e29) this.c);
    }

    public Object c() {
        ywv0 ywv0Var = (ywv0) this.b;
        s29 s29Var = (s29) this.c;
        c441 c441Var = (c441) ywv0Var.c;
        long jB = ((xqg) ywv0Var.g).b() + this.a;
        c441Var.getClass();
        c441Var.d(new t7s(jB, s29Var));
        return null;
    }

    public void f(kh70 kh70Var, int i) {
        rlh0 rlh0Var = (rlh0) this.b;
        kh70Var.g(rlh0Var.c, i, ((yoh0) this.c).e(rlh0Var.o(), true), this.a);
    }

    public /* synthetic */ uhn(String str, long j, e29 e29Var) {
        this.b = str;
        this.a = j;
        this.c = e29Var;
    }
}
