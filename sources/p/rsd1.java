package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rsd1 implements tsd1 {
    public final boolean a;
    public final int b;

    public rsd1(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsd1)) {
            return false;
        }
        rsd1 rsd1Var = (rsd1) obj;
        return this.a == rsd1Var.a && this.b == rsd1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
