package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f020 {
    public final bpd a;
    public final int b;
    public final String c;

    public f020(bpd bpdVar, int i, String str) {
        this.a = bpdVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f020)) {
            return false;
        }
        f020 f020Var = (f020) obj;
        return this.a.equals(f020Var.a) && this.b == f020Var.b && u890.j(this.c, f020Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
