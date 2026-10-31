package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nk {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final ArrayList f;
    public final int g;
    public final im h;
    public final int i;
    public final int j;
    public final String k;
    public final int l;

    public nk(int i, String str, boolean z, boolean z2, long j, ArrayList arrayList, int i2, im imVar, int i3, int i4, String str2, int i5) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = arrayList;
        this.g = i2;
        this.h = imVar;
        this.i = i3;
        this.j = i4;
        this.k = str2;
        this.l = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk)) {
            return false;
        }
        nk nkVar = (nk) obj;
        return this.a == nkVar.a && this.b.equals(nkVar.b) && this.c == nkVar.c && this.d == nkVar.d && this.e == nkVar.e && this.f.equals(nkVar.f) && this.g == nkVar.g && this.h.equals(nkVar.h) && this.i == nkVar.i && this.j == nkVar.j && this.k.equals(nkVar.k) && this.l == nkVar.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + cy30.d(ab80.k(this.j, kaa0.f(this.i, (this.h.hashCode() + kaa0.f(this.g, p3d1.f(this.f, cy30.f(xcg1.g(xcg1.g(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), 31), 31)) * 31, 31), 31), 31, this.k);
    }
}
