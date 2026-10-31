package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l9b0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d9b0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l9b0(d9b0 d9b0Var, byte b) {
        super(2);
        this.a = b;
        this.b = d9b0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        d9b0 d9b0Var = this.b;
        switch (b) {
            case 0:
                esw eswVar = d9b0Var.a;
                return new kpg0(eswVar.r.a(d9b0Var.b), j9b0.O0);
            case 1:
                esw eswVar2 = d9b0Var.a;
                return new kpg0(q1o1.u(eswVar2.e.a(d9b0Var.b), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), j9b0.Z);
            case 2:
                esw eswVar3 = d9b0Var.a;
                return new kpg0(q1o1.u(eswVar3.f3p.a(d9b0Var.b), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), j9b0.R0);
            case 3:
                esw eswVar4 = d9b0Var.a;
                fqg0 fqg0VarU = q1o1.u(eswVar4.D.a(d9b0Var.b), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
                return new kpg0(new mb51(svp0.a, rvp0.a, m9b0.a, n9b0.a, fqg0VarU), j9b0.T0);
            case 4:
                return new kpg0(q1o1.u((l9e0) d9b0Var.a.J.get(), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), j9b0.V0);
            default:
                esw eswVar5 = d9b0Var.a;
                return new kpg0(q1o1.u(eswVar5.o.a(d9b0Var.b), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), j9b0.X0);
        }
    }
}
