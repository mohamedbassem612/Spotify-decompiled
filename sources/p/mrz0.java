package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mrz0 {
    public final String a;
    public final int b;
    public final long c;

    public mrz0(long j, int i, String str) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrz0)) {
            return false;
        }
        mrz0 mrz0Var = (mrz0) obj;
        return u890.j(this.a, mrz0Var.a) && this.b == mrz0Var.b && this.c == mrz0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
