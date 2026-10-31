package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kwa0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ es41 b;
    public final /* synthetic */ n2c0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwa0(n2c0 n2c0Var, es41 es41Var, iu30 iu30Var) {
        super(3);
        this.c = n2c0Var;
        this.b = es41Var;
        this.d = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        String strK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        n2c0 n2c0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                j1e1.f((qim0) null, 0L, x340Var, 0, 3);
                byte b2 = 0;
                if (!n2c0Var.f) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(862791898);
                    String strO0 = cwl1.o0(x340Var2, 2131957031);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new ux90(iu30Var, (byte) 29);
                        x340Var2.s0(objT);
                    }
                    c97.c(strO0, null, null, null, false, (Function0) objT, x340Var2, 0, 30);
                    x340Var2.r(false);
                    return rih1Var;
                }
                x340 x340Var3 = x340Var;
                x340Var3.i0(858961693);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarW = uyn1.w(l6o1.H(u291.d(nim0Var, 1.0f), this.b, false, 14), vzq0Var);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarW);
                hzj.A.getClass();
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                jzn1.h(uyn1.x(nim0Var, 16.0f), x340Var3, 0);
                String strO1 = cwl1.o0(x340Var3, 2131957035);
                boolean z = n2c0Var.g;
                tpw0 tpw0Var = n2c0Var.c;
                yxa0 yxa0Var = n2c0Var.d;
                long jQ = f0o1.q(yxa0Var, x340Var3);
                boolean zG2 = x340Var3.g(iu30Var);
                Object objT2 = x340Var3.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new bv70(iu30Var, (byte) 27);
                    x340Var3.s0(objT2);
                }
                yxo1.b(strO1, z, jQ, (iu30) objT2, anm1.N("parent_guardian_checkbox", nim0Var), x340Var3, 0);
                if (tpw0Var == tpw0.e) {
                    x340Var3.i0(1207280914);
                    String strO2 = cwl1.o0(x340Var3, 2131957033);
                    boolean z2 = n2c0Var.h;
                    long jQ2 = f0o1.q(yxa0Var, x340Var3);
                    boolean zG3 = x340Var3.g(iu30Var);
                    Object objT3 = x340Var3.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new bv70(iu30Var, (byte) 28);
                        x340Var3.s0(objT3);
                    }
                    yxo1.b(strO2, z2, jQ2, (iu30) objT3, anm1.N("privacy_policy_checkbox", nim0Var), x340Var3, 0);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(1207773907);
                    x340Var3.r(false);
                }
                s110.d(yxa0Var, apo.r(-898935791, new iwa0(iu30Var, n2c0Var, b2), x340Var3), x340Var3, 48);
                String strO3 = cwl1.o0(x340Var3, 2131957037);
                String strO4 = cwl1.o0(x340Var3, 2131957036);
                long jQ3 = f0o1.q(yxa0Var, x340Var3);
                boolean zG4 = x340Var3.g(iu30Var);
                Object objT4 = x340Var3.T();
                if (zG4 || objT4 == m4cVar) {
                    objT4 = new bv70(iu30Var, (byte) 29);
                    x340Var3.s0(objT4);
                }
                jzn1.g(strO3, strO4, "https://www.spotify.com/legal/end-user-agreement/plain/", jQ3, (iu30) objT4, x340Var3, 0);
                int iOrdinal = tpw0Var.ordinal();
                if (iOrdinal == 0) {
                    x340Var3.i0(-1623552037);
                    x340Var3.r(false);
                    eg.m("This privacy policy type is not supported yet");
                    return null;
                }
                if (iOrdinal == 1) {
                    strK = x0d.k(x340Var3, -1623555658, 2131957029, x340Var3, false);
                } else if (iOrdinal == 2) {
                    strK = x0d.k(x340Var3, -1623559311, 2131957032, x340Var3, false);
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw p3d1.k(x340Var3, -1623564330, false);
                    }
                    strK = x0d.k(x340Var3, -1623555658, 2131957029, x340Var3, false);
                } else {
                    strK = x0d.k(x340Var3, -1623562530, 2131957030, x340Var3, false);
                }
                String str = strK;
                String strO5 = cwl1.o0(x340Var3, 2131957034);
                long jQ4 = f0o1.q(yxa0Var, x340Var3);
                boolean zG5 = x340Var3.g(iu30Var);
                Object objT5 = x340Var3.T();
                if (zG5 || objT5 == m4cVar) {
                    objT5 = new jwa0(iu30Var, (byte) 0);
                    x340Var3.s0(objT5);
                }
                jzn1.g(str, strO5, "https://www.spotify.com/legal/managed-account-plan-manager-privacy-policy/plain/", jQ4, (iu30) objT5, x340Var3, 0);
                String strO6 = cwl1.o0(x340Var3, 2131957039);
                String strO7 = cwl1.o0(x340Var3, 2131957040);
                long jQ5 = f0o1.q(yxa0Var, x340Var3);
                boolean zG6 = x340Var3.g(iu30Var);
                Object objT6 = x340Var3.T();
                if (zG6 || objT6 == m4cVar) {
                    objT6 = new jwa0(iu30Var, (byte) 1);
                    x340Var3.s0(objT6);
                }
                jzn1.g(strO6, strO7, "https://www.spotify.com/legal/managed-account-young-listener-privacy-policy/plain/", jQ5, (iu30) objT6, x340Var3, 0);
                op71.g(x340Var3, u291.h(nim0Var, cbx.b(x340Var3).b.a));
                x340Var3.r(true);
                x340Var3.r(false);
                return rih1Var;
            default:
                vzq0 vzq0Var2 = (vzq0) obj;
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                ujo1.a(uyn1.B(nim0.a, 0.0f, vzq0Var2.d(), 0.0f, 0.0f, 13), this.b, apo.r(-796091883, new mb90(vzq0Var2, n2c0Var, iu30Var, (byte) 21), b0kVar), b0kVar, 384, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwa0(es41 es41Var, n2c0 n2c0Var, iu30 iu30Var) {
        super(3);
        this.b = es41Var;
        this.c = n2c0Var;
        this.d = iu30Var;
    }
}
