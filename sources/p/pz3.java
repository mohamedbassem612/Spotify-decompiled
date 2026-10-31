package p;

import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class pz3 implements n4c, rz3, k2t {
    public final /* synthetic */ qz3 a;

    public void b(lly0 lly0Var) {
        qz3 qz3Var = this.a;
        Log.isLoggable("FirebaseCrashlytics", 3);
        oz3 oz3Var = (nz3) lly0Var.get();
        h9n h9nVar = new h9n(oz3Var, (byte) 1);
        oql oqlVar = new oql((byte) 9);
        oz3 oz3Var2 = oz3Var;
        i5x0 i5x0VarB = oz3Var2.b("clx", oqlVar);
        if (i5x0VarB == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            i5x0VarB = oz3Var2.b("crash", oqlVar);
        }
        if (i5x0VarB != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            n4b n4bVar = new n4b((byte) 1);
            ix7 ix7Var = new ix7(h9nVar);
            synchronized (qz3Var) {
                try {
                    Iterator it = qz3Var.c.iterator();
                    while (it.hasNext()) {
                        n4bVar.c((nhn) it.next());
                    }
                    oqlVar.c = n4bVar;
                    oqlVar.b = ix7Var;
                    qz3Var.b = n4bVar;
                    qz3Var.a = ix7Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void c(nhn nhnVar) {
        qz3 qz3Var = this.a;
        synchronized (qz3Var) {
            try {
                if (qz3Var.b instanceof h6u) {
                    qz3Var.c.add(nhnVar);
                }
                qz3Var.b.c(nhnVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Bundle bundle) {
        this.a.a.d(bundle);
    }
}
