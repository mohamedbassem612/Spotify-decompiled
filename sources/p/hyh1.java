package p;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class hyh1 implements cdd1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ywv0 b;
    public final /* synthetic */ s29 c;

    public /* synthetic */ hyh1(ywv0 ywv0Var, s29 s29Var, byte b) {
        this.a = b;
        this.b = ywv0Var;
        this.c = s29Var;
    }

    public final Object c() {
        Boolean bool;
        byte b = this.a;
        s29 s29Var = this.c;
        ywv0 ywv0Var = this.b;
        switch (b) {
            case 0:
                c441 c441Var = (c441) ywv0Var.c;
                SQLiteDatabase sQLiteDatabaseA = c441Var.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    Long lC = c441.c(sQLiteDatabaseA, s29Var);
                    if (lC == null) {
                        bool = Boolean.FALSE;
                    } else {
                        Cursor cursorRawQuery = c441Var.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                        try {
                            Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                            cursorRawQuery.close();
                            bool = boolValueOf;
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    return bool;
                } catch (Throwable th2) {
                    sQLiteDatabaseA.endTransaction();
                    throw th2;
                }
            default:
                c441 c441Var2 = (c441) ywv0Var.c;
                c441Var2.getClass();
                return (Iterable) c441Var2.d(new h341(c441Var2, s29Var, (byte) 1));
        }
    }
}
