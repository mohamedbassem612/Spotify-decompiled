package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class soa1 {
    public static final roa1 Companion = new roa1();
    public static final znb0[] e = {null, dm5.S(2, gr81.a1), null, null};
    public final String a;
    public final List b;
    public final int c;
    public final int d;

    public /* synthetic */ soa1(int i, int i2, int i3, String str, List list) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, qoa1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soa1)) {
            return false;
        }
        soa1 soa1Var = (soa1) obj;
        return u890.j(this.a, soa1Var.a) && u890.j(this.b, soa1Var.b) && this.c == soa1Var.c && this.d == soa1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
