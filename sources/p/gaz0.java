package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gaz0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public gaz0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaz0)) {
            return false;
        }
        gaz0 gaz0Var = (gaz0) obj;
        return u890.j(this.a, gaz0Var.a) && this.b == gaz0Var.b && this.c == gaz0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
