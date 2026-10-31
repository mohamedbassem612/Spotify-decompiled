package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r540 implements s540 {
    public final mzh1 a;

    public r540(mzh1 mzh1Var) {
        this.a = mzh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r540) && this.a.equals(((r540) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
