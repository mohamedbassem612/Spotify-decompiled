package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fwr0 implements v5b1 {
    public static final x6c0 e = new x6c0((byte) 8);
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public fwr0(String str, String str2, String str3, Map map) {
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
        if (!(obj instanceof fwr0)) {
            return false;
        }
        fwr0 fwr0Var = (fwr0) obj;
        return this.a.equals(fwr0Var.a) && u890.j(this.b, fwr0Var.b) && u890.j(this.c, fwr0Var.c) && u890.j(this.d, fwr0Var.d);
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
