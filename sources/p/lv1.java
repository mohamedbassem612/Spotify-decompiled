package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lv1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(String str, String str2, String str3, Function0 function0, boolean z, u7h u7hVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 12;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = function0;
        this.b = z;
        this.h = u7hVar;
        this.i = qim0Var;
        this.c = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        int i = this.c;
        Object obj3 = this.f;
        rih1 rih1Var = rih1.a;
        byte b2 = 1;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                d9p1.a((fu1) obj8, (xtb0) obj7, (Integer) obj3, this.b, (vu30) obj6, (bx1) obj5, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                buo1.k(this.b, (String) obj8, (jwm) obj7, (List) obj3, (Function0) obj6, (Function0) obj5, (Function0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                f8m f8mVar = (f8m) obj8;
                ven0 ven0Var = (ven0) obj4;
                m4c m4cVar = fkj0.X;
                ven0 ven0Var2 = (ven0) obj5;
                m7m m7mVar = (m7m) obj7;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    f8m f8mVar2 = (f8m) obj8;
                    k7m k7mVar = m7mVar.b;
                    iu30 iu30Var = (iu30) obj3;
                    kes kesVar = (kes) obj6;
                    boolean zBooleanValue = ((Boolean) ven0Var2.getValue()).booleanValue();
                    boolean zI = x340Var2.i(ven0Var2);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new hnf(ven0Var2, (byte) 13);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zI2 = x340Var2.i(ven0Var);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new xd2(ven0Var, (byte) 6);
                        x340Var2.s0(objT2);
                    }
                    f8mVar2.e(k7mVar, iu30Var, kesVar, zBooleanValue, function0, (vu30) objT2, this.c, m7mVar.a, (!f8mVar.l || f8mVar.g.c() || f8mVar.n) ? false : true, (qim0) null, this.b, m7mVar.b instanceof i7m, x340Var2, 0);
                }
                break;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                err0 err0Var = (hdn0) obj8;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    Object objT3 = x340Var4.T();
                    if (objT3 == fkj0.X) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var4.s0(objT3);
                    }
                    ven0 ven0Var3 = (ven0) objT3;
                    long jC = jhc1.c(20.0f, 20.0f);
                    fuo1.d(err0Var.s(), ((Boolean) ven0Var3.getValue()).booleanValue(), jC, apo.r(-365309774, new g1o(obj7, obj3, (byte) 3), x340Var4), apo.r(-287188685, new yoe(err0Var, b2), x340Var4), apo.r(-209067596, new sqk(2, (byte) 15), x340Var4), apo.r(-130946507, new sqk(2, (byte) 16), x340Var4), apo.r(-52825418, new fa5((hdn0) obj8, ven0Var3, this.b, (ven0) obj6, this.c, (iu30) obj5, (jsg) obj4, jC), x340Var4), null, x340Var4, 115040256);
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                ljo1.h((vzq0) obj8, (jkr0) obj7, (c380) obj3, this.b, (qim0) obj6, (Function0) obj5, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                x3p1.f(this.c, (hnk0) obj8, (String) obj7, (String) obj3, (fcf0) obj6, (kbf0) obj5, this.b, (iu30) obj4, (b0k) obj, czo1.p(1));
                break;
            case 6:
                ((Number) obj2).intValue();
                bcn0.a((ksw) obj8, (klw0) obj7, (String) obj3, (yqg) obj6, (n1k) obj5, this.b, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                oho1.c((String) obj8, (e6r) obj7, (iu30) obj3, (r6r) obj6, this.b, this.c, (xu30) obj5, (Function0) obj4, (b0k) obj, czo1.p(4097));
                break;
            case 8:
                ((Number) obj2).intValue();
                l6o1.e((String) obj8, (String) obj7, (String) obj3, (cm10) obj6, (Function0) obj5, (qim0) obj4, this.b, (b0k) obj, czo1.p(i | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                zqo1.j((j701) obj8, (mbl1) obj7, (edl1) obj3, (ezj) obj6, (fza) obj5, this.b, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                t8p1.f((aqb0) obj8, (pe21) obj7, this.f, (qim0) obj6, (qim0) obj5, this.b, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                p1p1.d((String) obj8, (String) obj7, this.b, (Function0) obj3, (j2i) obj4, (j2i) obj6, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                lcc.w((String) obj8, (String) obj7, (String) obj3, (Function0) obj6, this.b, (u7h) obj5, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(int i, hnk0 hnk0Var, String str, String str2, fcf0 fcf0Var, kbf0 kbf0Var, boolean z, iu30 iu30Var, int i2) {
        super(2);
        this.a = (byte) 5;
        this.c = i;
        this.d = hnk0Var;
        this.e = str;
        this.f = str2;
        this.g = fcf0Var;
        this.h = kbf0Var;
        this.b = z;
        this.i = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv1(Object obj, ct41 ct41Var, Object obj2, boolean z, Object obj3, cv30 cv30Var, cv30 cv30Var2, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = ct41Var;
        this.f = obj2;
        this.b = z;
        this.g = obj3;
        this.h = cv30Var;
        this.i = cv30Var2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv1(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.b = z;
        this.i = obj6;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(String str, String str2, String str3, cm10 cm10Var, Function0 function0, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.a = (byte) 8;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = cm10Var;
        this.h = function0;
        this.i = qim0Var;
        this.b = z;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(String str, String str2, boolean z, Function0 function0, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 11;
        this.d = str;
        this.e = str2;
        this.b = z;
        this.f = function0;
        this.i = j2iVar;
        this.g = j2iVar2;
        this.h = qim0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(String str, e6r e6rVar, iu30 iu30Var, r6r r6rVar, boolean z, int i, xu30 xu30Var, Function0 function0, int i2) {
        super(2);
        this.a = (byte) 7;
        this.d = str;
        this.e = e6rVar;
        this.f = iu30Var;
        this.g = r6rVar;
        this.b = z;
        this.c = i;
        this.h = xu30Var;
        this.i = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(f8m f8mVar, m7m m7mVar, iu30 iu30Var, kes kesVar, ven0 ven0Var, ven0 ven0Var2, int i, boolean z) {
        super(2);
        this.a = (byte) 2;
        this.d = f8mVar;
        this.e = m7mVar;
        this.f = iu30Var;
        this.g = kesVar;
        this.h = ven0Var;
        this.i = ven0Var2;
        this.c = i;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(hdn0 hdn0Var, if5 if5Var, String str, boolean z, ven0 ven0Var, int i, iu30 iu30Var, jsg jsgVar) {
        super(2);
        this.a = (byte) 3;
        this.d = hdn0Var;
        this.e = if5Var;
        this.f = str;
        this.b = z;
        this.g = ven0Var;
        this.c = i;
        this.h = iu30Var;
        this.i = jsgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(boolean z, String str, jwm jwmVar, List list, Function0 function0, Function0 function1, Function0 function2, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = z;
        this.d = str;
        this.e = jwmVar;
        this.f = list;
        this.g = function0;
        this.h = function1;
        this.i = function2;
        this.c = i;
    }
}
