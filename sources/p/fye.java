package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fye implements nye {
    public final v2v a;

    public fye(v2v v2vVar) {
        this.a = v2vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fye) && u890.j(this.a, ((fye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
