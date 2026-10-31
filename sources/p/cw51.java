package p;

import app.p000rive.semantics.SemanticState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class cw51 {
    public static final kgx a = new kgx(0, ((pgx) ogx.e).b, qr51.X, (vu30) null, 9);

    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0113  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0131  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x0168  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x0175  */
    /* JADX WARN: Code duplicated, block: B:84:0x017c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0187  */
    /* JADX WARN: Code duplicated, block: B:91:0x018f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0194  */
    public static final void a(String str, boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, boolean z3, b0k b0kVar, int i) {
        boolean z4;
        b0k b0kVar2;
        qim0 qim0Var2;
        int i2;
        int i3;
        String strK;
        int i4;
        int i5;
        String strO0;
        String strO1;
        qim0 qim0Var3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objT;
        String str2;
        qim0 qim0Var4;
        String str3;
        kgx kgxVar;
        vzq0 zzq0Var;
        float f;
        float f2;
        vdx vdxVar;
        String str4 = str;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1901703343);
        int i6 = i | (b0kVar3.g(str4) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.h(z2) ? 256 : SemanticState.Focused) | (b0kVar3.i(function0) ? SemanticState.Modal : SemanticState.ReadOnly) | (b0kVar3.i(function1) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | 196608 | (b0kVar3.h(z3) ? 1048576 : 524288);
        if (b0kVar3.Y(i6 & 1, (599187 & i6) != 599186)) {
            if (z2) {
                i2 = -2119145146;
                i3 = 2131952894;
            } else {
                if (str4 != null) {
                    b0kVar3.i0(-2119142404);
                    b0kVar3.r(false);
                    strK = str4;
                } else {
                    i2 = -2119141472;
                    i3 = 2131952879;
                }
                if (z2) {
                    i4 = -2119137656;
                    i5 = 2131952878;
                } else if (z) {
                    i4 = -2119134966;
                    i5 = 2131952891;
                } else {
                    i4 = -2119132599;
                    i5 = 2131952876;
                }
                String strK2 = x0d.k(b0kVar3, i4, i5, b0kVar3, false);
                strO0 = cwl1.o0(b0kVar3, 2131952875);
                strO1 = cwl1.o0(b0kVar3, 2131952893);
                qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                if ((i6 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i6 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zG = z6 | z5 | b0kVar3.g(strO1);
                if ((i6 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zG2 = zG | z7 | b0kVar3.g(strO0);
                if ((i6 & 57344) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zG2 | z8;
                objT = b0kVar3.T();
                if (!z9 || objT == fkj0.X) {
                    str2 = strO0;
                    qim0Var4 = qim0Var3;
                    str3 = strO1;
                    gdv gdvVar = new gdv((byte) 5, str, str3, str2, function0, function1, z2);
                    b0kVar3.s0(gdvVar);
                    objT = gdvVar;
                } else {
                    qim0Var4 = qim0Var3;
                    str3 = strO1;
                    str2 = strO0;
                }
                qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
                if (z3) {
                    kgxVar = a;
                } else {
                    kgxVar = ogx.e;
                }
                kgx kgxVar2 = kgxVar;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                zzq0Var = new zzq0(12.0f, 12.0f, 12.0f, 12.0f);
                cvx cvxVar5 = cbx.b(b0kVar3).b;
                if ((30 & 1) != 0) {
                    f = 4.0f;
                } else {
                    f = 2.0f;
                }
                float f3 = f;
                if ((30 & 2) != 0) {
                    f2 = 12.0f;
                } else {
                    f2 = 0.0f;
                }
                float f4 = (30 & 4) != 0 ? 8.0f : 0.0f;
                if ((30 & 8) == 0) {
                    zzq0Var = null;
                }
                vzq0 vzq0Var = zzq0Var;
                if ((30 & 16) != 0) {
                    vdxVar = vdx.a;
                } else {
                    vdxVar = wdx.a;
                }
                ydx ydxVar = new ydx(f3, f2, f4, vzq0Var, vdxVar);
                j2i j2iVar = ufj.a;
                j2i j2iVarR = apo.r(738111318, new iww0(strK2, (byte) 16), b0kVar3);
                str4 = str;
                z4 = z2;
                b0kVar2 = b0kVar3;
                ioo1.c(qim0VarB, kgxVar2, ydxVar, (hw61) null, (max) null, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, j2iVar, (xu30) null, j2iVarR, apo.r(-2046834153, new j6v(z4, str4, str3, str2, function0, function1), b0kVar3), (xu30) null, (xu30) null, apo.r(-1811735974, new ay00(strK, str4, z4), b0kVar3), b0kVar2, 12583424, 1576326, 52088);
                qim0Var2 = qim0Var4;
            }
            strK = x0d.k(b0kVar3, i2, i3, b0kVar3, false);
            if (z2) {
                i4 = -2119137656;
                i5 = 2131952878;
            } else if (z) {
                i4 = -2119134966;
                i5 = 2131952891;
            } else {
                i4 = -2119132599;
                i5 = 2131952876;
            }
            String strK3 = x0d.k(b0kVar3, i4, i5, b0kVar3, false);
            strO0 = cwl1.o0(b0kVar3, 2131952875);
            strO1 = cwl1.o0(b0kVar3, 2131952893);
            qim0Var3 = nim0.a;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            if ((i6 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i6 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean zG3 = z6 | z5 | b0kVar3.g(strO1);
            if ((i6 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean zG4 = zG3 | z7 | b0kVar3.g(strO0);
            if ((i6 & 57344) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = zG4 | z8;
            objT = b0kVar3.T();
            if (z9) {
                str2 = strO0;
                qim0Var4 = qim0Var3;
                str3 = strO1;
                gdv gdvVar2 = new gdv((byte) 5, str, str3, str2, function0, function1, z2);
                b0kVar3.s0(gdvVar2);
                objT = gdvVar2;
            } else {
                str2 = strO0;
                qim0Var4 = qim0Var3;
                str3 = strO1;
                gdv gdvVar3 = new gdv((byte) 5, str, str3, str2, function0, function1, z2);
                b0kVar3.s0(gdvVar3);
                objT = gdvVar3;
            }
            qim0 qim0VarB2 = s161.b(qim0VarF2, true, (iu30) objT);
            if (z3) {
                kgxVar = a;
            } else {
                kgxVar = ogx.e;
            }
            kgx kgxVar3 = kgxVar;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar6 = cbx.b(b0kVar3).b;
            cvx cvxVar7 = cbx.b(b0kVar3).b;
            cvx cvxVar8 = cbx.b(b0kVar3).b;
            cvx cvxVar9 = cbx.b(b0kVar3).b;
            zzq0Var = new zzq0(12.0f, 12.0f, 12.0f, 12.0f);
            cvx cvxVar10 = cbx.b(b0kVar3).b;
            if ((30 & 1) != 0) {
                f = 4.0f;
            } else {
                f = 2.0f;
            }
            float f5 = f;
            if ((30 & 2) != 0) {
                f2 = 12.0f;
            } else {
                f2 = 0.0f;
            }
            float f6 = (30 & 4) != 0 ? 8.0f : 0.0f;
            if ((30 & 8) == 0) {
                zzq0Var = null;
            }
            vzq0 vzq0Var2 = zzq0Var;
            if ((30 & 16) != 0) {
                vdxVar = vdx.a;
            } else {
                vdxVar = wdx.a;
            }
            ydx ydxVar2 = new ydx(f5, f2, f6, vzq0Var2, vdxVar);
            j2i j2iVar2 = ufj.a;
            j2i j2iVarR2 = apo.r(738111318, new iww0(strK3, (byte) 16), b0kVar3);
            str4 = str;
            z4 = z2;
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarB2, kgxVar3, ydxVar2, (hw61) null, (max) null, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, j2iVar2, (xu30) null, j2iVarR2, apo.r(-2046834153, new j6v(z4, str4, str3, str2, function0, function1), b0kVar3), (xu30) null, (xu30) null, apo.r(-1811735974, new ay00(strK, str4, z4), b0kVar3), b0kVar2, 12583424, 1576326, 52088);
            qim0Var2 = qim0Var4;
        } else {
            z4 = z2;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x140(str4, z, z4, function0, function1, qim0Var2, z3, i);
        }
    }
}
