package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p5f1 extends q5f1 {
    public final String a;
    public final qtg b;

    public p5f1(String str, qtg qtgVar) {
        this.a = str;
        this.b = qtgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5f1)) {
            return false;
        }
        p5f1 p5f1Var = (p5f1) obj;
        return this.a.equals(p5f1Var.a) && this.b.equals(p5f1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
