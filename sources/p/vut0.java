package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vut0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public vut0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vut0)) {
            return false;
        }
        vut0 vut0Var = (vut0) obj;
        return this.a.equals(vut0Var.a) && this.b == vut0Var.b && this.c == vut0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
