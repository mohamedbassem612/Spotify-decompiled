package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cdw {
    public final String a;
    public final tv80 b;

    public cdw(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdw)) {
            return false;
        }
        cdw cdwVar = (cdw) obj;
        return u890.j(this.a, cdwVar.a) && this.b.equals(cdwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
