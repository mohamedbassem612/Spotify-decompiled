package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zvz0 {
    public final String a;
    public final String b;
    public final z1g1 c;
    public final List d;

    public zvz0(String str, String str2, z1g1 z1g1Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = z1g1Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvz0)) {
            return false;
        }
        zvz0 zvz0Var = (zvz0) obj;
        return u890.j(this.a, zvz0Var.a) && u890.j(this.b, zvz0Var.b) && u890.j(this.c, zvz0Var.c) && u890.j(this.d, zvz0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        z1g1 z1g1Var = this.c;
        int iHashCode3 = (iHashCode2 + (z1g1Var == null ? 0 : z1g1Var.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
