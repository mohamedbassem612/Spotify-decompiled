package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class awq {
    public static final zvq Companion = new zvq();
    public static final znb0[] b = {dm5.S(2, lmm.d1)};
    public final List a;

    public /* synthetic */ awq(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, yvq.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awq) && u890.j(this.a, ((awq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
