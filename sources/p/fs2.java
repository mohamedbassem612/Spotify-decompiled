package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fs2 {
    public final String a;
    public final long b;
    public final String c;

    public fs2(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs2)) {
            return false;
        }
        fs2 fs2Var = (fs2) obj;
        return this.a.equals(fs2Var.a) && this.b == fs2Var.b && this.c.equals(fs2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
