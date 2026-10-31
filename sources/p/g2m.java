package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g2m implements r2m {
    public final hby a;

    public g2m(hby hbyVar) {
        this.a = hbyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2m) && u890.j(this.a, ((g2m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
