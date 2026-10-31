package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ugk extends a8o {
    public final tt6 d;

    public ugk(tt6 tt6Var) {
        this.d = tt6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugk) && u890.j(this.d, ((ugk) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
