package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r0i0 {
    public static final r0i0 o;
    public final int a;
    public final long b;
    public final float c;
    public final Bundle d;
    public final mgz e;
    public final String f;
    public final int g;
    public final y0i0 h;
    public final w0i0 i;
    public final long j;
    public final j2i0 k;
    public final List l;
    public final sp91 m;
    public final boolean n;

    static {
        int i = 6;
        long j = 0;
        float f = 0.0f;
        Bundle bundle = null;
        mgz mgzVar = null;
        String str = null;
        o = new r0i0(i, j, f, bundle, mgzVar, str, 0, null, null, 0L, null, null, null, false, 16382);
    }

    public /* synthetic */ r0i0(int i, long j, float f, Bundle bundle, mgz mgzVar, String str, int i2, y0i0 y0i0Var, w0i0 w0i0Var, long j2, j2i0 j2i0Var, ArrayList arrayList, sp91 sp91Var, boolean z, int i3) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? -1L : j, (i3 & 4) != 0 ? 0.0f : f, (i3 & 8) != 0 ? Bundle.EMPTY : bundle, (i3 & 16) != 0 ? null : mgzVar, (i3 & 32) != 0 ? null : str, (i3 & 64) == 0 ? i2 : 1, (i3 & 128) != 0 ? y0i0.a : y0i0Var, (i3 & 256) != 0 ? new w0i0() : w0i0Var, (i3 & 512) == 0 ? j2 : -1L, (i3 & 1024) != 0 ? null : j2i0Var, (i3 & 2048) != 0 ? hhh0.b0 : arrayList, (i3 & 4096) != 0 ? null : sp91Var, (i3 & 8192) != 0 ? false : z);
    }

    public static r0i0 a(r0i0 r0i0Var, String str, int i) {
        return new r0i0(r0i0Var.a, r0i0Var.b, r0i0Var.c, r0i0Var.d, (i & 16) != 0 ? r0i0Var.e : mgz.f, str, r0i0Var.g, r0i0Var.h, r0i0Var.i, r0i0Var.j, r0i0Var.k, r0i0Var.l, r0i0Var.m, r0i0Var.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0i0)) {
            return false;
        }
        r0i0 r0i0Var = (r0i0) obj;
        return this.a == r0i0Var.a && i2p1.l(this.b, r0i0Var.b) && l2p1.j(this.c, r0i0Var.c) && u890.j(this.d, r0i0Var.d) && this.e == r0i0Var.e && u890.j(this.f, r0i0Var.f) && this.g == r0i0Var.g && this.h == r0i0Var.h && u890.j(this.i, r0i0Var.i) && h1p1.k(this.j, r0i0Var.j) && u890.j(this.k, r0i0Var.k) && u890.j(this.l, r0i0Var.l) && u890.j(this.m, r0i0Var.m) && this.n == r0i0Var.n;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((l2p1.n(this.c) + ((i2p1.m(this.b) + (l1d.C(this.a) * 31)) * 31)) * 31)) * 31;
        mgz mgzVar = this.e;
        int iHashCode2 = (iHashCode + (mgzVar == null ? 0 : mgzVar.hashCode())) * 31;
        String str = this.f;
        int iM = (h1p1.m(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ab80.k(this.g, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31)) * 31)) * 31;
        j2i0 j2i0Var = this.k;
        int iB = f4i1.b((iM + (j2i0Var == null ? 0 : j2i0Var.hashCode())) * 31, 31, this.l);
        sp91 sp91Var = this.m;
        return Boolean.hashCode(this.n) + ((iB + (sp91Var != null ? sp91Var.hashCode() : 0)) * 31);
    }

    public r0i0(int i, long j, float f, Bundle bundle, mgz mgzVar, String str, int i2, y0i0 y0i0Var, w0i0 w0i0Var, long j2, j2i0 j2i0Var, List list, sp91 sp91Var, boolean z) {
        this.a = i;
        this.b = j;
        this.c = f;
        this.d = bundle;
        this.e = mgzVar;
        this.f = str;
        this.g = i2;
        this.h = y0i0Var;
        this.i = w0i0Var;
        this.j = j2;
        this.k = j2i0Var;
        this.l = list;
        this.m = sp91Var;
        this.n = z;
    }
}
