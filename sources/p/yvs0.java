package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yvs0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvs0(iu30 iu30Var, yiv0 yiv0Var, int i) {
        super(2);
        this.a = (byte) 13;
        this.b = iu30Var;
        this.d = yiv0Var;
        this.c = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                yto1.k((wvs0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                fuo1.h((vws0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                fuo1.j((bxs0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                boolean z2 = false;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                List list = (List) obj4;
                xpw xpwVar = (xpw) obj3;
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    List list2 = (List) list.get(i2);
                    qim0 qim0VarN = anm1.N("pins_row_test_tag", u291.f(nim0.a, 1.0f));
                    jw31 jw31VarA = ew31.a(new d36(8.0f, z, new um5(z2)), een.Z, x340Var2, z2 ? 1 : 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    x340Var2.i0(1512806496);
                    int size2 = list2.size();
                    int i3 = z2 ? 1 : 0;
                    while (i3 < size2) {
                        bhy bhyVar = (bhy) list2.get(i3);
                        x340Var2.f0(-1147652980, bhyVar.b.a);
                        rih1 rih1Var2 = rih1Var;
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        int i4 = i3;
                        otw.c(xpwVar, bhyVar, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), (ipb1) null, x340Var2, 0, 8);
                        x340Var2.r(false);
                        i3 = (i4 == true ? 1 : 0) + 1;
                        z2 = false;
                        rih1Var = rih1Var2;
                    }
                    boolean z3 = z2;
                    rih1 rih1Var3 = rih1Var;
                    x340Var2.r(z3);
                    x340Var2.i0(1512815028);
                    int size3 = i - list2.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        op71.g(x340Var2, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    }
                    x340Var2.r(false);
                    x340Var2.r(true);
                    i2++;
                    z2 = false;
                    rih1Var = rih1Var3;
                    z = true;
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                hyo1.f((lbt0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                azo1.h((bft0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                h0p1.i((imt0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                i1p1.l(i, (v6y0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                z5p1.f((lnu0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ((rsu0) obj4).i((esu0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 10:
                ((h8x0) obj4).J((tsu0) obj, (obx0) obj3, Integer.valueOf(i), (tqw) obj2);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                j6p1.g((ovu0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                m6p1.d((gwu0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                cbp1.c((iu30) obj3, (yiv0) obj4, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                yto.g((r8w0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                fiw0.c((hiw0) obj4, (giw0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                fiw0.d((iiw0) obj4, (giw0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                fiw0.f((niw0) obj4, (giw0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                fiw0.h((oiw0) obj4, (giw0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                vvm1.k((kmx0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                ((pt) obj4).k((iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((cm0) obj4).e((iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((bry0) obj4).c((iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((zry0) obj4).c((iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((ity0) obj4).c((iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                tho1.g((zz70) obj4, (String) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                tho1.m((j2k1) obj4, (String) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                zho1.r((g36) obj4, (j2i) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ijo1.n((p9z0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                qmo1.h((c380) obj4, (gmq) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yvs0(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvs0(List list, int i, xpw xpwVar) {
        super(2);
        this.a = (byte) 3;
        this.d = list;
        this.c = i;
        this.b = xpwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvs0(int i, v6y0 v6y0Var, Function0 function0, int i2) {
        super(2);
        this.a = (byte) 7;
        this.c = i;
        this.d = v6y0Var;
        this.b = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvs0(zz70 zz70Var, String str, int i) {
        super(2);
        this.a = (byte) 25;
        this.d = zz70Var;
        this.b = str;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvs0(j2k1 j2k1Var, String str, int i) {
        super(2);
        this.a = (byte) 26;
        this.d = j2k1Var;
        this.b = str;
        this.c = i;
    }
}
