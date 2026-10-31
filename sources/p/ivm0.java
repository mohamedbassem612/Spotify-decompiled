package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ivm0 {
    public final String a;
    public final int b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i = "";

    public ivm0(int i, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivm0)) {
            return false;
        }
        ivm0 ivm0Var = (ivm0) obj;
        return this.a.equals(ivm0Var.a) && this.b == ivm0Var.b && this.c.equals(ivm0Var.c) && this.d.equals(ivm0Var.d) && this.e.equals(ivm0Var.e) && this.f.equals(ivm0Var.f) && this.g.equals(ivm0Var.g) && this.h.equals(ivm0Var.h) && this.i.equals(ivm0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(p3d1.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
