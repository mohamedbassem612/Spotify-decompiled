package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jz70 implements z0i, ymb0 {
    public final dq70 a;
    public final xmb0 b;

    public jz70(dq70 dq70Var) {
        xmb0 xmb0Var = new xmb0(false);
        this.a = dq70Var;
        this.b = xmb0Var;
    }

    public final xmb0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz70)) {
            return false;
        }
        jz70 jz70Var = (jz70) obj;
        return this.a.equals(jz70Var.a) && this.b.equals(jz70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
