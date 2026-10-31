package p;

import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class omo1 {
    public static final x60 a = new x60("android.widget.extra.CHECKED");
    public static b180 b;

    public static final void a(tt6 tt6Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1529214236);
        int i2 = i | (x340Var.g(tt6Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = tt6Var.a;
            String strO0 = cwl1.o0(x340Var, 2131952465);
            List<ot6> list = tt6Var.b;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (ot6 ot6Var : list) {
                arrayList.add(new au6(ot6Var.c, ot6Var.a, ot6Var.b));
            }
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new ge3(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z3 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new sm(iu30Var, (byte) 10);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            mmo1.g(z, strO0, arrayList, function0, (vu30) objT2, qim0Var3, x340Var, 196608, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(tt6Var, iu30Var, qim0Var2, i, (byte) 29);
        }
    }

    public static final void b(khe kheVar, boolean z, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-944968365);
        int i2 = i | (x340Var.g(kheVar) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(gbxVar) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                x340Var.i0(-1876493473);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.c;
            } else {
                x340Var.i0(-1876492233);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.a;
            }
            x340Var.r(false);
            long j2 = j;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mta mtaVar = cbx.b(x340Var).d;
            cwl1.b(u291.h(qim0VarF, 56.0f), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-265734518, new pje(z, kheVar, j2, (byte) 0), x340Var), x340Var, (i2 << 21) & 1879048192, 48, 1534);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(kheVar, z, gbxVar, qim0Var2, i, (byte) 12);
        }
    }

    public static final qnw0 c(String str, mnw0 mnw0Var) {
        if (ihc1.y0(str)) {
            hhg1.n("Blank serial names are prohibited");
            return null;
        }
        ukg0 it = vnw0.a.values().iterator();
        while (((g0y) it).hasNext()) {
            nma0 nma0Var = (nma0) it.next();
            if (str.equals(nma0Var.getDescriptor().h())) {
                StringBuilder sbT = l1d.t("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbT.append(rc11.a.b(nma0Var.getClass()).r());
                sbT.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                hhg1.n(jhc1.J(sbT.toString()));
                return null;
            }
        }
        return new qnw0(str, mnw0Var);
    }

    public static final void d(phz0 phz0Var, qhz0 qhz0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        boolean z = qhz0Var.f;
        int i3 = qhz0Var.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(864396899);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(phz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(qhz0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(qim0Var) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zE = x340Var2.e(i3);
            Object objT = x340Var2.T();
            if (zE || objT == m4cVar) {
                ilv.a.getClass();
                objT = new hsi1("quiz-item-initial-" + qhz0Var + ".position", Float.valueOf(1.0f), Float.valueOf(0.0f), new pxg1(666, (i3 + 1) * 83, flv.b), rno1.a);
                x340Var2.s0(objT);
            }
            ven0 ven0VarR = zod.R((hsi1) objT, qhz0Var.h, (Function0) null, x340Var2, 8, 4);
            boolean z2 = phz0Var.g;
            boolean z3 = z2 && qhz0Var.g;
            boolean z4 = !z2 && qhz0Var.c;
            float f = (!z || ((Number) ven0VarR.getValue()).floatValue() < 1.0f) ? 1.0f : 0.0f;
            kiv kivVar = dhe0.a;
            float f2 = ((che0) x340Var2.k(kivVar)).a.c;
            x340Var2.i0(1756764487);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            nim0 nim0Var = nim0.a;
            if (z) {
                boolean zG = x340Var2.g(ven0VarR);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new lws0(ven0VarR, (byte) 6);
                    x340Var2.s0(objT2);
                }
                qim0VarF = qim0VarF.then(eqr0.B(nim0Var, (iu30) objT2));
            }
            x340Var2.r(false);
            boolean zD = x340Var2.d(f);
            Object objT3 = x340Var2.T();
            if (zD || objT3 == m4cVar) {
                objT3 = new vbk0((byte) 12, f);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarY = uyn1.y(v8r.j(dug.f(i541.C(qim0VarF, (iu30) objT3), z3 ? phz0Var.h.a : phz0Var.j, d4o1.a), z4 ? phz0Var.i.c : phz0Var.k), 10.0f, f2);
            int i4 = i2 & 14;
            boolean z5 = i4 == 4;
            Object objT4 = x340Var2.T();
            if (z5 || objT4 == m4cVar) {
                objT4 = new fbz0(phz0Var, (byte) 8);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarB = s161.b(qim0VarY, true, (iu30) objT4);
            boolean z6 = qhz0Var.d;
            pm31 pm31Var = z6 ? new pm31(0) : null;
            String str = phz0Var.m;
            boolean z7 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT5 = x340Var2.T();
            if (z7 || objT5 == m4cVar) {
                objT5 = new g1x0(iu30Var, qhz0Var, (byte) 29);
                x340Var2.s0(objT5);
            }
            qim0 qim0VarX = bin.x(qim0VarB, z6, str, pm31Var, null, (Function0) objT5, 8);
            jw31 jw31VarA = ew31.a(new d36(((che0) x340Var2.k(kivVar)).a.a, true, new um5(false)), een.N0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(-2083695250);
            yj41 yj41Var = phz0Var.b;
            yk4 yk4Var = new yk4(yj41Var.a);
            ksl kslVarA = yj41Var.a();
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            eso1.f(yk4Var, kslVarA, v8r.j(nim0Var, yj41Var.c), new p3v(qhz0Var.a - (f2 * 2.0f)), (zvx) null, uwr.a(), as80Var, (tl3) null, (ColorFilter) null, x340Var2, 1597440, 384);
            x340Var = x340Var2;
            x340Var.r(false);
            h(phz0Var, phz0Var.h, phz0Var.i, z3, qhz0Var.e, qhz0Var.i, qhz0Var.f, x340Var, i4);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(phz0Var, qhz0Var, iu30Var, qim0Var, i, (byte) 15);
        }
    }

    public static final void e(esb0 esb0Var, Object obj, int i, Object obj2, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1439843069);
        int i3 = (x340Var.g(esb0Var) ? 4 : 2) | i2 | (x340Var.g(obj) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.g(obj2) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ((kd41) obj).c(obj2, apo.r(980966366, new cf5(i, obj2, esb0Var), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(esb0Var, obj, i, obj2, i2);
        }
    }

    public static final vgc1 f(String str, nfa0 nfa0Var) {
        return new vgc1(str, nfa0Var.a);
    }

    public static final void g(phz0 phz0Var, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        Object objInvoke;
        qim0 qim0VarB;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-399147209);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(phz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ilv.a.getClass();
            ven0 ven0VarR = zod.R(new hsi1("subtitle-" + z, Float.valueOf(1.0f), Float.valueOf(0.0f), irn1.o0(666, 0, flv.b, 2), rno1.a), false, (Function0) null, x340Var, 8, 6);
            if (z) {
                x340Var.i0(-1328359193);
                objInvoke = phz0Var.f.invoke(x340Var, 0);
            } else {
                x340Var.i0(-1328358303);
                objInvoke = phz0Var.d.invoke(x340Var, 0);
            }
            vnr0 vnr0Var = (vnr0) objInvoke;
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            vnr0 vnr0VarQ = q(vnr0Var, cbx.d(x340Var).j, cbx.d(x340Var).g, x340Var);
            x340Var.i0(-1328353057);
            qim0 qim0Var3 = nim0.a;
            if (z2) {
                boolean zG = x340Var.g(ven0VarR) | ((i3 & 112) == 32);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new kjz0(z, ven0VarR, (byte) 0);
                    x340Var.s0(objT);
                }
                qim0VarB = eqr0.B(qim0Var3, (iu30) objT);
            } else {
                qim0VarB = qim0Var3;
            }
            x340Var.r(false);
            qgo1.f(vnr0VarQ, qim0VarB, null, 0, false, null, x340Var, 8, 60);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cla((Object) phz0Var, z, z2, (Object) qim0Var2, i, (byte) 8);
        }
    }

    public static final void h(phz0 phz0Var, ohz0 ohz0Var, ohz0 ohz0Var2, boolean z, float f, boolean z2, boolean z3, b0k b0kVar, int i) {
        int i2;
        boolean z4;
        vnr0 vnr0Var;
        boolean z5 = phz0Var.g;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1423795681);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(phz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(ohz0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(ohz0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.h(z3) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 599187) != 599186)) {
            jw31 jw31VarA = ew31.a(h36.a, een.O0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
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
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
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
            if (z) {
                x340Var.i0(1494442418);
                vnr0Var = (vnr0) phz0Var.e.invoke(x340Var, 0);
                z4 = false;
            } else {
                z4 = false;
                x340Var.i0(1494443212);
                vnr0Var = (vnr0) phz0Var.c.invoke(x340Var, 0);
            }
            x340Var.r(z4);
            qgo1.f(q(vnr0Var, cbx.d(x340Var).k, cbx.d(x340Var).h, x340Var), null, null, 0, false, null, x340Var, 8, 62);
            int i4 = i3 >> 12;
            g(phz0Var, z2, z3, null, x340Var, (i3 & 14) | (i4 & 112) | (i4 & 896));
            x340Var.r(true);
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            b180 b180Var = z5 ? ((hux) ilx.c).a.b : ((hux) fux.c).a.b;
            float f2 = ((che0) x340Var.k(dhe0.a)).b.a;
            f2b f2bVar = new f2b(z5 ? ohz0Var.b : ohz0Var2.b, 5);
            if ((i3 & 57344) == 16384) {
                z4 = true;
            }
            Object objT = x340Var.T();
            if (z4 || objT == fkj0.X) {
                objT = new vbk0((byte) 13, f);
                x340Var.s0(objT);
            }
            eso1.g(b180Var, isl.a, v8r.j(i541.C(nim0Var, (iu30) objT), phz0Var.b.c), new p3v(f2), (zvx) null, (ecx) null, (j6m) null, (tl3) null, f2bVar, x340Var, 48, 240);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kj6(phz0Var, ohz0Var, ohz0Var2, z, f, z2, z3, i);
        }
    }

    public static final j661 i(String str, h661[] h661VarArr, iu30 iu30Var) {
        if (ihc1.y0(str)) {
            hhg1.n("Blank serial names are prohibited");
            return null;
        }
        neg negVar = new neg(str);
        iu30Var.invoke(negVar);
        return new j661(str, uic1.h, negVar.c.size(), f46.Q0(h661VarArr), negVar);
    }

    public static j661 j(String str, h661[] h661VarArr) {
        if (ihc1.y0(str)) {
            hhg1.n("Blank serial names are prohibited");
            return null;
        }
        neg negVar = new neg(str);
        return new j661(str, uic1.h, negVar.c.size(), f46.Q0(h661VarArr), negVar);
    }

    public static final j661 k(String str, yoi1 yoi1Var, h661[] h661VarArr, iu30 iu30Var) {
        if (ihc1.y0(str)) {
            hhg1.n("Blank serial names are prohibited");
            return null;
        }
        if (yoi1Var.equals(uic1.h)) {
            hhg1.n("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        neg negVar = new neg(str);
        iu30Var.invoke(negVar);
        return new j661(str, yoi1Var, negVar.c.size(), f46.Q0(h661VarArr), negVar);
    }

    public static j661 l(String str, yoi1 yoi1Var, h661[] h661VarArr) {
        if (ihc1.y0(str)) {
            hhg1.n("Blank serial names are prohibited");
            return null;
        }
        if (yoi1Var.equals(uic1.h)) {
            hhg1.n("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        neg negVar = new neg(str);
        return new j661(str, yoi1Var, negVar.c.size(), f46.Q0(h661VarArr), negVar);
    }

    public static byte[] m(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:28:0x003f A[RETURN] */
    public static final int n(String str, String str2, ArrayList arrayList) {
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                str = str2;
            } else if (str.length() <= 0) {
                str = null;
            }
        } else if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!u890.j(((rb60) it.next()).getId(), str)) {
                    i++;
                } else if (i < 0) {
                    return i;
                }
            }
            i = -1;
            if (i < 0) {
                return i;
            }
        }
        return 0;
    }

    public static final void p(Throwable th, o8n o8nVar) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).a;
        }
        try {
            r8n r8nVarA = o8nVar.A(olj0.T0);
            if (r8nVarA != null) {
                r8nVarA.p(th, o8nVar);
            } else {
                mmo1.F(th, o8nVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                j2h1.h(runtimeException, th);
                th = runtimeException;
            }
            mmo1.F(th, o8nVar);
        }
    }

    public static final vnr0 q(vnr0 vnr0Var, lee1 lee1Var, lee1 lee1Var2, b0k b0kVar) {
        lee1 lee1Var3;
        lee1 lee1Var4 = vnr0Var.b;
        int iC = l1d.C(dhe0.a(b0kVar));
        if (iC == 0) {
            lee1Var3 = lee1Var;
        } else if (iC == 1) {
            lee1Var3 = lee1Var4;
        } else if (iC != 2) {
            if (iC != 3) {
                eg.o();
                return null;
            }
            lee1Var3 = lee1Var;
        } else {
            lee1Var3 = lee1Var2;
        }
        zma1 zma1Var = lee1Var4.a;
        FontFamily fontFamily = zma1Var.f;
        return vnr0.a(vnr0Var, null, lee1.a(lee1Var3, 0L, zma1Var.b, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777181), null, 0L, 29);
    }

    public static final int r(e2l e2lVar) {
        g0u g0uVar = e2lVar.r;
        boolean z = g0uVar == g0u.f || g0uVar == g0u.g;
        if (!z) {
            for (t880 t880Var : e2lVar.s) {
                String str = t880Var.a;
                boolean z2 = t880Var.c;
                if (str.equals("CAST") || str.equals("CAST_JS")) {
                    z = z2;
                    break;
                }
            }
        }
        return z ? 2 : 1;
    }

    public static byte[] s(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                eg.m(f4i1.c(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] t(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long u(InputStream inputStream, int i) throws IOException {
        byte[] bArrS = s(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrS[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static final dwh0 v(ewh0 ewh0Var) {
        ArrayList<String> arrayList = null;
        for (String str : ewh0Var.a) {
            if (str == null) {
                hhg1.n("category must not be null");
                return null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            ArrayList<String> arrayList2 = arrayList;
            if (!arrayList.contains(str)) {
                arrayList2.add(str);
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return dwh0.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", arrayList);
        return new dwh0(bundle, arrayList);
    }

    public static void w(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void x(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        w(byteArrayOutputStream, i, 2);
    }

    public static int y(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int z(Object obj) {
        return y(obj == null ? 0 : obj.hashCode());
    }

    public abstract cvy0 o();
}
