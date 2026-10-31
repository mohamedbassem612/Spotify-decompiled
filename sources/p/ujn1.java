package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ujn1 {
    public transient ucn1 a;
    public transient q7 b;

    public final Map a() {
        q7 q7Var = this.b;
        if (q7Var != null) {
            return q7Var;
        }
        mkn1 mkn1Var = (mkn1) this;
        q7 q7Var2 = new q7(mkn1Var, mkn1Var.c, (byte) 1);
        this.b = q7Var2;
        return q7Var2;
    }

    public final Set b() {
        ucn1 ucn1Var = this.a;
        if (ucn1Var != null) {
            return ucn1Var;
        }
        mkn1 mkn1Var = (mkn1) this;
        ucn1 ucn1Var2 = new ucn1(mkn1Var, mkn1Var.c);
        this.a = ucn1Var2;
        return ucn1Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujn1) {
            return a().equals(((ujn1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((q7) a()).b.hashCode();
    }

    public final String toString() {
        return ((q7) a()).b.toString();
    }
}
