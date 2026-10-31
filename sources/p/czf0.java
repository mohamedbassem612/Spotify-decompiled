package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class czf0 implements dzf0 {
    public final zob1 a;
    public final j2i b;

    public czf0(zob1 zob1Var, j2i j2iVar) {
        this.a = zob1Var;
        this.b = j2iVar;
    }

    @Override // p.dzf0
    public final zob1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof czf0) {
            czf0 czf0Var = (czf0) obj;
            return u890.j(this.a, czf0Var.a) && this.b == czf0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
