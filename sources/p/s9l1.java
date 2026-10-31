package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s9l1 {
    public final z0i a;
    public final List b;
    public final dlr0 c;
    public final String d;
    public final r3t0 e;
    public final cbq0 f;
    public final wt91 g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public s9l1(z0i z0iVar, List list, dlr0 dlr0Var, String str, r3t0 r3t0Var, cbq0 cbq0Var, wt91 wt91Var, boolean z, boolean z2, String str2) {
        this.a = z0iVar;
        this.b = list;
        this.c = dlr0Var;
        this.d = str;
        this.e = r3t0Var;
        this.f = cbq0Var;
        this.g = wt91Var;
        this.h = z;
        this.i = z2;
        this.j = str2;
    }

    public static s9l1 a(s9l1 s9l1Var, ArrayList arrayList, dlr0 dlr0Var, wt91 wt91Var, int i) {
        z0i z0iVar = s9l1Var.a;
        String str = s9l1Var.d;
        r3t0 r3t0Var = s9l1Var.e;
        cbq0 cbq0Var = s9l1Var.f;
        if ((i & 64) != 0) {
            wt91Var = s9l1Var.g;
        }
        return new s9l1(z0iVar, arrayList, dlr0Var, str, r3t0Var, cbq0Var, wt91Var, s9l1Var.h, s9l1Var.i, s9l1Var.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9l1)) {
            return false;
        }
        s9l1 s9l1Var = (s9l1) obj;
        return u890.j(this.a, s9l1Var.a) && this.b.equals(s9l1Var.b) && u890.j(this.c, s9l1Var.c) && this.d.equals(s9l1Var.d) && u890.j(this.e, s9l1Var.e) && u890.j(this.f, s9l1Var.f) && u890.j(this.g, s9l1Var.g) && this.h == s9l1Var.h && this.i == s9l1Var.i && this.j.equals(s9l1Var.j);
    }

    public final int hashCode() {
        z0i z0iVar = this.a;
        int iB = f4i1.b((z0iVar == null ? 0 : z0iVar.hashCode()) * 31, 31, this.b);
        dlr0 dlr0Var = this.c;
        int iD = cy30.d((iB + (dlr0Var == null ? 0 : dlr0Var.hashCode())) * 31, 31, this.d);
        r3t0 r3t0Var = this.e;
        int iHashCode = (iD + (r3t0Var == null ? 0 : r3t0Var.a.hashCode())) * 31;
        cbq0 cbq0Var = this.f;
        int iHashCode2 = (iHashCode + (cbq0Var == null ? 0 : cbq0Var.hashCode())) * 31;
        wt91 wt91Var = this.g;
        return this.j.hashCode() + xcg1.g(xcg1.g((iHashCode2 + (wt91Var != null ? wt91Var.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }
}
