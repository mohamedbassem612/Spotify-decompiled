package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jmi1 implements xmi1 {
    public final b5i1 a;

    public jmi1(b5i1 b5i1Var) {
        this.a = b5i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmi1) && u890.j(this.a, ((jmi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
