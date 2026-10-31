package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h02 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;

    public h02(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h02)) {
            return false;
        }
        h02 h02Var = (h02) obj;
        return this.a.equals(h02Var.a) && this.b.equals(h02Var.b) && this.c.equals(h02Var.c) && this.d.equals(h02Var.d) && this.e.equals(h02Var.e) && this.f.equals(h02Var.f) && this.g.equals(h02Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + f4i1.b(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false), 31, this.f);
    }
}
