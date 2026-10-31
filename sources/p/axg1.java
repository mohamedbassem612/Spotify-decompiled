package p;

import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import app.p000rive.runtime.kotlin.fonts.Fonts;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class axg1 implements lqc1 {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final hr41 i = new hr41(1, 1, 30.0f);
    public final XmlPullParserFactory a;

    public axg1() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            bhn0.o("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static cxg1 a(cxg1 cxg1Var) {
        return cxg1Var == null ? new cxg1() : cxg1Var;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            oon1.H("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            dm5.k("Invalid cell resolution %s %s", i2, i3, z);
            return i3;
        } catch (NumberFormatException unused) {
            oon1.H("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, cxg1 cxg1Var) throws SubtitleDecoderException {
        Matcher matcher;
        String str2 = zoi1.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(gvg.j(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            oon1.H("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(f4i1.f("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                cxg1Var.j = 3;
                break;
            case "em":
                cxg1Var.j = 2;
                break;
            case "px":
                cxg1Var.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(f4i1.f("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        cxg1Var.k = Float.parseFloat(strGroup2);
    }

    public static hr41 f(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = zoi1.a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            dm5.n(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f2 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f2 = 1.0f;
        }
        hr41 hr41Var = i;
        int i3 = hr41Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = hr41Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new hr41(i3, i4, i2 * f2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x021d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    public static void h(XmlPullParser xmlPullParser, HashMap map, int i2, f3a f3aVar, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strS;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        int i4;
        bxg1 bxg1Var;
        String strS2;
        cxg1 cxg1Var;
        float f7;
        String strS3;
        cxg1 cxg1Var2;
        String strS4;
        cxg1 cxg1Var3;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (cpn1.x(xmlPullParser, "style")) {
                String strS5 = cpn1.s(xmlPullParser, "style");
                cxg1 cxg1VarK = k(xmlPullParser, new cxg1());
                if (strS5 != null) {
                    String strTrim = strS5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str = zoi1.a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str2 : strArrSplit) {
                        cxg1VarK.a((cxg1) map.get(str2));
                    }
                }
                String str3 = cxg1VarK.l;
                if (str3 != null) {
                    map.put(str3, cxg1VarK);
                }
            } else if (cpn1.x(xmlPullParser, "region")) {
                String strS6 = cpn1.s(xmlPullParser, "id");
                if (strS6 != null) {
                    String strS7 = cpn1.s(xmlPullParser, "origin");
                    if (strS7 == null && (strS4 = cpn1.s(xmlPullParser, "style")) != null && (cxg1Var3 = (cxg1) map.get(strS4)) != null) {
                        strS7 = cxg1Var3.t;
                    }
                    int i5 = 2;
                    Pattern pattern = g;
                    Pattern pattern2 = f;
                    if (strS7 != null) {
                        Matcher matcher = pattern2.matcher(strS7);
                        Matcher matcher2 = pattern.matcher(strS7);
                        if (matcher.matches()) {
                            try {
                                String strGroup = matcher.group(1);
                                strGroup.getClass();
                                f2 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher.group(2);
                                strGroup2.getClass();
                                f3 = Float.parseFloat(strGroup2) / 100.0f;
                            } catch (NumberFormatException unused) {
                                oon1.H("Ignoring region with malformed origin: ".concat(strS7));
                            }
                        } else if (!matcher2.matches()) {
                            oon1.H("Ignoring region with unsupported origin: ".concat(strS7));
                        } else if (f3aVar == null) {
                            oon1.H("Ignoring region with missing tts:extent: ".concat(strS7));
                        } else {
                            try {
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                int i6 = Integer.parseInt(strGroup3);
                                String strGroup4 = matcher2.group(2);
                                strGroup4.getClass();
                                int i7 = Integer.parseInt(strGroup4);
                                float f8 = i6 / f3aVar.a;
                                f3 = i7 / f3aVar.b;
                                f2 = f8;
                            } catch (NumberFormatException unused2) {
                                oon1.H("Ignoring region with malformed origin: ".concat(strS7));
                            }
                        }
                        bxg1Var = null;
                    } else {
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    String strS8 = cpn1.s(xmlPullParser, "extent");
                    if (strS8 == null && (strS3 = cpn1.s(xmlPullParser, "style")) != null && (cxg1Var2 = (cxg1) map.get(strS3)) != null) {
                        strS8 = cxg1Var2.u;
                    }
                    if (strS8 != null) {
                        Matcher matcher3 = pattern2.matcher(strS8);
                        Matcher matcher4 = pattern.matcher(strS8);
                        if (matcher3.matches()) {
                            try {
                                String strGroup5 = matcher3.group(1);
                                strGroup5.getClass();
                                f7 = Float.parseFloat(strGroup5) / 100.0f;
                                String strGroup6 = matcher3.group(2);
                                strGroup6.getClass();
                                f4 = Float.parseFloat(strGroup6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                ktd.r("Ignoring region with malformed extent: ", strS7);
                                bxg1Var = null;
                            }
                        } else {
                            if (!matcher4.matches()) {
                                ktd.r("Ignoring region with unsupported extent: ", strS7);
                            } else if (f3aVar == null) {
                                ktd.r("Ignoring region with missing tts:extent: ", strS7);
                            } else {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i8 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i9 = Integer.parseInt(strGroup8);
                                float f9 = i8 / f3aVar.a;
                                f4 = i9 / f3aVar.b;
                                f7 = f9;
                            }
                            bxg1Var = null;
                        }
                        f5 = f7;
                    } else {
                        f4 = 1.0f;
                        f5 = 1.0f;
                    }
                    String strS9 = cpn1.s(xmlPullParser, "displayAlign");
                    if (strS9 == null && (strS2 = cpn1.s(xmlPullParser, "style")) != null && (cxg1Var = (cxg1) map.get(strS2)) != null) {
                        strS9 = cxg1Var.v;
                    }
                    if (strS9 != null) {
                        String strW = eth.W(strS9);
                        strW.getClass();
                        if (strW.equals("center")) {
                            f6 = f3 + (f4 / 2.0f);
                            i3 = 1;
                        } else if (strW.equals("after")) {
                            f6 = f3 + f4;
                            i3 = 2;
                        } else {
                            f6 = f3;
                            i3 = 0;
                        }
                    } else {
                        f6 = f3;
                        i3 = 0;
                    }
                    float f10 = 1.0f / i2;
                    String strS10 = cpn1.s(xmlPullParser, "writingMode");
                    if (strS10 != null) {
                        String strW2 = eth.W(strS10);
                        strW2.getClass();
                        switch (strW2) {
                            case "tb":
                            case "tblr":
                                i4 = i5;
                                break;
                            case "tbrl":
                                i4 = 1;
                                break;
                            default:
                                i5 = os00.INVALID_ID;
                                i4 = i5;
                                break;
                        }
                    } else {
                        i5 = os00.INVALID_ID;
                        i4 = i5;
                    }
                    bxg1Var = new bxg1(strS6, f2, f6, 0, i3, f5, f4, 1, f10, i4);
                } else {
                    bxg1Var = null;
                }
                if (bxg1Var != null) {
                    map2.put(bxg1Var.a, bxg1Var);
                }
            } else if (cpn1.x(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (cpn1.x(xmlPullParser, "image") && (strS = cpn1.s(xmlPullParser, "id")) != null) {
                        map3.put(strS, xmlPullParser.nextText());
                    }
                } while (!cpn1.v(xmlPullParser, "metadata"));
            }
        } while (!cpn1.v(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static zwg1 j(XmlPullParser xmlPullParser, zwg1 zwg1Var, HashMap map, hr41 hr41Var) throws SubtitleDecoderException {
        long j;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        cxg1 cxg1VarK = k(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jL = -9223372036854775807L;
        long jL2 = -9223372036854775807L;
        long jL3 = -9223372036854775807L;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jL3 = l(attributeValue, hr41Var);
                    break;
                case "end":
                    jL2 = l(attributeValue, hr41Var);
                    break;
                case "begin":
                    jL = l(attributeValue, hr41Var);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = zoi1.a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (zwg1Var != null) {
            long j2 = zwg1Var.d;
            if (j2 != -9223372036854775807L) {
                jL = jL != -9223372036854775807L ? jL + j2 : j2;
                if (jL2 != -9223372036854775807L) {
                    jL2 += j2;
                }
            }
        }
        if (jL2 != -9223372036854775807L) {
            j = jL2;
        } else {
            if (jL3 != -9223372036854775807L) {
                jL2 = jL + jL3;
            } else if (zwg1Var != null) {
                long j3 = zwg1Var.e;
                if (j3 != -9223372036854775807L) {
                    j = j3;
                }
            }
            j = jL2;
        }
        return new zwg1(xmlPullParser.getName(), null, jL, j, cxg1VarK, strArr, str, strSubstring, zwg1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:125:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x0219  */
    /* JADX WARN: Code duplicated, block: B:148:0x022d  */
    /* JADX WARN: Code duplicated, block: B:154:0x023b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0249  */
    /* JADX WARN: Code duplicated, block: B:162:0x0268  */
    /* JADX WARN: Code duplicated, block: B:164:0x0279  */
    /* JADX WARN: Code duplicated, block: B:167:0x027f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0289  */
    /* JADX WARN: Code duplicated, block: B:174:0x029f  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:184:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:185:0x02be  */
    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    /* JADX WARN: Code duplicated, block: B:84:0x012d  */
    public static cxg1 k(XmlPullParser xmlPullParser, cxg1 cxg1Var) {
        byte b2;
        int i2;
        zl61 zl61VarR;
        zl61 zl61VarR2;
        zl61 zl61VarR3;
        String str;
        int iHashCode;
        String str2;
        int iHashCode2;
        int i3;
        e4e1 e4e1Var;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        cxg1 cxg1VarA = cxg1Var;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            String attributeName = xmlPullParser.getAttributeName(i4);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b2 = 0;
                    break;
                case "extent":
                    b2 = 1;
                    break;
                case "fontFamily":
                    b2 = 2;
                    break;
                case "textAlign":
                    b2 = 3;
                    break;
                case "origin":
                    b2 = 4;
                    break;
                case "textDecoration":
                    b2 = 5;
                    break;
                case "fontWeight":
                    b2 = 6;
                    break;
                case "id":
                    b2 = 7;
                    break;
                case "ruby":
                    b2 = 8;
                    break;
                case "color":
                    b2 = 9;
                    break;
                case "shear":
                    b2 = 10;
                    break;
                case "textCombine":
                    b2 = 11;
                    break;
                case "fontSize":
                    b2 = 12;
                    break;
                case "textEmphasis":
                    b2 = 13;
                    break;
                case "rubyPosition":
                    b2 = 14;
                    break;
                case "backgroundColor":
                    b2 = 15;
                    break;
                case "displayAlign":
                    b2 = 16;
                    break;
                case "multiRowAlign":
                    b2 = 17;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b2) {
                case 0:
                    cxg1VarA = a(cxg1VarA);
                    cxg1VarA.i = Fonts.Font.STYLE_ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    cxg1VarA = a(cxg1VarA);
                    cxg1VarA.u = attributeValue;
                    break;
                case 2:
                    cxg1VarA = a(cxg1VarA);
                    cxg1VarA.a = attributeValue;
                    break;
                case 3:
                    cxg1VarA = a(cxg1VarA);
                    String strW = eth.W(attributeValue);
                    strW.getClass();
                    switch (strW) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    cxg1VarA.o = alignment;
                    break;
                case 4:
                    cxg1VarA = a(cxg1VarA);
                    cxg1VarA.t = attributeValue;
                    break;
                case 5:
                    String strW2 = eth.W(attributeValue);
                    strW2.getClass();
                    switch (strW2) {
                        case "nounderline":
                            cxg1VarA = a(cxg1VarA);
                            cxg1VarA.g = 0;
                            break;
                        case "underline":
                            cxg1VarA = a(cxg1VarA);
                            cxg1VarA.g = 1;
                            break;
                        case "nolinethrough":
                            cxg1VarA = a(cxg1VarA);
                            cxg1VarA.f = 0;
                            break;
                        case "linethrough":
                            cxg1VarA = a(cxg1VarA);
                            cxg1VarA.f = 1;
                            break;
                    }
                    break;
                case 6:
                    cxg1VarA = a(cxg1VarA);
                    cxg1VarA.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        cxg1VarA = a(cxg1VarA);
                        cxg1VarA.l = attributeValue;
                    }
                    break;
                case 8:
                    String strW3 = eth.W(attributeValue);
                    strW3.getClass();
                    switch (strW3) {
                        case "baseContainer":
                        case "base":
                            cxg1VarA = a(cxg1VarA);
                            cxg1VarA.m = 2;
                            break;
                        case "container":
                            cxg1VarA = a(cxg1VarA);
                            cxg1VarA.m = 1;
                            break;
                        case "delimiter":
                            cxg1VarA = a(cxg1VarA);
                            cxg1VarA.m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            cxg1VarA = a(cxg1VarA);
                            cxg1VarA.m = 3;
                            break;
                    }
                    break;
                case 9:
                    cxg1VarA = a(cxg1VarA);
                    try {
                        cxg1VarA.b = l9h.a(attributeValue, false);
                        cxg1VarA.c = true;
                    } catch (IllegalArgumentException unused) {
                        ktd.r("Failed parsing color value: ", attributeValue);
                    }
                    break;
                case 10:
                    cxg1 cxg1VarA2 = a(cxg1VarA);
                    Matcher matcher = e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e2) {
                            oon1.I("Failed to parse shear: " + attributeValue, e2);
                        }
                    } else {
                        ktd.r("Invalid value for shear: ", attributeValue);
                    }
                    cxg1VarA2.s = fMin;
                    cxg1VarA = cxg1VarA2;
                    break;
                case 11:
                    String strW4 = eth.W(attributeValue);
                    strW4.getClass();
                    if (strW4.equals("all")) {
                        cxg1VarA = a(cxg1VarA);
                        cxg1VarA.q = 1;
                    } else if (strW4.equals("none")) {
                        cxg1VarA = a(cxg1VarA);
                        cxg1VarA.q = 0;
                    }
                    break;
                case 12:
                    try {
                        cxg1VarA = a(cxg1VarA);
                        e(attributeValue, cxg1VarA);
                    } catch (SubtitleDecoderException unused2) {
                        ktd.r("Failed parsing fontSize value: ", attributeValue);
                    }
                    break;
                case 13:
                    cxg1VarA = a(cxg1VarA);
                    Pattern pattern = e4e1.d;
                    if (attributeValue == null) {
                        e4e1Var = null;
                    } else {
                        String strW5 = eth.W(attributeValue.trim());
                        if (strW5.isEmpty()) {
                            e4e1Var = null;
                        } else {
                            t380 t380VarQ = t380.q(TextUtils.split(strW5, e4e1.d));
                            String str4 = (String) hr80.q(zqo1.r(e4e1.h, t380VarQ), "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i2 = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i2 = -2;
                                }
                                zl61VarR = zqo1.r(e4e1.e, t380VarQ);
                                if (zl61VarR.isEmpty()) {
                                    zl61VarR2 = zqo1.r(e4e1.g, t380VarQ);
                                    zl61VarR3 = zqo1.r(e4e1.f, t380VarQ);
                                    if (zl61VarR2.isEmpty() || !zl61VarR3.isEmpty()) {
                                        str = (String) hr80.q(zl61VarR2, "filled");
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i5 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            str2 = (String) hr80.q(zl61VarR3, "circle");
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i3 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i3 = 3;
                                                }
                                                e4e1Var = new e4e1(i3, i5, i2);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i3 = 1;
                                            e4e1Var = new e4e1(i3, i5, i2);
                                        } else {
                                            str.equals("filled");
                                        }
                                        str2 = (String) hr80.q(zl61VarR3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i3 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i3 = 3;
                                            }
                                            e4e1Var = new e4e1(i3, i5, i2);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i3 = 1;
                                        e4e1Var = new e4e1(i3, i5, i2);
                                    } else {
                                        e4e1Var = new e4e1(-1, 0, i2);
                                    }
                                } else {
                                    str3 = (String) new ao90(zl61VarR).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i6 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        e4e1Var = new e4e1(i6, 0, i2);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    e4e1Var = new e4e1(i6, 0, i2);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i2 = 1;
                            zl61VarR = zqo1.r(e4e1.e, t380VarQ);
                            if (zl61VarR.isEmpty()) {
                                str3 = (String) new ao90(zl61VarR).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    e4e1Var = new e4e1(i6, 0, i2);
                                } else {
                                    str3.equals("auto");
                                }
                                e4e1Var = new e4e1(i6, 0, i2);
                            } else {
                                zl61VarR2 = zqo1.r(e4e1.g, t380VarQ);
                                zl61VarR3 = zqo1.r(e4e1.f, t380VarQ);
                                if (zl61VarR2.isEmpty()) {
                                    str = (String) hr80.q(zl61VarR2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) hr80.q(zl61VarR3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i3 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i3 = 3;
                                            }
                                            e4e1Var = new e4e1(i3, i5, i2);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i3 = 1;
                                        e4e1Var = new e4e1(i3, i5, i2);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) hr80.q(zl61VarR3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i3 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i3 = 3;
                                        }
                                        e4e1Var = new e4e1(i3, i5, i2);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i3 = 1;
                                    e4e1Var = new e4e1(i3, i5, i2);
                                } else {
                                    str = (String) hr80.q(zl61VarR2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) hr80.q(zl61VarR3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i3 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i3 = 3;
                                            }
                                            e4e1Var = new e4e1(i3, i5, i2);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i3 = 1;
                                        e4e1Var = new e4e1(i3, i5, i2);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) hr80.q(zl61VarR3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i3 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i3 = 3;
                                        }
                                        e4e1Var = new e4e1(i3, i5, i2);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i3 = 1;
                                    e4e1Var = new e4e1(i3, i5, i2);
                                }
                            }
                        }
                    }
                    cxg1VarA.r = e4e1Var;
                    break;
                case 14:
                    String strW6 = eth.W(attributeValue);
                    strW6.getClass();
                    if (strW6.equals("before")) {
                        cxg1VarA = a(cxg1VarA);
                        cxg1VarA.n = 1;
                    } else if (strW6.equals("after")) {
                        cxg1VarA = a(cxg1VarA);
                        cxg1VarA.n = 2;
                    }
                    break;
                case 15:
                    cxg1VarA = a(cxg1VarA);
                    try {
                        cxg1VarA.d = l9h.a(attributeValue, false);
                        cxg1VarA.e = true;
                    } catch (IllegalArgumentException unused3) {
                        ktd.r("Failed parsing background value: ", attributeValue);
                    }
                    break;
                case 16:
                    cxg1VarA = a(cxg1VarA);
                    cxg1VarA.v = attributeValue;
                    break;
                case 17:
                    cxg1VarA = a(cxg1VarA);
                    String strW7 = eth.W(attributeValue);
                    strW7.getClass();
                    switch (strW7) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    cxg1VarA.f30p = alignment;
                    break;
            }
        }
        return cxg1VarA;
    }

    public static long l(String str, hr41 hr41Var) throws SubtitleDecoderException {
        double d2;
        double d3;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d4 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d5 = d4 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d6 = d5 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d7 = d6 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / hr41Var.a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) hr41Var.b)) / ((double) hr41Var.a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(l1d.m("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d9 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d2 = hr41Var.a;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            case "h":
                d3 = 3600.0d;
                break;
            case "m":
                d3 = 60.0d;
                break;
            case "t":
                d2 = hr41Var.c;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            case "ms":
                d2 = 1000.0d;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            default:
                return (long) (d9 * 1000000.0d);
        }
        d9 *= d3;
        return (long) (d9 * 1000000.0d);
    }

    public static f3a m(XmlPullParser xmlPullParser) {
        String strS = cpn1.s(xmlPullParser, "extent");
        if (strS == null) {
            return null;
        }
        Matcher matcher = g.matcher(strS);
        if (!matcher.matches()) {
            oon1.H("Ignoring non-pixel tts extent: ".concat(strS));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new f3a(i2, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            oon1.H("Ignoring malformed tts extent: ".concat(strS));
            return null;
        }
    }

    public final ipc1 d(int i2, byte[] bArr, int i3) {
        ipc1 ipc1Var;
        ipc1 ipc1Var2 = null;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new bxg1("", -3.4028235E38f, -3.4028235E38f, os00.INVALID_ID, os00.INVALID_ID, -3.4028235E38f, -3.4028235E38f, os00.INVALID_ID, -3.4028235E38f, os00.INVALID_ID));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            hr41 hr41VarF = i;
            int iC = 15;
            int i4 = 0;
            e821 e821Var = null;
            f3a f3aVarM = null;
            while (eventType != 1) {
                zwg1 zwg1Var = (zwg1) arrayDeque.peek();
                if (i4 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    ipc1Var = ipc1Var2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                hr41VarF = f(xmlPullParserNewPullParser);
                                iC = c(xmlPullParserNewPullParser);
                                f3aVarM = m(xmlPullParserNewPullParser);
                            }
                            hr41 hr41Var = hr41VarF;
                            int i5 = iC;
                            f3a f3aVar = f3aVarM;
                            if (b(name)) {
                                if ("head".equals(name)) {
                                    h(xmlPullParserNewPullParser, map, i5, f3aVar, map2, map3);
                                } else {
                                    try {
                                        zwg1 zwg1VarJ = j(xmlPullParserNewPullParser, zwg1Var, map2, hr41Var);
                                        arrayDeque.push(zwg1VarJ);
                                        if (zwg1Var != null) {
                                            ArrayList arrayList = zwg1Var.m;
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                zwg1Var.m = arrayList;
                                            }
                                            arrayList.add(zwg1VarJ);
                                        }
                                    } catch (SubtitleDecoderException e2) {
                                        oon1.I("Suppressing parser error", e2);
                                        i4++;
                                    }
                                }
                                f3aVarM = f3aVar;
                                iC = i5;
                                hr41VarF = hr41Var;
                            } else {
                                oon1.A("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            }
                            i4++;
                            f3aVarM = f3aVar;
                            iC = i5;
                            hr41VarF = hr41Var;
                        } catch (IOException e3) {
                            e = e3;
                            k220.p("Unexpected error when reading input.", e);
                            return ipc1Var;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            k220.p("Unable to decode source", e);
                            return ipc1Var;
                        }
                    } else if (eventType == 4) {
                        zwg1Var.getClass();
                        zwg1 zwg1VarA = zwg1.a(xmlPullParserNewPullParser.getText());
                        ArrayList arrayList2 = zwg1Var.m;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            zwg1Var.m = arrayList2;
                        }
                        arrayList2.add(zwg1VarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            zwg1 zwg1Var2 = (zwg1) arrayDeque.peek();
                            zwg1Var2.getClass();
                            e821Var = new e821(zwg1Var2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    ipc1Var = ipc1Var2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                ipc1Var2 = ipc1Var;
            }
            ipc1Var = ipc1Var2;
            e821Var.getClass();
            return e821Var;
        } catch (IOException e5) {
            e = e5;
            ipc1Var = ipc1Var2;
        } catch (XmlPullParserException e6) {
            e = e6;
            ipc1Var = ipc1Var2;
        }
    }

    public final void g(byte[] bArr, int i2, int i3, kqc1 kqc1Var, akl aklVar) {
        iqo1.y(d(i2, bArr, i3), kqc1Var, aklVar);
    }

    public final int i() {
        return 1;
    }
}
