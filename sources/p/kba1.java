package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kba1 {
    public final String a;
    public final int b;
    public final int c;

    public kba1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kba1)) {
            return false;
        }
        kba1 kba1Var = (kba1) obj;
        return this.a.equals(kba1Var.a) && this.b == kba1Var.b && this.c == kba1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
