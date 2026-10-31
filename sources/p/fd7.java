package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fd7 extends ld7 {
    public final yd7 a;

    public fd7(yd7 yd7Var) {
        this.a = yd7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd7) && u890.j(this.a, ((fd7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
