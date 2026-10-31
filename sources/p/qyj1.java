package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qyj1 implements syj1 {
    public final c380 a;
    public final boolean b;

    public qyj1(c380 c380Var, boolean z) {
        this.a = c380Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyj1)) {
            return false;
        }
        qyj1 qyj1Var = (qyj1) obj;
        return u890.j(this.a, qyj1Var.a) && this.b == qyj1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
