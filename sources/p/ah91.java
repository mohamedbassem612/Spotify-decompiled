package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ah91 {
    public final xpw a;
    public final mh91 b;
    public final qim0 c;

    public ah91(xpw xpwVar, mh91 mh91Var, qim0 qim0Var) {
        this.a = xpwVar;
        this.b = mh91Var;
        this.c = qim0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah91)) {
            return false;
        }
        ah91 ah91Var = (ah91) obj;
        return u890.j(this.a, ah91Var.a) && u890.j(this.b, ah91Var.b) && u890.j(this.c, ah91Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ ah91(xpw xpwVar, tw81 tw81Var) {
        this(xpwVar, tw81Var, nim0.a);
    }
}
