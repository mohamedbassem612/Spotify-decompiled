package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nub1 {
    public final String a;
    public final String b;
    public final oub1 c;

    public nub1(String str, String str2, oub1 oub1Var) {
        this.a = str;
        this.b = str2;
        this.c = oub1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nub1)) {
            return false;
        }
        nub1 nub1Var = (nub1) obj;
        return this.a.equals(nub1Var.a) && this.b.equals(nub1Var.b) && this.c.equals(nub1Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
