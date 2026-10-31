package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class exr0 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public exr0(boolean z, boolean z2, String str, String str2, String str3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exr0)) {
            return false;
        }
        exr0 exr0Var = (exr0) obj;
        return this.a == exr0Var.a && this.b == exr0Var.b && this.c.equals(exr0Var.c) && this.d.equals(exr0Var.d) && this.e.equals(exr0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
