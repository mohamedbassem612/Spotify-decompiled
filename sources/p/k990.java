package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k990 {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public k990(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k990)) {
            return false;
        }
        k990 k990Var = (k990) obj;
        return u890.j(this.a, k990Var.a) && u890.j(this.b, k990Var.b) && u890.j(this.c, k990Var.c) && this.d.equals(k990Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
