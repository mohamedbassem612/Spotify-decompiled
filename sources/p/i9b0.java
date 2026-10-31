package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i9b0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w8b0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9b0(w8b0 w8b0Var, byte b) {
        super(2);
        this.a = b;
        this.b = w8b0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        w8b0 w8b0Var = this.b;
        switch (b) {
            case 0:
                esw eswVar = w8b0Var.a;
                return new kpg0(q1o1.u(eswVar.O.a(eswVar.Q, new ysr0(3), w8b0Var.b), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), h9b0.O0);
            case 1:
                return new kpg0(w8b0Var.a.c(w8b0Var.b), h9b0.Q0);
            case 2:
                return new kpg0(w8b0Var.a.e(w8b0Var.b), h9b0.S0);
            case 3:
                return new kpg0(w8b0Var.a.d(w8b0Var.b), h9b0.U0);
            case 4:
                esw eswVar2 = w8b0Var.a;
                return new kpg0(eswVar2.a0.a(eswVar2.b0.a(w8b0Var.b)), h9b0.W0);
            case 5:
                return new kpg0(q1o1.u((z331) w8b0Var.a.E.get(), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), h9b0.N0);
            case 6:
                return new kpg0(w8b0Var.a.a(w8b0Var.b), h9b0.Y0);
            case 7:
                return new kpg0(w8b0Var.a.b(w8b0Var.b), h9b0.a1);
            case 8:
                esw eswVar3 = w8b0Var.a;
                return new kpg0(eswVar3.d0.a(new ysr0(4), w8b0Var.b), h9b0.c1);
            case 9:
                esw eswVar4 = w8b0Var.a;
                return new kpg0(eswVar4.M.a(w8b0Var.b), h9b0.e1);
            case 10:
                esw eswVar5 = w8b0Var.a;
                return new kpg0(eswVar5.c0.a(w8b0Var.b), j9b0.c);
            case 11:
                esw eswVar6 = w8b0Var.a;
                return new kpg0(q1o1.u(eswVar6.F.a(w8b0Var.b), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), j9b0.f);
            case 12:
                esw eswVar7 = w8b0Var.a;
                return new kpg0(q1o1.u(eswVar7.N.a(w8b0Var.b), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), j9b0.i);
            default:
                esw eswVar8 = w8b0Var.a;
                return new kpg0(q1o1.u(eswVar8.O.a(eswVar8.Q, new ysr0(1), w8b0Var.b), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4), j9b0.X);
        }
    }
}
