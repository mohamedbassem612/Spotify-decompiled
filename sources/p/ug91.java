package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ug91 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q10 d;
    public final /* synthetic */ WidgetState.PlayPauseState e;
    public final /* synthetic */ long f;
    public final /* synthetic */ cz31 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug91(float f, String str, boolean z, q10 q10Var, WidgetState.PlayPauseState playPauseState, long j, cz31 cz31Var, boolean z2) {
        super(3);
        this.a = f;
        this.b = str;
        this.c = z;
        this.d = q10Var;
        this.e = playPauseState;
        this.f = j;
        this.g = cz31Var;
        this.h = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        float f = this.a;
        gt40 gt40VarE0 = dm5.e0(et40Var, f);
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = fe91.e;
            x340Var.s0(objT);
        }
        poo1.a(this.b, iko1.x(gt40VarE0, (iu30) objT), this.c, this.d, (String) null, 1, x340Var, 0, 16);
        j2h1.b(dm5.Q(ow31.a(et40Var), f), ql3.k, apo.r(1379687044, new tg91(this.e, this.f, this.g, this.h), x340Var), x340Var, 384, 0);
        return rih1.a;
    }
}
