package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class or9 {
    public final drr0 a = new drr0(0.0f);
    public float b;
    public xab1 c;
    public boolean d;

    public final void a(c9n c9nVar) {
        if (this.d || this.a.s() == 0.0f) {
            return;
        }
        n8b1 n8b1VarL0 = irn1.l0(0.0f, 0.0f, (Object) null, 7);
        vc7 vc7Var = vc7.c1;
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = fn31.T(c9nVar, (o8n) null, 0, new nr9(this, 0.0f, n8b1VarL0, 0.0f, vc7Var, (lnm) null), 3);
    }

    public final float b(float f) {
        if (this.d) {
            return 0.0f;
        }
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = null;
        drr0 drr0Var = this.a;
        float fS = drr0Var.s();
        float fS2 = drr0Var.s() + f;
        drr0Var.t(fS2 >= 0.0f ? fS2 : 0.0f);
        return drr0Var.s() - fS;
    }

    public final boolean c(float f, c9n c9nVar, float f2, Function0 function0) {
        if (this.d) {
            return false;
        }
        drr0 drr0Var = this.a;
        if (drr0Var.s() <= f) {
            a(c9nVar);
            return false;
        }
        this.d = true;
        if (this.b <= drr0Var.s()) {
            function0.invoke();
            return true;
        }
        float f3 = this.b;
        n8b1 n8b1VarL0 = irn1.l0(0.0f, 400.0f, (Object) null, 5);
        float f4 = f2 < 0.0f ? 0.0f : f2;
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = fn31.T(c9nVar, (o8n) null, 0, new nr9(this, f3, n8b1VarL0, f4, function0, (lnm) null), 3);
        return true;
    }
}
