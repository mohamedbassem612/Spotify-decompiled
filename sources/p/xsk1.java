package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xsk1 {
    public final Double a;
    public final Double b;
    public final l0l c;
    public final int d;
    public final h06 e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final Map j;
    public final Set k;

    public xsk1(Double d, Double d2, l0l l0lVar, int i, h06 h06Var, boolean z, int i2, boolean z2, boolean z3, Map map, Set set) {
        this.a = d;
        this.b = d2;
        this.c = l0lVar;
        this.d = i;
        this.e = h06Var;
        this.f = z;
        this.g = i2;
        this.h = z2;
        this.i = z3;
        this.j = map;
        this.k = set;
    }

    public static xsk1 a(xsk1 xsk1Var, Double d, Double d2, l0l l0lVar, int i, h06 h06Var, boolean z, int i2, boolean z2, Map map, Set set, int i3) {
        if ((i3 & 1) != 0) {
            d = xsk1Var.a;
        }
        Double d3 = d;
        if ((i3 & 2) != 0) {
            d2 = xsk1Var.b;
        }
        Double d4 = d2;
        if ((i3 & 4) != 0) {
            l0lVar = xsk1Var.c;
        }
        l0l l0lVar2 = l0lVar;
        int i4 = (i3 & 8) != 0 ? xsk1Var.d : i;
        h06 h06Var2 = (i3 & 16) != 0 ? xsk1Var.e : h06Var;
        boolean z3 = (i3 & 32) != 0 ? xsk1Var.f : z;
        int i5 = (i3 & 64) != 0 ? xsk1Var.g : i2;
        boolean z4 = (i3 & 128) != 0 ? xsk1Var.h : z2;
        boolean z5 = xsk1Var.i;
        Map map2 = (i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? xsk1Var.j : map;
        Set set2 = (i3 & 1024) != 0 ? xsk1Var.k : set;
        xsk1Var.getClass();
        return new xsk1(d3, d4, l0lVar2, i4, h06Var2, z3, i5, z4, z5, map2, set2);
    }

    public final k0u b() {
        Double d = this.g == 1 ? this.b : this.a;
        if (d != null) {
            return new k0u(d.doubleValue(), this.c);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsk1)) {
            return false;
        }
        xsk1 xsk1Var = (xsk1) obj;
        return u890.j(this.a, xsk1Var.a) && u890.j(this.b, xsk1Var.b) && u890.j(this.c, xsk1Var.c) && this.d == xsk1Var.d && this.e == xsk1Var.e && this.f == xsk1Var.f && this.g == xsk1Var.g && this.h == xsk1Var.h && this.i == xsk1Var.i && u890.j(this.j, xsk1Var.j) && u890.j(this.k, xsk1Var.k);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        l0l l0lVar = this.c;
        int iHashCode3 = (iHashCode2 + (l0lVar == null ? 0 : l0lVar.hashCode())) * 31;
        int i = this.d;
        return this.k.hashCode() + cy30.e(xcg1.g(xcg1.g(ab80.k(this.g, xcg1.g((this.e.hashCode() + ((iHashCode3 + (i != 0 ? l1d.C(i) : 0)) * 31)) * 31, 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xsk1(int i, boolean z) {
        z = (i & 256) != 0 ? false : z;
        this(null, null, null, 0, h06.a, false, 1, true, z, b7x.a, w7x.a);
    }
}
