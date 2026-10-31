package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class ord1 {
    public static final nrd1 Companion = new nrd1();
    public static final znb0[] b = {dm5.S(2, orc1.Z)};
    public final List a;

    public /* synthetic */ ord1(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, mrd1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ord1) && u890.j(this.a, ((ord1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ord1(List list) {
        this.a = list;
    }
}
