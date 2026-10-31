package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ocd1 {
    public final vxy0 a;
    public final String b;
    public final String c;
    public final gwt d;
    public final int e;

    public ocd1(vxy0 vxy0Var, String str, String str2, gwt gwtVar, int i) {
        String str3 = Build.VERSION.RELEASE;
        this.a = vxy0Var;
        this.b = str;
        this.c = str2;
        this.d = gwtVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocd1)) {
            return false;
        }
        ocd1 ocd1Var = (ocd1) obj;
        if (!this.a.equals(ocd1Var.a) || !this.b.equals(ocd1Var.b)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return u890.j(str, str) && u890.j(this.c, ocd1Var.c) && u890.j(this.d, ocd1Var.d) && this.e == ocd1Var.e;
    }

    public final int hashCode() {
        int iK = ab80.k(1, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, Build.VERSION.RELEASE), 31);
        String str = this.c;
        return l1d.C(this.e) + ((this.d.hashCode() + ((iK + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
