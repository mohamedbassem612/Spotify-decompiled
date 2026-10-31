package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s6u0 extends t6u0 {
    public final int a;
    public final String b;

    public s6u0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6u0)) {
            return false;
        }
        s6u0 s6u0Var = (s6u0) obj;
        return this.a == s6u0Var.a && u890.j(this.b, s6u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
