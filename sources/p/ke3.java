package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ke3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke3(int i, String str, String str2, boolean z) {
        super(2);
        this.a = (byte) 1;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String strK = this.c;
        String strK2 = this.b;
        boolean z = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    spx spxVar = z ? spx.c : xpx.c;
                    if (z) {
                        strK = strK2;
                    }
                    w0h1.a(spxVar, new jsl(strK), anm1.N(z ? "pause_icon" : "play_icon", nim0.a), 0L, 0L, false, x340Var2, 8, 56);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                wpo1.h(strK2, strK, z, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    spx spxVar2 = z ? spx.c : xpx.c;
                    if (z) {
                        x340Var4.i0(-1096346934);
                        if (strK2 == null) {
                            strK2 = x0d.k(x340Var4, -1975028277, 2131960313, x340Var4, false);
                        } else {
                            x340Var4.i0(-1975028680);
                            x340Var4.r(false);
                        }
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1096241844);
                        if (strK == null) {
                            strK = x0d.k(x340Var4, -1975024918, 2131960314, x340Var4, false);
                        } else {
                            x340Var4.i0(-1975025290);
                            x340Var4.r(false);
                        }
                        x340Var4.r(false);
                        strK2 = strK;
                    }
                    w0h1.a(spxVar2, new jsl(strK2), (qim0) null, 0L, 0L, false, x340Var4, 8, 60);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke3(boolean z, String str, String str2, byte b) {
        super(2);
        this.a = b;
        this.d = z;
        this.b = str;
        this.c = str2;
    }
}
