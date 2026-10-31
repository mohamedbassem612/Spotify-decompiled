package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s6d1 implements v6d1 {
    public final ky0 a;

    public s6d1(ky0 ky0Var) {
        this.a = ky0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6d1) && u890.j(this.a, ((s6d1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
