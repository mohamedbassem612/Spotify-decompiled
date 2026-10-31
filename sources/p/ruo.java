package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ruo {
    public final m5y a;
    public final nrs0 b;

    public ruo(m5y m5yVar, nrs0 nrs0Var) {
        this.a = m5yVar;
        this.b = nrs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruo)) {
            return false;
        }
        ruo ruoVar = (ruo) obj;
        return this.a.equals(ruoVar.a) && u890.j(this.b, ruoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
