package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
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
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.voting.proto.v2.Artwork;
import com.spotify.voting.proto.v2.LottieAnimated;
import com.spotify.voting.proto.v2.LottieColor;
import com.spotify.voting.proto.v2.LottieStatic;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class aq8 {
    public static final pdx0 a = new pdx0((byte) 28);
    public static final rdx0 b = new rdx0((byte) 28);
    public static final wdx0 c = new wdx0((byte) 28);
    public static b180 d;
    public static b180 e;

    public static zud0 A(xwe0 xwe0Var) {
        return new zud0(xwe0Var, (byte) 4);
    }

    public static final boolean B(List list) {
        return list.contains(yy61.g) || list.contains(yy61.f) || list.contains(yy61.e);
    }

    public static final float C(l6m1 l6m1Var, float f, float f2, long j) {
        p3v p3vVar;
        p3v p3vVarA = ngu0.a(l6m1Var, j);
        if (p3vVarA != null) {
            p3vVar = new p3v(((s3v.b(j) - p3vVarA.a) - f2) - 12.0f);
        } else {
            p3vVar = null;
        }
        float fB = s3v.b(j) * f;
        if (p3vVar != null) {
            fB = pap1.z(new p3v(fB), p3vVar).a;
        }
        return zjy.p(0.0f, new p3v(fB)).a;
    }

    public static final ecf0 D(LottieColor lottieColor) {
        int iP = lottieColor.p();
        int i = iP == 0 ? -1 : v431.c[l1d.C(iP)];
        if (i == 1) {
            return new ccf0(lottieColor.n().getName(), lottieColor.n().n());
        }
        if (i != 2) {
            return null;
        }
        return new dcf0(lottieColor.o().getName(), lottieColor.o().n());
    }

    public static final q431 E(Artwork artwork) {
        q431 o431Var;
        int iQ = artwork.q();
        int i = iQ == 0 ? -1 : v431.b[l1d.C(iQ)];
        if (i == 1) {
            LottieAnimated lottieAnimatedO = artwork.o();
            String url = lottieAnimatedO.getUrl();
            h290<LottieColor> h290VarN = lottieAnimatedO.n();
            ArrayList arrayList = new ArrayList();
            for (LottieColor lottieColor : h290VarN) {
                lottieColor.getClass();
                ecf0 ecf0VarD = D(lottieColor);
                if (ecf0VarD != null) {
                    arrayList.add(ecf0VarD);
                }
            }
            o431Var = new o431(url, arrayList, lottieAnimatedO.r(), lottieAnimatedO.s(), lottieAnimatedO.q(), lottieAnimatedO.p());
        } else if (i != 2) {
            o431Var = null;
        } else {
            LottieStatic lottieStaticP = artwork.p();
            String url2 = lottieStaticP.getUrl();
            h290<LottieColor> h290VarN2 = lottieStaticP.n();
            ArrayList arrayList2 = new ArrayList();
            for (LottieColor lottieColor2 : h290VarN2) {
                lottieColor2.getClass();
                ecf0 ecf0VarD2 = D(lottieColor2);
                if (ecf0VarD2 != null) {
                    arrayList2.add(ecf0VarD2);
                }
            }
            o431Var = new p431(lottieStaticP.p(), url2, lottieStaticP.q(), arrayList2);
        }
        if (o431Var == null || ihc1.y0(o431Var.getUrl())) {
            return null;
        }
        return o431Var;
    }

    public static final p3v F(float f, int i, Context context, String str, kee1 kee1Var) {
        float fJ = ph5.J(f, i, context, str, kee1Var);
        float fJ2 = ph5.J(f, Integer.MAX_VALUE, context, str, kee1Var);
        p3v p3vVar = new p3v(fJ);
        if (p3v.b(fJ2, fJ) <= 0) {
            return p3vVar;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:42|24|(0)(1:27)) */
    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        r11 = r0;
        r13 = r1;
        r0 = 0;
        r1 = r9;
        r9 = r10;
        r10 = r2;
        r2 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [byte] */
    /* JADX WARN: Type inference failed for: r11v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a6 -> B:33:0x00ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object G(int r17, p.iu30 r18, p.onm r19) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.aq8.G(int, p.iu30, p.onm):java.lang.Object");
    }

    public static final void a(wm2 wm2Var, iu30 iu30Var, cn2 cn2Var, lsr lsrVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        lsr lsrVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1621791651);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wm2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 16;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(cn2Var) : x340Var.i(cn2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            lsrVar2 = lsrVar;
            i2 |= x340Var.i(lsrVar2) ? 2048 : 1024;
        } else {
            lsrVar2 = lsrVar;
        }
        int i3 = i2 | 24576;
        byte b3 = 1;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            List list = wm2Var.c;
            boolean zI = ((i3 & 896) == 256 || ((i3 & 512) != 0 && x340Var.i(cn2Var))) | x340Var.i(wm2Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new k2(wm2Var, cn2Var, null, b2);
                x340Var.s0(objT);
            }
            qxd0.t(list, x340Var, (vu30) objT);
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            kiv kivVar = AndroidCompositionLocals_androidKt.a;
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            boolean zI2 = x340Var.i(iac0Var) | ((i3 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new cc2(iac0Var, iu30Var, (byte) 1);
                x340Var.s0(objT2);
            }
            qxd0.i(iac0Var, (iu30) objT2, x340Var);
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var).g;
            qim0Var2 = nim0.a;
            irn1.u(qim0Var2, apo.r(397142666, new oj2(wm2Var, cn2Var, iu30Var, b3), x340Var), null, u85Var, apo.r(2138937732, new k8((Object) es41VarC, (Object) wm2Var, (Object) iu30Var, (Object) lsrVar2, (byte) 6), x340Var), x340Var, ((i3 >> 12) & 14) | 24624, 4);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 6, i, wm2Var, iu30Var, cn2Var, lsrVar, qim0Var2);
        }
    }

    public static final void b(llw0 llw0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-315678078);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(llw0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = llw0Var instanceof jlw0;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(1576049192);
                jlw0 jlw0Var = (jlw0) llw0Var;
                eso1.e(Uri.parse(jlw0Var.a), two1.C(2131956653, 0, jlw0Var.b, x340Var), u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, oux.a, true, false, x340Var, 224640, 6, 2496);
                x340Var.r(false);
            } else if (llw0Var instanceof ilw0) {
                x340Var.i0(1576065735);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                ilw0 ilw0Var = (ilw0) llw0Var;
                int i3 = ilw0Var.b;
                int i4 = ilw0Var.a;
                t1c.a(i4 == i3 ? dug.f(qim0VarD, z4p1.e(i4), d4o1.a) : dug.e(qim0VarD, v9c.s(p7h.M(new u7h[]{new u7h(z4p1.e(i4)), new u7h(z4p1.e(i3))}), 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1576068294);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) llw0Var, i, (byte) 28);
        }
    }

    public static final void c(String str, jsl jslVar, qim0 qim0Var, b0k b0kVar, int i) {
        String str2;
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1610286173);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (b0kVar3.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(jslVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Uri uri = Uri.parse(str2);
            cbx.a.getClass();
            b0kVar2 = b0kVar3;
            eso1.e(uri, jslVar, qim0Var2, (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, oux.a, true, false, b0kVar2, (i2 & 112) | 27648 | (i2 & 896), 6, 2496);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(str2, jslVar, qim0Var, i, (byte) 10);
        }
    }

    public static final void d(k2j1 k2j1Var, int i, iu30 iu30Var, lsr lsrVar, b0k b0kVar, int i2) {
        int i3;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1559908028);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(k2j1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(lsrVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            sbs0 sbs0Var = k2j1Var.a;
            if (sbs0Var != null) {
                x340Var.i0(326311617);
                strK = cwl1.n0(2131952094, new Object[]{lsrVar.a(sbs0Var.b, sbs0Var.a)}, x340Var);
                x340Var.r(false);
            } else {
                strK = x0d.k(x340Var, 326470833, 2131952095, x340Var, false);
            }
            boolean z = true;
            upx upxVar = upx.c;
            String strO0 = cwl1.o0(x340Var, 2131952096);
            boolean z2 = (i3 & 896) == 256;
            if ((i3 & 112) != 32) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new ck0(iu30Var, i, (byte) 3);
                x340Var.s0(objT);
            }
            r(upx.d, strO0, strK, (Function0) objT, x340Var, upxVar, null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(k2j1Var, i, iu30Var, lsrVar, i2, (byte) 1);
        }
    }

    public static final void e(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        h311 h311VarV;
        f0e f0eVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1961268357);
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0Var2 = nim0.a;
            if (i <= 1) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    f0eVar = new f0e((byte) 9, i, i2, i3, qim0Var2);
                }
            } else {
                jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
                x340Var.i0(271734453);
                int i5 = 0;
                while (i5 < i) {
                    uwr uwrVar = cbx.a;
                    long jB = u7h.b(cbx.a(x340Var).b.a, i2 == i5 ? 1.0f : 0.5f, 0.0f, 0.0f, 0.0f, 14);
                    cvx cvxVar = cbx.b(x340Var).b;
                    avw0 avw0Var = cbx.b(x340Var).c;
                    avw0 avw0Var2 = cbx.b(x340Var).c;
                    t1c.a(u291.r(dug.f(i1p1.q(uyn1.B(qim0Var2, 4.0f, 16.0f, 4.0f, 0.0f, 8), er31.a), jB, d4o1.a), 8.0f), x340Var, 0);
                    i5++;
                }
                x340Var.r(false);
                x340Var.r(true);
            }
            h311VarV.d = f0eVar;
        }
        x340Var.b0();
        qim0Var2 = qim0Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            f0eVar = new f0e((byte) 10, i, i2, i3, qim0Var2);
            h311VarV.d = f0eVar;
        }
    }

    public static final void f(ahk1 ahk1Var, iu30 iu30Var, j2i j2iVar, lxk1 lxk1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        u7h m231Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-765814477);
        int i2 = i | (x340Var2.g(ahk1Var) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(lxk1Var) ? 2048 : 1024) | 24576;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                x340Var2.s0(iu30Var);
                objT = iu30Var;
            }
            iu30 iu30Var2 = (iu30) objT;
            float fApplyDimension = 0.85f * TypedValue.applyDimension(1, Integer.valueOf(((Configuration) x340Var2.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp).floatValue(), Resources.getSystem().getDisplayMetrics());
            try {
                m231Var = new u7h(z4p1.e(Color.parseColor(ahk1Var.a)));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (e331.a(m231Var) != null) {
                uwr uwrVar = cbx.a;
                m231Var = new u7h(((vex) zex.a.b).c);
            }
            uwr uwrVar2 = cbx.a;
            mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{m231Var, new u7h(((vex) zex.a.b).c)}), 0.0f, fApplyDimension, 8);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = dug.e(u291.d(qim0Var3, 1.0f), mic0VarS, null, 0.0f, 6);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarE);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE2, x340Var2, y580.Y);
            qim0 qim0VarY = voo1.y(u291.d(qim0Var3, 1.0f), voo1.c);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0Var2 = qim0Var3;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            era eraVar = een.Q0;
            boolean zI = x340Var2.i(lxk1Var) | ((i2 & 14) == 4);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new m9i1(ahk1Var, iu30Var2, j2iVar, lxk1Var);
                x340Var2.s0(objT2);
            }
            ujo1.d(qim0VarY, null, null, false, d36Var, eraVar, null, false, null, (iu30) objT2, x340Var2, 0, 462);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 14, i, ahk1Var, iu30Var, j2iVar, lxk1Var, qim0Var2);
        }
    }

    public static final void g(List list, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1959210806);
        int i2 = (i & 6) == 0 ? (x340Var.g(list) ? 4 : 2) | i : i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            zma1 zma1Var = cbx.d(x340Var).p.a;
            String strO0 = cwl1.o0(x340Var, 2131956155);
            boolean zG = ((i2 & 14) == 4) | x340Var.g(zma1Var) | x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                int i3 = af5.e;
                af5 af5VarJ = ob51.j(String.format(strO0, Arrays.copyOf(new Object[]{TextUtils.htmlEncode(o7h.y0(list, (CharSequence) null, (String) null, (String) null, (iu30) null, 63))}, 1)), (pae1) null, 6);
                ye5 ye5Var = new ye5();
                ye5Var.h(af5VarJ);
                List listB = af5VarJ.b();
                ArrayList<ze5> arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (u890.j(((zma1) ((ze5) obj).a).c, FontWeight.Z)) {
                        arrayList.add(obj);
                    }
                }
                for (ze5 ze5Var : arrayList) {
                    ye5Var.d(zma1Var, ze5Var.b, ze5Var.c);
                }
                objT = ye5Var.p();
                x340Var.s0(objT);
            }
            uwr uwrVar2 = cbx.a;
            uwo1.d((af5) objT, u7h.f, null, cbx.d(x340Var).o, null, null, 2, false, new cjc0(4), 0, null, null, x340Var, 1572912, 0, 3764);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eu30(list, i, (byte) 0);
        }
    }

    public static final void h(llw0 llw0Var, String str, String str2, String str3, String str4, List list, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(264001745);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(llw0Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.g(str4) ? 16384 : 8192) | (x340Var.g(list) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (i2 & 599187) != 599186)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            cbx.a.getClass();
            qim0 qim0VarF2 = dug.f(hno1.f(qim0VarF, uwr.c()), u7h.b, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
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
            b(llw0Var, x340Var, i2 & 14);
            gra graVar = een.e;
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(uyn1.z(12.0f, 0.0f, 2, u291.f(h2cVar.a(nim0Var, graVar), 1.0f)), 0.0f, cvxVar.d, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
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
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = u7h.f;
            uwo1.e(str, null, lee1Var, j, null, null, 2, false, new cjc0(1), 0, null, x340Var, ((i2 >> 3) & 14) | 1575936, 0, 1714);
            uwo1.e(str3, null, kk0.p(nim0Var, 6.0f, x340Var, x340Var).d, j, null, null, 2, false, new cjc0(4), 0, null, x340Var, ((i2 >> 9) & 14) | 1575936, 0, 1714);
            x340Var.r(true);
            k(str2, str3, str4, list, h2cVar.a(nim0Var, een.X), x340Var, (i2 >> 6) & 8190);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(llw0Var, str, str2, str3, str4, list, qim0Var, i, (byte) 21);
        }
    }

    public static final void i(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1615019503);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.Q0, x340Var, 0);
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
            uwo1.e(str, null, cbx.d(x340Var).d, 0L, new a0e1(3), null, 2, false, new cjc0(2), 0, null, x340Var, i2 & 14, 0, 1706);
            uwo1.e(str2, null, cbx.d(x340Var).k, 0L, new a0e1(3), null, 2, false, new cjc0(2), 0, null, x340Var, (i2 >> 3) & 14, 0, 1706);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b071(str, str2, qim0Var, i, (byte) 6);
        }
    }

    public static final void j(l2j1 l2j1Var, int i, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        mmr0 mmr0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1527689797);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(l2j1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int iC = l1d.C(l2j1Var.a);
            if (iC == 0) {
                mmr0Var = new mmr0(2131952108, 2131952106);
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                mmr0Var = new mmr0(2131952109, 2131952107);
            }
            int iIntValue = ((Number) mmr0Var.a).intValue();
            int iIntValue2 = ((Number) mmr0Var.b).intValue();
            blx blxVar = blx.c;
            String strO0 = cwl1.o0(x340Var, iIntValue);
            String strO1 = cwl1.o0(x340Var, iIntValue2);
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ck0(iu30Var, i, (byte) 4);
                x340Var.s0(objT);
            }
            r(blx.d, strO0, strO1, (Function0) objT, x340Var, blxVar, null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(l2j1Var, i, iu30Var, i2, (byte) 0);
        }
    }

    public static final void k(String str, String str2, String str3, List list, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        List list2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-741740335);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarY = uyn1.y(dug.f(i1p1.q(uyn1.y(qim0Var, 12.0f, 12.0f), er31.b(6.0f)), u7h.b(u7h.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), 8.0f, 12.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            int i3 = i2;
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            jsl jslVarC = two1.C(2131962251, (i3 >> 3) & 14, str2, x340Var);
            zov0 zov0Var = cbx.b(x340Var).g;
            c(str, jslVarC, i1p1.q(u291.r(nim0Var, 64.0f), er31.b(4.0f)), x340Var, i3 & 14);
            wnb0 wnb0VarK = c13.k(nim0Var, 6.0f, x340Var, 1.0f, true);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0VarK);
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
            uwo1.e(str3, null, cbx.d(x340Var).o, u7h.b(u7h.f, 0.8f, 0.0f, 0.0f, 0.0f, 14), null, null, 2, false, new cjc0(1), 0, null, x340Var, ((i3 >> 6) & 14) | 1575936, 0, 1714);
            x340Var = x340Var;
            if (list.isEmpty()) {
                list2 = list;
                x340Var.i0(-1664847487);
                x340Var.r(false);
            } else {
                v8i0.i(4.0f, -1664982027, x340Var, x340Var, nim0Var);
                list2 = list;
                g(list2, x340Var, (i3 >> 9) & 14);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            zov0 zov0Var2 = cbx.b(x340Var).g;
            zpn1.f(u291.h(nim0Var, 12.0f), 0L, x340Var, 0, 2);
            x340Var.r(true);
        } else {
            list2 = list;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq(str, str2, str3, list2, qim0Var, i);
        }
    }

    public static final void l(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        iu30 iu30Var2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1839056227);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
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
            String strO0 = cwl1.o0(x340Var, 2131957235);
            lee1 lee1Var = cbx.d(x340Var).d;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = hlv0.d;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0Var3, false, (iu30) objT), lee1Var, 0L, new a0e1(5), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            String strN0 = cwl1.n0(2131957234, new Object[]{cwl1.o0(x340Var, 2131957216), cwl1.o0(x340Var, 2131957230)}, x340Var);
            c9 c9VarS = mqo1.s(new mae1(cwl1.o0(x340Var, 2131957216), "https://www.spotify.com/safetyandprivacy/parental-guide/plain/"), new mae1(cwl1.o0(x340Var, 2131957230), "https://support.spotify.com/article/managed-accounts/plain/"));
            boolean z = (i2 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                iu30Var2 = iu30Var;
                objT2 = new ppv0(iu30Var2, (byte) 0);
                x340Var.s0(objT2);
            } else {
                iu30Var2 = iu30Var;
            }
            iu30 iu30Var3 = (iu30) objT2;
            cvx cvxVar2 = cbx.b(x340Var).b;
            i8p1.i(strN0, c9VarS, iu30Var3, uyn1.z(0.0f, 16.0f, 1, qim0Var3), cbx.d(x340Var).g, cbx.a(x340Var).b.a, 0L, x340Var, 0, 64);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l52(iu30Var2, qim0Var2, i, (byte) 8);
        }
    }

    public static final void m(int i, String str, String str2, String str3, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(880738202);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 14;
            boolean z = ((i2 & 896) == 256) | (i3 == 4);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ec21(str3, str, (byte) 8);
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var);
            }
            boolean z2 = false;
            qim0 qim0VarV = bin.v(qim0VarA, (idn0) objT2, jtr.f, false, null, null, function0, 28);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), fraVar, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            gfx.b(8, apo.r(361804897, new avk1(str2, (byte) 3), x340Var), x340Var, 54);
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.v(nim0Var, 4.0f));
            boolean z3 = (i2 & 112) == 32;
            if (i3 == 4) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objT3 = x340Var.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new ec21(str2, str, (byte) 9);
                x340Var.s0(objT3);
            }
            uwo1.e(str, s161.a(nim0Var, (iu30) objT3), cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, i3, 0, 2040);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new duh(str, str2, str3, qim0Var, function0, i, (byte) 4);
        }
    }

    public static final void n(s271 s271Var, lxk1 lxk1Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        g36 g36Var;
        r271 r271Var;
        vu30 vu30Var;
        vu30 vu30Var2;
        llj lljVar;
        Function0 function0;
        vu30 vu30Var3;
        qim0 qim0Var2;
        b0k b0kVar3;
        boolean z;
        Function0 function1;
        r271 r271Var2;
        int i2;
        Object obj;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(635861595);
        j06 j06Var = ((x340) b0kVar4).a;
        int i3 = i | (b0kVar4.g(s271Var) ? 4 : 2) | (b0kVar4.i(lxk1Var) ? 32 : 16) | (b0kVar4.i(qim0Var) ? 256 : 128);
        if (b0kVar4.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objT = b0kVar4.T();
            Object obj2 = objT;
            if (z2 || objT == m4cVar) {
                bkk1 bkk1Var = new bkk1(s271Var, (byte) 4);
                b0kVar4.s0(bkk1Var);
                obj2 = bkk1Var;
            }
            kes kesVarB = lkr0.b(0, (Function0) obj2, b0kVar4, 0, 3);
            kl1 kl1Var = ((jkr0) kesVarB).d;
            boolean zE = b0kVar4.e(((err0) kl1Var.c).s());
            Object objT2 = b0kVar4.T();
            Object obj3 = objT2;
            if (zE || objT2 == m4cVar) {
                r271 r271Var3 = (r271) s271Var.a.get(((err0) kl1Var.c).s());
                b0kVar4.s0(r271Var3);
                obj3 = r271Var3;
            }
            r271 r271Var4 = (r271) obj3;
            Integer numValueOf = Integer.valueOf(((err0) kl1Var.c).s());
            boolean zI = b0kVar4.i(kesVarB);
            Object objT3 = b0kVar4.T();
            Object obj4 = objT3;
            if (zI || objT3 == m4cVar) {
                xw0 xw0Var = new xw0(iu30Var2, kesVarB, (lnm) null, (byte) 16);
                b0kVar4.s0(xw0Var);
                obj4 = xw0Var;
            }
            qxd0.t(numValueOf, b0kVar4, (vu30) obj4);
            int i5 = ((Configuration) b0kVar4.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            boolean zE2 = b0kVar4.e(i5);
            Object objT4 = b0kVar4.T();
            float f = ((p3v) ((zE2 || objT4 == m4cVar) ? ktd.k((float) (((double) i5) * 0.6d), b0kVar4) : objT4)).a;
            boolean zE3 = b0kVar4.e(i5);
            Object objT5 = b0kVar4.T();
            Object objK = objT5;
            if (zE3 || objT5 == m4cVar) {
                objK = ktd.k((float) (((double) i5) * 0.2d), b0kVar4);
            }
            float f2 = ((p3v) objK).a;
            era eraVar = een.Q0;
            g36 g36Var2 = h36.c;
            mbh mbhVarA = jbh.a(g36Var2, eraVar, b0kVar4, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM = b0kVar4.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar4, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar4.m0();
            boolean z3 = ((x340) b0kVar4).S;
            Function0 function2 = hmb0.t1;
            if (z3) {
                b0kVar4.l(function2);
            } else {
                b0kVar4.v0();
            }
            vu30 vu30Var4 = y580.O0;
            nko1.H(mbhVarA, b0kVar4, vu30Var4);
            vu30 vu30Var5 = y580.N0;
            nko1.H(xos0VarM, b0kVar4, vu30Var5);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf2, b0kVar4, lljVar2);
            nko1.F(b0kVar4);
            vu30 vu30Var6 = y580.Y;
            nko1.H(qim0VarE, b0kVar4, vu30Var6);
            String str = r271Var4.a;
            String str2 = r271Var4.e;
            String str3 = r271Var4.d;
            if (str == null) {
                b0kVar4.i0(887933333);
                z = false;
                b0kVar4.r(false);
                vu30Var3 = vu30Var4;
                function0 = function2;
                vu30Var = vu30Var5;
                g36Var = g36Var2;
                r271Var = r271Var4;
                vu30Var2 = vu30Var6;
                lljVar = lljVar2;
                b0kVar3 = b0kVar4;
                qim0Var2 = qim0Var3;
            } else {
                b0kVar4.i0(887933334);
                fra fraVar = een.N0;
                qim0 qim0VarZ = u291.z(qim0Var, fraVar, 2);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar4).b;
                cvx cvxVar2 = cbx.b(b0kVar4).b;
                qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 12.0f, 0.0f, 8.0f, 5);
                jw31 jw31VarA = ew31.a(h36.e, fraVar, b0kVar4, 0);
                int iHashCode2 = Long.hashCode(((x340) b0kVar4).T);
                xos0 xos0VarM2 = b0kVar4.m();
                qim0 qim0VarE2 = zr7.E(b0kVar4, qim0VarB);
                b0kVar4.m0();
                if (((x340) b0kVar4).S) {
                    b0kVar4.l(function2);
                } else {
                    b0kVar4.v0();
                }
                nko1.H(jw31VarA, b0kVar4, vu30Var4);
                nko1.H(xos0VarM2, b0kVar4, vu30Var5);
                x0d.q(iHashCode2, b0kVar4, lljVar2, b0kVar4);
                nko1.H(qim0VarE2, b0kVar4, vu30Var6);
                g36Var = g36Var2;
                r271Var = r271Var4;
                vu30Var = vu30Var5;
                vu30Var2 = vu30Var6;
                lljVar = lljVar2;
                function0 = function2;
                vu30Var3 = vu30Var4;
                w0h1.a(jlx.c, isl.a, (qim0) null, 0L, 0L, false, b0kVar4, jlx.d | 48, 60);
                cvx cvxVar3 = cbx.b(b0kVar4).b;
                qim0Var2 = qim0Var3;
                uwo1.e(str, uyn1.B(qim0Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(b0kVar4).h, 0L, null, null, 0, false, new cjc0(1), 0, null, b0kVar4, 0, 0, 1784);
                b0kVar3 = b0kVar4;
                b0kVar3.r(true);
                z = false;
                b0kVar3.r(false);
            }
            fdr0 fdr0Var = new fdr0(f);
            zzq0 zzq0VarH = uyn1.h(2, f2, 0.0f);
            uwr uwrVar2 = cbx.a;
            b0k b0kVar5 = b0kVar3;
            boolean z4 = z;
            w0h1.c(kesVarB, u291.f(qim0Var2, 1.0f), zzq0VarH, fdr0Var, 0, cbx.b(b0kVar3).b.b, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-2110652284, new juy0(s271Var, lxk1Var, (byte) 16), b0kVar3), b0kVar5, 0, 16336);
            b0kVar2 = b0kVar5;
            if (str3.length() <= 0 && str2.length() <= 0) {
                r271Var2 = r271Var;
                i2 = 3;
                b0kVar2.i0(890204797);
                b0kVar2.r(z4);
            } else {
                b0kVar2.i0(889317794);
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                op71.g(b0kVar2, u291.h(qim0Var2, 8.0f));
                gfh0 gfh0VarC = t1c.c(een.d, z4);
                int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM3 = b0kVar2.m();
                qim0 qim0VarE3 = zr7.E(b0kVar2, qim0Var);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    function1 = function0;
                    b0kVar2.l(function1);
                } else {
                    function1 = function0;
                    b0kVar2.v0();
                }
                vu30 vu30Var7 = vu30Var3;
                nko1.H(gfh0VarC, b0kVar2, vu30Var7);
                vu30 vu30Var8 = vu30Var;
                nko1.H(xos0VarM3, b0kVar2, vu30Var8);
                llj lljVar3 = lljVar;
                x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
                vu30 vu30Var9 = vu30Var2;
                nko1.H(qim0VarE3, b0kVar2, vu30Var9);
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                mbh mbhVarA2 = jbh.a(g36Var, eraVar, b0kVar2, z4 ? 1 : 0);
                int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM4 = b0kVar2.m();
                qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarF);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA2, b0kVar2, vu30Var7);
                nko1.H(xos0VarM4, b0kVar2, vu30Var8);
                x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE4, b0kVar2, vu30Var9);
                if (str3.length() > 0) {
                    b0kVar2.i0(-299928804);
                    r271 r271Var5 = r271Var;
                    r271Var2 = r271Var5;
                    i2 = 3;
                    uwo1.e(r271Var5.d, null, cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1762);
                    b0kVar2 = b0kVar2;
                    b0kVar2.r(z4);
                } else {
                    r271Var2 = r271Var;
                    i2 = 3;
                    b0kVar2.i0(-299678572);
                    b0kVar2.r(z4);
                }
                if (
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1170
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.aq8.n(p.s271, p.lxk1, p.qim0, p.iu30, p.b0k, int):void");
            }

            public static final void o(kka kkaVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
                int i2;
                x340 x340Var;
                qim0 qim0Var2;
                List list;
                Object obj;
                List list2 = kkaVar.e;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(598513125);
                j06 j06Var = x340Var2.a;
                if ((i & 6) == 0) {
                    i2 = (x340Var2.g(kkaVar) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                int i3 = i2 | 48;
                if ((i & 384) == 0) {
                    i3 |= x340Var2.i(function0) ? 256 : 128;
                }
                if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var2).a.a.a();
                    cr31 cr31VarB = er31.b(8.0f);
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var3, jA, cr31VarB), 1.0f), 16.0f);
                    jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    boolean z = x340Var2.S;
                    n4k n4kVar = hmb0.t1;
                    if (z) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE, lljVar4, 1.0f, true);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, wnb0VarQ);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    uwo1.e(kkaVar.a, null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
                    uwo1.e(kkaVar.b, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                    qim0 qim0VarB = uyn1.B(anm1.N("explore-benefits-button", qim0Var3), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    String str = kkaVar.c;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    foo1.c(new gbx(new y50(str), function0), jdx.c, qim0VarB, null, yla.s(x340Var2), null, null, null, null, null, apo.r(-942738964, new web0(kkaVar, (byte) 1), x340Var2), x340Var2, 0, 48, 2008);
                    x340Var = x340Var2;
                    x340Var.r(true);
                    qim0 qim0VarR = i1p1.r(u291.v(u291.h(qim0Var3, 152.0f), 122.0f));
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarR);
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
                    if (list2.size() > 0) {
                        list = list2;
                        obj = list.get(0);
                    } else {
                        list = list2;
                        obj = "offline";
                    }
                    w8p1.a(0, (String) obj, x340Var, k1u.u(eqr0.C(u291.r(lrn1.x(qim0Var3, 2.0f), 65.0f), 8.0f, 8.0f), -16.5f));
                    w8p1.a(0, (String) (1 < list.size() ? list.get(1) : "queue"), x340Var, k1u.u(eqr0.C(u291.r(lrn1.x(qim0Var3, 1.0f), 80.0f), 34.0f, 64.0f), 8.31f));
                    x340Var.r(true);
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xeb0(kkaVar, qim0Var2, function0, i, (byte) 1);
                }
            }

            public static final void p(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1771168519);
                int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.Q0, x340Var, 0);
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
                    nim0 nim0Var = nim0.a;
                    uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2040);
                    uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2032);
                    x340Var = x340Var;
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new b071(str, str2, qim0Var, i, (byte) 7);
                }
            }

            public static final void q(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
                gbx gbxVar;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1583362613);
                int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = new kyk1(function0, (byte) 0);
                        x340Var.s0(objT);
                    }
                    Function0 function1 = (Function0) objT;
                    if (ihc1.y0(str2)) {
                        gbxVar = new gbx(z50.c, function1);
                    } else {
                        if (ihc1.y0(str2)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        }
                        gbxVar = new gbx(new y50(str2), function1);
                    }
                    wro1.h(gbxVar, new idx(19), null, null, yla.r(x340Var), null, false, null, null, apo.r(1866627056, new avk1(str, (byte) 4), x340Var), x340Var, 0, 6, 988);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hq6(str, str2, qim0Var, function0, i, (byte) 7);
                }
            }

            public static final void r(int i, String str, String str2, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
                b0k b0kVar2;
                qim0 qim0Var2;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(558769768);
                int i2 = i | ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | 24576;
                byte b2 = 1;
                if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                    ogx ogxVar = ogx.e;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    uvx uvxVar = new uvx(0, ogxVar, 0, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 501);
                    boolean z = (i2 & 7168) == 2048;
                    Object objT = b0kVar3.T();
                    if (z || objT == fkj0.X) {
                        objT = new lj2(function0, (byte) 1);
                        b0kVar3.s0(objT);
                    }
                    b0kVar2 = b0kVar3;
                    jto1.b(qim0VarF, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT), null, apo.r(-264150370, new g70(huxVar, b2), b0kVar3), null, null, apo.r(-1615150176, new p3(str2, (byte) 12), b0kVar3), l5i.a, null, null, apo.r(-890989404, new p3(str, (byte) 13), b0kVar3), b0kVar2, 100663360, 197040, 26300);
                    qim0Var2 = qim0Var3;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ik2((Object) huxVar, str, (Object) str2, function0, (Object) qim0Var2, i, (byte) 0);
                }
            }

            public static final void s(wm2 wm2Var, iu30 iu30Var, lsr lsrVar, float f, b0k b0kVar, int i) {
                wm2 wm2Var2;
                iu30 iu30Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(272280578);
                int i2 = i | (x340Var.i(wm2Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(lsrVar) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024);
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarB = uyn1.B(uyn1.x(qim0VarF, 16.0f), 0.0f, 0.0f, 0.0f, f, 7);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    String strO0 = cwl1.o0(x340Var, 2131952105);
                    lee1 lee1Var = cbx.d(x340Var).d;
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ny1.a1;
                        x340Var.s0(objT);
                    }
                    float f2 = 16.0f;
                    uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(nim0Var, 16.0f));
                    boolean z = (i2 & 112) == 32;
                    Object objT2 = x340Var.T();
                    if (z || objT2 == m4cVar) {
                        iu30Var2 = iu30Var;
                        objT2 = new k52(iu30Var2, (byte) 25);
                        x340Var.s0(objT2);
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    t(0, (Function0) objT2, x340Var, null);
                    op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
                    x340Var.i0(-545562503);
                    wm2Var2 = wm2Var;
                    int i3 = 0;
                    for (Object obj : wm2Var2.c) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        l2j1 l2j1Var = (m2j1) obj;
                        if (i3 > 0) {
                            x340Var.i0(-646557734);
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar3 = cbx.b(x340Var).b;
                            x0d.s(nim0Var, f2, x340Var, false);
                        } else {
                            x340Var.i0(-646476049);
                            x340Var.r(false);
                        }
                        if (l2j1Var instanceof l2j1) {
                            x340Var.i0(1226074203);
                            j(l2j1Var, i3, iu30Var2, x340Var, (i2 << 3) & 896);
                            x340Var.r(false);
                        } else {
                            if (!(l2j1Var instanceof k2j1)) {
                                throw p3d1.k(x340Var, 1226072359, false);
                            }
                            x340Var.i0(1226076939);
                            d((k2j1) l2j1Var, i3, iu30Var2, lsrVar, x340Var, (i2 << 3) & 8064);
                            x340Var.r(false);
                        }
                        iu30Var2 = iu30Var;
                        i3 = i4;
                        f2 = f2;
                    }
                    x340Var.r(false);
                    x340Var.r(true);
                } else {
                    wm2Var2 = wm2Var;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ys(wm2Var2, iu30Var, lsrVar, f, i);
                }
            }

            public static final void t(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-708754198);
                int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
                if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                    ven0 ven0VarS = v8r.s(function0, x340Var);
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var).b.a;
                    String strO0 = cwl1.o0(x340Var, 2131952113);
                    boolean zG = x340Var.g(strO0) | x340Var.f(j);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        ye5 ye5Var = new ye5();
                        vhg.a(ye5Var, strO0, "learn_more", new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438), new xj0(ven0VarS, (byte) 12));
                        objT = ye5Var.p();
                        x340Var.s0(objT);
                    }
                    lee1 lee1Var = cbx.d(x340Var).g;
                    qim0Var2 = nim0.a;
                    uwo1.f((af5) objT, qim0Var2, lee1Var, null, null, null, 0, false, null, 0, null, null, x340Var, 48, 0, 4088);
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 2);
                }
            }

            public static ydb v(r1q0 r1q0Var, iac0 iac0Var, iu30 iu30Var, int i) {
                if ((i & 1) != 0) {
                    iac0Var = null;
                }
                ydb ydbVar = new ydb(iu30Var, (byte) 18);
                if (iac0Var != null) {
                    r1q0Var.a(iac0Var, ydbVar);
                    return ydbVar;
                }
                r1q0Var.b(ydbVar);
                return ydbVar;
            }

            public static final hx80 w(k42 k42Var) {
                ip31 ip31Var = new ip31(k42Var);
                Flowable flowable = (Flowable) k42Var.a;
                c8o.l(flowable);
                wen0 wen0Var = (wen0) k42Var.c;
                c8o.l(wen0Var);
                mr20 mr20Var = (mr20) k42Var.b;
                c8o.l(mr20Var);
                mr20 mr20Var2 = mr20Var;
                edp edpVar = (edp) k42Var.d;
                c8o.l(edpVar);
                muz muzVar = (muz) k42Var.e;
                c8o.l(muzVar);
                h1y h1yVarA = edpVar.a(muzVar);
                b1y b1yVar = (b1y) k42Var.f;
                c8o.l(b1yVar);
                vi11 vi11Var = new vi11(flowable, wen0Var, mr20Var2, h1yVarA, b1yVar, (byte) 12);
                n381 n381Var = new n381((zkv) ((jly0) ip31Var.d).get(), mr20Var2, (byte) 7);
                ynb0 ynb0VarA = xqu.a((chp) ip31Var.e);
                mpa1 mpa1Var = (mpa1) ((jly0) ip31Var.g).get();
                xjp xjpVar = (xjp) ((jly0) ip31Var.h).get();
                yjp yjpVar = (yjp) ((jly0) ip31Var.i).get();
                zeu zeuVarO = ip31Var.o();
                RetrofitMaker retrofitMaker = (RetrofitMaker) k42Var.h;
                c8o.l(retrofitMaker);
                return new hx80(vi11Var, n381Var, new ax80(ynb0VarA, mpa1Var, mr20Var2, xjpVar, yjpVar, zeuVarO, new au81((rs81) retrofitMaker.createExperimentalWebgateService(rs81.class, "android-endless-sillywalk-network")), flowable, ip31Var.t()), ip31Var.t());
            }

            public static lpk0 x(r6h1 r6h1Var) {
                return new lpk0(r6h1Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static q8b y(lby lbyVar, jjf1 jjf1Var, boolean z) {
                String str = lbyVar.a;
                List list = jjf1Var.d;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ol11) it.next()).a);
                }
                return z ? new q8b(f46.i0(new String[]{str, o7h.s0(arrayList)}), true) : new q8b(z6x.a, false);
            }

            public static final w1k z(l2r l2rVar, l2r l2rVar2) {
                boolean z = l2rVar instanceof w1k;
                if (z && (l2rVar2 instanceof w1k)) {
                    return new w1k(o7h.N0(((w1k) l2rVar2).a, ((w1k) l2rVar).a));
                }
                if (z) {
                    return new w1k(o7h.O0(l2rVar2.a(), ((w1k) l2rVar).a));
                }
                return l2rVar2 instanceof w1k ? new w1k(o7h.N0(((w1k) l2rVar2).a, Collections.singletonList(l2rVar.a()))) : new w1k(new l2r[]{l2rVar.a(), l2rVar2.a()});
            }
        }
