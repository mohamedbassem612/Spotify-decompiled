package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class o7w {
    public static final n7w Companion = new n7w();
    public static final znb0[] b = {dm5.S(2, xzu.S0)};
    public final List a;

    public /* synthetic */ o7w(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, m7w.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7w) && u890.j(this.a, ((o7w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public o7w(ArrayList arrayList) {
        this.a = arrayList;
    }
}
