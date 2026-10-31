package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ikl {
    public final int a;
    public final p60 b;

    public ikl(int i, p60 p60Var) {
        this.a = i;
        this.b = p60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikl)) {
            return false;
        }
        ikl iklVar = (ikl) obj;
        return this.a == iklVar.a && u890.j(this.b, iklVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
