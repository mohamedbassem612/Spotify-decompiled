package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dvk1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;

    public dvk1(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvk1)) {
            return false;
        }
        dvk1 dvk1Var = (dvk1) obj;
        return this.a.equals(dvk1Var.a) && this.b.equals(dvk1Var.b) && this.c == dvk1Var.c && this.d == dvk1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
