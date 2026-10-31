package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yq11 implements ar11 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final vq11 e;
    public final cqs0 f;

    public yq11(String str, String str2, String str3, int i, vq11 vq11Var, cqs0 cqs0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = vq11Var;
        this.f = cqs0Var;
    }

    public static yq11 a(yq11 yq11Var, int i, vq11 vq11Var, int i2) {
        String str = yq11Var.a;
        String str2 = yq11Var.b;
        String str3 = yq11Var.c;
        if ((i2 & 8) != 0) {
            i = yq11Var.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            vq11Var = yq11Var.e;
        }
        cqs0 cqs0Var = yq11Var.f;
        yq11Var.getClass();
        return new yq11(str, str2, str3, i3, vq11Var, cqs0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq11)) {
            return false;
        }
        yq11 yq11Var = (yq11) obj;
        return u890.j(this.a, yq11Var.a) && this.b.equals(yq11Var.b) && u890.j(this.c, yq11Var.c) && this.d == yq11Var.d && u890.j(this.e, yq11Var.e) && u890.j(this.f, yq11Var.f);
    }

    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        vq11 vq11Var = this.e;
        return this.f.hashCode() + ((iF + (vq11Var == null ? 0 : vq11Var.hashCode())) * 31);
    }
}
