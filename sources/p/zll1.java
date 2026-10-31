package p;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class zll1 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, wll1 wll1Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int i2;
        int i3;
        int i4 = wll1Var.b;
        int length = spannableStringBuilder.length();
        String str2 = wll1Var.a;
        str2.getClass();
        int i5 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case "c":
                for (String str3 : wll1Var.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new kpk1(wll1Var.c), i4, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, wll1Var);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, vll1.c);
                int i6 = wll1Var.b;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((vll1) arrayList.get(i7)).a.a)) {
                        vll1 vll1Var = (vll1) arrayList.get(i7);
                        int iC2 = c(list2, str, vll1Var.a);
                        if (iC2 == i5) {
                            iC2 = iC != i5 ? iC : 1;
                        }
                        int i8 = vll1Var.a.b - length2;
                        int i9 = vll1Var.b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new sy31(charSequenceSubSequence.toString(), iC2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, wll1Var);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            tll1 tll1Var = ((xll1) arrayListB.get(i10)).b;
            int i11 = tll1Var.l;
            if (i11 == -1 && tll1Var.m == -1) {
                i = -1;
            } else {
                i = (tll1Var.m == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i12 = tll1Var.l;
                if (i12 == -1 && tll1Var.m == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i12 == 1 ? 1 : 0) | (tll1Var.m == 1 ? 2 : 0);
                }
                w0h1.g(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (tll1Var.j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (tll1Var.k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (tll1Var.g) {
                if (!tll1Var.g) {
                    eg.m("Font color not defined");
                    return;
                }
                w0h1.g(spannableStringBuilder, new ForegroundColorSpan(tll1Var.f), i4, length);
            }
            if (tll1Var.i) {
                if (!tll1Var.i) {
                    eg.m("Background color not defined.");
                    return;
                }
                w0h1.g(spannableStringBuilder, new BackgroundColorSpan(tll1Var.h), i4, length);
            }
            if (tll1Var.e != null) {
                w0h1.g(spannableStringBuilder, new TypefaceSpan(tll1Var.e), i4, length);
            }
            int i13 = tll1Var.n;
            if (i13 == 1) {
                w0h1.g(spannableStringBuilder, new AbsoluteSizeSpan((int) tll1Var.o, true), i4, length);
            } else if (i13 == 2) {
                w0h1.g(spannableStringBuilder, new RelativeSizeSpan(tll1Var.o), i4, length);
            } else if (i13 == 3) {
                w0h1.g(spannableStringBuilder, new RelativeSizeSpan(tll1Var.o / 100.0f), i4, length);
            }
            if (tll1Var.q) {
                spannableStringBuilder.setSpan(new jr60(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, wll1 wll1Var) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            tll1 tll1Var = (tll1) list.get(i);
            String str2 = wll1Var.a;
            Set set = wll1Var.d;
            String str3 = wll1Var.c;
            if (tll1Var.a.isEmpty() && tll1Var.b.isEmpty() && tll1Var.c.isEmpty() && tll1Var.d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = tll1.a(tll1.a(tll1.a(0, tll1Var.a, 1073741824, str), tll1Var.b, 2, str2), tll1Var.d, 4, str3);
                if (iA == -1 || !set.containsAll(tll1Var.c)) {
                    r4 = 0;
                } else {
                    size = iA + (tll1Var.c.size() * 4);
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new xll1(r4, tll1Var));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, wll1 wll1Var) {
        ArrayList arrayListB = b(list, str, wll1Var);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((xll1) arrayListB.get(i)).b.f140p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static ull1 d(String str, Matcher matcher, izr0 izr0Var, ArrayList arrayList) {
        yll1 yll1Var = new yll1();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            yll1Var.a = cml1.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            yll1Var.b = cml1.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, yll1Var);
            StringBuilder sb = new StringBuilder();
            String strR = izr0Var.r(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strR)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strR.trim());
                strR = izr0Var.r(StandardCharsets.UTF_8);
            }
            yll1Var.c = f(str, arrayList, sb.toString());
            return new ull1(yll1Var.a().a(), yll1Var.a, yll1Var.b);
        } catch (IllegalArgumentException unused) {
            oon1.H("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, yll1 yll1Var) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, yll1Var);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                break;
                            default:
                                oon1.H("Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        yll1Var.d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i = 0;
                                    break;
                                case "center":
                                case "middle":
                                    break;
                                case "line-right":
                                case "end":
                                    i = 2;
                                    break;
                                default:
                                    oon1.H("Invalid anchor value: ".concat(strSubstring));
                                    i = Integer.MIN_VALUE;
                                    break;
                            }
                            yll1Var.i = i;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        yll1Var.h = cml1.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        yll1Var.j = cml1.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i = 2;
                        } else if (!strGroup2.equals("rl")) {
                            oon1.H("Invalid 'vertical' value: ".concat(strGroup2));
                            i = Integer.MIN_VALUE;
                        }
                        yll1Var.k = i;
                    } else {
                        oon1.H("Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                oon1.H("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, List list, String str2) {
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (wll1) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new wll1(0, "", "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            oon1.H("ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        dm5.m(!strTrim2.isEmpty());
                        String str3 = zoi1.a;
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        dm5.m(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c2 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c2 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c2];
                                        HashSet hashSet = new HashSet();
                                        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                                            hashSet.add(strArrSplit[i4]);
                                        }
                                        arrayDeque.push(new wll1(length2, str5, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        wll1 wll1Var = (wll1) arrayDeque.pop();
                                        a(str, wll1Var, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new vll1(wll1Var, spannableStringBuilder.length()));
                                        }
                                        if (wll1Var.a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static void g(String str, yll1 yll1Var) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    oon1.H("Invalid anchor value: ".concat(strSubstring));
                    i = os00.INVALID_ID;
                    break;
            }
            yll1Var.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            yll1Var.e = cml1.b(str);
            yll1Var.f = false;
        } else {
            yll1Var.e = Integer.parseInt(str);
            yll1Var.f = true;
        }
    }
}
