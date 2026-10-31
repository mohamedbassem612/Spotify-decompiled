package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tlt0 implements xlt0 {
    public final muz a;
    public final ruz b;

    public tlt0(muz muzVar, ruz ruzVar) {
        this.a = muzVar;
        this.b = ruzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlt0)) {
            return false;
        }
        tlt0 tlt0Var = (tlt0) obj;
        return this.a == tlt0Var.a && this.b == tlt0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
