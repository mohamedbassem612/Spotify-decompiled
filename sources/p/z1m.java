package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z1m implements c2m {
    public final hby a;

    public z1m(hby hbyVar) {
        this.a = hbyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1m) && u890.j(this.a, ((z1m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
