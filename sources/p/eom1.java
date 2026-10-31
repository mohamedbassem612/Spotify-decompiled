package p;

import android.os.Bundle;
import com.spotify.yourupdates.domain.YourUpdatesNotificationImpression;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eom1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eom1(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                vnm1 vnm1Var = (vnm1) obj4;
                String str = vnm1Var.b;
                String str2 = vnm1Var.c;
                long jQ = bro1.q(vnm1Var.d);
                String str3 = vnm1Var.a;
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                k1p1.a(str, str2, 4, (qim0) null, jQ, false, new m1a(str3, er31.b(4.0f)), b0kVar, 2097536, 40);
                return rih1Var;
            case 1:
                hpm1 hpm1Var = (hpm1) obj2;
                if (hpm1Var instanceof hpm1) {
                    ((jpm1) obj4).a.invoke(new hat0(hpm1Var.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                ipm1 ipm1Var = (ipm1) obj2;
                if (ipm1Var instanceof ipm1) {
                    ((kpm1) obj4).a.invoke(new hat0(ipm1Var.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    otw.c((azr) obj4, fc20.a, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                eym1 eym1Var = (eym1) obj2;
                tqw tqwVar = (tqw) obj3;
                if (eym1Var instanceof cym1) {
                    hqn1.q(((hym1) obj4).a, "spotify:account-management:your-premium", tqwVar, (Bundle) null);
                } else if (!(eym1Var instanceof dym1)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                w0h1.a(((gym1) obj4).a, isl.a, (qim0) null, 0L, 0L, false, (b0k) obj2, 56, 60);
                return rih1Var;
            case 6:
                n2n1 n2n1Var = (n2n1) obj;
                tqw tqwVar2 = (tqw) obj3;
                li9 li9Var = ((o2n1) obj4).a;
                int i = n2n1Var.a;
                iu30 iu30Var = n2n1Var.c;
                kjo0 kjo0Var = n2n1Var.b;
                int iOrdinal = ((m2n1) obj2).ordinal();
                if (iOrdinal == 0) {
                    if (tqwVar2 != null) {
                        iu30Var.invoke(new m1n1(kjo0Var, n3o1.y(tqwVar2)));
                    }
                    String str4 = kjo0Var.a;
                    pjo0 pjo0Var = kjo0Var.d;
                    String str5 = pjo0Var.b.a;
                    String str6 = pjo0Var.a;
                    String str7 = kjo0Var.i;
                    bdj0 bdj0Var = kjo0Var.h;
                    li9Var.c(str4, str5, str6, str7, bdj0Var.b, bdj0Var.a);
                } else if (iOrdinal == 1) {
                    String str8 = kjo0Var.a;
                    boolean z = kjo0Var.f;
                    String str9 = kjo0Var.i;
                    bdj0 bdj0Var2 = kjo0Var.h;
                    String str10 = bdj0Var2.b;
                    String str11 = bdj0Var2.a;
                    String str12 = kjo0Var.d.a;
                    t2j0 t2j0Var = li9Var.a;
                    j2n1 j2n1VarN = YourUpdatesNotificationImpression.n();
                    j2n1VarN.s(str8);
                    j2n1VarN.u(i);
                    j2n1VarN.q(z);
                    j2n1VarN.v(str9);
                    j2n1VarN.r(str10);
                    j2n1VarN.t(str11);
                    j2n1VarN.n(str12);
                    t2j0Var.a(j2n1VarN.build());
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new l1n1(kjo0Var.g));
                } else if (tqwVar2 != null) {
                    iu30Var.invoke(new k1n1(i, n3o1.y(tqwVar2), kjo0Var));
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                irn1.t((kjo0) obj4, (b0k) obj2, 0);
                return rih1Var;
        }
    }
}
