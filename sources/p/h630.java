package p;

import android.app.Activity;
import android.view.View;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h630 implements ci90 {
    public final Activity a;
    public final tc31 b;
    public final w430 c;
    public final iac0 d;
    public final kt91 e;
    public final xmu0 f;
    public final tdl0 g;

    public h630(Activity activity, tc31 tc31Var, w430 w430Var, e630 e630Var, iac0 iac0Var, kt91 kt91Var, xmu0 xmu0Var, tdl0 tdl0Var) {
        this.a = activity;
        this.b = tc31Var;
        this.c = w430Var;
        this.d = iac0Var;
        this.e = kt91Var;
        this.f = xmu0Var;
        this.g = tdl0Var;
    }

    public final String a() {
        return "playlist_collaboration_follow_user";
    }

    public final b0o1 b() {
        return new ygm(2);
    }

    public final void c(vpu0 vpu0Var, tv80 tv80Var) {
        List list = vpu0Var.b.f;
        if (list.isEmpty()) {
            hhg1.n("Missing member in members list.");
        } else {
            fn31.T(cto1.q(this.d), (o8n) null, 0, new hl0(this, vpu0Var, ((fji0) list.get(0)).e == cji0.c, (lnm) null, (byte) 10), 3);
        }
    }

    public final hhm d(vpu0 vpu0Var) {
        List list = vpu0Var.b.f;
        if (list.isEmpty()) {
            hhg1.n("Missing member in members list.");
            return null;
        }
        int iOrdinal = ((fji0) list.get(0)).e.ordinal();
        if (iOrdinal == 1) {
            return hhm.a;
        }
        if (iOrdinal == 2) {
            return hhm.b;
        }
        hhg1.n("Neither followable or unfollowable");
        return null;
    }

    public final ghm e(vpu0 vpu0Var) {
        List list = vpu0Var.b.f;
        if (list.isEmpty()) {
            hhg1.n("Missing member in members list.");
            return null;
        }
        fji0 fji0Var = (fji0) list.get(0);
        boolean z = fji0Var.e == cji0.c;
        String str = fji0Var.a.a;
        aol0 aol0Var = new aol0(new qgl0(new qgl0(Integer.valueOf(vpu0Var.a), str, this.g), (short) 0));
        return new ghm(new gi00(aol0Var, (byte) 27), new c30(z, aol0Var, str, (byte) 15));
    }

    public final int f(vpu0 vpu0Var) {
        List list = vpu0Var.b.f;
        if (list.isEmpty()) {
            hhg1.n("Missing member in members list.");
            return 0;
        }
        int iOrdinal = ((fji0) list.get(0)).e.ordinal();
        if (iOrdinal == 1) {
            return 2131960095;
        }
        if (iOrdinal == 2) {
            return 2131960102;
        }
        hhg1.n("Neither followable or unfollowable");
        return 0;
    }

    public final hux g(vpu0 vpu0Var) {
        List list = vpu0Var.b.f;
        if (list.isEmpty()) {
            hhg1.n("Missing member in members list.");
            return null;
        }
        int iOrdinal = ((fji0) list.get(0)).e.ordinal();
        if (iOrdinal == 1) {
            return hnx.c;
        }
        if (iOrdinal == 2) {
            return hnx.c;
        }
        hhg1.n("Neither followable or unfollowable");
        return null;
    }

    public final boolean h(vpu0 vpu0Var) {
        List list = vpu0Var.b.f;
        if (!list.isEmpty()) {
            return ((fji0) list.get(0)).e != cji0.a;
        }
        hhg1.n("Missing member in members list.");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object i(vpu0 vpu0Var, boolean z, onm onmVar) {
        f630 f630Var;
        if (onmVar instanceof f630) {
            f630Var = (f630) onmVar;
            int i = f630Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f630Var.c = i - Integer.MIN_VALUE;
            } else {
                f630Var = new f630(this, onmVar);
            }
        } else {
            f630Var = new f630(this, onmVar);
        }
        f630 f630Var2 = f630Var;
        Object objB = f630Var2.a;
        int i2 = f630Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                List list = vpu0Var.b.f;
                if (list.isEmpty()) {
                    hhg1.n("Missing member in members list.");
                    return null;
                }
                x4i1 x4i1Var = ((fji0) list.get(0)).a;
                String str = vpu0Var.b.a;
                g630 g630Var = new g630(this, x4i1Var, z, str, null);
                int i3 = z ? 2131960125 : 2131960130;
                tc31 tc31Var = this.b;
                gh1 gh1Var = new gh1(z, this, str, x4i1Var, (byte) 12);
                f630Var2.c = 1;
                objB = tc31Var.b(i3, g630Var, gh1Var, n521.R0, f630Var2);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return rih1.a;
    }

    public final void j(x4i1 x4i1Var, boolean z) {
        this.e.k(new er91((fs91) null, this.a.getString(z ? 2131960122 : 2131960120, x4i1Var.h), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }
}
