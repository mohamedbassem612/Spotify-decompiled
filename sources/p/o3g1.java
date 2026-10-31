package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o3g1 {
    public static final o3g1 b;
    public static final String c;
    public final b380 a;

    static {
        w280 w280Var = b380.b;
        b = new o3g1(bg11.e);
        String str = zoi1.a;
        c = Integer.toString(0, 36);
    }

    public o3g1(bg11 bg11Var) {
        this.a = b380.p(bg11Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            b380 b380Var = this.a;
            if (i2 >= b380Var.size()) {
                return false;
            }
            n3g1 n3g1Var = (n3g1) b380Var.get(i2);
            for (boolean z : n3g1Var.e) {
                if (z) {
                    if (n3g1Var.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o3g1.class != obj.getClass()) {
            return false;
        }
        b380 b380Var = ((o3g1) obj).a;
        b380 b380Var2 = this.a;
        b380Var2.getClass();
        return z1p1.j(b380Var2, b380Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
