package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class jno0 {
    public static final ino0 Companion = new ino0();
    public static final znb0[] b = {dm5.S(2, fsm0.e1)};
    public final List a;

    public /* synthetic */ jno0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, hno0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jno0) && u890.j(this.a, ((jno0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
