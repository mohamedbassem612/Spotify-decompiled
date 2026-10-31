package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o300 implements x600 {
    public final String a;
    public final sz21 b;

    public o300(String str, sz21 sz21Var) {
        this.a = str;
        this.b = sz21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o300)) {
            return false;
        }
        o300 o300Var = (o300) obj;
        return u890.j(this.a, o300Var.a) && this.b.equals(o300Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
