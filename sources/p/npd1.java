package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class npd1 implements jn60 {
    public final String a;
    public final String b;
    public final yz21 c;
    public final opd1 d;

    public npd1(String str, String str2, yz21 yz21Var, opd1 opd1Var) {
        this.a = str;
        this.b = str2;
        this.c = yz21Var;
        this.d = opd1Var;
    }

    public final List d(op80 op80Var) {
        opd1 opd1Var = this.d;
        return Collections.singletonList(new jpd1(new lpd1(opd1Var.a, opd1Var.b, opd1Var.c, opd1Var.d), this.a, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npd1)) {
            return false;
        }
        npd1 npd1Var = (npd1) obj;
        return this.a.equals(npd1Var.a) && this.b.equals(npd1Var.b) && this.c.equals(npd1Var.c) && this.d.equals(npd1Var.d);
    }

    public final yz21 f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31);
    }
}
