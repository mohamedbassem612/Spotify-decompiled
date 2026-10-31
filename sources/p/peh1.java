package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class peh1 {
    public static final oeh1 Companion = new oeh1();
    public static final znb0[] b = {dm5.S(2, vbh1.d)};
    public final List a;

    public /* synthetic */ peh1(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, neh1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof peh1) && u890.j(this.a, ((peh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
