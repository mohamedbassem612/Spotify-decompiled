package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rh40 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final String f;

    public rh40(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh40)) {
            return false;
        }
        rh40 rh40Var = (rh40) obj;
        return this.a.equals(rh40Var.a) && this.b.equals(rh40Var.b) && this.c.equals(rh40Var.c) && this.d.equals(rh40Var.d) && this.e.equals(rh40Var.e) && this.f.equals(rh40Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p3d1.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
