package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import androidx.media3.common.ParserException;
import com.comscore.android.ConnectivityType;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.contentagnostic.v2.Audio;
import com.spotify.contentagnostic.v2.Transcript;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jto1 {
    public static b180 a;

    public static final ko7 B(Audio audio) {
        jo7 jo7Var = new jo7(new so20(audio.o().p().o()));
        Transcript transcriptQ = audio.q();
        return new ko7(jo7Var, transcriptQ != null ? new l8g1(new so20(transcriptQ.p().o())) : null);
    }

    public static final boolean C(zy70 zy70Var) {
        return (zy70Var.c instanceof h180) || (zy70Var.p instanceof dg01) || ((x8c0) kto1.u(zy70Var, dz70.e)) != null;
    }

    public static boolean E(fc10 fc10Var, byte[] bArr, int i, int i2) {
        try {
            fc10Var.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean F(fc10 fc10Var, int i) {
        try {
            fc10Var.u(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static final void a(String str, long j, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1034247533);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            qim0 qim0VarA = h2c.a.a(uyn1.B(qim0Var3, 0.0f, 40.0f, 0.0f, 16.0f, 5), een.t);
            String strN0 = cwl1.n0(2131957817, new Object[]{str}, x340Var);
            uwr uwrVar = cbx.a;
            uwo1.e(strN0, qim0VarA, cbx.d(x340Var).j, j, null, null, 0, false, null, 0, null, x340Var, (i2 << 6) & 7168, 0, 2032);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z0o(str, j, qim0Var2, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:112:0x0151  */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x0171  */
    /* JADX WARN: Code duplicated, block: B:124:0x0178  */
    /* JADX WARN: Code duplicated, block: B:126:0x017c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:129:0x0189  */
    /* JADX WARN: Code duplicated, block: B:131:0x018e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:135:0x019c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01df  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:168:0x0204  */
    /* JADX WARN: Code duplicated, block: B:172:0x0212  */
    /* JADX WARN: Code duplicated, block: B:176:0x021f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0236  */
    /* JADX WARN: Code duplicated, block: B:197:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x0271  */
    /* JADX WARN: Code duplicated, block: B:199:0x0274  */
    /* JADX WARN: Code duplicated, block: B:202:0x0279  */
    /* JADX WARN: Code duplicated, block: B:203:0x0284  */
    /* JADX WARN: Code duplicated, block: B:206:0x0289  */
    /* JADX WARN: Code duplicated, block: B:207:0x028e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0291  */
    /* JADX WARN: Code duplicated, block: B:212:0x0296  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:219:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:222:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:227:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:229:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:230:0x02db  */
    /* JADX WARN: Code duplicated, block: B:232:0x02df  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:235:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:236:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:238:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:239:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:241:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:242:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:244:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:245:0x0302  */
    /* JADX WARN: Code duplicated, block: B:247:0x0393  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    public static final void b(qim0 qim0Var, uvx uvxVar, max maxVar, boolean z, idn0 idn0Var, ga80 ga80Var, gbx gbxVar, gbx gbxVar2, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, xu30 xu30Var8, b0k b0kVar, int i, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        uvx uvxVar2;
        max maxVar2;
        boolean z2;
        idn0 idn0VarY;
        ga80 ga80VarO;
        int i5;
        gbx gbxVar3;
        int i6;
        int i7;
        gbx gbxVar4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
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
        boolean z3;
        xu30 xu30Var9;
        xu30 xu30Var10;
        qim0 qim0Var3;
        uvx uvxVar3;
        ga80 ga80Var2;
        max maxVar3;
        gbx gbxVar5;
        xu30 xu30Var11;
        xu30 xu30Var12;
        xu30 xu30Var13;
        xu30 xu30Var14;
        gbx gbxVar6;
        idn0 idn0Var2;
        xu30 xu30Var15;
        h311 h311VarV;
        qim0 qim0Var4;
        uvx uvxVar4;
        max maxVar4;
        xu30 xu30Var16;
        xu30 xu30Var17;
        xu30 xu30Var18;
        xu30 xu30Var19;
        xu30 xu30Var20;
        xu30 xu30Var21;
        xu30 xu30Var22;
        ga80 ga80Var3;
        idn0 idn0Var3;
        boolean z4;
        xu30 xu30Var23;
        gbx gbxVar7;
        xu30 xu30Var24;
        cr31 cr31VarB;
        ?? r11;
        int i28;
        int i29;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-990810532);
        int i30 = i3 & 1;
        if (i30 != 0) {
            i4 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i4 = (x340Var.i(qim0Var2) ? 4 : 2) | i;
        } else {
            qim0Var2 = qim0Var;
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0) {
                uvxVar2 = uvxVar;
                int i31 = x340Var.i(uvxVar2) ? 32 : 16;
                i4 |= i31;
            } else {
                uvxVar2 = uvxVar;
            }
            i4 |= i31;
        } else {
            uvxVar2 = uvxVar;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                maxVar2 = maxVar;
                int i32 = x340Var.i(maxVar2) ? 256 : 128;
                i4 |= i32;
            } else {
                maxVar2 = maxVar;
            }
            i4 |= i32;
        } else {
            maxVar2 = maxVar;
        }
        int i33 = i3 & 8;
        if (i33 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= x340Var.h(z2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    idn0VarY = idn0Var;
                    if (x340Var.i(idn0VarY)) {
                        i29 = 16384;
                    }
                    i4 |= i29;
                } else {
                    idn0VarY = idn0Var;
                }
                i29 = 8192;
                i4 |= i29;
            } else {
                idn0VarY = idn0Var;
            }
            if ((i & 196608) == 0) {
                ga80VarO = ga80Var;
                if ((i3 & 32) == 0 || !x340Var.i(ga80VarO)) {
                    i28 = 65536;
                } else {
                    i28 = 131072;
                }
                i4 |= i28;
            } else {
                ga80VarO = ga80Var;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                i4 |= 1572864;
                gbxVar3 = gbxVar;
            } else {
                gbxVar3 = gbxVar;
                if ((i & 1572864) == 0) {
                    if (x340Var.i(gbxVar3)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
            }
            i7 = i3 & 128;
            if (i7 != 0) {
                i4 |= 12582912;
                gbxVar4 = gbxVar2;
            } else {
                gbxVar4 = gbxVar2;
                if ((i & 12582912) == 0) {
                    if (x340Var.i(gbxVar4)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                if ((i & 100663296) == 0) {
                    if (x340Var.i(xu30Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 512;
                if (i11 != 0) {
                    if ((i & 805306368) == 0) {
                        if (x340Var.i(xu30Var2)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var.i(xu30Var3)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i2 | i15;
                    } else {
                        i14 = i2;
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                        i14 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (x340Var.i(xu30Var4)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i14 |= i17;
                    }
                    i18 = i14;
                    i19 = i3 & 4096;
                    if (i19 != 0) {
                        i21 = i18 | 384;
                    } else {
                        i20 = i18;
                        if ((i2 & 384) != 0) {
                            if (x340Var.i(xu30Var5)) {
                                i22 = 256;
                            } else {
                                i22 = 128;
                            }
                            i20 |= i22;
                        }
                        i21 = i20;
                    }
                    i23 = i3 & 8192;
                    if (i23 != 0) {
                        i25 = i21 | 3072;
                    } else {
                        i24 = i21;
                        if ((i2 & 3072) == 0) {
                            i25 = i24 | (x340Var.i(xu30Var6) ? 2048 : 1024);
                        } else {
                            i25 = i24;
                        }
                    }
                    i26 = i3 & 16384;
                    if (i26 != 0) {
                        i27 = i25;
                        if ((i2 & 24576) == 0) {
                            i27 |= x340Var.i(xu30Var7) ? 16384 : 8192;
                        }
                        if ((i2 & 196608) == 0) {
                            i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                        }
                        if ((i4 & 306783379) == 306783378 || (i27 & 74899) != 74898) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (x340Var.Y(i4 & 1, z3)) {
                            x340Var.d0();
                            if ((i & 1) != 0 || x340Var.E()) {
                                if (i30 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if ((i3 & 2) != 0) {
                                    uvxVar4 = (uvx) x340Var.k(vvx.a);
                                    i4 &= -113;
                                } else {
                                    uvxVar4 = uvxVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    maxVar4 = jax.a;
                                } else {
                                    maxVar4 = maxVar2;
                                }
                                if (i33 != 0) {
                                    z2 = false;
                                }
                                if ((i3 & 16) != 0) {
                                    idn0VarY = zso1.Y(x340Var);
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    cr31VarB = uvxVar4.g;
                                    if (cr31VarB == null) {
                                        x340Var.i0(-564110884);
                                        uwr uwrVar = cbx.a;
                                        cua cuaVar = cbx.b(x340Var).f;
                                        cr31VarB = er31.b(6.0f);
                                        r11 = 0;
                                    } else {
                                        r11 = 0;
                                        x340Var.i0(-564112031);
                                    }
                                    x340Var.r((boolean) r11);
                                    ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                                    i4 &= -458753;
                                }
                                if (i5 != 0) {
                                    gbxVar3 = null;
                                }
                                if (i7 != 0) {
                                    gbxVar4 = null;
                                }
                                if (i9 != 0) {
                                    xu30Var16 = null;
                                } else {
                                    xu30Var16 = xu30Var;
                                }
                                if (i11 != 0) {
                                    xu30Var17 = null;
                                } else {
                                    xu30Var17 = xu30Var2;
                                }
                                if (i13 != 0) {
                                    xu30Var18 = null;
                                } else {
                                    xu30Var18 = xu30Var3;
                                }
                                if (i16 != 0) {
                                    xu30Var19 = null;
                                } else {
                                    xu30Var19 = xu30Var4;
                                }
                                if (i19 != 0) {
                                    xu30Var20 = null;
                                } else {
                                    xu30Var20 = xu30Var5;
                                }
                                if (i23 != 0) {
                                    xu30Var21 = null;
                                } else {
                                    xu30Var21 = xu30Var6;
                                }
                                if (i26 != 0) {
                                    xu30Var22 = xu30Var16;
                                    ga80Var3 = ga80VarO;
                                    idn0Var3 = idn0VarY;
                                    z4 = z2;
                                    xu30Var23 = xu30Var17;
                                    gbxVar7 = gbxVar4;
                                    xu30Var24 = null;
                                } else {
                                    xu30Var22 = xu30Var16;
                                    ga80Var3 = ga80VarO;
                                    idn0Var3 = idn0VarY;
                                    z4 = z2;
                                    xu30Var23 = xu30Var17;
                                    gbxVar7 = gbxVar4;
                                    xu30Var24 = xu30Var7;
                                }
                            } else {
                                x340Var.b0();
                                if ((i3 & 2) != 0) {
                                    i4 &= -113;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                xu30Var22 = xu30Var;
                                xu30Var18 = xu30Var3;
                                xu30Var19 = xu30Var4;
                                xu30Var20 = xu30Var5;
                                xu30Var21 = xu30Var6;
                                gbxVar7 = gbxVar4;
                                qim0Var4 = qim0Var2;
                                uvxVar4 = uvxVar2;
                                maxVar4 = maxVar2;
                                xu30Var24 = xu30Var7;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var2;
                            }
                            x340Var.s();
                            hw61 hw61VarA = gto1.A(uvxVar4, null, x340Var, 2);
                            qim0 qim0Var5 = qim0Var4;
                            xu30 xu30Var25 = xu30Var22;
                            qim0 qim0VarB = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                            uvx uvxVar5 = uvxVar4;
                            int i34 = i4;
                            xu30 xu30Var26 = xu30Var23;
                            xu30 xu30Var27 = xu30Var24;
                            xu30 xu30Var28 = xu30Var18;
                            xu30 xu30Var29 = xu30Var21;
                            xu30 xu30Var30 = xu30Var19;
                            xu30 xu30Var31 = xu30Var20;
                            cwl1.b(qim0VarB, een.h, hw61VarA, uvxVar5.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar5, xu30Var25, xu30Var26, xu30Var28, xu30Var30, xu30Var31, xu30Var29, xu30Var27, xu30Var8, (byte) 3), x340Var), x340Var, (i34 << 9) & 2147418112, ((i34 >> 21) & 14) | 48, 0);
                            uvxVar3 = uvxVar5;
                            maxVar3 = maxVar4;
                            z2 = z4;
                            idn0Var2 = idn0Var3;
                            ga80Var2 = ga80Var3;
                            gbxVar5 = gbxVar3;
                            gbxVar6 = gbxVar7;
                            xu30Var11 = xu30Var26;
                            xu30Var12 = xu30Var28;
                            xu30Var13 = xu30Var30;
                            xu30Var9 = xu30Var31;
                            xu30Var10 = xu30Var29;
                            xu30Var14 = xu30Var27;
                            xu30Var15 = xu30Var25;
                            qim0Var3 = qim0Var5;
                        } else {
                            x340Var.b0();
                            xu30Var9 = xu30Var5;
                            xu30Var10 = xu30Var6;
                            qim0Var3 = qim0Var2;
                            uvxVar3 = uvxVar2;
                            ga80Var2 = ga80VarO;
                            maxVar3 = maxVar2;
                            gbxVar5 = gbxVar3;
                            xu30Var11 = xu30Var2;
                            xu30Var12 = xu30Var3;
                            xu30Var13 = xu30Var4;
                            xu30Var14 = xu30Var7;
                            gbxVar6 = gbxVar4;
                            idn0Var2 = idn0VarY;
                            xu30Var15 = xu30Var;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                        }
                    }
                    i27 = i25 | 24576;
                    if ((i2 & 196608) == 0) {
                        i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var.Y(i4 & 1, z3)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if (i30 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i3 & 2) != 0) {
                                uvxVar4 = (uvx) x340Var.k(vvx.a);
                                i4 &= -113;
                            } else {
                                uvxVar4 = uvxVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if (i33 != 0) {
                                z2 = false;
                            }
                            if ((i3 & 16) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                cr31VarB = uvxVar4.g;
                                if (cr31VarB == null) {
                                    x340Var.i0(-564110884);
                                    uwr uwrVar2 = cbx.a;
                                    cua cuaVar2 = cbx.b(x340Var).f;
                                    cr31VarB = er31.b(6.0f);
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                    x340Var.i0(-564112031);
                                }
                                x340Var.r((boolean) r11);
                                ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                                i4 &= -458753;
                            }
                            if (i5 != 0) {
                                gbxVar3 = null;
                            }
                            if (i7 != 0) {
                                gbxVar4 = null;
                            }
                            if (i9 != 0) {
                                xu30Var16 = null;
                            } else {
                                xu30Var16 = xu30Var;
                            }
                            if (i11 != 0) {
                                xu30Var17 = null;
                            } else {
                                xu30Var17 = xu30Var2;
                            }
                            if (i13 != 0) {
                                xu30Var18 = null;
                            } else {
                                xu30Var18 = xu30Var3;
                            }
                            if (i16 != 0) {
                                xu30Var19 = null;
                            } else {
                                xu30Var19 = xu30Var4;
                            }
                            if (i19 != 0) {
                                xu30Var20 = null;
                            } else {
                                xu30Var20 = xu30Var5;
                            }
                            if (i23 != 0) {
                                xu30Var21 = null;
                            } else {
                                xu30Var21 = xu30Var6;
                            }
                            if (i26 != 0) {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = null;
                            } else {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = xu30Var7;
                            }
                        } else {
                            if (i30 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i3 & 2) != 0) {
                                uvxVar4 = (uvx) x340Var.k(vvx.a);
                                i4 &= -113;
                            } else {
                                uvxVar4 = uvxVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if (i33 != 0) {
                                z2 = false;
                            }
                            if ((i3 & 16) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                cr31VarB = uvxVar4.g;
                                if (cr31VarB == null) {
                                    x340Var.i0(-564110884);
                                    uwr uwrVar3 = cbx.a;
                                    cua cuaVar3 = cbx.b(x340Var).f;
                                    cr31VarB = er31.b(6.0f);
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                    x340Var.i0(-564112031);
                                }
                                x340Var.r((boolean) r11);
                                ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                                i4 &= -458753;
                            }
                            if (i5 != 0) {
                                gbxVar3 = null;
                            }
                            if (i7 != 0) {
                                gbxVar4 = null;
                            }
                            if (i9 != 0) {
                                xu30Var16 = null;
                            } else {
                                xu30Var16 = xu30Var;
                            }
                            if (i11 != 0) {
                                xu30Var17 = null;
                            } else {
                                xu30Var17 = xu30Var2;
                            }
                            if (i13 != 0) {
                                xu30Var18 = null;
                            } else {
                                xu30Var18 = xu30Var3;
                            }
                            if (i16 != 0) {
                                xu30Var19 = null;
                            } else {
                                xu30Var19 = xu30Var4;
                            }
                            if (i19 != 0) {
                                xu30Var20 = null;
                            } else {
                                xu30Var20 = xu30Var5;
                            }
                            if (i23 != 0) {
                                xu30Var21 = null;
                            } else {
                                xu30Var21 = xu30Var6;
                            }
                            if (i26 != 0) {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = null;
                            } else {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = xu30Var7;
                            }
                        }
                        x340Var.s();
                        hw61 hw61VarA2 = gto1.A(uvxVar4, null, x340Var, 2);
                        qim0 qim0Var6 = qim0Var4;
                        xu30 xu30Var210 = xu30Var22;
                        qim0 qim0VarB2 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                        uvx uvxVar6 = uvxVar4;
                        int i35 = i4;
                        xu30 xu30Var211 = xu30Var23;
                        xu30 xu30Var212 = xu30Var24;
                        xu30 xu30Var213 = xu30Var18;
                        xu30 xu30Var214 = xu30Var21;
                        xu30 xu30Var32 = xu30Var19;
                        xu30 xu30Var33 = xu30Var20;
                        cwl1.b(qim0VarB2, een.h, hw61VarA2, uvxVar6.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar6, xu30Var210, xu30Var211, xu30Var213, xu30Var32, xu30Var33, xu30Var214, xu30Var212, xu30Var8, (byte) 3), x340Var), x340Var, (i35 << 9) & 2147418112, ((i35 >> 21) & 14) | 48, 0);
                        uvxVar3 = uvxVar6;
                        maxVar3 = maxVar4;
                        z2 = z4;
                        idn0Var2 = idn0Var3;
                        ga80Var2 = ga80Var3;
                        gbxVar5 = gbxVar3;
                        gbxVar6 = gbxVar7;
                        xu30Var11 = xu30Var211;
                        xu30Var12 = xu30Var213;
                        xu30Var13 = xu30Var32;
                        xu30Var9 = xu30Var33;
                        xu30Var10 = xu30Var214;
                        xu30Var14 = xu30Var212;
                        xu30Var15 = xu30Var210;
                        qim0Var3 = qim0Var6;
                    } else {
                        x340Var.b0();
                        xu30Var9 = xu30Var5;
                        xu30Var10 = xu30Var6;
                        qim0Var3 = qim0Var2;
                        uvxVar3 = uvxVar2;
                        ga80Var2 = ga80VarO;
                        maxVar3 = maxVar2;
                        gbxVar5 = gbxVar3;
                        xu30Var11 = xu30Var2;
                        xu30Var12 = xu30Var3;
                        xu30Var13 = xu30Var4;
                        xu30Var14 = xu30Var7;
                        gbxVar6 = gbxVar4;
                        idn0Var2 = idn0VarY;
                        xu30Var15 = xu30Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                    }
                }
                i4 |= 805306368;
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(xu30Var3)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                    i14 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (x340Var.i(xu30Var4)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i14 |= i17;
                }
                i18 = i14;
                i19 = i3 & 4096;
                if (i19 != 0) {
                    i21 = i18 | 384;
                } else {
                    i20 = i18;
                    if ((i2 & 384) != 0) {
                        if (x340Var.i(xu30Var5)) {
                            i22 = 256;
                        } else {
                            i22 = 128;
                        }
                        i20 |= i22;
                    }
                    i21 = i20;
                }
                i23 = i3 & 8192;
                if (i23 != 0) {
                    i25 = i21 | 3072;
                } else {
                    i24 = i21;
                    if ((i2 & 3072) == 0) {
                        i25 = i24 | (x340Var.i(xu30Var6) ? 2048 : 1024);
                    } else {
                        i25 = i24;
                    }
                }
                i26 = i3 & 16384;
                if (i26 != 0) {
                    i27 = i25;
                    if ((i2 & 24576) == 0) {
                        i27 |= x340Var.i(xu30Var7) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) == 0) {
                        i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var.Y(i4 & 1, z3)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if (i30 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i3 & 2) != 0) {
                                uvxVar4 = (uvx) x340Var.k(vvx.a);
                                i4 &= -113;
                            } else {
                                uvxVar4 = uvxVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if (i33 != 0) {
                                z2 = false;
                            }
                            if ((i3 & 16) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                cr31VarB = uvxVar4.g;
                                if (cr31VarB == null) {
                                    x340Var.i0(-564110884);
                                    uwr uwrVar4 = cbx.a;
                                    cua cuaVar4 = cbx.b(x340Var).f;
                                    cr31VarB = er31.b(6.0f);
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                    x340Var.i0(-564112031);
                                }
                                x340Var.r((boolean) r11);
                                ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                                i4 &= -458753;
                            }
                            if (i5 != 0) {
                                gbxVar3 = null;
                            }
                            if (i7 != 0) {
                                gbxVar4 = null;
                            }
                            if (i9 != 0) {
                                xu30Var16 = null;
                            } else {
                                xu30Var16 = xu30Var;
                            }
                            if (i11 != 0) {
                                xu30Var17 = null;
                            } else {
                                xu30Var17 = xu30Var2;
                            }
                            if (i13 != 0) {
                                xu30Var18 = null;
                            } else {
                                xu30Var18 = xu30Var3;
                            }
                            if (i16 != 0) {
                                xu30Var19 = null;
                            } else {
                                xu30Var19 = xu30Var4;
                            }
                            if (i19 != 0) {
                                xu30Var20 = null;
                            } else {
                                xu30Var20 = xu30Var5;
                            }
                            if (i23 != 0) {
                                xu30Var21 = null;
                            } else {
                                xu30Var21 = xu30Var6;
                            }
                            if (i26 != 0) {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = null;
                            } else {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = xu30Var7;
                            }
                        } else {
                            if (i30 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i3 & 2) != 0) {
                                uvxVar4 = (uvx) x340Var.k(vvx.a);
                                i4 &= -113;
                            } else {
                                uvxVar4 = uvxVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if (i33 != 0) {
                                z2 = false;
                            }
                            if ((i3 & 16) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                cr31VarB = uvxVar4.g;
                                if (cr31VarB == null) {
                                    x340Var.i0(-564110884);
                                    uwr uwrVar5 = cbx.a;
                                    cua cuaVar5 = cbx.b(x340Var).f;
                                    cr31VarB = er31.b(6.0f);
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                    x340Var.i0(-564112031);
                                }
                                x340Var.r((boolean) r11);
                                ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                                i4 &= -458753;
                            }
                            if (i5 != 0) {
                                gbxVar3 = null;
                            }
                            if (i7 != 0) {
                                gbxVar4 = null;
                            }
                            if (i9 != 0) {
                                xu30Var16 = null;
                            } else {
                                xu30Var16 = xu30Var;
                            }
                            if (i11 != 0) {
                                xu30Var17 = null;
                            } else {
                                xu30Var17 = xu30Var2;
                            }
                            if (i13 != 0) {
                                xu30Var18 = null;
                            } else {
                                xu30Var18 = xu30Var3;
                            }
                            if (i16 != 0) {
                                xu30Var19 = null;
                            } else {
                                xu30Var19 = xu30Var4;
                            }
                            if (i19 != 0) {
                                xu30Var20 = null;
                            } else {
                                xu30Var20 = xu30Var5;
                            }
                            if (i23 != 0) {
                                xu30Var21 = null;
                            } else {
                                xu30Var21 = xu30Var6;
                            }
                            if (i26 != 0) {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = null;
                            } else {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = xu30Var7;
                            }
                        }
                        x340Var.s();
                        hw61 hw61VarA3 = gto1.A(uvxVar4, null, x340Var, 2);
                        qim0 qim0Var7 = qim0Var4;
                        xu30 xu30Var215 = xu30Var22;
                        qim0 qim0VarB3 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                        uvx uvxVar7 = uvxVar4;
                        int i36 = i4;
                        xu30 xu30Var216 = xu30Var23;
                        xu30 xu30Var217 = xu30Var24;
                        xu30 xu30Var218 = xu30Var18;
                        xu30 xu30Var219 = xu30Var21;
                        xu30 xu30Var34 = xu30Var19;
                        xu30 xu30Var35 = xu30Var20;
                        cwl1.b(qim0VarB3, een.h, hw61VarA3, uvxVar7.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar7, xu30Var215, xu30Var216, xu30Var218, xu30Var34, xu30Var35, xu30Var219, xu30Var217, xu30Var8, (byte) 3), x340Var), x340Var, (i36 << 9) & 2147418112, ((i36 >> 21) & 14) | 48, 0);
                        uvxVar3 = uvxVar7;
                        maxVar3 = maxVar4;
                        z2 = z4;
                        idn0Var2 = idn0Var3;
                        ga80Var2 = ga80Var3;
                        gbxVar5 = gbxVar3;
                        gbxVar6 = gbxVar7;
                        xu30Var11 = xu30Var216;
                        xu30Var12 = xu30Var218;
                        xu30Var13 = xu30Var34;
                        xu30Var9 = xu30Var35;
                        xu30Var10 = xu30Var219;
                        xu30Var14 = xu30Var217;
                        xu30Var15 = xu30Var215;
                        qim0Var3 = qim0Var7;
                    } else {
                        x340Var.b0();
                        xu30Var9 = xu30Var5;
                        xu30Var10 = xu30Var6;
                        qim0Var3 = qim0Var2;
                        uvxVar3 = uvxVar2;
                        ga80Var2 = ga80VarO;
                        maxVar3 = maxVar2;
                        gbxVar5 = gbxVar3;
                        xu30Var11 = xu30Var2;
                        xu30Var12 = xu30Var3;
                        xu30Var13 = xu30Var4;
                        xu30Var14 = xu30Var7;
                        gbxVar6 = gbxVar4;
                        idn0Var2 = idn0VarY;
                        xu30Var15 = xu30Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                    }
                }
                i27 = i25 | 24576;
                if ((i2 & 196608) == 0) {
                    i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar6 = cbx.a;
                                cua cuaVar6 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    } else {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar7 = cbx.a;
                                cua cuaVar7 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    }
                    x340Var.s();
                    hw61 hw61VarA4 = gto1.A(uvxVar4, null, x340Var, 2);
                    qim0 qim0Var8 = qim0Var4;
                    xu30 xu30Var2110 = xu30Var22;
                    qim0 qim0VarB4 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                    uvx uvxVar8 = uvxVar4;
                    int i37 = i4;
                    xu30 xu30Var2111 = xu30Var23;
                    xu30 xu30Var2112 = xu30Var24;
                    xu30 xu30Var2113 = xu30Var18;
                    xu30 xu30Var2114 = xu30Var21;
                    xu30 xu30Var36 = xu30Var19;
                    xu30 xu30Var37 = xu30Var20;
                    cwl1.b(qim0VarB4, een.h, hw61VarA4, uvxVar8.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar8, xu30Var2110, xu30Var2111, xu30Var2113, xu30Var36, xu30Var37, xu30Var2114, xu30Var2112, xu30Var8, (byte) 3), x340Var), x340Var, (i37 << 9) & 2147418112, ((i37 >> 21) & 14) | 48, 0);
                    uvxVar3 = uvxVar8;
                    maxVar3 = maxVar4;
                    z2 = z4;
                    idn0Var2 = idn0Var3;
                    ga80Var2 = ga80Var3;
                    gbxVar5 = gbxVar3;
                    gbxVar6 = gbxVar7;
                    xu30Var11 = xu30Var2111;
                    xu30Var12 = xu30Var2113;
                    xu30Var13 = xu30Var36;
                    xu30Var9 = xu30Var37;
                    xu30Var10 = xu30Var2114;
                    xu30Var14 = xu30Var2112;
                    xu30Var15 = xu30Var2110;
                    qim0Var3 = qim0Var8;
                } else {
                    x340Var.b0();
                    xu30Var9 = xu30Var5;
                    xu30Var10 = xu30Var6;
                    qim0Var3 = qim0Var2;
                    uvxVar3 = uvxVar2;
                    ga80Var2 = ga80VarO;
                    maxVar3 = maxVar2;
                    gbxVar5 = gbxVar3;
                    xu30Var11 = xu30Var2;
                    xu30Var12 = xu30Var3;
                    xu30Var13 = xu30Var4;
                    xu30Var14 = xu30Var7;
                    gbxVar6 = gbxVar4;
                    idn0Var2 = idn0VarY;
                    xu30Var15 = xu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                }
            }
            i4 |= 100663296;
            i11 = i3 & 512;
            if (i11 != 0) {
                if ((i & 805306368) == 0) {
                    if (x340Var.i(xu30Var2)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(xu30Var3)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                    i14 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (x340Var.i(xu30Var4)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i14 |= i17;
                }
                i18 = i14;
                i19 = i3 & 4096;
                if (i19 != 0) {
                    i21 = i18 | 384;
                } else {
                    i20 = i18;
                    if ((i2 & 384) != 0) {
                        if (x340Var.i(xu30Var5)) {
                            i22 = 256;
                        } else {
                            i22 = 128;
                        }
                        i20 |= i22;
                    }
                    i21 = i20;
                }
                i23 = i3 & 8192;
                if (i23 != 0) {
                    i25 = i21 | 3072;
                } else {
                    i24 = i21;
                    if ((i2 & 3072) == 0) {
                        i25 = i24 | (x340Var.i(xu30Var6) ? 2048 : 1024);
                    } else {
                        i25 = i24;
                    }
                }
                i26 = i3 & 16384;
                if (i26 != 0) {
                    i27 = i25;
                    if ((i2 & 24576) == 0) {
                        i27 |= x340Var.i(xu30Var7) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) == 0) {
                        i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var.Y(i4 & 1, z3)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if (i30 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i3 & 2) != 0) {
                                uvxVar4 = (uvx) x340Var.k(vvx.a);
                                i4 &= -113;
                            } else {
                                uvxVar4 = uvxVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if (i33 != 0) {
                                z2 = false;
                            }
                            if ((i3 & 16) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                cr31VarB = uvxVar4.g;
                                if (cr31VarB == null) {
                                    x340Var.i0(-564110884);
                                    uwr uwrVar8 = cbx.a;
                                    cua cuaVar8 = cbx.b(x340Var).f;
                                    cr31VarB = er31.b(6.0f);
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                    x340Var.i0(-564112031);
                                }
                                x340Var.r((boolean) r11);
                                ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                                i4 &= -458753;
                            }
                            if (i5 != 0) {
                                gbxVar3 = null;
                            }
                            if (i7 != 0) {
                                gbxVar4 = null;
                            }
                            if (i9 != 0) {
                                xu30Var16 = null;
                            } else {
                                xu30Var16 = xu30Var;
                            }
                            if (i11 != 0) {
                                xu30Var17 = null;
                            } else {
                                xu30Var17 = xu30Var2;
                            }
                            if (i13 != 0) {
                                xu30Var18 = null;
                            } else {
                                xu30Var18 = xu30Var3;
                            }
                            if (i16 != 0) {
                                xu30Var19 = null;
                            } else {
                                xu30Var19 = xu30Var4;
                            }
                            if (i19 != 0) {
                                xu30Var20 = null;
                            } else {
                                xu30Var20 = xu30Var5;
                            }
                            if (i23 != 0) {
                                xu30Var21 = null;
                            } else {
                                xu30Var21 = xu30Var6;
                            }
                            if (i26 != 0) {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = null;
                            } else {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = xu30Var7;
                            }
                        } else {
                            if (i30 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i3 & 2) != 0) {
                                uvxVar4 = (uvx) x340Var.k(vvx.a);
                                i4 &= -113;
                            } else {
                                uvxVar4 = uvxVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if (i33 != 0) {
                                z2 = false;
                            }
                            if ((i3 & 16) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                cr31VarB = uvxVar4.g;
                                if (cr31VarB == null) {
                                    x340Var.i0(-564110884);
                                    uwr uwrVar9 = cbx.a;
                                    cua cuaVar9 = cbx.b(x340Var).f;
                                    cr31VarB = er31.b(6.0f);
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                    x340Var.i0(-564112031);
                                }
                                x340Var.r((boolean) r11);
                                ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                                i4 &= -458753;
                            }
                            if (i5 != 0) {
                                gbxVar3 = null;
                            }
                            if (i7 != 0) {
                                gbxVar4 = null;
                            }
                            if (i9 != 0) {
                                xu30Var16 = null;
                            } else {
                                xu30Var16 = xu30Var;
                            }
                            if (i11 != 0) {
                                xu30Var17 = null;
                            } else {
                                xu30Var17 = xu30Var2;
                            }
                            if (i13 != 0) {
                                xu30Var18 = null;
                            } else {
                                xu30Var18 = xu30Var3;
                            }
                            if (i16 != 0) {
                                xu30Var19 = null;
                            } else {
                                xu30Var19 = xu30Var4;
                            }
                            if (i19 != 0) {
                                xu30Var20 = null;
                            } else {
                                xu30Var20 = xu30Var5;
                            }
                            if (i23 != 0) {
                                xu30Var21 = null;
                            } else {
                                xu30Var21 = xu30Var6;
                            }
                            if (i26 != 0) {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = null;
                            } else {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = xu30Var7;
                            }
                        }
                        x340Var.s();
                        hw61 hw61VarA5 = gto1.A(uvxVar4, null, x340Var, 2);
                        qim0 qim0Var9 = qim0Var4;
                        xu30 xu30Var2115 = xu30Var22;
                        qim0 qim0VarB5 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                        uvx uvxVar9 = uvxVar4;
                        int i38 = i4;
                        xu30 xu30Var2116 = xu30Var23;
                        xu30 xu30Var2117 = xu30Var24;
                        xu30 xu30Var2118 = xu30Var18;
                        xu30 xu30Var2119 = xu30Var21;
                        xu30 xu30Var38 = xu30Var19;
                        xu30 xu30Var39 = xu30Var20;
                        cwl1.b(qim0VarB5, een.h, hw61VarA5, uvxVar9.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar9, xu30Var2115, xu30Var2116, xu30Var2118, xu30Var38, xu30Var39, xu30Var2119, xu30Var2117, xu30Var8, (byte) 3), x340Var), x340Var, (i38 << 9) & 2147418112, ((i38 >> 21) & 14) | 48, 0);
                        uvxVar3 = uvxVar9;
                        maxVar3 = maxVar4;
                        z2 = z4;
                        idn0Var2 = idn0Var3;
                        ga80Var2 = ga80Var3;
                        gbxVar5 = gbxVar3;
                        gbxVar6 = gbxVar7;
                        xu30Var11 = xu30Var2116;
                        xu30Var12 = xu30Var2118;
                        xu30Var13 = xu30Var38;
                        xu30Var9 = xu30Var39;
                        xu30Var10 = xu30Var2119;
                        xu30Var14 = xu30Var2117;
                        xu30Var15 = xu30Var2115;
                        qim0Var3 = qim0Var9;
                    } else {
                        x340Var.b0();
                        xu30Var9 = xu30Var5;
                        xu30Var10 = xu30Var6;
                        qim0Var3 = qim0Var2;
                        uvxVar3 = uvxVar2;
                        ga80Var2 = ga80VarO;
                        maxVar3 = maxVar2;
                        gbxVar5 = gbxVar3;
                        xu30Var11 = xu30Var2;
                        xu30Var12 = xu30Var3;
                        xu30Var13 = xu30Var4;
                        xu30Var14 = xu30Var7;
                        gbxVar6 = gbxVar4;
                        idn0Var2 = idn0VarY;
                        xu30Var15 = xu30Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                    }
                }
                i27 = i25 | 24576;
                if ((i2 & 196608) == 0) {
                    i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar10 = cbx.a;
                                cua cuaVar10 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    } else {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar11 = cbx.a;
                                cua cuaVar11 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    }
                    x340Var.s();
                    hw61 hw61VarA6 = gto1.A(uvxVar4, null, x340Var, 2);
                    qim0 qim0Var10 = qim0Var4;
                    xu30 xu30Var21110 = xu30Var22;
                    qim0 qim0VarB6 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                    uvx uvxVar10 = uvxVar4;
                    int i39 = i4;
                    xu30 xu30Var21111 = xu30Var23;
                    xu30 xu30Var21112 = xu30Var24;
                    xu30 xu30Var21113 = xu30Var18;
                    xu30 xu30Var21114 = xu30Var21;
                    xu30 xu30Var310 = xu30Var19;
                    xu30 xu30Var311 = xu30Var20;
                    cwl1.b(qim0VarB6, een.h, hw61VarA6, uvxVar10.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar10, xu30Var21110, xu30Var21111, xu30Var21113, xu30Var310, xu30Var311, xu30Var21114, xu30Var21112, xu30Var8, (byte) 3), x340Var), x340Var, (i39 << 9) & 2147418112, ((i39 >> 21) & 14) | 48, 0);
                    uvxVar3 = uvxVar10;
                    maxVar3 = maxVar4;
                    z2 = z4;
                    idn0Var2 = idn0Var3;
                    ga80Var2 = ga80Var3;
                    gbxVar5 = gbxVar3;
                    gbxVar6 = gbxVar7;
                    xu30Var11 = xu30Var21111;
                    xu30Var12 = xu30Var21113;
                    xu30Var13 = xu30Var310;
                    xu30Var9 = xu30Var311;
                    xu30Var10 = xu30Var21114;
                    xu30Var14 = xu30Var21112;
                    xu30Var15 = xu30Var21110;
                    qim0Var3 = qim0Var10;
                } else {
                    x340Var.b0();
                    xu30Var9 = xu30Var5;
                    xu30Var10 = xu30Var6;
                    qim0Var3 = qim0Var2;
                    uvxVar3 = uvxVar2;
                    ga80Var2 = ga80VarO;
                    maxVar3 = maxVar2;
                    gbxVar5 = gbxVar3;
                    xu30Var11 = xu30Var2;
                    xu30Var12 = xu30Var3;
                    xu30Var13 = xu30Var4;
                    xu30Var14 = xu30Var7;
                    gbxVar6 = gbxVar4;
                    idn0Var2 = idn0VarY;
                    xu30Var15 = xu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                }
            }
            i4 |= 805306368;
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var.i(xu30Var3)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
                i14 |= 48;
            } else if ((i2 & 48) != 0) {
                if (x340Var.i(xu30Var4)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
                i14 |= i17;
            }
            i18 = i14;
            i19 = i3 & 4096;
            if (i19 != 0) {
                i21 = i18 | 384;
            } else {
                i20 = i18;
                if ((i2 & 384) != 0) {
                    if (x340Var.i(xu30Var5)) {
                        i22 = 256;
                    } else {
                        i22 = 128;
                    }
                    i20 |= i22;
                }
                i21 = i20;
            }
            i23 = i3 & 8192;
            if (i23 != 0) {
                i25 = i21 | 3072;
            } else {
                i24 = i21;
                if ((i2 & 3072) == 0) {
                    i25 = i24 | (x340Var.i(xu30Var6) ? 2048 : 1024);
                } else {
                    i25 = i24;
                }
            }
            i26 = i3 & 16384;
            if (i26 != 0) {
                i27 = i25;
                if ((i2 & 24576) == 0) {
                    i27 |= x340Var.i(xu30Var7) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar12 = cbx.a;
                                cua cuaVar12 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    } else {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar13 = cbx.a;
                                cua cuaVar13 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    }
                    x340Var.s();
                    hw61 hw61VarA7 = gto1.A(uvxVar4, null, x340Var, 2);
                    qim0 qim0Var11 = qim0Var4;
                    xu30 xu30Var21115 = xu30Var22;
                    qim0 qim0VarB7 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                    uvx uvxVar11 = uvxVar4;
                    int i310 = i4;
                    xu30 xu30Var21116 = xu30Var23;
                    xu30 xu30Var21117 = xu30Var24;
                    xu30 xu30Var21118 = xu30Var18;
                    xu30 xu30Var21119 = xu30Var21;
                    xu30 xu30Var312 = xu30Var19;
                    xu30 xu30Var313 = xu30Var20;
                    cwl1.b(qim0VarB7, een.h, hw61VarA7, uvxVar11.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar11, xu30Var21115, xu30Var21116, xu30Var21118, xu30Var312, xu30Var313, xu30Var21119, xu30Var21117, xu30Var8, (byte) 3), x340Var), x340Var, (i310 << 9) & 2147418112, ((i310 >> 21) & 14) | 48, 0);
                    uvxVar3 = uvxVar11;
                    maxVar3 = maxVar4;
                    z2 = z4;
                    idn0Var2 = idn0Var3;
                    ga80Var2 = ga80Var3;
                    gbxVar5 = gbxVar3;
                    gbxVar6 = gbxVar7;
                    xu30Var11 = xu30Var21116;
                    xu30Var12 = xu30Var21118;
                    xu30Var13 = xu30Var312;
                    xu30Var9 = xu30Var313;
                    xu30Var10 = xu30Var21119;
                    xu30Var14 = xu30Var21117;
                    xu30Var15 = xu30Var21115;
                    qim0Var3 = qim0Var11;
                } else {
                    x340Var.b0();
                    xu30Var9 = xu30Var5;
                    xu30Var10 = xu30Var6;
                    qim0Var3 = qim0Var2;
                    uvxVar3 = uvxVar2;
                    ga80Var2 = ga80VarO;
                    maxVar3 = maxVar2;
                    gbxVar5 = gbxVar3;
                    xu30Var11 = xu30Var2;
                    xu30Var12 = xu30Var3;
                    xu30Var13 = xu30Var4;
                    xu30Var14 = xu30Var7;
                    gbxVar6 = gbxVar4;
                    idn0Var2 = idn0VarY;
                    xu30Var15 = xu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                }
            }
            i27 = i25 | 24576;
            if ((i2 & 196608) == 0) {
                i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i30 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        uvxVar4 = (uvx) x340Var.k(vvx.a);
                        i4 &= -113;
                    } else {
                        uvxVar4 = uvxVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i33 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 16) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        cr31VarB = uvxVar4.g;
                        if (cr31VarB == null) {
                            x340Var.i0(-564110884);
                            uwr uwrVar14 = cbx.a;
                            cua cuaVar14 = cbx.b(x340Var).f;
                            cr31VarB = er31.b(6.0f);
                            r11 = 0;
                        } else {
                            r11 = 0;
                            x340Var.i0(-564112031);
                        }
                        x340Var.r((boolean) r11);
                        ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                        i4 &= -458753;
                    }
                    if (i5 != 0) {
                        gbxVar3 = null;
                    }
                    if (i7 != 0) {
                        gbxVar4 = null;
                    }
                    if (i9 != 0) {
                        xu30Var16 = null;
                    } else {
                        xu30Var16 = xu30Var;
                    }
                    if (i11 != 0) {
                        xu30Var17 = null;
                    } else {
                        xu30Var17 = xu30Var2;
                    }
                    if (i13 != 0) {
                        xu30Var18 = null;
                    } else {
                        xu30Var18 = xu30Var3;
                    }
                    if (i16 != 0) {
                        xu30Var19 = null;
                    } else {
                        xu30Var19 = xu30Var4;
                    }
                    if (i19 != 0) {
                        xu30Var20 = null;
                    } else {
                        xu30Var20 = xu30Var5;
                    }
                    if (i23 != 0) {
                        xu30Var21 = null;
                    } else {
                        xu30Var21 = xu30Var6;
                    }
                    if (i26 != 0) {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = null;
                    } else {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = xu30Var7;
                    }
                } else {
                    if (i30 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        uvxVar4 = (uvx) x340Var.k(vvx.a);
                        i4 &= -113;
                    } else {
                        uvxVar4 = uvxVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i33 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 16) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        cr31VarB = uvxVar4.g;
                        if (cr31VarB == null) {
                            x340Var.i0(-564110884);
                            uwr uwrVar15 = cbx.a;
                            cua cuaVar15 = cbx.b(x340Var).f;
                            cr31VarB = er31.b(6.0f);
                            r11 = 0;
                        } else {
                            r11 = 0;
                            x340Var.i0(-564112031);
                        }
                        x340Var.r((boolean) r11);
                        ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                        i4 &= -458753;
                    }
                    if (i5 != 0) {
                        gbxVar3 = null;
                    }
                    if (i7 != 0) {
                        gbxVar4 = null;
                    }
                    if (i9 != 0) {
                        xu30Var16 = null;
                    } else {
                        xu30Var16 = xu30Var;
                    }
                    if (i11 != 0) {
                        xu30Var17 = null;
                    } else {
                        xu30Var17 = xu30Var2;
                    }
                    if (i13 != 0) {
                        xu30Var18 = null;
                    } else {
                        xu30Var18 = xu30Var3;
                    }
                    if (i16 != 0) {
                        xu30Var19 = null;
                    } else {
                        xu30Var19 = xu30Var4;
                    }
                    if (i19 != 0) {
                        xu30Var20 = null;
                    } else {
                        xu30Var20 = xu30Var5;
                    }
                    if (i23 != 0) {
                        xu30Var21 = null;
                    } else {
                        xu30Var21 = xu30Var6;
                    }
                    if (i26 != 0) {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = null;
                    } else {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = xu30Var7;
                    }
                }
                x340Var.s();
                hw61 hw61VarA8 = gto1.A(uvxVar4, null, x340Var, 2);
                qim0 qim0Var12 = qim0Var4;
                xu30 xu30Var211110 = xu30Var22;
                qim0 qim0VarB8 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                uvx uvxVar12 = uvxVar4;
                int i311 = i4;
                xu30 xu30Var211111 = xu30Var23;
                xu30 xu30Var211112 = xu30Var24;
                xu30 xu30Var211113 = xu30Var18;
                xu30 xu30Var211114 = xu30Var21;
                xu30 xu30Var314 = xu30Var19;
                xu30 xu30Var315 = xu30Var20;
                cwl1.b(qim0VarB8, een.h, hw61VarA8, uvxVar12.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar12, xu30Var211110, xu30Var211111, xu30Var211113, xu30Var314, xu30Var315, xu30Var211114, xu30Var211112, xu30Var8, (byte) 3), x340Var), x340Var, (i311 << 9) & 2147418112, ((i311 >> 21) & 14) | 48, 0);
                uvxVar3 = uvxVar12;
                maxVar3 = maxVar4;
                z2 = z4;
                idn0Var2 = idn0Var3;
                ga80Var2 = ga80Var3;
                gbxVar5 = gbxVar3;
                gbxVar6 = gbxVar7;
                xu30Var11 = xu30Var211111;
                xu30Var12 = xu30Var211113;
                xu30Var13 = xu30Var314;
                xu30Var9 = xu30Var315;
                xu30Var10 = xu30Var211114;
                xu30Var14 = xu30Var211112;
                xu30Var15 = xu30Var211110;
                qim0Var3 = qim0Var12;
            } else {
                x340Var.b0();
                xu30Var9 = xu30Var5;
                xu30Var10 = xu30Var6;
                qim0Var3 = qim0Var2;
                uvxVar3 = uvxVar2;
                ga80Var2 = ga80VarO;
                maxVar3 = maxVar2;
                gbxVar5 = gbxVar3;
                xu30Var11 = xu30Var2;
                xu30Var12 = xu30Var3;
                xu30Var13 = xu30Var4;
                xu30Var14 = xu30Var7;
                gbxVar6 = gbxVar4;
                idn0Var2 = idn0VarY;
                xu30Var15 = xu30Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                idn0VarY = idn0Var;
                if (x340Var.i(idn0VarY)) {
                    i29 = 16384;
                }
                i4 |= i29;
            } else {
                idn0VarY = idn0Var;
            }
            i29 = 8192;
            i4 |= i29;
        } else {
            idn0VarY = idn0Var;
        }
        if ((i & 196608) == 0) {
            ga80VarO = ga80Var;
            if ((i3 & 32) == 0) {
                i28 = 65536;
            } else {
                i28 = 65536;
            }
            i4 |= i28;
        } else {
            ga80VarO = ga80Var;
        }
        i5 = i3 & 64;
        if (i5 != 0) {
            i4 |= 1572864;
            gbxVar3 = gbxVar;
        } else {
            gbxVar3 = gbxVar;
            if ((i & 1572864) == 0) {
                if (x340Var.i(gbxVar3)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
        }
        i7 = i3 & 128;
        if (i7 != 0) {
            i4 |= 12582912;
            gbxVar4 = gbxVar2;
        } else {
            gbxVar4 = gbxVar2;
            if ((i & 12582912) == 0) {
                if (x340Var.i(gbxVar4)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 256;
        if (i9 != 0) {
            if ((i & 100663296) == 0) {
                if (x340Var.i(xu30Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i4 |= i10;
            }
            i11 = i3 & 512;
            if (i11 != 0) {
                if ((i & 805306368) == 0) {
                    if (x340Var.i(xu30Var2)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(xu30Var3)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                    i14 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (x340Var.i(xu30Var4)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i14 |= i17;
                }
                i18 = i14;
                i19 = i3 & 4096;
                if (i19 != 0) {
                    i21 = i18 | 384;
                } else {
                    i20 = i18;
                    if ((i2 & 384) != 0) {
                        if (x340Var.i(xu30Var5)) {
                            i22 = 256;
                        } else {
                            i22 = 128;
                        }
                        i20 |= i22;
                    }
                    i21 = i20;
                }
                i23 = i3 & 8192;
                if (i23 != 0) {
                    i25 = i21 | 3072;
                } else {
                    i24 = i21;
                    if ((i2 & 3072) == 0) {
                        i25 = i24 | (x340Var.i(xu30Var6) ? 2048 : 1024);
                    } else {
                        i25 = i24;
                    }
                }
                i26 = i3 & 16384;
                if (i26 != 0) {
                    i27 = i25;
                    if ((i2 & 24576) == 0) {
                        i27 |= x340Var.i(xu30Var7) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) == 0) {
                        i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (x340Var.Y(i4 & 1, z3)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if (i30 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i3 & 2) != 0) {
                                uvxVar4 = (uvx) x340Var.k(vvx.a);
                                i4 &= -113;
                            } else {
                                uvxVar4 = uvxVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if (i33 != 0) {
                                z2 = false;
                            }
                            if ((i3 & 16) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                cr31VarB = uvxVar4.g;
                                if (cr31VarB == null) {
                                    x340Var.i0(-564110884);
                                    uwr uwrVar16 = cbx.a;
                                    cua cuaVar16 = cbx.b(x340Var).f;
                                    cr31VarB = er31.b(6.0f);
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                    x340Var.i0(-564112031);
                                }
                                x340Var.r((boolean) r11);
                                ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                                i4 &= -458753;
                            }
                            if (i5 != 0) {
                                gbxVar3 = null;
                            }
                            if (i7 != 0) {
                                gbxVar4 = null;
                            }
                            if (i9 != 0) {
                                xu30Var16 = null;
                            } else {
                                xu30Var16 = xu30Var;
                            }
                            if (i11 != 0) {
                                xu30Var17 = null;
                            } else {
                                xu30Var17 = xu30Var2;
                            }
                            if (i13 != 0) {
                                xu30Var18 = null;
                            } else {
                                xu30Var18 = xu30Var3;
                            }
                            if (i16 != 0) {
                                xu30Var19 = null;
                            } else {
                                xu30Var19 = xu30Var4;
                            }
                            if (i19 != 0) {
                                xu30Var20 = null;
                            } else {
                                xu30Var20 = xu30Var5;
                            }
                            if (i23 != 0) {
                                xu30Var21 = null;
                            } else {
                                xu30Var21 = xu30Var6;
                            }
                            if (i26 != 0) {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = null;
                            } else {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = xu30Var7;
                            }
                        } else {
                            if (i30 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i3 & 2) != 0) {
                                uvxVar4 = (uvx) x340Var.k(vvx.a);
                                i4 &= -113;
                            } else {
                                uvxVar4 = uvxVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if (i33 != 0) {
                                z2 = false;
                            }
                            if ((i3 & 16) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                cr31VarB = uvxVar4.g;
                                if (cr31VarB == null) {
                                    x340Var.i0(-564110884);
                                    uwr uwrVar17 = cbx.a;
                                    cua cuaVar17 = cbx.b(x340Var).f;
                                    cr31VarB = er31.b(6.0f);
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                    x340Var.i0(-564112031);
                                }
                                x340Var.r((boolean) r11);
                                ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                                i4 &= -458753;
                            }
                            if (i5 != 0) {
                                gbxVar3 = null;
                            }
                            if (i7 != 0) {
                                gbxVar4 = null;
                            }
                            if (i9 != 0) {
                                xu30Var16 = null;
                            } else {
                                xu30Var16 = xu30Var;
                            }
                            if (i11 != 0) {
                                xu30Var17 = null;
                            } else {
                                xu30Var17 = xu30Var2;
                            }
                            if (i13 != 0) {
                                xu30Var18 = null;
                            } else {
                                xu30Var18 = xu30Var3;
                            }
                            if (i16 != 0) {
                                xu30Var19 = null;
                            } else {
                                xu30Var19 = xu30Var4;
                            }
                            if (i19 != 0) {
                                xu30Var20 = null;
                            } else {
                                xu30Var20 = xu30Var5;
                            }
                            if (i23 != 0) {
                                xu30Var21 = null;
                            } else {
                                xu30Var21 = xu30Var6;
                            }
                            if (i26 != 0) {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = null;
                            } else {
                                xu30Var22 = xu30Var16;
                                ga80Var3 = ga80VarO;
                                idn0Var3 = idn0VarY;
                                z4 = z2;
                                xu30Var23 = xu30Var17;
                                gbxVar7 = gbxVar4;
                                xu30Var24 = xu30Var7;
                            }
                        }
                        x340Var.s();
                        hw61 hw61VarA9 = gto1.A(uvxVar4, null, x340Var, 2);
                        qim0 qim0Var13 = qim0Var4;
                        xu30 xu30Var211115 = xu30Var22;
                        qim0 qim0VarB9 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                        uvx uvxVar13 = uvxVar4;
                        int i312 = i4;
                        xu30 xu30Var211116 = xu30Var23;
                        xu30 xu30Var211117 = xu30Var24;
                        xu30 xu30Var211118 = xu30Var18;
                        xu30 xu30Var211119 = xu30Var21;
                        xu30 xu30Var316 = xu30Var19;
                        xu30 xu30Var317 = xu30Var20;
                        cwl1.b(qim0VarB9, een.h, hw61VarA9, uvxVar13.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar13, xu30Var211115, xu30Var211116, xu30Var211118, xu30Var316, xu30Var317, xu30Var211119, xu30Var211117, xu30Var8, (byte) 3), x340Var), x340Var, (i312 << 9) & 2147418112, ((i312 >> 21) & 14) | 48, 0);
                        uvxVar3 = uvxVar13;
                        maxVar3 = maxVar4;
                        z2 = z4;
                        idn0Var2 = idn0Var3;
                        ga80Var2 = ga80Var3;
                        gbxVar5 = gbxVar3;
                        gbxVar6 = gbxVar7;
                        xu30Var11 = xu30Var211116;
                        xu30Var12 = xu30Var211118;
                        xu30Var13 = xu30Var316;
                        xu30Var9 = xu30Var317;
                        xu30Var10 = xu30Var211119;
                        xu30Var14 = xu30Var211117;
                        xu30Var15 = xu30Var211115;
                        qim0Var3 = qim0Var13;
                    } else {
                        x340Var.b0();
                        xu30Var9 = xu30Var5;
                        xu30Var10 = xu30Var6;
                        qim0Var3 = qim0Var2;
                        uvxVar3 = uvxVar2;
                        ga80Var2 = ga80VarO;
                        maxVar3 = maxVar2;
                        gbxVar5 = gbxVar3;
                        xu30Var11 = xu30Var2;
                        xu30Var12 = xu30Var3;
                        xu30Var13 = xu30Var4;
                        xu30Var14 = xu30Var7;
                        gbxVar6 = gbxVar4;
                        idn0Var2 = idn0VarY;
                        xu30Var15 = xu30Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                    }
                }
                i27 = i25 | 24576;
                if ((i2 & 196608) == 0) {
                    i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar18 = cbx.a;
                                cua cuaVar18 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    } else {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar19 = cbx.a;
                                cua cuaVar19 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    }
                    x340Var.s();
                    hw61 hw61VarA10 = gto1.A(uvxVar4, null, x340Var, 2);
                    qim0 qim0Var14 = qim0Var4;
                    xu30 xu30Var2111110 = xu30Var22;
                    qim0 qim0VarB10 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                    uvx uvxVar14 = uvxVar4;
                    int i313 = i4;
                    xu30 xu30Var2111111 = xu30Var23;
                    xu30 xu30Var2111112 = xu30Var24;
                    xu30 xu30Var2111113 = xu30Var18;
                    xu30 xu30Var2111114 = xu30Var21;
                    xu30 xu30Var318 = xu30Var19;
                    xu30 xu30Var319 = xu30Var20;
                    cwl1.b(qim0VarB10, een.h, hw61VarA10, uvxVar14.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar14, xu30Var2111110, xu30Var2111111, xu30Var2111113, xu30Var318, xu30Var319, xu30Var2111114, xu30Var2111112, xu30Var8, (byte) 3), x340Var), x340Var, (i313 << 9) & 2147418112, ((i313 >> 21) & 14) | 48, 0);
                    uvxVar3 = uvxVar14;
                    maxVar3 = maxVar4;
                    z2 = z4;
                    idn0Var2 = idn0Var3;
                    ga80Var2 = ga80Var3;
                    gbxVar5 = gbxVar3;
                    gbxVar6 = gbxVar7;
                    xu30Var11 = xu30Var2111111;
                    xu30Var12 = xu30Var2111113;
                    xu30Var13 = xu30Var318;
                    xu30Var9 = xu30Var319;
                    xu30Var10 = xu30Var2111114;
                    xu30Var14 = xu30Var2111112;
                    xu30Var15 = xu30Var2111110;
                    qim0Var3 = qim0Var14;
                } else {
                    x340Var.b0();
                    xu30Var9 = xu30Var5;
                    xu30Var10 = xu30Var6;
                    qim0Var3 = qim0Var2;
                    uvxVar3 = uvxVar2;
                    ga80Var2 = ga80VarO;
                    maxVar3 = maxVar2;
                    gbxVar5 = gbxVar3;
                    xu30Var11 = xu30Var2;
                    xu30Var12 = xu30Var3;
                    xu30Var13 = xu30Var4;
                    xu30Var14 = xu30Var7;
                    gbxVar6 = gbxVar4;
                    idn0Var2 = idn0VarY;
                    xu30Var15 = xu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                }
            }
            i4 |= 805306368;
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var.i(xu30Var3)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
                i14 |= 48;
            } else if ((i2 & 48) != 0) {
                if (x340Var.i(xu30Var4)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
                i14 |= i17;
            }
            i18 = i14;
            i19 = i3 & 4096;
            if (i19 != 0) {
                i21 = i18 | 384;
            } else {
                i20 = i18;
                if ((i2 & 384) != 0) {
                    if (x340Var.i(xu30Var5)) {
                        i22 = 256;
                    } else {
                        i22 = 128;
                    }
                    i20 |= i22;
                }
                i21 = i20;
            }
            i23 = i3 & 8192;
            if (i23 != 0) {
                i25 = i21 | 3072;
            } else {
                i24 = i21;
                if ((i2 & 3072) == 0) {
                    i25 = i24 | (x340Var.i(xu30Var6) ? 2048 : 1024);
                } else {
                    i25 = i24;
                }
            }
            i26 = i3 & 16384;
            if (i26 != 0) {
                i27 = i25;
                if ((i2 & 24576) == 0) {
                    i27 |= x340Var.i(xu30Var7) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar110 = cbx.a;
                                cua cuaVar110 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    } else {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar111 = cbx.a;
                                cua cuaVar111 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    }
                    x340Var.s();
                    hw61 hw61VarA11 = gto1.A(uvxVar4, null, x340Var, 2);
                    qim0 qim0Var15 = qim0Var4;
                    xu30 xu30Var2111115 = xu30Var22;
                    qim0 qim0VarB11 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                    uvx uvxVar15 = uvxVar4;
                    int i314 = i4;
                    xu30 xu30Var2111116 = xu30Var23;
                    xu30 xu30Var2111117 = xu30Var24;
                    xu30 xu30Var2111118 = xu30Var18;
                    xu30 xu30Var2111119 = xu30Var21;
                    xu30 xu30Var3110 = xu30Var19;
                    xu30 xu30Var3111 = xu30Var20;
                    cwl1.b(qim0VarB11, een.h, hw61VarA11, uvxVar15.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar15, xu30Var2111115, xu30Var2111116, xu30Var2111118, xu30Var3110, xu30Var3111, xu30Var2111119, xu30Var2111117, xu30Var8, (byte) 3), x340Var), x340Var, (i314 << 9) & 2147418112, ((i314 >> 21) & 14) | 48, 0);
                    uvxVar3 = uvxVar15;
                    maxVar3 = maxVar4;
                    z2 = z4;
                    idn0Var2 = idn0Var3;
                    ga80Var2 = ga80Var3;
                    gbxVar5 = gbxVar3;
                    gbxVar6 = gbxVar7;
                    xu30Var11 = xu30Var2111116;
                    xu30Var12 = xu30Var2111118;
                    xu30Var13 = xu30Var3110;
                    xu30Var9 = xu30Var3111;
                    xu30Var10 = xu30Var2111119;
                    xu30Var14 = xu30Var2111117;
                    xu30Var15 = xu30Var2111115;
                    qim0Var3 = qim0Var15;
                } else {
                    x340Var.b0();
                    xu30Var9 = xu30Var5;
                    xu30Var10 = xu30Var6;
                    qim0Var3 = qim0Var2;
                    uvxVar3 = uvxVar2;
                    ga80Var2 = ga80VarO;
                    maxVar3 = maxVar2;
                    gbxVar5 = gbxVar3;
                    xu30Var11 = xu30Var2;
                    xu30Var12 = xu30Var3;
                    xu30Var13 = xu30Var4;
                    xu30Var14 = xu30Var7;
                    gbxVar6 = gbxVar4;
                    idn0Var2 = idn0VarY;
                    xu30Var15 = xu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                }
            }
            i27 = i25 | 24576;
            if ((i2 & 196608) == 0) {
                i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i30 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        uvxVar4 = (uvx) x340Var.k(vvx.a);
                        i4 &= -113;
                    } else {
                        uvxVar4 = uvxVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i33 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 16) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        cr31VarB = uvxVar4.g;
                        if (cr31VarB == null) {
                            x340Var.i0(-564110884);
                            uwr uwrVar112 = cbx.a;
                            cua cuaVar112 = cbx.b(x340Var).f;
                            cr31VarB = er31.b(6.0f);
                            r11 = 0;
                        } else {
                            r11 = 0;
                            x340Var.i0(-564112031);
                        }
                        x340Var.r((boolean) r11);
                        ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                        i4 &= -458753;
                    }
                    if (i5 != 0) {
                        gbxVar3 = null;
                    }
                    if (i7 != 0) {
                        gbxVar4 = null;
                    }
                    if (i9 != 0) {
                        xu30Var16 = null;
                    } else {
                        xu30Var16 = xu30Var;
                    }
                    if (i11 != 0) {
                        xu30Var17 = null;
                    } else {
                        xu30Var17 = xu30Var2;
                    }
                    if (i13 != 0) {
                        xu30Var18 = null;
                    } else {
                        xu30Var18 = xu30Var3;
                    }
                    if (i16 != 0) {
                        xu30Var19 = null;
                    } else {
                        xu30Var19 = xu30Var4;
                    }
                    if (i19 != 0) {
                        xu30Var20 = null;
                    } else {
                        xu30Var20 = xu30Var5;
                    }
                    if (i23 != 0) {
                        xu30Var21 = null;
                    } else {
                        xu30Var21 = xu30Var6;
                    }
                    if (i26 != 0) {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = null;
                    } else {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = xu30Var7;
                    }
                } else {
                    if (i30 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        uvxVar4 = (uvx) x340Var.k(vvx.a);
                        i4 &= -113;
                    } else {
                        uvxVar4 = uvxVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i33 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 16) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        cr31VarB = uvxVar4.g;
                        if (cr31VarB == null) {
                            x340Var.i0(-564110884);
                            uwr uwrVar113 = cbx.a;
                            cua cuaVar113 = cbx.b(x340Var).f;
                            cr31VarB = er31.b(6.0f);
                            r11 = 0;
                        } else {
                            r11 = 0;
                            x340Var.i0(-564112031);
                        }
                        x340Var.r((boolean) r11);
                        ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                        i4 &= -458753;
                    }
                    if (i5 != 0) {
                        gbxVar3 = null;
                    }
                    if (i7 != 0) {
                        gbxVar4 = null;
                    }
                    if (i9 != 0) {
                        xu30Var16 = null;
                    } else {
                        xu30Var16 = xu30Var;
                    }
                    if (i11 != 0) {
                        xu30Var17 = null;
                    } else {
                        xu30Var17 = xu30Var2;
                    }
                    if (i13 != 0) {
                        xu30Var18 = null;
                    } else {
                        xu30Var18 = xu30Var3;
                    }
                    if (i16 != 0) {
                        xu30Var19 = null;
                    } else {
                        xu30Var19 = xu30Var4;
                    }
                    if (i19 != 0) {
                        xu30Var20 = null;
                    } else {
                        xu30Var20 = xu30Var5;
                    }
                    if (i23 != 0) {
                        xu30Var21 = null;
                    } else {
                        xu30Var21 = xu30Var6;
                    }
                    if (i26 != 0) {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = null;
                    } else {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = xu30Var7;
                    }
                }
                x340Var.s();
                hw61 hw61VarA12 = gto1.A(uvxVar4, null, x340Var, 2);
                qim0 qim0Var16 = qim0Var4;
                xu30 xu30Var21111110 = xu30Var22;
                qim0 qim0VarB12 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                uvx uvxVar16 = uvxVar4;
                int i315 = i4;
                xu30 xu30Var21111111 = xu30Var23;
                xu30 xu30Var21111112 = xu30Var24;
                xu30 xu30Var21111113 = xu30Var18;
                xu30 xu30Var21111114 = xu30Var21;
                xu30 xu30Var3112 = xu30Var19;
                xu30 xu30Var3113 = xu30Var20;
                cwl1.b(qim0VarB12, een.h, hw61VarA12, uvxVar16.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar16, xu30Var21111110, xu30Var21111111, xu30Var21111113, xu30Var3112, xu30Var3113, xu30Var21111114, xu30Var21111112, xu30Var8, (byte) 3), x340Var), x340Var, (i315 << 9) & 2147418112, ((i315 >> 21) & 14) | 48, 0);
                uvxVar3 = uvxVar16;
                maxVar3 = maxVar4;
                z2 = z4;
                idn0Var2 = idn0Var3;
                ga80Var2 = ga80Var3;
                gbxVar5 = gbxVar3;
                gbxVar6 = gbxVar7;
                xu30Var11 = xu30Var21111111;
                xu30Var12 = xu30Var21111113;
                xu30Var13 = xu30Var3112;
                xu30Var9 = xu30Var3113;
                xu30Var10 = xu30Var21111114;
                xu30Var14 = xu30Var21111112;
                xu30Var15 = xu30Var21111110;
                qim0Var3 = qim0Var16;
            } else {
                x340Var.b0();
                xu30Var9 = xu30Var5;
                xu30Var10 = xu30Var6;
                qim0Var3 = qim0Var2;
                uvxVar3 = uvxVar2;
                ga80Var2 = ga80VarO;
                maxVar3 = maxVar2;
                gbxVar5 = gbxVar3;
                xu30Var11 = xu30Var2;
                xu30Var12 = xu30Var3;
                xu30Var13 = xu30Var4;
                xu30Var14 = xu30Var7;
                gbxVar6 = gbxVar4;
                idn0Var2 = idn0VarY;
                xu30Var15 = xu30Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
            }
        }
        i4 |= 100663296;
        i11 = i3 & 512;
        if (i11 != 0) {
            if ((i & 805306368) == 0) {
                if (x340Var.i(xu30Var2)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var.i(xu30Var3)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
                i14 |= 48;
            } else if ((i2 & 48) != 0) {
                if (x340Var.i(xu30Var4)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
                i14 |= i17;
            }
            i18 = i14;
            i19 = i3 & 4096;
            if (i19 != 0) {
                i21 = i18 | 384;
            } else {
                i20 = i18;
                if ((i2 & 384) != 0) {
                    if (x340Var.i(xu30Var5)) {
                        i22 = 256;
                    } else {
                        i22 = 128;
                    }
                    i20 |= i22;
                }
                i21 = i20;
            }
            i23 = i3 & 8192;
            if (i23 != 0) {
                i25 = i21 | 3072;
            } else {
                i24 = i21;
                if ((i2 & 3072) == 0) {
                    i25 = i24 | (x340Var.i(xu30Var6) ? 2048 : 1024);
                } else {
                    i25 = i24;
                }
            }
            i26 = i3 & 16384;
            if (i26 != 0) {
                i27 = i25;
                if ((i2 & 24576) == 0) {
                    i27 |= x340Var.i(xu30Var7) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar114 = cbx.a;
                                cua cuaVar114 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    } else {
                        if (i30 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 2) != 0) {
                            uvxVar4 = (uvx) x340Var.k(vvx.a);
                            i4 &= -113;
                        } else {
                            uvxVar4 = uvxVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i33 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 16) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            cr31VarB = uvxVar4.g;
                            if (cr31VarB == null) {
                                x340Var.i0(-564110884);
                                uwr uwrVar115 = cbx.a;
                                cua cuaVar115 = cbx.b(x340Var).f;
                                cr31VarB = er31.b(6.0f);
                                r11 = 0;
                            } else {
                                r11 = 0;
                                x340Var.i0(-564112031);
                            }
                            x340Var.r((boolean) r11);
                            ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                            i4 &= -458753;
                        }
                        if (i5 != 0) {
                            gbxVar3 = null;
                        }
                        if (i7 != 0) {
                            gbxVar4 = null;
                        }
                        if (i9 != 0) {
                            xu30Var16 = null;
                        } else {
                            xu30Var16 = xu30Var;
                        }
                        if (i11 != 0) {
                            xu30Var17 = null;
                        } else {
                            xu30Var17 = xu30Var2;
                        }
                        if (i13 != 0) {
                            xu30Var18 = null;
                        } else {
                            xu30Var18 = xu30Var3;
                        }
                        if (i16 != 0) {
                            xu30Var19 = null;
                        } else {
                            xu30Var19 = xu30Var4;
                        }
                        if (i19 != 0) {
                            xu30Var20 = null;
                        } else {
                            xu30Var20 = xu30Var5;
                        }
                        if (i23 != 0) {
                            xu30Var21 = null;
                        } else {
                            xu30Var21 = xu30Var6;
                        }
                        if (i26 != 0) {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = null;
                        } else {
                            xu30Var22 = xu30Var16;
                            ga80Var3 = ga80VarO;
                            idn0Var3 = idn0VarY;
                            z4 = z2;
                            xu30Var23 = xu30Var17;
                            gbxVar7 = gbxVar4;
                            xu30Var24 = xu30Var7;
                        }
                    }
                    x340Var.s();
                    hw61 hw61VarA13 = gto1.A(uvxVar4, null, x340Var, 2);
                    qim0 qim0Var17 = qim0Var4;
                    xu30 xu30Var21111115 = xu30Var22;
                    qim0 qim0VarB13 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                    uvx uvxVar17 = uvxVar4;
                    int i316 = i4;
                    xu30 xu30Var21111116 = xu30Var23;
                    xu30 xu30Var21111117 = xu30Var24;
                    xu30 xu30Var21111118 = xu30Var18;
                    xu30 xu30Var21111119 = xu30Var21;
                    xu30 xu30Var3114 = xu30Var19;
                    xu30 xu30Var3115 = xu30Var20;
                    cwl1.b(qim0VarB13, een.h, hw61VarA13, uvxVar17.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar17, xu30Var21111115, xu30Var21111116, xu30Var21111118, xu30Var3114, xu30Var3115, xu30Var21111119, xu30Var21111117, xu30Var8, (byte) 3), x340Var), x340Var, (i316 << 9) & 2147418112, ((i316 >> 21) & 14) | 48, 0);
                    uvxVar3 = uvxVar17;
                    maxVar3 = maxVar4;
                    z2 = z4;
                    idn0Var2 = idn0Var3;
                    ga80Var2 = ga80Var3;
                    gbxVar5 = gbxVar3;
                    gbxVar6 = gbxVar7;
                    xu30Var11 = xu30Var21111116;
                    xu30Var12 = xu30Var21111118;
                    xu30Var13 = xu30Var3114;
                    xu30Var9 = xu30Var3115;
                    xu30Var10 = xu30Var21111119;
                    xu30Var14 = xu30Var21111117;
                    xu30Var15 = xu30Var21111115;
                    qim0Var3 = qim0Var17;
                } else {
                    x340Var.b0();
                    xu30Var9 = xu30Var5;
                    xu30Var10 = xu30Var6;
                    qim0Var3 = qim0Var2;
                    uvxVar3 = uvxVar2;
                    ga80Var2 = ga80VarO;
                    maxVar3 = maxVar2;
                    gbxVar5 = gbxVar3;
                    xu30Var11 = xu30Var2;
                    xu30Var12 = xu30Var3;
                    xu30Var13 = xu30Var4;
                    xu30Var14 = xu30Var7;
                    gbxVar6 = gbxVar4;
                    idn0Var2 = idn0VarY;
                    xu30Var15 = xu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
                }
            }
            i27 = i25 | 24576;
            if ((i2 & 196608) == 0) {
                i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i30 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        uvxVar4 = (uvx) x340Var.k(vvx.a);
                        i4 &= -113;
                    } else {
                        uvxVar4 = uvxVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i33 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 16) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        cr31VarB = uvxVar4.g;
                        if (cr31VarB == null) {
                            x340Var.i0(-564110884);
                            uwr uwrVar116 = cbx.a;
                            cua cuaVar116 = cbx.b(x340Var).f;
                            cr31VarB = er31.b(6.0f);
                            r11 = 0;
                        } else {
                            r11 = 0;
                            x340Var.i0(-564112031);
                        }
                        x340Var.r((boolean) r11);
                        ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                        i4 &= -458753;
                    }
                    if (i5 != 0) {
                        gbxVar3 = null;
                    }
                    if (i7 != 0) {
                        gbxVar4 = null;
                    }
                    if (i9 != 0) {
                        xu30Var16 = null;
                    } else {
                        xu30Var16 = xu30Var;
                    }
                    if (i11 != 0) {
                        xu30Var17 = null;
                    } else {
                        xu30Var17 = xu30Var2;
                    }
                    if (i13 != 0) {
                        xu30Var18 = null;
                    } else {
                        xu30Var18 = xu30Var3;
                    }
                    if (i16 != 0) {
                        xu30Var19 = null;
                    } else {
                        xu30Var19 = xu30Var4;
                    }
                    if (i19 != 0) {
                        xu30Var20 = null;
                    } else {
                        xu30Var20 = xu30Var5;
                    }
                    if (i23 != 0) {
                        xu30Var21 = null;
                    } else {
                        xu30Var21 = xu30Var6;
                    }
                    if (i26 != 0) {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = null;
                    } else {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = xu30Var7;
                    }
                } else {
                    if (i30 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        uvxVar4 = (uvx) x340Var.k(vvx.a);
                        i4 &= -113;
                    } else {
                        uvxVar4 = uvxVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i33 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 16) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        cr31VarB = uvxVar4.g;
                        if (cr31VarB == null) {
                            x340Var.i0(-564110884);
                            uwr uwrVar117 = cbx.a;
                            cua cuaVar117 = cbx.b(x340Var).f;
                            cr31VarB = er31.b(6.0f);
                            r11 = 0;
                        } else {
                            r11 = 0;
                            x340Var.i0(-564112031);
                        }
                        x340Var.r((boolean) r11);
                        ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                        i4 &= -458753;
                    }
                    if (i5 != 0) {
                        gbxVar3 = null;
                    }
                    if (i7 != 0) {
                        gbxVar4 = null;
                    }
                    if (i9 != 0) {
                        xu30Var16 = null;
                    } else {
                        xu30Var16 = xu30Var;
                    }
                    if (i11 != 0) {
                        xu30Var17 = null;
                    } else {
                        xu30Var17 = xu30Var2;
                    }
                    if (i13 != 0) {
                        xu30Var18 = null;
                    } else {
                        xu30Var18 = xu30Var3;
                    }
                    if (i16 != 0) {
                        xu30Var19 = null;
                    } else {
                        xu30Var19 = xu30Var4;
                    }
                    if (i19 != 0) {
                        xu30Var20 = null;
                    } else {
                        xu30Var20 = xu30Var5;
                    }
                    if (i23 != 0) {
                        xu30Var21 = null;
                    } else {
                        xu30Var21 = xu30Var6;
                    }
                    if (i26 != 0) {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = null;
                    } else {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = xu30Var7;
                    }
                }
                x340Var.s();
                hw61 hw61VarA14 = gto1.A(uvxVar4, null, x340Var, 2);
                qim0 qim0Var18 = qim0Var4;
                xu30 xu30Var211111110 = xu30Var22;
                qim0 qim0VarB14 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                uvx uvxVar18 = uvxVar4;
                int i317 = i4;
                xu30 xu30Var211111111 = xu30Var23;
                xu30 xu30Var211111112 = xu30Var24;
                xu30 xu30Var211111113 = xu30Var18;
                xu30 xu30Var211111114 = xu30Var21;
                xu30 xu30Var3116 = xu30Var19;
                xu30 xu30Var3117 = xu30Var20;
                cwl1.b(qim0VarB14, een.h, hw61VarA14, uvxVar18.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar18, xu30Var211111110, xu30Var211111111, xu30Var211111113, xu30Var3116, xu30Var3117, xu30Var211111114, xu30Var211111112, xu30Var8, (byte) 3), x340Var), x340Var, (i317 << 9) & 2147418112, ((i317 >> 21) & 14) | 48, 0);
                uvxVar3 = uvxVar18;
                maxVar3 = maxVar4;
                z2 = z4;
                idn0Var2 = idn0Var3;
                ga80Var2 = ga80Var3;
                gbxVar5 = gbxVar3;
                gbxVar6 = gbxVar7;
                xu30Var11 = xu30Var211111111;
                xu30Var12 = xu30Var211111113;
                xu30Var13 = xu30Var3116;
                xu30Var9 = xu30Var3117;
                xu30Var10 = xu30Var211111114;
                xu30Var14 = xu30Var211111112;
                xu30Var15 = xu30Var211111110;
                qim0Var3 = qim0Var18;
            } else {
                x340Var.b0();
                xu30Var9 = xu30Var5;
                xu30Var10 = xu30Var6;
                qim0Var3 = qim0Var2;
                uvxVar3 = uvxVar2;
                ga80Var2 = ga80VarO;
                maxVar3 = maxVar2;
                gbxVar5 = gbxVar3;
                xu30Var11 = xu30Var2;
                xu30Var12 = xu30Var3;
                xu30Var13 = xu30Var4;
                xu30Var14 = xu30Var7;
                gbxVar6 = gbxVar4;
                idn0Var2 = idn0VarY;
                xu30Var15 = xu30Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
            }
        }
        i4 |= 805306368;
        i13 = i3 & 1024;
        if (i13 != 0) {
            i14 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (x340Var.i(xu30Var3)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i2 | i15;
        } else {
            i14 = i2;
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
            i14 |= 48;
        } else if ((i2 & 48) != 0) {
            if (x340Var.i(xu30Var4)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i14 |= i17;
        }
        i18 = i14;
        i19 = i3 & 4096;
        if (i19 != 0) {
            i21 = i18 | 384;
        } else {
            i20 = i18;
            if ((i2 & 384) != 0) {
                if (x340Var.i(xu30Var5)) {
                    i22 = 256;
                } else {
                    i22 = 128;
                }
                i20 |= i22;
            }
            i21 = i20;
        }
        i23 = i3 & 8192;
        if (i23 != 0) {
            i25 = i21 | 3072;
        } else {
            i24 = i21;
            if ((i2 & 3072) == 0) {
                i25 = i24 | (x340Var.i(xu30Var6) ? 2048 : 1024);
            } else {
                i25 = i24;
            }
        }
        i26 = i3 & 16384;
        if (i26 != 0) {
            i27 = i25;
            if ((i2 & 24576) == 0) {
                i27 |= x340Var.i(xu30Var7) ? 16384 : 8192;
            }
            if ((i2 & 196608) == 0) {
                i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i30 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        uvxVar4 = (uvx) x340Var.k(vvx.a);
                        i4 &= -113;
                    } else {
                        uvxVar4 = uvxVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i33 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 16) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        cr31VarB = uvxVar4.g;
                        if (cr31VarB == null) {
                            x340Var.i0(-564110884);
                            uwr uwrVar118 = cbx.a;
                            cua cuaVar118 = cbx.b(x340Var).f;
                            cr31VarB = er31.b(6.0f);
                            r11 = 0;
                        } else {
                            r11 = 0;
                            x340Var.i0(-564112031);
                        }
                        x340Var.r((boolean) r11);
                        ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                        i4 &= -458753;
                    }
                    if (i5 != 0) {
                        gbxVar3 = null;
                    }
                    if (i7 != 0) {
                        gbxVar4 = null;
                    }
                    if (i9 != 0) {
                        xu30Var16 = null;
                    } else {
                        xu30Var16 = xu30Var;
                    }
                    if (i11 != 0) {
                        xu30Var17 = null;
                    } else {
                        xu30Var17 = xu30Var2;
                    }
                    if (i13 != 0) {
                        xu30Var18 = null;
                    } else {
                        xu30Var18 = xu30Var3;
                    }
                    if (i16 != 0) {
                        xu30Var19 = null;
                    } else {
                        xu30Var19 = xu30Var4;
                    }
                    if (i19 != 0) {
                        xu30Var20 = null;
                    } else {
                        xu30Var20 = xu30Var5;
                    }
                    if (i23 != 0) {
                        xu30Var21 = null;
                    } else {
                        xu30Var21 = xu30Var6;
                    }
                    if (i26 != 0) {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = null;
                    } else {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = xu30Var7;
                    }
                } else {
                    if (i30 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        uvxVar4 = (uvx) x340Var.k(vvx.a);
                        i4 &= -113;
                    } else {
                        uvxVar4 = uvxVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i33 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 16) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        cr31VarB = uvxVar4.g;
                        if (cr31VarB == null) {
                            x340Var.i0(-564110884);
                            uwr uwrVar119 = cbx.a;
                            cua cuaVar119 = cbx.b(x340Var).f;
                            cr31VarB = er31.b(6.0f);
                            r11 = 0;
                        } else {
                            r11 = 0;
                            x340Var.i0(-564112031);
                        }
                        x340Var.r((boolean) r11);
                        ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                        i4 &= -458753;
                    }
                    if (i5 != 0) {
                        gbxVar3 = null;
                    }
                    if (i7 != 0) {
                        gbxVar4 = null;
                    }
                    if (i9 != 0) {
                        xu30Var16 = null;
                    } else {
                        xu30Var16 = xu30Var;
                    }
                    if (i11 != 0) {
                        xu30Var17 = null;
                    } else {
                        xu30Var17 = xu30Var2;
                    }
                    if (i13 != 0) {
                        xu30Var18 = null;
                    } else {
                        xu30Var18 = xu30Var3;
                    }
                    if (i16 != 0) {
                        xu30Var19 = null;
                    } else {
                        xu30Var19 = xu30Var4;
                    }
                    if (i19 != 0) {
                        xu30Var20 = null;
                    } else {
                        xu30Var20 = xu30Var5;
                    }
                    if (i23 != 0) {
                        xu30Var21 = null;
                    } else {
                        xu30Var21 = xu30Var6;
                    }
                    if (i26 != 0) {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = null;
                    } else {
                        xu30Var22 = xu30Var16;
                        ga80Var3 = ga80VarO;
                        idn0Var3 = idn0VarY;
                        z4 = z2;
                        xu30Var23 = xu30Var17;
                        gbxVar7 = gbxVar4;
                        xu30Var24 = xu30Var7;
                    }
                }
                x340Var.s();
                hw61 hw61VarA15 = gto1.A(uvxVar4, null, x340Var, 2);
                qim0 qim0Var19 = qim0Var4;
                xu30 xu30Var211111115 = xu30Var22;
                qim0 qim0VarB15 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
                uvx uvxVar19 = uvxVar4;
                int i318 = i4;
                xu30 xu30Var211111116 = xu30Var23;
                xu30 xu30Var211111117 = xu30Var24;
                xu30 xu30Var211111118 = xu30Var18;
                xu30 xu30Var211111119 = xu30Var21;
                xu30 xu30Var3118 = xu30Var19;
                xu30 xu30Var3119 = xu30Var20;
                cwl1.b(qim0VarB15, een.h, hw61VarA15, uvxVar19.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar19, xu30Var211111115, xu30Var211111116, xu30Var211111118, xu30Var3118, xu30Var3119, xu30Var211111119, xu30Var211111117, xu30Var8, (byte) 3), x340Var), x340Var, (i318 << 9) & 2147418112, ((i318 >> 21) & 14) | 48, 0);
                uvxVar3 = uvxVar19;
                maxVar3 = maxVar4;
                z2 = z4;
                idn0Var2 = idn0Var3;
                ga80Var2 = ga80Var3;
                gbxVar5 = gbxVar3;
                gbxVar6 = gbxVar7;
                xu30Var11 = xu30Var211111116;
                xu30Var12 = xu30Var211111118;
                xu30Var13 = xu30Var3118;
                xu30Var9 = xu30Var3119;
                xu30Var10 = xu30Var211111119;
                xu30Var14 = xu30Var211111117;
                xu30Var15 = xu30Var211111115;
                qim0Var3 = qim0Var19;
            } else {
                x340Var.b0();
                xu30Var9 = xu30Var5;
                xu30Var10 = xu30Var6;
                qim0Var3 = qim0Var2;
                uvxVar3 = uvxVar2;
                ga80Var2 = ga80VarO;
                maxVar3 = maxVar2;
                gbxVar5 = gbxVar3;
                xu30Var11 = xu30Var2;
                xu30Var12 = xu30Var3;
                xu30Var13 = xu30Var4;
                xu30Var14 = xu30Var7;
                gbxVar6 = gbxVar4;
                idn0Var2 = idn0VarY;
                xu30Var15 = xu30Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
            }
        }
        i27 = i25 | 24576;
        if ((i2 & 196608) == 0) {
            i27 |= x340Var.i(xu30Var8) ? 131072 : 65536;
        }
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (x340Var.Y(i4 & 1, z3)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i30 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 2) != 0) {
                    uvxVar4 = (uvx) x340Var.k(vvx.a);
                    i4 &= -113;
                } else {
                    uvxVar4 = uvxVar2;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                }
                if (i33 != 0) {
                    z2 = false;
                }
                if ((i3 & 16) != 0) {
                    idn0VarY = zso1.Y(x340Var);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    cr31VarB = uvxVar4.g;
                    if (cr31VarB == null) {
                        x340Var.i0(-564110884);
                        uwr uwrVar1110 = cbx.a;
                        cua cuaVar1110 = cbx.b(x340Var).f;
                        cr31VarB = er31.b(6.0f);
                        r11 = 0;
                    } else {
                        r11 = 0;
                        x340Var.i0(-564112031);
                    }
                    x340Var.r((boolean) r11);
                    ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                    i4 &= -458753;
                }
                if (i5 != 0) {
                    gbxVar3 = null;
                }
                if (i7 != 0) {
                    gbxVar4 = null;
                }
                if (i9 != 0) {
                    xu30Var16 = null;
                } else {
                    xu30Var16 = xu30Var;
                }
                if (i11 != 0) {
                    xu30Var17 = null;
                } else {
                    xu30Var17 = xu30Var2;
                }
                if (i13 != 0) {
                    xu30Var18 = null;
                } else {
                    xu30Var18 = xu30Var3;
                }
                if (i16 != 0) {
                    xu30Var19 = null;
                } else {
                    xu30Var19 = xu30Var4;
                }
                if (i19 != 0) {
                    xu30Var20 = null;
                } else {
                    xu30Var20 = xu30Var5;
                }
                if (i23 != 0) {
                    xu30Var21 = null;
                } else {
                    xu30Var21 = xu30Var6;
                }
                if (i26 != 0) {
                    xu30Var22 = xu30Var16;
                    ga80Var3 = ga80VarO;
                    idn0Var3 = idn0VarY;
                    z4 = z2;
                    xu30Var23 = xu30Var17;
                    gbxVar7 = gbxVar4;
                    xu30Var24 = null;
                } else {
                    xu30Var22 = xu30Var16;
                    ga80Var3 = ga80VarO;
                    idn0Var3 = idn0VarY;
                    z4 = z2;
                    xu30Var23 = xu30Var17;
                    gbxVar7 = gbxVar4;
                    xu30Var24 = xu30Var7;
                }
            } else {
                if (i30 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 2) != 0) {
                    uvxVar4 = (uvx) x340Var.k(vvx.a);
                    i4 &= -113;
                } else {
                    uvxVar4 = uvxVar2;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                }
                if (i33 != 0) {
                    z2 = false;
                }
                if ((i3 & 16) != 0) {
                    idn0VarY = zso1.Y(x340Var);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    cr31VarB = uvxVar4.g;
                    if (cr31VarB == null) {
                        x340Var.i0(-564110884);
                        uwr uwrVar1111 = cbx.a;
                        cua cuaVar1111 = cbx.b(x340Var).f;
                        cr31VarB = er31.b(6.0f);
                        r11 = 0;
                    } else {
                        r11 = 0;
                        x340Var.i0(-564112031);
                    }
                    x340Var.r((boolean) r11);
                    ga80VarO = vno1.o(cr31VarB, x340Var, r11);
                    i4 &= -458753;
                }
                if (i5 != 0) {
                    gbxVar3 = null;
                }
                if (i7 != 0) {
                    gbxVar4 = null;
                }
                if (i9 != 0) {
                    xu30Var16 = null;
                } else {
                    xu30Var16 = xu30Var;
                }
                if (i11 != 0) {
                    xu30Var17 = null;
                } else {
                    xu30Var17 = xu30Var2;
                }
                if (i13 != 0) {
                    xu30Var18 = null;
                } else {
                    xu30Var18 = xu30Var3;
                }
                if (i16 != 0) {
                    xu30Var19 = null;
                } else {
                    xu30Var19 = xu30Var4;
                }
                if (i19 != 0) {
                    xu30Var20 = null;
                } else {
                    xu30Var20 = xu30Var5;
                }
                if (i23 != 0) {
                    xu30Var21 = null;
                } else {
                    xu30Var21 = xu30Var6;
                }
                if (i26 != 0) {
                    xu30Var22 = xu30Var16;
                    ga80Var3 = ga80VarO;
                    idn0Var3 = idn0VarY;
                    z4 = z2;
                    xu30Var23 = xu30Var17;
                    gbxVar7 = gbxVar4;
                    xu30Var24 = null;
                } else {
                    xu30Var22 = xu30Var16;
                    ga80Var3 = ga80VarO;
                    idn0Var3 = idn0VarY;
                    z4 = z2;
                    xu30Var23 = xu30Var17;
                    gbxVar7 = gbxVar4;
                    xu30Var24 = xu30Var7;
                }
            }
            x340Var.s();
            hw61 hw61VarA16 = gto1.A(uvxVar4, null, x340Var, 2);
            qim0 qim0Var110 = qim0Var4;
            xu30 xu30Var2111111110 = xu30Var22;
            qim0 qim0VarB16 = u291.b(0.0f, gto1.y(x340Var, uvxVar4.c), 1, uyn1.w(qim0Var4, uvxVar4.e));
            uvx uvxVar110 = uvxVar4;
            int i319 = i4;
            xu30 xu30Var2111111111 = xu30Var23;
            xu30 xu30Var2111111112 = xu30Var24;
            xu30 xu30Var2111111113 = xu30Var18;
            xu30 xu30Var2111111114 = xu30Var21;
            xu30 xu30Var31110 = xu30Var19;
            xu30 xu30Var31111 = xu30Var20;
            cwl1.b(qim0VarB16, een.h, hw61VarA16, uvxVar110.b, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, z4, idn0Var3, ga80Var3, gbxVar3, gbxVar7, apo.r(-212785339, new e1c(uvxVar110, xu30Var2111111110, xu30Var2111111111, xu30Var2111111113, xu30Var31110, xu30Var31111, xu30Var2111111114, xu30Var2111111112, xu30Var8, (byte) 3), x340Var), x340Var, (i319 << 9) & 2147418112, ((i319 >> 21) & 14) | 48, 0);
            uvxVar3 = uvxVar110;
            maxVar3 = maxVar4;
            z2 = z4;
            idn0Var2 = idn0Var3;
            ga80Var2 = ga80Var3;
            gbxVar5 = gbxVar3;
            gbxVar6 = gbxVar7;
            xu30Var11 = xu30Var2111111111;
            xu30Var12 = xu30Var2111111113;
            xu30Var13 = xu30Var31110;
            xu30Var9 = xu30Var31111;
            xu30Var10 = xu30Var2111111114;
            xu30Var14 = xu30Var2111111112;
            xu30Var15 = xu30Var2111111110;
            qim0Var3 = qim0Var110;
        } else {
            x340Var.b0();
            xu30Var9 = xu30Var5;
            xu30Var10 = xu30Var6;
            qim0Var3 = qim0Var2;
            uvxVar3 = uvxVar2;
            ga80Var2 = ga80VarO;
            maxVar3 = maxVar2;
            gbxVar5 = gbxVar3;
            xu30Var11 = xu30Var2;
            xu30Var12 = xu30Var3;
            xu30Var13 = xu30Var4;
            xu30Var14 = xu30Var7;
            gbxVar6 = gbxVar4;
            idn0Var2 = idn0VarY;
            xu30Var15 = xu30Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mvx(qim0Var3, uvxVar3, maxVar3, z2, idn0Var2, ga80Var2, gbxVar5, gbxVar6, xu30Var15, xu30Var11, xu30Var12, xu30Var13, xu30Var9, xu30Var10, xu30Var14, xu30Var8, i, i2, i3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(uvx uvxVar, qim0 qim0Var, cw9 cw9Var, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, xu30 xu30Var8, b0k b0kVar, int i, int i2) throws Throwable {
        int i3;
        qim0 qim0Var2;
        cw9 cw9Var2;
        Throwable th;
        float fX;
        tvx tvxVar;
        qim0 qim0Var3;
        Throwable th2;
        int i4 = uvxVar.c;
        int i5 = uvxVar.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-225637013);
        int i6 = i | (b0kVar2.i(uvxVar) ? 4 : 2);
        int i7 = i6 | 48;
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i6 | 432;
        } else {
            i3 = i7 | (b0kVar2.i(cw9Var) ? 256 : 128);
        }
        int i9 = (b0kVar2.i(xu30Var7) ? 536870912 : 268435456) | i3 | (b0kVar2.i(xu30Var) ? 2048 : 1024) | (b0kVar2.i(xu30Var2) ? 16384 : 8192) | (b0kVar2.i(xu30Var3) ? 131072 : 65536) | (b0kVar2.i(xu30Var4) ? 1048576 : 524288) | (b0kVar2.i(xu30Var5) ? 8388608 : 4194304) | (b0kVar2.i(xu30Var6) ? 67108864 : 33554432);
        int i10 = b0kVar2.i(xu30Var8) ? 4 : 2;
        if (b0kVar2.Y(i9 & 1, ((i9 & 306783379) == 306783378 && (i10 & 3) == 2) ? false : true)) {
            cw9 cw9Var3 = i8 != 0 ? null : cw9Var;
            tvx tvxVarB = uvxVar.f;
            if (tvxVarB == null) {
                b0kVar2.i0(-2088785235);
                tvxVarB = gto1.B(i5, b0kVar2, i4);
                b0kVar2.r(false);
                th = null;
            } else {
                th = null;
                b0kVar2.i0(-2088786723);
                b0kVar2.r(false);
            }
            p3v p3vVar = uvxVar.i;
            if (p3vVar == null) {
                b0kVar2.i0(-2088782034);
                fX = gto1.x(i5, b0kVar2, i4);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-2088783491);
                b0kVar2.r(false);
                fX = p3vVar.a;
            }
            zzq0 zzq0VarP = uvxVar.d;
            if (zzq0VarP == null) {
                b0kVar2.i0(-2088777805);
                zzq0VarP = gto1.p(i5, b0kVar2, i4);
            } else {
                b0kVar2.i0(-2088779479);
            }
            b0kVar2.r(false);
            Throwable thB = cw9Var3 != null ? cw9Var3.c : th;
            if (thB == null) {
                thB = uvxVar.g;
            }
            if (thB == null) {
                b0kVar2.i0(-564110884);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar2).f;
                thB = er31.b(6.0f);
            } else {
                b0kVar2.i0(-564112031);
            }
            b0kVar2.r(false);
            boolean zI = b0kVar2.i(zzq0VarP) | b0kVar2.g(tvxVarB) | b0kVar2.i(cw9Var3);
            Object objT = b0kVar2.T();
            if (zI || objT == fkj0.X) {
                objT = new z2x(zzq0VarP, tvxVarB, cw9Var3, (byte) 2);
                b0kVar2.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var4);
            hzj.A.getClass();
            float f = fX;
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw th;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0Var, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            if (cw9Var3 != null) {
                long j = cw9Var3.a;
                tvxVar = tvxVarB;
                if (!z4h1.b(j, u7h.j)) {
                    b0kVar2.i0(-10004794);
                    qim0 qim0VarF = dug.f(t3k1.x(qim0Var4, fw31.a), j, thB);
                    uwr uwrVar2 = cbx.a;
                    afx afxVarA = cbx.a(b0kVar2);
                    idn0 idn0Var = cw9Var3.b;
                    if (idn0Var == null) {
                        th2 = thB;
                        qim0Var3 = qim0Var4;
                    } else {
                        Throwable th3 = thB;
                        qim0 qim0VarV = cwl1.v(qim0Var4, th3, ngx.e, afxVarA, idn0Var, false);
                        qim0Var3 = qim0Var4;
                        th2 = th3;
                        qim0VarF = qim0VarF.then(qim0VarV);
                    }
                    op71.g(b0kVar2, i1p1.q(qim0VarF, th2));
                    b0kVar2.r(false);
                }
                int i11 = i9 << 3;
                f(tvxVar, uvxVar, f, xu30Var, xu30Var2, xu30Var8, xu30Var3, xu30Var4, xu30Var5, u291.f(t3k1.x(qim0Var3, fw31.b), 1.0f), b0kVar2, (i11 & 234881024) | (i11 & 112) | (i9 & 7168) | (57344 & i9) | ((i10 << 15) & 458752) | (3670016 & i11) | (29360128 & i11));
                b0kVar2 = b0kVar2;
                qim0 qim0VarF2 = u291.f(t3k1.x(qim0Var3, fw31.c), 1.0f);
                uwr uwrVar3 = cbx.a;
                cwl1.d((i9 >> 24) & 14, 12, cbx.a(b0kVar2).b.a, (tl3) null, b0kVar2, xu30Var6, qim0VarF2, cbx.d(b0kVar2).g);
                cwl1.d((i9 >> 27) & 14, 12, cbx.a(b0kVar2).b.a, (tl3) null, b0kVar2, xu30Var7, u291.f(t3k1.x(qim0Var3, fw31.d), 1.0f), cbx.d(b0kVar2).g);
                b0kVar2.r(true);
                qim0Var2 = qim0Var3;
                cw9Var2 = cw9Var3;
            } else {
                tvxVar = tvxVarB;
            }
            qim0Var3 = qim0Var4;
            b0kVar2.i0(-9751090);
            b0kVar2.r(false);
            int i12 = i9 << 3;
            f(tvxVar, uvxVar, f, xu30Var, xu30Var2, xu30Var8, xu30Var3, xu30Var4, xu30Var5, u291.f(t3k1.x(qim0Var3, fw31.b), 1.0f), b0kVar2, (i12 & 234881024) | (i12 & 112) | (i9 & 7168) | (57344 & i9) | ((i10 << 15) & 458752) | (3670016 & i12) | (29360128 & i12));
            b0kVar2 = b0kVar2;
            qim0 qim0VarF3 = u291.f(t3k1.x(qim0Var3, fw31.c), 1.0f);
            uwr uwrVar4 = cbx.a;
            cwl1.d((i9 >> 24) & 14, 12, cbx.a(b0kVar2).b.a, (tl3) null, b0kVar2, xu30Var6, qim0VarF3, cbx.d(b0kVar2).g);
            cwl1.d((i9 >> 27) & 14, 12, cbx.a(b0kVar2).b.a, (tl3) null, b0kVar2, xu30Var7, u291.f(t3k1.x(qim0Var3, fw31.d), 1.0f), cbx.d(b0kVar2).g);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
            cw9Var2 = cw9Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            cw9Var2 = cw9Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ovx(uvxVar, qim0Var2, cw9Var2, xu30Var, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, xu30Var7, xu30Var8, i, i2);
        }
    }

    public static final void d(vnr0 vnr0Var, qim0 qim0Var, b0k b0kVar, int i) {
        Integer numValueOf;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(26338360);
        int i2 = (x340Var.i(vnr0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cjc0 cjc0VarC = vnr0Var.c.c();
            bf bfVarC = ef.c(x340Var);
            if (cjc0VarC instanceof cjc0) {
                numValueOf = Integer.valueOf(cjc0VarC.a);
            } else if (cjc0VarC instanceof zic0) {
                numValueOf = Integer.valueOf(bfVarC.c(((zic0) cjc0VarC).a));
            } else if (cjc0VarC instanceof ajc0) {
                numValueOf = (Integer) ((ajc0) cjc0VarC).a.invoke(bfVarC.a());
            } else {
                if (!u890.j(cjc0VarC, bjc0.a)) {
                    eg.o();
                    return;
                }
                numValueOf = null;
            }
            if (numValueOf == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vdp0(vnr0Var, qim0Var, i, (byte) 2);
                    return;
                }
                return;
            }
            int iIntValue = numValueOf.intValue();
            qim0 qim0VarZ = uyn1.z(0.0f, vnr0Var.c.b().b, 1, qim0Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ljc1.Y0;
                x340Var.s0(objT);
            }
            uwo1.e("", s161.a(qim0VarZ, (iu30) objT), vnr0Var.b, u7h.j, null, null, 0, false, new cjc0(iIntValue), iIntValue, null, x340Var, 3078, 0, 1264);
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new vdp0(vnr0Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void e(tvx tvxVar, int i, float f, xu30 xu30Var, xu30 xu30Var2, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0VarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1632811001);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(tvxVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(xu30Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(xu30Var2) ? 16384 : 8192;
        }
        int i4 = i3;
        if (!x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            x340Var.b0();
        } else if (xu30Var == null && xu30Var2 == null) {
            x340Var.i0(-1726265143);
            x340Var.r(false);
        } else {
            x340Var.i0(-1726803303);
            jw31 jw31VarA = ew31.a(new d36(tvxVar.b, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            gra graVar = een.h;
            cwl1.d((i4 >> 9) & 14, 58, 0L, graVar, x340Var, xu30Var, (qim0) null, (lee1) null);
            int iC = l1d.C(i);
            if (iC == 0) {
                qim0VarR = u291.r(nim0Var, f);
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                qim0VarR = u291.h(nim0Var, f);
            }
            cwl1.d((i4 >> 12) & 14, 56, 0L, graVar, x340Var, xu30Var2, qim0VarR, (lee1) null);
            x340Var.r(true);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pvx(tvxVar, i, f, xu30Var, xu30Var2, i2);
        }
    }

    public static final void f(tvx tvxVar, uvx uvxVar, float f, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, qim0 qim0Var, b0k b0kVar, int i) {
        tvx tvxVar2;
        int i2;
        float f2;
        xu30 xu30Var7;
        xu30 xu30Var8;
        xu30 xu30Var9;
        xu30 xu30Var10;
        xu30 xu30Var11;
        qim0 qim0Var2;
        int i3;
        int i4 = uvxVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-285427802);
        if ((i & 6) == 0) {
            tvxVar2 = tvxVar;
            i2 = (x340Var.g(tvxVar2) ? 4 : 2) | i;
        } else {
            tvxVar2 = tvxVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(uvxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f2 = f;
            i2 |= x340Var.d(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            xu30Var7 = xu30Var;
            i2 |= x340Var.i(xu30Var7) ? 2048 : 1024;
        } else {
            xu30Var7 = xu30Var;
        }
        if ((i & 24576) == 0) {
            xu30Var8 = xu30Var2;
            i2 |= x340Var.i(xu30Var8) ? 16384 : 8192;
        } else {
            xu30Var8 = xu30Var2;
        }
        if ((196608 & i) == 0) {
            xu30Var9 = xu30Var3;
            i2 |= x340Var.i(xu30Var9) ? 131072 : 65536;
        } else {
            xu30Var9 = xu30Var3;
        }
        if ((1572864 & i) == 0) {
            xu30Var10 = xu30Var4;
            i2 |= x340Var.i(xu30Var10) ? 1048576 : 524288;
        } else {
            xu30Var10 = xu30Var4;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(xu30Var5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            xu30Var11 = xu30Var6;
            i2 |= x340Var.i(xu30Var11) ? 67108864 : 33554432;
        } else {
            xu30Var11 = xu30Var6;
        }
        if ((805306368 & i) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.i(qim0Var2) ? 536870912 : 268435456;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            if (rvx.a[l1d.C(i4)] == 1) {
                x340Var.i0(856100078);
                af afVarA = ef.c(x340Var).a();
                int i5 = (afVarA.compareTo(af.i) > 0 || afVarA.compareTo(af.e) < 0) ? 1 : 2;
                x340Var.r(false);
                i3 = i5;
            } else {
                x340Var.i0(581813516);
                x340Var.r(false);
                i3 = i4;
            }
            if (i3 == 2) {
                x340Var.i0(856423811);
                h(tvxVar2, uvxVar, f2, xu30Var7, xu30Var8, xu30Var9, xu30Var10, xu30Var5, xu30Var11, qim0Var2, x340Var, i2 & 2147483646);
                x340Var.r(false);
            } else {
                x340Var.i0(856708546);
                l(tvxVar, uvxVar, f, xu30Var, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, qim0Var, x340Var, i2 & 2147483646);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qvx(tvxVar, uvxVar, f, xu30Var, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, qim0Var, i, (byte) 0);
        }
    }

    public static final void g(Function0 function0, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1140984632);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x74.f(function0, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-725204119, new x9g0(j2iVar2, j2iVar), x340Var), x340Var, i2 & 14, 48, 2046);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, function0, j2iVar, j2iVar2, qim0Var2, (byte) 16);
        }
    }

    public static final void h(tvx tvxVar, uvx uvxVar, float f, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        float f2;
        xu30 xu30Var7;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-111360060);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(tvxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(uvxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f2 = f;
            i2 |= x340Var.d(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            xu30Var7 = xu30Var2;
            i2 |= x340Var.i(xu30Var7) ? 16384 : 8192;
        } else {
            xu30Var7 = xu30Var2;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(xu30Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(xu30Var4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(xu30Var5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.i(xu30Var6) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            mbh mbhVarA = jbh.a(new d36(tvxVar.c, false, new g21(een.N0, (byte) 28)), een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            e(tvxVar, uvxVar.h, f2, xu30Var, xu30Var7, x340Var, i3 & 65422);
            int i4 = i3 >> 9;
            fq7.x(xu30Var3, tvxVar.a, u291.f(nim0.a, 1.0f), xu30Var4, xu30Var5, x340Var, ((i3 >> 15) & 14) | (i4 & 7168) | (i4 & 57344), 0);
            m(xu30Var6, x340Var, (i3 >> 24) & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qvx(tvxVar, uvxVar, f, xu30Var, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, qim0Var, i, (byte) 1);
        }
    }

    public static final void i(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-298336380);
        int i2 = i | 6;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uvx uvxVarB = uvx.b((uvx) b0kVar3.k(vvx.a), 1, (tvx) null, (p3v) null, 27);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            b(anm1.N("PersonalAppsEmpty", u291.f(qim0Var3, 1.0f)), uvxVarB, null, false, null, null, null, null, null, null, null, null, null, null, null, g7j.a, b0kVar2, 64, 196608, 32764);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var2, i, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void j(bss0 bss0Var, p40 p40Var, hz5 hz5Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-519801237);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(bss0Var) : x340Var.i(bss0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(p40Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(hz5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            qim0Var2 = nim0.a;
            k(bss0Var, apo.r(-1983092754, new wh(p40Var, iu30Var, (byte) 23), x340Var), apo.r(1193838620, new jyo0(hz5Var, function0, (byte) 29), x340Var), qim0Var2, x340Var, (i3 & 14) | 3456 | (i3 & 112) | ((i3 >> 6) & 57344));
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((byte) 14, i, bss0Var, p40Var, hz5Var, function0, iu30Var, qim0Var2, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(bss0 bss0Var, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1527929659);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(bss0Var) : x340Var.i(bss0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.e(5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (bss0Var instanceof zrs0) {
                x340Var.i0(-939155435);
                List list = ((zrs0) bss0Var).a;
                if (list.isEmpty()) {
                    x340Var.i0(950973142);
                    i(null, x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(951030430);
                    int i3 = 0;
                    for (Object obj : o7h.d1(list, 5)) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        vcl vclVar = (vcl) obj;
                        x340Var.f0(748717628, vclVar.a);
                        j2iVar.J(Integer.valueOf(i3), vclVar, x340Var, Integer.valueOf(i2 & 896));
                        x340Var.r(false);
                        i3 = i4;
                    }
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                if (bss0Var.equals(yrs0.a)) {
                    x340Var.i0(-939147966);
                    dv20.l((i2 >> 9) & 14, j2iVar2, x340Var, false);
                } else {
                    if (!bss0Var.equals(ass0.a)) {
                        throw p3d1.k(x340Var, -939156581, false);
                    }
                    x340Var.i0(-939146450);
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarN = anm1.N("PersonalAppsLoading", uyn1.x(qim0VarF, 16.0f));
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
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
                    xto1.e(null, 0, 0L, 0L, x340Var, 0, 15);
                    z = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z);
            }
            z = true;
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, bss0Var, j2iVar, j2iVar2, qim0Var, (byte) 29);
        }
    }

    public static final void l(tvx tvxVar, uvx uvxVar, float f, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        float f2;
        xu30 xu30Var7;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1100987585);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(tvxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(uvxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f2 = f;
            i2 |= x340Var.d(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            xu30Var7 = xu30Var2;
            i2 |= x340Var.i(xu30Var7) ? 16384 : 8192;
        } else {
            xu30Var7 = xu30Var2;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(xu30Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(xu30Var4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(xu30Var5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.i(xu30Var6) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(new d36(tvxVar.b, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            e(tvxVar, uvxVar.h, f2, xu30Var, xu30Var7, x340Var, i3 & 65422);
            int i4 = i3 >> 9;
            fq7.x(xu30Var3, tvxVar.a, new wnb0(1.0f, true), xu30Var4, xu30Var5, x340Var, ((i3 >> 15) & 14) | (i4 & 7168) | (i4 & 57344), 0);
            m(xu30Var6, x340Var, (i3 >> 24) & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qvx(tvxVar, uvxVar, f, xu30Var, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, qim0Var, i, (byte) 2);
        }
    }

    public static final void m(xu30 xu30Var, b0k b0kVar, int i) {
        int i2;
        xu30 xu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1410109259);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            xu30Var2 = xu30Var;
            cwl1.d(i2 & 14, 58, 0L, een.h, x340Var, xu30Var2, (qim0) null, (lee1) null);
        } else {
            xu30Var2 = xu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) xu30Var2, i, (byte) 24);
        }
    }

    public static final void n(iac0 iac0Var, w8c0 w8c0Var, w8c0 w8c0Var2) {
        w8c0 w8c0Var3 = w8c0.b;
        w8c0 w8c0Var4 = w8c0.a;
        if (w8c0Var == w8c0Var3 && w8c0Var2 == w8c0Var4) {
            throw new IllegalStateException(("State must be at least '" + w8c0.c + "' to be moved to '" + w8c0Var2 + "' in component " + iac0Var).toString());
        }
        if (w8c0Var != w8c0Var4 || w8c0Var == w8c0Var2) {
            return;
        }
        throw new IllegalStateException(("State is '" + w8c0Var4 + "' and cannot be moved to `" + w8c0Var2 + "` in component " + iac0Var).toString());
    }

    public static final w8c0 o(w8c0 w8c0Var, w8c0 w8c0Var2) {
        return (w8c0Var2 == null || w8c0Var2.compareTo(w8c0Var) >= 0) ? w8c0Var : w8c0Var2;
    }

    public static final void p(g1i g1iVar, pf01 pf01Var) {
        ArrayList arrayList = (ArrayList) g1iVar.f;
        g65 g65Var = new g65((byte) 0);
        jd11 jd11Var = rc11.a;
        g1iVar.k(g65Var, jd11Var.b(Uri.class));
        g1iVar.k(new g65((byte) 2), jd11Var.b(Integer.class));
        ((ArrayList) g1iVar.d).add(new mmr0(new q05((byte) 0), jd11Var.b(j2i1.class)));
        g1iVar.j(new j67((byte) 0), jd11Var.b(j2i1.class));
        g1iVar.j(new j67((byte) 3), jd11Var.b(j2i1.class));
        g1iVar.j(new j67((byte) 8), jd11Var.b(j2i1.class));
        g1iVar.j(new j67((byte) 5), jd11Var.b(Drawable.class));
        g1iVar.j(new hxa(), jd11Var.b(Bitmap.class));
        jc10 jc10Var = qw70.a;
        wy70 wy70Var = pf01Var.b;
        k261 k261VarA = l261.a(((Number) kto1.w(wy70Var.n, qw70.a)).intValue());
        if (Build.VERSION.SDK_INT >= 29 && ((Boolean) kto1.w(wy70Var.n, qw70.c)).booleanValue() && u890.j((um00) kto1.w(wy70Var.n, qw70.b), um00.a)) {
            arrayList.add(new f1i(new rrb1(k261VarA), (byte) 0));
        }
        arrayList.add(new f1i(new bxa(k261VarA, (um00) kto1.w(wy70Var.n, qw70.b)), (byte) 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void q(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a((RuntimeException) null, str);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static String s(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            t8e1.n("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                int i8 = i6;
                while (i8 < i3) {
                    byte b3 = byteBuffer.get(i8);
                    if (b3 < 0) {
                        break;
                    }
                    i8++;
                    cArr[i7] = (char) b3;
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.c();
                }
                i += 2;
                hso1.O(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.c();
                }
                int i9 = i + 2;
                i += 3;
                hso1.L(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.c();
                }
                byte b4 = byteBuffer.get(i6);
                int i10 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                hso1.J(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static final lku v(zy70 zy70Var, s2t s2tVar) {
        h180 h180Var = zy70Var.c;
        if (!(h180Var instanceof h180)) {
            return new ifl1(s2tVar, (byte) 27);
        }
        khk1 khk1VarW = eth.w(h180Var.b);
        synchronized (khk1VarW) {
            ihk1 ihk1Var = khk1VarW.b;
            if (ihk1Var != null) {
                Bitmap.Config[] configArr = aqi1.a;
                if (u890.j(Looper.myLooper(), Looper.getMainLooper()) && khk1VarW.e) {
                    khk1VarW.e = false;
                    ihk1Var.b = s2tVar;
                    return ihk1Var;
                }
            }
            faa0 faa0Var = khk1VarW.c;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            khk1VarW.c = null;
            ihk1 ihk1Var2 = new ihk1(khk1VarW.a, s2tVar);
            khk1VarW.b = ihk1Var2;
            return ihk1Var2;
        }
    }

    public static int w(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return ConnectivityType.UNKNOWN;
            case 10:
                return 100000;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return 16000;
            case grn1.d /* 12 */:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static boolean x(teb tebVar, qh31 qh31Var, ltn1 ltn1Var) {
        ltn1 ltn1Var2 = g0h1.e;
        m1h1 m1h1Var = (m1h1) tebVar.d;
        if ((m1h1Var.l0(qh31Var) && !m1h1Var.t(qh31Var)) || m1h1Var.K(qh31Var)) {
            return true;
        }
        tebVar.h();
        ArrayDeque arrayDeque = (ArrayDeque) tebVar.g;
        arrayDeque.getClass();
        bi91 bi91Var = (bi91) tebVar.h;
        bi91Var.getClass();
        arrayDeque.push(qh31Var);
        while (!arrayDeque.isEmpty()) {
            qh31 qh31Var2 = (qh31) arrayDeque.pop();
            qh31Var2.getClass();
            if (bi91Var.add(qh31Var2)) {
                ltn1 ltn1Var3 = m1h1Var.t(qh31Var2) ? ltn1Var2 : ltn1Var;
                if (ltn1Var3.equals(ltn1Var2)) {
                    ltn1Var3 = null;
                }
                if (ltn1Var3 == null) {
                    continue;
                } else {
                    Iterator it = m1h1Var.p(m1h1Var.q(qh31Var2)).iterator();
                    while (it.hasNext()) {
                        qh31 qh31VarD = ltn1Var3.D(tebVar, (e8b0) it.next());
                        if ((m1h1Var.l0(qh31VarD) && !m1h1Var.t(qh31VarD)) || m1h1Var.K(qh31VarD)) {
                            tebVar.e();
                            return true;
                        }
                        arrayDeque.add(qh31VarD);
                    }
                }
            }
        }
        tebVar.e();
        return false;
    }

    public static String y(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes(nne.a));
        return f46.r0(messageDigest.digest(), rq61.t, 30);
    }

    public static boolean z(teb tebVar, qh31 qh31Var, i0h1 i0h1Var) {
        m1h1 m1h1Var = (m1h1) tebVar.d;
        if (m1h1Var.k0(qh31Var)) {
            return true;
        }
        if (m1h1Var.t(qh31Var)) {
            return false;
        }
        if (tebVar.b) {
            m1h1Var.g0(qh31Var);
        }
        return m1h1Var.W(m1h1Var.q(qh31Var), i0h1Var);
    }

    public boolean A(int i, byte[] bArr, int i2) {
        return D(i, bArr, i2) == 0;
    }

    public int D(int i, byte[] bArr, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return toi1.d(i3, bArr, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return toi1.d(i3, bArr, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public String r(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            t8e1.n("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!hso1.g(b)) {
                break;
            }
            i++;
            hso1.e(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (hso1.g(b2)) {
                int i7 = i5 + 1;
                hso1.e(b2, cArr, i5);
                int i8 = i6;
                while (i8 < i3) {
                    byte b3 = bArr[i8];
                    if (!hso1.g(b3)) {
                        break;
                    }
                    i8++;
                    hso1.e(b3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else {
                if (!(b2 < -32)) {
                    if (b2 < -16) {
                        if (i6 >= i3 - 1) {
                            throw InvalidProtocolBufferException.c();
                        }
                        int i9 = i + 2;
                        i += 3;
                        hso1.L(b2, bArr[i6], bArr[i9], cArr, i5);
                        i5++;
                    } else {
                        if (i6 >= i3 - 2) {
                            throw InvalidProtocolBufferException.c();
                        }
                        byte b4 = bArr[i6];
                        int i10 = i + 3;
                        byte b5 = bArr[i + 2];
                        i += 4;
                        hso1.J(b2, b4, b5, bArr[i10], cArr, i5);
                        i5 += 2;
                    }
                } else {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i += 2;
                    hso1.O(b2, bArr[i6], cArr, i5);
                    i5++;
                }
            }
        }
        return new String(cArr, 0, i5);
    }

    public String t(ByteBuffer byteBuffer, int i, int i2) {
        return s(byteBuffer, i, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.moi1 */
    public int u(String str, byte[] bArr, int i, int i2) throws moi1 {
        int i3;
        int i4;
        char cCharAt;
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new moi1(i6, length);
                        }
                        hhg1.d(cCharAt2, i7);
                        return 0;
                    }
                    int i9 = i6 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new moi1(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }
}
