package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class ms80 {
    public static final ls80 Companion = new ls80();
    public static final znb0[] b = {dm5.S(2, lx70.g)};
    public final List a;

    public /* synthetic */ ms80(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, ks80.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ms80) && u890.j(this.a, ((ms80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
