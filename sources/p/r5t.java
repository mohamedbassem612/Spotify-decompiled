package p;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class r5t implements x5t, cdd1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r5t(ywv0 ywv0Var, Iterable iterable, s29 s29Var, long j) {
        this.a = (byte) 2;
        this.b = ywv0Var;
        this.e = iterable;
        this.d = s29Var;
        this.c = j;
    }

    public ScheduledFuture a(h9n h9nVar) {
        byte b = this.a;
        Object obj = this.d;
        long j = this.c;
        Object obj2 = this.e;
        w5t w5tVar = (w5t) this.b;
        switch (b) {
            case 0:
                return w5tVar.b.schedule((Runnable) new u5t(w5tVar, (Runnable) obj2, h9nVar, (byte) 1), j, (TimeUnit) obj);
            default:
                return w5tVar.b.schedule(new v5t(w5tVar, (Callable) obj2, h9nVar, (byte) 0), j, (TimeUnit) obj);
        }
    }

    public Object c() {
        ywv0 ywv0Var = (ywv0) this.b;
        Iterable iterable = (Iterable) this.e;
        s29 s29Var = (s29) this.d;
        c441 c441Var = (c441) ywv0Var.c;
        c441Var.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(c441.h(iterable));
            SQLiteDatabase sQLiteDatabaseA = c441Var.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c441Var.f(cursorRawQuery.getInt(0), cse0.f, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseA.endTransaction();
                throw th2;
            }
        }
        c441Var.d(new t7s(((xqg) ywv0Var.g).b() + this.c, s29Var));
        return null;
    }

    public /* synthetic */ r5t(w5t w5tVar, Object obj, long j, TimeUnit timeUnit, byte b) {
        this.a = b;
        this.b = w5tVar;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }
}
