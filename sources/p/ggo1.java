package p;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ggo1 {
    public static final n511 a = new n511(0.0f, 0.0f, 10.0f, 10.0f);
    public static b180 b;

    public static fmv A() {
        return new fmv((byte) 0);
    }

    public static fai0 B(d0r d0rVar, String str, boolean z, boolean z2, int i) {
        o3r o3rVarM;
        boolean z3 = (i & 4) != 0 ? false : z;
        byte b2 = 8;
        boolean z4 = (i & 8) != 0 ? false : z2;
        v160 v160Var = v160.f;
        v160 v160Var2 = v160.d;
        v160 v160Var3 = v160.c;
        v160 v160Var4 = v160.b;
        aw50 aw50Var = aw50.e1;
        v160 v160Var5 = v160.e;
        hvm hvmVar = hvm.d;
        if (z4) {
            jd11 jd11Var = rc11.a;
            o3rVarM = w3p1.m(new l4r(hvmVar, 3, aw50Var, new j4r(v160Var5), v160Var4), new l4r(new xv00(jd11Var.b(prl.class)), 3, v160Var3, new j4r(new mj10((byte) 6, z3)), v160Var2), new l4r(new xv00(jd11Var.b(a7q0.class)), 3, aw50.Z0, new j4r(v160Var), aw50.a1), new zw2(z3, new fy50((Double) null, (Long) null, Boolean.FALSE, 15), b2));
        } else {
            jd11 jd11Var2 = rc11.a;
            o3rVarM = w3p1.m(new l4r(hvmVar, 3, aw50Var, new j4r(v160Var5), v160Var4), new l4r(new xv00(jd11Var2.b(prl.class)), 3, v160Var3, new j4r(new mj10((byte) 6, z3)), v160Var2), new l4r(new xv00(jd11Var2.b(v6v0.class)), 3, aw50.b1, new j4r(v160Var), aw50.c1), new aw1((byte) 29, z3));
        }
        ay8 ay8VarH = d3p1.H(d0rVar, o3rVarM, str);
        fai0 fai0Var = new fai0();
        fai0Var.m(ay8VarH.a.getValue());
        fai0Var.n(t5p1.j(ay8VarH, 3), new u160(fai0Var, (byte) 0));
        return fai0Var;
    }

    public static final fdn0 C(y161 y161Var, iu30 iu30Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            v161 v161VarA = y161Var.a();
            hmb0 hmb0Var = v161VarA.c;
            if (hmb0Var.J() && hmb0Var.I()) {
                n511 n511VarG = v161VarA.g();
                fdn0 fdn0Var = new fdn0(48);
                n801 n801Var = new n801();
                n801Var.e(hm5.H(n511VarG));
                F(iu30Var, fdn0Var, new n801(), n801Var, v161VarA, v161VarA);
                return fdn0Var;
            }
            return pr80.a;
        } finally {
            Trace.endSection();
        }
    }

    public static final void D(iu30 iu30Var, fdn0 fdn0Var, n801 n801Var, n801 n801Var2, v161 v161Var, v161 v161Var2) {
        n801 n801Var3 = n801Var;
        Region region = (Region) n801Var3.b;
        n801 n801Var4 = n801Var2;
        Region region2 = (Region) n801Var4.b;
        hmb0 hmb0Var = v161Var2.c;
        hmb0 hmb0Var2 = v161Var2.c;
        if (!hmb0Var.J() || !hmb0Var2.I() || region2.isEmpty()) {
            if (v161Var2.n()) {
                E(fdn0Var, v161Var, v161Var2);
                return;
            }
            return;
        }
        n511 n511VarM = v161Var2.m();
        if (n511VarM.k()) {
            pim0 pim0VarF = v161Var2.f();
            n511VarM = pim0VarF == null ? nko1.x((sh80) hmb0Var2.e1.d) : nko1.y(pim0VarF.a, nko1.A(v161Var2.d), false);
        }
        ur80 ur80VarH = hm5.H(n511VarM);
        n801Var3.e(ur80VarH);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = v161Var2.f;
            if (i == v161Var.f) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            fdn0Var.i(i, new x161(v161Var2, new ur80(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listJ = v161.j(4, v161Var2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) iu30Var.invoke(listJ.get(size))).booleanValue()) {
                    D(iu30Var, fdn0Var, n801Var3, n801Var4, v161Var, (v161) listJ.get(size));
                }
                size--;
                n801Var3 = n801Var;
                n801Var4 = n801Var2;
            }
            if (H(v161Var2)) {
                region2.op(ur80VarH.a, ur80VarH.b, ur80VarH.c, ur80VarH.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void E(fdn0 fdn0Var, v161 v161Var, v161 v161Var2) {
        hmb0 hmb0Var;
        v161 v161VarL = v161Var2.l();
        n511 n511VarG = (v161VarL == null || (hmb0Var = v161VarL.c) == null || !hmb0Var.J()) ? a : v161VarL.g();
        int i = v161Var2.f;
        if (i == v161Var.f) {
            i = -1;
        }
        fdn0Var.i(i, new x161(v161Var2, hm5.H(n511VarG)));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    public static final void F(iu30 iu30Var, fdn0 fdn0Var, n801 n801Var, n801 n801Var2, v161 v161Var, v161 v161Var2) {
        int size;
        ndo0 ndo0Var;
        boolean z;
        iu30 iu30Var2 = iu30Var;
        fdn0 fdn0Var2 = fdn0Var;
        v161 v161Var3 = v161Var;
        int i = v161Var3.f;
        Region region = (Region) n801Var.b;
        n801 n801Var3 = n801Var2;
        Region region2 = (Region) n801Var3.b;
        hmb0 hmb0Var = v161Var2.c;
        o161 o161Var = v161Var2.d;
        hmb0 hmb0Var2 = v161Var2.c;
        int i2 = v161Var2.f;
        boolean z2 = (hmb0Var.J() && hmb0Var2.I()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z2 || v161Var2.n()) {
                ur80 ur80VarH = hm5.H(v161Var2.m());
                n801Var.e(ur80VarH);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (v161Var2.n()) {
                        E(fdn0Var2, v161Var3, v161Var2);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            fdn0Var2.i(i2, new x161(v161Var2, new ur80(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                fdn0Var2.i(i2, new x161(v161Var2, new ur80(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = v161.j(4, v161Var2);
                if (o161Var.c) {
                    v161 v161VarL = v161Var2.l();
                    while (true) {
                        ndo0Var = null;
                        if (v161VarL == null) {
                            v161VarL = null;
                            break;
                        }
                        nen0 nen0Var = v161VarL.d.a;
                        if (nen0Var.c(z161.w) || nen0Var.c(z161.v)) {
                            break;
                        } else {
                            v161VarL = v161VarL.l();
                        }
                    }
                    if (v161VarL == null) {
                        z = false;
                    } else {
                        elb0 elb0VarD = v161Var2.d();
                        if (elb0VarD == null) {
                            elb0VarD = null;
                        } else {
                            if (!elb0VarD.f1().N0) {
                                elb0VarD = null;
                            }
                            if (elb0VarD == null) {
                                elb0VarD = null;
                            }
                        }
                        ndo0 ndo0VarD = v161VarL.d();
                        if (ndo0VarD != null) {
                            if (!ndo0VarD.f1().N0) {
                                ndo0VarD = null;
                            }
                            if (ndo0VarD != null) {
                                ndo0Var = ndo0VarD;
                            }
                        }
                        if (elb0VarD == null || ndo0Var == null) {
                            z = false;
                        } else {
                            n511 n511VarM = ndo0Var.M(elb0VarD, false);
                            z = !n511VarM.equals(n511VarM.j(anm1.g(0L, o0c.R(((q5t0) ndo0Var).c))));
                        }
                    }
                    if (z) {
                        n801 n801Var4 = new n801();
                        pim0 pim0VarF = v161Var2.f();
                        n801Var4.e(hm5.H(pim0VarF == null ? nko1.x((sh80) hmb0Var2.e1.d) : nko1.y(pim0VarF.a, nko1.A(o161Var), false)));
                        int size2 = listJ.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) iu30Var2.invoke(listJ.get(size2))).booleanValue()) {
                                D(iu30Var2, fdn0Var2, new n801(), n801Var4, v161Var3, (v161) listJ.get(size2));
                            }
                            size2--;
                            fdn0Var2 = fdn0Var;
                            v161Var3 = v161Var;
                        }
                    } else {
                        size = listJ.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) iu30Var2.invoke(listJ.get(size))).booleanValue()) {
                                F(iu30Var2, fdn0Var, n801Var, n801Var3, v161Var, (v161) listJ.get(size));
                            }
                            size--;
                            iu30Var2 = iu30Var;
                            n801Var3 = n801Var2;
                        }
                    }
                } else {
                    size = listJ.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) iu30Var2.invoke(listJ.get(size))).booleanValue()) {
                            F(iu30Var2, fdn0Var, n801Var, n801Var3, v161Var, (v161) listJ.get(size));
                        }
                        size--;
                        iu30Var2 = iu30Var;
                        n801Var3 = n801Var2;
                    }
                }
                if (H(v161Var2)) {
                    region2.op(ur80VarH.a, ur80VarH.b, ur80VarH.c, ur80VarH.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final boolean G(v161 v161Var) {
        ndo0 ndo0VarD = v161Var.d();
        nen0 nen0Var = v161Var.d.a;
        return (ndo0VarD != null ? ndo0VarD.v1() : false) || nen0Var.c(z161.q) || nen0Var.c(z161.p);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[LOOP:0: B:11:0x001d->B:24:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[SYNTHETIC] */
    public static final boolean H(v161 v161Var) {
        if (!G(v161Var)) {
            o161 o161Var = v161Var.d;
            if (o161Var.c) {
                return true;
            }
            nen0 nen0Var = o161Var.a;
            Object[] objArr = nen0Var.b;
            Object[] objArr2 = nen0Var.c;
            long[] jArr = nen0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((d261) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean I(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!u890.j(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static mqm J(String str, String str2, qle1 qle1Var) {
        return new mqm(new mvm(str, str2, (String) null, (Long) null), new lqm(Collections.singletonList(ovm.c), (List) null, qle1Var, 2));
    }

    public static hxw K(String str) {
        String encodedFragment;
        if (str == null || str.length() == 0) {
            return null;
        }
        Uri uri = Uri.parse(str);
        uri.getClass();
        if (!"/login/ott/music".equalsIgnoreCase(uri.getEncodedPath()) || (encodedFragment = uri.getEncodedFragment()) == null) {
            return null;
        }
        Uri uriBuild = uri.buildUpon().clearQuery().encodedQuery(encodedFragment).fragment(null).build();
        String queryParameter = uriBuild.getQueryParameter("username");
        String queryParameter2 = uriBuild.getQueryParameter("token");
        String queryParameter3 = uriBuild.getQueryParameter("flow");
        if (queryParameter == null || queryParameter.length() == 0 || queryParameter2 == null || queryParameter2.length() == 0) {
            return null;
        }
        return new hxw(queryParameter, queryParameter2, queryParameter3);
    }

    public static final ven0 L(BottomSheetBehavior bottomSheetBehavior, int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(new rzb1(0, i, 0.0f));
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        boolean zI = x340Var.i(bottomSheetBehavior) | x340Var.i(ven0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new ccb1(bottomSheetBehavior, ven0Var, (byte) 8);
            x340Var.s0(objT2);
        }
        qxd0.i(bottomSheetBehavior, (iu30) objT2, x340Var);
        return ven0Var;
    }

    public static void M(ViewGroup viewGroup, float f) {
        gch0 background = viewGroup.getBackground();
        if (background instanceof gch0) {
            background.l(f);
        }
    }

    public static void N(View view, gch0 gch0Var) {
        guw guwVar = gch0Var.a.b;
        if (guwVar == null || !guwVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = b8k1.a;
            elevation += ((View) parent).getElevation();
        }
        fch0 fch0Var = gch0Var.a;
        if (fch0Var.l != elevation) {
            fch0Var.l = elevation;
            gch0Var.t();
        }
    }

    public static void O(ViewGroup viewGroup) {
        gch0 background = viewGroup.getBackground();
        if (background instanceof gch0) {
            N(viewGroup, background);
        }
    }

    public static final gbx P(String str, Function0 function0) {
        if (ihc1.y0(str)) {
            return new gbx(z50.c, function0);
        }
        if (!ihc1.y0(str)) {
            return new gbx(new y50(str), function0);
        }
        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
        return null;
    }

    public static final void a(iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1997408546);
        int i2 = (b0kVar3.i(iu30Var) ? 4 : 2) | i;
        nim0 nim0Var = nim0.a;
        int i3 = i2 | (b0kVar3.i(nim0Var) ? 32 : 16);
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ccy0(iu30Var, (byte) 17);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(nim0Var, 1.0f), null, null, false, null, null, new gbx(z50.c, (Function0) objT), null, raj.b, null, null, null, null, null, null, raj.c, b0kVar2, 100663296, 196608, 32446);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new iuy0(iu30Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    public static final void b(i2c i2cVar, yj41 yj41Var, int i, boolean z, boolean z2, boolean z3, boolean z4, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        boolean z5;
        i2c i2cVar2;
        qim0 qim0Var2;
        h311 h311VarV;
        md6 md6Var;
        int i4;
        String str;
        ven0 ven0Var;
        ven0 ven0VarR;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Bitmap bitmap = yj41Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(470803292);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(i2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? x340Var.g(yj41Var) : x340Var.i(yj41Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z5 = z3;
            i3 |= x340Var.h(z5) ? 131072 : 65536;
        } else {
            z5 = z3;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.h(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= x340Var.g(qim0Var) ? 8388608 : 4194304;
        }
        byte b2 = 1;
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            if (!z2 || z4) {
                int i5 = i + 1;
                if (!z) {
                    i4 = 0;
                } else if (i5 == 3) {
                    i4 = 1;
                } else if (i5 == 2 || z2) {
                    i4 = 2;
                } else {
                    i4 = 0;
                }
                if (i4 == 0) {
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        md6Var = new md6(i2cVar, yj41Var, i, z, z2, z3, z4, qim0Var, i2, (byte) 3);
                    }
                } else {
                    if (i4 != 1) {
                        str = i4 != 2 ? "null" : "RevealStart";
                    } else {
                        str = "CardThree";
                    }
                    String strConcat = "artistCardsAnticipationGlowEntry-".concat(str);
                    ilv.a.getClass();
                    pxg1 pxg1VarO0 = irn1.o0(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, flv.d, 2);
                    tzg1 tzg1Var = rno1.a;
                    hsi1 hsi1Var = new hsi1(strConcat, fValueOf2, fValueOf, pxg1VarO0, tzg1Var);
                    int i6 = i3 >> 12;
                    int i7 = i6 & 112;
                    ven0 ven0VarS = zod.S(hsi1Var, z3, z4, (Function0) null, x340Var, 8 | i7 | (i6 & 896), 8);
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT);
                    }
                    ven0 ven0Var2 = (ven0) objT;
                    if (z2) {
                        x340Var.i0(-1661306069);
                        ven0Var = ven0Var2;
                        hsi1 hsi1Var2 = new hsi1("artistCardsAnticipationGlowReveal", fValueOf2, fValueOf, irn1.o0(3000, 0, mlv.d, 2), tzg1Var);
                        Object objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = new ma0(ven0Var, (byte) 18);
                            x340Var.s0(objT2);
                        }
                        ven0VarR = zod.R(hsi1Var2, z3, (Function0) objT2, x340Var, 392 | i7, 0);
                        x340Var.r(false);
                    } else {
                        ven0Var = ven0Var2;
                        x340Var.i0(-1660935340);
                        x340Var.r(false);
                        ven0VarR = null;
                    }
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        h311VarV = x340Var.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            md6Var = new md6(i2cVar, yj41Var, i, z, z2, z3, z4, qim0Var, i2, (byte) 1);
                        }
                    } else {
                        i2cVar2 = i2cVar;
                        qim0Var2 = qim0Var;
                        boolean zG = x340Var.g(bitmap);
                        Object objT3 = x340Var.T();
                        if (zG || objT3 == m4cVar) {
                            objT3 = new yk4(bitmap);
                            x340Var.s0(objT3);
                        }
                        yk4 yk4Var = (yk4) objT3;
                        wat watVar = (wat) x340Var.k(t4k.h);
                        float fM0 = watVar.M0(yk4Var.a.getWidth());
                        float fM1 = watVar.M0(yk4Var.a.getHeight());
                        on20 on20Var = mif1.U0;
                        qim0 qim0VarN = u291.n(i2cVar2.a(qim0Var2, een.h), fM0, fM1);
                        boolean zG2 = x340Var.g(ven0VarS) | x340Var.g(ven0VarR) | x340Var.e(l1d.C(i4));
                        Object objT4 = x340Var.T();
                        if (zG2 || objT4 == m4cVar) {
                            objT4 = new gu2(ven0VarS, ven0VarR, i4, b2);
                            x340Var.s0(objT4);
                        }
                        eso1.f(yk4Var, isl.a, i541.C(qim0VarN, (iu30) objT4), (p3v) null, (zvx) null, (ecx) null, on20Var, (tl3) null, (ColorFilter) null, x340Var, 1797168, 384);
                        x340Var = x340Var;
                    }
                }
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    md6Var = new md6(i2cVar, yj41Var, i, z, z2, z5, z4, qim0Var, i2, (byte) 0);
                }
            }
            h311VarV.d = md6Var;
        }
        i2cVar2 = i2cVar;
        qim0Var2 = qim0Var;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            md6Var = new md6(i2cVar2, yj41Var, i, z, z2, z3, z4, qim0Var2, i2, (byte) 2);
            h311VarV.d = md6Var;
        }
    }

    public static final void c(whb1 whb1Var, leh1 leh1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2102105264);
        int i2 = (x340Var.i(whb1Var) ? 4 : 2) | i | (x340Var.i(leh1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            j2h1.b(eqr0.E(dm5.I(et40.a), 16.0f), (ql3) null, apo.r(-827998290, new meh1(leh1Var, whb1Var), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new meh1(whb1Var, leh1Var, i, (byte) 3);
        }
    }

    public static final void d(Object obj, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1448368167);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                i6l1 i6l1Var = function0 != null ? (i6l1) function0.invoke() : null;
                objT = i6l1Var != null ? i6l1Var : null;
                x340Var.s0(objT);
            }
            i6l1 i6l1Var2 = (i6l1) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = fjd.R0;
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI = x340Var.i(i6l1Var2) | x340Var.i(obj);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new ztb(i6l1Var2, obj, (byte) 19);
                x340Var.s0(objT3);
            }
            dm5.a(iu30Var, qim0Var, (iu30) objT3, x340Var, ((i2 >> 3) & 112) | 6, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(obj, function0, qim0Var, i, (byte) 6);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-854222);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gra graVar = een.h;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            String strO0 = cwl1.o0(x340Var, 2131960727);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).h, 0L, new a0e1(5), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var2, i, (byte) 7);
        }
    }

    public static final void f(kka kkaVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        List list = kkaVar.e;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1021838211);
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
            qim0 qim0VarF = u291.f(dug.f(qim0Var3, jA, cr31VarB), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarR = i1p1.r(u291.v(u291.h(qim0Var3, 182.0f), 236.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarR);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            w8p1.a(0, (String) (list.size() > 0 ? list.get(0) : "offline"), x340Var2, k1u.u(eqr0.C(u291.r(lrn1.x(qim0Var3, 1.0f), 70.0f), 8.0f, 104.0f), -16.5f));
            w8p1.a(0, (String) (1 < list.size() ? list.get(1) : "group-session"), x340Var2, k1u.u(eqr0.C(u291.r(lrn1.x(qim0Var3, 2.0f), 88.0f), 50.0f, 0.0f), 13.44f));
            w8p1.a(0, (String) (2 < list.size() ? list.get(2) : "queue"), x340Var2, k1u.u(eqr0.C(u291.r(lrn1.x(qim0Var3, 3.0f), 118.0f), 110.0f, 58.0f), 8.31f));
            x340Var2.r(true);
            uwo1.e(kkaVar.a, uyn1.z(16.0f, 0.0f, 2, uyn1.B(qim0Var3, 0.0f, 24.0f, 0.0f, 0.0f, 13)), cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
            uwo1.e(kkaVar.b, uyn1.z(16.0f, 0.0f, 2, uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 0.0f, 13)), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
            qim0 qim0VarZ = uyn1.z(0.0f, 32.0f, 1, anm1.N("explore-benefits-button", qim0Var3));
            String str = kkaVar.c;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(str), function0), new idx(4), qim0VarZ, null, yla.p(x340Var2), null, null, null, null, null, apo.r(5375144, new web0(kkaVar, (byte) 0), x340Var2), x340Var2, 0, 48, 2008);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xeb0(kkaVar, qim0Var2, function0, i, (byte) 0);
        }
    }

    public static final void g(iu30 iu30Var, c380 c380Var, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(550425038);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            boolean zI = x340Var.i(c380Var) | x340Var.i(nim0Var) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new li1(c380Var, iu30Var);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            int i4 = i2;
            ujo1.d(null, null, null, false, null, null, null, false, null, iu30Var2, x340Var, 0, 511);
            m(((i4 >> 6) & 14) | ((i4 << 6) & 896), x340Var, iu30Var, null, z);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(i, iu30Var, c380Var, z);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-963122202);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gra graVar = een.h;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            qim0 qim0VarV = u291.v(qim0Var2, 32.0f);
            uwr uwrVar = cbx.a;
            rhx0.a(qim0VarV, cbx.a(x340Var).c.c, 0.0f, 0L, 0, 0.0f, x340Var, 0, 60);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 8);
        }
    }

    public static final void i(eeo0 eeo0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        String str = eeo0Var.k;
        String str2 = eeo0Var.i;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-440489844);
        int i2 = i | (x340Var.i(eeo0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.i0(1891026609);
            smc0 smc0VarN = k4p1.n();
            if (!eeo0Var.f || ihc1.y0(str2)) {
                x340Var.i0(135677899);
                x340Var.r(false);
            } else {
                x340Var.i0(135529905);
                boolean z = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new kek0(function0, (byte) 15);
                    x340Var.s0(objT);
                }
                smc0VarN.add(new epo(str2, (Function0) objT));
                x340Var.r(false);
            }
            if (!eeo0Var.g || ihc1.y0(str)) {
                x340Var.i0(135913995);
                x340Var.r(false);
            } else {
                x340Var.i0(135763118);
                boolean z2 = (i2 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new kek0(function1, (byte) 16);
                    x340Var.s0(objT2);
                }
                smc0VarN.add(new epo(str, (Function0) objT2));
                x340Var.r(false);
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var.r(false);
            j(eeo0Var, eeo0Var.c + ", " + eeo0Var.d + ", " + eeo0Var.e, smc0VarK, apo.r(-183098086, new iwf0(eeo0Var, function0, function1, (byte) 29), x340Var), x340Var, (i2 & 14) | 3072, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(eeo0Var, function0, function1, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x0136  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void j(eeo0 eeo0Var, String str, List list, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        List list2;
        int i3;
        xu30 xu30Var2;
        byte b2;
        byte b3;
        boolean z;
        b0k b0kVar2;
        List list3;
        xu30 xu30Var3;
        h311 h311VarV;
        List list4;
        xu30 xu30Var4;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objT;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1926335196);
        int i4 = (b0kVar3.i(eeo0Var) ? 4 : 2) | i | (b0kVar3.g(str) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            list2 = list;
        } else {
            list2 = list;
            i3 = i4 | (b0kVar3.g(list2) ? 256 : 128);
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                xu30Var2 = xu30Var;
                i3 |= b0kVar3.i(xu30Var2) ? 2048 : 1024;
            }
            b2 = 0;
            b3 = 1;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i5 != 0) {
                    list4 = z6x.a;
                } else {
                    list4 = list2;
                }
                if (i6 != 0) {
                    xu30Var4 = null;
                } else {
                    xu30Var4 = xu30Var2;
                }
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i3 & 896) != 256) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z4 = z2 | z3;
                objT = b0kVar3.T();
                if (z4 || objT == fkj0.X) {
                    objT = new r3j(str, list4, (byte) 4);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarA = s161.a(nim0.a, (iu30) objT);
                uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarA, uvx.a(uvxVar, (pgx) null, 3, new zzq0(0.0f, 12.0f, 0.0f, 12.0f), (vzq0) null, (tvx) null, (p3v) null, 499), null, false, null, null, null, null, null, apo.r(440432581, new ceo0(eeo0Var, b2), b0kVar3), null, apo.r(-155629404, new ceo0(eeo0Var, b3), b0kVar3), xu30Var4, null, null, apo.r(1402416672, new ceo0(eeo0Var, (byte) 2), b0kVar3), b0kVar2, 805306432, ((i3 >> 3) & 896) | 196656, 26108);
                list3 = list4;
                xu30Var3 = xu30Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                list3 = list2;
                xu30Var3 = xu30Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new m82(i, eeo0Var, str, list3, xu30Var3, i2, (byte) 2);
            }
        }
        i3 |= 3072;
        xu30Var2 = xu30Var;
        b2 = 0;
        b3 = 1;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i5 != 0) {
                list4 = z6x.a;
            } else {
                list4 = list2;
            }
            if (i6 != 0) {
                xu30Var4 = null;
            } else {
                xu30Var4 = xu30Var2;
            }
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 896) != 256) {
                z3 = false;
            } else {
                z3 = true;
            }
            z4 = z2 | z3;
            objT = b0kVar3.T();
            if (z4) {
                objT = new r3j(str, list4, (byte) 4);
                b0kVar3.s0(objT);
            } else {
                objT = new r3j(str, list4, (byte) 4);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarA2 = s161.a(nim0.a, (iu30) objT);
            uvx uvxVar2 = (uvx) b0kVar3.k(vvx.a);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarA2, uvx.a(uvxVar2, (pgx) null, 3, new zzq0(0.0f, 12.0f, 0.0f, 12.0f), (vzq0) null, (tvx) null, (p3v) null, 499), null, false, null, null, null, null, null, apo.r(440432581, new ceo0(eeo0Var, b2), b0kVar3), null, apo.r(-155629404, new ceo0(eeo0Var, b3), b0kVar3), xu30Var4, null, null, apo.r(1402416672, new ceo0(eeo0Var, (byte) 2), b0kVar3), b0kVar2, 805306432, ((i3 >> 3) & 896) | 196656, 26108);
            list3 = list4;
            xu30Var3 = xu30Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            list3 = list2;
            xu30Var3 = xu30Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m82(i, eeo0Var, str, list3, xu30Var3, i2, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(fuy0 fuy0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        mdr0 mdr0Var = fuy0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(945985692);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(fuy0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (mdr0Var instanceof ydr0) {
                x340Var.i0(-1440810416);
                h(null, x340Var, 0);
                x340Var.r(false);
            } else if (mdr0Var instanceof rdr0) {
                x340Var.i0(-1440808914);
                e(null, x340Var, 0);
                x340Var.r(false);
            } else {
                if (!(mdr0Var instanceof mdr0)) {
                    throw p3d1.k(x340Var, -1440811609, false);
                }
                x340Var.i0(-1440806994);
                mdr0 mdr0Var2 = mdr0Var;
                g(iu30Var, mdr0Var2.c, mdr0Var2.d, x340Var, ((i3 << 3) & 7168) | ((i3 >> 3) & 14));
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kuy0(fuy0Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void l(xfx xfxVar, u191 u191Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-669083126);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xfxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(u191Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(xfxVar) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new umr0(xfxVar, iu30Var, (byte) 7);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(u191Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new wvq0(u191Var, (byte) 21);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0Var, (iu30) objT2, x340Var, (i2 >> 3) & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(xfxVar, u191Var, qim0Var, iu30Var, i, (byte) 26);
        }
    }

    public static final void m(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        int i2;
        boolean z2;
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-474498964);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            jto1.b(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, raj.e, b0kVar3, 0, 196608, 32767);
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objT = b0kVar3.T();
            if (z3 || objT == m4cVar) {
                objT = new ccy0(iu30Var, (byte) 18);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            pm31 pm31Var = new pm31(2);
            boolean z4 = i4 == 256;
            Object objT2 = b0kVar3.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new ccy0(iu30Var, (byte) 19);
                b0kVar3.s0(objT2);
            }
            z2 = z;
            b0kVar2 = b0kVar3;
            qim0Var2 = qim0Var3;
            jto1.b(dgo1.q(qim0VarF, z, true, pm31Var, (Function0) objT2, 8), null, null, false, null, null, gbxVar, null, null, null, null, null, apo.r(1018668238, new epe0((byte) 12, z2), b0kVar3), null, null, raj.f, b0kVar2, 0, 196992, 28606);
            jto1.b(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, raj.g, b0kVar2, 0, 196608, 32767);
        } else {
            z2 = z;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new or3(z2, qim0Var2, iu30Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void n(fuy0 fuy0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1523659072);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(fuy0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qti1 qti1Var = voo1.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(voo1.y(qim0Var3, qti1Var), 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
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
            u(iu30Var, x340Var, (i3 >> 3) & 14);
            k(fuy0Var, iu30Var, null, x340Var, i3 & 126);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kuy0(fuy0Var, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void o(eeo0 eeo0Var, b0k b0kVar, int i) {
        eeo0 eeo0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2003946898);
        int i2 = (x340Var.i(eeo0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            eeo0Var2 = eeo0Var;
            j(eeo0Var2, f4i1.f(eeo0Var.c, ", ", eeo0Var.d), null, null, x340Var, i2 & 14, 12);
        } else {
            eeo0Var2 = eeo0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mrj(eeo0Var2, i);
        }
    }

    public static final void p(ql71 ql71Var, wl71 wl71Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        va71 va71Var = wl71Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1488455970);
        int i2 = i | (x340Var.i(ql71Var) ? 4 : 2) | (x340Var.g(wl71Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Class<?> cls = ql71Var.getClass();
            jd11 jd11Var = rc11.a;
            boolean zG = x340Var.g(jd11Var.b(cls));
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = (xpw) ql71Var.b().invoke();
                x340Var.s0(objT);
            }
            xpw xpwVar = (xpw) objT;
            x340Var.f0(182084263, jd11Var.b(ql71Var.getClass()));
            cmt cmtVar = va71Var.a;
            pl71 pl71Var = new pl71(wl71Var.b, wl71Var.c, wl71Var.d, wl71Var.h, cmtVar, va71Var, wl71Var.g, wl71Var.f);
            String string = jd11Var.b(ql71Var.getClass()).toString();
            cmt cmtVar2 = va71Var.a;
            ipb1 ipb1VarC = wpb1.C(string, xpwVar, new pl71(wl71Var.b, wl71Var.c, wl71Var.d, wl71Var.h, cmtVar2, va71Var, wl71Var.g, wl71Var.f), x340Var, 0, 8);
            qim0Var2 = nim0.a;
            otw.c(xpwVar, pl71Var, u291.z(u291.f(qim0Var2, 1.0f), (fra) null, 3), ipb1VarC, x340Var, 0, 0);
            x340Var.r(false);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(ql71Var, wl71Var, qim0Var2, i, (byte) 20);
        }
    }

    public static final void q(whb1 whb1Var, leh1 leh1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1231617329);
        int i2 = (x340Var.i(whb1Var) ? 4 : 2) | i | (x340Var.i(leh1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            j2h1.b(eqr0.E(dm5.I(et40.a), 16.0f), (ql3) null, apo.r(1655714195, new wpg1((Object) leh1Var, x340Var.k(p4k.b), (Object) whb1Var, (byte) 6), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new meh1(whb1Var, leh1Var, i, (byte) 5);
        }
    }

    public static final void r(tob1 tob1Var, err0 err0Var, float f, long j, float f2, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-716569373);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(tob1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(err0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            boolean zI = x340Var.i(tob1Var) | x340Var.i(err0Var) | ((57344 & i2) == 16384);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ja5((Object) tob1Var, (Object) err0Var, f2, (byte) 9);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = uyn1.B(dug.f(eqr0.B(qim0Var, (iu30) objT), j, d4o1.a), 0.0f, 0.0f, 0.0f, f, 7);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l((i2 >> 18) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pzb1(tob1Var, err0Var, f, j, f2, qim0Var, j2iVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:112:0x020d  */
    /* JADX WARN: Code duplicated, block: B:116:0x023c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0240  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0109  */
    /* JADX WARN: Code duplicated, block: B:87:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:93:0x017a  */
    /* JADX WARN: Code duplicated, block: B:94:0x017c  */
    /* JADX WARN: Code duplicated, block: B:98:0x018c  */
    public static final void s(tob1 tob1Var, j2i j2iVar, qim0 qim0Var, float f, long j, iu30 iu30Var, j2i j2iVar2, b0k b0kVar, int i, int i2) {
        int i3;
        float f2;
        long jA;
        iu30 iu30Var2;
        boolean z;
        qim0 qim0Var2;
        float f3;
        long j2;
        iu30 iu30Var3;
        h311 h311VarV;
        int i4;
        qim0 qim0Var3;
        iu30 iu30Var4;
        long j3;
        int i5;
        qim0 qim0Var4;
        Object objT;
        m4c m4cVar;
        Object objT2;
        kiv kivVar;
        float f4;
        float fX0;
        err0 err0Var;
        err0 err0Var2;
        int iU;
        int i6;
        boolean z2;
        boolean zE;
        Object objT3;
        gra graVar;
        gfh0 gfh0VarC;
        iu30 iu30Var5;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z3;
        n4k n4kVar;
        boolean zI;
        Object objT4;
        qim0 qim0VarU;
        boolean z4;
        boolean zI2;
        Object objT5;
        int i7;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(212162651);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.i(tob1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        int i8 = i3 | 384;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f2 = f;
                int i9 = x340Var.d(f2) ? 2048 : 1024;
                i8 |= i9;
            } else {
                f2 = f;
            }
            i8 |= i9;
        } else {
            f2 = f;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jA = j;
                int i10 = x340Var.f(jA) ? 16384 : 8192;
                i8 |= i10;
            } else {
                jA = j;
            }
            i8 |= i10;
        } else {
            jA = j;
        }
        int i11 = i2 & 32;
        if (i11 == 0) {
            if ((196608 & i) == 0) {
                iu30Var2 = iu30Var;
                i8 |= x340Var.i(iu30Var2) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                if (x340Var.i(j2iVar2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i8 |= i7;
            }
            if ((599187 & i8) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i8 & 1, z)) {
                x340Var.d0();
                i4 = i & 1;
                qim0Var3 = nim0.a;
                if (i4 != 0 || x340Var.E()) {
                    if ((i2 & 8) != 0) {
                        uwr uwrVar = cbx.a;
                        f2 = cbx.b(x340Var).b.e;
                        i8 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar2 = cbx.a;
                        jA = cbx.a(x340Var).a.a.a();
                        i8 &= -57345;
                    }
                    if (i11 != 0) {
                        j3 = jA;
                        iu30Var4 = null;
                    } else {
                        long j4 = jA;
                        iu30Var4 = iu30Var2;
                        j3 = j4;
                    }
                    i5 = i8;
                    qim0Var4 = qim0Var3;
                } else {
                    x340Var.b0();
                    if ((i2 & 8) != 0) {
                        i8 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i8 &= -57345;
                    }
                    long j5 = jA;
                    iu30Var4 = iu30Var2;
                    j3 = j5;
                    i5 = i8;
                    qim0Var4 = qim0Var;
                }
                x340Var.s();
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = bb00.h(0, x340Var);
                }
                err0 err0Var3 = (hdn0) objT;
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = bb00.h(0, x340Var);
                }
                err0 err0Var4 = (hdn0) objT2;
                WeakHashMap weakHashMap = osl1.x;
                float fA = poo1.x(lhc.g(x340Var).q, x340Var).a();
                kivVar = t4k.h;
                f4 = f2;
                fX0 = ((wat) x340Var.k(kivVar)).X0(fA);
                err0Var = err0Var4;
                err0Var2 = err0Var3;
                iU = jch0.U(fX0) + err0Var2.s() + err0Var.s();
                i6 = i5;
                Integer numValueOf = Integer.valueOf(iU);
                boolean zI3 = x340Var.i(err0Var);
                if ((i6 & 458752) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zE = zI3 | z2 | x340Var.e(iU);
                objT3 = x340Var.T();
                if (zE || objT3 == m4cVar) {
                    objT3 = new ju01(err0Var, iu30Var4, iU, (byte) 6);
                    x340Var.s0(objT3);
                }
                qxd0.i(numValueOf, (iu30) objT3, x340Var);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                iu30Var5 = iu30Var4;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var4);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                qim0 qim0Var5 = qim0Var4;
                z3 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z3) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                long j6 = j3;
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                if (iu30Var5 == null) {
                    x340Var.i0(-1760798979);
                    x340Var.r(false);
                    z4 = false;
                    qim0VarU = qim0Var3;
                } else {
                    x340Var.i0(-1760797945);
                    zI = x340Var.i(err0Var);
                    objT4 = x340Var.T();
                    if (zI || objT4 == m4cVar) {
                        objT4 = new k5r0(err0Var, (byte) 2);
                        x340Var.s0(objT4);
                    }
                    qim0VarU = lrn1.u(qim0Var3, (iu30) objT4);
                    z4 = false;
                    x340Var.r(false);
                }
                gfh0 gfh0VarC2 = t1c.c(graVar, z4);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarU);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                j2iVar2.invoke(new p3v(((wat) x340Var.k(kivVar)).M0(err0Var2.s())), x340Var, Integer.valueOf((i6 >> 15) & 112));
                x340Var.r(true);
                zI2 = x340Var.i(err0Var2);
                objT5 = x340Var.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new k5r0(err0Var2, (byte) 3);
                    x340Var.s0(objT5);
                }
                int i12 = i6 >> 3;
                r(tob1Var, err0Var2, f4, j6, fX0, ern1.x(qim0Var3, (iu30) objT5), apo.r(886966206, new j2r0(j2iVar, (byte) 22), x340Var), x340Var, (i6 & 14) | 1572864 | (i12 & 896) | (i12 & 7168));
                x340Var.r(true);
                f3 = f4;
                j2 = j6;
                iu30Var3 = iu30Var5;
                qim0Var2 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                f3 = f2;
                j2 = jA;
                iu30Var3 = iu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m9j0(tob1Var, j2iVar, qim0Var2, f3, j2, iu30Var3, j2iVar2, i, i2);
            }
        }
        i8 |= 196608;
        iu30Var2 = iu30Var;
        if ((i & 1572864) == 0) {
            if (x340Var.i(j2iVar2)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i8 |= i7;
        }
        if ((599187 & i8) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i8 & 1, z)) {
            x340Var.d0();
            i4 = i & 1;
            qim0Var3 = nim0.a;
            if (i4 != 0) {
                if ((i2 & 8) != 0) {
                    uwr uwrVar3 = cbx.a;
                    f2 = cbx.b(x340Var).b.e;
                    i8 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar4 = cbx.a;
                    jA = cbx.a(x340Var).a.a.a();
                    i8 &= -57345;
                }
                if (i11 != 0) {
                    j3 = jA;
                    iu30Var4 = null;
                } else {
                    long j7 = jA;
                    iu30Var4 = iu30Var2;
                    j3 = j7;
                }
                i5 = i8;
                qim0Var4 = qim0Var3;
            } else {
                if ((i2 & 8) != 0) {
                    uwr uwrVar5 = cbx.a;
                    f2 = cbx.b(x340Var).b.e;
                    i8 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar6 = cbx.a;
                    jA = cbx.a(x340Var).a.a.a();
                    i8 &= -57345;
                }
                if (i11 != 0) {
                    j3 = jA;
                    iu30Var4 = null;
                } else {
                    long j8 = jA;
                    iu30Var4 = iu30Var2;
                    j3 = j8;
                }
                i5 = i8;
                qim0Var4 = qim0Var3;
            }
            x340Var.s();
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var5 = (hdn0) objT;
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var6 = (hdn0) objT2;
            WeakHashMap weakHashMap2 = osl1.x;
            float fA2 = poo1.x(lhc.g(x340Var).q, x340Var).a();
            kivVar = t4k.h;
            f4 = f2;
            fX0 = ((wat) x340Var.k(kivVar)).X0(fA2);
            err0Var = err0Var6;
            err0Var2 = err0Var5;
            iU = jch0.U(fX0) + err0Var2.s() + err0Var.s();
            i6 = i5;
            Integer numValueOf3 = Integer.valueOf(iU);
            boolean zI4 = x340Var.i(err0Var);
            if ((i6 & 458752) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            zE = zI4 | z2 | x340Var.e(iU);
            objT3 = x340Var.T();
            if (zE) {
                objT3 = new ju01(err0Var, iu30Var4, iU, (byte) 6);
                x340Var.s0(objT3);
            } else {
                objT3 = new ju01(err0Var, iu30Var4, iU, (byte) 6);
                x340Var.s0(objT3);
            }
            qxd0.i(numValueOf3, (iu30) objT3, x340Var);
            graVar = een.d;
            gfh0VarC = t1c.c(graVar, false);
            iu30Var5 = iu30Var4;
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var4);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            qim0 qim0Var6 = qim0Var4;
            z3 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar6);
            Integer numValueOf4 = Integer.valueOf(iHashCode);
            long j9 = j3;
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf4, x340Var, lljVar7);
            nko1.F(x340Var);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar8);
            if (iu30Var5 == null) {
                x340Var.i0(-1760798979);
                x340Var.r(false);
                z4 = false;
                qim0VarU = qim0Var3;
            } else {
                x340Var.i0(-1760797945);
                zI = x340Var.i(err0Var);
                objT4 = x340Var.T();
                if (zI) {
                    objT4 = new k5r0(err0Var, (byte) 2);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new k5r0(err0Var, (byte) 2);
                    x340Var.s0(objT4);
                }
                qim0VarU = lrn1.u(qim0Var3, (iu30) objT4);
                z4 = false;
                x340Var.r(false);
            }
            gfh0 gfh0VarC3 = t1c.c(graVar, z4);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarU);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar5);
            nko1.H(xos0VarM3, x340Var, lljVar6);
            x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar8);
            j2iVar2.invoke(new p3v(((wat) x340Var.k(kivVar)).M0(err0Var2.s())), x340Var, Integer.valueOf((i6 >> 15) & 112));
            x340Var.r(true);
            zI2 = x340Var.i(err0Var2);
            objT5 = x340Var.T();
            if (zI2) {
                objT5 = new k5r0(err0Var2, (byte) 3);
                x340Var.s0(objT5);
            } else {
                objT5 = new k5r0(err0Var2, (byte) 3);
                x340Var.s0(objT5);
            }
            int i13 = i6 >> 3;
            r(tob1Var, err0Var2, f4, j9, fX0, ern1.x(qim0Var3, (iu30) objT5), apo.r(886966206, new j2r0(j2iVar, (byte) 22), x340Var), x340Var, (i6 & 14) | 1572864 | (i13 & 896) | (i13 & 7168));
            x340Var.r(true);
            f3 = f4;
            j2 = j9;
            iu30Var3 = iu30Var5;
            qim0Var2 = qim0Var6;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            f3 = f2;
            j2 = jA;
            iu30Var3 = iu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m9j0(tob1Var, j2iVar, qim0Var2, f3, j2, iu30Var3, j2iVar2, i, i2);
        }
    }

    public static final void t(whb1 whb1Var, leh1 leh1Var, b0k b0kVar, int i) {
        whb1 whb1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-297113733);
        int i2 = (x340Var.i(whb1Var) ? 4 : 2) | i | (x340Var.i(leh1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            whb1Var2 = whb1Var;
            lmt0.i(leh1Var != null ? leh1Var.e : new tw21(2131100353), 2131231052, whb1Var2, leh1Var != null ? leh1Var.d : null, x340Var, (i2 << 6) & 896, 8);
        } else {
            whb1Var2 = whb1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new meh1(whb1Var2, leh1Var, i, (byte) 6);
        }
    }

    public static final void u(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(29227105);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ccy0(iu30Var, (byte) 20);
                x340Var.s0(objT);
            }
            wro1.l(new gbx(z50.c, (Function0) objT), h2c.a.a(nim0Var, een.g), null, null, null, raj.a, x340Var, 196608, 28);
            String strO0 = cwl1.o0(x340Var, 2131960728);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new luy0(iu30Var, i, (byte) 0);
        }
    }

    public static final void v(whb1 whb1Var, gt40 gt40Var, leh1 leh1Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        gt40 gt40Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-778091160);
        int i2 = (b0kVar3.i(whb1Var) ? 4 : 2) | i | 48 | (b0kVar3.i(leh1Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            long j = ((s3v) b0kVar3.k(p4k.a)).a;
            gt40 gt40Var3 = et40.a;
            gt40 gt40VarK = leh1Var != null ? ila0.k(dm5.I(gt40Var3), leh1Var.a) : ila0.k(dm5.I(gt40Var3), new tw21(2131100246));
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = hzg1.O0;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            j2h1.b(iko1.x(gt40VarK, (iu30) objT), ql3.c, apo.r(-1341656118, new qi6(j, (Object) whb1Var, (Object) leh1Var, (byte) 18), b0kVar3), b0kVar2, 384, 0);
            gt40Var2 = gt40Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            gt40Var2 = gt40Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1((Object) whb1Var, (Object) gt40Var2, (Object) leh1Var, i, (byte) 7);
        }
    }

    public static final void w(int i, max maxVar, max maxVar2, String str, String str2, String str3, String str4, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        p3v p3vVar;
        Object obj;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(293002915);
        int i3 = i2 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.i(maxVar) ? 32 : 16) | (b0kVar3.i(maxVar2) ? 256 : 128) | (b0kVar3.g(str) ? 2048 : 1024) | (b0kVar3.g(str2) ? 16384 : 8192) | (b0kVar3.g(str3) ? 131072 : 65536) | (b0kVar3.g(str4) ? 1048576 : 524288) | (b0kVar3.i(function0) ? 8388608 : 4194304) | (b0kVar3.i(function1) ? 67108864 : 33554432) | (b0kVar3.i(qim0Var) ? 536870912 : 268435456);
        if (b0kVar3.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            yae1 yae1VarQ = d5p1.q(0, b0kVar3, 1);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            lee1 lee1Var = (lee1) b0kVar3.k(rgx.a);
            boolean zG = b0kVar3.g(lee1Var) | b0kVar3.g(watVar);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                Iterator it = p7h.M(new String[]{"0", "1", "2", "3"}).iterator();
                if (!it.hasNext()) {
                    hhg1.k();
                    return;
                }
                p3v p3vVar2 = new p3v(watVar.M0((int) (yae1.a(yae1VarQ, (String) it.next(), lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32)));
                loop0: while (true) {
                    p3vVar = p3vVar2;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        p3vVar2 = new p3v(watVar.M0((int) (yae1.a(yae1VarQ, (String) it.next(), lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32)));
                        if (p3vVar.compareTo(p3vVar2) < 0) {
                        }
                    }
                }
                b0kVar3.s0(p3vVar);
                obj = p3vVar;
            } else {
                obj = objT;
            }
            float f = ((p3v) obj).a;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            gdx gdxVarS = yla.s(b0kVar3);
            jdx jdxVar = jdx.c;
            boolean z = (i3 & 234881024) == 67108864;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new kek0(function1, (byte) 17);
                b0kVar3.s0(objT2);
            }
            wro1.h(P(str2, (Function0) objT2), jdxVar, null, maxVar, gdxVarS, null, false, null, null, apo.r(1562315614, new tej0(str, (byte) 16), b0kVar3), b0kVar3, (i3 << 9) & 57344, 6, 972);
            uwo1.e(String.valueOf(i), u291.v(nim0.a, f), null, 0L, new a0e1(3), null, 0, false, new cjc0(1), 0, null, b0kVar3, 0, 0, 1772);
            b0kVar2 = b0kVar3;
            gdx gdxVarS2 = yla.s(b0kVar2);
            boolean z2 = (i3 & 29360128) == 8388608;
            Object objT3 = b0kVar2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new kek0(function0, (byte) 18);
                b0kVar2.s0(objT3);
            }
            wro1.h(P(str4, (Function0) objT3), jdxVar, null, maxVar2, gdxVarS2, null, false, null, null, apo.r(1966747861, new tej0(str3, (byte) 17), b0kVar2), b0kVar2, (i3 << 6) & 57344, 6, 972);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ne00(i, maxVar, maxVar2, str, str2, str3, str4, function0, function1, qim0Var, i2);
        }
    }

    public static final void x(rul1 rul1Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(255821683);
        int i2 = (b0kVar3.i(rul1Var) ? 4 : 2) | i;
        nim0 nim0Var = nim0.a;
        int i3 = i2 | (b0kVar3.i(nim0Var) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128);
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131960729);
            int i4 = i3 & 896;
            boolean zI = (i4 == 256) | b0kVar3.i(rul1Var);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new muy0(iu30Var, rul1Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(new y50(strO0), (Function0) objT);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            boolean z = rul1Var.c;
            pm31 pm31Var = new pm31(3);
            boolean zI2 = (i4 == 256) | b0kVar3.i(rul1Var);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new muy0(iu30Var, rul1Var, (byte) 1);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            jto1.b(dgo1.q(qim0VarF, z, true, pm31Var, (Function0) objT2, 8), null, null, false, null, null, gbxVar, null, raj.d, null, null, null, apo.r(-480035110, new nuy0(rul1Var, (byte) 0), b0kVar3), null, null, apo.r(-1625394761, new nuy0(rul1Var, (byte) 1), b0kVar3), b0kVar2, 100663296, 196992, 28350);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(rul1Var, iu30Var, i, (byte) 8);
        }
    }

    public static zko1 y(int i) {
        if (i != 0) {
            return i != 1 ? new gr31() : new bto();
        }
        return new gr31();
    }

    public static gr31 z() {
        return new gr31();
    }

    public bvn1 Q(yyn1 yyn1Var) {
        return (bvn1) fvn1.f.getAndSet(yyn1Var, bvn1.d);
    }

    public ivn1 R(yyn1 yyn1Var) {
        return (ivn1) fvn1.e.getAndSet(yyn1Var, ivn1.c);
    }

    public void S(ivn1 ivn1Var, ivn1 ivn1Var2) {
        fvn1.d.lazySet(ivn1Var, ivn1Var2);
    }

    public void T(ivn1 ivn1Var, Thread thread) {
        fvn1.c.lazySet(ivn1Var, thread);
    }

    public boolean U(yyn1 yyn1Var, bvn1 bvn1Var, bvn1 bvn1Var2) {
        return lgo1.x(fvn1.f, yyn1Var, bvn1Var, bvn1Var2);
    }

    public boolean V(nvn1 nvn1Var, Object obj, Object obj2) {
        return lgo1.x(fvn1.g, nvn1Var, obj, obj2);
    }

    public boolean W(nvn1 nvn1Var, ivn1 ivn1Var, ivn1 ivn1Var2) {
        return lgo1.x(fvn1.e, nvn1Var, ivn1Var, ivn1Var2);
    }
}
