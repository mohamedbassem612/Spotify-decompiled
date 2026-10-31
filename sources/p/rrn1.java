package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
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
import androidx.compose.ui.unit.TextUnit;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rrn1 {
    public static final lgq0 a = new lgq0();
    public static b180 b;

    public static final oe5 A(oe5 oe5Var) {
        return oe5Var.c();
    }

    public static final e5l0 B(b0k b0kVar) {
        utk0 utk0VarC = mno1.C((op80) gfe0.a(b0kVar).getValue());
        return new e5l0(utk0VarC instanceof utk0 ? utk0VarC : null, (byte) 17);
    }

    public static final Bundle C(String str, List list, te30 te30Var, boolean z, String str2) {
        Bundle bundle = new Bundle();
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                bundle.putStringArrayList("martini-chat-suggestions", new ArrayList<>(list));
            }
        }
        if (te30Var != null) {
            bundle.putParcelable("martini-intent-groups", te30Var);
        }
        if (z) {
            bundle.putBoolean("martini-start-new-chat", true);
        }
        if (str != null && !ihc1.y0(str)) {
            bundle.putParcelable("martini-launch-parameters", new j6h0(str));
        }
        if (str2 != null) {
            if (ihc1.y0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                bundle.putString("martini-source-surface-uri", str2);
            }
        }
        bundle.putBoolean("martini-open-with-keyboard", true);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b3 A[Catch: all -> 0x0147, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0147, blocks: (B:3:0x000a, B:5:0x0018, B:6:0x0020, B:16:0x0077, B:18:0x0081, B:66:0x0146, B:62:0x013f, B:69:0x014b, B:97:0x01a6, B:100:0x01b3, B:95:0x01a1, B:107:0x01bf, B:110:0x01cb, B:111:0x01d2, B:112:0x01d3, B:113:0x01d6, B:114:0x01d7, B:115:0x01ec, B:92:0x019c, B:19:0x008a, B:21:0x0093, B:24:0x00a4, B:50:0x0129, B:46:0x0122, B:53:0x012d, B:54:0x0132, B:7:0x0029, B:9:0x0032, B:15:0x0058, B:104:0x01b7, B:105:0x01bc, B:59:0x013a), top: B:129:0x000a, inners: #0, #5, #9, #13 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a6 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #3 {all -> 0x0147, blocks: (B:3:0x000a, B:5:0x0018, B:6:0x0020, B:16:0x0077, B:18:0x0081, B:66:0x0146, B:62:0x013f, B:69:0x014b, B:97:0x01a6, B:100:0x01b3, B:95:0x01a1, B:107:0x01bf, B:110:0x01cb, B:111:0x01d2, B:112:0x01d3, B:113:0x01d6, B:114:0x01d7, B:115:0x01ec, B:92:0x019c, B:19:0x008a, B:21:0x0093, B:24:0x00a4, B:50:0x0129, B:46:0x0122, B:53:0x012d, B:54:0x0132, B:7:0x0029, B:9:0x0032, B:15:0x0058, B:104:0x01b7, B:105:0x01bc, B:59:0x013a), top: B:129:0x000a, inners: #0, #5, #9, #13 }] */
    public static final j4n1 D(s8s0 s8s0Var, i520 i520Var, iu30 iu30Var) {
        ff01 ff01Var;
        Throwable th;
        Throwable th2;
        Throwable th3;
        wia0 wia0VarH = i520Var.h(s8s0Var);
        try {
            long size = wia0VarH.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + wia0VarH.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                ff01 ff01Var2 = new ff01(wia0VarH.a(j));
                try {
                    if (ff01Var2.h() == 101010256) {
                        int iM = ff01Var2.m() & 65535;
                        int iM2 = ff01Var2.m() & 65535;
                        long jM = ff01Var2.m() & 65535;
                        if (jM != (ff01Var2.m() & 65535) || iM != 0 || iM2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        ff01Var2.skip(4L);
                        long jH = ((long) ff01Var2.h()) & 4294967295L;
                        int iM3 = ff01Var2.m() & 65535;
                        x1c x1cVar = new x1c(iM3, jM, jH);
                        ff01Var2.o(iM3);
                        ff01Var2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            ff01 ff01Var3 = new ff01(wia0VarH.a(j3));
                            try {
                                if (ff01Var3.h() == 117853008) {
                                    int iH = ff01Var3.h();
                                    long jI = ff01Var3.i();
                                    if (ff01Var3.h() != 1 || iH != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    ff01 ff01Var4 = new ff01(wia0VarH.a(jI));
                                    try {
                                        int iH2 = ff01Var4.h();
                                        if (iH2 != 101075792) {
                                            throw new IOException("bad zip: expected " + z(101075792) + " but was " + z(iH2));
                                        }
                                        ff01Var4.skip(12L);
                                        int iH3 = ff01Var4.h();
                                        int iH4 = ff01Var4.h();
                                        long jI2 = ff01Var4.i();
                                        if (jI2 != ff01Var4.i() || iH3 != 0 || iH4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        ff01Var4.skip(8L);
                                        x1c x1cVar2 = new x1c(iM3, jI2, ff01Var4.i());
                                        try {
                                            ff01Var4.close();
                                            th3 = null;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                        }
                                        x1cVar = x1cVar2;
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            ff01Var4.close();
                                        } catch (Throwable th6) {
                                            j2h1.h(th5, th6);
                                        }
                                        th3 = th5;
                                    }
                                }
                                try {
                                    ff01Var3.close();
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    ff01Var3.close();
                                } catch (Throwable th9) {
                                    j2h1.h(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        ff01 ff01Var5 = new ff01(wia0VarH.a(x1cVar.b));
                        try {
                            long j4 = x1cVar.a;
                            while (j2 < j4) {
                                i4n1 i4n1VarF = F(ff01Var5);
                                ff01Var = ff01Var5;
                                try {
                                    if (i4n1VarF.h >= x1cVar.b) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (((Boolean) iu30Var.invoke(i4n1VarF)).booleanValue()) {
                                        arrayList.add(i4n1VarF);
                                    }
                                    j2++;
                                    ff01Var5 = ff01Var;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    try {
                                        ff01Var.close();
                                    } catch (Throwable th11) {
                                        j2h1.h(th, th11);
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    j4n1 j4n1Var = new j4n1(s8s0Var, i520Var, v(arrayList));
                                    try {
                                        wia0VarH.close();
                                    } catch (Throwable unused) {
                                    }
                                    return j4n1Var;
                                }
                            }
                            try {
                                ff01Var5.close();
                                th = null;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            ff01Var = ff01Var5;
                        }
                        if (th == null) {
                            throw th;
                        }
                        j4n1 j4n1Var2 = new j4n1(s8s0Var, i520Var, v(arrayList));
                        wia0VarH.close();
                        return j4n1Var2;
                    }
                    ff01Var2.close();
                    j--;
                } catch (Throwable th14) {
                    ff01Var2.close();
                    throw th14;
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th15) {
            if (wia0VarH == null) {
                throw th15;
            }
            try {
                wia0VarH.close();
                throw th15;
            } catch (Throwable th16) {
                j2h1.h(th15, th16);
                throw th15;
            }
        }
    }

    public static final ArrayList E(xwx0 xwx0Var) {
        List listQ0 = ihc1.Q0(xwx0Var.c, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(q7h.U(listQ0, 10));
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            arrayList.add(ihc1.e1((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final i4n1 F(ff01 ff01Var) throws IOException {
        int iH = ff01Var.h();
        if (iH != 33639248) {
            throw new IOException("bad zip: expected " + z(33639248) + " but was " + z(iH));
        }
        ff01Var.skip(4L);
        short sM = ff01Var.m();
        int i = sM & 65535;
        if ((sM & 1) != 0) {
            k220.i("unsupported zip: general purpose bit flag=".concat(z(i)));
            return null;
        }
        int iM = ff01Var.m() & 65535;
        int iM2 = ff01Var.m() & 65535;
        int iM3 = ff01Var.m() & 65535;
        long jH = ((long) ff01Var.h()) & 4294967295L;
        o811 o811Var = new o811();
        o811Var.a = ((long) ff01Var.h()) & 4294967295L;
        o811 o811Var2 = new o811();
        o811Var2.a = ((long) ff01Var.h()) & 4294967295L;
        int iM4 = ff01Var.m() & 65535;
        int iM5 = ff01Var.m() & 65535;
        int iM6 = ff01Var.m() & 65535;
        ff01Var.skip(8L);
        o811 o811Var3 = new o811();
        o811Var3.a = ((long) ff01Var.h()) & 4294967295L;
        String strO = ff01Var.o(iM4);
        if (ihc1.i0(strO, (char) 0)) {
            k220.i("bad zip: filename contains 0x00");
            return null;
        }
        long j = o811Var2.a == 4294967295L ? 8L : 0L;
        if (o811Var.a == 4294967295L) {
            j += 8;
        }
        if (o811Var3.a == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        p811 p811Var = new p811();
        p811 p811Var2 = new p811();
        p811 p811Var3 = new p811();
        l811 l811Var = new l811();
        G(ff01Var, iM5, new l4n1(l811Var, j2, o811Var2, ff01Var, o811Var, o811Var3, p811Var, p811Var2, p811Var3));
        if (j2 > 0 && !l811Var.a) {
            k220.i("bad zip: zip64 extra required but absent");
            return null;
        }
        String strO2 = ff01Var.o(iM6);
        String str = s8s0.b;
        return new i4n1(gtv0.f("/").e(strO), nhc1.R(strO, "/", false), strO2, jH, o811Var.a, o811Var2.a, iM, o811Var3.a, iM3, iM2, (Long) p811Var.a, (Long) p811Var2.a, (Long) p811Var3.a, 57344);
    }

    public static final void G(ff01 ff01Var, int i, vu30 vu30Var) {
        nac nacVar = ff01Var.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                k220.i("bad zip: truncated header in extra field");
                return;
            }
            int iM = ff01Var.m() & 65535;
            long jM = ((long) ff01Var.m()) & 65535;
            long j2 = j - 4;
            if (j2 < jM) {
                k220.i("bad zip: truncated value in extra field");
                return;
            }
            ff01Var.q(jM);
            long j3 = nacVar.b;
            vu30Var.invoke(Integer.valueOf(iM), Long.valueOf(jM));
            long j4 = (nacVar.b + jM) - j3;
            if (j4 < 0) {
                k220.i(f4i1.c(iM, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    nacVar.skip(j4);
                }
                j = j2 - jM;
            }
        }
    }

    public static final i4n1 H(ff01 ff01Var, i4n1 i4n1Var) throws IOException {
        int iH = ff01Var.h();
        if (iH != 67324752) {
            throw new IOException("bad zip: expected " + z(67324752) + " but was " + z(iH));
        }
        ff01Var.skip(2L);
        short sM = ff01Var.m();
        int i = sM & 65535;
        if ((sM & 1) != 0) {
            k220.i("unsupported zip: general purpose bit flag=".concat(z(i)));
            return null;
        }
        ff01Var.skip(18L);
        long jM = ((long) ff01Var.m()) & 65535;
        int iM = ff01Var.m() & 65535;
        ff01Var.skip(jM);
        if (i4n1Var == null) {
            ff01Var.skip(iM);
            return null;
        }
        p811 p811Var = new p811();
        p811 p811Var2 = new p811();
        p811 p811Var3 = new p811();
        G(ff01Var, iM, new k4n1(ff01Var, p811Var, p811Var2, p811Var3));
        return new i4n1(i4n1Var.a, i4n1Var.b, i4n1Var.c, i4n1Var.d, i4n1Var.e, i4n1Var.f, i4n1Var.g, i4n1Var.h, i4n1Var.i, i4n1Var.j, i4n1Var.k, i4n1Var.l, i4n1Var.m, (Integer) p811Var.a, (Integer) p811Var2.a, (Integer) p811Var3.a);
    }

    public static final e6d I(ca10 ca10Var, d6d d6dVar) {
        int i;
        goj0 goj0VarA;
        ca10 ca10Var2 = ca10Var;
        ioj0 ioj0Var = ca10Var2.a;
        if (ioj0Var == null) {
            hhg1.n("Metadata is null");
            return null;
        }
        ArrayList arrayList = d6dVar.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            hoj0 hoj0VarC = ioj0Var.c(gw81.class, (String) next);
            if (hoj0VarC != null ? hoj0VarC instanceof goj0 : false) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                return new e6d(d6dVar.a, arrayList3, d6dVar.b);
            }
            Object next2 = it2.next();
            i = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            String str = (String) next2;
            hoj0 hoj0VarC2 = ioj0Var.c(gw81.class, str);
            ez00 ez00Var = (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA.a;
            if (ez00Var == null) {
                hhg1.f(f4i1.f(gw81.class.getSimpleName(), " not found for uri: ", str));
                return null;
            }
            gw81 gw81Var = (gw81) ez00Var;
            hwt hwtVar = ca10Var2.b;
            boolean z = hwtVar != null ? hwtVar.d : true;
            n1x n1xVar = d6dVar.d;
            String str2 = gw81Var.b;
            String str3 = gw81Var.c;
            String str4 = gw81Var.a;
            String str5 = gw81Var.h;
            String str6 = gw81Var.d;
            String str7 = gw81Var.k;
            String str8 = gw81Var.l;
            sod1 sod1Var = (sod1) o7h.s0(gw81Var.f);
            arrayList3.add(new x5d(i2, str2, str3, str4, str5, str6, str7, str8, z, n1xVar, sod1Var != null ? sod1Var.a : null));
            ca10Var2 = ca10Var;
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(String str, String str2, vu30 vu30Var, vu30 vu30Var2, gbx gbxVar, boolean z, boolean z2, int i, b0k b0kVar, int i2) {
        int i3;
        boolean z3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2001074963);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(vu30Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(gbxVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            z3 = z2;
            i3 |= x340Var.h(z3) ? 1048576 : 524288;
        } else {
            z3 = z2;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= x340Var.e(i) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.i0(-1112298824);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            int iU = jch0.U(watVar.X0(16.0f));
            x340Var.r(false);
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            Function0 function0 = (Function0) x340Var.k(alg0.g);
            x340Var.i0(-1112289273);
            lee1 lee1Var = cbx.d(x340Var).j;
            cpr0 cpr0Var = lee1Var.b;
            int iU2 = jch0.U(watVar.X0(watVar.U0() * (TextUnit.e(cpr0Var.c) ? TextUnit.c(cpr0Var.c) : TextUnit.c(lee1Var.a.b) * 1.4f)));
            x340Var.r(false);
            boolean zE = ((i3 & 3670016) == 1048576) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048) | x340Var.e(iU) | ((458752 & i3) == 131072) | ((i3 & 14) == 4) | ((i3 & 896) == 256) | x340Var.e(iU2) | ((i3 & 112) == 32) | x340Var.i(yae1VarQ) | x340Var.g(function0) | x340Var.i(gbxVar);
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                i4 = 1;
                omg0 omg0Var = new omg0(i, vu30Var2, iU, z, vu30Var, iU2, str2, gbxVar, str, yae1VarQ, function0, z3);
                x340Var.s0(omg0Var);
                objT = omg0Var;
            } else {
                i4 = 1;
            }
            ejo1.l(0, i4, x340Var, (vu30) objT, null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dkd0(str, str2, vu30Var, vu30Var2, gbxVar, z, z2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:91:0x012e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x013e  */
    public static final void c(int i, o17 o17Var, float f, boolean z, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        float f2;
        float f3;
        int iC;
        float f4;
        int iC2;
        float f5;
        Context context;
        int iC3;
        long jE;
        float f6;
        g07 g07VarA;
        b0k b0kVar3 = (x340) b0kVar;
        int i3 = i2 | (kk0.t(-1875772240, i, b0kVar3) ? 4 : 2) | (b0kVar3.i(o17Var) ? 32 : 16) | (b0kVar3.d(f) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024);
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            y37 y37Var = (i == 1 && ((o17Var instanceof l07) || (o17Var instanceof u07))) ? y37.c : a47.c;
            String str = (o17Var == null || (g07VarA = o17Var.a()) == null) ? null : g07VarA.a;
            if (str == null) {
                str = "";
            }
            Uri uri = Uri.parse(str);
            int iC4 = l1d.C(i);
            if (iC4 == 0) {
                if (z) {
                    f3 = 0.063f;
                } else {
                    f2 = f * 0.0f;
                }
                float f7 = f2;
                iC = l1d.C(i);
                if (iC != 0) {
                    if (iC != 1) {
                        f6 = 0.047f;
                    } else {
                        if (iC == 2) {
                            eg.o();
                            return;
                        }
                        f6 = 0.0958f;
                    }
                    f4 = f6 * f;
                } else {
                    f4 = f * 0.0f;
                }
                qim0 qim0VarB = uyn1.B(nim0.a, f7, f4, 0.0f, z ? f * 0.203f : 0.0f, 4);
                iC2 = l1d.C(i);
                if (iC2 != 0) {
                    if (iC2 != 1) {
                        if (iC2 == 2) {
                            eg.o();
                            return;
                        } else if (z) {
                            f5 = 0.609f;
                        } else {
                            f5 = 0.625f;
                        }
                    } else if (z) {
                        f5 = 0.703f;
                    } else {
                        f5 = 0.75f;
                    }
                } else if (z) {
                    f5 = 0.796f;
                } else {
                    f5 = 0.875f;
                }
                qim0 qim0VarM = u291.m(qim0VarB, f5 * f);
                cr31 cr31Var = (cr31) ((k9) y37Var).b;
                qim0 qim0VarO = sto1.o(qim0VarM, 4.0f, cr31Var, true, 0L, 0L, 24);
                context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
                iC3 = l1d.C(i);
                if (iC3 != 0) {
                    jE = z4p1.e(context.getColor(2131101503));
                } else if (iC3 != 1) {
                    jE = z4p1.e(context.getColor(2131101502));
                } else {
                    if (iC3 == 2) {
                        eg.o();
                        return;
                    }
                    jE = z4p1.e(context.getColor(2131101501));
                }
                b0kVar2 = b0kVar3;
                eso1.e(uri, isl.a, i1p1.q(dug.f(qim0VarO, jE, cr31Var), cr31Var), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, oux.a, false, false, b0kVar2, 48, 0, 3576);
            } else if (iC4 == 1) {
                f3 = z ? 0.234f : 0.187f;
            } else {
                if (iC4 != 2) {
                    eg.o();
                    return;
                }
                f3 = z ? 0.391f : 0.375f;
            }
            f2 = f3 * f;
            float f8 = f2;
            iC = l1d.C(i);
            if (iC != 0) {
                if (iC != 1) {
                    f6 = 0.047f;
                } else {
                    if (iC == 2) {
                        eg.o();
                        return;
                    }
                    f6 = 0.0958f;
                }
                f4 = f6 * f;
            } else {
                f4 = f * 0.0f;
            }
            qim0 qim0VarB2 = uyn1.B(nim0.a, f8, f4, 0.0f, z ? f * 0.203f : 0.0f, 4);
            iC2 = l1d.C(i);
            if (iC2 != 0) {
                if (iC2 != 1) {
                    if (iC2 == 2) {
                        eg.o();
                        return;
                    } else if (z) {
                        f5 = 0.609f;
                    } else {
                        f5 = 0.625f;
                    }
                } else if (z) {
                    f5 = 0.703f;
                } else {
                    f5 = 0.75f;
                }
            } else if (z) {
                f5 = 0.796f;
            } else {
                f5 = 0.875f;
            }
            qim0 qim0VarM2 = u291.m(qim0VarB2, f5 * f);
            cr31 cr31Var2 = (cr31) ((k9) y37Var).b;
            qim0 qim0VarO2 = sto1.o(qim0VarM2, 4.0f, cr31Var2, true, 0L, 0L, 24);
            context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            iC3 = l1d.C(i);
            if (iC3 != 0) {
                jE = z4p1.e(context.getColor(2131101503));
            } else if (iC3 != 1) {
                jE = z4p1.e(context.getColor(2131101502));
            } else {
                if (iC3 == 2) {
                    eg.o();
                    return;
                }
                jE = z4p1.e(context.getColor(2131101501));
            }
            b0kVar2 = b0kVar3;
            eso1.e(uri, isl.a, i1p1.q(dug.f(qim0VarO2, jE, cr31Var2), cr31Var2), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, oux.a, false, false, b0kVar2, 48, 0, 3576);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mh6(i, o17Var, f, z, qim0Var, i2);
        }
    }

    public static final void d(int i, String str, String str2, b0k b0kVar, gbx gbxVar, boolean z) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-712379220);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.i(gbxVar) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = nim0.a;
            if (z) {
                qim0VarF = u291.f(qim0VarF, 1.0f);
            }
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = ujf0.b1;
                b0kVar3.s0(objT);
            }
            kgx kgxVar = new kgx(0, (vu30) objT, (vu30) null, (vu30) null, 13);
            vzq0.a.getClass();
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarF, (tl3) null, d4o1.a, kgxVar, uzq0.b, (max) null, false, (idn0) null, ny3.a, gbxVar, (gbx) null, apo.r(1484281763, new ay00(z, str, str2, (byte) 1), b0kVar3), b0kVar2, (i2 << 21) & 1879048192, 48, 1250);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c0e0(str, str2, gbxVar, z, i);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1591891479);
        if (x340Var.Y(i & 1, i != 0)) {
            plx plxVar = plx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(plxVar, isl.a, u291.m(nim0.a, 16.0f), j, 0L, false, x340Var, plx.d | 48, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 15);
        }
    }

    public static final void f(String str, b0k b0kVar, int i) {
        qim0 qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1052076431);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
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
            if (str != null) {
                x340Var.i0(1077990691);
                boolean z = (i2 & 14) == 4;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = Uri.parse(str);
                    x340Var.s0(objT);
                }
                qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
                uwr uwrVar = cbx.a;
                cbx.a.getClass();
                qim0Var = qim0Var2;
                eso1.e((Uri) objT, isl.a, qim0VarF2, (p3v) null, (zvx) null, uwr.b(), mif1.S0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 3992);
                x340Var.r(false);
            } else {
                qim0Var = qim0Var2;
                x340Var.i0(1078300660);
                qim0 qim0VarF3 = u291.f(qim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cbx.a.getClass();
                t1c.a(dug.f(hno1.f(qim0VarF3, uwr.b()), cbx.a(x340Var).a.a.a(), d4o1.a), x340Var, 0);
                x340Var.r(false);
            }
            String strO0 = cwl1.o0(x340Var, 2131955398);
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.x(qim0Var, 16.0f), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qeu(str, i);
        }
    }

    public static final void g(Drawable drawable, float f, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-856374304);
        int i2 = i | (x340Var.i(drawable) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            float f2 = 0.373f * f;
            int iI0 = ((wat) x340Var.k(t4k.h)).i0(f2);
            int i3 = iI0 >= 1 ? iI0 : 1;
            boolean zG = x340Var.g(drawable) | x340Var.e(i3);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new yk4(mno1.y(drawable, i3, i3, Bitmap.Config.ARGB_8888));
                x340Var.s0(objT);
            }
            qim0 qim0VarM = u291.m(qim0Var, f2);
            a47 a47Var = a47.c;
            eso1.f((yk4) objT, isl.a, i1p1.q(sto1.o(qim0VarM, 4.0f, (cr31) ((k9) a47Var).b, true, 0L, 0L, 24), (cr31) ((k9) a47Var).b), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 48, 504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gf(drawable, f, qim0Var, i, (byte) 12);
        }
    }

    public static final void h(String str, float f, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(215624167);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.d(f) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Uri uri = Uri.parse(str);
            qim0 qim0VarM = u291.m(qim0Var, 0.373f * f);
            a47 a47Var = a47.c;
            b0kVar2 = b0kVar3;
            eso1.e(uri, isl.a, i1p1.q(sto1.o(qim0VarM, 4.0f, (cr31) ((k9) a47Var).b, true, 0L, 0L, 24), (cr31) ((k9) a47Var).b), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar2, 48, 0, 4088);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new exs0(str, f, qim0Var, i, (byte) 1);
        }
    }

    public static final void i(d6w d6wVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        String strN0;
        j2i j2iVarR;
        String str = d6wVar.a;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(155476927);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(d6wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= b0kVar3.i(nim0Var) ? 256 : 128;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String str2 = d6wVar.b;
            String str3 = d6wVar.g;
            boolean zG = b0kVar3.g(str);
            Object objT = b0kVar3.T();
            if (zG || objT == obj) {
                objT = zg90.c(str).a;
                b0kVar3.s0(objT);
            }
            String str4 = (String) objT;
            if (str3 != null) {
                b0kVar3.i0(1838664249);
                strN0 = cwl1.n0(2131955395, new Object[]{str2, str3, str4}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1838838128);
                strN0 = cwl1.n0(2131955396, new Object[]{str2, str4}, b0kVar3);
                b0kVar3.r(false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            boolean zG2 = b0kVar3.g(strN0);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == obj) {
                objT2 = new kov(strN0, (byte) 2);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT2);
            mgx mgxVar = mgx.e;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(16.0f);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            ydx ydxVar = new ydx(12.0f, 12.0f, 12.0f, uyn1.j(0.0f, 0.0f, 0.0f, 16.0f, 7), wdx.a);
            gbx gbxVar = new gbx(z50.c, function0);
            if (str3 != null) {
                b0kVar3.i0(1839883913);
                j2iVarR = apo.r(-1059142737, new y5w(d6wVar, qim0VarZ, b2), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1840130797);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarB, mgxVar, ydxVar, cr31VarB, null, null, null, gbxVar, null, apo.r(1897174948, new oat(d6wVar, (byte) 22), b0kVar3), null, j2iVarR, null, null, null, apo.r(-268721879, new y5w(d6wVar, qim0VarZ, b3), b0kVar3), apo.r(-971317718, new nzd(d6wVar, function0, qim0VarZ, (byte) 26), b0kVar3), b0kVar2, 805306880, 1769472, 30064);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(d6wVar, function0, i);
        }
    }

    public static final void j(d6w d6wVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1117207286);
        int i2 = (x340Var.g(d6wVar) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | 384;
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else {
            if (d6wVar.a.length() <= 0) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new o1t(d6wVar, function0, i, (byte) 21);
                    return;
                }
                return;
            }
            i(d6wVar, function0, x340Var, i2 & 1022);
            qim0Var = nim0.a;
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new won(d6wVar, function0, qim0Var2, i, (byte) 29);
        }
    }

    public static final void k(String str, String str2, u7h u7hVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        long j;
        long j2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1022841773);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(u7hVar) ? 256 : 128) | (b0kVar3.i(qim0Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            wat watVar = (wat) b0kVar3.k(t4k.h);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            zov0 zov0Var2 = cbx.b(b0kVar3).g;
            boolean zG = b0kVar3.g(watVar) | b0kVar3.d(24.0f);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                TextUnit textUnit = new TextUnit(watVar.s(24.0f));
                b0kVar3.s0(textUnit);
                objT = textUnit;
            }
            long j3 = ((TextUnit) objT).a;
            boolean zG2 = b0kVar3.g(watVar) | b0kVar3.d(16.0f);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new TextUnit(watVar.s(16.0f));
                b0kVar3.s0(objT2);
            }
            long j4 = ((TextUnit) objT2).a;
            boolean z = (i2 & 112) == 32;
            Object objT3 = b0kVar3.T();
            if (z || objT3 == m4cVar) {
                objT3 = str2 != null ? Uri.parse(str2) : Uri.parse("");
                b0kVar3.s0(objT3);
            }
            Uri uri = (Uri) objT3;
            String strO0 = cwl1.o0(b0kVar3, 2131955397);
            if (u7hVar == null) {
                b0kVar3.i0(-596545575);
                j = cbx.a(b0kVar3).b.c;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-596546660);
                b0kVar3.r(false);
                j = u7hVar.a;
            }
            if (u7hVar == null) {
                b0kVar3.i0(-596543439);
                j2 = cbx.a(b0kVar3).b.a;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-596544524);
                b0kVar3.r(false);
                j2 = u7hVar.a;
            }
            long j5 = j2;
            b0kVar3.i0(-596542478);
            ye5 ye5Var = new ye5();
            z6p1.r(ye5Var, "avatar", "[avatar]");
            ye5Var.g(" ");
            int iO = ye5Var.o(new zma1(cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(str);
                ye5Var.k(iO);
                ye5Var.g(" ");
                z6p1.r(ye5Var, "badge", "[badge]");
                ye5Var.g(" ");
                int iO2 = ye5Var.o(new zma1(j5, 0L, FontWeight.t, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530));
                try {
                    ye5Var.g(strO0);
                    ye5Var.k(iO2);
                    af5 af5VarP = ye5Var.p();
                    b0kVar3.r(false);
                    b0kVar2 = b0kVar3;
                    uwo1.f(af5VarP, qim0Var, cbx.d(b0kVar3).h, null, null, null, 0, false, null, 0, null, mqo1.t(new mmr0("avatar", new gh80(new d6t0(4, j3, j3), apo.r(-804765575, new z5w(uri, str, (byte) 0), b0kVar3))), new mmr0("badge", new gh80(new d6t0(4, j4, j4), apo.r(1338718586, new rvh((byte) 5, j), b0kVar3)))), b0kVar2, (i2 >> 6) & 112, 0, 2040);
                } catch (Throwable th) {
                    ye5Var.k(iO2);
                    throw th;
                }
            } catch (Throwable th2) {
                ye5Var.k(iO);
                throw th2;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i, str, str2, u7hVar, qim0Var, (byte) 25);
        }
    }

    public static final void l(Function0 function0, nwo nwoVar, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1400046650);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var.g(nwoVar) : x340Var.i(nwoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                z = false;
            }
            boolean z2 = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new qjz(function0, z, ((qq) nwoVar.a.c).e());
                x340Var.s0(objT);
            }
            qjz qjzVar = (qjz) objT;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            otw.c(qjzVar, new ojz(cwl1.o0(x340Var, 2131951885), cwl1.o0(x340Var, 2131951884), cwl1.o0(x340Var, 2131951888)), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ilf(function0, nwoVar, qim0Var, z, i, i2);
        }
    }

    public static final void m(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z2;
        qim0 qim0Var3;
        Function0 function1 = function0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1554836100);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.i(function1) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            nex nexVar = z ? new nex(4) : pex.b;
            String strO0 = cwl1.o0(b0kVar3, 2131956509);
            String strO1 = cwl1.o0(b0kVar3, z ? 2131951716 : 2131951715);
            String strO2 = cwl1.o0(b0kVar3, z ? 2131951694 : 2131951695);
            fra fraVar = een.N0;
            qim0 qim0Var4 = nim0.a;
            function1 = function0;
            qim0 qim0VarB = s161.b(bin.x(anm1.N("group-speakers-chip-row", qim0Var4), false, strO2, new pm31(0), null, function0, 9), true, new os(strO0, strO1, (byte) 15));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarY = uyn1.y(qim0VarB, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar3, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarY);
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
            if (z) {
                b0kVar3.i0(-1379915956);
                fux fuxVar = fux.c;
                mta mtaVar = cbx.b(b0kVar3).d;
                qim0 qim0VarR = u291.r(qim0Var4, 32.0f);
                cua cuaVar = cbx.b(b0kVar3).f;
                qim0 qim0VarF = dug.f(i1p1.q(qim0VarR, er31.b(16.0f)), cbx.a(b0kVar3).a.b.c(), d4o1.a);
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                qim0Var3 = qim0Var4;
                z2 = false;
                w0h1.a(fuxVar, isl.a, uyn1.x(qim0VarF, 8.0f), cbx.a(b0kVar3).b.a, 0L, false, b0kVar3, fux.d | 48, 48);
                b0kVar2 = b0kVar3;
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                ab80.p(qim0Var3, 8.0f, b0kVar2, false);
            } else {
                b0kVar2 = b0kVar3;
                z2 = false;
                qim0Var3 = qim0Var4;
                b0kVar2.i0(-1379402782);
                b0kVar2.r(false);
            }
            String strO3 = cwl1.o0(b0kVar2, 2131956509);
            if (ihc1.y0(strO3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO3), function1);
            lex lexVarZ = yoo1.z(b0kVar2);
            Object objT = b0kVar2.T();
            if (objT == fkj0.X) {
                objT = em50.g;
                b0kVar2.s0(objT);
            }
            poo1.e(gbxVar, nexVar, lexVarZ, s161.b(qim0Var3, z2, (iu30) objT), 0, null, null, jri.a, null, null, null, false, null, jri.b, b0kVar2, 12582912, 3072, 8048);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function1, qim0Var2, i, (byte) 12);
        }
    }

    public static final void n(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1457400646);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            String strN0 = cwl1.n0(2131955399, new Object[]{str}, x340Var);
            uwr uwrVar = cbx.a;
            uwo1.e(strN0, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.v(nim0Var, 4.0f));
            plx plxVar = plx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(plxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, plx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 23);
        }
    }

    public static final void o(j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2099463653);
        int i2 = (x340Var.i(qim0Var) ? 256 : 128) | i;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new pmg0(j2iVar, j2iVar2, (byte) 0);
                x340Var.s0(objT);
            }
            ejo1.l((i2 >> 6) & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new huh(j2iVar, j2iVar2, qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x034d  */
    /* JADX WARN: Code duplicated, block: B:104:0x035d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0371  */
    /* JADX WARN: Code duplicated, block: B:110:0x0398  */
    /* JADX WARN: Code duplicated, block: B:111:0x039d  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:114:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:118:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x01de  */
    /* JADX WARN: Code duplicated, block: B:72:0x020c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x020e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0236  */
    /* JADX WARN: Code duplicated, block: B:96:0x0334  */
    /* JADX WARN: Code duplicated, block: B:98:0x0349 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x034b  */
    public static final void p(String str, qim0 qim0Var, String str2, vu30 vu30Var, vu30 vu30Var2, gbx gbxVar, boolean z, long j, b0k b0kVar, int i) {
        vu30 vu30Var3;
        qim0 qim0Var2;
        boolean z2;
        boolean z3;
        int i2;
        qim0 qim0Var3;
        boolean z4;
        long j2;
        qim0 qim0VarF;
        hw61 hw61Var;
        qim0 qim0VarR;
        zzq0 zzq0Var;
        boolean z5;
        Object objT;
        Object obj;
        boolean zBooleanValue;
        Object objT2;
        hw61 hw61Var2;
        boolean z6;
        xu30 xu30Var;
        boolean z7;
        qim0 qim0Var4;
        boolean z8;
        int iU;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-203818171);
        int i3 = i | (x340Var.g(str) ? 4 : 2) | 48 | (x340Var.g(str2) ? 256 : 128) | (x340Var.i(vu30Var) ? 2048 : 1024) | (x340Var.i(vu30Var2) ? 16384 : 8192) | (x340Var.i(gbxVar) ? 131072 : 65536) | 524288 | (x340Var.f(j) ? 8388608 : 4194304);
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            x340Var.d0();
            int i4 = i & 1;
            qim0 qim0Var5 = nim0.a;
            if (i4 == 0 || x340Var.E()) {
                z3 = gbxVar != null;
                i2 = i3 & (-3670017);
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                z3 = z;
                i2 = i3 & (-3670017);
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            boolean zBooleanValue2 = ((Boolean) x340Var.k(alg0.e)).booleanValue();
            boolean zBooleanValue3 = ((Boolean) x340Var.k(alg0.a)).booleanValue();
            float f = ((p3v) x340Var.k(alg0.c)).a;
            boolean zBooleanValue4 = ((Boolean) x340Var.k(alg0.d)).booleanValue();
            u7h u7hVar = new u7h(j);
            long j3 = u7h.k;
            xu30 xu30VarR = null;
            if (z4h1.b(j, j3)) {
                u7hVar = null;
            }
            if (u7hVar == null) {
                x340Var.i0(1699254123);
                Object objK = x340Var.k(gaa1.a);
                if (z4h1.b(((u7h) objK).a, j3)) {
                    objK = null;
                }
                u7hVar = (u7h) objK;
                z4 = false;
            } else {
                z4 = false;
                x340Var.i0(1699251240);
            }
            x340Var.r(z4);
            if (u7hVar != null) {
                j2 = u7hVar.a;
            } else {
                uwr uwrVar = cbx.a;
                j2 = ((yex) zex.a.d).e;
            }
            long j4 = j2;
            uwr uwrVar2 = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            hw61 hw61VarB = er31.b(16.0f);
            if (zBooleanValue2) {
                x340Var.i0(1137545543);
                x340Var.r(false);
                qim0VarR = qim0Var5;
                qim0VarF = qim0VarR;
            } else {
                if (zBooleanValue3) {
                    x340Var.i0(1137602521);
                    wat watVar = (wat) x340Var.k(t4k.h);
                    cua cuaVar2 = cbx.b(x340Var).f;
                    qim0VarF = qim0Var5;
                    qim0VarR = exd0.r(qim0VarF, new zym(f, watVar.X0(16.0f), zBooleanValue4, j4, jA));
                    x340Var.r(false);
                } else {
                    qim0VarF = qim0Var5;
                    x340Var.i0(1137891689);
                    x340Var.r(false);
                    long j5 = u7h.b;
                    hw61Var = hw61VarB;
                    qim0VarR = exd0.r(sto1.o(qim0VarF, 15.0f, hw61Var, false, u7h.b(j5, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(j5, 0.3f, 0.0f, 0.0f, 0.0f, 14), 4), new da5(hw61VarB, j4, jA, (byte) 3));
                }
                if (zBooleanValue2) {
                    x340Var.i0(1138045077);
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(16.0f, 0.0f, 16.0f, cbx.b(x340Var).b.a);
                    x340Var.r(false);
                } else if (!zBooleanValue3 && zBooleanValue4) {
                    x340Var.i0(1138299339);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 32.0f);
                    x340Var.r(false);
                } else if (zBooleanValue3) {
                    x340Var.i0(1138573131);
                    cvx cvxVar7 = cbx.b(x340Var).b;
                    cvx cvxVar8 = cbx.b(x340Var).b;
                    cvx cvxVar9 = cbx.b(x340Var).b;
                    cvx cvxVar10 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(16.0f, 32.0f, 16.0f, 16.0f);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1699304179);
                    cvx cvxVar11 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                    x340Var.r(false);
                }
                if (zBooleanValue3 || zBooleanValue2) {
                    vu30Var3 = vu30Var;
                    qim0 qim0Var6 = qim0Var3;
                    z5 = z3;
                    x340Var.i0(1140091077);
                    objT = x340Var.T();
                    obj = fkj0.X;
                    if (objT == obj) {
                        if (vu30Var3 != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objT = Boolean.valueOf(z8);
                        x340Var.s0(objT);
                    }
                    zBooleanValue = ((Boolean) objT).booleanValue();
                    if (z5) {
                        qim0VarF = u291.f(qim0VarF, 1.0f);
                    }
                    qim0 qim0VarThen = qim0Var6.then(qim0VarF).then(qim0VarR);
                    objT2 = x340Var.T();
                    if (objT2 == obj) {
                        objT2 = ujf0.c1;
                        x340Var.s0(objT2);
                    }
                    kgx kgxVar = new kgx(0, (vu30) objT2, (vu30) null, (vu30) null, 13);
                    cvx cvxVar12 = cbx.b(x340Var).b;
                    ydx ydxVar = new ydx(0.0f, 0.0f, 16.0f, zzq0Var);
                    if (zBooleanValue2) {
                        hw61Var2 = d4o1.a;
                    } else {
                        hw61Var2 = hw61Var;
                    }
                    if (vu30Var3 == null) {
                        x340Var.i0(1140889977);
                        z6 = false;
                        x340Var.r(false);
                        xu30Var = null;
                    } else {
                        z6 = false;
                        x340Var.i0(1140889978);
                        xu30 xu30VarR2 = apo.r(-1328641106, new fb7(zBooleanValue4, zBooleanValue, vu30Var3, (byte) 1), x340Var);
                        x340Var.r(false);
                        xu30Var = xu30VarR2;
                    }
                    if (vu30Var2 == null) {
                        x340Var.i0(1141563948);
                    } else {
                        x340Var.i0(1141563949);
                        xu30VarR = apo.r(-1391617578, new a2(vu30Var2, (byte) 6), x340Var);
                    }
                    x340Var.r(z6);
                    xu30 xu30Var2 = xu30VarR;
                    tf tfVar = new tf((Object) str, (Object) str2, (Object) gbxVar, z5, (byte) 20);
                    z7 = z5;
                    j2i j2iVarR = apo.r(211014550, tfVar, x340Var);
                    qim0Var4 = qim0Var6;
                    ioo1.c(qim0VarThen, kgxVar, ydxVar, hw61Var2, null, null, null, null, null, null, null, null, null, null, xu30Var, xu30Var2, j2iVarR, x340Var, 1573376, 1572864, 16304);
                    x340Var.r(z6);
                } else {
                    x340Var.i0(1138949874);
                    float f2 = ((p3v) x340Var.k(alg0.f)).a;
                    wat watVar2 = (wat) x340Var.k(t4k.h);
                    if (zBooleanValue4) {
                        x340Var.i0(1139228409);
                        cvx cvxVar13 = cbx.b(x340Var).b;
                        cvx cvxVar14 = cbx.b(x340Var).b;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1139333561);
                        cvx cvxVar15 = cbx.b(x340Var).b;
                        cvx cvxVar16 = cbx.b(x340Var).b;
                        x340Var.r(false);
                    }
                    if (p3v.c(f2, Float.NaN)) {
                        iU = Integer.MAX_VALUE;
                    } else {
                        iU = jch0.U(watVar2.X0(f2 - 48.0f));
                        if (iU < 0) {
                            iU = 0;
                        }
                    }
                    qim0 qim0VarW = uyn1.w(qim0Var3.then(qim0VarR), zzq0Var);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
                    int i5 = i2 & 14;
                    int i6 = i2 >> 3;
                    z7 = z3;
                    b(str, str2, vu30Var, vu30Var2, gbxVar, z7, zBooleanValue4, iU, x340Var, i5 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344));
                    vu30Var3 = vu30Var;
                    x340Var.r(true);
                    x340Var.r(false);
                    qim0Var4 = qim0Var3;
                }
                qim0Var2 = qim0Var4;
                z2 = z7;
            }
            hw61Var = hw61VarB;
            if (zBooleanValue2) {
                x340Var.i0(1138045077);
                cvx cvxVar17 = cbx.b(x340Var).b;
                cvx cvxVar18 = cbx.b(x340Var).b;
                zzq0Var = new zzq0(16.0f, 0.0f, 16.0f, cbx.b(x340Var).b.a);
                x340Var.r(false);
            } else if (!zBooleanValue3) {
                if (zBooleanValue3) {
                    x340Var.i0(1138573131);
                    cvx cvxVar19 = cbx.b(x340Var).b;
                    cvx cvxVar20 = cbx.b(x340Var).b;
                    cvx cvxVar21 = cbx.b(x340Var).b;
                    cvx cvxVar110 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(16.0f, 32.0f, 16.0f, 16.0f);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1699304179);
                    cvx cvxVar111 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                    x340Var.r(false);
                }
            } else if (zBooleanValue3) {
                x340Var.i0(1138573131);
                cvx cvxVar112 = cbx.b(x340Var).b;
                cvx cvxVar22 = cbx.b(x340Var).b;
                cvx cvxVar23 = cbx.b(x340Var).b;
                cvx cvxVar113 = cbx.b(x340Var).b;
                zzq0Var = new zzq0(16.0f, 32.0f, 16.0f, 16.0f);
                x340Var.r(false);
            } else {
                x340Var.i0(1699304179);
                cvx cvxVar114 = cbx.b(x340Var).b;
                zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                x340Var.r(false);
            }
            if (zBooleanValue3) {
                vu30Var3 = vu30Var;
                qim0 qim0Var7 = qim0Var3;
                z5 = z3;
                x340Var.i0(1140091077);
                objT = x340Var.T();
                obj = fkj0.X;
                if (objT == obj) {
                    if (vu30Var3 != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objT = Boolean.valueOf(z8);
                    x340Var.s0(objT);
                }
                zBooleanValue = ((Boolean) objT).booleanValue();
                if (z5) {
                    qim0VarF = u291.f(qim0VarF, 1.0f);
                }
                qim0 qim0VarThen2 = qim0Var7.then(qim0VarF).then(qim0VarR);
                objT2 = x340Var.T();
                if (objT2 == obj) {
                    objT2 = ujf0.c1;
                    x340Var.s0(objT2);
                }
                kgx kgxVar2 = new kgx(0, (vu30) objT2, (vu30) null, (vu30) null, 13);
                cvx cvxVar115 = cbx.b(x340Var).b;
                ydx ydxVar2 = new ydx(0.0f, 0.0f, 16.0f, zzq0Var);
                if (zBooleanValue2) {
                    hw61Var2 = d4o1.a;
                } else {
                    hw61Var2 = hw61Var;
                }
                if (vu30Var3 == null) {
                    x340Var.i0(1140889977);
                    z6 = false;
                    x340Var.r(false);
                    xu30Var = null;
                } else {
                    z6 = false;
                    x340Var.i0(1140889978);
                    xu30 xu30VarR3 = apo.r(-1328641106, new fb7(zBooleanValue4, zBooleanValue, vu30Var3, (byte) 1), x340Var);
                    x340Var.r(false);
                    xu30Var = xu30VarR3;
                }
                if (vu30Var2 == null) {
                    x340Var.i0(1141563948);
                } else {
                    x340Var.i0(1141563949);
                    xu30VarR = apo.r(-1391617578, new a2(vu30Var2, (byte) 6), x340Var);
                }
                x340Var.r(z6);
                xu30 xu30Var3 = xu30VarR;
                tf tfVar2 = new tf((Object) str, (Object) str2, (Object) gbxVar, z5, (byte) 20);
                z7 = z5;
                j2i j2iVarR2 = apo.r(211014550, tfVar2, x340Var);
                qim0Var4 = qim0Var7;
                ioo1.c(qim0VarThen2, kgxVar2, ydxVar2, hw61Var2, null, null, null, null, null, null, null, null, null, null, xu30Var, xu30Var3, j2iVarR2, x340Var, 1573376, 1572864, 16304);
                x340Var.r(z6);
            } else {
                vu30Var3 = vu30Var;
                qim0 qim0Var8 = qim0Var3;
                z5 = z3;
                x340Var.i0(1140091077);
                objT = x340Var.T();
                obj = fkj0.X;
                if (objT == obj) {
                    if (vu30Var3 != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objT = Boolean.valueOf(z8);
                    x340Var.s0(objT);
                }
                zBooleanValue = ((Boolean) objT).booleanValue();
                if (z5) {
                    qim0VarF = u291.f(qim0VarF, 1.0f);
                }
                qim0 qim0VarThen3 = qim0Var8.then(qim0VarF).then(qim0VarR);
                objT2 = x340Var.T();
                if (objT2 == obj) {
                    objT2 = ujf0.c1;
                    x340Var.s0(objT2);
                }
                kgx kgxVar3 = new kgx(0, (vu30) objT2, (vu30) null, (vu30) null, 13);
                cvx cvxVar116 = cbx.b(x340Var).b;
                ydx ydxVar3 = new ydx(0.0f, 0.0f, 16.0f, zzq0Var);
                if (zBooleanValue2) {
                    hw61Var2 = d4o1.a;
                } else {
                    hw61Var2 = hw61Var;
                }
                if (vu30Var3 == null) {
                    x340Var.i0(1140889977);
                    z6 = false;
                    x340Var.r(false);
                    xu30Var = null;
                } else {
                    z6 = false;
                    x340Var.i0(1140889978);
                    xu30 xu30VarR4 = apo.r(-1328641106, new fb7(zBooleanValue4, zBooleanValue, vu30Var3, (byte) 1), x340Var);
                    x340Var.r(false);
                    xu30Var = xu30VarR4;
                }
                if (vu30Var2 == null) {
                    x340Var.i0(1141563948);
                } else {
                    x340Var.i0(1141563949);
                    xu30VarR = apo.r(-1391617578, new a2(vu30Var2, (byte) 6), x340Var);
                }
                x340Var.r(z6);
                xu30 xu30Var4 = xu30VarR;
                tf tfVar3 = new tf((Object) str, (Object) str2, (Object) gbxVar, z5, (byte) 20);
                z7 = z5;
                j2i j2iVarR3 = apo.r(211014550, tfVar3, x340Var);
                qim0Var4 = qim0Var8;
                ioo1.c(qim0VarThen3, kgxVar3, ydxVar3, hw61Var2, null, null, null, null, null, null, null, null, null, null, xu30Var, xu30Var4, j2iVarR3, x340Var, 1573376, 1572864, 16304);
                x340Var.r(z6);
            }
            qim0Var2 = qim0Var4;
            z2 = z7;
        } else {
            vu30Var3 = vu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
            z2 = z;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qmg0(str, qim0Var2, str2, vu30Var3, vu30Var2, gbxVar, z2, j, i);
        }
    }

    public static final void q(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-322630837);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.b;
            long j3 = cbx.a(x340Var).b.a;
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            String strO0 = cwl1.o0(x340Var, 2131955400);
            boolean zF = x340Var.f(j2) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                ye5 ye5Var = new ye5();
                j = j2;
                int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    zg90.a(ye5Var, str);
                    ye5Var.k(iO);
                    objT = ye5Var.p();
                    x340Var.s0(objT);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            } else {
                j = j2;
            }
            w2g0.c(qim0Var, (tl3) null, apo.r(1497311777, new a6w((af5) objT, strO0, lee1Var, j, j3, function0, yae1VarQ), x340Var), x340Var, ((i2 >> 6) & 14) | 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var, i, (byte) 9);
        }
    }

    public static final void r(es41 es41Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(978370097);
        int i2 = (x340Var.i(es41Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long jB = u7h.b(cbx.a(x340Var).b.b, 0.5f, 0.0f, 0.0f, 0.0f, 14);
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, u291.v(qim0Var, 4.0f));
            boolean zI = x340Var.i(es41Var) | x340Var.f(jB);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new n82(es41Var, jB, (byte) 13);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarZ);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(es41Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void s(eab1 eab1Var, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1418351042);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(eab1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            mod.b(oi7.a.a(gw70Var), apo.r(1493120642, new fab1(qim0Var, eab1Var, iu30Var, (byte) 1), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2((Object) eab1Var, (Object) gw70Var, (Object) iu30Var, qim0Var2, i, i2, (byte) 16);
        }
    }

    public static final void t(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(261585111);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var, i2 & 14, 0, 1714);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y5d0(str, i, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void u(String str, int i, int i2, yae1 yae1Var, Function0 function0, boolean z, b0k b0kVar, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        lee1 lee1Var;
        zma1 zma1VarA;
        zma1 zma1VarA2;
        zma1 zma1VarA3;
        af5 af5Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1973126875);
        int i5 = i3 | (x340Var.g(str) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.e(i2) ? 256 : 128) | (x340Var.i(yae1Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        int i6 = i4 & 32;
        if (i6 == 0) {
            if ((i3 & 196608) == 0) {
                z2 = z;
                i5 |= x340Var.h(z2) ? 131072 : 65536;
            }
            if ((74899 & i5) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i5 & 1, z3)) {
                if (i6 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(x340Var).j;
                zma1VarA = zma1.a(lee1Var.a, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
                zma1VarA2 = zma1.a(cbx.d(x340Var).k.a, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
                zma1VarA3 = zma1.a(cbx.d(x340Var).k.a, cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
                af5Var = new af5(str);
                if (function0 != null) {
                    x340Var.i0(-499658868);
                    af5Var = bqn1.v(af5Var, zma1VarA, zma1VarA2, zma1VarA3, function0, yae1Var, lee1Var, i2, i, z5, x340Var, (57344 & i5) | (458752 & (i5 << 6)) | ((i5 << 15) & 29360128) | ((i5 << 21) & 234881024) | ((i5 << 12) & 1879048192), 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-499235997);
                    x340Var.r(false);
                }
                uwo1.d(af5Var, cbx.a(x340Var).b.a, null, lee1Var, null, null, 1, false, new cjc0(i), 0, null, null, x340Var, 0, 0, 3764);
                x340Var = x340Var;
                z4 = z5;
            } else {
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rmg0(str, i, i2, yae1Var, function0, z4, i3, i4);
            }
        }
        i5 |= 196608;
        z2 = z;
        if ((74899 & i5) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i5 & 1, z3)) {
            if (i6 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            uwr uwrVar2 = cbx.a;
            lee1Var = cbx.d(x340Var).j;
            zma1VarA = zma1.a(lee1Var.a, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            zma1VarA2 = zma1.a(cbx.d(x340Var).k.a, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            zma1VarA3 = zma1.a(cbx.d(x340Var).k.a, cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            af5Var = new af5(str);
            if (function0 != null) {
                x340Var.i0(-499658868);
                af5Var = bqn1.v(af5Var, zma1VarA, zma1VarA2, zma1VarA3, function0, yae1Var, lee1Var, i2, i, z5, x340Var, (57344 & i5) | (458752 & (i5 << 6)) | ((i5 << 15) & 29360128) | ((i5 << 21) & 234881024) | ((i5 << 12) & 1879048192), 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-499235997);
                x340Var.r(false);
            }
            uwo1.d(af5Var, cbx.a(x340Var).b.a, null, lee1Var, null, null, 1, false, new cjc0(i), 0, null, null, x340Var, 0, 0, 3764);
            x340Var = x340Var;
            z4 = z5;
        } else {
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rmg0(str, i, i2, yae1Var, function0, z4, i3, i4);
        }
    }

    public static final LinkedHashMap v(ArrayList arrayList) {
        String str = s8s0.b;
        s8s0 s8s0VarF = gtv0.f("/");
        LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0(s8s0VarF, new i4n1(s8s0VarF, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))});
        for (i4n1 i4n1Var : o7h.a1(arrayList, new epj1((byte) 9))) {
            if (((i4n1) linkedHashMapM.put(i4n1Var.a, i4n1Var)) == null) {
                while (true) {
                    s8s0 s8s0Var = i4n1Var.a;
                    s8s0 s8s0VarC = s8s0Var.c();
                    if (s8s0VarC == null) {
                        break;
                    }
                    i4n1 i4n1Var2 = (i4n1) linkedHashMapM.get(s8s0VarC);
                    if (i4n1Var2 != null) {
                        i4n1Var2.q.add(s8s0Var);
                        break;
                    }
                    i4n1 i4n1Var3 = new i4n1(s8s0VarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapM.put(s8s0VarC, i4n1Var3);
                    i4n1Var3.q.add(s8s0Var);
                    i4n1Var = i4n1Var3;
                }
            }
        }
        return linkedHashMapM;
    }

    public static p1f0 w(String str) {
        return new p1f0(str);
    }

    public static final d1q0 x(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
            return d1q0.c;
        }
        int iOrdinal = s4b1VarX.c.ordinal();
        if (iOrdinal == 30) {
            return d1q0.b;
        }
        if (iOrdinal == 44) {
            return d1q0.d;
        }
        if (iOrdinal == 166) {
            return d1q0.g;
        }
        if (iOrdinal == 652) {
            return d1q0.f;
        }
        if (iOrdinal == 844) {
            return d1q0.e;
        }
        if (iOrdinal != 860) {
            return iOrdinal != 926 ? d1q0.i : d1q0.a;
        }
        return d1q0.h;
    }

    public static final oe5 y(oe5 oe5Var) {
        oe5 oe5VarC = oe5Var.c();
        int iB = oe5VarC.b();
        for (int i = 0; i < iB; i++) {
            oe5VarC.e(oe5Var.a(i), i);
        }
        return oe5VarC;
    }

    public static final String z(int i) {
        eth.h(16);
        return "0x".concat(Integer.toString(i, 16));
    }
}
