package p;

import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class blt0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PlayIndicatorView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ blt0(PlayIndicatorView playIndicatorView, byte b) {
        super(0);
        this.a = b;
        this.b = playIndicatorView;
    }

    public final Object invoke() {
        byte b = this.a;
        tlv tlvVar = this.b;
        switch (b) {
            case 0:
                return bqn1.A(tlvVar.getContext(), 2131886193);
            case 1:
                return bqn1.A(tlvVar.getContext(), 2131886195);
            case 2:
                cdf0 cdf0VarA = bqn1.A(tlvVar.getContext(), 2131886199);
                cdf0VarA.x(1);
                cdf0VarA.w(-1);
                return cdf0VarA;
            case 3:
                return bqn1.A(tlvVar.getContext(), 2131886201);
            case 4:
                return bqn1.A(tlvVar.getContext(), 2131886192);
            case 5:
                return bqn1.A(tlvVar.getContext(), 2131886194);
            case 6:
                cdf0 cdf0VarA2 = bqn1.A(tlvVar.getContext(), 2131886198);
                cdf0VarA2.x(1);
                cdf0VarA2.w(-1);
                return cdf0VarA2;
            case 7:
                return bqn1.A(tlvVar.getContext(), 2131886200);
            case 8:
                return bqn1.A(tlvVar.getContext(), 2131886197);
            case 9:
                return bqn1.A(tlvVar.getContext(), 2131886196);
            case 10:
                cdf0 cdf0VarA3 = bqn1.A(tlvVar.getContext(), 2131886203);
                cdf0VarA3.x(1);
                cdf0VarA3.w(-1);
                return cdf0VarA3;
            default:
                return bqn1.A(tlvVar.getContext(), 2131886202);
        }
    }
}
