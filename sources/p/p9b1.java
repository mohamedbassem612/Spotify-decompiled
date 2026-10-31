package p;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import app.p000rive.runtime.kotlin.fonts.Fonts;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p9b1 implements lqc1 {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final tgv b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final izr0 c = new izr0();

    public p9b1(List list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String strV = zoi1.v((byte[]) list.get(0));
        dm5.m(strV.startsWith("Format:"));
        tgv tgvVarA = tgv.a(strV);
        tgvVarA.getClass();
        this.b = tgvVarA;
        b(new izr0((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long c(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zoi1.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x02e0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(izr0 izr0Var, Charset charset) {
        int i;
        s9b1 s9b1Var;
        while (true) {
            String strR = izr0Var.r(charset);
            if (strR == null) {
                return;
            }
            int i2 = 2;
            int i3 = 0;
            if ("[Script Info]".equalsIgnoreCase(strR)) {
                while (true) {
                    String strR2 = izr0Var.r(charset);
                    if (strR2 == null) {
                        break;
                    }
                    if (izr0Var.a() != 0) {
                        int iL = izr0Var.l(charset);
                        if ((iL != 0 ? bmq0.j(iL >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strR2.split(":");
                    if (strArrSplit.length == 2) {
                        String strW = eth.W(strArrSplit[0].trim());
                        strW.getClass();
                        if (strW.equals("playresx")) {
                            this.e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strW.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strR)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    q9b1 q9b1Var = null;
                    while (true) {
                        String strR3 = izr0Var.r(charset);
                        if (strR3 != null) {
                            if (izr0Var.a() != 0) {
                                int iL2 = izr0Var.l(charset);
                                if ((iL2 != 0 ? bmq0.j(iL2 >>> 8) : 1114112) == 91) {
                                }
                            }
                            int i4 = -1;
                            if (strR3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strR3.substring(7), ",");
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                for (int i15 = i3; i15 < strArrSplit2.length; i15++) {
                                    String strW2 = eth.W(strArrSplit2[i15].trim());
                                    strW2.getClass();
                                    switch (strW2.hashCode()) {
                                        case -1178781136:
                                            i = strW2.equals(Fonts.Font.STYLE_ITALIC) ? i3 : -1;
                                            break;
                                        case -1026963764:
                                            i = strW2.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i = strW2.equals("strikeout") ? i2 : -1;
                                            break;
                                        case -70925746:
                                            i = strW2.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i = strW2.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i = strW2.equals("name") ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i = strW2.equals("fontsize") ? 6 : -1;
                                            break;
                                        case 767321349:
                                            i = strW2.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i = strW2.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i = strW2.equals("outlinecolour") ? 9 : -1;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    switch (i) {
                                        case 0:
                                            i11 = i15;
                                            break;
                                        case 1:
                                            i12 = i15;
                                            break;
                                        case 2:
                                            i13 = i15;
                                            break;
                                        case 3:
                                            i7 = i15;
                                            break;
                                        case 4:
                                            i10 = i15;
                                            break;
                                        case 5:
                                            i5 = i15;
                                            break;
                                        case 6:
                                            i9 = i15;
                                            break;
                                        case 7:
                                            i14 = i15;
                                            break;
                                        case 8:
                                            i6 = i15;
                                            break;
                                        case 9:
                                            i8 = i15;
                                            break;
                                    }
                                }
                                if (i5 != -1) {
                                    q9b1Var = new q9b1(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, strArrSplit2.length);
                                }
                            } else {
                                if (strR3.startsWith("Style:")) {
                                    if (q9b1Var == null) {
                                        oon1.H("Skipping 'Style:' line before 'Format:' line: ".concat(strR3));
                                    } else {
                                        dm5.m(strR3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strR3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i16 = q9b1Var.k;
                                        if (length != i16) {
                                            int length2 = strArrSplit3.length;
                                            String str = zoi1.a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbQ = cy30.q(i16, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            sbQ.append(strR3);
                                            sbQ.append("'");
                                            oon1.H(sbQ.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[q9b1Var.a].trim();
                                                int i17 = q9b1Var.b;
                                                int iA = i17 != -1 ? s9b1.a(strArrSplit3[i17].trim()) : -1;
                                                int i18 = q9b1Var.c;
                                                Integer numC = i18 != -1 ? s9b1.c(strArrSplit3[i18].trim()) : null;
                                                int i19 = q9b1Var.d;
                                                Integer numC2 = i19 != -1 ? s9b1.c(strArrSplit3[i19].trim()) : null;
                                                int i20 = q9b1Var.e;
                                                float f = -3.4028235E38f;
                                                if (i20 != -1) {
                                                    String strTrim2 = strArrSplit3[i20].trim();
                                                    try {
                                                        f = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e) {
                                                        oon1.I("Failed to parse font size: '" + strTrim2 + "'", e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i21 = q9b1Var.f;
                                                boolean z = i21 != -1 && s9b1.b(strArrSplit3[i21].trim());
                                                int i22 = q9b1Var.g;
                                                boolean z2 = i22 != -1 && s9b1.b(strArrSplit3[i22].trim());
                                                int i23 = q9b1Var.h;
                                                boolean z3 = i23 != -1 && s9b1.b(strArrSplit3[i23].trim());
                                                int i24 = q9b1Var.i;
                                                boolean z4 = i24 != -1 && s9b1.b(strArrSplit3[i24].trim());
                                                int i25 = q9b1Var.j;
                                                if (i25 != -1) {
                                                    String strTrim3 = strArrSplit3[i25].trim();
                                                    try {
                                                        int i26 = Integer.parseInt(strTrim3.trim());
                                                        if (i26 == 1 || i26 == 3) {
                                                            i4 = i26;
                                                        } else {
                                                            oon1.H("Ignoring unknown BorderStyle: " + strTrim3);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                }
                                                s9b1Var = new s9b1(strTrim, iA, numC, numC2, f2, z, z2, z3, z4, i4);
                                            } catch (RuntimeException e2) {
                                                oon1.I("Skipping malformed 'Style:' line: '" + strR3 + "'", e2);
                                                s9b1Var = null;
                                            }
                                            if (s9b1Var != null) {
                                                linkedHashMap.put(s9b1Var.a, s9b1Var);
                                            }
                                        }
                                        s9b1Var = null;
                                        if (s9b1Var != null) {
                                            linkedHashMap.put(s9b1Var.a, s9b1Var);
                                        }
                                    }
                                }
                                i2 = 2;
                                i3 = 0;
                            }
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strR)) {
                oon1.A("[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strR)) {
                return;
            }
        }
    }

    public final void g(byte[] bArr, int i, int i2, kqc1 kqc1Var, akl aklVar) {
        long j;
        tgv tgvVar;
        izr0 izr0Var;
        int i3;
        int i4;
        float f;
        int i5;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i6;
        int i7;
        int i8;
        float f2;
        float f3;
        float f4;
        int i9;
        int i10;
        float f5;
        int i11;
        int i12;
        float f6;
        int i13;
        int iA;
        int i14;
        p9b1 p9b1Var = this;
        long j2 = kqc1Var.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        izr0 izr0Var2 = p9b1Var.c;
        izr0Var2.P(bArr, i + i2);
        izr0Var2.R(i);
        Charset charsetN = izr0Var2.N();
        if (charsetN == null) {
            charsetN = StandardCharsets.UTF_8;
        }
        boolean z = p9b1Var.a;
        if (!z) {
            p9b1Var.b(izr0Var2, charsetN);
        }
        tgv tgvVarA = z ? p9b1Var.b : null;
        while (true) {
            String strR = izr0Var2.r(charsetN);
            if (strR == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !kqc1Var.a) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            bhn0.w();
                            return;
                        }
                        long jLongValue = ((Long) arrayList2.get(i15)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        bfo bfoVar = new bfo(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            aklVar.accept(bfoVar);
                        } else if (arrayList3 != null) {
                            arrayList3.add(bfoVar);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        aklVar.accept((bfo) it.next());
                    }
                    return;
                }
                return;
            }
            if (strR.startsWith("Format:")) {
                tgvVarA = tgv.a(strR);
            } else {
                if (strR.startsWith("Dialogue:")) {
                    if (tgvVarA == null) {
                        oon1.H("Skipping dialogue line before complete format: ".concat(strR));
                    } else {
                        int i16 = tgvVarA.f;
                        dm5.m(strR.startsWith("Dialogue:"));
                        String strSubstring = strR.substring(9);
                        int i17 = tgvVarA.a;
                        String[] strArrSplit = strSubstring.split(",", i16);
                        if (strArrSplit.length != i16) {
                            oon1.H("Skipping dialogue line with fewer columns than format: ".concat(strR));
                        } else {
                            if (i17 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i17].trim());
                                } catch (RuntimeException unused) {
                                    oon1.H("Fail to parse layer: " + strArrSplit[i17]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jC = c(strArrSplit[tgvVarA.b]);
                            if (jC == -9223372036854775807L) {
                                oon1.H("Skipping invalid timing: ".concat(strR));
                            } else {
                                j = j2;
                                long jC2 = c(strArrSplit[tgvVarA.c]);
                                if (jC2 == -9223372036854775807L || jC2 <= jC) {
                                    tgvVar = tgvVarA;
                                    izr0Var = izr0Var2;
                                    oon1.H("Skipping invalid timing: ".concat(strR));
                                } else {
                                    LinkedHashMap linkedHashMap = p9b1Var.d;
                                    s9b1 s9b1Var = (linkedHashMap == null || (i14 = tgvVarA.d) == -1) ? null : (s9b1) linkedHashMap.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[tgvVarA.e];
                                    Matcher matcher = r9b1.a.matcher(str);
                                    PointF pointF = null;
                                    int i18 = -1;
                                    while (matcher.find()) {
                                        tgv tgvVar2 = tgvVarA;
                                        izr0 izr0Var3 = izr0Var2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = r9b1.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        try {
                                            Matcher matcher2 = r9b1.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = s9b1.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i18 = iA;
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        tgvVarA = tgvVar2;
                                        izr0Var2 = izr0Var3;
                                    }
                                    tgvVar = tgvVarA;
                                    izr0Var = izr0Var2;
                                    String strReplace = r9b1.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = p9b1Var.e;
                                    float f8 = p9b1Var.f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (s9b1Var != null) {
                                        boolean z2 = s9b1Var.g;
                                        Integer num = s9b1Var.d;
                                        Integer num2 = s9b1Var.c;
                                        if (num2 != null) {
                                            i9 = 33;
                                            i10 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i9 = 33;
                                            i10 = 0;
                                        }
                                        if (s9b1Var.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i10, spannableString.length(), i9);
                                        }
                                        float f9 = s9b1Var.e;
                                        if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i11 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f9 / f8;
                                            i11 = 1;
                                        }
                                        boolean z3 = s9b1Var.f;
                                        if (z3 && z2) {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            if (z3) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z2 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (s9b1Var.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i13);
                                        }
                                        if (s9b1Var.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i13);
                                        }
                                        i5 = i12;
                                        f = f6;
                                    } else {
                                        f7 = f7;
                                        f8 = f8;
                                        i4 = 0;
                                        f = -3.4028235E38f;
                                        i5 = Integer.MIN_VALUE;
                                    }
                                    if (i18 == -1) {
                                        i18 = s9b1Var != null ? s9b1Var.b : -1;
                                    }
                                    switch (i18) {
                                        case 0:
                                        default:
                                            td6.p(i18, "Unknown alignment: ");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i19 = os00.INVALID_ID;
                                    switch (i18) {
                                        case 0:
                                        default:
                                            td6.p(i18, "Unknown alignment: ");
                                        case -1:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = i4;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    switch (i18) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            td6.p(i18, "Unknown alignment: ");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i19 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i19 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i19 = i4;
                                            break;
                                    }
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        float f10 = 0.95f;
                                        if (i6 != 0) {
                                            i8 = 1;
                                            if (i6 != 1) {
                                                i7 = 2;
                                                f2 = i6 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i7 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i7 = 2;
                                            i8 = 1;
                                            f2 = 0.05f;
                                        }
                                        if (i19 == 0) {
                                            f10 = 0.05f;
                                        } else if (i19 == i8) {
                                            f10 = 0.5f;
                                        } else if (i19 != i7) {
                                            f10 = -3.4028235E38f;
                                        }
                                        f3 = f10;
                                        f4 = f2;
                                    } else {
                                        f4 = pointF.x / f7;
                                        f3 = pointF.y / f8;
                                    }
                                    feo feoVar = new feo(spannableString, alignment2, null, null, f3, i4, i19, f4, i6, i5, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, os00.INVALID_ID, 0.0f, i3);
                                    int iA2 = a(jC2, arrayList2, arrayList);
                                    for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                        ((List) arrayList.get(iA3)).add(feoVar);
                                    }
                                }
                            }
                        }
                    }
                    j = j2;
                    tgvVar = tgvVarA;
                    izr0Var = izr0Var2;
                } else {
                    j = j2;
                    tgvVar = tgvVarA;
                    izr0Var = izr0Var2;
                }
                p9b1Var = this;
                j2 = j;
                charsetN = charsetN;
                tgvVarA = tgvVar;
                izr0Var2 = izr0Var;
            }
        }
    }

    public final int i() {
        return 1;
    }
}
