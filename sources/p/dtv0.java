package p;

import com.spotify.culturalmoments.uiusecases.common.PremiumLabelView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dtv0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ PremiumLabelView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtv0(PremiumLabelView premiumLabelView) {
        super(2);
        this.b = premiumLabelView;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        PremiumLabelView premiumLabelView = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    vbe.s(premiumLabelView.getText(), (qim0) null, 0L, 0L, (lee1) null, false, x340Var2, 0, 62);
                }
                break;
            default:
                ((Number) obj2).intValue();
                premiumLabelView.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtv0(PremiumLabelView premiumLabelView, int i) {
        super(2);
        this.b = premiumLabelView;
    }
}
