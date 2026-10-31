package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class r2d1 {
    public static final p2d1 Companion = new p2d1();
    public static final znb0[] c = {null, dm5.S(2, orc1.g)};
    public final String a;
    public final List b;

    public /* synthetic */ r2d1(String str, List list, int i) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, o2d1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = z6x.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2d1)) {
            return false;
        }
        r2d1 r2d1Var = (r2d1) obj;
        return u890.j(this.a, r2d1Var.a) && u890.j(this.b, r2d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
