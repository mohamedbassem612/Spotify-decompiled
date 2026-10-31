package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uof0 implements xof0 {
    public final cay a;

    public uof0(cay cayVar) {
        this.a = cayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uof0) && u890.j(this.a, ((uof0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
