package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nok extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nok(int i, int i2, Function0 function0, Function0 function1, Function0 function2) {
        super(2);
        this.a = (byte) 24;
        this.c = i;
        this.d = function0;
        this.e = function1;
        this.b = function2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                v8r.a((gok) obj5, (xnk) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                c680.f((wtk) obj5, (bs91) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                w6d1.a((oll) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                w6d1.b((oll) obj5, (iu30) obj3, (vzq0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                pxl.d((qwl) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                pxl.f((String) obj5, (t9b1) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((s3m) obj5).e((SearchConfiguration) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                ((q7m) obj5).g(iP, (Function0) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((f8m) obj5).c((h7m) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ((f8m) obj5).f((l7c1) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((f8m) obj5).l((String) obj4, (l7c1) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(3073);
                ((f8m) obj5).n((m7m) obj4, (iu30) obj3, this.c, (b0k) obj, iP2);
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                mno1.b((xa51) obj5, (qim0) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((qlb) obj5).f((rem) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((lfm) obj5).e((kem) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                dgo1.c(obj5, (iu30) obj3, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                fxm.a((vwm) obj5, (List) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                nho1.b((jxm) obj5, (qlb) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                nho1.d((mxm) obj5, (qlb) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                dym.c((wxm) obj5, (vu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                sio1.b((i2n) obj5, (res) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ljo1.d((d4n) obj5, (a4n) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((gnn) obj5).a((otn0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                zro1.c((m3o) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                int i2 = this.c;
                jyo1.b(i2, (Function0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, iP3);
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                g2p1.p((pyq) obj5, (xxq) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                ((aor) obj5).e((g3l) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ((iir) obj5).b((etu) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 28:
                String str = (String) obj;
                zu60 zu60Var = (zu60) obj2;
                vr60 vr60Var = (vr60) obj3;
                k9r k9rVar = (k9r) obj4;
                int iOrdinal = ((j16) obj5).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        k9rVar.u(i, vr60Var, str, zu60Var);
                        return rih1Var;
                    }
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                k9rVar.s(i, vr60Var, str, zu60Var);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                k8p1.d((s6j0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nok(byte b, int i, Object obj, Object obj2, iu30 iu30Var) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = iu30Var;
        this.e = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nok(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nok(j16 j16Var, k9r k9rVar, int i, vr60 vr60Var) {
        super(2);
        this.a = (byte) 28;
        this.d = j16Var;
        this.e = k9rVar;
        this.c = i;
        this.b = vr60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nok(wtk wtkVar, bs91 bs91Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.d = wtkVar;
        this.e = bs91Var;
        this.b = iu30Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nok(oll ollVar, iu30 iu30Var, vzq0 vzq0Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.d = ollVar;
        this.b = iu30Var;
        this.e = vzq0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nok(f8m f8mVar, h7m h7mVar, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 8;
        this.d = f8mVar;
        this.e = h7mVar;
        this.b = iu30Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nok(f8m f8mVar, m7m m7mVar, iu30 iu30Var, int i, int i2) {
        super(2);
        this.a = (byte) 11;
        this.d = f8mVar;
        this.e = m7mVar;
        this.b = iu30Var;
        this.c = i;
    }
}
