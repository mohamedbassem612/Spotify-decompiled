package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class khv0 extends xap1 {
    public final String c;
    public final String d;
    public final Map e;

    public /* synthetic */ khv0(String str, int i, Map map, String str2) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khv0)) {
            return false;
        }
        khv0 khv0Var = (khv0) obj;
        return u890.j(this.c, khv0Var.c) && u890.j(this.d, khv0Var.d) && u890.j(this.e, khv0Var.e);
    }

    public final int hashCode() {
        String str = this.c;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
        Map map = this.e;
        return iD + (map != null ? map.hashCode() : 0);
    }

    public khv0(String str, String str2, Map map) {
        this.c = str;
        this.d = str2;
        this.e = map;
    }
}
