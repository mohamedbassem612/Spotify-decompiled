package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class skf {
    public final String a;
    public final ctf b;
    public final w4i1 c;
    public final ArrayList d;
    public final boolean e;
    public final qkf f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public skf(String str, ctf ctfVar, w4i1 w4i1Var, ArrayList arrayList, boolean z, qkf qkfVar, int i, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = ctfVar;
        this.c = w4i1Var;
        this.d = arrayList;
        this.e = z;
        this.f = qkfVar;
        this.g = i;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skf)) {
            return false;
        }
        skf skfVar = (skf) obj;
        return u890.j(this.a, skfVar.a) && u890.j(this.b, skfVar.b) && u890.j(this.c, skfVar.c) && this.d.equals(skfVar.d) && this.e == skfVar.e && this.f.equals(skfVar.f) && this.g == skfVar.g && this.h == skfVar.h && this.i == skfVar.i && this.j == skfVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + xcg1.g(xcg1.g(kaa0.f(this.g, (this.f.hashCode() + xcg1.g(p3d1.f(this.d, ydh.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e)) * 31, 31), 31, this.h), 31, this.i);
    }
}
