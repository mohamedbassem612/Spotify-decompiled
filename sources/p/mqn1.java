package p;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mqn1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];
    public static b180 e;

    /* JADX WARN: Code duplicated, block: B:473:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static poj0 A(int i, byte[] bArr, int i2) {
        int[] iArr;
        bnj0 bnj0Var;
        int iP;
        int iP2;
        int iP3;
        int i3;
        bg11 bg11Var;
        boolean[][] zArr;
        int i4;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i5;
        boolean zO;
        int i6;
        int i7;
        int i8;
        boolean zO2;
        boolean zO3;
        int iQ;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        k4w k4wVar = new k4w(bArr, i, i2);
        w(k4wVar);
        k4wVar.A(4);
        boolean zO4 = k4wVar.o();
        boolean zO5 = k4wVar.o();
        int iP4 = k4wVar.p(6);
        int i12 = iP4 + 1;
        int iP5 = k4wVar.p(3);
        k4wVar.A(17);
        uin0 uin0VarX = x(k4wVar, true, iP5, null);
        for (int i13 = k4wVar.o() ? 0 : iP5; i13 <= iP5; i13++) {
            k4wVar.q();
            k4wVar.q();
            k4wVar.q();
        }
        int iP6 = k4wVar.p(6);
        int iQ2 = k4wVar.q() + 1;
        int i14 = 6;
        rok0 rok0Var = new rok0(b380.t(uin0VarX), new int[1]);
        boolean z3 = i12 >= 2 && iQ2 >= 2;
        boolean z4 = zO4 && zO5;
        int i15 = iP6 + 1;
        boolean z5 = i15 >= i12;
        if (!z3 || !z4 || !z5) {
            return new poj0((bg11) null, rok0Var, (drj0) null, (bnj0) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iQ2, i15);
        int i16 = 1;
        int[] iArr5 = new int[iQ2];
        int[] iArr6 = new int[iQ2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i17 = 1; i17 < iQ2; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 <= iP6; i19++) {
                if (k4wVar.o()) {
                    iArr4[i17][i18] = i19;
                    iArr6[i17] = i19;
                    i18++;
                }
                iArr5[i17] = i18;
            }
        }
        if (k4wVar.o()) {
            k4wVar.A(64);
            if (k4wVar.o()) {
                k4wVar.q();
            }
            int iQ3 = k4wVar.q();
            int i20 = 0;
            while (i20 < iQ3) {
                k4wVar.q();
                if (i20 == 0 || k4wVar.o()) {
                    boolean zO6 = k4wVar.o();
                    boolean zO7 = k4wVar.o();
                    z2 = zO6;
                    z = zO7;
                    if (zO6 || zO7) {
                        zO = k4wVar.o();
                        if (zO) {
                            k4wVar.A(19);
                        }
                        k4wVar.A(8);
                        if (zO) {
                            k4wVar.A(4);
                        }
                        k4wVar.A(15);
                        i7 = zO6;
                        i6 = zO7;
                    }
                    i8 = 0;
                    while (i8 <= iP5) {
                        zO2 = k4wVar.o();
                        if (!zO2) {
                            zO2 = k4wVar.o();
                        }
                        if (zO2) {
                            k4wVar.q();
                            zO3 = false;
                        } else {
                            zO3 = k4wVar.o();
                        }
                        if (zO3) {
                            iQ = 0;
                        } else {
                            iQ = k4wVar.q();
                        }
                        int[][] iArr7 = iArr4;
                        i9 = i7 + i6;
                        int[] iArr8 = iArr6;
                        i10 = 0;
                        while (i10 < i9) {
                            int i21 = i9;
                            for (i11 = 0; i11 <= iQ; i11++) {
                                k4wVar.q();
                                k4wVar.q();
                                if (zO) {
                                    k4wVar.q();
                                    k4wVar.q();
                                }
                                k4wVar.z();
                            }
                            i10++;
                            i9 = i21;
                        }
                        i8++;
                        i20 = i20;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i20++;
                } else {
                    z2 = false;
                    z = false;
                }
                zO = false;
                i7 = z2;
                i6 = z;
                i8 = 0;
                while (i8 <= iP5) {
                    zO2 = k4wVar.o();
                    if (!zO2) {
                        zO2 = k4wVar.o();
                    }
                    if (zO2) {
                        k4wVar.q();
                        zO3 = false;
                    } else {
                        zO3 = k4wVar.o();
                    }
                    if (zO3) {
                        iQ = k4wVar.q();
                    } else {
                        iQ = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i9 = i7 + i6;
                    int[] iArr10 = iArr6;
                    i10 = 0;
                    while (i10 < i9) {
                        int i22 = i9;
                        while (i11 <= iQ) {
                            k4wVar.q();
                            k4wVar.q();
                            if (zO) {
                                k4wVar.q();
                                k4wVar.q();
                            }
                            k4wVar.z();
                        }
                        i10++;
                        i9 = i22;
                    }
                    i8++;
                    i20 = i20;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i20++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!k4wVar.o()) {
            return new poj0((bg11) null, rok0Var, (drj0) null, (bnj0) null);
        }
        int i23 = k4wVar.e;
        if (i23 > 0) {
            k4wVar.A(8 - i23);
        }
        uin0 uin0VarX2 = x(k4wVar, false, iP5, uin0VarX);
        boolean zO8 = k4wVar.o();
        boolean[] zArr3 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean zO9 = k4wVar.o();
            zArr3[i25] = zO9;
            if (zO9) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr3[1]) {
            return new poj0((bg11) null, rok0Var, (drj0) null, (bnj0) null);
        }
        int[] iArr13 = new int[i24];
        for (int i26 = 0; i26 < i24 - (zO8 ? 1 : 0); i26++) {
            iArr13[i26] = k4wVar.p(3);
        }
        int[] iArr14 = new int[i24 + 1];
        if (zO8) {
            int i27 = 1;
            while (i27 < i24) {
                int[] iArr15 = iArr14;
                for (int i28 = 0; i28 < i27; i28++) {
                    iArr15[i27] = iArr13[i28] + 1 + iArr15[i27];
                }
                i27++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i24] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i12, i24);
        int[] iArr17 = new int[i12];
        iArr17[0] = 0;
        boolean zO10 = k4wVar.o();
        int i29 = 1;
        while (i29 < i12) {
            if (zO10) {
                i5 = i29;
                iArr17[i5] = k4wVar.p(i14);
            } else {
                i5 = i29;
                iArr17[i5] = i5;
            }
            if (zO8) {
                int i30 = 0;
                while (i30 < i24) {
                    int i31 = i30 + 1;
                    iArr16[i5][i30] = (iArr17[i5] & ((1 << iArr[i31]) - 1)) >> iArr[i30];
                    i30 = i31;
                }
            } else {
                int i32 = 0;
                while (i32 < i24) {
                    int i33 = i32;
                    iArr16[i5][i33] = k4wVar.p(iArr13[i32] + 1);
                    i32 = i33 + 1;
                }
            }
            i29 = i5 + 1;
            i14 = 6;
        }
        int[] iArr18 = new int[i15];
        int i34 = 1;
        int i35 = 0;
        while (i35 < i12) {
            iArr18[iArr17[i35]] = -1;
            int[] iArr19 = iArr18;
            int i36 = 0;
            int i37 = 0;
            while (i36 < 16) {
                if (zArr3[i36]) {
                    if (i36 == i16) {
                        iArr19[iArr17[i35]] = iArr16[i35][i37];
                    }
                    i37++;
                }
                i36++;
                i16 = 1;
            }
            if (i35 > 0) {
                int i38 = 0;
                while (true) {
                    if (i38 >= i35) {
                        i34++;
                        break;
                    }
                    int i39 = i38;
                    if (iArr19[iArr17[i35]] == iArr19[iArr17[i38]]) {
                        break;
                    }
                    i38 = i39 + 1;
                }
            }
            i35++;
            iArr18 = iArr19;
            i16 = 1;
        }
        int[] iArr20 = iArr18;
        int iP7 = k4wVar.p(4);
        if (i34 < 2 || iP7 == 0) {
            return new poj0((bg11) null, rok0Var, (drj0) null, (bnj0) null);
        }
        int[] iArr21 = new int[i34];
        for (int i40 = 0; i40 < i34; i40++) {
            iArr21[i40] = k4wVar.p(iP7);
        }
        int[] iArr22 = new int[i15];
        for (int i41 = 0; i41 < i12; i41++) {
            iArr22[Math.min(iArr17[i41], iP6)] = i41;
        }
        v280 v280VarM = b380.m();
        int i42 = 0;
        while (i42 <= iP6) {
            int[] iArr23 = iArr22;
            int i43 = i34;
            int iMin = Math.min(iArr20[i42], i43 - 1);
            v280VarM.c(new tin0(iArr23[i42], iMin >= 0 ? iArr21[iMin] : -1));
            i42++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i34 = i43;
        }
        int[] iArr24 = iArr17;
        bg11 bg11VarG = v280VarM.g();
        if (((tin0) bg11VarG.get(0)).b == -1) {
            return new poj0((bg11) null, rok0Var, (drj0) null, (bnj0) null);
        }
        int i44 = 1;
        while (true) {
            if (i44 > iP6) {
                i44 = -1;
                break;
            }
            if (((tin0) bg11VarG.get(i44)).b != -1) {
                break;
            }
            i44++;
        }
        if (i44 == -1) {
            return new poj0((bg11) null, rok0Var, (drj0) null, (bnj0) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        for (int i45 = 1; i45 < i12; i45++) {
            for (int i46 = 0; i46 < i45; i46++) {
                boolean[] zArr6 = zArr4[i45];
                boolean[] zArr7 = zArr5[i45];
                boolean zO11 = k4wVar.o();
                zArr7[i46] = zO11;
                zArr6[i46] = zO11;
            }
        }
        for (int i47 = 1; i47 < i12; i47++) {
            int i48 = 0;
            while (i48 < iP4) {
                boolean[][] zArr8 = zArr4;
                for (int i49 = 0; i49 < i47; i49++) {
                    boolean[] zArr9 = zArr5[i47];
                    if (zArr9[i49] && zArr5[i49][i48]) {
                        zArr9[i48] = true;
                        break;
                    }
                }
                i48++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i15];
        for (int i50 = 0; i50 < i12; i50++) {
            int i51 = 0;
            for (int i52 = 0; i52 < i50; i52++) {
                i51 += zArr10[i50][i52] ? 1 : 0;
            }
            iArr25[iArr24[i50]] = i51;
        }
        int i53 = 0;
        for (int i54 = 0; i54 < i12; i54++) {
            if (iArr25[iArr24[i54]] == 0) {
                i53++;
            }
        }
        if (i53 > 1) {
            return new poj0((bg11) null, rok0Var, (drj0) null, (bnj0) null);
        }
        int[] iArr26 = new int[i12];
        int[] iArr27 = new int[iQ2];
        if (k4wVar.o()) {
            int i55 = 0;
            while (i55 < i12) {
                int i56 = i55;
                iArr26[i56] = k4wVar.p(3);
                i55 = i56 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i12, iP5);
        }
        int i57 = 0;
        while (i57 < iQ2) {
            int i58 = i57;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i59 = 0; i59 < iArr5[i58]; i59++) {
                iMax = Math.max(iMax, iArr28[((tin0) bg11VarG.get(iArr11[i58][i59])).a]);
            }
            iArr27[i58] = iMax + 1;
            i57 = i58 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (k4wVar.o()) {
            int i60 = 0;
            while (i60 < iP4) {
                int i61 = i60 + 1;
                int i62 = i61;
                while (i62 < i12) {
                    if (zArr10[i62][i60]) {
                        k4wVar.A(3);
                    }
                    i62++;
                    iP4 = iP4;
                }
                i60 = i61;
            }
        }
        k4wVar.z();
        int iQ4 = k4wVar.q() + 1;
        v280 v280VarM2 = b380.m();
        v280VarM2.c(uin0VarX);
        if (iQ4 > 1) {
            v280VarM2.c(uin0VarX2);
            for (int i63 = 2; i63 < iQ4; i63++) {
                uin0VarX2 = x(k4wVar, k4wVar.o(), iP5, uin0VarX2);
                v280VarM2.c(uin0VarX2);
            }
        }
        bg11 bg11VarG2 = v280VarM2.g();
        int iQ5 = k4wVar.q() + iQ2;
        if (iQ5 > iQ2) {
            return new poj0((bg11) null, rok0Var, (drj0) null, (bnj0) null);
        }
        int iP8 = k4wVar.p(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iQ5, i15);
        int[] iArr29 = new int[iQ5];
        int i64 = 0;
        int[] iArr30 = new int[iQ5];
        int i65 = 0;
        while (i65 < iQ2) {
            iArr29[i65] = i64;
            iArr30[i65] = iArr12[i65];
            if (iP8 == 0) {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i4], i64, iArr5[i4], true);
                iArr2[i4] = iArr5[i4];
            } else {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iP8 == 1) {
                    int i66 = iArr12[i4];
                    for (int i67 = 0; i67 < iArr5[i4]; i67++) {
                        zArr2[i4][i67] = iArr11[i4][i67] == i66;
                    }
                    iArr2[i4] = 1;
                } else {
                    i64 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i65 = i4 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i64 = 0;
            i65 = i4 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i15];
        int i68 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i15;
        iArr34[i64] = iQ5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i69 = 1;
        int i70 = 0;
        while (i69 < iQ5) {
            if (iP8 == i68) {
                for (int i71 = 0; i71 < iArr5[i69]; i71++) {
                    zArr14[i69][i71] = k4wVar.o();
                    int i72 = iArr31[i69];
                    boolean z6 = zArr14[i69][i71];
                    iArr31[i69] = i72 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr30[i69] = iArr11[i69][i71];
                    }
                }
            }
            if (i70 == 0) {
                i3 = 0;
                if (iArr11[i69][0] == 0 && zArr14[i69][0]) {
                    for (int i73 = 1; i73 < iArr5[i69]; i73++) {
                        if (iArr11[i69][i73] == i44 && zArr14[i69][i44]) {
                            i70 = i69;
                        }
                    }
                }
            } else {
                i3 = 0;
            }
            int i74 = i3;
            while (i74 < iArr5[i69]) {
                if (iQ4 > 1) {
                    zArr15[i69][i74] = zArr14[i69][i74];
                    bg11Var = bg11VarG2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = bru.c(iQ4);
                    if (!zArr[i69][i74]) {
                        int i75 = ((tin0) bg11VarG.get(iArr11[i69][i74])).a;
                        int i76 = i3;
                        while (i76 < i74) {
                            int i77 = i76;
                            if (zArr12[i75][((tin0) bg11VarG.get(iArr11[i69][i77])).a]) {
                                zArr[i69][i74] = true;
                                break;
                            }
                            i76 = i77 + 1;
                        }
                    }
                    if (zArr[i69][i74]) {
                        if (i70 <= 0 || i69 != i70) {
                            k4wVar.A(iC);
                        } else {
                            iArr33[i74] = k4wVar.p(iC);
                        }
                    }
                } else {
                    bg11Var = bg11VarG2;
                    zArr = zArr15;
                }
                i74++;
                bg11VarG2 = bg11Var;
                zArr15 = zArr;
            }
            bg11 bg11Var2 = bg11VarG2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i69] == 1 && iArr25[iArr30[i69]] > 0) {
                k4wVar.z();
            }
            i69++;
            bg11VarG2 = bg11Var2;
            zArr15 = zArr16;
            i68 = 2;
        }
        bg11 bg11Var3 = bg11VarG2;
        boolean[][] zArr17 = zArr15;
        if (i70 == 0) {
            return new poj0((bg11) null, rok0Var, (drj0) null, (bnj0) null);
        }
        int iQ6 = k4wVar.q();
        int i78 = iQ6 + 1;
        v280 v280VarN = b380.n(i78);
        int[] iArr35 = new int[i12];
        for (int i79 = 0; i79 < i78; i79++) {
            int iP9 = k4wVar.p(16);
            int iP10 = k4wVar.p(16);
            if (k4wVar.o()) {
                iP = k4wVar.p(2);
                if (iP == 3) {
                    k4wVar.z();
                }
                iP2 = k4wVar.p(4);
                iP3 = k4wVar.p(4);
            } else {
                iP = 0;
                iP2 = 0;
                iP3 = 0;
            }
            if (k4wVar.o()) {
                int iQ7 = k4wVar.q();
                int iQ8 = k4wVar.q();
                int iQ9 = k4wVar.q();
                int iQ10 = k4wVar.q();
                iP9 -= (iQ7 + iQ8) * ((iP == 1 || iP == 2) ? 2 : 1);
                iP10 -= (iQ9 + iQ10) * (iP == 1 ? 2 : 1);
            }
            v280VarN.c(new vin0(iP, iP2, iP3, iP9, iP10));
        }
        if (i78 <= 1 || !k4wVar.o()) {
            for (int i80 = 1; i80 < i12; i80++) {
                iArr35[i80] = Math.min(i80, iQ6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = bru.c(i78);
            for (int i81 = 1; i81 < i12; i81++) {
                iArr35[i81] = k4wVar.p(iC2);
            }
        }
        drj0 drj0Var = new drj0(v280VarN.g(), iArr35);
        k4wVar.A(2);
        for (int i82 = 1; i82 < i12; i82++) {
            if (iArr25[iArr24[i82]] == 0) {
                k4wVar.z();
            }
        }
        for (int i83 = 1; i83 < iQ5; i83++) {
            boolean zO12 = k4wVar.o();
            int i84 = 0;
            while (i84 < iArr32[i83]) {
                if ((i84 <= 0 || !zO12) ? i84 == 0 : k4wVar.o()) {
                    for (int i85 = 0; i85 < iArr5[i83]; i85++) {
                        if (zArr17[i83][i85]) {
                            k4wVar.q();
                        }
                    }
                    k4wVar.q();
                    k4wVar.q();
                }
                i84++;
            }
        }
        int iQ11 = k4wVar.q() + 2;
        if (k4wVar.o()) {
            k4wVar.A(iQ11);
        } else {
            for (int i86 = 1; i86 < i12; i86++) {
                for (int i87 = 0; i87 < i86; i87++) {
                    if (zArr10[i86][i87]) {
                        k4wVar.A(iQ11);
                    }
                }
            }
        }
        int iQ12 = k4wVar.q();
        for (int i88 = 1; i88 <= iQ12; i88++) {
            k4wVar.A(8);
        }
        if (k4wVar.o()) {
            int i89 = k4wVar.e;
            if (i89 > 0) {
                k4wVar.A(8 - i89);
            }
            if (!k4wVar.o() ? k4wVar.o() : true) {
                k4wVar.z();
            }
            boolean zO13 = k4wVar.o();
            boolean zO14 = k4wVar.o();
            if (zO13 || zO14) {
                for (int i90 = 0; i90 < iQ2; i90++) {
                    for (int i91 = 0; i91 < iArr32[i90]; i91++) {
                        boolean zO15 = zO13 ? k4wVar.o() : false;
                        boolean zO16 = zO14 ? k4wVar.o() : false;
                        if (zO15) {
                            k4wVar.A(32);
                        }
                        if (zO16) {
                            k4wVar.A(18);
                        }
                    }
                }
            }
            boolean zO17 = k4wVar.o();
            int iP11 = zO17 ? k4wVar.p(4) + 1 : i12;
            v280 v280VarN2 = b380.n(iP11);
            int[] iArr36 = new int[i12];
            for (int i92 = 0; i92 < iP11; i92++) {
                k4wVar.A(3);
                int i93 = k4wVar.o() ? 1 : 2;
                int i94 = x8h.i(k4wVar.p(8));
                int iJ = x8h.j(k4wVar.p(8));
                k4wVar.A(8);
                v280VarN2.c(new xin0(i94, i93, iJ));
            }
            if (zO17 && iP11 > 1) {
                for (int i95 = 0; i95 < i12; i95++) {
                    iArr36[i95] = k4wVar.p(4);
                }
            }
            bnj0Var = new bnj0(v280VarN2.g(), iArr36);
        } else {
            bnj0Var = null;
        }
        return new poj0(bg11VarG, new rok0(bg11Var3, iArr33), drj0Var, bnj0Var);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01af  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:121:0x0208  */
    /* JADX WARN: Code duplicated, block: B:124:0x0216  */
    /* JADX WARN: Code duplicated, block: B:127:0x0221  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0231  */
    /* JADX WARN: Code duplicated, block: B:136:0x023d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0263  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static zin0 B(int i, byte[] bArr, int i2) {
        int iQ;
        int iQ2;
        int i3;
        boolean z;
        int i4;
        int iQ3;
        boolean z2;
        boolean zO;
        int i5;
        int i6;
        int i7;
        int iQ4;
        int i8;
        float f;
        int i9;
        int i10;
        int i11;
        float f2;
        int i12;
        int i13;
        int i14;
        boolean zO2;
        boolean zO3;
        int iP;
        int iP2;
        int iP3;
        int i15;
        int i16;
        k4w k4wVar = new k4w(bArr, i + 1, i2);
        int iP4 = k4wVar.p(8);
        int iP5 = k4wVar.p(8);
        int iP6 = k4wVar.p(8);
        int iQ5 = k4wVar.q();
        if (iP4 == 100 || iP4 == 110 || iP4 == 122 || iP4 == 244 || iP4 == 44 || iP4 == 83 || iP4 == 86 || iP4 == 118 || iP4 == 128 || iP4 == 138) {
            iQ = k4wVar.q();
            boolean zO4 = iQ == 3 ? k4wVar.o() : false;
            int iQ6 = k4wVar.q();
            iQ2 = k4wVar.q();
            k4wVar.z();
            if (k4wVar.o()) {
                int i17 = iQ != 3 ? 8 : 12;
                i3 = 16;
                int i18 = 0;
                while (i18 < i17) {
                    if (k4wVar.o()) {
                        int i19 = i18 < 6 ? 16 : 64;
                        int iR = 8;
                        int i20 = 8;
                        for (int i21 = 0; i21 < i19; i21++) {
                            if (iR != 0) {
                                iR = ((k4wVar.r() + i20) + SemanticState.Hidden) % SemanticState.Hidden;
                            }
                            if (iR != 0) {
                                i20 = iR;
                            }
                        }
                    }
                    i18++;
                }
            } else {
                i3 = 16;
            }
            z = zO4;
            i4 = iQ6;
        } else {
            iQ = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            iQ2 = 0;
        }
        int iQ7 = k4wVar.q() + 4;
        int iQ8 = k4wVar.q();
        if (iQ8 != 0) {
            if (iQ8 == 1) {
                boolean zO5 = k4wVar.o();
                k4wVar.r();
                k4wVar.r();
                iP4 = iP4;
                long jQ = k4wVar.q();
                iQ8 = iQ8;
                for (int i22 = 0; i22 < jQ; i22++) {
                    k4wVar.q();
                }
                iQ2 = iQ2;
                z2 = zO5;
                iQ3 = 0;
            } else {
                iQ3 = 0;
            }
            k4wVar.q();
            k4wVar.z();
            int iQ9 = k4wVar.q() + 1;
            int iQ10 = k4wVar.q() + 1;
            zO = k4wVar.o();
            i5 = 2 - (zO ? 1 : 0);
            int i23 = iQ10 * i5;
            if (!zO) {
                k4wVar.z();
            }
            k4wVar.z();
            i6 = iQ9 * 16;
            i7 = i23 * 16;
            if (k4wVar.o()) {
                int iQ11 = k4wVar.q();
                int iQ12 = k4wVar.q();
                int iQ13 = k4wVar.q();
                int iQ14 = k4wVar.q();
                if (iQ == 0) {
                    i15 = 1;
                } else {
                    if (iQ == 3) {
                        i15 = 1;
                    } else {
                        i15 = 2;
                    }
                    if (iQ == 1) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    i5 *= i16;
                }
                i6 -= (iQ11 + iQ12) * i15;
                i7 -= (iQ13 + iQ14) * i5;
            }
            int i24 = i7;
            int i25 = i6;
            int i26 = iP4;
            iQ4 = ((i26 != 44 || i26 == 86 || i26 == 100 || i26 == 110 || i26 == 122 || i26 == 244) && (iP5 & 16) != 0) ? 0 : i3;
            i8 = -1;
            f = 1.0f;
            if (k4wVar.o()) {
                if (k4wVar.o()) {
                    iP = k4wVar.p(8);
                    if (iP == 255) {
                        int i27 = i3;
                        iP2 = k4wVar.p(i27);
                        iP3 = k4wVar.p(i27);
                        if (iP2 != 0 && iP3 != 0) {
                            f = iP2 / iP3;
                        }
                    } else if (iP < 17) {
                        f = b[iP];
                    } else {
                        td6.p(iP, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (k4wVar.o()) {
                    k4wVar.z();
                }
                if (k4wVar.o()) {
                    k4wVar.A(3);
                    if (k4wVar.o()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (k4wVar.o()) {
                        int iP7 = k4wVar.p(8);
                        int iP8 = k4wVar.p(8);
                        k4wVar.A(8);
                        int i28 = x8h.i(iP7);
                        int iJ = x8h.j(iP8);
                        i8 = i28;
                        i14 = iJ;
                    } else {
                        i14 = -1;
                    }
                } else {
                    i13 = -1;
                    i14 = -1;
                }
                if (k4wVar.o()) {
                    k4wVar.q();
                    k4wVar.q();
                }
                int i29 = i13;
                if (k4wVar.o()) {
                    k4wVar.A(65);
                }
                zO2 = k4wVar.o();
                if (zO2) {
                    F(k4wVar);
                }
                zO3 = k4wVar.o();
                if (zO3) {
                    F(k4wVar);
                }
                if (zO2 || zO3) {
                    k4wVar.z();
                }
                k4wVar.z();
                if (k4wVar.o()) {
                    k4wVar.z();
                    k4wVar.q();
                    k4wVar.q();
                    k4wVar.q();
                    k4wVar.q();
                    iQ4 = k4wVar.q();
                    k4wVar.q();
                }
                f2 = f;
                i12 = i8;
                i10 = i29;
                i11 = i14;
                i9 = iQ4;
            } else {
                i9 = iQ4;
                i10 = -1;
                i11 = -1;
                f2 = 1.0f;
                i12 = -1;
            }
            return new zin0(i26, iP5, iP6, iQ5, i25, i24, f2, i4, iQ2, z, zO, iQ7, iQ8, iQ3, z2, i12, i10, i11, i9);
        }
        iQ3 = k4wVar.q() + 4;
        z2 = false;
        k4wVar.q();
        k4wVar.z();
        int iQ15 = k4wVar.q() + 1;
        int iQ16 = k4wVar.q() + 1;
        zO = k4wVar.o();
        i5 = 2 - (zO ? 1 : 0);
        int i210 = iQ16 * i5;
        if (!zO) {
            k4wVar.z();
        }
        k4wVar.z();
        i6 = iQ15 * 16;
        i7 = i210 * 16;
        if (k4wVar.o()) {
            int iQ17 = k4wVar.q();
            int iQ18 = k4wVar.q();
            int iQ19 = k4wVar.q();
            int iQ110 = k4wVar.q();
            if (iQ == 0) {
                i15 = 1;
            } else {
                if (iQ == 3) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
                if (iQ == 1) {
                    i16 = 2;
                } else {
                    i16 = 1;
                }
                i5 *= i16;
            }
            i6 -= (iQ17 + iQ18) * i15;
            i7 -= (iQ19 + iQ110) * i5;
        }
        int i211 = i7;
        int i212 = i6;
        int i213 = iP4;
        if (i213 != 44) {
        }
        i8 = -1;
        f = 1.0f;
        if (k4wVar.o()) {
            if (k4wVar.o()) {
                iP = k4wVar.p(8);
                if (iP == 255) {
                    int i214 = i3;
                    iP2 = k4wVar.p(i214);
                    iP3 = k4wVar.p(i214);
                    if (iP2 != 0) {
                        f = iP2 / iP3;
                    }
                } else if (iP < 17) {
                    f = b[iP];
                } else {
                    td6.p(iP, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (k4wVar.o()) {
                k4wVar.z();
            }
            if (k4wVar.o()) {
                k4wVar.A(3);
                if (k4wVar.o()) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (k4wVar.o()) {
                    int iP9 = k4wVar.p(8);
                    int iP10 = k4wVar.p(8);
                    k4wVar.A(8);
                    int i215 = x8h.i(iP9);
                    int iJ2 = x8h.j(iP10);
                    i8 = i215;
                    i14 = iJ2;
                } else {
                    i14 = -1;
                }
            } else {
                i13 = -1;
                i14 = -1;
            }
            if (k4wVar.o()) {
                k4wVar.q();
                k4wVar.q();
            }
            int i216 = i13;
            if (k4wVar.o()) {
                k4wVar.A(65);
            }
            zO2 = k4wVar.o();
            if (zO2) {
                F(k4wVar);
            }
            zO3 = k4wVar.o();
            if (zO3) {
                F(k4wVar);
            }
            if (zO2) {
                k4wVar.z();
            } else {
                k4wVar.z();
            }
            k4wVar.z();
            if (k4wVar.o()) {
                k4wVar.z();
                k4wVar.q();
                k4wVar.q();
                k4wVar.q();
                k4wVar.q();
                iQ4 = k4wVar.q();
                k4wVar.q();
            }
            f2 = f;
            i12 = i8;
            i10 = i216;
            i11 = i14;
            i9 = iQ4;
        } else {
            i9 = iQ4;
            i10 = -1;
            i11 = -1;
            f2 = 1.0f;
            i12 = -1;
        }
        return new zin0(i213, iP5, iP6, iQ5, i212, i211, f2, i4, iQ2, z, zO, iQ7, iQ8, iQ3, z2, i12, i10, i11, i9);
    }

    public static cxg1 C(cxg1 cxg1Var, String[] strArr, Map map) {
        int i = 0;
        if (cxg1Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (cxg1) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                cxg1 cxg1Var2 = new cxg1();
                int length = strArr.length;
                while (i < length) {
                    cxg1Var2.a((cxg1) map.get(strArr[i]));
                    i++;
                }
                return cxg1Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                cxg1Var.a((cxg1) map.get(strArr[0]));
                return cxg1Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    cxg1Var.a((cxg1) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return cxg1Var;
    }

    public static final String D(String str, List list) {
        if (str == null || str.length() == 0) {
            return r(list);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((cdz) it.next()).b);
        }
        String strR = a6o1.r(str, arrayList);
        return strR == null ? r(list) : strR;
    }

    public static final int E(l131 l131Var) {
        int iOrdinal = l131Var.ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        if (iOrdinal == 1) {
            return 0;
        }
        if (iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            return 4;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        eg.o();
        return 0;
    }

    public static void F(k4w k4wVar) {
        int iQ = k4wVar.q() + 1;
        k4wVar.A(8);
        for (int i = 0; i < iQ; i++) {
            k4wVar.q();
            k4wVar.q();
            k4wVar.z();
        }
        k4wVar.A(20);
    }

    public static int G(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        hhg1.n(f4i1.c(i, "Unsupported surface rotation: "));
        return 0;
    }

    public static final List H(List list) {
        if (list == null) {
            return z6x.a;
        }
        List<phh0> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (phh0 phh0Var : list2) {
            upq upqVar = new upq();
            String str = phh0Var.b;
            int i = phh0Var.g;
            upqVar.a = str;
            String str2 = phh0Var.c;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            upqVar.f = str2;
            upqVar.J = phh0Var.f;
            upqVar.n = phh0Var.e;
            upqVar.r = Boolean.valueOf((i & 1) != 0);
            upqVar.s = Boolean.valueOf((i & 2) != 0);
            tqh0 tqh0Var = new tqh0(upqVar);
            koh0 koh0Var = new koh0();
            String str4 = phh0Var.a;
            if (str4 != null) {
                str3 = str4;
            }
            koh0Var.b = str3;
            Uri uri = phh0Var.d;
            koh0Var.e = uri;
            koh0Var.k = tqh0Var;
            o3e0 o3e0Var = new o3e0();
            o3e0Var.b = uri;
            koh0Var.m = new toh0(o3e0Var);
            arrayList.add(koh0Var.a());
        }
        return o7h.l1(arrayList);
    }

    public static final int I(b9f b9fVar) {
        if (b9fVar instanceof b8f) {
            return 3;
        }
        if (b9fVar instanceof g8f) {
            return 1;
        }
        if (b9fVar instanceof i8f) {
            return 2;
        }
        if (b9fVar instanceof x8f) {
            return 1;
        }
        if (b9fVar instanceof y8f) {
            return 3;
        }
        if ((b9fVar instanceof z8f) || (b9fVar instanceof v8f) || (b9fVar instanceof w8f) || (b9fVar instanceof u8f)) {
            return 1;
        }
        eg.o();
        return 0;
    }

    public static final YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs J(fab0 fab0Var) {
        YourLibraryConfig.YourLibraryLabelAndImage yourLibraryLabelAndImageN;
        psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
        nsm1 nsm1VarO = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
        osm1 osm1Var = osm1.c;
        nsm1VarO.q(osm1Var);
        psm1VarP.r(nsm1VarO);
        boolean z = fab0Var.d;
        eab0 eab0Var = fab0Var.f;
        if (z) {
            nsm1 nsm1VarO2 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
            nsm1VarO2.q(osm1Var);
            psm1VarP.t(nsm1VarO2);
        }
        String str = fab0Var.b;
        if (str == null) {
            yourLibraryLabelAndImageN = YourLibraryConfig.YourLibraryLabelAndImage.n();
            yourLibraryLabelAndImageN.getClass();
        } else {
            msm1 msm1VarO = YourLibraryConfig.YourLibraryLabelAndImage.o();
            msm1VarO.r(str);
            msm1VarO.q();
            YourLibraryConfig.YourLibraryLabelAndImage yourLibraryLabelAndImageBuild = msm1VarO.build();
            yourLibraryLabelAndImageBuild.getClass();
            yourLibraryLabelAndImageN = yourLibraryLabelAndImageBuild;
        }
        psm1VarP.y(yourLibraryLabelAndImageN);
        psm1VarP.n(fab0Var.e);
        nsm1 nsm1VarO3 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
        osm1 osm1Var2 = osm1.d;
        nsm1VarO3.q((eab0Var == null || !eab0Var.a) ? osm1Var : osm1Var2);
        psm1VarP.u(nsm1VarO3);
        nsm1 nsm1VarO4 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
        if (eab0Var != null && eab0Var.b) {
            osm1Var = osm1Var2;
        }
        nsm1VarO4.q(osm1Var);
        psm1VarP.z(nsm1VarO4);
        return psm1VarP.build();
    }

    public static int K(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArrCopyOf = d;
                    if (iArrCopyOf.length <= i4) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                        d = iArrCopyOf;
                    }
                    iArrCopyOf[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static lsn0 L(String str, ou80 ou80Var) {
        return new lsn0(str, ou80Var);
    }

    public static lsn0 M(String str, tv80 tv80Var) {
        return new lsn0(str, tv80Var.a);
    }

    public static final Object N(k1r k1rVar) {
        i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
        if (i1rVar != null) {
            return i1rVar.a;
        }
        return null;
    }

    public static final void a(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        af5 af5VarP;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2142397085);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i | 48 | (x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131956476);
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new g850(iu30Var, (byte) 10);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            x340Var.i0(1593858185);
            if (z) {
                x340Var.i0(1765965177);
                x340Var.r(false);
                ye5 ye5Var = new ye5();
                ye5Var.g(cwl1.o0(x340Var, 2131956475));
                ye5Var.g(" ");
                String strO1 = cwl1.o0(x340Var, 2131953685);
                uwr uwrVar = cbx.a;
                FontFamily fontFamily = cbx.d(x340Var).n.a.f;
                zma1 zma1Var = new zma1(cbx.a(x340Var).b.a, 0L, cbx.d(x340Var).n.a.c, cbx.d(x340Var).n.a.d, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490);
                boolean zG = x340Var.g(function0);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new xet(function0, (byte) 13);
                    x340Var.s0(objT2);
                }
                vhg.a(ye5Var, strO1, "manageSocialSettings", zma1Var, (iu30) objT2);
                af5VarP = ye5Var.p();
            } else {
                x340Var.i0(1765882531);
                af5VarP = new af5(cwl1.o0(x340Var, 2131956474));
                x340Var.r(false);
            }
            x340Var.r(false);
            af5 af5Var = af5VarP;
            qim0Var2 = nim0.a;
            o6p1.b(strO0, af5Var, anm1.N("group_chat-request-view-test-tag", qim0Var2), apo.r(1520147024, new ipy(iu30Var, (byte) 9), x340Var), x340Var, 3072, 0);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc6(iu30Var, qim0Var2, z, i);
        }
    }

    public static final void b(int i, long j, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1676672295);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.f(j) ? 32 : 16) | (x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.g(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            z2 = z;
            fq7.g(z2, qim0Var, xay.e(2, irn1.o0(AdvertisementType.OTHER, 0, (dlv) null, 6)), xay.f(2, irn1.o0(AdvertisementType.OTHER, 0, (dlv) null, 6)), (String) null, apo.r(1480529919, new gv6(j, function0, (byte) 8), x340Var), x340Var, (i2 & 14) | 200064 | ((i2 >> 6) & ContentType.LONG_FORM_ON_DEMAND), 16);
        } else {
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d8h(z2, j, function0, qim0Var, i);
        }
    }

    public static final yoh0 c(whh0 whh0Var) {
        loh0 loh0Var = new loh0();
        ooh0 ooh0Var = new ooh0();
        List list = Collections.EMPTY_LIST;
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        qoh0 qoh0Var = new qoh0();
        toh0 toh0Var = toh0.d;
        String str = whh0Var.a.a;
        str.getClass();
        upq upqVar = new upq();
        upqVar.s = Boolean.FALSE;
        upqVar.r = Boolean.TRUE;
        upqVar.J = whh0Var.b;
        tqh0 tqh0Var = new tqh0(upqVar);
        dm5.y(((Uri) ooh0Var.e) == null || ((UUID) ooh0Var.d) != null);
        return new yoh0(str, new noh0(loh0Var), null, new roh0(qoh0Var), tqh0Var, toh0Var);
    }

    public static final tn31 d(iph0 iph0Var, Bundle bundle) {
        String string = iph0Var != null ? iph0Var.a.getString("com.spotify.music.extra.CLIENT_ID", null) : null;
        String string2 = iph0Var != null ? iph0Var.a.getString("com.spotify.music.extra.VERSION", null) : null;
        String strK = (iph0Var == null || !iph0Var.d) ? "default" : tyo1.k(iph0Var.a);
        Bundle bundle2 = new Bundle(bundle);
        if (iph0Var != null) {
            bundle2.putAll(iph0Var.a);
        }
        return new tn31(strK, string, string2, iph0Var != null ? iph0Var.d : false, iph0Var != null ? iph0Var.b : false, (t380) null, bundle2, 80);
    }

    public static final u8h1 e(nar0 nar0Var) {
        r6h1 r6h1Var;
        if (nar0Var == null || (r6h1Var = nar0Var.a) == null) {
            return (u8h1) e8h1.b.b;
        }
        u8h1 u8h1Var = r6h1Var.b;
        return u8h1Var == null ? (u8h1) e8h1.c.b : u8h1Var;
    }

    public static final u8h1 f(v8h1 v8h1Var) {
        u8h1 u8h1Var = v8h1Var.b().b;
        return u8h1Var == null ? (u8h1) e8h1.c.b : u8h1Var;
    }

    public static final nar0 g(v8h1 v8h1Var) {
        return new nar0(v8h1Var);
    }

    public static yrn0 h() {
        return new yrn0((ou80) null);
    }

    public static final String i(String str, jo70 jo70Var) {
        Object next;
        ho70 ho70Var;
        List list = jo70Var.d;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ho70Var = (ho70) next;
            if (nhc1.Y(ho70Var.b, "spotify:user:", false)) {
                break;
            }
        } while (!nhc1.Y(ho70Var.b, "spotify:profile:", false));
        ho70 ho70Var2 = (ho70) next;
        String str2 = ho70Var2 != null ? ho70Var2.a : null;
        if (str2 == null) {
            str2 = "";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (nhc1.Y(((ho70) obj).b, "spotify:artist:", false)) {
                arrayList.add(obj);
            }
        }
        String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, mr90.b1, 30);
        if (str2.length() <= 0) {
            str2 = null;
        }
        return j(str2 != null ? String.format(str, Arrays.copyOf(new Object[]{str2}, 1)) : null, strY0);
    }

    public static final String j(String str, String str2) {
        if (str == null || str.length() <= 0) {
            str = null;
        }
        if (str2.length() <= 0) {
            str2 = null;
        }
        String strY0 = o7h.y0(f46.i0(new String[]{str, str2}), " • ", (String) null, (String) null, (iu30) null, 62);
        if (strY0.length() == 0) {
            return null;
        }
        return strY0;
    }

    public static void k(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static dsn0 l(y6r0 y6r0Var) {
        return new dsn0(y6r0Var);
    }

    public static esn0 m(String str) {
        return new esn0(str);
    }

    public static final boolean n(int i, int i2) {
        return i == i2;
    }

    public static int o(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        dm5.y(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            k(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            k(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            k(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    k(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static String p(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                v280 v280VarM = b380.m();
                int i2 = 0;
                while (i2 < bArr.length) {
                    int iO = o(bArr, i2, bArr.length, zArr);
                    if (iO != bArr.length) {
                        v280VarM.c(Integer.valueOf(iO));
                    }
                    i2 = iO + 3;
                }
                bg11 bg11VarG = v280VarM.g();
                for (int i3 = 0; i3 < bg11VarG.d; i3++) {
                    if (((Integer) bg11VarG.get(i3)).intValue() + 3 < length) {
                        k4w k4wVar = new k4w(bArr, ((Integer) bg11VarG.get(i3)).intValue() + 3, length);
                        cc9 cc9VarW = w(k4wVar);
                        if (cc9VarW.a == 33 && cc9VarW.b == 0) {
                            k4wVar.A(4);
                            int iP = k4wVar.p(3);
                            k4wVar.z();
                            uin0 uin0VarX = x(k4wVar, true, iP, null);
                            return kwg.a(uin0VarX.a, uin0VarX.b, uin0VarX.c, uin0VarX.d, uin0VarX.e, uin0VarX.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String q(ie30 ie30Var) {
        String str = ie30Var.f66p;
        String str2 = ie30Var.l;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return ie30Var.f66p;
    }

    public static final String r(List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cdz) next).b.length() <= 0);
        cdz cdzVar = (cdz) next;
        if (cdzVar != null) {
            return cdzVar.b;
        }
        return null;
    }

    public static int s(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (j2h1.z(2, j2h1.J("CameraOrientationUtil"))) {
            j2h1.o("CameraOrientationUtil");
        }
        return i3;
    }

    public static final bek0 t(htv htvVar) {
        gtv gtvVar = htvVar.h;
        if (!gtvVar.a) {
            return null;
        }
        Set setP1 = o7h.p1(gtvVar.i);
        c380<ftv> c380Var = htvVar.l;
        int i = 0;
        if (c380Var == null || !c380Var.isEmpty()) {
            for (ftv ftvVar : c380Var) {
                if (ftvVar.f && !setP1.contains(ftvVar.a) && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        if (i < gtvVar.j) {
            return zdk0.a;
        }
        if (gtvVar.b || htvVar.c || htvVar.e) {
            return ydk0.a;
        }
        Integer num = gtvVar.f;
        return (num == null || htvVar.j.a > num.intValue()) ? wdk0.a : xdk0.a;
    }

    public static boolean u(int i, ie30 ie30Var, byte[] bArr) {
        int i2;
        if (Objects.equals(ie30Var.f66p, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(ie30Var.f66p, "video/hevc")) {
            cc9 cc9VarW = w(new k4w(bArr, 4, i + 4));
            int i3 = cc9VarW.a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && cc9VarW.c == ie30Var.I - 1) {
                return false;
            }
        }
        return true;
    }

    public static int v(ie30 ie30Var) {
        String strQ = q(ie30Var);
        if (Objects.equals(strQ, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strQ, "video/hevc") || Objects.equals(strQ, "video/vvc")) ? 2 : 0;
    }

    public static cc9 w(k4w k4wVar) {
        k4wVar.z();
        return new cc9(k4wVar.p(6), k4wVar.p(6), k4wVar.p(3) - 1, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static uin0 x(k4w k4wVar, boolean z, int i, uin0 uin0Var) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zO;
        int iP;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (!z) {
            if (uin0Var != null) {
                int i7 = uin0Var.a;
                zO = uin0Var.b;
                iP = uin0Var.c;
                i5 = uin0Var.d;
                iArr2 = uin0Var.e;
                i2 = i7;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int iP2 = k4wVar.p(8);
            i6 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                if (k4wVar.o()) {
                    i6 += 88;
                }
                if (k4wVar.o()) {
                    i6 += 8;
                }
            }
            k4wVar.A(i6);
            if (i > 0) {
                k4wVar.A((8 - i) * 2);
            }
            return new uin0(i2, z2, i3, i4, iArr, iP2);
        }
        int iP3 = k4wVar.p(2);
        zO = k4wVar.o();
        iP = k4wVar.p(5);
        i5 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (k4wVar.o()) {
                i5 |= 1 << i9;
            }
        }
        for (int i10 = 0; i10 < 6; i10++) {
            iArr2[i10] = k4wVar.p(8);
        }
        i2 = iP3;
        iArr = iArr2;
        z2 = zO;
        i3 = iP;
        i4 = i5;
        int iP4 = k4wVar.p(8);
        i6 = 0;
        while (i8 < i) {
            if (k4wVar.o()) {
                i6 += 88;
            }
            if (k4wVar.o()) {
                i6 += 8;
            }
        }
        k4wVar.A(i6);
        if (i > 0) {
            k4wVar.A((8 - i) * 2);
        }
        return new uin0(i2, z2, i3, i4, iArr, iP4);
    }

    public static ij81 y(int i, byte[] bArr, int i2) {
        byte b2;
        int i3 = i + 2;
        do {
            i2--;
            b2 = bArr[i2];
            if (b2 != 0) {
                break;
            }
        } while (i2 > i3);
        if (b2 == 0 || i2 <= i3) {
            return null;
        }
        k4w k4wVar = new k4w(bArr, i3, i2 + 1);
        while (k4wVar.b(16)) {
            int iP = k4wVar.p(8);
            int i4 = 0;
            while (iP == 255) {
                i4 += 255;
                iP = k4wVar.p(8);
            }
            int i5 = i4 + iP;
            int iP2 = k4wVar.p(8);
            int i6 = 0;
            while (iP2 == 255) {
                i6 += 255;
                iP2 = k4wVar.p(8);
            }
            int i7 = i6 + iP2;
            if (i7 == 0 || !k4wVar.b(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iQ = k4wVar.q();
                boolean zO = k4wVar.o();
                int iQ2 = zO ? k4wVar.q() : 0;
                int iQ3 = k4wVar.q();
                int iQ4 = -1;
                for (int i8 = 0; i8 <= iQ3; i8++) {
                    iQ4 = k4wVar.q();
                    k4wVar.q();
                    int iP3 = k4wVar.p(6);
                    if (iP3 == 63) {
                        return null;
                    }
                    k4wVar.p(iP3 == 0 ? Math.max(0, iQ - 30) : Math.max(0, (iP3 + iQ) - 31));
                    if (zO) {
                        int iP4 = k4wVar.p(6);
                        if (iP4 == 63) {
                            return null;
                        }
                        k4wVar.p(iP4 == 0 ? Math.max(0, iQ2 - 30) : Math.max(0, (iP4 + iQ2) - 31));
                    }
                    if (k4wVar.o()) {
                        k4wVar.A(10);
                    }
                }
                return new ij81(iQ4, (byte) 22);
            }
            k4wVar.A(i7 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    public static win0 z(byte[] bArr, int i, int i2, poj0 poj0Var) {
        int i3;
        int iQ;
        int i4;
        int i5;
        int i6;
        int iQ2;
        int i7;
        int i8;
        int iQ3;
        int i9;
        int iMax;
        int i10;
        int i11;
        int i12;
        int i13;
        int iJ;
        int i14;
        bnj0 bnj0Var;
        int iQ4;
        drj0 drj0Var;
        cc9 cc9VarW = w(new k4w(bArr, i, i2));
        k4w k4wVar = new k4w(bArr, i + 2, i2);
        int i15 = 4;
        k4wVar.A(4);
        int iP = k4wVar.p(3);
        int i16 = cc9VarW.b;
        boolean z = i16 != 0 && iP == 7;
        if (poj0Var != null) {
            b380 b380Var = (b380) poj0Var.b;
            if (b380Var.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((tin0) b380Var.get(Math.min(i16, b380Var.size() - 1))).a;
            }
        } else {
            i3 = 0;
        }
        uin0 uin0VarX = null;
        if (!z) {
            k4wVar.z();
            uin0VarX = x(k4wVar, true, iP, null);
        } else if (poj0Var != null) {
            rok0 rok0Var = (rok0) poj0Var.c;
            int[] iArr = (int[]) rok0Var.c;
            b380 b380Var2 = (b380) rok0Var.b;
            int i17 = iArr[i3];
            if (b380Var2.size() > i17) {
                uin0VarX = (uin0) b380Var2.get(i17);
            }
        }
        k4wVar.q();
        if (z) {
            int iP2 = k4wVar.o() ? k4wVar.p(8) : -1;
            if (poj0Var == null || (drj0Var = (drj0) poj0Var.d) == null) {
                iQ2 = 0;
                i8 = 0;
                iQ3 = 0;
                iQ = 0;
                i6 = 0;
                i7 = 0;
                i9 = 0;
            } else {
                b380 b380Var3 = (b380) drj0Var.b;
                if (iP2 == -1) {
                    iP2 = ((int[]) drj0Var.c)[i3];
                }
                if (iP2 == -1 || b380Var3.size() <= iP2) {
                    iQ2 = 0;
                    i8 = 0;
                    iQ3 = 0;
                    iQ = 0;
                    i6 = 0;
                    i7 = 0;
                    i9 = 0;
                } else {
                    vin0 vin0Var = (vin0) b380Var3.get(iP2);
                    iQ = vin0Var.a;
                    i6 = vin0Var.d;
                    i8 = vin0Var.e;
                    iQ2 = vin0Var.b;
                    iQ3 = vin0Var.c;
                    i7 = i8;
                    i9 = i6;
                }
            }
        } else {
            iQ = k4wVar.q();
            if (iQ == 3) {
                k4wVar.z();
            }
            int iQ5 = k4wVar.q();
            int iQ6 = k4wVar.q();
            if (k4wVar.o()) {
                int iQ7 = k4wVar.q();
                int iQ8 = k4wVar.q();
                int iQ9 = k4wVar.q();
                int iQ10 = k4wVar.q();
                i5 = iQ5 - ((iQ7 + iQ8) * ((iQ == 1 || iQ == 2) ? 2 : 1));
                i4 = iQ6 - ((iQ9 + iQ10) * (iQ == 1 ? 2 : 1));
            } else {
                i4 = iQ6;
                i5 = iQ5;
            }
            i6 = i5;
            iQ2 = k4wVar.q();
            i7 = iQ6;
            i8 = i4;
            iQ3 = k4wVar.q();
            i9 = iQ5;
        }
        int iQ11 = k4wVar.q();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i18 = k4wVar.o() ? 0 : iP; i18 <= iP; i18++) {
                k4wVar.q();
                iMax = Math.max(k4wVar.q(), iMax);
                k4wVar.q();
            }
        }
        k4wVar.q();
        k4wVar.q();
        k4wVar.q();
        k4wVar.q();
        k4wVar.q();
        k4wVar.q();
        if (k4wVar.o()) {
            boolean zO = z ? k4wVar.o() : false;
            int i19 = 6;
            if (zO) {
                k4wVar.A(6);
            } else if (k4wVar.o()) {
                int i20 = 0;
                while (i20 < i15) {
                    int i21 = 0;
                    while (i21 < i19) {
                        if (k4wVar.o()) {
                            int iMin = Math.min(64, 1 << ((i20 << 1) + 4));
                            if (i20 > 1) {
                                k4wVar.r();
                            }
                            for (int i22 = 0; i22 < iMin; i22++) {
                                k4wVar.r();
                            }
                        } else {
                            k4wVar.q();
                        }
                        i21 += i20 == 3 ? 3 : 1;
                        i19 = 6;
                    }
                    i20++;
                    i15 = 4;
                    i19 = 6;
                }
            }
        }
        k4wVar.A(2);
        if (k4wVar.o()) {
            k4wVar.A(8);
            k4wVar.q();
            k4wVar.q();
            k4wVar.z();
        }
        int iQ12 = k4wVar.q();
        int i23 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i24 = i3;
        int i25 = -1;
        int i26 = -1;
        while (i23 < iQ12) {
            if (i23 == 0 || !k4wVar.o()) {
                iQ4 = k4wVar.q();
                int iQ13 = k4wVar.q();
                int[] iArr3 = new int[iQ4];
                int i27 = 0;
                while (i27 < iQ4) {
                    iArr3[i27] = (i27 > 0 ? iArr3[i27 - 1] : 0) - (k4wVar.q() + 1);
                    k4wVar.z();
                    i27++;
                }
                int[] iArr4 = new int[iQ13];
                int i28 = 0;
                while (i28 < iQ13) {
                    iArr4[i28] = k4wVar.q() + 1 + (i28 > 0 ? iArr4[i28 - 1] : 0);
                    k4wVar.z();
                    i28++;
                }
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
                i25 = iQ13;
            } else {
                int i29 = i26 + i25;
                int iQ14 = (1 - ((k4wVar.o() ? 1 : 0) * 2)) * (k4wVar.q() + 1);
                int i30 = i29 + 1;
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 <= i29; i31++) {
                    if (k4wVar.o()) {
                        zArr[i31] = true;
                    } else {
                        zArr[i31] = k4wVar.o();
                    }
                }
                int[] iArr5 = new int[i30];
                int[] iArr6 = new int[i30];
                int i32 = 0;
                for (int i33 = i25 - 1; i33 >= 0; i33--) {
                    int i34 = iArrCopyOf[i33] + iQ14;
                    if (i34 < 0 && zArr[i26 + i33]) {
                        iArr5[i32] = i34;
                        i32++;
                    }
                }
                if (iQ14 < 0 && zArr[i29]) {
                    iArr5[i32] = iQ14;
                    i32++;
                }
                iQ4 = i32;
                for (int i35 = 0; i35 < i26; i35++) {
                    int i36 = iArr2[i35] + iQ14;
                    if (i36 < 0 && zArr[i35]) {
                        iArr5[iQ4] = i36;
                        iQ4++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, iQ4);
                int i37 = 0;
                for (int i38 = i26 - 1; i38 >= 0; i38--) {
                    int i39 = iArr2[i38] + iQ14;
                    if (i39 > 0 && zArr[i38]) {
                        iArr6[i37] = i39;
                        i37++;
                    }
                }
                if (iQ14 > 0 && zArr[i29]) {
                    iArr6[i37] = iQ14;
                    i37++;
                }
                int i40 = i37;
                for (int i41 = 0; i41 < i25; i41++) {
                    int i42 = iArrCopyOf[i41] + iQ14;
                    if (i42 > 0 && zArr[i26 + i41]) {
                        iArr6[i40] = i42;
                        i40++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i40);
                iArr2 = iArrCopyOf2;
                i25 = i40;
            }
            i26 = iQ4;
            i23++;
            iQ12 = iQ12;
            iMax = iMax;
            iQ2 = iQ2;
        }
        int i43 = iMax;
        int i44 = iQ2;
        if (k4wVar.o()) {
            int iQ15 = k4wVar.q();
            for (int i45 = 0; i45 < iQ15; i45++) {
                k4wVar.A(iQ11 + 5);
            }
        }
        k4wVar.A(2);
        float f = 1.0f;
        if (k4wVar.o()) {
            if (k4wVar.o()) {
                int iP3 = k4wVar.p(8);
                if (iP3 == 255) {
                    int iP4 = k4wVar.p(16);
                    int iP5 = k4wVar.p(16);
                    if (iP4 != 0 && iP5 != 0) {
                        f = iP4 / iP5;
                    }
                } else if (iP3 < 17) {
                    f = b[iP3];
                } else {
                    td6.p(iP3, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (k4wVar.o()) {
                k4wVar.z();
            }
            if (k4wVar.o()) {
                k4wVar.A(3);
                i14 = k4wVar.o() ? 1 : 2;
                if (k4wVar.o()) {
                    int iP6 = k4wVar.p(8);
                    int iP7 = k4wVar.p(8);
                    k4wVar.A(8);
                    i13 = x8h.i(iP6);
                    iJ = x8h.j(iP7);
                } else {
                    i13 = -1;
                    iJ = -1;
                }
            } else if (poj0Var == null || (bnj0Var = (bnj0) poj0Var.e) == null) {
                i13 = -1;
                iJ = -1;
                i14 = -1;
            } else {
                b380 b380Var4 = (b380) bnj0Var.b;
                int i46 = ((int[]) bnj0Var.c)[i24];
                if (b380Var4.size() > i46) {
                    xin0 xin0Var = (xin0) b380Var4.get(i46);
                    int i47 = xin0Var.a;
                    int i48 = xin0Var.b;
                    iJ = xin0Var.c;
                    i13 = i47;
                    i14 = i48;
                } else {
                    i13 = -1;
                    iJ = -1;
                    i14 = -1;
                }
            }
            if (k4wVar.o()) {
                k4wVar.q();
                k4wVar.q();
            }
            k4wVar.z();
            if (k4wVar.o()) {
                i8 *= 2;
            }
            i10 = i13;
            i12 = iJ;
            i11 = i14;
        } else {
            i10 = -1;
            i11 = -1;
            i12 = -1;
        }
        return new win0(iP, uin0VarX, iQ, i44, iQ3, i6, i8, i9, i7, f, i43, i10, i11, i12);
    }
}
