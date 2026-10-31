package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class on3 extends qxd0 {
    public final d7p1 d;

    public on3(d7p1 d7p1Var) {
        this.d = d7p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof on3) && this.d.equals(((on3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
