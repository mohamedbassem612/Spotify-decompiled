package p;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class q1i0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q1i0(h2i0 h2i0Var, IBinder iBinder, d2i0 d2i0Var, int i) {
        this.a = (byte) 1;
        this.b = h2i0Var;
        this.c = iBinder;
        this.e = d2i0Var;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        int i = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ch61 ch61Var = (ch61) obj;
                v1k v1kVar = ((h2i0) obj3).m;
                v1kVar.J();
                ixh0 ixh0VarO = v1kVar.o((IBinder) obj2);
                q8l q8lVar = ixh0VarO != null ? (q8l) ((y36) v1kVar.c).get(ixh0VarO) : null;
                xen0 xen0Var = q8lVar != null ? q8lVar.b : null;
                if (xen0Var != null) {
                    xen0Var.i(i, ch61Var);
                    return;
                }
                return;
            case 1:
                d2i0 d2i0Var = (d2i0) obj;
                ixh0 ixh0VarO2 = ((h2i0) obj3).m.o((IBinder) obj2);
                if (ixh0VarO2 != null) {
                    d2i0Var.a(ixh0VarO2, i);
                    return;
                }
                return;
            default:
                ywv0 ywv0Var = (ywv0) obj3;
                s29 s29Var = (s29) obj2;
                Runnable runnable = (Runnable) obj;
                c441 c441Var = (c441) ywv0Var.f;
                final byte b2 = 1;
                try {
                    try {
                        final c441 c441Var2 = (c441) ywv0Var.c;
                        Objects.requireNonNull(c441Var2);
                        c441Var.g(new cdd1() { // from class: p.gyh1
                            public final Object c() {
                                byte b3 = b2;
                                c441 c441Var3 = c441Var2;
                                switch (b3) {
                                    case 0:
                                        c441Var3.getClass();
                                        int i2 = dkg.e;
                                        lag lagVar = new lag((byte) 4);
                                        lagVar.b = null;
                                        lagVar.c = new ArrayList();
                                        lagVar.d = null;
                                        lagVar.e = "";
                                        HashMap map = new HashMap();
                                        SQLiteDatabase sQLiteDatabaseA = c441Var3.a();
                                        sQLiteDatabaseA.beginTransaction();
                                        try {
                                            dkg dkgVar = (dkg) c441.i(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new k65(c441Var3, map, lagVar, (byte) 23));
                                            sQLiteDatabaseA.setTransactionSuccessful();
                                            return dkgVar;
                                        } finally {
                                            sQLiteDatabaseA.endTransaction();
                                        }
                                    default:
                                        long jB = c441Var3.b.b() - c441Var3.d.d;
                                        SQLiteDatabase sQLiteDatabaseA2 = c441Var3.a();
                                        sQLiteDatabaseA2.beginTransaction();
                                        try {
                                            String[] strArr = {String.valueOf(jB)};
                                            Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                                            while (cursorRawQuery.moveToNext()) {
                                                try {
                                                    c441Var3.f(cursorRawQuery.getInt(0), cse0.c, cursorRawQuery.getString(1));
                                                } catch (Throwable th) {
                                                    cursorRawQuery.close();
                                                    throw th;
                                                }
                                            }
                                            cursorRawQuery.close();
                                            int iDelete = sQLiteDatabaseA2.delete("events", "timestamp_ms < ?", strArr);
                                            sQLiteDatabaseA2.setTransactionSuccessful();
                                            sQLiteDatabaseA2.endTransaction();
                                            return Integer.valueOf(iDelete);
                                        } catch (Throwable th2) {
                                            sQLiteDatabaseA2.endTransaction();
                                            throw th2;
                                        }
                                }
                            }
                        });
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) ywv0Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            c441Var.g(new o8d0(ywv0Var, s29Var, i, (byte) 6));
                        } else {
                            ywv0Var.f(s29Var, i);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        ((haa0) ywv0Var.d).s(s29Var, i + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }

    public /* synthetic */ q1i0(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = obj3;
    }
}
