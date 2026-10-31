package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hwr0 implements v5b1 {
    public static final x6c0 d = new x6c0((byte) 10);
    public final Map a;
    public final String b;
    public final String c;

    public hwr0(String str, String str2, Map map) {
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
        if (!(obj instanceof hwr0)) {
            return false;
        }
        hwr0 hwr0Var = (hwr0) obj;
        return u890.j(this.a, hwr0Var.a) && u890.j(this.b, hwr0Var.b) && u890.j(this.c, hwr0Var.c);
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
