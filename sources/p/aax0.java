package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aax0 extends yax0 {
    public final boolean a;
    public final String b;

    public aax0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aax0)) {
            return false;
        }
        aax0 aax0Var = (aax0) obj;
        return this.a == aax0Var.a && this.b.equals(aax0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
