package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mkf0 implements nkf0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public mkf0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkf0)) {
            return false;
        }
        mkf0 mkf0Var = (mkf0) obj;
        return this.a == mkf0Var.a && this.b == mkf0Var.b && this.c == mkf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
