package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rp71 implements tp71 {
    public final za21 a;

    public rp71(za21 za21Var) {
        this.a = za21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp71) && this.a.equals(((rp71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
