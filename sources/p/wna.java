package p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wna implements cnh0 {
    public final /* synthetic */ ix7 a;

    public wna(ix7 ix7Var) {
        this.a = ix7Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.cnh0
    public final List a(l270 l270Var, qma qmaVar) throws NoWhenBranchMatchedException {
        qpt0 qpt0Var;
        bih1 bih1Var = new bih1(l270Var, qmaVar.b, (byte) 27);
        ix7 ix7Var = this.a;
        w3b1 w3b1VarC = ix7.c(ix7Var);
        int iOrdinal = qmaVar.B1.ordinal();
        if (iOrdinal == 0) {
            qpt0Var = qpt0.a;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            qpt0Var = qpt0.d;
        }
        yt91 yt91Var = new yt91(bih1Var, w3b1VarC, qpt0Var, (byte) 18);
        return p7h.M(new anh0[]{ix7.f(ix7Var).a(yt91Var, l270Var, qmaVar), ix7.b(ix7Var).a(yt91Var, qmaVar)});
    }
}
