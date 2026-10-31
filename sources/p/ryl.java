package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ryl;", "Lp/uim0;", "Lp/syl;", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ryl extends uim0 {
    public final boolean X;
    public final ri7 Y;
    public final String Z;
    public final zy70 a;
    public final rf01 b;
    public final gi7 c;
    public final iu30 d;
    public final iu30 e;
    public final int f;
    public final tl3 g;
    public final j6m h;
    public final float i;
    public final ColorFilter t;

    public ryl(zy70 zy70Var, rf01 rf01Var, gi7 gi7Var, iu30 iu30Var, iu30 iu30Var2, int i, tl3 tl3Var, j6m j6mVar, float f, ColorFilter colorFilter, boolean z, ri7 ri7Var, String str) {
        this.a = zy70Var;
        this.b = rf01Var;
        this.c = gi7Var;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = i;
        this.g = tl3Var;
        this.h = j6mVar;
        this.i = f;
        this.t = colorFilter;
        this.X = z;
        this.Y = ri7Var;
        this.Z = str;
    }

    public final pim0 a() {
        gi7 gi7Var = this.c;
        rf01 rf01Var = this.b;
        zy70 zy70Var = this.a;
        hi7 hi7Var = new hi7(rf01Var, zy70Var, gi7Var);
        ni7 ni7Var = new ni7(hi7Var);
        ni7Var.N0 = this.d;
        ni7Var.O0 = this.e;
        ni7Var.P0 = this.h;
        ni7Var.Q0 = this.f;
        ni7Var.R0 = this.Y;
        ni7Var.k(hi7Var);
        z291 z291Var = zy70Var.p;
        return new syl(ni7Var, this.g, this.h, this.i, this.t, this.X, this.Z, z291Var instanceof ljl ? (ljl) z291Var : null);
    }

    public final void b(pim0 pim0Var) {
        syl sylVar = (syl) pim0Var;
        long jI = sylVar.V0.i();
        ljl ljlVar = sylVar.U0;
        gi7 gi7Var = this.c;
        rf01 rf01Var = this.b;
        zy70 zy70Var = this.a;
        hi7 hi7Var = new hi7(rf01Var, zy70Var, gi7Var);
        ni7 ni7Var = sylVar.V0;
        ni7Var.N0 = this.d;
        ni7Var.O0 = this.e;
        j6m j6mVar = this.h;
        ni7Var.P0 = j6mVar;
        ni7Var.Q0 = this.f;
        ni7Var.R0 = this.Y;
        ni7Var.k(hi7Var);
        boolean zC = Size.c(jI, ni7Var.i());
        sylVar.O0 = this.g;
        z291 z291Var = zy70Var.p;
        sylVar.U0 = z291Var instanceof ljl ? (ljl) z291Var : null;
        sylVar.P0 = j6mVar;
        sylVar.Q0 = this.i;
        sylVar.R0 = this.t;
        sylVar.S0 = this.X;
        String str = sylVar.T0;
        String str2 = this.Z;
        if (!u890.j(str, str2)) {
            sylVar.T0 = str2;
            nko1.C(sylVar);
        }
        boolean zJ = u890.j(ljlVar, sylVar.U0);
        if (!zC || !zJ) {
            dio1.y(sylVar);
        }
        ha71.x(sylVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryl)) {
            return false;
        }
        ryl rylVar = (ryl) obj;
        return this.a.equals(rylVar.a) && u890.j(this.b, rylVar.b) && u890.j(this.c, rylVar.c) && u890.j(this.d, rylVar.d) && u890.j(this.e, rylVar.e) && this.f == rylVar.f && u890.j(this.g, rylVar.g) && u890.j(this.h, rylVar.h) && Float.compare(this.i, rylVar.i) == 0 && u890.j(this.t, rylVar.t) && this.X == rylVar.X && u890.j(this.Y, rylVar.Y) && u890.j(this.Z, rylVar.Z);
    }

    public final int hashCode() {
        int iG = ktd.g(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        iu30 iu30Var = this.e;
        int iF = x0d.f((this.h.hashCode() + ((this.g.hashCode() + kaa0.f(this.f, (iG + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31, 31)) * 31)) * 31, 31, this.i);
        ColorFilter colorFilter = this.t;
        int iG2 = xcg1.g((iF + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31, 31, this.X);
        ri7 ri7Var = this.Y;
        int iHashCode = (iG2 + (ri7Var == null ? 0 : ri7Var.hashCode())) * 31;
        String str = this.Z;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String strS = k1p1.s(this.f);
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.a);
        sb.append(", imageLoader=");
        sb.append(this.b);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.c);
        sb.append(", transform=");
        sb.append(this.d);
        sb.append(", onState=");
        sb.append(this.e);
        sb.append(", filterQuality=");
        sb.append(strS);
        sb.append(", alignment=");
        sb.append(this.g);
        sb.append(", contentScale=");
        sb.append(this.h);
        sb.append(", alpha=");
        sb.append(this.i);
        sb.append(", colorFilter=");
        sb.append(this.t);
        sb.append(", clipToBounds=");
        sb.append(this.X);
        sb.append(", previewHandler=");
        sb.append(this.Y);
        sb.append(", contentDescription=");
        return l1d.n(this.Z, ")", sb);
    }
}
