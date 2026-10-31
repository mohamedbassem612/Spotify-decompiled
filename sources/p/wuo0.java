package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wuo0 extends zuo0 {
    public final q1a1 a;

    public wuo0(q1a1 q1a1Var) {
        this.a = q1a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wuo0) && this.a.equals(((wuo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
