package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class up1 implements wp1 {
    public final gv1 a;

    public up1(gv1 gv1Var) {
        this.a = gv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up1) && this.a.equals(((up1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
