package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q780 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ WidgetState.InactiveSession b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q780(float f, WidgetState.InactiveSession inactiveSession, float f2, boolean z, float f3, boolean z2) {
        super(2);
        this.a = f;
        this.b = inactiveSession;
        this.c = f2;
        this.d = z;
        this.e = f3;
        this.f = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            float f = this.a;
            int iB = p3v.b(f, 110.0f);
            et40 et40Var = et40.a;
            WidgetState.InactiveSession inactiveSession = this.b;
            if (iB < 0) {
                x340Var2.i0(603265280);
                gt40 gt40VarI = dm5.I(et40Var);
                Object objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = vu70.W0;
                    x340Var2.s0(objT);
                }
                wuh.a(inactiveSession, iko1.x(gt40VarI, (iu30) objT), x340Var2, 0);
                x340Var2.r(false);
            } else {
                float f2 = this.c;
                if (yg91.c(f2, f, x340Var2)) {
                    x340Var2.i0(-257626461);
                    w780.c(inactiveSession, x340Var2, 0);
                    x340Var2.r(false);
                } else if (yg91.b(f2, f)) {
                    x340Var2.i0(-257622736);
                    gt40 gt40VarI2 = dm5.I(et40Var);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = vu70.X0;
                        x340Var2.s0(objT2);
                    }
                    wuh.a(inactiveSession, iko1.x(gt40VarI2, (iu30) objT2), x340Var2, 0);
                    x340Var2.r(false);
                } else if (this.d) {
                    x340Var2.i0(-257574728);
                    w780.a(inactiveSession, this.e, this.f, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(603864076);
                    if (p3v.b(s3v.a(((s3v) x340Var2.k(p4k.a)).a), 124.0f + (w6p1.k(nee1.b, x340Var2) * 2.0f) + w6p1.k(nee1.a, x340Var2)) >= 0) {
                        x340Var2.i0(604211338);
                        gt40 gt40VarG = eqr0.G(dm5.I(et40Var), 16.0f, 16.0f, 16.0f, 12.0f);
                        Object objT3 = x340Var2.T();
                        if (objT3 == m4cVar) {
                            objT3 = vu70.Y0;
                            x340Var2.s0(objT3);
                        }
                        c760.a(inactiveSession.getMetadata(), inactiveSession.getShouldPlayRecommendations(), inactiveSession.getShouldOpenEntityPage(), iko1.x(gt40VarG, (iu30) objT3), 80.0f, true, inactiveSession.getIsWorkProfile(), x340Var2, 221184);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(604877683);
                        gt40 gt40VarI3 = dm5.I(et40Var);
                        Object objT4 = x340Var2.T();
                        if (objT4 == m4cVar) {
                            objT4 = vu70.Z0;
                            x340Var2.s0(objT4);
                        }
                        wuh.a(inactiveSession, iko1.x(gt40VarI3, (iu30) objT4), x340Var2, 0);
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                }
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
