package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fu31 {
    public final int a;
    public final ftv b;
    public final ftv c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final eu31 g;
    public final boolean h;
    public final vu30 i;
    public final Map j;

    public /* synthetic */ fu31(int i, ftv ftvVar, ftv ftvVar2, boolean z, boolean z2, boolean z3, boolean z4, Map map, int i2) {
        this((i2 & 1) != 0 ? 0 : i, ftvVar, (i2 & 4) != 0 ? null : ftvVar2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3, null, (i2 & 128) != 0 ? false : z4, null, (i2 & 512) != 0 ? b7x.a : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu31)) {
            return false;
        }
        fu31 fu31Var = (fu31) obj;
        return this.a == fu31Var.a && u890.j(this.b, fu31Var.b) && u890.j(this.c, fu31Var.c) && this.d == fu31Var.d && this.e == fu31Var.e && this.f == fu31Var.f && u890.j(this.g, fu31Var.g) && this.h == fu31Var.h && u890.j(this.i, fu31Var.i) && u890.j(this.j, fu31Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        ftv ftvVar = this.c;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode + (ftvVar == null ? 0 : ftvVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        eu31 eu31Var = this.g;
        int iG2 = xcg1.g((iG + (eu31Var == null ? 0 : eu31Var.hashCode())) * 31, 31, this.h);
        vu30 vu30Var = this.i;
        return this.j.hashCode() + ((iG2 + (vu30Var != null ? vu30Var.hashCode() : 0)) * 31);
    }

    public fu31(int i, ftv ftvVar, ftv ftvVar2, boolean z, boolean z2, boolean z3, eu31 eu31Var, boolean z4, j2i j2iVar, Map map) {
        this.a = i;
        this.b = ftvVar;
        this.c = ftvVar2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = eu31Var;
        this.h = z4;
        this.i = j2iVar;
        this.j = map;
    }
}
