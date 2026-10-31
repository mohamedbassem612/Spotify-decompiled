package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class vh40 {
    public static final uh40 Companion = new uh40();
    public static final znb0[] e = {null, dm5.S(2, bc30.Q0), null, null};
    public final String a;
    public final List b;
    public final int c;
    public final int d;

    public /* synthetic */ vh40(int i, int i2, int i3, String str, List list) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, th40.a.getDescriptor());
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
        if (!(obj instanceof vh40)) {
            return false;
        }
        vh40 vh40Var = (vh40) obj;
        return u890.j(this.a, vh40Var.a) && u890.j(this.b, vh40Var.b) && this.c == vh40Var.c && this.d == vh40Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
