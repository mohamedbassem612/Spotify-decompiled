package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jtj1 extends ktj1 {
    public final int a;
    public final String b;

    public jtj1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtj1)) {
            return false;
        }
        jtj1 jtj1Var = (jtj1) obj;
        return this.a == jtj1Var.a && u890.j(this.b, jtj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
