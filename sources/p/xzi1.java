package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xzi1 {
    public final wzi1 a;

    public xzi1(wzi1 wzi1Var) {
        this.a = wzi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzi1) && this.a.equals(((xzi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
