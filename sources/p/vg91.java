package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vg91 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q10 d;
    public final /* synthetic */ WidgetState.PlayPauseState e;
    public final /* synthetic */ long f;
    public final /* synthetic */ cz31 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg91(float f, String str, boolean z, q10 q10Var, WidgetState.PlayPauseState playPauseState, long j, cz31 cz31Var, boolean z2, String str2, String str3) {
        super(3);
        this.a = f;
        this.b = str;
        this.c = z;
        this.d = q10Var;
        this.e = playPauseState;
        this.f = j;
        this.g = cz31Var;
        this.h = z2;
        this.i = str2;
        this.t = str3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        gt40 gt40VarQ = dm5.Q(dm5.J(et40Var), this.a);
        cz31 cz31Var = this.g;
        boolean z = this.h;
        float f = this.a;
        String str = this.b;
        boolean z2 = this.c;
        q10 q10Var = this.d;
        jch0.f(gt40VarQ, 1, apo.r(779697446, new ug91(f, str, z2, q10Var, this.e, this.f, cz31Var, z), b0kVar), b0kVar, 3072, 2);
        jch0.f(eqr0.H(dm5.J(et40Var), 0.0f, 6.0f, 0.0f, 0.0f, 13), 0, apo.r(1491687709, new nu31(this.i, this.t, q10Var, (byte) 14), b0kVar), b0kVar, 3072, 6);
        return rih1.a;
    }
}
