package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r070 {
    public final f070 a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public r070(f070 f070Var, boolean z, boolean z2, int i) {
        this.a = f070Var;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public static r070 a(r070 r070Var, int i, int i2) {
        f070 f070Var = r070Var.a;
        boolean z = (i2 & 2) != 0 ? r070Var.b : true;
        boolean z2 = (i2 & 4) != 0 ? r070Var.c : true;
        if ((i2 & 8) != 0) {
            i = r070Var.d;
        }
        return new r070(f070Var, z, z2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r070)) {
            return false;
        }
        r070 r070Var = (r070) obj;
        return u890.j(this.a, r070Var.a) && this.b == r070Var.b && this.c == r070Var.c && this.d == r070Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public /* synthetic */ r070(f070 f070Var) {
        this(f070Var, false, false, -1);
    }
}
