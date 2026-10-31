package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class btj1 {
    public final int a;
    public final boolean b;
    public final List c;
    public final String d;
    public final y2u0 e;

    public btj1(int i, boolean z, List list, String str, y2u0 y2u0Var) {
        this.a = i;
        this.b = z;
        this.c = list;
        this.d = str;
        this.e = y2u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btj1)) {
            return false;
        }
        btj1 btj1Var = (btj1) obj;
        return this.a == btj1Var.a && this.b == btj1Var.b && this.c.equals(btj1Var.c) && this.d.equals(btj1Var.d) && u890.j(this.e, btj1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(f4i1.b(xcg1.g(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
