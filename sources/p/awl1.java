package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class awl1 {
    public static awl1 k;
    public static awl1 l;
    public static final Object m;
    public final Context a;
    public final btk b;
    public final WorkDatabase c;
    public final dwl1 d;
    public final List e;
    public final lsw0 f;
    public final qkn0 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final z2g1 j;

    static {
        qs10.c("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public awl1(Context context, btk btkVar, dwl1 dwl1Var, WorkDatabase workDatabase, List list, lsw0 lsw0Var, z2g1 z2g1Var) {
        Context applicationContext = context.getApplicationContext();
        if (bs51.r(applicationContext)) {
            eg.m("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        qs10.b(new qs10(btkVar.g));
        this.a = applicationContext;
        this.d = dwl1Var;
        this.c = workDatabase;
        this.f = lsw0Var;
        this.j = z2g1Var;
        this.b = btkVar;
        this.e = list;
        llm llmVarE = smo1.e(dwl1Var.b);
        this.g = new qkn0(workDatabase, (byte) 27);
        qj5 qj5Var = dwl1Var.a;
        int i = om41.a;
        lsw0Var.a(new nm41(qj5Var, list, btkVar, workDatabase));
        dwl1Var.a(new lc30(applicationContext, this));
        int i2 = vhh1.a;
        if (jsw0.a(applicationContext)) {
            l4p1.u(llmVarE, f5p1.q(rqt0.u(o4p1.m(x4p1.r(zno1.h(workDatabase.A().a, false, new String[]{"workspec"}, new qti1((byte) 27)), new uhh1(4, null)))), new sn80(applicationContext, (lnm) null, (byte) 8)));
        }
    }

    public static awl1 d(Context context) {
        awl1 awl1VarD;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        awl1VarD = k;
                        if (awl1VarD == null) {
                            awl1VarD = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return awl1VarD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (awl1VarD == null) {
            m2b1 applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof ysk)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            f(applicationContext, ((ysk) applicationContext).b());
            awl1VarD = d(applicationContext);
        }
        return awl1VarD;
    }

    public static void f(Context context, btk btkVar) {
        synchronized (m) {
            try {
                awl1 awl1Var = k;
                if (awl1Var != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (awl1Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    awl1 awl1VarS = l;
                    if (awl1VarS == null) {
                        awl1VarS = cwl1.s(applicationContext, btkVar);
                        l = awl1VarS;
                    }
                    k = awl1VarS;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final w4b1 a(rwl1 rwl1Var) {
        List listX = k4p1.x(rwl1Var);
        if (!listX.isEmpty()) {
            return new nvl1(this, listX).a();
        }
        hhg1.n("enqueue needs at least one WorkRequest.");
        return null;
    }

    public final w4b1 b(String str, int i, vks0 vks0Var) {
        if (i == 3) {
            return ha71.q(this, str, vks0Var);
        }
        return new nvl1(this, str, i != 2 ? 1 : 2, Collections.singletonList(vks0Var), null).a();
    }

    public final w4b1 c(String str, int i, diq0 diq0Var) {
        return new nvl1(this, str, i, k4p1.x(diq0Var), null).a();
    }

    public final fai0 e(String str) {
        dxl1 dxl1VarA = this.c.A();
        ec90 ec90VarH = dxl1VarA.a.h();
        String[] strArr = {"WorkTag", "WorkProgress", "workspec", "workname"};
        axl1 axl1Var = new axl1(str, dxl1VarA, (byte) 1);
        ec90VarH.b.g(strArr);
        return g2p1.E(ec90VarH.g.p(strArr, axl1Var), vwl1.z, this.d);
    }

    public final void g() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
