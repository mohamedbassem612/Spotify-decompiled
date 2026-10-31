package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class dem0 {
    public static final long a = sgc1.u(0.5f, 0.0f);

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0132  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0167  */
    /* JADX WARN: Code duplicated, block: B:125:0x016c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0170  */
    /* JADX WARN: Code duplicated, block: B:129:0x0178  */
    /* JADX WARN: Code duplicated, block: B:130:0x017b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0194  */
    /* JADX WARN: Code duplicated, block: B:141:0x019d  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:168:0x0203  */
    /* JADX WARN: Code duplicated, block: B:171:0x0208  */
    /* JADX WARN: Code duplicated, block: B:174:0x0212  */
    /* JADX WARN: Code duplicated, block: B:177:0x021c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0223  */
    /* JADX WARN: Code duplicated, block: B:180:0x0227  */
    /* JADX WARN: Code duplicated, block: B:181:0x022a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0232  */
    /* JADX WARN: Code duplicated, block: B:185:0x023a  */
    /* JADX WARN: Code duplicated, block: B:187:0x023e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0241  */
    /* JADX WARN: Code duplicated, block: B:191:0x0247  */
    /* JADX WARN: Code duplicated, block: B:192:0x024c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0252  */
    /* JADX WARN: Code duplicated, block: B:197:0x027b  */
    /* JADX WARN: Code duplicated, block: B:200:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:202:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:208:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:214:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:217:0x0306  */
    /* JADX WARN: Code duplicated, block: B:219:0x030c  */
    /* JADX WARN: Code duplicated, block: B:225:0x031e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0320  */
    /* JADX WARN: Code duplicated, block: B:229:0x0329 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x032b  */
    /* JADX WARN: Code duplicated, block: B:233:0x033f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0349  */
    /* JADX WARN: Code duplicated, block: B:239:0x034f A[PHI: r38
      0x034f: PHI (r38v5 kotlin.jvm.functions.Function0) = (r38v2 kotlin.jvm.functions.Function0), (r38v6 kotlin.jvm.functions.Function0) binds: [B:238:0x034d, B:236:0x0346] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:240:0x0351  */
    /* JADX WARN: Code duplicated, block: B:243:0x0358  */
    /* JADX WARN: Code duplicated, block: B:244:0x035a  */
    /* JADX WARN: Code duplicated, block: B:247:0x0363 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x0365  */
    /* JADX WARN: Code duplicated, block: B:251:0x0377  */
    /* JADX WARN: Code duplicated, block: B:254:0x0386  */
    /* JADX WARN: Code duplicated, block: B:258:0x0390  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0396 A[PHI: r21
      0x0396: PHI (r21v3 int) = (r21v0 int), (r21v5 int) binds: [B:259:0x0394, B:257:0x038d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:261:0x0398  */
    /* JADX WARN: Code duplicated, block: B:264:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:265:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:268:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:272:0x040c  */
    /* JADX WARN: Code duplicated, block: B:274:0x0418  */
    /* JADX WARN: Code duplicated, block: B:276:0x041e  */
    /* JADX WARN: Code duplicated, block: B:282:0x042e  */
    /* JADX WARN: Code duplicated, block: B:284:0x0432  */
    /* JADX WARN: Code duplicated, block: B:286:0x0447  */
    /* JADX WARN: Code duplicated, block: B:288:0x0466  */
    /* JADX WARN: Code duplicated, block: B:291:0x0482  */
    /* JADX WARN: Code duplicated, block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    public static final void a(Function0 function0, qim0 qim0Var, vy71 vy71Var, float f, boolean z, hw61 hw61Var, long j, long j2, float f2, long j3, vu30 vu30Var, vu30 vu30Var2, eem0 eem0Var, j2i j2iVar, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        hw61 hw61VarC;
        int i9;
        long jB;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z3;
        x340 x340Var;
        float f3;
        vu30 vu30Var3;
        vu30 vu30Var4;
        eem0 eem0Var2;
        long j4;
        boolean z4;
        hw61 hw61Var2;
        qim0 qim0Var3;
        long j5;
        float f4;
        long j6;
        h311 h311VarV;
        float f5;
        long jB2;
        float f6;
        long jE;
        vu30 vu30Var5;
        vu30 vu30Var6;
        int i19;
        long j7;
        qim0 qim0Var4;
        eem0 eem0Var3;
        vu30 vu30Var7;
        long j8;
        boolean z5;
        int i20;
        float f7;
        vu30 vu30Var8;
        float f8;
        long j9;
        hw61 hw61Var3;
        n8b1 n8b1VarW;
        n8b1 n8b1VarW2;
        n8b1 n8b1VarW3;
        int i21;
        boolean zI;
        Object objT;
        vy71 vy71Var2;
        Object objT2;
        c9n c9nVar;
        int i22;
        boolean z6;
        boolean z7;
        Object objT3;
        Function0 function1;
        Function0 function2;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objT4;
        Object objT5;
        o95 o95Var;
        int i23;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objT6;
        int i24;
        int i25;
        boolean z14;
        Object objT7;
        int i26;
        int i27;
        int i28;
        int i29;
        vy71 vy71Var3 = vy71Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1904798512);
        if ((i & 6) == 0) {
            i4 = (x340Var2.i(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i30 = i3 & 2;
        if (i30 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var2.g(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (x340Var2.g(vy71Var3)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i4 |= i29;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    if (x340Var2.d(f)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        if (x340Var2.h(z2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i & 196608) == 0) {
                        hw61VarC = hw61Var;
                        if ((i3 & 32) == 0 || !x340Var2.g(hw61VarC)) {
                            i28 = 65536;
                        } else {
                            i28 = 131072;
                        }
                        i4 |= i28;
                    } else {
                        hw61VarC = hw61Var;
                    }
                    if ((i & 1572864) == 0) {
                        if ((i3 & 64) == 0) {
                            i9 = i30;
                            jB = j;
                            int i31 = x340Var2.f(jB) ? 1048576 : 524288;
                            i4 |= i31;
                        } else {
                            i9 = i30;
                            jB = j;
                        }
                        i4 |= i31;
                    } else {
                        i9 = i30;
                        jB = j;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            i27 = i4;
                            int i32 = x340Var2.f(j2) ? 8388608 : 4194304;
                            i10 = i27 | i32;
                        } else {
                            i27 = i4;
                        }
                        i10 = i27 | i32;
                    } else {
                        i10 = i4;
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                        if ((i & 100663296) == 0) {
                            if (x340Var2.d(f2)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i10 |= i12;
                        }
                        if ((i & 805306368) != 0) {
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 || !x340Var2.f(j3)) {
                                i26 = 268435456;
                            } else {
                                i26 = 536870912;
                            }
                            i10 |= i26;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i14 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (x340Var2.i(vu30Var)) {
                                i15 = 4;
                            } else {
                                i15 = 2;
                            }
                            i14 = i2 | i15;
                        } else {
                            i14 = i2;
                        }
                        i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                        i17 = i3 & 4096;
                        if (i17 != 0) {
                            if ((i2 & 384) == 0) {
                                if (x340Var2.g(eem0Var)) {
                                    i18 = 256;
                                } else {
                                    i18 = 128;
                                }
                                i16 |= i18;
                            }
                            if ((i10 & 306783379) == 306783378 || (i16 & 1171) != 1170) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (x340Var2.Y(i10 & 1, z3)) {
                                x340Var2.d0();
                                if ((i & 1) != 0 || x340Var2.E()) {
                                    if (i9 != 0) {
                                        qim0Var2 = nim0.a;
                                    }
                                    if (i5 != 0) {
                                        f5 = 640.0f;
                                    } else {
                                        f5 = f;
                                    }
                                    if (i7 != 0) {
                                        z2 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        hw61VarC = vrg.c(x340Var2);
                                        i10 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jB = vrg.b(x340Var2);
                                        i10 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        jB2 = eah.b(jB, x340Var2);
                                        i10 &= -29360129;
                                    } else {
                                        jB2 = j2;
                                    }
                                    if (i11 != 0) {
                                        f6 = 0.0f;
                                    } else {
                                        f6 = f2;
                                    }
                                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                        jE = vrg.e(x340Var2);
                                        i10 &= -1879048193;
                                    } else {
                                        jE = j3;
                                    }
                                    if (i13 != 0) {
                                        vu30Var5 = j2j.a;
                                    } else {
                                        vu30Var5 = vu30Var;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        vu30Var6 = q5.U0;
                                        i16 &= -113;
                                    } else {
                                        vu30Var6 = vu30Var2;
                                    }
                                    i19 = i16;
                                    if (i17 != 0) {
                                        j7 = jB;
                                        qim0Var4 = qim0Var2;
                                        eem0Var3 = new eem0(3);
                                    } else {
                                        j7 = jB;
                                        qim0Var4 = qim0Var2;
                                        eem0Var3 = eem0Var;
                                    }
                                    vu30Var7 = vu30Var6;
                                    j8 = jB2;
                                    z5 = false;
                                    i20 = 1;
                                    hw61 hw61Var4 = hw61VarC;
                                    f7 = f5;
                                    long j10 = jE;
                                    vu30Var8 = vu30Var5;
                                    f8 = f6;
                                    j9 = j10;
                                    hw61Var3 = hw61Var4;
                                } else {
                                    x340Var2.b0();
                                    if ((i3 & 32) != 0) {
                                        i10 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i10 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i10 &= -29360129;
                                    }
                                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                        i10 &= -1879048193;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i16 &= -113;
                                    }
                                    i10 = i10;
                                    j7 = jB;
                                    qim0 qim0Var5 = qim0Var2;
                                    z2 = z2;
                                    qim0Var4 = qim0Var5;
                                    j8 = j2;
                                    f8 = f2;
                                    j9 = j3;
                                    vu30Var8 = vu30Var;
                                    eem0Var3 = eem0Var;
                                    i19 = i16;
                                    hw61Var3 = hw61VarC;
                                    z5 = false;
                                    i20 = 1;
                                    f7 = f;
                                    vu30Var7 = vu30Var2;
                                }
                                x340Var2.s();
                                vu30 vu30Var9 = vu30Var7;
                                eem0 eem0Var4 = eem0Var3;
                                int i33 = i20;
                                n8b1VarW = t890.w(x340Var2, i33);
                                n8b1VarW2 = t890.w(x340Var2, i33);
                                n8b1VarW3 = t890.w(x340Var2, 5);
                                long j11 = j9;
                                i21 = (i10 & 896) ^ 384;
                                zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                                objT = x340Var2.T();
                                if (!zI || objT == m4cVar) {
                                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                    vy71Var2 = vy71Var;
                                    x340Var2.s0(objT);
                                } else {
                                    vy71Var2 = vy71Var;
                                }
                                qxd0.D((Function0) objT, x340Var2);
                                objT2 = x340Var2.T();
                                if (objT2 == m4cVar) {
                                    objT2 = qxd0.M(o6x.a, x340Var2);
                                    x340Var2.s0(objT2);
                                }
                                c9nVar = (c9n) objT2;
                                boolean zI2 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                                i22 = i10 & 14;
                                if (i22 == 4) {
                                    z6 = true;
                                } else {
                                    z6 = z5;
                                }
                                z7 = zI2 | z6;
                                objT3 = x340Var2.T();
                                if (z7 || objT3 == m4cVar) {
                                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                    x340Var2.s0(objT3);
                                }
                                function1 = (Function0) objT3;
                                boolean zI3 = x340Var2.i(c9nVar);
                                if (i21 > 256 || !x340Var2.g(vy71Var2)) {
                                    function2 = function1;
                                    if ((i10 & 384) != 256) {
                                        z8 = z5;
                                    }
                                    boolean z15 = zI3 | z8;
                                    if (i22 == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = z5;
                                    }
                                    z10 = z15 | z9;
                                    objT4 = x340Var2.T();
                                    if (z10 || objT4 == m4cVar) {
                                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                        x340Var2.s0(objT4);
                                    }
                                    iu30 iu30Var = (iu30) objT4;
                                    objT5 = x340Var2.T();
                                    if (objT5 == m4cVar) {
                                        objT5 = c97.b(0.0f);
                                        x340Var2.s0(objT5);
                                    }
                                    o95Var = (o95) objT5;
                                    if (i21 > 256 || !x340Var2.g(vy71Var2)) {
                                        i23 = i21;
                                        if ((i10 & 384) != 256) {
                                            z11 = z5;
                                        }
                                        boolean zI4 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                                        if (i22 == 4) {
                                            z12 = true;
                                        } else {
                                            z12 = z5;
                                        }
                                        z13 = z12 | zI4;
                                        objT6 = x340Var2.T();
                                        if (z13 || objT6 == m4cVar) {
                                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                            x340Var2.s0(objT6);
                                        }
                                        x340Var = x340Var2;
                                        i24 = i23;
                                        vy71 vy71Var4 = vy71Var2;
                                        i25 = i10;
                                        vy71Var3 = vy71Var4;
                                        a8o.i((Function0) objT6, j8, eem0Var4, o95Var, apo.r(1010026864, new zdm0(j11, function2, vy71Var4, eem0Var4, o95Var, c9nVar, iu30Var, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var9, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                                        if (vy71Var3.e()) {
                                            x340Var.i0(748459762);
                                            z14 = (i24 <= 256 && x340Var.g(vy71Var3)) || (i25 & 384) == 256;
                                            objT7 = x340Var.T();
                                            if (z14 || objT7 == m4cVar) {
                                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                                x340Var.s0(objT7);
                                            }
                                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                                            x340Var.r(false);
                                        } else {
                                            x340Var.i0(748521266);
                                            x340Var.r(false);
                                        }
                                        eem0Var2 = eem0Var4;
                                        j4 = j7;
                                        qim0Var3 = qim0Var4;
                                        hw61Var2 = hw61Var3;
                                        j5 = j8;
                                        f4 = f8;
                                        vu30Var3 = vu30Var8;
                                        vu30Var4 = vu30Var9;
                                        f3 = f7;
                                        z4 = z2;
                                        j6 = j11;
                                    } else {
                                        i23 = i21;
                                    }
                                    z11 = true;
                                    boolean zI5 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                                    if (i22 == 4) {
                                        z12 = true;
                                    } else {
                                        z12 = z5;
                                    }
                                    z13 = z12 | zI5;
                                    objT6 = x340Var2.T();
                                    if (z13) {
                                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                        x340Var2.s0(objT6);
                                    } else {
                                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                        x340Var2.s0(objT6);
                                    }
                                    x340Var = x340Var2;
                                    i24 = i23;
                                    vy71 vy71Var5 = vy71Var2;
                                    i25 = i10;
                                    vy71Var3 = vy71Var5;
                                    a8o.i((Function0) objT6, j8, eem0Var4, o95Var, apo.r(1010026864, new zdm0(j11, function2, vy71Var5, eem0Var4, o95Var, c9nVar, iu30Var, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var9, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                                    if (vy71Var3.e()) {
                                        x340Var.i0(748459762);
                                        if (i24 <= 256) {
                                        }
                                        objT7 = x340Var.T();
                                        if (z14) {
                                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                            x340Var.s0(objT7);
                                        } else {
                                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                            x340Var.s0(objT7);
                                        }
                                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                                        x340Var.r(false);
                                    } else {
                                        x340Var.i0(748521266);
                                        x340Var.r(false);
                                    }
                                    eem0Var2 = eem0Var4;
                                    j4 = j7;
                                    qim0Var3 = qim0Var4;
                                    hw61Var2 = hw61Var3;
                                    j5 = j8;
                                    f4 = f8;
                                    vu30Var3 = vu30Var8;
                                    vu30Var4 = vu30Var9;
                                    f3 = f7;
                                    z4 = z2;
                                    j6 = j11;
                                } else {
                                    function2 = function1;
                                }
                                z8 = true;
                                boolean z16 = zI3 | z8;
                                if (i22 == 4) {
                                    z9 = true;
                                } else {
                                    z9 = z5;
                                }
                                z10 = z16 | z9;
                                objT4 = x340Var2.T();
                                if (z10) {
                                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                    x340Var2.s0(objT4);
                                } else {
                                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                    x340Var2.s0(objT4);
                                }
                                iu30 iu30Var2 = (iu30) objT4;
                                objT5 = x340Var2.T();
                                if (objT5 == m4cVar) {
                                    objT5 = c97.b(0.0f);
                                    x340Var2.s0(objT5);
                                }
                                o95Var = (o95) objT5;
                                if (i21 > 256) {
                                    i23 = i21;
                                    if ((i10 & 384) != 256) {
                                        z11 = true;
                                    } else {
                                        z11 = z5;
                                    }
                                } else {
                                    i23 = i21;
                                    if ((i10 & 384) != 256) {
                                        z11 = true;
                                    } else {
                                        z11 = z5;
                                    }
                                }
                                boolean zI6 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                                if (i22 == 4) {
                                    z12 = true;
                                } else {
                                    z12 = z5;
                                }
                                z13 = z12 | zI6;
                                objT6 = x340Var2.T();
                                if (z13) {
                                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                    x340Var2.s0(objT6);
                                } else {
                                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                    x340Var2.s0(objT6);
                                }
                                x340Var = x340Var2;
                                i24 = i23;
                                vy71 vy71Var6 = vy71Var2;
                                i25 = i10;
                                vy71Var3 = vy71Var6;
                                a8o.i((Function0) objT6, j8, eem0Var4, o95Var, apo.r(1010026864, new zdm0(j11, function2, vy71Var6, eem0Var4, o95Var, c9nVar, iu30Var2, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var9, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                                if (vy71Var3.e()) {
                                    x340Var.i0(748459762);
                                    if (i24 <= 256) {
                                    }
                                    objT7 = x340Var.T();
                                    if (z14) {
                                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                        x340Var.s0(objT7);
                                    } else {
                                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                        x340Var.s0(objT7);
                                    }
                                    qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                                    x340Var.r(false);
                                } else {
                                    x340Var.i0(748521266);
                                    x340Var.r(false);
                                }
                                eem0Var2 = eem0Var4;
                                j4 = j7;
                                qim0Var3 = qim0Var4;
                                hw61Var2 = hw61Var3;
                                j5 = j8;
                                f4 = f8;
                                vu30Var3 = vu30Var8;
                                vu30Var4 = vu30Var9;
                                f3 = f7;
                                z4 = z2;
                                j6 = j11;
                            } else {
                                x340Var = x340Var2;
                                x340Var.b0();
                                f3 = f;
                                vu30Var3 = vu30Var;
                                vu30Var4 = vu30Var2;
                                eem0Var2 = eem0Var;
                                j4 = jB;
                                z4 = z2;
                                hw61Var2 = hw61VarC;
                                qim0Var3 = qim0Var2;
                                j5 = j2;
                                f4 = f2;
                                j6 = j3;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                            }
                        }
                        i16 |= 384;
                        if ((i10 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (x340Var2.Y(i10 & 1, z3)) {
                            x340Var2.d0();
                            if ((i & 1) != 0) {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var5 = hw61VarC;
                                f7 = f5;
                                long j12 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j12;
                                hw61Var3 = hw61Var5;
                            } else {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var6 = hw61VarC;
                                f7 = f5;
                                long j13 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j13;
                                hw61Var3 = hw61Var6;
                            }
                            x340Var2.s();
                            vu30 vu30Var10 = vu30Var7;
                            eem0 eem0Var5 = eem0Var3;
                            int i34 = i20;
                            n8b1VarW = t890.w(x340Var2, i34);
                            n8b1VarW2 = t890.w(x340Var2, i34);
                            n8b1VarW3 = t890.w(x340Var2, 5);
                            long j14 = j9;
                            i21 = (i10 & 896) ^ 384;
                            zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                            objT = x340Var2.T();
                            if (zI) {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            } else {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            }
                            qxd0.D((Function0) objT, x340Var2);
                            objT2 = x340Var2.T();
                            if (objT2 == m4cVar) {
                                objT2 = qxd0.M(o6x.a, x340Var2);
                                x340Var2.s0(objT2);
                            }
                            c9nVar = (c9n) objT2;
                            boolean zI7 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                            i22 = i10 & 14;
                            if (i22 == 4) {
                                z6 = true;
                            } else {
                                z6 = z5;
                            }
                            z7 = zI7 | z6;
                            objT3 = x340Var2.T();
                            if (z7) {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            } else {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            }
                            function1 = (Function0) objT3;
                            boolean zI8 = x340Var2.i(c9nVar);
                            if (i21 > 256) {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            } else {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            }
                            boolean z17 = zI8 | z8;
                            if (i22 == 4) {
                                z9 = true;
                            } else {
                                z9 = z5;
                            }
                            z10 = z17 | z9;
                            objT4 = x340Var2.T();
                            if (z10) {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            } else {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            }
                            iu30 iu30Var3 = (iu30) objT4;
                            objT5 = x340Var2.T();
                            if (objT5 == m4cVar) {
                                objT5 = c97.b(0.0f);
                                x340Var2.s0(objT5);
                            }
                            o95Var = (o95) objT5;
                            if (i21 > 256) {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            } else {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            }
                            boolean zI9 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                            if (i22 == 4) {
                                z12 = true;
                            } else {
                                z12 = z5;
                            }
                            z13 = z12 | zI9;
                            objT6 = x340Var2.T();
                            if (z13) {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            } else {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            }
                            x340Var = x340Var2;
                            i24 = i23;
                            vy71 vy71Var7 = vy71Var2;
                            i25 = i10;
                            vy71Var3 = vy71Var7;
                            a8o.i((Function0) objT6, j8, eem0Var5, o95Var, apo.r(1010026864, new zdm0(j14, function2, vy71Var7, eem0Var5, o95Var, c9nVar, iu30Var3, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var10, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                            if (vy71Var3.e()) {
                                x340Var.i0(748459762);
                                if (i24 <= 256) {
                                }
                                objT7 = x340Var.T();
                                if (z14) {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                } else {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                }
                                qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(748521266);
                                x340Var.r(false);
                            }
                            eem0Var2 = eem0Var5;
                            j4 = j7;
                            qim0Var3 = qim0Var4;
                            hw61Var2 = hw61Var3;
                            j5 = j8;
                            f4 = f8;
                            vu30Var3 = vu30Var8;
                            vu30Var4 = vu30Var10;
                            f3 = f7;
                            z4 = z2;
                            j6 = j14;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            f3 = f;
                            vu30Var3 = vu30Var;
                            vu30Var4 = vu30Var2;
                            eem0Var2 = eem0Var;
                            j4 = jB;
                            z4 = z2;
                            hw61Var2 = hw61VarC;
                            qim0Var3 = qim0Var2;
                            j5 = j2;
                            f4 = f2;
                            j6 = j3;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                        }
                    }
                    i10 |= 100663296;
                    if ((i & 805306368) != 0) {
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                            i26 = 268435456;
                        } else {
                            i26 = 268435456;
                        }
                        i10 |= i26;
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var2.i(vu30Var)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i2 | i15;
                    } else {
                        i14 = i2;
                    }
                    i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                    i17 = i3 & 4096;
                    if (i17 != 0) {
                        if ((i2 & 384) == 0) {
                            if (x340Var2.g(eem0Var)) {
                                i18 = 256;
                            } else {
                                i18 = 128;
                            }
                            i16 |= i18;
                        }
                        if ((i10 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (x340Var2.Y(i10 & 1, z3)) {
                            x340Var2.d0();
                            if ((i & 1) != 0) {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var7 = hw61VarC;
                                f7 = f5;
                                long j15 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j15;
                                hw61Var3 = hw61Var7;
                            } else {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var8 = hw61VarC;
                                f7 = f5;
                                long j16 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j16;
                                hw61Var3 = hw61Var8;
                            }
                            x340Var2.s();
                            vu30 vu30Var11 = vu30Var7;
                            eem0 eem0Var6 = eem0Var3;
                            int i35 = i20;
                            n8b1VarW = t890.w(x340Var2, i35);
                            n8b1VarW2 = t890.w(x340Var2, i35);
                            n8b1VarW3 = t890.w(x340Var2, 5);
                            long j17 = j9;
                            i21 = (i10 & 896) ^ 384;
                            zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                            objT = x340Var2.T();
                            if (zI) {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            } else {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            }
                            qxd0.D((Function0) objT, x340Var2);
                            objT2 = x340Var2.T();
                            if (objT2 == m4cVar) {
                                objT2 = qxd0.M(o6x.a, x340Var2);
                                x340Var2.s0(objT2);
                            }
                            c9nVar = (c9n) objT2;
                            boolean zI10 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                            i22 = i10 & 14;
                            if (i22 == 4) {
                                z6 = true;
                            } else {
                                z6 = z5;
                            }
                            z7 = zI10 | z6;
                            objT3 = x340Var2.T();
                            if (z7) {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            } else {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            }
                            function1 = (Function0) objT3;
                            boolean zI11 = x340Var2.i(c9nVar);
                            if (i21 > 256) {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            } else {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            }
                            boolean z18 = zI11 | z8;
                            if (i22 == 4) {
                                z9 = true;
                            } else {
                                z9 = z5;
                            }
                            z10 = z18 | z9;
                            objT4 = x340Var2.T();
                            if (z10) {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            } else {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            }
                            iu30 iu30Var4 = (iu30) objT4;
                            objT5 = x340Var2.T();
                            if (objT5 == m4cVar) {
                                objT5 = c97.b(0.0f);
                                x340Var2.s0(objT5);
                            }
                            o95Var = (o95) objT5;
                            if (i21 > 256) {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            } else {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            }
                            boolean zI12 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                            if (i22 == 4) {
                                z12 = true;
                            } else {
                                z12 = z5;
                            }
                            z13 = z12 | zI12;
                            objT6 = x340Var2.T();
                            if (z13) {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            } else {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            }
                            x340Var = x340Var2;
                            i24 = i23;
                            vy71 vy71Var8 = vy71Var2;
                            i25 = i10;
                            vy71Var3 = vy71Var8;
                            a8o.i((Function0) objT6, j8, eem0Var6, o95Var, apo.r(1010026864, new zdm0(j17, function2, vy71Var8, eem0Var6, o95Var, c9nVar, iu30Var4, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var11, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                            if (vy71Var3.e()) {
                                x340Var.i0(748459762);
                                if (i24 <= 256) {
                                }
                                objT7 = x340Var.T();
                                if (z14) {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                } else {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                }
                                qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(748521266);
                                x340Var.r(false);
                            }
                            eem0Var2 = eem0Var6;
                            j4 = j7;
                            qim0Var3 = qim0Var4;
                            hw61Var2 = hw61Var3;
                            j5 = j8;
                            f4 = f8;
                            vu30Var3 = vu30Var8;
                            vu30Var4 = vu30Var11;
                            f3 = f7;
                            z4 = z2;
                            j6 = j17;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            f3 = f;
                            vu30Var3 = vu30Var;
                            vu30Var4 = vu30Var2;
                            eem0Var2 = eem0Var;
                            j4 = jB;
                            z4 = z2;
                            hw61Var2 = hw61VarC;
                            qim0Var3 = qim0Var2;
                            j5 = j2;
                            f4 = f2;
                            j6 = j3;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                        }
                    }
                    i16 |= 384;
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var9 = hw61VarC;
                            f7 = f5;
                            long j18 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j18;
                            hw61Var3 = hw61Var9;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var10 = hw61VarC;
                            f7 = f5;
                            long j19 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j19;
                            hw61Var3 = hw61Var10;
                        }
                        x340Var2.s();
                        vu30 vu30Var12 = vu30Var7;
                        eem0 eem0Var7 = eem0Var3;
                        int i36 = i20;
                        n8b1VarW = t890.w(x340Var2, i36);
                        n8b1VarW2 = t890.w(x340Var2, i36);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j110 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI13 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI13 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI14 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z19 = zI14 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z19 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var5 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI15 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI15;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var9 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var9;
                        a8o.i((Function0) objT6, j8, eem0Var7, o95Var, apo.r(1010026864, new zdm0(j110, function2, vy71Var9, eem0Var7, o95Var, c9nVar, iu30Var5, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var12, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var7;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var12;
                        f3 = f7;
                        z4 = z2;
                        j6 = j110;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i4 |= 24576;
                z2 = z;
                if ((i & 196608) == 0) {
                    hw61VarC = hw61Var;
                    if ((i3 & 32) == 0) {
                        i28 = 65536;
                    } else {
                        i28 = 65536;
                    }
                    i4 |= i28;
                } else {
                    hw61VarC = hw61Var;
                }
                if ((i & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        i9 = i30;
                        jB = j;
                        if (x340Var2.f(jB)) {
                        }
                        i4 |= i31;
                    } else {
                        i9 = i30;
                        jB = j;
                    }
                    i4 |= i31;
                } else {
                    i9 = i30;
                    jB = j;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i27 = i4;
                        if (x340Var2.f(j2)) {
                        }
                        i10 = i27 | i32;
                    } else {
                        i27 = i4;
                    }
                    i10 = i27 | i32;
                } else {
                    i10 = i4;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        if (x340Var2.d(f2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i10 |= i12;
                    }
                    if ((i & 805306368) != 0) {
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                            i26 = 268435456;
                        } else {
                            i26 = 268435456;
                        }
                        i10 |= i26;
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var2.i(vu30Var)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i2 | i15;
                    } else {
                        i14 = i2;
                    }
                    i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                    i17 = i3 & 4096;
                    if (i17 != 0) {
                        if ((i2 & 384) == 0) {
                            if (x340Var2.g(eem0Var)) {
                                i18 = 256;
                            } else {
                                i18 = 128;
                            }
                            i16 |= i18;
                        }
                        if ((i10 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (x340Var2.Y(i10 & 1, z3)) {
                            x340Var2.d0();
                            if ((i & 1) != 0) {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var11 = hw61VarC;
                                f7 = f5;
                                long j111 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j111;
                                hw61Var3 = hw61Var11;
                            } else {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var12 = hw61VarC;
                                f7 = f5;
                                long j112 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j112;
                                hw61Var3 = hw61Var12;
                            }
                            x340Var2.s();
                            vu30 vu30Var13 = vu30Var7;
                            eem0 eem0Var8 = eem0Var3;
                            int i37 = i20;
                            n8b1VarW = t890.w(x340Var2, i37);
                            n8b1VarW2 = t890.w(x340Var2, i37);
                            n8b1VarW3 = t890.w(x340Var2, 5);
                            long j113 = j9;
                            i21 = (i10 & 896) ^ 384;
                            zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                            objT = x340Var2.T();
                            if (zI) {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            } else {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            }
                            qxd0.D((Function0) objT, x340Var2);
                            objT2 = x340Var2.T();
                            if (objT2 == m4cVar) {
                                objT2 = qxd0.M(o6x.a, x340Var2);
                                x340Var2.s0(objT2);
                            }
                            c9nVar = (c9n) objT2;
                            boolean zI16 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                            i22 = i10 & 14;
                            if (i22 == 4) {
                                z6 = true;
                            } else {
                                z6 = z5;
                            }
                            z7 = zI16 | z6;
                            objT3 = x340Var2.T();
                            if (z7) {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            } else {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            }
                            function1 = (Function0) objT3;
                            boolean zI17 = x340Var2.i(c9nVar);
                            if (i21 > 256) {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            } else {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            }
                            boolean z110 = zI17 | z8;
                            if (i22 == 4) {
                                z9 = true;
                            } else {
                                z9 = z5;
                            }
                            z10 = z110 | z9;
                            objT4 = x340Var2.T();
                            if (z10) {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            } else {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            }
                            iu30 iu30Var6 = (iu30) objT4;
                            objT5 = x340Var2.T();
                            if (objT5 == m4cVar) {
                                objT5 = c97.b(0.0f);
                                x340Var2.s0(objT5);
                            }
                            o95Var = (o95) objT5;
                            if (i21 > 256) {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            } else {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            }
                            boolean zI18 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                            if (i22 == 4) {
                                z12 = true;
                            } else {
                                z12 = z5;
                            }
                            z13 = z12 | zI18;
                            objT6 = x340Var2.T();
                            if (z13) {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            } else {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            }
                            x340Var = x340Var2;
                            i24 = i23;
                            vy71 vy71Var10 = vy71Var2;
                            i25 = i10;
                            vy71Var3 = vy71Var10;
                            a8o.i((Function0) objT6, j8, eem0Var8, o95Var, apo.r(1010026864, new zdm0(j113, function2, vy71Var10, eem0Var8, o95Var, c9nVar, iu30Var6, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var13, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                            if (vy71Var3.e()) {
                                x340Var.i0(748459762);
                                if (i24 <= 256) {
                                }
                                objT7 = x340Var.T();
                                if (z14) {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                } else {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                }
                                qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(748521266);
                                x340Var.r(false);
                            }
                            eem0Var2 = eem0Var8;
                            j4 = j7;
                            qim0Var3 = qim0Var4;
                            hw61Var2 = hw61Var3;
                            j5 = j8;
                            f4 = f8;
                            vu30Var3 = vu30Var8;
                            vu30Var4 = vu30Var13;
                            f3 = f7;
                            z4 = z2;
                            j6 = j113;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            f3 = f;
                            vu30Var3 = vu30Var;
                            vu30Var4 = vu30Var2;
                            eem0Var2 = eem0Var;
                            j4 = jB;
                            z4 = z2;
                            hw61Var2 = hw61VarC;
                            qim0Var3 = qim0Var2;
                            j5 = j2;
                            f4 = f2;
                            j6 = j3;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                        }
                    }
                    i16 |= 384;
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var13 = hw61VarC;
                            f7 = f5;
                            long j114 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j114;
                            hw61Var3 = hw61Var13;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var14 = hw61VarC;
                            f7 = f5;
                            long j115 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j115;
                            hw61Var3 = hw61Var14;
                        }
                        x340Var2.s();
                        vu30 vu30Var14 = vu30Var7;
                        eem0 eem0Var9 = eem0Var3;
                        int i38 = i20;
                        n8b1VarW = t890.w(x340Var2, i38);
                        n8b1VarW2 = t890.w(x340Var2, i38);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j116 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI19 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI19 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI110 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z111 = zI110 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z111 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var7 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI111 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI111;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var11 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var11;
                        a8o.i((Function0) objT6, j8, eem0Var9, o95Var, apo.r(1010026864, new zdm0(j116, function2, vy71Var11, eem0Var9, o95Var, c9nVar, iu30Var7, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var14, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var9;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var14;
                        f3 = f7;
                        z4 = z2;
                        j6 = j116;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i10 |= 100663296;
                if ((i & 805306368) != 0) {
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                        i26 = 268435456;
                    } else {
                        i26 = 268435456;
                    }
                    i10 |= i26;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var2.i(vu30Var)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                i17 = i3 & 4096;
                if (i17 != 0) {
                    if ((i2 & 384) == 0) {
                        if (x340Var2.g(eem0Var)) {
                            i18 = 256;
                        } else {
                            i18 = 128;
                        }
                        i16 |= i18;
                    }
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var15 = hw61VarC;
                            f7 = f5;
                            long j117 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j117;
                            hw61Var3 = hw61Var15;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var16 = hw61VarC;
                            f7 = f5;
                            long j118 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j118;
                            hw61Var3 = hw61Var16;
                        }
                        x340Var2.s();
                        vu30 vu30Var15 = vu30Var7;
                        eem0 eem0Var10 = eem0Var3;
                        int i39 = i20;
                        n8b1VarW = t890.w(x340Var2, i39);
                        n8b1VarW2 = t890.w(x340Var2, i39);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j119 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI112 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI112 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI113 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z112 = zI113 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z112 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var8 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI114 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI114;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var12 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var12;
                        a8o.i((Function0) objT6, j8, eem0Var10, o95Var, apo.r(1010026864, new zdm0(j119, function2, vy71Var12, eem0Var10, o95Var, c9nVar, iu30Var8, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var15, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var10;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var15;
                        f3 = f7;
                        z4 = z2;
                        j6 = j119;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i16 |= 384;
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var17 = hw61VarC;
                        f7 = f5;
                        long j1110 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j1110;
                        hw61Var3 = hw61Var17;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var18 = hw61VarC;
                        f7 = f5;
                        long j1111 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j1111;
                        hw61Var3 = hw61Var18;
                    }
                    x340Var2.s();
                    vu30 vu30Var16 = vu30Var7;
                    eem0 eem0Var11 = eem0Var3;
                    int i310 = i20;
                    n8b1VarW = t890.w(x340Var2, i310);
                    n8b1VarW2 = t890.w(x340Var2, i310);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j1112 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI115 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI115 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI116 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z113 = zI116 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z113 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var9 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI117 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI117;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var13 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var13;
                    a8o.i((Function0) objT6, j8, eem0Var11, o95Var, apo.r(1010026864, new zdm0(j1112, function2, vy71Var13, eem0Var11, o95Var, c9nVar, iu30Var9, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var16, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var11;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var16;
                    f3 = f7;
                    z4 = z2;
                    j6 = j1112;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i4 |= 3072;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (x340Var2.h(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i & 196608) == 0) {
                    hw61VarC = hw61Var;
                    if ((i3 & 32) == 0) {
                        i28 = 65536;
                    } else {
                        i28 = 65536;
                    }
                    i4 |= i28;
                } else {
                    hw61VarC = hw61Var;
                }
                if ((i & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        i9 = i30;
                        jB = j;
                        if (x340Var2.f(jB)) {
                        }
                        i4 |= i31;
                    } else {
                        i9 = i30;
                        jB = j;
                    }
                    i4 |= i31;
                } else {
                    i9 = i30;
                    jB = j;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i27 = i4;
                        if (x340Var2.f(j2)) {
                        }
                        i10 = i27 | i32;
                    } else {
                        i27 = i4;
                    }
                    i10 = i27 | i32;
                } else {
                    i10 = i4;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        if (x340Var2.d(f2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i10 |= i12;
                    }
                    if ((i & 805306368) != 0) {
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                            i26 = 268435456;
                        } else {
                            i26 = 268435456;
                        }
                        i10 |= i26;
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var2.i(vu30Var)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i2 | i15;
                    } else {
                        i14 = i2;
                    }
                    i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                    i17 = i3 & 4096;
                    if (i17 != 0) {
                        if ((i2 & 384) == 0) {
                            if (x340Var2.g(eem0Var)) {
                                i18 = 256;
                            } else {
                                i18 = 128;
                            }
                            i16 |= i18;
                        }
                        if ((i10 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (x340Var2.Y(i10 & 1, z3)) {
                            x340Var2.d0();
                            if ((i & 1) != 0) {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var19 = hw61VarC;
                                f7 = f5;
                                long j1113 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j1113;
                                hw61Var3 = hw61Var19;
                            } else {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var110 = hw61VarC;
                                f7 = f5;
                                long j1114 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j1114;
                                hw61Var3 = hw61Var110;
                            }
                            x340Var2.s();
                            vu30 vu30Var17 = vu30Var7;
                            eem0 eem0Var12 = eem0Var3;
                            int i311 = i20;
                            n8b1VarW = t890.w(x340Var2, i311);
                            n8b1VarW2 = t890.w(x340Var2, i311);
                            n8b1VarW3 = t890.w(x340Var2, 5);
                            long j1115 = j9;
                            i21 = (i10 & 896) ^ 384;
                            zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                            objT = x340Var2.T();
                            if (zI) {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            } else {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            }
                            qxd0.D((Function0) objT, x340Var2);
                            objT2 = x340Var2.T();
                            if (objT2 == m4cVar) {
                                objT2 = qxd0.M(o6x.a, x340Var2);
                                x340Var2.s0(objT2);
                            }
                            c9nVar = (c9n) objT2;
                            boolean zI118 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                            i22 = i10 & 14;
                            if (i22 == 4) {
                                z6 = true;
                            } else {
                                z6 = z5;
                            }
                            z7 = zI118 | z6;
                            objT3 = x340Var2.T();
                            if (z7) {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            } else {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            }
                            function1 = (Function0) objT3;
                            boolean zI119 = x340Var2.i(c9nVar);
                            if (i21 > 256) {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            } else {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            }
                            boolean z114 = zI119 | z8;
                            if (i22 == 4) {
                                z9 = true;
                            } else {
                                z9 = z5;
                            }
                            z10 = z114 | z9;
                            objT4 = x340Var2.T();
                            if (z10) {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            } else {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            }
                            iu30 iu30Var10 = (iu30) objT4;
                            objT5 = x340Var2.T();
                            if (objT5 == m4cVar) {
                                objT5 = c97.b(0.0f);
                                x340Var2.s0(objT5);
                            }
                            o95Var = (o95) objT5;
                            if (i21 > 256) {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            } else {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            }
                            boolean zI1110 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                            if (i22 == 4) {
                                z12 = true;
                            } else {
                                z12 = z5;
                            }
                            z13 = z12 | zI1110;
                            objT6 = x340Var2.T();
                            if (z13) {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            } else {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            }
                            x340Var = x340Var2;
                            i24 = i23;
                            vy71 vy71Var14 = vy71Var2;
                            i25 = i10;
                            vy71Var3 = vy71Var14;
                            a8o.i((Function0) objT6, j8, eem0Var12, o95Var, apo.r(1010026864, new zdm0(j1115, function2, vy71Var14, eem0Var12, o95Var, c9nVar, iu30Var10, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var17, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                            if (vy71Var3.e()) {
                                x340Var.i0(748459762);
                                if (i24 <= 256) {
                                }
                                objT7 = x340Var.T();
                                if (z14) {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                } else {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                }
                                qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(748521266);
                                x340Var.r(false);
                            }
                            eem0Var2 = eem0Var12;
                            j4 = j7;
                            qim0Var3 = qim0Var4;
                            hw61Var2 = hw61Var3;
                            j5 = j8;
                            f4 = f8;
                            vu30Var3 = vu30Var8;
                            vu30Var4 = vu30Var17;
                            f3 = f7;
                            z4 = z2;
                            j6 = j1115;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            f3 = f;
                            vu30Var3 = vu30Var;
                            vu30Var4 = vu30Var2;
                            eem0Var2 = eem0Var;
                            j4 = jB;
                            z4 = z2;
                            hw61Var2 = hw61VarC;
                            qim0Var3 = qim0Var2;
                            j5 = j2;
                            f4 = f2;
                            j6 = j3;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                        }
                    }
                    i16 |= 384;
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var111 = hw61VarC;
                            f7 = f5;
                            long j1116 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j1116;
                            hw61Var3 = hw61Var111;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var112 = hw61VarC;
                            f7 = f5;
                            long j1117 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j1117;
                            hw61Var3 = hw61Var112;
                        }
                        x340Var2.s();
                        vu30 vu30Var18 = vu30Var7;
                        eem0 eem0Var13 = eem0Var3;
                        int i312 = i20;
                        n8b1VarW = t890.w(x340Var2, i312);
                        n8b1VarW2 = t890.w(x340Var2, i312);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j1118 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI1111 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI1111 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI1112 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z115 = zI1112 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z115 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var11 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI1113 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI1113;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var15 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var15;
                        a8o.i((Function0) objT6, j8, eem0Var13, o95Var, apo.r(1010026864, new zdm0(j1118, function2, vy71Var15, eem0Var13, o95Var, c9nVar, iu30Var11, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var18, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var13;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var18;
                        f3 = f7;
                        z4 = z2;
                        j6 = j1118;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i10 |= 100663296;
                if ((i & 805306368) != 0) {
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                        i26 = 268435456;
                    } else {
                        i26 = 268435456;
                    }
                    i10 |= i26;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var2.i(vu30Var)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                i17 = i3 & 4096;
                if (i17 != 0) {
                    if ((i2 & 384) == 0) {
                        if (x340Var2.g(eem0Var)) {
                            i18 = 256;
                        } else {
                            i18 = 128;
                        }
                        i16 |= i18;
                    }
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var113 = hw61VarC;
                            f7 = f5;
                            long j1119 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j1119;
                            hw61Var3 = hw61Var113;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var114 = hw61VarC;
                            f7 = f5;
                            long j11110 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j11110;
                            hw61Var3 = hw61Var114;
                        }
                        x340Var2.s();
                        vu30 vu30Var19 = vu30Var7;
                        eem0 eem0Var14 = eem0Var3;
                        int i313 = i20;
                        n8b1VarW = t890.w(x340Var2, i313);
                        n8b1VarW2 = t890.w(x340Var2, i313);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j11111 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI1114 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI1114 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI1115 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z116 = zI1115 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z116 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var12 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI1116 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI1116;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var16 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var16;
                        a8o.i((Function0) objT6, j8, eem0Var14, o95Var, apo.r(1010026864, new zdm0(j11111, function2, vy71Var16, eem0Var14, o95Var, c9nVar, iu30Var12, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var19, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var14;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var19;
                        f3 = f7;
                        z4 = z2;
                        j6 = j11111;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i16 |= 384;
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var115 = hw61VarC;
                        f7 = f5;
                        long j11112 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j11112;
                        hw61Var3 = hw61Var115;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var116 = hw61VarC;
                        f7 = f5;
                        long j11113 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j11113;
                        hw61Var3 = hw61Var116;
                    }
                    x340Var2.s();
                    vu30 vu30Var110 = vu30Var7;
                    eem0 eem0Var15 = eem0Var3;
                    int i314 = i20;
                    n8b1VarW = t890.w(x340Var2, i314);
                    n8b1VarW2 = t890.w(x340Var2, i314);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j11114 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI1117 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI1117 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI1118 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z117 = zI1118 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z117 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var13 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI1119 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI1119;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var17 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var17;
                    a8o.i((Function0) objT6, j8, eem0Var15, o95Var, apo.r(1010026864, new zdm0(j11114, function2, vy71Var17, eem0Var15, o95Var, c9nVar, iu30Var13, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var110, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var15;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var110;
                    f3 = f7;
                    z4 = z2;
                    j6 = j11114;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i4 |= 24576;
            z2 = z;
            if ((i & 196608) == 0) {
                hw61VarC = hw61Var;
                if ((i3 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i4 |= i28;
            } else {
                hw61VarC = hw61Var;
            }
            if ((i & 1572864) == 0) {
                if ((i3 & 64) == 0) {
                    i9 = i30;
                    jB = j;
                    if (x340Var2.f(jB)) {
                    }
                    i4 |= i31;
                } else {
                    i9 = i30;
                    jB = j;
                }
                i4 |= i31;
            } else {
                i9 = i30;
                jB = j;
            }
            if ((i & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    i27 = i4;
                    if (x340Var2.f(j2)) {
                    }
                    i10 = i27 | i32;
                } else {
                    i27 = i4;
                }
                i10 = i27 | i32;
            } else {
                i10 = i4;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    if (x340Var2.d(f2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i & 805306368) != 0) {
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                        i26 = 268435456;
                    } else {
                        i26 = 268435456;
                    }
                    i10 |= i26;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var2.i(vu30Var)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                i17 = i3 & 4096;
                if (i17 != 0) {
                    if ((i2 & 384) == 0) {
                        if (x340Var2.g(eem0Var)) {
                            i18 = 256;
                        } else {
                            i18 = 128;
                        }
                        i16 |= i18;
                    }
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var117 = hw61VarC;
                            f7 = f5;
                            long j11115 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j11115;
                            hw61Var3 = hw61Var117;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var118 = hw61VarC;
                            f7 = f5;
                            long j11116 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j11116;
                            hw61Var3 = hw61Var118;
                        }
                        x340Var2.s();
                        vu30 vu30Var111 = vu30Var7;
                        eem0 eem0Var16 = eem0Var3;
                        int i315 = i20;
                        n8b1VarW = t890.w(x340Var2, i315);
                        n8b1VarW2 = t890.w(x340Var2, i315);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j11117 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI11110 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI11110 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI11111 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z118 = zI11111 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z118 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var14 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI11112 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI11112;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var18 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var18;
                        a8o.i((Function0) objT6, j8, eem0Var16, o95Var, apo.r(1010026864, new zdm0(j11117, function2, vy71Var18, eem0Var16, o95Var, c9nVar, iu30Var14, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var111, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var16;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var111;
                        f3 = f7;
                        z4 = z2;
                        j6 = j11117;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i16 |= 384;
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var119 = hw61VarC;
                        f7 = f5;
                        long j11118 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j11118;
                        hw61Var3 = hw61Var119;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var1110 = hw61VarC;
                        f7 = f5;
                        long j11119 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j11119;
                        hw61Var3 = hw61Var1110;
                    }
                    x340Var2.s();
                    vu30 vu30Var112 = vu30Var7;
                    eem0 eem0Var17 = eem0Var3;
                    int i316 = i20;
                    n8b1VarW = t890.w(x340Var2, i316);
                    n8b1VarW2 = t890.w(x340Var2, i316);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j111110 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI11113 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI11113 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI11114 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z119 = zI11114 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z119 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var15 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI11115 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI11115;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var19 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var19;
                    a8o.i((Function0) objT6, j8, eem0Var17, o95Var, apo.r(1010026864, new zdm0(j111110, function2, vy71Var19, eem0Var17, o95Var, c9nVar, iu30Var15, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var112, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var17;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var112;
                    f3 = f7;
                    z4 = z2;
                    j6 = j111110;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i10 |= 100663296;
            if ((i & 805306368) != 0) {
                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                    i26 = 268435456;
                } else {
                    i26 = 268435456;
                }
                i10 |= i26;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var2.i(vu30Var)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
            i17 = i3 & 4096;
            if (i17 != 0) {
                if ((i2 & 384) == 0) {
                    if (x340Var2.g(eem0Var)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var1111 = hw61VarC;
                        f7 = f5;
                        long j111111 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j111111;
                        hw61Var3 = hw61Var1111;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var1112 = hw61VarC;
                        f7 = f5;
                        long j111112 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j111112;
                        hw61Var3 = hw61Var1112;
                    }
                    x340Var2.s();
                    vu30 vu30Var113 = vu30Var7;
                    eem0 eem0Var18 = eem0Var3;
                    int i317 = i20;
                    n8b1VarW = t890.w(x340Var2, i317);
                    n8b1VarW2 = t890.w(x340Var2, i317);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j111113 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI11116 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI11116 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI11117 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z1110 = zI11117 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z1110 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var16 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI11118 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI11118;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var110 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var110;
                    a8o.i((Function0) objT6, j8, eem0Var18, o95Var, apo.r(1010026864, new zdm0(j111113, function2, vy71Var110, eem0Var18, o95Var, c9nVar, iu30Var16, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var113, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var18;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var113;
                    f3 = f7;
                    z4 = z2;
                    j6 = j111113;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i16 |= 384;
            if ((i10 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var2.Y(i10 & 1, z3)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var1113 = hw61VarC;
                    f7 = f5;
                    long j111114 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j111114;
                    hw61Var3 = hw61Var1113;
                } else {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var1114 = hw61VarC;
                    f7 = f5;
                    long j111115 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j111115;
                    hw61Var3 = hw61Var1114;
                }
                x340Var2.s();
                vu30 vu30Var114 = vu30Var7;
                eem0 eem0Var19 = eem0Var3;
                int i318 = i20;
                n8b1VarW = t890.w(x340Var2, i318);
                n8b1VarW2 = t890.w(x340Var2, i318);
                n8b1VarW3 = t890.w(x340Var2, 5);
                long j111116 = j9;
                i21 = (i10 & 896) ^ 384;
                zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                objT = x340Var2.T();
                if (zI) {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                } else {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                }
                qxd0.D((Function0) objT, x340Var2);
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o6x.a, x340Var2);
                    x340Var2.s0(objT2);
                }
                c9nVar = (c9n) objT2;
                boolean zI11119 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                i22 = i10 & 14;
                if (i22 == 4) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                z7 = zI11119 | z6;
                objT3 = x340Var2.T();
                if (z7) {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                } else {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                }
                function1 = (Function0) objT3;
                boolean zI111110 = x340Var2.i(c9nVar);
                if (i21 > 256) {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                } else {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                }
                boolean z1111 = zI111110 | z8;
                if (i22 == 4) {
                    z9 = true;
                } else {
                    z9 = z5;
                }
                z10 = z1111 | z9;
                objT4 = x340Var2.T();
                if (z10) {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                }
                iu30 iu30Var17 = (iu30) objT4;
                objT5 = x340Var2.T();
                if (objT5 == m4cVar) {
                    objT5 = c97.b(0.0f);
                    x340Var2.s0(objT5);
                }
                o95Var = (o95) objT5;
                if (i21 > 256) {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                } else {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                }
                boolean zI111111 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                if (i22 == 4) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                z13 = z12 | zI111111;
                objT6 = x340Var2.T();
                if (z13) {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                } else {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                }
                x340Var = x340Var2;
                i24 = i23;
                vy71 vy71Var111 = vy71Var2;
                i25 = i10;
                vy71Var3 = vy71Var111;
                a8o.i((Function0) objT6, j8, eem0Var19, o95Var, apo.r(1010026864, new zdm0(j111116, function2, vy71Var111, eem0Var19, o95Var, c9nVar, iu30Var17, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var114, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                if (vy71Var3.e()) {
                    x340Var.i0(748459762);
                    if (i24 <= 256) {
                    }
                    objT7 = x340Var.T();
                    if (z14) {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    } else {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    }
                    qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                    x340Var.r(false);
                } else {
                    x340Var.i0(748521266);
                    x340Var.r(false);
                }
                eem0Var2 = eem0Var19;
                j4 = j7;
                qim0Var3 = qim0Var4;
                hw61Var2 = hw61Var3;
                j5 = j8;
                f4 = f8;
                vu30Var3 = vu30Var8;
                vu30Var4 = vu30Var114;
                f3 = f7;
                z4 = z2;
                j6 = j111116;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                f3 = f;
                vu30Var3 = vu30Var;
                vu30Var4 = vu30Var2;
                eem0Var2 = eem0Var;
                j4 = jB;
                z4 = z2;
                hw61Var2 = hw61VarC;
                qim0Var3 = qim0Var2;
                j5 = j2;
                f4 = f2;
                j6 = j3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if (x340Var2.g(vy71Var3)) {
                i29 = 256;
            } else {
                i29 = 128;
            }
            i4 |= i29;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                if (x340Var2.d(f)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (x340Var2.h(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i & 196608) == 0) {
                    hw61VarC = hw61Var;
                    if ((i3 & 32) == 0) {
                        i28 = 65536;
                    } else {
                        i28 = 65536;
                    }
                    i4 |= i28;
                } else {
                    hw61VarC = hw61Var;
                }
                if ((i & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        i9 = i30;
                        jB = j;
                        if (x340Var2.f(jB)) {
                        }
                        i4 |= i31;
                    } else {
                        i9 = i30;
                        jB = j;
                    }
                    i4 |= i31;
                } else {
                    i9 = i30;
                    jB = j;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i27 = i4;
                        if (x340Var2.f(j2)) {
                        }
                        i10 = i27 | i32;
                    } else {
                        i27 = i4;
                    }
                    i10 = i27 | i32;
                } else {
                    i10 = i4;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        if (x340Var2.d(f2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i10 |= i12;
                    }
                    if ((i & 805306368) != 0) {
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                            i26 = 268435456;
                        } else {
                            i26 = 268435456;
                        }
                        i10 |= i26;
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var2.i(vu30Var)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i2 | i15;
                    } else {
                        i14 = i2;
                    }
                    i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                    i17 = i3 & 4096;
                    if (i17 != 0) {
                        if ((i2 & 384) == 0) {
                            if (x340Var2.g(eem0Var)) {
                                i18 = 256;
                            } else {
                                i18 = 128;
                            }
                            i16 |= i18;
                        }
                        if ((i10 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (x340Var2.Y(i10 & 1, z3)) {
                            x340Var2.d0();
                            if ((i & 1) != 0) {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var1115 = hw61VarC;
                                f7 = f5;
                                long j111117 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j111117;
                                hw61Var3 = hw61Var1115;
                            } else {
                                if (i9 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    f5 = 640.0f;
                                } else {
                                    f5 = f;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    hw61VarC = vrg.c(x340Var2);
                                    i10 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jB = vrg.b(x340Var2);
                                    i10 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jB2 = eah.b(jB, x340Var2);
                                    i10 &= -29360129;
                                } else {
                                    jB2 = j2;
                                }
                                if (i11 != 0) {
                                    f6 = 0.0f;
                                } else {
                                    f6 = f2;
                                }
                                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                    jE = vrg.e(x340Var2);
                                    i10 &= -1879048193;
                                } else {
                                    jE = j3;
                                }
                                if (i13 != 0) {
                                    vu30Var5 = j2j.a;
                                } else {
                                    vu30Var5 = vu30Var;
                                }
                                if ((i3 & 2048) != 0) {
                                    vu30Var6 = q5.U0;
                                    i16 &= -113;
                                } else {
                                    vu30Var6 = vu30Var2;
                                }
                                i19 = i16;
                                if (i17 != 0) {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = new eem0(3);
                                } else {
                                    j7 = jB;
                                    qim0Var4 = qim0Var2;
                                    eem0Var3 = eem0Var;
                                }
                                vu30Var7 = vu30Var6;
                                j8 = jB2;
                                z5 = false;
                                i20 = 1;
                                hw61 hw61Var1116 = hw61VarC;
                                f7 = f5;
                                long j111118 = jE;
                                vu30Var8 = vu30Var5;
                                f8 = f6;
                                j9 = j111118;
                                hw61Var3 = hw61Var1116;
                            }
                            x340Var2.s();
                            vu30 vu30Var115 = vu30Var7;
                            eem0 eem0Var110 = eem0Var3;
                            int i319 = i20;
                            n8b1VarW = t890.w(x340Var2, i319);
                            n8b1VarW2 = t890.w(x340Var2, i319);
                            n8b1VarW3 = t890.w(x340Var2, 5);
                            long j111119 = j9;
                            i21 = (i10 & 896) ^ 384;
                            zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                            objT = x340Var2.T();
                            if (zI) {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            } else {
                                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                                vy71Var2 = vy71Var;
                                x340Var2.s0(objT);
                            }
                            qxd0.D((Function0) objT, x340Var2);
                            objT2 = x340Var2.T();
                            if (objT2 == m4cVar) {
                                objT2 = qxd0.M(o6x.a, x340Var2);
                                x340Var2.s0(objT2);
                            }
                            c9nVar = (c9n) objT2;
                            boolean zI111112 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                            i22 = i10 & 14;
                            if (i22 == 4) {
                                z6 = true;
                            } else {
                                z6 = z5;
                            }
                            z7 = zI111112 | z6;
                            objT3 = x340Var2.T();
                            if (z7) {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            } else {
                                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                                x340Var2.s0(objT3);
                            }
                            function1 = (Function0) objT3;
                            boolean zI111113 = x340Var2.i(c9nVar);
                            if (i21 > 256) {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            } else {
                                function2 = function1;
                                if ((i10 & 384) != 256) {
                                    z8 = true;
                                } else {
                                    z8 = z5;
                                }
                            }
                            boolean z1112 = zI111113 | z8;
                            if (i22 == 4) {
                                z9 = true;
                            } else {
                                z9 = z5;
                            }
                            z10 = z1112 | z9;
                            objT4 = x340Var2.T();
                            if (z10) {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            } else {
                                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                                x340Var2.s0(objT4);
                            }
                            iu30 iu30Var18 = (iu30) objT4;
                            objT5 = x340Var2.T();
                            if (objT5 == m4cVar) {
                                objT5 = c97.b(0.0f);
                                x340Var2.s0(objT5);
                            }
                            o95Var = (o95) objT5;
                            if (i21 > 256) {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            } else {
                                i23 = i21;
                                if ((i10 & 384) != 256) {
                                    z11 = true;
                                } else {
                                    z11 = z5;
                                }
                            }
                            boolean zI111114 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                            if (i22 == 4) {
                                z12 = true;
                            } else {
                                z12 = z5;
                            }
                            z13 = z12 | zI111114;
                            objT6 = x340Var2.T();
                            if (z13) {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            } else {
                                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                                x340Var2.s0(objT6);
                            }
                            x340Var = x340Var2;
                            i24 = i23;
                            vy71 vy71Var112 = vy71Var2;
                            i25 = i10;
                            vy71Var3 = vy71Var112;
                            a8o.i((Function0) objT6, j8, eem0Var110, o95Var, apo.r(1010026864, new zdm0(j111119, function2, vy71Var112, eem0Var110, o95Var, c9nVar, iu30Var18, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var115, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                            if (vy71Var3.e()) {
                                x340Var.i0(748459762);
                                if (i24 <= 256) {
                                }
                                objT7 = x340Var.T();
                                if (z14) {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                } else {
                                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                    x340Var.s0(objT7);
                                }
                                qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(748521266);
                                x340Var.r(false);
                            }
                            eem0Var2 = eem0Var110;
                            j4 = j7;
                            qim0Var3 = qim0Var4;
                            hw61Var2 = hw61Var3;
                            j5 = j8;
                            f4 = f8;
                            vu30Var3 = vu30Var8;
                            vu30Var4 = vu30Var115;
                            f3 = f7;
                            z4 = z2;
                            j6 = j111119;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            f3 = f;
                            vu30Var3 = vu30Var;
                            vu30Var4 = vu30Var2;
                            eem0Var2 = eem0Var;
                            j4 = jB;
                            z4 = z2;
                            hw61Var2 = hw61VarC;
                            qim0Var3 = qim0Var2;
                            j5 = j2;
                            f4 = f2;
                            j6 = j3;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                        }
                    }
                    i16 |= 384;
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var1117 = hw61VarC;
                            f7 = f5;
                            long j1111110 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j1111110;
                            hw61Var3 = hw61Var1117;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var1118 = hw61VarC;
                            f7 = f5;
                            long j1111111 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j1111111;
                            hw61Var3 = hw61Var1118;
                        }
                        x340Var2.s();
                        vu30 vu30Var116 = vu30Var7;
                        eem0 eem0Var111 = eem0Var3;
                        int i3110 = i20;
                        n8b1VarW = t890.w(x340Var2, i3110);
                        n8b1VarW2 = t890.w(x340Var2, i3110);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j1111112 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI111115 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI111115 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI111116 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z1113 = zI111116 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z1113 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var19 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI111117 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI111117;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var113 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var113;
                        a8o.i((Function0) objT6, j8, eem0Var111, o95Var, apo.r(1010026864, new zdm0(j1111112, function2, vy71Var113, eem0Var111, o95Var, c9nVar, iu30Var19, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var116, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var111;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var116;
                        f3 = f7;
                        z4 = z2;
                        j6 = j1111112;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i10 |= 100663296;
                if ((i & 805306368) != 0) {
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                        i26 = 268435456;
                    } else {
                        i26 = 268435456;
                    }
                    i10 |= i26;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var2.i(vu30Var)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                i17 = i3 & 4096;
                if (i17 != 0) {
                    if ((i2 & 384) == 0) {
                        if (x340Var2.g(eem0Var)) {
                            i18 = 256;
                        } else {
                            i18 = 128;
                        }
                        i16 |= i18;
                    }
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var1119 = hw61VarC;
                            f7 = f5;
                            long j1111113 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j1111113;
                            hw61Var3 = hw61Var1119;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var11110 = hw61VarC;
                            f7 = f5;
                            long j1111114 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j1111114;
                            hw61Var3 = hw61Var11110;
                        }
                        x340Var2.s();
                        vu30 vu30Var117 = vu30Var7;
                        eem0 eem0Var112 = eem0Var3;
                        int i3111 = i20;
                        n8b1VarW = t890.w(x340Var2, i3111);
                        n8b1VarW2 = t890.w(x340Var2, i3111);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j1111115 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI111118 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI111118 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI111119 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z1114 = zI111119 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z1114 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var110 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI1111110 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI1111110;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var114 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var114;
                        a8o.i((Function0) objT6, j8, eem0Var112, o95Var, apo.r(1010026864, new zdm0(j1111115, function2, vy71Var114, eem0Var112, o95Var, c9nVar, iu30Var110, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var117, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var112;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var117;
                        f3 = f7;
                        z4 = z2;
                        j6 = j1111115;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i16 |= 384;
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var11111 = hw61VarC;
                        f7 = f5;
                        long j1111116 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j1111116;
                        hw61Var3 = hw61Var11111;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var11112 = hw61VarC;
                        f7 = f5;
                        long j1111117 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j1111117;
                        hw61Var3 = hw61Var11112;
                    }
                    x340Var2.s();
                    vu30 vu30Var118 = vu30Var7;
                    eem0 eem0Var113 = eem0Var3;
                    int i3112 = i20;
                    n8b1VarW = t890.w(x340Var2, i3112);
                    n8b1VarW2 = t890.w(x340Var2, i3112);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j1111118 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI1111111 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI1111111 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI1111112 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z1115 = zI1111112 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z1115 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var111 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI1111113 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI1111113;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var115 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var115;
                    a8o.i((Function0) objT6, j8, eem0Var113, o95Var, apo.r(1010026864, new zdm0(j1111118, function2, vy71Var115, eem0Var113, o95Var, c9nVar, iu30Var111, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var118, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var113;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var118;
                    f3 = f7;
                    z4 = z2;
                    j6 = j1111118;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i4 |= 24576;
            z2 = z;
            if ((i & 196608) == 0) {
                hw61VarC = hw61Var;
                if ((i3 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i4 |= i28;
            } else {
                hw61VarC = hw61Var;
            }
            if ((i & 1572864) == 0) {
                if ((i3 & 64) == 0) {
                    i9 = i30;
                    jB = j;
                    if (x340Var2.f(jB)) {
                    }
                    i4 |= i31;
                } else {
                    i9 = i30;
                    jB = j;
                }
                i4 |= i31;
            } else {
                i9 = i30;
                jB = j;
            }
            if ((i & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    i27 = i4;
                    if (x340Var2.f(j2)) {
                    }
                    i10 = i27 | i32;
                } else {
                    i27 = i4;
                }
                i10 = i27 | i32;
            } else {
                i10 = i4;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    if (x340Var2.d(f2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i & 805306368) != 0) {
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                        i26 = 268435456;
                    } else {
                        i26 = 268435456;
                    }
                    i10 |= i26;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var2.i(vu30Var)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                i17 = i3 & 4096;
                if (i17 != 0) {
                    if ((i2 & 384) == 0) {
                        if (x340Var2.g(eem0Var)) {
                            i18 = 256;
                        } else {
                            i18 = 128;
                        }
                        i16 |= i18;
                    }
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var11113 = hw61VarC;
                            f7 = f5;
                            long j1111119 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j1111119;
                            hw61Var3 = hw61Var11113;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var11114 = hw61VarC;
                            f7 = f5;
                            long j11111110 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j11111110;
                            hw61Var3 = hw61Var11114;
                        }
                        x340Var2.s();
                        vu30 vu30Var119 = vu30Var7;
                        eem0 eem0Var114 = eem0Var3;
                        int i3113 = i20;
                        n8b1VarW = t890.w(x340Var2, i3113);
                        n8b1VarW2 = t890.w(x340Var2, i3113);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j11111111 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI1111114 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI1111114 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI1111115 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z1116 = zI1111115 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z1116 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var112 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI1111116 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI1111116;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var116 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var116;
                        a8o.i((Function0) objT6, j8, eem0Var114, o95Var, apo.r(1010026864, new zdm0(j11111111, function2, vy71Var116, eem0Var114, o95Var, c9nVar, iu30Var112, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var119, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var114;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var119;
                        f3 = f7;
                        z4 = z2;
                        j6 = j11111111;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i16 |= 384;
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var11115 = hw61VarC;
                        f7 = f5;
                        long j11111112 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j11111112;
                        hw61Var3 = hw61Var11115;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var11116 = hw61VarC;
                        f7 = f5;
                        long j11111113 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j11111113;
                        hw61Var3 = hw61Var11116;
                    }
                    x340Var2.s();
                    vu30 vu30Var1110 = vu30Var7;
                    eem0 eem0Var115 = eem0Var3;
                    int i3114 = i20;
                    n8b1VarW = t890.w(x340Var2, i3114);
                    n8b1VarW2 = t890.w(x340Var2, i3114);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j11111114 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI1111117 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI1111117 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI1111118 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z1117 = zI1111118 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z1117 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var113 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI1111119 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI1111119;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var117 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var117;
                    a8o.i((Function0) objT6, j8, eem0Var115, o95Var, apo.r(1010026864, new zdm0(j11111114, function2, vy71Var117, eem0Var115, o95Var, c9nVar, iu30Var113, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1110, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var115;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var1110;
                    f3 = f7;
                    z4 = z2;
                    j6 = j11111114;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i10 |= 100663296;
            if ((i & 805306368) != 0) {
                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                    i26 = 268435456;
                } else {
                    i26 = 268435456;
                }
                i10 |= i26;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var2.i(vu30Var)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
            i17 = i3 & 4096;
            if (i17 != 0) {
                if ((i2 & 384) == 0) {
                    if (x340Var2.g(eem0Var)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var11117 = hw61VarC;
                        f7 = f5;
                        long j11111115 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j11111115;
                        hw61Var3 = hw61Var11117;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var11118 = hw61VarC;
                        f7 = f5;
                        long j11111116 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j11111116;
                        hw61Var3 = hw61Var11118;
                    }
                    x340Var2.s();
                    vu30 vu30Var1111 = vu30Var7;
                    eem0 eem0Var116 = eem0Var3;
                    int i3115 = i20;
                    n8b1VarW = t890.w(x340Var2, i3115);
                    n8b1VarW2 = t890.w(x340Var2, i3115);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j11111117 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI11111110 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI11111110 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI11111111 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z1118 = zI11111111 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z1118 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var114 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI11111112 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI11111112;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var118 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var118;
                    a8o.i((Function0) objT6, j8, eem0Var116, o95Var, apo.r(1010026864, new zdm0(j11111117, function2, vy71Var118, eem0Var116, o95Var, c9nVar, iu30Var114, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1111, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var116;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var1111;
                    f3 = f7;
                    z4 = z2;
                    j6 = j11111117;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i16 |= 384;
            if ((i10 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var2.Y(i10 & 1, z3)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var11119 = hw61VarC;
                    f7 = f5;
                    long j11111118 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j11111118;
                    hw61Var3 = hw61Var11119;
                } else {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var111110 = hw61VarC;
                    f7 = f5;
                    long j11111119 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j11111119;
                    hw61Var3 = hw61Var111110;
                }
                x340Var2.s();
                vu30 vu30Var1112 = vu30Var7;
                eem0 eem0Var117 = eem0Var3;
                int i3116 = i20;
                n8b1VarW = t890.w(x340Var2, i3116);
                n8b1VarW2 = t890.w(x340Var2, i3116);
                n8b1VarW3 = t890.w(x340Var2, 5);
                long j111111110 = j9;
                i21 = (i10 & 896) ^ 384;
                zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                objT = x340Var2.T();
                if (zI) {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                } else {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                }
                qxd0.D((Function0) objT, x340Var2);
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o6x.a, x340Var2);
                    x340Var2.s0(objT2);
                }
                c9nVar = (c9n) objT2;
                boolean zI11111113 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                i22 = i10 & 14;
                if (i22 == 4) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                z7 = zI11111113 | z6;
                objT3 = x340Var2.T();
                if (z7) {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                } else {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                }
                function1 = (Function0) objT3;
                boolean zI11111114 = x340Var2.i(c9nVar);
                if (i21 > 256) {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                } else {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                }
                boolean z1119 = zI11111114 | z8;
                if (i22 == 4) {
                    z9 = true;
                } else {
                    z9 = z5;
                }
                z10 = z1119 | z9;
                objT4 = x340Var2.T();
                if (z10) {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                }
                iu30 iu30Var115 = (iu30) objT4;
                objT5 = x340Var2.T();
                if (objT5 == m4cVar) {
                    objT5 = c97.b(0.0f);
                    x340Var2.s0(objT5);
                }
                o95Var = (o95) objT5;
                if (i21 > 256) {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                } else {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                }
                boolean zI11111115 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                if (i22 == 4) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                z13 = z12 | zI11111115;
                objT6 = x340Var2.T();
                if (z13) {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                } else {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                }
                x340Var = x340Var2;
                i24 = i23;
                vy71 vy71Var119 = vy71Var2;
                i25 = i10;
                vy71Var3 = vy71Var119;
                a8o.i((Function0) objT6, j8, eem0Var117, o95Var, apo.r(1010026864, new zdm0(j111111110, function2, vy71Var119, eem0Var117, o95Var, c9nVar, iu30Var115, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1112, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                if (vy71Var3.e()) {
                    x340Var.i0(748459762);
                    if (i24 <= 256) {
                    }
                    objT7 = x340Var.T();
                    if (z14) {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    } else {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    }
                    qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                    x340Var.r(false);
                } else {
                    x340Var.i0(748521266);
                    x340Var.r(false);
                }
                eem0Var2 = eem0Var117;
                j4 = j7;
                qim0Var3 = qim0Var4;
                hw61Var2 = hw61Var3;
                j5 = j8;
                f4 = f8;
                vu30Var3 = vu30Var8;
                vu30Var4 = vu30Var1112;
                f3 = f7;
                z4 = z2;
                j6 = j111111110;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                f3 = f;
                vu30Var3 = vu30Var;
                vu30Var4 = vu30Var2;
                eem0Var2 = eem0Var;
                j4 = jB;
                z4 = z2;
                hw61Var2 = hw61VarC;
                qim0Var3 = qim0Var2;
                j5 = j2;
                f4 = f2;
                j6 = j3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
            }
        }
        i4 |= 3072;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (x340Var2.h(z2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i & 196608) == 0) {
                hw61VarC = hw61Var;
                if ((i3 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i4 |= i28;
            } else {
                hw61VarC = hw61Var;
            }
            if ((i & 1572864) == 0) {
                if ((i3 & 64) == 0) {
                    i9 = i30;
                    jB = j;
                    if (x340Var2.f(jB)) {
                    }
                    i4 |= i31;
                } else {
                    i9 = i30;
                    jB = j;
                }
                i4 |= i31;
            } else {
                i9 = i30;
                jB = j;
            }
            if ((i & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    i27 = i4;
                    if (x340Var2.f(j2)) {
                    }
                    i10 = i27 | i32;
                } else {
                    i27 = i4;
                }
                i10 = i27 | i32;
            } else {
                i10 = i4;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    if (x340Var2.d(f2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i & 805306368) != 0) {
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                        i26 = 268435456;
                    } else {
                        i26 = 268435456;
                    }
                    i10 |= i26;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var2.i(vu30Var)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
                i17 = i3 & 4096;
                if (i17 != 0) {
                    if ((i2 & 384) == 0) {
                        if (x340Var2.g(eem0Var)) {
                            i18 = 256;
                        } else {
                            i18 = 128;
                        }
                        i16 |= i18;
                    }
                    if ((i10 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var111111 = hw61VarC;
                            f7 = f5;
                            long j111111111 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j111111111;
                            hw61Var3 = hw61Var111111;
                        } else {
                            if (i9 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                f5 = 640.0f;
                            } else {
                                f5 = f;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                hw61VarC = vrg.c(x340Var2);
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jB = vrg.b(x340Var2);
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB2 = eah.b(jB, x340Var2);
                                i10 &= -29360129;
                            } else {
                                jB2 = j2;
                            }
                            if (i11 != 0) {
                                f6 = 0.0f;
                            } else {
                                f6 = f2;
                            }
                            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                                jE = vrg.e(x340Var2);
                                i10 &= -1879048193;
                            } else {
                                jE = j3;
                            }
                            if (i13 != 0) {
                                vu30Var5 = j2j.a;
                            } else {
                                vu30Var5 = vu30Var;
                            }
                            if ((i3 & 2048) != 0) {
                                vu30Var6 = q5.U0;
                                i16 &= -113;
                            } else {
                                vu30Var6 = vu30Var2;
                            }
                            i19 = i16;
                            if (i17 != 0) {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = new eem0(3);
                            } else {
                                j7 = jB;
                                qim0Var4 = qim0Var2;
                                eem0Var3 = eem0Var;
                            }
                            vu30Var7 = vu30Var6;
                            j8 = jB2;
                            z5 = false;
                            i20 = 1;
                            hw61 hw61Var111112 = hw61VarC;
                            f7 = f5;
                            long j111111112 = jE;
                            vu30Var8 = vu30Var5;
                            f8 = f6;
                            j9 = j111111112;
                            hw61Var3 = hw61Var111112;
                        }
                        x340Var2.s();
                        vu30 vu30Var1113 = vu30Var7;
                        eem0 eem0Var118 = eem0Var3;
                        int i3117 = i20;
                        n8b1VarW = t890.w(x340Var2, i3117);
                        n8b1VarW2 = t890.w(x340Var2, i3117);
                        n8b1VarW3 = t890.w(x340Var2, 5);
                        long j111111113 = j9;
                        i21 = (i10 & 896) ^ 384;
                        zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                        objT = x340Var2.T();
                        if (zI) {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        } else {
                            objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                            vy71Var2 = vy71Var;
                            x340Var2.s0(objT);
                        }
                        qxd0.D((Function0) objT, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        boolean zI11111116 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                        i22 = i10 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z7 = zI11111116 | z6;
                        objT3 = x340Var2.T();
                        if (z7) {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        } else {
                            objT3 = new wdm0(vy71Var2, c9nVar, function0);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        boolean zI11111117 = x340Var2.i(c9nVar);
                        if (i21 > 256) {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        } else {
                            function2 = function1;
                            if ((i10 & 384) != 256) {
                                z8 = true;
                            } else {
                                z8 = z5;
                            }
                        }
                        boolean z11110 = zI11111117 | z8;
                        if (i22 == 4) {
                            z9 = true;
                        } else {
                            z9 = z5;
                        }
                        z10 = z11110 | z9;
                        objT4 = x340Var2.T();
                        if (z10) {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        } else {
                            objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var116 = (iu30) objT4;
                        objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = c97.b(0.0f);
                            x340Var2.s0(objT5);
                        }
                        o95Var = (o95) objT5;
                        if (i21 > 256) {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        } else {
                            i23 = i21;
                            if ((i10 & 384) != 256) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                        }
                        boolean zI11111118 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                        if (i22 == 4) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        z13 = z12 | zI11111118;
                        objT6 = x340Var2.T();
                        if (z13) {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                            x340Var2.s0(objT6);
                        }
                        x340Var = x340Var2;
                        i24 = i23;
                        vy71 vy71Var1110 = vy71Var2;
                        i25 = i10;
                        vy71Var3 = vy71Var1110;
                        a8o.i((Function0) objT6, j8, eem0Var118, o95Var, apo.r(1010026864, new zdm0(j111111113, function2, vy71Var1110, eem0Var118, o95Var, c9nVar, iu30Var116, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1113, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                        if (vy71Var3.e()) {
                            x340Var.i0(748459762);
                            if (i24 <= 256) {
                            }
                            objT7 = x340Var.T();
                            if (z14) {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            } else {
                                objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                                x340Var.s0(objT7);
                            }
                            qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(748521266);
                            x340Var.r(false);
                        }
                        eem0Var2 = eem0Var118;
                        j4 = j7;
                        qim0Var3 = qim0Var4;
                        hw61Var2 = hw61Var3;
                        j5 = j8;
                        f4 = f8;
                        vu30Var3 = vu30Var8;
                        vu30Var4 = vu30Var1113;
                        f3 = f7;
                        z4 = z2;
                        j6 = j111111113;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        f3 = f;
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        eem0Var2 = eem0Var;
                        j4 = jB;
                        z4 = z2;
                        hw61Var2 = hw61VarC;
                        qim0Var3 = qim0Var2;
                        j5 = j2;
                        f4 = f2;
                        j6 = j3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                    }
                }
                i16 |= 384;
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var111113 = hw61VarC;
                        f7 = f5;
                        long j111111114 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j111111114;
                        hw61Var3 = hw61Var111113;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var111114 = hw61VarC;
                        f7 = f5;
                        long j111111115 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j111111115;
                        hw61Var3 = hw61Var111114;
                    }
                    x340Var2.s();
                    vu30 vu30Var1114 = vu30Var7;
                    eem0 eem0Var119 = eem0Var3;
                    int i3118 = i20;
                    n8b1VarW = t890.w(x340Var2, i3118);
                    n8b1VarW2 = t890.w(x340Var2, i3118);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j111111116 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI11111119 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI11111119 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI111111110 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z11111 = zI111111110 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z11111 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var117 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI111111111 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI111111111;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var1111 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var1111;
                    a8o.i((Function0) objT6, j8, eem0Var119, o95Var, apo.r(1010026864, new zdm0(j111111116, function2, vy71Var1111, eem0Var119, o95Var, c9nVar, iu30Var117, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1114, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var119;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var1114;
                    f3 = f7;
                    z4 = z2;
                    j6 = j111111116;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i10 |= 100663296;
            if ((i & 805306368) != 0) {
                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                    i26 = 268435456;
                } else {
                    i26 = 268435456;
                }
                i10 |= i26;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var2.i(vu30Var)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
            i17 = i3 & 4096;
            if (i17 != 0) {
                if ((i2 & 384) == 0) {
                    if (x340Var2.g(eem0Var)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var111115 = hw61VarC;
                        f7 = f5;
                        long j111111117 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j111111117;
                        hw61Var3 = hw61Var111115;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var111116 = hw61VarC;
                        f7 = f5;
                        long j111111118 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j111111118;
                        hw61Var3 = hw61Var111116;
                    }
                    x340Var2.s();
                    vu30 vu30Var1115 = vu30Var7;
                    eem0 eem0Var1110 = eem0Var3;
                    int i3119 = i20;
                    n8b1VarW = t890.w(x340Var2, i3119);
                    n8b1VarW2 = t890.w(x340Var2, i3119);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j111111119 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI111111112 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI111111112 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI111111113 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z11112 = zI111111113 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z11112 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var118 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI111111114 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI111111114;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var1112 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var1112;
                    a8o.i((Function0) objT6, j8, eem0Var1110, o95Var, apo.r(1010026864, new zdm0(j111111119, function2, vy71Var1112, eem0Var1110, o95Var, c9nVar, iu30Var118, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1115, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var1110;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var1115;
                    f3 = f7;
                    z4 = z2;
                    j6 = j111111119;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i16 |= 384;
            if ((i10 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var2.Y(i10 & 1, z3)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var111117 = hw61VarC;
                    f7 = f5;
                    long j1111111110 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j1111111110;
                    hw61Var3 = hw61Var111117;
                } else {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var111118 = hw61VarC;
                    f7 = f5;
                    long j1111111111 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j1111111111;
                    hw61Var3 = hw61Var111118;
                }
                x340Var2.s();
                vu30 vu30Var1116 = vu30Var7;
                eem0 eem0Var1111 = eem0Var3;
                int i31110 = i20;
                n8b1VarW = t890.w(x340Var2, i31110);
                n8b1VarW2 = t890.w(x340Var2, i31110);
                n8b1VarW3 = t890.w(x340Var2, 5);
                long j1111111112 = j9;
                i21 = (i10 & 896) ^ 384;
                zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                objT = x340Var2.T();
                if (zI) {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                } else {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                }
                qxd0.D((Function0) objT, x340Var2);
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o6x.a, x340Var2);
                    x340Var2.s0(objT2);
                }
                c9nVar = (c9n) objT2;
                boolean zI111111115 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                i22 = i10 & 14;
                if (i22 == 4) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                z7 = zI111111115 | z6;
                objT3 = x340Var2.T();
                if (z7) {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                } else {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                }
                function1 = (Function0) objT3;
                boolean zI111111116 = x340Var2.i(c9nVar);
                if (i21 > 256) {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                } else {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                }
                boolean z11113 = zI111111116 | z8;
                if (i22 == 4) {
                    z9 = true;
                } else {
                    z9 = z5;
                }
                z10 = z11113 | z9;
                objT4 = x340Var2.T();
                if (z10) {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                }
                iu30 iu30Var119 = (iu30) objT4;
                objT5 = x340Var2.T();
                if (objT5 == m4cVar) {
                    objT5 = c97.b(0.0f);
                    x340Var2.s0(objT5);
                }
                o95Var = (o95) objT5;
                if (i21 > 256) {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                } else {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                }
                boolean zI111111117 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                if (i22 == 4) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                z13 = z12 | zI111111117;
                objT6 = x340Var2.T();
                if (z13) {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                } else {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                }
                x340Var = x340Var2;
                i24 = i23;
                vy71 vy71Var1113 = vy71Var2;
                i25 = i10;
                vy71Var3 = vy71Var1113;
                a8o.i((Function0) objT6, j8, eem0Var1111, o95Var, apo.r(1010026864, new zdm0(j1111111112, function2, vy71Var1113, eem0Var1111, o95Var, c9nVar, iu30Var119, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1116, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                if (vy71Var3.e()) {
                    x340Var.i0(748459762);
                    if (i24 <= 256) {
                    }
                    objT7 = x340Var.T();
                    if (z14) {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    } else {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    }
                    qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                    x340Var.r(false);
                } else {
                    x340Var.i0(748521266);
                    x340Var.r(false);
                }
                eem0Var2 = eem0Var1111;
                j4 = j7;
                qim0Var3 = qim0Var4;
                hw61Var2 = hw61Var3;
                j5 = j8;
                f4 = f8;
                vu30Var3 = vu30Var8;
                vu30Var4 = vu30Var1116;
                f3 = f7;
                z4 = z2;
                j6 = j1111111112;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                f3 = f;
                vu30Var3 = vu30Var;
                vu30Var4 = vu30Var2;
                eem0Var2 = eem0Var;
                j4 = jB;
                z4 = z2;
                hw61Var2 = hw61VarC;
                qim0Var3 = qim0Var2;
                j5 = j2;
                f4 = f2;
                j6 = j3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
            }
        }
        i4 |= 24576;
        z2 = z;
        if ((i & 196608) == 0) {
            hw61VarC = hw61Var;
            if ((i3 & 32) == 0) {
                i28 = 65536;
            } else {
                i28 = 65536;
            }
            i4 |= i28;
        } else {
            hw61VarC = hw61Var;
        }
        if ((i & 1572864) == 0) {
            if ((i3 & 64) == 0) {
                i9 = i30;
                jB = j;
                if (x340Var2.f(jB)) {
                }
                i4 |= i31;
            } else {
                i9 = i30;
                jB = j;
            }
            i4 |= i31;
        } else {
            i9 = i30;
            jB = j;
        }
        if ((i & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                i27 = i4;
                if (x340Var2.f(j2)) {
                }
                i10 = i27 | i32;
            } else {
                i27 = i4;
            }
            i10 = i27 | i32;
        } else {
            i10 = i4;
        }
        i11 = i3 & 256;
        if (i11 != 0) {
            if ((i & 100663296) == 0) {
                if (x340Var2.d(f2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i10 |= i12;
            }
            if ((i & 805306368) != 0) {
                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                    i26 = 268435456;
                } else {
                    i26 = 268435456;
                }
                i10 |= i26;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var2.i(vu30Var)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
            i17 = i3 & 4096;
            if (i17 != 0) {
                if ((i2 & 384) == 0) {
                    if (x340Var2.g(eem0Var)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i10 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var111119 = hw61VarC;
                        f7 = f5;
                        long j1111111113 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j1111111113;
                        hw61Var3 = hw61Var111119;
                    } else {
                        if (i9 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            f5 = 640.0f;
                        } else {
                            f5 = f;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            hw61VarC = vrg.c(x340Var2);
                            i10 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jB = vrg.b(x340Var2);
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB2 = eah.b(jB, x340Var2);
                            i10 &= -29360129;
                        } else {
                            jB2 = j2;
                        }
                        if (i11 != 0) {
                            f6 = 0.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                            jE = vrg.e(x340Var2);
                            i10 &= -1879048193;
                        } else {
                            jE = j3;
                        }
                        if (i13 != 0) {
                            vu30Var5 = j2j.a;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        if ((i3 & 2048) != 0) {
                            vu30Var6 = q5.U0;
                            i16 &= -113;
                        } else {
                            vu30Var6 = vu30Var2;
                        }
                        i19 = i16;
                        if (i17 != 0) {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = new eem0(3);
                        } else {
                            j7 = jB;
                            qim0Var4 = qim0Var2;
                            eem0Var3 = eem0Var;
                        }
                        vu30Var7 = vu30Var6;
                        j8 = jB2;
                        z5 = false;
                        i20 = 1;
                        hw61 hw61Var1111110 = hw61VarC;
                        f7 = f5;
                        long j1111111114 = jE;
                        vu30Var8 = vu30Var5;
                        f8 = f6;
                        j9 = j1111111114;
                        hw61Var3 = hw61Var1111110;
                    }
                    x340Var2.s();
                    vu30 vu30Var1117 = vu30Var7;
                    eem0 eem0Var1112 = eem0Var3;
                    int i31111 = i20;
                    n8b1VarW = t890.w(x340Var2, i31111);
                    n8b1VarW2 = t890.w(x340Var2, i31111);
                    n8b1VarW3 = t890.w(x340Var2, 5);
                    long j1111111115 = j9;
                    i21 = (i10 & 896) ^ 384;
                    zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    } else {
                        objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                        vy71Var2 = vy71Var;
                        x340Var2.s0(objT);
                    }
                    qxd0.D((Function0) objT, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    boolean zI111111118 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                    i22 = i10 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    z7 = zI111111118 | z6;
                    objT3 = x340Var2.T();
                    if (z7) {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    } else {
                        objT3 = new wdm0(vy71Var2, c9nVar, function0);
                        x340Var2.s0(objT3);
                    }
                    function1 = (Function0) objT3;
                    boolean zI111111119 = x340Var2.i(c9nVar);
                    if (i21 > 256) {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    } else {
                        function2 = function1;
                        if ((i10 & 384) != 256) {
                            z8 = true;
                        } else {
                            z8 = z5;
                        }
                    }
                    boolean z11114 = zI111111119 | z8;
                    if (i22 == 4) {
                        z9 = true;
                    } else {
                        z9 = z5;
                    }
                    z10 = z11114 | z9;
                    objT4 = x340Var2.T();
                    if (z10) {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var1110 = (iu30) objT4;
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = c97.b(0.0f);
                        x340Var2.s0(objT5);
                    }
                    o95Var = (o95) objT5;
                    if (i21 > 256) {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    } else {
                        i23 = i21;
                        if ((i10 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                    }
                    boolean zI1111111110 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                    if (i22 == 4) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    z13 = z12 | zI1111111110;
                    objT6 = x340Var2.T();
                    if (z13) {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    i24 = i23;
                    vy71 vy71Var1114 = vy71Var2;
                    i25 = i10;
                    vy71Var3 = vy71Var1114;
                    a8o.i((Function0) objT6, j8, eem0Var1112, o95Var, apo.r(1010026864, new zdm0(j1111111115, function2, vy71Var1114, eem0Var1112, o95Var, c9nVar, iu30Var1110, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1117, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                    if (vy71Var3.e()) {
                        x340Var.i0(748459762);
                        if (i24 <= 256) {
                        }
                        objT7 = x340Var.T();
                        if (z14) {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        } else {
                            objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                            x340Var.s0(objT7);
                        }
                        qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(748521266);
                        x340Var.r(false);
                    }
                    eem0Var2 = eem0Var1112;
                    j4 = j7;
                    qim0Var3 = qim0Var4;
                    hw61Var2 = hw61Var3;
                    j5 = j8;
                    f4 = f8;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var1117;
                    f3 = f7;
                    z4 = z2;
                    j6 = j1111111115;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    f3 = f;
                    vu30Var3 = vu30Var;
                    vu30Var4 = vu30Var2;
                    eem0Var2 = eem0Var;
                    j4 = jB;
                    z4 = z2;
                    hw61Var2 = hw61VarC;
                    qim0Var3 = qim0Var2;
                    j5 = j2;
                    f4 = f2;
                    j6 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
                }
            }
            i16 |= 384;
            if ((i10 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var2.Y(i10 & 1, z3)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var1111111 = hw61VarC;
                    f7 = f5;
                    long j1111111116 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j1111111116;
                    hw61Var3 = hw61Var1111111;
                } else {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var1111112 = hw61VarC;
                    f7 = f5;
                    long j1111111117 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j1111111117;
                    hw61Var3 = hw61Var1111112;
                }
                x340Var2.s();
                vu30 vu30Var1118 = vu30Var7;
                eem0 eem0Var1113 = eem0Var3;
                int i31112 = i20;
                n8b1VarW = t890.w(x340Var2, i31112);
                n8b1VarW2 = t890.w(x340Var2, i31112);
                n8b1VarW3 = t890.w(x340Var2, 5);
                long j1111111118 = j9;
                i21 = (i10 & 896) ^ 384;
                zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                objT = x340Var2.T();
                if (zI) {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                } else {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                }
                qxd0.D((Function0) objT, x340Var2);
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o6x.a, x340Var2);
                    x340Var2.s0(objT2);
                }
                c9nVar = (c9n) objT2;
                boolean zI1111111111 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                i22 = i10 & 14;
                if (i22 == 4) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                z7 = zI1111111111 | z6;
                objT3 = x340Var2.T();
                if (z7) {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                } else {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                }
                function1 = (Function0) objT3;
                boolean zI1111111112 = x340Var2.i(c9nVar);
                if (i21 > 256) {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                } else {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                }
                boolean z11115 = zI1111111112 | z8;
                if (i22 == 4) {
                    z9 = true;
                } else {
                    z9 = z5;
                }
                z10 = z11115 | z9;
                objT4 = x340Var2.T();
                if (z10) {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                }
                iu30 iu30Var1111 = (iu30) objT4;
                objT5 = x340Var2.T();
                if (objT5 == m4cVar) {
                    objT5 = c97.b(0.0f);
                    x340Var2.s0(objT5);
                }
                o95Var = (o95) objT5;
                if (i21 > 256) {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                } else {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                }
                boolean zI1111111113 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                if (i22 == 4) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                z13 = z12 | zI1111111113;
                objT6 = x340Var2.T();
                if (z13) {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                } else {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                }
                x340Var = x340Var2;
                i24 = i23;
                vy71 vy71Var1115 = vy71Var2;
                i25 = i10;
                vy71Var3 = vy71Var1115;
                a8o.i((Function0) objT6, j8, eem0Var1113, o95Var, apo.r(1010026864, new zdm0(j1111111118, function2, vy71Var1115, eem0Var1113, o95Var, c9nVar, iu30Var1111, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1118, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                if (vy71Var3.e()) {
                    x340Var.i0(748459762);
                    if (i24 <= 256) {
                    }
                    objT7 = x340Var.T();
                    if (z14) {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    } else {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    }
                    qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                    x340Var.r(false);
                } else {
                    x340Var.i0(748521266);
                    x340Var.r(false);
                }
                eem0Var2 = eem0Var1113;
                j4 = j7;
                qim0Var3 = qim0Var4;
                hw61Var2 = hw61Var3;
                j5 = j8;
                f4 = f8;
                vu30Var3 = vu30Var8;
                vu30Var4 = vu30Var1118;
                f3 = f7;
                z4 = z2;
                j6 = j1111111118;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                f3 = f;
                vu30Var3 = vu30Var;
                vu30Var4 = vu30Var2;
                eem0Var2 = eem0Var;
                j4 = jB;
                z4 = z2;
                hw61Var2 = hw61VarC;
                qim0Var3 = qim0Var2;
                j5 = j2;
                f4 = f2;
                j6 = j3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
            }
        }
        i10 |= 100663296;
        if ((i & 805306368) != 0) {
            if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
                i26 = 268435456;
            } else {
                i26 = 268435456;
            }
            i10 |= i26;
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
            i14 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (x340Var2.i(vu30Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i2 | i15;
        } else {
            i14 = i2;
        }
        i16 = i14 | (((i3 & 2048) == 0 || !x340Var2.i(vu30Var2)) ? 16 : 32);
        i17 = i3 & 4096;
        if (i17 != 0) {
            if ((i2 & 384) == 0) {
                if (x340Var2.g(eem0Var)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i10 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var2.Y(i10 & 1, z3)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var1111113 = hw61VarC;
                    f7 = f5;
                    long j1111111119 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j1111111119;
                    hw61Var3 = hw61Var1111113;
                } else {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        f5 = 640.0f;
                    } else {
                        f5 = f;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        hw61VarC = vrg.c(x340Var2);
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jB = vrg.b(x340Var2);
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB2 = eah.b(jB, x340Var2);
                        i10 &= -29360129;
                    } else {
                        jB2 = j2;
                    }
                    if (i11 != 0) {
                        f6 = 0.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        jE = vrg.e(x340Var2);
                        i10 &= -1879048193;
                    } else {
                        jE = j3;
                    }
                    if (i13 != 0) {
                        vu30Var5 = j2j.a;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if ((i3 & 2048) != 0) {
                        vu30Var6 = q5.U0;
                        i16 &= -113;
                    } else {
                        vu30Var6 = vu30Var2;
                    }
                    i19 = i16;
                    if (i17 != 0) {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = new eem0(3);
                    } else {
                        j7 = jB;
                        qim0Var4 = qim0Var2;
                        eem0Var3 = eem0Var;
                    }
                    vu30Var7 = vu30Var6;
                    j8 = jB2;
                    z5 = false;
                    i20 = 1;
                    hw61 hw61Var1111114 = hw61VarC;
                    f7 = f5;
                    long j11111111110 = jE;
                    vu30Var8 = vu30Var5;
                    f8 = f6;
                    j9 = j11111111110;
                    hw61Var3 = hw61Var1111114;
                }
                x340Var2.s();
                vu30 vu30Var1119 = vu30Var7;
                eem0 eem0Var1114 = eem0Var3;
                int i31113 = i20;
                n8b1VarW = t890.w(x340Var2, i31113);
                n8b1VarW2 = t890.w(x340Var2, i31113);
                n8b1VarW3 = t890.w(x340Var2, 5);
                long j11111111111 = j9;
                i21 = (i10 & 896) ^ 384;
                zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
                objT = x340Var2.T();
                if (zI) {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                } else {
                    objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                    vy71Var2 = vy71Var;
                    x340Var2.s0(objT);
                }
                qxd0.D((Function0) objT, x340Var2);
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o6x.a, x340Var2);
                    x340Var2.s0(objT2);
                }
                c9nVar = (c9n) objT2;
                boolean zI1111111114 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
                i22 = i10 & 14;
                if (i22 == 4) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                z7 = zI1111111114 | z6;
                objT3 = x340Var2.T();
                if (z7) {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                } else {
                    objT3 = new wdm0(vy71Var2, c9nVar, function0);
                    x340Var2.s0(objT3);
                }
                function1 = (Function0) objT3;
                boolean zI1111111115 = x340Var2.i(c9nVar);
                if (i21 > 256) {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                } else {
                    function2 = function1;
                    if ((i10 & 384) != 256) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                }
                boolean z11116 = zI1111111115 | z8;
                if (i22 == 4) {
                    z9 = true;
                } else {
                    z9 = z5;
                }
                z10 = z11116 | z9;
                objT4 = x340Var2.T();
                if (z10) {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                    x340Var2.s0(objT4);
                }
                iu30 iu30Var1112 = (iu30) objT4;
                objT5 = x340Var2.T();
                if (objT5 == m4cVar) {
                    objT5 = c97.b(0.0f);
                    x340Var2.s0(objT5);
                }
                o95Var = (o95) objT5;
                if (i21 > 256) {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                } else {
                    i23 = i21;
                    if ((i10 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                }
                boolean zI1111111116 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
                if (i22 == 4) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                z13 = z12 | zI1111111116;
                objT6 = x340Var2.T();
                if (z13) {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                } else {
                    objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                    x340Var2.s0(objT6);
                }
                x340Var = x340Var2;
                i24 = i23;
                vy71 vy71Var1116 = vy71Var2;
                i25 = i10;
                vy71Var3 = vy71Var1116;
                a8o.i((Function0) objT6, j8, eem0Var1114, o95Var, apo.r(1010026864, new zdm0(j11111111111, function2, vy71Var1116, eem0Var1114, o95Var, c9nVar, iu30Var1112, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var1119, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
                if (vy71Var3.e()) {
                    x340Var.i0(748459762);
                    if (i24 <= 256) {
                    }
                    objT7 = x340Var.T();
                    if (z14) {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    } else {
                        objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                        x340Var.s0(objT7);
                    }
                    qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                    x340Var.r(false);
                } else {
                    x340Var.i0(748521266);
                    x340Var.r(false);
                }
                eem0Var2 = eem0Var1114;
                j4 = j7;
                qim0Var3 = qim0Var4;
                hw61Var2 = hw61Var3;
                j5 = j8;
                f4 = f8;
                vu30Var3 = vu30Var8;
                vu30Var4 = vu30Var1119;
                f3 = f7;
                z4 = z2;
                j6 = j11111111111;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                f3 = f;
                vu30Var3 = vu30Var;
                vu30Var4 = vu30Var2;
                eem0Var2 = eem0Var;
                j4 = jB;
                z4 = z2;
                hw61Var2 = hw61VarC;
                qim0Var3 = qim0Var2;
                j5 = j2;
                f4 = f2;
                j6 = j3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
            }
        }
        i16 |= 384;
        if ((i10 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (x340Var2.Y(i10 & 1, z3)) {
            x340Var2.d0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i5 != 0) {
                    f5 = 640.0f;
                } else {
                    f5 = f;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if ((i3 & 32) != 0) {
                    hw61VarC = vrg.c(x340Var2);
                    i10 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jB = vrg.b(x340Var2);
                    i10 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    jB2 = eah.b(jB, x340Var2);
                    i10 &= -29360129;
                } else {
                    jB2 = j2;
                }
                if (i11 != 0) {
                    f6 = 0.0f;
                } else {
                    f6 = f2;
                }
                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                    jE = vrg.e(x340Var2);
                    i10 &= -1879048193;
                } else {
                    jE = j3;
                }
                if (i13 != 0) {
                    vu30Var5 = j2j.a;
                } else {
                    vu30Var5 = vu30Var;
                }
                if ((i3 & 2048) != 0) {
                    vu30Var6 = q5.U0;
                    i16 &= -113;
                } else {
                    vu30Var6 = vu30Var2;
                }
                i19 = i16;
                if (i17 != 0) {
                    j7 = jB;
                    qim0Var4 = qim0Var2;
                    eem0Var3 = new eem0(3);
                } else {
                    j7 = jB;
                    qim0Var4 = qim0Var2;
                    eem0Var3 = eem0Var;
                }
                vu30Var7 = vu30Var6;
                j8 = jB2;
                z5 = false;
                i20 = 1;
                hw61 hw61Var1111115 = hw61VarC;
                f7 = f5;
                long j11111111112 = jE;
                vu30Var8 = vu30Var5;
                f8 = f6;
                j9 = j11111111112;
                hw61Var3 = hw61Var1111115;
            } else {
                if (i9 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i5 != 0) {
                    f5 = 640.0f;
                } else {
                    f5 = f;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if ((i3 & 32) != 0) {
                    hw61VarC = vrg.c(x340Var2);
                    i10 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jB = vrg.b(x340Var2);
                    i10 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    jB2 = eah.b(jB, x340Var2);
                    i10 &= -29360129;
                } else {
                    jB2 = j2;
                }
                if (i11 != 0) {
                    f6 = 0.0f;
                } else {
                    f6 = f2;
                }
                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                    jE = vrg.e(x340Var2);
                    i10 &= -1879048193;
                } else {
                    jE = j3;
                }
                if (i13 != 0) {
                    vu30Var5 = j2j.a;
                } else {
                    vu30Var5 = vu30Var;
                }
                if ((i3 & 2048) != 0) {
                    vu30Var6 = q5.U0;
                    i16 &= -113;
                } else {
                    vu30Var6 = vu30Var2;
                }
                i19 = i16;
                if (i17 != 0) {
                    j7 = jB;
                    qim0Var4 = qim0Var2;
                    eem0Var3 = new eem0(3);
                } else {
                    j7 = jB;
                    qim0Var4 = qim0Var2;
                    eem0Var3 = eem0Var;
                }
                vu30Var7 = vu30Var6;
                j8 = jB2;
                z5 = false;
                i20 = 1;
                hw61 hw61Var1111116 = hw61VarC;
                f7 = f5;
                long j11111111113 = jE;
                vu30Var8 = vu30Var5;
                f8 = f6;
                j9 = j11111111113;
                hw61Var3 = hw61Var1111116;
            }
            x340Var2.s();
            vu30 vu30Var11110 = vu30Var7;
            eem0 eem0Var1115 = eem0Var3;
            int i31114 = i20;
            n8b1VarW = t890.w(x340Var2, i31114);
            n8b1VarW2 = t890.w(x340Var2, i31114);
            n8b1VarW3 = t890.w(x340Var2, 5);
            long j11111111114 = j9;
            i21 = (i10 & 896) ^ 384;
            zI = (((i21 > 256 || !x340Var2.g(vy71Var3)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(n8b1VarW2) | x340Var2.i(n8b1VarW3) | x340Var2.i(n8b1VarW);
            objT = x340Var2.T();
            if (zI) {
                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                vy71Var2 = vy71Var;
                x340Var2.s0(objT);
            } else {
                objT = new rxb(vy71Var, n8b1VarW2, n8b1VarW3, n8b1VarW, (byte) 1);
                vy71Var2 = vy71Var;
                x340Var2.s0(objT);
            }
            qxd0.D((Function0) objT, x340Var2);
            objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT2);
            }
            c9nVar = (c9n) objT2;
            boolean zI1111111117 = (((i21 > 256 || !x340Var2.g(vy71Var2)) && (i10 & 384) != 256) ? z5 : true) | x340Var2.i(c9nVar);
            i22 = i10 & 14;
            if (i22 == 4) {
                z6 = true;
            } else {
                z6 = z5;
            }
            z7 = zI1111111117 | z6;
            objT3 = x340Var2.T();
            if (z7) {
                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                x340Var2.s0(objT3);
            } else {
                objT3 = new wdm0(vy71Var2, c9nVar, function0);
                x340Var2.s0(objT3);
            }
            function1 = (Function0) objT3;
            boolean zI1111111118 = x340Var2.i(c9nVar);
            if (i21 > 256) {
                function2 = function1;
                if ((i10 & 384) != 256) {
                    z8 = true;
                } else {
                    z8 = z5;
                }
            } else {
                function2 = function1;
                if ((i10 & 384) != 256) {
                    z8 = true;
                } else {
                    z8 = z5;
                }
            }
            boolean z11117 = zI1111111118 | z8;
            if (i22 == 4) {
                z9 = true;
            } else {
                z9 = z5;
            }
            z10 = z11117 | z9;
            objT4 = x340Var2.T();
            if (z10) {
                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                x340Var2.s0(objT4);
            } else {
                objT4 = new pg(c9nVar, vy71Var2, function0, (byte) 21);
                x340Var2.s0(objT4);
            }
            iu30 iu30Var1113 = (iu30) objT4;
            objT5 = x340Var2.T();
            if (objT5 == m4cVar) {
                objT5 = c97.b(0.0f);
                x340Var2.s0(objT5);
            }
            o95Var = (o95) objT5;
            if (i21 > 256) {
                i23 = i21;
                if ((i10 & 384) != 256) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
            } else {
                i23 = i21;
                if ((i10 & 384) != 256) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
            }
            boolean zI1111111119 = z11 | x340Var2.i(c9nVar) | x340Var2.i(o95Var);
            if (i22 == 4) {
                z12 = true;
            } else {
                z12 = z5;
            }
            z13 = z12 | zI1111111119;
            objT6 = x340Var2.T();
            if (z13) {
                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                x340Var2.s0(objT6);
            } else {
                objT6 = new qd4(vy71Var2, c9nVar, o95Var, function0);
                x340Var2.s0(objT6);
            }
            x340Var = x340Var2;
            i24 = i23;
            vy71 vy71Var1117 = vy71Var2;
            i25 = i10;
            vy71Var3 = vy71Var1117;
            a8o.i((Function0) objT6, j8, eem0Var1115, o95Var, apo.r(1010026864, new zdm0(j11111111114, function2, vy71Var1117, eem0Var1115, o95Var, c9nVar, iu30Var1113, qim0Var4, f7, z2, hw61Var3, j7, j8, f8, vu30Var8, vu30Var11110, j2iVar), x340Var), x340Var, (i19 & 896) | ((i25 >> 18) & 112) | 24576 | 4096);
            if (vy71Var3.e()) {
                x340Var.i0(748459762);
                if (i24 <= 256) {
                }
                objT7 = x340Var.T();
                if (z14) {
                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                    x340Var.s0(objT7);
                } else {
                    objT7 = new g(vy71Var3, (lnm) null, (byte) 13);
                    x340Var.s0(objT7);
                }
                qxd0.t(vy71Var3, x340Var, (vu30) objT7);
                x340Var.r(false);
            } else {
                x340Var.i0(748521266);
                x340Var.r(false);
            }
            eem0Var2 = eem0Var1115;
            j4 = j7;
            qim0Var3 = qim0Var4;
            hw61Var2 = hw61Var3;
            j5 = j8;
            f4 = f8;
            vu30Var3 = vu30Var8;
            vu30Var4 = vu30Var11110;
            f3 = f7;
            z4 = z2;
            j6 = j11111111114;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            f3 = f;
            vu30Var3 = vu30Var;
            vu30Var4 = vu30Var2;
            eem0Var2 = eem0Var;
            j4 = jB;
            z4 = z2;
            hw61Var2 = hw61VarC;
            qim0Var3 = qim0Var2;
            j5 = j2;
            f4 = f2;
            j6 = j3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xdm0(function0, qim0Var3, vy71Var3, f3, z4, hw61Var2, j4, j5, f4, j6, vu30Var3, vu30Var4, eem0Var2, j2iVar, i, i2, i3);
        }
    }

    public static final void b(o95 o95Var, c9n c9nVar, Function0 function0, iu30 iu30Var, qim0 qim0Var, vy71 vy71Var, float f, boolean z, hw61 hw61Var, long j, long j2, float f2, vu30 vu30Var, vu30 vu30Var2, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-37400432);
        int i2 = i | (x340Var2.i(o95Var) ? 32 : 16) | (x340Var2.i(c9nVar) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.i(iu30Var) ? 16384 : 8192) | (x340Var2.g(qim0Var) ? 131072 : 65536) | (x340Var2.g(vy71Var) ? 1048576 : 524288) | (x340Var2.d(f) ? 8388608 : 4194304) | (x340Var2.h(z) ? 67108864 : 33554432) | (x340Var2.g(hw61Var) ? 536870912 : 268435456);
        int i3 = (x340Var2.f(j) ? 4 : 2) | (x340Var2.f(j2) ? 32 : 16) | (x340Var2.d(f2) ? 256 : 128) | (x340Var2.i(vu30Var) ? 2048 : 1024) | (x340Var2.i(vu30Var2) ? 16384 : 8192) | (x340Var2.i(j2iVar) ? 131072 : 65536);
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            x340Var2.d0();
            if ((i & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            String strQ = bno1.q(x340Var2, 2131957935);
            qim0 qim0VarF = u291.f(u291.x(0.0f, f, 1, h2c.a.a(qim0Var, een.e)), 1.0f);
            qim0 qim0VarL = nim0.a;
            if (z) {
                x340Var2.i0(-1582035383);
                boolean z2 = (((i2 & 3670016) ^ 1572864) > 1048576 && x340Var2.g(vy71Var)) || (i2 & 1572864) == 1048576;
                Object objT = x340Var2.T();
                if (z2 || objT == m4cVar) {
                    objT = ly71.a(vy71Var, iu30Var);
                    x340Var2.s0(objT);
                }
                qim0VarL = bmq0.L(qim0VarL, (d6o0) objT, null);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1582020872);
                x340Var2.r(false);
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarL);
            s24 s24VarC = vy71Var.c();
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z3 = (i4 > 1048576 && x340Var2.g(vy71Var)) || (i2 & 1572864) == 1048576;
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new w9(vy71Var, (byte) 14);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarH = lm5.h(qim0VarThen, s24VarC, (vu30) objT2);
            q24 q24VarJ = vy71Var.c().J();
            boolean z4 = z && vy71Var.i();
            boolean zL = vy71Var.c().L();
            boolean z5 = (i2 & 57344) == 16384;
            Object objT3 = x340Var2.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = new aem0(iu30Var, (lnm) null);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarB = k6v.b(qim0VarH, q24VarJ, qqq0.a, z4, (idn0) null, zL, (xu30) null, (xu30) objT3, false, 168);
            boolean zG = x340Var2.g(strQ);
            Object objT4 = x340Var2.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new jfa(strQ, (byte) 9);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT4);
            int iG = (int) vy71Var.g();
            if (iG < 0) {
                iG = 0;
            }
            qim0 qim0VarJ = too1.j(qim0VarB2, poo1.r(iG, 13));
            boolean z6 = ((i4 > 1048576 && x340Var2.g(vy71Var)) || (i2 & 1572864) == 1048576) | ((i2 & 112) == 32 || x340Var2.i(o95Var));
            Object objT5 = x340Var2.T();
            if (z6 || objT5 == m4cVar) {
                objT5 = new gub0(vy71Var, o95Var, (byte) 3);
                x340Var2.s0(objT5);
            }
            int i5 = i3 << 6;
            int i6 = ((i2 >> 24) & 112) | 12582912 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
            x340Var = x340Var2;
            w3d1.a(t890.x(i541.C(qim0VarJ, (iu30) objT5), vy71Var), hw61Var, j, j2, f2, 0.0f, (qqb) null, apo.r(728743275, new cem0(vu30Var2, o95Var, vy71Var, vu30Var, j2iVar, function0, c9nVar, z), x340Var2), x340Var, i6, 96);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vdm0(o95Var, c9nVar, function0, iu30Var, qim0Var, vy71Var, f, z, hw61Var, j, j2, f2, vu30Var, vu30Var2, j2iVar, i);
        }
    }

    public static final void c(int i, long j, Function0 function0, b0k b0kVar, boolean z) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-391613911);
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(true) ? 2048 : 1024);
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (j != 16) {
            x340Var.i0(-1438582326);
            tob1 tob1VarB = z95.b(z ? 1.0f : 0.0f, t890.w(x340Var, 4), null, null, x340Var, 0, 28);
            String strQ = bno1.q(x340Var, 2131953953);
            x340Var.i0(-1438283579);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new f110(function0, (byte) 1);
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = f8d1.b(nim0Var, function0, (PointerInputEventHandler) objT);
            boolean zG = (i3 == 32) | x340Var.g(strQ);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new gub0(strQ, function0, (byte) 4);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, true, (iu30) objT2);
            x340Var.r(false);
            qim0 qim0VarThen = u291.d(nim0Var, 1.0f).then(qim0VarB2);
            boolean zG2 = x340Var.g(tob1VarB) | ((i2 & 14) == 4);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new wrb0(j, tob1VarB);
                x340Var.s0(objT3);
            }
            j0o1.b(0, x340Var, (iu30) objT3, qim0VarThen);
            x340Var.r(false);
        } else {
            x340Var.i0(-1437676103);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new udm0(j, function0, z, i);
        }
    }

    public static final float d(kd31 kd31Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (kd31Var.R0 >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (dm5.T(0.0f, Math.min(kd31Var.T0.h() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(kd31 kd31Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (kd31Var.R0 & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (dm5.T(0.0f, Math.min(kd31Var.T0.h() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final vy71 f(int i, int i2, b0k b0kVar, iu30 iu30Var, boolean z) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new g6f0((byte) 2);
                x340Var.s0(objT);
            }
            iu30Var = (iu30) objT;
        }
        return ly71.c(z2, iu30Var, xy71.a, b0kVar, (i & 14) | 384 | (i & 112), 56);
    }
}
