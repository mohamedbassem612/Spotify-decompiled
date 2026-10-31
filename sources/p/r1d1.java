package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r1d1 implements v5b1 {
    public static final uyu0 d = new uyu0((byte) 15);
    public final Map a;
    public final String b;
    public final String c;

    public r1d1(String str, String str2, Map map) {
        this.a = map;
        this.b = str;
        this.c = str2;
    }

    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1d1)) {
            return false;
        }
        r1d1 r1d1Var = (r1d1) obj;
        return u890.j(this.a, r1d1Var.a) && u890.j(this.b, r1d1Var.b) && u890.j(this.c, r1d1Var.c);
    }

    public final b3i1 getType() {
        return d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
