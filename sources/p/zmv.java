package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zmv {
    public final String a;
    public final ova b;
    public final c380 c;

    public zmv(String str, ova ovaVar, c380 c380Var) {
        this.a = str;
        this.b = ovaVar;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmv)) {
            return false;
        }
        zmv zmvVar = (zmv) obj;
        return u890.j(this.a, zmvVar.a) && this.b == zmvVar.b && u890.j(this.c, zmvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
