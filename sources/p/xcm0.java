package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class xcm0 implements fdm0 {
    public static final wcm0 Companion = new wcm0();
    public static final znb0[] c = {null, dm5.S(2, z7i0.a1)};
    public final String a;
    public final List b;

    public /* synthetic */ xcm0(String str, List list, int i) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, vcm0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcm0)) {
            return false;
        }
        xcm0 xcm0Var = (xcm0) obj;
        return u890.j(this.a, xcm0Var.a) && u890.j(this.b, xcm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public xcm0(String str, List list) {
        this.a = str;
        this.b = list;
    }
}
