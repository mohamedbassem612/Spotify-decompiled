package p;

import com.spotify.search.uiusecases.PlayIndicatorComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class skt0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ PlayIndicatorComposeView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skt0(PlayIndicatorComposeView playIndicatorComposeView) {
        super(2);
        this.b = playIndicatorComposeView;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        PlayIndicatorComposeView playIndicatorComposeView = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    wkt0.a(playIndicatorComposeView.getState(), null, null, 0L, false, x340Var2, 0, 30);
                }
                break;
            default:
                ((Number) obj2).intValue();
                playIndicatorComposeView.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skt0(PlayIndicatorComposeView playIndicatorComposeView, int i) {
        super(2);
        this.b = playIndicatorComposeView;
    }
}
