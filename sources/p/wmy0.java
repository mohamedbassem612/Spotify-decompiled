package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class wmy0 {
    public static final vmy0 Companion = new vmy0();
    public static final znb0[] d = {null, null, dm5.S(2, h0x0.V0)};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ wmy0(int i, String str, String str2, List list) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, umy0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof wmy0)) {
            return false;
        }
        wmy0 wmy0Var = (wmy0) obj;
        return u890.j(this.a, wmy0Var.a) && u890.j(this.b, wmy0Var.b) && u890.j(this.c, wmy0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return iD + (list == null ? 0 : list.hashCode());
    }

    public wmy0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }
}
