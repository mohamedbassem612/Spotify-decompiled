package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hf81 {
    public final int a;
    public final dpd b;
    public final int c;

    public hf81(int i, dpd dpdVar, int i2) {
        this.a = i;
        this.b = dpdVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf81)) {
            return false;
        }
        hf81 hf81Var = (hf81) obj;
        return this.a == hf81Var.a && this.b.equals(hf81Var.b) && this.c == hf81Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
