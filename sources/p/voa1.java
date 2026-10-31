package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class voa1 {
    public static final uoa1 Companion = new uoa1();
    public static final znb0[] h = {null, null, null, null, dm5.S(2, gr81.b1), null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final int g;

    public /* synthetic */ voa1(int i, int i2, int i3, String str, String str2, String str3, String str4, List list) {
        if (127 != (i & 127)) {
            o6p1.t(i, 127, toa1.a.getDescriptor());
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
        if (!(obj instanceof voa1)) {
            return false;
        }
        voa1 voa1Var = (voa1) obj;
        return u890.j(this.a, voa1Var.a) && u890.j(this.b, voa1Var.b) && u890.j(this.c, voa1Var.c) && u890.j(this.d, voa1Var.d) && u890.j(this.e, voa1Var.e) && this.f == voa1Var.f && this.g == voa1Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + kaa0.f(this.f, f4i1.b(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }
}
