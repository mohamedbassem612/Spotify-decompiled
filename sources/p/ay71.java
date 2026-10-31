package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ay71 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay71(int i, String str, Set set, wxj1 wxj1Var, xnb xnbVar, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 18;
        this.c = i;
        this.d = str;
        this.e = set;
        this.f = wxj1Var;
        this.g = xnbVar;
        this.b = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        int i = this.c;
        Object obj3 = this.e;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.b;
        Object obj6 = this.g;
        Object obj7 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                u4p1.G((xx71) obj7, (ze71) obj3, (lte) obj4, (iu30) obj6, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                a081.b((n081) obj7, (gw70) obj3, (Function0) obj4, (Function0) obj6, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                h5p1.j((h181) obj7, (p081) obj3, (vnr) obj4, (iuj) obj6, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                r6p1.m((j681) obj7, (Function0) obj3, (Function0) obj4, (qim0) obj5, (i681) obj6, (b0k) obj, czo1.p(i | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                yap1.d((ysf0) obj7, (qim0) obj5, (Boolean) obj3, (iu30) obj6, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                bin.j((adn) obj7, (gw70) obj3, (iu30) obj6, (vu30) obj4, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                Object obj8 = this.e;
                i1o1.f((maa) obj7, obj8, (ipb1) obj4, (qim0) obj5, (xu30) obj6, (b0k) obj, iP);
                break;
            case 7:
                ((Number) obj2).intValue();
                iko1.p((egc1) obj7, (Function0) obj3, (j2i) obj4, (qim0) obj5, (j2i) obj6, (b0k) obj, czo1.p(i | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                htd1.e((tsd1) obj7, (afx) obj3, (afx) obj4, (Function0) obj6, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                cvd1.b((lgl) obj7, (kly0) obj3, (i8h1) obj4, (gw10) obj5, (iu30) obj6, (b0k) obj, czo1.p(i | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                xa4.f((c380) obj7, (xtb0) obj3, (pre1) obj4, (iu30) obj6, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                xa4.g((c380) obj7, (xtb0) obj3, (pre1) obj4, (iu30) obj6, (iu30) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                c8o.h((si1) obj7, (ztq) obj3, (fhi1) obj4, (ytq) obj5, (iu30) obj6, (b0k) obj, czo1.p(i | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                no80.i((c380) obj7, (c380) obj3, (iu30) obj6, (qim0) obj5, (String) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 14:
                ((Number) obj2).intValue();
                hqq0.B((quf1) obj7, (abu0) obj3, (iac0) obj4, (yqg) obj5, (iu30) obj6, (b0k) obj, czo1.p(i | 1));
                break;
            case 15:
                ((Number) obj2).intValue();
                x3h1.a((v3h1) obj7, (xtb0) obj3, (e4h1) obj4, (dp5) obj6, (wxl) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            case 16:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                int i2 = this.c;
                eko1.h((mvh1) obj7, (iu30) obj6, (mvh1) obj3, i2, (iu30) obj4, (bih1) obj5, (b0k) obj, iP2);
                break;
            case 17:
                ((Number) obj2).intValue();
                wro1.s((ArrayList) obj7, (iu30) obj6, (vu30) obj3, (qim0) obj5, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 18:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                int i3 = this.c;
                f5p1.b(i3, (String) obj7, (Set) obj3, (wxj1) obj4, (xnb) obj6, (qim0) obj5, (b0k) obj, iP3);
                break;
            case 19:
                ((Number) obj2).intValue();
                m6p1.g((Function0) obj7, (lsm0) obj3, (Function0) obj4, (iu30) obj6, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                wm5.n((lwk1) obj7, (nwk1) obj3, (iu30) obj6, (j2i) obj4, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                m87.k((fwk1) obj7, (iu30) obj6, (ng20) obj3, (qim0) obj5, (vzq0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay71(byte b, int i, Object obj, Object obj2, Object obj3, iu30 iu30Var, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.d = obj;
        this.g = iu30Var;
        this.e = obj2;
        this.b = qim0Var;
        this.f = obj3;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay71(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = obj5;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay71(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.g = obj5;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay71(Object obj, Object obj2, iu30 iu30Var, vu30 vu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.g = iu30Var;
        this.f = vu30Var;
        this.b = qim0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay71(c380 c380Var, c380 c380Var2, iu30 iu30Var, qim0 qim0Var, String str, int i) {
        super(2);
        this.a = (byte) 13;
        this.d = c380Var;
        this.e = c380Var2;
        this.g = iu30Var;
        this.b = qim0Var;
        this.f = str;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay71(ysf0 ysf0Var, qim0 qim0Var, Boolean bool, iu30 iu30Var, iu30 iu30Var2, int i) {
        super(2);
        this.a = (byte) 4;
        this.d = ysf0Var;
        this.b = qim0Var;
        this.e = bool;
        this.g = iu30Var;
        this.f = iu30Var2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay71(mvh1 mvh1Var, iu30 iu30Var, mvh1 mvh1Var2, int i, iu30 iu30Var2, bih1 bih1Var, int i2) {
        super(2);
        this.a = (byte) 16;
        this.d = mvh1Var;
        this.g = iu30Var;
        this.e = mvh1Var2;
        this.c = i;
        this.f = iu30Var2;
        this.b = bih1Var;
    }
}
