package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kzd0 implements qzd0 {
    public final String a;
    public final boolean b;

    public kzd0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzd0)) {
            return false;
        }
        kzd0 kzd0Var = (kzd0) obj;
        return this.a.equals(kzd0Var.a) && this.b == kzd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
