package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wmb1 extends aob1 {
    public final String a;
    public final x360 b;

    public wmb1(String str, x360 x360Var) {
        this.a = str;
        this.b = x360Var;
    }

    @Override // p.aob1
    public final x360 a() {
        return this.b;
    }

    @Override // p.aob1
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmb1)) {
            return false;
        }
        wmb1 wmb1Var = (wmb1) obj;
        return u890.j(this.a, wmb1Var.a) && u890.j(this.b, wmb1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return iHashCode + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
