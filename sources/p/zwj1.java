package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwj1 implements ywj1 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final Uri e;
    public final boolean f;
    public final zuc0 g;
    public final int h;
    public final c380 i;

    public zwj1(String str, int i, String str2, String str3, Uri uri, boolean z, zuc0 zuc0Var, int i2, c380 c380Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = uri;
        this.f = z;
        this.g = zuc0Var;
        this.h = i2;
        this.i = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwj1)) {
            return false;
        }
        zwj1 zwj1Var = (zwj1) obj;
        return u890.j(this.a, zwj1Var.a) && this.b == zwj1Var.b && u890.j(this.c, zwj1Var.c) && this.d.equals(zwj1Var.d) && this.e.equals(zwj1Var.e) && this.f == zwj1Var.f && u890.j(this.g, zwj1Var.g) && this.h == zwj1Var.h && u890.j(this.i, zwj1Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(hrt.h(this.e, cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31), 31, this.f);
        zuc0 zuc0Var = this.g;
        return this.i.hashCode() + ab80.k(this.h, (iG + (zuc0Var == null ? 0 : zuc0Var.hashCode())) * 31, 31);
    }
}
