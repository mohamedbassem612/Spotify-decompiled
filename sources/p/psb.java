package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class psb implements qsb {
    public final ta0 a;

    public psb(ta0 ta0Var) {
        this.a = ta0Var;
    }

    @Override // p.qsb
    public final ta0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psb) && u890.j(this.a, ((psb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
