package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ah3 implements v5b1 {
    public static final ll0 e = new ll0((byte) 9);
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public ah3(String str, String str2, String str3, Map map) {
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
        if (!(obj instanceof ah3)) {
            return false;
        }
        ah3 ah3Var = (ah3) obj;
        return this.a.equals(ah3Var.a) && u890.j(this.b, ah3Var.b) && u890.j(this.c, ah3Var.c) && u890.j(this.d, ah3Var.d);
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
