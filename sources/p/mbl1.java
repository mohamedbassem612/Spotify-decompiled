package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mbl1 {
    public final String a;
    public final tr80 b;
    public final int c;

    public mbl1(String str, tr80 tr80Var, int i) {
        this.a = str;
        this.b = tr80Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbl1)) {
            return false;
        }
        mbl1 mbl1Var = (mbl1) obj;
        return this.a.equals(mbl1Var.a) && this.b.equals(mbl1Var.b) && this.c == mbl1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + lf51.e(this.a.hashCode() * 31, 31, this.b);
    }
}
