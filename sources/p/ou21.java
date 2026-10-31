package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class ou21 {
    public static final nu21 Companion = new nu21();
    public static final znb0[] b = {dm5.S(2, n521.Y)};
    public final List a;

    public /* synthetic */ ou21(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, mu21.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou21) && u890.j(this.a, ((ou21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ou21(ArrayList arrayList) {
        this.a = arrayList;
    }
}
