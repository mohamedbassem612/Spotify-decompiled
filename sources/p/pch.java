package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pch {
    public final k1r a;
    public final nm6 b;
    public final boolean c;

    public pch(k1r k1rVar, nm6 nm6Var, boolean z) {
        this.a = k1rVar;
        this.b = nm6Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pch)) {
            return false;
        }
        pch pchVar = (pch) obj;
        return u890.j(this.a, pchVar.a) && u890.j(this.b, pchVar.b) && this.c == pchVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
