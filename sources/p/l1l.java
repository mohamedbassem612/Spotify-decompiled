package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l1l {
    public final boolean a;
    public final iu30 b;

    public l1l(iu30 iu30Var, boolean z) {
        this.a = z;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1l)) {
            return false;
        }
        l1l l1lVar = (l1l) obj;
        return this.a == l1lVar.a && u890.j(this.b, l1lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
