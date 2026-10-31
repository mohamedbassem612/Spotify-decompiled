package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hbi0 implements s7c, tzg, sfu, niv0 {
    public final String a;
    public final String b;
    public final x360 c;
    public final String d;
    public final String e;
    public final n1x f;
    public final String g;

    public hbi0(String str, String str2, String str3, String str4, String str5, n1x n1xVar, x360 x360Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = str3;
        this.e = str4;
        this.f = n1xVar;
        this.g = str5;
    }

    @Override // p.tzg
    public final Set a() {
        return Collections.singleton(this.e);
    }

    @Override // p.niv0
    public final Set b() {
        String str = this.e;
        if (!bbp1.k(str)) {
            str = null;
        }
        return str != null ? Collections.singleton(str) : w7x.a;
    }

    @Override // p.sfu
    public final String c() {
        return this.e;
    }

    @Override // p.s7c
    public final List d(int i, int i2) {
        k3h1 k3h1Var = new k3h1(i);
        String str = this.g;
        if (str.length() <= 0) {
            str = null;
        }
        String str2 = str;
        String str3 = this.b;
        String str4 = this.e;
        return Collections.singletonList(new dbi0(this.a, k3h1Var, new mey0(str3, str3, str4, this.d, this.c, str4, this.f, str2, (String) null, 256)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbi0)) {
            return false;
        }
        hbi0 hbi0Var = (hbi0) obj;
        return this.a.equals(hbi0Var.a) && this.b.equals(hbi0Var.b) && u890.j(this.c, hbi0Var.c) && this.d.equals(hbi0Var.d) && this.e.equals(hbi0Var.e) && this.f.equals(hbi0Var.f) && this.g.equals(hbi0Var.g);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + cy30.d(cy30.d((iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d), 31, this.e)) * 31);
    }
}
