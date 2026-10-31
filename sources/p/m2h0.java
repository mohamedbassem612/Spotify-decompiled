package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m2h0 implements e4h0 {
    public final Throwable a;

    public m2h0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2h0) && this.a.equals(((m2h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
