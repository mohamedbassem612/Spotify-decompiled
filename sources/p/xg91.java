package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xg91 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ q10 f;
    public final /* synthetic */ cz31 g;
    public final /* synthetic */ gt40 h;
    public final /* synthetic */ WidgetState.PlayPauseState i;
    public final /* synthetic */ short t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xg91(String str, String str2, String str3, String str4, boolean z, q10 q10Var, cz31 cz31Var, gt40 gt40Var, WidgetState.PlayPauseState playPauseState, int i, int i2) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = q10Var;
        this.g = cz31Var;
        this.h = gt40Var;
        this.i = playPauseState;
        this.t = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        short s = this.t;
        yg91.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP, s);
        return rih1.a;
    }
}
