package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hkk extends jkk {
    public final zxi1 a;

    public hkk(zxi1 zxi1Var) {
        this.a = zxi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkk) && this.a.equals(((hkk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
