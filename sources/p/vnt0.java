package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class vnt0 {
    public static final unt0 Companion = new unt0();
    public static final znb0[] d = {null, null, dm5.S(2, tnt0.b)};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ vnt0(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnt0)) {
            return false;
        }
        vnt0 vnt0Var = (vnt0) obj;
        return u890.j(this.a, vnt0Var.a) && u890.j(this.b, vnt0Var.b) && u890.j(this.c, vnt0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
