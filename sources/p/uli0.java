package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uli0 implements xli0 {
    public final int a;
    public final String b;

    public uli0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uli0)) {
            return false;
        }
        uli0 uli0Var = (uli0) obj;
        return this.a == uli0Var.a && u890.j(this.b, uli0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
