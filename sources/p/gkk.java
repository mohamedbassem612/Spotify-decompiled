package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gkk extends jkk {
    public final wxi1 a;

    public gkk(wxi1 wxi1Var) {
        this.a = wxi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkk) && this.a.equals(((gkk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
