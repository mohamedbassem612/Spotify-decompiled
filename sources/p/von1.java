package p;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class von1 extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList((Collection) new i36(nln1.values(), false));
        r7h.c0(arrayList);
        r7h.e0(arrayList);
        Collections.shuffle(arrayList);
        String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, hf41.e, 30);
        StringBuilder sb = new StringBuilder(strY0.length() + 38);
        sb.append("CREATE TABLE IF NOT EXISTS tbl64158 (");
        sb.append(strY0);
        sb.append(")");
        sQLiteDatabase.execSQL(sb.toString());
        String strJ0 = dm5.j0(nln1.d);
        StringBuilder sb2 = new StringBuilder(strJ0.length() + 52);
        sb2.append("CREATE INDEX IF NOT EXISTS idx_action ON tbl64158(");
        sb2.append(strJ0);
        sb2.append(");");
        sQLiteDatabase.execSQL(sb2.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
