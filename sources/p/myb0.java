package p;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class myb0 implements ci90 {
    public final Context a;
    public final lzn0 b;
    public final tc31 c;
    public final iac0 d;
    public final kt91 e;
    public final iyc0 f;
    public final xmu0 g;
    public final nw40 h;
    public final tdl0 i;

    public myb0(Context context, lzn0 lzn0Var, tc31 tc31Var, iac0 iac0Var, kt91 kt91Var, iyc0 iyc0Var, xmu0 xmu0Var, nw40 nw40Var, tdl0 tdl0Var) {
        this.a = context;
        this.b = lzn0Var;
        this.c = tc31Var;
        this.d = iac0Var;
        this.e = kt91Var;
        this.f = iyc0Var;
        this.g = xmu0Var;
        this.h = nw40Var;
        this.i = tdl0Var;
    }

    public final String a() {
        return "playlist_collaboration_leave_playlist";
    }

    public final b0o1 b() {
        return new ygm(3);
    }

    public final void c(vpu0 vpu0Var, tv80 tv80Var) {
        int i;
        Context context = this.a;
        String string = context.getString(2131960112);
        iqi0 iqi0Var = vpu0Var.b;
        if (iqi0Var.e == wls0.c) {
            i = 2131960107;
        } else {
            i = iqi0Var.d.b ? 2131960109 : 2131960108;
        }
        mw40 mw40VarT = yoi1.T(this.h.a, string, context.getString(i));
        String string2 = context.getString(2131960111);
        ln5 ln5Var = new ln5(this, vpu0Var, (byte) 14);
        mw40VarT.a = string2;
        mw40VarT.c = ln5Var;
        String string3 = context.getString(2131960110);
        oad oadVar = new oad(this, (byte) 17);
        mw40VarT.b = string3;
        mw40VarT.d = oadVar;
        mw40VarT.b().b();
    }

    public final hhm d(vpu0 vpu0Var) {
        return hhm.a;
    }

    public final ghm e(vpu0 vpu0Var) {
        return new ghm(new vq80(vpu0Var, this, (byte) 20), hyb0.c);
    }

    public final int f(vpu0 vpu0Var) {
        return 2131960096;
    }

    public final hux g(vpu0 vpu0Var) {
        return tkx.c;
    }

    public final boolean h(vpu0 vpu0Var) {
        String str = vpu0Var.c;
        iqi0 iqi0Var = vpu0Var.b;
        List list = iqi0Var.f;
        if (!list.isEmpty()) {
            return u890.j(str, ((fji0) list.get(0)).a.b) && iqi0Var.d.i;
        }
        hhg1.n("Missing member in members list.");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object i(vpu0 vpu0Var, onm onmVar) {
        kyb0 kyb0Var;
        if (onmVar instanceof kyb0) {
            kyb0Var = (kyb0) onmVar;
            int i = kyb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kyb0Var.c = i - Integer.MIN_VALUE;
            } else {
                kyb0Var = new kyb0(this, onmVar);
            }
        } else {
            kyb0Var = new kyb0(this, onmVar);
        }
        kyb0 kyb0Var2 = kyb0Var;
        Object objB = kyb0Var2.a;
        int i2 = kyb0Var2.c;
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
                lyb0 lyb0Var = new lyb0(this, vpu0Var, x4i1Var, str, null);
                tc31 tc31Var = this.c;
                lb50 lb50Var = new lb50(this, x4i1Var, str, (byte) 15);
                kyb0Var2.c = 1;
                objB = tc31Var.b(2131960126, lyb0Var, lb50Var, n521.R0, kyb0Var2);
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
}
