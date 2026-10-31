package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vo90 {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;

    public vo90(String str, String str2, String str3, String str4, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo90)) {
            return false;
        }
        vo90 vo90Var = (vo90) obj;
        return u890.j(this.a, vo90Var.a) && this.b.equals(vo90Var.b) && u890.j(this.c, vo90Var.c) && this.d.equals(vo90Var.d) && this.e.equals(vo90Var.e);
    }

    public final int hashCode() {
        return ((((this.e.hashCode() + cy30.e(cy30.d((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 559935491) * 31, 31, this.c), 31, this.d)) * 31) - 1290540065) * 31) + 1669334218;
    }
}
