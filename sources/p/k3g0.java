package p;

import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k3g0 implements ci90 {
    public final Context a;
    public final tc31 b;
    public final iac0 c;
    public final kt91 d;
    public final xmu0 e;
    public final iyc0 f;
    public final tdl0 g;

    public k3g0(Context context, khc khcVar, tc31 tc31Var, iac0 iac0Var, kt91 kt91Var, xmu0 xmu0Var, iyc0 iyc0Var, tdl0 tdl0Var) {
        this.a = context;
        this.b = tc31Var;
        this.c = iac0Var;
        this.d = kt91Var;
        this.e = xmu0Var;
        this.f = iyc0Var;
        this.g = tdl0Var;
    }

    public static boolean i(vpu0 vpu0Var) {
        iqi0 iqi0Var = vpu0Var.b;
        List list = iqi0Var.d.h.b;
        wls0 wls0Var = wls0.f;
        if (list.contains(wls0Var)) {
            List list2 = iqi0Var.f;
            if (list2.isEmpty()) {
                hhg1.n("Missing member in members list.");
            } else if (((fji0) list2.get(0)).f != wls0Var) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(vpu0 vpu0Var) {
        iqi0 iqi0Var = vpu0Var.b;
        if (iqi0Var.d.h.b.contains(wls0.d)) {
            List list = iqi0Var.f;
            if (list.isEmpty()) {
                hhg1.n("Missing member in members list.");
            } else if (((fji0) list.get(0)).f == wls0.f) {
                return true;
            }
        }
        return false;
    }

    public final String a() {
        return "playlist_collaboration_make_collaborator";
    }

    public final b0o1 b() {
        return new ygm(2);
    }

    public final void c(vpu0 vpu0Var, tv80 tv80Var) {
        List list = vpu0Var.b.f;
        if (list.isEmpty()) {
            hhg1.n("Missing member in members list.");
        } else {
            fn31.T(cto1.q(this.c), (o8n) null, 0, new hl0(this, vpu0Var, ((fji0) list.get(0)).f == wls0.f, (lnm) null, (byte) 14), 3);
        }
    }

    public final ghm e(vpu0 vpu0Var) {
        iqi0 iqi0Var = vpu0Var.b;
        List list = iqi0Var.f;
        if (list.isEmpty()) {
            hhg1.n("Missing member in members list.");
            return null;
        }
        fji0 fji0Var = (fji0) list.get(0);
        String str = fji0Var.a.a;
        return new ghm(new gnf0(this, vpu0Var, str, (byte) 3), new h3g0(fji0Var.f == wls0.f, iqi0Var.a, str));
    }

    public final int f(vpu0 vpu0Var) {
        if (i(vpu0Var)) {
            return 2131960097;
        }
        if (j(vpu0Var)) {
            return 2131960098;
        }
        hhg1.n("Neither possible to make contributor or remove contributor");
        return 0;
    }

    public final hux g(vpu0 vpu0Var) {
        return ujx.c;
    }

    public final boolean h(vpu0 vpu0Var) {
        if (gm50.x(vpu0Var)) {
            return i(vpu0Var) || j(vpu0Var);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object k(vpu0 vpu0Var, boolean z, onm onmVar) {
        i3g0 i3g0Var;
        if (onmVar instanceof i3g0) {
            i3g0Var = (i3g0) onmVar;
            int i = i3g0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i3g0Var.c = i - Integer.MIN_VALUE;
            } else {
                i3g0Var = new i3g0(this, onmVar);
            }
        } else {
            i3g0Var = new i3g0(this, onmVar);
        }
        i3g0 i3g0Var2 = i3g0Var;
        Object objB = i3g0Var2.a;
        int i2 = i3g0Var2.c;
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
                j3g0 j3g0Var = new j3g0(this, x4i1Var, vpu0Var, z, str, z ? wls0.f : wls0.d, null);
                int i3 = z ? 2131960127 : 2131960128;
                tc31 tc31Var = this.b;
                gh1 gh1Var = new gh1(z, this, str, x4i1Var, (byte) 18);
                i3g0Var2.c = 1;
                objB = tc31Var.b(i3, j3g0Var, gh1Var, n521.R0, i3g0Var2);
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

    public final void l(String str, x4i1 x4i1Var, boolean z) {
        this.d.k(new er91((fs91) null, this.a.getString(z ? 2131960121 : 2131960119, x4i1Var.h, str), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }
}
