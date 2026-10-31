package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r240 implements x240 {
    public final String a;
    public final long b;

    public r240(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r240)) {
            return false;
        }
        r240 r240Var = (r240) obj;
        return this.a.equals(r240Var.a) && this.b == r240Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
