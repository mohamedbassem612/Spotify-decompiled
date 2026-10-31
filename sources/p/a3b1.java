package p;

import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a3b1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpotifyCheckoutActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3b1(SpotifyCheckoutActivity spotifyCheckoutActivity, byte b) {
        super(2);
        this.a = b;
        this.b = spotifyCheckoutActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        SpotifyCheckoutActivity spotifyCheckoutActivity = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int i = SpotifyCheckoutActivity.D1;
                spotifyCheckoutActivity.m0().U(new vzz((p2c0) obj, zBooleanValue));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ven0 ven0VarC = b2p1.C(spotifyCheckoutActivity.t1, x340Var2);
                    ven0 ven0VarB = b2p1.B(spotifyCheckoutActivity.u1, new igm0(), x340Var2, 0);
                    List list = (List) ven0VarC.getValue();
                    if (list != null) {
                        c380 c380VarA = mqo1.A(list);
                        boolean zI = x340Var2.i(spotifyCheckoutActivity);
                        Object objT = x340Var2.T();
                        if (zI || objT == fkj0.X) {
                            obj3 = objT;
                            a3b1 a3b1Var = new a3b1(spotifyCheckoutActivity, z ? 1 : 0);
                            x340Var2.s0(a3b1Var);
                            obj3 = a3b1Var;
                        }
                        obj3 = objT;
                        oqo1.d(c380VarA, (vu30) obj3, mqo1.B(((igm0) ven0VarB.getValue()).a), ((igm0) ven0VarB.getValue()).b, u291.f(nim0.a, 1.0f), x340Var2, 0);
                    }
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(-1442277893, new a3b1(spotifyCheckoutActivity, b2), x340Var4), x340Var4, 3072, 7);
                }
                break;
        }
        return rih1Var;
    }
}
