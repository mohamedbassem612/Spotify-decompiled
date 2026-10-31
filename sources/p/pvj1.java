package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pvj1 implements s7c, tzg, sfu, j631 {
    public final String a;
    public final String b;
    public final x360 c;
    public final String d;
    public final String e;
    public final String f;
    public final n1x g;

    public pvj1(String str, String str2, String str3, String str4, String str5, n1x n1xVar, x360 x360Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = n1xVar;
    }

    @Override // p.tzg
    public final Set a() {
        String str = this.f;
        if (str == null) {
            str = "";
        }
        return Collections.singleton(str);
    }

    @Override // p.j631
    public final Set b() {
        return Collections.singleton(this.e);
    }

    @Override // p.sfu
    public final String c() {
        String str = this.f;
        return str == null ? "" : str;
    }

    @Override // p.s7c
    public final List d(int i, int i2) {
        k3h1 k3h1Var = new k3h1(i);
        String str = this.b;
        return Collections.singletonList(new tii0(this.a, k3h1Var, new mey0(str, str, this.e, this.d, this.c, this.f, this.g, (String) null, (String) null, 384)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvj1)) {
            return false;
        }
        pvj1 pvj1Var = (pvj1) obj;
        return this.a.equals(pvj1Var.a) && this.b.equals(pvj1Var.b) && u890.j(this.c, pvj1Var.c) && this.d.equals(pvj1Var.d) && this.e.equals(pvj1Var.e) && u890.j(this.f, pvj1Var.f) && this.g.equals(pvj1Var.g);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        int iD2 = cy30.d(cy30.d((iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return this.g.hashCode() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
