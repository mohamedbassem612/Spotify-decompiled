package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fws0 {
    public final List a;
    public final int b;
    public final int c;
    public final Integer d;
    public final int e;
    public final boolean f;
    public final String g;
    public final String h;

    public fws0(List list, int i, int i2, Integer num, int i3, boolean z, String str, String str2) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = num;
        this.e = i3;
        this.f = z;
        this.g = str;
        this.h = str2;
    }

    public static fws0 a(fws0 fws0Var, int i) {
        List list = fws0Var.a;
        int i2 = fws0Var.b;
        int i3 = fws0Var.c;
        Integer num = fws0Var.d;
        boolean z = fws0Var.f;
        String str = fws0Var.g;
        String str2 = fws0Var.h;
        fws0Var.getClass();
        return new fws0(list, i2, i3, num, i, z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fws0)) {
            return false;
        }
        fws0 fws0Var = (fws0) obj;
        return u890.j(this.a, fws0Var.a) && this.b == fws0Var.b && this.c == fws0Var.c && u890.j(this.d, fws0Var.d) && this.e == fws0Var.e && this.f == fws0Var.f && u890.j(this.g, fws0Var.g) && u890.j(this.h, fws0Var.h);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        int iG = xcg1.g(kaa0.f(this.e, (iF + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f);
        String str = this.g;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
