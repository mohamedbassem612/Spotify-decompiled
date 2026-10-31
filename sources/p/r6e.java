package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r6e {
    public final h6e a;

    public r6e(h6e h6eVar) {
        this.a = h6eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6e) && u890.j(this.a, ((r6e) obj).a);
    }

    public final int hashCode() {
        h6e h6eVar = this.a;
        if (h6eVar == null) {
            return 0;
        }
        return h6eVar.hashCode();
    }
}
