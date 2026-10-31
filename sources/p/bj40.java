package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class bj40 {
    public static final aj40 Companion = new aj40();
    public static final znb0[] b = {dm5.S(2, bc30.S0)};
    public final List a;

    public /* synthetic */ bj40(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, zi40.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj40) && u890.j(this.a, ((bj40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public bj40() {
        this.a = z6x.a;
    }
}
