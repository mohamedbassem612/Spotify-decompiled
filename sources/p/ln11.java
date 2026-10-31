package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ln11 extends pn11 {
    public final int a;
    public final String b;

    public ln11(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln11)) {
            return false;
        }
        ln11 ln11Var = (ln11) obj;
        return this.a == ln11Var.a && this.b.equals(ln11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
