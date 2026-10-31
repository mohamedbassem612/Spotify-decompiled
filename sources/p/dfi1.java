package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dfi1 extends gfi1 {
    public final wwo1 a;

    public dfi1(wwo1 wwo1Var) {
        this.a = wwo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfi1) && this.a.equals(((dfi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
