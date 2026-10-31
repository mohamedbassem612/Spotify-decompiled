package p;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gc21 implements ci90 {
    public final Context a;
    public final iac0 b;
    public final tc31 c;
    public final kt91 d;
    public final xmu0 e;
    public final iyc0 f;
    public final tdl0 g;

    public gc21(Context context, iac0 iac0Var, tc31 tc31Var, kt91 kt91Var, xmu0 xmu0Var, iyc0 iyc0Var, tdl0 tdl0Var) {
        this.a = context;
        this.b = iac0Var;
        this.c = tc31Var;
        this.d = kt91Var;
        this.e = xmu0Var;
        this.f = iyc0Var;
        this.g = tdl0Var;
    }

    @Override // p.ci90
    public final String a() {
        return "playlist_collaboration_remove_user";
    }

    @Override // p.ci90
    public final b0o1 b() {
        return new ygm(3);
    }

    @Override // p.ci90
    public final void c(vpu0 vpu0Var, tv80 tv80Var) {
        c921.y(cto1.q(this.b), (o8n) null, 0, new d821(this, vpu0Var, (lnm) null, (byte) 5), 3);
    }

    @Override // p.ci90
    public final ghm e(vpu0 vpu0Var) {
        String str = gm50.t(vpu0Var).a().a;
        return new ghm(new v721(this, vpu0Var, str, (byte) 6), new ec21(vpu0Var.b.a, str, (byte) 0));
    }

    @Override // p.ci90
    public final int f(vpu0 vpu0Var) {
        return 2131960099;
    }

    @Override // p.ci90
    public final hux g(vpu0 vpu0Var) {
        return tkx.c;
    }

    @Override // p.ci90
    public final boolean h(vpu0 vpu0Var) {
        return gm50.x(vpu0Var) && vpu0Var.b.d.t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(vpu0 vpu0Var, onm onmVar) {
        fc21 fc21Var;
        if (onmVar instanceof fc21) {
            fc21Var = (fc21) onmVar;
            int i = fc21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fc21Var.c = i - Integer.MIN_VALUE;
            } else {
                fc21Var = new fc21(this, onmVar);
            }
        } else {
            fc21Var = new fc21(this, onmVar);
        }
        Object objA = fc21Var.a;
        int i2 = fc21Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                x4i1 x4i1VarA = gm50.t(vpu0Var).a();
                String str = vpu0Var.b.a;
                uie uieVar = new uie(this, x4i1VarA, vpu0Var, str, (lnm) null);
                tc31 tc31Var = this.c;
                v721 v721Var = new v721(this, str, x4i1VarA, (byte) 7);
                fc21Var.c = 1;
                objA = tc31Var.a(uieVar, v721Var, fc21Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return rih1.a;
    }

    public final void j(x4i1 x4i1Var, String str) {
        this.d.k(k4k.q(this.a.getString(2131960124, x4i1Var.h, str)).c());
    }
}
