package p;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vh7 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xh7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh7(Context context, xh7 xh7Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = context;
        this.c = xh7Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        xh7 xh7Var = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                return new vh7(xh7Var, context, lnmVar);
            default:
                return new vh7(context, xh7Var, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        String m231Var;
        Object value;
        p1s0 p1s0Var;
        boolean z;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                zhq0 zhq0Var = this.c.c;
                try {
                    m231Var = this.b.getSharedPreferences("spotify_preferences", 0).getString("crashlytics_partner_id", null);
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                String str = m231Var instanceof m231 ? null : m231Var;
                if (str != null && str.length() != 0) {
                    bpb1 bpb1Var = (bpb1) zhq0Var.b;
                    do {
                        value = bpb1Var.getValue();
                        p1s0Var = (s1s0) value;
                        if (u890.j(p1s0Var, q1s0.a)) {
                            p1s0Var = new p1s0(str);
                        }
                    } while (!bpb1Var.k(value, p1s0Var));
                }
                return rih1.a;
            default:
                hm5.M(obj);
                Context context = this.b;
                synchronized (wi20.k) {
                    try {
                        if (wi20.l.containsKey("[DEFAULT]")) {
                            wi20.c();
                        } else {
                            pj20 pj20VarA = pj20.a(context);
                            if (pj20VarA != null) {
                                wi20.f(context, pj20VarA);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ken kenVar = ken.h;
                n5 n5Var = new n5(1, this.c, xh7.class, "reportStartupProgress", "reportStartupProgress(Lcom/spotify/crashreporting/crashcoldstartprogress/CrashColdStartupProgressTracker$Event;)V", 0, (byte) 18);
                synchronized (kenVar.c) {
                    if (kenVar.f == null) {
                        kenVar.f = n5Var;
                        if (kenVar.g || kenVar.d.isEmpty()) {
                            z = false;
                        } else {
                            kenVar.g = true;
                            z = true;
                        }
                        if (z) {
                            kenVar.b();
                        }
                    }
                }
                fn31.S(ov40.a, igu.a, 4, new wh7(this.c, (lnm) null, (byte) 0));
                Context context2 = this.b;
                xh7 xh7Var = xh7.d;
                lo9 lo9Var = new lo9();
                List listM = p7h.M(new xgn[]{new clb1(), new f2u(), new irw0(), new trw0((ActivityManager) context2.getSystemService(ActivityManager.class)), new hk20(), new trw0((PowerManager) context2.getSystemService(PowerManager.class)), new f2u((ActivityManager) context2.getSystemService(ActivityManager.class)), new isw0()});
                ArrayList<ugn> arrayList = new ArrayList();
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    r7h.W(((xgn) it.next()).a(), arrayList);
                }
                for (ugn ugnVar : arrayList) {
                    lo9Var.t(eqr0.u(ugnVar), eqr0.v(ugnVar));
                }
                FirebaseCrashlytics.getInstance().setCustomKeys(new dqo(lo9Var));
                this.c.a.m((Object) null, Boolean.TRUE);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh7(xh7 xh7Var, Context context, lnm lnmVar) {
        super(2, lnmVar);
        this.c = xh7Var;
        this.b = context;
    }
}
