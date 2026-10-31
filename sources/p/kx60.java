package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kx60 {
    public final String a;
    public final int b;

    public kx60(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx60)) {
            return false;
        }
        kx60 kx60Var = (kx60) obj;
        return u890.j(this.a, kx60Var.a) && this.b == kx60Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
