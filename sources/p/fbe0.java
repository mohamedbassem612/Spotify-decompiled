package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fbe0 implements bce0 {
    public final ygy a;

    public fbe0(ygy ygyVar) {
        this.a = ygyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbe0) && this.a.equals(((fbe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
