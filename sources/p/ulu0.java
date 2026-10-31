package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ulu0 {
    public static final tlu0 Companion = new tlu0();
    public static final znb0[] i = {null, null, null, null, dm5.S(2, tnt0.O0), null, null, null};
    public final String a;
    public final String b;
    public final pi90 c;
    public final int d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public /* synthetic */ ulu0(int i2, String str, String str2, pi90 pi90Var, int i3, List list, boolean z, boolean z2, boolean z3) {
        if (23 != (i2 & 23)) {
            o6p1.t(i2, 23, slu0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = pi90Var;
        if ((i2 & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        this.e = list;
        if ((i2 & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i2 & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        if ((i2 & 128) == 0) {
            this.h = false;
        } else {
            this.h = z3;
        }
    }

    public final String a() {
        return l1d.m("spotify:track:", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulu0)) {
            return false;
        }
        ulu0 ulu0Var = (ulu0) obj;
        return u890.j(this.a, ulu0Var.a) && u890.j(this.b, ulu0Var.b) && u890.j(this.c, ulu0Var.c) && this.d == ulu0Var.d && u890.j(this.e, ulu0Var.e) && this.f == ulu0Var.f && this.g == ulu0Var.g && this.h == ulu0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g(f4i1.b(kaa0.f(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
    }
}
