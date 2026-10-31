package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tz51 {
    public final String a;
    public final String b;
    public final String c;
    public final LinkedHashMap d;
    public final boolean e;
    public final long f;
    public final tv80 g;

    public tz51(String str, String str2, String str3, LinkedHashMap linkedHashMap, boolean z, long j, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = linkedHashMap;
        this.e = z;
        this.f = j;
        this.g = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz51)) {
            return false;
        }
        tz51 tz51Var = (tz51) obj;
        return u890.j(this.a, tz51Var.a) && u890.j(this.b, tz51Var.b) && u890.j(this.c, tz51Var.c) && this.d.equals(tz51Var.d) && this.e == tz51Var.e && this.f == tz51Var.f && u890.j(this.g, tz51Var.g);
    }

    public final int hashCode() {
        int iF = cy30.f(xcg1.g((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), this.f, 31);
        tv80 tv80Var = this.g;
        return iF + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
