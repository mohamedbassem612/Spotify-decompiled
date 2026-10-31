package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rid1 {
    public final String a;
    public final boolean b;

    public rid1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rid1)) {
            return false;
        }
        rid1 rid1Var = (rid1) obj;
        return this.a.equals(rid1Var.a) && this.b == rid1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
