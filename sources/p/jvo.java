package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jvo implements qq60 {
    public final op80 a;

    public jvo(op80 op80Var) {
        this.a = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvo) && this.a.equals(((jvo) obj).a);
    }

    @Override // p.qq60
    public final String getId() {
        return "dsa-banner-section";
    }

    public final int hashCode() {
        return this.a.hashCode() + 1882756385;
    }
}
