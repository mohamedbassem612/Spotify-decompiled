package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class y251 {
    public static final long a = fc11.G(22);
    public static final float b = 5.0f;
    public static final kua0 c = new kua0(0, (Boolean) null, 0, 3, 119);

    public static final void a(y7e1 y7e1Var, boolean z, boolean z2, int i, u251 u251Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2010383250);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.i(y7e1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.h(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.g(u251Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            uwr uwrVar = cbx.a;
            int i4 = i3 << 3;
            b0kVar2 = b0kVar3;
            e(y7e1Var, z, z2, null, i, u251Var, vej.a, dug.f(qim0Var, cbx.a(b0kVar3).a.b.a(), d4o1.a), iu30Var, b0kVar2, (i3 & 14) | 1575936 | (i3 & 112) | (i3 & 896) | (57344 & i4) | (i4 & 458752) | ((i3 << 6) & 234881024));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new v251(y7e1Var, z, z2, i, u251Var, qim0Var, iu30Var, i2, (byte) 0);
        }
    }

    public static final void b(y7e1 y7e1Var, boolean z, boolean z2, qim0 qim0Var, boolean z3, int i, u251 u251Var, iu30 iu30Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1519232549);
        int i3 = i2 | (x340Var.i(y7e1Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | 3072 | (x340Var.h(z3) ? 16384 : 8192) | (x340Var.e(i) ? 131072 : 65536) | (x340Var.g(u251Var) ? 1048576 : 524288);
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            if (z3) {
                x340Var.i0(-908155530);
                int i4 = i3 & 1022;
                int i5 = i3 >> 6;
                g(y7e1Var, z, z2, i, u251Var, qim0Var3, iu30Var, x340Var, (i5 & 57344) | i4 | (i5 & 7168) | 1769472);
                x340Var.r(false);
            } else {
                x340Var.i0(-907888713);
                int i6 = i3 & 1022;
                int i7 = i3 >> 6;
                a(y7e1Var, z, z2, i, u251Var, qim0Var3, iu30Var, x340Var, (i7 & 57344) | i6 | (i7 & 7168) | 1769472);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w040(y7e1Var, z, z2, qim0Var2, z3, i, u251Var, iu30Var, i2);
        }
    }

    public static final void c(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1430637632);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            zov0 zov0Var = cbx.b(x340Var).g;
            int i3 = i2;
            ikx ikxVar = ikx.c;
            long j = cbx.a(x340Var).b.a;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131961550));
            qim0 qim0VarN = anm1.N("search_field_back_button", u291.r(nim0.a, 48.0f));
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new wg31(iu30Var, (byte) 12);
                x340Var.s0(objT);
            }
            w0h1.a(ikxVar, jslVar, uyn1.x(bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), 16.0f), j, 0L, false, x340Var, ikx.d, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new luy0(iu30Var, i, (byte) 1);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, boolean z) {
        int i2;
        b0k b0kVar2;
        long j;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1065023239);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(b0kVar3).d;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            gux guxVar = z ? gux.c : fux.c;
            jsl jslVar = new jsl(cwl1.o0(b0kVar3, 2131961489));
            if (z) {
                b0kVar3.i0(-1285101792);
                j = cbx.a(b0kVar3).b.b;
            } else {
                b0kVar3.i0(-1285100707);
                j = cbx.a(b0kVar3).b.a;
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            w0h1.a(guxVar, jslVar, uyn1.x(bin.x(anm1.N("search_field_clear_button", u291.r(nim0.a, 48.0f)), false, (String) null, (pm31) null, (idn0) null, function0, 15), 16.0f), j, 0L, true, b0kVar2, 196616, 16);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new u2y((byte) 6, i, function0, z);
        }
    }

    public static final void e(y7e1 y7e1Var, boolean z, boolean z2, tvh1 tvh1Var, int i, u251 u251Var, j2i j2iVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        j2i j2iVar2;
        lee1 lee1VarA;
        qim0 qim0VarH;
        qim0 qim0Var2;
        t01 vndVar;
        iu30 iu30Var2;
        y7e1 y7e1Var2;
        idn0 idn0Var;
        Function0 function0;
        boolean z3;
        tob1 tob1Var;
        ven0 ven0Var;
        tob1 tob1Var2;
        vu30 vu30Var;
        boolean z4;
        qim0 qim0VarB;
        int i4;
        vu30 vu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1807801344);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(y7e1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(tvh1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.g(u251Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.i(j2iVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= x340Var.i(qim0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= x340Var.i(iu30Var) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (x340Var.Y(i5 & 1, (i5 & 38347923) != 38347922)) {
            boolean z5 = tvh1Var != null;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var2 = (idn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT2;
            az20 az20Var = (az20) x340Var.k(t4k.i);
            k6a1 k6a1Var = (k6a1) x340Var.k(t4k.q);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(uex0.a);
                x340Var.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT4);
            }
            tob1 tob1Var3 = (ven0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.h(0, x340Var);
            }
            tob1 tob1Var4 = (hdn0) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT6);
            }
            ven0 ven0Var3 = (ven0) objT6;
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT7);
            }
            ven0 ven0Var4 = (ven0) objT7;
            if (z5) {
                x340Var.i0(1615912266);
                uwr uwrVar = cbx.a;
                lee1VarA = lee1.a(cbx.d(x340Var).g, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, a, (u8e1) null, (wdt0) null, (shc0) null, 0, 16646142);
                x340Var.r(false);
            } else {
                x340Var.i0(1616066832);
                uwr uwrVar2 = cbx.a;
                lee1VarA = lee1.a(cbx.d(x340Var).g, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                x340Var.r(false);
            }
            int i6 = i5 & 112;
            boolean zH = (i6 == 32) | x340Var.h(z5);
            boolean z6 = z5;
            Object objT8 = x340Var.T();
            if (zH || objT8 == m4cVar) {
                objT8 = new c6e1(0, (z || z6) ? 3 : 1, 1);
                x340Var.s0(objT8);
            }
            c6e1 c6e1Var = (c6e1) objT8;
            boolean zI = x340Var.i(ven0Var3) | x340Var.i(ven0Var2) | x340Var.i(lz20Var);
            Object objT9 = x340Var.T();
            if (zI || objT9 == m4cVar) {
                objT9 = new d4v0(lz20Var, ven0Var3, ven0Var2, (byte) 29);
                x340Var.s0(objT9);
            }
            Function0 function1 = (Function0) objT9;
            int i7 = i5 & 234881024;
            boolean zI2 = x340Var.i(tob1Var3) | (i7 == 67108864);
            Object objT10 = x340Var.T();
            if (zI2 || objT10 == m4cVar) {
                objT10 = new i5r0(iu30Var, tob1Var3, (byte) 4);
                x340Var.s0(objT10);
            }
            iu30 iu30Var3 = (iu30) objT10;
            boolean zI3 = x340Var.i(y7e1Var) | (i7 == 67108864) | x340Var.g(function1);
            Object objT11 = x340Var.T();
            if (zI3 || objT11 == m4cVar) {
                objT11 = new d4v0(y7e1Var, iu30Var, function1, (byte) 28);
                x340Var.s0(objT11);
            }
            Function0 function2 = (Function0) objT11;
            boolean zI4 = x340Var.i(ven0Var2) | (i7 == 67108864) | x340Var.i(y7e1Var);
            Object objT12 = x340Var.T();
            if (zI4 || objT12 == m4cVar) {
                objT12 = new irn(iu30Var, y7e1Var, ven0Var2, (byte) 2);
                x340Var.s0(objT12);
            }
            Function0 function3 = (Function0) objT12;
            if (tvh1Var == null || (qim0VarH = u291.h(qim0Var, tvh1Var.b)) == null) {
                qim0VarH = qim0Var;
            }
            if (tvh1Var != null) {
                x340Var.i0(1617204532);
                qim0Var2 = qim0VarH;
                vndVar = new t01(y7e1Var, tvh1Var, idn0Var2, u251Var, lee1VarA, i);
                x340Var.r(false);
                y7e1Var2 = y7e1Var;
                idn0Var = idn0Var2;
                iu30Var2 = iu30Var3;
                function0 = function2;
                z3 = z;
            } else {
                qim0Var2 = qim0VarH;
                x340Var.i0(1617479440);
                iu30Var2 = iu30Var3;
                y7e1Var2 = y7e1Var;
                vndVar = new vnd(y7e1Var2, iu30Var2, z, idn0Var2, u251Var, i, function2);
                idn0Var = idn0Var2;
                function0 = function2;
                z3 = z;
                x340Var.r(false);
            }
            t01 t01Var = vndVar;
            boolean zI5 = x340Var.i(y7e1Var2) | (i7 == 67108864);
            Object objT13 = x340Var.T();
            if (zI5 || objT13 == m4cVar) {
                objT13 = new qy5(y7e1Var2, iu30Var, (lnm) null, (byte) 11);
                x340Var.s0(objT13);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT13);
            qim0 qim0VarP = vby0.p(anm1.N("search_field_input", u291.f(qim0Var2, 1.0f)), lz20Var);
            boolean zH2 = x340Var.h(z6) | (i6 == 32);
            Object objT14 = x340Var.T();
            if (zH2 || objT14 == m4cVar) {
                objT14 = new klf(z6, z3, (byte) 3);
                x340Var.s0(objT14);
            }
            qim0 qim0VarQ = d9y0.q(qim0VarP, (iu30) objT14);
            boolean zI6 = x340Var.i(ven0Var3) | x340Var.i(ven0Var4) | x340Var.i(ven0Var2) | (i6 == 32) | x340Var.i(tob1Var4) | (i7 == 67108864) | x340Var.i(tob1Var3);
            Object objT15 = x340Var.T();
            if (zI6 || objT15 == m4cVar) {
                tob1Var = tob1Var4;
                ven0Var = ven0Var2;
                boolean z7 = z3;
                tob1Var2 = tob1Var3;
                vu30Var = null;
                objT15 = new jqy(z7, iu30Var, ven0Var3, ven0Var4, ven0Var, tob1Var, tob1Var2, (byte) 3);
                x340Var.s0(objT15);
            } else {
                ven0Var = ven0Var2;
                tob1Var = tob1Var4;
                tob1Var2 = tob1Var3;
                vu30Var = null;
            }
            qim0 qim0VarG = cev0.G(qim0VarQ, (iu30) objT15);
            boolean zG = x340Var.g(function3);
            Object objT16 = x340Var.T();
            if (zG || objT16 == m4cVar) {
                objT16 = new hii0(function3, (byte) 19);
                x340Var.s0(objT16);
            }
            qim0 qim0VarT = y9g1.t(qim0VarG, (iu30) objT16);
            qim0 qim0VarB2 = nim0.a;
            if (z6 != 0 || z) {
                z4 = false;
                x340Var.i0(1620179168);
                x340Var.r(false);
                qim0VarB = qim0VarB2;
            } else {
                x340Var.i0(1620002065);
                boolean zG2 = x340Var.g(iu30Var2);
                Object objT17 = x340Var.T();
                if (zG2 || objT17 == m4cVar) {
                    objT17 = new n601(iu30Var2, (byte) 18);
                    x340Var.s0(objT17);
                }
                z4 = false;
                qim0VarB = s161.b(qim0VarB2, false, (iu30) objT17);
                x340Var.r(false);
            }
            qim0 qim0VarThen = qim0VarT.then(qim0VarB);
            Object objT18 = x340Var.T();
            if (objT18 == m4cVar) {
                objT18 = ej41.O0;
                x340Var.s0(objT18);
            }
            qim0 qim0VarB3 = s161.b(qim0VarThen, z4, (iu30) objT18);
            if (u251Var == null || y7e1Var.d().d.length() <= 0) {
                i4 = 0;
                x340Var.i0(1620567040);
                x340Var.r(false);
            } else {
                x340Var.i0(1620370717);
                String strN0 = cwl1.n0(2131961504, new Object[]{y7e1Var.d().d}, x340Var);
                boolean zG3 = x340Var.g(strN0);
                Object objT19 = x340Var.T();
                if (zG3 || objT19 == m4cVar) {
                    objT19 = new sc21(strN0, (byte) 21);
                    x340Var.s0(objT19);
                }
                i4 = 0;
                qim0VarB2 = s161.b(qim0VarB2, false, (iu30) objT19);
                x340Var.r(false);
            }
            qim0 qim0VarThen2 = qim0VarB3.then(qim0VarB2);
            n6a1 n6a1Var = new n6a1(cbx.a(x340Var).b.c);
            kua0 kua0VarA = kua0.a(c, i4, Boolean.valueOf(z2), 95);
            boolean zG4 = x340Var.g(function3);
            Object objT20 = x340Var.T();
            if (zG4 || objT20 == m4cVar) {
                objT20 = new uy5(function3, (byte) 6);
                x340Var.s0(objT20);
            }
            yta0 yta0Var = (yta0) objT20;
            if (tvh1Var == null) {
                x340Var.i0(1620956523);
                x340Var.r(false);
                vu30Var2 = vu30Var;
            } else {
                x340Var.i0(1620956524);
                boolean zI7 = x340Var.i(tvh1Var);
                Object objT21 = x340Var.T();
                if (zI7 || objT21 == m4cVar) {
                    objT21 = new u841(tvh1Var, (byte) 4);
                    x340Var.s0(objT21);
                }
                x340Var.r(false);
                vu30Var2 = (vu30) objT21;
            }
            tob1 tob1Var5 = tob1Var2;
            ven0 ven0Var5 = ven0Var;
            xea.c(y7e1Var, qim0VarThen2, false, false, (dk80) null, lee1VarA, kua0VarA, yta0Var, c6e1Var, vu30Var2, idn0Var, n6a1Var, (uwg) null, t01Var, (es41) null, x340Var, i5 & 14, 0, 20508);
            j2iVar2 = j2iVar;
            j2iVar2.invoke(function0, x340Var, Integer.valueOf((i5 >> 15) & 112));
            Boolean boolValueOf = Boolean.valueOf(z);
            Integer numValueOf = Integer.valueOf(((err0) tob1Var).s());
            ven0 ven0Var6 = ven0Var5;
            boolean zG5 = x340Var.g(function1) | (i6 == 32) | x340Var.i(y7e1Var) | x340Var.i(ven0Var6) | x340Var.i(tob1Var5) | x340Var.i(az20Var) | x340Var.i(k6a1Var);
            Object objT22 = x340Var.T();
            if (zG5 || objT22 == m4cVar) {
                af0 af0Var = new af0(z, function1, y7e1Var, az20Var, k6a1Var, ven0Var6, tob1Var5, (lnm) null, (byte) 28);
                ven0Var6 = ven0Var6;
                x340Var.s0(af0Var);
                objT22 = af0Var;
            }
            qxd0.s(boolValueOf, numValueOf, (vu30) objT22, x340Var);
            if (((uex0) ven0Var6.getValue()) == uex0.c && ((Boolean) ven0Var3.getValue()).booleanValue()) {
                x340Var.i0(1621551104);
                boolean zI8 = x340Var.i(ven0Var6);
                Object objT23 = x340Var.T();
                if (zI8 || objT23 == m4cVar) {
                    objT23 = new g8y0(ven0Var6, (byte) 14);
                    x340Var.s0(objT23);
                }
                qxd0.S((Function0) objT23, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(1621706786);
                x340Var.r(false);
            }
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w251(y7e1Var, z, z2, tvh1Var, i, u251Var, j2iVar2, qim0Var, iu30Var, i2);
        }
    }

    public static final void f(String str, String str2, lee1 lee1Var, qim0 qim0Var, long j, int i, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        iu30 iu30Var2;
        int i5;
        qim0 qim0Var3;
        long j2;
        iu30 iu30Var3;
        long j3;
        int i6;
        qim0 qim0Var4;
        long j4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(721793291);
        int i7 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(lee1Var) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = i7 | 3072;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i7 | (x340Var.i(qim0Var2) ? 2048 : 1024);
        }
        int i9 = i4 | (((i3 & 16) == 0 && x340Var.f(j)) ? 16384 : 8192);
        int i10 = i3 & 64;
        if (i10 != 0) {
            i5 = i9 | 1572864;
            iu30Var2 = iu30Var;
        } else {
            iu30Var2 = iu30Var;
            i5 = i9 | (x340Var.i(iu30Var2) ? 1048576 : 524288);
        }
        if (x340Var.Y(i5 & 1, (i5 & 599187) != 599186)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                qim0 qim0Var5 = i8 != 0 ? nim0.a : qim0Var2;
                if ((i3 & 16) != 0) {
                    j3 = u7h.j;
                    i5 &= -57345;
                } else {
                    j3 = j;
                }
                if (i10 != 0) {
                    Object objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = ej41.P0;
                        x340Var.s0(objT);
                    }
                    qim0 qim0Var6 = qim0Var5;
                    i6 = i5;
                    qim0Var4 = qim0Var6;
                    iu30Var2 = (iu30) objT;
                } else {
                    qim0 qim0Var7 = qim0Var5;
                    i6 = i5;
                    qim0Var4 = qim0Var7;
                }
            } else {
                x340Var.b0();
                if ((i3 & 16) != 0) {
                    i5 &= -57345;
                }
                i6 = i5;
                qim0Var4 = qim0Var2;
                j3 = j;
            }
            x340Var.s();
            uwr uwrVar = cbx.a;
            long j5 = cbx.a(x340Var).b.b;
            boolean zF = ((i6 & 14) == 4) | ((i6 & 112) == 32) | ((((57344 & i6) ^ 24576) > 16384 && x340Var.f(j3)) || (i6 & 24576) == 16384) | x340Var.f(j5);
            Object objT2 = x340Var.T();
            if (zF || objT2 == m4cVar) {
                ye5 ye5Var = new ye5();
                long j6 = j3;
                j4 = j6;
                int iO = ye5Var.o(new zma1(j6, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(str);
                    ye5Var.k(iO);
                    int iO2 = ye5Var.o(new zma1(j5, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5Var.g(str2);
                        ye5Var.k(iO2);
                        objT2 = ye5Var.p();
                        x340Var.s0(objT2);
                    } catch (Throwable th) {
                        ye5Var.k(iO2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ye5Var.k(iO);
                    throw th2;
                }
            } else {
                j4 = j3;
            }
            af5 af5Var = (af5) objT2;
            qim0 qim0VarN = anm1.N("search_field_suffix", qim0Var4);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = ej41.Q0;
                x340Var.s0(objT3);
            }
            iu30 iu30Var4 = iu30Var2;
            jch0.b(af5Var, s161.a(qim0VarN, (iu30) objT3), lee1Var, iu30Var4, 2, false, i, 0, (Map) null, (x9h) null, (m0e1) null, x340Var, (i6 & 896) | ((i6 >> 9) & 7168) | 1572864, 1952);
            qim0Var3 = qim0Var4;
            iu30Var3 = iu30Var4;
            j2 = j4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            j2 = j;
            iu30Var3 = iu30Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x251(str, str2, lee1Var, qim0Var3, j2, i, iu30Var3, i2, i3);
        }
    }

    public static final void g(y7e1 y7e1Var, boolean z, boolean z2, int i, u251 u251Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        u251 u251Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1108105476);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(y7e1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            u251Var2 = u251Var;
            i3 |= x340Var.g(u251Var2) ? 16384 : 8192;
        } else {
            u251Var2 = u251Var;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= x340Var.i(iu30Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            m4c m4cVar = fkj0.X;
            wat watVar = (wat) x340Var.k(t4k.h);
            float fY = watVar.y(a);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            p3v p3vVar = new p3v(32.0f);
            float f = b * 2.0f;
            p3v p3vVarY = pap1.y(p3vVar, new p3v(f + fY));
            float f2 = p3vVarY.a;
            boolean zD = x340Var.d(fY);
            Object objT = x340Var.T();
            if (zD || objT == m4cVar) {
                objT = v8r.q(new ebe1(fY / 2.0f, 1));
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT2;
            float fMax = fY * Math.max(((ebe1) ven0Var.getValue()).b, err0Var.s());
            float f3 = pap1.y(p3vVarY, new p3v(f + fMax)).a;
            int iI0 = watVar.i0(f3) - watVar.i0(fMax);
            if (iI0 < 0) {
                iI0 = 0;
            }
            int i4 = iI0 / 2;
            zzq0 zzq0Var = new zzq0(13.0f, watVar.M0(i4), 9.0f, watVar.M0(iI0 - i4));
            boolean zI = x340Var.i(watVar) | x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new kxl(watVar, ven0Var, (byte) 4);
                x340Var.s0(objT3);
            }
            iu30 iu30Var2 = (iu30) objT3;
            boolean zI2 = x340Var.i(err0Var);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new myg0(err0Var, (byte) 22);
                x340Var.s0(objT4);
            }
            tvh1 tvh1Var = new tvh1(f2, f3, ((ebe1) ven0Var.getValue()).a, zzq0Var, iu30Var2, (iu30) objT4);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = yv91.a(new ime0(y7e1Var, (byte) 8));
                x340Var.s0(objT5);
            }
            tob1 tob1Var = (tob1) objT5;
            mta mtaVar2 = cbx.b(x340Var).d;
            zov0 zov0Var = cbx.b(x340Var).g;
            float fM = 16.0f - uyn1.m(zzq0Var, (flb0) x340Var.k(t4k.n));
            cvx cvxVar = cbx.b(x340Var).b;
            float f4 = f2 + 16.0f;
            float f5 = (f4 - 48.0f) / 2.0f;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 16.0f - fM, 0.0f, 11);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            mta mtaVar3 = cbx.b(x340Var).d;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarV = u291.v(nim0Var, 48.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarH = u291.h(qim0VarV, f4);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
            c(iu30Var, x340Var, (i3 >> 18) & 14);
            x340Var.r(true);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
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
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarF3 = dug.f(uyn1.B(qim0VarF2, 0.0f, 8.0f, fM, 8.0f, 1), cbx.a(x340Var).a.b.a(), er31.b(f2 / 2.0f));
            int i5 = i3 << 3;
            e(y7e1Var, z, z2, tvh1Var, i, u251Var2, apo.r(1579539615, new ye6(f5, tob1Var, (byte) 9), x340Var), qim0VarF3, iu30Var, x340Var, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (57344 & i5) | (i5 & 458752) | ((i3 << 6) & 234881024));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v251(y7e1Var, z, z2, i, u251Var, qim0Var, iu30Var, i2, (byte) 1);
        }
    }

    public static final j4e1 h(b0k b0kVar) {
        long j = u7h.j;
        return i5x0.h(j, j, 0L, j, j, j, b0kVar, 2147469263);
    }
}
