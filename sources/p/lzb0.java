package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class lzb0 {
    public static final kzb0 Companion = new kzb0();
    public static final znb0[] c = {dm5.S(2, lx70.b1), null};
    public final List a;
    public final String b;

    public /* synthetic */ lzb0(String str, List list, int i) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, jzb0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzb0)) {
            return false;
        }
        lzb0 lzb0Var = (lzb0) obj;
        return u890.j(this.a, lzb0Var.a) && u890.j(this.b, lzb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
