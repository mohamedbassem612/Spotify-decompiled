package p;

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q64 {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final gzh0 b;
    public final Executor c;
    public final jlb d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public q64(Context context, gzh0 gzh0Var) {
        this.a = context.getApplicationContext();
        this.b = gzh0Var;
        Executor executorN = tx9.n();
        this.c = executorN;
        this.d = new jlb(this, (byte) 1);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        executorN.execute(new p64(this, (byte) 0));
    }

    public final /* synthetic */ void a() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        jlb jlbVar = this.d;
        Context context = this.a;
        if (i >= 33) {
            context.registerReceiver(jlbVar, intentFilter, 2);
        } else {
            x74.h0(context, jlbVar, intentFilter);
        }
        b();
    }

    public final void b() {
        AtomicBoolean atomicBoolean = this.e;
        boolean z = atomicBoolean.get();
        boolean z2 = false;
        try {
            Cursor cursorQuery = this.a.getContentResolver().query(g, new String[]{"CarConnectionState"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("CarConnectionState");
                    if (columnIndex != -1 && cursorQuery.moveToNext()) {
                        boolean z3 = cursorQuery.getInt(columnIndex) != 0;
                        cursorQuery.close();
                        z2 = z3;
                    } else {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
        }
        atomicBoolean.set(z2);
        if (z == z2 || this.f.get()) {
            return;
        }
        this.b.run();
    }
}
