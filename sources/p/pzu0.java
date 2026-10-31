package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pzu0 implements anc0 {
    public final /* synthetic */ qzu0 a;
    public final /* synthetic */ y131 b;

    public pzu0(qzu0 qzu0Var, y131 y131Var) {
        this.a = qzu0Var;
        this.b = y131Var;
    }

    @Override // p.anc0
    public final void a() {
        l0x0 l0x0Var = this.a.H0;
        if (l0x0Var != null) {
            xab1 xab1Var = (xab1) l0x0Var.b;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            ((nix0) l0x0Var.d).b();
        }
    }

    @Override // p.anc0
    public final void b() {
        l0x0 l0x0Var = this.a.H0;
        if (l0x0Var != null) {
            ((nix0) l0x0Var.d).a();
            xab1 xab1Var = (xab1) l0x0Var.b;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            fns fnsVar = igu.a;
            l0x0Var.b = fn31.T(smo1.e(b3s.c), (o8n) null, 0, new c3u0(l0x0Var, (lnm) null, (byte) 19), 3);
        }
    }

    @Override // p.anc0
    public final void n() {
        rwz0 rwz0Var = this.a.b;
        String str = this.b.b;
        xab1 xab1Var = rwz0Var.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        rwz0Var.d = fn31.T(smo1.e(rwz0Var.c), (o8n) null, 0, new elu0(rwz0Var, str, (lnm) null), 3);
    }
}
