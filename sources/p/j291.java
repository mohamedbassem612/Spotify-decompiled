package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class j291 {
    public static final i291 Companion = new i291();
    public static final znb0[] d = {null, null, dm5.S(2, gr81.g)};
    public final String a;
    public final int b;
    public final List c;

    public /* synthetic */ j291(String str, int i, int i2, List list) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, h291.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j291)) {
            return false;
        }
        j291 j291Var = (j291) obj;
        return u890.j(this.a, j291Var.a) && this.b == j291Var.b && u890.j(this.c, j291Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
