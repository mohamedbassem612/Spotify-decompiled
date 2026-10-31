package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class np21 {
    public static final mp21 Companion = new mp21();
    public static final znb0[] b = {dm5.S(2, n521.i)};
    public final List a;

    public /* synthetic */ np21(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof np21) && u890.j(this.a, ((np21) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public np21(ArrayList arrayList) {
        this.a = arrayList;
    }
}
