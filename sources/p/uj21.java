package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uj21 implements chu {
    public final fq0 a;

    public uj21(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj21) && this.a.equals(((uj21) obj).a);
    }

    public final int hashCode() {
        return l1d.C(3) + (this.a.hashCode() * 31);
    }
}
