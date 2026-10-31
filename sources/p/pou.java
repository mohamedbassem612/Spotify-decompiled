package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pou implements uou {
    public final l0l a;

    public pou(l0l l0lVar) {
        this.a = l0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pou) && u890.j(this.a, ((pou) obj).a);
    }

    public final int hashCode() {
        l0l l0lVar = this.a;
        if (l0lVar == null) {
            return 0;
        }
        return l0lVar.hashCode();
    }
}
