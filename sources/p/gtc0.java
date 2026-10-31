package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gtc0 extends htc0 {
    public final tr80 a;

    public gtc0(tr80 tr80Var) {
        this.a = tr80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtc0) && u890.j(this.a, ((gtc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
