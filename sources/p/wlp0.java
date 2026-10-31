package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wlp0 {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;

    public wlp0(int i, boolean z, String str, int i2, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = z;
    }

    public static wlp0 a(wlp0 wlp0Var, int i, String str, int i2, String str2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = wlp0Var.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            str = wlp0Var.b;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            i2 = wlp0Var.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = wlp0Var.d;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            z = wlp0Var.e;
        }
        return new wlp0(i4, z, str3, i5, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlp0)) {
            return false;
        }
        wlp0 wlp0Var = (wlp0) obj;
        return this.a == wlp0Var.a && u890.j(this.b, wlp0Var.b) && this.c == wlp0Var.c && u890.j(this.d, wlp0Var.d) && this.e == wlp0Var.e;
    }

    public final int hashCode() {
        int i = this.a;
        int iD = cy30.d((i == 0 ? 0 : l1d.C(i)) * 31, 31, this.b);
        int i2 = this.c;
        return Boolean.hashCode(this.e) + cy30.d((iD + (i2 != 0 ? l1d.C(i2) : 0)) * 31, 31, this.d);
    }
}
