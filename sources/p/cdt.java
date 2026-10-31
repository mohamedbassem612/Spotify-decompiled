package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cdt {
    public final bw61 a;
    public final bw61 b;

    public cdt(bw61 bw61Var, bw61 bw61Var2) {
        this.a = bw61Var;
        this.b = bw61Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdt)) {
            return false;
        }
        cdt cdtVar = (cdt) obj;
        return this.a.equals(cdtVar.a) && this.b.equals(cdtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
