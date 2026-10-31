package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class sgl {
    public final Object a;

    public sgl(Object obj) {
        this.a = obj;
    }

    public a8b0 a(zim0 zim0Var) {
        return ((pf5) this.a).getType();
    }

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        sgl sglVar = obj instanceof sgl ? (sgl) obj : null;
        return u890.j(objB, sglVar != null ? sglVar.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
