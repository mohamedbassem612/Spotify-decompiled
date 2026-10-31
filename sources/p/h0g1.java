package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h0g1 {
    public static final String c;
    public static final String d;
    public final pnf1 a;
    public final b380 b;

    static {
        String str = zoi1.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public h0g1(pnf1 pnf1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= pnf1Var.a)) {
            tw20.p();
            throw null;
        }
        this.a = pnf1Var;
        this.b = b380.p(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0g1.class == obj.getClass()) {
            h0g1 h0g1Var = (h0g1) obj;
            if (this.a.equals(h0g1Var.a)) {
                b380 b380Var = h0g1Var.b;
                b380 b380Var2 = this.b;
                b380Var2.getClass();
                if (z1p1.j(b380Var2, b380Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
