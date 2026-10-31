package p;

import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f351 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ft3 b;
    public final /* synthetic */ SearchConfiguration c;
    public final /* synthetic */ SearchFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f351(SearchFragment searchFragment, ft3 ft3Var, SearchConfiguration searchConfiguration) {
        super(2);
        this.a = (byte) 3;
        this.d = searchFragment;
        this.b = ft3Var;
        this.c = searchConfiguration;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ft3 ft3Var = this.b;
        rih1 rih1Var = rih1.a;
        SearchConfiguration searchConfiguration = this.c;
        SearchFragment searchFragment = this.d;
        boolean z = false;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    otw.c(this.b, new ct3(searchConfiguration.getUrl(), searchConfiguration.getPlaceholder(), searchConfiguration.getInitialText(), searchFragment.b1().f, searchFragment.b1().g), (qim0) null, (ipb1) null, x340Var2, 72, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(0, (wux) null, apo.r(1219991178, new f351(ft3Var, searchConfiguration, searchFragment, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3072, 7);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qsw.a(apo.r(-687715401, new f351(ft3Var, searchConfiguration, searchFragment, b3), x340Var6), x340Var6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = searchFragment.I1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(gw70Var), apo.r(999913270, new f351(ft3Var, searchConfiguration, searchFragment, b2), x340Var8), x340Var8, 56);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f351(ft3 ft3Var, SearchConfiguration searchConfiguration, SearchFragment searchFragment, byte b) {
        super(2);
        this.a = b;
        this.b = ft3Var;
        this.c = searchConfiguration;
        this.d = searchFragment;
    }
}
