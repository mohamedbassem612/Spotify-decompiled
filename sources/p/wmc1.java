package p;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wmc1 implements lqc1 {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final izr0 c = new izr0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    public static feo a(Spanned spanned, String str) {
        int i;
        int i2;
        float f;
        if (str == null) {
            return new feo(spanned, null, null, null, -3.4028235E38f, os00.INVALID_ID, os00.INVALID_ID, -3.4028235E38f, os00.INVALID_ID, os00.INVALID_ID, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, os00.INVALID_ID, 0.0f, 0);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i = 1;
                } else {
                    i = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                i = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i = 1;
                } else {
                    i = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    i = 1;
                } else {
                    i = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                i = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    i = 1;
                } else {
                    i = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i = 1;
                } else {
                    i = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                i = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i = 1;
                } else {
                    i = 2;
                }
                break;
            default:
                i = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                i2 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i2 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i2 = 1;
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                break;
            default:
                i2 = 1;
                break;
        }
        float f2 = 0.92f;
        if (i == 0) {
            f = 0.08f;
        } else if (i == 1) {
            f = 0.5f;
        } else {
            if (i != 2) {
                bhn0.q();
                return null;
            }
            f = 0.92f;
        }
        if (i2 == 0) {
            f2 = 0.08f;
        } else if (i2 == 1) {
            f2 = 0.5f;
        } else if (i2 != 2) {
            bhn0.q();
            return null;
        }
        return new feo(spanned, null, null, null, f2, 0, i2, f, i, os00.INVALID_ID, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, os00.INVALID_ID, 0.0f, 0);
    }

    public static long b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    public final void g(byte[] bArr, int i, int i2, kqc1 kqc1Var, akl aklVar) {
        String str;
        wmc1 wmc1Var = this;
        long j = kqc1Var.b;
        izr0 izr0Var = wmc1Var.c;
        izr0Var.P(bArr, i + i2);
        izr0Var.R(i);
        Charset charsetN = izr0Var.N();
        if (charsetN == null) {
            charsetN = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !kqc1Var.a) ? null : new ArrayList();
        while (true) {
            String strR = izr0Var.r(charsetN);
            if (strR == null) {
                break;
            }
            if (!strR.isEmpty()) {
                try {
                    Integer.parseInt(strR);
                    String strR2 = izr0Var.r(charsetN);
                    if (strR2 == null) {
                        oon1.H("Unexpected end");
                        break;
                    }
                    Matcher matcher = d.matcher(strR2);
                    if (matcher.matches()) {
                        long jB = b(matcher, 1);
                        long jB2 = b(matcher, 6);
                        StringBuilder sb = wmc1Var.a;
                        sb.setLength(0);
                        long j3 = j2;
                        ArrayList arrayList2 = wmc1Var.b;
                        arrayList2.clear();
                        for (String strR3 = izr0Var.r(charsetN); !TextUtils.isEmpty(strR3); strR3 = izr0Var.r(charsetN)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strR3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = e.matcher(strTrim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i3;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i3 += length;
                                j = j;
                            }
                            sb.append(sb2.toString());
                        }
                        long j4 = j;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (j4 == j3 || jB2 >= j4) {
                            aklVar.accept(new bfo(jB, jB2 - jB, b380.t(a(spannedFromHtml, str))));
                        } else if (arrayList != null) {
                            arrayList.add(new bfo(jB, jB2 - jB, b380.t(a(spannedFromHtml, str))));
                        }
                        wmc1Var = this;
                        j2 = j3;
                        j = j4;
                    } else {
                        oon1.H("Skipping invalid timing: ".concat(strR2));
                        wmc1Var = this;
                    }
                } catch (NumberFormatException unused) {
                    oon1.H("Skipping invalid index: ".concat(strR));
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aklVar.accept((bfo) it.next());
            }
        }
    }

    public final int i() {
        return 1;
    }
}
