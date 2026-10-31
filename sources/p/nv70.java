package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nv70 implements ov70 {
    public final String a;
    public final boolean b;

    public nv70(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // p.ov70
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv70)) {
            return false;
        }
        nv70 nv70Var = (nv70) obj;
        return this.a.equals(nv70Var.a) && this.b == nv70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
