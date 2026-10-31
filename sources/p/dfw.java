package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dfw implements hiw {
    public final String a;
    public final tv80 b;

    public dfw(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfw)) {
            return false;
        }
        dfw dfwVar = (dfw) obj;
        return u890.j(this.a, dfwVar.a) && this.b.equals(dfwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
