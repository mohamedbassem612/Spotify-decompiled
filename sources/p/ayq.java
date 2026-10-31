package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ayq {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ayq(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public static ayq a(ayq ayqVar, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            list = ayqVar.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = ayqVar.b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = ayqVar.c;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            z3 = ayqVar.d;
        }
        boolean z8 = z3;
        if ((i & 16) != 0) {
            z4 = ayqVar.e;
        }
        boolean z9 = z4;
        if ((i & 32) != 0) {
            z5 = ayqVar.f;
        }
        return new ayq(list2, z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayq)) {
            return false;
        }
        ayq ayqVar = (ayq) obj;
        return this.a.equals(ayqVar.a) && this.b == ayqVar.b && this.c == ayqVar.c && this.d == ayqVar.d && this.e == ayqVar.e && this.f == ayqVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
