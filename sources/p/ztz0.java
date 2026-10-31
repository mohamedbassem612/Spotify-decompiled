package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ztz0 implements duz0 {
    public final String a;
    public final int b;
    public final boolean c;

    public ztz0(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztz0)) {
            return false;
        }
        ztz0 ztz0Var = (ztz0) obj;
        return u890.j(this.a, ztz0Var.a) && this.b == ztz0Var.b && this.c == ztz0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
