package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wsf1 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public wsf1(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsf1)) {
            return false;
        }
        wsf1 wsf1Var = (wsf1) obj;
        return u890.j(this.a, wsf1Var.a) && this.b.equals(wsf1Var.b) && u890.j(this.c, wsf1Var.c) && u890.j(this.d, wsf1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
