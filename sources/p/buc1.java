package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class buc1 {
    public final Context a;
    public final String b;
    public final xvo c;
    public final dlg1 d;
    public final vxe1 e;
    public final kly0 f;
    public final ezb1 g;
    public final bpb1 h = gio1.b(Boolean.FALSE);
    public List i;

    public buc1(Context context, String str, xvo xvoVar, dlg1 dlg1Var, vxe1 vxe1Var, chp chpVar, ezb1 ezb1Var) {
        this.a = context;
        this.b = str;
        this.c = xvoVar;
        this.d = dlg1Var;
        this.e = vxe1Var;
        this.f = chpVar;
        this.g = ezb1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(qtc1 qtc1Var, Integer num, rxe1 rxe1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        rxe1 rxe1VarM;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1241364226);
        int i2 = i | (x340Var.g(qtc1Var) ? 4 : 2) | (x340Var.g(num) ? 32 : 16) | (x340Var.i(rxe1Var) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (qtc1Var.equals(ntc1.a)) {
                x340Var.i0(-1546196784);
                x340Var.r(false);
            } else if (qtc1Var.equals(otc1.a)) {
                x340Var.i0(-687411934);
                for (int i3 = 0; i3 < 2; i3++) {
                    h4o1.j((qim0) null, x340Var, 0);
                }
                x340Var.r(false);
            } else {
                if (!(qtc1Var instanceof ptc1)) {
                    throw p3d1.k(x340Var, -1546197252, false);
                }
                x340Var.i0(-687281641);
                if (rxe1Var == null) {
                    x340Var.i0(-1546186138);
                    rxe1VarM = d4o1.m(num, this.e, x340Var, (i2 >> 3) & 14);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1546187099);
                    x340Var.r(false);
                    rxe1VarM = rxe1Var;
                }
                int i4 = 0;
                for (Object obj : ((ptc1) qtc1Var).b) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    jtc1 jtc1Var = (jtc1) obj;
                    x340Var.f0(1126196468, jtc1Var.a);
                    Integer numValueOf = Integer.valueOf(i4);
                    boolean zE = x340Var.e(i4);
                    Object objT = x340Var.T();
                    if (zE || objT == fkj0.X) {
                        objT = new sl11(i4, (byte) 13);
                        x340Var.s0(objT);
                    }
                    dgo1.c(numValueOf, (iu30) objT, apo.r(61662275, new qm71(this, rxe1VarM, jtc1Var, (byte) 29), x340Var), x340Var, 384);
                    x340Var.r(false);
                    i4 = i5;
                }
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, this, qtc1Var, num, rxe1Var, (byte) 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        ztc1 ztc1Var;
        List m231Var;
        if (onmVar instanceof ztc1) {
            ztc1Var = (ztc1) onmVar;
            int i = ztc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztc1Var.c = i - Integer.MIN_VALUE;
            } else {
                ztc1Var = new ztc1(this, onmVar);
            }
        } else {
            ztc1Var = new ztc1(this, onmVar);
        }
        Object objG = ztc1Var.a;
        int i2 = ztc1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                ezb1 ezb1Var = this.g;
                String str = this.b;
                ztc1Var.c = 1;
                objG = ezb1Var.g(str, ztc1Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objG);
            }
            m231Var = o7h.d1((Iterable) objG, 2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Extender: failed to load suggested prompts: %s", new Object[]{thA.getMessage()});
        }
        return m231Var instanceof m231 ? z6x.a : m231Var;
    }
}
