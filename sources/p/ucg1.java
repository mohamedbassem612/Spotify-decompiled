package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ucg1 {
    public static final ncg1 Companion = new ncg1();
    public static final znb0[] b = {dm5.S(2, q9f1.T0)};
    public final List a;

    public /* synthetic */ ucg1(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, mcg1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucg1) && u890.j(this.a, ((ucg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
