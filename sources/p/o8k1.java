package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o8k1 implements t9k1 {
    public final ou80 a;

    public o8k1(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8k1) && u890.j(this.a, ((o8k1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
