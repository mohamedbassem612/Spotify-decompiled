package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class zm40 {
    public static final ym40 Companion = new ym40();
    public static final znb0[] b = {dm5.S(2, bc30.U0)};
    public final List a;

    public /* synthetic */ zm40(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, xm40.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm40) && u890.j(this.a, ((zm40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
