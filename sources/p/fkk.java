package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fkk extends jkk {
    public final wxi1 a;

    public fkk(wxi1 wxi1Var) {
        this.a = wxi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fkk) && this.a.equals(((fkk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
