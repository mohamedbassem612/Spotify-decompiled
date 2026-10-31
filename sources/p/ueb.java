package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ueb implements xeb {
    public final l3f0 a;
    public final bk8 b;
    public final boolean c;

    public ueb(l3f0 l3f0Var, bk8 bk8Var, boolean z) {
        this.a = l3f0Var;
        this.b = bk8Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueb)) {
            return false;
        }
        ueb uebVar = (ueb) obj;
        return u890.j(this.a, uebVar.a) && this.b == uebVar.b && this.c == uebVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
