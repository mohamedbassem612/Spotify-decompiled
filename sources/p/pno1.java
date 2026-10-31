package p;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
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
import com.spotify.highlightsstats.EntityImage;
import com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService;
import com.spotify.mobius.First;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class pno1 {
    public static final Object a = new Object();
    public static int b;
    public static b180 c;

    public static final void a(String str, c380 c380Var, hvp0 hvp0Var, kba kbaVar, h3h1 h3h1Var, qim0 qim0Var, yt11 yt11Var, maa maaVar, vzq0 vzq0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2017263661);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(c380Var) ? 32 : 16) | (b0kVar3.i(hvp0Var) ? 256 : 128) | (b0kVar3.i(kbaVar) ? 2048 : 1024) | (b0kVar3.i(h3h1Var) ? 16384 : 8192) | 196608 | (b0kVar3.i(yt11Var) ? 1048576 : 524288) | (b0kVar3.i(maaVar) ? 8388608 : 4194304) | (b0kVar3.i(vzq0Var) ? 67108864 : 33554432);
        if (b0kVar3.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new sle();
                b0kVar3.s0(objT);
            }
            sle sleVar = (sle) objT;
            boolean zG = ((i2 & 14) == 4) | b0kVar3.g(hvp0Var) | ((i2 & 112) == 32) | b0kVar3.g(kbaVar) | b0kVar3.g(yt11Var) | b0kVar3.g(maaVar);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == obj) {
                dnc0 dnc0VarB = hvp0.b(hvp0Var);
                zwg zwgVar = new zwg();
                zwgVar.a = str;
                zwgVar.b = c380Var;
                zwgVar.c = kbaVar;
                zwgVar.d = yt11Var;
                zwgVar.e = maaVar;
                dnc0VarB.b(new gj50(new rle(zwgVar, (byte) 0), false), new rle(zwgVar, (byte) 2));
                objT2 = dnc0VarB.a();
                b0kVar3.s0(objT2);
            }
            q1d0 q1d0VarN = jyo1.n(xtb0VarA, (cnc0) objT2, h3h1Var, b0kVar3, 0);
            qim0 qim0VarL = bmq0.L(u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3), sleVar, (g6o0) null);
            boolean zI = b0kVar3.i(q1d0VarN);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == obj) {
                objT3 = new xo8(q1d0VarN, (byte) 5);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarL, xtb0VarA, vzq0Var, false, null, null, null, false, null, (iu30) objT3, b0kVar2, (i2 >> 18) & 896, 504);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(str, c380Var, hvp0Var, kbaVar, h3h1Var, qim0Var2, yt11Var, maaVar, vzq0Var, i);
        }
    }

    public static final void b(p8i0 p8i0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1948320685);
        if ((i & 6) == 0) {
            i2 = (x340Var2.e(p8i0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var2.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = nho1.F(qim0Var2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            boolean z = p8i0Var == p8i0.b;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new mhg0(iu30Var, (byte) 18);
                x340Var2.s0(objT);
            }
            boolean z3 = false;
            poo1.g(z, (iu30) objT, new nex(4), yoo1.z(x340Var2), null, 0, null, cwl1.o0(x340Var2, 2131958428), null, null, null, null, null, false, null, g0j.a, x340Var2, 0, 196608, 32624);
            boolean z4 = p8i0Var == p8i0.c;
            if (i3 == 32) {
                z3 = true;
            }
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new mhg0(iu30Var, (byte) 19);
                x340Var2.s0(objT2);
            }
            poo1.g(z4, (iu30) objT2, new nex(4), yoo1.z(x340Var2), null, 0, null, cwl1.o0(x340Var2, 2131958431), null, null, null, null, null, false, null, g0j.b, x340Var2, 0, 196608, 32624);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) p8i0Var, (Object) iu30Var, (Object) qim0Var, i, (byte) 19);
        }
    }

    public static final String c(String str) {
        return "spotify:internal:quiz:feedback:".concat(str);
    }

    public static final int d(ptb0 ptb0Var) {
        return (int) (ptb0Var.q == qqq0.a ? ptb0Var.g() & 4294967295L : ptb0Var.g() >> 32);
    }

    public static int[] e(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static final af5 f(CharSequence charSequence, ib60 ib60Var, b0k b0kVar) {
        int iT0;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1985585623);
        uwr uwrVar = cbx.a;
        zma1 zma1Var = new zma1(cbx.a(x340Var).b.f, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
        if (ib60Var != null) {
            u380 u380Var = ib60Var.b;
            p280 p280Var = ib60Var.a;
            ArrayList arrayList = new ArrayList(q7h.U(p280Var, 10));
            Iterator it = p280Var.iterator();
            while (it.hasNext()) {
                arrayList.add(l(ib60Var, (String) it.next()));
            }
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                String string = charSequence.toString();
                String strL = l(ib60Var, string);
                ArrayList arrayList3 = new ArrayList();
                for (String str : arrayList2) {
                    int i = 0;
                    while (i < strL.length() && (iT0 = ihc1.t0(i, strL, str, true)) != -1) {
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < iT0) {
                            if (!u380Var.contains(Character.valueOf(string.charAt(i3)))) {
                                i2++;
                            }
                            i3++;
                        }
                        while (i3 < string.length() && u380Var.contains(Character.valueOf(string.charAt(i3)))) {
                            i3++;
                        }
                        int length = str.length();
                        int i4 = i3;
                        while (length > 0 && i4 < string.length()) {
                            if (!u380Var.contains(Character.valueOf(string.charAt(i4)))) {
                                length--;
                            }
                            i4++;
                        }
                        arrayList3.add(new mmr0(Integer.valueOf(i3), Integer.valueOf(i4)));
                        i = iT0 + 1;
                    }
                }
                List<mmr0> listA1 = o7h.a1(arrayList3, new cvt((byte) 13));
                ArrayList<mmr0> arrayList4 = new ArrayList();
                for (mmr0 mmr0Var : listA1) {
                    if (arrayList4.isEmpty() || ((Number) ((mmr0) o7h.A0(arrayList4)).b).intValue() < ((Number) mmr0Var.a).intValue()) {
                        arrayList4.add(mmr0Var);
                    } else {
                        arrayList4.set(p7h.L(arrayList4), new mmr0(((mmr0) o7h.A0(arrayList4)).a, Integer.valueOf(Math.max(((Number) ((mmr0) o7h.A0(arrayList4)).b).intValue(), ((Number) mmr0Var.b).intValue()))));
                    }
                }
                ye5 ye5Var = new ye5();
                if (charSequence instanceof af5) {
                    ye5Var.h((af5) charSequence);
                    for (mmr0 mmr0Var2 : arrayList4) {
                        ye5Var.d(zma1Var, ((Number) mmr0Var2.a).intValue(), ((Number) mmr0Var2.b).intValue());
                    }
                } else {
                    int i5 = 0;
                    for (mmr0 mmr0Var3 : arrayList4) {
                        int iIntValue = ((Number) mmr0Var3.a).intValue();
                        int iIntValue2 = ((Number) mmr0Var3.b).intValue();
                        if (i5 < iIntValue) {
                            ye5Var.g(string.substring(i5, iIntValue));
                        }
                        int iO = ye5Var.o(zma1Var);
                        try {
                            ye5Var.g(string.substring(iIntValue, iIntValue2));
                            ye5Var.k(iO);
                            i5 = iIntValue2;
                        } catch (Throwable th) {
                            ye5Var.k(iO);
                            throw th;
                        }
                    }
                    if (i5 < string.length()) {
                        ye5Var.g(string.substring(i5));
                    }
                }
                af5 af5VarP = ye5Var.p();
                x340Var.r(false);
                return af5VarP;
            }
        }
        af5 af5Var = charSequence instanceof af5 ? (af5) charSequence : new af5(charSequence.toString());
        x340Var.r(false);
        return af5Var;
    }

    public static final po90 g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            po90 po90Var = (po90) it.next();
            if (po90Var.d) {
                return po90Var;
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }

    public static final hp90 h(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hp90 hp90Var = (hp90) it.next();
            if (hp90Var.e) {
                return hp90Var;
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }

    public static First i(adn adnVar) {
        yhd yhdVarK;
        cqz0 cqz0Var = dqz0.a;
        List listD1 = adnVar.P0;
        yy30 yy30Var = adnVar.e;
        if (yy30Var != yy30.b) {
            if (yy30Var != yy30.a) {
                return First.b(adnVar);
            }
            if (listD1.isEmpty()) {
                return First.c(adnVar, Collections.singleton(new wbn(z6x.a)));
            }
            yhd yhdVarK2 = rzn1.k(listD1, cqz0Var);
            return First.c(adn.a(adnVar, (List) null, 0, (yy30) null, (mu91) null, (zhd) null, 0, 0, 0, 0, (String) null, (String) null, (List) null, false, yhdVarK2.b, 0, 98303), Collections.singleton(new wbn(yhdVarK2.a)));
        }
        Set setW0 = dm61.w0(new acn[]{ybn.a});
        String str = adnVar.Z;
        String str2 = adnVar.Y;
        if (str != null && str2 != null) {
            setW0.add(new vbn(str2, str));
        }
        if (adnVar.g != null) {
            return First.c(adnVar, setW0);
        }
        List list = adnVar.c;
        if (list.isEmpty()) {
            yhdVarK = null;
        } else if (str2 != null) {
            if (listD1.isEmpty()) {
                listD1 = rzn1.l(list, str2, cqz0Var);
            }
            yhdVarK = rzn1.k(listD1, cqz0Var);
        } else {
            if (listD1.isEmpty()) {
                listD1 = o7h.d1(p7h.R(list, cqz0Var), 10);
            }
            yhdVarK = rzn1.k(listD1, cqz0Var);
        }
        return yhdVarK == null ? First.c(adnVar, setW0) : First.c(adn.a(adnVar, (List) null, 0, (yy30) null, (mu91) null, (zhd) null, 0, 0, 0, 0, (String) null, (String) null, (List) null, false, yhdVarK.b, 0, 98303), dm61.x0(new wbn(yhdVarK.a), setW0));
    }

    public static final any j(c9c0 c9c0Var) {
        return new any(c9c0Var.b.current(), (byte) 13);
    }

    public static e7s0 k(EntityImage entityImage) {
        if (ihc1.y0(entityImage.getImageUrl())) {
            return null;
        }
        return m7s0.b[entityImage.o().ordinal()] == 1 ? new c7s0(entityImage.getImageUrl()) : new d7s0(entityImage.getImageUrl());
    }

    public static final String l(ib60 ib60Var, String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if (!ib60Var.b.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static final scx m(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new scx();
            x340Var.s0(objT);
        }
        return (scx) objT;
    }

    public static final ru91 n(xtb0 xtb0Var, b0k b0kVar) {
        zov0 zov0Var = zov0.g;
        Object obj = fkj0.X;
        boolean zG = ((x340) b0kVar).g(xtb0Var);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (zG || objT == obj) {
            objT = new stb0(xtb0Var, zov0Var);
            x340Var.s0(objT);
        }
        wu91 wu91Var = (wu91) objT;
        wat watVar = (wat) x340Var.k(t4k.h);
        e9r e9rVarA = wxa1.a(x340Var);
        boolean zG2 = x340Var.g(watVar) | x340Var.g(wu91Var) | x340Var.g(e9rVarA);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == obj) {
            objT2 = new ru91(wu91Var, e9rVarA, irn1.l0(0.0f, 400.0f, null, 5));
            x340Var.s0(objT2);
        }
        return (ru91) objT2;
    }

    public static String o(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static String p(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrE = e(str2);
        if (iArrE[0] != -1) {
            sb.append(str2);
            o(sb, iArrE[1], iArrE[2]);
            return sb.toString();
        }
        int[] iArrE2 = e(str);
        if (iArrE[3] == 0) {
            sb.append((CharSequence) str, 0, iArrE2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrE[2] == 0) {
            sb.append((CharSequence) str, 0, iArrE2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrE[1];
        if (i != 0) {
            int i2 = iArrE2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return o(sb, iArrE[1] + i2, i2 + iArrE[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrE2[1]);
            sb.append(str2);
            int i3 = iArrE2[1];
            return o(sb, i3, iArrE[2] + i3);
        }
        int i4 = iArrE2[0] + 2;
        int i5 = iArrE2[1];
        if (i4 >= i5 || i5 != iArrE2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrE2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrE2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return o(sb, iArrE2[1], i6 + iArrE[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrE2[1];
        return o(sb, i7, iArrE[2] + i7 + 1);
    }

    public static Uri q(String str, String str2) {
        return Uri.parse(p(str, str2));
    }

    public static void r(SpotifyMediaLibraryService spotifyMediaLibraryService, Notification notification, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            g961.l(spotifyMediaLibraryService, notification, i);
        } else if (i2 >= 29) {
            g961.j(spotifyMediaLibraryService, notification, i);
        } else {
            spotifyMediaLibraryService.startForeground(2131430174, notification);
        }
    }

    public static void s(SpotifyMediaLibraryService spotifyMediaLibraryService) {
        spotifyMediaLibraryService.stopForeground(1);
    }

    public static final h8k1 t(h8k1 h8k1Var, vq11 vq11Var) {
        uq11 uq11VarA = (ar11) h8k1Var.a;
        if (uq11VarA instanceof yq11) {
            uq11VarA = yq11.a((yq11) uq11VarA, 0, vq11Var, 47);
        } else if (uq11VarA instanceof uq11) {
            uq11VarA = uq11.a(uq11VarA, 0, vq11Var, 47);
        } else if (uq11VarA instanceof zq11) {
            uq11VarA = zq11.a((zq11) uq11VarA, 0, vq11Var, 47);
        } else if (!(uq11VarA instanceof wq11) && !(uq11VarA instanceof xq11)) {
            eg.o();
            return null;
        }
        return new h8k1(uq11VarA, h8k1Var.b);
    }

    public abstract w9p1 u();

    public abstract Integer v();
}
