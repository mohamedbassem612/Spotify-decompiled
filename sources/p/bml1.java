package p;

import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.common.ParserException;
import app.p000rive.runtime.kotlin.fonts.Fonts;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bml1 implements lqc1 {
    public final izr0 a = new izr0();
    public final sll1 b = new sll1();

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:121:0x0229  */
    /* JADX WARN: Code duplicated, block: B:130:0x024a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0255  */
    /* JADX WARN: Code duplicated, block: B:133:0x025e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0268  */
    /* JADX WARN: Code duplicated, block: B:136:0x0270  */
    /* JADX WARN: Code duplicated, block: B:138:0x0278  */
    /* JADX WARN: Code duplicated, block: B:139:0x027c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0284  */
    /* JADX WARN: Code duplicated, block: B:142:0x028b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0293  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:157:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02df  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:173:0x0301  */
    /* JADX WARN: Code duplicated, block: B:175:0x0311  */
    /* JADX WARN: Code duplicated, block: B:176:0x0329  */
    /* JADX WARN: Code duplicated, block: B:179:0x033a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0343  */
    /* JADX WARN: Code duplicated, block: B:183:0x0345  */
    /* JADX WARN: Code duplicated, block: B:186:0x034e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0350  */
    /* JADX WARN: Code duplicated, block: B:190:0x0359  */
    /* JADX WARN: Code duplicated, block: B:194:0x0361  */
    /* JADX WARN: Code duplicated, block: B:195:0x0366  */
    /* JADX WARN: Code duplicated, block: B:196:0x036b  */
    /* JADX WARN: Code duplicated, block: B:198:0x037e  */
    /* JADX WARN: Code duplicated, block: B:239:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x0311, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    public final void g(byte[] bArr, int i, int i2, kqc1 kqc1Var, akl aklVar) {
        ull1 ull1VarD;
        String strTrim;
        int i3;
        String string;
        int i4;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        bml1 bml1Var = this;
        izr0 izr0Var = bml1Var.a;
        izr0Var.P(bArr, i + i2);
        izr0Var.R(i);
        ArrayList arrayList = new ArrayList();
        try {
            cml1.d(izr0Var);
            while (!TextUtils.isEmpty(izr0Var.r(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z2 = false;
                int i5 = -1;
                int i6 = 0;
                byte b2 = -1;
                while (true) {
                    int i7 = 1;
                    if (b2 == -1) {
                        i6 = izr0Var.b;
                        String strR = izr0Var.r(StandardCharsets.UTF_8);
                        if (strR == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strR)) {
                            b2 = 2;
                        } else {
                            b2 = strR.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        izr0Var.R(i6);
                        if (b2 == 0) {
                            iqo1.y(new zrj1(arrayList2), kqc1Var, aklVar);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(izr0Var.r(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    hhg1.n("A style block was found after the first cue.");
                                    return;
                                }
                                izr0Var.r(StandardCharsets.UTF_8);
                                sll1 sll1Var = bml1Var.b;
                                izr0 izr0Var2 = sll1Var.a;
                                StringBuilder sb = sll1Var.b;
                                sb.setLength(0);
                                int i8 = izr0Var.b;
                                while (!TextUtils.isEmpty(izr0Var.r(StandardCharsets.UTF_8))) {
                                }
                                izr0Var2.P(izr0Var.a, izr0Var.b);
                                izr0Var2.R(i8);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    sll1.c(izr0Var2);
                                    if (izr0Var2.a() >= 5 && "::cue".equals(izr0Var2.C(5, StandardCharsets.UTF_8))) {
                                        int i9 = izr0Var2.b;
                                        String strB = sll1.b(izr0Var2, sb);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            izr0Var2.R(i9);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i10 = izr0Var2.b;
                                                int i11 = izr0Var2.c;
                                                int i12 = z2 ? 1 : 0;
                                                while (i10 < i11 && i12 == 0) {
                                                    int i13 = i10 + 1;
                                                    i12 = ((char) izr0Var2.a[i10]) == ')' ? i7 : z2 ? 1 : 0;
                                                    i10 = i13;
                                                }
                                                strTrim = izr0Var2.C((i10 - 1) - izr0Var2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(sll1.b(izr0Var2, sb))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(sll1.b(izr0Var2, sb))) {
                                        tll1 tll1Var = new tll1();
                                        tll1Var.a = "";
                                        tll1Var.b = "";
                                        tll1Var.c = Collections.EMPTY_SET;
                                        tll1Var.d = "";
                                        tll1Var.e = str;
                                        tll1Var.g = z2;
                                        tll1Var.i = z2;
                                        tll1Var.j = i5;
                                        tll1Var.k = i5;
                                        tll1Var.l = i5;
                                        tll1Var.m = i5;
                                        tll1Var.n = i5;
                                        tll1Var.f140p = i5;
                                        tll1Var.q = z2;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i5) {
                                                Matcher matcher2 = sll1.c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i7);
                                                    strGroup2.getClass();
                                                    tll1Var.d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z2 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = zoi1.a;
                                            String[] strArrSplit = strTrim.split("\\.", i5);
                                            String str3 = strArrSplit[z2 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i5) {
                                                tll1Var.b = str3.substring(z2 ? 1 : 0, iIndexOf2);
                                                tll1Var.a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                tll1Var.b = str3;
                                            }
                                            if (strArrSplit.length > i7) {
                                                int length = strArrSplit.length;
                                                dm5.m((boolean) (length <= strArrSplit.length ? i7 : z2 ? 1 : 0));
                                                tll1Var.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                            }
                                        }
                                        ?? r8 = z2 ? 1 : 0;
                                        String strB2 = str;
                                        while (r8 == 0) {
                                            int i14 = izr0Var2.b;
                                            strB2 = sll1.b(izr0Var2, sb);
                                            ?? r15 = (strB2 == null || "}".equals(strB2)) ? i7 : z2;
                                            if (r15 == 0) {
                                                izr0Var2.R(i14);
                                                sll1.c(izr0Var2);
                                                String strA = sll1.a(izr0Var2, sb);
                                                if (!strA.isEmpty() && ":".equals(sll1.b(izr0Var2, sb))) {
                                                    sll1.c(izr0Var2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (z3) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i15 = izr0Var2.b;
                                                            String strB3 = sll1.b(izr0Var2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                izr0Var2.R(i15);
                                                                z3 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i3 = 1;
                                                    } else {
                                                        int i16 = izr0Var2.b;
                                                        String strB4 = sll1.b(izr0Var2, sb);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                tll1Var.f = l9h.a(string, true);
                                                                tll1Var.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    tll1Var.h = l9h.a(string, true);
                                                                    tll1Var.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        tll1Var.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            tll1Var.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        tll1Var.e = eth.W(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (Fonts.Font.STYLE_ITALIC.equals(string)) {
                                                                                tll1Var.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = sll1.d.matcher(eth.W(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                bhn0.w();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i3);
                                                                                        strGroup3.getClass();
                                                                                        tll1Var.o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                bhn0.w();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i3);
                                                                                        strGroup4.getClass();
                                                                                        tll1Var.o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                bhn0.w();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i3);
                                                                                        strGroup5.getClass();
                                                                                        tll1Var.o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        tll1Var.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        tll1Var.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        tll1Var.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        bhn0.w();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i3);
                                                                                strGroup6.getClass();
                                                                                tll1Var.o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                oon1.H("Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        tll1Var.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    tll1Var.f140p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    tll1Var.f140p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else if ("}".equals(strB4)) {
                                                            izr0Var2.R(i16);
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                tll1Var.f = l9h.a(string, true);
                                                                tll1Var.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    tll1Var.h = l9h.a(string, true);
                                                                    tll1Var.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        tll1Var.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            tll1Var.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        tll1Var.e = eth.W(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (Fonts.Font.STYLE_ITALIC.equals(string)) {
                                                                                tll1Var.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = sll1.d.matcher(eth.W(string));
                                                                            if (matcher.matches()) {
                                                                                oon1.H("Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                bhn0.w();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i3);
                                                                                        strGroup7.getClass();
                                                                                        tll1Var.o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                bhn0.w();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i3);
                                                                                        strGroup8.getClass();
                                                                                        tll1Var.o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                tll1Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                bhn0.w();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i3);
                                                                                        strGroup9.getClass();
                                                                                        tll1Var.o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        tll1Var.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        tll1Var.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        tll1Var.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        bhn0.w();
                                                                                        return;
                                                                                }
                                                                                String strGroup10 = matcher.group(i3);
                                                                                strGroup10.getClass();
                                                                                tll1Var.o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        tll1Var.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    tll1Var.f140p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    tll1Var.f140p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i3 = i7;
                                                }
                                            } else {
                                                i3 = i7;
                                            }
                                            i7 = i3;
                                            r8 = r15;
                                            z2 = false;
                                        }
                                        int i17 = i7;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(tll1Var);
                                        }
                                        i7 = i17;
                                        z2 = false;
                                        i5 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = zll1.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strR2 = izr0Var.r(charset);
                                if (strR2 == null) {
                                    ull1VarD = null;
                                } else {
                                    Pattern pattern2 = zll1.a;
                                    Matcher matcher3 = pattern2.matcher(strR2);
                                    if (matcher3.matches()) {
                                        ull1VarD = zll1.d(null, matcher3, izr0Var, arrayList);
                                    } else {
                                        ull1VarD = null;
                                        String strR3 = izr0Var.r(charset);
                                        if (strR3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strR3);
                                            if (matcher4.matches()) {
                                                ull1VarD = zll1.d(strR2.trim(), matcher4, izr0Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (ull1VarD != null) {
                                    arrayList2.add(ull1VarD);
                                }
                            }
                            bml1Var = this;
                        }
                    }
                }
            }
        } catch (ParserException e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }

    public final int i() {
        return 1;
    }
}
