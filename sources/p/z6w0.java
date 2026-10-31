package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z6w0 extends hab0 implements xu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ List a;
    public final /* synthetic */ m8w0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ List h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6w0(List list, m8w0 m8w0Var, boolean z, iu30 iu30Var, ven0 ven0Var, Function0 function0, boolean z2, List list2, boolean z3, iu30 iu30Var2, boolean z4) {
        super(3);
        this.a = list;
        this.b = m8w0Var;
        this.c = z;
        this.d = iu30Var;
        this.e = ven0Var;
        this.f = function0;
        this.g = z2;
        this.h = list2;
        this.i = z3;
        this.t = iu30Var2;
        this.X = z4;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            m8w0 m8w0Var = (m8w0) this.a.get(iIntValue);
            x340Var2.i0(658855515);
            boolean zJ = u890.j(this.b, m8w0Var);
            boolean z2 = (m8w0Var instanceof j8w0) && this.c && zJ;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("mixing_preset_id_type_" + m8w0Var + "_" + zJ, nim0Var);
            j2i j2iVarR = apo.r(597400197, new y6w0(m8w0Var, (byte) 0), x340Var2);
            iu30 iu30Var = this.d;
            if (z2) {
                x340Var2.i0(659503879);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
                nko1.H(gfh0VarC, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                jgx jgxVar = new jgx(8);
                boolean zG = x340Var2.g(iu30Var) | x340Var2.g(m8w0Var);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = new wpu0(iu30Var, m8w0Var, (byte) 26);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                Object objT2 = x340Var2.T();
                ven0 ven0Var = this.e;
                if (objT2 == m4cVar) {
                    objT2 = new q2j0(ven0Var, (byte) 28);
                    x340Var2.s0(objT2);
                }
                s1p1.k(zJ, function0, (Function0) objT2, jgxVar, qim0VarN, (pgx) null, j2iVarR, x340Var2, 1573248);
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = new q2j0(ven0Var, (byte) 29);
                    x340Var2.s0(objT3);
                }
                gt4.a(zBooleanValue, (Function0) objT3, anm1.N("mixing_auto_options_dropdown", nim0Var), 0L, (es41) null, (nfv0) null, (hw61) null, 0L, 0.0f, apo.r(1788488758, new ib7(this.f, this.g, this.h, this.i, this.t, this.X, this.e), x340Var2), x340Var2, 432, 2040);
                x340Var2 = x340Var2;
                x340Var2.r(true);
                z = false;
                x340Var2.r(false);
            } else {
                x340Var2.i0(662862574);
                jgx jgxVar2 = new jgx(8);
                boolean zG2 = x340Var2.g(iu30Var) | x340Var2.g(m8w0Var);
                Object objT4 = x340Var2.T();
                if (zG2 || objT4 == m4cVar) {
                    objT4 = new hzu0(iu30Var, m8w0Var, (byte) 18);
                    x340Var2.s0(objT4);
                }
                s1p1.h(zJ, (iu30) objT4, jgxVar2, qim0VarN, (pgx) null, j2iVarR, x340Var2, 196608);
                z = false;
                x340Var2.r(false);
            }
            x340Var2.r(z);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
