package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cph implements iph {
    public final String a;
    public final ijh b;
    public final cg21 c;

    public cph(String str, ijh ijhVar, cg21 cg21Var) {
        this.a = str;
        this.b = ijhVar;
        this.c = cg21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cph)) {
            return false;
        }
        cph cphVar = (cph) obj;
        return this.a.equals(cphVar.a) && this.b.equals(cphVar.b) && this.c.equals(cphVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
