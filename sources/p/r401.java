package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r401 implements f501 {
    public final String a;
    public final Throwable b;

    public r401(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r401)) {
            return false;
        }
        r401 r401Var = (r401) obj;
        return this.a.equals(r401Var.a) && this.b.equals(r401Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
