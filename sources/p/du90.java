package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class du90 implements eu90 {
    public final long a;
    public final String b;

    public du90(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du90)) {
            return false;
        }
        du90 du90Var = (du90) obj;
        return this.a == du90Var.a && u890.j(this.b, du90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
