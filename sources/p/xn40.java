package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class xn40 extends zn40 {
    public static final wn40 Companion = new wn40();
    public static final znb0[] f = {null, null, null, dm5.S(2, bc30.V0)};
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ xn40(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, vn40.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn40)) {
            return false;
        }
        xn40 xn40Var = (xn40) obj;
        return u890.j(this.b, xn40Var.b) && u890.j(this.c, xn40Var.c) && u890.j(this.d, xn40Var.d) && u890.j(this.e, xn40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }
}
