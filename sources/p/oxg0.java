package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oxg0 extends qxg0 {
    public final iug0 a;

    public oxg0(iug0 iug0Var) {
        this.a = iug0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxg0) && this.a.equals(((oxg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
