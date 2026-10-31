package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zoe extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ cv30 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoe(hob1 hob1Var, iu30 iu30Var, iu30 iu30Var2, boolean z, yqg yqgVar, znb0 znb0Var, boolean z2, i091 i091Var, boolean z3, vu30 vu30Var) {
        super(2);
        this.f = hob1Var;
        this.b = iu30Var;
        this.g = iu30Var2;
        this.c = z;
        this.h = yqgVar;
        this.i = znb0Var;
        this.d = z2;
        this.t = i091Var;
        this.e = z3;
        this.X = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.X;
        Object obj4 = this.i;
        Function0 function0 = this.g;
        Object obj5 = this.h;
        Object obj6 = this.t;
        Object obj7 = this.b;
        Object obj8 = this.f;
        byte b2 = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                hdn0 hdn0Var = (hdn0) obj3;
                Function0 function1 = function0;
                iu30 iu30Var = (iu30) obj7;
                y7e1 y7e1Var = (y7e1) obj8;
                Object obj9 = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    c6e1 c6e1Var = nqf.a;
                    kua0 kua0Var = new kua0(0, (Boolean) null, 0, 4, 119);
                    boolean zI = x340Var2.i(y7e1Var) | x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == obj9) {
                        objT = new u2b(y7e1Var, iu30Var, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    yta0 yta0Var = (yta0) objT;
                    boolean zG = x340Var2.g(function1);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == obj9) {
                        objT2 = new vj0(function1, (byte) 13);
                        x340Var2.s0(objT2);
                    }
                    qim0 qim0VarG = cev0.G(nim0.a, (iu30) objT2);
                    String str = (String) obj6;
                    j2i j2iVarR = apo.r(-2088220494, new xoe((Function0) obj5, this.d, this.e, (Function0) obj4), x340Var2);
                    boolean zI2 = x340Var2.i(hdn0Var);
                    Object objT3 = x340Var2.T();
                    if (zI2 || objT3 == obj9) {
                        objT3 = new yoe(hdn0Var, b2);
                        x340Var2.s0(objT3);
                    }
                    pwo1.a(y7e1Var, qim0VarG, null, str, rqf.b, null, j2iVarR, kua0Var, yta0Var, null, c6e1Var, (vu30) objT3, this.c, null, x340Var2, 1572864, 0, 8740);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) function0;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    hob1 hob1Var = (hob1) obj8;
                    iu30 iu30Var3 = (iu30) obj7;
                    boolean zG2 = x340Var4.g(iu30Var2);
                    Object objT4 = x340Var4.T();
                    if (zG2 || objT4 == fkj0.X) {
                        objT4 = new edi0(iu30Var2, (byte) 0);
                        x340Var4.s0(objT4);
                    }
                    eqr0.f(hob1Var, iu30Var3, (Function0) objT4, this.c, (qim0) null, (yqg) obj5, (znb0) obj4, this.d, (i091) obj6, this.e, (vu30) obj3, x340Var4, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                boolean z = this.e;
                int iP = czo1.p(1);
                ((s880) obj8).a((apl) obj7, (String) obj6, (String) obj5, this.c, function0, (w4i1) obj4, (qim0) obj3, this.d, z, (b0k) obj, iP);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoe(s880 s880Var, apl aplVar, String str, String str2, boolean z, Function0 function0, w4i1 w4i1Var, qim0 qim0Var, boolean z2, boolean z3, int i) {
        super(2);
        this.f = s880Var;
        this.b = aplVar;
        this.t = str;
        this.h = str2;
        this.c = z;
        this.g = function0;
        this.i = w4i1Var;
        this.X = qim0Var;
        this.d = z2;
        this.e = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoe(y7e1 y7e1Var, iu30 iu30Var, Function0 function0, String str, hdn0 hdn0Var, boolean z, Function0 function1, boolean z2, boolean z3, Function0 function2) {
        super(2);
        this.f = y7e1Var;
        this.b = iu30Var;
        this.g = function0;
        this.t = str;
        this.X = hdn0Var;
        this.c = z;
        this.h = function1;
        this.d = z2;
        this.e = z3;
        this.i = function2;
    }
}
