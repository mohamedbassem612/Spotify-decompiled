package p;

import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.browsita.v1.resolved.EmbeddedAdMetadata;
import com.spotify.browsita.v1.resolved.EmbeddedAdTrackingUrls;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fho1 {
    public static final xh91 a = new xh91((byte) 1);
    public static final lg91 b = new lg91();
    public static b180 c;

    public static final void a(zxd zxdVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-392874039);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(zxdVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            List list = zxdVar.a;
            boolean zG = b0kVar3.g(list);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new a1e(list, (byte) 0);
                b0kVar3.s0(objT);
            }
            kes kesVarB = lkr0.b(0, (Function0) objT, b0kVar3, 0, 3);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(-1, b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objT2;
            boolean zI = b0kVar3.i(kesVarB) | ((i3 & 112) == 32) | b0kVar3.i(hdn0Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                sxa sxaVar = new sxa(kesVarB, iu30Var, hdn0Var, (lnm) null, (byte) 14);
                iu30Var2 = iu30Var;
                b0kVar3.s0(sxaVar);
                objT3 = sxaVar;
            } else {
                iu30Var2 = iu30Var;
            }
            qxd0.t(kesVarB, b0kVar3, (vu30) objT3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean zG2 = b0kVar3.g(list);
            Object objT4 = b0kVar3.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new s6(list, (byte) 15);
                b0kVar3.s0(objT4);
            }
            b0kVar2 = b0kVar3;
            w0h1.c(kesVarB, s161.b(qim0VarF, false, (iu30) objT4), (vzq0) null, (gdr0) null, 0, 0.0f, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-1748636696, new gk0(list, kesVarB, iu30Var2, (byte) 5), b0kVar3), b0kVar2, 0, 16380);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            iu30Var2 = iu30Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b((byte) 7, i, zxdVar, iu30Var2, qim0Var2);
        }
    }

    public static final void b(zyq0 zyq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-189778712);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(zyq0Var) : x340Var.i(zyq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            w2g0.c(u291.d(qim0Var2, 1.0f), (tl3) null, apo.r(-966470594, new ub3(zyq0Var, (byte) 12), x340Var), x340Var, 3072, 6);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(zyq0Var, qim0Var, i, (byte) 11);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(551690548);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            inx inxVar = inx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131951779));
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("ExpandAction", u291.r(uyn1.x(qim0Var2, 12.0f), 24.0f));
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new in00(function0, (byte) 2);
                x340Var.s0(objT);
            }
            w0h1.a(inxVar, jslVar, bin.x(qim0VarN, false, null, null, null, (Function0) objT, 15), j, 0L, false, x340Var, inx.d, 48);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 26);
        }
    }

    public static final void d(adj1 adj1Var, iu30 iu30Var, b0k b0kVar, int i) {
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-878348107);
        int i2 = (x340Var.g(adj1Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (((Boolean) x340Var.k(ibj1.e)).booleanValue()) {
            x340Var.i0(2016032315);
            z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new g850(iu30Var, (byte) 28);
                x340Var.s0(objT);
            }
            qp0.a(adj1Var.g((Function0) objT, false, false), (qim0) null, x340Var, 0, 2);
            x340Var.r(false);
        } else {
            x340Var.i0(2016040225);
            xcm xcmVar = new xcm(adj1Var.a().a.a(), adj1Var.a().a.k(), adj1Var.a().c.a, adj1Var.a().b, adj1Var.a().c.c, f46.Q0(new vcm[]{vcm.a}));
            z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new z720(iu30Var, (byte) 19);
                x340Var.s0(objT2);
            }
            ezn1.b(xcmVar, (iu30) objT2, x340Var, 0);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tth(adj1Var, iu30Var, i);
        }
    }

    public static final void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(513966434);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131958373);
            String strO1 = cwl1.o0(x340Var, 2131954937);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ebg0(iu30Var, (byte) 25);
                x340Var.s0(objT);
            }
            pdp1.e(strO0, strO1, null, true, (Function0) objT, x340Var, 3072, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 23, i, iu30Var, false);
        }
    }

    public static final void f(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(757993930);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            kiv kivVar = t4k.h;
            mod.b(kivVar.a(new xat(((wat) x340Var.k(kivVar)).h(), 1.0f)), j2iVar, x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pu2(j2iVar, i, (byte) 4);
        }
    }

    public static final void g(String str, String str2, long j, bhv bhvVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1255459129);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.g(bhvVar) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            long jS = ((wat) x340Var.k(t4k.h)).s(bhvVar.e(14.0f));
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), bhvVar.e(457.41f));
            gfh0 gfh0VarC = t1c.c(een.t, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            qim0 qim0VarJ = u291.j(bhvVar.e(40.0f), 0.0f, 2, uyn1.B(nim0Var, bhvVar.c(21.0f), 0.0f, 0.0f, 0.0f, 14));
            jw31 jw31VarA = ew31.a(new d36(bhvVar.c(16.0f), true, new um5(false)), een.N0, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarJ);
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
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            k(i3 | (i4 & 112), j, jS, str, x340Var, u291.v(nim0Var, bhvVar.c(230.0f)));
            j(i4 & 126, j, jS, str2, x340Var, u291.v(nim0Var, bhvVar.c(59.0f)));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6((Object) str, (Object) str2, j, (Object) bhvVar, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static final void h(yj41 yj41Var, qim0 qim0Var, j6m j6mVar, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        j6m j6mVar2;
        boolean z;
        j6m j6mVar3;
        h311 h311VarV;
        j6m j6mVar4;
        boolean zG;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1996851199);
        int i3 = (x340Var.i(yj41Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            qim0Var2 = qim0Var;
            i3 |= x340Var.g(qim0Var2) ? 32 : 16;
        } else {
            qim0Var2 = qim0Var;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                j6mVar2 = j6mVar;
                i3 |= x340Var.g(j6mVar2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    j6mVar4 = mif1.Q0;
                } else {
                    j6mVar4 = j6mVar2;
                }
                zG = x340Var.g(yj41Var.a);
                objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new yk4(yj41Var.a);
                    x340Var.s0(objT);
                }
                eso1.f((yk4) objT, yj41Var.a(), qim0Var2, (p3v) null, (zvx) null, (ecx) null, j6mVar4, (tl3) null, (ColorFilter) null, x340Var, ((i3 << 3) & 896) | 224256 | ((i3 << 12) & 3670016), 384);
                j6mVar3 = j6mVar4;
            } else {
                x340Var.b0();
                j6mVar3 = j6mVar2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dg6(yj41Var, qim0Var, j6mVar3, i, i2, (byte) 0);
            }
        }
        i3 |= 384;
        j6mVar2 = j6mVar;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                j6mVar4 = mif1.Q0;
            } else {
                j6mVar4 = j6mVar2;
            }
            zG = x340Var.g(yj41Var.a);
            objT = x340Var.T();
            if (zG) {
                objT = new yk4(yj41Var.a);
                x340Var.s0(objT);
            } else {
                objT = new yk4(yj41Var.a);
                x340Var.s0(objT);
            }
            eso1.f((yk4) objT, yj41Var.a(), qim0Var2, (p3v) null, (zvx) null, (ecx) null, j6mVar4, (tl3) null, (ColorFilter) null, x340Var, ((i3 << 3) & 896) | 224256 | ((i3 << 12) & 3670016), 384);
            j6mVar3 = j6mVar4;
        } else {
            x340Var.b0();
            j6mVar3 = j6mVar2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6(yj41Var, qim0Var, j6mVar3, i, i2, (byte) 0);
        }
    }

    public static final void i(yj41 yj41Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1472674304);
        int i2 = (x340Var.i(yj41Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var2 = qim0Var;
            w2g0.c(qim0Var2, een.f, apo.r(-1718892586, new ub3(yj41Var, (byte) 13), x340Var), x340Var, ((i2 >> 3) & 14) | 3120, 4);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eg6(yj41Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void j(int i, long j, long j2, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(79070603);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, qim0Var, lee1.a(cbx.d(b0kVar3).e, 0L, j2, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), j, new a0e1(6), null, 2, false, new cjc0(1), 0, null, b0kVar2, (i2 & 14) | 1572864 | ((i2 >> 6) & 112) | ((i2 << 6) & 7168), 0, 1696);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fg6(str, j, j2, qim0Var, i);
        }
    }

    public static final void k(int i, long j, long j2, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1329549036);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        int i3 = i2 | (x340Var.f(j2) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            gxo1.c(str, qim0Var, lee1.a(cbx.d(x340Var).e, 0L, j2, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), j, new a0e1(5), 2, false, new cjc0(3), null, 150.0f, (FontWeight) ((bjx) ajx.a.c).e, null, x340Var, (i3 & 14) | 196608 | ((i3 >> 6) & 112) | ((i3 << 6) & 7168), 0, 2368);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gg6(str, j, j2, qim0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r12 == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(p.iyc0 r6, p.xrc0 r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, p.onm r12) {
        /*
            boolean r0 = r12 instanceof p.r3c1
            if (r0 == 0) goto L13
            r0 = r12
            p.r3c1 r0 = (p.r3c1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.r3c1 r0 = new p.r3c1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r12)
            goto L8a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            boolean r11 = r0.e
            java.lang.String r10 = r0.d
            java.lang.String r9 = r0.c
            java.lang.String r8 = r0.b
            p.iyc0 r6 = r0.a
            p.hm5.M(r12)
        L3e:
            r7 = r8
            r8 = r9
            goto L57
        L41:
            p.hm5.M(r12)
            r0.a = r6
            r0.b = r8
            r0.c = r9
            r0.d = r10
            r0.e = r11
            r0.g = r3
            java.lang.Object r12 = p.em81.a(r7, r8, r9, r11, r0)
            if (r12 != r5) goto L3e
            goto L89
        L57:
            p.py21 r12 = (p.py21) r12
            boolean r9 = r12 instanceof p.ly21
            if (r9 == 0) goto L5e
            return r12
        L5e:
            p.wl61 r9 = com.spotify.playlistmixing.proto.SetTransition.n()
            r9.r(r10)
            r9.q()
            com.google.protobuf.h r9 = r9.build()
            com.spotify.playlistmixing.proto.SetTransition r9 = (com.spotify.playlistmixing.proto.SetTransition) r9
            p.phc r10 = r9.toByteString()
            r0.a = r4
            r0.b = r4
            r0.c = r4
            r0.d = r4
            r0.e = r11
            r0.g = r2
            p.xyc0 r6 = (p.xyc0) r6
            java.lang.String r9 = "set-transition"
            r11 = r0
            java.lang.Object r12 = r6.t(r7, r8, r9, r10, r11)
            if (r12 != r5) goto L8a
        L89:
            return r5
        L8a:
            p.py21 r12 = (p.py21) r12
            p.axb1 r6 = p.axb1.V0
            p.py21 r6 = r12.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fho1.m(p.iyc0, p.xrc0, java.lang.String, java.lang.String, java.lang.String, boolean, p.onm):java.lang.Object");
    }

    public static final float o(float f, float f2) {
        return pap1.A(new p3v(f2 * 0.6f * 0.67085785f), zjy.p(0.0f, new p3v(f - 48.0f)), new p3v(356.0f)).a;
    }

    public static final String p(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + ":" + uri.getSchemeSpecificPart();
        } catch (URISyntaxException unused) {
            return str;
        }
    }

    public static rkb0 q() {
        return rkb0.a;
    }

    public static final l4r s(iu30 iu30Var, iu30 iu30Var2, ppa0 ppa0Var) {
        if (ppa0Var != null) {
            return new l4r(new xv00(rc11.a.b(hzy.class)), 2, qfo0.g, new k4r(new jjv(iu30Var2, iu30Var, (byte) 5), ppa0Var), qfo0.h);
        }
        return new l4r(new xv00(rc11.a.b(hzy.class)), 2, qfo0.i, new j4r(new jjv(iu30Var2, iu30Var, (byte) 6)), qfo0.t);
    }

    public static final Long u(iix0 iix0Var, Long l) {
        if (iix0Var != null && iix0Var.f() > 0 && (!(iix0Var instanceof hix0) || !((hix0) iix0Var).a)) {
            gix0 gix0Var = iix0Var instanceof gix0 ? (gix0) iix0Var : null;
            long jLongValue = gix0Var != null ? gix0Var.c : 0L;
            if (l != null) {
                jLongValue = l.longValue();
            }
            Long lValueOf = Long.valueOf(jLongValue);
            if (jLongValue > 0) {
                return lValueOf;
            }
        }
        return null;
    }

    public static final n1x v(EmbeddedAdMetadata embeddedAdMetadata) {
        String id = embeddedAdMetadata.getId();
        String strN = embeddedAdMetadata.n();
        String strQ = embeddedAdMetadata.q();
        String strR = embeddedAdMetadata.r();
        String strP = embeddedAdMetadata.p();
        String strS = embeddedAdMetadata.s();
        Map mapT = embeddedAdMetadata.t();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapT.size()));
        for (Map.Entry entry : mapT.entrySet()) {
            linkedHashMap.put(entry.getKey(), new g2x(((EmbeddedAdTrackingUrls) entry.getValue()).o()));
        }
        return new n1x(id, strN, strQ, strR, strP, strS, linkedHashMap);
    }

    public static final qq51 w(qma qmaVar) {
        ArrayList arrayList;
        List listSingletonList;
        hwg hwgVarA = g5b1.a(qmaVar, false);
        boolean z = qmaVar.o1;
        dij1 dij1Var = dij1.b;
        dij1 dij1Var2 = dij1.c;
        dij1 dij1Var3 = dij1.a;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            int i = hwgVarA.k;
            int i2 = hwgVarA.m;
            int i3 = hwgVarA.j;
            if (i >= 0) {
                arrayList2.add(new mmr0(dij1Var3, Integer.valueOf(i)));
            }
            if (i3 >= 0 && hwgVarA.b()) {
                arrayList2.add(new mmr0(dij1Var2, Integer.valueOf(i3)));
            }
            if (i2 >= 0 && hwgVarA.d()) {
                arrayList2.add(new mmr0(dij1Var, Integer.valueOf(i2)));
            }
            List listA1 = o7h.a1(arrayList2, new be21((byte) 7));
            arrayList = new ArrayList(q7h.U(listA1, 10));
            Iterator it = listA1.iterator();
            while (it.hasNext()) {
                arrayList.add((dij1) ((mmr0) it.next()).a);
            }
        } else {
            ArrayList arrayListO = p7h.O(new dij1[]{dij1Var3});
            if (!(hwgVarA.a != k89.a ? true ^ hwgVarA.b() : true)) {
                arrayListO.add(dij1Var2);
            }
            if (!hwgVarA.e(false)) {
                arrayListO.add(dij1Var);
            }
            arrayList = arrayListO;
        }
        int i4 = Build.VERSION.SDK_INT;
        lzx lzxVar = lzx.b;
        if (i4 < 25) {
            listSingletonList = Collections.singletonList(lzxVar);
        } else {
            boolean z2 = qmaVar.U0;
            lzx lzxVar2 = lzx.a;
            listSingletonList = z2 ? Collections.singletonList(lzxVar2) : p7h.M(new lzx[]{lzxVar2, lzxVar});
        }
        return new qq51(arrayList, listSingletonList, z);
    }

    public static final eih1 x() {
        return new eih1();
    }

    public static final boolean y(String str, String str2) {
        if (u890.j(str, str2)) {
            return true;
        }
        if (str != null) {
            return p(str).equals(p(str2));
        }
        return false;
    }

    public static int z(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public void l(un21 un21Var, Object obj) {
        jwm0 jwm0Var = (jwm0) obj;
        if (jwm0Var != null) {
            un21Var.i.f(jwm0Var);
        }
    }

    public mpr0 n() {
        return new mpr0(this, (byte) 1);
    }

    public mpr0 r() {
        return new mpr0(this, (byte) 0);
    }
}
