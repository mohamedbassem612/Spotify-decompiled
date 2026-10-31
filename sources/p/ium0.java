package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ium0 implements v5b1 {
    public static final x6c0 e = new x6c0((byte) 3);
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public ium0(String str, String str2, String str3, Map map) {
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
        if (!(obj instanceof ium0)) {
            return false;
        }
        ium0 ium0Var = (ium0) obj;
        return j6p1.n(this.a, ium0Var.a) && u890.j(this.b, ium0Var.b) && u890.j(this.c, ium0Var.c) && u890.j(this.d, ium0Var.d);
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
