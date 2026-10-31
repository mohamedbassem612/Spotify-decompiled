package p;

import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ee50;", "Lp/uim0;", "Lp/yw81;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
final /* data */ class ee50 extends uim0 {
    public final vc21 N0;
    public final long O0;
    public final long P0;
    public final int Q0;
    public final int R0;
    public final ColorFilter S0;
    public final rkb0 T0;
    public final long X;
    public final hw61 Y;
    public final boolean Z;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float t;

    public ee50(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, hw61 hw61Var, boolean z, vc21 vc21Var, long j2, long j3, int i, int i2, ColorFilter colorFilter, rkb0 rkb0Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.t = f10;
        this.X = j;
        this.Y = hw61Var;
        this.Z = z;
        this.N0 = vc21Var;
        this.O0 = j2;
        this.P0 = j3;
        this.Q0 = i;
        this.R0 = i2;
        this.S0 = colorFilter;
        this.T0 = rkb0Var;
    }

    @Override // p.uim0
    public final pim0 a() {
        yw81 yw81Var = new yw81();
        yw81Var.O0 = this.a;
        yw81Var.P0 = this.b;
        yw81Var.Q0 = this.c;
        yw81Var.R0 = this.d;
        yw81Var.S0 = this.e;
        yw81Var.T0 = this.f;
        yw81Var.U0 = this.g;
        yw81Var.V0 = this.h;
        yw81Var.W0 = this.i;
        yw81Var.X0 = this.t;
        yw81Var.Y0 = this.X;
        yw81Var.Z0 = this.Y;
        yw81Var.a1 = this.Z;
        yw81Var.b1 = this.N0;
        yw81Var.c1 = this.O0;
        yw81Var.d1 = this.P0;
        yw81Var.e1 = this.Q0;
        yw81Var.f1 = this.R0;
        yw81Var.g1 = this.S0;
        yw81Var.h1 = this.T0;
        yw81Var.i1 = new waq0(yw81Var, (byte) 20);
        return yw81Var;
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        yw81 yw81Var = (yw81) pim0Var;
        yw81Var.O0 = this.a;
        yw81Var.P0 = this.b;
        yw81Var.Q0 = this.c;
        yw81Var.R0 = this.d;
        yw81Var.S0 = this.e;
        yw81Var.T0 = this.f;
        yw81Var.U0 = this.g;
        yw81Var.V0 = this.h;
        yw81Var.W0 = this.i;
        yw81Var.X0 = this.t;
        yw81Var.Y0 = this.X;
        yw81Var.Z0 = this.Y;
        yw81Var.a1 = this.Z;
        yw81Var.b1 = this.N0;
        yw81Var.c1 = this.O0;
        yw81Var.d1 = this.P0;
        yw81Var.e1 = this.Q0;
        yw81Var.f1 = this.R0;
        yw81Var.g1 = this.S0;
        yw81Var.h1 = this.T0;
        dio1.E(yw81Var, yw81Var.i1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee50)) {
            return false;
        }
        ee50 ee50Var = (ee50) obj;
        if (Float.compare(this.a, ee50Var.a) != 0 || Float.compare(this.b, ee50Var.b) != 0 || Float.compare(this.c, ee50Var.c) != 0 || Float.compare(this.d, ee50Var.d) != 0 || Float.compare(this.e, ee50Var.e) != 0 || Float.compare(this.f, ee50Var.f) != 0 || Float.compare(this.g, ee50Var.g) != 0 || Float.compare(this.h, ee50Var.h) != 0 || Float.compare(this.i, ee50Var.i) != 0 || Float.compare(this.t, ee50Var.t) != 0 || !ofg1.a(this.X, ee50Var.X) || !u890.j(this.Y, ee50Var.Y) || this.Z != ee50Var.Z || !u890.j(this.N0, ee50Var.N0)) {
            return false;
        }
        long j = ee50Var.O0;
        int i = u7h.l;
        return z4h1.b(this.O0, j) && z4h1.b(this.P0, ee50Var.P0) && t0c.h(this.Q0, ee50Var.Q0) && jm5.j(this.R0, ee50Var.R0) && u890.j(this.S0, ee50Var.S0) && u890.j(this.T0, ee50Var.T0);
    }

    public final int hashCode() {
        int iF = x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t);
        int i = ofg1.c;
        int iG = xcg1.g((this.Y.hashCode() + cy30.f(iF, this.X, 31)) * 31, 31, this.Z);
        vc21 vc21Var = this.N0;
        int iHashCode = (iG + (vc21Var == null ? 0 : vc21Var.hashCode())) * 31;
        int i2 = u7h.l;
        int iL = (jm5.l(this.R0) + ((t0c.m(this.Q0) + c13.f(c13.f(iHashCode, this.O0, 31), this.P0, 31)) * 31)) * 31;
        ColorFilter colorFilter = this.S0;
        return this.T0.hashCode() + ((iL + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strB = ofg1.b(this.X);
        String strH = u7h.h(this.O0);
        String strH2 = u7h.h(this.P0);
        String strT = t0c.t(this.Q0);
        String strQ = jm5.q(this.R0);
        StringBuilder sbM = gvg.m("GraphicsLayerElement(scaleX=", this.a, ", scaleY=", this.b, ", alpha=");
        gvg.t(sbM, this.c, ", translationX=", this.d, ", translationY=");
        gvg.t(sbM, this.e, ", shadowElevation=", this.f, ", rotationX=");
        gvg.t(sbM, this.g, ", rotationY=", this.h, ", rotationZ=");
        gvg.t(sbM, this.i, ", cameraDistance=", this.t, ", transformOrigin=");
        sbM.append(strB);
        sbM.append(", shape=");
        sbM.append(this.Y);
        sbM.append(", clip=");
        sbM.append(this.Z);
        sbM.append(", renderEffect=");
        sbM.append(this.N0);
        sbM.append(", ambientShadowColor=");
        bb00.j(sbM, strH, ", spotShadowColor=", strH2, ", compositingStrategy=");
        bb00.j(sbM, strT, ", blendMode=", strQ, ", colorFilter=");
        sbM.append(this.S0);
        sbM.append(", outsets=");
        sbM.append(this.T0);
        sbM.append(")");
        return sbM.toString();
    }
}
