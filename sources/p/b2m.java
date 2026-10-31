package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b2m implements c2m {
    public final hby a;

    public b2m(hby hbyVar) {
        this.a = hbyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2m) && u890.j(this.a, ((b2m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
