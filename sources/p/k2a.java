package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k2a {
    public final int a;
    public final u1a b;

    public k2a(int i, u1a u1aVar) {
        this.a = i;
        this.b = u1aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2a)) {
            return false;
        }
        k2a k2aVar = (k2a) obj;
        return this.a == k2aVar.a && u890.j(this.b, k2aVar.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        u1a u1aVar = this.b;
        return iC + (u1aVar == null ? 0 : u1aVar.hashCode());
    }
}
