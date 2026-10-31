package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iof0 {
    public final cay a;

    public iof0(cay cayVar) {
        this.a = cayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iof0) && u890.j(this.a, ((iof0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
