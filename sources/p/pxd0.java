package p;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.common.ParserException;
import com.spotify.mobius.Next;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class pxd0 implements rxd0 {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};
    public static b180 j;
    public static b180 k;

    public static String A(lvc1 lvc1Var) {
        return lvc1Var.t("destination");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int B(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i3 = (((b3 & 60) >> 2) | i4) + 1;
            z = true;
            if (z) {
                return (i3 * 16) / 14;
            }
            return i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (z) {
            return (i3 * 16) / 14;
        }
        return i3;
    }

    public static int C(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static bae D(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new bae(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        bae baeVar = new bae(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            bae baeVar2 = new bae(bArrCopyOf, bArrCopyOf.length);
            while (baeVar2.b() >= 16) {
                baeVar2.o(2);
                int iG = baeVar2.g(14) & 16383;
                int iMin = Math.min(8 - baeVar.d, 14);
                int i4 = baeVar.d;
                int i5 = (8 - i4) - iMin;
                byte[] bArr3 = baeVar.b;
                int i6 = baeVar.c;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - iMin;
                bArr3[i6] = (byte) (b5 | ((iG >>> i7) << i5));
                int i8 = i6 + 1;
                while (true) {
                    bArr2 = baeVar.b;
                    if (i7 > 8) {
                        bArr2[i8] = (byte) (iG >>> (i7 - 8));
                        i7 -= 8;
                        i8++;
                    }
                }
                int i9 = 8 - i7;
                byte b6 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b6;
                bArr2[i8] = (byte) (((iG & ((1 << i7) - 1)) << i9) | b6);
                baeVar.o(14);
                baeVar.a();
            }
        }
        baeVar.l(bArrCopyOf, bArrCopyOf.length);
        return baeVar;
    }

    public static int E(int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : 0;
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & 128) != 0) {
            i3++;
        }
        if ((i2 & 256) != 0) {
            i3++;
        }
        if ((i2 & 512) != 0) {
            i3 += 2;
        }
        if ((i2 & 1024) != 0) {
            i3 += 2;
        }
        if ((i2 & 2048) != 0) {
            i3 += 2;
        }
        if ((i2 & 4096) != 0) {
            i3++;
        }
        if ((i2 & 8192) != 0) {
            i3 += 2;
        }
        if ((i2 & 16384) != 0) {
            i3++;
        }
        return (i2 & 32768) != 0 ? i3 + 2 : i3;
    }

    public static String F(lvc1 lvc1Var) {
        return lvc1Var.t("source");
    }

    public static boolean G(lvc1 lvc1Var) {
        lvc1Var.getClass();
        return "cancelled".equals(lvc1Var.t("moving-state"));
    }

    public static boolean H(String str) {
        return Objects.equals(str, "audio/vnd.dts") || Objects.equals(str, "audio/vnd.dts.hd");
    }

    public static boolean I(lvc1 lvc1Var) {
        return "received".equals(lvc1Var.t("moving-state"));
    }

    public static boolean J(lvc1 lvc1Var) {
        return "sending".equals(lvc1Var.t("moving-state"));
    }

    public static boolean K(lvc1 lvc1Var) {
        return "sent".equals(lvc1Var.t("moving-state"));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:104:0x021d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0223  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x024f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0251  */
    /* JADX WARN: Code duplicated, block: B:120:0x0254  */
    /* JADX WARN: Code duplicated, block: B:122:0x0257  */
    /* JADX WARN: Code duplicated, block: B:123:0x025b  */
    /* JADX WARN: Code duplicated, block: B:125:0x026f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0273  */
    /* JADX WARN: Code duplicated, block: B:129:0x0284  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e A[LOOP:2: B:54:0x011c->B:55:0x011e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d A[LOOP:4: B:59:0x013b->B:60:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x019e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee A[LOOP:8: B:98:0x01ec->B:99:0x01ee, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x0225, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x025b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    public static eev L(byte[] bArr) throws ParserException {
        int i2;
        int i3;
        int i4;
        boolean zF;
        int iG;
        int iG2;
        int[] iArr;
        int i5;
        String str;
        int iG3;
        long jG0;
        int i6;
        int i7;
        int i8;
        int i9;
        ?? r19;
        ?? r12;
        boolean zF2;
        int iG4;
        String str2;
        boolean zF3;
        int length;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        int length2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ?? r13;
        ?? F;
        int iG5;
        int iG6;
        int[] iArr3;
        int i20;
        int i21;
        int iE;
        int iG7;
        int i22;
        boolean zF4;
        bae baeVarD = D(bArr);
        baeVarD.o(40);
        int iG8 = baeVarD.g(2);
        if (baeVarD.f()) {
            i2 = 20;
            i3 = 12;
        } else {
            i2 = 16;
            i3 = 8;
        }
        baeVarD.o(i3);
        int i23 = 1;
        int iG9 = baeVarD.g(i2) + 1;
        boolean zF5 = baeVarD.f();
        if (zF5) {
            iG2 = baeVarD.g(2);
            iG = (baeVarD.g(3) + 1) * 512;
            if (baeVarD.f()) {
                baeVarD.o(36);
            }
            int iG10 = baeVarD.g(3) + 1;
            int iG11 = baeVarD.g(3) + 1;
            if (iG10 != 1 || iG11 != 1) {
                throw ParserException.d("Multiple audio presentations or assets not supported");
            }
            int i24 = iG8 + 1;
            int iG12 = baeVarD.g(i24);
            for (int i25 = 0; i25 < i24; i25++) {
                if (((iG12 >> i25) & 1) == 1) {
                    baeVarD.o(8);
                }
            }
            i4 = 0;
            zF = baeVarD.f();
            if (zF) {
                baeVarD.o(2);
                int iG13 = (baeVarD.g(2) + 1) << 2;
                int iG14 = baeVarD.g(2) + 1;
                iArr = new int[iG14];
                for (int i26 = 0; i26 < iG14; i26++) {
                    iArr[i26] = E(baeVarD.g(iG13));
                }
            }
            baeVarD.o(i2);
            baeVarD.o(12);
            if (zF5) {
                if (baeVarD.f()) {
                    baeVarD.o(4);
                }
                if (baeVarD.f()) {
                    baeVarD.o(24);
                }
                if (baeVarD.f()) {
                    baeVarD.p(baeVarD.g(10) + 1);
                }
                i7 = 5;
                baeVarD.o(5);
                i5 = d[baeVarD.g(4)];
                iG3 = baeVarD.g(8) + 1;
                i8 = 6;
                if (baeVarD.f()) {
                    if (iG3 > 2) {
                        zF4 = baeVarD.f();
                    } else {
                        r13 = i4;
                    }
                    if (iG3 > 6) {
                        r13 = zF4;
                        F = baeVarD.f();
                    } else {
                        r13 = zF4;
                        F = i4;
                    }
                    if (baeVarD.f()) {
                        iG5 = (baeVarD.g(2) + 1) << 2;
                        baeVarD.o(iG5);
                    } else {
                        iG5 = i4;
                    }
                    iG6 = baeVarD.g(3);
                    iArr3 = new int[iG6];
                    for (i20 = i4; i20 < iG6; i20++) {
                        iArr3[i20] = baeVarD.g(iG5);
                    }
                    i21 = i4;
                    while (i21 < iG6) {
                        iE = E(iArr3[i21]);
                        int i27 = i7;
                        iG7 = baeVarD.g(i7) + 1;
                        i22 = i4;
                        while (i22 < iE) {
                            baeVarD.o(Integer.bitCount(baeVarD.g(iG7)) * 5);
                            i22++;
                            iArr3 = iArr3;
                        }
                        i21++;
                        i7 = i27;
                    }
                    i9 = i7;
                    r12 = r13;
                    r19 = F;
                } else {
                    i9 = 5;
                    i23 = 1;
                    baeVarD.o(3);
                    int i28 = i4;
                    r19 = i28 == true ? 1 : 0;
                    r12 = i28;
                }
                zF2 = baeVarD.f();
                if (zF2) {
                    baeVarD.o(8);
                }
                if (baeVarD.f()) {
                    baeVarD.o(i9);
                }
                if (zF2 && r12 != 0) {
                    baeVarD.o(8);
                }
                if (zF && baeVarD.f()) {
                    iArr.getClass();
                    baeVarD.o(7);
                    if (baeVarD.g(2) < 3) {
                        baeVarD.o(3);
                    } else {
                        baeVarD.o(8);
                    }
                    zF3 = baeVarD.f();
                    length = iArr.length;
                    i10 = i4;
                    while (i10 < length) {
                        i18 = iArr[i10];
                        if (zF3) {
                            baeVarD.o(i18 * 6);
                            i19 = i8;
                        } else {
                            i19 = i8;
                            baeVarD.o(i19);
                        }
                        i10++;
                        i8 = i19;
                    }
                    i11 = i8;
                    iArr2 = new int[3];
                    iArr2[i4] = iG3;
                    if (r19 != 0) {
                        iArr2[i23] = i11;
                        i12 = 2;
                    } else {
                        i12 = i23;
                    }
                    if (r12 != 0) {
                        iArr2[i12] = 2;
                        i12++;
                    }
                    length2 = iArr.length;
                    for (i13 = i4; i13 < length2; i13++) {
                        i14 = iArr[i13];
                        for (i15 = i4; i15 < i12; i15++) {
                            i16 = iArr2[i15];
                            i17 = i4;
                            while (i17 < i16) {
                                baeVarD.o(Integer.bitCount(baeVarD.g(i14)) * 6);
                                i17++;
                                iArr2 = iArr2;
                            }
                        }
                    }
                }
                iG4 = baeVarD.g(2);
                str2 = "audio/vnd.dts.hd";
                if (iG4 != 0) {
                    if (iG4 != i23) {
                        if (iG4 != 2) {
                            throw ParserException.a((RuntimeException) null, "Unsupported coding mode in DTS HD header: " + iG4);
                        }
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    }
                } else if ((baeVarD.g(12) & 256) != 0) {
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                }
                str = str2;
            } else {
                i5 = -2147483647;
                str = null;
                iG3 = -1;
            }
            int i29 = i5;
            if (zF5) {
                if (iG2 != 0) {
                    i6 = 32000;
                } else if (iG2 != 1) {
                    i6 = 44100;
                } else {
                    if (iG2 == 2) {
                        throw ParserException.a((RuntimeException) null, "Unsupported reference clock code in DTS HD header: " + iG2);
                    }
                    i6 = 48000;
                }
                long j2 = i6;
                String str3 = zoi1.a;
                jG0 = zoi1.g0(iG, 1000000L, j2, RoundingMode.DOWN);
            } else {
                jG0 = -9223372036854775807L;
            }
            return new eev(iG3, i29, iG9, jG0, str);
        }
        i4 = 0;
        zF = false;
        iG = 0;
        iG2 = -1;
        iArr = null;
        baeVarD.o(i2);
        baeVarD.o(12);
        if (zF5) {
            if (baeVarD.f()) {
                baeVarD.o(4);
            }
            if (baeVarD.f()) {
                baeVarD.o(24);
            }
            if (baeVarD.f()) {
                baeVarD.p(baeVarD.g(10) + 1);
            }
            i7 = 5;
            baeVarD.o(5);
            i5 = d[baeVarD.g(4)];
            iG3 = baeVarD.g(8) + 1;
            i8 = 6;
            if (baeVarD.f()) {
                if (iG3 > 2) {
                    zF4 = baeVarD.f();
                } else {
                    r13 = i4;
                }
                if (iG3 > 6) {
                    r13 = zF4;
                    F = baeVarD.f();
                } else {
                    r13 = zF4;
                    F = i4;
                }
                if (baeVarD.f()) {
                    iG5 = (baeVarD.g(2) + 1) << 2;
                    baeVarD.o(iG5);
                } else {
                    iG5 = i4;
                }
                iG6 = baeVarD.g(3);
                iArr3 = new int[iG6];
                while (i20 < iG6) {
                    iArr3[i20] = baeVarD.g(iG5);
                }
                i21 = i4;
                while (i21 < iG6) {
                    iE = E(iArr3[i21]);
                    int i210 = i7;
                    iG7 = baeVarD.g(i7) + 1;
                    i22 = i4;
                    while (i22 < iE) {
                        baeVarD.o(Integer.bitCount(baeVarD.g(iG7)) * 5);
                        i22++;
                        iArr3 = iArr3;
                    }
                    i21++;
                    i7 = i210;
                }
                i9 = i7;
                r12 = r13;
                r19 = F;
            } else {
                i9 = 5;
                i23 = 1;
                baeVarD.o(3);
                int i211 = i4;
                r19 = i211 == true ? 1 : 0;
                r12 = i211;
            }
            zF2 = baeVarD.f();
            if (zF2) {
                baeVarD.o(8);
            }
            if (baeVarD.f()) {
                baeVarD.o(i9);
            }
            if (zF2) {
                baeVarD.o(8);
            }
            if (zF) {
                iArr.getClass();
                baeVarD.o(7);
                if (baeVarD.g(2) < 3) {
                    baeVarD.o(3);
                } else {
                    baeVarD.o(8);
                }
                zF3 = baeVarD.f();
                length = iArr.length;
                i10 = i4;
                while (i10 < length) {
                    i18 = iArr[i10];
                    if (zF3) {
                        baeVarD.o(i18 * 6);
                        i19 = i8;
                    } else {
                        i19 = i8;
                        baeVarD.o(i19);
                    }
                    i10++;
                    i8 = i19;
                }
                i11 = i8;
                iArr2 = new int[3];
                iArr2[i4] = iG3;
                if (r19 != 0) {
                    iArr2[i23] = i11;
                    i12 = 2;
                } else {
                    i12 = i23;
                }
                if (r12 != 0) {
                    iArr2[i12] = 2;
                    i12++;
                }
                length2 = iArr.length;
                while (i13 < length2) {
                    i14 = iArr[i13];
                    while (i15 < i12) {
                        i16 = iArr2[i15];
                        i17 = i4;
                        while (i17 < i16) {
                            baeVarD.o(Integer.bitCount(baeVarD.g(i14)) * 6);
                            i17++;
                            iArr2 = iArr2;
                        }
                    }
                }
            }
            iG4 = baeVarD.g(2);
            str2 = "audio/vnd.dts.hd";
            if (iG4 != 0) {
                if (iG4 != i23) {
                    if (iG4 != 2) {
                        throw ParserException.a((RuntimeException) null, "Unsupported coding mode in DTS HD header: " + iG4);
                    }
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                }
            } else if ((baeVarD.g(12) & 256) != 0) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            }
            str = str2;
        } else {
            i5 = -2147483647;
            str = null;
            iG3 = -1;
        }
        int i212 = i5;
        if (zF5) {
            if (iG2 != 0) {
                i6 = 32000;
            } else if (iG2 != 1) {
                i6 = 44100;
            } else {
                if (iG2 == 2) {
                    throw ParserException.a((RuntimeException) null, "Unsupported reference clock code in DTS HD header: " + iG2);
                }
                i6 = 48000;
            }
            long j3 = i6;
            String str4 = zoi1.a;
            jG0 = zoi1.g0(iG, 1000000L, j3, RoundingMode.DOWN);
        } else {
            jG0 = -9223372036854775807L;
        }
        return new eev(iG3, i212, iG9, jG0, str);
    }

    public static int M(bae baeVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && baeVar.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return baeVar.g(iArr[i2]) + i4;
    }

    public static final int N(String str) {
        switch (str.hashCode()) {
            case -1677210361:
                return !str.equals("multiple elements") ? 0 : 2;
            case -274365789:
                return !str.equals("hook/riff") ? 0 : 5;
            case 3016415:
                return !str.equals("bass") ? 0 : 3;
            case 95864205:
                return !str.equals("drums") ? 0 : 1;
            case 388331141:
                return !str.equals("vocals/lyrics") ? 0 : 4;
            case 1113702276:
                return !str.equals("sound FX/other") ? 0 : 6;
            default:
                return 0;
        }
    }

    public static final q541 O(String str) {
        if (str.equals("sample")) {
            return q541.b;
        }
        if (str.equals("interpolation")) {
            return q541.c;
        }
        return null;
    }

    public static void P(lvc1 lvc1Var, String str) {
        lvc1Var.L("moving-state", "received");
        lvc1Var.L("source", str);
        lvc1Var.K();
    }

    public static void Q(lvc1 lvc1Var, String str) {
        lvc1Var.L("moving-state", "receiving");
        lvc1Var.L("source", str);
        lvc1Var.K();
    }

    public static void R(lvc1 lvc1Var, String str) {
        lvc1Var.L("moving-state", "sending");
        lvc1Var.L("destination", str);
        lvc1Var.K();
    }

    public static void S(lvc1 lvc1Var, String str) {
        lvc1Var.L("moving-state", "sent");
        lvc1Var.L("destination", str);
        lvc1Var.K();
    }

    public static final qyf1 T(String str) {
        String upperCase = str != null ? str.toUpperCase(Locale.ROOT) : null;
        if (u890.j(upperCase, "ORIGINAL")) {
            return new oyf1(1);
        }
        return u890.j(upperCase, "COVER") ? new oyf1(2) : pyf1.a;
    }

    public static final int U(int i2) {
        int iC = l1d.C(i2);
        if (iC == 0) {
            return 2130969252;
        }
        if (iC == 1) {
            return 2130969253;
        }
        if (iC == 2) {
            return 2130969254;
        }
        if (iC == 3) {
            return 2130969255;
        }
        if (iC == 4) {
            return 2130969257;
        }
        eg.o();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0018 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x001a  */
    public static final ye10 V(eww0 eww0Var, String str) {
        String str2 = eww0Var != null ? eww0Var.a : str;
        if (eww0Var != null) {
            String str3 = eww0Var.b;
            if (ihc1.y0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                str = str3;
            } else if (eww0Var != null) {
                str = eww0Var.a;
            }
        } else if (eww0Var != null) {
            str = eww0Var.a;
        }
        return new ye10(str2, str, eww0Var != null ? eww0Var.f : null);
    }

    public static Next W(kak0 kak0Var, j4k0 j4k0Var) {
        q6w0 q6w0VarA;
        s69 s69Var = j4k0Var.b;
        s69 s69Var2 = j4k0Var.c;
        q6w0 q6w0Var = kak0Var.S0.a;
        int iOrdinal = j4k0Var.a.ordinal();
        if (iOrdinal == 0) {
            s69 s69Var3 = s69Var2;
            s69 s69Var4 = q6w0Var.i;
            if (s69Var4 != null) {
                s69Var3 = s69Var4;
            }
            q6w0VarA = q6w0.a(q6w0Var, (buk1) null, (hez) null, (fa20) null, (px30) null, (taa0) null, (k7f0) null, s69Var, s69Var3, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 65151);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            s69 s69Var5 = q6w0Var.h;
            if (s69Var5 != null) {
                s69Var2 = s69Var5;
            }
            q6w0VarA = q6w0.a(q6w0Var, (buk1) null, (hez) null, (fa20) null, (px30) null, (taa0) null, (k7f0) null, s69Var2, s69Var, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 65151);
        }
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var.S0, q6w0VarA, (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 1);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    public static ie30 X(fc10 fc10Var, int i2, ie30 ie30Var) {
        bae baeVarD;
        int i3;
        int iG;
        String str;
        izr0 izr0Var = new izr0(i2);
        if (fc10Var.d(izr0Var.a, 0, i2, true)) {
            fc10Var.f();
            int iM = izr0Var.m();
            if (C(iM) != 1) {
                if (C(iM) == 2 && izr0Var.a() >= 7) {
                    int i4 = izr0Var.b;
                    byte[] bArr = new byte[7];
                    izr0Var.o(0, bArr, 7);
                    izr0Var.R(i4);
                    baeVarD = D(bArr);
                    baeVarD.o(42);
                    if (baeVarD.f()) {
                        i3 = 12;
                    } else {
                        i3 = 8;
                    }
                    iG = baeVarD.g(i3) + 1;
                    if (iG > 0 && izr0Var.a() >= iG) {
                        byte[] bArr2 = new byte[iG];
                        izr0Var.o(0, bArr2, iG);
                        str = (String) L(bArr2).e;
                        if (str == null) {
                            str = "audio/vnd.dts.hd";
                        }
                        if (Objects.equals(ie30Var.p, str)) {
                            return ie30Var;
                        }
                        ge30 ge30VarA = ie30Var.a();
                        ge30VarA.o = asj0.p(str);
                        return new ie30(ge30VarA);
                    }
                }
            } else if (izr0Var.a() >= 10) {
                byte[] bArr3 = new byte[10];
                izr0Var.o(0, bArr3, 10);
                int iB = B(bArr3);
                if (iB > 0 && izr0Var.c >= iB + 4) {
                    izr0Var.R(iB);
                    iM = izr0Var.m();
                    if (C(iM) == 2) {
                        int i5 = izr0Var.b;
                        byte[] bArr4 = new byte[7];
                        izr0Var.o(0, bArr4, 7);
                        izr0Var.R(i5);
                        baeVarD = D(bArr4);
                        baeVarD.o(42);
                        if (baeVarD.f()) {
                            i3 = 12;
                        } else {
                            i3 = 8;
                        }
                        iG = baeVarD.g(i3) + 1;
                        if (iG > 0) {
                            byte[] bArr5 = new byte[iG];
                            izr0Var.o(0, bArr5, iG);
                            str = (String) L(bArr5).e;
                            if (str == null) {
                                str = "audio/vnd.dts.hd";
                            }
                            if (Objects.equals(ie30Var.p, str)) {
                                return ie30Var;
                            }
                            ge30 ge30VarA2 = ie30Var.a();
                            ge30VarA2.o = asj0.p(str);
                            return new ie30(ge30VarA2);
                        }
                    }
                }
            }
        }
        return ie30Var;
    }

    public static final void a(d0r d0rVar, c380 c380Var, tyq tyqVar, iu30 iu30Var, vzq0 vzq0Var, qim0 qim0Var, p3v p3vVar, vu30 vu30Var, b0k b0kVar, int i2) {
        int i3;
        iu30 iu30Var2;
        vzq0 vzq0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-951619553);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.i(d0rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? b0kVar3.g(c380Var) : b0kVar3.i(c380Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(tyqVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            iu30Var2 = iu30Var;
            i3 |= b0kVar3.i(iu30Var2) ? 2048 : 1024;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i2 & 24576) == 0) {
            vzq0Var2 = vzq0Var;
            i3 |= b0kVar3.i(vzq0Var2) ? 16384 : 8192;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= b0kVar3.g(p3vVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= b0kVar3.i(vu30Var) ? 8388608 : 4194304;
        }
        if (b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new ur80(0, 0, 0, 0));
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            View view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
            qim0 qim0VarZ = u291.z(qim0Var, (fra) null, 3);
            boolean zI = b0kVar3.i(ven0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cy7(ven0Var, (byte) 9);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            w2g0.c(ern1.x(qim0VarZ, (iu30) objT2), null, apo.r(1546800629, new e1c(c380Var, iu30Var2, tyqVar, vzq0Var2, view, p3vVar, d0rVar, ven0Var, vu30Var, (byte) 0), b0kVar3), b0kVar2, 3072, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(d0rVar, c380Var, tyqVar, iu30Var, vzq0Var, qim0Var, p3vVar, vu30Var, i2);
        }
    }

    public static final void b(Object obj, int i2, tyq tyqVar, iu30 iu30Var, Function0 function0, b0k b0kVar, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-489167031);
        int i4 = (x340Var.i(function0) ? 16384 : 8192) | (x340Var.g(obj) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(tyqVar) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            prn1.d(((i4 >> 12) & 14) | 384, function0, apo.r(-169512790, new h1c(i2, obj, tyqVar, function0, iu30Var), x340Var), x340Var, (qim0) null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h1c(obj, i2, tyqVar, iu30Var, function0, i3);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i2) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1286202907);
        int i3 = (x340Var.i(function0) ? 4 : 2) | i2 | (x340Var.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            function2 = function1;
            mqo1.e(function2, (i3u) null, (vu30) null, sei.b, sei.c, apo.r(1012713763, new wm(function0, (byte) 29), x340Var), apo.r(-1596353598, new bvk(function1, b2), x340Var), x340Var, ((i3 >> 3) & 14) | 1797120, 6);
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function2, i2, (byte) 8);
        }
    }

    public static final void d(bou bouVar, iu30 iu30Var, zeu zeuVar, ngs0 ngs0Var, tm tmVar, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        tm tmVar2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1746945006);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(bouVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? x340Var.g(zeuVar) : x340Var.i(zeuVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.g(ngs0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            tmVar2 = tmVar;
            i3 |= x340Var.i(tmVar2) ? 16384 : 8192;
        } else {
            tmVar2 = tmVar;
        }
        int i4 = i3 | 196608;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            qim0 qim0Var3 = nim0.a;
            bbp1.e(zeuVar, qim0Var3, apo.r(1836905607, new ta5((Object) c4p1.D(6, 2, "", x340Var), (Object) cwl1.n0(2131963150, new Object[]{bouVar.f}, x340Var), (Object) bouVar, (Object) iu30Var, (Object) zeuVar, (Object) tmVar2, (Object) ngs0Var, (byte) 15), x340Var), x340Var, ((i4 >> 6) & 14) | 384 | ((i4 >> 12) & 112));
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(bouVar, iu30Var, zeuVar, ngs0Var, tmVar, qim0Var2, i2, (byte) 16);
        }
    }

    public static final void e(bou bouVar, iu30 iu30Var, zeu zeuVar, ngs0 ngs0Var, tm tmVar, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i2) {
        j2i j2iVar2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-753448714);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.g(bouVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(zeuVar) ? 256 : 128) | (x340Var.g(ngs0Var) ? 2048 : 1024) | (x340Var.i(tmVar) ? 16384 : 8192) | 1572864;
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD2);
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
            j2iVar2 = j2iVar;
            j2iVar2.invoke(x340Var, 6);
            d(bouVar, iu30Var, zeuVar, ngs0Var, tmVar, null, x340Var, i3 & 65534);
            x340Var.r(true);
            if (bouVar.i) {
                x340Var.i0(-1359936782);
                x340Var.r(false);
            } else {
                x340Var.i0(-1360098230);
                cbp1.d(0, cwl1.o0(x340Var, 2131963151), x340Var, h2c.a.a(qim0Var3, een.h));
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(bouVar, iu30Var, zeuVar, ngs0Var, tmVar, j2iVar2, qim0Var2, i2);
        }
    }

    public static final void f(nmu0 nmu0Var, qim0 qim0Var, ro30 ro30Var, iu30 iu30Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        boolean z;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-792812494);
        int i3 = i2 | (b0kVar2.e(nmu0Var.ordinal()) ? 4 : 2) | 48 | (b0kVar2.g(ro30Var) ? 256 : 128) | (b0kVar2.i(iu30Var) ? 2048 : 1024);
        if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarJ = u291.j(441.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar2).g, 32, qim0VarJ);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO0 = cwl1.o0(b0kVar2, 2131956214);
            lee1 lee1Var = cbx.d(b0kVar2).h;
            long j2 = cbx.a(b0kVar2).b.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            uwo1.e(strO0, uyn1.B(qim0VarF, 0.0f, 12.0f, 0.0f, 0.0f, 13), lee1Var, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            String strO1 = cwl1.o0(b0kVar2, 2131956213);
            lee1 lee1Var2 = cbx.d(b0kVar2).j;
            long j3 = cbx.a(b0kVar2).b.b;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            uwo1.e(strO1, uyn1.B(qim0VarF2, 0.0f, 2.0f, 0.0f, 0.0f, 13), lee1Var2, j3, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, u291.h(qim0Var3, cbx.b(b0kVar2).b.b));
            pjx pjxVar = pjx.c;
            String strO2 = cwl1.o0(b0kVar2, 2131956210);
            String strO3 = cwl1.o0(b0kVar2, 2131956209);
            boolean z2 = nmu0Var == nmu0.b;
            int i4 = i3 & 896;
            int i5 = i3 & 7168;
            boolean z3 = (i4 == 256) | (i5 == 2048);
            Object objT = b0kVar2.T();
            if (z3 || objT == m4cVar) {
                objT = new jg40(ro30Var, iu30Var, (byte) 0);
                b0kVar2.s0(objT);
            }
            g(pjxVar, strO2, strO3, z2, "GenerationModeRow_IterativeUpdate", (Function0) objT, b0kVar2, pjx.d | 24576);
            op71.g(b0kVar2, u291.h(qim0Var3, cbx.b(b0kVar2).b.b));
            npx npxVar = npx.c;
            String strO4 = cwl1.o0(b0kVar2, 2131956212);
            String strO5 = cwl1.o0(b0kVar2, 2131956211);
            boolean z4 = nmu0Var == nmu0.c;
            boolean z5 = (i4 == 256) | (i5 == 2048);
            Object objT2 = b0kVar2.T();
            if (z5 || objT2 == m4cVar) {
                z = true;
                objT2 = new jg40(ro30Var, iu30Var, (byte) 1);
                b0kVar2.s0(objT2);
            } else {
                z = true;
            }
            g(npxVar, strO4, strO5, z4, "GenerationModeRow_FullGeneration", (Function0) objT2, b0kVar2, npx.d | 24576);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            x0d.s(qim0Var3, 16.0f, b0kVar2, z);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i2, (Object) nmu0Var, (Object) qim0Var2, (Object) ro30Var, (Object) iu30Var, (byte) 22);
        }
    }

    public static final void g(hux huxVar, String str, String str2, boolean z, String str3, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-640053903);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(str3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.i(function0) ? 131072 : 65536;
        }
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarX = bin.x(anm1.N(str3, u291.j(32.0f, 0.0f, 2, qim0VarF)), false, (String) null, new pm31(3), (idn0) null, function0, 11);
            boolean z2 = (i3 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new mj10((byte) 4, z);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            long j2 = cbx.a(x340Var).b.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            int i4 = i3;
            isl islVar = isl.a;
            w0h1.a(huxVar, islVar, u291.r(nim0Var, 16.0f), j2, 0L, false, x340Var, 56 | (i3 & 14), 48);
            cvx cvxVar = cbx.b(x340Var).b;
            wnb0 wnb0VarK = c13.k(nim0Var, 12.0f, x340Var, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarK);
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
            uwo1.e(str, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i4 >> 3) & 14, 0, 2034);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str2, (qim0) null, kk0.p(nim0Var, 2.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i4 >> 6) & 14, 0, 2034);
            x340Var.r(true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 12.0f));
            ilx ilxVar = ilx.c;
            long j3 = cbx.a(x340Var).b.f;
            zov0 zov0Var2 = cbx.b(x340Var).g;
            w0h1.a(ilxVar, islVar, d9y0.k(u291.r(nim0Var, 24.0f), z ? 1.0f : 0.0f), j3, 0L, false, x340Var, ilx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(huxVar, str, str2, z, str3, function0, i2);
        }
    }

    public static final void h(int i2, String str, Function0 function0, b0k b0kVar, hux huxVar, boolean z) {
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1559277352);
        int i3 = i2 | ((i2 & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            idx idxVar = new idx();
            gdx gdxVarS = yla.s(x340Var);
            if (z) {
                x340Var.i0(478058604);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(478060092);
                haxVar = new hax(cwl1.o0(x340Var, 2131956737));
                x340Var.r(false);
            }
            jax jaxVar = haxVar;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(str), function0), idxVar, (qim0) null, jaxVar, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(355048239, new f90(huxVar, (byte) 9), x340Var), x340Var, 0, 6, 972);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ynu(huxVar, str, z, function0, i2, (byte) 0);
        }
    }

    public static final void i(String str, boolean z, iu30 iu30Var, zeu zeuVar, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        jax haxVar;
        y50 y50Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1963897572);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? b0kVar3.g(zeuVar) : b0kVar3.i(zeuVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            if (z) {
                b0kVar3.i0(-427850848);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(-427805309);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131956980));
                b0kVar3.r(false);
            }
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qlt.W0;
                b0kVar3.s0(objT);
            }
            vu30 vu30Var = (vu30) objT;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            hdx hdxVar = new hdx(2, (vu30) null, vu30Var, (vu30) null, er31.b(8.0f), 10);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            qim0 qim0VarH = sgc1.H(2, qim0Var);
            if (str.length() <= 0) {
                y50Var = z50.c;
            } else {
                if (ihc1.y0(str)) {
                    hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                    return;
                }
                y50Var = new y50(str);
            }
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && b0kVar3.i(zeuVar)));
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new znu(iu30Var, zeuVar, (byte) 0);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(y50Var, (Function0) objT2), hdxVar, qim0VarH, haxVar, (gdx) null, zzq0Var, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1026802941, new qeu(str, (byte) 4), b0kVar3), b0kVar2, 0, 48, 1960);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(str, z, iu30Var, zeuVar, qim0Var, i2, (byte) 12);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void j(xkf0 xkf0Var, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, vu30 vu30Var, iu30 iu30Var2, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        x340 x340Var;
        dhf0 dhf0Var;
        drf0 crf0Var;
        boolean z;
        String string;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(767300887);
        j06 j06Var = x340Var2.a;
        int i3 = i2 | (x340Var2.g(xkf0Var) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(j2iVar) ? 256 : 128) | (x340Var2.g(qim0Var) ? 2048 : 1024) | (x340Var2.i(vu30Var) ? 16384 : 8192) | (x340Var2.i(iu30Var2) ? 131072 : 65536);
        if (x340Var2.Y(i3 & 1, (74899 & i3) != 74898)) {
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            qkf0 qkf0Var = xkf0Var.a;
            if (qkf0Var.equals(vkf0.a)) {
                x340Var2.i0(-1116007125);
                y7y0.h((qim0) null, x340Var2, 0);
                x340Var2.r(false);
                x340Var = x340Var2;
                z = true;
            } else {
                boolean z3 = qkf0Var instanceof qkf0;
                nim0 nim0Var = nim0.a;
                if (z3) {
                    x340Var2.i0(-236399239);
                    Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
                    qkf0 qkf0Var2 = qkf0Var;
                    if (qkf0Var2.equals(okf0.a)) {
                        string = context.getString(((Number) o7h.P0(ygl.a, dqz0.a)).intValue());
                    } else {
                        if (!qkf0Var2.equals(pkf0.a)) {
                            eg.o();
                            return;
                        }
                        string = context.getString(2131959130);
                    }
                    String str = string;
                    uwr uwrVar = cbx.a;
                    z = true;
                    uwo1.e(str, h2c.a.a(nim0Var, een.h), cbx.d(x340Var2).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var2;
                    if (!(qkf0Var instanceof ukf0)) {
                        throw p3d1.k(x340Var, -1116005915, false);
                    }
                    x340Var.i0(-235839751);
                    qim0 qim0VarN = anm1.N("#LyricsFullscreenContentTag", nim0Var);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
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
                    boolean z4 = (i3 & 14) == 4;
                    Object objT = x340Var.T();
                    if (z4 || objT == fkj0.X) {
                        String str2 = xkf0Var.c;
                        String str3 = xkf0Var.d;
                        ukf0 ukf0Var = (ukf0) qkf0Var;
                        fef0 fef0Var = ukf0Var.a().a;
                        boolean z5 = ukf0Var instanceof rkf0;
                        if (z5) {
                            dhf0Var = dhf0.b;
                        } else {
                            boolean z6 = ukf0Var instanceof tkf0;
                            dhf0 dhf0Var2 = dhf0.e;
                            if (!z6 && !(ukf0Var instanceof skf0)) {
                                eg.o();
                                return;
                            }
                            dhf0Var = dhf0Var2;
                        }
                        yqf0 yqf0Var = new yqf0(str2, str3, fef0Var, dhf0Var, false);
                        if (z5) {
                            crf0Var = zqf0.a;
                        } else if (ukf0Var instanceof tkf0) {
                            tkf0 tkf0Var = (tkf0) qkf0Var;
                            crf0Var = new crf0(new vhc0(tkf0Var.b), tkf0Var.c);
                        } else {
                            if (!(ukf0Var instanceof skf0)) {
                                eg.o();
                                return;
                            }
                            crf0Var = brf0.a;
                        }
                        objT = v8r.q(new frf0(yqf0Var, new erf0(crf0Var, 1, xkf0Var.b, (!(xkf0Var.k instanceof xng1) || ukf0Var.a().a.c.isEmpty()) ? 1 : 2, qkf0Var instanceof rkf0, true), new jwa0(iu30Var2, (byte) 27), new jwa0(iu30Var, (byte) 28)));
                        x340Var.s0(objT);
                    }
                    mod.c(new ely0[]{sng1.a.a(Boolean.valueOf(xkf0Var.f50p)), g7a1.a.a(qkf0Var instanceof rkf0 ? vu30Var : null)}, apo.r(1444237323, new d0e0(j2iVar, (ven0) objT), x340Var), x340Var, 56);
                    z = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
            }
            x340Var.r(z);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy(xkf0Var, iu30Var, j2iVar, qim0Var, vu30Var, iu30Var2, i2, (byte) 15);
        }
    }

    public static final void k(vnr0 vnr0Var, vnr0 vnr0Var2, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(729668822);
        int i3 = (x340Var.d(8.0f) ? 4 : 2) | i2 | (x340Var.d(16.0f) ? 32 : 16) | (x340Var.i(vnr0Var) ? 256 : 128) | (x340Var.i(vnr0Var2) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 131072 : 65536);
        boolean z = true;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256 || x340Var.i(vnr0Var));
            if ((i3 & 7168) != 2048 && !x340Var.i(vnr0Var2)) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new tbs0(j2iVar, vnr0Var, vnr0Var2, (byte) 29);
                x340Var.s0(objT);
            }
            ejo1.l((i3 >> 15) & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i2, (Object) vnr0Var, (Object) vnr0Var2, (Object) j2iVar, (Object) qim0Var, (byte) 28);
        }
    }

    public static final void l(float f2, float f3, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        float f4;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-755833043);
        int i4 = (x340Var.d(f2) ? 4 : 2) | i2;
        int i5 = i4 | 48;
        int i6 = i3 & 4;
        if (i6 != 0) {
            i5 = i4 | 432;
        } else if ((i2 & 384) == 0) {
            i5 |= x340Var.d(f3) ? 256 : 128;
        }
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            f4 = i6 != 0 ? 1.0f : f3;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(u291.h(qim0Var3, f2), f4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            t1c.a(cwl1.l0(uyn1.z(16.0f, 0.0f, 2, qim0VarF), z4p1.f(217, 217, 217, 1), er31.b(2.0f), 12), x340Var, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            f4 = f3;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xt00(f2, i2, f4, qim0Var2, i3);
        }
    }

    public static final void m(qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1725610103);
        int i3 = i2 | 6;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            boolean zG = x340Var.g(yae1VarQ);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                y9e1 y9e1VarA = yae1.a(yae1VarQ, "\n", lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020);
                zrm0 zrm0Var = y9e1VarA.b;
                float f2 = ((int) (y9e1VarA.c & 4294967295L)) / zrm0Var.f;
                float fB = zrm0Var.b(0) - zrm0Var.f(0);
                mmr0 mmr0Var = new mmr0(Float.valueOf(fB), Float.valueOf(f2 - fB));
                x340Var.s0(mmr0Var);
                objT = mmr0Var;
            }
            mmr0 mmr0Var2 = (mmr0) objT;
            float fFloatValue = ((Number) mmr0Var2.a).floatValue();
            float f3 = 0.85f * fFloatValue;
            float fE = l1d.e(fFloatValue, f3, 2.0f, ((Number) mmr0Var2.b).floatValue());
            wat watVar = (wat) x340Var.k(t4k.h);
            float fN0 = watVar.N0(f3);
            float fN1 = watVar.N0(fE);
            qim0Var2 = nim0.a;
            qim0 qim0VarV = u291.v(u291.c(qim0Var2, 1.0f), dsa0.m(x340Var, 2131167089));
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarE = d1u.E(1.0f, jA, qim0VarV, er31.b(8.0f));
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(qim0VarE2, x340Var, y580.Y);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = u291.b(0.0f, 16.0f, 1, qim0Var2);
            pbh pbhVar = pbh.a;
            op71.g(x340Var, pbhVar.a(1.0f, qim0VarB, true));
            l(fN0, 0.0f, 0, 6, x340Var, null);
            op71.g(x340Var, u291.h(qim0Var2, fN1));
            l(fN0, 0.8f, 384, 2, x340Var, null);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, pbhVar.a(1.0f, u291.b(0.0f, 16.0f, 1, qim0Var2), true));
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var2, i2, (byte) 14);
        }
    }

    public static final void n(vnr0 vnr0Var, iu30 iu30Var, b0k b0kVar, int i2) {
        vnr0 vnr0Var2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(37562023);
        int i3 = (x340Var.i(vnr0Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            a0e1 a0e1Var = vnr0Var.e;
            int i4 = a0e1Var != null ? a0e1Var.a : 3;
            vnr0Var2 = vnr0Var;
            iu30Var2 = iu30Var;
            qgo1.f(vnr0Var2, u291.f(nim0.a, 1.0f), new a0e1(i4), 0, false, iu30Var2, x340Var, (i3 & 14) | 8 | ((i3 << 12) & 458752), 24);
        } else {
            vnr0Var2 = vnr0Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(vnr0Var2, iu30Var2, i2, (byte) 13);
        }
    }

    public static final void o(c380 c380Var, String str, boolean z, boolean z2, iu30 iu30Var, zeu zeuVar, ngs0 ngs0Var, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1941064932);
        int i3 = i2 | (b0kVar2.g(c380Var) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.h(z) ? 256 : 128) | (b0kVar2.h(z2) ? 2048 : 1024) | (b0kVar2.i(iu30Var) ? 16384 : 8192) | (b0kVar2.g(zeuVar) ? 131072 : 65536) | (b0kVar2.g(ngs0Var) ? 1048576 : 524288) | 12582912;
        if (b0kVar2.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarT = l6o1.t(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, b0kVar2), 14);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarD = sgc1.D(1, uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarT), 0.0f, 0.0f, 0.0f, cbx.b(b0kVar2).b.a, 7));
            jw31 jw31VarA = ew31.a(d36Var, een.Z, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            int i4 = i3 >> 3;
            int i5 = i3 >> 6;
            i(str, z, iu30Var, zeuVar, u291.c(qim0Var3, 1.0f), b0kVar2, (i4 & 14) | 24576 | (i4 & 112) | (i5 & 896) | (i5 & 7168));
            b0kVar2 = b0kVar2;
            p(z2, c380Var, ngs0Var, iu30Var, b0kVar2, ((i3 >> 9) & 14) | ((i3 << 3) & 112) | ((i3 >> 12) & 896) | (i4 & 7168));
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m8m(c380Var, str, z, z2, iu30Var, zeuVar, ngs0Var, qim0Var2, i2);
        }
    }

    public static final void p(boolean z, c380 c380Var, ngs0 ngs0Var, iu30 iu30Var, b0k b0kVar, int i2) {
        c380 c380Var2;
        iu30 iu30Var2;
        x340 x340Var;
        h311 h311VarV;
        aou aouVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(54672664);
        int i3 = (i2 & 6) == 0 ? (x340Var2.h(z) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            c380Var2 = c380Var;
            i3 |= x340Var2.g(c380Var2) ? 32 : 16;
        } else {
            c380Var2 = c380Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.g(ngs0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        int i4 = i3;
        if (x340Var2.Y(i4 & 1, (i4 & 1171) != 1170)) {
            if (z) {
                iu30Var2 = iu30Var;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
                if (c380Var.isEmpty()) {
                    x340Var = x340Var2;
                    x340Var.i0(-668311439);
                    for (int i5 = 0; i5 < 3; i5++) {
                        m(null, x340Var, 0);
                    }
                    x340Var.r(false);
                } else {
                    x340Var2.i0(-668788963);
                    int i6 = 0;
                    for (Object obj : c380Var) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            p7h.T();
                            throw null;
                        }
                        String str = (String) obj;
                        boolean z2 = (i4 & 7168) == 2048;
                        Object objT = x340Var2.T();
                        if (z2 || objT == fkj0.X) {
                            objT = new hws(iu30Var2, (byte) 13);
                            x340Var2.s0(objT);
                        }
                        x340 x340Var3 = x340Var2;
                        otw.c(ngs0Var, new mtc1(str, i6, (iu30) objT), u291.c(nim0Var, 1.0f), (ipb1) null, x340Var3, ((i4 >> 6) & 14) | 384, 8);
                        x340Var2 = x340Var3;
                        i6 = i7;
                    }
                    x340Var = x340Var2;
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                h311VarV = x340Var2.v();
                if (h311VarV == null) {
                    return;
                } else {
                    aouVar = new aou(z, c380Var2, ngs0Var, iu30Var, i2, (byte) 0);
                }
            }
            h311VarV.d = aouVar;
        }
        iu30Var2 = iu30Var;
        x340Var = x340Var2;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            aouVar = new aou(z, c380Var, ngs0Var, iu30Var2, i2, (byte) 1);
            h311VarV.d = aouVar;
        }
    }

    public static final void q(y7e1 y7e1Var, String str, boolean z, iu30 iu30Var, zeu zeuVar, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var;
        qim0 qim0Var2;
        jax haxVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-806660917);
        int i3 = i2 | (x340Var2.g(y7e1Var) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | (x340Var2.g(zeuVar) ? 16384 : 8192) | 196608;
        if (x340Var2.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object objT = x340Var2.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = pzm.i(x340Var2);
            }
            lz20 lz20Var = (lz20) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = (i3 & 896) == 256;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == obj) {
                objT2 = new iwd(z, lz20Var, (lnm) null, (byte) 1);
                x340Var2.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            long jK = f5p1.k(x340Var2, 2131104086);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            cua cuaVar2 = cbx.b(x340Var2).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, jK, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12));
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarF2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarP);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            kua0 kua0Var = new kua0(3, Boolean.TRUE, 0, 0, 124);
            if (z) {
                x340Var2.i0(242665703);
                x340Var2.r(false);
                haxVar = jax.a;
            } else {
                x340Var2.i0(242715210);
                haxVar = new hax(cwl1.o0(x340Var2, 2131956737));
                x340Var2.r(false);
            }
            long j2 = cbx.a(x340Var2).b.a;
            jax jaxVar = haxVar;
            long j3 = cbx.a(x340Var2).b.b;
            long j4 = cbx.a(x340Var2).b.b;
            long j5 = cbx.a(x340Var2).b.d;
            long j6 = u7h.j;
            zxx zxxVar = new zxx(j2, j3, j4, j5, j6, j6, cbx.a(x340Var2).b.c, 0L, 896);
            qim0 qim0VarP2 = vby0.p(qim0Var3, lz20Var);
            boolean z3 = (i3 & 57344) == 16384;
            Object objT3 = x340Var2.T();
            if (z3 || objT3 == obj) {
                objT3 = new nit(zeuVar, (byte) 13);
                x340Var2.s0(objT3);
            }
            rwo1.b(y7e1Var, cev0.G(qim0VarP2, (iu30) objT3), jaxVar, str, (vu30) null, apo.r(-954711322, new bk0(y7e1Var, z, zeuVar, iu30Var), x340Var2), false, false, (dk80) null, (lee1) null, kua0Var, (yta0) null, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, zxxVar, x340Var2, (i3 & 14) | 196608 | ((i3 << 6) & 7168), 390, 1043408);
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
            h311VarV.d = new wr1(y7e1Var, str, z, iu30Var, zeuVar, qim0Var2, i2, (byte) 7);
        }
    }

    public static final void r(int i2, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1895248362);
        int i3 = (x340Var.g(str) ? 4 : 2) | i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).c;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            uwo1.e(str, uyn1.x(qim0Var3, 16.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 14, 0, 2040);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i2, (byte) 21);
        }
    }

    public static final void s(vnr0 vnr0Var, b0k b0kVar, int i2) {
        vnr0 vnr0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1096705206);
        int i3 = (x340Var.i(vnr0Var) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            a0e1 a0e1Var = vnr0Var.e;
            int i4 = a0e1Var != null ? a0e1Var.a : 3;
            vnr0Var2 = vnr0Var;
            qgo1.f(vnr0Var2, u291.f(nim0.a, 1.0f), new a0e1(i4), 0, false, (iu30) null, x340Var, 8 | (i3 & 14), 56);
        } else {
            vnr0Var2 = vnr0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vka(vnr0Var2, i2);
        }
    }

    public static final void t(i63 i63Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        iu30 iu30Var2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-933285864);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = i2 | (x340Var.g(i63Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new wel1(iu30Var, (byte) 7);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(u291.h(i1p1.q(bin.v(qim0Var3, idn0Var, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28), er31.b(8.0f)), 142.0f), 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.d, d4o1.a);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarK = xcg1.k(cbx.a, u291.r(qim0Var3, 142.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarK);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            Uri uri = Uri.parse(i63Var.c);
            qim0 qim0VarR = u291.r(qim0Var3, 142.0f);
            akx akxVar = akx.c;
            eso1.e(uri, isl.a, qim0VarR, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(akxVar, akxVar), false, false, x340Var, 1073766448, 0, 3560);
            x340Var.r(true);
            qim0 qim0VarY = uyn1.y(u291.d(qim0Var3, 1.0f), 16.0f, 12.0f);
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            uwo1.e(i63Var.a, (qim0) null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1778);
            String str = i63Var.b;
            if (str == null) {
                str = "";
            }
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1778);
            kk0.s(1.0f, true, x340Var);
            qim0 qim0VarN = anm1.N("play_button", new tq60(een.R0));
            boolean z3 = i63Var.f;
            boolean z4 = i63Var.e;
            boolean z5 = i5 == 32;
            Object objT3 = x340Var.T();
            if (z5 || objT3 == m4cVar) {
                iu30Var2 = iu30Var;
                objT3 = new wel1(iu30Var2, (byte) 8);
                x340Var.s0(objT3);
            } else {
                iu30Var2 = iu30Var;
            }
            czo1.d(z3, z4, (Function0) objT3, qim0VarN, x340Var, 0, 0);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(i63Var, iu30Var2, qim0Var2, i2, (byte) 16);
        }
    }

    public static final void u(b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1266509444);
        if (x340Var.Y(i2 & 1, i2 != 0)) {
            qim0 qim0VarF = u291.f(u291.h(nim0.a, 142.0f), 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarF, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c1j1(i2, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object v(pob0 pob0Var, int i2, lbh lbhVar, ar41 ar41Var, onm onmVar) {
        i1c i1cVar;
        float fO;
        float fO2;
        float f2;
        int i3;
        float f3;
        pob0 pob0Var2;
        float f4;
        Object objS;
        pob0 pob0Var3 = pob0Var;
        int i4 = i2;
        if (onmVar instanceof i1c) {
            i1cVar = (i1c) onmVar;
            int i5 = i1cVar.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                i1cVar.f = i5 - Integer.MIN_VALUE;
            } else {
                i1cVar = new i1c(onmVar);
            }
        } else {
            i1cVar = new i1c(onmVar);
        }
        Object obj = i1cVar.e;
        int i6 = i1cVar.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i6 != 0) {
            if (i6 == 1) {
                float f5 = i1cVar.d;
                float f6 = i1cVar.c;
                int i7 = i1cVar.b;
                pob0 pob0Var4 = i1cVar.a;
                hm5.M(obj);
                f2 = f5;
                pob0Var3 = pob0Var4;
                fO2 = f6;
                i4 = i7;
            } else {
                if (i6 != 2) {
                    if (i6 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f4 = i1cVar.d;
                f3 = i1cVar.c;
                i3 = i1cVar.b;
                pob0Var2 = i1cVar.a;
                hm5.M(obj);
            }
            i1cVar.a = null;
            i1cVar.b = i3;
            i1cVar.c = f3;
            i1cVar.d = f4;
            i1cVar.f = 3;
            objS = smo1.s(new wnn(pob0Var2, f3, ((Number) pob0Var2.h.e()).floatValue(), null), i1cVar);
            if (objS != d9nVar) {
                objS = rih1Var;
            }
            if (objS != d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        hm5.M(obj);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (((n511) lbhVar.c.get(i4)).f() >> 32));
        float f7 = ar41Var.c;
        float f8 = fIntBitsToFloat - f7;
        float f9 = ar41Var.a;
        float f10 = ar41Var.f;
        float f11 = f9 + f10;
        float f12 = ar41Var.b;
        if (f8 > f12 - f10 || f11 > f8) {
            if (f8 < f11) {
                float f13 = ar41Var.d;
                float f14 = (f10 + f7) - f13;
                if (f14 == 0.0f) {
                    fO = yoi1.o(f8, f9, f12);
                } else {
                    f8 = (((f7 - f13) * f9) + ((fIntBitsToFloat * f10) - (f10 * f13))) / f14;
                }
            } else {
                float f15 = ar41Var.e;
                float f16 = (f10 + f15) - f7;
                if (f16 == 0.0f) {
                    fO = yoi1.o(f8, f9, f12);
                } else {
                    float f17 = f15 - f7;
                    fO = ((f17 * f12) + (((fIntBitsToFloat * f10) - (f7 * f10)) - (f10 * f17))) / f16;
                }
            }
            f8 = fO;
        }
        fO2 = yoi1.o(f8, f9, f12);
        f2 = pob0Var3.c().a;
        i1cVar.a = pob0Var3;
        i1cVar.b = i4;
        i1cVar.c = fO2;
        i1cVar.d = f2;
        i1cVar.f = 1;
        if (pob0Var3.g(i4, lbhVar, i1cVar) != d9nVar) {
        }
        return d9nVar;
        i1cVar.a = pob0Var3;
        i1cVar.b = i4;
        i1cVar.c = fO2;
        i1cVar.d = f2;
        i1cVar.f = 2;
        if (pob0Var3.f(f2, ((Number) pob0Var3.h.e()).floatValue(), i1cVar) != d9nVar) {
            i3 = i4;
            f3 = fO2;
            pob0Var2 = pob0Var3;
            f4 = f2;
            i1cVar.a = null;
            i1cVar.b = i3;
            i1cVar.c = f3;
            i1cVar.d = f4;
            i1cVar.f = 3;
            objS = smo1.s(new wnn(pob0Var2, f3, ((Number) pob0Var2.h.e()).floatValue(), null), i1cVar);
            if (objS != d9nVar) {
                objS = rih1Var;
            }
            if (objS != d9nVar) {
                return rih1Var;
            }
        }
        return d9nVar;
    }

    public static final float x(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        wat watVar = (wat) x340Var.k(t4k.h);
        uwr uwrVar = cbx.a;
        long j2 = cbx.d(x340Var).k.a.b;
        long j3 = cbx.d(x340Var).m.a.b;
        float fU0 = watVar.U0() * TextUnit.c(j2) * 1.4f;
        float fU1 = watVar.U0() * TextUnit.c(j3) * 1.4f;
        cvx cvxVar = cbx.b(x340Var).b;
        return (fU1 * 2.0f) + fU0 + 2.0f + 86.0f;
    }

    public static ArrayList y(Map map) {
        String str = (String) map.get("multiUserAttributionDisplayNames");
        int i2 = 0;
        List listQ0 = z6x.a;
        List listQ1 = str != null ? ihc1.Q0(str, new String[]{","}, 0, 6) : listQ0;
        String str2 = (String) map.get("multiUserAttributionImages");
        List listQ2 = str2 != null ? ihc1.Q0(str2, new String[]{","}, 0, 6) : listQ0;
        String str3 = (String) map.get("multiUserAttributionUsernames");
        if (str3 != null) {
            listQ0 = ihc1.Q0(str3, new String[]{","}, 0, 6);
        }
        List list = listQ1;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            String str4 = (String) obj;
            String str5 = (String) o7h.t0(i2, listQ0);
            if (str5 == null) {
                str5 = str4;
            }
            arrayList.add(new rjf1(str5, str4, (String) o7h.t0(i2, listQ2), null));
            i2 = i3;
        }
        return arrayList;
    }

    public static List z(Map map, nfa0 nfa0Var) {
        String str = (String) map.get("multiUserAttributionMetadata");
        z6x z6xVar = z6x.a;
        if (str == null) {
            return z6xVar;
        }
        try {
            List<b6b> list = ((i2b) nfa0Var.a(str, i2b.Companion.serializer())).a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (b6b b6bVar : list) {
                arrayList.add(new rjf1(b6bVar.a, b6bVar.b, b6bVar.c, b6bVar.d));
            }
            return arrayList;
        } catch (SerializationException e2) {
            n57.g("Failed to parse json string: multiUserAttributionMetadata", e2);
            return z6xVar;
        }
    }

    public abstract int w(q5t0 q5t0Var);
}
