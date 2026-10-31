package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e1u {
    public final int a;
    public final Object b;

    public e1u(int i, s1u s1uVar) {
        this.a = i;
        this.b = s1uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1u)) {
            return false;
        }
        e1u e1uVar = (e1u) obj;
        return this.a == e1uVar.a && u890.j(this.b, e1uVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
