package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uxm0 implements vxm0 {
    public final mr20 a;
    public final zu30 b;

    public uxm0(mr20 mr20Var, zu30 zu30Var) {
        this.a = mr20Var;
        this.b = zu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxm0)) {
            return false;
        }
        uxm0 uxm0Var = (uxm0) obj;
        return this.a.equals(uxm0Var.a) && this.b.equals(uxm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
