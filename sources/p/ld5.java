package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ld5 {
    public final String a;
    public final int b;
    public final String c;

    public ld5(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld5)) {
            return false;
        }
        ld5 ld5Var = (ld5) obj;
        return u890.j(this.a, ld5Var.a) && this.b == ld5Var.b && this.c.equals(ld5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
