package p;

import com.spotify.searchview.proto.AudioEpisode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y4r0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ahi0 b;
    public final /* synthetic */ g5r0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4r0(ahi0 ahi0Var, g5r0 g5r0Var, byte b) {
        super(3);
        this.a = b;
        this.b = ahi0Var;
        this.c = g5r0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g5r0 g5r0Var = this.c;
        ahi0 ahi0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    ahi0Var.k(g5r0Var, x340Var2, 0);
                }
                break;
            case 1:
                aqb0 aqb0Var = (aqb0) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.g(aqb0Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    xpv0 xpv0Var = cbx.c(x340Var4).c;
                    ahi0Var.g(g5r0Var, aqb0Var.a(nim0.a, (ni20) null, irn1.l0(pto1.q(AudioEpisode.SHOW_URI_FIELD_NUMBER, 2, 480.0f), 2000.0f, (Object) null, 4), (n8b1) null), x340Var4, 0);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                } else {
                    ahi0Var.k(g5r0Var, x340Var6, 0);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x340Var8.b0();
                } else {
                    ahi0Var.k(g5r0Var, x340Var8, 0);
                }
                break;
        }
        return rih1Var;
    }
}
