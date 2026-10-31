package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class mfl {
    public static final lfl Companion = new lfl();
    public static final znb0[] b = {dm5.S(2, aok.i)};
    public final List a;

    public /* synthetic */ mfl(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, kfl.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfl) && u890.j(this.a, ((mfl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
