package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ua81 implements v5b1 {
    public static final uyu0 e = new uyu0((byte) 11);
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public ua81(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
    }

    @Override // p.v5b1
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua81)) {
            return false;
        }
        ua81 ua81Var = (ua81) obj;
        return j6p1.n(this.a, ua81Var.a) && u890.j(this.b, ua81Var.b) && u890.j(this.c, ua81Var.c) && u890.j(this.d, ua81Var.d);
    }

    @Override // p.v5b1
    public final b3i1 getType() {
        return e;
    }

    public final int hashCode() {
        int iE = cy30.e(j6p1.s(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }
}
