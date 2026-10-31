package p;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lsw0 {
    public final Context b;
    public final btk c;
    public final dwl1 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    static {
        qs10.c("Processor");
    }

    public lsw0(Context context, btk btkVar, dwl1 dwl1Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = btkVar;
        this.d = dwl1Var;
        this.e = workDatabase;
    }

    public static boolean d(sxl1 sxl1Var, int i) {
        if (sxl1Var == null) {
            qs10.a().getClass();
            return false;
        }
        sxl1Var.k.R(new WorkerStoppedException(i));
        qs10.a().getClass();
        return true;
    }

    public final void a(em00 em00Var) {
        synchronized (this.k) {
            this.j.add(em00Var);
        }
    }

    public final sxl1 b(String str) {
        sxl1 sxl1Var = (sxl1) this.f.remove(str);
        boolean z = sxl1Var != null;
        if (!z) {
            sxl1Var = (sxl1) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        try {
                            this.b.startService(udd1.d(this.b));
                        } catch (Throwable unused) {
                            qs10.a().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sxl1Var;
    }

    public final sxl1 c(String str) {
        sxl1 sxl1Var = (sxl1) this.f.get(str);
        return sxl1Var == null ? (sxl1) this.g.get(str) : sxl1Var;
    }
}
