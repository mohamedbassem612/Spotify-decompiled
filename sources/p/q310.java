package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class q310 {
    public static final p310 Companion = new p310();
    public static final znb0[] b = {dm5.S(2, ny00.d)};
    public final List a;

    public /* synthetic */ q310(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, o310.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q310) && u890.j(this.a, ((q310) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
