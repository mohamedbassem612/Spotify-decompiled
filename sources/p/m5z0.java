package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m5z0 extends ajo1 {
    public final gcz0 d;

    public m5z0(gcz0 gcz0Var) {
        this.d = gcz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5z0) && u890.j(this.d, ((m5z0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
