package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w651 {
    public final y441 a;

    public w651(y441 y441Var) {
        this.a = y441Var;
    }

    public final void a(n6r0 n6r0Var, tv80 tv80Var) {
        n6r0 n6r0VarU4;
        lik1 lik1Var;
        y441 y441Var = this.a;
        cbr0 cbr0Var = (cbr0) y441Var.b;
        bn70 bn70VarA = cbr0Var.b0(bn70.class).a();
        if (bn70VarA == null || (n6r0VarU4 = bn70VarA.a) == null) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            n6r0VarU4 = yon1.U4();
        }
        if (!n6r0Var.equals(n6r0VarU4)) {
            if (tv80Var != null) {
                up41 up41Var = (up41) y441Var.c;
                lsn0 lsn0Var = new lsn0((String) null, tv80Var.a);
                mwn0 mwn0Var = (mwn0) up41Var.b;
                mwn0Var.e(lsn0Var);
                mwn0Var.f(lsn0Var);
            }
            t8h1 t8h1Var = (t8h1) y441Var.d;
            if (t8h1Var != null) {
                t8h1.n(t8h1Var, n6r0Var);
            }
        }
        bn70 bn70VarA2 = cbr0Var.b0(bn70.class).a();
        if (bn70VarA2 == null || (lik1Var = bn70VarA2.b) == null) {
            Parcelable.Creator creator = lik1.CREATOR;
            lik1Var = new lik1(((y651) y441Var.a).b);
        }
        cbr0Var.a(new bn70(n6r0Var, lik1Var, (nar0) null));
    }
}
