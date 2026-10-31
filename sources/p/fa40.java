package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fa40 implements v5b1 {
    public static final bgc d = new bgc((byte) 16);
    public final Map a;
    public final String b;
    public final String c;

    public fa40(String str, String str2, Map map) {
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
        if (!(obj instanceof fa40)) {
            return false;
        }
        fa40 fa40Var = (fa40) obj;
        return u890.j(this.a, fa40Var.a) && u890.j(this.b, fa40Var.b) && u890.j(this.c, fa40Var.c);
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
