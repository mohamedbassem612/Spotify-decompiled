package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g9w0 implements k9w0 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final ArrayList f;
    public final String g;
    public final h290 h;

    public g9w0(String str, String str2, String str3, Integer num, boolean z, ArrayList arrayList, String str4, h290 h290Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = z;
        this.f = arrayList;
        this.g = str4;
        this.h = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9w0)) {
            return false;
        }
        g9w0 g9w0Var = (g9w0) obj;
        return this.a.equals(g9w0Var.a) && this.b.equals(g9w0Var.b) && this.c.equals(g9w0Var.c) && u890.j(this.d, g9w0Var.d) && this.e == g9w0Var.e && this.f.equals(g9w0Var.f) && u890.j(this.g, g9w0Var.g) && this.h.equals(g9w0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iF = p3d1.f(this.f, xcg1.g((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31);
        String str = this.g;
        return this.h.hashCode() + ((iF + (str != null ? str.hashCode() : 0)) * 31);
    }
}
