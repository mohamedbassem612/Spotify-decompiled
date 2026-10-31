package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dnu0 {
    public final String a;
    public final String b;
    public final String c;
    public final w4i1 d;
    public final ArrayList e;
    public final boolean f;
    public final boolean g;
    public final hvw h;

    public dnu0(String str, String str2, String str3, w4i1 w4i1Var, ArrayList arrayList, boolean z, boolean z2, hvw hvwVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = w4i1Var;
        this.e = arrayList;
        this.f = z;
        this.g = z2;
        this.h = hvwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dnu0) {
            dnu0 dnu0Var = (dnu0) obj;
            return u890.j(this.a, dnu0Var.a) && u890.j(this.b, dnu0Var.b) && u890.j(this.c, dnu0Var.c) && u890.j(this.d, dnu0Var.d) && this.e.equals(dnu0Var.e) && this.f == dnu0Var.f && this.g == dnu0Var.g && this.h == dnu0Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(xcg1.g(p3d1.f(this.e, ydh.d(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }
}
