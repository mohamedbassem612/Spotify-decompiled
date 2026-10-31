package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qy6 implements v5b1 {
    public static final ll0 f = new ll0((byte) 15);
    public final String a;
    public final String b;
    public final Map c;
    public final String d;
    public final String e;

    public qy6(String str, String str2, String str3, String str4, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = str4;
    }

    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy6)) {
            return false;
        }
        qy6 qy6Var = (qy6) obj;
        return this.a.equals(qy6Var.a) && this.b.equals(qy6Var.b) && u890.j(this.c, qy6Var.c) && u890.j(this.d, qy6Var.d) && u890.j(this.e, qy6Var.e);
    }

    public final b3i1 getType() {
        return f;
    }

    public final int hashCode() {
        int iE = cy30.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }
}
