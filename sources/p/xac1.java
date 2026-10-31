package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xac1 extends ebc1 {
    public final o7c1 a;

    public xac1(o7c1 o7c1Var) {
        this.a = o7c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xac1) && this.a.equals(((xac1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
