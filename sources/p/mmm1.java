package p;

import com.spotify.xrprojected.ui.XrProjectedActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mmm1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ XrProjectedActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mmm1(XrProjectedActivity xrProjectedActivity, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xrProjectedActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        XrProjectedActivity xrProjectedActivity = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                int iP = czo1.p(1);
                int i = XrProjectedActivity.p1;
                xrProjectedActivity.o0(b0kVar, iP);
                break;
            default:
                int iP2 = czo1.p(1);
                int i2 = XrProjectedActivity.p1;
                xrProjectedActivity.p0(b0kVar, iP2);
                break;
        }
        return rih1Var;
    }
}
