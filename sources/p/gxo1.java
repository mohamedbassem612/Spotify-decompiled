package p;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gxo1 {
    public static b180 a;

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x012a  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, qim0 qim0Var, String str3, max maxVar, Function0 function0, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        b0k b0kVar2;
        h311 h311VarV;
        qim0 qim0Var3;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-888786074);
        int i7 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.g(str2) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i7 |= b0kVar3.g(qim0Var2) ? 256 : 128;
            }
            if (b0kVar3.g(str3)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            int i9 = i7 | i3;
            if (b0kVar3.g(maxVar)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            int i10 = i9 | i4;
            if (b0kVar3.i(function0)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i6 = i10 | i5;
            if ((74899 & i6) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i6 & 1, z)) {
                if (i8 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                uvx uvxVar = new uvx(0, (pgx) null, 0, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503);
                if (str3 != null || ihc1.y0(str3)) {
                    b0kVar3.i0(648367590);
                    b0kVar3.r(false);
                    j2iVarR = null;
                } else {
                    b0kVar3.i0(648183171);
                    j2iVarR = apo.r(-1700212145, new p3(str3, (byte) 2), b0kVar3);
                    b0kVar3.r(false);
                }
                int i11 = i6 >> 6;
                b0kVar2 = b0kVar3;
                qim0 qim0Var4 = qim0Var3;
                jto1.b(qim0Var4, uvxVar, maxVar, false, null, null, null, null, null, null, null, j2iVarR, apo.r(-641825249, new n891(function0, maxVar, str2, (byte) 2), b0kVar3), null, null, apo.r(-1081604958, new p3(str, (byte) 3), b0kVar3), b0kVar2, (i11 & 14) | 64 | (i11 & 896), 196992, 26616);
                qim0Var2 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ol(str, str2, qim0Var2, str3, maxVar, function0, i, i2);
            }
        }
        i7 |= 384;
        qim0Var2 = qim0Var;
        if (b0kVar3.g(str3)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i12 = i7 | i3;
        if (b0kVar3.g(maxVar)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i13 = i12 | i4;
        if (b0kVar3.i(function0)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        i6 = i13 | i5;
        if ((74899 & i6) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i6 & 1, z)) {
            if (i8 != 0) {
                qim0Var3 = nim0.a;
            } else {
                qim0Var3 = qim0Var2;
            }
            uwr uwrVar2 = cbx.a;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            uvx uvxVar2 = new uvx(0, (pgx) null, 0, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503);
            if (str3 != null) {
                b0kVar3.i0(648367590);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(648367590);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            int i14 = i6 >> 6;
            b0kVar2 = b0kVar3;
            qim0 qim0Var5 = qim0Var3;
            jto1.b(qim0Var5, uvxVar2, maxVar, false, null, null, null, null, null, null, null, j2iVarR, apo.r(-641825249, new n891(function0, maxVar, str2, (byte) 2), b0kVar3), null, null, apo.r(-1081604958, new p3(str, (byte) 3), b0kVar3), b0kVar2, (i14 & 14) | 64 | (i14 & 896), 196992, 26616);
            qim0Var2 = qim0Var5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ol(str, str2, qim0Var2, str3, maxVar, function0, i, i2);
        }
    }

    public static final void b(hwq hwqVar, qim0 qim0Var, boolean z, h72 h72Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        zuc0 zuc0Var;
        att0 att0VarA;
        xu30 xu30Var;
        b0k b0kVar2;
        h72 h72Var2;
        zuc0 zuc0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1421307945);
        byte b = 4;
        int i2 = i | (b0kVar3.i(hwqVar) ? 4 : 2) | 48 | (b0kVar3.g(h72Var) ? 2048 : 1024);
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 8190;
            b0kVar3.i0(-999637485);
            j7e0 j7e0Var = hwqVar.g;
            j2i j2iVarR = null;
            j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
            qim0 qim0Var3 = nim0.a;
            if (j7e0Var2 == null || (zuc0Var = j7e0Var2.a) == null) {
                qim0Var2 = qim0Var3;
            } else {
                fbp1 fbp1Var = zuc0Var.n;
                x4i1 x4i1Var = zuc0Var.d;
                boolean z2 = z && hwqVar.f.b > 1;
                boolean z3 = !(((Boolean) rwq.g((ezc) h72Var.t, Boolean.TRUE, null, b0kVar3, 48, 2).getValue()).booleanValue() || u890.j(fbp1Var, iwp0.c)) || (zuc0Var.k && ((Boolean) rwq.g((mr20) h72Var.X, Boolean.FALSE, null, b0kVar3, 48, 2).getValue()).booleanValue()) || (att0VarA = zuc0Var.q.a(att0.class)) == null || !att0VarA.a;
                b0kVar3.i0(1421074973);
                j2i j2iVarR2 = apo.r(-49760349, new o3(h72Var, zuc0Var, zuc0Var.j, b), b0kVar3);
                b0kVar3.r(false);
                fvu fvuVar = z3 ? null : new fvu((String) h72Var.b, h72.S(zuc0Var), fbp1Var, 6);
                if (fvuVar == null) {
                    b0kVar3.i0(1104075346);
                    b0kVar3.r(false);
                    xu30Var = null;
                } else {
                    b0kVar3.i0(1104075347);
                    xu30 xu30VarR = apo.r(-979014395, new wf((Object) h72Var, (Object) fvuVar, (byte) 27), b0kVar3);
                    b0kVar3.r(false);
                    xu30Var = xu30VarR;
                }
                if (!z2 || x4i1Var == null) {
                    b0kVar2 = b0kVar3;
                    h72Var2 = h72Var;
                    zuc0Var2 = zuc0Var;
                    b0kVar2.i0(1105513002);
                    b0kVar2.r(false);
                } else {
                    b0kVar3.i0(1105205173);
                    b0kVar2 = b0kVar3;
                    h72Var2 = h72Var;
                    zuc0Var2 = zuc0Var;
                    j2iVarR = apo.r(568584725, new tf((Object) h72Var2, (Object) x4i1Var, (Object) zuc0Var2, z3, (byte) 2), b0kVar2);
                    b0kVar2.r(false);
                }
                j2i j2iVar = j2iVarR;
                b0k b0kVar4 = b0kVar2;
                qim0Var2 = qim0Var3;
                d(qim0Var2, z3, apo.r(-15382621, new pb8(h72Var2, zuc0Var2, b2), b0kVar2), j2iVarR2, apo.r(1742244517, new pb8(h72Var2, zuc0Var2, b3), b0kVar2), j2iVar, xu30Var, apo.r(-2063765720, new n891(h72Var2, zuc0Var2, hwqVar, (byte) 23), b0kVar2), h72Var2, b0kVar4, ((i3 << 15) & 234881024) | 12607878);
                b0kVar3 = b0kVar4;
            }
            b0kVar3.r(false);
        } else {
            b0kVar3.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(hwqVar, qim0Var2, z, h72Var, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x011e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0125  */
    /* JADX WARN: Code duplicated, block: B:110:0x0129  */
    /* JADX WARN: Code duplicated, block: B:113:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x013b  */
    /* JADX WARN: Code duplicated, block: B:119:0x014f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0159  */
    /* JADX WARN: Code duplicated, block: B:126:0x0162  */
    /* JADX WARN: Code duplicated, block: B:128:0x0175  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:163:0x01da  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:170:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:171:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:174:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:178:0x020d  */
    /* JADX WARN: Code duplicated, block: B:179:0x021c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0228  */
    /* JADX WARN: Code duplicated, block: B:186:0x024d  */
    /* JADX WARN: Code duplicated, block: B:189:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:191:0x0343  */
    /* JADX WARN: Code duplicated, block: B:194:0x035d  */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x0106  */
    /* JADX WARN: Code duplicated, block: B:98:0x010a  */
    public static final void c(String str, qim0 qim0Var, lee1 lee1Var, long j, a0e1 a0e1Var, int i, boolean z, djc0 djc0Var, qx8 qx8Var, float f, FontWeight fontWeight, iu30 iu30Var, b0k b0kVar, int i2, int i3, int i4) {
        int i5;
        qim0 qim0Var2;
        lee1 lee1Var2;
        long j2;
        int i6;
        a0e1 a0e1Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        x340 x340Var;
        qx8 qx8Var2;
        iu30 iu30Var2;
        qim0 qim0Var3;
        long j3;
        a0e1 a0e1Var3;
        int i15;
        boolean z3;
        djc0 djc0Var2;
        float f2;
        FontWeight fontWeight2;
        h311 h311VarV;
        qim0 qim0Var4;
        boolean z4;
        djc0 cjc0Var;
        qx8 qx8Var3;
        int i16;
        float f3;
        FontWeight fontWeight3;
        Object objT;
        iu30 iu30Var3;
        boolean z5;
        int i17;
        int i18;
        boolean z6;
        iu30 iu30Var4;
        int i19;
        boolean z7;
        iu30 iu30Var5;
        qim0 qim0Var5;
        long j4;
        djc0 djc0Var3;
        a0e1 a0e1Var4;
        int i20;
        qx8 qx8Var4;
        int i21;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(761955737);
        if ((i2 & 6) == 0) {
            i5 = (x340Var2.g(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i22 = i4 & 2;
        if (i22 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i5 |= x340Var2.i(qim0Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                lee1Var2 = lee1Var;
                if (x340Var2.i(lee1Var2)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i5 |= i21;
            } else {
                lee1Var2 = lee1Var;
            }
            if ((i2 & 3072) == 0) {
                if ((i4 & 8) == 0) {
                    j2 = j;
                    int i23 = x340Var2.f(j2) ? 2048 : 1024;
                    i5 |= i23;
                } else {
                    j2 = j;
                }
                i5 |= i23;
            } else {
                j2 = j;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    a0e1Var2 = a0e1Var;
                    if (x340Var2.g(a0e1Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((196608 & i2) == 0) {
                    if ((i4 & 32) == 0) {
                        i8 = i;
                        int i24 = x340Var2.e(i8) ? 131072 : 65536;
                        i5 |= i24;
                    } else {
                        i8 = i;
                    }
                    i5 |= i24;
                } else {
                    i8 = i;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (x340Var2.h(z)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i5 |= i10;
                }
                if ((i2 & 12582912) != 0) {
                    i5 |= ((i4 & 128) == 0 || !x340Var2.i(djc0Var)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) == 0) {
                    i11 = i5 | (((i4 & 256) == 0 || !x340Var2.i(qx8Var)) ? 33554432 : 67108864);
                } else {
                    i11 = i5;
                }
                if ((i2 & 805306368) != 0) {
                    i11 |= ((i4 & 512) == 0 || !x340Var2.d(f)) ? 268435456 : 536870912;
                }
                i12 = i11;
                if ((i3 & 6) == 0) {
                    i13 = i3 | (((i4 & 1024) == 0 || !x340Var2.i(fontWeight)) ? 2 : 4);
                } else {
                    i13 = i3;
                }
                i14 = i13 | 48;
                if ((i12 & 306783379) == 306783378 || (i14 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var2.Y(i12 & 1, z2)) {
                    x340Var2.d0();
                    if ((i2 & 1) != 0 || x340Var2.E()) {
                        if (i22 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i4 & 8) != 0) {
                            j2 = ((u7h) x340Var2.k(qgx.a)).a;
                            i12 &= -7169;
                        }
                        if (i6 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i4 & 32) != 0) {
                            i12 &= -458753;
                            i8 = 1;
                        }
                        if (i9 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if ((i4 & 128) != 0) {
                            cjc0Var = new cjc0(2);
                            i12 &= -29360129;
                        } else {
                            cjc0Var = djc0Var;
                        }
                        if ((i4 & 256) != 0) {
                            i12 &= -234881025;
                            qx8Var3 = ox8.a;
                        } else {
                            qx8Var3 = qx8Var;
                        }
                        i16 = 1;
                        if ((i4 & 512) != 0) {
                            uwr uwrVar = cbx.a;
                            Object obj = ajx.a.b;
                            i12 &= -1879048193;
                            f3 = 96.0f;
                        } else {
                            f3 = f;
                        }
                        if ((i4 & 1024) != 0) {
                            uwr uwrVar2 = cbx.a;
                            fontWeight3 = (FontWeight) ((bjx) ajx.a.c).b;
                            i14 &= -15;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        objT = x340Var2.T();
                        int i25 = i12;
                        if (objT == fkj0.X) {
                            objT = s8x.X0;
                            x340Var2.s0(objT);
                        }
                        iu30Var3 = (iu30) objT;
                        z5 = z4;
                        i17 = i14;
                        qim0Var2 = qim0Var4;
                        i18 = i25;
                    } else {
                        x340Var2.b0();
                        if ((i4 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i4 & 32) != 0) {
                            i12 &= -458753;
                        }
                        if ((i4 & 128) != 0) {
                            i12 &= -29360129;
                        }
                        if ((i4 & 256) != 0) {
                            i12 &= -234881025;
                        }
                        if ((i4 & 512) != 0) {
                            i12 &= -1879048193;
                        }
                        if ((i4 & 1024) != 0) {
                            i14 &= -15;
                        }
                        z5 = z;
                        cjc0Var = djc0Var;
                        qx8Var3 = qx8Var;
                        f3 = f;
                        fontWeight3 = fontWeight;
                        i18 = i12;
                        i17 = i14;
                        i16 = 1;
                        iu30Var3 = iu30Var;
                    }
                    x340Var2.s();
                    z6 = z5;
                    iu30Var4 = iu30Var3;
                    i19 = i18;
                    if (Build.VERSION.SDK_INT >= 29 || !ouo1.W(str)) {
                        z7 = z6;
                        iu30Var5 = iu30Var4;
                        x340Var = x340Var2;
                        qim0Var5 = qim0Var2;
                        j4 = j2;
                        djc0Var3 = cjc0Var;
                        a0e1Var4 = a0e1Var2;
                        i20 = i8;
                        qx8Var4 = qx8Var3;
                        x340Var.i0(522217386);
                        int i26 = i19 << 3;
                        uwo1.e(str, qim0Var5, lee1Var, j4, a0e1Var4, iu30Var5, i20, z7, djc0Var3, 0, qx8Var4, x340Var, (i19 & 65534) | ((i17 << 12) & 458752) | (i26 & 3670016) | (i26 & 29360128) | (i26 & 234881024), (i19 >> 24) & 14, 512);
                        x340Var.r(false);
                    } else {
                        x340Var2.i0(521820896);
                        int i27 = fontWeight3.a;
                        ga30 ga30VarI = u890.I(f3);
                        ia30 ia30VarH = u890.H(i27);
                        ga30[] ga30VarArr = new ga30[2];
                        ga30VarArr[0] = ga30VarI;
                        ga30VarArr[i16] = ia30VarH;
                        a930[] a930VarArr = new a930[i16];
                        a930VarArr[0] = o0c.a(14, (FontWeight) null, new ja30(ga30VarArr));
                        int i28 = i19 << 3;
                        z7 = z6;
                        iu30Var5 = iu30Var4;
                        qim0Var5 = qim0Var2;
                        j4 = j2;
                        djc0Var3 = cjc0Var;
                        a0e1Var4 = a0e1Var2;
                        i20 = i8;
                        qx8Var4 = qx8Var3;
                        uwo1.e(str, qim0Var5, lee1.a(lee1Var2, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, hm5.d(a930VarArr), (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777183), j4, a0e1Var4, iu30Var5, i20, z7, djc0Var3, 0, qx8Var4, x340Var2, (i19 & 64638) | ((i17 << 12) & 458752) | (i28 & 3670016) | (i28 & 29360128) | (i28 & 234881024), (i19 >> 24) & 14, 512);
                        x340Var = x340Var2;
                        x340Var.r(false);
                    }
                    fontWeight2 = fontWeight3;
                    f2 = f3;
                    qim0Var3 = qim0Var5;
                    j3 = j4;
                    a0e1Var3 = a0e1Var4;
                    iu30Var2 = iu30Var5;
                    i15 = i20;
                    z3 = z7;
                    djc0Var2 = djc0Var3;
                    qx8Var2 = qx8Var4;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qx8Var2 = qx8Var;
                    iu30Var2 = iu30Var;
                    qim0Var3 = qim0Var2;
                    j3 = j2;
                    a0e1Var3 = a0e1Var2;
                    i15 = i8;
                    z3 = z;
                    djc0Var2 = djc0Var;
                    f2 = f;
                    fontWeight2 = fontWeight;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wyx(str, qim0Var3, lee1Var, j3, a0e1Var3, i15, z3, djc0Var2, qx8Var2, f2, fontWeight2, iu30Var2, i2, i3, i4);
                }
            }
            i5 |= 24576;
            a0e1Var2 = a0e1Var;
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    i8 = i;
                    if (x340Var2.e(i8)) {
                    }
                    i5 |= i24;
                } else {
                    i8 = i;
                }
                i5 |= i24;
            } else {
                i8 = i;
            }
            i9 = i4 & 64;
            if (i9 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (x340Var2.h(z)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i5 |= i10;
            }
            if ((i2 & 12582912) != 0) {
                i5 |= ((i4 & 128) == 0 || !x340Var2.i(djc0Var)) ? 4194304 : 8388608;
            }
            if ((i2 & 100663296) == 0) {
                i11 = i5 | (((i4 & 256) == 0 || !x340Var2.i(qx8Var)) ? 33554432 : 67108864);
            } else {
                i11 = i5;
            }
            if ((i2 & 805306368) != 0) {
                i11 |= ((i4 & 512) == 0 || !x340Var2.d(f)) ? 268435456 : 536870912;
            }
            i12 = i11;
            if ((i3 & 6) == 0) {
                i13 = i3 | (((i4 & 1024) == 0 || !x340Var2.i(fontWeight)) ? 2 : 4);
            } else {
                i13 = i3;
            }
            i14 = i13 | 48;
            if ((i12 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i12 & 1, z2)) {
                x340Var2.d0();
                if ((i2 & 1) != 0) {
                    if (i22 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        j2 = ((u7h) x340Var2.k(qgx.a)).a;
                        i12 &= -7169;
                    }
                    if (i6 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i4 & 32) != 0) {
                        i12 &= -458753;
                        i8 = 1;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i4 & 128) != 0) {
                        cjc0Var = new cjc0(2);
                        i12 &= -29360129;
                    } else {
                        cjc0Var = djc0Var;
                    }
                    if ((i4 & 256) != 0) {
                        i12 &= -234881025;
                        qx8Var3 = ox8.a;
                    } else {
                        qx8Var3 = qx8Var;
                    }
                    i16 = 1;
                    if ((i4 & 512) != 0) {
                        uwr uwrVar3 = cbx.a;
                        Object obj2 = ajx.a.b;
                        i12 &= -1879048193;
                        f3 = 96.0f;
                    } else {
                        f3 = f;
                    }
                    if ((i4 & 1024) != 0) {
                        uwr uwrVar4 = cbx.a;
                        fontWeight3 = (FontWeight) ((bjx) ajx.a.c).b;
                        i14 &= -15;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    objT = x340Var2.T();
                    int i29 = i12;
                    if (objT == fkj0.X) {
                        objT = s8x.X0;
                        x340Var2.s0(objT);
                    }
                    iu30Var3 = (iu30) objT;
                    z5 = z4;
                    i17 = i14;
                    qim0Var2 = qim0Var4;
                    i18 = i29;
                } else {
                    if (i22 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        j2 = ((u7h) x340Var2.k(qgx.a)).a;
                        i12 &= -7169;
                    }
                    if (i6 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i4 & 32) != 0) {
                        i12 &= -458753;
                        i8 = 1;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i4 & 128) != 0) {
                        cjc0Var = new cjc0(2);
                        i12 &= -29360129;
                    } else {
                        cjc0Var = djc0Var;
                    }
                    if ((i4 & 256) != 0) {
                        i12 &= -234881025;
                        qx8Var3 = ox8.a;
                    } else {
                        qx8Var3 = qx8Var;
                    }
                    i16 = 1;
                    if ((i4 & 512) != 0) {
                        uwr uwrVar5 = cbx.a;
                        Object obj3 = ajx.a.b;
                        i12 &= -1879048193;
                        f3 = 96.0f;
                    } else {
                        f3 = f;
                    }
                    if ((i4 & 1024) != 0) {
                        uwr uwrVar6 = cbx.a;
                        fontWeight3 = (FontWeight) ((bjx) ajx.a.c).b;
                        i14 &= -15;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    objT = x340Var2.T();
                    int i210 = i12;
                    if (objT == fkj0.X) {
                        objT = s8x.X0;
                        x340Var2.s0(objT);
                    }
                    iu30Var3 = (iu30) objT;
                    z5 = z4;
                    i17 = i14;
                    qim0Var2 = qim0Var4;
                    i18 = i210;
                }
                x340Var2.s();
                z6 = z5;
                iu30Var4 = iu30Var3;
                i19 = i18;
                if (Build.VERSION.SDK_INT >= 29) {
                    z7 = z6;
                    iu30Var5 = iu30Var4;
                    x340Var = x340Var2;
                    qim0Var5 = qim0Var2;
                    j4 = j2;
                    djc0Var3 = cjc0Var;
                    a0e1Var4 = a0e1Var2;
                    i20 = i8;
                    qx8Var4 = qx8Var3;
                    x340Var.i0(522217386);
                    int i211 = i19 << 3;
                    uwo1.e(str, qim0Var5, lee1Var, j4, a0e1Var4, iu30Var5, i20, z7, djc0Var3, 0, qx8Var4, x340Var, (i19 & 65534) | ((i17 << 12) & 458752) | (i211 & 3670016) | (i211 & 29360128) | (i211 & 234881024), (i19 >> 24) & 14, 512);
                    x340Var.r(false);
                } else {
                    z7 = z6;
                    iu30Var5 = iu30Var4;
                    x340Var = x340Var2;
                    qim0Var5 = qim0Var2;
                    j4 = j2;
                    djc0Var3 = cjc0Var;
                    a0e1Var4 = a0e1Var2;
                    i20 = i8;
                    qx8Var4 = qx8Var3;
                    x340Var.i0(522217386);
                    int i212 = i19 << 3;
                    uwo1.e(str, qim0Var5, lee1Var, j4, a0e1Var4, iu30Var5, i20, z7, djc0Var3, 0, qx8Var4, x340Var, (i19 & 65534) | ((i17 << 12) & 458752) | (i212 & 3670016) | (i212 & 29360128) | (i212 & 234881024), (i19 >> 24) & 14, 512);
                    x340Var.r(false);
                }
                fontWeight2 = fontWeight3;
                f2 = f3;
                qim0Var3 = qim0Var5;
                j3 = j4;
                a0e1Var3 = a0e1Var4;
                iu30Var2 = iu30Var5;
                i15 = i20;
                z3 = z7;
                djc0Var2 = djc0Var3;
                qx8Var2 = qx8Var4;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qx8Var2 = qx8Var;
                iu30Var2 = iu30Var;
                qim0Var3 = qim0Var2;
                j3 = j2;
                a0e1Var3 = a0e1Var2;
                i15 = i8;
                z3 = z;
                djc0Var2 = djc0Var;
                f2 = f;
                fontWeight2 = fontWeight;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wyx(str, qim0Var3, lee1Var, j3, a0e1Var3, i15, z3, djc0Var2, qx8Var2, f2, fontWeight2, iu30Var2, i2, i3, i4);
            }
        }
        i5 |= 48;
        qim0Var2 = qim0Var;
        if ((i2 & 384) == 0) {
            lee1Var2 = lee1Var;
            if (x340Var2.i(lee1Var2)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i5 |= i21;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i2 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                j2 = j;
                if (x340Var2.f(j2)) {
                }
                i5 |= i23;
            } else {
                j2 = j;
            }
            i5 |= i23;
        } else {
            j2 = j;
        }
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                a0e1Var2 = a0e1Var;
                if (x340Var2.g(a0e1Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    i8 = i;
                    if (x340Var2.e(i8)) {
                    }
                    i5 |= i24;
                } else {
                    i8 = i;
                }
                i5 |= i24;
            } else {
                i8 = i;
            }
            i9 = i4 & 64;
            if (i9 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (x340Var2.h(z)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i5 |= i10;
            }
            if ((i2 & 12582912) != 0) {
                i5 |= ((i4 & 128) == 0 || !x340Var2.i(djc0Var)) ? 4194304 : 8388608;
            }
            if ((i2 & 100663296) == 0) {
                i11 = i5 | (((i4 & 256) == 0 || !x340Var2.i(qx8Var)) ? 33554432 : 67108864);
            } else {
                i11 = i5;
            }
            if ((i2 & 805306368) != 0) {
                i11 |= ((i4 & 512) == 0 || !x340Var2.d(f)) ? 268435456 : 536870912;
            }
            i12 = i11;
            if ((i3 & 6) == 0) {
                i13 = i3 | (((i4 & 1024) == 0 || !x340Var2.i(fontWeight)) ? 2 : 4);
            } else {
                i13 = i3;
            }
            i14 = i13 | 48;
            if ((i12 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i12 & 1, z2)) {
                x340Var2.d0();
                if ((i2 & 1) != 0) {
                    if (i22 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        j2 = ((u7h) x340Var2.k(qgx.a)).a;
                        i12 &= -7169;
                    }
                    if (i6 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i4 & 32) != 0) {
                        i12 &= -458753;
                        i8 = 1;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i4 & 128) != 0) {
                        cjc0Var = new cjc0(2);
                        i12 &= -29360129;
                    } else {
                        cjc0Var = djc0Var;
                    }
                    if ((i4 & 256) != 0) {
                        i12 &= -234881025;
                        qx8Var3 = ox8.a;
                    } else {
                        qx8Var3 = qx8Var;
                    }
                    i16 = 1;
                    if ((i4 & 512) != 0) {
                        uwr uwrVar7 = cbx.a;
                        Object obj4 = ajx.a.b;
                        i12 &= -1879048193;
                        f3 = 96.0f;
                    } else {
                        f3 = f;
                    }
                    if ((i4 & 1024) != 0) {
                        uwr uwrVar8 = cbx.a;
                        fontWeight3 = (FontWeight) ((bjx) ajx.a.c).b;
                        i14 &= -15;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    objT = x340Var2.T();
                    int i213 = i12;
                    if (objT == fkj0.X) {
                        objT = s8x.X0;
                        x340Var2.s0(objT);
                    }
                    iu30Var3 = (iu30) objT;
                    z5 = z4;
                    i17 = i14;
                    qim0Var2 = qim0Var4;
                    i18 = i213;
                } else {
                    if (i22 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        j2 = ((u7h) x340Var2.k(qgx.a)).a;
                        i12 &= -7169;
                    }
                    if (i6 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i4 & 32) != 0) {
                        i12 &= -458753;
                        i8 = 1;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i4 & 128) != 0) {
                        cjc0Var = new cjc0(2);
                        i12 &= -29360129;
                    } else {
                        cjc0Var = djc0Var;
                    }
                    if ((i4 & 256) != 0) {
                        i12 &= -234881025;
                        qx8Var3 = ox8.a;
                    } else {
                        qx8Var3 = qx8Var;
                    }
                    i16 = 1;
                    if ((i4 & 512) != 0) {
                        uwr uwrVar9 = cbx.a;
                        Object obj5 = ajx.a.b;
                        i12 &= -1879048193;
                        f3 = 96.0f;
                    } else {
                        f3 = f;
                    }
                    if ((i4 & 1024) != 0) {
                        uwr uwrVar10 = cbx.a;
                        fontWeight3 = (FontWeight) ((bjx) ajx.a.c).b;
                        i14 &= -15;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    objT = x340Var2.T();
                    int i214 = i12;
                    if (objT == fkj0.X) {
                        objT = s8x.X0;
                        x340Var2.s0(objT);
                    }
                    iu30Var3 = (iu30) objT;
                    z5 = z4;
                    i17 = i14;
                    qim0Var2 = qim0Var4;
                    i18 = i214;
                }
                x340Var2.s();
                z6 = z5;
                iu30Var4 = iu30Var3;
                i19 = i18;
                if (Build.VERSION.SDK_INT >= 29) {
                    z7 = z6;
                    iu30Var5 = iu30Var4;
                    x340Var = x340Var2;
                    qim0Var5 = qim0Var2;
                    j4 = j2;
                    djc0Var3 = cjc0Var;
                    a0e1Var4 = a0e1Var2;
                    i20 = i8;
                    qx8Var4 = qx8Var3;
                    x340Var.i0(522217386);
                    int i215 = i19 << 3;
                    uwo1.e(str, qim0Var5, lee1Var, j4, a0e1Var4, iu30Var5, i20, z7, djc0Var3, 0, qx8Var4, x340Var, (i19 & 65534) | ((i17 << 12) & 458752) | (i215 & 3670016) | (i215 & 29360128) | (i215 & 234881024), (i19 >> 24) & 14, 512);
                    x340Var.r(false);
                } else {
                    z7 = z6;
                    iu30Var5 = iu30Var4;
                    x340Var = x340Var2;
                    qim0Var5 = qim0Var2;
                    j4 = j2;
                    djc0Var3 = cjc0Var;
                    a0e1Var4 = a0e1Var2;
                    i20 = i8;
                    qx8Var4 = qx8Var3;
                    x340Var.i0(522217386);
                    int i216 = i19 << 3;
                    uwo1.e(str, qim0Var5, lee1Var, j4, a0e1Var4, iu30Var5, i20, z7, djc0Var3, 0, qx8Var4, x340Var, (i19 & 65534) | ((i17 << 12) & 458752) | (i216 & 3670016) | (i216 & 29360128) | (i216 & 234881024), (i19 >> 24) & 14, 512);
                    x340Var.r(false);
                }
                fontWeight2 = fontWeight3;
                f2 = f3;
                qim0Var3 = qim0Var5;
                j3 = j4;
                a0e1Var3 = a0e1Var4;
                iu30Var2 = iu30Var5;
                i15 = i20;
                z3 = z7;
                djc0Var2 = djc0Var3;
                qx8Var2 = qx8Var4;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qx8Var2 = qx8Var;
                iu30Var2 = iu30Var;
                qim0Var3 = qim0Var2;
                j3 = j2;
                a0e1Var3 = a0e1Var2;
                i15 = i8;
                z3 = z;
                djc0Var2 = djc0Var;
                f2 = f;
                fontWeight2 = fontWeight;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wyx(str, qim0Var3, lee1Var, j3, a0e1Var3, i15, z3, djc0Var2, qx8Var2, f2, fontWeight2, iu30Var2, i2, i3, i4);
            }
        }
        i5 |= 24576;
        a0e1Var2 = a0e1Var;
        if ((196608 & i2) == 0) {
            if ((i4 & 32) == 0) {
                i8 = i;
                if (x340Var2.e(i8)) {
                }
                i5 |= i24;
            } else {
                i8 = i;
            }
            i5 |= i24;
        } else {
            i8 = i;
        }
        i9 = i4 & 64;
        if (i9 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (x340Var2.h(z)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i5 |= i10;
        }
        if ((i2 & 12582912) != 0) {
            i5 |= ((i4 & 128) == 0 || !x340Var2.i(djc0Var)) ? 4194304 : 8388608;
        }
        if ((i2 & 100663296) == 0) {
            i11 = i5 | (((i4 & 256) == 0 || !x340Var2.i(qx8Var)) ? 33554432 : 67108864);
        } else {
            i11 = i5;
        }
        if ((i2 & 805306368) != 0) {
            i11 |= ((i4 & 512) == 0 || !x340Var2.d(f)) ? 268435456 : 536870912;
        }
        i12 = i11;
        if ((i3 & 6) == 0) {
            i13 = i3 | (((i4 & 1024) == 0 || !x340Var2.i(fontWeight)) ? 2 : 4);
        } else {
            i13 = i3;
        }
        i14 = i13 | 48;
        if ((i12 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var2.Y(i12 & 1, z2)) {
            x340Var2.d0();
            if ((i2 & 1) != 0) {
                if (i22 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 8) != 0) {
                    j2 = ((u7h) x340Var2.k(qgx.a)).a;
                    i12 &= -7169;
                }
                if (i6 != 0) {
                    a0e1Var2 = null;
                }
                if ((i4 & 32) != 0) {
                    i12 &= -458753;
                    i8 = 1;
                }
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i4 & 128) != 0) {
                    cjc0Var = new cjc0(2);
                    i12 &= -29360129;
                } else {
                    cjc0Var = djc0Var;
                }
                if ((i4 & 256) != 0) {
                    i12 &= -234881025;
                    qx8Var3 = ox8.a;
                } else {
                    qx8Var3 = qx8Var;
                }
                i16 = 1;
                if ((i4 & 512) != 0) {
                    uwr uwrVar11 = cbx.a;
                    Object obj6 = ajx.a.b;
                    i12 &= -1879048193;
                    f3 = 96.0f;
                } else {
                    f3 = f;
                }
                if ((i4 & 1024) != 0) {
                    uwr uwrVar12 = cbx.a;
                    fontWeight3 = (FontWeight) ((bjx) ajx.a.c).b;
                    i14 &= -15;
                } else {
                    fontWeight3 = fontWeight;
                }
                objT = x340Var2.T();
                int i217 = i12;
                if (objT == fkj0.X) {
                    objT = s8x.X0;
                    x340Var2.s0(objT);
                }
                iu30Var3 = (iu30) objT;
                z5 = z4;
                i17 = i14;
                qim0Var2 = qim0Var4;
                i18 = i217;
            } else {
                if (i22 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 8) != 0) {
                    j2 = ((u7h) x340Var2.k(qgx.a)).a;
                    i12 &= -7169;
                }
                if (i6 != 0) {
                    a0e1Var2 = null;
                }
                if ((i4 & 32) != 0) {
                    i12 &= -458753;
                    i8 = 1;
                }
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i4 & 128) != 0) {
                    cjc0Var = new cjc0(2);
                    i12 &= -29360129;
                } else {
                    cjc0Var = djc0Var;
                }
                if ((i4 & 256) != 0) {
                    i12 &= -234881025;
                    qx8Var3 = ox8.a;
                } else {
                    qx8Var3 = qx8Var;
                }
                i16 = 1;
                if ((i4 & 512) != 0) {
                    uwr uwrVar13 = cbx.a;
                    Object obj7 = ajx.a.b;
                    i12 &= -1879048193;
                    f3 = 96.0f;
                } else {
                    f3 = f;
                }
                if ((i4 & 1024) != 0) {
                    uwr uwrVar14 = cbx.a;
                    fontWeight3 = (FontWeight) ((bjx) ajx.a.c).b;
                    i14 &= -15;
                } else {
                    fontWeight3 = fontWeight;
                }
                objT = x340Var2.T();
                int i218 = i12;
                if (objT == fkj0.X) {
                    objT = s8x.X0;
                    x340Var2.s0(objT);
                }
                iu30Var3 = (iu30) objT;
                z5 = z4;
                i17 = i14;
                qim0Var2 = qim0Var4;
                i18 = i218;
            }
            x340Var2.s();
            z6 = z5;
            iu30Var4 = iu30Var3;
            i19 = i18;
            if (Build.VERSION.SDK_INT >= 29) {
                z7 = z6;
                iu30Var5 = iu30Var4;
                x340Var = x340Var2;
                qim0Var5 = qim0Var2;
                j4 = j2;
                djc0Var3 = cjc0Var;
                a0e1Var4 = a0e1Var2;
                i20 = i8;
                qx8Var4 = qx8Var3;
                x340Var.i0(522217386);
                int i219 = i19 << 3;
                uwo1.e(str, qim0Var5, lee1Var, j4, a0e1Var4, iu30Var5, i20, z7, djc0Var3, 0, qx8Var4, x340Var, (i19 & 65534) | ((i17 << 12) & 458752) | (i219 & 3670016) | (i219 & 29360128) | (i219 & 234881024), (i19 >> 24) & 14, 512);
                x340Var.r(false);
            } else {
                z7 = z6;
                iu30Var5 = iu30Var4;
                x340Var = x340Var2;
                qim0Var5 = qim0Var2;
                j4 = j2;
                djc0Var3 = cjc0Var;
                a0e1Var4 = a0e1Var2;
                i20 = i8;
                qx8Var4 = qx8Var3;
                x340Var.i0(522217386);
                int i2110 = i19 << 3;
                uwo1.e(str, qim0Var5, lee1Var, j4, a0e1Var4, iu30Var5, i20, z7, djc0Var3, 0, qx8Var4, x340Var, (i19 & 65534) | ((i17 << 12) & 458752) | (i2110 & 3670016) | (i2110 & 29360128) | (i2110 & 234881024), (i19 >> 24) & 14, 512);
                x340Var.r(false);
            }
            fontWeight2 = fontWeight3;
            f2 = f3;
            qim0Var3 = qim0Var5;
            j3 = j4;
            a0e1Var3 = a0e1Var4;
            iu30Var2 = iu30Var5;
            i15 = i20;
            z3 = z7;
            djc0Var2 = djc0Var3;
            qx8Var2 = qx8Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qx8Var2 = qx8Var;
            iu30Var2 = iu30Var;
            qim0Var3 = qim0Var2;
            j3 = j2;
            a0e1Var3 = a0e1Var2;
            i15 = i8;
            z3 = z;
            djc0Var2 = djc0Var;
            f2 = f;
            fontWeight2 = fontWeight;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyx(str, qim0Var3, lee1Var, j3, a0e1Var3, i15, z3, djc0Var2, qx8Var2, f2, fontWeight2, iu30Var2, i2, i3, i4);
        }
    }

    public static final void d(qim0 qim0Var, boolean z, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, h72 h72Var, b0k b0kVar, int i) {
        int i2;
        xu30 xu30Var7;
        vu30 vu30Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        xu30 xu30Var8 = xu30Var;
        xu30 xu30Var9 = xu30Var6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1699770885);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(xu30Var8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(xu30Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(xu30Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(xu30Var5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(xu30Var9) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? x340Var.g(h72Var) : x340Var.i(h72Var) ? 67108864 : 33554432;
        }
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            int i3 = i2 & 268435454;
            gra graVar = een.d;
            x340Var.i0(1329508446);
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z8 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z8) {
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
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var2);
            boolean zA = ((fp4) h72Var.i).a();
            nim0 nim0Var = nim0.a;
            h2c h2cVar = h2c.a;
            if (zA) {
                x340Var.i0(1484842878);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                if (xu30Var9 != null) {
                    x340Var.i0(1484912814);
                    qim0 qim0VarN = anm1.N("audiobook_row_controls_context_menu_button", nim0Var);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
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
                    vu30Var = vu30Var2;
                    nko1.H(qim0VarE2, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 18) & 112), xu30Var9, h2cVar, x340Var, true);
                    z6 = false;
                    x340Var.r(false);
                } else {
                    vu30Var = vu30Var2;
                    z6 = false;
                    x340Var.i0(1485053120);
                    x340Var.r(false);
                }
                if (xu30Var3 != null) {
                    x340Var.i0(1485090289);
                    qim0 qim0VarN2 = anm1.N("audiobook_row_controls_share_button", nim0Var);
                    gfh0 gfh0VarC2 = t1c.c(graVar, z6);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 9) & 112), xu30Var3, h2cVar, x340Var, true);
                    z6 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1485196960);
                    x340Var.r(z6);
                }
                if (xu30Var5 != null) {
                    x340Var.i0(1485237973);
                    qim0 qim0VarN3 = anm1.N("audiobook_row_controls_download_button", nim0Var);
                    gfh0 gfh0VarC3 = t1c.c(graVar, z6);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarN3);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 15) & 112), xu30Var5, h2cVar, x340Var, true);
                    z6 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1485371552);
                    x340Var.r(z6);
                }
                if (xu30Var2 != null) {
                    x340Var.i0(1485408659);
                    qim0 qim0VarN4 = anm1.N("audiobook_row_controls_add_button", nim0Var);
                    gfh0 gfh0VarC4 = t1c.c(graVar, z6);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, qim0VarN4);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var, lljVar);
                    nko1.H(xos0VarM5, x340Var, lljVar2);
                    x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE5, x340Var, vu30Var);
                    xu30Var7 = xu30Var2;
                    hrt.k(6 | ((i3 >> 6) & 112), xu30Var7, h2cVar, x340Var, true);
                    z7 = false;
                    x340Var.r(false);
                } else {
                    z7 = z6;
                    xu30Var7 = xu30Var2;
                    x340Var.i0(1485513408);
                    x340Var.r(z7);
                }
                x340Var.r(z7);
                xu30Var9 = xu30Var6;
                z3 = z7;
            } else {
                vu30Var = vu30Var2;
                x340Var.i0(1485549182);
                if (xu30Var2 != null) {
                    x340Var.i0(1485565395);
                    qim0 qim0VarN5 = anm1.N("audiobook_row_controls_add_button", nim0Var);
                    gfh0 gfh0VarC5 = t1c.c(graVar, false);
                    xu30Var7 = xu30Var2;
                    int iHashCode6 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM6 = x340Var.m();
                    qim0 qim0VarE6 = zr7.E(x340Var, qim0VarN5);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var, lljVar);
                    nko1.H(xos0VarM6, x340Var, lljVar2);
                    x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE6, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 6) & 112), xu30Var7, h2cVar, x340Var, true);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    xu30Var7 = xu30Var2;
                    z2 = false;
                    x340Var.i0(1485670144);
                    x340Var.r(false);
                }
                if (xu30Var5 != null) {
                    x340Var.i0(1485711157);
                    qim0 qim0VarN6 = anm1.N("audiobook_row_controls_download_button", nim0Var);
                    gfh0 gfh0VarC6 = t1c.c(graVar, z2);
                    int iHashCode7 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM7 = x340Var.m();
                    qim0 qim0VarE7 = zr7.E(x340Var, qim0VarN6);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC6, x340Var, lljVar);
                    nko1.H(xos0VarM7, x340Var, lljVar2);
                    x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE7, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 15) & 112), xu30Var5, h2cVar, x340Var, true);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1485844736);
                    x340Var.r(z2);
                }
                if (xu30Var3 != null) {
                    x340Var.i0(1485881905);
                    qim0 qim0VarN7 = anm1.N("audiobook_row_controls_share_button", nim0Var);
                    gfh0 gfh0VarC7 = t1c.c(graVar, z2);
                    int iHashCode8 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM8 = x340Var.m();
                    qim0 qim0VarE8 = zr7.E(x340Var, qim0VarN7);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC7, x340Var, lljVar);
                    nko1.H(xos0VarM8, x340Var, lljVar2);
                    x0d.q(iHashCode8, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE8, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 9) & 112), xu30Var3, h2cVar, x340Var, true);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1485988576);
                    x340Var.r(z2);
                }
                if (xu30Var6 != null) {
                    x340Var.i0(1486032782);
                    qim0 qim0VarN8 = anm1.N("audiobook_row_controls_context_menu_button", nim0Var);
                    gfh0 gfh0VarC8 = t1c.c(graVar, z2);
                    int iHashCode9 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM9 = x340Var.m();
                    qim0 qim0VarE9 = zr7.E(x340Var, qim0VarN8);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC8, x340Var, lljVar);
                    nko1.H(xos0VarM9, x340Var, lljVar2);
                    x0d.q(iHashCode9, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE9, x340Var, vu30Var);
                    xu30Var9 = xu30Var6;
                    hrt.k(6 | ((i3 >> 18) & 112), xu30Var9, h2cVar, x340Var, true);
                    x340Var.r(false);
                } else {
                    xu30Var9 = xu30Var6;
                    x340Var.i0(1486173088);
                    x340Var.r(z2);
                }
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                z3 = false;
                x340Var.r(false);
            }
            if (xu30Var4 != null) {
                x340Var.i0(1486265375);
                qim0 qim0VarN9 = anm1.N("audiobook_row_controls_profile_button", nim0Var);
                gfh0 gfh0VarC9 = t1c.c(graVar, z3);
                int iHashCode10 = Long.hashCode(x340Var.T);
                xos0 xos0VarM10 = x340Var.m();
                qim0 qim0VarE10 = zr7.E(x340Var, qim0VarN9);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC9, x340Var, lljVar);
                nko1.H(xos0VarM10, x340Var, lljVar2);
                x0d.q(iHashCode10, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE10, x340Var, vu30Var);
                hrt.k(6 | ((i3 >> 12) & 112), xu30Var4, h2cVar, x340Var, true);
                z4 = false;
                x340Var.r(false);
            } else {
                z4 = z3;
                x340Var.i0(1486389344);
                x340Var.r(z4);
            }
            if (xu30Var != null) {
                x340Var.i0(1486425862);
                qim0 qim0VarN10 = anm1.N("audiobook_row_controls_play_button", pqo.h(nim0Var, z));
                gfh0 gfh0VarC10 = t1c.c(graVar, z4);
                int iHashCode11 = Long.hashCode(x340Var.T);
                xos0 xos0VarM11 = x340Var.m();
                qim0 qim0VarE11 = zr7.E(x340Var, qim0VarN10);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC10, x340Var, lljVar);
                nko1.H(xos0VarM11, x340Var, lljVar2);
                x0d.q(iHashCode11, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE11, x340Var, vu30Var);
                xu30Var8 = xu30Var;
                z5 = true;
                hrt.k(6 | ((i3 >> 3) & 112), xu30Var8, h2cVar, x340Var, true);
                z4 = false;
                x340Var.r(false);
            } else {
                xu30Var8 = xu30Var;
                z5 = true;
                x340Var.i0(1486604608);
                x340Var.r(z4);
            }
            x340Var.r(z5);
            x340Var.r(z4);
        } else {
            xu30Var7 = xu30Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ob8((Object) qim0Var, z, (Object) xu30Var8, (Object) xu30Var7, (cv30) xu30Var3, (cv30) xu30Var4, (cv30) xu30Var5, (cv30) xu30Var9, (Object) h72Var, i, (byte) 0);
        }
    }

    public static final void e(float f, boolean z, float f2, String str, boolean z2, c380 c380Var, oa0 oa0Var, u201 u201Var, iu30 iu30Var, c380 c380Var2, iu30 iu30Var2, uk21 uk21Var, b0k b0kVar, int i, int i2) {
        int i3;
        float f3;
        String str2;
        c380 c380Var3;
        int i4;
        uk21 uk21Var2;
        b0k b0kVar2;
        float f4;
        lnm lnmVar;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1383322455);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.d(12.0f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f3 = f2;
            i3 |= b0kVar3.d(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i3 |= b0kVar3.g(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((i & 196608) == 0) {
            i3 |= b0kVar3.h(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= b0kVar3.g(c380Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= b0kVar3.i(oa0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar3.i(u201Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            c380Var3 = c380Var2;
            i4 = i2 | (b0kVar3.i(c380Var3) ? 4 : 2);
        } else {
            c380Var3 = c380Var2;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.i(iu30Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.i(uk21Var) ? 256 : 128;
        }
        int i6 = i4;
        if (b0kVar3.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true)) {
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q((Object) null);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var4 = (ven0) objT4;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            if (z2) {
                b0kVar3.i0(348941983);
                b0kVar3.r(false);
                f4 = 76.0f;
            } else {
                b0kVar3.i0(349022862);
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f4 = 8.0f;
            }
            float f5 = f4;
            long j = ((long) (-((wat) b0kVar3.k(t4k.h)).i0(f5))) & 4294967295L;
            gra graVar = z ? een.f : een.d;
            nfv0 nfv0Var = new nfv0(24, true, true, true);
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = new q2j0(ven0Var, (byte) 1);
                b0kVar3.s0(objT5);
            }
            b0kVar2 = b0kVar3;
            sy4.b(graVar, j, (Function0) objT5, nfv0Var, apo.r(26414612, new t5j0(z, ven0Var, z2, str2, u201Var, c380Var3, c380Var, oa0Var, ven0Var2, ven0Var3, ven0Var4, f, f3, f5), b0kVar2), b0kVar2, 28032, 0);
            Object objT6 = b0kVar2.T();
            if (objT6 == m4cVar) {
                lnmVar = null;
                objT6 = new vk1(ven0Var, (lnm) null, (byte) 18);
                b0kVar2.s0(objT6);
            } else {
                lnmVar = null;
            }
            qxd0.t(rih1.a, b0kVar2, (vu30) objT6);
            s201 s201Var = (s201) ven0Var2.getValue();
            boolean z3 = (i6 & 112) == 32;
            Object objT7 = b0kVar2.T();
            if (z3 || objT7 == m4cVar) {
                objT7 = new ary(ven0Var2, iu30Var2, ven0Var, lnmVar, (byte) 19);
                b0kVar2.s0(objT7);
            }
            qxd0.t(s201Var, b0kVar2, (vu30) objT7);
            Boolean bool = (Boolean) ven0Var3.getValue();
            bool.getClass();
            boolean z4 = (i5 & 1879048192) == 536870912;
            Object objT8 = b0kVar2.T();
            if (z4 || objT8 == m4cVar) {
                objT8 = new c6h0(iu30Var, ven0Var3, ven0Var, ven0Var4, (lnm) null);
                b0kVar2.s0(objT8);
            }
            qxd0.t(bool, b0kVar2, (vu30) objT8);
            Boolean bool2 = (Boolean) ven0Var.getValue();
            bool2.getClass();
            boolean z5 = (i6 & 896) == 256;
            Object objT9 = b0kVar2.T();
            if (z5 || objT9 == m4cVar) {
                uk21Var2 = uk21Var;
                objT9 = new d7i0(uk21Var2, ven0Var, lnmVar, (byte) 7);
                b0kVar2.s0(objT9);
            } else {
                uk21Var2 = uk21Var;
            }
            qxd0.t(bool2, b0kVar2, (vu30) objT9);
        } else {
            uk21Var2 = uk21Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new u5j0(f, z, f2, str, z2, c380Var, oa0Var, u201Var, iu30Var, c380Var2, iu30Var2, uk21Var2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    public static final void f(aob1 aob1Var, maa maaVar, kly0 kly0Var, boolean z, b0k b0kVar, int i) {
        ArrayList arrayList;
        ?? r3;
        float fE;
        boolean z2;
        Object obj = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1449631295);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? b0kVar2.g(aob1Var) : b0kVar2.i(aob1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(maaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(kly0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.h(z) ? 2048 : 1024;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            View view = (View) b0kVar2.k(AndroidCompositionLocals_androidKt.f);
            boolean zI = b0kVar2.i(view);
            Object objT = b0kVar2.T();
            if (zI || objT == obj) {
                objT = new xy2(view, (byte) 10);
                b0kVar2.s0(objT);
            }
            qxd0.i(view, (iu30) objT, b0kVar2);
            if (aob1Var instanceof kmb1) {
                arrayList = ((kmb1) aob1Var).a;
            } else if (aob1Var instanceof pmb1) {
                arrayList = ((pmb1) aob1Var).a;
            } else {
                if (!(aob1Var instanceof wmb1)) {
                    eg.o();
                    return;
                }
                arrayList = z6x.a;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                ov70 ov70Var = (ov70) obj2;
                if ((ov70Var instanceof mv70) || (ov70Var instanceof nv70)) {
                    arrayList2.add(obj2);
                }
            }
            c380<mv70> c380VarA = mqo1.A(arrayList2);
            if (c380VarA.isEmpty()) {
                b0kVar2.i0(-66543903);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-68962740);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
                hzj.A.getClass();
                Boolean bool = null;
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
                Context context = (Context) b0kVar2.k(AndroidCompositionLocals_androidKt.b);
                Object objT2 = b0kVar2.T();
                if (objT2 == obj) {
                    objT2 = (c460) kly0Var.get();
                    b0kVar2.s0(objT2);
                }
                c460 c460Var = (c460) objT2;
                Object objT3 = b0kVar2.T();
                if (objT3 == obj) {
                    objT3 = new FrameLayout(context);
                    b0kVar2.s0(objT3);
                }
                FrameLayout frameLayout = (FrameLayout) objT3;
                boolean zI2 = b0kVar2.i(frameLayout);
                Object objT4 = b0kVar2.T();
                if (zI2 || objT4 == obj) {
                    objT4 = new dqg0(frameLayout, (byte) 1);
                    b0kVar2.s0(objT4);
                }
                iu30 iu30Var = (iu30) objT4;
                boolean zI3 = ((i2 & 7168) == 2048) | b0kVar2.i(c460Var) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && b0kVar2.i(aob1Var)));
                Object objT5 = b0kVar2.T();
                if (zI3 || objT5 == obj) {
                    r3 = 0;
                    objT5 = new wq01(c460Var, aob1Var, z, (byte) 0);
                    b0kVar2.s0(objT5);
                } else {
                    r3 = 0;
                }
                dm5.a(iu30Var, (qim0) null, (iu30) objT5, b0kVar2, 0, 2);
                xtb0 xtb0VarA = aub0.a((int) r3, b0kVar2, 3);
                boolean zG = b0kVar2.g(c380VarA);
                Object objT6 = b0kVar2.T();
                Object obj3 = objT6;
                if (zG || objT6 == obj) {
                    ArrayList arrayList3 = new ArrayList();
                    for (mv70 mv70Var : c380VarA) {
                        mv70 mv70Var2 = mv70Var instanceof mv70 ? mv70Var : null;
                        String str = mv70Var2 != null ? mv70Var2.a.b : null;
                        if (str != null) {
                            arrayList3.add(str);
                        }
                    }
                    b0kVar2.s0(arrayList3);
                    obj3 = arrayList3;
                }
                qqn1.c((List) obj3, xtb0VarA, b0kVar2, (int) r3);
                Iterator it = c380VarA.iterator();
                while (it.hasNext()) {
                    nv70 nv70Var = (ov70) it.next();
                    Boolean boolValueOf = nv70Var instanceof nv70 ? Boolean.valueOf(nv70Var.b) : nv70Var instanceof mv70 ? Boolean.valueOf(((mv70) nv70Var).a.l) : null;
                    if (boolValueOf != null) {
                        bool = boolValueOf;
                        break;
                    }
                }
                boolean zBooleanValue = bool != null ? bool.booleanValue() : r3;
                d36 d36Var = new d36(dsa0.m(b0kVar2, 2131166148), true, new um5((boolean) r3));
                float fM = dsa0.m(b0kVar2, 2131166148);
                if (z) {
                    b0kVar2.i0(597810888);
                    b0kVar2.r((boolean) r3);
                    fE = 0.0f;
                } else {
                    fE = z5c.e(b0kVar2, 597860891, 2131165289, b0kVar2, (boolean) r3);
                }
                zzq0 zzq0VarH = uyn1.h(2, fM + fE, 0.0f);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                boolean zI4 = b0kVar2.i(c380VarA) | b0kVar2.i(maaVar) | b0kVar2.h(zBooleanValue);
                Object objT7 = b0kVar2.T();
                if (zI4 || objT7 == obj) {
                    z2 = true;
                    objT7 = new wq01(c380VarA, maaVar, zBooleanValue, (byte) 1);
                    b0kVar2.s0(objT7);
                } else {
                    z2 = true;
                }
                b0kVar2 = b0kVar2;
                s3o1.e(qim0VarF2, xtb0VarA, zzq0VarH, d36Var, null, null, null, (iu30) objT7, b0kVar2, 0, 232);
                b0kVar2.r(z2);
                b0kVar2.r((boolean) r3);
            }
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0(aob1Var, maaVar, kly0Var, z, i, (byte) 5);
        }
    }

    public static final void g(final iad1 iad1Var, qim0 qim0Var, boolean z, boolean z2, boolean z3, iu30 iu30Var, j2i j2iVar, b0k b0kVar, final int i) {
        final j2i j2iVar2;
        final qim0 qim0Var2;
        final boolean z4;
        final boolean z5;
        final iu30 iu30Var2;
        final boolean z6;
        iu30 iu30Var3;
        j2i j2iVar3 = gjj.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-741495334);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(iad1Var) ? 4 : 2) | 1797504;
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = new cix0((byte) 26);
                x340Var.s0(objT);
            }
            iu30 iu30Var4 = (iu30) objT;
            t24 t24Var = iad1Var.a;
            t24 t24Var2 = iad1Var.a;
            boolean z7 = ((jad1) t24Var.h.getValue()) == jad1.c;
            x340Var.i0(-869685853);
            x340Var.r(false);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarS = wm5.s(qim0Var3, t24Var, qqq0.b, z7, 24);
            gfh0 gfh0VarC = t1c.c(een.d, true);
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarS);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z8 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z8) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar3);
            }
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarB = h2c.a.b(qim0Var3);
            fra fraVar = een.Z;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iK2 = tgp1.k(x340Var);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK2))) {
                z5c.f(iK2, x340Var, iK2, lljVar3);
            }
            nko1.H(qim0VarE2, x340Var, lljVar4);
            pw31 pw31Var = pw31.a;
            j2iVar3.invoke(pw31Var, x340Var, 54);
            x340Var.r(true);
            boolean zI = x340Var.i(iad1Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new w9(iad1Var, (byte) 26);
                x340Var.s0(objT2);
            }
            b6v b6vVar = new b6v(t24Var2, (vu30) objT2);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iK3 = tgp1.k(x340Var);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, b6vVar);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK3))) {
                z5c.f(iK3, x340Var, iK3, lljVar3);
            }
            nko1.H(qim0VarE3, x340Var, lljVar4);
            j2iVar2 = j2iVar;
            j2iVar2.invoke(pw31Var, x340Var, 54);
            x340Var.r(true);
            x340Var.r(true);
            jad1 jad1Var = (jad1) t24Var2.h.getValue();
            boolean zI2 = x340Var.i(iad1Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                iu30Var3 = iu30Var4;
                objT3 = new kwb1(iad1Var, iu30Var3, (lnm) null, (byte) 6);
                x340Var.s0(objT3);
            } else {
                iu30Var3 = iu30Var4;
            }
            qxd0.s(jad1Var, iu30Var3, (vu30) objT3, x340Var);
            z4 = true;
            iu30Var2 = iu30Var3;
            qim0Var2 = qim0Var3;
            z6 = true;
            z5 = true;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
            z4 = z;
            z5 = z3;
            iu30Var2 = iu30Var;
            z6 = z2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30(iad1Var, qim0Var2, z4, z6, z5, iu30Var2, j2iVar2, i) { // from class: p.had1
                public final /* synthetic */ iad1 a;
                public final /* synthetic */ qim0 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ iu30 f;
                public final /* synthetic */ j2i g;

                {
                    j2i j2iVar4 = gjj.a;
                }

                public final Object invoke(Object obj, Object obj2) {
                    j2i j2iVar4 = gjj.a;
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(12582969);
                    gxo1.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static kn10 h(int i) {
        for (kn10 kn10Var : kn10.values()) {
            if (kn10Var.a == i) {
                return kn10Var;
            }
        }
        return kn10.b;
    }

    public static final int i(ei90 ei90Var) {
        if (ei90Var instanceof i53) {
            return 3;
        }
        if (ei90Var instanceof jb6) {
            return 1;
        }
        if (ei90Var instanceof tfu0) {
            return 2;
        }
        if (!(ei90Var instanceof jjf1) && !(ei90Var instanceof cu7) && !(ei90Var instanceof k48) && !(ei90Var instanceof v68) && !(ei90Var instanceof ji40) && !(ei90Var instanceof fww0) && !(ei90Var instanceof tm8) && !(ei90Var instanceof i6k) && !(ei90Var instanceof xui1) && !(ei90Var instanceof yma0) && !(ei90Var instanceof k39) && !(ei90Var instanceof yf51) && !(ei90Var instanceof o2v0)) {
            eg.o();
        }
        return 0;
    }

    public static ha70 j(pc70 pc70Var) {
        Object objJ = ((ld70) pc70Var).a.e.j("style");
        if (objJ instanceof ha70) {
            return (ha70) objJ;
        }
        return objJ instanceof String ? (ha70) ga70.a.G(objJ.toString()).e(ha70.b) : ha70.b;
    }

    public static String k(htf htfVar, c8a0 c8a0Var) {
        if (htfVar.a(c8a0Var)) {
            return null;
        }
        return htfVar.getDescription();
    }

    public static final cuu0 l(qxc0 qxc0Var, wa71 wa71Var) {
        String str = qxc0Var.a;
        wls0 wls0Var = qxc0Var.i;
        String str2 = qxc0Var.e;
        return qxc0Var.t.h.b.contains(wls0.f) ? new auu0(str2, str, wls0Var, wa71Var.g.getBoolean("playlist.share.is_inviting_contributors", false)) : new buu0(str2, wls0Var, str);
    }

    public static final String m(Context context, qxc0 qxc0Var, fuj0 fuj0Var) {
        String str;
        String str2;
        pxc0 pxc0Var = qxc0Var.c;
        if (pxc0Var != null && (str = pxc0Var.b) != null) {
            String str3 = null;
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                if (fuj0Var != null && fuj0Var.a) {
                    return context.getString(2131960135, str);
                }
                pxc0 pxc0Var2 = qxc0Var.V0;
                if (pxc0Var2 != null && (str2 = pxc0Var2.b) != null && str2.length() > 0) {
                    str3 = str2;
                }
                return str3 != null ? context.getString(2131960134, str3) : context.getString(2131960133, str);
            }
        }
        return context.getString(2131960136);
    }

    public static final void n(DrawScope drawScope, o4w o4wVar, long j, float f, float f2, float f3, float f4) {
        List list = o4wVar.a;
        tw4 tw4VarA = ww4.a();
        long j2 = 4294967295L;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        Iterator it = o4wVar.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            c4w c4wVar = (c4w) next;
            int i3 = c4wVar.a;
            float f5 = c4wVar.e;
            float f6 = c4wVar.d;
            List list2 = c4wVar.c;
            xz3 xz3Var = (xz3) list.get(i3);
            xz3 xz3Var2 = (xz3) list.get(c4wVar.b);
            float f7 = f4 * f3;
            long j3 = j2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xz3Var.a >> 32)) * f7;
            float fIntBitsToFloat3 = (1.0f - Float.intBitsToFloat((int) (xz3Var.a & j3))) * fIntBitsToFloat;
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (xz3Var2.a >> 32)) * f7;
            Iterator it2 = it;
            List list3 = list;
            float fIntBitsToFloat5 = (1.0f - Float.intBitsToFloat((int) (xz3Var2.a & j3))) * fIntBitsToFloat;
            if (i == 0) {
                tw4VarA.k(fIntBitsToFloat2, fIntBitsToFloat3);
            }
            int size = list2.size();
            if (size == 0) {
                tw4VarA.j(fIntBitsToFloat4, fIntBitsToFloat5);
            } else if (size == 1) {
                long j4 = ((Offset) list2.get(0)).a;
                tw4VarA.a.quadTo((((f5 - f6) * Float.intBitsToFloat((int) (j4 >> 32))) + f6) * f7, (1.0f - Float.intBitsToFloat((int) (j4 & j3))) * fIntBitsToFloat, fIntBitsToFloat4, fIntBitsToFloat5);
            } else if (size != 2) {
                tw4VarA.j(fIntBitsToFloat4, fIntBitsToFloat5);
            } else {
                long j5 = ((Offset) list2.get(0)).a;
                long j6 = ((Offset) list2.get(1)).a;
                float f8 = f5 - f6;
                tw4VarA.h(((Float.intBitsToFloat((int) (j5 >> 32)) * f8) + f6) * f7, (1.0f - Float.intBitsToFloat((int) (j5 & j3))) * fIntBitsToFloat, ((Float.intBitsToFloat((int) (j6 >> 32)) * f8) + f6) * f7, (1.0f - Float.intBitsToFloat((int) (j6 & j3))) * fIntBitsToFloat, fIntBitsToFloat4, fIntBitsToFloat5);
            }
            i = i2;
            list = list3;
            j2 = j3;
            it = it2;
        }
        DrawScope.w0(drawScope, tw4VarA, u7h.b(j, f, 0.0f, 0.0f, 0.0f, 14), new phc1(f2, 0.0f, 1, 1, (uw4) null, 18), 52);
    }

    public static final void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bhn0.i("null not expected: ".concat(str));
    }

    public static final int p(xkk1 xkk1Var, q37 q37Var) {
        c47 c47Var;
        pp70 pp70Var = xkk1Var.d;
        if (pp70Var != null) {
            return z4p1.G(pp70Var.a.a.c);
        }
        pp70 pp70Var2 = xkk1Var.a.b;
        if (pp70Var2 != null) {
            return z4p1.G(pp70Var2.a.a.c);
        }
        Integer numValueOf = (q37Var == null || (c47Var = q37Var.a) == null) ? null : Integer.valueOf(c47Var.a);
        return numValueOf != null ? numValueOf.intValue() : wkk1.i.d;
    }

    public static final String q(xkk1 xkk1Var) {
        String str;
        up70 up70VarA = xkk1Var.a.a(vp70.d);
        String str2 = null;
        if (up70VarA != null && (str = up70VarA.a.a) != null && str.length() > 0) {
            str2 = str;
        }
        return str2 == null ? "" : str2;
    }

    public static final ArrayList r(List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            Iterator it = ((eri1) obj).a().iterator();
            while (it.hasNext()) {
                arrayList.add("[" + i + "] " + ((String) it.next()));
            }
            i = i2;
        }
        return arrayList;
    }
}
