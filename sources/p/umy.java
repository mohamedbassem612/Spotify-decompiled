package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class umy {
    public final tka0 a;

    public umy(tka0 tka0Var) {
        this.a = tka0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof umy) && u890.j(this.a, ((umy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
