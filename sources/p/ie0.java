package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ie0 extends hab0 implements vu30 {
    public final /* synthetic */ kee1 N0;
    public final /* synthetic */ float X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ kee1 Z;
    public final /* synthetic */ float a;
    public final /* synthetic */ WidgetState.ActiveSession b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie0(float f, WidgetState.ActiveSession activeSession, float f2, boolean z, boolean z2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z3, kee1 kee1Var, kee1 kee1Var2) {
        super(2);
        this.a = f;
        this.b = activeSession;
        this.c = f2;
        this.d = z;
        this.e = z2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.t = f7;
        this.X = f8;
        this.Y = z3;
        this.Z = kee1Var;
        this.N0 = kee1Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        b0k b0kVar2 = (x340) b0kVar;
        if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            b0kVar2.i0(175221457);
            float f = this.a;
            int iB = p3v.b(f, 110.0f);
            WidgetState.ActiveSession activeSession = this.b;
            if (iB < 0) {
                b0kVar2.i0(175220737);
                ye0.d(activeSession, b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                float f2 = this.c;
                if (yg91.c(f2, f, b0kVar2)) {
                    b0kVar2.i0(175223591);
                    ye0.e(activeSession, b0kVar2, 0);
                    b0kVar2.r(false);
                } else if (yg91.b(f2, f)) {
                    b0kVar2.i0(175226849);
                    ye0.d(activeSession, b0kVar2, 0);
                    b0kVar2.r(false);
                } else {
                    boolean z = this.d;
                    float f3 = this.g;
                    if (z) {
                        b0kVar2.i0(1137159637);
                        boolean z2 = this.e;
                        ye0.c(activeSession, this.f, z2 ? 80.0f : Math.min(92.0f, this.f - f3), this.h, this.i, this.t, this.X, z2 ? 3 : 1, this.Y, this.Z, this.N0, b0kVar2, 0);
                        b0kVar2 = b0kVar2;
                        b0kVar2.r(false);
                    } else if (p3v.b(f2, 240.0f) < 0 || p3v.c(this.h, 0.0f)) {
                        b0kVar2.i0(1137995800);
                        if (p3v.b(s3v.a(((s3v) b0kVar2.k(p4k.a)).a), 128.0f + (w6p1.k(nee1.b, b0kVar2) * 2.0f) + w6p1.k(nee1.a, b0kVar2)) >= 0) {
                            b0kVar2.i0(1138259858);
                            ye0.b(activeSession, b0kVar2, 432);
                            b0kVar2.r(false);
                        } else {
                            b0kVar2.i0(1138375147);
                            ye0.d(activeSession, b0kVar2, 0);
                            b0kVar2.r(false);
                        }
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(1138470844);
                        gt40 gt40VarG = eqr0.G(dm5.I(et40.a), 16.0f, this.i, 16.0f, this.t);
                        Object objT = b0kVar2.T();
                        if (objT == fkj0.X) {
                            objT = ft.Y0;
                            b0kVar2.s0(objT);
                        }
                        p8p0.a(activeSession, iko1.x(gt40VarG, (iu30) objT), Math.min(92.0f, f - f3), 2, null, null, b0kVar2, 3072, 48);
                        b0kVar2.r(false);
                    }
                }
            }
            b0kVar2.r(false);
            String tooltip = activeSession.getTooltip();
            if (tooltip == null) {
                b0kVar2.i0(1139124943);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1139124944);
                b0k b0kVar3 = b0kVar2;
                ye0.f(tooltip, this.a, this.c, this.d, this.X, b0kVar3, 0);
                b0kVar3.r(false);
            }
        } else {
            b0kVar2.b0();
        }
        return rih1.a;
    }
}
