package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fwq {
    public final List a;
    public final il51 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final sfu0 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public fwq(List list, il51 il51Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, sfu0 sfu0Var, boolean z7, boolean z8, boolean z9) {
        this.a = list;
        this.b = il51Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = sfu0Var;
        this.j = z7;
        this.k = z8;
        this.l = z9;
    }

    public static fwq a(fwq fwqVar, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, sfu0 sfu0Var, boolean z6, boolean z7, boolean z8, int i) {
        return new fwq((i & 1) != 0 ? fwqVar.a : arrayList, fwqVar.b, (i & 4) != 0 ? fwqVar.c : z, (i & 8) != 0 ? fwqVar.d : z2, (i & 16) != 0 ? fwqVar.e : z3, (i & 32) != 0 ? fwqVar.f : z4, (i & 64) != 0 ? fwqVar.g : z5, fwqVar.h, (i & 256) != 0 ? fwqVar.i : sfu0Var, (i & 512) != 0 ? fwqVar.j : z6, (i & 1024) != 0 ? fwqVar.k : z7, (i & 2048) != 0 ? fwqVar.l : z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwq)) {
            return false;
        }
        fwq fwqVar = (fwq) obj;
        return u890.j(this.a, fwqVar.a) && this.b.equals(fwqVar.b) && this.c == fwqVar.c && this.d == fwqVar.d && this.e == fwqVar.e && this.f == fwqVar.f && this.g == fwqVar.g && this.h == fwqVar.h && u890.j(this.i, fwqVar.i) && this.j == fwqVar.j && this.k == fwqVar.k && this.l == fwqVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + xcg1.g(xcg1.g((this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k);
    }
}
