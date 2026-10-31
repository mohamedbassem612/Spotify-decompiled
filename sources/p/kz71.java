package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kz71 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public kz71(int i, String str, boolean z, boolean z2, boolean z3) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        z3 = (i & 8) != 0 ? false : z3;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz71)) {
            return false;
        }
        kz71 kz71Var = (kz71) obj;
        return u890.j(this.a, kz71Var.a) && this.b == kz71Var.b && this.c == kz71Var.c && this.d == kz71Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(true) + xcg1.g(xcg1.g(xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
