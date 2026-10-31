package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o6u0 {
    public final int a;
    public final r2p1 b;
    public final String c;
    public final String d;
    public final blc0 e;

    public o6u0(int i, r2p1 r2p1Var, String str, String str2, blc0 blc0Var) {
        this.a = i;
        this.b = r2p1Var;
        this.c = str;
        this.d = str2;
        this.e = blc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6u0)) {
            return false;
        }
        o6u0 o6u0Var = (o6u0) obj;
        return this.a == o6u0Var.a && this.b.equals(o6u0Var.b) && this.c.equals(o6u0Var.c) && this.d.equals(o6u0Var.d) && this.e == o6u0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
    }
}
