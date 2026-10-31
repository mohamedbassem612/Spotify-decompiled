package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nxu0 implements v5b1 {
    public static final mxu0 f = new mxu0((byte) 0);
    public final String a;
    public final String b;
    public final Map c;
    public final String d;
    public final String e;

    public nxu0(String str, String str2, String str3, String str4, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = str4;
    }

    @Override // p.v5b1
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxu0)) {
            return false;
        }
        nxu0 nxu0Var = (nxu0) obj;
        return u890.j(this.a, nxu0Var.a) && u890.j(this.b, nxu0Var.b) && u890.j(this.c, nxu0Var.c) && u890.j(this.d, nxu0Var.d) && u890.j(this.e, nxu0Var.e);
    }

    @Override // p.v5b1
    public final b3i1 getType() {
        return f;
    }

    public final int hashCode() {
        int iE = cy30.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }
}
