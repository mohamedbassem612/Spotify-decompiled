package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v6c0 implements t6c0 {
    public final vwm1 a;
    public final ljg b;
    public final h95 c;
    public final u9c0 d;
    public final q8n e;
    public final q5t f;
    public xab1 g;

    public v6c0(vwm1 vwm1Var, ljg ljgVar, q2g0 q2g0Var, h95 h95Var, u9c0 u9c0Var, q8n q8nVar) {
        this.a = vwm1Var;
        this.b = ljgVar;
        this.c = h95Var;
        this.d = u9c0Var;
        this.e = q8nVar;
        this.f = q2g0Var.b.b0(bn70.class);
    }

    public final void a() {
        Set set = q6r0.a;
        bn70 bn70VarA = this.f.a();
        if (o7h.i0(set, bn70VarA != null ? bn70VarA.a : null)) {
            return;
        }
        fn31.T(this.d, (o8n) null, 0, new u6c0(this, null), 3);
    }
}
