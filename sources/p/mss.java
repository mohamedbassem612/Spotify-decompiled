package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mss {
    public final tta1 a;

    public mss(tta1 tta1Var) {
        this.a = tta1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mss) && this.a.equals(((mss) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
