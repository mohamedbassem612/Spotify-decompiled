package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n6v extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ tob1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6v(jkr0 jkr0Var, boolean z, boolean z2, drr0 drr0Var, drr0 drr0Var2) {
        super(0);
        this.d = jkr0Var;
        this.b = z;
        this.c = z2;
        this.e = drr0Var;
        this.f = drr0Var2;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.d;
        drr0 drr0Var = this.f;
        drr0 drr0Var2 = this.e;
        switch (b) {
            case 0:
                jkr0 jkr0Var = (jkr0) obj;
                int iL = jkr0Var.l();
                kl1 kl1Var = jkr0Var.d;
                return wm5.f(new m6v(this.b, iL > 0 && ((err0) kl1Var.c).s() == jkr0Var.l() - 1, this.c, jkr0Var.l() > 0 && ((err0) kl1Var.c).s() == 0, drr0Var2, drr0Var));
            default:
                boolean z = this.b;
                drr0Var2.setValue(Boolean.valueOf(!z));
                boolean z2 = ((Boolean) drr0Var2.getValue()).booleanValue() || ((Boolean) drr0Var.getValue()).booleanValue() || !this.c;
                if (z2 != z) {
                    ((iu30) obj).invoke(Boolean.valueOf(!z2));
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6v(boolean z, boolean z2, iu30 iu30Var, ven0 ven0Var, tob1 tob1Var) {
        super(0);
        this.b = z;
        this.c = z2;
        this.d = iu30Var;
        this.e = ven0Var;
        this.f = tob1Var;
    }
}
