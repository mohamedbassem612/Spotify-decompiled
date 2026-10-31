package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i2l1 extends j2l1 {
    public final l4l1 a;

    public i2l1(l4l1 l4l1Var) {
        this.a = l4l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2l1) && this.a.equals(((i2l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
