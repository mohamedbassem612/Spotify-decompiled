package p;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sgi0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgi0(Function0 function0, jxa jxaVar, cgi0 cgi0Var, kly0 kly0Var, j2i j2iVar) {
        super(5);
        this.b = function0;
        this.c = cgi0Var;
        this.d = kly0Var;
        this.e = j2iVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        tl7 qbo0Var;
        x340 x340Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        Object obj9 = this.b;
        switch (b) {
            case 0:
                ksw kswVar = (ksw) obj;
                igi0 igi0Var = (igi0) obj2;
                iu30 iu30Var = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                x340 x340Var2 = (b0k) obj4;
                Object objT = x340Var2.T();
                Object obj10 = fkj0.X;
                if (objT == obj10) {
                    objT = new LinkedHashMap();
                    x340Var2.s0(objT);
                }
                Map map = (Map) objT;
                Function0 function0 = (Function0) obj9;
                if (function0 == null || (qbo0Var = (tl7) function0.invoke()) == null) {
                    qbo0Var = new qbo0();
                }
                String str = igi0Var.a;
                Object kgi0Var = map.get(str);
                if (kgi0Var == null) {
                    kgi0Var = new kgi0();
                    map.put(str, kgi0Var);
                }
                kgi0 kgi0Var2 = (kgi0) kgi0Var;
                String str2 = igi0Var.a;
                boolean zI = x340Var2.i(kgi0Var2) | ((((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var2.i(igi0Var);
                Object objT2 = x340Var2.T();
                if (zI || objT2 == obj10) {
                    objT2 = new dt90(kgi0Var2, iu30Var, igi0Var, (byte) 21);
                    x340Var2.s0(objT2);
                }
                Function0 function1 = (Function0) objT2;
                boolean zI2 = x340Var2.i(kgi0Var2);
                Object objT3 = x340Var2.T();
                if (zI2 || objT3 == obj10) {
                    objT3 = new qgi0(kgi0Var2, (byte) 2);
                    x340Var2.s0(objT3);
                }
                tl7 tl7Var = qbo0Var;
                i1o1.b(kswVar, tl7Var, str2, function1, (Function0) objT3, x340Var2, iIntValue & 14, 0);
                rce0.a(tl7Var, apo.r(-568662420, new uuy((cgi0) obj8, igi0Var, iu30Var, kgi0Var2, (kly0) obj7, (j2i) obj6, (byte) 21), x340Var2), x340Var2, 48);
                return rih1Var;
            default:
                rq31 rq31Var = (rq31) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                sq31 sq31Var = rq31Var.c;
                qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                iq31 iq31Var = (iq31) obj9;
                yqg yqgVar = iq31Var.b;
                gq31 gq31Var = iq31Var.a;
                hlq hlqVar = (hlq) obj8;
                ilq ilqVar = (ilq) obj7;
                slq slqVar = (slq) obj6;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarD);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(hmb0.t1);
                } else {
                    x340Var5.v0();
                }
                nko1.H(mbhVarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                if (sq31Var instanceof sq31) {
                    x340Var5.i0(2095465099);
                    x340Var = x340Var5;
                    h7w.j(gq31Var.b, rq31Var, sq31Var, gq31Var.f, iu30Var2, yqgVar, hlqVar, ilqVar, x340Var3, (iIntValue2 & 112) | (57344 & (iIntValue2 << 6)));
                    x340Var.r(false);
                } else {
                    x340Var = x340Var5;
                    if (!(sq31Var instanceof tq31)) {
                        throw p3d1.k(x340Var, 2095463259, false);
                    }
                    x340Var.i0(2095479712);
                    h7w.k(gq31Var.a, gq31Var.b, rq31Var.e, gq31Var.f, rq31Var, (tq31) sq31Var, iu30Var2, yqgVar, hlqVar, slqVar, x340Var3, ((iIntValue2 << 9) & 57344) | ((iIntValue2 << 12) & 3670016));
                    x340Var.r(false);
                }
                x340Var.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgi0(iq31 iq31Var, hlq hlqVar, ilq ilqVar, slq slqVar) {
        super(5);
        this.b = iq31Var;
        this.c = hlqVar;
        this.d = ilqVar;
        this.e = slqVar;
    }
}
