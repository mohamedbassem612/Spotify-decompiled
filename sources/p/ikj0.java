package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ikj0 implements kkj0 {
    public final qtw a;
    public final afv0 b;

    public ikj0(qtw qtwVar, afv0 afv0Var) {
        this.a = qtwVar;
        this.b = afv0Var;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ikj0) {
            ikj0 ikj0Var = (ikj0) obj;
            if (this.a == ikj0Var.a && this.b.equals(ikj0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
