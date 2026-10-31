package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/cw61;", "Lp/uim0;", "Lp/n6b;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class cw61 extends uim0 {
    public final float a;
    public final hw61 b;
    public final boolean c;
    public final long d;
    public final long e;

    public cw61(float f, hw61 hw61Var, boolean z, long j, long j2) {
        this.a = f;
        this.b = hw61Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    public final pim0 a() {
        return new n6b(new waq0(this, (byte) 19));
    }

    public final void b(pim0 pim0Var) {
        n6b n6bVar = (n6b) pim0Var;
        waq0 waq0Var = new waq0(this, (byte) 19);
        n6bVar.O0 = waq0Var;
        dio1.E(n6bVar, waq0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw61)) {
            return false;
        }
        cw61 cw61Var = (cw61) obj;
        if (!p3v.c(this.a, cw61Var.a) || !u890.j(this.b, cw61Var.b) || this.c != cw61Var.c) {
            return false;
        }
        long j = cw61Var.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && z4h1.b(this.e, cw61Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
        int i = u7h.l;
        return Long.hashCode(this.e) + cy30.f(iG, this.d, 31);
    }

    public final String toString() {
        String strD = p3v.d(this.a);
        String strH = u7h.h(this.d);
        String strH2 = u7h.h(this.e);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strD);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        sb.append(strH);
        sb.append(", spotColor=");
        return l1d.n(strH2, ")", sb);
    }
}
