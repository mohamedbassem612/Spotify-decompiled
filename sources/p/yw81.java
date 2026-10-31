package p;

import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yw81 extends pim0 implements zlb0, t161 {
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public float U0;
    public float V0;
    public float W0;
    public float X0;
    public long Y0;
    public hw61 Z0;
    public boolean a1;
    public vc21 b1;
    public long c1;
    public long d1;
    public int e1;
    public int f1;
    public ColorFilter g1;
    public rkb0 h1;
    public waq0 i1;

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new gub0(q5t0VarH, this, (byte) 20));
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
        if (this.a1) {
            b261.z(e261Var, this.Z0);
        }
    }

    @Override // p.t161
    public final boolean k() {
        return false;
    }

    public final String toString() {
        float f = this.O0;
        float f2 = this.P0;
        float f3 = this.Q0;
        float f4 = this.R0;
        float f5 = this.S0;
        float f6 = this.T0;
        float f7 = this.U0;
        float f8 = this.V0;
        float f9 = this.W0;
        float f10 = this.X0;
        String strB = ofg1.b(this.Y0);
        hw61 hw61Var = this.Z0;
        boolean z = this.a1;
        vc21 vc21Var = this.b1;
        String strH = u7h.h(this.c1);
        String strH2 = u7h.h(this.d1);
        String strT = t0c.t(this.e1);
        String strQ = jm5.q(this.f1);
        ColorFilter colorFilter = this.g1;
        rkb0 rkb0Var = this.h1;
        StringBuilder sbM = gvg.m("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        gvg.t(sbM, f3, ", translationX=", f4, ", translationY=");
        gvg.t(sbM, f5, ", shadowElevation=", f6, ", rotationX=");
        gvg.t(sbM, f7, ", rotationY=", f8, ", rotationZ=");
        gvg.t(sbM, f9, ", cameraDistance=", f10, ", transformOrigin=");
        sbM.append(strB);
        sbM.append(", shape=");
        sbM.append(hw61Var);
        sbM.append(", clip=");
        sbM.append(z);
        sbM.append(", renderEffect=");
        sbM.append(vc21Var);
        sbM.append(", ambientShadowColor=");
        bb00.j(sbM, strH, ", spotShadowColor=", strH2, ", compositingStrategy=");
        bb00.j(sbM, strT, ", blendMode=", strQ, ", colorFilter=");
        sbM.append(colorFilter);
        sbM.append("outsets=");
        sbM.append(rkb0Var);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }
}
