package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kyu0 implements v5b1 {
    public static final mxu0 d = new mxu0((byte) 21);
    public final Map a;
    public final String b;
    public final String c;

    public kyu0(String str, String str2, Map map) {
        this.a = map;
        this.b = str;
        this.c = str2;
    }

    @Override // p.v5b1
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyu0)) {
            return false;
        }
        kyu0 kyu0Var = (kyu0) obj;
        return u890.j(this.a, kyu0Var.a) && u890.j(this.b, kyu0Var.b) && u890.j(this.c, kyu0Var.c);
    }

    @Override // p.v5b1
    public final b3i1 getType() {
        return d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
