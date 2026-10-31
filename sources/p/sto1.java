package p;

import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class sto1 {
    public static b180 a;

    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0116  */
    public static final void a(wdm wdmVar, o0i o0iVar, ny7 ny7Var, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function1;
        int i4;
        boolean z;
        boolean z2;
        Function0 function2;
        h311 h311VarV;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objT;
        boolean z7;
        int i6;
        boolean z8;
        Object objT2;
        wdm wdmVar2 = wdmVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1405282170);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(wdmVar2) : x340Var.i(wdmVar2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? x340Var.g(ny7Var) : x340Var.i(ny7Var) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                i3 |= x340Var.i(function1) ? 2048 : 1024;
            }
            i4 = i3;
            z = false;
            if ((i4 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i4 & 1, z2)) {
                if (i7 != 0) {
                    function1 = null;
                }
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i5 = i4 & 14;
                if (i5 != 4 || ((i4 & 8) != 0 && x340Var.i(wdmVar2))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z9 = z3 | z4;
                if ((i4 & 896) != 256 || ((i4 & 512) != 0 && x340Var.i(ny7Var))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z9 | z5;
                objT = x340Var.T();
                if (z6 || objT == m4cVar) {
                    hb1 hb1Var = new hb1(function1, wdmVar2, ny7Var, (lnm) null, (byte) 21);
                    wdmVar2 = wdmVar2;
                    x340Var.s0(hb1Var);
                    objT = hb1Var;
                }
                qxd0.r(ny7Var, wdmVar2, function1, (vu30) objT, x340Var);
                soa0 soa0Var = new soa0(ny7Var, wdmVar2);
                if (i5 != 4 || ((i4 & 8) != 0 && x340Var.i(wdmVar2))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                i6 = i4 & 112;
                if (i6 != 32 || ((i4 & 64) != 0 && x340Var.i(o0iVar))) {
                    z = true;
                }
                z8 = z7 | z;
                objT2 = x340Var.T();
                if (z8 || objT2 == m4cVar) {
                    objT2 = new xg6(wdmVar2, o0iVar, (byte) 25);
                    x340Var.s0(objT2);
                }
                oto1.c(soa0Var, o0iVar, (iu30) objT2, x340Var, 64 | i6);
            } else {
                x340Var.b0();
            }
            function2 = function1;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2(wdmVar2, o0iVar, ny7Var, function2, i, i2);
            }
        }
        i3 |= 3072;
        function1 = function0;
        i4 = i3;
        z = false;
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i4 & 1, z2)) {
            if (i7 != 0) {
                function1 = null;
            }
            if ((i4 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            i5 = i4 & 14;
            if (i5 != 4) {
                z4 = true;
            } else {
                z4 = true;
            }
            boolean z10 = z3 | z4;
            if ((i4 & 896) != 256) {
                z5 = true;
            } else {
                z5 = true;
            }
            z6 = z10 | z5;
            objT = x340Var.T();
            if (z6) {
                hb1 hb1Var2 = new hb1(function1, wdmVar2, ny7Var, (lnm) null, (byte) 21);
                wdmVar2 = wdmVar2;
                x340Var.s0(hb1Var2);
                objT = hb1Var2;
            } else {
                hb1 hb1Var3 = new hb1(function1, wdmVar2, ny7Var, (lnm) null, (byte) 21);
                wdmVar2 = wdmVar2;
                x340Var.s0(hb1Var3);
                objT = hb1Var3;
            }
            qxd0.r(ny7Var, wdmVar2, function1, (vu30) objT, x340Var);
            soa0 soa0Var2 = new soa0(ny7Var, wdmVar2);
            if (i5 != 4) {
                z7 = true;
            } else {
                z7 = true;
            }
            i6 = i4 & 112;
            if (i6 != 32) {
                z = true;
            } else {
                z = true;
            }
            z8 = z7 | z;
            objT2 = x340Var.T();
            if (z8) {
                objT2 = new xg6(wdmVar2, o0iVar, (byte) 25);
                x340Var.s0(objT2);
            } else {
                objT2 = new xg6(wdmVar2, o0iVar, (byte) 25);
                x340Var.s0(objT2);
            }
            oto1.c(soa0Var2, o0iVar, (iu30) objT2, x340Var, 64 | i6);
        } else {
            x340Var.b0();
        }
        function2 = function1;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2(wdmVar2, o0iVar, ny7Var, function2, i, i2);
        }
    }

    public static final void b(pto1 pto1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        af5 af5VarP;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1794383637);
        int i4 = i | (x340Var.g(pto1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (pto1Var.t()) {
                i2 = 1320179613;
                i3 = 2131953700;
            } else {
                i2 = 1320264646;
                i3 = 2131953699;
            }
            String strK = x0d.k(x340Var, i2, i3, x340Var, false);
            if (pto1Var.t()) {
                x340Var.i0(1320390940);
                z = (i4 & 112) == 32;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new c5a(iu30Var, (byte) 22);
                    x340Var.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                ye5 ye5VarO = kk0.o(-1619233995, x340Var);
                String strL = l(pto1Var, x340Var);
                uwr uwrVar = cbx.a;
                zma1 zma1Var = new zma1(cbx.a(x340Var).b.a, 0L, cbx.d(x340Var).n.a.c, cbx.d(x340Var).n.a.d, (FontSynthesis) null, cbx.d(x340Var).n.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490);
                ye5VarO.g(strL + " ");
                if (pto1Var.u() || !pto1Var.r()) {
                    x340Var.i0(1180317250);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1179300512);
                    String strO0 = cwl1.o0(x340Var, 2131953704);
                    String strN0 = cwl1.n0(2131953705, new Object[]{strO0}, x340Var);
                    int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
                    int length = strO0.length() + iW0;
                    ye5VarO.f(strN0.subSequence(0, iW0));
                    boolean zG = x340Var.g(iu30Var2);
                    Object objT2 = x340Var.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new c5a(iu30Var2, (byte) 24);
                        x340Var.s0(objT2);
                    }
                    vhg.a(ye5VarO, strO0, "goToSettingsLink", zma1Var, (iu30) objT2);
                    ye5VarO.f(strN0.subSequence(length, strN0.length()));
                    ye5VarO.g("\n\n");
                    x340Var.r(false);
                }
                String strO1 = cwl1.o0(x340Var, 2131953685);
                boolean zG2 = x340Var.g(iu30Var2);
                Object objT3 = x340Var.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new c5a(iu30Var2, (byte) 25);
                    x340Var.s0(objT3);
                }
                vhg.a(ye5VarO, strO1, "manageSocialSettings", zma1Var, (iu30) objT3);
                af5VarP = ye5VarO.p();
                x340Var.r(false);
                x340Var.r(false);
            } else {
                x340Var.i0(1320478918);
                z = (i4 & 112) == 32;
                Object objT4 = x340Var.T();
                if (z || objT4 == m4cVar) {
                    objT4 = new c5a(iu30Var, (byte) 23);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var3 = (iu30) objT4;
                ye5 ye5VarO2 = kk0.o(-1265800612, x340Var);
                String strL2 = l(pto1Var, x340Var);
                if (pto1Var.u()) {
                    x340Var.i0(-1384065111);
                    x340Var.r(false);
                    ye5VarO2.g(strL2);
                    z2 = false;
                } else {
                    x340Var.i0(-1383994245);
                    ye5VarO2.g(strL2 + " ");
                    String strO2 = cwl1.o0(x340Var, 2131953698);
                    String strN1 = cwl1.n0(2131953697, new Object[]{strO2}, x340Var);
                    int iW1 = ihc1.w0(strN1, strO2, 0, false, 6);
                    int length2 = strO2.length() + iW1;
                    uwr uwrVar2 = cbx.a;
                    zma1 zma1Var2 = new zma1(cbx.a(x340Var).b.a, 0L, cbx.d(x340Var).n.a.c, cbx.d(x340Var).n.a.d, (FontSynthesis) null, cbx.d(x340Var).n.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490);
                    z2 = false;
                    ye5VarO2.f(strN1.subSequence(0, iW1));
                    vhg.a(ye5VarO2, strO2, "goToSettingsLink", zma1Var2, iu30Var3);
                    ye5VarO2.f(strN1.subSequence(length2, strN1.length()));
                    x340Var.r(false);
                }
                af5VarP = ye5VarO2.p();
                x340Var.r(z2);
                x340Var.r(z2);
            }
            qim0 qim0Var3 = nim0.a;
            o6p1.b(strK, af5VarP, anm1.N("chat-requested-view-test-tag", qim0Var3), null, x340Var, 0, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(pto1Var, iu30Var, qim0Var2, i, (byte) 12);
        }
    }

    public static final void c(gw70 gw70Var, se10 se10Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1871556096);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(gw70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(se10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(56.0f) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xc10.g;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI = x340Var.i(gw70Var) | ((i3 & 896) == 256) | x340Var.i(se10Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new f0z(gw70Var, se10Var, (byte) 29);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            dm5.a(iu30Var, qim0Var3, (iu30) objT2, x340Var, ((i3 >> 6) & 112) | 6, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(gw70Var, se10Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void d(int i, String str, List list, b0k b0kVar) {
        List list2;
        qim0 qim0Var;
        llj lljVar;
        m4c m4cVar;
        boolean z;
        boolean z2;
        String str2 = str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1321940989);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(list) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar2) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean zI = x340Var.i(ven0Var) | x340Var.i(ven0Var2);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar2) {
                objT3 = new w621(ven0Var, ven0Var2, (lnm) null, (byte) 12);
                x340Var.s0(objT3);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT3);
            tob1 tob1VarB = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 0.0f : 1.0f, irn1.o0(1000, 0, null, 6), "content-alpha", (iu30) null, x340Var, 3072, 20);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f, irn1.o0(1000, 0, null, 6), "dots-alpha", (iu30) null, x340Var, 3072, 20);
            tob1 tob1VarB3 = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 0.0f : 1.0f, irn1.o0(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, null, 6), "placeholder-alpha", (iu30) null, x340Var, 3072, 20);
            tob1 tob1VarB4 = z95.b(((Boolean) ven0Var2.getValue()).booleanValue() ? 1.0f : 0.0f, irn1.o0(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, null, 6), "loading-text-alpha", (iu30) null, x340Var, 3072, 20);
            gra graVar = new gra(0.0f, -0.1f);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = voo1.y(dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a), voo1.c);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar2);
            llj lljVar3 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar4 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar4);
            nko1.F(x340Var);
            llj lljVar5 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar5);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar2);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar4, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar5);
            gra graVar2 = een.h;
            gfh0 gfh0VarC2 = t1c.c(graVar2, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar2);
            nko1.H(xos0VarM3, x340Var, lljVar3);
            x0d.q(iHashCode3, x340Var, lljVar4, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar5);
            if (list.isEmpty()) {
                qim0Var = qim0Var2;
                lljVar = lljVar4;
                m4cVar = m4cVar2;
                x340Var.i0(1597149921);
                x340Var.r(false);
            } else {
                x340Var.i0(1596949072);
                boolean zI2 = x340Var.i(tob1VarB);
                Object objT4 = x340Var.T();
                m4cVar = m4cVar2;
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new lws0(tob1VarB, (byte) 26);
                    x340Var.s0(objT4);
                }
                qim0Var = qim0Var2;
                lljVar = lljVar4;
                ern1.c(list, i541.C(qim0Var2, (iu30) objT4), 10.0f, x340Var, i2 & 14, 0);
                x340Var = x340Var;
                x340Var.r(false);
            }
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1597190934);
                qim0 qim0VarR = u291.r(qim0Var, 140.0f);
                boolean zI3 = x340Var.i(tob1VarB2);
                Object objT5 = x340Var.T();
                if (zI3 || objT5 == m4cVar) {
                    objT5 = new lws0(tob1VarB2, (byte) 27);
                    x340Var.s0(objT5);
                }
                qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT5);
                gfh0 gfh0VarC3 = t1c.c(graVar2, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarC);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar2);
                nko1.H(xos0VarM4, x340Var, lljVar3);
                x0d.q(iHashCode4, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar5);
                z2 = false;
                yto1.e(0, 0, 3, x340Var, null);
                z = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                z = true;
                z2 = false;
                x340Var.i0(1597395937);
                x340Var.r(false);
            }
            x340Var.r(z);
            op71.g(x340Var, u291.h(qim0Var, cbx.b(x340Var).b.a));
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var);
            gfh0 gfh0VarC4 = t1c.c(graVar2, z2);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC4, x340Var, lljVar2);
            nko1.H(xos0VarM5, x340Var, lljVar3);
            x0d.q(iHashCode5, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar5);
            String strO0 = cwl1.o0(x340Var, list.size() > 1 ? 2131952265 : 2131952264);
            lee1 lee1Var = cbx.d(x340Var).d;
            boolean zI4 = x340Var.i(tob1VarB3);
            Object objT6 = x340Var.T();
            if (zI4 || objT6 == m4cVar) {
                objT6 = new lws0(tob1VarB3, (byte) 28);
                x340Var.s0(objT6);
            }
            x340 x340Var2 = x340Var;
            m4c m4cVar3 = m4cVar;
            qim0 qim0Var3 = qim0Var;
            uwo1.e(strO0, i541.C(qim0Var, (iu30) objT6), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2024);
            lee1 lee1Var2 = cbx.d(x340Var2).d;
            boolean zI5 = x340Var2.i(tob1VarB4);
            Object objT7 = x340Var2.T();
            if (zI5 || objT7 == m4cVar3) {
                objT7 = new lws0(tob1VarB4, (byte) 29);
                x340Var2.s0(objT7);
            }
            str2 = str;
            list2 = list;
            uwo1.e(str2, i541.C(qim0Var3, (iu30) objT7), lee1Var2, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, (i2 >> 3) & 14, 0, 2024);
            x340Var = x340Var2;
            us71.m(x340Var, true, true, true);
        } else {
            list2 = list;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vwb0(list2, str2, i);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-665800269);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 5);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("learn-more-row", uyn1.y(qim0VarX, f, 16.0f));
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            uwo1.e(cwl1.o0(x340Var, 2131957187), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            w0h1.a(plx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, plx.d | 48, 52);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 2);
        }
    }

    public static final void f(String str, String str2, String str3, String str4, String str5, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(676385736);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(str4) ? 2048 : 1024) | (x340Var.g(str5) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(function1) ? 1048576 : 524288) | 12582912;
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            nyx.a(3, (wux) null, apo.r(1876403995, new ydi0(str, str4, str3, str2, str5, function0, function1), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(str, str2, str3, str4, str5, function0, function1, qim0Var2, i);
        }
    }

    public static final void g(Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1370114296);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            if (ihc1.y0("Decline")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50("Decline"), function1), jdx.c, anm1.N("single-request-decline-button", qim0Var3), null, yla.s(x340Var), null, null, null, null, null, jsi.a, x340Var, 0, 48, 2008);
            if (ihc1.y0("Accept")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50("Accept"), function0), new idx(4), anm1.N("single-request-accept-button", qim0Var3), null, yla.s(x340Var), null, null, null, null, null, jsi.b, x340Var, 0, 48, 2008);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yv60(function0, function1, qim0Var2, i, (byte) 0);
        }
    }

    public static void h(d1i0 d1i0Var) {
        d1i0Var.stopForeground(1);
    }

    public static final qzh i(View view) {
        return (qzh) view.getTag(2131428639);
    }

    public static final qim0 j(qim0 qim0Var, hw61 hw61Var, iu30 iu30Var) {
        return qim0Var.then(new g6b(hw61Var, iu30Var));
    }

    public static final qim0 k(qim0 qim0Var, hw61 hw61Var, bw61 bw61Var) {
        return qim0Var.then(new ow81(hw61Var, bw61Var));
    }

    public static final String l(pto1 pto1Var, b0k b0kVar) {
        if (!(pto1Var instanceof rjf)) {
            if (!(pto1Var instanceof sjf)) {
                eg.o();
                return null;
            }
            sjf sjfVar = (sjf) pto1Var;
            boolean z = sjfVar.c;
            if (sjfVar.d && z) {
                x340 x340Var = (x340) b0kVar;
                return x0d.k(x340Var, -658128203, 2131956473, x340Var, false);
            }
            if (z) {
                x340 x340Var2 = (x340) b0kVar;
                return x0d.k(x340Var2, -658123572, 2131956472, x340Var2, false);
            }
            x340 x340Var3 = (x340) b0kVar;
            return x0d.k(x340Var3, -658120624, 2131956471, x340Var3, false);
        }
        rjf rjfVar = (rjf) pto1Var;
        boolean z2 = rjfVar.d;
        String str = rjfVar.b;
        boolean z3 = rjfVar.e;
        if (z3 && z2) {
            x340 x340Var4 = (x340) b0kVar;
            x340Var4.i0(-658152424);
            String strN0 = cwl1.n0(2131953696, new Object[]{str}, x340Var4);
            x340Var4.r(false);
            return strN0;
        }
        if (z3) {
            x340 x340Var5 = (x340) b0kVar;
            x340Var5.i0(-658147972);
            String strN1 = cwl1.n0(2131953694, new Object[]{str}, x340Var5);
            x340Var5.r(false);
            return strN1;
        }
        if (z2) {
            x340 x340Var6 = (x340) b0kVar;
            x340Var6.i0(-658141137);
            String strN2 = cwl1.n0(2131953695, new Object[]{str}, x340Var6);
            x340Var6.r(false);
            return strN2;
        }
        x340 x340Var7 = (x340) b0kVar;
        x340Var7.i0(-658137709);
        String strN3 = cwl1.n0(2131953693, new Object[]{str}, x340Var7);
        x340Var7.r(false);
        return strN3;
    }

    public static boolean m(String str) {
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
            return true;
        }
        return nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false);
    }

    public static final tv60 n(ms60 ms60Var, qv60 qv60Var, b0a0 b0a0Var) {
        if (ms60Var.equals(is60.a)) {
            return rv60.a;
        }
        if (ms60Var instanceof ls60) {
            return new sv60(((no4) b0a0Var.a.get()).u(), qv60Var.a, (ls60) ms60Var);
        }
        eg.o();
        return null;
    }

    public static qim0 o(qim0 qim0Var, float f, hw61 hw61Var, boolean z, long j, long j2, int i) {
        if ((i & 2) != 0) {
            hw61Var = d4o1.a;
        }
        hw61 hw61Var2 = hw61Var;
        if ((i & 4) != 0) {
            z = p3v.b(f, 0.0f) > 0;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = he50.a;
        }
        return (p3v.b(f, 0.0f) > 0 || z2) ? qim0Var.then(new cw61(f, hw61Var2, z2, j, (i & 16) != 0 ? he50.a : j2)) : qim0Var;
    }

    public static boolean p(m1h1 m1h1Var, qh31 qh31Var, qh31 qh31Var2) {
        if (m1h1Var.f0(qh31Var) == m1h1Var.f0(qh31Var2) && m1h1Var.t(qh31Var) == m1h1Var.t(qh31Var2) && m1h1Var.K(qh31Var) == m1h1Var.K(qh31Var2) && m1h1Var.W(m1h1Var.q(qh31Var), m1h1Var.q(qh31Var2))) {
            if (m1h1Var.d0(qh31Var, qh31Var2)) {
                return true;
            }
            int iF0 = m1h1Var.f0(qh31Var);
            for (int i = 0; i < iF0; i++) {
                d0h1 d0h1VarM0 = m1h1Var.m0(qh31Var, i);
                d0h1 d0h1VarM1 = m1h1Var.m0(qh31Var2, i);
                if (m1h1Var.J(d0h1VarM0) == m1h1Var.J(d0h1VarM1)) {
                    if (!m1h1Var.J(d0h1VarM0)) {
                        if (m1h1Var.V(d0h1VarM0) == m1h1Var.V(d0h1VarM1)) {
                            e8b0 e8b0VarN = m1h1Var.n(d0h1VarM0);
                            e8b0VarN.getClass();
                            e8b0 e8b0VarN2 = m1h1Var.n(d0h1VarM1);
                            e8b0VarN2.getClass();
                            if (!q(m1h1Var, e8b0VarN, e8b0VarN2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean q(m1h1 m1h1Var, e8b0 e8b0Var, e8b0 e8b0Var2) {
        if (e8b0Var == e8b0Var2) {
            return true;
        }
        qh31 qh31VarJ0 = m1h1Var.j0(e8b0Var);
        qh31 qh31VarJ1 = m1h1Var.j0(e8b0Var2);
        if (qh31VarJ0 != null && qh31VarJ1 != null) {
            return p(m1h1Var, qh31VarJ0, qh31VarJ1);
        }
        gq20 gq20VarL = m1h1Var.L(e8b0Var);
        gq20 gq20VarL2 = m1h1Var.L(e8b0Var2);
        return gq20VarL != null && gq20VarL2 != null && p(m1h1Var, m1h1Var.f(gq20VarL), m1h1Var.f(gq20VarL2)) && p(m1h1Var, m1h1Var.g(gq20VarL), m1h1Var.g(gq20VarL2));
    }

    public static final Integer r(int i) {
        switch (l1d.C(i)) {
            case 1:
                return 2131960904;
            case 2:
                return 2131960903;
            case 3:
                return 2131960902;
            case 4:
                return 2131960907;
            case 5:
                return 2131960905;
            case 6:
                return 2131960906;
            case 7:
                return 2131960908;
            case 8:
                return 2131960909;
            default:
                return null;
        }
    }

    public static final List s(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            String str = ((b7a1) obj).a;
            if (str != null) {
                Set set = s4b1.f;
                if (uic.x(str).c == blc0.u1) {
                    arrayList.add(obj);
                }
            }
            arrayList2.add(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            String str2 = ((b7a1) obj2).a;
            str2.getClass();
            Object objH = linkedHashMap.get(str2);
            if (objH == null) {
                objH = cfm0.h(str2, linkedHashMap);
            }
            ((List) objH).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            String str4 = ((b7a1) o7h.q0(list2)).b;
            List list3 = list2;
            ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList4.add(((b7a1) it.next()).c.a);
            }
            ArrayList arrayList5 = new ArrayList(q7h.U(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                c7a1 c7a1Var = ((b7a1) it2.next()).c;
                String str5 = c7a1Var.a;
                ArrayList arrayList6 = c7a1Var.b;
                ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((d7a1) it3.next()).a);
                }
                arrayList5.add(new rm31(str5, arrayList7));
            }
            arrayList3.add(new hwm(str4, arrayList4, str3, arrayList5));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            String str6 = ((b7a1) obj3).b;
            Object objH2 = linkedHashMap2.get(str6);
            if (objH2 == null) {
                objH2 = cfm0.h(str6, linkedHashMap2);
            }
            ((List) objH2).add(obj3);
        }
        ArrayList arrayList8 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str7 = (String) entry2.getKey();
            List list4 = (List) entry2.getValue();
            ArrayList arrayList9 = new ArrayList(q7h.U(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList9.add(((b7a1) it4.next()).c.a);
            }
            ArrayList arrayList10 = new ArrayList(q7h.U(list4, 10));
            Iterator it5 = list4.iterator();
            while (it5.hasNext()) {
                c7a1 c7a1Var2 = ((b7a1) it5.next()).c;
                String str8 = c7a1Var2.a;
                ArrayList arrayList11 = c7a1Var2.b;
                ArrayList arrayList12 = new ArrayList(q7h.U(arrayList11, 10));
                Iterator it6 = arrayList11.iterator();
                while (it6.hasNext()) {
                    arrayList12.add(((d7a1) it6.next()).a);
                }
                arrayList10.add(new rm31(str8, arrayList12));
            }
            arrayList8.add(new hwm(str7, arrayList9, (String) null, arrayList10));
        }
        return o7h.l1(o7h.N0(arrayList8, arrayList3));
    }
}
