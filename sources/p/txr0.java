package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class txr0 implements wxr0 {
    public final String a;
    public final boolean b;

    public txr0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // p.wxr0
    public final boolean a() {
        return false;
    }

    @Override // p.wxr0
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txr0)) {
            return false;
        }
        txr0 txr0Var = (txr0) obj;
        return u890.j(this.a, txr0Var.a) && this.b == txr0Var.b;
    }

    @Override // p.wxr0
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
