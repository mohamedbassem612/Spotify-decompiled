package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rs implements ss {
    public final ev a;
    public final c380 b;

    public rs(ev evVar, c380 c380Var) {
        this.a = evVar;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs)) {
            return false;
        }
        rs rsVar = (rs) obj;
        return u890.j(this.a, rsVar.a) && this.b.equals(rsVar.b);
    }

    public final int hashCode() {
        ev evVar = this.a;
        return this.b.hashCode() + ((evVar == null ? 0 : evVar.hashCode()) * 31);
    }
}
