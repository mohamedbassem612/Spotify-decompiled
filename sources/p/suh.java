package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class suh extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ q10 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nmo d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ WidgetState.InactiveSession f;
    public final /* synthetic */ cz31 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suh(float f, q10 q10Var, boolean z, nmo nmoVar, boolean z2, WidgetState.InactiveSession inactiveSession, cz31 cz31Var) {
        super(3);
        this.a = f;
        this.b = q10Var;
        this.c = z;
        this.d = nmoVar;
        this.e = z2;
        this.f = inactiveSession;
        this.g = cz31Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        float f = this.a;
        float fMax = Math.max(48.0f, f);
        et40 et40Var = et40.a;
        gt40 gt40VarE0 = dm5.e0(et40Var, fMax);
        q10 q10Var = this.b;
        gt40 gt40VarL = d9y0.l(gt40VarE0, q10Var);
        nmo nmoVar = this.d;
        WidgetState.InactiveSession inactiveSession = this.f;
        j2h1.b(gt40VarL, ql3.g, apo.r(-1551046262, new ruh(f, nmoVar, inactiveSession), x340Var), x340Var, 384, 0);
        if (this.c) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1726286422);
            f5p1.h(nmoVar.c, nmoVar.d, q10Var, eqr0.H(ow31.a(et40Var), 8.0f, 0.0f, 0.0f, 0.0f, 14), nee1.a, nee1.b, (String) null, (String) null, 0, x340Var2, 0, 448);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1726580891);
            fc11.g(ow31.a(et40Var), x340Var3, 0);
            x340Var3.r(false);
        }
        if (this.e) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(1726686198);
            long jP = z5p1.p(zah.a, inactiveSession.getMetadata().f);
            WidgetState.PlayPauseState playPauseState = WidgetState.PlayPauseState.PLAY;
            int iH = rau0.h(playPauseState);
            String strG = rau0.g((Context) x340Var4.k(p4k.b), playPauseState);
            Object objT = x340Var4.T();
            if (objT == fkj0.X) {
                objT = bmh.W0;
                x340Var4.s0(objT);
            }
            czo1.c(iH, jP, strG, this.g, iko1.x(et40Var, (iu30) objT), 0L, false, 48.0f, 4.0f, 0, x340Var4, 113246208, 608);
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(1727274330);
            x340Var5.r(false);
        }
        cxm.g((gt40) null, 48.0f, 12.0f, 2, x340Var, 3120, 1);
        return rih1.a;
    }
}
