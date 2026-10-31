package p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mf60 implements yue1 {
    public final d761 a;
    public final List b;
    public final smc0 c;

    public mf60(d761 d761Var, smc0 smc0Var, smc0 smc0Var2) {
        this.a = d761Var;
        this.b = smc0Var;
        this.c = smc0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf60)) {
            return false;
        }
        mf60 mf60Var = (mf60) obj;
        return this.a.equals(mf60Var.a) && this.b.equals(mf60Var.b) && this.c.equals(mf60Var.c);
    }

    public final String getId() {
        return "highlights-shelf";
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(Arrays.hashCode(this.a.a) * 31, 31, this.b);
    }
}
