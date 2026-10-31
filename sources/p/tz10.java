package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class tz10 {
    public static final sz10 Companion = new sz10();
    public static final znb0[] b = {dm5.S(2, ny00.O0)};
    public final List a;

    public /* synthetic */ tz10(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, rz10.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz10) && u890.j(this.a, ((tz10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
