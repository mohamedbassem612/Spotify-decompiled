package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class sf51 {
    public static final ef51 Companion = new ef51();
    public static final znb0[] c = {null, dm5.S(2, oa41.T0)};
    public final String a;
    public final List b;

    public /* synthetic */ sf51(String str, List list, int i) {
        if (2 != (i & 2)) {
            o6p1.t(i, 2, ze51.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf51)) {
            return false;
        }
        sf51 sf51Var = (sf51) obj;
        return u890.j(this.a, sf51Var.a) && u890.j(this.b, sf51Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
