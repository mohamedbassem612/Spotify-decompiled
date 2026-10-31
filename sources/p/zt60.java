package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zt60 extends ru60 {
    public final zso1 a;

    public zt60(zso1 zso1Var) {
        this.a = zso1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt60) && this.a.equals(((zt60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
