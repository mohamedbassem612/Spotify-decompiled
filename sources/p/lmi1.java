package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lmi1 implements xmi1 {
    public final b5i1 a;

    public lmi1(b5i1 b5i1Var) {
        this.a = b5i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmi1) && u890.j(this.a, ((lmi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
