package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wg91 extends hab0 implements vu30 {
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
    public wg91(float f, String str, boolean z, q10 q10Var, WidgetState.PlayPauseState playPauseState, long j, cz31 cz31Var, boolean z2, String str2, String str3) {
        super(2);
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

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            et40 et40Var = et40.a;
            eqr0.a(dm5.I(et40Var), 1, 0, apo.r(-1456220734, new vg91(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t), x340Var2), x340Var2, 3072, 4);
            j2h1.b(dm5.J(et40Var), ql3.e, ajj.a, x340Var2, 384, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
