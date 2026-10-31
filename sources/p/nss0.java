package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nss0 implements v5b1 {
    public static final x6c0 e = new x6c0((byte) 18);
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public nss0(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
    }

    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nss0)) {
            return false;
        }
        nss0 nss0Var = (nss0) obj;
        return u890.j(this.a, nss0Var.a) && u890.j(this.b, nss0Var.b) && u890.j(this.c, nss0Var.c) && u890.j(this.d, nss0Var.d);
    }

    public final b3i1 getType() {
        return e;
    }

    public final int hashCode() {
        int iE = cy30.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }
}
