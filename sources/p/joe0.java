package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class joe0 extends moe0 {
    public final bzn1 a;
    public final boolean b;

    public joe0(bzn1 bzn1Var, boolean z) {
        this.a = bzn1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joe0)) {
            return false;
        }
        joe0 joe0Var = (joe0) obj;
        return this.a.equals(joe0Var.a) && this.b == joe0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
