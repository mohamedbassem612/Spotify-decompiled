package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dvf1 {
    public final String a;
    public final long b;
    public final long c;

    public dvf1(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvf1)) {
            return false;
        }
        dvf1 dvf1Var = (dvf1) obj;
        return this.a.equals(dvf1Var.a) && this.b == dvf1Var.b && this.c == dvf1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
