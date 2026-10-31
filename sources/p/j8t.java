package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j8t {
    public final int a;
    public final t8t b;

    public j8t(int i, t8t t8tVar) {
        this.a = i;
        this.b = t8tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8t)) {
            return false;
        }
        j8t j8tVar = (j8t) obj;
        return this.a == j8tVar.a && u890.j(this.b, j8tVar.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        t8t t8tVar = this.b;
        return iC + (t8tVar == null ? 0 : t8tVar.hashCode());
    }
}
