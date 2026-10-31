package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qd91 implements td91 {
    public final Throwable a;

    public qd91(Throwable th) {
        this.a = th;
    }

    public final String breadcrumb() {
        return "Failed(error=" + this.a + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd91) && this.a.equals(((qd91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
