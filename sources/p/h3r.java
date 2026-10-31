package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h3r implements k3r {
    public static final h3r b = new h3r(c3r.a);
    public final e3r a;

    public h3r(e3r e3rVar) {
        this.a = e3rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3r) && this.a.equals(((h3r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
