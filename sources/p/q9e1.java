package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class q9e1 {
    public static final kiv a = mod.g(new n4k((byte) 27));

    public static final void a(lee1 lee1Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(15327438);
        int i2 = (x340Var.g(lee1Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            kiv kivVar = a;
            mod.b(kivVar.a(((lee1) x340Var.k(kivVar)).e(lee1Var)), j2iVar, x340Var, (i2 & 112) | 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j9e1(lee1Var, j2iVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x015e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0161  */
    /* JADX WARN: Code duplicated, block: B:105:0x0164  */
    /* JADX WARN: Code duplicated, block: B:106:0x016b  */
    /* JADX WARN: Code duplicated, block: B:108:0x016e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0178  */
    /* JADX WARN: Code duplicated, block: B:112:0x017a  */
    /* JADX WARN: Code duplicated, block: B:114:0x017e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0192  */
    /* JADX WARN: Code duplicated, block: B:123:0x021c  */
    /* JADX WARN: Code duplicated, block: B:126:0x023b  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    public static final void b(String str, qim0 qim0Var, long j, long j2, FontWeight fontWeight, long j3, a0e1 a0e1Var, long j4, int i, boolean z, int i2, int i3, lee1 lee1Var, b0k b0kVar, int i4, int i5, int i6) {
        int i7;
        qim0 qim0Var2;
        int i8;
        long j5;
        int i9;
        int i10;
        long jK;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long jK2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z2;
        x340 x340Var;
        FontWeight fontWeight2;
        int i27;
        int i28;
        lee1 lee1Var2;
        qim0 qim0Var3;
        long j6;
        a0e1 a0e1Var2;
        long j7;
        long j8;
        long j9;
        int i29;
        boolean z3;
        h311 h311VarV;
        qim0 qim0Var4;
        long jP;
        FontWeight fontWeight3;
        long jK3;
        qim0 qim0Var5;
        int i30;
        int i31;
        lee1 lee1Var3;
        int i32;
        int i33;
        boolean z4;
        a0e1 a0e1Var3;
        FontWeight fontWeight4;
        long j10;
        long j11;
        long j12;
        long j13;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2055108902);
        if ((i4 & 6) == 0) {
            i7 = (x340Var2.g(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i34 = i6 & 2;
        if (i34 == 0) {
            if ((i4 & 48) == 0) {
                qim0Var2 = qim0Var;
                i7 |= x340Var2.g(qim0Var2) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 != 0) {
                if ((i4 & 384) == 0) {
                    j5 = j;
                    if (x340Var2.f(j5)) {
                        i9 = 256;
                    } else {
                        i9 = 128;
                    }
                    i7 |= i9;
                }
                i10 = i6 & 8;
                if (i10 != 0) {
                    if ((i4 & 3072) == 0) {
                        jK = j2;
                        if (x340Var2.f(jK)) {
                            i11 = 2048;
                        } else {
                            i11 = 1024;
                        }
                        i7 |= i11;
                    }
                    i12 = i7 | 24576;
                    i13 = i6 & 32;
                    if (i13 != 0) {
                        if ((196608 & i4) == 0) {
                            if (x340Var2.g(fontWeight)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i12 |= i14;
                        }
                        i15 = i12 | 1572864;
                        i16 = i6 & 128;
                        if (i16 != 0) {
                            i15 = i12 | 14155776;
                            jK2 = j3;
                        } else {
                            jK2 = j3;
                            if ((12582912 & i4) == 0) {
                                if (x340Var2.f(jK2)) {
                                    i17 = 8388608;
                                } else {
                                    i17 = 4194304;
                                }
                                i15 |= i17;
                            }
                        }
                        i18 = i15 | 100663296;
                        i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                        if (i19 != 0) {
                            i18 = i15 | 905969664;
                        } else if ((i4 & 805306368) == 0) {
                            if (x340Var2.g(a0e1Var)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i18 |= i20;
                        }
                        i21 = i18;
                        i22 = i6 & 1024;
                        if (i22 != 0) {
                            i23 = i22;
                            i24 = 6;
                        } else {
                            i23 = i22;
                            if ((i5 & 6) == 0) {
                                if (x340Var2.f(j4)) {
                                    i25 = 4;
                                } else {
                                    i25 = 2;
                                }
                                i24 = i5 | i25;
                            } else {
                                i24 = i5;
                            }
                        }
                        i26 = i24 | 748976;
                        if ((i21 & 306783379) == 306783378 || (i26 & 599187) != 599186) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var2.Y(i21 & 1, z2)) {
                            x340Var2.d0();
                            if ((i4 & 1) != 0 || x340Var2.E()) {
                                if (i34 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i8 != 0) {
                                    int i35 = u7h.l;
                                    jP = nfb.p();
                                } else {
                                    jP = j5;
                                }
                                if (i10 != 0) {
                                    wee1[] wee1VarArr = TextUnit.b;
                                    jK = f7p1.k();
                                }
                                if (i13 != 0) {
                                    fontWeight3 = null;
                                } else {
                                    fontWeight3 = fontWeight;
                                }
                                if (i16 != 0) {
                                    wee1[] wee1VarArr2 = TextUnit.b;
                                    jK2 = f7p1.k();
                                }
                                a0e1 a0e1Var4 = i19 == 0 ? a0e1Var : null;
                                if (i23 != 0) {
                                    wee1[] wee1VarArr3 = TextUnit.b;
                                    jK3 = f7p1.k();
                                } else {
                                    jK3 = j4;
                                }
                                qim0Var5 = qim0Var4;
                                i30 = i26 & (-3670017);
                                i31 = 1;
                                lee1Var3 = (lee1) x340Var2.k(a);
                                i32 = Integer.MAX_VALUE;
                                i33 = 1;
                                z4 = true;
                                a0e1Var3 = a0e1Var4;
                                fontWeight4 = fontWeight3;
                                j10 = jK2;
                                j11 = jP;
                                j12 = jK;
                                j13 = jK3;
                            } else {
                                x340Var2.b0();
                                i30 = i26 & (-3670017);
                                long j14 = j5;
                                j10 = jK2;
                                j11 = j14;
                                a0e1Var3 = a0e1Var;
                                i33 = i;
                                z4 = z;
                                i32 = i2;
                                i31 = i3;
                                lee1Var3 = lee1Var;
                                qim0Var5 = qim0Var2;
                                j12 = jK;
                                fontWeight4 = fontWeight;
                                j13 = j4;
                            }
                            x340Var2.s();
                            int i36 = i21 << 3;
                            x340Var = x340Var2;
                            c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i36 & 57344) | (i36 & 458752) | (i36 & 3670016) | (i36 & 29360128) | (i36 & 234881024) | (i36 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                            qim0Var3 = qim0Var5;
                            j6 = j11;
                            j9 = j12;
                            fontWeight2 = fontWeight4;
                            j8 = j10;
                            a0e1Var2 = a0e1Var3;
                            j7 = j13;
                            i29 = i33;
                            z3 = z4;
                            i27 = i32;
                            i28 = i31;
                            lee1Var2 = lee1Var3;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            fontWeight2 = fontWeight;
                            i27 = i2;
                            i28 = i3;
                            lee1Var2 = lee1Var;
                            qim0Var3 = qim0Var2;
                            j6 = j5;
                            a0e1Var2 = a0e1Var;
                            j7 = j4;
                            j8 = jK2;
                            j9 = jK;
                            i29 = i;
                            z3 = z;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                        }
                    }
                    i12 = 221184 | i7;
                    i15 = i12 | 1572864;
                    i16 = i6 & 128;
                    if (i16 != 0) {
                        i15 = i12 | 14155776;
                        jK2 = j3;
                    } else {
                        jK2 = j3;
                        if ((12582912 & i4) == 0) {
                            if (x340Var2.f(jK2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i15 |= i17;
                        }
                    }
                    i18 = i15 | 100663296;
                    i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                    if (i19 != 0) {
                        i18 = i15 | 905969664;
                    } else if ((i4 & 805306368) == 0) {
                        if (x340Var2.g(a0e1Var)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i18 |= i20;
                    }
                    i21 = i18;
                    i22 = i6 & 1024;
                    if (i22 != 0) {
                        i23 = i22;
                        i24 = 6;
                    } else {
                        i23 = i22;
                        if ((i5 & 6) == 0) {
                            if (x340Var2.f(j4)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                    }
                    i26 = i24 | 748976;
                    if ((i21 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (x340Var2.Y(i21 & 1, z2)) {
                        x340Var2.d0();
                        if ((i4 & 1) != 0) {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i8 != 0) {
                                int i37 = u7h.l;
                                jP = nfb.p();
                            } else {
                                jP = j5;
                            }
                            if (i10 != 0) {
                                wee1[] wee1VarArr4 = TextUnit.b;
                                jK = f7p1.k();
                            }
                            if (i13 != 0) {
                                fontWeight3 = null;
                            } else {
                                fontWeight3 = fontWeight;
                            }
                            if (i16 != 0) {
                                wee1[] wee1VarArr5 = TextUnit.b;
                                jK2 = f7p1.k();
                            }
                            if (i19 == 0) {
                            }
                            if (i23 != 0) {
                                wee1[] wee1VarArr6 = TextUnit.b;
                                jK3 = f7p1.k();
                            } else {
                                jK3 = j4;
                            }
                            qim0Var5 = qim0Var4;
                            i30 = i26 & (-3670017);
                            i31 = 1;
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i32 = Integer.MAX_VALUE;
                            i33 = 1;
                            z4 = true;
                            a0e1Var3 = a0e1Var4;
                            fontWeight4 = fontWeight3;
                            j10 = jK2;
                            j11 = jP;
                            j12 = jK;
                            j13 = jK3;
                        } else {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i8 != 0) {
                                int i38 = u7h.l;
                                jP = nfb.p();
                            } else {
                                jP = j5;
                            }
                            if (i10 != 0) {
                                wee1[] wee1VarArr7 = TextUnit.b;
                                jK = f7p1.k();
                            }
                            if (i13 != 0) {
                                fontWeight3 = null;
                            } else {
                                fontWeight3 = fontWeight;
                            }
                            if (i16 != 0) {
                                wee1[] wee1VarArr8 = TextUnit.b;
                                jK2 = f7p1.k();
                            }
                            if (i19 == 0) {
                            }
                            if (i23 != 0) {
                                wee1[] wee1VarArr9 = TextUnit.b;
                                jK3 = f7p1.k();
                            } else {
                                jK3 = j4;
                            }
                            qim0Var5 = qim0Var4;
                            i30 = i26 & (-3670017);
                            i31 = 1;
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i32 = Integer.MAX_VALUE;
                            i33 = 1;
                            z4 = true;
                            a0e1Var3 = a0e1Var4;
                            fontWeight4 = fontWeight3;
                            j10 = jK2;
                            j11 = jP;
                            j12 = jK;
                            j13 = jK3;
                        }
                        x340Var2.s();
                        int i39 = i21 << 3;
                        x340Var = x340Var2;
                        c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i39 & 57344) | (i39 & 458752) | (i39 & 3670016) | (i39 & 29360128) | (i39 & 234881024) | (i39 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                        qim0Var3 = qim0Var5;
                        j6 = j11;
                        j9 = j12;
                        fontWeight2 = fontWeight4;
                        j8 = j10;
                        a0e1Var2 = a0e1Var3;
                        j7 = j13;
                        i29 = i33;
                        z3 = z4;
                        i27 = i32;
                        i28 = i31;
                        lee1Var2 = lee1Var3;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        fontWeight2 = fontWeight;
                        i27 = i2;
                        i28 = i3;
                        lee1Var2 = lee1Var;
                        qim0Var3 = qim0Var2;
                        j6 = j5;
                        a0e1Var2 = a0e1Var;
                        j7 = j4;
                        j8 = jK2;
                        j9 = jK;
                        i29 = i;
                        z3 = z;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                    }
                }
                i7 |= 3072;
                jK = j2;
                i12 = i7 | 24576;
                i13 = i6 & 32;
                if (i13 != 0) {
                    if ((196608 & i4) == 0) {
                        if (x340Var2.g(fontWeight)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i12 |= i14;
                    }
                    i15 = i12 | 1572864;
                    i16 = i6 & 128;
                    if (i16 != 0) {
                        i15 = i12 | 14155776;
                        jK2 = j3;
                    } else {
                        jK2 = j3;
                        if ((12582912 & i4) == 0) {
                            if (x340Var2.f(jK2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i15 |= i17;
                        }
                    }
                    i18 = i15 | 100663296;
                    i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                    if (i19 != 0) {
                        i18 = i15 | 905969664;
                    } else if ((i4 & 805306368) == 0) {
                        if (x340Var2.g(a0e1Var)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i18 |= i20;
                    }
                    i21 = i18;
                    i22 = i6 & 1024;
                    if (i22 != 0) {
                        i23 = i22;
                        i24 = 6;
                    } else {
                        i23 = i22;
                        if ((i5 & 6) == 0) {
                            if (x340Var2.f(j4)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                    }
                    i26 = i24 | 748976;
                    if ((i21 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (x340Var2.Y(i21 & 1, z2)) {
                        x340Var2.d0();
                        if ((i4 & 1) != 0) {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i8 != 0) {
                                int i310 = u7h.l;
                                jP = nfb.p();
                            } else {
                                jP = j5;
                            }
                            if (i10 != 0) {
                                wee1[] wee1VarArr10 = TextUnit.b;
                                jK = f7p1.k();
                            }
                            if (i13 != 0) {
                                fontWeight3 = null;
                            } else {
                                fontWeight3 = fontWeight;
                            }
                            if (i16 != 0) {
                                wee1[] wee1VarArr11 = TextUnit.b;
                                jK2 = f7p1.k();
                            }
                            if (i19 == 0) {
                            }
                            if (i23 != 0) {
                                wee1[] wee1VarArr12 = TextUnit.b;
                                jK3 = f7p1.k();
                            } else {
                                jK3 = j4;
                            }
                            qim0Var5 = qim0Var4;
                            i30 = i26 & (-3670017);
                            i31 = 1;
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i32 = Integer.MAX_VALUE;
                            i33 = 1;
                            z4 = true;
                            a0e1Var3 = a0e1Var4;
                            fontWeight4 = fontWeight3;
                            j10 = jK2;
                            j11 = jP;
                            j12 = jK;
                            j13 = jK3;
                        } else {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i8 != 0) {
                                int i311 = u7h.l;
                                jP = nfb.p();
                            } else {
                                jP = j5;
                            }
                            if (i10 != 0) {
                                wee1[] wee1VarArr13 = TextUnit.b;
                                jK = f7p1.k();
                            }
                            if (i13 != 0) {
                                fontWeight3 = null;
                            } else {
                                fontWeight3 = fontWeight;
                            }
                            if (i16 != 0) {
                                wee1[] wee1VarArr14 = TextUnit.b;
                                jK2 = f7p1.k();
                            }
                            if (i19 == 0) {
                            }
                            if (i23 != 0) {
                                wee1[] wee1VarArr15 = TextUnit.b;
                                jK3 = f7p1.k();
                            } else {
                                jK3 = j4;
                            }
                            qim0Var5 = qim0Var4;
                            i30 = i26 & (-3670017);
                            i31 = 1;
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i32 = Integer.MAX_VALUE;
                            i33 = 1;
                            z4 = true;
                            a0e1Var3 = a0e1Var4;
                            fontWeight4 = fontWeight3;
                            j10 = jK2;
                            j11 = jP;
                            j12 = jK;
                            j13 = jK3;
                        }
                        x340Var2.s();
                        int i312 = i21 << 3;
                        x340Var = x340Var2;
                        c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i312 & 57344) | (i312 & 458752) | (i312 & 3670016) | (i312 & 29360128) | (i312 & 234881024) | (i312 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                        qim0Var3 = qim0Var5;
                        j6 = j11;
                        j9 = j12;
                        fontWeight2 = fontWeight4;
                        j8 = j10;
                        a0e1Var2 = a0e1Var3;
                        j7 = j13;
                        i29 = i33;
                        z3 = z4;
                        i27 = i32;
                        i28 = i31;
                        lee1Var2 = lee1Var3;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        fontWeight2 = fontWeight;
                        i27 = i2;
                        i28 = i3;
                        lee1Var2 = lee1Var;
                        qim0Var3 = qim0Var2;
                        j6 = j5;
                        a0e1Var2 = a0e1Var;
                        j7 = j4;
                        j8 = jK2;
                        j9 = jK;
                        i29 = i;
                        z3 = z;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                    }
                }
                i12 = 221184 | i7;
                i15 = i12 | 1572864;
                i16 = i6 & 128;
                if (i16 != 0) {
                    i15 = i12 | 14155776;
                    jK2 = j3;
                } else {
                    jK2 = j3;
                    if ((12582912 & i4) == 0) {
                        if (x340Var2.f(jK2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i15 |= i17;
                    }
                }
                i18 = i15 | 100663296;
                i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                if (i19 != 0) {
                    i18 = i15 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if (x340Var2.g(a0e1Var)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i18 |= i20;
                }
                i21 = i18;
                i22 = i6 & 1024;
                if (i22 != 0) {
                    i23 = i22;
                    i24 = 6;
                } else {
                    i23 = i22;
                    if ((i5 & 6) == 0) {
                        if (x340Var2.f(j4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                }
                i26 = i24 | 748976;
                if ((i21 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i21 & 1, z2)) {
                    x340Var2.d0();
                    if ((i4 & 1) != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i313 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr16 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr17 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr18 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i314 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr19 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr110 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr111 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    }
                    x340Var2.s();
                    int i315 = i21 << 3;
                    x340Var = x340Var2;
                    c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i315 & 57344) | (i315 & 458752) | (i315 & 3670016) | (i315 & 29360128) | (i315 & 234881024) | (i315 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                    qim0Var3 = qim0Var5;
                    j6 = j11;
                    j9 = j12;
                    fontWeight2 = fontWeight4;
                    j8 = j10;
                    a0e1Var2 = a0e1Var3;
                    j7 = j13;
                    i29 = i33;
                    z3 = z4;
                    i27 = i32;
                    i28 = i31;
                    lee1Var2 = lee1Var3;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    fontWeight2 = fontWeight;
                    i27 = i2;
                    i28 = i3;
                    lee1Var2 = lee1Var;
                    qim0Var3 = qim0Var2;
                    j6 = j5;
                    a0e1Var2 = a0e1Var;
                    j7 = j4;
                    j8 = jK2;
                    j9 = jK;
                    i29 = i;
                    z3 = z;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                }
            }
            i7 |= 384;
            j5 = j;
            i10 = i6 & 8;
            if (i10 != 0) {
                if ((i4 & 3072) == 0) {
                    jK = j2;
                    if (x340Var2.f(jK)) {
                        i11 = 2048;
                    } else {
                        i11 = 1024;
                    }
                    i7 |= i11;
                }
                i12 = i7 | 24576;
                i13 = i6 & 32;
                if (i13 != 0) {
                    if ((196608 & i4) == 0) {
                        if (x340Var2.g(fontWeight)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i12 |= i14;
                    }
                    i15 = i12 | 1572864;
                    i16 = i6 & 128;
                    if (i16 != 0) {
                        i15 = i12 | 14155776;
                        jK2 = j3;
                    } else {
                        jK2 = j3;
                        if ((12582912 & i4) == 0) {
                            if (x340Var2.f(jK2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i15 |= i17;
                        }
                    }
                    i18 = i15 | 100663296;
                    i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                    if (i19 != 0) {
                        i18 = i15 | 905969664;
                    } else if ((i4 & 805306368) == 0) {
                        if (x340Var2.g(a0e1Var)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i18 |= i20;
                    }
                    i21 = i18;
                    i22 = i6 & 1024;
                    if (i22 != 0) {
                        i23 = i22;
                        i24 = 6;
                    } else {
                        i23 = i22;
                        if ((i5 & 6) == 0) {
                            if (x340Var2.f(j4)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                    }
                    i26 = i24 | 748976;
                    if ((i21 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (x340Var2.Y(i21 & 1, z2)) {
                        x340Var2.d0();
                        if ((i4 & 1) != 0) {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i8 != 0) {
                                int i316 = u7h.l;
                                jP = nfb.p();
                            } else {
                                jP = j5;
                            }
                            if (i10 != 0) {
                                wee1[] wee1VarArr112 = TextUnit.b;
                                jK = f7p1.k();
                            }
                            if (i13 != 0) {
                                fontWeight3 = null;
                            } else {
                                fontWeight3 = fontWeight;
                            }
                            if (i16 != 0) {
                                wee1[] wee1VarArr113 = TextUnit.b;
                                jK2 = f7p1.k();
                            }
                            if (i19 == 0) {
                            }
                            if (i23 != 0) {
                                wee1[] wee1VarArr114 = TextUnit.b;
                                jK3 = f7p1.k();
                            } else {
                                jK3 = j4;
                            }
                            qim0Var5 = qim0Var4;
                            i30 = i26 & (-3670017);
                            i31 = 1;
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i32 = Integer.MAX_VALUE;
                            i33 = 1;
                            z4 = true;
                            a0e1Var3 = a0e1Var4;
                            fontWeight4 = fontWeight3;
                            j10 = jK2;
                            j11 = jP;
                            j12 = jK;
                            j13 = jK3;
                        } else {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i8 != 0) {
                                int i317 = u7h.l;
                                jP = nfb.p();
                            } else {
                                jP = j5;
                            }
                            if (i10 != 0) {
                                wee1[] wee1VarArr115 = TextUnit.b;
                                jK = f7p1.k();
                            }
                            if (i13 != 0) {
                                fontWeight3 = null;
                            } else {
                                fontWeight3 = fontWeight;
                            }
                            if (i16 != 0) {
                                wee1[] wee1VarArr116 = TextUnit.b;
                                jK2 = f7p1.k();
                            }
                            if (i19 == 0) {
                            }
                            if (i23 != 0) {
                                wee1[] wee1VarArr117 = TextUnit.b;
                                jK3 = f7p1.k();
                            } else {
                                jK3 = j4;
                            }
                            qim0Var5 = qim0Var4;
                            i30 = i26 & (-3670017);
                            i31 = 1;
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i32 = Integer.MAX_VALUE;
                            i33 = 1;
                            z4 = true;
                            a0e1Var3 = a0e1Var4;
                            fontWeight4 = fontWeight3;
                            j10 = jK2;
                            j11 = jP;
                            j12 = jK;
                            j13 = jK3;
                        }
                        x340Var2.s();
                        int i318 = i21 << 3;
                        x340Var = x340Var2;
                        c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i318 & 57344) | (i318 & 458752) | (i318 & 3670016) | (i318 & 29360128) | (i318 & 234881024) | (i318 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                        qim0Var3 = qim0Var5;
                        j6 = j11;
                        j9 = j12;
                        fontWeight2 = fontWeight4;
                        j8 = j10;
                        a0e1Var2 = a0e1Var3;
                        j7 = j13;
                        i29 = i33;
                        z3 = z4;
                        i27 = i32;
                        i28 = i31;
                        lee1Var2 = lee1Var3;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        fontWeight2 = fontWeight;
                        i27 = i2;
                        i28 = i3;
                        lee1Var2 = lee1Var;
                        qim0Var3 = qim0Var2;
                        j6 = j5;
                        a0e1Var2 = a0e1Var;
                        j7 = j4;
                        j8 = jK2;
                        j9 = jK;
                        i29 = i;
                        z3 = z;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                    }
                }
                i12 = 221184 | i7;
                i15 = i12 | 1572864;
                i16 = i6 & 128;
                if (i16 != 0) {
                    i15 = i12 | 14155776;
                    jK2 = j3;
                } else {
                    jK2 = j3;
                    if ((12582912 & i4) == 0) {
                        if (x340Var2.f(jK2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i15 |= i17;
                    }
                }
                i18 = i15 | 100663296;
                i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                if (i19 != 0) {
                    i18 = i15 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if (x340Var2.g(a0e1Var)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i18 |= i20;
                }
                i21 = i18;
                i22 = i6 & 1024;
                if (i22 != 0) {
                    i23 = i22;
                    i24 = 6;
                } else {
                    i23 = i22;
                    if ((i5 & 6) == 0) {
                        if (x340Var2.f(j4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                }
                i26 = i24 | 748976;
                if ((i21 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i21 & 1, z2)) {
                    x340Var2.d0();
                    if ((i4 & 1) != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i319 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr118 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr119 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr1110 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i3110 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr1111 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr1112 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr1113 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    }
                    x340Var2.s();
                    int i3111 = i21 << 3;
                    x340Var = x340Var2;
                    c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i3111 & 57344) | (i3111 & 458752) | (i3111 & 3670016) | (i3111 & 29360128) | (i3111 & 234881024) | (i3111 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                    qim0Var3 = qim0Var5;
                    j6 = j11;
                    j9 = j12;
                    fontWeight2 = fontWeight4;
                    j8 = j10;
                    a0e1Var2 = a0e1Var3;
                    j7 = j13;
                    i29 = i33;
                    z3 = z4;
                    i27 = i32;
                    i28 = i31;
                    lee1Var2 = lee1Var3;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    fontWeight2 = fontWeight;
                    i27 = i2;
                    i28 = i3;
                    lee1Var2 = lee1Var;
                    qim0Var3 = qim0Var2;
                    j6 = j5;
                    a0e1Var2 = a0e1Var;
                    j7 = j4;
                    j8 = jK2;
                    j9 = jK;
                    i29 = i;
                    z3 = z;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                }
            }
            i7 |= 3072;
            jK = j2;
            i12 = i7 | 24576;
            i13 = i6 & 32;
            if (i13 != 0) {
                if ((196608 & i4) == 0) {
                    if (x340Var2.g(fontWeight)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i12 | 1572864;
                i16 = i6 & 128;
                if (i16 != 0) {
                    i15 = i12 | 14155776;
                    jK2 = j3;
                } else {
                    jK2 = j3;
                    if ((12582912 & i4) == 0) {
                        if (x340Var2.f(jK2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i15 |= i17;
                    }
                }
                i18 = i15 | 100663296;
                i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                if (i19 != 0) {
                    i18 = i15 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if (x340Var2.g(a0e1Var)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i18 |= i20;
                }
                i21 = i18;
                i22 = i6 & 1024;
                if (i22 != 0) {
                    i23 = i22;
                    i24 = 6;
                } else {
                    i23 = i22;
                    if ((i5 & 6) == 0) {
                        if (x340Var2.f(j4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                }
                i26 = i24 | 748976;
                if ((i21 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i21 & 1, z2)) {
                    x340Var2.d0();
                    if ((i4 & 1) != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i3112 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr1114 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr1115 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr1116 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i3113 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr1117 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr1118 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr1119 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    }
                    x340Var2.s();
                    int i3114 = i21 << 3;
                    x340Var = x340Var2;
                    c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i3114 & 57344) | (i3114 & 458752) | (i3114 & 3670016) | (i3114 & 29360128) | (i3114 & 234881024) | (i3114 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                    qim0Var3 = qim0Var5;
                    j6 = j11;
                    j9 = j12;
                    fontWeight2 = fontWeight4;
                    j8 = j10;
                    a0e1Var2 = a0e1Var3;
                    j7 = j13;
                    i29 = i33;
                    z3 = z4;
                    i27 = i32;
                    i28 = i31;
                    lee1Var2 = lee1Var3;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    fontWeight2 = fontWeight;
                    i27 = i2;
                    i28 = i3;
                    lee1Var2 = lee1Var;
                    qim0Var3 = qim0Var2;
                    j6 = j5;
                    a0e1Var2 = a0e1Var;
                    j7 = j4;
                    j8 = jK2;
                    j9 = jK;
                    i29 = i;
                    z3 = z;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                }
            }
            i12 = 221184 | i7;
            i15 = i12 | 1572864;
            i16 = i6 & 128;
            if (i16 != 0) {
                i15 = i12 | 14155776;
                jK2 = j3;
            } else {
                jK2 = j3;
                if ((12582912 & i4) == 0) {
                    if (x340Var2.f(jK2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i15 | 100663296;
            i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
            if (i19 != 0) {
                i18 = i15 | 905969664;
            } else if ((i4 & 805306368) == 0) {
                if (x340Var2.g(a0e1Var)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i18 |= i20;
            }
            i21 = i18;
            i22 = i6 & 1024;
            if (i22 != 0) {
                i23 = i22;
                i24 = 6;
            } else {
                i23 = i22;
                if ((i5 & 6) == 0) {
                    if (x340Var2.f(j4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
            }
            i26 = i24 | 748976;
            if ((i21 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i21 & 1, z2)) {
                x340Var2.d0();
                if ((i4 & 1) != 0) {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        int i3115 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j5;
                    }
                    if (i10 != 0) {
                        wee1[] wee1VarArr11110 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i13 != 0) {
                        fontWeight3 = null;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    if (i16 != 0) {
                        wee1[] wee1VarArr11111 = TextUnit.b;
                        jK2 = f7p1.k();
                    }
                    if (i19 == 0) {
                    }
                    if (i23 != 0) {
                        wee1[] wee1VarArr11112 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    qim0Var5 = qim0Var4;
                    i30 = i26 & (-3670017);
                    i31 = 1;
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i32 = Integer.MAX_VALUE;
                    i33 = 1;
                    z4 = true;
                    a0e1Var3 = a0e1Var4;
                    fontWeight4 = fontWeight3;
                    j10 = jK2;
                    j11 = jP;
                    j12 = jK;
                    j13 = jK3;
                } else {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        int i3116 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j5;
                    }
                    if (i10 != 0) {
                        wee1[] wee1VarArr11113 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i13 != 0) {
                        fontWeight3 = null;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    if (i16 != 0) {
                        wee1[] wee1VarArr11114 = TextUnit.b;
                        jK2 = f7p1.k();
                    }
                    if (i19 == 0) {
                    }
                    if (i23 != 0) {
                        wee1[] wee1VarArr11115 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    qim0Var5 = qim0Var4;
                    i30 = i26 & (-3670017);
                    i31 = 1;
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i32 = Integer.MAX_VALUE;
                    i33 = 1;
                    z4 = true;
                    a0e1Var3 = a0e1Var4;
                    fontWeight4 = fontWeight3;
                    j10 = jK2;
                    j11 = jP;
                    j12 = jK;
                    j13 = jK3;
                }
                x340Var2.s();
                int i3117 = i21 << 3;
                x340Var = x340Var2;
                c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i3117 & 57344) | (i3117 & 458752) | (i3117 & 3670016) | (i3117 & 29360128) | (i3117 & 234881024) | (i3117 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                qim0Var3 = qim0Var5;
                j6 = j11;
                j9 = j12;
                fontWeight2 = fontWeight4;
                j8 = j10;
                a0e1Var2 = a0e1Var3;
                j7 = j13;
                i29 = i33;
                z3 = z4;
                i27 = i32;
                i28 = i31;
                lee1Var2 = lee1Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                fontWeight2 = fontWeight;
                i27 = i2;
                i28 = i3;
                lee1Var2 = lee1Var;
                qim0Var3 = qim0Var2;
                j6 = j5;
                a0e1Var2 = a0e1Var;
                j7 = j4;
                j8 = jK2;
                j9 = jK;
                i29 = i;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
            }
        }
        i7 |= 48;
        qim0Var2 = qim0Var;
        i8 = i6 & 4;
        if (i8 != 0) {
            if ((i4 & 384) == 0) {
                j5 = j;
                if (x340Var2.f(j5)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i7 |= i9;
            }
            i10 = i6 & 8;
            if (i10 != 0) {
                if ((i4 & 3072) == 0) {
                    jK = j2;
                    if (x340Var2.f(jK)) {
                        i11 = 2048;
                    } else {
                        i11 = 1024;
                    }
                    i7 |= i11;
                }
                i12 = i7 | 24576;
                i13 = i6 & 32;
                if (i13 != 0) {
                    if ((196608 & i4) == 0) {
                        if (x340Var2.g(fontWeight)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i12 |= i14;
                    }
                    i15 = i12 | 1572864;
                    i16 = i6 & 128;
                    if (i16 != 0) {
                        i15 = i12 | 14155776;
                        jK2 = j3;
                    } else {
                        jK2 = j3;
                        if ((12582912 & i4) == 0) {
                            if (x340Var2.f(jK2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i15 |= i17;
                        }
                    }
                    i18 = i15 | 100663296;
                    i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                    if (i19 != 0) {
                        i18 = i15 | 905969664;
                    } else if ((i4 & 805306368) == 0) {
                        if (x340Var2.g(a0e1Var)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i18 |= i20;
                    }
                    i21 = i18;
                    i22 = i6 & 1024;
                    if (i22 != 0) {
                        i23 = i22;
                        i24 = 6;
                    } else {
                        i23 = i22;
                        if ((i5 & 6) == 0) {
                            if (x340Var2.f(j4)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                    }
                    i26 = i24 | 748976;
                    if ((i21 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (x340Var2.Y(i21 & 1, z2)) {
                        x340Var2.d0();
                        if ((i4 & 1) != 0) {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i8 != 0) {
                                int i3118 = u7h.l;
                                jP = nfb.p();
                            } else {
                                jP = j5;
                            }
                            if (i10 != 0) {
                                wee1[] wee1VarArr11116 = TextUnit.b;
                                jK = f7p1.k();
                            }
                            if (i13 != 0) {
                                fontWeight3 = null;
                            } else {
                                fontWeight3 = fontWeight;
                            }
                            if (i16 != 0) {
                                wee1[] wee1VarArr11117 = TextUnit.b;
                                jK2 = f7p1.k();
                            }
                            if (i19 == 0) {
                            }
                            if (i23 != 0) {
                                wee1[] wee1VarArr11118 = TextUnit.b;
                                jK3 = f7p1.k();
                            } else {
                                jK3 = j4;
                            }
                            qim0Var5 = qim0Var4;
                            i30 = i26 & (-3670017);
                            i31 = 1;
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i32 = Integer.MAX_VALUE;
                            i33 = 1;
                            z4 = true;
                            a0e1Var3 = a0e1Var4;
                            fontWeight4 = fontWeight3;
                            j10 = jK2;
                            j11 = jP;
                            j12 = jK;
                            j13 = jK3;
                        } else {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i8 != 0) {
                                int i3119 = u7h.l;
                                jP = nfb.p();
                            } else {
                                jP = j5;
                            }
                            if (i10 != 0) {
                                wee1[] wee1VarArr11119 = TextUnit.b;
                                jK = f7p1.k();
                            }
                            if (i13 != 0) {
                                fontWeight3 = null;
                            } else {
                                fontWeight3 = fontWeight;
                            }
                            if (i16 != 0) {
                                wee1[] wee1VarArr111110 = TextUnit.b;
                                jK2 = f7p1.k();
                            }
                            if (i19 == 0) {
                            }
                            if (i23 != 0) {
                                wee1[] wee1VarArr111111 = TextUnit.b;
                                jK3 = f7p1.k();
                            } else {
                                jK3 = j4;
                            }
                            qim0Var5 = qim0Var4;
                            i30 = i26 & (-3670017);
                            i31 = 1;
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i32 = Integer.MAX_VALUE;
                            i33 = 1;
                            z4 = true;
                            a0e1Var3 = a0e1Var4;
                            fontWeight4 = fontWeight3;
                            j10 = jK2;
                            j11 = jP;
                            j12 = jK;
                            j13 = jK3;
                        }
                        x340Var2.s();
                        int i31110 = i21 << 3;
                        x340Var = x340Var2;
                        c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i31110 & 57344) | (i31110 & 458752) | (i31110 & 3670016) | (i31110 & 29360128) | (i31110 & 234881024) | (i31110 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                        qim0Var3 = qim0Var5;
                        j6 = j11;
                        j9 = j12;
                        fontWeight2 = fontWeight4;
                        j8 = j10;
                        a0e1Var2 = a0e1Var3;
                        j7 = j13;
                        i29 = i33;
                        z3 = z4;
                        i27 = i32;
                        i28 = i31;
                        lee1Var2 = lee1Var3;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        fontWeight2 = fontWeight;
                        i27 = i2;
                        i28 = i3;
                        lee1Var2 = lee1Var;
                        qim0Var3 = qim0Var2;
                        j6 = j5;
                        a0e1Var2 = a0e1Var;
                        j7 = j4;
                        j8 = jK2;
                        j9 = jK;
                        i29 = i;
                        z3 = z;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                    }
                }
                i12 = 221184 | i7;
                i15 = i12 | 1572864;
                i16 = i6 & 128;
                if (i16 != 0) {
                    i15 = i12 | 14155776;
                    jK2 = j3;
                } else {
                    jK2 = j3;
                    if ((12582912 & i4) == 0) {
                        if (x340Var2.f(jK2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i15 |= i17;
                    }
                }
                i18 = i15 | 100663296;
                i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                if (i19 != 0) {
                    i18 = i15 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if (x340Var2.g(a0e1Var)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i18 |= i20;
                }
                i21 = i18;
                i22 = i6 & 1024;
                if (i22 != 0) {
                    i23 = i22;
                    i24 = 6;
                } else {
                    i23 = i22;
                    if ((i5 & 6) == 0) {
                        if (x340Var2.f(j4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                }
                i26 = i24 | 748976;
                if ((i21 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i21 & 1, z2)) {
                    x340Var2.d0();
                    if ((i4 & 1) != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i31111 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr111112 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr111113 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr111114 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i31112 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr111115 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr111116 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr111117 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    }
                    x340Var2.s();
                    int i31113 = i21 << 3;
                    x340Var = x340Var2;
                    c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i31113 & 57344) | (i31113 & 458752) | (i31113 & 3670016) | (i31113 & 29360128) | (i31113 & 234881024) | (i31113 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                    qim0Var3 = qim0Var5;
                    j6 = j11;
                    j9 = j12;
                    fontWeight2 = fontWeight4;
                    j8 = j10;
                    a0e1Var2 = a0e1Var3;
                    j7 = j13;
                    i29 = i33;
                    z3 = z4;
                    i27 = i32;
                    i28 = i31;
                    lee1Var2 = lee1Var3;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    fontWeight2 = fontWeight;
                    i27 = i2;
                    i28 = i3;
                    lee1Var2 = lee1Var;
                    qim0Var3 = qim0Var2;
                    j6 = j5;
                    a0e1Var2 = a0e1Var;
                    j7 = j4;
                    j8 = jK2;
                    j9 = jK;
                    i29 = i;
                    z3 = z;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                }
            }
            i7 |= 3072;
            jK = j2;
            i12 = i7 | 24576;
            i13 = i6 & 32;
            if (i13 != 0) {
                if ((196608 & i4) == 0) {
                    if (x340Var2.g(fontWeight)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i12 | 1572864;
                i16 = i6 & 128;
                if (i16 != 0) {
                    i15 = i12 | 14155776;
                    jK2 = j3;
                } else {
                    jK2 = j3;
                    if ((12582912 & i4) == 0) {
                        if (x340Var2.f(jK2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i15 |= i17;
                    }
                }
                i18 = i15 | 100663296;
                i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                if (i19 != 0) {
                    i18 = i15 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if (x340Var2.g(a0e1Var)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i18 |= i20;
                }
                i21 = i18;
                i22 = i6 & 1024;
                if (i22 != 0) {
                    i23 = i22;
                    i24 = 6;
                } else {
                    i23 = i22;
                    if ((i5 & 6) == 0) {
                        if (x340Var2.f(j4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                }
                i26 = i24 | 748976;
                if ((i21 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i21 & 1, z2)) {
                    x340Var2.d0();
                    if ((i4 & 1) != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i31114 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr111118 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr111119 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr1111110 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i31115 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr1111111 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr1111112 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr1111113 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    }
                    x340Var2.s();
                    int i31116 = i21 << 3;
                    x340Var = x340Var2;
                    c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i31116 & 57344) | (i31116 & 458752) | (i31116 & 3670016) | (i31116 & 29360128) | (i31116 & 234881024) | (i31116 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                    qim0Var3 = qim0Var5;
                    j6 = j11;
                    j9 = j12;
                    fontWeight2 = fontWeight4;
                    j8 = j10;
                    a0e1Var2 = a0e1Var3;
                    j7 = j13;
                    i29 = i33;
                    z3 = z4;
                    i27 = i32;
                    i28 = i31;
                    lee1Var2 = lee1Var3;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    fontWeight2 = fontWeight;
                    i27 = i2;
                    i28 = i3;
                    lee1Var2 = lee1Var;
                    qim0Var3 = qim0Var2;
                    j6 = j5;
                    a0e1Var2 = a0e1Var;
                    j7 = j4;
                    j8 = jK2;
                    j9 = jK;
                    i29 = i;
                    z3 = z;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                }
            }
            i12 = 221184 | i7;
            i15 = i12 | 1572864;
            i16 = i6 & 128;
            if (i16 != 0) {
                i15 = i12 | 14155776;
                jK2 = j3;
            } else {
                jK2 = j3;
                if ((12582912 & i4) == 0) {
                    if (x340Var2.f(jK2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i15 | 100663296;
            i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
            if (i19 != 0) {
                i18 = i15 | 905969664;
            } else if ((i4 & 805306368) == 0) {
                if (x340Var2.g(a0e1Var)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i18 |= i20;
            }
            i21 = i18;
            i22 = i6 & 1024;
            if (i22 != 0) {
                i23 = i22;
                i24 = 6;
            } else {
                i23 = i22;
                if ((i5 & 6) == 0) {
                    if (x340Var2.f(j4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
            }
            i26 = i24 | 748976;
            if ((i21 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i21 & 1, z2)) {
                x340Var2.d0();
                if ((i4 & 1) != 0) {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        int i31117 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j5;
                    }
                    if (i10 != 0) {
                        wee1[] wee1VarArr1111114 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i13 != 0) {
                        fontWeight3 = null;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    if (i16 != 0) {
                        wee1[] wee1VarArr1111115 = TextUnit.b;
                        jK2 = f7p1.k();
                    }
                    if (i19 == 0) {
                    }
                    if (i23 != 0) {
                        wee1[] wee1VarArr1111116 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    qim0Var5 = qim0Var4;
                    i30 = i26 & (-3670017);
                    i31 = 1;
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i32 = Integer.MAX_VALUE;
                    i33 = 1;
                    z4 = true;
                    a0e1Var3 = a0e1Var4;
                    fontWeight4 = fontWeight3;
                    j10 = jK2;
                    j11 = jP;
                    j12 = jK;
                    j13 = jK3;
                } else {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        int i31118 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j5;
                    }
                    if (i10 != 0) {
                        wee1[] wee1VarArr1111117 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i13 != 0) {
                        fontWeight3 = null;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    if (i16 != 0) {
                        wee1[] wee1VarArr1111118 = TextUnit.b;
                        jK2 = f7p1.k();
                    }
                    if (i19 == 0) {
                    }
                    if (i23 != 0) {
                        wee1[] wee1VarArr1111119 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    qim0Var5 = qim0Var4;
                    i30 = i26 & (-3670017);
                    i31 = 1;
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i32 = Integer.MAX_VALUE;
                    i33 = 1;
                    z4 = true;
                    a0e1Var3 = a0e1Var4;
                    fontWeight4 = fontWeight3;
                    j10 = jK2;
                    j11 = jP;
                    j12 = jK;
                    j13 = jK3;
                }
                x340Var2.s();
                int i31119 = i21 << 3;
                x340Var = x340Var2;
                c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i31119 & 57344) | (i31119 & 458752) | (i31119 & 3670016) | (i31119 & 29360128) | (i31119 & 234881024) | (i31119 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                qim0Var3 = qim0Var5;
                j6 = j11;
                j9 = j12;
                fontWeight2 = fontWeight4;
                j8 = j10;
                a0e1Var2 = a0e1Var3;
                j7 = j13;
                i29 = i33;
                z3 = z4;
                i27 = i32;
                i28 = i31;
                lee1Var2 = lee1Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                fontWeight2 = fontWeight;
                i27 = i2;
                i28 = i3;
                lee1Var2 = lee1Var;
                qim0Var3 = qim0Var2;
                j6 = j5;
                a0e1Var2 = a0e1Var;
                j7 = j4;
                j8 = jK2;
                j9 = jK;
                i29 = i;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
            }
        }
        i7 |= 384;
        j5 = j;
        i10 = i6 & 8;
        if (i10 != 0) {
            if ((i4 & 3072) == 0) {
                jK = j2;
                if (x340Var2.f(jK)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i7 |= i11;
            }
            i12 = i7 | 24576;
            i13 = i6 & 32;
            if (i13 != 0) {
                if ((196608 & i4) == 0) {
                    if (x340Var2.g(fontWeight)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i12 | 1572864;
                i16 = i6 & 128;
                if (i16 != 0) {
                    i15 = i12 | 14155776;
                    jK2 = j3;
                } else {
                    jK2 = j3;
                    if ((12582912 & i4) == 0) {
                        if (x340Var2.f(jK2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i15 |= i17;
                    }
                }
                i18 = i15 | 100663296;
                i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                if (i19 != 0) {
                    i18 = i15 | 905969664;
                } else if ((i4 & 805306368) == 0) {
                    if (x340Var2.g(a0e1Var)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i18 |= i20;
                }
                i21 = i18;
                i22 = i6 & 1024;
                if (i22 != 0) {
                    i23 = i22;
                    i24 = 6;
                } else {
                    i23 = i22;
                    if ((i5 & 6) == 0) {
                        if (x340Var2.f(j4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                }
                i26 = i24 | 748976;
                if ((i21 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i21 & 1, z2)) {
                    x340Var2.d0();
                    if ((i4 & 1) != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i311110 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr11111110 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr11111111 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr11111112 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            int i311111 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j5;
                        }
                        if (i10 != 0) {
                            wee1[] wee1VarArr11111113 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i13 != 0) {
                            fontWeight3 = null;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        if (i16 != 0) {
                            wee1[] wee1VarArr11111114 = TextUnit.b;
                            jK2 = f7p1.k();
                        }
                        if (i19 == 0) {
                        }
                        if (i23 != 0) {
                            wee1[] wee1VarArr11111115 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        qim0Var5 = qim0Var4;
                        i30 = i26 & (-3670017);
                        i31 = 1;
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i32 = Integer.MAX_VALUE;
                        i33 = 1;
                        z4 = true;
                        a0e1Var3 = a0e1Var4;
                        fontWeight4 = fontWeight3;
                        j10 = jK2;
                        j11 = jP;
                        j12 = jK;
                        j13 = jK3;
                    }
                    x340Var2.s();
                    int i311112 = i21 << 3;
                    x340Var = x340Var2;
                    c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i311112 & 57344) | (i311112 & 458752) | (i311112 & 3670016) | (i311112 & 29360128) | (i311112 & 234881024) | (i311112 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                    qim0Var3 = qim0Var5;
                    j6 = j11;
                    j9 = j12;
                    fontWeight2 = fontWeight4;
                    j8 = j10;
                    a0e1Var2 = a0e1Var3;
                    j7 = j13;
                    i29 = i33;
                    z3 = z4;
                    i27 = i32;
                    i28 = i31;
                    lee1Var2 = lee1Var3;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    fontWeight2 = fontWeight;
                    i27 = i2;
                    i28 = i3;
                    lee1Var2 = lee1Var;
                    qim0Var3 = qim0Var2;
                    j6 = j5;
                    a0e1Var2 = a0e1Var;
                    j7 = j4;
                    j8 = jK2;
                    j9 = jK;
                    i29 = i;
                    z3 = z;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
                }
            }
            i12 = 221184 | i7;
            i15 = i12 | 1572864;
            i16 = i6 & 128;
            if (i16 != 0) {
                i15 = i12 | 14155776;
                jK2 = j3;
            } else {
                jK2 = j3;
                if ((12582912 & i4) == 0) {
                    if (x340Var2.f(jK2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i15 | 100663296;
            i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
            if (i19 != 0) {
                i18 = i15 | 905969664;
            } else if ((i4 & 805306368) == 0) {
                if (x340Var2.g(a0e1Var)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i18 |= i20;
            }
            i21 = i18;
            i22 = i6 & 1024;
            if (i22 != 0) {
                i23 = i22;
                i24 = 6;
            } else {
                i23 = i22;
                if ((i5 & 6) == 0) {
                    if (x340Var2.f(j4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
            }
            i26 = i24 | 748976;
            if ((i21 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i21 & 1, z2)) {
                x340Var2.d0();
                if ((i4 & 1) != 0) {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        int i311113 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j5;
                    }
                    if (i10 != 0) {
                        wee1[] wee1VarArr11111116 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i13 != 0) {
                        fontWeight3 = null;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    if (i16 != 0) {
                        wee1[] wee1VarArr11111117 = TextUnit.b;
                        jK2 = f7p1.k();
                    }
                    if (i19 == 0) {
                    }
                    if (i23 != 0) {
                        wee1[] wee1VarArr11111118 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    qim0Var5 = qim0Var4;
                    i30 = i26 & (-3670017);
                    i31 = 1;
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i32 = Integer.MAX_VALUE;
                    i33 = 1;
                    z4 = true;
                    a0e1Var3 = a0e1Var4;
                    fontWeight4 = fontWeight3;
                    j10 = jK2;
                    j11 = jP;
                    j12 = jK;
                    j13 = jK3;
                } else {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        int i311114 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j5;
                    }
                    if (i10 != 0) {
                        wee1[] wee1VarArr11111119 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i13 != 0) {
                        fontWeight3 = null;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    if (i16 != 0) {
                        wee1[] wee1VarArr111111110 = TextUnit.b;
                        jK2 = f7p1.k();
                    }
                    if (i19 == 0) {
                    }
                    if (i23 != 0) {
                        wee1[] wee1VarArr111111111 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    qim0Var5 = qim0Var4;
                    i30 = i26 & (-3670017);
                    i31 = 1;
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i32 = Integer.MAX_VALUE;
                    i33 = 1;
                    z4 = true;
                    a0e1Var3 = a0e1Var4;
                    fontWeight4 = fontWeight3;
                    j10 = jK2;
                    j11 = jP;
                    j12 = jK;
                    j13 = jK3;
                }
                x340Var2.s();
                int i311115 = i21 << 3;
                x340Var = x340Var2;
                c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i311115 & 57344) | (i311115 & 458752) | (i311115 & 3670016) | (i311115 & 29360128) | (i311115 & 234881024) | (i311115 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                qim0Var3 = qim0Var5;
                j6 = j11;
                j9 = j12;
                fontWeight2 = fontWeight4;
                j8 = j10;
                a0e1Var2 = a0e1Var3;
                j7 = j13;
                i29 = i33;
                z3 = z4;
                i27 = i32;
                i28 = i31;
                lee1Var2 = lee1Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                fontWeight2 = fontWeight;
                i27 = i2;
                i28 = i3;
                lee1Var2 = lee1Var;
                qim0Var3 = qim0Var2;
                j6 = j5;
                a0e1Var2 = a0e1Var;
                j7 = j4;
                j8 = jK2;
                j9 = jK;
                i29 = i;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
            }
        }
        i7 |= 3072;
        jK = j2;
        i12 = i7 | 24576;
        i13 = i6 & 32;
        if (i13 != 0) {
            if ((196608 & i4) == 0) {
                if (x340Var2.g(fontWeight)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            i15 = i12 | 1572864;
            i16 = i6 & 128;
            if (i16 != 0) {
                i15 = i12 | 14155776;
                jK2 = j3;
            } else {
                jK2 = j3;
                if ((12582912 & i4) == 0) {
                    if (x340Var2.f(jK2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i15 | 100663296;
            i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
            if (i19 != 0) {
                i18 = i15 | 905969664;
            } else if ((i4 & 805306368) == 0) {
                if (x340Var2.g(a0e1Var)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i18 |= i20;
            }
            i21 = i18;
            i22 = i6 & 1024;
            if (i22 != 0) {
                i23 = i22;
                i24 = 6;
            } else {
                i23 = i22;
                if ((i5 & 6) == 0) {
                    if (x340Var2.f(j4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
            }
            i26 = i24 | 748976;
            if ((i21 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i21 & 1, z2)) {
                x340Var2.d0();
                if ((i4 & 1) != 0) {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        int i311116 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j5;
                    }
                    if (i10 != 0) {
                        wee1[] wee1VarArr111111112 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i13 != 0) {
                        fontWeight3 = null;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    if (i16 != 0) {
                        wee1[] wee1VarArr111111113 = TextUnit.b;
                        jK2 = f7p1.k();
                    }
                    if (i19 == 0) {
                    }
                    if (i23 != 0) {
                        wee1[] wee1VarArr111111114 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    qim0Var5 = qim0Var4;
                    i30 = i26 & (-3670017);
                    i31 = 1;
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i32 = Integer.MAX_VALUE;
                    i33 = 1;
                    z4 = true;
                    a0e1Var3 = a0e1Var4;
                    fontWeight4 = fontWeight3;
                    j10 = jK2;
                    j11 = jP;
                    j12 = jK;
                    j13 = jK3;
                } else {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        int i311117 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j5;
                    }
                    if (i10 != 0) {
                        wee1[] wee1VarArr111111115 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i13 != 0) {
                        fontWeight3 = null;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    if (i16 != 0) {
                        wee1[] wee1VarArr111111116 = TextUnit.b;
                        jK2 = f7p1.k();
                    }
                    if (i19 == 0) {
                    }
                    if (i23 != 0) {
                        wee1[] wee1VarArr111111117 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    qim0Var5 = qim0Var4;
                    i30 = i26 & (-3670017);
                    i31 = 1;
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i32 = Integer.MAX_VALUE;
                    i33 = 1;
                    z4 = true;
                    a0e1Var3 = a0e1Var4;
                    fontWeight4 = fontWeight3;
                    j10 = jK2;
                    j11 = jP;
                    j12 = jK;
                    j13 = jK3;
                }
                x340Var2.s();
                int i311118 = i21 << 3;
                x340Var = x340Var2;
                c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i311118 & 57344) | (i311118 & 458752) | (i311118 & 3670016) | (i311118 & 29360128) | (i311118 & 234881024) | (i311118 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
                qim0Var3 = qim0Var5;
                j6 = j11;
                j9 = j12;
                fontWeight2 = fontWeight4;
                j8 = j10;
                a0e1Var2 = a0e1Var3;
                j7 = j13;
                i29 = i33;
                z3 = z4;
                i27 = i32;
                i28 = i31;
                lee1Var2 = lee1Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                fontWeight2 = fontWeight;
                i27 = i2;
                i28 = i3;
                lee1Var2 = lee1Var;
                qim0Var3 = qim0Var2;
                j6 = j5;
                a0e1Var2 = a0e1Var;
                j7 = j4;
                j8 = jK2;
                j9 = jK;
                i29 = i;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
            }
        }
        i12 = 221184 | i7;
        i15 = i12 | 1572864;
        i16 = i6 & 128;
        if (i16 != 0) {
            i15 = i12 | 14155776;
            jK2 = j3;
        } else {
            jK2 = j3;
            if ((12582912 & i4) == 0) {
                if (x340Var2.f(jK2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
        }
        i18 = i15 | 100663296;
        i19 = i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
        if (i19 != 0) {
            i18 = i15 | 905969664;
        } else if ((i4 & 805306368) == 0) {
            if (x340Var2.g(a0e1Var)) {
                i20 = 536870912;
            } else {
                i20 = 268435456;
            }
            i18 |= i20;
        }
        i21 = i18;
        i22 = i6 & 1024;
        if (i22 != 0) {
            i23 = i22;
            i24 = 6;
        } else {
            i23 = i22;
            if ((i5 & 6) == 0) {
                if (x340Var2.f(j4)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
        }
        i26 = i24 | 748976;
        if ((i21 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var2.Y(i21 & 1, z2)) {
            x340Var2.d0();
            if ((i4 & 1) != 0) {
                if (i34 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i8 != 0) {
                    int i311119 = u7h.l;
                    jP = nfb.p();
                } else {
                    jP = j5;
                }
                if (i10 != 0) {
                    wee1[] wee1VarArr111111118 = TextUnit.b;
                    jK = f7p1.k();
                }
                if (i13 != 0) {
                    fontWeight3 = null;
                } else {
                    fontWeight3 = fontWeight;
                }
                if (i16 != 0) {
                    wee1[] wee1VarArr111111119 = TextUnit.b;
                    jK2 = f7p1.k();
                }
                if (i19 == 0) {
                }
                if (i23 != 0) {
                    wee1[] wee1VarArr1111111110 = TextUnit.b;
                    jK3 = f7p1.k();
                } else {
                    jK3 = j4;
                }
                qim0Var5 = qim0Var4;
                i30 = i26 & (-3670017);
                i31 = 1;
                lee1Var3 = (lee1) x340Var2.k(a);
                i32 = Integer.MAX_VALUE;
                i33 = 1;
                z4 = true;
                a0e1Var3 = a0e1Var4;
                fontWeight4 = fontWeight3;
                j10 = jK2;
                j11 = jP;
                j12 = jK;
                j13 = jK3;
            } else {
                if (i34 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i8 != 0) {
                    int i3111110 = u7h.l;
                    jP = nfb.p();
                } else {
                    jP = j5;
                }
                if (i10 != 0) {
                    wee1[] wee1VarArr1111111111 = TextUnit.b;
                    jK = f7p1.k();
                }
                if (i13 != 0) {
                    fontWeight3 = null;
                } else {
                    fontWeight3 = fontWeight;
                }
                if (i16 != 0) {
                    wee1[] wee1VarArr1111111112 = TextUnit.b;
                    jK2 = f7p1.k();
                }
                if (i19 == 0) {
                }
                if (i23 != 0) {
                    wee1[] wee1VarArr1111111113 = TextUnit.b;
                    jK3 = f7p1.k();
                } else {
                    jK3 = j4;
                }
                qim0Var5 = qim0Var4;
                i30 = i26 & (-3670017);
                i31 = 1;
                lee1Var3 = (lee1) x340Var2.k(a);
                i32 = Integer.MAX_VALUE;
                i33 = 1;
                z4 = true;
                a0e1Var3 = a0e1Var4;
                fontWeight4 = fontWeight3;
                j10 = jK2;
                j11 = jP;
                j12 = jK;
                j13 = jK3;
            }
            x340Var2.s();
            int i3111111 = i21 << 3;
            x340Var = x340Var2;
            c(str, qim0Var5, j11, j12, fontWeight4, null, j10, a0e1Var3, j13, i33, z4, i32, i31, lee1Var3, x340Var, (i21 & 896) | (i21 & 14) | 3072 | (i21 & 112) | (i3111111 & 57344) | (i3111111 & 458752) | (i3111111 & 3670016) | (i3111111 & 29360128) | (i3111111 & 234881024) | (i3111111 & 1879048192), ((i21 >> 27) & 14) | ((i30 << 3) & 112) | 1797504, 0);
            qim0Var3 = qim0Var5;
            j6 = j11;
            j9 = j12;
            fontWeight2 = fontWeight4;
            j8 = j10;
            a0e1Var2 = a0e1Var3;
            j7 = j13;
            i29 = i33;
            z3 = z4;
            i27 = i32;
            i28 = i31;
            lee1Var2 = lee1Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            fontWeight2 = fontWeight;
            i27 = i2;
            i28 = i3;
            lee1Var2 = lee1Var;
            qim0Var3 = qim0Var2;
            j6 = j5;
            a0e1Var2 = a0e1Var;
            j7 = j4;
            j8 = jK2;
            j9 = jK;
            i29 = i;
            z3 = z;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m9e1(str, qim0Var3, j6, j9, fontWeight2, j8, a0e1Var2, j7, i29, z3, i27, i28, lee1Var2, i4, i5, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0151  */
    /* JADX WARN: Code duplicated, block: B:114:0x015b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x016a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:129:0x0185  */
    /* JADX WARN: Code duplicated, block: B:131:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0190  */
    /* JADX WARN: Code duplicated, block: B:136:0x019a  */
    /* JADX WARN: Code duplicated, block: B:137:0x019d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:169:0x0201  */
    /* JADX WARN: Code duplicated, block: B:171:0x0207  */
    /* JADX WARN: Code duplicated, block: B:175:0x020f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0215  */
    /* JADX WARN: Code duplicated, block: B:181:0x0220  */
    /* JADX WARN: Code duplicated, block: B:184:0x022f  */
    /* JADX WARN: Code duplicated, block: B:188:0x023c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0246  */
    /* JADX WARN: Code duplicated, block: B:193:0x0250  */
    /* JADX WARN: Code duplicated, block: B:200:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x0276  */
    /* JADX WARN: Code duplicated, block: B:203:0x027b  */
    /* JADX WARN: Code duplicated, block: B:204:0x0282  */
    /* JADX WARN: Code duplicated, block: B:206:0x0286  */
    /* JADX WARN: Code duplicated, block: B:208:0x028e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0291  */
    /* JADX WARN: Code duplicated, block: B:211:0x0293  */
    /* JADX WARN: Code duplicated, block: B:213:0x0297  */
    /* JADX WARN: Code duplicated, block: B:214:0x029e  */
    /* JADX WARN: Code duplicated, block: B:216:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:219:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:220:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:222:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:225:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:227:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:228:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:231:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:236:0x02db  */
    /* JADX WARN: Code duplicated, block: B:239:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:240:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:242:0x0302  */
    /* JADX WARN: Code duplicated, block: B:243:0x0307  */
    /* JADX WARN: Code duplicated, block: B:247:0x031f  */
    /* JADX WARN: Code duplicated, block: B:249:0x039b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:252:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    public static final void c(String str, qim0 qim0Var, long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, a0e1 a0e1Var, long j4, int i, boolean z, int i2, int i3, lee1 lee1Var, b0k b0kVar, int i4, int i5, int i6) {
        int i7;
        qim0 qim0Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        long jK;
        int i12;
        int i13;
        int i14;
        FontWeight fontWeight2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z2;
        x340 x340Var;
        int i38;
        long j5;
        long j6;
        FontFamily fontFamily2;
        long j7;
        boolean z3;
        int i39;
        int i40;
        lee1 lee1Var2;
        qim0 qim0Var3;
        FontWeight fontWeight3;
        a0e1 a0e1Var2;
        long j8;
        h311 h311VarV;
        long jP;
        FontFamily fontFamily3;
        long jK2;
        a0e1 a0e1Var3;
        long jK3;
        boolean z4;
        int i41;
        int i42;
        lee1 lee1Var3;
        a0e1 a0e1Var4;
        long jC;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (x340Var2.g(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i43 = i6 & 2;
        if (i43 == 0) {
            if ((i4 & 48) == 0) {
                qim0Var2 = qim0Var;
                i7 |= x340Var2.g(qim0Var2) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 != 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                if (x340Var2.f(j)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i7 |= i9;
            }
            if ((i6 & 8) != 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                if (x340Var2.i(null)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i7 |= i10;
            }
            i11 = i6 & 16;
            if (i11 != 0) {
                i7 |= 24576;
                jK = j2;
            } else {
                jK = j2;
                if ((i4 & 24576) == 0) {
                    if (x340Var2.f(jK)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i7 |= i12;
                }
            }
            if ((i6 & 32) != 0) {
                i7 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (x340Var2.g(null)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i7 |= i13;
            }
            i14 = i6 & 64;
            if (i14 != 0) {
                i7 |= 1572864;
                fontWeight2 = fontWeight;
            } else {
                fontWeight2 = fontWeight;
                if ((i4 & 1572864) == 0) {
                    if (x340Var2.g(fontWeight2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
            }
            i16 = i6 & 128;
            i17 = 4194304;
            if (i16 != 0) {
                i7 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                if (x340Var2.g(fontFamily)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i7 |= i18;
            }
            i19 = i6 & 256;
            if (i19 != 0) {
                i7 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if (x340Var2.f(j3)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i7 |= i20;
            }
            if ((i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                i7 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if (x340Var2.g(null)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i7 |= i21;
            }
            i22 = i6 & 1024;
            if (i22 != 0) {
                i23 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                if (x340Var2.g(a0e1Var)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i5 | i24;
            } else {
                i23 = i5;
            }
            i25 = i6 & 2048;
            if (i25 != 0) {
                i23 |= 48;
            } else if ((i5 & 48) == 0) {
                if (x340Var2.f(j4)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i23 |= i26;
            }
            i27 = i23;
            i28 = i6 & 4096;
            if (i28 != 0) {
                if ((i5 & 384) == 0) {
                    i29 = i;
                    if (x340Var2.e(i29)) {
                        i30 = 256;
                    } else {
                        i30 = 128;
                    }
                    i27 |= i30;
                }
                i31 = i6 & 8192;
                if (i31 != 0) {
                    i33 = i27 | 3072;
                } else {
                    i32 = i27;
                    if ((i5 & 3072) == 0) {
                        i33 = i32 | (x340Var2.h(z) ? 2048 : 1024);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i6 & 16384;
                if (i34 != 0) {
                    i35 = i33;
                    if ((i5 & 24576) == 0) {
                        i35 |= x340Var2.e(i2) ? 16384 : 8192;
                    }
                    i36 = i6 & 32768;
                    if (i36 != 0) {
                        i35 |= 196608;
                    } else if ((i5 & 196608) == 0) {
                        if (x340Var2.e(i3)) {
                            i37 = 131072;
                        } else {
                            i37 = 65536;
                        }
                        i35 |= i37;
                    }
                    if ((i6 & 65536) != 0) {
                        i35 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        i35 |= x340Var2.i(null) ? 1048576 : 524288;
                    }
                    if ((i5 & 12582912) != 0) {
                        if ((i6 & 131072) == 0 && x340Var2.g(lee1Var)) {
                            i17 = 8388608;
                        }
                        i35 |= i17;
                    }
                    if ((i7 & 306783379) == 306783378 || (i35 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var2.Y(i7 & 1, z2)) {
                        x340Var2.d0();
                        if ((i4 & 1) != 0 || x340Var2.E()) {
                            if (i43 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i8 != 0) {
                                int i44 = u7h.l;
                                jP = nfb.p();
                            } else {
                                jP = j;
                            }
                            if (i11 != 0) {
                                wee1[] wee1VarArr = TextUnit.b;
                                jK = f7p1.k();
                            }
                            if (i14 != 0) {
                                fontWeight2 = null;
                            }
                            if (i16 != 0) {
                                fontFamily3 = null;
                            } else {
                                fontFamily3 = fontFamily;
                            }
                            if (i19 != 0) {
                                wee1[] wee1VarArr2 = TextUnit.b;
                                jK2 = f7p1.k();
                            } else {
                                jK2 = j3;
                            }
                            if (i22 != 0) {
                                a0e1Var3 = null;
                            } else {
                                a0e1Var3 = a0e1Var;
                            }
                            if (i25 != 0) {
                                wee1[] wee1VarArr3 = TextUnit.b;
                                jK3 = f7p1.k();
                            } else {
                                jK3 = j4;
                            }
                            if (i28 != 0) {
                                i29 = 1;
                            }
                            if (i31 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i34 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i2;
                            }
                            i42 = i36 == 0 ? i3 : 1;
                            if ((i6 & 131072) != 0) {
                                lee1Var3 = (lee1) x340Var2.k(a);
                                i35 &= -29360129;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            a0e1Var4 = a0e1Var3;
                        } else {
                            x340Var2.b0();
                            if ((i6 & 131072) != 0) {
                                i35 &= -29360129;
                            }
                            jP = j;
                            fontFamily3 = fontFamily;
                            jK2 = j3;
                            a0e1Var4 = a0e1Var;
                            jK3 = j4;
                            z4 = z;
                            i41 = i2;
                            i42 = i3;
                            lee1Var3 = lee1Var;
                        }
                        x340Var2.s();
                        x340Var2.i0(-565217106);
                        if (jP != 16) {
                            i41 = i41;
                            i29 = i29;
                            jC = jP;
                        } else {
                            x340Var2.i0(-565216333);
                            jC = lee1Var3.c();
                            if (jC != 16) {
                                jC = ((u7h) x340Var2.k(wrl.a)).a;
                            }
                            x340Var2.r(false);
                        }
                        x340Var2.r(false);
                        FontFamily fontFamily4 = fontFamily3;
                        int i45 = i35 << 6;
                        int i46 = i29;
                        int i47 = i41;
                        jch0.c(str, qim0Var2, lee1.f(lee1Var3, jC, jK, fontWeight2, fontFamily4, jK2, a0e1Var4 != null ? a0e1Var4.a : 0, jK3, 16609104), (iu30) null, i46, z4, i47, i42, (x9h) null, (m0e1) null, x340Var2, (i7 & 126) | ((i35 >> 9) & 7168) | (57344 & i45) | (458752 & i45) | (3670016 & i45) | (i45 & 29360128) | ((i7 << 18) & 1879048192), 256);
                        x340Var = x340Var2;
                        i39 = i47;
                        lee1Var2 = lee1Var3;
                        fontWeight3 = fontWeight2;
                        i40 = i42;
                        j6 = jP;
                        j8 = jK3;
                        j7 = jK2;
                        fontFamily2 = fontFamily4;
                        qim0Var3 = qim0Var2;
                        a0e1Var2 = a0e1Var4;
                        long j9 = jK;
                        i38 = i46;
                        z3 = z4;
                        j5 = j9;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        long j10 = jK;
                        i38 = i29;
                        j5 = j10;
                        j6 = j;
                        fontFamily2 = fontFamily;
                        j7 = j3;
                        z3 = z;
                        i39 = i2;
                        i40 = i3;
                        lee1Var2 = lee1Var;
                        qim0Var3 = qim0Var2;
                        fontWeight3 = fontWeight2;
                        a0e1Var2 = a0e1Var;
                        j8 = j4;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new n9e1(str, qim0Var3, j6, j5, fontWeight3, fontFamily2, j7, a0e1Var2, j8, i38, z3, i39, i40, lee1Var2, i4, i5, i6);
                    }
                }
                i35 = i33 | 24576;
                i36 = i6 & 32768;
                if (i36 != 0) {
                    i35 |= 196608;
                } else if ((i5 & 196608) == 0) {
                    if (x340Var2.e(i3)) {
                        i37 = 131072;
                    } else {
                        i37 = 65536;
                    }
                    i35 |= i37;
                }
                if ((i6 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    i35 |= x340Var2.i(null) ? 1048576 : 524288;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i17 = 8388608;
                    }
                    i35 |= i17;
                }
                if ((i7 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i7 & 1, z2)) {
                    x340Var2.d0();
                    if ((i4 & 1) != 0) {
                        if (i43 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i8 != 0) {
                            int i48 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j;
                        }
                        if (i11 != 0) {
                            wee1[] wee1VarArr4 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i14 != 0) {
                            fontWeight2 = null;
                        }
                        if (i16 != 0) {
                            fontFamily3 = null;
                        } else {
                            fontFamily3 = fontFamily;
                        }
                        if (i19 != 0) {
                            wee1[] wee1VarArr5 = TextUnit.b;
                            jK2 = f7p1.k();
                        } else {
                            jK2 = j3;
                        }
                        if (i22 != 0) {
                            a0e1Var3 = null;
                        } else {
                            a0e1Var3 = a0e1Var;
                        }
                        if (i25 != 0) {
                            wee1[] wee1VarArr6 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        if (i28 != 0) {
                            i29 = 1;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i35 &= -29360129;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        a0e1Var4 = a0e1Var3;
                    } else {
                        if (i43 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i8 != 0) {
                            int i49 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j;
                        }
                        if (i11 != 0) {
                            wee1[] wee1VarArr7 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i14 != 0) {
                            fontWeight2 = null;
                        }
                        if (i16 != 0) {
                            fontFamily3 = null;
                        } else {
                            fontFamily3 = fontFamily;
                        }
                        if (i19 != 0) {
                            wee1[] wee1VarArr8 = TextUnit.b;
                            jK2 = f7p1.k();
                        } else {
                            jK2 = j3;
                        }
                        if (i22 != 0) {
                            a0e1Var3 = null;
                        } else {
                            a0e1Var3 = a0e1Var;
                        }
                        if (i25 != 0) {
                            wee1[] wee1VarArr9 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        if (i28 != 0) {
                            i29 = 1;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i35 &= -29360129;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        a0e1Var4 = a0e1Var3;
                    }
                    x340Var2.s();
                    x340Var2.i0(-565217106);
                    if (jP != 16) {
                        i41 = i41;
                        i29 = i29;
                        jC = jP;
                    } else {
                        x340Var2.i0(-565216333);
                        jC = lee1Var3.c();
                        if (jC != 16) {
                            jC = ((u7h) x340Var2.k(wrl.a)).a;
                        }
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                    FontFamily fontFamily5 = fontFamily3;
                    int i410 = i35 << 6;
                    int i411 = i29;
                    int i412 = i41;
                    jch0.c(str, qim0Var2, lee1.f(lee1Var3, jC, jK, fontWeight2, fontFamily5, jK2, a0e1Var4 != null ? a0e1Var4.a : 0, jK3, 16609104), (iu30) null, i411, z4, i412, i42, (x9h) null, (m0e1) null, x340Var2, (i7 & 126) | ((i35 >> 9) & 7168) | (57344 & i410) | (458752 & i410) | (3670016 & i410) | (i410 & 29360128) | ((i7 << 18) & 1879048192), 256);
                    x340Var = x340Var2;
                    i39 = i412;
                    lee1Var2 = lee1Var3;
                    fontWeight3 = fontWeight2;
                    i40 = i42;
                    j6 = jP;
                    j8 = jK3;
                    j7 = jK2;
                    fontFamily2 = fontFamily5;
                    qim0Var3 = qim0Var2;
                    a0e1Var2 = a0e1Var4;
                    long j11 = jK;
                    i38 = i411;
                    z3 = z4;
                    j5 = j11;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    long j12 = jK;
                    i38 = i29;
                    j5 = j12;
                    j6 = j;
                    fontFamily2 = fontFamily;
                    j7 = j3;
                    z3 = z;
                    i39 = i2;
                    i40 = i3;
                    lee1Var2 = lee1Var;
                    qim0Var3 = qim0Var2;
                    fontWeight3 = fontWeight2;
                    a0e1Var2 = a0e1Var;
                    j8 = j4;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new n9e1(str, qim0Var3, j6, j5, fontWeight3, fontFamily2, j7, a0e1Var2, j8, i38, z3, i39, i40, lee1Var2, i4, i5, i6);
                }
            }
            i27 |= 384;
            i29 = i;
            i31 = i6 & 8192;
            if (i31 != 0) {
                i33 = i27 | 3072;
            } else {
                i32 = i27;
                if ((i5 & 3072) == 0) {
                    i33 = i32 | (x340Var2.h(z) ? 2048 : 1024);
                } else {
                    i33 = i32;
                }
            }
            i34 = i6 & 16384;
            if (i34 != 0) {
                i35 = i33;
                if ((i5 & 24576) == 0) {
                    i35 |= x340Var2.e(i2) ? 16384 : 8192;
                }
                i36 = i6 & 32768;
                if (i36 != 0) {
                    i35 |= 196608;
                } else if ((i5 & 196608) == 0) {
                    if (x340Var2.e(i3)) {
                        i37 = 131072;
                    } else {
                        i37 = 65536;
                    }
                    i35 |= i37;
                }
                if ((i6 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    i35 |= x340Var2.i(null) ? 1048576 : 524288;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i17 = 8388608;
                    }
                    i35 |= i17;
                }
                if ((i7 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i7 & 1, z2)) {
                    x340Var2.d0();
                    if ((i4 & 1) != 0) {
                        if (i43 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i8 != 0) {
                            int i413 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j;
                        }
                        if (i11 != 0) {
                            wee1[] wee1VarArr10 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i14 != 0) {
                            fontWeight2 = null;
                        }
                        if (i16 != 0) {
                            fontFamily3 = null;
                        } else {
                            fontFamily3 = fontFamily;
                        }
                        if (i19 != 0) {
                            wee1[] wee1VarArr11 = TextUnit.b;
                            jK2 = f7p1.k();
                        } else {
                            jK2 = j3;
                        }
                        if (i22 != 0) {
                            a0e1Var3 = null;
                        } else {
                            a0e1Var3 = a0e1Var;
                        }
                        if (i25 != 0) {
                            wee1[] wee1VarArr12 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        if (i28 != 0) {
                            i29 = 1;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i35 &= -29360129;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        a0e1Var4 = a0e1Var3;
                    } else {
                        if (i43 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i8 != 0) {
                            int i414 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j;
                        }
                        if (i11 != 0) {
                            wee1[] wee1VarArr13 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i14 != 0) {
                            fontWeight2 = null;
                        }
                        if (i16 != 0) {
                            fontFamily3 = null;
                        } else {
                            fontFamily3 = fontFamily;
                        }
                        if (i19 != 0) {
                            wee1[] wee1VarArr14 = TextUnit.b;
                            jK2 = f7p1.k();
                        } else {
                            jK2 = j3;
                        }
                        if (i22 != 0) {
                            a0e1Var3 = null;
                        } else {
                            a0e1Var3 = a0e1Var;
                        }
                        if (i25 != 0) {
                            wee1[] wee1VarArr15 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        if (i28 != 0) {
                            i29 = 1;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i35 &= -29360129;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        a0e1Var4 = a0e1Var3;
                    }
                    x340Var2.s();
                    x340Var2.i0(-565217106);
                    if (jP != 16) {
                        i41 = i41;
                        i29 = i29;
                        jC = jP;
                    } else {
                        x340Var2.i0(-565216333);
                        jC = lee1Var3.c();
                        if (jC != 16) {
                            jC = ((u7h) x340Var2.k(wrl.a)).a;
                        }
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                    FontFamily fontFamily6 = fontFamily3;
                    int i415 = i35 << 6;
                    int i416 = i29;
                    int i417 = i41;
                    jch0.c(str, qim0Var2, lee1.f(lee1Var3, jC, jK, fontWeight2, fontFamily6, jK2, a0e1Var4 != null ? a0e1Var4.a : 0, jK3, 16609104), (iu30) null, i416, z4, i417, i42, (x9h) null, (m0e1) null, x340Var2, (i7 & 126) | ((i35 >> 9) & 7168) | (57344 & i415) | (458752 & i415) | (3670016 & i415) | (i415 & 29360128) | ((i7 << 18) & 1879048192), 256);
                    x340Var = x340Var2;
                    i39 = i417;
                    lee1Var2 = lee1Var3;
                    fontWeight3 = fontWeight2;
                    i40 = i42;
                    j6 = jP;
                    j8 = jK3;
                    j7 = jK2;
                    fontFamily2 = fontFamily6;
                    qim0Var3 = qim0Var2;
                    a0e1Var2 = a0e1Var4;
                    long j13 = jK;
                    i38 = i416;
                    z3 = z4;
                    j5 = j13;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    long j14 = jK;
                    i38 = i29;
                    j5 = j14;
                    j6 = j;
                    fontFamily2 = fontFamily;
                    j7 = j3;
                    z3 = z;
                    i39 = i2;
                    i40 = i3;
                    lee1Var2 = lee1Var;
                    qim0Var3 = qim0Var2;
                    fontWeight3 = fontWeight2;
                    a0e1Var2 = a0e1Var;
                    j8 = j4;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new n9e1(str, qim0Var3, j6, j5, fontWeight3, fontFamily2, j7, a0e1Var2, j8, i38, z3, i39, i40, lee1Var2, i4, i5, i6);
                }
            }
            i35 = i33 | 24576;
            i36 = i6 & 32768;
            if (i36 != 0) {
                i35 |= 196608;
            } else if ((i5 & 196608) == 0) {
                if (x340Var2.e(i3)) {
                    i37 = 131072;
                } else {
                    i37 = 65536;
                }
                i35 |= i37;
            }
            if ((i6 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                i35 |= x340Var2.i(null) ? 1048576 : 524288;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i17 = 8388608;
                }
                i35 |= i17;
            }
            if ((i7 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i7 & 1, z2)) {
                x340Var2.d0();
                if ((i4 & 1) != 0) {
                    if (i43 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i8 != 0) {
                        int i418 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j;
                    }
                    if (i11 != 0) {
                        wee1[] wee1VarArr16 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i14 != 0) {
                        fontWeight2 = null;
                    }
                    if (i16 != 0) {
                        fontFamily3 = null;
                    } else {
                        fontFamily3 = fontFamily;
                    }
                    if (i19 != 0) {
                        wee1[] wee1VarArr17 = TextUnit.b;
                        jK2 = f7p1.k();
                    } else {
                        jK2 = j3;
                    }
                    if (i22 != 0) {
                        a0e1Var3 = null;
                    } else {
                        a0e1Var3 = a0e1Var;
                    }
                    if (i25 != 0) {
                        wee1[] wee1VarArr18 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    if (i28 != 0) {
                        i29 = 1;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i35 &= -29360129;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    a0e1Var4 = a0e1Var3;
                } else {
                    if (i43 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i8 != 0) {
                        int i419 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j;
                    }
                    if (i11 != 0) {
                        wee1[] wee1VarArr19 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i14 != 0) {
                        fontWeight2 = null;
                    }
                    if (i16 != 0) {
                        fontFamily3 = null;
                    } else {
                        fontFamily3 = fontFamily;
                    }
                    if (i19 != 0) {
                        wee1[] wee1VarArr110 = TextUnit.b;
                        jK2 = f7p1.k();
                    } else {
                        jK2 = j3;
                    }
                    if (i22 != 0) {
                        a0e1Var3 = null;
                    } else {
                        a0e1Var3 = a0e1Var;
                    }
                    if (i25 != 0) {
                        wee1[] wee1VarArr111 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    if (i28 != 0) {
                        i29 = 1;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i35 &= -29360129;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    a0e1Var4 = a0e1Var3;
                }
                x340Var2.s();
                x340Var2.i0(-565217106);
                if (jP != 16) {
                    i41 = i41;
                    i29 = i29;
                    jC = jP;
                } else {
                    x340Var2.i0(-565216333);
                    jC = lee1Var3.c();
                    if (jC != 16) {
                        jC = ((u7h) x340Var2.k(wrl.a)).a;
                    }
                    x340Var2.r(false);
                }
                x340Var2.r(false);
                FontFamily fontFamily7 = fontFamily3;
                int i4110 = i35 << 6;
                int i4111 = i29;
                int i4112 = i41;
                jch0.c(str, qim0Var2, lee1.f(lee1Var3, jC, jK, fontWeight2, fontFamily7, jK2, a0e1Var4 != null ? a0e1Var4.a : 0, jK3, 16609104), (iu30) null, i4111, z4, i4112, i42, (x9h) null, (m0e1) null, x340Var2, (i7 & 126) | ((i35 >> 9) & 7168) | (57344 & i4110) | (458752 & i4110) | (3670016 & i4110) | (i4110 & 29360128) | ((i7 << 18) & 1879048192), 256);
                x340Var = x340Var2;
                i39 = i4112;
                lee1Var2 = lee1Var3;
                fontWeight3 = fontWeight2;
                i40 = i42;
                j6 = jP;
                j8 = jK3;
                j7 = jK2;
                fontFamily2 = fontFamily7;
                qim0Var3 = qim0Var2;
                a0e1Var2 = a0e1Var4;
                long j15 = jK;
                i38 = i4111;
                z3 = z4;
                j5 = j15;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                long j16 = jK;
                i38 = i29;
                j5 = j16;
                j6 = j;
                fontFamily2 = fontFamily;
                j7 = j3;
                z3 = z;
                i39 = i2;
                i40 = i3;
                lee1Var2 = lee1Var;
                qim0Var3 = qim0Var2;
                fontWeight3 = fontWeight2;
                a0e1Var2 = a0e1Var;
                j8 = j4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new n9e1(str, qim0Var3, j6, j5, fontWeight3, fontFamily2, j7, a0e1Var2, j8, i38, z3, i39, i40, lee1Var2, i4, i5, i6);
            }
        }
        i7 |= 48;
        qim0Var2 = qim0Var;
        i8 = i6 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            if (x340Var2.f(j)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i7 |= i9;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            if (x340Var2.i(null)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i7 |= i10;
        }
        i11 = i6 & 16;
        if (i11 != 0) {
            i7 |= 24576;
            jK = j2;
        } else {
            jK = j2;
            if ((i4 & 24576) == 0) {
                if (x340Var2.f(jK)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i7 |= i12;
            }
        }
        if ((i6 & 32) != 0) {
            i7 |= 196608;
        } else if ((i4 & 196608) == 0) {
            if (x340Var2.g(null)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i7 |= i13;
        }
        i14 = i6 & 64;
        if (i14 != 0) {
            i7 |= 1572864;
            fontWeight2 = fontWeight;
        } else {
            fontWeight2 = fontWeight;
            if ((i4 & 1572864) == 0) {
                if (x340Var2.g(fontWeight2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i7 |= i15;
            }
        }
        i16 = i6 & 128;
        i17 = 4194304;
        if (i16 != 0) {
            i7 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            if (x340Var2.g(fontFamily)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i7 |= i18;
        }
        i19 = i6 & 256;
        if (i19 != 0) {
            i7 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            if (x340Var2.f(j3)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i7 |= i20;
        }
        if ((i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
            i7 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            if (x340Var2.g(null)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i7 |= i21;
        }
        i22 = i6 & 1024;
        if (i22 != 0) {
            i23 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (x340Var2.g(a0e1Var)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i23 = i5 | i24;
        } else {
            i23 = i5;
        }
        i25 = i6 & 2048;
        if (i25 != 0) {
            i23 |= 48;
        } else if ((i5 & 48) == 0) {
            if (x340Var2.f(j4)) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i23 |= i26;
        }
        i27 = i23;
        i28 = i6 & 4096;
        if (i28 != 0) {
            if ((i5 & 384) == 0) {
                i29 = i;
                if (x340Var2.e(i29)) {
                    i30 = 256;
                } else {
                    i30 = 128;
                }
                i27 |= i30;
            }
            i31 = i6 & 8192;
            if (i31 != 0) {
                i33 = i27 | 3072;
            } else {
                i32 = i27;
                if ((i5 & 3072) == 0) {
                    i33 = i32 | (x340Var2.h(z) ? 2048 : 1024);
                } else {
                    i33 = i32;
                }
            }
            i34 = i6 & 16384;
            if (i34 != 0) {
                i35 = i33;
                if ((i5 & 24576) == 0) {
                    i35 |= x340Var2.e(i2) ? 16384 : 8192;
                }
                i36 = i6 & 32768;
                if (i36 != 0) {
                    i35 |= 196608;
                } else if ((i5 & 196608) == 0) {
                    if (x340Var2.e(i3)) {
                        i37 = 131072;
                    } else {
                        i37 = 65536;
                    }
                    i35 |= i37;
                }
                if ((i6 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    i35 |= x340Var2.i(null) ? 1048576 : 524288;
                }
                if ((i5 & 12582912) != 0) {
                    if ((i6 & 131072) == 0) {
                        i17 = 8388608;
                    }
                    i35 |= i17;
                }
                if ((i7 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i7 & 1, z2)) {
                    x340Var2.d0();
                    if ((i4 & 1) != 0) {
                        if (i43 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i8 != 0) {
                            int i4113 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j;
                        }
                        if (i11 != 0) {
                            wee1[] wee1VarArr112 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i14 != 0) {
                            fontWeight2 = null;
                        }
                        if (i16 != 0) {
                            fontFamily3 = null;
                        } else {
                            fontFamily3 = fontFamily;
                        }
                        if (i19 != 0) {
                            wee1[] wee1VarArr113 = TextUnit.b;
                            jK2 = f7p1.k();
                        } else {
                            jK2 = j3;
                        }
                        if (i22 != 0) {
                            a0e1Var3 = null;
                        } else {
                            a0e1Var3 = a0e1Var;
                        }
                        if (i25 != 0) {
                            wee1[] wee1VarArr114 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        if (i28 != 0) {
                            i29 = 1;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i35 &= -29360129;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        a0e1Var4 = a0e1Var3;
                    } else {
                        if (i43 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i8 != 0) {
                            int i4114 = u7h.l;
                            jP = nfb.p();
                        } else {
                            jP = j;
                        }
                        if (i11 != 0) {
                            wee1[] wee1VarArr115 = TextUnit.b;
                            jK = f7p1.k();
                        }
                        if (i14 != 0) {
                            fontWeight2 = null;
                        }
                        if (i16 != 0) {
                            fontFamily3 = null;
                        } else {
                            fontFamily3 = fontFamily;
                        }
                        if (i19 != 0) {
                            wee1[] wee1VarArr116 = TextUnit.b;
                            jK2 = f7p1.k();
                        } else {
                            jK2 = j3;
                        }
                        if (i22 != 0) {
                            a0e1Var3 = null;
                        } else {
                            a0e1Var3 = a0e1Var;
                        }
                        if (i25 != 0) {
                            wee1[] wee1VarArr117 = TextUnit.b;
                            jK3 = f7p1.k();
                        } else {
                            jK3 = j4;
                        }
                        if (i28 != 0) {
                            i29 = 1;
                        }
                        if (i31 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i34 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i2;
                        }
                        if (i36 == 0) {
                        }
                        if ((i6 & 131072) != 0) {
                            lee1Var3 = (lee1) x340Var2.k(a);
                            i35 &= -29360129;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        a0e1Var4 = a0e1Var3;
                    }
                    x340Var2.s();
                    x340Var2.i0(-565217106);
                    if (jP != 16) {
                        i41 = i41;
                        i29 = i29;
                        jC = jP;
                    } else {
                        x340Var2.i0(-565216333);
                        jC = lee1Var3.c();
                        if (jC != 16) {
                            jC = ((u7h) x340Var2.k(wrl.a)).a;
                        }
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                    FontFamily fontFamily8 = fontFamily3;
                    int i4115 = i35 << 6;
                    int i4116 = i29;
                    int i4117 = i41;
                    jch0.c(str, qim0Var2, lee1.f(lee1Var3, jC, jK, fontWeight2, fontFamily8, jK2, a0e1Var4 != null ? a0e1Var4.a : 0, jK3, 16609104), (iu30) null, i4116, z4, i4117, i42, (x9h) null, (m0e1) null, x340Var2, (i7 & 126) | ((i35 >> 9) & 7168) | (57344 & i4115) | (458752 & i4115) | (3670016 & i4115) | (i4115 & 29360128) | ((i7 << 18) & 1879048192), 256);
                    x340Var = x340Var2;
                    i39 = i4117;
                    lee1Var2 = lee1Var3;
                    fontWeight3 = fontWeight2;
                    i40 = i42;
                    j6 = jP;
                    j8 = jK3;
                    j7 = jK2;
                    fontFamily2 = fontFamily8;
                    qim0Var3 = qim0Var2;
                    a0e1Var2 = a0e1Var4;
                    long j17 = jK;
                    i38 = i4116;
                    z3 = z4;
                    j5 = j17;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    long j18 = jK;
                    i38 = i29;
                    j5 = j18;
                    j6 = j;
                    fontFamily2 = fontFamily;
                    j7 = j3;
                    z3 = z;
                    i39 = i2;
                    i40 = i3;
                    lee1Var2 = lee1Var;
                    qim0Var3 = qim0Var2;
                    fontWeight3 = fontWeight2;
                    a0e1Var2 = a0e1Var;
                    j8 = j4;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new n9e1(str, qim0Var3, j6, j5, fontWeight3, fontFamily2, j7, a0e1Var2, j8, i38, z3, i39, i40, lee1Var2, i4, i5, i6);
                }
            }
            i35 = i33 | 24576;
            i36 = i6 & 32768;
            if (i36 != 0) {
                i35 |= 196608;
            } else if ((i5 & 196608) == 0) {
                if (x340Var2.e(i3)) {
                    i37 = 131072;
                } else {
                    i37 = 65536;
                }
                i35 |= i37;
            }
            if ((i6 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                i35 |= x340Var2.i(null) ? 1048576 : 524288;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i17 = 8388608;
                }
                i35 |= i17;
            }
            if ((i7 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i7 & 1, z2)) {
                x340Var2.d0();
                if ((i4 & 1) != 0) {
                    if (i43 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i8 != 0) {
                        int i4118 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j;
                    }
                    if (i11 != 0) {
                        wee1[] wee1VarArr118 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i14 != 0) {
                        fontWeight2 = null;
                    }
                    if (i16 != 0) {
                        fontFamily3 = null;
                    } else {
                        fontFamily3 = fontFamily;
                    }
                    if (i19 != 0) {
                        wee1[] wee1VarArr119 = TextUnit.b;
                        jK2 = f7p1.k();
                    } else {
                        jK2 = j3;
                    }
                    if (i22 != 0) {
                        a0e1Var3 = null;
                    } else {
                        a0e1Var3 = a0e1Var;
                    }
                    if (i25 != 0) {
                        wee1[] wee1VarArr1110 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    if (i28 != 0) {
                        i29 = 1;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i35 &= -29360129;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    a0e1Var4 = a0e1Var3;
                } else {
                    if (i43 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i8 != 0) {
                        int i4119 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j;
                    }
                    if (i11 != 0) {
                        wee1[] wee1VarArr1111 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i14 != 0) {
                        fontWeight2 = null;
                    }
                    if (i16 != 0) {
                        fontFamily3 = null;
                    } else {
                        fontFamily3 = fontFamily;
                    }
                    if (i19 != 0) {
                        wee1[] wee1VarArr1112 = TextUnit.b;
                        jK2 = f7p1.k();
                    } else {
                        jK2 = j3;
                    }
                    if (i22 != 0) {
                        a0e1Var3 = null;
                    } else {
                        a0e1Var3 = a0e1Var;
                    }
                    if (i25 != 0) {
                        wee1[] wee1VarArr1113 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    if (i28 != 0) {
                        i29 = 1;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i35 &= -29360129;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    a0e1Var4 = a0e1Var3;
                }
                x340Var2.s();
                x340Var2.i0(-565217106);
                if (jP != 16) {
                    i41 = i41;
                    i29 = i29;
                    jC = jP;
                } else {
                    x340Var2.i0(-565216333);
                    jC = lee1Var3.c();
                    if (jC != 16) {
                        jC = ((u7h) x340Var2.k(wrl.a)).a;
                    }
                    x340Var2.r(false);
                }
                x340Var2.r(false);
                FontFamily fontFamily9 = fontFamily3;
                int i41110 = i35 << 6;
                int i41111 = i29;
                int i41112 = i41;
                jch0.c(str, qim0Var2, lee1.f(lee1Var3, jC, jK, fontWeight2, fontFamily9, jK2, a0e1Var4 != null ? a0e1Var4.a : 0, jK3, 16609104), (iu30) null, i41111, z4, i41112, i42, (x9h) null, (m0e1) null, x340Var2, (i7 & 126) | ((i35 >> 9) & 7168) | (57344 & i41110) | (458752 & i41110) | (3670016 & i41110) | (i41110 & 29360128) | ((i7 << 18) & 1879048192), 256);
                x340Var = x340Var2;
                i39 = i41112;
                lee1Var2 = lee1Var3;
                fontWeight3 = fontWeight2;
                i40 = i42;
                j6 = jP;
                j8 = jK3;
                j7 = jK2;
                fontFamily2 = fontFamily9;
                qim0Var3 = qim0Var2;
                a0e1Var2 = a0e1Var4;
                long j19 = jK;
                i38 = i41111;
                z3 = z4;
                j5 = j19;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                long j110 = jK;
                i38 = i29;
                j5 = j110;
                j6 = j;
                fontFamily2 = fontFamily;
                j7 = j3;
                z3 = z;
                i39 = i2;
                i40 = i3;
                lee1Var2 = lee1Var;
                qim0Var3 = qim0Var2;
                fontWeight3 = fontWeight2;
                a0e1Var2 = a0e1Var;
                j8 = j4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new n9e1(str, qim0Var3, j6, j5, fontWeight3, fontFamily2, j7, a0e1Var2, j8, i38, z3, i39, i40, lee1Var2, i4, i5, i6);
            }
        }
        i27 |= 384;
        i29 = i;
        i31 = i6 & 8192;
        if (i31 != 0) {
            i33 = i27 | 3072;
        } else {
            i32 = i27;
            if ((i5 & 3072) == 0) {
                i33 = i32 | (x340Var2.h(z) ? 2048 : 1024);
            } else {
                i33 = i32;
            }
        }
        i34 = i6 & 16384;
        if (i34 != 0) {
            i35 = i33;
            if ((i5 & 24576) == 0) {
                i35 |= x340Var2.e(i2) ? 16384 : 8192;
            }
            i36 = i6 & 32768;
            if (i36 != 0) {
                i35 |= 196608;
            } else if ((i5 & 196608) == 0) {
                if (x340Var2.e(i3)) {
                    i37 = 131072;
                } else {
                    i37 = 65536;
                }
                i35 |= i37;
            }
            if ((i6 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i5 & 1572864) == 0) {
                i35 |= x340Var2.i(null) ? 1048576 : 524288;
            }
            if ((i5 & 12582912) != 0) {
                if ((i6 & 131072) == 0) {
                    i17 = 8388608;
                }
                i35 |= i17;
            }
            if ((i7 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i7 & 1, z2)) {
                x340Var2.d0();
                if ((i4 & 1) != 0) {
                    if (i43 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i8 != 0) {
                        int i41113 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j;
                    }
                    if (i11 != 0) {
                        wee1[] wee1VarArr1114 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i14 != 0) {
                        fontWeight2 = null;
                    }
                    if (i16 != 0) {
                        fontFamily3 = null;
                    } else {
                        fontFamily3 = fontFamily;
                    }
                    if (i19 != 0) {
                        wee1[] wee1VarArr1115 = TextUnit.b;
                        jK2 = f7p1.k();
                    } else {
                        jK2 = j3;
                    }
                    if (i22 != 0) {
                        a0e1Var3 = null;
                    } else {
                        a0e1Var3 = a0e1Var;
                    }
                    if (i25 != 0) {
                        wee1[] wee1VarArr1116 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    if (i28 != 0) {
                        i29 = 1;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i35 &= -29360129;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    a0e1Var4 = a0e1Var3;
                } else {
                    if (i43 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i8 != 0) {
                        int i41114 = u7h.l;
                        jP = nfb.p();
                    } else {
                        jP = j;
                    }
                    if (i11 != 0) {
                        wee1[] wee1VarArr1117 = TextUnit.b;
                        jK = f7p1.k();
                    }
                    if (i14 != 0) {
                        fontWeight2 = null;
                    }
                    if (i16 != 0) {
                        fontFamily3 = null;
                    } else {
                        fontFamily3 = fontFamily;
                    }
                    if (i19 != 0) {
                        wee1[] wee1VarArr1118 = TextUnit.b;
                        jK2 = f7p1.k();
                    } else {
                        jK2 = j3;
                    }
                    if (i22 != 0) {
                        a0e1Var3 = null;
                    } else {
                        a0e1Var3 = a0e1Var;
                    }
                    if (i25 != 0) {
                        wee1[] wee1VarArr1119 = TextUnit.b;
                        jK3 = f7p1.k();
                    } else {
                        jK3 = j4;
                    }
                    if (i28 != 0) {
                        i29 = 1;
                    }
                    if (i31 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i34 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i2;
                    }
                    if (i36 == 0) {
                    }
                    if ((i6 & 131072) != 0) {
                        lee1Var3 = (lee1) x340Var2.k(a);
                        i35 &= -29360129;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    a0e1Var4 = a0e1Var3;
                }
                x340Var2.s();
                x340Var2.i0(-565217106);
                if (jP != 16) {
                    i41 = i41;
                    i29 = i29;
                    jC = jP;
                } else {
                    x340Var2.i0(-565216333);
                    jC = lee1Var3.c();
                    if (jC != 16) {
                        jC = ((u7h) x340Var2.k(wrl.a)).a;
                    }
                    x340Var2.r(false);
                }
                x340Var2.r(false);
                FontFamily fontFamily10 = fontFamily3;
                int i41115 = i35 << 6;
                int i41116 = i29;
                int i41117 = i41;
                jch0.c(str, qim0Var2, lee1.f(lee1Var3, jC, jK, fontWeight2, fontFamily10, jK2, a0e1Var4 != null ? a0e1Var4.a : 0, jK3, 16609104), (iu30) null, i41116, z4, i41117, i42, (x9h) null, (m0e1) null, x340Var2, (i7 & 126) | ((i35 >> 9) & 7168) | (57344 & i41115) | (458752 & i41115) | (3670016 & i41115) | (i41115 & 29360128) | ((i7 << 18) & 1879048192), 256);
                x340Var = x340Var2;
                i39 = i41117;
                lee1Var2 = lee1Var3;
                fontWeight3 = fontWeight2;
                i40 = i42;
                j6 = jP;
                j8 = jK3;
                j7 = jK2;
                fontFamily2 = fontFamily10;
                qim0Var3 = qim0Var2;
                a0e1Var2 = a0e1Var4;
                long j111 = jK;
                i38 = i41116;
                z3 = z4;
                j5 = j111;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                long j112 = jK;
                i38 = i29;
                j5 = j112;
                j6 = j;
                fontFamily2 = fontFamily;
                j7 = j3;
                z3 = z;
                i39 = i2;
                i40 = i3;
                lee1Var2 = lee1Var;
                qim0Var3 = qim0Var2;
                fontWeight3 = fontWeight2;
                a0e1Var2 = a0e1Var;
                j8 = j4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new n9e1(str, qim0Var3, j6, j5, fontWeight3, fontFamily2, j7, a0e1Var2, j8, i38, z3, i39, i40, lee1Var2, i4, i5, i6);
            }
        }
        i35 = i33 | 24576;
        i36 = i6 & 32768;
        if (i36 != 0) {
            i35 |= 196608;
        } else if ((i5 & 196608) == 0) {
            if (x340Var2.e(i3)) {
                i37 = 131072;
            } else {
                i37 = 65536;
            }
            i35 |= i37;
        }
        if ((i6 & 65536) != 0) {
            i35 |= 1572864;
        } else if ((i5 & 1572864) == 0) {
            i35 |= x340Var2.i(null) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) != 0) {
            if ((i6 & 131072) == 0) {
                i17 = 8388608;
            }
            i35 |= i17;
        }
        if ((i7 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var2.Y(i7 & 1, z2)) {
            x340Var2.d0();
            if ((i4 & 1) != 0) {
                if (i43 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i8 != 0) {
                    int i41118 = u7h.l;
                    jP = nfb.p();
                } else {
                    jP = j;
                }
                if (i11 != 0) {
                    wee1[] wee1VarArr11110 = TextUnit.b;
                    jK = f7p1.k();
                }
                if (i14 != 0) {
                    fontWeight2 = null;
                }
                if (i16 != 0) {
                    fontFamily3 = null;
                } else {
                    fontFamily3 = fontFamily;
                }
                if (i19 != 0) {
                    wee1[] wee1VarArr11111 = TextUnit.b;
                    jK2 = f7p1.k();
                } else {
                    jK2 = j3;
                }
                if (i22 != 0) {
                    a0e1Var3 = null;
                } else {
                    a0e1Var3 = a0e1Var;
                }
                if (i25 != 0) {
                    wee1[] wee1VarArr11112 = TextUnit.b;
                    jK3 = f7p1.k();
                } else {
                    jK3 = j4;
                }
                if (i28 != 0) {
                    i29 = 1;
                }
                if (i31 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i34 != 0) {
                    i41 = Integer.MAX_VALUE;
                } else {
                    i41 = i2;
                }
                if (i36 == 0) {
                }
                if ((i6 & 131072) != 0) {
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i35 &= -29360129;
                } else {
                    lee1Var3 = lee1Var;
                }
                a0e1Var4 = a0e1Var3;
            } else {
                if (i43 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i8 != 0) {
                    int i41119 = u7h.l;
                    jP = nfb.p();
                } else {
                    jP = j;
                }
                if (i11 != 0) {
                    wee1[] wee1VarArr11113 = TextUnit.b;
                    jK = f7p1.k();
                }
                if (i14 != 0) {
                    fontWeight2 = null;
                }
                if (i16 != 0) {
                    fontFamily3 = null;
                } else {
                    fontFamily3 = fontFamily;
                }
                if (i19 != 0) {
                    wee1[] wee1VarArr11114 = TextUnit.b;
                    jK2 = f7p1.k();
                } else {
                    jK2 = j3;
                }
                if (i22 != 0) {
                    a0e1Var3 = null;
                } else {
                    a0e1Var3 = a0e1Var;
                }
                if (i25 != 0) {
                    wee1[] wee1VarArr11115 = TextUnit.b;
                    jK3 = f7p1.k();
                } else {
                    jK3 = j4;
                }
                if (i28 != 0) {
                    i29 = 1;
                }
                if (i31 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i34 != 0) {
                    i41 = Integer.MAX_VALUE;
                } else {
                    i41 = i2;
                }
                if (i36 == 0) {
                }
                if ((i6 & 131072) != 0) {
                    lee1Var3 = (lee1) x340Var2.k(a);
                    i35 &= -29360129;
                } else {
                    lee1Var3 = lee1Var;
                }
                a0e1Var4 = a0e1Var3;
            }
            x340Var2.s();
            x340Var2.i0(-565217106);
            if (jP != 16) {
                i41 = i41;
                i29 = i29;
                jC = jP;
            } else {
                x340Var2.i0(-565216333);
                jC = lee1Var3.c();
                if (jC != 16) {
                    jC = ((u7h) x340Var2.k(wrl.a)).a;
                }
                x340Var2.r(false);
            }
            x340Var2.r(false);
            FontFamily fontFamily11 = fontFamily3;
            int i411110 = i35 << 6;
            int i411111 = i29;
            int i411112 = i41;
            jch0.c(str, qim0Var2, lee1.f(lee1Var3, jC, jK, fontWeight2, fontFamily11, jK2, a0e1Var4 != null ? a0e1Var4.a : 0, jK3, 16609104), (iu30) null, i411111, z4, i411112, i42, (x9h) null, (m0e1) null, x340Var2, (i7 & 126) | ((i35 >> 9) & 7168) | (57344 & i411110) | (458752 & i411110) | (3670016 & i411110) | (i411110 & 29360128) | ((i7 << 18) & 1879048192), 256);
            x340Var = x340Var2;
            i39 = i411112;
            lee1Var2 = lee1Var3;
            fontWeight3 = fontWeight2;
            i40 = i42;
            j6 = jP;
            j8 = jK3;
            j7 = jK2;
            fontFamily2 = fontFamily11;
            qim0Var3 = qim0Var2;
            a0e1Var2 = a0e1Var4;
            long j113 = jK;
            i38 = i411111;
            z3 = z4;
            j5 = j113;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            long j114 = jK;
            i38 = i29;
            j5 = j114;
            j6 = j;
            fontFamily2 = fontFamily;
            j7 = j3;
            z3 = z;
            i39 = i2;
            i40 = i3;
            lee1Var2 = lee1Var;
            qim0Var3 = qim0Var2;
            fontWeight3 = fontWeight2;
            a0e1Var2 = a0e1Var;
            j8 = j4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n9e1(str, qim0Var3, j6, j5, fontWeight3, fontFamily2, j7, a0e1Var2, j8, i38, z3, i39, i40, lee1Var2, i4, i5, i6);
        }
    }
}
