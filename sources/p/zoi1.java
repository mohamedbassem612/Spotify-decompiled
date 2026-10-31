package p;

import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.ParserException;
import com.comscore.android.HostApplicationState;
import com.comscore.android.id.IdHelperAndroid;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zoi1 {
    public static final String a;
    public static final byte[] b;
    public static final long[] c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static HashMap g;
    public static final String[] h;
    public static final String[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        a = str + ", " + Build.MODEL + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        b = new byte[0];
        c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        e = Pattern.compile("%([A-Fa-f0-9]{2})");
        f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(int i2, String str) {
        int i3 = 0;
        for (String str2 : j0(str)) {
            if (i2 == asj0.i(asj0.e(str2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String B(int i2, String str) {
        String[] strArrJ0 = j0(str);
        if (strArrJ0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrJ0) {
            if (i2 == asj0.i(asj0.e(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static Point C(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && T(context)) {
            String strK = Build.VERSION.SDK_INT < 28 ? K("sys.display-size") : K("vendor.display-size");
            if (!TextUtils.isEmpty(strK)) {
                try {
                    String[] strArrSplit = strK.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                oon1.v("Invalid display size: " + strK);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static Looper D() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static int E(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int F(String str) {
        String[] strArrSplit;
        int length;
        int i2 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static int G(int i2, ByteOrder byteOrder) {
        if (i2 == 32) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 4 : 1895825408;
        }
        if (i2 != 64) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 1879048192 : 1912602624;
    }

    public static long H(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
    }

    public static int I(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long J(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / ((double) f2));
    }

    public static String K(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            oon1.w("Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String L(int i2) {
        switch (i2) {
            case -2:
                return IdHelperAndroid.NO_ID_AVAILABLE;
            case HostApplicationState.UNKNOWN /* -1 */:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? gvg.e(i2, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean M(r8u0 r8u0Var) {
        boolean z = false;
        if (r8u0Var == null) {
            return false;
        }
        int playbackState = r8u0Var.getPlaybackState();
        if (playbackState != 1 || !r8u0Var.Y(2)) {
            if (playbackState == 4 && r8u0Var.Y(4)) {
                r8u0Var.y();
            }
            if (r8u0Var.Y(1)) {
                return z;
            }
            r8u0Var.j();
            return true;
        }
        r8u0Var.e();
        z = true;
        if (r8u0Var.Y(1)) {
            return z;
        }
        r8u0Var.j();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[RETURN] */
    public static int N(Uri uri, String str) {
        int i2;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || (!eth.r("rtsp", scheme) && !eth.r("rtspt", scheme))) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strW = eth.W(lastPathSegment.substring(iLastIndexOf + 1));
                    strW.getClass();
                    switch (strW.hashCode()) {
                        case 104579:
                            if (strW.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strW.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strW.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strW.equals("m3u8")) {
                            }
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        Method dump skipped, instruction units count: 286
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.zoi1.N(android.net.Uri, java.lang.String):int");
                }

                public static boolean O(izr0 izr0Var, izr0 izr0Var2, Inflater inflater) {
                    if (izr0Var.a() == 0) {
                        return false;
                    }
                    if (izr0Var2.b() < izr0Var.a()) {
                        izr0Var2.d(izr0Var.a() * 2);
                    }
                    if (inflater == null) {
                        inflater = new Inflater();
                    }
                    inflater.setInput(izr0Var.e(), izr0Var.f(), izr0Var.a());
                    int iInflate = 0;
                    while (true) {
                        try {
                            iInflate += inflater.inflate(izr0Var2.e(), iInflate, izr0Var2.b() - iInflate);
                            if (inflater.finished()) {
                                izr0Var2.Q(iInflate);
                                inflater.reset();
                                return true;
                            }
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                if (iInflate == izr0Var2.b()) {
                                    izr0Var2.d(izr0Var2.b() * 2);
                                }
                            }
                            inflater.reset();
                            return false;
                        } catch (DataFormatException unused) {
                            inflater.reset();
                            return false;
                        } catch (Throwable th) {
                            inflater.reset();
                            throw th;
                        }
                    }
                }

                public static boolean P(int i2) {
                    return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1895825408 || i2 == 1879048192 || i2 == 1912602624;
                }

                public static boolean Q(Context context) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    if (i2 == 30) {
                        String str = Build.MODEL;
                        if (eth.r(str, "moto g(20)") || eth.r(str, "rmx3231")) {
                            return true;
                        }
                    }
                    return i2 == 34 && eth.r(Build.MODEL, "sm-x200");
                }

                public static boolean R(int i2) {
                    return i2 == 10 || i2 == 13;
                }

                public static boolean S() {
                    String strW = eth.W(Build.DEVICE);
                    return strW.contains("emulator") || strW.contains("emu64a") || strW.contains("emu64x") || strW.contains("generic") || strW.contains("vsoc");
                }

                public static boolean T(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                public static String U(Context context, int i2) {
                    InputStream inputStreamOpenRawResource = null;
                    try {
                        inputStreamOpenRawResource = context.getResources().openRawResource(i2);
                        return v(vgc.b(inputStreamOpenRawResource));
                    } finally {
                        h(inputStreamOpenRawResource);
                    }
                }

                public static void V(int i2, int i3, int i4, ArrayList arrayList) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
                        arrayDeque.addFirst(arrayList.remove(i2 + i5));
                    }
                    arrayList.addAll(Math.min(i4, arrayList.size()), arrayDeque);
                }

                public static long W(long j2) {
                    return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
                }

                public static String X(String str) {
                    if (str == null) {
                        return null;
                    }
                    String strReplace = str.replace('_', '-');
                    if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                        str = strReplace;
                    }
                    String strW = eth.W(str);
                    int i2 = 0;
                    String str2 = strW.split("-", 2)[0];
                    HashMap map = g;
                    if (map == null) {
                        String[] iSOLanguages = Locale.getISOLanguages();
                        int length = iSOLanguages.length;
                        String[] strArr = h;
                        HashMap map2 = new HashMap(length + strArr.length);
                        for (String str3 : iSOLanguages) {
                            try {
                                String iSO3Language = new Locale(str3).getISO3Language();
                                if (!TextUtils.isEmpty(iSO3Language)) {
                                    map2.put(iSO3Language, str3);
                                }
                            } catch (MissingResourceException unused) {
                            }
                        }
                        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                            map2.put(strArr[i3], strArr[i3 + 1]);
                        }
                        g = map2;
                        map = map2;
                    }
                    String str4 = (String) map.get(str2);
                    if (str4 != null) {
                        strW = str4.concat(strW.substring(str2.length()));
                        str2 = str4;
                    }
                    if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                        return strW;
                    }
                    while (true) {
                        String[] strArr2 = i;
                        if (i2 >= strArr2.length) {
                            return strW;
                        }
                        if (strW.startsWith(strArr2[i2])) {
                            return strArr2[i2 + 1] + strW.substring(strArr2[i2].length());
                        }
                        i2 += 2;
                    }
                }

                public static Object[] Y(int i2, Object[] objArr) {
                    dm5.m(i2 <= objArr.length);
                    return Arrays.copyOf(objArr, i2);
                }

                public static long Z(String str) throws ParserException {
                    Matcher matcher = d.matcher(str);
                    if (!matcher.matches()) {
                        throw ParserException.a(null, "Invalid date/time format: ".concat(str));
                    }
                    int i2 = 0;
                    if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                        int i3 = Integer.parseInt(matcher.group(12)) * 60;
                        String strGroup = matcher.group(13);
                        i2 = strGroup != null ? Integer.parseInt(strGroup) + i3 : i3;
                        if ("-".equals(matcher.group(11))) {
                            i2 *= -1;
                        }
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                    gregorianCalendar.clear();
                    gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                    if (!TextUtils.isEmpty(matcher.group(8))) {
                        gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                    }
                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                    return i2 != 0 ? timeInMillis - (((long) i2) * 60000) : timeInMillis;
                }

                public static long a(long j2, long j3) {
                    long jF0 = cwl1.f0(j2, j3);
                    if ((jF0 != Long.MIN_VALUE || j2 + j3 == Long.MIN_VALUE) && (jF0 != Long.MAX_VALUE || j2 + j3 == Long.MAX_VALUE)) {
                        return jF0;
                    }
                    return Long.MAX_VALUE;
                }

                public static float a0(long j2, long j3) {
                    if (j3 == 0 || j2 != j3) {
                        return (j2 / j3) * 100.0f;
                    }
                    return 100.0f;
                }

                public static int b(long[] jArr, long j2, boolean z) {
                    int i2;
                    int iBinarySearch = Arrays.binarySearch(jArr, j2);
                    if (iBinarySearch < 0) {
                        return ~iBinarySearch;
                    }
                    while (true) {
                        i2 = iBinarySearch + 1;
                        if (i2 >= jArr.length || jArr[i2] != j2) {
                            break;
                        }
                        iBinarySearch = i2;
                    }
                    return z ? iBinarySearch : i2;
                }

                public static int b0(long j2, long j3) {
                    long jG0 = cwl1.g0(j2, 100L);
                    return bmq0.Z((jG0 == Long.MAX_VALUE || jG0 == Long.MIN_VALUE) ? j2 / (j3 / 100) : jG0 / j3);
                }

                public static int c(List list, Comparable comparable, boolean z) {
                    int i2;
                    int iBinarySearch = Collections.binarySearch(list, comparable);
                    if (iBinarySearch < 0) {
                        i2 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i3 = iBinarySearch - 1;
                            if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(comparable) != 0) {
                                break;
                            }
                            iBinarySearch = i3;
                        }
                        i2 = iBinarySearch;
                    }
                    return z ? Math.max(0, i2) : i2;
                }

                public static void c0(Handler handler, Runnable runnable) {
                    Looper looper = handler.getLooper();
                    if (looper.getThread().isAlive()) {
                        if (looper == Looper.myLooper()) {
                            runnable.run();
                        } else {
                            handler.post(runnable);
                        }
                    }
                }

                public static int d(p4f0 p4f0Var, long j2) {
                    int iK = p4f0Var.k() - 1;
                    int i2 = 0;
                    while (i2 <= iK) {
                        int i3 = (i2 + iK) >>> 1;
                        if (p4f0Var.e(i3) < j2) {
                            i2 = i3 + 1;
                        } else {
                            iK = i3 - 1;
                        }
                    }
                    int i4 = iK + 1;
                    if (i4 < p4f0Var.k() && p4f0Var.e(i4) == j2) {
                        return i4;
                    }
                    if (iK == -1) {
                        return 0;
                    }
                    return iK;
                }

                public static void d0(int i2, int i3, List list) {
                    if (i2 < 0 || i3 > list.size() || i2 > i3) {
                        bhn0.q();
                    } else if (i2 != i3) {
                        list.subList(i2, i3).clear();
                    }
                }

                public static int e(int[] iArr, int i2, boolean z, boolean z2) {
                    int i3;
                    int i4;
                    int iBinarySearch = Arrays.binarySearch(iArr, i2);
                    if (iBinarySearch < 0) {
                        i4 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i3 = iBinarySearch - 1;
                            if (i3 < 0 || iArr[i3] != i2) {
                                break;
                            }
                            iBinarySearch = i3;
                        }
                        i4 = z ? iBinarySearch : i3;
                    }
                    return z2 ? Math.max(0, i4) : i4;
                }

                public static long e0(int i2, long j2) {
                    return g0(j2, 1000000L, i2, RoundingMode.DOWN);
                }

                public static int f(long[] jArr, long j2, boolean z) {
                    int i2;
                    int iBinarySearch = Arrays.binarySearch(jArr, j2);
                    if (iBinarySearch < 0) {
                        i2 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i3 = iBinarySearch - 1;
                            if (i3 < 0 || jArr[i3] != j2) {
                                break;
                            }
                            iBinarySearch = i3;
                        }
                        i2 = iBinarySearch;
                    }
                    return z ? Math.max(0, i2) : i2;
                }

                public static void f0(long[] jArr, long j2) {
                    long j3;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int i2 = 0;
                    if (j2 >= 1000000 && j2 % 1000000 == 0) {
                        long jU = cwl1.u(j2, 1000000L, RoundingMode.UNNECESSARY);
                        while (i2 < jArr.length) {
                            jArr[i2] = cwl1.u(jArr[i2], jU, roundingMode);
                            i2++;
                        }
                        return;
                    }
                    if (j2 < 1000000 && 1000000 % j2 == 0) {
                        long jU2 = cwl1.u(1000000L, j2, RoundingMode.UNNECESSARY);
                        while (i2 < jArr.length) {
                            jArr[i2] = cwl1.g0(jArr[i2], jU2);
                            i2++;
                        }
                        return;
                    }
                    int i3 = 0;
                    while (i3 < jArr.length) {
                        long j4 = jArr[i3];
                        if (j4 != 0) {
                            if (j2 >= j4 && j2 % j4 == 0) {
                                jArr[i3] = cwl1.u(1000000L, cwl1.u(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j2 >= j4 || j4 % j2 != 0) {
                                j3 = j2;
                                jArr[i3] = h0(j4, 1000000L, j3, roundingMode);
                            } else {
                                jArr[i3] = cwl1.g0(1000000L, cwl1.u(j4, j2, RoundingMode.UNNECESSARY));
                            }
                            j3 = j2;
                        } else {
                            j3 = j2;
                        }
                        i3++;
                        j2 = j3;
                    }
                }

                public static int g(int i2, int i3) {
                    return ((i2 + i3) - 1) / i3;
                }

                public static long g0(long j2, long j3, long j4, RoundingMode roundingMode) {
                    if (j2 == 0 || j3 == 0) {
                        return 0L;
                    }
                    if (j4 >= j3 && j4 % j3 == 0) {
                        return cwl1.u(j2, cwl1.u(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    if (j4 < j3 && j3 % j4 == 0) {
                        return cwl1.g0(j2, cwl1.u(j3, j4, RoundingMode.UNNECESSARY));
                    }
                    if (j4 < j2 || j4 % j2 != 0) {
                        return (j4 >= j2 || j2 % j4 != 0) ? h0(j2, j3, j4, roundingMode) : cwl1.g0(j3, cwl1.u(j2, j4, RoundingMode.UNNECESSARY));
                    }
                    return cwl1.u(j3, cwl1.u(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
                }

                public static void h(Closeable closeable) {
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (IOException unused) {
                        }
                    }
                }

                public static long h0(long j2, long j3, long j4, RoundingMode roundingMode) {
                    long jG0 = cwl1.g0(j2, j3);
                    if (jG0 != Long.MAX_VALUE && jG0 != Long.MIN_VALUE) {
                        return cwl1.u(jG0, j4, roundingMode);
                    }
                    long jA = cwl1.A(Math.abs(j3), Math.abs(j4));
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    long jU = cwl1.u(j3, jA, roundingMode2);
                    long jU2 = cwl1.u(j4, jA, roundingMode2);
                    long jA2 = cwl1.A(Math.abs(j2), Math.abs(jU2));
                    long jU3 = cwl1.u(j2, jA2, roundingMode2);
                    long jU4 = cwl1.u(jU2, jA2, roundingMode2);
                    long jG1 = cwl1.g0(jU3, jU);
                    if (jG1 != Long.MAX_VALUE && jG1 != Long.MIN_VALUE) {
                        return cwl1.u(jG1, jU4, roundingMode);
                    }
                    double d2 = jU3 * (jU / jU4);
                    if (d2 > 9.223372036854776E18d) {
                        return Long.MAX_VALUE;
                    }
                    if (d2 < -9.223372036854776E18d) {
                        return Long.MIN_VALUE;
                    }
                    return bru.d(d2, roundingMode);
                }

                public static float i(float f2, float f3, float f4) {
                    return Math.max(f3, Math.min(f2, f4));
                }

                public static boolean i0(r8u0 r8u0Var, boolean z) {
                    return r8u0Var == null || !r8u0Var.q() || r8u0Var.getPlaybackState() == 1 || r8u0Var.getPlaybackState() == 4 || !(!z || r8u0Var.c0() == 0 || r8u0Var.c0() == 4);
                }

                public static int j(int i2, int i3, int i4) {
                    return Math.max(i3, Math.min(i2, i4));
                }

                public static String[] j0(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                public static long k(long j2, long j3, long j4) {
                    return Math.max(j3, Math.min(j2, j4));
                }

                public static boolean k0(SQLiteDatabase sQLiteDatabase, String str) {
                    return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
                }

                public static boolean l(SparseArray sparseArray, int i2) {
                    return sparseArray.indexOfKey(i2) >= 0;
                }

                public static byte[] l0(int... iArr) {
                    byte[] bArr = new byte[iArr.length * 4];
                    int i2 = 0;
                    for (int i3 : iArr) {
                        bArr[i2] = (byte) (i3 >> 24);
                        bArr[i2 + 1] = (byte) (i3 >> 16);
                        int i4 = i2 + 3;
                        bArr[i2 + 2] = (byte) (i3 >> 8);
                        i2 += 4;
                        bArr[i4] = (byte) i3;
                    }
                    return bArr;
                }

                public static boolean m(Object[] objArr, Object obj) {
                    for (Object obj2 : objArr) {
                        if (Objects.equals(obj2, obj)) {
                            return true;
                        }
                    }
                    return false;
                }

                public static em61 m0(n8d0 n8d0Var, bi7 bi7Var) {
                    em61 em61VarY = em61.y();
                    oph0 oph0Var = new oph0(em61VarY, n8d0Var, (byte) 1);
                    l5u l5uVar = l5u.a;
                    em61VarY.b(oph0Var, l5uVar);
                    n8d0Var.b(new vqh0(n8d0Var, em61VarY, bi7Var, (byte) 17), l5uVar);
                    return em61VarY;
                }

                public static boolean n(SparseArray sparseArray, SparseArray sparseArray2) {
                    if (sparseArray == null) {
                        return sparseArray2 == null;
                    }
                    if (sparseArray2 == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        return sparseArray.contentEquals(sparseArray2);
                    }
                    int size = sparseArray.size();
                    if (size != sparseArray2.size()) {
                        return false;
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                            return false;
                        }
                    }
                    return true;
                }

                public static long n0(long j2) {
                    return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
                }

                public static int o(SparseArray sparseArray) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        return sparseArray.contentHashCode();
                    }
                    int iHashCode = 17;
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
                    }
                    return iHashCode;
                }

                public static Bundle p(Bundle bundle) {
                    if (bundle == null) {
                        return null;
                    }
                    ClassLoader classLoader = zoi1.class.getClassLoader();
                    classLoader.getClass();
                    bundle.setClassLoader(classLoader);
                    try {
                        bundle.isEmpty();
                        return bundle;
                    } catch (RuntimeException e2) {
                        oon1.w("Ignoring invalid bundle", e2);
                        return null;
                    }
                }

                public static int q(int i2, byte[] bArr, int i3, int i4) {
                    while (i2 < i3) {
                        i4 = j[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
                        i2++;
                    }
                    return i4;
                }

                public static Handler r(lkh0 lkh0Var) {
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    return new Handler(looperMyLooper, lkh0Var);
                }

                public static Handler s(Handler.Callback callback) {
                    return new Handler(D(), callback);
                }

                public static long t(int i2, long j2) {
                    return g0(j2, i2, 1000000L, RoundingMode.UP);
                }

                public static void u(NotificationManager notificationManager, String str) {
                    if (Build.VERSION.SDK_INT < 26 || notificationManager.getNotificationChannel("default_channel_id") != null) {
                        return;
                    }
                    no80.j(notificationManager, str);
                }

                public static String v(byte[] bArr) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }

                public static int w(int i2) {
                    switch (i2) {
                        case 2:
                        case 3:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            return 28;
                        case 13:
                        case 19:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        default:
                            return Integer.MAX_VALUE;
                        case 14:
                            return 25;
                        case 20:
                            return 30;
                        case 21:
                        case 22:
                            return 31;
                        case 30:
                        case 31:
                            return 34;
                    }
                }

                public static int x(int i2) {
                    if (i2 == 10) {
                        return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
                    }
                    if (i2 == 16) {
                        return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
                    }
                    if (i2 == 24) {
                        return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
                    }
                    switch (i2) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            switch (i2) {
                                case 12:
                                    return 743676;
                                case 13:
                                    return Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                                case 14:
                                    return Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                                default:
                                    return 0;
                            }
                    }
                }

                public static int y(ie30 ie30Var) {
                    int i2 = ie30Var.K;
                    return i2 != -1 ? i2 : x(ie30Var.J);
                }

                public static int z(int i2) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return 1;
                        }
                        if (i2 != 4) {
                            if (i2 != 21) {
                                if (i2 != 22) {
                                    if (i2 != 268435456) {
                                        if (i2 != 1342177280) {
                                            if (i2 != 1610612736) {
                                                if (i2 == 1879048192) {
                                                    return 8;
                                                }
                                                if (i2 != 1895825408) {
                                                    if (i2 == 1912602624) {
                                                        return 8;
                                                    }
                                                    bhn0.q();
                                                    return 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return 3;
                        }
                        return 4;
                    }
                    return 2;
                }
            }
