package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jnd1 extends knd1 {
    public final int a;
    public final String b;

    public jnd1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnd1)) {
            return false;
        }
        jnd1 jnd1Var = (jnd1) obj;
        return this.a == jnd1Var.a && u890.j(this.b, jnd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
