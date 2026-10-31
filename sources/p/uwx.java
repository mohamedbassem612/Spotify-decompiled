package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uwx extends hab0 implements vu30 {
    public final /* synthetic */ swx N0;
    public final /* synthetic */ zwx O0;
    public final /* synthetic */ qim0 P0;
    public final /* synthetic */ tob1 Q0;
    public final /* synthetic */ tob1 R0;
    public final /* synthetic */ List S0;
    public final /* synthetic */ int T0;
    public final /* synthetic */ ksg X;
    public final /* synthetic */ vu30 Y;
    public final /* synthetic */ vu30 Z;
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ idn0 i;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uwx(qim0 qim0Var, String str, float f, boolean z, ven0 ven0Var, iu30 iu30Var, boolean z2, Function0 function0, idn0 idn0Var, int i, ksg ksgVar, vu30 vu30Var, vu30 vu30Var2, swx swxVar, zwx zwxVar, qim0 qim0Var2, ven0 ven0Var2, ven0 ven0Var3, List list, int i2) {
        super(2);
        this.a = qim0Var;
        this.b = str;
        this.c = f;
        this.d = z;
        this.e = ven0Var;
        this.f = iu30Var;
        this.g = z2;
        this.h = function0;
        this.i = idn0Var;
        this.t = i;
        this.X = ksgVar;
        this.Y = vu30Var;
        this.Z = vu30Var2;
        this.N0 = swxVar;
        this.O0 = zwxVar;
        this.P0 = qim0Var2;
        this.Q0 = ven0Var2;
        this.R0 = ven0Var3;
        this.S0 = list;
        this.T0 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, this.a);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0 qim0VarB = nim0.a;
            qim0 qim0VarF = u291.f(qim0VarB, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarA = py20.a(qim0VarF, 0L, er31.b(4.0f), x340Var2, 0, 13);
            String str = this.b;
            if (str != null) {
                x340Var2.i0(-1015173050);
                boolean zG = x340Var2.g(str);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = new kov(str, (byte) 10);
                    x340Var2.s0(objT);
                }
                qim0VarB = s161.b(qim0VarB, false, (iu30) objT);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1906918587);
                x340Var2.r(false);
            }
            qim0 qim0VarThen = qim0VarA.then(qim0VarB);
            boolean z = this.d;
            boolean zH = x340Var2.h(z);
            ven0 ven0Var = this.e;
            boolean zI = zH | x340Var2.i(ven0Var);
            iu30 iu30Var = this.f;
            boolean zG2 = zI | x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new twx(iu30Var, ven0Var, z);
                x340Var2.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean zI2 = x340Var2.i(ven0Var) | x340Var2.h(z);
            Function0 function0 = this.h;
            boolean zG3 = zI2 | x340Var2.g(function0);
            Object objT3 = x340Var2.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = new hrn(z, function0, ven0Var, (byte) 1);
                x340Var2.s0(objT3);
            }
            boolean z2 = this.g;
            swx swxVar = this.N0;
            zwx zwxVar = this.O0;
            rb91.a(this.c, iu30Var2, qim0VarThen, z2, (Function0) objT3, (fb91) null, this.i, this.t, apo.r(-1432077937, new j6v(z2, swxVar, zwxVar, this.P0, this.Q0, this.R0), x340Var2), apo.r(-1599030064, new jaf(this.S0, z2, swxVar, zwxVar, this.T0), x340Var2), this.X, x340Var2, 905969664, 0, 32);
            vu30 vu30Var = this.Y;
            vu30 vu30Var2 = this.Z;
            if (vu30Var == null && vu30Var2 == null) {
                x340Var2.i0(-1013714097);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1013858247);
                guo1.i(vu30Var, vu30Var2, x340Var2, 0);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
