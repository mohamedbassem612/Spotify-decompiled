package p;

import android.widget.TextView;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h680 implements o1i {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public h680(igx igxVar, cik1 cik1Var, zn90 zn90Var) {
        this.a = (byte) 2;
        eos eosVarA = igxVar.a(null);
        this.c = eosVarA;
        TextView textView = (TextView) ((ilh1) eosVarA.b).c;
        yee1 yee1Var = new yee1();
        yee1Var.a = BehaviorSubject.f();
        textView.addOnAttachStateChangeListener(yee1Var);
        this.b = new obl1((lvc1) cik1Var.b, (yua) cik1Var.c, (Scheduler) cik1Var.d, (Scheduler) cik1Var.e, zn90Var, yee1Var);
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((g680) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 1:
                d((ufn0) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                e((idg1) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public void c(g680 g680Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1595997082);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(g680Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lfc lfcVar = g680Var.d;
            aec aecVar = g680Var.f;
            String str = g680Var.a;
            String str2 = g680Var.c;
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xvy(this, o0iVar, g680Var, (byte) 21);
                x340Var.s0(objT);
            }
            vbe.u(lfcVar, aecVar, str, str2, g680Var.e, new gbx(z50.c, (Function0) objT), (qim0) null, (yf) null, x340Var, 32768, 192);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, this, g680Var, o0iVar, qim0Var, (byte) 19);
        }
    }

    public void d(ufn0 ufn0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1626502182);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ufn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zBooleanValue = ((Boolean) rwq.h(((fal1) this.c).d, x340Var, 0).getValue()).booleanValue();
            String str = ufn0Var.b;
            boolean z = false;
            String str2 = ufn0Var.a;
            boolean zI = x340Var.i(this);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) {
                z = true;
            }
            boolean z2 = z | zI;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new s2n0(this, o0iVar, (byte) 9);
                x340Var.s0(objT);
            }
            y9g1.h((i2 << 6) & 57344, str, str2, (Function0) objT, x340Var, qim0Var, zBooleanValue);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, ufn0Var, o0iVar, qim0Var, (byte) 10);
        }
    }

    public void e(idg1 idg1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        idg1 idg1Var2 = idg1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(226651162);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(idg1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            pe peVarA = ef.a(x340Var);
            int i3 = i2 & 14;
            boolean zI = x340Var.i(this) | (i3 == 4);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new kwb1(this, idg1Var2, (lnm) null, (byte) 18);
                x340Var.s0(objT);
            }
            qxd0.t(idg1Var2, x340Var, (vu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            qim0 qim0VarB = uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, idg1Var2.b ? 8.0f : 24.0f, 7);
            boolean zI2 = x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new ibf1(this, (byte) 26);
                x340Var.s0(objT3);
            }
            iu30 iu30Var = (iu30) objT3;
            boolean zI3 = x340Var.i(this) | (i3 == 4);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new rsc1(this, idg1Var2, ven0Var, (byte) 21);
                x340Var.s0(objT4);
            }
            dm5.a(iu30Var, qim0VarB, (iu30) objT4, x340Var, 0, 0);
            int i4 = i2 & 112;
            boolean zI4 = (i4 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this) | x340Var.i(peVarA) | (i3 == 4);
            Object objT5 = x340Var.T();
            if (zI4 || objT5 == m4cVar) {
                kdg1 kdg1Var = new kdg1(o0iVar, this, peVarA, idg1Var, ven0Var, (byte) 0);
                idg1Var2 = idg1Var;
                x340Var.s0(kdg1Var);
                objT5 = kdg1Var;
            }
            oto1.c(idg1Var2, o0iVar, (iu30) objT5, x340Var, i3 | 64 | i4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, idg1Var2, o0iVar, qim0Var, (byte) 9);
        }
    }

    public /* synthetic */ h680(Object obj, bcl1 bcl1Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = bcl1Var;
    }
}
