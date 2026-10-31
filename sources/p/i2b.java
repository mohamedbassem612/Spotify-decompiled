package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class i2b {
    public static final h2b Companion = new h2b();
    public static final znb0[] b = {dm5.S(2, cu9.t)};
    public final List a;

    public /* synthetic */ i2b(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, g2b.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2b) && u890.j(this.a, ((i2b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
