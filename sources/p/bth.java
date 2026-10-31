package p;

import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class bth {
    public static final ceo a = new ceo(0.3f, 0.0f, 0.4f, 1.0f);
    public static final float b = 4.0f;
    public static final float c = 4.0f;
    public static final float d = 6.0f;
    public static final float e = 4.0f;

    public static final void a(iu30 iu30Var, j2i j2iVar, vu30 vu30Var, vu30 vu30Var2, boolean z, iu30 iu30Var2, b0k b0kVar, int i, int i2) {
        iu30 iu30Var3;
        int i3;
        iu30 iu30Var4;
        iu30 iu30Var5;
        boolean z2;
        vu30 vu30Var3 = vu30Var;
        vu30 vu30Var4 = vu30Var2;
        m4c m4cVar = fkj0.X;
        gra graVar = een.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1978669278);
        j06 j06Var = x340Var.a;
        int i4 = (x340Var.i(iu30Var) ? 4 : 2) | i | (x340Var.i(j2iVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= x340Var.i(vu30Var3) ? 256 : 128;
        }
        int i5 = i4 | (x340Var.i(vu30Var4) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | 196608;
            iu30Var3 = iu30Var2;
        } else {
            iu30Var3 = iu30Var2;
            i3 = i5 | (x340Var.i(iu30Var3) ? 131072 : 65536);
        }
        if (x340Var.Y(i3 & 1, (i3 & 74899) != 74898)) {
            if (i6 != 0) {
                iu30Var3 = null;
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.D(nim0Var, (era) null, 3);
            boolean z3 = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = new wqf(iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = uyn1.B(ern1.x(qim0VarD, (iu30) objT), 0.0f, 0.0f, 4.0f, b, 3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            op71.g(x340Var, kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true));
            x340Var.i0(-965257530);
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            iu30 iu30Var6 = iu30Var3;
            qim0 qim0VarP = p(0.835f, exd0.r(nim0Var, new ps((byte) 6, ((vex) zscVar.e).c)), z);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarP);
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
            boolean z5 = false;
            ktd.s(j2iVar, x340Var, 0, true, false);
            if (vu30Var == null) {
                x340Var.i0(-965012166);
                x340Var.r(false);
                vu30Var3 = vu30Var;
            } else {
                x340Var.i0(-965012165);
                qim0 qim0VarN = anm1.N("MDCMuteButtonElement", p(0.835f, exd0.r(nim0Var, new ps((byte) 6, ((vex) zscVar.e).c)), z));
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                vu30Var3 = vu30Var;
                vu30Var3.invoke(x340Var, 0);
                x340Var.r(true);
                z5 = false;
                x340Var.r(false);
            }
            if (vu30Var2 == null) {
                x340Var.i0(-964718348);
                x340Var.r(z5);
                vu30Var4 = vu30Var2;
                iu30Var5 = iu30Var6;
                z2 = true;
            } else {
                x340Var.i0(-964718347);
                qim0 qim0VarP2 = p(0.875f, nim0Var, z);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = gsh.c;
                    x340Var.s0(objT2);
                }
                vu30 vu30Var5 = (vu30) objT2;
                iu30Var5 = iu30Var6;
                if (iu30Var6 != null) {
                    qim0VarP2 = (qim0) vu30Var5.invoke(qim0VarP2, iu30Var5);
                }
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarP2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                vu30Var4 = vu30Var2;
                vu30Var4.invoke(x340Var, 0);
                z2 = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z2);
            iu30Var4 = iu30Var5;
        } else {
            x340Var.b0();
            iu30Var4 = iu30Var3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rsh(iu30Var, j2iVar, vu30Var3, vu30Var4, z, iu30Var4, i, i2);
        }
    }

    public static final void b(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar4 = j2iVar3;
        gra graVar = een.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1009891587);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(j2iVar) ? 4 : 2) | (x340Var.i(j2iVar2) ? 32 : 16) | (x340Var.i(j2iVar4) ? 256 : 128) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarB = uyn1.B(u291.D(qim0Var, (era) null, 3), 0.0f, 0.0f, 4.0f, 8.0f, 3);
            jw31 jw31VarA = ew31.a(h36.f, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            x340Var.i0(-1457653044);
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            ps psVar = new ps((byte) 6, ((vex) zscVar.e).c);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("MDCMuteButtonElement", fj30.F(exd0.r(nim0Var, psVar), 0.835f, 0.835f));
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            ktd.s(j2iVar2, x340Var, 0, true, false);
            x340Var.i0(-1457364713);
            qim0 qim0VarF = fj30.F(exd0.r(nim0Var, new ps((byte) 6, ((vex) zscVar.e).c)), 0.835f, 0.835f);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            ktd.s(j2iVar, x340Var, 0, true, false);
            x340Var.i0(-1457124618);
            qim0 qim0VarF2 = fj30.F(nim0Var, 0.875f, 0.875f);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            j2iVar4 = j2iVar3;
            ktd.s(j2iVar4, x340Var, 0, true, false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ssh(j2iVar, j2iVar2, j2iVar4, qim0Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0139  */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0156  */
    /* JADX WARN: Code duplicated, block: B:59:0x0164  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174  */
    /* JADX WARN: Code duplicated, block: B:62:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x019a  */
    /* JADX WARN: Code duplicated, block: B:66:0x019e  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01de  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void c(qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, boolean z, b0k b0kVar, int i, int i2) {
        boolean z2;
        boolean z3;
        qim0 qim0Var2;
        boolean z4;
        h311 h311VarV;
        era eraVar;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0Var3;
        qim0 qim0VarE;
        boolean z5;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        float f;
        int i3;
        boolean z6;
        qim0 qim0Var4;
        boolean z7;
        qim0 qim0VarF;
        gra graVar = een.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1072424205);
        j06 j06Var = x340Var.a;
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= x340Var.i(vu30Var2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= x340Var.h(z2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                if (i5 != 0) {
                    z2 = false;
                }
                eraVar = een.P0;
                mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0Var3 = nim0.a;
                qim0VarE = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z5 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z5) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                if (z2) {
                    f = 12.0f;
                } else {
                    f = 8.0f;
                }
                i3 = i4;
                qim0 qim0VarM = ktd.m(eraVar, uyn1.A(qim0VarF2, 12.0f, 8.0f, f, 8.0f));
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                z6 = z2;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarM);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                if (vu30Var != null) {
                    x340Var.i0(448781262);
                    qim0 qim0VarB = uyn1.B(new wnb0(1.0f, true), 4.0f, 0.0f, 0.0f, 0.0f, 14);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    us71.k((i3 >> 3) & 14, vu30Var, x340Var, true, false);
                } else {
                    x340Var.i0(448880245);
                    x340Var.r(false);
                }
                if (vu30Var2 != null) {
                    x340Var.i0(448915802);
                    qim0Var4 = qim0Var3;
                    qim0 qim0VarD = u291.D(qim0Var4, (era) null, 3);
                    if (z6) {
                        qim0VarF = fj30.F(qim0Var4, 1.25f, 1.25f);
                    } else {
                        qim0VarF = qim0Var4;
                    }
                    qim0 qim0VarThen = qim0VarD.then(qim0VarF);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarThen);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar4);
                    z7 = true;
                    us71.k((i3 >> 6) & 14, vu30Var2, x340Var, true, false);
                } else {
                    qim0Var4 = qim0Var3;
                    z7 = true;
                    x340Var.i0(449095509);
                    x340Var.r(false);
                }
                x340Var.r(z7);
                x340Var.r(z7);
                qim0Var2 = qim0Var4;
                z4 = z6;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ilf((byte) 1, i, i2, qim0Var2, vu30Var, vu30Var2, z4);
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i4 & 1, z3)) {
            if (i5 != 0) {
                z2 = false;
            }
            eraVar = een.P0;
            mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0Var3 = nim0.a;
            qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z5 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z5) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar3);
            nko1.F(x340Var);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            if (z2) {
                f = 12.0f;
            } else {
                f = 8.0f;
            }
            i3 = i4;
            qim0 qim0VarM2 = ktd.m(eraVar, uyn1.A(qim0VarF3, 12.0f, 8.0f, f, 8.0f));
            jw31 jw31VarA2 = ew31.a(h36.a, een.N0, x340Var, 0);
            z6 = z2;
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarM2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            if (vu30Var != null) {
                x340Var.i0(448781262);
                qim0 qim0VarB2 = uyn1.B(new wnb0(1.0f, true), 4.0f, 0.0f, 0.0f, 0.0f, 14);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode6 = Long.hashCode(x340Var.T);
                xos0 xos0VarM6 = x340Var.m();
                qim0 qim0VarE6 = zr7.E(x340Var, qim0VarB2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM6, x340Var, lljVar2);
                x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE6, x340Var, lljVar4);
                us71.k((i3 >> 3) & 14, vu30Var, x340Var, true, false);
            } else {
                x340Var.i0(448880245);
                x340Var.r(false);
            }
            if (vu30Var2 != null) {
                x340Var.i0(448915802);
                qim0Var4 = qim0Var3;
                qim0 qim0VarD2 = u291.D(qim0Var4, (era) null, 3);
                if (z6) {
                    qim0VarF = fj30.F(qim0Var4, 1.25f, 1.25f);
                } else {
                    qim0VarF = qim0Var4;
                }
                qim0 qim0VarThen2 = qim0VarD2.then(qim0VarF);
                gfh0 gfh0VarC4 = t1c.c(graVar, false);
                int iHashCode7 = Long.hashCode(x340Var.T);
                xos0 xos0VarM7 = x340Var.m();
                qim0 qim0VarE7 = zr7.E(x340Var, qim0VarThen2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC4, x340Var, lljVar);
                nko1.H(xos0VarM7, x340Var, lljVar2);
                x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE7, x340Var, lljVar4);
                z7 = true;
                us71.k((i3 >> 6) & 14, vu30Var2, x340Var, true, false);
            } else {
                qim0Var4 = qim0Var3;
                z7 = true;
                x340Var.i0(449095509);
                x340Var.r(false);
            }
            x340Var.r(z7);
            x340Var.r(z7);
            qim0Var2 = qim0Var4;
            z4 = z6;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ilf((byte) 1, i, i2, qim0Var2, vu30Var, vu30Var2, z4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x0153  */
    /* JADX WARN: Code duplicated, block: B:72:0x015a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0160  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:83:0x020f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void d(qim0 qim0Var, String str, jiv0 jiv0Var, int i, b0k b0kVar, int i2, int i3) {
        jiv0 jiv0Var2;
        int i4;
        int i5;
        int iC;
        int i6;
        boolean z;
        int i7;
        jiv0 jiv0Var3;
        qim0 qim0Var2;
        h311 h311VarV;
        tsh tshVar;
        int i8;
        qim0 qim0Var3;
        hiv0 hiv0Var;
        jiv0 jiv0Var4;
        qim0 qim0Var4;
        int i9;
        qim0 qim0Var5;
        jiv0 jiv0Var5;
        int i10;
        String str2;
        Object objT;
        int iC2;
        qim0 qim0VarY;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(19933301);
        int i11 = i2 | 6 | (x340Var.g(str) ? 32 : 16);
        if ((i3 & 4) == 0) {
            jiv0Var2 = jiv0Var;
            int i12 = x340Var.i(jiv0Var2) ? 256 : 128;
            i4 = i11 | i12;
            i5 = i3 & 8;
            if (i5 != 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (i == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i);
                }
                if (x340Var.e(iC)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                i8 = i2 & 1;
                qim0Var3 = nim0.a;
                hiv0Var = hiv0.a;
                if (i8 != 0 || x340Var.E()) {
                    if ((i3 & 4) != 0) {
                        jiv0Var2 = hiv0Var;
                    }
                    if (i5 != 0) {
                        jiv0Var4 = jiv0Var2;
                        hiv0Var = hiv0Var;
                        i9 = 1;
                        qim0Var4 = qim0Var3;
                    } else {
                        jiv0Var4 = jiv0Var2;
                        qim0Var4 = qim0Var3;
                    }
                    x340Var.s();
                    if (str == null) {
                        h311VarV = x340Var.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            tshVar = new tsh(qim0Var4, str, jiv0Var4, i9, i2, i3, (byte) 0);
                        }
                    } else {
                        qim0Var5 = qim0Var4;
                        jiv0Var5 = jiv0Var4;
                        i10 = i9;
                        if (u890.j(jiv0Var5, iiv0.a)) {
                            x340Var.i0(1976043147);
                            String strN0 = cwl1.n0(2131961063, new Object[]{str}, x340Var);
                            x340Var.r(false);
                            str2 = strN0;
                        } else {
                            if (!u890.j(jiv0Var5, hiv0Var)) {
                                throw p3d1.k(x340Var, 1976041557, false);
                            }
                            x340Var.i0(1976045984);
                            x340Var.r(false);
                            str2 = str;
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = bmh.h;
                            x340Var.s0(objT);
                        }
                        qim0 qim0VarB = s161.b(qim0Var5, true, (iu30) objT);
                        iC2 = l1d.C(i10);
                        if (iC2 == 0) {
                            x340Var.i0(-540396941);
                            x340Var.r(false);
                            qim0VarY = qim0Var3;
                        } else {
                            if (iC2 != 1) {
                                throw p3d1.k(x340Var, -540398027, false);
                            }
                            x340Var.i0(-540391366);
                            qim0 qim0VarQ = i1p1.q(qim0Var3, er31.b(c));
                            uwr uwrVar = cbx.a;
                            qim0VarY = uyn1.y(dug.f(qim0VarQ, cbx.a(x340Var).a.c, d4o1.a), d, e);
                            x340Var.r(false);
                        }
                        qim0 qim0VarThen = qim0VarB.then(qim0VarY);
                        jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarThen);
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
                        uwr uwrVar2 = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        w0h1.a(xrx.c, isl.a, u291.r(qim0Var3, 16.0f), ((vex) zex.a.e).m, 0L, false, x340Var, xrx.d | 48, 48);
                        cvx cvxVar = cbx.b(x340Var).b;
                        uwo1.e(str2, (qim0) null, ktd.l(qim0Var3, 4.0f, x340Var, x340Var).j, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 4, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1714);
                        x340Var.r(true);
                        i7 = i10;
                        jiv0Var3 = jiv0Var5;
                        qim0Var2 = qim0Var5;
                    }
                    h311VarV.d = tshVar;
                }
                x340Var.b0();
                jiv0Var4 = jiv0Var2;
                qim0Var4 = qim0Var;
                i9 = i;
                x340Var.s();
                if (str == null) {
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        tshVar = new tsh(qim0Var4, str, jiv0Var4, i9, i2, i3, (byte) 0);
                    }
                } else {
                    qim0Var5 = qim0Var4;
                    jiv0Var5 = jiv0Var4;
                    i10 = i9;
                    if (u890.j(jiv0Var5, iiv0.a)) {
                        x340Var.i0(1976043147);
                        String strN1 = cwl1.n0(2131961063, new Object[]{str}, x340Var);
                        x340Var.r(false);
                        str2 = strN1;
                    } else {
                        if (!u890.j(jiv0Var5, hiv0Var)) {
                            throw p3d1.k(x340Var, 1976041557, false);
                        }
                        x340Var.i0(1976045984);
                        x340Var.r(false);
                        str2 = str;
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = bmh.h;
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarB2 = s161.b(qim0Var5, true, (iu30) objT);
                    iC2 = l1d.C(i10);
                    if (iC2 == 0) {
                        x340Var.i0(-540396941);
                        x340Var.r(false);
                        qim0VarY = qim0Var3;
                    } else {
                        if (iC2 != 1) {
                            throw p3d1.k(x340Var, -540398027, false);
                        }
                        x340Var.i0(-540391366);
                        qim0 qim0VarQ2 = i1p1.q(qim0Var3, er31.b(c));
                        uwr uwrVar3 = cbx.a;
                        qim0VarY = uyn1.y(dug.f(qim0VarQ2, cbx.a(x340Var).a.c, d4o1.a), d, e);
                        x340Var.r(false);
                    }
                    qim0 qim0VarThen2 = qim0VarB2.then(qim0VarY);
                    jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarThen2);
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
                    uwr uwrVar4 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    w0h1.a(xrx.c, isl.a, u291.r(qim0Var3, 16.0f), ((vex) zex.a.e).m, 0L, false, x340Var, xrx.d | 48, 48);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    uwo1.e(str2, (qim0) null, ktd.l(qim0Var3, 4.0f, x340Var, x340Var).j, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 4, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1714);
                    x340Var.r(true);
                    i7 = i10;
                    jiv0Var3 = jiv0Var5;
                    qim0Var2 = qim0Var5;
                }
                h311VarV.d = tshVar;
            }
            x340Var.b0();
            i7 = i;
            jiv0Var3 = jiv0Var2;
            qim0Var2 = qim0Var;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                tshVar = new tsh(qim0Var2, str, jiv0Var3, i7, i2, i3, (byte) 1);
                h311VarV.d = tshVar;
            }
        }
        jiv0Var2 = jiv0Var;
        i4 = i11 | i12;
        i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (i == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i);
            }
            if (x340Var.e(iC)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            i8 = i2 & 1;
            qim0Var3 = nim0.a;
            hiv0Var = hiv0.a;
            if (i8 != 0) {
                if ((i3 & 4) != 0) {
                    jiv0Var2 = hiv0Var;
                }
                if (i5 != 0) {
                    jiv0Var4 = jiv0Var2;
                    hiv0Var = hiv0Var;
                    i9 = 1;
                    qim0Var4 = qim0Var3;
                } else {
                    jiv0Var4 = jiv0Var2;
                    qim0Var4 = qim0Var3;
                    i9 = i;
                }
            } else {
                if ((i3 & 4) != 0) {
                    jiv0Var2 = hiv0Var;
                }
                if (i5 != 0) {
                    jiv0Var4 = jiv0Var2;
                    hiv0Var = hiv0Var;
                    i9 = 1;
                    qim0Var4 = qim0Var3;
                } else {
                    jiv0Var4 = jiv0Var2;
                    qim0Var4 = qim0Var3;
                    i9 = i;
                }
            }
            x340Var.s();
            if (str == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    tshVar = new tsh(qim0Var4, str, jiv0Var4, i9, i2, i3, (byte) 0);
                }
            } else {
                qim0Var5 = qim0Var4;
                jiv0Var5 = jiv0Var4;
                i10 = i9;
                if (u890.j(jiv0Var5, iiv0.a)) {
                    x340Var.i0(1976043147);
                    String strN2 = cwl1.n0(2131961063, new Object[]{str}, x340Var);
                    x340Var.r(false);
                    str2 = strN2;
                } else {
                    if (!u890.j(jiv0Var5, hiv0Var)) {
                        throw p3d1.k(x340Var, 1976041557, false);
                    }
                    x340Var.i0(1976045984);
                    x340Var.r(false);
                    str2 = str;
                }
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = bmh.h;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB3 = s161.b(qim0Var5, true, (iu30) objT);
                iC2 = l1d.C(i10);
                if (iC2 == 0) {
                    x340Var.i0(-540396941);
                    x340Var.r(false);
                    qim0VarY = qim0Var3;
                } else {
                    if (iC2 != 1) {
                        throw p3d1.k(x340Var, -540398027, false);
                    }
                    x340Var.i0(-540391366);
                    qim0 qim0VarQ3 = i1p1.q(qim0Var3, er31.b(c));
                    uwr uwrVar5 = cbx.a;
                    qim0VarY = uyn1.y(dug.f(qim0VarQ3, cbx.a(x340Var).a.c, d4o1.a), d, e);
                    x340Var.r(false);
                }
                qim0 qim0VarThen3 = qim0VarB3.then(qim0VarY);
                jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarThen3);
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
                uwr uwrVar6 = cbx.a;
                zov0 zov0Var3 = cbx.b(x340Var).g;
                w0h1.a(xrx.c, isl.a, u291.r(qim0Var3, 16.0f), ((vex) zex.a.e).m, 0L, false, x340Var, xrx.d | 48, 48);
                cvx cvxVar3 = cbx.b(x340Var).b;
                uwo1.e(str2, (qim0) null, ktd.l(qim0Var3, 4.0f, x340Var, x340Var).j, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 4, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1714);
                x340Var.r(true);
                i7 = i10;
                jiv0Var3 = jiv0Var5;
                qim0Var2 = qim0Var5;
            }
            h311VarV.d = tshVar;
        }
        x340Var.b0();
        i7 = i;
        jiv0Var3 = jiv0Var2;
        qim0Var2 = qim0Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            tshVar = new tsh(qim0Var2, str, jiv0Var3, i7, i2, i3, (byte) 1);
            h311VarV.d = tshVar;
        }
    }

    public static final void e(long j, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1550405477);
        int i2 = (x340Var.f(j) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            fq7.g(z2 && j > 0, (qim0) null, xay.e(2, irn1.o0(500, 0, new ceo(0.3f, 0.0f, 0.4f, 1.0f), 2)), ln00.b, (String) null, apo.r(1880348019, new uyg(z, j), x340Var), x340Var, 196608, 18);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ush(j, z, z2, qim0Var2, i);
        }
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1390086059);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (b0kVar3.i(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarH = u291.h(u291.D(nim0.a, (era) null, 3), 32.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarA = h2cVar.a(dug.f(qim0VarH, cbx.a(b0kVar3).a.c, er31.b(32.0f)), een.h);
            idx idxVar = new idx(18);
            boolean z = false;
            gdx gdxVarS = yla.s(b0kVar3);
            if ((i2 & 896) == 256) {
                z = true;
            }
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ukf(function0, (byte) 26);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, qim0VarA, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-68333002, new j3b(str, (byte) 29), b0kVar3), b0kVar2, 0, 48, 2008);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vsh((byte) 0, i, str, function0, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:107:0x0170  */
    /* JADX WARN: Code duplicated, block: B:108:0x0174  */
    /* JADX WARN: Code duplicated, block: B:111:0x0185  */
    /* JADX WARN: Code duplicated, block: B:113:0x0189  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:126:0x0201  */
    /* JADX WARN: Code duplicated, block: B:127:0x0205  */
    /* JADX WARN: Code duplicated, block: B:130:0x0268  */
    /* JADX WARN: Code duplicated, block: B:131:0x0279  */
    /* JADX WARN: Code duplicated, block: B:133:0x0289  */
    /* JADX WARN: Code duplicated, block: B:137:0x02be  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x031f  */
    /* JADX WARN: Code duplicated, block: B:143:0x032b  */
    /* JADX WARN: Code duplicated, block: B:145:0x033c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0363  */
    /* JADX WARN: Code duplicated, block: B:149:0x0367  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:153:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:156:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    public static final void g(cr00 cr00Var, j2i j2iVar, boolean z, boolean z2, boolean z3, qim0 qim0Var, boolean z4, boolean z5, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z6;
        int i5;
        boolean z7;
        qim0 qim0Var3;
        boolean z8;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        boolean z9;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        Object objT2;
        ven0 ven0Var2;
        boolean z10;
        boolean z11;
        Object objT3;
        int i6;
        boolean zI;
        Object objT4;
        float f;
        int i7;
        tob1 tob1VarB;
        float f2;
        int i8;
        tob1 tob1VarB2;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z12;
        n4k n4kVar;
        Object objT5;
        m4c m4cVar2;
        qim0 qim0VarA;
        int i9;
        qim0 qim0Var6;
        int i10;
        Object objT6;
        int i11;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2021733156);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.i(cr00Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.h(z3) ? 16384 : 8192;
        }
        int i12 = i2 & 32;
        if (i12 == 0) {
            if ((196608 & i) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    z6 = z4;
                    if (x340Var.h(z6)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((12582912 & i) != 0) {
                    if (x340Var.h(z5)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((4793491 & i3) != 4793490) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (x340Var.Y(i3 & 1, z7)) {
                    qim0Var4 = nim0.a;
                    if (i12 != 0) {
                        qim0Var5 = qim0Var4;
                    } else {
                        qim0Var5 = qim0Var2;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z6;
                    }
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT2);
                    }
                    ven0Var2 = (ven0) objT2;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    boolean zI2 = x340Var.i(ven0Var);
                    if ((i3 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zI2 | z10;
                    objT3 = x340Var.T();
                    if (z11 || objT3 == m4cVar) {
                        objT3 = new wsh(z, ven0Var, (lnm) null, (byte) 0);
                        x340Var.s0(objT3);
                    }
                    i6 = i3 >> 6;
                    qxd0.t(boolValueOf, x340Var, (vu30) objT3);
                    Boolean bool = (Boolean) ven0Var.getValue();
                    bool.getClass();
                    zI = x340Var.i(ven0Var2) | x340Var.i(ven0Var);
                    objT4 = x340Var.T();
                    if (zI || objT4 == m4cVar) {
                        objT4 = new pg6(ven0Var, ven0Var2, (lnm) null, (byte) 1);
                        x340Var.s0(objT4);
                    }
                    qxd0.t(bool, x340Var, (vu30) objT4);
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        i7 = 500;
                    } else {
                        i7 = 0;
                    }
                    ceo ceoVar = a;
                    tob1VarB = z95.b(f, new pxg1(500, i7, ceoVar), "transcriptAlpha", (iu30) null, x340Var, 3072, 20);
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        f2 = 0.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        i8 = 0;
                    } else {
                        i8 = 500;
                    }
                    tob1VarB2 = z95.b(f2, new pxg1(500, i8, ceoVar), "descriptionAlpha", (iu30) null, x340Var, 3072, 20);
                    gfh0VarC = t1c.c(een.g, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0Var5);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z12 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z12) {
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
                    qim0 qim0VarN = anm1.N("MDCTranscriptElement", i541.D(u291.f(qim0Var4, 1.0f), 0.0f, 0.0f, ((Number) tob1VarB.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571));
                    if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                        x340Var.i0(-496711418);
                        x340Var.r(false);
                        i9 = 0;
                        m4cVar2 = m4cVar;
                        qim0VarA = qim0Var4;
                    } else {
                        x340Var.i0(-496666251);
                        objT5 = x340Var.T();
                        m4cVar2 = m4cVar;
                        if (objT5 == m4cVar2) {
                            objT5 = bmh.i;
                            x340Var.s0(objT5);
                        }
                        qim0VarA = s161.a(qim0Var4, (iu30) objT5);
                        i9 = 0;
                        x340Var.r(false);
                    }
                    qim0 qim0VarThen = qim0VarN.then(qim0VarA);
                    era eraVar = een.P0;
                    f36 f36Var = h36.c;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, i9);
                    qim0 qim0Var7 = qim0Var5;
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
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
                    j2iVar.invoke(x340Var, Integer.valueOf((i3 >> 3) & 14));
                    x340Var.r(true);
                    qim0Var6 = qim0Var4;
                    qim0 qim0VarN2 = anm1.N("MDCDescriptionElement", i541.D(qim0Var4, 0.0f, 0.0f, ((Number) tob1VarB2.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571));
                    if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                        x340Var.i0(-496335915);
                        objT6 = x340Var.T();
                        if (objT6 == m4cVar2) {
                            objT6 = bmh.t;
                            x340Var.s0(objT6);
                        }
                        qim0 qim0VarA2 = s161.a(qim0Var6, (iu30) objT6);
                        i10 = 0;
                        x340Var.r(false);
                        qim0Var6 = qim0VarA2;
                    } else {
                        i10 = 0;
                        x340Var.i0(-496245178);
                        x340Var.r(false);
                    }
                    qim0 qim0VarThen2 = qim0VarN2.then(qim0Var6);
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, i10);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarThen2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA2, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    int i13 = i3 >> 9;
                    boolean z13 = z9;
                    h(cr00Var, z2, z3, z13, z5, x340Var, (i6 & 896) | (i3 & 14) | (i6 & 112) | (i13 & 7168) | (i13 & 57344));
                    x340Var = x340Var;
                    x340Var.r(true);
                    x340Var.r(true);
                    qim0Var3 = qim0Var7;
                    z8 = z13;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    z8 = z6;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xsh(cr00Var, j2iVar, z, z2, z3, qim0Var3, z8, z5, i, i2);
                }
            }
            i3 |= 1572864;
            z6 = z4;
            if ((12582912 & i) != 0) {
                if (x340Var.h(z5)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((4793491 & i3) != 4793490) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (x340Var.Y(i3 & 1, z7)) {
                qim0Var4 = nim0.a;
                if (i12 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                ven0Var = (ven0) objT;
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT2);
                }
                ven0Var2 = (ven0) objT2;
                Boolean boolValueOf2 = Boolean.valueOf(z);
                boolean zI3 = x340Var.i(ven0Var);
                if ((i3 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zI3 | z10;
                objT3 = x340Var.T();
                if (z11) {
                    objT3 = new wsh(z, ven0Var, (lnm) null, (byte) 0);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new wsh(z, ven0Var, (lnm) null, (byte) 0);
                    x340Var.s0(objT3);
                }
                i6 = i3 >> 6;
                qxd0.t(boolValueOf2, x340Var, (vu30) objT3);
                Boolean bool2 = (Boolean) ven0Var.getValue();
                bool2.getClass();
                zI = x340Var.i(ven0Var2) | x340Var.i(ven0Var);
                objT4 = x340Var.T();
                if (zI) {
                    objT4 = new pg6(ven0Var, ven0Var2, (lnm) null, (byte) 1);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new pg6(ven0Var, ven0Var2, (lnm) null, (byte) 1);
                    x340Var.s0(objT4);
                }
                qxd0.t(bool2, x340Var, (vu30) objT4);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    i7 = 500;
                } else {
                    i7 = 0;
                }
                ceo ceoVar2 = a;
                tob1VarB = z95.b(f, new pxg1(500, i7, ceoVar2), "transcriptAlpha", (iu30) null, x340Var, 3072, 20);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    i8 = 0;
                } else {
                    i8 = 500;
                }
                tob1VarB2 = z95.b(f2, new pxg1(500, i8, ceoVar2), "descriptionAlpha", (iu30) null, x340Var, 3072, 20);
                gfh0VarC = t1c.c(een.g, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var5);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z12 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z12) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar7);
                nko1.F(x340Var);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar8);
                qim0 qim0VarN3 = anm1.N("MDCTranscriptElement", i541.D(u291.f(qim0Var4, 1.0f), 0.0f, 0.0f, ((Number) tob1VarB.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571));
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    x340Var.i0(-496711418);
                    x340Var.r(false);
                    i9 = 0;
                    m4cVar2 = m4cVar;
                    qim0VarA = qim0Var4;
                } else {
                    x340Var.i0(-496666251);
                    objT5 = x340Var.T();
                    m4cVar2 = m4cVar;
                    if (objT5 == m4cVar2) {
                        objT5 = bmh.i;
                        x340Var.s0(objT5);
                    }
                    qim0VarA = s161.a(qim0Var4, (iu30) objT5);
                    i9 = 0;
                    x340Var.r(false);
                }
                qim0 qim0VarThen3 = qim0VarN3.then(qim0VarA);
                era eraVar2 = een.P0;
                f36 f36Var2 = h36.c;
                mbh mbhVarA3 = jbh.a(f36Var2, eraVar2, x340Var, i9);
                qim0 qim0Var8 = qim0Var5;
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarThen3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA3, x340Var, lljVar5);
                nko1.H(xos0VarM4, x340Var, lljVar6);
                x0d.q(iHashCode4, x340Var, lljVar7, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar8);
                j2iVar.invoke(x340Var, Integer.valueOf((i3 >> 3) & 14));
                x340Var.r(true);
                qim0Var6 = qim0Var4;
                qim0 qim0VarN4 = anm1.N("MDCDescriptionElement", i541.D(qim0Var4, 0.0f, 0.0f, ((Number) tob1VarB2.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571));
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    x340Var.i0(-496335915);
                    objT6 = x340Var.T();
                    if (objT6 == m4cVar2) {
                        objT6 = bmh.t;
                        x340Var.s0(objT6);
                    }
                    qim0 qim0VarA3 = s161.a(qim0Var6, (iu30) objT6);
                    i10 = 0;
                    x340Var.r(false);
                    qim0Var6 = qim0VarA3;
                } else {
                    i10 = 0;
                    x340Var.i0(-496245178);
                    x340Var.r(false);
                }
                qim0 qim0VarThen4 = qim0VarN4.then(qim0Var6);
                mbh mbhVarA4 = jbh.a(f36Var2, eraVar2, x340Var, i10);
                int iHashCode5 = Long.hashCode(x340Var.T);
                xos0 xos0VarM5 = x340Var.m();
                qim0 qim0VarE5 = zr7.E(x340Var, qim0VarThen4);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA4, x340Var, lljVar5);
                nko1.H(xos0VarM5, x340Var, lljVar6);
                x0d.q(iHashCode5, x340Var, lljVar7, x340Var);
                nko1.H(qim0VarE5, x340Var, lljVar8);
                int i14 = i3 >> 9;
                boolean z14 = z9;
                h(cr00Var, z2, z3, z14, z5, x340Var, (i6 & 896) | (i3 & 14) | (i6 & 112) | (i14 & 7168) | (i14 & 57344));
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(true);
                qim0Var3 = qim0Var8;
                z8 = z14;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z8 = z6;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xsh(cr00Var, j2iVar, z, z2, z3, qim0Var3, z8, z5, i, i2);
            }
        }
        i3 |= 196608;
        qim0Var2 = qim0Var;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                z6 = z4;
                if (x340Var.h(z6)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((12582912 & i) != 0) {
                if (x340Var.h(z5)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((4793491 & i3) != 4793490) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (x340Var.Y(i3 & 1, z7)) {
                qim0Var4 = nim0.a;
                if (i12 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z6;
                }
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                ven0Var = (ven0) objT;
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT2);
                }
                ven0Var2 = (ven0) objT2;
                Boolean boolValueOf3 = Boolean.valueOf(z);
                boolean zI4 = x340Var.i(ven0Var);
                if ((i3 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zI4 | z10;
                objT3 = x340Var.T();
                if (z11) {
                    objT3 = new wsh(z, ven0Var, (lnm) null, (byte) 0);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new wsh(z, ven0Var, (lnm) null, (byte) 0);
                    x340Var.s0(objT3);
                }
                i6 = i3 >> 6;
                qxd0.t(boolValueOf3, x340Var, (vu30) objT3);
                Boolean bool3 = (Boolean) ven0Var.getValue();
                bool3.getClass();
                zI = x340Var.i(ven0Var2) | x340Var.i(ven0Var);
                objT4 = x340Var.T();
                if (zI) {
                    objT4 = new pg6(ven0Var, ven0Var2, (lnm) null, (byte) 1);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new pg6(ven0Var, ven0Var2, (lnm) null, (byte) 1);
                    x340Var.s0(objT4);
                }
                qxd0.t(bool3, x340Var, (vu30) objT4);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    i7 = 500;
                } else {
                    i7 = 0;
                }
                ceo ceoVar3 = a;
                tob1VarB = z95.b(f, new pxg1(500, i7, ceoVar3), "transcriptAlpha", (iu30) null, x340Var, 3072, 20);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    i8 = 0;
                } else {
                    i8 = 500;
                }
                tob1VarB2 = z95.b(f2, new pxg1(500, i8, ceoVar3), "descriptionAlpha", (iu30) null, x340Var, 3072, 20);
                gfh0VarC = t1c.c(een.g, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var5);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z12 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z12) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar9 = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar9);
                llj lljVar10 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf3, x340Var, lljVar11);
                nko1.F(x340Var);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar12);
                qim0 qim0VarN5 = anm1.N("MDCTranscriptElement", i541.D(u291.f(qim0Var4, 1.0f), 0.0f, 0.0f, ((Number) tob1VarB.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571));
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    x340Var.i0(-496711418);
                    x340Var.r(false);
                    i9 = 0;
                    m4cVar2 = m4cVar;
                    qim0VarA = qim0Var4;
                } else {
                    x340Var.i0(-496666251);
                    objT5 = x340Var.T();
                    m4cVar2 = m4cVar;
                    if (objT5 == m4cVar2) {
                        objT5 = bmh.i;
                        x340Var.s0(objT5);
                    }
                    qim0VarA = s161.a(qim0Var4, (iu30) objT5);
                    i9 = 0;
                    x340Var.r(false);
                }
                qim0 qim0VarThen5 = qim0VarN5.then(qim0VarA);
                era eraVar3 = een.P0;
                f36 f36Var3 = h36.c;
                mbh mbhVarA5 = jbh.a(f36Var3, eraVar3, x340Var, i9);
                qim0 qim0Var9 = qim0Var5;
                int iHashCode6 = Long.hashCode(x340Var.T);
                xos0 xos0VarM6 = x340Var.m();
                qim0 qim0VarE6 = zr7.E(x340Var, qim0VarThen5);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA5, x340Var, lljVar9);
                nko1.H(xos0VarM6, x340Var, lljVar10);
                x0d.q(iHashCode6, x340Var, lljVar11, x340Var);
                nko1.H(qim0VarE6, x340Var, lljVar12);
                j2iVar.invoke(x340Var, Integer.valueOf((i3 >> 3) & 14));
                x340Var.r(true);
                qim0Var6 = qim0Var4;
                qim0 qim0VarN6 = anm1.N("MDCDescriptionElement", i541.D(qim0Var4, 0.0f, 0.0f, ((Number) tob1VarB2.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571));
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    x340Var.i0(-496335915);
                    objT6 = x340Var.T();
                    if (objT6 == m4cVar2) {
                        objT6 = bmh.t;
                        x340Var.s0(objT6);
                    }
                    qim0 qim0VarA4 = s161.a(qim0Var6, (iu30) objT6);
                    i10 = 0;
                    x340Var.r(false);
                    qim0Var6 = qim0VarA4;
                } else {
                    i10 = 0;
                    x340Var.i0(-496245178);
                    x340Var.r(false);
                }
                qim0 qim0VarThen6 = qim0VarN6.then(qim0Var6);
                mbh mbhVarA6 = jbh.a(f36Var3, eraVar3, x340Var, i10);
                int iHashCode7 = Long.hashCode(x340Var.T);
                xos0 xos0VarM7 = x340Var.m();
                qim0 qim0VarE7 = zr7.E(x340Var, qim0VarThen6);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA6, x340Var, lljVar9);
                nko1.H(xos0VarM7, x340Var, lljVar10);
                x0d.q(iHashCode7, x340Var, lljVar11, x340Var);
                nko1.H(qim0VarE7, x340Var, lljVar12);
                int i15 = i3 >> 9;
                boolean z15 = z9;
                h(cr00Var, z2, z3, z15, z5, x340Var, (i6 & 896) | (i3 & 14) | (i6 & 112) | (i15 & 7168) | (i15 & 57344));
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(true);
                qim0Var3 = qim0Var9;
                z8 = z15;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z8 = z6;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xsh(cr00Var, j2iVar, z, z2, z3, qim0Var3, z8, z5, i, i2);
            }
        }
        i3 |= 1572864;
        z6 = z4;
        if ((12582912 & i) != 0) {
            if (x340Var.h(z5)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((4793491 & i3) != 4793490) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (x340Var.Y(i3 & 1, z7)) {
            qim0Var4 = nim0.a;
            if (i12 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            if (i4 != 0) {
                z9 = false;
            } else {
                z9 = z6;
            }
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0Var = (ven0) objT;
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0Var2 = (ven0) objT2;
            Boolean boolValueOf4 = Boolean.valueOf(z);
            boolean zI5 = x340Var.i(ven0Var);
            if ((i3 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = zI5 | z10;
            objT3 = x340Var.T();
            if (z11) {
                objT3 = new wsh(z, ven0Var, (lnm) null, (byte) 0);
                x340Var.s0(objT3);
            } else {
                objT3 = new wsh(z, ven0Var, (lnm) null, (byte) 0);
                x340Var.s0(objT3);
            }
            i6 = i3 >> 6;
            qxd0.t(boolValueOf4, x340Var, (vu30) objT3);
            Boolean bool4 = (Boolean) ven0Var.getValue();
            bool4.getClass();
            zI = x340Var.i(ven0Var2) | x340Var.i(ven0Var);
            objT4 = x340Var.T();
            if (zI) {
                objT4 = new pg6(ven0Var, ven0Var2, (lnm) null, (byte) 1);
                x340Var.s0(objT4);
            } else {
                objT4 = new pg6(ven0Var, ven0Var2, (lnm) null, (byte) 1);
                x340Var.s0(objT4);
            }
            qxd0.t(bool4, x340Var, (vu30) objT4);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                i7 = 500;
            } else {
                i7 = 0;
            }
            ceo ceoVar4 = a;
            tob1VarB = z95.b(f, new pxg1(500, i7, ceoVar4), "transcriptAlpha", (iu30) null, x340Var, 3072, 20);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                i8 = 0;
            } else {
                i8 = 500;
            }
            tob1VarB2 = z95.b(f2, new pxg1(500, i8, ceoVar4), "descriptionAlpha", (iu30) null, x340Var, 3072, 20);
            gfh0VarC = t1c.c(een.g, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var5);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z12 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z12) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar13 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar13);
            llj lljVar14 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar14);
            Integer numValueOf4 = Integer.valueOf(iHashCode);
            llj lljVar15 = y580.R0;
            nko1.H(numValueOf4, x340Var, lljVar15);
            nko1.F(x340Var);
            llj lljVar16 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar16);
            qim0 qim0VarN7 = anm1.N("MDCTranscriptElement", i541.D(u291.f(qim0Var4, 1.0f), 0.0f, 0.0f, ((Number) tob1VarB.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571));
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(-496711418);
                x340Var.r(false);
                i9 = 0;
                m4cVar2 = m4cVar;
                qim0VarA = qim0Var4;
            } else {
                x340Var.i0(-496666251);
                objT5 = x340Var.T();
                m4cVar2 = m4cVar;
                if (objT5 == m4cVar2) {
                    objT5 = bmh.i;
                    x340Var.s0(objT5);
                }
                qim0VarA = s161.a(qim0Var4, (iu30) objT5);
                i9 = 0;
                x340Var.r(false);
            }
            qim0 qim0VarThen7 = qim0VarN7.then(qim0VarA);
            era eraVar4 = een.P0;
            f36 f36Var4 = h36.c;
            mbh mbhVarA7 = jbh.a(f36Var4, eraVar4, x340Var, i9);
            qim0 qim0Var10 = qim0Var5;
            int iHashCode8 = Long.hashCode(x340Var.T);
            xos0 xos0VarM8 = x340Var.m();
            qim0 qim0VarE8 = zr7.E(x340Var, qim0VarThen7);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA7, x340Var, lljVar13);
            nko1.H(xos0VarM8, x340Var, lljVar14);
            x0d.q(iHashCode8, x340Var, lljVar15, x340Var);
            nko1.H(qim0VarE8, x340Var, lljVar16);
            j2iVar.invoke(x340Var, Integer.valueOf((i3 >> 3) & 14));
            x340Var.r(true);
            qim0Var6 = qim0Var4;
            qim0 qim0VarN8 = anm1.N("MDCDescriptionElement", i541.D(qim0Var4, 0.0f, 0.0f, ((Number) tob1VarB2.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571));
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(-496335915);
                objT6 = x340Var.T();
                if (objT6 == m4cVar2) {
                    objT6 = bmh.t;
                    x340Var.s0(objT6);
                }
                qim0 qim0VarA5 = s161.a(qim0Var6, (iu30) objT6);
                i10 = 0;
                x340Var.r(false);
                qim0Var6 = qim0VarA5;
            } else {
                i10 = 0;
                x340Var.i0(-496245178);
                x340Var.r(false);
            }
            qim0 qim0VarThen8 = qim0VarN8.then(qim0Var6);
            mbh mbhVarA8 = jbh.a(f36Var4, eraVar4, x340Var, i10);
            int iHashCode9 = Long.hashCode(x340Var.T);
            xos0 xos0VarM9 = x340Var.m();
            qim0 qim0VarE9 = zr7.E(x340Var, qim0VarThen8);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA8, x340Var, lljVar13);
            nko1.H(xos0VarM9, x340Var, lljVar14);
            x0d.q(iHashCode9, x340Var, lljVar15, x340Var);
            nko1.H(qim0VarE9, x340Var, lljVar16);
            int i16 = i3 >> 9;
            boolean z16 = z9;
            h(cr00Var, z2, z3, z16, z5, x340Var, (i6 & 896) | (i3 & 14) | (i6 & 112) | (i16 & 7168) | (i16 & 57344));
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var3 = qim0Var10;
            z8 = z16;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            z8 = z6;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xsh(cr00Var, j2iVar, z, z2, z3, qim0Var3, z8, z5, i, i2);
        }
    }

    public static final void h(cr00 cr00Var, boolean z, boolean z2, boolean z3, boolean z4, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        String strU;
        boolean z5;
        lee1 lee1Var;
        int i3;
        int i4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1790908208);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(cr00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z4) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            b0kVar3.i0(1219106384);
            ye5 ye5Var = new ye5();
            b0kVar3.i0(1219107217);
            ar00 ar00Var = cr00Var.c;
            br00 br00Var = ar00Var.c;
            String str = ar00Var.a;
            String str2 = ar00Var.d;
            String str3 = ar00Var.b;
            if (br00Var.a > 0) {
                b0kVar3.i0(1191403074);
                int iC = l1d.C(br00Var.b);
                if (iC == 0) {
                    i4 = 2131820776;
                } else if (iC == 1) {
                    i4 = 2131820770;
                } else if (iC == 2) {
                    i4 = 2131820771;
                } else {
                    if (iC != 3) {
                        eg.o();
                        return;
                    }
                    i4 = 2131820772;
                }
                int i5 = br00Var.a;
                strU = cwl1.U(i4, i5, new Object[]{Integer.valueOf(i5)}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1720678255);
                b0kVar3.r(false);
                strU = "";
            }
            b0kVar3.i0(1219128198);
            uwr uwrVar = cbx.a;
            int iO = ye5Var.o(new zma1(cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            if (!z4 || str3 == null) {
                b0kVar3.i0(-694799389);
                b0kVar3.r(false);
            } else {
                try {
                    if (ihc1.y0(str3)) {
                        b0kVar3.i0(-694799389);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(-694941617);
                        int iO2 = ye5Var.o(new zma1(cbx.a(b0kVar3).b.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                        try {
                            ye5Var.f(str3);
                            ye5Var.k(iO2);
                            ye5Var.g(" • ");
                            b0kVar3.r(false);
                        } catch (Throwable th) {
                            ye5Var.k(iO2);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    ye5Var.k(iO);
                    throw th2;
                }
            }
            if (z3 && ar00Var.e && !ihc1.y0(str2)) {
                ye5Var.g(str2);
                if (!ihc1.y0(strU) || !ihc1.y0(str)) {
                    ye5Var.g(" • ");
                }
            }
            if (!ihc1.y0(strU)) {
                ye5Var.g(strU);
                if (!ihc1.y0(str)) {
                    ye5Var.g(" • ");
                }
            }
            ye5Var.k(iO);
            b0kVar3.r(false);
            b0kVar3.r(false);
            af5 af5VarP = ye5Var.p();
            b0kVar3.r(false);
            ye5 ye5Var2 = new ye5();
            ye5Var2.h(af5VarP);
            ye5Var2.g(ar00Var.a);
            af5 af5VarP2 = ye5Var2.p();
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            View view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
            String strO0 = cwl1.o0(b0kVar3, 2131958456);
            String strJ0 = ihc1.J0(af5VarP.b, " • ");
            if (ihc1.y0(strJ0)) {
                strJ0 = ar00Var.d;
            }
            String str4 = ar00Var.a;
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            qim0 qim0VarA = nim0.a;
            if (zBooleanValue) {
                b0kVar3.i0(-859837021);
                boolean zG = b0kVar3.g(strJ0) | b0kVar3.g(strO0) | b0kVar3.i(view) | b0kVar3.g(str4);
                Object objT2 = b0kVar3.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new ggh(strJ0, strO0, view, str4, (byte) 5);
                    b0kVar3.s0(objT2);
                }
                qim0VarA = s161.a(qim0VarA, (iu30) objT2);
                z5 = false;
                b0kVar3.r(false);
            } else {
                z5 = false;
                b0kVar3.i0(-859508328);
                b0kVar3.r(false);
            }
            qim0 qim0Var = qim0VarA;
            long j = ((vex) zex.a.e).m;
            if (z) {
                b0kVar3.i0(1219204730);
                lee1Var = cbx.d(b0kVar3).g;
                b0kVar3.r(z5);
            } else if (z3) {
                b0kVar3.i0(1219206680);
                lee1Var = cbx.d(b0kVar3).m;
                b0kVar3.r(z5);
            } else {
                b0kVar3.i0(1219208057);
                lee1Var = cbx.d(b0kVar3).j;
                b0kVar3.r(z5);
            }
            lee1 lee1Var2 = lee1Var;
            if (!z || z2) {
                i3 = z3 ? 7 : 2;
            } else {
                i3 = 4;
            }
            zic0 zic0Var = new zic0(i3);
            boolean zI = b0kVar3.i(ven0Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new f4g(ven0Var, (byte) 10);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP2, j, qim0Var, lee1Var2, (a0e1) null, (iu30) objT3, 2, false, zic0Var, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 3728);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ysh(cr00Var, z, z2, z3, z4, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016c  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:90:0x0133  */
    /* JADX WARN: Code duplicated, block: B:92:0x014a  */
    /* JADX WARN: Code duplicated, block: B:95:0x015c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0160  */
    public static final void i(boolean z, qim0 qim0Var, long j, String str, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        long j2;
        String str2;
        int i4;
        Function0 function1;
        int i5;
        boolean z2;
        qim0 qim0Var2;
        long j3;
        String str3;
        Function0 function2;
        h311 h311VarV;
        qim0 qim0Var3;
        boolean z3;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1320028753);
        int i6 = i & 6;
        h2c h2cVar = h2c.a;
        if (i6 == 0) {
            i3 = (x340Var.i(h2cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        int i7 = i3 | 384;
        if ((i & 3072) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                int i8 = x340Var.f(j2) ? 2048 : 1024;
                i7 |= i8;
            } else {
                j2 = j;
            }
            i7 |= i8;
        } else {
            j2 = j;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                i7 |= x340Var.g(str2) ? 16384 : 8192;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function1 = function0;
                    if (x340Var.i(function1)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i7 |= i5;
                }
                if ((74899 & i7) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i7 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if ((i2 & 4) != 0) {
                            uwr uwrVar = cbx.a;
                            j2 = ((vex) zex.a.e).d;
                            i7 &= -7169;
                        }
                        if (i9 != 0) {
                            str2 = null;
                        }
                        qim0Var3 = nim0.a;
                        if (i4 != 0) {
                            function1 = null;
                        }
                    } else {
                        x340Var.b0();
                        if ((i2 & 4) != 0) {
                            i7 &= -7169;
                        }
                        qim0Var3 = qim0Var;
                    }
                    x340Var.s();
                    if (z || function1 == null || str2 == null || ihc1.y0(str2)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    qim0 qim0VarF = dug.f(h2cVar.b(qim0Var3), j2, d4o1.a);
                    gfh0VarC = t1c.c(een.h, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
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
                    if (z3) {
                        x340Var.i0(-302454993);
                        int i10 = i7 >> 9;
                        f((i10 & 896) | (i10 & 112) | 6, str2, function1, x340Var);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-302364659);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                j3 = j2;
                str3 = str2;
                function2 = function1;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zsh(z, qim0Var2, j3, str3, function2, i, i2);
                }
            }
            i7 |= 196608;
            function1 = function0;
            if ((74899 & i7) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i7 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar2 = cbx.a;
                        j2 = ((vex) zex.a.e).d;
                        i7 &= -7169;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    qim0Var3 = nim0.a;
                    if (i4 != 0) {
                        function1 = null;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar3 = cbx.a;
                        j2 = ((vex) zex.a.e).d;
                        i7 &= -7169;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    qim0Var3 = nim0.a;
                    if (i4 != 0) {
                        function1 = null;
                    }
                }
                x340Var.s();
                if (z) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                qim0 qim0VarF2 = dug.f(h2cVar.b(qim0Var3), j2, d4o1.a);
                gfh0VarC = t1c.c(een.h, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF2);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                if (z3) {
                    x340Var.i0(-302454993);
                    int i11 = i7 >> 9;
                    f((i11 & 896) | (i11 & 112) | 6, str2, function1, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-302364659);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            j3 = j2;
            str3 = str2;
            function2 = function1;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zsh(z, qim0Var2, j3, str3, function2, i, i2);
            }
        }
        i7 |= 24576;
        str2 = str;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                function1 = function0;
                if (x340Var.i(function1)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i7 |= i5;
            }
            if ((74899 & i7) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i7 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar4 = cbx.a;
                        j2 = ((vex) zex.a.e).d;
                        i7 &= -7169;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    qim0Var3 = nim0.a;
                    if (i4 != 0) {
                        function1 = null;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar5 = cbx.a;
                        j2 = ((vex) zex.a.e).d;
                        i7 &= -7169;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    qim0Var3 = nim0.a;
                    if (i4 != 0) {
                        function1 = null;
                    }
                }
                x340Var.s();
                if (z) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                qim0 qim0VarF3 = dug.f(h2cVar.b(qim0Var3), j2, d4o1.a);
                gfh0VarC = t1c.c(een.h, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF3);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                if (z3) {
                    x340Var.i0(-302454993);
                    int i12 = i7 >> 9;
                    f((i12 & 896) | (i12 & 112) | 6, str2, function1, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-302364659);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            j3 = j2;
            str3 = str2;
            function2 = function1;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zsh(z, qim0Var2, j3, str3, function2, i, i2);
            }
        }
        i7 |= 196608;
        function1 = function0;
        if ((74899 & i7) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i7 & 1, z2)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    uwr uwrVar6 = cbx.a;
                    j2 = ((vex) zex.a.e).d;
                    i7 &= -7169;
                }
                if (i9 != 0) {
                    str2 = null;
                }
                qim0Var3 = nim0.a;
                if (i4 != 0) {
                    function1 = null;
                }
            } else {
                if ((i2 & 4) != 0) {
                    uwr uwrVar7 = cbx.a;
                    j2 = ((vex) zex.a.e).d;
                    i7 &= -7169;
                }
                if (i9 != 0) {
                    str2 = null;
                }
                qim0Var3 = nim0.a;
                if (i4 != 0) {
                    function1 = null;
                }
            }
            x340Var.s();
            if (z) {
                z3 = false;
            } else {
                z3 = false;
            }
            qim0 qim0VarF4 = dug.f(h2cVar.b(qim0Var3), j2, d4o1.a);
            gfh0VarC = t1c.c(een.h, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF4);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            if (z3) {
                x340Var.i0(-302454993);
                int i13 = i7 >> 9;
                f((i13 & 896) | (i13 & 112) | 6, str2, function1, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-302364659);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        j3 = j2;
        str3 = str2;
        function2 = function1;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zsh(z, qim0Var2, j3, str3, function2, i, i2);
        }
    }

    public static final void j(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2013844005);
        int i2 = i | 48 | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0Var = nim0.a;
            qim0 qim0VarA = h2c.a.a(u291.r(qim0Var, 64.0f), een.h);
            w0h1.a(z ? znx.c : xtx.c, isl.a, qim0VarA, cbx.a(x340Var).b.b, 0L, false, x340Var, 56, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(qim0Var, z, i, (byte) 6);
        }
    }

    public static final void k(hob1 hob1Var, xho xhoVar, hft0 hft0Var, qim0 qim0Var, hjv0 hjv0Var, njv0 njv0Var, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        rih1 rih1Var;
        m4c m4cVar = fkj0.X;
        set0 set0Var = hob1Var.n;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-685433431);
        int i2 = i | (x340Var.i(hob1Var) ? 4 : 2) | (x340Var.i(xhoVar) ? 32 : 16) | (x340Var.i(hft0Var) ? 256 : 128) | 3072 | (x340Var.i(hjv0Var) ? 16384 : 8192) | (x340Var.i(njv0Var) ? 131072 : 65536) | 1572864 | (x340Var.i(iu30Var) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
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
            x340Var.i0(-576848296);
            uiv0 uiv0Var = hob1Var.r;
            if (uiv0Var == null || njv0Var == null) {
                qim0Var3 = qim0Var4;
                z = false;
                rih1Var = null;
            } else {
                qim0Var3 = qim0Var4;
                z = false;
                otw.c(njv0Var, uiv0Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var = x340Var;
                rih1Var = rih1.a;
            }
            x340Var.r(z);
            if (rih1Var == null) {
                x340Var.i0(-702212106);
                wiv0 wiv0Var = hob1Var.q;
                if (wiv0Var != null && hjv0Var != null) {
                    boolean z2 = (i2 & 29360128) == 8388608 ? true : z;
                    Object objT = x340Var.T();
                    if (z2 || objT == m4cVar) {
                        objT = new wqf(iu30Var, (byte) 7);
                        x340Var.s0(objT);
                    }
                    otw.c(hjv0Var, wiv0.a(wiv0Var, (iu30) objT), (qim0) null, (ipb1) null, x340Var, 8, 12);
                }
                x340Var.r(z);
            } else {
                x340Var.i0(-576847935);
                x340Var.r(z);
            }
            x340Var.i0(-701848105);
            x340Var.r(z);
            uho uhoVar = hob1Var.p;
            if (uhoVar == null) {
                x340Var.i0(-701720385);
                x340Var.r(z);
            } else {
                x340Var.i0(-701720384);
                boolean z3 = (i2 & 29360128) == 8388608 ? true : z;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new thh(iu30Var, (byte) 15);
                    x340Var.s0(objT2);
                }
                otw.c(xhoVar, uho.a(uhoVar, (Function0) objT2), (qim0) null, (ipb1) null, x340Var, 8 | ((i2 >> 3) & 14), 12);
                x340Var.r(z);
            }
            if (set0Var.b) {
                x340Var.i0(-701469253);
                boolean z4 = (i2 & 29360128) == 8388608 ? true : z;
                Object objT3 = x340Var.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new thh(iu30Var, (byte) 16);
                    x340Var.s0(objT3);
                }
                otw.c(hft0Var, set0.a(set0Var, (Function0) objT3, (Function0) null, 2031), (qim0) null, (ipb1) null, x340Var, (i2 >> 6) & 14, 12);
                x340Var.r(z);
            } else {
                x340Var.i0(-701290507);
                x340Var.r(z);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(hob1Var, xhoVar, hft0Var, qim0Var2, hjv0Var, njv0Var, iu30Var, i);
        }
    }

    public static final void l(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(736827288);
        int i2 = i | (x340Var.g(str) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 145) != 144)) {
            qim0 qim0Var4 = nim0.a;
            if (str == null) {
                x340Var.i0(-756009476);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.i0(-756009475);
                qim0Var3 = qim0Var4;
                eso1.e(Uri.parse(str), isl.a, u291.d(qim0Var4, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 3968);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 14);
        }
    }

    public static final hfi0 m(hob1 hob1Var, iu30 iu30Var) {
        if (!hob1Var.O) {
            return ffi0.a;
        }
        String str = hob1Var.P;
        return (str == null || !str.equals(hob1Var.e)) ? new efi0(new thh(iu30Var, (byte) 17)) : gfi0.a;
    }

    public static final long n(cr00 cr00Var, b0k b0kVar) {
        i8h i8hVar = cr00Var.e;
        if (i8hVar instanceof i8h) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1450120443);
            x340Var.r(false);
            return z4p1.e(Color.parseColor(i8hVar.c));
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(1450123565);
        uwr uwrVar = cbx.a;
        long jA = cbx.a(x340Var2).a.a.a();
        x340Var2.r(false);
        return jA;
    }

    public static final qim0 o(qim0 qim0Var, float f, er00 er00Var) {
        return zr7.i(qim0Var, new ye6(f, er00Var, (byte) 1));
    }

    public static final qim0 p(float f, qim0 qim0Var, boolean z) {
        return z ? fj30.F(qim0Var, f, f) : qim0Var;
    }

    public static final mmr0 q(hob1 hob1Var) {
        return hob1Var.A ? new mmr0(new p3v(0.0f), new p3v(8.0f)) : new mmr0(new p3v(0.0f), new p3v(12.0f));
    }
}
