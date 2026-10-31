package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class y6f0 {
    public static final x6f0 Companion = new x6f0();
    public static final znb0[] b = {dm5.S(2, i0f0.e)};
    public final List a;

    public /* synthetic */ y6f0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, w6f0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6f0) && u890.j(this.a, ((y6f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public y6f0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
