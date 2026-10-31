package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class auo {
    public final lzy0 a;
    public final boolean b;

    public auo(lzy0 lzy0Var, boolean z) {
        this.a = lzy0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof auo) {
            auo auoVar = (auo) obj;
            if (auoVar.a.equals(this.a) && auoVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
