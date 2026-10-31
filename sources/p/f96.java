package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f96 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l96 b;
    public final /* synthetic */ z3i1 c;
    public final /* synthetic */ fa6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f96(l96 l96Var, z3i1 z3i1Var, fa6 fa6Var, byte b) {
        super(0);
        this.a = b;
        this.b = l96Var;
        this.c = z3i1Var;
        this.d = fa6Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        chr0 chr0Var = chr0.c;
        chr0 chr0Var2 = chr0.a;
        fa6 fa6Var = this.d;
        z3i1 z3i1Var = this.c;
        l96 l96Var = this.b;
        switch (b) {
            case 0:
                l96Var.e.a();
                chr0 chr0Var3 = fa6Var.c;
                if (chr0Var3 != chr0Var2 && chr0Var3 != chr0Var) {
                    z = false;
                }
                a4i1 a4i1Var = z3i1Var.a;
                if (!a4i1Var.c.a()) {
                    a4i1Var.a(z);
                } else {
                    z3i1Var.b.setValue(Boolean.TRUE);
                }
                break;
            default:
                l96Var.e.a();
                chr0 chr0Var4 = fa6Var.c;
                if (chr0Var4 != chr0Var2 && chr0Var4 != chr0Var) {
                    z = false;
                }
                a4i1 a4i1Var2 = z3i1Var.a;
                if (!a4i1Var2.c.a()) {
                    a4i1Var2.a(z);
                } else {
                    z3i1Var.b.setValue(Boolean.TRUE);
                }
                break;
        }
        return rih1Var;
    }
}
