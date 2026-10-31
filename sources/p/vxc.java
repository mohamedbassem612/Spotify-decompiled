package p;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vxc implements o1i {
    public final /* synthetic */ byte a = 0;
    public final lzn0 b;
    public final bcl1 c;

    public vxc(bcl1 bcl1Var, lzn0 lzn0Var) {
        this.c = bcl1Var;
        this.b = lzn0Var;
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((uxc) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                d((zxc) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        switch (this.a) {
            case 0:
                return new x0i(new w0i(o0iVar.e, "call_to_action_events_button", null, null, 12));
            default:
                return new x0i(new w0i(o0iVar.e, "call_to_action_navigation_button", ((zxc) z0iVar).a, null, 8));
        }
    }

    public void c(uxc uxcVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1146128122);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(uxcVar) ? 4 : 2) | i;
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
            String str = uxcVar.a;
            hux huxVar = uxcVar.b;
            String str2 = uxcVar.c;
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new d1c(this, o0iVar, uxcVar, (byte) 3);
                x340Var.s0(objT);
            }
            qpn1.a(64 | ((i2 << 6) & 57344), str, str2, (Function0) objT, x340Var, huxVar, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, uxcVar, o0iVar, qim0Var, (byte) 8);
        }
    }

    public void d(zxc zxcVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1999269574);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(zxcVar) ? 4 : 2) | i;
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
            int i3 = i2 & 14;
            boolean zI = x340Var.i(this) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | (i3 == 4);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new d1c(this, o0iVar, zxcVar, (byte) 4);
                x340Var.s0(objT);
            }
            qim0 qim0VarY = uyn1.y(dug.f(uyn1.B(eqn1.k(qim0Var, (Function0) objT), 0.0f, 0.0f, 0.0f, 8.0f, 7), u7h.b(u7h.f, 0.2f, 0.0f, 0.0f, 0.0f, 14), er31.b(16.0f)), 12.0f, 8.0f);
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ayc(zxcVar, (byte) 1);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarY, false, (iu30) objT2);
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            yxc yxcVar = zxcVar.b;
            if (yxcVar == null) {
                x340Var.i0(-1226094331);
                z = false;
            } else {
                z = false;
                x340Var.i0(-1226094330);
                e(yxcVar, x340Var, (i2 >> 6) & 112);
            }
            x340Var.r(z);
            String str = zxcVar.c;
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1778);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, zxcVar, o0iVar, qim0Var, (byte) 9);
        }
    }

    public void e(yxc yxcVar, b0k b0kVar, int i) {
        int i2;
        nux nuxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(790766499);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(yxcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = yxcVar.a;
            xxc xxcVar = yxcVar.b;
            isl islVar = isl.a;
            if (str != null) {
                x340Var.i0(-282601277);
                hux huxVarN = c0p1.n(yxcVar.a);
                if (huxVarN == null) {
                    x340Var.i0(-170704994);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-170704993);
                    w0h1.a(huxVarN, islVar, u291.r(nim0.a, 18.0f), 0L, 0L, false, x340Var, 440, 56);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else if (xxcVar != null) {
                x340Var.i0(-170459504);
                int iC = l1d.C(xxcVar.b);
                if (iC == 0) {
                    box boxVar = box.c;
                    nuxVar = new nux(boxVar, boxVar);
                } else if (iC == 1) {
                    nkx nkxVar = nkx.c;
                    nuxVar = new nux(nkxVar, nkxVar);
                } else if (iC == 2) {
                    mrx mrxVar = mrx.c;
                    nuxVar = new nux(mrxVar, mrxVar);
                } else if (iC != 3) {
                    eg.o();
                    return;
                } else {
                    ttx ttxVar = ttx.c;
                    nuxVar = new nux(ttxVar, ttxVar);
                }
                eso1.e(Uri.parse(xxcVar.a), islVar, null, new p3v(18.0f), null, null, null, null, null, nuxVar, false, false, x340Var, 1073744944, 0, 3572);
                x340Var.r(false);
            } else {
                x340Var.i0(-169854849);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(this, yxcVar, i, (byte) 20);
        }
    }

    public vxc(lzn0 lzn0Var, bcl1 bcl1Var) {
        this.b = lzn0Var;
        this.c = bcl1Var;
    }
}
