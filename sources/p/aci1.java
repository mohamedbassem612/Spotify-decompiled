package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aci1 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public aci1(String str, int i, int i2, int i3, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aci1)) {
            return false;
        }
        aci1 aci1Var = (aci1) obj;
        return this.a == aci1Var.a && this.b == aci1Var.b && this.c == aci1Var.c && u890.j(this.d, aci1Var.d) && u890.j(this.e, aci1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }
}
