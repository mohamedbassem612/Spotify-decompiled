package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y531 implements a631 {
    public final yc30 a;

    public y531(yc30 yc30Var) {
        this.a = yc30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y531) && this.a.equals(((y531) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
