package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class gm5 {
    public static ScheduledFuture c;
    public static volatile x6o0 a = new x6o0();
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public static final em5 d = new em5((byte) 0);

    public static final md50 a(zd zdVar, ef61 ef61Var, boolean z, sw9 sw9Var) {
        if (!dhn.a.contains(gm5.class)) {
            try {
                String str = zdVar.a;
                c120 c120VarK = g120.k(str, false);
                String str2 = md50.j;
                md50 md50VarR = cwl1.R(null, String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1)), null, null);
                md50VarR.i = true;
                Bundle bundle = md50VarR.d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String str3 = zdVar.b;
                if (str3 == null) {
                    Date date = xd.Y;
                    xd xdVarS = fuo1.s();
                    str3 = xdVarS != null ? xdVarS.e : null;
                }
                if (str3 != null) {
                    bundle.putString("access_token", str3);
                }
                mod.o();
                String strI = wbx0.i();
                if (strI != null) {
                    bundle.putString("install_referrer", strI);
                }
                md50VarR.d = bundle;
                int iD = ef61Var.d(md50VarR, wf10.a(), c120VarK != null ? c120VarK.a : false, z);
                if (iD != 0) {
                    sw9Var.I(sw9Var.z() + iD);
                    md50VarR.i(new je(zdVar, md50VarR, ef61Var, sw9Var));
                    return md50VarR;
                }
            } catch (Throwable th) {
                dhn.a(gm5.class, th);
                return null;
            }
        }
        return null;
    }

    public static final ArrayList b(x6o0 x6o0Var, sw9 sw9Var) {
        if (dhn.a.contains(gm5.class)) {
            return null;
        }
        try {
            Context contextA = wf10.a();
            w0h1.H();
            boolean z = contextA.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
            ArrayList arrayList = new ArrayList();
            for (zd zdVar : x6o0Var.o()) {
                ef61 ef61VarG = x6o0Var.g(zdVar);
                if (ef61VarG == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                md50 md50VarA = a(zdVar, ef61VarG, z, sw9Var);
                if (md50VarA != null) {
                    arrayList.add(md50VarA);
                    if (lm5.l()) {
                        qm5.b(md50VarA);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            dhn.a(gm5.class, th);
            return null;
        }
    }

    public static final void c(int i) {
        if (dhn.a.contains(gm5.class)) {
            return;
        }
        try {
            b.execute(new fm5(i));
        } catch (Throwable th) {
            dhn.a(gm5.class, th);
        }
    }

    public static final void d(int i) {
        if (dhn.a.contains(gm5.class)) {
            return;
        }
        try {
            a.b(dm5.Y());
            try {
                sw9 sw9VarF = f(i, a);
                if (sw9VarF != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", sw9VarF.z());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", sw9VarF.A());
                    zce0.a(wf10.a()).c(intent);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            dhn.a(gm5.class, th);
        }
    }

    public static final void e(zd zdVar, pd50 pd50Var, ef61 ef61Var, sw9 sw9Var) {
        sw20 sw20Var;
        sw20 sw20Var2 = sw20.c;
        if (dhn.a.contains(gm5.class)) {
            return;
        }
        try {
            lf10 lf10Var = pd50Var.c;
            sw20 sw20Var3 = sw20.a;
            if (lf10Var == null) {
                sw20Var = sw20Var3;
            } else if (lf10Var.b == -1) {
                sw20Var = sw20Var2;
            } else {
                String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{pd50Var.toString(), lf10Var.toString()}, 2));
                sw20Var = sw20.b;
            }
            synchronized (wf10.b) {
            }
            ef61Var.b(lf10Var != null);
            if (sw20Var == sw20Var2) {
                wf10.c().execute(new ny2(zdVar, ef61Var, (byte) 7));
            }
            if (sw20Var == sw20Var3 || sw9Var.A() == sw20Var2) {
                return;
            }
            sw9Var.J(sw20Var);
        } catch (Throwable th) {
            dhn.a(gm5.class, th);
        }
    }

    public static final sw9 f(int i, x6o0 x6o0Var) {
        if (!dhn.a.contains(gm5.class)) {
            try {
                sw9 sw9Var = new sw9((byte) 8);
                ArrayList arrayListB = b(x6o0Var, sw9Var);
                if (!arrayListB.isEmpty()) {
                    fza fzaVar = oue0.a;
                    zue0 zue0Var = zue0.c;
                    dv20.p(i);
                    fza.f(zue0Var);
                    Iterator it = arrayListB.iterator();
                    while (it.hasNext()) {
                        ((md50) it.next()).c();
                    }
                    return sw9Var;
                }
            } catch (Throwable th) {
                dhn.a(gm5.class, th);
                return null;
            }
        }
        return null;
    }
}
