package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oge extends pge {
    public final Throwable a;

    public oge(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oge) {
            return u890.j(this.a, ((oge) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p.pge
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
