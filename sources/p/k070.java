package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k070 implements q070 {
    public final xx10 a;

    public k070(xx10 xx10Var) {
        this.a = xx10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k070) && this.a.equals(((k070) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
