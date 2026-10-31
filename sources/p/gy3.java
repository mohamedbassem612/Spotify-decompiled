package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gy3 implements v5b1 {
    public static final ll0 e = new ll0((byte) 10);
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public gy3(String str, String str2, String str3, Map map) {
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
        if (!(obj instanceof gy3)) {
            return false;
        }
        gy3 gy3Var = (gy3) obj;
        return this.a.equals(gy3Var.a) && u890.j(this.b, gy3Var.b) && u890.j(this.c, gy3Var.c) && u890.j(this.d, gy3Var.d);
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
