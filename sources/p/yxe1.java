package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yxe1 implements dbr0 {
    public final ryn1 a;

    public yxe1(ryn1 ryn1Var) {
        this.a = ryn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxe1) && u890.j(this.a, ((yxe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
