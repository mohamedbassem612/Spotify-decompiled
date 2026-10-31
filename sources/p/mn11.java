package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mn11 extends pn11 {
    public final int a;
    public final String b;

    public mn11(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn11)) {
            return false;
        }
        mn11 mn11Var = (mn11) obj;
        return this.a == mn11Var.a && this.b.equals(mn11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
