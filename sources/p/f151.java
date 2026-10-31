package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f151 implements r151 {
    public final int a;
    public final Throwable b;

    public f151(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f151)) {
            return false;
        }
        f151 f151Var = (f151) obj;
        return this.a == f151Var.a && this.b.equals(f151Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
