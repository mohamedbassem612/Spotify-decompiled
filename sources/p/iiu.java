package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iiu {
    public final giu a;
    public final hiu b;
    public final iac0 c;

    public iiu(giu giuVar, hiu hiuVar, iac0 iac0Var) {
        this.a = giuVar;
        this.b = hiuVar;
        this.c = iac0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iiu)) {
            return false;
        }
        iiu iiuVar = (iiu) obj;
        return this.a.equals(iiuVar.a) && this.b.equals(iiuVar.b) && this.c.equals(iiuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
