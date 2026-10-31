package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class tl51 {
    public static final sl51 Companion = new sl51();
    public static final znb0[] b = {dm5.S(2, oa41.U0)};
    public final List a;

    public /* synthetic */ tl51(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, rl51.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl51) && u890.j(this.a, ((tl51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
