package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gtv {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final int j;

    public /* synthetic */ gtv(boolean z, boolean z2, boolean z3, ArrayList arrayList, int i, int i2) {
        this((i2 & 1) != 0 ? false : z, false, false, false, (i2 & 16) != 0 ? false : z2, null, false, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? z6x.a : arrayList, (i2 & 512) != 0 ? 10 : i);
    }

    public static gtv a(gtv gtvVar, boolean z, boolean z2, boolean z3, Integer num, boolean z4, int i) {
        boolean z5 = gtvVar.a;
        if ((i & 2) != 0) {
            z = gtvVar.b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = gtvVar.c;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            z3 = gtvVar.d;
        }
        boolean z8 = z3;
        boolean z9 = (i & 16) != 0 ? gtvVar.e : false;
        if ((i & 32) != 0) {
            num = gtvVar.f;
        }
        Integer num2 = num;
        boolean z10 = (i & 64) != 0 ? gtvVar.g : z4;
        boolean z11 = gtvVar.h;
        List list = gtvVar.i;
        int i2 = gtvVar.j;
        gtvVar.getClass();
        return new gtv(z5, z6, z7, z8, z9, num2, z10, z11, list, i2);
    }

    public final boolean b() {
        return this.g;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtv)) {
            return false;
        }
        gtv gtvVar = (gtv) obj;
        return this.a == gtvVar.a && this.b == gtvVar.b && this.c == gtvVar.c && this.d == gtvVar.d && this.e == gtvVar.e && u890.j(this.f, gtvVar.f) && this.g == gtvVar.g && this.h == gtvVar.h && u890.j(this.i, gtvVar.i) && this.j == gtvVar.j;
    }

    public final boolean f() {
        return this.b;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return Integer.hashCode(this.j) + f4i1.b(xcg1.g(xcg1.g((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public gtv(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, boolean z6, boolean z7, List list, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = num;
        this.g = z6;
        this.h = z7;
        this.i = list;
        this.j = i;
    }
}
