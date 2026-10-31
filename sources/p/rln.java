package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rln implements sln {
    public final String a;
    public final iu30 b;

    public rln(String str, iu30 iu30Var) {
        this.a = str;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rln)) {
            return false;
        }
        rln rlnVar = (rln) obj;
        return u890.j(this.a, rlnVar.a) && u890.j(this.b, rlnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
