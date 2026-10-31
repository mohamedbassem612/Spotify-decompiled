package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class teh1 {
    public static final seh1 Companion = new seh1();
    public static final znb0[] b = {dm5.S(2, vbh1.e)};
    public final List a;

    public /* synthetic */ teh1(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, reh1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof teh1) && u890.j(this.a, ((teh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
