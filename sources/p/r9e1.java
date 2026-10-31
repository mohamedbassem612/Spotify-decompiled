package p;

import androidx.car.app.model.Alert;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import app.p000rive.semantics.SemanticState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class r9e1 {
    public static final kiv a = new kiv(new mf41((byte) 7), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:101:0x0152  */
    /* JADX WARN: Code duplicated, block: B:103:0x0156  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0164  */
    /* JADX WARN: Code duplicated, block: B:109:0x0168  */
    /* JADX WARN: Code duplicated, block: B:111:0x016b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0171  */
    /* JADX WARN: Code duplicated, block: B:116:0x0188  */
    /* JADX WARN: Code duplicated, block: B:119:0x0195  */
    /* JADX WARN: Code duplicated, block: B:120:0x0198  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:136:0x0253  */
    /* JADX WARN: Code duplicated, block: B:139:0x0272  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x014d  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0114, please report this as an issue */
    public static final void a(final String str, qim0 qim0Var, long j, long j2, FontWeight fontWeight, long j3, int i, long j4, int i2, boolean z, int i3, int i4, iu30 iu30Var, lee1 lee1Var, b0k b0kVar, final int i5, final int i6, final int i7) {
        int i8;
        qim0 qim0Var2;
        int i9;
        long j5;
        int i10;
        FontWeight fontWeight2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        iu30 iu30Var2;
        boolean z2;
        x340 x340Var;
        final long j6;
        final int i17;
        final lee1 lee1Var2;
        final int i18;
        final int i19;
        final FontWeight fontWeight3;
        final qim0 qim0Var3;
        final iu30 iu30Var3;
        final long j7;
        final long j8;
        final long j9;
        final int i20;
        final boolean z3;
        h311 h311VarV;
        int i21;
        qim0 qim0Var4;
        long j10;
        long j11;
        int i22;
        lee1 lee1Var3;
        int i23;
        int i24;
        boolean z4;
        int i25;
        iu30 iu30Var4;
        long j12;
        long jC;
        boolean z5;
        boolean zH;
        boolean z6;
        Object objT;
        yrl yrlVar;
        int i26;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-275372232);
        int i27 = 4;
        if ((i5 & 6) == 0) {
            i8 = i5 | (x340Var2.g(str) ? 4 : 2);
        } else {
            i8 = i5;
        }
        int i28 = i7 & 2;
        if (i28 != 0) {
            i9 = i8 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i9 = i8 | (x340Var2.g(qim0Var2) ? 32 : 16);
        }
        int i29 = i9 | 3456;
        int i30 = i7 & 16;
        int i31 = TlsSocketProvider.READ_BUFFER_SIZE;
        if (i30 != 0) {
            i10 = i9 | 28032;
            j5 = j2;
        } else {
            j5 = j2;
            i10 = (x340Var2.f(j5) ? 16384 : SemanticState.Multiline) | i29;
        }
        int i32 = i10 | 196608;
        int i33 = i7 & 64;
        if (i33 != 0) {
            i11 = i10 | 1769472;
            fontWeight2 = fontWeight;
        } else {
            fontWeight2 = fontWeight;
            i11 = i32 | (x340Var2.g(fontWeight2) ? 1048576 : 524288);
        }
        int i34 = i11 | 918552576;
        if ((i6 & 6) == 0) {
            if ((i7 & SemanticState.ReadOnly) == 0) {
                i12 = i;
                if (!x340Var2.e(i12)) {
                }
                i13 = i27 | i6;
            } else {
                i12 = i;
            }
            i27 = 2;
            i13 = i27 | i6;
        } else {
            i12 = i;
            i13 = i6;
        }
        int i35 = i13 | 3504;
        int i36 = i7 & TlsSocketProvider.READ_BUFFER_SIZE;
        if (i36 == 0) {
            if ((i6 & 24576) == 0) {
                i14 = i3;
                if (!x340Var2.e(i14)) {
                    i31 = SemanticState.Multiline;
                }
                i35 |= i31;
            }
            i15 = i35 | 196608;
            i16 = i7 & 65536;
            if (i16 != 0) {
                if ((1572864 & i6) == 0) {
                    iu30Var2 = iu30Var;
                    i15 |= x340Var2.i(iu30Var2) ? 1048576 : 524288;
                }
                if ((i6 & 12582912) != 0) {
                    if ((i7 & 131072) == 0 || !x340Var2.g(lee1Var)) {
                        i26 = 4194304;
                    } else {
                        i26 = 8388608;
                    }
                    i15 |= i26;
                }
                if ((i34 & 306783379) == 306783378 || (4793491 & i15) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var2.Y(i34 & 1, z2)) {
                    x340Var2.d0();
                    i21 = i5 & 1;
                    qim0Var4 = nim0.a;
                    if (i21 != 0 || x340Var2.E()) {
                        if (i28 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        j10 = u7h.k;
                        if (i30 != 0) {
                            j5 = TextUnit.c;
                        }
                        if (i33 != 0) {
                            fontWeight2 = null;
                        }
                        j11 = TextUnit.c;
                        if ((i7 & SemanticState.ReadOnly) != 0) {
                            i15 &= -15;
                            i12 = 0;
                        }
                        if (i36 != 0) {
                            i22 = Alert.DURATION_SHOW_INDEFINITELY;
                        } else {
                            i22 = i14;
                        }
                        if (i16 != 0) {
                            iu30Var2 = null;
                        }
                        if ((i7 & 131072) != 0) {
                            i15 &= -29360129;
                            lee1Var3 = (lee1) x340Var2.k(a);
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        i23 = i15;
                        i24 = 1;
                        z4 = true;
                        i25 = 1;
                        iu30Var4 = iu30Var2;
                        j12 = j11;
                    } else {
                        x340Var2.b0();
                        if ((i7 & SemanticState.ReadOnly) != 0) {
                            i15 &= -15;
                        }
                        if ((i7 & 131072) != 0) {
                            i15 &= -29360129;
                        }
                        j10 = j;
                        j11 = j3;
                        i24 = i2;
                        i25 = i4;
                        lee1Var3 = lee1Var;
                        i22 = i14;
                        i23 = i15;
                        z4 = z;
                        iu30Var4 = iu30Var2;
                        j12 = j4;
                    }
                    x340Var2.s();
                    if (j10 != 16) {
                        jC = j10;
                    } else {
                        jC = lee1Var3.c();
                    }
                    int i37 = i24;
                    if (jC == 16) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zH = x340Var2.h(z5);
                    z6 = z5;
                    objT = x340Var2.T();
                    if (zH || objT == fkj0.X) {
                        objT = z6 ? new yrl() : null;
                        x340Var2.s0(objT);
                    }
                    yrlVar = (yrl) objT;
                    if (yrlVar != null) {
                        qim0Var4 = yrlVar.b;
                    }
                    int i38 = i12;
                    long j13 = j12;
                    lee1 lee1Var4 = lee1Var3;
                    int i39 = (i34 & 14) | ((i23 >> 9) & 7168);
                    int i40 = i23 << 6;
                    boolean z7 = z4;
                    int i41 = i22;
                    int i42 = i25;
                    iu30 iu30Var5 = iu30Var4;
                    jch0.c(str, qim0Var2.then(qim0Var4), lee1.f(lee1Var4, jC, j5, fontWeight2, (FontFamily) null, j11, i38, j13, 16609104), iu30Var5, i37, z7, i41, i42, yrlVar, (m0e1) null, x340Var2, i39 | (i40 & 57344) | (i40 & 458752) | (i40 & 3670016) | (i40 & 29360128) | 805306368, 0);
                    x340Var = x340Var2;
                    lee1Var2 = lee1Var4;
                    i19 = i41;
                    fontWeight3 = fontWeight2;
                    i18 = i38;
                    j7 = j5;
                    j6 = j13;
                    i20 = i37;
                    z3 = z7;
                    i17 = i42;
                    iu30Var3 = iu30Var5;
                    qim0Var3 = qim0Var2;
                    j8 = j10;
                    j9 = j11;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    j6 = j4;
                    i17 = i4;
                    lee1Var2 = lee1Var;
                    i18 = i12;
                    i19 = i14;
                    fontWeight3 = fontWeight2;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    j7 = j5;
                    j8 = j;
                    j9 = j3;
                    i20 = i2;
                    z3 = z;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.k9e1
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = czo1.p(i5 | 1);
                            int iP2 = czo1.p(i6);
                            String str2 = str;
                            qim0 qim0Var5 = qim0Var3;
                            long j14 = j8;
                            long j15 = j7;
                            FontWeight fontWeight4 = fontWeight3;
                            long j16 = j9;
                            byte b = i18;
                            long j17 = j6;
                            boolean z8 = i20;
                            boolean z9 = z3;
                            int i43 = i19;
                            boolean z10 = i17;
                            iu30 iu30Var6 = iu30Var3;
                            lee1 lee1Var5 = lee1Var2;
                            int i44 = i7;
                            r9e1.a(str2, qim0Var5, j14, j15, fontWeight4, j16, b, j17, z8 ? 1 : 0, z9, i43, z10 ? 1 : 0, iu30Var6, lee1Var5, (b0k) obj, iP, iP2, i44);
                            return rih1.a;
                        }
                    };
                }
            }
            i15 = i35 | 1769472;
            iu30Var2 = iu30Var;
            if ((i6 & 12582912) != 0) {
                if ((i7 & 131072) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i15 |= i26;
            }
            if ((i34 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i34 & 1, z2)) {
                x340Var2.d0();
                i21 = i5 & 1;
                qim0Var4 = nim0.a;
                if (i21 != 0) {
                    if (i28 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    j10 = u7h.k;
                    if (i30 != 0) {
                        j5 = TextUnit.c;
                    }
                    if (i33 != 0) {
                        fontWeight2 = null;
                    }
                    j11 = TextUnit.c;
                    if ((i7 & SemanticState.ReadOnly) != 0) {
                        i15 &= -15;
                        i12 = 0;
                    }
                    if (i36 != 0) {
                        i22 = Alert.DURATION_SHOW_INDEFINITELY;
                    } else {
                        i22 = i14;
                    }
                    if (i16 != 0) {
                        iu30Var2 = null;
                    }
                    if ((i7 & 131072) != 0) {
                        i15 &= -29360129;
                        lee1Var3 = (lee1) x340Var2.k(a);
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    i23 = i15;
                    i24 = 1;
                    z4 = true;
                    i25 = 1;
                    iu30Var4 = iu30Var2;
                    j12 = j11;
                } else {
                    if (i28 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    j10 = u7h.k;
                    if (i30 != 0) {
                        j5 = TextUnit.c;
                    }
                    if (i33 != 0) {
                        fontWeight2 = null;
                    }
                    j11 = TextUnit.c;
                    if ((i7 & SemanticState.ReadOnly) != 0) {
                        i15 &= -15;
                        i12 = 0;
                    }
                    if (i36 != 0) {
                        i22 = Alert.DURATION_SHOW_INDEFINITELY;
                    } else {
                        i22 = i14;
                    }
                    if (i16 != 0) {
                        iu30Var2 = null;
                    }
                    if ((i7 & 131072) != 0) {
                        i15 &= -29360129;
                        lee1Var3 = (lee1) x340Var2.k(a);
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    i23 = i15;
                    i24 = 1;
                    z4 = true;
                    i25 = 1;
                    iu30Var4 = iu30Var2;
                    j12 = j11;
                }
                x340Var2.s();
                if (j10 != 16) {
                    jC = j10;
                } else {
                    jC = lee1Var3.c();
                }
                int i310 = i24;
                if (jC == 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zH = x340Var2.h(z5);
                z6 = z5;
                objT = x340Var2.T();
                if (zH) {
                    objT = z6 ? new yrl() : null;
                    x340Var2.s0(objT);
                } else {
                    objT = z6 ? new yrl() : null;
                    x340Var2.s0(objT);
                }
                yrlVar = (yrl) objT;
                if (yrlVar != null) {
                    qim0Var4 = yrlVar.b;
                }
                int i311 = i12;
                long j14 = j12;
                lee1 lee1Var5 = lee1Var3;
                int i312 = (i34 & 14) | ((i23 >> 9) & 7168);
                int i43 = i23 << 6;
                boolean z8 = z4;
                int i44 = i22;
                int i45 = i25;
                iu30 iu30Var6 = iu30Var4;
                jch0.c(str, qim0Var2.then(qim0Var4), lee1.f(lee1Var5, jC, j5, fontWeight2, (FontFamily) null, j11, i311, j14, 16609104), iu30Var6, i310, z8, i44, i45, yrlVar, (m0e1) null, x340Var2, i312 | (i43 & 57344) | (i43 & 458752) | (i43 & 3670016) | (i43 & 29360128) | 805306368, 0);
                x340Var = x340Var2;
                lee1Var2 = lee1Var5;
                i19 = i44;
                fontWeight3 = fontWeight2;
                i18 = i311;
                j7 = j5;
                j6 = j14;
                i20 = i310;
                z3 = z8;
                i17 = i45;
                iu30Var3 = iu30Var6;
                qim0Var3 = qim0Var2;
                j8 = j10;
                j9 = j11;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                j6 = j4;
                i17 = i4;
                lee1Var2 = lee1Var;
                i18 = i12;
                i19 = i14;
                fontWeight3 = fontWeight2;
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
                j7 = j5;
                j8 = j;
                j9 = j3;
                i20 = i2;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.k9e1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = czo1.p(i5 | 1);
                        int iP2 = czo1.p(i6);
                        String str2 = str;
                        qim0 qim0Var5 = qim0Var3;
                        long j15 = j8;
                        long j16 = j7;
                        FontWeight fontWeight4 = fontWeight3;
                        long j17 = j9;
                        byte b = i18;
                        long j18 = j6;
                        boolean z9 = i20;
                        boolean z10 = z3;
                        int i46 = i19;
                        boolean z11 = i17;
                        iu30 iu30Var7 = iu30Var3;
                        lee1 lee1Var6 = lee1Var2;
                        int i47 = i7;
                        r9e1.a(str2, qim0Var5, j15, j16, fontWeight4, j17, b, j18, z9 ? 1 : 0, z10, i46, z11 ? 1 : 0, iu30Var7, lee1Var6, (b0k) obj, iP, iP2, i47);
                        return rih1.a;
                    }
                };
            }
        }
        i35 = i13 | 28080;
        i14 = i3;
        i15 = i35 | 196608;
        i16 = i7 & 65536;
        if (i16 != 0) {
            if ((1572864 & i6) == 0) {
                iu30Var2 = iu30Var;
                i15 |= x340Var2.i(iu30Var2) ? 1048576 : 524288;
            }
            if ((i6 & 12582912) != 0) {
                if ((i7 & 131072) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i15 |= i26;
            }
            if ((i34 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i34 & 1, z2)) {
                x340Var2.d0();
                i21 = i5 & 1;
                qim0Var4 = nim0.a;
                if (i21 != 0) {
                    if (i28 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    j10 = u7h.k;
                    if (i30 != 0) {
                        j5 = TextUnit.c;
                    }
                    if (i33 != 0) {
                        fontWeight2 = null;
                    }
                    j11 = TextUnit.c;
                    if ((i7 & SemanticState.ReadOnly) != 0) {
                        i15 &= -15;
                        i12 = 0;
                    }
                    if (i36 != 0) {
                        i22 = Alert.DURATION_SHOW_INDEFINITELY;
                    } else {
                        i22 = i14;
                    }
                    if (i16 != 0) {
                        iu30Var2 = null;
                    }
                    if ((i7 & 131072) != 0) {
                        i15 &= -29360129;
                        lee1Var3 = (lee1) x340Var2.k(a);
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    i23 = i15;
                    i24 = 1;
                    z4 = true;
                    i25 = 1;
                    iu30Var4 = iu30Var2;
                    j12 = j11;
                } else {
                    if (i28 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    j10 = u7h.k;
                    if (i30 != 0) {
                        j5 = TextUnit.c;
                    }
                    if (i33 != 0) {
                        fontWeight2 = null;
                    }
                    j11 = TextUnit.c;
                    if ((i7 & SemanticState.ReadOnly) != 0) {
                        i15 &= -15;
                        i12 = 0;
                    }
                    if (i36 != 0) {
                        i22 = Alert.DURATION_SHOW_INDEFINITELY;
                    } else {
                        i22 = i14;
                    }
                    if (i16 != 0) {
                        iu30Var2 = null;
                    }
                    if ((i7 & 131072) != 0) {
                        i15 &= -29360129;
                        lee1Var3 = (lee1) x340Var2.k(a);
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    i23 = i15;
                    i24 = 1;
                    z4 = true;
                    i25 = 1;
                    iu30Var4 = iu30Var2;
                    j12 = j11;
                }
                x340Var2.s();
                if (j10 != 16) {
                    jC = j10;
                } else {
                    jC = lee1Var3.c();
                }
                int i313 = i24;
                if (jC == 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zH = x340Var2.h(z5);
                z6 = z5;
                objT = x340Var2.T();
                if (zH) {
                    objT = z6 ? new yrl() : null;
                    x340Var2.s0(objT);
                } else {
                    objT = z6 ? new yrl() : null;
                    x340Var2.s0(objT);
                }
                yrlVar = (yrl) objT;
                if (yrlVar != null) {
                    qim0Var4 = yrlVar.b;
                }
                int i314 = i12;
                long j15 = j12;
                lee1 lee1Var6 = lee1Var3;
                int i315 = (i34 & 14) | ((i23 >> 9) & 7168);
                int i46 = i23 << 6;
                boolean z9 = z4;
                int i47 = i22;
                int i48 = i25;
                iu30 iu30Var7 = iu30Var4;
                jch0.c(str, qim0Var2.then(qim0Var4), lee1.f(lee1Var6, jC, j5, fontWeight2, (FontFamily) null, j11, i314, j15, 16609104), iu30Var7, i313, z9, i47, i48, yrlVar, (m0e1) null, x340Var2, i315 | (i46 & 57344) | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128) | 805306368, 0);
                x340Var = x340Var2;
                lee1Var2 = lee1Var6;
                i19 = i47;
                fontWeight3 = fontWeight2;
                i18 = i314;
                j7 = j5;
                j6 = j15;
                i20 = i313;
                z3 = z9;
                i17 = i48;
                iu30Var3 = iu30Var7;
                qim0Var3 = qim0Var2;
                j8 = j10;
                j9 = j11;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                j6 = j4;
                i17 = i4;
                lee1Var2 = lee1Var;
                i18 = i12;
                i19 = i14;
                fontWeight3 = fontWeight2;
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
                j7 = j5;
                j8 = j;
                j9 = j3;
                i20 = i2;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.k9e1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = czo1.p(i5 | 1);
                        int iP2 = czo1.p(i6);
                        String str2 = str;
                        qim0 qim0Var5 = qim0Var3;
                        long j16 = j8;
                        long j17 = j7;
                        FontWeight fontWeight4 = fontWeight3;
                        long j18 = j9;
                        byte b = i18;
                        long j19 = j6;
                        boolean z10 = i20;
                        boolean z11 = z3;
                        int i49 = i19;
                        boolean z12 = i17;
                        iu30 iu30Var8 = iu30Var3;
                        lee1 lee1Var7 = lee1Var2;
                        int i410 = i7;
                        r9e1.a(str2, qim0Var5, j16, j17, fontWeight4, j18, b, j19, z10 ? 1 : 0, z11, i49, z12 ? 1 : 0, iu30Var8, lee1Var7, (b0k) obj, iP, iP2, i410);
                        return rih1.a;
                    }
                };
            }
        }
        i15 = i35 | 1769472;
        iu30Var2 = iu30Var;
        if ((i6 & 12582912) != 0) {
            if ((i7 & 131072) == 0) {
                i26 = 4194304;
            } else {
                i26 = 4194304;
            }
            i15 |= i26;
        }
        if ((i34 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var2.Y(i34 & 1, z2)) {
            x340Var2.d0();
            i21 = i5 & 1;
            qim0Var4 = nim0.a;
            if (i21 != 0) {
                if (i28 != 0) {
                    qim0Var2 = qim0Var4;
                }
                j10 = u7h.k;
                if (i30 != 0) {
                    j5 = TextUnit.c;
                }
                if (i33 != 0) {
                    fontWeight2 = null;
                }
                j11 = TextUnit.c;
                if ((i7 & SemanticState.ReadOnly) != 0) {
                    i15 &= -15;
                    i12 = 0;
                }
                if (i36 != 0) {
                    i22 = Alert.DURATION_SHOW_INDEFINITELY;
                } else {
                    i22 = i14;
                }
                if (i16 != 0) {
                    iu30Var2 = null;
                }
                if ((i7 & 131072) != 0) {
                    i15 &= -29360129;
                    lee1Var3 = (lee1) x340Var2.k(a);
                } else {
                    lee1Var3 = lee1Var;
                }
                i23 = i15;
                i24 = 1;
                z4 = true;
                i25 = 1;
                iu30Var4 = iu30Var2;
                j12 = j11;
            } else {
                if (i28 != 0) {
                    qim0Var2 = qim0Var4;
                }
                j10 = u7h.k;
                if (i30 != 0) {
                    j5 = TextUnit.c;
                }
                if (i33 != 0) {
                    fontWeight2 = null;
                }
                j11 = TextUnit.c;
                if ((i7 & SemanticState.ReadOnly) != 0) {
                    i15 &= -15;
                    i12 = 0;
                }
                if (i36 != 0) {
                    i22 = Alert.DURATION_SHOW_INDEFINITELY;
                } else {
                    i22 = i14;
                }
                if (i16 != 0) {
                    iu30Var2 = null;
                }
                if ((i7 & 131072) != 0) {
                    i15 &= -29360129;
                    lee1Var3 = (lee1) x340Var2.k(a);
                } else {
                    lee1Var3 = lee1Var;
                }
                i23 = i15;
                i24 = 1;
                z4 = true;
                i25 = 1;
                iu30Var4 = iu30Var2;
                j12 = j11;
            }
            x340Var2.s();
            if (j10 != 16) {
                jC = j10;
            } else {
                jC = lee1Var3.c();
            }
            int i316 = i24;
            if (jC == 16) {
                z5 = true;
            } else {
                z5 = false;
            }
            zH = x340Var2.h(z5);
            z6 = z5;
            objT = x340Var2.T();
            if (zH) {
                objT = z6 ? new yrl() : null;
                x340Var2.s0(objT);
            } else {
                objT = z6 ? new yrl() : null;
                x340Var2.s0(objT);
            }
            yrlVar = (yrl) objT;
            if (yrlVar != null) {
                qim0Var4 = yrlVar.b;
            }
            int i317 = i12;
            long j16 = j12;
            lee1 lee1Var7 = lee1Var3;
            int i318 = (i34 & 14) | ((i23 >> 9) & 7168);
            int i49 = i23 << 6;
            boolean z10 = z4;
            int i410 = i22;
            int i411 = i25;
            iu30 iu30Var8 = iu30Var4;
            jch0.c(str, qim0Var2.then(qim0Var4), lee1.f(lee1Var7, jC, j5, fontWeight2, (FontFamily) null, j11, i317, j16, 16609104), iu30Var8, i316, z10, i410, i411, yrlVar, (m0e1) null, x340Var2, i318 | (i49 & 57344) | (i49 & 458752) | (i49 & 3670016) | (i49 & 29360128) | 805306368, 0);
            x340Var = x340Var2;
            lee1Var2 = lee1Var7;
            i19 = i410;
            fontWeight3 = fontWeight2;
            i18 = i317;
            j7 = j5;
            j6 = j16;
            i20 = i316;
            z3 = z10;
            i17 = i411;
            iu30Var3 = iu30Var8;
            qim0Var3 = qim0Var2;
            j8 = j10;
            j9 = j11;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            j6 = j4;
            i17 = i4;
            lee1Var2 = lee1Var;
            i18 = i12;
            i19 = i14;
            fontWeight3 = fontWeight2;
            qim0Var3 = qim0Var2;
            iu30Var3 = iu30Var2;
            j7 = j5;
            j8 = j;
            j9 = j3;
            i20 = i2;
            z3 = z;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.k9e1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i5 | 1);
                    int iP2 = czo1.p(i6);
                    String str2 = str;
                    qim0 qim0Var5 = qim0Var3;
                    long j17 = j8;
                    long j18 = j7;
                    FontWeight fontWeight4 = fontWeight3;
                    long j19 = j9;
                    byte b = i18;
                    long j110 = j6;
                    boolean z11 = i20;
                    boolean z12 = z3;
                    int i412 = i19;
                    boolean z13 = i17;
                    iu30 iu30Var9 = iu30Var3;
                    lee1 lee1Var8 = lee1Var2;
                    int i413 = i7;
                    r9e1.a(str2, qim0Var5, j17, j18, fontWeight4, j19, b, j110, z11 ? 1 : 0, z12, i412, z13 ? 1 : 0, iu30Var9, lee1Var8, (b0k) obj, iP, iP2, i413);
                    return rih1.a;
                }
            };
        }
    }

    public static final kiv b() {
        return a;
    }
}
