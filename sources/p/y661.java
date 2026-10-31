package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class y661 {
    public static final x661 Companion = new x661();
    public static final znb0[] b = {dm5.S(2, w661.b)};
    public final t9n[] a;

    public /* synthetic */ y661(int i, t9n[] t9nVarArr) {
        if (1 == (i & 1)) {
            this.a = t9nVarArr;
        } else {
            o6p1.t(i, 1, v661.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y661) && u890.j(this.a, ((y661) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public y661(t9n[] t9nVarArr) {
        this.a = t9nVarArr;
    }
}
