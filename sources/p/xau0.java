package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class xau0 {
    public static final wau0 Companion = new wau0();
    public static final znb0[] c = {null, dm5.S(2, tnt0.Y)};
    public final String a;
    public final Map b;

    public /* synthetic */ xau0(String str, int i, Map map) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, vau0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xau0)) {
            return false;
        }
        xau0 xau0Var = (xau0) obj;
        return u890.j(this.a, xau0Var.a) && u890.j(this.b, xau0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public xau0(String str, xkg0 xkg0Var) {
        this.a = str;
        this.b = xkg0Var;
    }
}
