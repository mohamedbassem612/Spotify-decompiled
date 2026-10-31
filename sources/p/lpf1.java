package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lpf1 implements mpf1 {
    public final boolean a;
    public final String b;

    public lpf1(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpf1)) {
            return false;
        }
        lpf1 lpf1Var = (lpf1) obj;
        return this.a == lpf1Var.a && this.b.equals(lpf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
