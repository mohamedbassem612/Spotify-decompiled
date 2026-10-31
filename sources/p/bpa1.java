package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class bpa1 {
    public static final apa1 Companion = new apa1();
    public static final znb0[] h = {null, null, null, null, dm5.S(2, gr81.c1), null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final int g;

    public /* synthetic */ bpa1(int i, int i2, int i3, String str, String str2, String str3, String str4, List list) {
        if (127 != (i & 127)) {
            o6p1.t(i, 127, zoa1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpa1)) {
            return false;
        }
        bpa1 bpa1Var = (bpa1) obj;
        return u890.j(this.a, bpa1Var.a) && u890.j(this.b, bpa1Var.b) && u890.j(this.c, bpa1Var.c) && u890.j(this.d, bpa1Var.d) && u890.j(this.e, bpa1Var.e) && this.f == bpa1Var.f && this.g == bpa1Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + kaa0.f(this.f, f4i1.b(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }
}
