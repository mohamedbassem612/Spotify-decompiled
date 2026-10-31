package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f1m1 implements r1m1 {
    public final e58 a;
    public final String b;

    public f1m1(e58 e58Var, String str) {
        this.a = e58Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1m1)) {
            return false;
        }
        f1m1 f1m1Var = (f1m1) obj;
        return this.a.equals(f1m1Var.a) && this.b.equals(f1m1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
