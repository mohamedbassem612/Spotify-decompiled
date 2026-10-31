package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qc81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he81 b;
    public final /* synthetic */ idd1 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc81(he81 he81Var, idd1 idd1Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = he81Var;
        this.c = idd1Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        uho set0Var = null;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        idd1 idd1Var = this.c;
        he81 he81Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = he81Var.f;
                    if (str != null && !ihc1.y0(str)) {
                        set0Var = new set0(he81Var.f, true, "", "", (Function0) null, false, false, (Function0) null, (String) null, (String) null, false, 2032);
                    }
                    if (set0Var != null) {
                        x340Var2.i0(-1588334270);
                        n8p1.f((hft0) idd1Var.getValue(), set0Var, iu30Var, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1588334271);
                        x340Var2.r(false);
                    }
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String str2 = he81Var.f;
                    if (str2 != null && !ihc1.y0(str2) && nhc1.Y(str2, "spotify:", false)) {
                        String str3 = he81Var.z;
                        if (str3 == null) {
                            str3 = he81Var.d;
                        }
                        set0Var = new uho(str3, he81Var.f, he81Var.H == 1 ? oho.a : qho.a, (nho) null, "", (Function0) null, 200);
                    }
                    if (set0Var != null) {
                        x340Var4.i0(1882826675);
                        n8p1.d((xho) idd1Var.getValue(), set0Var, iu30Var, x340Var4, 8);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1882826674);
                        x340Var4.r(false);
                    }
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else if (!he81Var.l) {
                    x340Var6.i0(1059274865);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(1059011551);
                    n8p1.c((idm) idd1Var.getValue(), jon1.H(he81Var), iu30Var, x340Var6, 0);
                    x340Var6.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
