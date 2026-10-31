package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a501 implements f501 {
    public final String a;
    public final Throwable b;

    public a501(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a501)) {
            return false;
        }
        a501 a501Var = (a501) obj;
        return this.a.equals(a501Var.a) && this.b.equals(a501Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
