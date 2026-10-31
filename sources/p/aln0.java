package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aln0 implements jn60 {
    public final String a;
    public final yz21 b;
    public final cln0 c;

    public aln0(String str, yz21 yz21Var, cln0 cln0Var) {
        this.a = str;
        this.b = yz21Var;
        this.c = cln0Var;
    }

    public final List d(op80 op80Var) {
        cln0 cln0Var = this.c;
        return Collections.singletonList(new xkn0(new zkn0(cln0Var.a, cln0Var.b), this.a, op80Var));
    }

    public final yz21 f() {
        return this.b;
    }

    public final String getId() {
        return this.a;
    }
}
