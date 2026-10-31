package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bm21 implements vi0 {
    public final int a;
    public final String b;

    public bm21(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm21)) {
            return false;
        }
        bm21 bm21Var = (bm21) obj;
        return this.a == bm21Var.a && u890.j(this.b, bm21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
