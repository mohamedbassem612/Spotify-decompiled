package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class kb10 {
    public static final jb10 Companion = new jb10();
    public static final znb0[] e = {null, dm5.S(2, ny00.i), null, null};
    public final String a;
    public final List b;
    public final int c;
    public final int d;

    public /* synthetic */ kb10(int i, int i2, int i3, String str, List list) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, ib10.a.getDescriptor());
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
        if (!(obj instanceof kb10)) {
            return false;
        }
        kb10 kb10Var = (kb10) obj;
        return u890.j(this.a, kb10Var.a) && u890.j(this.b, kb10Var.b) && this.c == kb10Var.c && this.d == kb10Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
