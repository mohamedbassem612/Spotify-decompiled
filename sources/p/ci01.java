package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ci01 {
    public final bi01 a;
    public final String b;

    public ci01(bi01 bi01Var, String str) {
        this.a = bi01Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci01)) {
            return false;
        }
        ci01 ci01Var = (ci01) obj;
        return this.a.equals(ci01Var.a) && u890.j(this.b, ci01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
