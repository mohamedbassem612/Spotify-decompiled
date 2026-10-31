package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kiw0 extends oiw0 {
    public final String a;
    public final String b = "";
    public final boolean c;
    public final boolean d;

    public kiw0(String str, boolean z, boolean z2) {
        this.a = str;
        this.c = z;
        this.d = z2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiw0)) {
            return false;
        }
        kiw0 kiw0Var = (kiw0) obj;
        return u890.j(this.a, kiw0Var.a) && this.b.equals(kiw0Var.b) && this.c == kiw0Var.c && this.d == kiw0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
