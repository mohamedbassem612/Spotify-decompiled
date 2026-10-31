package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class v411 {
    public static final u411 Companion = new u411();
    public static final znb0[] b = {dm5.S(2, ijz0.U0)};
    public final List a;

    public /* synthetic */ v411(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, t411.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v411) && u890.j(this.a, ((v411) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
