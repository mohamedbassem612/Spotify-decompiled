package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jcz {
    public final zob1 a;
    public final kko b;
    public final jr30 c;

    public jcz(zob1 zob1Var, kko kkoVar, jr30 jr30Var) {
        this.a = zob1Var;
        this.b = kkoVar;
        this.c = jr30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jcz) {
            jcz jczVar = (jcz) obj;
            return u890.j(this.a, jczVar.a) && u890.j(this.b, jczVar.b) && this.c == jczVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
