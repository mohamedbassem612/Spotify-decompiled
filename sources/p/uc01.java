package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uc01 extends hab0 implements zu30 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ String X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ List a;
    public final /* synthetic */ lee1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yae1 e;
    public final /* synthetic */ hc01 f;
    public final /* synthetic */ wux g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ z680 i;
    public final /* synthetic */ md01 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc01(List list, lee1 lee1Var, int i, int i2, yae1 yae1Var, hc01 hc01Var, wux wuxVar, Function0 function0, z680 z680Var, md01 md01Var, String str, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3) {
        super(4);
        this.a = list;
        this.b = lee1Var;
        this.c = i;
        this.d = i2;
        this.e = yae1Var;
        this.f = hc01Var;
        this.g = wuxVar;
        this.h = function0;
        this.i = z680Var;
        this.t = md01Var;
        this.X = str;
        this.Y = ven0Var;
        this.Z = ven0Var2;
        this.N0 = ven0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        ven0 ven0Var = this.Y;
        if (iIntValue < ((List) ven0Var.getValue()).size()) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1607279865);
            if (iIntValue >= 0) {
                List list = this.a;
                if (iIntValue < list.size()) {
                    obj5 = list.get(iIntValue);
                } else {
                    obj5 = 0;
                }
            } else {
                obj5 = 0;
            }
            int iIntValue2 = ((Number) obj5).intValue();
            int length = ((String) ((List) ven0Var.getValue()).get(iIntValue)).length() + iIntValue2;
            tob1 tob1Var = this.Z;
            boolean zG = x340Var2.g((List) tob1Var.getValue()) | x340Var2.e(iIntValue2) | x340Var2.e(length);
            Object objT = x340Var2.T();
            Object obj6 = objT;
            if (zG || objT == m4cVar) {
                List list2 = (List) tob1Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : list2) {
                    r8e1 r8e1Var = (r8e1) obj7;
                    if (r8e1Var.a < length && r8e1Var.b > iIntValue2) {
                        arrayList.add(obj7);
                    }
                }
                x340Var2.s0(arrayList);
                obj6 = arrayList;
            }
            zc01.c((String) ((List) ven0Var.getValue()).get(iIntValue), this.b, this.c, ((int) (((yr80) this.N0.getValue()).a >> 32)) - this.d, iIntValue < ((List) ven0Var.getValue()).size() - 1, this.e, this.f, this.g, this.h, this.i, iIntValue2, (List) obj6, null, x340Var2, 0);
            x340Var2.r(false);
        } else if (((List) ven0Var.getValue()).isEmpty()) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1606453126);
            otw.c(this.t, new kd01(this.X), (qim0) null, (ipb1) null, x340Var3, 0, 12);
            x340Var3.r(false);
        } else {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-1606333776);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            Object objT2 = x340Var4.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var4);
            }
            idn0 idn0Var = (idn0) objT2;
            Function0 function0 = this.h;
            boolean zG2 = x340Var4.g(function0);
            Object objT3 = x340Var4.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new lpx0(function0, (byte) 20);
                x340Var4.s0(objT3);
            }
            qim0 qim0VarV = bin.v(qim0VarD, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT3, 28);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var4.T);
            xos0 xos0VarM = x340Var4.m();
            qim0 qim0VarE = zr7.E(x340Var4, qim0VarV);
            hzj.A.getClass();
            if (x340Var4.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var4.m0();
            if (x340Var4.S) {
                x340Var4.l(hmb0.t1);
            } else {
                x340Var4.v0();
            }
            nko1.H(gfh0VarC, x340Var4, y580.O0);
            nko1.H(xos0VarM, x340Var4, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
            nko1.F(x340Var4);
            nko1.H(qim0VarE, x340Var4, y580.Y);
            xto1.e((qim0) null, 0, this.f.b, 0L, x340Var4, 0, 11);
            x340Var4.r(true);
            x340Var4.r(false);
        }
        return rih1.a;
    }
}
