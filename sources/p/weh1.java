package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class weh1 extends hab0 implements vu30 {
    public final /* synthetic */ whb1 a;
    public final /* synthetic */ leh1 b;
    public final /* synthetic */ WidgetState.Unauthenticated c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public weh1(whb1 whb1Var, leh1 leh1Var, WidgetState.Unauthenticated unauthenticated) {
        super(2);
        this.a = whb1Var;
        this.b = leh1Var;
        this.c = unauthenticated;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j = ((s3v) x340Var2.k(p4k.a)).a;
            int iB = p3v.b(s3v.a(j), 110.0f);
            leh1 leh1Var = this.b;
            whb1 whb1Var = this.a;
            if (iB < 0) {
                x340Var2.i0(46470711);
                ago1.i(whb1Var, leh1Var, x340Var2, 0);
                x340Var2.r(false);
            } else {
                WidgetState.Unauthenticated unauthenticated = this.c;
                if (unauthenticated.getRecommendations().isEmpty()) {
                    x340Var2.i0(1440696358);
                    ggo1.v(whb1Var, (gt40) null, leh1Var, x340Var2, 0);
                    x340Var2.r(false);
                } else if (yg91.b(s3v.b(j), s3v.a(j))) {
                    x340Var2.i0(46481738);
                    mfh1.a(unauthenticated, null, leh1Var, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(46485093);
                    zfh1.a(unauthenticated, whb1Var, null, this.b, x340Var2, 0);
                    x340Var2.r(false);
                }
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
