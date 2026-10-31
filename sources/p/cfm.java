package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cfm implements xpw {
    public static final long i;
    public static final /* synthetic */ int t = 0;
    public final qhm a;
    public final qj0 b;
    public final i3l0 c;
    public final ym81 d;
    public final y441 e;
    public final js20 f;
    public final ia00 g = n3o1.q(this).a(new zem(this, (byte) 0), fdm.d);
    public final psw h;

    static {
        ytw0 ytw0Var = jfv.b;
        i = fdg1.k0(250, ngv.d);
    }

    public cfm(qhm qhmVar, qj0 qj0Var, i3l0 i3l0Var, ym81 ym81Var, y441 y441Var, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, q8n q8nVar) {
        this.a = qhmVar;
        this.b = qj0Var;
        this.c = i3l0Var;
        this.d = ym81Var;
        this.e = y441Var;
        this.f = x3p1.n(new v7l(this, (byte) 13), xj.d1, u2m.g, q8nVar, (iu30) null, 16);
        j2i j2iVarJ = apo.j(-1995726738, new bfm(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVarJ, (byte) 0);
    }

    @Override // p.avl1
    public final rqw a() {
        return this.g;
    }

    @Override // p.maa
    public final jsw c() {
        return this.h;
    }

    public final void e(pem pemVar, jhm jhmVar, ihm ihmVar, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-86200182);
        int i3 = (x340Var.g(pemVar) ? 4 : 2) | i2 | (x340Var.i(jhmVar) ? 32 : 16) | (x340Var.i(ihmVar) ? 256 : 128) | (x340Var.g(this) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            zm81 zm81VarD = pemVar.d();
            otw.c(this.a, new nhm(jhmVar, ihmVar, zm81VarD != null ? h2x0.b(zm81VarD, jhmVar.b()) : null, pemVar.c()), null, null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i2, this, pemVar, jhmVar, ihmVar, (byte) 2);
        }
    }

    public final void f(pem pemVar, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-440915852);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(pemVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(this) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean zG = x340Var.g(pemVar.b()) | x340Var.g(pemVar.d());
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                c9 c9VarB = pemVar.b();
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = c9VarB.listIterator(0);
                while (listIterator.hasNext()) {
                    ((jhm) listIterator.next()).getClass();
                }
                objT = sqg0.T(arrayList);
                x340Var.s0(objT);
            }
            vvx.a(zrj.W0, apo.r(636328709, new mzj(this, pemVar, (Map) objT, (byte) 21), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(this, pemVar, i2, (byte) 11);
        }
    }

    public final void g(tem temVar, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i2) throws Throwable {
        int i3;
        h311 h311VarV;
        ydm ydmVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1208780348);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(temVar) : x340Var.i(temVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        boolean z = true;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            int iH = (int) jfv.h(cbx.c(x340Var).b.b);
            ceo ceoVar = ((jhx) cbx.c(x340Var).a.b).a;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xto.t(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1770405141);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new f4g(ven0Var, (byte) 27);
                    x340Var.s0(objT2);
                }
                op71.g(x340Var, irn1.g0(nim0.a, (iu30) objT2));
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ydmVar = new ydm(this, temVar, qim0Var, j2iVar, i2, (byte) 0);
                }
            } else {
                x340Var.i0(1770482982);
                x340Var.r(false);
                if (temVar instanceof oem) {
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        ydmVar = new ydm(this, temVar, qim0Var, j2iVar, i2, (byte) 1);
                    }
                } else {
                    int i4 = i3 & 14;
                    if (i4 != 4 && ((i3 & 8) == 0 || !x340Var.i(temVar))) {
                        z = false;
                    }
                    Object objT3 = x340Var.T();
                    if (z || objT3 == m4cVar) {
                        objT3 = new hzb(temVar, (lnm) null, (byte) 23);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT3);
                    boolean zE = x340Var.e(iH) | x340Var.g(ceoVar);
                    Object objT4 = x340Var.T();
                    if (zE || objT4 == m4cVar) {
                        objT4 = new ym(iH, ceoVar, (byte) 11);
                        x340Var.s0(objT4);
                    }
                    iu30 iu30Var = (iu30) objT4;
                    Object objT5 = x340Var.T();
                    if (objT5 == m4cVar) {
                        objT5 = rbm.Z0;
                        x340Var.s0(objT5);
                    }
                    hm5.a(temVar, qim0Var, iu30Var, null, null, (iu30) objT5, j2iVar, x340Var, 196608 | i4 | (i3 & 112) | ((i3 << 12) & 3670016), 24);
                }
            }
            h311VarV.d = ydmVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ydmVar = new ydm(this, temVar, qim0Var, j2iVar, i2, (byte) 2);
            h311VarV.d = ydmVar;
        }
    }

    @Override // p.maa
    public final mqw getBehavior() {
        return this.f;
    }

    public final void h(pem pemVar, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1914712927);
        int i3 = (x340Var.g(pemVar) ? 4 : 2) | i2 | (x340Var.g(this) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            otw.c(this.b, new lgm(pemVar.a(), pemVar.e(), pemVar.c()), null, null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(this, pemVar, i2, (byte) 19);
        }
    }

    public final void i(pem pemVar, Map map, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1339369307);
        int i3 = i2 | (x340Var.g(pemVar) ? 4 : 2) | (x340Var.g(map) ? 32 : 16) | 384 | (x340Var.g(this) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("CONTEXT_MENU_LIST_TEST_TAG", nim0Var);
            vk80 vk80VarC = hqq0.C(cev0.E(x340Var), x340Var);
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new o0d(pemVar, this, map, (byte) 28);
                x340Var.s0(objT);
            }
            s3o1.d(qim0VarN, (xtb0) null, vk80VarC, (g36) null, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT, x340Var, 0, NativeMediaProcessor.PROCESS_SAMPLE_RESULT_NEGATIVE_SAMPLE_OFFSET);
            qim0Var2 = nim0Var;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i2, this, pemVar, map, qim0Var2, (byte) 3);
        }
    }

    public final void j(qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-966359307);
        int i3 = i2 | 6;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            qim0 qim0VarA = h2c.a.a(too1.y(nim0Var, poo1.F(cev0.E(x340Var), 32)), een.h);
            uwr uwrVar = cbx.a;
            xto1.e(uyn1.z(0.0f, cbx.b(x340Var).b.d, 1, qim0VarA), 5, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
            qim0Var = nim0Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(this, qim0Var, i2, (byte) 20);
        }
    }
}
