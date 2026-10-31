package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class nxy0 {
    public static final mxy0 Companion = new mxy0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ nxy0(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        if (63 != (i & 63)) {
            o6p1.t(i, 63, lxy0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxy0)) {
            return false;
        }
        nxy0 nxy0Var = (nxy0) obj;
        return u890.j(this.a, nxy0Var.a) && u890.j(this.b, nxy0Var.b) && u890.j(this.c, nxy0Var.c) && u890.j(this.d, nxy0Var.d) && u890.j(this.e, nxy0Var.e) && u890.j(this.f, nxy0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public nxy0(String str, String str2, String str3) {
        String str4 = Build.VERSION.RELEASE;
        this.a = "Android";
        this.b = str;
        this.c = "prod";
        this.d = str2;
        this.e = str4;
        this.f = str3;
    }
}
