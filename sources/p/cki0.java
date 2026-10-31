package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cki0 implements Function0 {
    public final eki0 a;
    public final boolean b;
    public final ggy0 c;

    public cki0(eki0 eki0Var, boolean z, ggy0 ggy0Var) {
        this.a = eki0Var;
        this.b = z;
        this.c = ggy0Var;
    }

    public final Object invoke() {
        List listL1;
        eki0 eki0Var = this.a;
        byp bypVar = eki0Var.a;
        o5 o5VarA = eki0Var.a((n9r) bypVar.a);
        if (o5VarA != null) {
            ks6 ks6Var = (ks6) bypVar.b;
            boolean z = this.b;
            ggy0 ggy0Var = this.c;
            listL1 = z ? o7h.l1(((kf5) ks6Var.e).d(o5VarA, ggy0Var)) : o7h.l1(((kf5) ks6Var.e).c(o5VarA, ggy0Var));
        } else {
            listL1 = null;
        }
        return listL1 == null ? z6x.a : listL1;
    }
}
