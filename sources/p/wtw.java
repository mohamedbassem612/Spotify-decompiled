package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wtw {
    public final mr20 a;
    public final mr20 b;
    public final xtw c;

    public wtw(mr20 mr20Var, mr20 mr20Var2, xtw xtwVar) {
        this.a = mr20Var;
        this.b = mr20Var2;
        this.c = xtwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtw)) {
            return false;
        }
        wtw wtwVar = (wtw) obj;
        return u890.j(this.a, wtwVar.a) && u890.j(this.b, wtwVar.b) && this.c.equals(wtwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
