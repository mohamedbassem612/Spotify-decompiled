package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ru21 {
    public static final qu21 Companion = new qu21();
    public static final znb0[] b = {dm5.S(2, n521.Z)};
    public final List a;

    public /* synthetic */ ru21(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, pu21.a.getDescriptor());
            throw null;
        }
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru21) && u890.j(this.a, ((ru21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
