package p;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c441 implements Closeable {
    public static final bbx f = new bbx("proto");
    public final vm41 a;
    public final xqg b;
    public final xqg c;
    public final t09 d;
    public final kly0 e;

    public c441(xqg xqgVar, xqg xqgVar2, t09 t09Var, vm41 vm41Var, kly0 kly0Var) {
        this.a = vm41Var;
        this.b = xqgVar;
        this.c = xqgVar2;
        this.d = t09Var;
        this.e = kly0Var;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, s29 s29Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(s29Var.a, String.valueOf(aow0.a(s29Var.c))));
        byte[] bArr = s29Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String h(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((r19) it.next()).a());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object i(Cursor cursor, a441 a441Var) {
        try {
            return a441Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.datatransport.runtime.synchronization.SynchronizationException */
    public final SQLiteDatabase a() throws SynchronizationException {
        vm41 vm41Var = this.a;
        Objects.requireNonNull(vm41Var);
        xqg xqgVar = this.c;
        long jB = xqgVar.b();
        while (true) {
            try {
                return vm41Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (xqgVar.b() >= ((long) this.d.c) + jB) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.datatransport.runtime.synchronization.SynchronizationException */
    public final Object d(a441 a441Var) throws SynchronizationException {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = a441Var.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase, s29 s29Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lC = c(sQLiteDatabase, s29Var);
        if (lC == null) {
            return arrayList;
        }
        i(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i)), new k65(this, arrayList, s29Var, (byte) 22));
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.datatransport.runtime.synchronization.SynchronizationException */
    public final void f(long j, cse0 cse0Var, String str) throws SynchronizationException {
        d(new uhn(str, j, cse0Var));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.datatransport.runtime.synchronization.SynchronizationException */
    public final Object g(cdd1 cdd1Var) throws SynchronizationException {
        SQLiteDatabase sQLiteDatabaseA = a();
        f341 f341Var = new f341((byte) 2);
        xqg xqgVar = this.c;
        long jB = xqgVar.b();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objC = cdd1Var.c();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objC;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (xqgVar.b() >= ((long) this.d.c) + jB) {
                    f341Var.apply(e);
                    throw null;
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
