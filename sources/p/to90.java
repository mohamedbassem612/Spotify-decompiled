package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class to90 {
    public final String a;
    public final String b;
    public final int c;
    public final so90 d;

    public to90(String str, String str2, int i, so90 so90Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = so90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to90)) {
            return false;
        }
        to90 to90Var = (to90) obj;
        return ip90.a(this.a, to90Var.a) && u890.j(this.b, to90Var.b) && this.c == to90Var.c && u890.j(this.d, to90Var.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.d(ip90.b(this.a) * 31, 31, this.b), 31);
        so90 so90Var = this.d;
        return iK + (so90Var == null ? 0 : so90Var.hashCode());
    }
}
