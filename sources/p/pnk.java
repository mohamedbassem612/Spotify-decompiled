package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pnk implements snk {
    public final fbh0 a;

    public pnk(fbh0 fbh0Var) {
        this.a = fbh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnk) && this.a.equals(((pnk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
