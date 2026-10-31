package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gtj1 extends ktj1 {
    public final int a;
    public final String b;

    public gtj1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtj1)) {
            return false;
        }
        gtj1 gtj1Var = (gtj1) obj;
        return this.a == gtj1Var.a && this.b.equals(gtj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
