package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mor0 {
    public final String a;
    public final zma1 b;

    public mor0(String str, zma1 zma1Var) {
        this.a = str;
        this.b = zma1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mor0)) {
            return false;
        }
        mor0 mor0Var = (mor0) obj;
        return this.a.equals(mor0Var.a) && u890.j(this.b, mor0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
