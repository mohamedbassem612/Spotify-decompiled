package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class erd1 {
    public static final crd1 Companion = new crd1();
    public static final znb0[] c = {null, dm5.S(2, orc1.Y)};
    public final String a;
    public final List b;

    public /* synthetic */ erd1(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erd1)) {
            return false;
        }
        erd1 erd1Var = (erd1) obj;
        return u890.j(this.a, erd1Var.a) && u890.j(this.b, erd1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
