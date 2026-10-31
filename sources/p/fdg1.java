package p;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class fdg1 {
    public static final sua a = new sua((byte) 14);
    public static b180 b;

    public static void A(ViewGroup viewGroup, qyf0 qyf0Var) {
        int i;
        sh81 sh81Var;
        rh81 rh81Var;
        int iOrdinal = qyf0Var.ordinal();
        if (iOrdinal == 0) {
            i = 2;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                eg.o();
                return;
            }
            i = 2;
        } else {
            i = 1;
        }
        int iOrdinal2 = qyf0Var.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            sh81Var = new sh81(0, viewGroup.getResources().getDimensionPixelSize(2131166400), qx21.a(2131166401, viewGroup.getResources()));
        } else if (iOrdinal2 != 2) {
            eg.o();
            return;
        } else {
            sh81Var = new sh81(viewGroup.getResources().getDimensionPixelSize(2131166397), viewGroup.getResources().getDimensionPixelSize(2131166396), qx21.a(2131166398, viewGroup.getResources()));
        }
        int iOrdinal3 = qyf0Var.ordinal();
        if (iOrdinal3 == 0 || iOrdinal3 == 1) {
            rh81Var = qh81.d;
        } else if (iOrdinal3 != 2) {
            eg.o();
            return;
        } else {
            int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(2131166393);
            float dimension = viewGroup.getResources().getDimension(2131166390);
            rh81Var = new rh81(dimensionPixelSize, new ir31(dimension, dimension, dimension, dimension));
        }
        viewGroup.setTag(2131430971, new th81(i, sh81Var, rh81Var));
    }

    public static final lw4 B(o45 o45Var) {
        return new lw4(o45Var);
    }

    public static final long C(long j) {
        long j2 = (j << 1) + 1;
        jfv.b.getClass();
        int i = hgv.a;
        return j2;
    }

    public static final long D(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? C(yoi1.r(j, -4611686018427387903L, 4611686018427387903L)) : E(j * 1000000);
    }

    public static final long E(long j) {
        ytw0 ytw0Var = jfv.b;
        long j2 = j << 1;
        int i = hgv.a;
        return j2;
    }

    public static final qim0 F(qim0 qim0Var, float f, boolean z, boolean z2) {
        return exd0.r(i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039), new edg1(f, z, z2, (byte) 0));
    }

    public static final long G(long j, ngv ngvVar) {
        double d;
        double d2 = j;
        switch (ngvVar.ordinal()) {
            case 0:
                d = 1.0E-15d;
                break;
            case 1:
                d = 1.0E-12d;
                break;
            case 2:
                d = 1.0E-9d;
                break;
            case 3:
                d = 1.0E-6d;
                break;
            case 4:
                d = 6.0E-5d;
                break;
            case 5:
                d = 0.0036d;
                break;
            case 6:
                d = 0.0864d;
                break;
            default:
                hhg1.o(ngvVar, "Unknown unit: ");
                return 0L;
        }
        return jch0.a0(d2 * d);
    }

    public static int H(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return (lowerCase.equals("run") || lowerCase.equals("running")) ? 1 : 0;
    }

    public static void I(String str) {
        Object next;
        d7 d7Var = new d7(kda0.f, (byte) 0);
        while (d7Var.hasNext()) {
            next = d7Var.next();
            if (((kda0) next).a.equalsIgnoreCase(str)) {
            }
        }
        next = null;
    }

    public static final float K(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long L(Paint paint) {
        return Build.VERSION.SDK_INT >= 29 ? jjm1.a.a(paint) : z4p1.e(paint.getColor());
    }

    public static final int M(Paint paint) {
        return !paint.isFilterBitmap() ? 0 : 1;
    }

    public static final Paint N(lw4 lw4Var) {
        if (lw4Var == null) {
            pf80.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + rc11.a.b(lw4Var.getClass()).o());
        }
        return lw4Var.a;
    }

    public static final int O(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : mw4.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public static final int P(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : mw4.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public static final float Q(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float R(Paint paint) {
        return paint.getStrokeWidth();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019b A[LOOP:5: B:101:0x0199->B:102:0x019b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e0 A[LOOP:7: B:112:0x01de->B:113:0x01e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:131:0x022e  */
    /* JADX WARN: Code duplicated, block: B:134:0x023b  */
    /* JADX WARN: Code duplicated, block: B:136:0x023f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0243  */
    /* JADX WARN: Code duplicated, block: B:140:0x0247  */
    /* JADX WARN: Code duplicated, block: B:141:0x024a  */
    /* JADX WARN: Code duplicated, block: B:142:0x024c  */
    /* JADX WARN: Code duplicated, block: B:143:0x024e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0251  */
    /* JADX WARN: Code duplicated, block: B:146:0x0254  */
    /* JADX WARN: Code duplicated, block: B:154:0x0265 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0267  */
    /* JADX WARN: Code duplicated, block: B:158:0x0273 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x0275  */
    /* JADX WARN: Code duplicated, block: B:161:0x0288  */
    /* JADX WARN: Code duplicated, block: B:291:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:328:0x0544  */
    /* JADX WARN: Code duplicated, block: B:332:0x054a  */
    /* JADX WARN: Code duplicated, block: B:353:0x059e  */
    /* JADX WARN: Code duplicated, block: B:384:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x05c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0548 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0162  */
    /* JADX WARN: Code duplicated, block: B:95:0x0173  */
    public static long T(String str, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        long jQ;
        char c;
        int i4;
        int i5;
        long j;
        int i6;
        long j2;
        int iOrdinal;
        int i7;
        int i8;
        int i9;
        long jG;
        long j3;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        int i10;
        int i11;
        int i12;
        boolean z4;
        ngv ngvVar;
        ngv ngvVar2;
        long j4;
        String str2;
        char cCharAt4;
        ngv ngvVar3;
        ngv ngvVar4;
        long jZ;
        int i13;
        int iMin;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMin2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        char cCharAt5;
        int i25;
        char cCharAt6;
        char cCharAt7;
        char cCharAt8;
        if (str.length() == 0) {
            hhg1.n("The string is empty");
            return 0L;
        }
        char cCharAt9 = str.charAt(0);
        if (cCharAt9 == '+') {
            z2 = false;
            i = 1;
        } else if (cCharAt9 != '-') {
            i = 0;
            z2 = false;
        } else {
            i = 1;
            z2 = true;
        }
        boolean z5 = i > 0;
        if (str.length() <= i) {
            hhg1.n("No components");
            return 0L;
        }
        char cCharAt10 = str.charAt(i);
        ngv ngvVar5 = ngv.b;
        ngv ngvVar6 = ngv.d;
        String str3 = "Unexpected order of duration components";
        String str4 = "Unknown duration unit short name: ";
        ngv ngvVar7 = ngv.g;
        ngv ngvVar8 = ngv.f;
        int i26 = 1;
        int i27 = 6;
        int i28 = i;
        ngv ngvVar9 = ngv.e;
        ngv ngvVar10 = ngv.h;
        if (cCharAt10 == 'P') {
            int i29 = i28 + 1;
            if (i29 == str.length()) {
                hhg1.n("");
                return 0L;
            }
            long jY = 0;
            long jG2 = 0;
            ngv ngvVar11 = null;
            boolean z6 = false;
            while (i29 < str.length()) {
                char cCharAt11 = str.charAt(i29);
                if (cCharAt11 != 'T') {
                    b5f0 b5f0Var = b5f0.c;
                    boolean z7 = z6;
                    char cCharAt12 = str.charAt(i29);
                    int i30 = i29;
                    if (cCharAt12 == '+') {
                        i10 = i30 + 1;
                        i11 = 1;
                    } else if (cCharAt12 != '-') {
                        i11 = 1;
                        i10 = i30;
                    } else {
                        i10 = i30 + 1;
                        i11 = -1;
                    }
                    ngv ngvVar12 = ngvVar7;
                    while (true) {
                        if (i10 >= str.length()) {
                            i12 = i10;
                            break;
                        }
                        i12 = i10;
                        if (str.charAt(i10) != '0') {
                            break;
                        }
                        i10 = i12 + 1;
                    }
                    int i31 = i12;
                    long j5 = 0;
                    while (true) {
                        if (i31 < str.length()) {
                            char cCharAt13 = str.charAt(i31);
                            z4 = z2;
                            if ('0' <= cCharAt13 && cCharAt13 < ':') {
                                int i32 = cCharAt13 - '0';
                                ngvVar = ngvVar5;
                                ngvVar2 = ngvVar6;
                                long j6 = b5f0Var.a;
                                if (j5 > j6 || (j5 == j6 && i32 > b5f0Var.b)) {
                                    while (i31 < str.length() && '0' <= (cCharAt8 = str.charAt(i31)) && cCharAt8 < ':') {
                                        i31++;
                                    }
                                    if (i31 != str.length()) {
                                        if (i31 != i30 + ((cCharAt11 == '+' || cCharAt11 == '-') ? 1 : 0)) {
                                            j5 = 4611686018427387903L;
                                        }
                                    }
                                    hhg1.n("");
                                    return 0L;
                                }
                                j5 = (j5 << 3) + (j5 << 1) + ((long) i32);
                                i31++;
                                ngvVar5 = ngvVar;
                                z2 = z4;
                                ngvVar6 = ngvVar2;
                                b5f0Var = b5f0Var;
                            }
                            j4 = j5;
                            if (str.charAt(i31) == '.') {
                                i13 = i31 + 1;
                                iMin = Math.min(i31 + 7, str.length());
                                i14 = i13;
                                int i33 = 0;
                                while (i14 < iMin) {
                                    cCharAt7 = str.charAt(i14);
                                    int i34 = iMin;
                                    if ('0' > cCharAt7 || cCharAt7 >= ':') {
                                        break;
                                    }
                                    i33 = (cCharAt7 - '0') + (i33 << 3) + (i33 << 1);
                                    i14++;
                                    iMin = i34;
                                }
                                i15 = 6 - (i14 - i13);
                                i16 = i33;
                                i17 = i14;
                                for (i18 = 0; i18 < i15; i18++) {
                                    i16 = (i16 << 3) + (i16 << 1);
                                }
                                iMin2 = Math.min(i17 + 9, str.length());
                                i19 = i17;
                                i20 = 0;
                                while (true) {
                                    if (i19 < iMin2) {
                                        i21 = i19;
                                        break;
                                    }
                                    i25 = iMin2;
                                    cCharAt6 = str.charAt(i19);
                                    i21 = i19;
                                    if ('0' > cCharAt6 || cCharAt6 >= ':') {
                                        break;
                                    }
                                    i20 = (cCharAt6 - '0') + (i20 << 3) + (i20 << 1);
                                    i19 = i21 + 1;
                                    iMin2 = i25;
                                }
                                i22 = i20;
                                for (i23 = 0; i23 < 9 - (i21 - i17); i23++) {
                                    i22 = (i22 << 3) + (i22 << 1);
                                }
                                i24 = i21;
                                while (true) {
                                    if (i24 < str.length()) {
                                        str2 = str3;
                                        break;
                                    }
                                    cCharAt5 = str.charAt(i24);
                                    str2 = str3;
                                    if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                        break;
                                    }
                                    i24++;
                                    str3 = str2;
                                }
                                if (i24 != i13 || i24 == str.length() || str.charAt(i24) != 'S') {
                                    hhg1.n("");
                                    return 0L;
                                }
                                jG2 = G((((long) i16) * 1000000000) + ((long) i22), ngvVar9) * ((long) i11);
                                i31 = i24;
                            } else {
                                str2 = str3;
                            }
                            cCharAt4 = str.charAt(i31);
                            if (cCharAt4 != 'D') {
                                ngvVar3 = ngvVar10;
                            } else if (cCharAt4 != 'H') {
                                ngvVar3 = ngvVar12;
                            } else if (cCharAt4 != 'M') {
                                ngvVar3 = ngvVar8;
                            } else if (cCharAt4 != 'S') {
                                ngvVar3 = null;
                            } else {
                                ngvVar3 = ngvVar9;
                            }
                            if (ngvVar3 != null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i31));
                            }
                            ngvVar4 = ngvVar11;
                            if (ngvVar4 == null && ngvVar4.compareTo(ngvVar3) <= 0) {
                                hhg1.n(str2);
                                return 0L;
                            }
                            if (ngvVar3 == ngvVar10) {
                                if (!z7) {
                                    hhg1.n("");
                                    return 0L;
                                }
                                jY = fj30.y(j4, ngvVar3) * ((long) i11);
                            } else {
                                if (z7) {
                                    hhg1.n("");
                                    return 0L;
                                }
                                jZ = z(jY, fj30.y(j4, ngvVar3) * ((long) i11));
                                if (jZ != 9223372036854759646L) {
                                    hhg1.n("");
                                    return 0L;
                                }
                                jY = jZ;
                            }
                            i29 = i31 + 1;
                            z6 = z7;
                            ngvVar11 = ngvVar3;
                            ngvVar8 = ngvVar8;
                            ngvVar5 = ngvVar;
                            ngvVar7 = ngvVar12;
                            str3 = str2;
                            z2 = z4;
                            ngvVar6 = ngvVar2;
                        } else {
                            z4 = z2;
                        }
                        ngvVar = ngvVar5;
                        ngvVar2 = ngvVar6;
                        if (i31 != str.length()) {
                            if (i31 == i30 + ((cCharAt11 == '+' || cCharAt11 == '-') ? 1 : 0)) {
                            }
                            j4 = j5;
                            if (str.charAt(i31) == '.') {
                                i13 = i31 + 1;
                                iMin = Math.min(i31 + 7, str.length());
                                i14 = i13;
                                int i35 = 0;
                                while (i14 < iMin) {
                                    cCharAt7 = str.charAt(i14);
                                    int i36 = iMin;
                                    if ('0' > cCharAt7) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                i15 = 6 - (i14 - i13);
                                i16 = i35;
                                i17 = i14;
                                while (i18 < i15) {
                                    i16 = (i16 << 3) + (i16 << 1);
                                }
                                iMin2 = Math.min(i17 + 9, str.length());
                                i19 = i17;
                                i20 = 0;
                                while (true) {
                                    if (i19 < iMin2) {
                                        i21 = i19;
                                        break;
                                    }
                                    i25 = iMin2;
                                    cCharAt6 = str.charAt(i19);
                                    i21 = i19;
                                    if ('0' > cCharAt6) {
                                        break;
                                    }
                                    break;
                                    break;
                                    i20 = (cCharAt6 - '0') + (i20 << 3) + (i20 << 1);
                                    i19 = i21 + 1;
                                    iMin2 = i25;
                                }
                                i22 = i20;
                                while (i23 < 9 - (i21 - i17)) {
                                    i22 = (i22 << 3) + (i22 << 1);
                                }
                                i24 = i21;
                                while (true) {
                                    if (i24 < str.length()) {
                                        str2 = str3;
                                        break;
                                    }
                                    cCharAt5 = str.charAt(i24);
                                    str2 = str3;
                                    if ('0' > cCharAt5) {
                                        break;
                                    }
                                    break;
                                    break;
                                    i24++;
                                    str3 = str2;
                                }
                                if (i24 != i13) {
                                }
                                hhg1.n("");
                                return 0L;
                            }
                            str2 = str3;
                            cCharAt4 = str.charAt(i31);
                            if (cCharAt4 != 'D') {
                                ngvVar3 = ngvVar10;
                            } else if (cCharAt4 != 'H') {
                                ngvVar3 = ngvVar12;
                            } else if (cCharAt4 != 'M') {
                                ngvVar3 = ngvVar8;
                            } else if (cCharAt4 != 'S') {
                                ngvVar3 = null;
                            } else {
                                ngvVar3 = ngvVar9;
                            }
                            if (ngvVar3 != null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i31));
                            }
                            ngvVar4 = ngvVar11;
                            if (ngvVar4 == null) {
                            }
                            if (ngvVar3 == ngvVar10) {
                                if (!z7) {
                                    hhg1.n("");
                                    return 0L;
                                }
                                jY = fj30.y(j4, ngvVar3) * ((long) i11);
                            } else {
                                if (z7) {
                                    hhg1.n("");
                                    return 0L;
                                }
                                jZ = z(jY, fj30.y(j4, ngvVar3) * ((long) i11));
                                if (jZ != 9223372036854759646L) {
                                    hhg1.n("");
                                    return 0L;
                                }
                                jY = jZ;
                            }
                            i29 = i31 + 1;
                            z6 = z7;
                            ngvVar11 = ngvVar3;
                            ngvVar8 = ngvVar8;
                            ngvVar5 = ngvVar;
                            ngvVar7 = ngvVar12;
                            str3 = str2;
                            z2 = z4;
                            ngvVar6 = ngvVar2;
                        }
                        hhg1.n("");
                        return 0L;
                    }
                }
                if (z6 || (i29 = i29 + 1) == str.length()) {
                    hhg1.n("");
                    return 0L;
                }
                z6 = true;
            }
            z3 = z2;
            jQ = jfv.q(l0(jY, ngvVar6), l0(jG2, ngvVar5));
        } else {
            z3 = z2;
            ngv ngvVar13 = ngvVar6;
            if (z) {
                hhg1.n("");
                return 0L;
            }
            ngv ngvVar14 = ngvVar10;
            if (str.regionMatches(true, i28, "Infinity", 0, Math.max(str.length() - i28, 8))) {
                jQ = jfv.c;
            } else {
                int length = str.length();
                boolean z8 = !z5;
                if (z5 && str.charAt(i28) == '(' && str.charAt(length - 1) == ')') {
                    int i37 = i28 + 1;
                    int i38 = length - 1;
                    if (i37 == i38) {
                        hhg1.n("No components");
                        return 0L;
                    }
                    i2 = i38;
                    i3 = i37;
                    z8 = true;
                } else {
                    i2 = length;
                    i3 = i28;
                }
                long jZ2 = 0;
                long j7 = 0;
                boolean z9 = true;
                ngv ngvVar15 = null;
                while (i3 < i2) {
                    if (!z9 && z8) {
                        while (i3 < str.length() && str.charAt(i3) == ' ') {
                            i3++;
                        }
                    }
                    b5f0 b5f0Var2 = b5f0.d;
                    int i39 = i3;
                    while (true) {
                        if (i39 >= str.length()) {
                            z8 = z8;
                            c = '0';
                            break;
                        }
                        z8 = z8;
                        c = '0';
                        if (str.charAt(i39) != '0') {
                            break;
                        }
                        i39++;
                        z8 = z8;
                    }
                    long j8 = 0;
                    while (i39 < str.length() && c <= (cCharAt2 = str.charAt(i39)) && cCharAt2 < ':') {
                        int i40 = cCharAt2 - '0';
                        ngv ngvVar16 = ngvVar14;
                        ngv ngvVar17 = ngvVar9;
                        long j9 = b5f0Var2.a;
                        long j10 = j8;
                        if (j10 > j9 || (j10 == j9 && i40 > b5f0Var2.b)) {
                            while (i39 < str.length() && '0' <= (cCharAt3 = str.charAt(i39)) && cCharAt3 < ':') {
                                i39++;
                            }
                            hhg1.n("");
                            return 0L;
                        }
                        j8 = (j10 << 3) + (j10 << i26) + ((long) i40);
                        i39++;
                        ngvVar9 = ngvVar17;
                        ngvVar14 = ngvVar16;
                        str4 = str4;
                        ngvVar13 = ngvVar13;
                        c = '0';
                    }
                    str4 = str4;
                    ngvVar13 = ngvVar13;
                    ngvVar14 = ngvVar14;
                    ngv ngvVar18 = ngvVar9;
                    long j11 = j8;
                    if (i39 == i3 || i39 == i2) {
                        hhg1.n("");
                        return 0L;
                    }
                    int i41 = str.charAt(i39) == '.' ? i26 : 0;
                    if (i41 != 0) {
                        int i42 = i39 + 1;
                        int iMin3 = Math.min(i39 + 7, str.length());
                        int i43 = i42;
                        int i44 = 0;
                        while (true) {
                            if (i43 >= iMin3) {
                                i4 = i41;
                                break;
                            }
                            char cCharAt14 = str.charAt(i43);
                            i4 = i41;
                            if ('0' > cCharAt14 || cCharAt14 >= ':') {
                                break;
                            }
                            i44 = (cCharAt14 - '0') + (i44 << 3) + (i44 << 1);
                            i43++;
                            i41 = i4;
                        }
                        int i45 = i44;
                        for (int i46 = 0; i46 < 6 - (i43 - i42); i46++) {
                            i45 = (i45 << 3) + (i45 << 1);
                        }
                        int iMin4 = Math.min(i43 + 9, str.length());
                        int i47 = i43;
                        int i48 = 0;
                        while (true) {
                            if (i47 >= iMin4) {
                                ngvVar9 = ngvVar18;
                                break;
                            }
                            int i49 = iMin4;
                            char cCharAt15 = str.charAt(i47);
                            ngvVar9 = ngvVar18;
                            if ('0' > cCharAt15 || cCharAt15 >= ':') {
                                break;
                            }
                            i48 = (cCharAt15 - '0') + (i48 << 3) + (i48 << 1);
                            i47++;
                            iMin4 = i49;
                            ngvVar18 = ngvVar9;
                        }
                        int i50 = 9 - (i47 - i43);
                        int i51 = i48;
                        for (int i52 = 0; i52 < i50; i52++) {
                            i51 = (i51 << 3) + (i51 << 1);
                        }
                        while (true) {
                            if (i47 >= str.length() || '0' > (cCharAt = str.charAt(i47))) {
                                break;
                            }
                            if (cCharAt >= ':') {
                                break;
                            }
                            i47++;
                        }
                        if (i47 == i42 || i47 == i2) {
                            hhg1.n("");
                            return 0L;
                        }
                        j = (((long) i45) * 1000000000) + ((long) i51);
                        i6 = i39;
                        i5 = i47;
                    } else {
                        i4 = i41;
                        ngvVar9 = ngvVar18;
                        i5 = i39;
                        j = 0;
                        i6 = -1;
                    }
                    char cCharAt16 = str.charAt(i5);
                    char cCharAt17 = i5 < ihc1.q0(str) ? str.charAt(i5 + 1) : (char) 0;
                    if (cCharAt16 == 'd') {
                        ngvVar15 = ngvVar14;
                    } else if (cCharAt16 == 'h') {
                        ngvVar15 = ngvVar7;
                    } else if (cCharAt16 == 's') {
                        ngvVar15 = ngvVar9;
                    } else if (cCharAt16 != 'u') {
                        if (cCharAt16 == 'm') {
                            ngvVar15 = cCharAt17 == 's' ? ngvVar13 : ngvVar8;
                        } else if (cCharAt16 == 'n' && cCharAt17 == 's') {
                            ngvVar15 = ngvVar5;
                        } else {
                            ngvVar15 = null;
                        }
                    } else if (cCharAt17 == 's') {
                        ngvVar15 = ngv.c;
                    } else {
                        ngvVar15 = null;
                    }
                    if (ngvVar15 == null) {
                        throw new IllegalArgumentException(str4 + str.charAt(i5));
                    }
                    if (ngvVar15 != null && ngvVar15.compareTo(ngvVar15) <= 0) {
                        hhg1.n("Unexpected order of duration components");
                        return 0L;
                    }
                    int iOrdinal2 = ngvVar15.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != i26) {
                            jZ2 = z(jZ2, fj30.y(j11, ngvVar15));
                        } else {
                            j2 = (j11 / 1000) + jZ2;
                            if (j2 <= 4611686018426L) {
                                j7 = (j11 % 1000) * 1000;
                            }
                        }
                        iOrdinal = ngvVar15.ordinal();
                        int i53 = 2;
                        if (iOrdinal != 0 || iOrdinal == 1 || iOrdinal == 2) {
                            i7 = 2;
                        } else {
                            i7 = 1;
                        }
                        i3 = i5 + i7;
                        if (i4 != 0) {
                            z9 = false;
                            i26 = 1;
                        } else {
                            if (i3 >= i2) {
                                hhg1.n("Fractional component must be last");
                                return 0L;
                            }
                            if (ngvVar15.compareTo(ngvVar8) >= 0 || i3 - i6 <= 15) {
                                i8 = i27;
                                i9 = 1;
                                jG = G(j, ngvVar15);
                            } else {
                                int iOrdinal3 = ngvVar15.ordinal();
                                i9 = 1;
                                if (iOrdinal3 != 0 && iOrdinal3 != 1 && iOrdinal3 != 2) {
                                    i53 = 1;
                                }
                                double d = Double.parseDouble(str.substring(i6, i3 - i53));
                                int iOrdinal4 = ngvVar15.ordinal();
                                if (iOrdinal4 == 4) {
                                    i8 = i27;
                                    j3 = 60000000000L;
                                } else if (iOrdinal4 != 5) {
                                    i8 = i27;
                                    if (iOrdinal4 != i8) {
                                        n9v.h("Invalid unit: ", ngvVar15, " for fallback fraction multiplier");
                                        return 0L;
                                    }
                                    j3 = 86400000000000L;
                                } else {
                                    i8 = i27;
                                    j3 = 3600000000000L;
                                }
                                jG = jch0.a0(d * j3);
                            }
                            j7 += jG;
                            i26 = i9;
                            i27 = i8;
                            z9 = false;
                        }
                    } else {
                        j2 = (j11 / 1000000) + jZ2;
                        j7 = (j11 % 1000000) + j7;
                    }
                    jZ2 = j2;
                    iOrdinal = ngvVar15.ordinal();
                    int i54 = 2;
                    if (iOrdinal != 0) {
                        i7 = 2;
                    } else {
                        i7 = 2;
                    }
                    i3 = i5 + i7;
                    if (i4 != 0) {
                        z9 = false;
                        i26 = 1;
                    } else {
                        if (i3 >= i2) {
                            hhg1.n("Fractional component must be last");
                            return 0L;
                        }
                        if (ngvVar15.compareTo(ngvVar8) >= 0) {
                            i8 = i27;
                            i9 = 1;
                            jG = G(j, ngvVar15);
                        } else {
                            i8 = i27;
                            i9 = 1;
                            jG = G(j, ngvVar15);
                        }
                        j7 += jG;
                        i26 = i9;
                        i27 = i8;
                        z9 = false;
                    }
                }
                jQ = jfv.q(l0(jZ2, ngvVar13), l0(j7, ngvVar5));
            }
        }
        return (!z3 || jfv.f(jQ, jfv.e)) ? jQ : jfv.w(jQ);
    }

    public static final d0r U(egx0 egx0Var) {
        if (egx0Var instanceof bgx0) {
            return ((bgx0) egx0Var).a;
        }
        return null;
    }

    public static final zob1 V(egx0 egx0Var) {
        if (egx0Var instanceof agx0) {
            return ((agx0) egx0Var).a;
        }
        if (egx0Var instanceof cgx0) {
            return ((cgx0) egx0Var).a;
        }
        return null;
    }

    public static final e821 W(qe41 qe41Var, nma0 nma0Var, ae41 ae41Var, Function0 function0) {
        return new e821(qe41Var.p(), nma0Var, ae41Var, function0);
    }

    public static final void X(Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void Y(Paint paint, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            jjm1.a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(x74.w0(i)));
        }
    }

    public static final void Z(Paint paint, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            jjm1.a.c(paint, j);
        } else {
            paint.setColor(z4p1.G(j));
        }
    }

    public static final void a(List list, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1183469580);
        int i2 = (x340Var.g(list) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            c380 c380VarA = mqo1.A(list);
            uwr uwrVar = cbx.a;
            op71.a(c380VarA, u291.f(nim0.a, 1.0f), cbx.d(x340Var).j, 0L, 0.0f, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm0(list, i, (byte) 5);
        }
    }

    public static final void a0(Paint paint, ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? colorFilter.a : null);
    }

    public static final void b(kat katVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        boolean z;
        char c;
        boolean z2;
        kat katVar2;
        Object obj;
        m4c m4cVar = fkj0.X;
        dat datVar = katVar.f;
        dat datVar2 = katVar.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1597808979);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(katVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            era eraVar = een.Q0;
            d36 d36Var = new d36(24.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 24.0f, 1, qim0Var3);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarZ, cbx.a(x340Var).a.c, d4o1.a);
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            hr80.d((qim0) null, 1.0f, cbx.a(x340Var).a.b.c(), x340Var, 0, 1);
            if (datVar2.a.length() > 0) {
                x340Var.i0(-260019689);
                String str = datVar2.b;
                if (ihc1.y0(str)) {
                    hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                    return;
                }
                y50 y50Var = new y50(str);
                boolean z3 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                Object objT = x340Var.T();
                Object obj2 = objT;
                if (z3 || objT == m4cVar) {
                    ifc ifcVar = new ifc(iu30Var, katVar, (byte) 0);
                    x340Var.s0(ifcVar);
                    obj2 = ifcVar;
                }
                z = false;
                c = ' ';
                foo1.c(new gbx(y50Var, (Function0) obj2), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-952298627, new jfc(katVar, (byte) 0), x340Var), x340Var, 0, 48, 2044);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                z = false;
                c = ' ';
                x340Var.i0(-259427713);
                x340Var.r(false);
            }
            if (datVar.a.length() > 0) {
                x340Var.i0(-259360412);
                String str2 = datVar.b;
                if (ihc1.y0(str2)) {
                    hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                    return;
                }
                y50 y50Var2 = new y50(str2);
                boolean z4 = ((i3 & 14) == 4 ? true : z) | ((i3 & 112) == c ? true : z);
                Object objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar) {
                    z2 = true;
                    katVar2 = katVar;
                    ifc ifcVar2 = new ifc(iu30Var, katVar2, (byte) 1);
                    x340Var.s0(ifcVar2);
                    obj = ifcVar2;
                } else {
                    z2 = true;
                    katVar2 = katVar;
                    obj = objT2;
                }
                x340 x340Var2 = x340Var;
                foo1.c(new gbx(y50Var2, (Function0) obj), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1372863220, new jfc(katVar2, z2 ? (byte) 1 : (byte) 0), x340Var), x340Var2, 0, 48, 2044);
                x340Var = x340Var2;
                x340Var.r(z);
            } else {
                z2 = true;
                x340Var.i0(-258873185);
                x340Var.r(z);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b((byte) 4, i, katVar, iu30Var, qim0Var2);
        }
    }

    public static final void b0(Paint paint, int i) {
        paint.setFilterBitmap(!(i == 0));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    public static final void c(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        gbx gbxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1484035981);
        int i2 = i | (b0kVar3.i(function0) ? 4 : 2) | 48 | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.g(str) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (str == null) {
                gbxVar = new gbx(z50.c, function0);
            } else {
                String str2 = str.length() > 0 ? str : null;
                if (str2 == null) {
                    gbxVar = new gbx(z50.c, function0);
                } else {
                    if (ihc1.y0(str2)) {
                        hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                        return;
                    }
                    gbxVar = new gbx(new y50(str2), function0);
                }
            }
            pex nexVar = z ? pex.b : new nex(18);
            lex lexVarZ = yoo1.z(b0kVar3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarH = uyn1.h(2, 12.0f, 0.0f);
            String str3 = str == null ? "" : str;
            j2i j2iVar = omi.a;
            j2i j2iVarR = apo.r(-1701126024, new qeu(str, (byte) 23), b0kVar3);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, nexVar, lexVarZ, qim0Var3, 0, str3, (max) null, j2iVar, (vu30) null, (idn0) null, (ga80) null, false, zzq0VarH, j2iVarR, b0kVar2, 12585984, 3072, 3920);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(function0, qim0Var2, z, str, i);
        }
    }

    public static final void c0(Paint paint, uw4 uw4Var) {
        paint.setPathEffect(uw4Var != null ? uw4Var.a : null);
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2130515852);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131955903);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = ((vex) zex.a.e).m;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 12.0f, 5), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 18);
        }
    }

    public static final void d0(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void e(String str, sp00 sp00Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1915743403);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(sp00Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131956431);
            String strN0 = cwl1.n0(2131956459, new Object[]{strO0}, x340Var);
            c9 c9VarS = mqo1.s(new mae1[]{new mae1(strO0, str)});
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new fz40(sp00Var, function0, (byte) 4);
                x340Var.s0(objT);
            }
            i8p1.i(strN0, c9VarS, (iu30) objT, qim0Var, (lee1) null, 0L, 0L, x340Var, i2 & 7168, 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, str, sp00Var, function0, qim0Var, (byte) 23);
        }
    }

    public static final void e0(Paint paint, int i) {
        Paint.Cap cap;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void f(jc50 jc50Var, sp00 sp00Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1069386127);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(jc50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(sp00Var) : x340Var.i(sp00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            irn1.u((qim0) null, (vu30) null, (vu30) null, (erl1) null, apo.r(-1603624040, new cy00(jc50Var, sp00Var, iu30Var, (byte) 8), x340Var), x340Var, 24576, 15);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(jc50Var, sp00Var, iu30Var, i, (byte) 14);
        }
    }

    public static final void f0(Paint paint, int i) {
        Paint.Join join;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void g(jc50 jc50Var, sp00 sp00Var, iu30 iu30Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        vzq0 vzq0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-700580428);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(jc50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(sp00Var) : b0kVar3.i(sp00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            vzq0Var2 = vzq0Var;
            i2 |= b0kVar3.i(vzq0Var2) ? 2048 : 1024;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            ujo1.a(uyn1.B(dug.f(nim0.a, cbx.a(b0kVar3).a.c, d4o1.a), 0.0f, vzq0Var2.d(), 0.0f, 0.0f, 13), (es41) null, apo.r(-919095969, new qfx(vzq0Var2, jc50Var, sp00Var, iu30Var, (byte) 24), b0kVar3), b0kVar2, 384, 2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, jc50Var, sp00Var, iu30Var, vzq0Var, (byte) 6);
        }
    }

    public static final void g0(Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final void h(ah91 ah91Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(500309308);
        int i2 = (x340Var.i(ah91Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            otw.c(ah91Var.a, ah91Var.b, ah91Var.c, (ipb1) null, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new boj(ah91Var, i, (byte) 27);
        }
    }

    public static final void h0(Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(mwq0 mwq0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1923637833);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mwq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        boolean z = true;
        boolean z2 = false;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ld41 ld41VarG = sgc1.G(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                bw91 bw91Var = mwq0Var.b;
                bw91 bw91Var2 = new bw91();
                bw91Var2.addAll(bw91Var);
                x340Var.s0(bw91Var2);
                objT = bw91Var2;
            }
            bw91 bw91Var3 = (bw91) objT;
            bw91 bw91Var4 = mwq0Var.b;
            bw91Var4.getClass();
            d9 d9Var = pv91.r(bw91Var4.a, bw91Var4).c;
            boolean z3 = (i2 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new e3p0(mwq0Var, bw91Var3, (lnm) null, (byte) 13);
                x340Var.s0(objT2);
            }
            qxd0.t(d9Var, x340Var, (vu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            x340Var.i0(-1907237232);
            ek60 ek60VarListIterator = bw91Var3.listIterator();
            while (true) {
                ek60 ek60Var = ek60VarListIterator;
                if (!ek60Var.hasNext()) {
                    break;
                }
                kwq0 kwq0Var = (kwq0) ek60Var.next();
                boolean zContains = mwq0Var.b.contains(kwq0Var);
                x340Var.f0(-970743948, kwq0Var.a);
                p9m p9mVar = mwq0Var.d;
                bby bbyVar = p9mVar.a;
                ln00 ln00Var = p9mVar.b;
                ld41 ld41Var = ld41VarG;
                j2i j2iVarR = apo.r(-1569655915, new c9y(ld41Var, kwq0Var, j2iVar, bw91Var3, (byte) 19), x340Var);
                boolean z4 = z2;
                fq7.g(zContains, null, bbyVar, ln00Var, null, j2iVarR, x340Var, 196608, 18);
                x340Var.r(z4);
                z2 = z4;
                z = z;
                ld41VarG = ld41Var;
            }
            boolean z5 = z2;
            x340Var.r(z5);
            x340Var.r(z);
            b2 = z5;
        } else {
            b2 = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tvq0(mwq0Var, j2iVar, i, b2);
        }
    }

    public static final void i0(Paint paint, int i) {
        paint.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void j(mwq0 mwq0Var, j2i j2iVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2008425627);
        int i2 = (x340Var.g(mwq0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = mwq0Var.a.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(1656716415);
                o(mwq0Var, j2iVar, x340Var, i2 & 126);
                x340Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, 1656714843, false);
                }
                x340Var.i0(1656718497);
                i(mwq0Var, j2iVar, x340Var, i2 & 126);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(mwq0Var, j2iVar, i, (byte) 16);
        }
    }

    public static final long j0(double d, ngv ngvVar) {
        double dW = fj30.w(d, ngvVar, ngv.b);
        if (Double.isNaN(dW)) {
            hhg1.n("Duration value cannot be NaN.");
            return 0L;
        }
        long jA0 = jch0.a0(dW);
        return (-4611686018426999999L > jA0 || jA0 >= 4611686018427000000L) ? D(jch0.a0(fj30.w(d, ngvVar, ngv.d))) : E(jA0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(mwq0 mwq0Var, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-987486301);
        int i4 = (x340Var.g(mwq0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (x340Var.g(qim0Var) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar2, x340Var, true);
            int iOrdinal = mwq0Var.a.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(213445927);
                o(mwq0Var, j2iVar, x340Var, i3 & 126);
                x340Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, 213444355, false);
                }
                x340Var.i0(213448009);
                i(mwq0Var, j2iVar, x340Var, i3 & 126);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m82(mwq0Var, j2iVar, qim0Var2, j2iVar2, i, i2);
        }
    }

    public static final long k0(int i, ngv ngvVar) {
        if (ngvVar.compareTo(ngv.e) > 0) {
            return l0(i, ngvVar);
        }
        return E(TimeUnit.NANOSECONDS.convert(i, ngvVar.a));
    }

    public static final lw4 l() {
        return new lw4(new Paint(7));
    }

    public static final long l0(long j, ngv ngvVar) {
        TimeUnit timeUnit = ngvVar.a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            return E(timeUnit2.convert(j, timeUnit));
        }
        ngv ngvVar2 = ngv.d;
        if (ngvVar.compareTo(ngvVar2) < 0) {
            return C(yoi1.r(fj30.x(j, ngvVar, ngvVar2), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return C(fj30.y(Math.abs(j), ngvVar) * jSignum);
    }

    public static final void m(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2037310697);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, u291.f(nim0.a, 1.0f), cbx.d(x340Var).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dz40(str, i, (byte) 2);
        }
    }

    public static qfv m0(tyq tyqVar, ViewGroup.LayoutParams layoutParams, ScrollCardType scrollCardType, int i) {
        if ((i & 1) != 0) {
            layoutParams = null;
        }
        if ((i & 2) != 0) {
            scrollCardType = null;
        }
        return new qfv(tyqVar, layoutParams, scrollCardType);
    }

    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void n(jc50 jc50Var, b0k b0kVar, int i) {
        jc50 jc50Var2;
        ?? r11;
        ?? r12;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(699200126);
        int i2 = i | (x340Var.i(jc50Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            fct0 fct0Var = jc50Var.d;
            String str = jc50Var.b;
            String strN0 = cwl1.n0(2131956458, new Object[]{str, Integer.valueOf(jc50Var.e)}, x340Var);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            nim0 nim0Var = nim0.a;
            uwo1.e(strN0, u291.f(nim0Var, 1.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            cvx cvxVar = cbx.b(x340Var).b;
            m(kk0.j(16.0f, 2131956446, x340Var, x340Var, nim0Var), x340Var, 0);
            x340Var.i0(1916440905);
            smc0 smc0VarN = k4p1.n();
            boolean z = fct0Var instanceof ect0;
            smc0VarN.add(cwl1.o0(x340Var, z ? 2131956448 : 2131956447));
            smc0VarN.add(cwl1.o0(x340Var, 2131956449));
            smc0VarN.add(cwl1.o0(x340Var, 2131956450));
            if (z) {
                x340Var.i0(749523769);
                smc0VarN.add(cwl1.o0(x340Var, 2131956451));
                r11 = 0;
                x340Var.r(false);
            } else {
                r11 = 0;
                x340Var.i0(749624674);
                x340Var.r(false);
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var.r((boolean) r11);
            a(smc0VarK, x340Var, r11);
            cvx cvxVar2 = cbx.b(x340Var).b;
            m(kk0.j(16.0f, 2131956452, x340Var, x340Var, nim0Var), x340Var, r11);
            x340Var.i0(1916466980);
            smc0 smc0VarN2 = k4p1.n();
            smc0VarN2.add(cwl1.o0(x340Var, 2131956456));
            smc0VarN2.add(cwl1.o0(x340Var, 2131956455));
            smc0VarN2.add(cwl1.o0(x340Var, 2131956453));
            if (fct0Var instanceof fct0) {
                x340Var.i0(-816764661);
                smc0VarN2.add(cwl1.n0(2131956454, new Object[]{fct0Var.a}, x340Var));
                r12 = 0;
                x340Var.r(false);
            } else {
                r12 = 0;
                x340Var.i0(-816597447);
                x340Var.r(false);
            }
            smc0 smc0VarK2 = k4p1.k(smc0VarN2);
            x340Var.r((boolean) r12);
            a(smc0VarK2, x340Var, r12);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 16.0f));
            jc50Var2 = jc50Var;
            uwo1.e(cwl1.n0(2131956457, new Object[]{Integer.valueOf(jc50Var2.f), str}, x340Var), u291.f(nim0Var, 1.0f), cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
        } else {
            jc50Var2 = jc50Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i750(jc50Var2, i, (byte) 2);
        }
    }

    public static final void o(mwq0 mwq0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-606663279);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mwq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ld41 ld41VarG = sgc1.G(x340Var);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = yv91.a(new ka2(mwq0Var, (byte) 2));
                x340Var.s0(objT);
            }
            kwq0 kwq0Var = (kwq0) ((tob1) objT).getValue();
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new cnp0(mwq0Var, (byte) 28);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = rfq0.b1;
                x340Var.s0(objT3);
            }
            hm5.a(kwq0Var, (qim0) null, iu30Var, (tl3) null, "OverlayNode", (iu30) objT3, apo.r(-1777603668, new gk0(ld41VarG, mwq0Var, j2iVar, (byte) 21), x340Var), x340Var, 1794048, 10);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tvq0(mwq0Var, j2iVar, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final void p(jc50 jc50Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strN0;
        ?? r13;
        String strN1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(591832955);
        int i2 = i | (x340Var.i(jc50Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            fct0 fct0Var = jc50Var.d;
            int i3 = jc50Var.e;
            String str = jc50Var.b;
            boolean z = fct0Var instanceof fct0;
            ect0 ect0Var = ect0.a;
            if (z) {
                x340Var.i0(1815792998);
                strN0 = cwl1.n0(2131956444, new Object[]{Integer.valueOf(i3), fct0Var.a}, x340Var);
                x340Var.r(false);
            } else {
                if (!u890.j(fct0Var, ect0Var)) {
                    throw p3d1.k(x340Var, 1815791345, false);
                }
                x340Var.i0(1815799583);
                strN0 = cwl1.n0(2131956443, new Object[]{Integer.valueOf(i3)}, x340Var);
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            nim0 nim0Var = nim0.a;
            uwo1.e(strN0, u291.f(nim0Var, 1.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 16.0f));
            m(cwl1.n0(2131956433, new Object[]{str}, x340Var), x340Var, 0);
            x340Var.i0(1815813435);
            smc0 smc0VarN = k4p1.n();
            smc0VarN.add(cwl1.o0(x340Var, 2131956434));
            if (fct0Var instanceof ect0) {
                x340Var.i0(1072082078);
                smc0VarN.add(cwl1.o0(x340Var, 2131956436));
                r13 = 0;
                x340Var.r(false);
            } else {
                r13 = 0;
                x340Var.i0(1072184905);
                x340Var.r(false);
            }
            smc0VarN.add(cwl1.o0(x340Var, 2131956435));
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var.r((boolean) r13);
            a(smc0VarK, x340Var, r13);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 16.0f));
            m(cwl1.n0(2131956437, new Object[]{str}, x340Var), x340Var, r13);
            x340Var.i0(1815830976);
            smc0 smc0VarN2 = k4p1.n();
            smc0VarN2.add(cwl1.o0(x340Var, 2131956440));
            smc0VarN2.add(cwl1.o0(x340Var, 2131956439));
            smc0VarN2.add(cwl1.o0(x340Var, 2131956438));
            smc0 smc0VarK2 = k4p1.k(smc0VarN2);
            x340Var.r(false);
            a(smc0VarK2, x340Var, 0);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 16.0f));
            if (z) {
                strN1 = x0d.k(x340Var, 1815846049, 2131956441, x340Var, false);
            } else {
                if (!u890.j(fct0Var, ect0Var)) {
                    throw p3d1.k(x340Var, 1815844395, false);
                }
                x340Var.i0(1815849502);
                strN1 = cwl1.n0(2131956442, new Object[]{str}, x340Var);
                x340Var.r(false);
            }
            uwo1.e(strN1, u291.f(nim0Var, 1.0f), cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i750(jc50Var, i, (byte) 3);
        }
    }

    public static final void q(wcg1 wcg1Var, ou8 ou8Var, xv81 xv81Var, yxb0 yxb0Var, ng20 ng20Var, et90 et90Var, qj0 qj0Var, zhy zhyVar, u710 u710Var, ldo ldoVar, boolean z, fcd1 fcd1Var, ecd1 ecd1Var, b0k b0kVar, int i) throws Throwable {
        x340 x340Var;
        wcg1 wcg1Var2;
        float f;
        xtb0 xtb0Var;
        ven0 ven0Var;
        Object z1v0Var;
        float f2;
        boolean z2;
        Throwable th;
        fgz0 fgz0Var;
        qim0 qim0Var;
        Integer num = wcg1Var.b;
        n5e0 n5e0Var = wcg1Var.d;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-848487514);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(wcg1Var) ? 4 : 2) | (x340Var2.i(ou8Var) ? 32 : 16) | (x340Var2.i(xv81Var) ? 256 : 128) | (x340Var2.i(yxb0Var) ? 2048 : 1024) | (x340Var2.i(ng20Var) ? 16384 : 8192) | (x340Var2.i(et90Var) ? 131072 : 65536) | (x340Var2.i(qj0Var) ? 1048576 : 524288) | (x340Var2.i(zhyVar) ? 8388608 : 4194304) | (x340Var2.i(u710Var) ? 67108864 : 33554432) | (x340Var2.i(ldoVar) ? 536870912 : 268435456);
        int i3 = (x340Var2.h(z) ? 4 : 2) | (x340Var2.i(fcd1Var) ? 32 : 16) | (x340Var2.i(ecd1Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            int iC = l1d.C(wcg1Var.e);
            if (iC == 0) {
                f = 24.0f;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                f = 0.0f;
            }
            boolean zJ = u890.j(n5e0Var, g5e0.a);
            qim0 qim0Var2 = nim0.a;
            if (zJ) {
                x340Var2.i0(-1408256548);
                b6p1.g(oep0.a, uyn1.z(f, 0.0f, 2, u291.d(qim0Var2, 1.0f)), 0.0f, 0.0f, (dqz0) null, x340Var2, 0);
                x340Var2.r(false);
                h311 h311VarV = x340Var2.v();
                if (h311VarV != null) {
                    h311VarV.d = new bdg1(wcg1Var, ou8Var, xv81Var, yxb0Var, ng20Var, et90Var, qj0Var, zhyVar, u710Var, ldoVar, z, fcd1Var, ecd1Var, i, (byte) 0);
                    return;
                }
                return;
            }
            x340Var2.i0(-1408102788);
            x340Var2.r(false);
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            Object objT = x340Var2.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zG = x340Var2.g(xtb0VarA) | x340Var2.g((Object) null);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == obj) {
                objT2 = new fgz0(xtb0VarA);
                x340Var2.s0(objT2);
            }
            fgz0 fgz0Var2 = (fgz0) objT2;
            ven0 ven0VarS = v8r.s(num, x340Var2);
            Object objT3 = x340Var2.T();
            if (objT3 == obj) {
                objT3 = yv91.a(new w77(xtb0VarA, ven0VarS));
                x340Var2.s0(objT3);
            }
            tob1 tob1Var = (tob1) objT3;
            Boolean bool = (Boolean) tob1Var.getValue();
            bool.getClass();
            boolean zI = x340Var2.i(fcd1Var) | x340Var2.i(tob1Var);
            float f3 = f;
            Object objT4 = x340Var2.T();
            if (zI || objT4 == obj) {
                objT4 = new kwb1(fcd1Var, tob1Var, null, (byte) 17);
                x340Var2.s0(objT4);
            }
            qxd0.t(bool, x340Var2, (vu30) objT4);
            Object objT5 = x340Var2.T();
            if (objT5 == obj) {
                objT5 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT5);
            }
            ven0 ven0Var2 = (ven0) objT5;
            Object objT6 = x340Var2.T();
            if (objT6 == obj) {
                objT6 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT6);
            }
            ven0 ven0Var3 = (ven0) objT6;
            Object objT7 = x340Var2.T();
            if (objT7 == obj) {
                objT7 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT7);
            }
            ven0 ven0Var4 = (ven0) objT7;
            boolean zI2 = x340Var2.i(xtb0VarA) | x340Var2.i(fgz0Var2) | x340Var2.i(ven0Var3) | x340Var2.i(tob1Var) | x340Var2.i(ven0Var4);
            Object objT8 = x340Var2.T();
            if (zI2 || objT8 == obj) {
                objT8 = new bj81(xtb0VarA, fgz0Var2, ven0Var3, tob1Var, ven0Var4, (lnm) null);
                xtb0Var = xtb0VarA;
                ven0Var = ven0Var4;
                x340Var2.s0(objT8);
            } else {
                ven0Var = ven0Var4;
                xtb0Var = xtb0VarA;
            }
            qxd0.t(rih1.a, x340Var2, (vu30) objT8);
            boolean zI3 = x340Var2.i(wcg1Var) | x340Var2.i(ven0Var2) | x340Var2.i(ven0Var) | x340Var2.i(xtb0Var) | x340Var2.i(fgz0Var2) | x340Var2.i(ven0Var3);
            Object objT9 = x340Var2.T();
            if (zI3 || objT9 == obj) {
                f2 = 1.0f;
                z2 = true;
                th = null;
                z1v0Var = new z1v0(wcg1Var, xtb0Var, fgz0Var2, ven0Var2, ven0Var, ven0Var3, (lnm) null);
                fgz0Var = fgz0Var2;
                x340Var2.s0(z1v0Var);
            } else {
                fgz0Var = fgz0Var2;
                z1v0Var = objT9;
                f2 = 1.0f;
                z2 = true;
                th = null;
            }
            qxd0.s(num, n5e0Var, (vu30) z1v0Var, x340Var2);
            float fX0 = ((wat) x340Var2.k(t4k.h)).X0(48.0f);
            qim0 qim0VarD = u291.d(qim0Var2, f2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw th;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            zzq0 zzq0VarH = uyn1.h(2, f3, 0.0f);
            qim0 qim0VarD2 = u291.d(qim0Var2, f2);
            boolean zI4 = x340Var2.i(ven0Var2);
            Object objT10 = x340Var2.T();
            if (zI4 || objT10 == obj) {
                objT10 = new i2g1(ven0Var2, (byte) 3);
                x340Var2.s0(objT10);
            }
            qim0 qim0VarF = F(anm1.N("read-along-lazy-column", i541.C(qim0VarD2, (iu30) objT10)), fX0, xtb0Var.c(), xtb0Var.d());
            boolean zI5 = x340Var2.i(wcg1Var) | x340Var2.i(xv81Var) | x340Var2.i(yxb0Var) | x340Var2.i(ng20Var) | x340Var2.i(et90Var) | x340Var2.i(ou8Var) | x340Var2.i(zhyVar) | x340Var2.i(qj0Var) | x340Var2.i(ldoVar) | ((i3 & 14) == 4 ? z2 : false) | x340Var2.i(u710Var);
            Object objT11 = x340Var2.T();
            if (zI5 || objT11 == obj) {
                qim0Var = qim0Var2;
                objT11 = new axm0(wcg1Var, xv81Var, yxb0Var, ng20Var, et90Var, ou8Var, zhyVar, qj0Var, ldoVar, z, u710Var, (byte) 3);
                wcg1Var2 = wcg1Var;
                x340Var2.s0(objT11);
            } else {
                wcg1Var2 = wcg1Var;
                qim0Var = qim0Var2;
            }
            xtb0 xtb0Var2 = xtb0Var;
            ujo1.d(qim0VarF, xtb0Var2, zzq0VarH, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT11, x340Var2, 0, 504);
            x340Var = x340Var2;
            boolean zI6 = x340Var.i(wcg1Var2);
            Object objT12 = x340Var.T();
            if (zI6 || objT12 == obj) {
                objT12 = new ibf1(wcg1Var2, (byte) 25);
                x340Var.s0(objT12);
            }
            zfz0.b(fgz0Var, (iu30) objT12, (qim0) null, ((Boolean) ven0Var3.getValue()).booleanValue(), x340Var, 70);
            qim0 qim0VarD3 = u291.d(qim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.X, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD3);
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
            boolean zI7 = x340Var.i(wcg1Var2) | x340Var.i(c9nVar) | x340Var.i(xtb0Var2);
            Object objT13 = x340Var.T();
            if (zI7 || objT13 == obj) {
                objT13 = new o8e1(wcg1Var2, c9nVar, xtb0Var2, (byte) 12);
                x340Var.s0(objT13);
            }
            otw.c(ecd1Var, new ccd1("", (Function0) objT13), (qim0) null, (ipb1) null, x340Var, (i3 >> 6) & 14, 12);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            wcg1Var2 = wcg1Var;
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new bdg1(wcg1Var2, ou8Var, xv81Var, yxb0Var, ng20Var, et90Var, qj0Var, zhyVar, u710Var, ldoVar, z, fcd1Var, ecd1Var, i, (byte) 1);
        }
    }

    public static final long s(int i, long j) {
        ytw0 ytw0Var = jfv.b;
        long j2 = (j << 1) + ((long) i);
        int i2 = hgv.a;
        return j2;
    }

    public static final long w(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? C(j / 1000000) : E(j);
    }

    public static final long x(long j) {
        return j * 1000000;
    }

    public static final long y(long j) {
        return j / 1000000;
    }

    public static final long z(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : yoi1.r(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public abstract String J();
}
