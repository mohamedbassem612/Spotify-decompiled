package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n171 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r171 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n171(r171 r171Var, byte b) {
        super(0);
        this.a = b;
        this.b = r171Var;
    }

    public final Object invoke() {
        byte b = this.a;
        r171 r171Var = this.b;
        switch (b) {
            case 0:
                return new vrl0(((uvk0) r171Var.s1.getValue()).b());
            case 1:
                kgq kgqVar = r171Var.a1;
                String str = r171Var.l1;
                kgqVar.getClass();
                return new fqm(str);
            case 2:
                return new uvk0(r171Var.l1);
            case 3:
                return r171Var.X0.a(r171Var.l1, r171Var.d1);
            case 4:
                r0s0 r0s0Var = r171Var.S0;
                kly0 kly0Var = r171Var.h1;
                kly0 kly0Var2 = r171Var.g1;
                String str2 = r171Var.l1;
                return new mqt0((add) r0s0Var.b, (kly0) r0s0Var.c, kly0Var, kly0Var2, (g8u0) r0s0Var.d, str2);
            default:
                qgq qgqVar = r171Var.Z0;
                d0r d0rVar = r171Var.i1;
                cbr0 cbr0Var = r171Var.j1;
                teq teqVar = qgqVar.a.c;
                return new skg1(d0rVar, (kkg1) teqVar.s6.get(), (cdk0) teqVar.a.S9.get(), cbr0Var);
        }
    }
}
