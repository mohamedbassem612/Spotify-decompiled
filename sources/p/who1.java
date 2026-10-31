package p;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.stream.IntStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class who1 {
    public static final lge1 a = new lge1(0, new long[0], new Object[0]);
    public static b180 b;

    public static final Integer A(String str) {
        try {
            String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                return Integer.valueOf(Color.parseColor(str2));
            }
            return null;
        } catch (Exception e) {
            Logger.e(e, "Error parsing color - ".concat(str), new Object[0]);
            return null;
        }
    }

    public static boolean B(byte b2) {
        return b2 > -65;
    }

    public static final void a(i2c i2cVar, boolean z, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        h311 h311VarV;
        oh6 oh6Var;
        boolean z2 = z;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-372651485);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z2) ? 32 : 16;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    oh6Var = new oh6(i2cVar, z2, i, (byte) 0);
                }
            } else {
                Object objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    ilv.a.getClass();
                    ceo ceoVar = flv.e;
                    pxg1 pxg1VarO0 = irn1.o0(1500, 0, ceoVar, 2);
                    tzg1 tzg1Var = rno1.a;
                    objT2 = mqo1.s(new hsi1("artistCardsCircleGlowIn", fValueOf2, fValueOf, pxg1VarO0, tzg1Var), new hsi1("artistCardsCircleGlowOut", fValueOf, fValueOf2, irn1.o0(1500, 0, ceoVar, 2), tzg1Var));
                    b0kVar3.s0(objT2);
                }
                c380 c380Var = (c380) objT2;
                Object objT3 = b0kVar3.T();
                if (objT3 == m4cVar) {
                    objT3 = new ma0(ven0Var, (byte) 21);
                    b0kVar3.s0(objT3);
                }
                b0kVar2 = b0kVar3;
                z2 = z;
                ven0 ven0VarP = zod.P(c380Var, z2, (String) null, (Function0) null, (Function0) objT3, b0kVar2, 24584 | (i3 & 112), 12);
                qim0 qim0VarB = i2cVar.b(nim0.a);
                boolean zG = b0kVar2.g(ven0VarP);
                Object objT4 = b0kVar2.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new lq2(ven0VarP, (byte) 7);
                    b0kVar2.s0(objT4);
                }
                qim0 qim0VarC = i541.C(qim0VarB, (iu30) objT4);
                Object objT5 = b0kVar2.T();
                if (objT5 == m4cVar) {
                    objT5 = ag6.h;
                    b0kVar2.s0(objT5);
                }
                t1c.a(exd0.r(qim0VarC, (iu30) objT5), b0kVar2, 0);
            }
            h311VarV.d = oh6Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            oh6Var = new oh6(i2cVar, z2, i, (byte) 1);
            h311VarV.d = oh6Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0144  */
    /* JADX WARN: Code duplicated, block: B:104:0x0151  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    public static final void b(long j, float f, qim0 qim0Var, float f2, long j2, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        float f3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        long j3;
        float f4;
        boolean z4;
        h311 h311VarV;
        long j4;
        int i6;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean zF;
        Object objT;
        long j5;
        float f5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-856566370);
        if ((i & 6) == 0) {
            i3 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.d(2.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                f3 = f2;
                i3 |= x340Var.d(f3) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i7 != 0) {
                            f3 = 16.0f;
                        }
                        uwr uwrVar = cbx.a;
                        j4 = cbx.a(x340Var).a.c;
                        i6 = i3 & (-458753);
                        if (i4 != 0) {
                            z2 = false;
                        }
                    } else {
                        x340Var.b0();
                        i6 = i3 & (-458753);
                        j4 = j2;
                    }
                    x340Var.s();
                    if ((57344 & i6) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i6 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z9 = z5 | z6;
                    if ((3670016 & i6) == 1048576) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z10 = z9 | z7;
                    if ((i6 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zF = z10 | z8 | ((i6 & 112) == 32) | x340Var.f(j4);
                    objT = x340Var.T();
                    if (!zF || objT == fkj0.X) {
                        j5 = j4;
                        f5 = f3;
                        zym zymVar = new zym(f5, z2, j, f, j5);
                        x340Var.s0(zymVar);
                        objT = zymVar;
                    } else {
                        j5 = j4;
                        f5 = f3;
                    }
                    j0o1.b((i6 >> 9) & 14, x340Var, (iu30) objT, qim0Var);
                    f4 = f5;
                    j3 = j5;
                } else {
                    x340Var.b0();
                    j3 = j2;
                    f4 = f3;
                }
                z4 = z2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new azm(j, f, qim0Var, f4, j3, z4, i, i2);
                }
            }
            i3 |= 1572864;
            z2 = z;
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        f3 = 16.0f;
                    }
                    uwr uwrVar2 = cbx.a;
                    j4 = cbx.a(x340Var).a.c;
                    i6 = i3 & (-458753);
                    if (i4 != 0) {
                        z2 = false;
                    }
                } else {
                    if (i7 != 0) {
                        f3 = 16.0f;
                    }
                    uwr uwrVar3 = cbx.a;
                    j4 = cbx.a(x340Var).a.c;
                    i6 = i3 & (-458753);
                    if (i4 != 0) {
                        z2 = false;
                    }
                }
                x340Var.s();
                if ((57344 & i6) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i6 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z11 = z5 | z6;
                if ((3670016 & i6) == 1048576) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z12 = z11 | z7;
                if ((i6 & 14) == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zF = z12 | z8 | ((i6 & 112) == 32) | x340Var.f(j4);
                objT = x340Var.T();
                if (zF) {
                    j5 = j4;
                    f5 = f3;
                    zym zymVar2 = new zym(f5, z2, j, f, j5);
                    x340Var.s0(zymVar2);
                    objT = zymVar2;
                } else {
                    j5 = j4;
                    f5 = f3;
                    zym zymVar3 = new zym(f5, z2, j, f, j5);
                    x340Var.s0(zymVar3);
                    objT = zymVar3;
                }
                j0o1.b((i6 >> 9) & 14, x340Var, (iu30) objT, qim0Var);
                f4 = f5;
                j3 = j5;
            } else {
                x340Var.b0();
                j3 = j2;
                f4 = f3;
            }
            z4 = z2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new azm(j, f, qim0Var, f4, j3, z4, i, i2);
            }
        }
        i3 |= 24576;
        f3 = f2;
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        f3 = 16.0f;
                    }
                    uwr uwrVar4 = cbx.a;
                    j4 = cbx.a(x340Var).a.c;
                    i6 = i3 & (-458753);
                    if (i4 != 0) {
                        z2 = false;
                    }
                } else {
                    if (i7 != 0) {
                        f3 = 16.0f;
                    }
                    uwr uwrVar5 = cbx.a;
                    j4 = cbx.a(x340Var).a.c;
                    i6 = i3 & (-458753);
                    if (i4 != 0) {
                        z2 = false;
                    }
                }
                x340Var.s();
                if ((57344 & i6) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i6 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z13 = z5 | z6;
                if ((3670016 & i6) == 1048576) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z14 = z13 | z7;
                if ((i6 & 14) == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zF = z14 | z8 | ((i6 & 112) == 32) | x340Var.f(j4);
                objT = x340Var.T();
                if (zF) {
                    j5 = j4;
                    f5 = f3;
                    zym zymVar4 = new zym(f5, z2, j, f, j5);
                    x340Var.s0(zymVar4);
                    objT = zymVar4;
                } else {
                    j5 = j4;
                    f5 = f3;
                    zym zymVar5 = new zym(f5, z2, j, f, j5);
                    x340Var.s0(zymVar5);
                    objT = zymVar5;
                }
                j0o1.b((i6 >> 9) & 14, x340Var, (iu30) objT, qim0Var);
                f4 = f5;
                j3 = j5;
            } else {
                x340Var.b0();
                j3 = j2;
                f4 = f3;
            }
            z4 = z2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new azm(j, f, qim0Var, f4, j3, z4, i, i2);
            }
        }
        i3 |= 1572864;
        z2 = z;
        if ((i3 & 599187) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    f3 = 16.0f;
                }
                uwr uwrVar6 = cbx.a;
                j4 = cbx.a(x340Var).a.c;
                i6 = i3 & (-458753);
                if (i4 != 0) {
                    z2 = false;
                }
            } else {
                if (i7 != 0) {
                    f3 = 16.0f;
                }
                uwr uwrVar7 = cbx.a;
                j4 = cbx.a(x340Var).a.c;
                i6 = i3 & (-458753);
                if (i4 != 0) {
                    z2 = false;
                }
            }
            x340Var.s();
            if ((57344 & i6) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i6 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z15 = z5 | z6;
            if ((3670016 & i6) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z16 = z15 | z7;
            if ((i6 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            zF = z16 | z8 | ((i6 & 112) == 32) | x340Var.f(j4);
            objT = x340Var.T();
            if (zF) {
                j5 = j4;
                f5 = f3;
                zym zymVar6 = new zym(f5, z2, j, f, j5);
                x340Var.s0(zymVar6);
                objT = zymVar6;
            } else {
                j5 = j4;
                f5 = f3;
                zym zymVar7 = new zym(f5, z2, j, f, j5);
                x340Var.s0(zymVar7);
                objT = zymVar7;
            }
            j0o1.b((i6 >> 9) & 14, x340Var, (iu30) objT, qim0Var);
            f4 = f5;
            j3 = j5;
        } else {
            x340Var.b0();
            j3 = j2;
            f4 = f3;
        }
        z4 = z2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new azm(j, f, qim0Var, f4, j3, z4, i, i2);
        }
    }

    public static final void c(long j, float f, iu30 iu30Var, qim0 qim0Var, float f2, boolean z, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        float f3;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1011243405);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.d(2.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= b0kVar3.h(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= b0kVar3.i(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= b0kVar3.i(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= b0kVar3.i(function2) ? 536870912 : 268435456;
        }
        if (b0kVar3.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            ven0 ven0VarS2 = v8r.s(function0, b0kVar3);
            ven0 ven0VarS3 = v8r.s(function1, b0kVar3);
            ven0 ven0VarS4 = v8r.s(function2, b0kVar3);
            boolean zG = b0kVar3.g(ven0VarS2);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new p6b(ven0VarS2, (byte) 3);
                b0kVar3.s0(objT);
            }
            rih1 rih1Var = rih1.a;
            qim0 qim0VarB = f8d1.b(qim0Var, rih1Var, (PointerInputEventHandler) objT);
            boolean zG2 = b0kVar3.g(ven0VarS3) | b0kVar3.g(ven0VarS4) | b0kVar3.g(ven0VarS);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                mhg mhgVar = new mhg(ven0VarS3, ven0VarS4, ven0VarS, false, (byte) 1);
                b0kVar3.s0(mhgVar);
                objT2 = mhgVar;
            }
            b0kVar2 = b0kVar3;
            b(j, f, f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT2), 16.0f, 0L, z, b0kVar2, (i3 & 1022) | ((i3 >> 3) & 57344) | (i3 & 3670016), 32);
            f3 = 16.0f;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            f3 = f2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new czm(j, f, iu30Var, qim0Var, f3, z, function0, function1, function2, i);
        }
    }

    public static final void d(String str, qim0 qim0Var, qim0 qim0Var2, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1057073096);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0VarN = anm1.N("explore_premium_button", qim0Var);
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(b0kVar3);
            String strO0 = cwl1.o0(b0kVar3, 2131960340);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strO0), function0), idxVar, qim0VarN, null, gdxVarR, null, null, null, null, null, apo.r(-827317095, new ps00(str), b0kVar3), b0kVar2, 0, 48, 2008);
                qim0Var3 = nim0.a;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, str, qim0Var, qim0Var3, function0, (byte) 25);
        }
    }

    public static final void e(k460 k460Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1741989626);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(k460Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            nyx.a(2, (wux) null, apo.r(685491853, new jj50(k460Var, function0), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(k460Var, function0, qim0Var2, i, (byte) 25);
        }
    }

    public static final void f(float f, int i, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(729691644);
        int i2 = (x340Var.d(f) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            float fM = dsa0.m(x340Var, 2131166455);
            float fM2 = dsa0.m(x340Var, 2131166454);
            float fM3 = dsa0.m(x340Var, 2131166459);
            float fM4 = dsa0.m(x340Var, 2131166458);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.v(nim0Var, f), 0.0f, 0.0f, 0.0f, fM, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cbx.a.getClass();
            l(d7e.r(uwr.d().a, qim0VarF, false), er31.b(fM4), x340Var, 0, 0);
            op71.g(x340Var, u291.h(nim0Var, fM2));
            m(0.5f, 6, x340Var);
            m(0.8f, 6, x340Var);
            x0d.s(nim0Var, fM3, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n5h((byte) 5, f, i);
        }
    }

    public static final void g(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1536031096);
        j06 j06Var = x340Var.a;
        int i4 = i2 | (x340Var.e(i) ? 4 : 2) | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            float fM = dsa0.m(x340Var, 2131166942);
            float fM2 = dsa0.m(x340Var, 2131166457);
            float fM3 = dsa0.m(x340Var, 2131166456);
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.c, d4o1.a);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarZ = uyn1.z(fM, 0.0f, 2, qim0Var2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
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
            j2iVar.invoke(x340Var, 6);
            x340Var.r(true);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zdh0.N0;
                x340Var.s0(objT);
            }
            i3 = i;
            w2g0.c(s161.a(qim0Var2, (iu30) objT), (tl3) null, apo.r(609177172, new deh0(fM3, fM, fM2, i3), x340Var), x340Var, 3072, 6);
            x340Var.r(true);
        } else {
            i3 = i;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3f(i3, j2iVar, qim0Var2, i2);
        }
    }

    public static final void h(qim0 qim0Var, j2i j2iVar, gfh0 gfh0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1663319424);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i | (x340Var.g(gfh0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Integer.hashCode(tgp1.k(x340Var));
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            xos0 xos0VarM = x340Var.m();
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
            hzj.A.getClass();
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            pv40 pv40Var = new pv40((byte) 12);
            if (x340Var.S) {
                x340Var.b(rih1.a, new dpb0(pv40Var, (byte) 1));
            }
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qg(qim0Var, j2iVar, gfh0Var, i, (byte) 5);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(355632639);
        int i2 = i | (b0kVar2.i(function0) ? 4 : 2) | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
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
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0Var2 = qim0Var3;
            uwo1.e(ydh.g(8.0f, 2131959162, b0kVar2, b0kVar2, qim0Var3), u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            uwo1.e(ydh.g(8.0f, 2131959160, b0kVar2, b0kVar2, qim0Var2), u291.f(qim0Var2, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(qim0Var2, 16.0f));
            idx idxVar = new idx(4);
            String strO0 = cwl1.o0(b0kVar2, 2131959161);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            y50 y50Var = new y50(strO0);
            function1 = function0;
            foo1.c(new gbx(y50Var, function1), idxVar, null, jax.a, null, null, null, null, null, null, b4j.a, b0kVar2, 0, 48, 2028);
            b0kVar2 = b0kVar2;
            x0d.s(qim0Var2, cbx.b(b0kVar2).b.e, b0kVar2, true);
        } else {
            function1 = function0;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function1, qim0Var2, i, (byte) 14);
        }
    }

    public static final void j(String str, Uri uri, long j, String str2, Function0 function0, b0k b0kVar, int i, int i2) {
        String str3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1397496978);
        int i3 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.g(uri) ? 32 : 16) | (b0kVar3.f(j) ? 256 : 128);
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                str3 = str2;
                int i4 = b0kVar3.g(str3) ? 2048 : 1024;
                i3 |= i4;
            } else {
                str3 = str2;
            }
            i3 |= i4;
        } else {
            str3 = str2;
        }
        int i5 = i3 | (b0kVar3.i(function0) ? 16384 : 8192);
        if (b0kVar3.Y(i5 & 1, (i5 & 9363) != 9362)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
                i5 &= -7169;
                str3 = str;
            }
            b0kVar3.s();
            boolean z = (i5 & 57344) == 16384;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new isr0(function0, (byte) 0);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(null, null, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, apo.r(-1394864361, new neg0(uri, str3, j, (byte) 1), b0kVar3), null, r5j.b, null, null, null, apo.r(1215052210, new qdg0(str, (byte) 21), b0kVar3), b0kVar2, 805306368, 196656, 30143);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        String str4 = str3;
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jsr0(str, uri, j, str4, function0, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void k(oho1 oho1Var, a3z0 a3z0Var, zja1 zja1Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        ?? r1;
        hax haxVar;
        zja1 zja1Var2 = zja1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-41544768);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(oho1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(a3z0Var) : x340Var.i(a3z0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(zja1Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            klz0 klz0Var = (klz0) x340Var.k(llz0.a);
            aka1 aka1Var = (aka1) x340Var.k(bka1.a);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(x340Var).b.b, 1, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            int i3 = i2 & 57344;
            boolean z2 = i3 == 16384;
            Object objT = x340Var.T();
            Object obj = objT;
            if (z2 || objT == m4cVar) {
                ccy0 ccy0Var = new ccy0(iu30Var, (byte) 26);
                x340Var.s0(ccy0Var);
                obj = ccy0Var;
            }
            z50 z50Var = z50.c;
            wro1.h(new gbx(z50Var, (Function0) obj), new idx(2), null, null, yla.r(x340Var), null, false, null, null, apo.r(843011451, new e3z0(oho1Var, (byte) 0), x340Var), x340Var, 0, 6, 988);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            boolean z3 = i3 == 16384;
            Object objT2 = x340Var.T();
            Object obj2 = objT2;
            if (z3 || objT2 == m4cVar) {
                ccy0 ccy0Var2 = new ccy0(iu30Var, (byte) 27);
                x340Var.s0(ccy0Var2);
                obj2 = ccy0Var2;
            }
            wro1.h(new gbx(z50Var, (Function0) obj2), new idx(2), null, null, yla.r(x340Var), null, false, null, null, apo.r(-818605070, new e3z0(oho1Var, (byte) 1), x340Var), x340Var, 0, 6, 988);
            x340 x340Var2 = x340Var;
            if (z) {
                x340Var2.i0(87338978);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.r(nim0Var, 8.0f));
                boolean z4 = i3 == 16384;
                Object objT3 = x340Var2.T();
                Object obj3 = objT3;
                if (z4 || objT3 == m4cVar) {
                    ccy0 ccy0Var3 = new ccy0(iu30Var, (byte) 28);
                    x340Var2.s0(ccy0Var3);
                    obj3 = ccy0Var3;
                }
                wro1.h(new gbx(z50Var, (Function0) obj3), ldx.c, null, null, yla.r(x340Var2), null, false, null, null, uaj.a, x340Var2, 0, 6, 988);
                x340Var2 = x340Var2;
                r1 = 0;
                x340Var2.r(false);
            } else {
                r1 = 0;
                x340Var2.i0(87950174);
                x340Var2.r(false);
            }
            kk0.s(1.0f, true, x340Var2);
            if (a3z0Var instanceof z2z0) {
                x340Var2.i0(88096773);
                zja1Var2 = zja1Var;
                ?? r4 = (x340Var2.i(zja1Var2) ? 1 : 0) | (x340Var2.i(aka1Var) ? 1 : 0) | (i3 == 16384 ? 1 : r1);
                Object objT4 = x340Var2.T();
                Object obj4 = objT4;
                if (r4 != 0 || objT4 == m4cVar) {
                    f3z0 f3z0Var = new f3z0(zja1Var2, aka1Var, iu30Var, (byte) r1);
                    x340Var2.s0(f3z0Var);
                    obj4 = f3z0Var;
                }
                x340 x340Var3 = x340Var2;
                foo1.c(new gbx(z50Var, (Function0) obj4), lzj.d(klz0Var.a), null, null, yla.r(x340Var2), null, null, null, null, null, apo.r(189550043, new dae0(klz0Var, (byte) 5), x340Var2), x340Var3, 0, 48, 2012);
                x340Var = x340Var3;
                x340Var.r((boolean) r1);
            } else {
                zja1Var2 = zja1Var;
                if (!(a3z0Var instanceof y2z0)) {
                    throw p3d1.k(x340Var2, 1803955547, (boolean) r1);
                }
                x340Var2.i0(88625199);
                ?? r5 = (x340Var2.i(zja1Var2) ? 1 : 0) | (x340Var2.i(aka1Var) ? 1 : 0) | (i3 == 16384 ? 1 : r1);
                Object objT5 = x340Var2.T();
                Object obj5 = objT5;
                if (r5 != 0 || objT5 == m4cVar) {
                    f3z0 f3z0Var2 = new f3z0(zja1Var2, aka1Var, iu30Var, (byte) 1);
                    x340Var2.s0(f3z0Var2);
                    obj5 = f3z0Var2;
                }
                gbx gbxVar = new gbx(z50Var, (Function0) obj5);
                gdx gdxVarR = yla.r(x340Var2);
                hdx hdxVarD = lzj.d(klz0Var.a);
                boolean z5 = ((y2z0) a3z0Var).a;
                if (z5) {
                    x340Var2.i0(88998625);
                    haxVar = new hax(cwl1.o0(x340Var2, 2131959044));
                    x340Var2.r((boolean) r1);
                } else {
                    x340Var2.i0(89187756);
                    x340Var2.r((boolean) r1);
                    haxVar = jax.a;
                }
                j2i j2iVar = z5 ? uaj.b : null;
                x340 x340Var4 = x340Var2;
                foo1.c(gbxVar, hdxVarD, null, haxVar, gdxVarR, null, null, null, j2iVar, null, apo.r(830414084, new dae0(klz0Var, (byte) 6), x340Var2), x340Var4, 0, 48, 1484);
                x340Var = x340Var4;
                x340Var.r((boolean) r1);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(oho1Var, a3z0Var, zja1Var2, z, iu30Var, i, (byte) 4);
        }
    }

    public static final void l(qim0 qim0Var, cr31 cr31Var, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(820770286);
        int i3 = (x340Var.i(qim0Var) ? 4 : 2) | i | (((i2 & 2) == 0 && x340Var.g(cr31Var)) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            } else if ((i2 & 2) != 0) {
                cr31Var = er31.b(dsa0.m(x340Var, 2131166458));
            }
            x340Var.s();
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0Var, cbx.a(x340Var).a.b.a(), cr31Var), cbx.a(x340Var).a.b.a(), cr31Var, 12), x340Var, 0);
        } else {
            x340Var.b0();
        }
        cr31 cr31Var2 = cr31Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(qim0Var, cr31Var2, i, i2, (byte) 12);
        }
    }

    public static final void m(float f, int i, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(597460420);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            float fM = dsa0.m(x340Var, 2131166460);
            float fM2 = dsa0.m(x340Var, 2131166461);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(nim0Var, f), fM);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            l(u291.h(u291.f(nim0Var, 1.0f), fM2), null, x340Var, 0, 2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n5h((byte) 6, f, i);
        }
    }

    public static final af5 n(String str, boolean z) {
        if (!z) {
            return new af5(str);
        }
        ye5 ye5Var = new ye5();
        z6p1.r(ye5Var, "subtitle_icon", "[icon]");
        ye5Var.g("\u2004");
        ye5Var.g(str);
        return ye5Var.p();
    }

    public static IntStream o(CharSequence charSequence) {
        return charSequence.chars();
    }

    public static IntStream p(CharSequence charSequence) {
        return charSequence.codePoints();
    }

    public static final j2i q(List list) {
        return new j2i(1271844412, new w9(list, (byte) 10), true);
    }

    public static final long r(long j) {
        return z4p1.h(u7h.g(j) * 0.9f, u7h.f(j) * 0.9f, u7h.d(j) * 0.9f, u7h.c(j), 16);
    }

    public static final b180 s() {
        b180 b180Var = b;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.MoreAndroid16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(8.0f, 3.0f);
        cwh0VarG.c(1.5f, 1.5f, true, true, 0.0f, -3.0f);
        cwh0VarG.c(1.5f, 1.5f, false, true, 0.0f, 3.0f);
        cwh0VarG.m(0.0f, 6.5f);
        cwh0VarG.c(1.5f, 1.5f, true, true, 0.0f, -3.0f);
        cwh0VarG.c(1.5f, 1.5f, false, true, 0.0f, 3.0f);
        cwh0VarG.l(8.0f, 16.0f);
        cwh0VarG.c(1.5f, 1.5f, true, true, 0.0f, -3.0f);
        cwh0VarG.c(1.5f, 1.5f, false, true, 0.0f, 3.0f);
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        b = b180VarB;
        return b180VarB;
    }

    public static final String t(u8e u8eVar) {
        if (u8eVar instanceof s8e) {
            return l1d.m("preference:", ((s8e) u8eVar).a.b);
        }
        if (u8eVar instanceof r8e) {
            return l1d.m("group:", ((r8e) u8eVar).a.b);
        }
        if (u8eVar instanceof t8e) {
            return "show";
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(String str, lnm lnmVar, gw70 gw70Var) throws Exception {
        h8c1 h8c1Var;
        if (lnmVar instanceof h8c1) {
            h8c1Var = (h8c1) lnmVar;
            int i = h8c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h8c1Var.c = i - Integer.MIN_VALUE;
            } else {
                h8c1Var = new h8c1(lnmVar);
            }
        } else {
            h8c1Var = new h8c1(lnmVar);
        }
        Object objJ = h8c1Var.b;
        int i2 = h8c1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleI = gw70Var.f(str).i();
                h8c1Var.a = str;
                h8c1Var.c = 1;
                objJ = fc11.j(singleI, h8c1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = h8c1Var.a;
                hm5.M(objJ);
            }
            Bitmap bitmap = (Bitmap) objJ;
            bitmap.getClass();
            return bitmap;
        } catch (Exception e) {
            Logger.e(e, l1d.m("Error loading image url: ", str), new Object[0]);
            throw e;
        }
    }

    public static final gpr0 x(int i, Integer num, String str) {
        return new gpr0(new ipr0(str, i, num.intValue()), z6x.a);
    }

    public static final gpr0 y(int i, String str, String str2) {
        Integer numA = A(str2);
        return new gpr0(new ipr0(str, i, numA != null ? numA.intValue() : -1), z6x.a);
    }

    public static final qex z(qex qexVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        r3g r3gVar = (r3g) x340Var.k(t3g.a);
        boolean zG = x340Var.g(r3gVar) | x340Var.g(qexVar);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            if (r3gVar != null) {
                qexVar = new oex(8, (vu30) null, new u841(r3gVar, (byte) 13), (vu30) null, 10);
            }
            x340Var.s0(qexVar);
            objT = qexVar;
        }
        return (qex) objT;
    }

    public abstract void v(Throwable th);

    public abstract void w(zsc zscVar);
}
