package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lhp0 extends x2s {
    public final otu b;

    public lhp0(otu otuVar) {
        super(yi20.R0);
        this.b = otuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhp0) && this.b == ((lhp0) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
