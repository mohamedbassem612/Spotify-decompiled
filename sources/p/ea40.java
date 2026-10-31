package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ea40 implements v5b1 {
    public static final bgc d = new bgc((byte) 15);
    public final Map a;
    public final String b;
    public final String c;

    public ea40(String str, String str2, Map map) {
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
        if (!(obj instanceof ea40)) {
            return false;
        }
        ea40 ea40Var = (ea40) obj;
        return u890.j(this.a, ea40Var.a) && u890.j(this.b, ea40Var.b) && u890.j(this.c, ea40Var.c);
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
