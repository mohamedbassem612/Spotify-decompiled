package p;

import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.text.style.StyleSpan;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class vvd1 {
    public static final List a = p7h.M(new icg[]{new icg(48.0f, 0.0f), new icg(52.0f, 4.0f), new icg(48.0f, 0.0f), new icg(50.0f, 8.0f)});
    public static final List b = p7h.M(new Float[]{Float.valueOf(-16.0f), Float.valueOf(-2.0f), Float.valueOf(-8.0f), Float.valueOf(-4.0f)});
    public static final se11 c = new se11("\\n\\s*\\n");

    public static final void a(qvd1 qvd1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(238987394);
        int i2 = (x340Var.e(qvd1Var.ordinal()) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            float f = f(qvd1Var, 4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(uyn1.z(0.0f, 8.0f, 1, nim0.a), f));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gsc1(qvd1Var, i, (byte) 6);
        }
    }

    public static final void b(mvd1 mvd1Var, qim0 qim0Var, b0k b0kVar, int i) {
        lee1 lee1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-396667489);
        int i2 = (i & 6) == 0 ? (x340Var.g(mvd1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            k1p1 k1p1Var = mvd1Var.c;
            String str = mvd1Var.b;
            if (k1p1Var instanceof pvd1) {
                x340Var.i0(308306247);
                pvd1 pvd1Var = (pvd1) k1p1Var;
                c380 c380Var = pvd1Var.c;
                boolean zIsEmpty = c380Var.isEmpty();
                nim0 nim0Var = nim0.a;
                if (zIsEmpty) {
                    x340Var.i0(308418002);
                    x0d.s(nim0Var, m37.b(pvd1Var.d).b, x340Var, false);
                } else {
                    x340Var.i0(308342703);
                    m37.a(c380Var, null, x340Var, 0);
                    x340Var.r(false);
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(nim0Var, 16.0f, x340Var, false);
            } else if (k1p1Var instanceof ovd1) {
                x340Var.i0(308924139);
                x340Var.r(false);
            } else {
                if (!k1p1Var.equals(nvd1.c)) {
                    throw p3d1.k(x340Var, 287037102, false);
                }
                x340Var.i0(308969771);
                x340Var.r(false);
            }
            if (mvd1Var.d == 2) {
                x340Var.i0(309068351);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(x340Var).e;
                x340Var.r(false);
            } else {
                x340Var.i0(309119935);
                uwr uwrVar3 = cbx.a;
                lee1Var = cbx.d(x340Var).g;
                x340Var.r(false);
            }
            long j = cbx.a(x340Var).b.a;
            boolean zG = x340Var.g(str) | x340Var.g(lee1Var) | x340Var.f(j);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                List listH = c.h(str);
                ArrayList arrayList = new ArrayList(q7h.U(listH, 10));
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    arrayList.add(ihc1.e1((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(g((String) it2.next(), lee1Var, j));
                }
                x340Var.s0(arrayList3);
                objT = arrayList3;
            }
            List list = (List) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = pod1.Y0;
                x340Var.s0(objT2);
            }
            hm5.a(list, (qim0) null, (iu30) objT2, (tl3) null, "summary-body", (iu30) null, apo.r(-599880116, new zod1(lee1Var, (byte) 1), x340Var), x340Var, 1597824, 42);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tvd1(mvd1Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void c(mvd1 mvd1Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar;
        String str;
        String str2 = mvd1Var.a;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1307922543);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(mvd1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, nim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            k1p1 k1p1Var = mvd1Var.c;
            String str3 = mvd1Var.b;
            if (k1p1Var instanceof ovd1) {
                x340Var.i0(396165218);
                ovd1 ovd1Var = (ovd1) k1p1Var;
                qvd1 qvd1Var = ovd1Var.d;
                List list = ovd1Var.c;
                if (list.isEmpty()) {
                    x340Var.i0(396322636);
                    a(qvd1Var, x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(396212989);
                    d(mqo1.F(list), qvd1Var, null, x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(396385287);
                x340Var.r(false);
            }
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            if (str2.length() == 0) {
                x340Var.i0(396721575);
                x340Var.r(false);
                m4cVar = m4cVar2;
                str = str3;
            } else {
                x340Var.i0(396502467);
                m4cVar = m4cVar2;
                str = str3;
                uwo1.e(str2, (qim0) null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                cvx cvxVar3 = cbx.b(x340Var).b;
                x0d.s(nim0Var, 4.0f, x340Var, false);
            }
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = cbx.a(x340Var).b.a;
            String str4 = str;
            boolean zG = x340Var.g(str4);
            Object objT = x340Var.T();
            m4c m4cVar3 = m4cVar;
            if (zG || objT == m4cVar3) {
                objT = g(str4, lee1Var, j);
                x340Var.s0(objT);
            }
            af5 af5Var = (af5) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar3) {
                objT2 = pod1.Z0;
                x340Var.s0(objT2);
            }
            hm5.a(af5Var, (qim0) null, (iu30) objT2, (tl3) null, "summary-body", (iu30) null, apo.r(365998391, new zod1(lee1Var, (byte) 2), x340Var), x340Var, 1597824, 42);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(mvd1Var, i);
        }
    }

    public static final void d(c380 c380Var, qvd1 qvd1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        int i2;
        boolean z;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-786515096);
        int i3 = 2;
        int i4 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.e(qvd1Var.ordinal()) ? 32 : 16) | 384;
        int i5 = 1;
        boolean z2 = false;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            qvd1 qvd1Var2 = qvd1Var;
            float f = f(qvd1Var2, c380Var.size());
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float f2 = 0.0f;
            float f3 = 8.0f;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(u291.h(uyn1.z(0.0f, 8.0f, 1, qim0Var4), f), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            x340Var.i0(-760134275);
            int i6 = 0;
            for (Iterator it = o7h.d1(c380Var, 4).iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) next;
                int i8 = uvd1.a[qvd1Var2.ordinal()];
                if (i8 != -1) {
                    isl islVar = isl.a;
                    if (i8 == i5) {
                        i2 = i3;
                        float f4 = f2;
                        z = z2;
                        qim0Var3 = qim0Var4;
                        x340Var.i0(1775262841);
                        icg icgVar = (icg) a.get(i6);
                        Uri uri = Uri.parse(str);
                        float f5 = icgVar.b;
                        float f6 = icgVar.a;
                        eso1.e(uri, islVar, i1p1.q(u291.r(lrn1.x(eqr0.C(qim0Var3, f4, f5), i6), f6), er31.a), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
                        x340Var.r(z);
                        f2 = (f6 - 8.0f) + f4;
                    } else {
                        if (i8 != i3) {
                            throw p3d1.k(x340Var, 1996928101, z2);
                        }
                        x340Var.i0(1775770156);
                        i2 = i3;
                        qim0Var3 = qim0Var4;
                        z = z2;
                        eso1.e(Uri.parse(str), islVar, i1p1.q(u291.r(k1u.u(lrn1.x(eqr0.C(qim0Var4, f2 + 3.0f, 3.0f), i6), ((Number) b.get(i6)).floatValue()), 48.0f), er31.b(f3)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
                        f2 += 44.0f;
                        x340Var.r(z);
                    }
                } else {
                    i2 = i3;
                    z = z2;
                    qim0Var3 = qim0Var4;
                    x340Var.i0(1776396356);
                    x340Var.r(z);
                }
                qvd1Var2 = qvd1Var;
                z2 = z;
                qim0Var4 = qim0Var3;
                i6 = i7;
                f3 = f3;
                i3 = i2;
                i5 = 1;
            }
            x340Var.r(z2);
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1((Object) c380Var, (Object) qvd1Var, (Object) qim0Var2, i, (byte) 6);
        }
    }

    public static final void e(mvd1 mvd1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2053244420);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mvd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            int iC = l1d.C(mvd1Var.d);
            qim0 qim0Var2 = nim0.a;
            if (iC == 0) {
                x340Var.i0(-1777894661);
                c(mvd1Var, x340Var, i3 & 126);
                x340Var.r(false);
            } else {
                if (iC != 1 && iC != 2) {
                    throw p3d1.k(x340Var, -1777896155, false);
                }
                x340Var.i0(-1777891168);
                b(mvd1Var, qim0Var2, x340Var, i3 & 126);
                x340Var.r(false);
            }
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tvd1(mvd1Var, qim0Var, i, (byte) 1);
        }
    }

    public static final float f(qvd1 qvd1Var, int i) {
        p3v p3vVar;
        int i2 = uvd1.a[qvd1Var.ordinal()];
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return 56.0f;
                }
                eg.o();
                return 0.0f;
            }
            List list = a;
            if (i > 4) {
                i = 4;
            }
            Iterator it = o7h.d1(list, i).iterator();
            if (it.hasNext()) {
                icg icgVar = (icg) it.next();
                p3v p3vVar2 = new p3v(icgVar.a + icgVar.b);
                while (it.hasNext()) {
                    icg icgVar2 = (icg) it.next();
                    p3v p3vVar3 = new p3v(icgVar2.a + icgVar2.b);
                    if (p3vVar2.compareTo(p3vVar3) < 0) {
                        p3vVar2 = p3vVar3;
                    }
                }
                p3vVar = p3vVar2;
            } else {
                p3vVar = null;
            }
            if (p3vVar != null) {
                return p3vVar.a;
            }
        }
        return 0.0f;
    }

    public static final af5 g(String str, lee1 lee1Var, long j) {
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM = xvj1.m();
        new ArrayList();
        sb.append(spannedFromHtml.toString());
        for (Object obj : spannedFromHtml.getSpans(0, sb.length(), StyleSpan.class)) {
            StyleSpan styleSpan = (StyleSpan) obj;
            int spanStart = spannedFromHtml.getSpanStart(styleSpan);
            int spanEnd = spannedFromHtml.getSpanEnd(styleSpan);
            int style = styleSpan.getStyle();
            if (style == 1 || style == 3) {
                zma1 zma1Var = lee1Var.a;
                arrayListM.add(new xe5(spanStart, spanEnd, 8, new zma1(j, 0L, zma1Var.c, zma1Var.d, (FontSynthesis) null, zma1Var.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490), (String) null));
            }
        }
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM.size());
        int size = arrayListM.size();
        for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
        }
        return new af5(string, arrayList);
    }

    public static final p9m h(xa5 xa5Var) {
        return xa5Var.a(hm5.P(xay.e(2, new pxg1(260, 200, mlv.b)), xay.f(2, irn1.o0(180, 0, mlv.c, 2))), new c391(false, ppd1.f));
    }
}
