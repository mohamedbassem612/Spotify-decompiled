package p;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class g3p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:100:0x021d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0221  */
    /* JADX WARN: Code duplicated, block: B:104:0x022c  */
    /* JADX WARN: Code duplicated, block: B:105:0x022e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0234  */
    /* JADX WARN: Code duplicated, block: B:112:0x023e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:98:0x0218  */
    public static final void a(boolean z, f8n f8nVar, w2k1 w2k1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        w2k1 w2k1Var2;
        qim0 qim0Var2;
        m4c m4cVar;
        boolean z2;
        boolean z3;
        Object objT;
        spx spxVar;
        int i3;
        boolean z4;
        boolean z5;
        Object objT2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1714997524);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(f8nVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(w2k1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            Object objT3 = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT3 == m4cVar2) {
                objT3 = v8r.q(f8nVar);
                x340Var.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            int i5 = i4 & 7168;
            boolean zI = ((i4 & 112) == 32) | x340Var.i(ven0Var) | (i5 == 2048);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar2) {
                objT4 = new hh(f8nVar, iu30Var, ven0Var, (byte) 28);
                x340Var.s0(objT4);
            }
            qxd0.S((Function0) objT4, x340Var);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar2) {
                objT5 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT5);
            }
            ven0 ven0Var2 = (ven0) objT5;
            String strO0 = cwl1.o0(x340Var, 2131953058);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF = dug.f(qim0VarD, j, u5j1Var);
            boolean zG = x340Var.g(strO0);
            Object objT6 = x340Var.T();
            if (zG || objT6 == m4cVar2) {
                objT6 = new nb9(strO0, (byte) 4);
                x340Var.s0(objT6);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT6);
            boolean z6 = i5 == 2048;
            Object objT7 = x340Var.T();
            if (z6 || objT7 == m4cVar2) {
                objT7 = new nc8(iu30Var, (byte) 7);
                x340Var.s0(objT7);
            }
            qim0 qim0VarX = bin.x(qim0VarB, false, null, null, null, (Function0) objT7, 15);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            w2k1Var2 = w2k1Var;
            boolean zI2 = x340Var.i(w2k1Var2) | x340Var.i(ven0Var2);
            Object objT8 = x340Var.T();
            if (zI2) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT8 == m4cVar) {
                }
                m4c m4cVar3 = m4cVar;
                dm5.a((iu30) objT8, u291.d(qim0Var3, 1.0f), (iu30) null, x340Var, 0, 4);
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    z2 = false;
                    x340Var.i0(-2008294756);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2008387012);
                    z2 = false;
                    t1c.a(dug.f(u291.d(qim0Var3, 1.0f), cbx.a(x340Var).a.c, u5j1Var), x340Var, 0);
                    x340Var.r(false);
                }
                fux fuxVar = fux.c;
                String strO1 = cwl1.o0(x340Var, 2131953057);
                if (i5 == 2048) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                objT = x340Var.T();
                if (z3 || objT == m4cVar3) {
                    objT = new nc8(iu30Var, (byte) 8);
                    x340Var.s0(objT);
                }
                gra graVar2 = een.f;
                h2c h2cVar = h2c.a;
                f(fux.d, strO1, (Function0) objT, x340Var, fuxVar, h2cVar.a(qim0Var3, graVar2));
                if (z) {
                    spxVar = spx.c;
                } else {
                    spxVar = xpx.c;
                }
                spx spxVar2 = spxVar;
                if (z) {
                    i3 = 2131953062;
                } else {
                    i3 = 2131953064;
                }
                String strO2 = cwl1.o0(x340Var, i3);
                if (i5 == 2048) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if ((i4 & 14) == 4) {
                    z2 = true;
                }
                z5 = z4 | z2;
                objT2 = x340Var.T();
                if (z5 || objT2 == m4cVar3) {
                    objT2 = new z20(iu30Var, z, (byte) 5);
                    x340Var.s0(objT2);
                }
                f(8, strO2, (Function0) objT2, x340Var, spxVar2, h2cVar.a(qim0Var3, graVar));
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            }
            objT8 = new kd8(w2k1Var2, ven0Var2, (byte) 7);
            x340Var.s0(objT8);
            m4c m4cVar4 = m4cVar;
            dm5.a((iu30) objT8, u291.d(qim0Var3, 1.0f), (iu30) null, x340Var, 0, 4);
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(-2008387012);
                z2 = false;
                t1c.a(dug.f(u291.d(qim0Var3, 1.0f), cbx.a(x340Var).a.c, u5j1Var), x340Var, 0);
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(-2008294756);
                x340Var.r(false);
            }
            fux fuxVar2 = fux.c;
            String strO3 = cwl1.o0(x340Var, 2131953057);
            if (i5 == 2048) {
                z3 = true;
            } else {
                z3 = z2;
            }
            objT = x340Var.T();
            if (z3) {
                objT = new nc8(iu30Var, (byte) 8);
                x340Var.s0(objT);
            } else {
                objT = new nc8(iu30Var, (byte) 8);
                x340Var.s0(objT);
            }
            gra graVar3 = een.f;
            h2c h2cVar2 = h2c.a;
            f(fux.d, strO3, (Function0) objT, x340Var, fuxVar2, h2cVar2.a(qim0Var3, graVar3));
            if (z) {
                spxVar = spx.c;
            } else {
                spxVar = xpx.c;
            }
            spx spxVar3 = spxVar;
            if (z) {
                i3 = 2131953062;
            } else {
                i3 = 2131953064;
            }
            String strO4 = cwl1.o0(x340Var, i3);
            if (i5 == 2048) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if ((i4 & 14) == 4) {
                z2 = true;
            }
            z5 = z4 | z2;
            objT2 = x340Var.T();
            if (z5) {
                objT2 = new z20(iu30Var, z, (byte) 5);
                x340Var.s0(objT2);
            } else {
                objT2 = new z20(iu30Var, z, (byte) 5);
                x340Var.s0(objT2);
            }
            f(8, strO4, (Function0) objT2, x340Var, spxVar3, h2cVar2.a(qim0Var3, graVar));
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            w2k1Var2 = w2k1Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(z, (Object) f8nVar, (Object) w2k1Var2, (Object) iu30Var, (Object) qim0Var2, i, (byte) 4);
        }
    }

    public static final void b(float f, int i, b0k b0kVar, qim0 qim0Var) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-15110959);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            int i4 = Build.VERSION.SDK_INT;
            qim0 qim0Var2 = nim0.a;
            if (i4 >= 31) {
                x340Var.i0(801116651);
                qim0 qim0VarN = fc11.n(u291.m(u291.A(qim0Var2, een.h, true), 20.0f + f), 4.0f, 4.0f, (hw61) null);
                boolean z = (i3 & 14) == 4;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new vbk0((byte) 0, f);
                    x340Var.s0(objT);
                }
                op71.g(x340Var, exd0.q(qim0VarN, (iu30) objT));
                x340Var.r(false);
            } else {
                x340Var.i0(801561284);
                qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = uak0.d;
                    x340Var.s0(objT2);
                }
                op71.g(x340Var, exd0.q(qim0VarD, (iu30) objT2));
                x340Var.r(false);
            }
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fd50(f, i, qim0Var);
        }
    }

    public static final void c(l0e0 l0e0Var, float f, float f2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(756678834);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(l0e0Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.d(400.0f) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = i1p1.r(u291.h(u291.f(qim0Var3, 1.0f), 400.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            h2c h2cVar = h2c.a;
            qim0 qim0VarB = h2cVar.b(qim0Var3);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new e8(f2, f, (byte) 8);
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarB, (iu30) objT);
            Uri uri = Uri.parse(l0e0Var.b);
            as80 as80Var = mif1.P0;
            box boxVar = box.c;
            uwr uwrVar = cbx.a;
            fwx fwxVarG = hso1.G(boxVar, 0L, cbx.a(x340Var).a.d, x340Var, box.d, 22);
            eso1.e(uri, isl.a, qim0VarC, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073963056, 0, 3464);
            t1c.a(dug.e(h2cVar.b(qim0Var3), v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.4f), new u7h(u7h.j)), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(u7h.b, 0.8f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
            qim0 qim0VarX = uyn1.x(h2cVar.a(qim0Var3, een.t), 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (l0e0Var.c) {
                x340Var.i0(1705774288);
                h(null, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1705808884);
                x340Var.r(false);
            }
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            uwo1.e(l0e0Var.a, null, cbx.d(x340Var).b, u7h.f, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c3c(l0e0Var, f, f2, qim0Var2, i, (byte) 1);
        }
    }

    public static final void d(ax70 ax70Var, boolean z, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String str = ax70Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-979616091);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(ax70Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 384 | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(6.0f);
            long jB = z ? u7h.f : u7h.b(u7h.f, 0.4f, 0.0f, 0.0f, 0.0f, 14);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0Var3 = nim0.a;
            long j = jB;
            qim0 qim0VarX = bin.x(anm1.N("image_option_cell_" + str, u291.r(qim0Var3, 48.0f)), false, null, null, null, function0, 15);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarE2 = d1u.E(1.5f, j, i1p1.q(u291.s(qim0Var3, 36.0f, 48.0f), cr31VarB), cr31VarB);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarE2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            eso1.e(Uri.parse(str), isl.a, h2c.a.b(qim0Var3), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 3968);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(ax70Var, z, qim0Var2, function0, i, (byte) 29);
        }
    }

    public static final void e(float f, float f2, int i, int i2, b0k b0kVar, qim0 qim0Var) {
        xpx xpxVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1645037143);
        int i3 = i2 | (x340Var.d(f) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            gra graVar = een.h;
            qim0 qim0VarN = anm1.N("mixing_play_button_metal", d7e.r(1.0f, u291.d(qim0Var, 1.0f), false));
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new vbk0((byte) 1, f);
                x340Var.s0(objT);
            }
            qim0 qim0VarQ = exd0.q(qim0VarN, (iu30) objT);
            boolean z2 = i4 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new vbk0((byte) 2, f);
                x340Var.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0VarQ, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            b(f2, (i3 >> 6) & 14, x340Var, null);
            int iC = l1d.C(i);
            if (iC == 0) {
                xpxVar = spx.c;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                xpxVar = xpx.c;
            }
            xpx xpxVar2 = xpxVar;
            long j = u7h.f;
            qim0 qim0VarD = u291.d(nim0.a, 0.5f);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xpxVar2, isl.a, u291.b(24.0f, 0.0f, 2, qim0VarD), j, 0L, false, x340Var, 56, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wbk0(f, i, f2, qim0Var, i2);
        }
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-124715485);
        int i2 = i | ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        byte b2 = 0;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pj8(function0, (byte) 5);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx(18);
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            wro1.h(gbxVar, idxVar, uyn1.x(qim0Var, 4.0f), null, gdxVarS, null, false, null, null, apo.r(1120507820, new cp9(huxVar, str, b2), x340Var), x340Var, 0, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dp9(huxVar, str, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final void g(Function0 function0, int i, boolean z, qim0 qim0Var, float f, boolean z2, boolean z3, String str, b0k b0kVar, int i2) {
        String string;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1968859881);
        int i4 = i2 | (x340Var.i(function0) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.d(f) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536) | (x340Var.h(z3) ? 1048576 : 524288) | (x340Var.g(str) ? 8388608 : 4194304);
        if (x340Var.Y(i4 & 1, (4793491 & i4) != 4793490)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            float f2 = 20.0f + f;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            ven0 ven0VarM = k1u.m(idn0Var, x340Var, 0);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            boolean zI = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new hj6(ven0Var, (lnm) null, (byte) 15);
                x340Var.s0(objT3);
            }
            qxd0.t(bool, x340Var, (vu30) objT3);
            tob1 tob1VarB = z95.b((((Boolean) ven0VarM.getValue()).booleanValue() || ((Boolean) ven0Var.getValue()).booleanValue()) ? 1.0f : 0.0f, irn1.o0(100, 0, mlv.a, 2), "PressedAnimation", (iu30) null, x340Var, 3072, 20);
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            if (str != null) {
                if (z2) {
                    i3 = 2131958837;
                } else if (i == 1) {
                    i3 = 2131958838;
                } else {
                    i3 = z3 ? 2131958840 : 2131958839;
                }
                string = context.getString(i3, str);
            } else {
                string = null;
            }
            era eraVar = een.Q0;
            x340Var.i0(-2006164831);
            qim0 qim0VarR = d7e.r(1.0f, u291.r(qim0Var, f2), false);
            if (string != null) {
                boolean zG = x340Var.g(string);
                Object objT4 = x340Var.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new fki0(string, (byte) 14);
                    x340Var.s0(objT4);
                }
                qim0VarR = qim0VarR.then(s161.b(nim0.a, false, (iu30) objT4));
            }
            qim0 qim0Var2 = qim0VarR;
            x340Var.r(false);
            pm31 pm31Var = new pm31(0);
            boolean zI2 = x340Var.i(ven0Var) | ((i4 & 14) == 4);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new swi0(function0, ven0Var, (byte) 1);
                x340Var.s0(objT5);
            }
            qim0 qim0VarV = bin.v(qim0Var2, idn0Var, null, false, null, pm31Var, (Function0) objT5, 12);
            mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
            eth.a(Boolean.valueOf(z), (qim0) null, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, klv.c, 2), "ButtonTypeCrossfade", apo.r(1548142750, new xbk0(f, i, tob1VarB), x340Var), x340Var, ((i4 >> 6) & 14) | 27648, 2);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ubk0(function0, i, z, qim0Var, f, z2, z3, str, i2);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-486267172);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsx.c, isl.a, u291.r(qim0Var3, 16.0f), cbx.a(x340Var).b.c, 0L, false, x340Var, wsx.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var3, 4.0f));
            uwo1.e(cwl1.o0(x340Var, 2131957634), null, cbx.d(x340Var).k, cbx.a(x340Var).b.c, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var2, i, (byte) 22);
        }
    }

    public static final void i(fob1 fob1Var, iu30 iu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1923103451);
        int i2 = i | (b0kVar3.g(fob1Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384;
        if (!b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        } else {
            if (!fob1Var.a) {
                h311 h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new hl11(fob1Var, iu30Var, j2iVar, i, (byte) 3);
                    return;
                }
                return;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            uvx uvxVar = new uvx(ogx.e, 5, (tvx) null, (p3v) null, 25);
            String str = fob1Var.d;
            if (str == null) {
                b0kVar3.i0(-605452593);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(-605452592);
                j2iVarR = apo.r(-2055718381, new iww0(str, (byte) 4), b0kVar3);
                b0kVar3.r(false);
            }
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new fr01(iu30Var, (byte) 27);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarZ, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, apo.r(-1420287090, new im11(fob1Var, (byte) 0), b0kVar3), null, j2iVarR, apo.r(-351608116, new rv71(j2iVar, (byte) 21), b0kVar3), null, null, apo.r(379002473, new im11(fob1Var, (byte) 1), b0kVar3), b0kVar2, 805306432, 196992, 26044);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new pby0(i, fob1Var, iu30Var, qim0Var2, j2iVar, (byte) 11);
        }
    }

    public static final void j(dp71 dp71Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1655912427);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dp71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0Var = nim0.a;
            qim0 qim0VarC = u291.c(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            d3p1.s(dp71Var.b, null, x340Var, 0);
            qim0 qim0VarN = anm1.N("loading_element", u291.d(qim0Var, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            xto1.e(null, 5, 0L, 0L, x340Var, 48, 13);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(dp71Var, qim0Var, i, (byte) 19);
        }
    }

    public static final void k(float f, int i, int i2, b0k b0kVar, qim0 qim0Var) {
        xpx xpxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(675015347);
        int i3 = (x340Var.d(f) ? 4 : 2) | i2 | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            float f2 = 1.0f - (0.04f * f);
            gra graVar = een.h;
            qim0 qim0VarD = i541.D(anm1.N("mixing_play_button_simple_green", u291.d(qim0Var, 1.0f)), f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048572);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).b.f, er31.a);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
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
            int iC = l1d.C(i);
            if (iC == 0) {
                xpxVar = spx.c;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                xpxVar = xpx.c;
            }
            long j = u7h.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xpxVar, isl.a, u291.r(nim0.a, 24.0f), j, 0L, false, x340Var, 56, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fd50(f, i, qim0Var, i2);
        }
    }

    public static final void l(int i, String str, String str2, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-314117432);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new tpj1(function0, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(str2), function1), kdx.c, null, null, yla.s(x340Var), null, null, null, null, qqj.a, apo.r(-2097092153, new zsd1(str, (byte) 22), x340Var), x340Var, 0, 54, 988);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tq6(str, str2, function0, i, (byte) 6);
        }
    }

    public static final String m(rwm rwmVar, b0k b0kVar) {
        int i;
        int iOrdinal = rwmVar.ordinal();
        if (iOrdinal == 0) {
            i = 2131954588;
        } else if (iOrdinal == 1) {
            i = 2131954587;
        } else if (iOrdinal == 2) {
            i = 2131954589;
        } else {
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            i = 2131954586;
        }
        return cwl1.o0(b0kVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r10 == r8) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(p.ay0 r9, p.onm r10) {
        /*
            boolean r0 = r10 instanceof p.qx0
            if (r0 == 0) goto L13
            r0 = r10
            p.qx0 r0 = (p.qx0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.qx0 r0 = new p.qx0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 3
            r6 = 2
            r7 = 1
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L44
            if (r1 == r7) goto L3e
            if (r1 == r6) goto L38
            if (r1 != r5) goto L32
            p.ay0 r9 = r0.a
            p.hm5.M(r10)
            goto L77
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r2
        L38:
            p.ay0 r9 = r0.a
            p.hm5.M(r10)
            goto L67
        L3e:
            p.ay0 r9 = r0.a
            p.hm5.M(r10)
            goto L58
        L44:
            p.hm5.M(r10)
            p.sx0 r10 = new p.sx0
            r1 = 0
            r10.<init>(r9, r2, r1)
            r0.a = r9
            r0.c = r7
            java.lang.Object r10 = p.rc2.O(r3, r10, r0)
            if (r10 != r8) goto L58
            goto L76
        L58:
            p.nx0 r10 = (p.nx0) r10
            if (r10 == 0) goto L88
            r0.a = r9
            r0.c = r6
            java.lang.Object r10 = r9.e(r0)
            if (r10 != r8) goto L67
            goto L76
        L67:
            p.sx0 r10 = new p.sx0
            r10.<init>(r9, r2, r7)
            r0.a = r9
            r0.c = r5
            java.lang.Object r10 = p.rc2.O(r3, r10, r0)
            if (r10 != r8) goto L77
        L76:
            return r8
        L77:
            p.ji0 r10 = (p.ji0) r10
            if (r10 == 0) goto L7c
            return r10
        L7c:
            p.jx0 r9 = r9.a
            java.lang.String r9 = r9.a
            java.lang.String r10 = "Ad transition to Active timed out for "
            java.lang.String r0 = "."
            p.n9v.k(r10, r9, r0)
            return r2
        L88:
            p.jx0 r9 = r9.a
            java.lang.String r9 = r9.a
            java.lang.String r10 = "No ad became available for "
            java.lang.String r0 = " within 5000ms."
            p.n9v.k(r10, r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g3p1.n(p.ay0, p.onm):java.lang.Object");
    }

    public static final float o(DrawScope drawScope, float f, float f2) {
        return (((f2 - f) * (jch0.U(drawScope.N0(Size.e(drawScope.j()))) - 48.0f)) / 16.0f) + f;
    }

    public static final boolean p(int i, KeyEvent keyEvent) {
        return ((int) (ern1.r(keyEvent) >> 32)) == i;
    }

    public static final String q(Optional optional) {
        return optional.orElse(null) == gp20.a ? "your-sound-capsule" : "listeningstats";
    }
}
