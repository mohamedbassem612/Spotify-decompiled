package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class juj1 extends muj1 {
    public final int a;
    public final String b;

    public juj1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juj1)) {
            return false;
        }
        juj1 juj1Var = (juj1) obj;
        return this.a == juj1Var.a && u890.j(this.b, juj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
