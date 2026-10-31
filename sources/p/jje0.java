package p;

import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jje0 extends hab0 implements vu30 {
    public final /* synthetic */ az20 N0;
    public final /* synthetic */ vu30 O0;
    public final /* synthetic */ String X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ k6a1 Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ List i;
    public final /* synthetic */ j2i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jje0(String str, iu30 iu30Var, String str2, boolean z, boolean z2, Function0 function0, Function0 function1, boolean z3, List list, j2i j2iVar, String str3, List list2, k6a1 k6a1Var, az20 az20Var, vu30 vu30Var) {
        super(2);
        this.a = str;
        this.b = iu30Var;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = function0;
        this.g = function1;
        this.h = z3;
        this.i = list;
        this.t = j2iVar;
        this.X = str3;
        this.Y = list2;
        this.Z = k6a1Var;
        this.N0 = az20Var;
        this.O0 = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            WeakHashMap weakHashMap = osl1.x;
            float fA = poo1.x(new bgc0(lhc.g(x340Var2).g, 32), x340Var2).a();
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            float f = fA + 12.0f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            float f2 = cbx.b(x340Var2).e.b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            float f3 = cbx.b(x340Var2).e.b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, f2, 8.0f, f3, 12.0f);
            String str = this.a;
            g9p1.f(str, this.b, qim0VarA, x340Var2, 0);
            if (str.length() == 0) {
                x340Var2.i0(1526441233);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, f, 7);
                String str2 = this.c;
                boolean zG = x340Var2.g(str2);
                boolean z2 = this.d;
                boolean zH = zG | x340Var2.h(z2);
                boolean z3 = this.e;
                boolean zH2 = zH | x340Var2.h(z3);
                Function0 function0 = this.f;
                boolean zG2 = zH2 | x340Var2.g(function0);
                Function0 function1 = this.g;
                boolean zG3 = zG2 | x340Var2.g(function1);
                boolean z4 = this.h;
                boolean zH3 = zG3 | x340Var2.h(z4);
                List list = this.i;
                boolean zI = zH3 | x340Var2.i(list);
                j2i j2iVar = this.t;
                boolean zG4 = zI | x340Var2.g(j2iVar);
                Object objT = x340Var2.T();
                if (zG4 || objT == m4cVar) {
                    ije0 ije0Var = new ije0(list, str2, z2, z3, function0, function1, z4, j2iVar);
                    x340Var2.s0(ije0Var);
                    objT = ije0Var;
                }
                ujo1.d(qim0VarF2, null, zzq0VarJ, false, null, null, null, false, null, (iu30) objT, x340Var2, 0, 506);
                x340Var2.r(false);
            } else {
                String str3 = this.X;
                if (str3 != null) {
                    x340Var2.i0(1526515295);
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD2);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    String strN0 = cwl1.n0(2131952888, new Object[]{str3}, x340Var2);
                    lee1 lee1Var = cbx.d(x340Var2).e;
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = gje0.c;
                        x340Var2.s0(objT2);
                    }
                    uwo1.e(strN0, s161.b(nim0Var, false, (iu30) objT2), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                    x340Var2.r(true);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1526527959);
                    qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                    zzq0 zzq0VarJ2 = uyn1.j(0.0f, 0.0f, 0.0f, f, 7);
                    List list2 = this.Y;
                    boolean zI2 = x340Var2.i(list2);
                    k6a1 k6a1Var = this.Z;
                    boolean zI3 = zI2 | x340Var2.i(k6a1Var);
                    az20 az20Var = this.N0;
                    boolean zI4 = zI3 | x340Var2.i(az20Var);
                    vu30 vu30Var = this.O0;
                    boolean zG5 = x340Var2.g(vu30Var) | zI4;
                    Object objT3 = x340Var2.T();
                    if (zG5 || objT3 == m4cVar) {
                        lhx lhxVar = new lhx(list2, k6a1Var, az20Var, vu30Var, (byte) 29);
                        x340Var2.s0(lhxVar);
                        objT3 = lhxVar;
                    }
                    ujo1.d(qim0VarF3, null, zzq0VarJ2, false, null, null, null, false, null, (iu30) objT3, x340Var2, 0, 506);
                    x340Var2.r(false);
                }
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
