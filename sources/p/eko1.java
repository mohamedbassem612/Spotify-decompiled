package p;

import androidx.car.app.model.Alert;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class eko1 {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();
    public static b180 f;

    /* JADX WARN: Code duplicated, block: B:102:0x0196  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:81:0x014f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177 A[LOOP:1: B:88:0x0175->B:89:0x0177, LOOP_END] */
    public static int A(int i, int i2, CharSequence charSequence) {
        float[] fArr;
        int i3;
        int[] iArr;
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        int i8;
        if (i >= charSequence.length()) {
            return i2;
        }
        float f2 = 2.0f;
        int i9 = 5;
        float f3 = 1.0f;
        int i10 = 2;
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i2] = 0.0f;
        }
        int i11 = 0;
        while (true) {
            int i12 = i + i11;
            if (i12 == charSequence.length()) {
                byte[] bArr2 = new byte[6];
                int[] iArr2 = new int[6];
                int iU = u(fArr, iArr2, bArr2);
                int i13 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    i13 += bArr2[i14];
                }
                if (iArr2[0] == iU) {
                    break;
                }
                if (i13 == 1 && bArr2[i9] > 0) {
                    return i9;
                }
                if (i13 != 1 || bArr2[4] <= 0) {
                    if (i13 != 1 || bArr2[i10] <= 0) {
                        return (i13 != 1 || bArr2[3] <= 0) ? 1 : 3;
                    }
                    return i10;
                }
                return 4;
            }
            char cCharAt = charSequence.charAt(i12);
            i11++;
            if (x(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (y(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f2;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f3;
            }
            int i15 = i9;
            float f4 = f3;
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9')) {
                i3 = i10;
            } else {
                i3 = i10;
                if (cCharAt < 'A' || cCharAt > 'Z') {
                    if (y(cCharAt)) {
                        fArr[1] = fArr[1] + 2.6666667f;
                    } else {
                        fArr[1] = fArr[1] + 1.3333334f;
                    }
                }
                if (cCharAt != ' ' || ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    fArr[i3] = fArr[i3] + 0.6666667f;
                } else if (y(cCharAt)) {
                    fArr[i3] = fArr[i3] + 2.6666667f;
                } else {
                    fArr[i3] = fArr[i3] + 1.3333334f;
                }
                if (z(cCharAt)) {
                    fArr[3] = fArr[3] + 0.6666667f;
                } else if (y(cCharAt)) {
                    fArr[3] = fArr[3] + 4.3333335f;
                } else {
                    fArr[3] = fArr[3] + 3.3333333f;
                }
                if (cCharAt < ' ' && cCharAt <= '^') {
                    fArr[4] = fArr[4] + 0.75f;
                } else if (y(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
                fArr[i15] = fArr[i15] + f4;
                if (i11 >= 4) {
                    iArr = new int[6];
                    bArr = new byte[6];
                    u(fArr, iArr, bArr);
                    i5 = 0;
                    for (i4 = 0; i4 < 6; i4++) {
                        i5 += bArr[i4];
                    }
                    i6 = iArr[0];
                    i7 = iArr[i15];
                    if (i6 >= i7 && i6 < iArr[1] && i6 < iArr[i3] && i6 < iArr[3] && i6 < iArr[4]) {
                        break;
                    }
                    if (i7 >= i6) {
                        return i15;
                    }
                    b2 = bArr[1];
                    b3 = bArr[i3];
                    b4 = bArr[3];
                    b5 = bArr[4];
                    if (b2 + b3 + b4 + b5 == 0) {
                        return i15;
                    }
                    if (i5 != 1 && b5 > 0) {
                        return 4;
                    }
                    if (i5 != 1 && b3 > 0) {
                        return i3;
                    }
                    if (i5 == 1 || b4 <= 0) {
                        int i16 = iArr[1];
                        i8 = i16 + 1;
                        if (i8 < i6 && i8 < i7 && i8 < iArr[4] && i8 < iArr[i3]) {
                            int i17 = iArr[3];
                            if (i16 >= i17) {
                                if (i16 == i17) {
                                    for (int i18 = i + i11 + 1; i18 < charSequence.length(); i18++) {
                                        char cCharAt2 = charSequence.charAt(i18);
                                        if (cCharAt2 == '\r' || cCharAt2 == '*' || cCharAt2 == '>') {
                                            return 3;
                                        }
                                        if (!z(cCharAt2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i9 = i15;
                f3 = f4;
                i10 = i3;
                f2 = 2.0f;
            }
            fArr[1] = fArr[1] + 0.6666667f;
            if (cCharAt != ' ') {
                fArr[i3] = fArr[i3] + 0.6666667f;
            } else {
                fArr[i3] = fArr[i3] + 0.6666667f;
            }
            if (z(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (y(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt < ' ') {
                if (y(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            } else if (y(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[i15] = fArr[i15] + f4;
            if (i11 >= 4) {
                iArr = new int[6];
                bArr = new byte[6];
                u(fArr, iArr, bArr);
                i5 = 0;
                while (i4 < 6) {
                    i5 += bArr[i4];
                }
                i6 = iArr[0];
                i7 = iArr[i15];
                if (i6 >= i7) {
                }
                if (i7 >= i6) {
                    return i15;
                }
                b2 = bArr[1];
                b3 = bArr[i3];
                b4 = bArr[3];
                b5 = bArr[4];
                if (b2 + b3 + b4 + b5 == 0) {
                    return i15;
                }
                if (i5 != 1) {
                }
                if (i5 != 1) {
                }
                if (i5 == 1) {
                }
                int i19 = iArr[1];
                i8 = i19 + 1;
                if (i8 < i6) {
                    continue;
                }
            }
            i9 = i15;
            f3 = f4;
            i10 = i3;
            f2 = 2.0f;
        }
        return 0;
    }

    public static final void B(r1c0 r1c0Var, c8e1 c8e1Var, hyp0 hyp0Var) {
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            z9e1 z9e1VarD = r1c0Var.d();
            if (z9e1VarD == null) {
                return;
            }
            c9e1 c9e1Var = r1c0Var.e;
            if (c9e1Var == null) {
                return;
            }
            elb0 elb0VarC = r1c0Var.c();
            if (elb0VarC == null) {
                return;
            }
            d3p1.D(c8e1Var, r1c0Var.a, z9e1VarD.a, elb0VarC, c9e1Var, r1c0Var.b(), hyp0Var);
        } finally {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
        }
    }

    public static final Object C(ai90 ai90Var, y5v0 y5v0Var, a8d1 a8d1Var) {
        boolean z = ai90Var instanceof fh90;
        rih1 rih1Var = rih1.a;
        if (z) {
            fh90 fh90Var = (fh90) ai90Var;
            Object objI = fc11.i(y5v0Var.c(fh90Var.d, true, fh90Var.c, fh90Var.a, fh90Var.b, "", fh90Var.e, "", (v740) null), a8d1Var);
            if (objI == d9n.a) {
                return objI;
            }
        } else if (ai90Var instanceof ih90) {
            y5v0Var.a(((ih90) ai90Var).e, (String) null);
        }
        return rih1Var;
    }

    public static final void D(z8e1 z8e1Var, r1c0 r1c0Var, c8e1 c8e1Var, x180 x180Var, hyp0 hyp0Var) {
        jut jutVar = r1c0Var.d;
        l7n l7nVar = r1c0Var.v;
        l7n l7nVar2 = r1c0Var.w;
        p811 p811Var = new p811();
        d5e1 d5e1Var = new d5e1(jutVar, l7nVar, p811Var, (byte) 0);
        vdt0 vdt0Var = z8e1Var.a;
        vdt0Var.h(c8e1Var, x180Var, d5e1Var, l7nVar2);
        c9e1 c9e1Var = new c9e1(z8e1Var, vdt0Var);
        z8e1Var.b.set(c9e1Var);
        p811Var.a = c9e1Var;
        r1c0Var.e = c9e1Var;
        B(r1c0Var, c8e1Var, hyp0Var);
    }

    public static final vio1 E(Integer num, String str) {
        hm00 hm00Var = new hm00(Executors.newSingleThreadExecutor(new gko1(num, str)));
        return new vio1(smo1.e(flo1.l(guo1.B(), pjo1.g).y(hm00Var)), hm00Var);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x0216  */
    public static final void a(io6 io6Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        boolean z2;
        long j;
        bnx bnxVar;
        boolean z3;
        boolean z4;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(754561384);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = (b0kVar2.g(io6Var) ? 4 : 2) | i | (b0kVar2.i(iu30Var) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = io6Var.c;
            mo6 mo6Var = io6Var.a;
            if (str == null) {
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new pp5(io6Var, iu30Var, i, (byte) 10);
                    return;
                }
                return;
            }
            boolean z5 = mo6Var == mo6.g;
            boolean z6 = mo6Var == mo6.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var4, 16.0f);
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarR, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z7 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            if (z6) {
                b0kVar2.i0(-1262303172);
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                qim0 qim0VarH = u291.h(qim0Var4, 20.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarH);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, lljVar);
                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar4);
                qim0Var3 = qim0Var4;
                suo1.f(cwl1.o0(b0kVar2, 2131952159), 2, (qim0) null, 1, b0kVar2, 24624, 12);
                z = true;
                b0kVar2.r(true);
                b0kVar2.r(false);
                z2 = false;
            } else {
                qim0Var3 = qim0Var4;
                z = true;
                if (mo6Var == mo6.i) {
                    b0kVar2.i0(-1261504209);
                    z2 = false;
                    cwl1.f(i3o1.n(2131233091, b0kVar2, 0), (String) null, qim0VarB, (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, b0kVar2, 56, 120);
                    b0kVar2 = b0kVar2;
                    b0kVar2.r(false);
                } else {
                    z2 = false;
                    b0kVar2.i0(-1261315698);
                    if (z5) {
                        b0kVar2.i0(-1261275770);
                        b0kVar2.r(false);
                        j = ((wex) ((gmt) zex.a.c).c).b;
                    } else {
                        b0kVar2.i0(-1261191264);
                        j = cbx.a(b0kVar2).b.b;
                        b0kVar2.r(false);
                    }
                    switch (mo6Var.ordinal()) {
                        case 0:
                        case 8:
                        case 9:
                            bnxVar = nkx.c;
                            break;
                        case 1:
                            bnxVar = akx.c;
                            break;
                        case 2:
                        case 3:
                            bnxVar = grx.c;
                            break;
                        case 4:
                            bnxVar = nkx.c;
                            break;
                        case 5:
                            bnxVar = wtx.c;
                            break;
                        case 6:
                        case 7:
                            bnxVar = bnx.c;
                            break;
                        default:
                            eg.o();
                            return;
                    }
                    z3 = z5;
                    w0h1.a(bnxVar, isl.a, qim0VarB, j, 0L, z3, b0kVar2, 56, 16);
                    b0kVar2.r(false);
                }
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                op71.g(b0kVar2, u291.v(qim0Var3, 8.0f));
                if (z3) {
                    b0kVar2.i0(-871954350);
                    g(str, cwl1.o0(b0kVar2, 2131963729), "https://support.spotify.com/article/verified-by-spotify/", iu30Var, b0kVar2, ((i2 << 6) & 7168) | 384);
                    b0kVar2.r(z2);
                } else {
                    z4 = z2;
                    if (z6) {
                        b0kVar2.i0(-871946028);
                        g(str, cwl1.o0(b0kVar2, 2131952160), "https://support.spotify.com/article/ai-persona-badge/", iu30Var, b0kVar2, ((i2 << 6) & 7168) | 384);
                        b0kVar2.r(z4);
                    } else {
                        b0kVar2.i0(-871937952);
                        uwo1.e(str, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                        b0kVar2.r(z4);
                        z = true;
                    }
                }
                b0kVar2.r(z);
                qim0Var2 = qim0Var3;
            }
            z3 = z5;
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(qim0Var3, 8.0f));
            if (z3) {
                b0kVar2.i0(-871954350);
                g(str, cwl1.o0(b0kVar2, 2131963729), "https://support.spotify.com/article/verified-by-spotify/", iu30Var, b0kVar2, ((i2 << 6) & 7168) | 384);
                b0kVar2.r(z2);
            } else {
                z4 = z2;
                if (z6) {
                    b0kVar2.i0(-871946028);
                    g(str, cwl1.o0(b0kVar2, 2131952160), "https://support.spotify.com/article/ai-persona-badge/", iu30Var, b0kVar2, ((i2 << 6) & 7168) | 384);
                    b0kVar2.r(z4);
                } else {
                    b0kVar2.i0(-871937952);
                    uwo1.e(str, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                    b0kVar2.r(z4);
                    z = true;
                }
            }
            b0kVar2.r(z);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new oj2(io6Var, iu30Var, qim0Var2, i, (byte) 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:105:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x02de  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:115:0x0312  */
    /* JADX WARN: Code duplicated, block: B:117:0x0317  */
    /* JADX WARN: Code duplicated, block: B:120:0x0325  */
    /* JADX WARN: Code duplicated, block: B:123:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[LOOP:1: B:86:0x027e->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x014e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0177  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x021d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0250  */
    /* JADX WARN: Code duplicated, block: B:81:0x0256  */
    /* JADX WARN: Code duplicated, block: B:84:0x0277 A[EDGE_INSN: B:84:0x0277->B:98:0x02bc BREAK  A[LOOP:1: B:86:0x027e->B:128:?]] */
    /* JADX WARN: Code duplicated, block: B:85:0x027a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0284  */
    /* JADX WARN: Code duplicated, block: B:93:0x029f  */
    public static final void b(c380 c380Var, qim0 qim0Var, boolean z, boolean z2, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        xu30 xu30Var2;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        qim0 qim0Var2;
        boolean z6;
        xu30 xu30Var3;
        h311 h311VarV;
        boolean z7;
        qim0 qim0Var3;
        qim0 qim0Var4;
        float f2;
        nl3 nl3Var;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z8;
        Function0 function0;
        llj lljVar;
        llj lljVar2;
        xu30 xu30Var4;
        llj lljVar3;
        llj lljVar4;
        Function0 function1;
        llj lljVar5;
        nl3 nl3Var2;
        boolean z9;
        qim0 qim0Var5;
        Iterator it;
        ArrayList arrayList;
        c380 c380VarA1;
        int i9;
        int i10;
        io6 io6Var;
        boolean z10;
        boolean zG;
        Object objT;
        Object objT2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1466071678);
        j06 j06Var = ((x340) b0kVar2).a;
        int i11 = (b0kVar2.g(c380Var) ? 4 : 2) | i;
        int i12 = i11 | 48;
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                z3 = z;
                i12 |= b0kVar2.h(z3) ? SemanticState.Hidden : SemanticState.Focused;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                i5 = i12 | 3072;
            } else {
                if (b0kVar2.h(z2)) {
                    i4 = SemanticState.Modal;
                } else {
                    i4 = SemanticState.ReadOnly;
                }
                i5 = i12 | i4;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                i8 = i5 | 24576;
                xu30Var2 = xu30Var;
            } else {
                xu30Var2 = xu30Var;
                if (b0kVar2.i(xu30Var2)) {
                    i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i7 = SemanticState.Multiline;
                }
                i8 = i5 | i7;
            }
            z4 = false;
            if ((i8 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar2.Y(i8 & 1, z5)) {
                if (i13 != 0) {
                    z3 = true;
                }
                if (i3 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                if (i6 != 0) {
                    objT2 = b0kVar2.T();
                    if (objT2 == m4cVar) {
                        objT2 = o40.P0;
                        b0kVar2.s0(objT2);
                    }
                    xu30Var2 = (xu30) objT2;
                }
                qim0Var3 = nim0.a;
                qim0 qim0VarN = anm1.N("ArtistFactsCard", qim0Var3);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarN, cbx.a(b0kVar2).a.a.a(), er31.b(8.0f));
                cvx cvxVar = cbx.b(b0kVar2).b;
                qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                if (z3 || z7) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0VarX;
                }
                qim0 qim0VarThen = qim0VarF2.then(qim0Var4);
                if (z7) {
                    b0kVar2.i0(145634406);
                    cvx cvxVar2 = cbx.b(b0kVar2).b;
                    b0kVar2.r(false);
                    f2 = 8.0f;
                } else {
                    b0kVar2.i0(145635973);
                    cvx cvxVar3 = cbx.b(b0kVar2).b;
                    b0kVar2.r(false);
                    f2 = 12.0f;
                }
                d36 d36Var = new d36(f2, true, new um5(z4));
                nl3Var = een.P0;
                mbhVarA = jbh.a(d36Var, nl3Var, b0kVar2, 0);
                iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0VarM = b0kVar2.m();
                qim0VarE = zr7.E(b0kVar2, qim0VarThen);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                z8 = ((x340) b0kVar2).S;
                function0 = hmb0.t1;
                if (z8) {
                    b0kVar2.l(function0);
                } else {
                    b0kVar2.v0();
                }
                lljVar = y580.O0;
                nko1.H(mbhVarA, b0kVar2, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                xu30Var4 = xu30Var2;
                lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar2, lljVar3);
                nko1.F(b0kVar2);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar2, lljVar4);
                if (z3) {
                    b0kVar2.i0(696640500);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM2 = b0kVar2.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar2, qim0Var3);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(function0);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(jw31VarA, b0kVar2, lljVar);
                    nko1.H(xos0VarM2, b0kVar2, lljVar2);
                    x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                    nko1.H(qim0VarE2, b0kVar2, lljVar4);
                    function1 = function0;
                    lljVar5 = lljVar3;
                    nl3Var2 = nl3Var;
                    qim0Var2 = qim0Var3;
                    z9 = true;
                    uwo1.e(cwl1.o0(b0kVar2, 2131952451), (qim0) null, cbx.d(b0kVar2).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2042);
                    b0kVar2 = b0kVar2;
                    cvx cvxVar4 = cbx.b(b0kVar2).b;
                    op71.g(b0kVar2, u291.v(qim0Var2, 4.0f));
                    p9p1.b((qim0) null, 0, 0, b0kVar2, 0, 7);
                    b0kVar2.r(true);
                    b0kVar2.r(false);
                } else {
                    qim0Var2 = qim0Var3;
                    function1 = function0;
                    lljVar5 = lljVar3;
                    nl3Var2 = nl3Var;
                    z9 = true;
                    b0kVar2.i0(696953786);
                    b0kVar2.r(false);
                }
                qim0 qim0VarF3 = u291.f(qim0Var2, 1.0f);
                if (z3 == 0 && z7) {
                    qim0Var5 = qim0VarX;
                } else {
                    qim0Var5 = qim0Var2;
                }
                qim0 qim0VarThen2 = qim0VarF3.then(qim0Var5);
                cvx cvxVar5 = cbx.b(b0kVar2).b;
                mbh mbhVarA2 = jbh.a(new d36(12.0f, z9, new um5(false)), nl3Var2, b0kVar2, 0);
                int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM3 = b0kVar2.m();
                qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarThen2);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA2, b0kVar2, lljVar);
                nko1.H(xos0VarM3, b0kVar2, lljVar2);
                x0d.q(iHashCode3, b0kVar2, lljVar5, b0kVar2);
                nko1.H(qim0VarE3, b0kVar2, lljVar4);
                b0kVar2.i0(1323885608);
                if (c380Var.isEmpty()) {
                    c380VarA1 = c380Var;
                    break;
                }
                it = c380Var.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c380VarA1 = c380Var;
                        break;
                    }
                    if (((io6) it.next()).a == mo6.c) {
                        arrayList = new ArrayList();
                        for (Object obj : c380Var) {
                            if (((io6) obj).a == mo6.g) {
                                arrayList.add(obj);
                            }
                        }
                        c380VarA1 = o7h.a1(arrayList, new k0d((byte) 22));
                        break;
                    }
                }
                i9 = 0;
                for (Object obj2 : (Iterable) c380VarA1) {
                    i10 = i9 + 1;
                    if (i9 >= 0) {
                        p7h.T();
                        throw null;
                    }
                    io6Var = (io6) obj2;
                    if ((i8 & 57344) == 16384) {
                        z10 = z9;
                    } else {
                        z10 = false;
                    }
                    zG = z10 | b0kVar2.g(io6Var) | b0kVar2.e(i9);
                    objT = b0kVar2.T();
                    if (zG || objT == m4cVar) {
                        objT = new gu2(xu30Var4, io6Var, i9, (byte) 3);
                        b0kVar2.s0(objT);
                    }
                    a(io6Var, (iu30) objT, null, b0kVar2, 0);
                    i9 = i10;
                }
                us71.m(b0kVar2, false, z9, z9);
                boolean z11 = z7;
                xu30Var3 = xu30Var4;
                z6 = z11;
                z3 = z3;
            } else {
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                z6 = z2;
                xu30Var3 = xu30Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new no6(c380Var, qim0Var2, z3, z6, xu30Var3, i, i2, (byte) 0);
            }
        }
        i12 = i11 | 432;
        z3 = z;
        i3 = i2 & 8;
        if (i3 != 0) {
            i5 = i12 | 3072;
        } else {
            if (b0kVar2.h(z2)) {
                i4 = SemanticState.Modal;
            } else {
                i4 = SemanticState.ReadOnly;
            }
            i5 = i12 | i4;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            i8 = i5 | 24576;
            xu30Var2 = xu30Var;
        } else {
            xu30Var2 = xu30Var;
            if (b0kVar2.i(xu30Var2)) {
                i7 = TlsSocketProvider.READ_BUFFER_SIZE;
            } else {
                i7 = SemanticState.Multiline;
            }
            i8 = i5 | i7;
        }
        z4 = false;
        if ((i8 & 9363) != 9362) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (b0kVar2.Y(i8 & 1, z5)) {
            if (i13 != 0) {
                z3 = true;
            }
            if (i3 != 0) {
                z7 = false;
            } else {
                z7 = z2;
            }
            if (i6 != 0) {
                objT2 = b0kVar2.T();
                if (objT2 == m4cVar) {
                    objT2 = o40.P0;
                    b0kVar2.s0(objT2);
                }
                xu30Var2 = (xu30) objT2;
            }
            qim0Var3 = nim0.a;
            qim0 qim0VarN2 = anm1.N("ArtistFactsCard", qim0Var3);
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarF4 = dug.f(qim0VarN2, cbx.a(b0kVar2).a.a.a(), er31.b(8.0f));
            cvx cvxVar6 = cbx.b(b0kVar2).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarF4, 16.0f);
            qim0 qim0VarF5 = u291.f(qim0Var3, 1.0f);
            if (z3) {
                qim0Var4 = qim0Var3;
            } else {
                qim0Var4 = qim0Var3;
            }
            qim0 qim0VarThen3 = qim0VarF5.then(qim0Var4);
            if (z7) {
                b0kVar2.i0(145634406);
                cvx cvxVar7 = cbx.b(b0kVar2).b;
                b0kVar2.r(false);
                f2 = 8.0f;
            } else {
                b0kVar2.i0(145635973);
                cvx cvxVar8 = cbx.b(b0kVar2).b;
                b0kVar2.r(false);
                f2 = 12.0f;
            }
            d36 d36Var2 = new d36(f2, true, new um5(z4));
            nl3Var = een.P0;
            mbhVarA = jbh.a(d36Var2, nl3Var, b0kVar2, 0);
            iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM = b0kVar2.m();
            qim0VarE = zr7.E(b0kVar2, qim0VarThen3);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            z8 = ((x340) b0kVar2).S;
            function0 = hmb0.t1;
            if (z8) {
                b0kVar2.l(function0);
            } else {
                b0kVar2.v0();
            }
            lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            xu30Var4 = xu30Var2;
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            if (z3) {
                b0kVar2.i0(696640500);
                jw31 jw31VarA2 = ew31.a(h36.a, een.N0, b0kVar2, 0);
                int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM4 = b0kVar2.m();
                qim0 qim0VarE4 = zr7.E(b0kVar2, qim0Var3);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function0);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(jw31VarA2, b0kVar2, lljVar);
                nko1.H(xos0VarM4, b0kVar2, lljVar2);
                x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE4, b0kVar2, lljVar4);
                function1 = function0;
                lljVar5 = lljVar3;
                nl3Var2 = nl3Var;
                qim0Var2 = qim0Var3;
                z9 = true;
                uwo1.e(cwl1.o0(b0kVar2, 2131952451), (qim0) null, cbx.d(b0kVar2).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2042);
                b0kVar2 = b0kVar2;
                cvx cvxVar9 = cbx.b(b0kVar2).b;
                op71.g(b0kVar2, u291.v(qim0Var2, 4.0f));
                p9p1.b((qim0) null, 0, 0, b0kVar2, 0, 7);
                b0kVar2.r(true);
                b0kVar2.r(false);
            } else {
                qim0Var2 = qim0Var3;
                function1 = function0;
                lljVar5 = lljVar3;
                nl3Var2 = nl3Var;
                z9 = true;
                b0kVar2.i0(696953786);
                b0kVar2.r(false);
            }
            qim0 qim0VarF6 = u291.f(qim0Var2, 1.0f);
            if (z3 == 0) {
                qim0Var5 = qim0Var2;
            } else {
                qim0Var5 = qim0Var2;
            }
            qim0 qim0VarThen4 = qim0VarF6.then(qim0Var5);
            cvx cvxVar10 = cbx.b(b0kVar2).b;
            mbh mbhVarA3 = jbh.a(new d36(12.0f, z9, new um5(false)), nl3Var2, b0kVar2, 0);
            int iHashCode5 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM5 = b0kVar2.m();
            qim0 qim0VarE5 = zr7.E(b0kVar2, qim0VarThen4);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA3, b0kVar2, lljVar);
            nko1.H(xos0VarM5, b0kVar2, lljVar2);
            x0d.q(iHashCode5, b0kVar2, lljVar5, b0kVar2);
            nko1.H(qim0VarE5, b0kVar2, lljVar4);
            b0kVar2.i0(1323885608);
            if (c380Var.isEmpty()) {
                c380VarA1 = c380Var;
                break;
            }
            it = c380Var.iterator();
            while (true) {
                if (it.hasNext()) {
                    c380VarA1 = c380Var;
                    break;
                }
                if (((io6) it.next()).a == mo6.c) {
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (((io6) obj).a == mo6.g) {
                            arrayList.add(obj);
                        }
                    }
                    c380VarA1 = o7h.a1(arrayList, new k0d((byte) 22));
                    break;
                }
            }
            i9 = 0;
            while (r1.hasNext()) {
                i10 = i9 + 1;
                if (i9 >= 0) {
                    p7h.T();
                    throw null;
                }
                io6Var = (io6) obj2;
                if ((i8 & 57344) == 16384) {
                    z10 = z9;
                } else {
                    z10 = false;
                }
                zG = z10 | b0kVar2.g(io6Var) | b0kVar2.e(i9);
                objT = b0kVar2.T();
                if (zG) {
                    objT = new gu2(xu30Var4, io6Var, i9, (byte) 3);
                    b0kVar2.s0(objT);
                } else {
                    objT = new gu2(xu30Var4, io6Var, i9, (byte) 3);
                    b0kVar2.s0(objT);
                }
                a(io6Var, (iu30) objT, null, b0kVar2, 0);
                i9 = i10;
            }
            us71.m(b0kVar2, false, z9, z9);
            boolean z12 = z7;
            xu30Var3 = xu30Var4;
            z6 = z12;
            z3 = z3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            z6 = z2;
            xu30Var3 = xu30Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new no6(c380Var, qim0Var2, z3, z6, xu30Var3, i, i2, (byte) 0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v12 p.uvb0
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void c(final p.c8e1 r63, p.iu30 r64, p.qim0 r65, final p.lee1 r66, final p.elk1 r67, p.iu30 r68, p.idn0 r69, androidx.compose.ui.graphics.Brush r70, final boolean r71, final int r72, final int r73, p.x180 r74, p.bua0 r75, boolean r76, final boolean r77, final p.xu30 r78, p.b0k r79, int r80, int r81) {
        /*
            Method dump skipped, instruction units count: 2473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eko1.c(p.c8e1, p.iu30, p.qim0, p.lee1, p.elk1, p.iu30, p.idn0, androidx.compose.ui.graphics.Brush, boolean, int, int, p.x180, p.bua0, boolean, boolean, p.xu30, p.b0k, int, int):void");
    }

    public static final void d(qim0 qim0Var, x6e1 x6e1Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2036174316);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i | (x340Var.i(x6e1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.d, true);
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
            d1o1.b(x6e1Var, j2iVar, x340Var, (i2 >> 3) & 126);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qg(qim0Var, x6e1Var, j2iVar, i, (byte) 4);
        }
    }

    public static final void e(int i, mvh1 mvh1Var, boolean z, bih1 bih1Var, iu30 iu30Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        int i3;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(822745110);
        int i4 = i2 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.i(mvh1Var) ? 32 : 16) | (b0kVar3.h(z) ? 256 : SemanticState.Focused) | (b0kVar3.g(bih1Var) ? 2048 : SemanticState.ReadOnly) | (b0kVar3.i(iu30Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline);
        if (b0kVar3.Y(i4 & 1, (i4 & 9363) != 9362)) {
            n57.k(1 <= i && i < 8, "Invalid day in weekly chip: %s", new Object[]{Integer.valueOf(i)});
            int i5 = 7;
            int iP = yoi1.p(i, 1, 7);
            int i6 = 2131961467;
            switch (iP) {
                case 1:
                    i3 = 384078622;
                    i6 = 2131961472;
                    break;
                case 2:
                    i3 = 384080286;
                    break;
                case 3:
                    i3 = 384081951;
                    i6 = 2131961474;
                    break;
                case 4:
                    i3 = 384083649;
                    i6 = 2131961475;
                    break;
                case 5:
                    i3 = 384085408;
                    i6 = 2131961473;
                    break;
                case 6:
                    i3 = 384087134;
                    i6 = 2131961466;
                    break;
                case 7:
                    i3 = 384088800;
                    i6 = 2131961471;
                    break;
                default:
                    i3 = 384090622;
                    break;
            }
            String strK = x0d.k(b0kVar3, i3, i6, b0kVar3, false);
            if (iP == 1) {
                i5 = 4;
            } else if (iP == 3) {
                i5 = 6;
            } else if (iP != 4) {
                if (iP == 5) {
                    i5 = 5;
                } else if (iP != 6) {
                    i5 = iP != 7 ? 2 : 3;
                } else {
                    i5 = 1;
                }
            }
            boolean z2 = (mvh1Var instanceof kvh1) && ((kvh1) mvh1Var).a == i;
            if (z) {
                b0kVar3.i0(384104138);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(384105564);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131961476));
                b0kVar3.r(false);
            }
            idx idxVar = z2 ? new idx() : kdx.c;
            gdx gdxVarS = yla.s(b0kVar3);
            qim0 qim0VarN = anm1.N("UpdateScheduleDayChip_" + i, nim0.a);
            boolean zE = ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | b0kVar3.e(l1d.C(i5)) | ((57344 & i4) == 16384) | ((i4 & 14) == 4);
            Object objT = b0kVar3.T();
            if (zE || objT == fkj0.X) {
                bvh1 bvh1Var = new bvh1(z, bih1Var, i5, iu30Var, i);
                b0kVar3.s0(bvh1Var);
                objT = bvh1Var;
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, qim0VarN, haxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(698417463, new zsd1(strK, (byte) 14), b0kVar3), b0kVar2, 0, 48, 1992);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0((byte) 14, i, i2, mvh1Var, bih1Var, iu30Var, z);
        }
    }

    public static final void f(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1124828980);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, false, new g21(een.N0, (byte) 28));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarD);
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 48);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131952323);
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.b;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = s8x.c;
                x340Var.s0(objT);
            }
            qim0Var2 = qim0Var3;
            uwo1.e(strO0, s161.b(qim0VarF, false, (iu30) objT), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            uwo1.e(cwl1.o0(x340Var, z ? 2131952321 : 2131952322), u291.f(qim0Var2, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 48, 0, 2016);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var2, i, (byte) 9);
        }
    }

    public static final void g(String str, String str2, String str3, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2140972717);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str3) ? 256 : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : SemanticState.ReadOnly;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            f65 f65Var = (f65) b0kVar3.k(t4k.s);
            b0kVar3.i0(-185439491);
            ye5 ye5Var = new ye5();
            ye5Var.g(str);
            ye5Var.g(" ");
            boolean zI = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | b0kVar3.i(f65Var);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new oo6(iu30Var, str3, f65Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            vhg.d(ye5Var, str2, str3, (iu30) objT);
            af5 af5VarP = ye5Var.p();
            b0kVar3.r(false);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP, cbx.a(b0kVar3).b.b, (qim0) null, cbx.d(b0kVar3).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4084);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, str, str2, str3, iu30Var, (byte) 17);
        }
    }

    public static final void h(mvh1 mvh1Var, iu30 iu30Var, mvh1 mvh1Var2, int i, iu30 iu30Var2, bih1 bih1Var, b0k b0kVar, int i2) {
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1180270613);
        int i3 = i2 | (x340Var.i(mvh1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(mvh1Var2) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.e(i) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(iu30Var2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.g(bih1Var) ? 131072 : 65536);
        boolean z = false;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = (1 > i || i >= 8) ? 1 : i;
            boolean zE = x340Var.e(i4);
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                obj = objT;
                tr80 tr80Var = new tr80(0, 6, 1);
                ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
                lr80 it = tr80Var.iterator();
                while (((sr80) it).c) {
                    arrayList.add(Integer.valueOf((((i4 - 1) + it.nextInt()) % 7) + 1));
                }
                x340Var.s0(arrayList);
                obj = arrayList;
            }
            obj = objT;
            qim0 qim0VarN = anm1.N("UpdateScheduleWeekdayChips", nim0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            k5p1.d(qim0VarN, new d36(8.0f, true, new um5(z)), (g36) null, (pl3) null, 0, 0, apo.r(433217872, new mse((List) obj, mvh1Var, bih1Var, iu30Var, mvh1Var2, iu30Var2, (byte) 10), x340Var), x340Var, 1572864, 60);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71(mvh1Var, iu30Var, mvh1Var2, i, iu30Var2, bih1Var, i2);
        }
    }

    public static final void i(qim0 qim0Var, upb0 upb0Var, rg50 rg50Var, vzq0 vzq0Var, iq20 iq20Var, boolean z, hxq0 hxq0Var, g36 g36Var, c36 c36Var, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        upb0 upb0Var2;
        b0k b0kVar2;
        Object jpb0Var;
        int i5;
        upb0 upb0Var3;
        ima0 ima0Var;
        boolean z2;
        qim0 qim0VarZ;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(708740370);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(upb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? b0kVar3.g(rg50Var) : b0kVar3.i(rg50Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.g(vzq0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.h(false) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((i & 196608) == 0) {
            i3 |= b0kVar3.h(true) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= b0kVar3.g(iq20Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= b0kVar3.h(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar3.g(hxq0Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= b0kVar3.g(g36Var) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar3.g(c36Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            int i7 = i6 >> 3;
            int i8 = i7 & 14;
            int i9 = i8 | (i4 & ContentType.LONG_FORM_ON_DEMAND);
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            int i10 = i4;
            boolean z3 = (((i9 & 14) ^ 6) > 4 && b0kVar3.g(upb0Var)) || (i9 & 6) == 4;
            Object objT = b0kVar3.T();
            if (z3 || objT == obj) {
                c4x0 c4x0Var = c4x0.f;
                e45 e45Var = new e45(ven0VarS, (byte) 6);
                yt91 yt91Var = yv91.a;
                objT = new i1w(new mdt(new qga0((Object) new mdt(e45Var, c4x0Var), (Object) upb0Var, (byte) 2), c4x0Var), tob1.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 6);
                b0kVar3.s0(objT);
            }
            ima0 ima0Var2 = (ima0) objT;
            int i11 = i8 | ((i6 >> 9) & ContentType.LONG_FORM_ON_DEMAND);
            boolean z4 = ((((i11 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && b0kVar3.h(false)) || (i11 & 48) == 32) | ((((i11 & 14) ^ 6) > 4 && b0kVar3.g(upb0Var)) || (i11 & 6) == 4);
            Object objT2 = b0kVar3.T();
            if (z4 || objT2 == obj) {
                objT2 = new jub0(upb0Var);
                b0kVar3.s0(objT2);
            }
            jub0 jub0Var = (jub0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == obj) {
                objT3 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT3);
            }
            c9n c9nVar = (c9n) objT3;
            yd50 yd50Var = (yd50) b0kVar3.k(t4k.g);
            t2b t2bVar = !((Boolean) b0kVar3.k(t4k.x)).booleanValue() ? avw0.h : null;
            int i12 = i6 & ContentType.LONG_FORM_ON_DEMAND;
            t2b t2bVar2 = t2bVar;
            int i13 = (i6 & 524272) | ((i10 << 18) & 3670016) | ((i6 >> 6) & 29360128);
            boolean zG = ((((i13 & 29360128) ^ 12582912) > 8388608 && b0kVar3.g(g36Var)) || (i13 & 12582912) == 8388608) | ((((i13 & 896) ^ 384) > 256 && b0kVar3.g(rg50Var)) || (i13 & 384) == 256) | ((((i13 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && b0kVar3.g(upb0Var)) || (i13 & 48) == 32) | ((((i13 & 7168) ^ 3072) > 2048 && b0kVar3.g(vzq0Var)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && b0kVar3.h(false)) || (i13 & 24576) == 16384) | ((((458752 & i13) ^ 196608) > 131072 && b0kVar3.h(true)) || (i13 & 196608) == 131072) | ((((i13 & 3670016) ^ 1572864) > 1048576 && b0kVar3.g(c36Var)) || (i13 & 1572864) == 1048576) | b0kVar3.g(yd50Var);
            Object objT4 = b0kVar3.T();
            if (zG || objT4 == obj) {
                i5 = 32;
                jpb0Var = new jpb0(upb0Var, vzq0Var, ima0Var2, rg50Var, g36Var, c36Var, c9nVar, yd50Var, t2bVar2);
                upb0Var3 = upb0Var;
                ima0Var = ima0Var2;
                b0kVar3.s0(jpb0Var);
            } else {
                upb0Var3 = upb0Var;
                jpb0Var = objT4;
                ima0Var = ima0Var2;
                i5 = 32;
            }
            hsb0 hsb0Var = (hsb0) jpb0Var;
            boolean z5 = i12 == i5;
            Object objT5 = b0kVar3.T();
            if (z5 || objT5 == obj) {
                objT5 = new g030(upb0Var3, (byte) 13);
                b0kVar3.s0(objT5);
            }
            boolean z6 = true;
            xyb1 xyb1VarS = jmo1.s(false, true, (Function0) objT5, b0kVar3, (i6 >> 12) & 126);
            qqq0 qqq0Var = qqq0.a;
            if (z) {
                b0kVar3.i0(27471107);
                if (((i8 ^ 6) <= 4 || !b0kVar3.g(upb0Var3)) && (i7 & 6) != 4) {
                    z6 = false;
                }
                Object objT6 = b0kVar3.T();
                if (z6 || objT6 == obj) {
                    objT6 = new zob0(upb0Var3);
                    b0kVar3.s0(objT6);
                }
                z2 = false;
                qim0VarZ = dem1.z((zob0) objT6, upb0Var3.n, false, qqq0Var);
                b0kVar3.r(false);
            } else {
                z2 = false;
                b0kVar3.i0(27767312);
                b0kVar3.r(false);
                qim0VarZ = nim0.a;
            }
            ima0 ima0Var3 = ima0Var;
            upb0 upb0Var4 = upb0Var3;
            upb0Var2 = upb0Var4;
            b0kVar2 = b0kVar3;
            hm5.f(ima0Var3, xfo1.s(t4n1.u(kln1.x(qim0Var.then(upb0Var3.k).then(upb0Var3.l), ima0Var, jub0Var, qqq0Var, z, z2).then(qim0VarZ), upb0Var3.m), upb0Var4, qqq0Var, hxq0Var, z, z2, iq20Var, upb0Var3.f, xyb1VarS), upb0Var2.o, hsb0Var, b0kVar2, 0, 0);
        } else {
            upb0Var2 = upb0Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hpb0(qim0Var, upb0Var2, rg50Var, vzq0Var, iq20Var, z, hxq0Var, g36Var, c36Var, iu30Var, i, i2);
        }
    }

    public static final void j(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, boolean z, boolean z2, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-797439093);
        int i2 = i | (b0kVar3.i(function1) ? 32 : 16) | (b0kVar3.i(function2) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar3.i(function3) ? SemanticState.Modal : SemanticState.ReadOnly) | (b0kVar3.i(function4) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (b0kVar3.h(z) ? 131072 : 65536) | (b0kVar3.h(z2) ? 1048576 : 524288);
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            b0kVar2 = b0kVar3;
            mqo1.e(function0, (i3u) null, (vu30) null, apo.r(1534865803, new k750((byte) 9, z2), b0kVar3), apo.r(1544636364, new erc(z, function1, z2, function2, function3, function4, (byte) 4), b0kVar3), (vu30) null, (vu30) null, b0kVar2, 27654, 102);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(function0, function1, function2, function3, function4, z, z2, i);
        }
    }

    public static final void k(pro0 pro0Var, iu30 iu30Var, drj0 drj0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        Object rwm0Var;
        int i3;
        int i4;
        jlx jlxVar;
        boolean z;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(140481902);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(pro0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var2.g(drj0Var) : x340Var2.i(drj0Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        int i5 = i2 | 3072;
        if (x340Var2.Y(i5 & 1, (i5 & 1171) != 1170)) {
            hpo0 hpo0Var = pro0Var.b;
            e1r0 e1r0Var = new e1r0((byte) 4);
            int i6 = i5 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z2 = i6 == 32;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new wck0(iu30Var2, (byte) 15);
                x340Var2.s0(objT);
            }
            ihg0 ihg0VarE = p1p1.E(e1r0Var, (iu30) objT, x340Var2);
            Boolean boolValueOf = Boolean.valueOf(pro0Var.d);
            boolean zI = x340Var2.i(pro0Var) | x340Var2.i(ihg0VarE) | (i6 == 32);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                i3 = i6;
                i4 = 0;
                rwm0Var = new rwm0(pro0Var, ihg0VarE, iu30Var2, (lnm) null, (byte) 5);
                iu30Var2 = iu30Var2;
                x340Var2.s0(rwm0Var);
            } else {
                rwm0Var = objT2;
                i3 = i6;
                i4 = 0;
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) rwm0Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, i4);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.h(qim0Var3, 8.0f));
            int iC = l1d.C(hpo0Var.d);
            if (iC == 0) {
                jlxVar = ipx.c;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                jlxVar = jlx.c;
            }
            long j = cbx.a(x340Var2).b.a;
            zov0 zov0Var = cbx.b(x340Var2).g;
            w0h1.a(jlxVar, isl.a, u291.r(qim0Var3, 32.0f), j, 0L, false, x340Var2, 56, 48);
            String str = hpo0Var.a;
            lee1 lee1Var = cbx.d(x340Var2).e;
            long j2 = cbx.a(x340Var2).b.a;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            uwo1.e(str, uyn1.B(qim0VarF2, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
            String str2 = hpo0Var.b;
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            long j3 = cbx.a(x340Var2).b.b;
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar5 = cbx.b(x340Var2).b;
            uwo1.e(str2, uyn1.B(qim0VarF3, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var2, j3, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(x340Var2);
            int i7 = i5 & 896;
            int i8 = i3;
            boolean z3 = (i7 == 256 || ((i5 & 512) != 0 && x340Var2.i(drj0Var))) | (i8 == 32);
            Object objT3 = x340Var2.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new sro0(drj0Var, iu30Var2, (byte) 0);
                x340Var2.s0(objT3);
            }
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, (Function0) objT3), idxVar, uyn1.B(qim0Var3, 0.0f, cbx.b(x340Var2).b.b, 0.0f, 0.0f, 13), (max) null, gdxVarR, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(163973337, new fhk0(hpo0Var, (byte) 29), x340Var2), x340Var2, 0, 48, 2008);
            x340Var2.r(true);
            cpo0 cpo0Var = hpo0Var.e;
            bpo0 bpo0Var = cpo0Var instanceof bpo0 ? (bpo0) cpo0Var : null;
            if (!pro0Var.c || bpo0Var == null) {
                x340Var = x340Var2;
                x340Var.i0(1801876500);
                x340Var.r(false);
            } else {
                x340Var2.i0(1801042352);
                boolean z4 = i8 == 32;
                Object objT4 = x340Var2.T();
                if (z4 || objT4 == m4cVar) {
                    z = false;
                    objT4 = new tro0(iu30Var2, (byte) 0);
                    x340Var2.s0(objT4);
                } else {
                    z = false;
                }
                Function0 function0 = (Function0) objT4;
                String str3 = bpo0Var.b;
                String str4 = bpo0Var.c;
                String strO0 = cwl1.o0(x340Var2, 2131959192);
                boolean z5 = (i8 == 32 ? true : z) | ((i7 == 256 || ((i5 & 512) != 0 && x340Var2.i(drj0Var))) ? true : z);
                Object objT5 = x340Var2.T();
                if (z5 || objT5 == m4cVar) {
                    objT5 = new sro0(drj0Var, iu30Var2, (byte) 1);
                    x340Var2.s0(objT5);
                }
                zgx zgxVar = new zgx(strO0, new gbx(z50Var, (Function0) objT5));
                String strO1 = cwl1.o0(x340Var2, 2131959193);
                boolean z6 = (i7 == 256 || ((i5 & 512) != 0 && x340Var2.i(drj0Var))) | (i8 == 32);
                Object objT6 = x340Var2.T();
                if (z6 || objT6 == m4cVar) {
                    objT6 = new sro0(drj0Var, iu30Var2, (byte) 2);
                    x340Var2.s0(objT6);
                }
                mqo1.d(function0, (i3u) null, (hux) null, str3, str4, zgxVar, new zgx(strO1, new gbx(z50Var, (Function0) objT6)), x340Var2, 2359296, 6);
                x340Var = x340Var2;
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(pro0Var, iu30Var2, drj0Var, qim0Var2, i, (byte) 17);
        }
    }

    public static ybe l() {
        return new ybe("packed", Float.valueOf(0.5f));
    }

    public static final void m(int i, int i2, qim0 qim0Var, sgr0 sgr0Var, long j, Function0 function0, Function0 function1, b0k b0kVar, int i3, int i4) {
        Function0 function2;
        int i5;
        sgr0 sgr0Var2;
        long j2;
        Function0 function3;
        qim0 qim0Var2;
        sgr0 qgr0Var;
        qim0 qim0Var3;
        Function0 function4;
        int i6;
        long j3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(669804892);
        int i7 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16);
        int i8 = i7 | 9600;
        int i9 = i4 & 32;
        if (i9 != 0) {
            i5 = i7 | 206208;
            function2 = function0;
        } else {
            function2 = function0;
            i5 = i8 | (x340Var.i(function2) ? 131072 : 65536);
        }
        int i10 = i5 | (x340Var.i(function1) ? 1048576 : 524288);
        if (x340Var.Y(i10 & 1, (599187 & i10) != 599186)) {
            x340Var.d0();
            if ((i3 & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                qgr0Var = new qgr0(cbx.a(x340Var).a.c);
                long j4 = cbx.a(x340Var).b.b;
                int i11 = i10 & (-64513);
                qim0Var3 = nim0.a;
                if (i9 != 0) {
                    Object objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = v0r0.N0;
                        x340Var.s0(objT);
                    }
                    function2 = (Function0) objT;
                }
                function4 = function2;
                i6 = i11;
                j3 = j4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                qgr0Var = sgr0Var;
                function4 = function2;
                i6 = i10 & (-64513);
                j3 = j;
            }
            x340Var.s();
            Object[] objArr = new Object[0];
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v0r0.O0;
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT2, x340Var, 48);
            j2i j2iVarR = apo.r(765292604, new tvr0(i, j3, i2), x340Var);
            j2i j2iVarR2 = apo.r(1237632250, new ztr0(function4, ven0Var, (byte) 1), x340Var);
            sgr0 sgr0Var3 = qgr0Var;
            bzn1.e(qim0Var3, j2iVarR, false, j2iVarR2, sgr0Var3, (ngr0) null, (ygr0) null, (Function0) null, x340Var, 3126, 228);
            x340Var = x340Var;
            qim0 qim0Var4 = qim0Var3;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-259154588);
                boolean z = (i6 & 3670016) == 1048576;
                Object objT3 = x340Var.T();
                if (z || objT3 == m4cVar) {
                    objT3 = new hn00(new isr0(function1, (byte) 3), new q2j0(ven0Var, (byte) 22));
                    x340Var.s0(objT3);
                }
                otw.c((hn00) objT3, rih1.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(-258906650);
                x340Var.r(false);
            }
            function3 = function4;
            j2 = j3;
            qim0Var2 = qim0Var4;
            sgr0Var2 = sgr0Var3;
        } else {
            x340Var.b0();
            sgr0Var2 = sgr0Var;
            j2 = j;
            function3 = function2;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uvr0(i, i2, qim0Var2, sgr0Var2, j2, function3, function1, i3, i4);
        }
    }

    public static final void n(x6e1 x6e1Var, boolean z, b0k b0kVar, int i) {
        z9e1 z9e1VarD;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(626339208);
        int i2 = (x340Var.i(x6e1Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(1530097388);
            r1c0 r1c0Var = x6e1Var.d;
            y9e1 y9e1Var = null;
            if (r1c0Var != null && (z9e1VarD = r1c0Var.d()) != null) {
                y9e1 y9e1Var2 = z9e1VarD.a;
                r1c0 r1c0Var2 = x6e1Var.d;
                if (!(r1c0Var2 != null ? r1c0Var2.f124p : true)) {
                    y9e1Var = y9e1Var2;
                }
            }
            if (y9e1Var == null) {
                x340Var.i0(1530097387);
                x340Var.r(false);
            } else {
                x340Var.i0(1530097388);
                if (nbe1.d(x6e1Var.l().b)) {
                    x340Var.i0(2110860558);
                    x340Var.r(false);
                } else {
                    x340Var.i0(2109807302);
                    int iO = x6e1Var.b.o((int) (x6e1Var.l().b >> 32));
                    int iO2 = x6e1Var.b.o((int) (x6e1Var.l().b & 4294967295L));
                    int iA = y9e1Var.a(iO);
                    int iA2 = y9e1Var.a(Math.max(iO2 - 1, 0));
                    r1c0 r1c0Var3 = x6e1Var.d;
                    if (r1c0Var3 == null || !((Boolean) r1c0Var3.m.getValue()).booleanValue()) {
                        x340Var.i0(2110490542);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(2110225306);
                        a4p1.b(true, iA, x6e1Var, x340Var, ((i2 << 6) & 896) | 6);
                        x340Var.r(false);
                    }
                    r1c0 r1c0Var4 = x6e1Var.d;
                    if (r1c0Var4 == null || !((Boolean) r1c0Var4.n.getValue()).booleanValue()) {
                        x340Var.i0(2110838734);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(2110574459);
                        a4p1.b(false, iA2, x6e1Var, x340Var, ((i2 << 6) & 896) | 6);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                }
                r1c0 r1c0Var5 = x6e1Var.d;
                if (r1c0Var5 != null) {
                    hrr0 hrr0Var = r1c0Var5.l;
                    if (!u890.j(x6e1Var.t.a.b, x6e1Var.l().a.b)) {
                        hrr0Var.setValue(Boolean.FALSE);
                    }
                    if (r1c0Var5.b()) {
                        if (((Boolean) hrr0Var.getValue()).booleanValue()) {
                            x6e1Var.s();
                        } else {
                            x6e1Var.m();
                        }
                    }
                }
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            x340Var.i0(1989076778);
            x340Var.r(false);
            x6e1Var.m();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fc4(x6e1Var, z, i);
        }
    }

    public static final void o(String str, ton1 ton1Var, mvh1 mvh1Var, int i, String str2, mvh1 mvh1Var2, mvh1 mvh1Var3, Function0 function0, iu30 iu30Var, iu30 iu30Var2, bih1 bih1Var, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1796150934);
        j06 j06Var = x340Var2.a;
        if ((i2 & 6) == 0) {
            i4 = (x340Var2.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.i(ton1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var2.i(mvh1Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var2.e(i == 0 ? -1 : l1d.C(i)) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var2.g(str2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i2) == 0) {
            i4 |= x340Var2.i(mvh1Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= x340Var2.i(mvh1Var3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= x340Var2.i(function0) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= x340Var2.i(iu30Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= x340Var2.i(iu30Var2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | ((i3 & 8) == 0 ? x340Var2.g(bih1Var) : x340Var2.i(bih1Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (x340Var2.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            boolean zJ = u890.j(mvh1Var2, mvh1Var);
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            qim0 qim0VarN = anm1.N(str2, kk0.q(x340Var2, qim0VarE, lljVar4, 1.0f, true));
            String strR = ton1Var.r();
            boolean zI = ((i4 & 7168) == 2048) | ((i5 & 14) == 4 || ((i5 & 8) != 0 && x340Var2.i(bih1Var))) | ((1879048192 & i4) == 536870912) | x340Var2.i(mvh1Var) | x340Var2.i(mvh1Var3) | ((29360128 & i4) == 8388608) | ((234881024 & i4) == 67108864);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                vts vtsVar = new vts(i, function0, iu30Var2, iu30Var, bih1Var, mvh1Var, mvh1Var3);
                x340Var2.s0(vtsVar);
                objT = vtsVar;
            }
            qim0 qim0VarX = bin.x(qim0VarN, false, strR, (pm31) null, (idn0) null, (Function0) objT, 13);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i4 & 14, 0, 2042);
            x340Var = x340Var2;
            String strS = ton1Var.s();
            if (strS == null) {
                x340Var.i0(-1991448228);
                x340Var.r(false);
            } else {
                x340Var.i0(-1991448227);
                uwo1.e(strS, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (zJ) {
                x340Var.i0(1524265657);
                w0h1.a(ilx.c, isl.a, (qim0) null, cbx.a(x340Var).c.c, 0L, false, x340Var, ilx.d | 48, 52);
                x340Var.r(false);
            } else {
                x340Var.i0(1524449704);
                x0d.s(nim0Var, cbx.b(x340Var).b.a, x340Var, false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q2y0(str, ton1Var, mvh1Var, i, str2, mvh1Var2, mvh1Var3, function0, iu30Var, iu30Var2, bih1Var, i2, i3);
        }
    }

    public static final void p(int i, String str, String str2, String str3, Function0 function0, b0k b0kVar) {
        int i2;
        String str4;
        Function0 function1;
        String str5;
        String str6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(310574412);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str3) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            l0o1.a(str, str2, str3, function0, we51.e, (qim0) null, x340Var, ((i2 >> 3) & 1022) | ((i2 << 9) & 7168));
            str4 = str;
            str6 = str2;
            str5 = str3;
            function1 = function0;
        } else {
            str4 = str;
            function1 = function0;
            str5 = str3;
            str6 = str2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ptd(function1, str4, str6, str5, i);
        }
    }

    public static final void q(x6e1 x6e1Var, b0k b0kVar, int i) {
        af5 af5VarK;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1436003720);
        byte b2 = 2;
        int i2 = (x340Var.i(x6e1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            r1c0 r1c0Var = x6e1Var.d;
            if (r1c0Var == null || !((Boolean) r1c0Var.o.getValue()).booleanValue() || (af5VarK = x6e1Var.k()) == null || af5VarK.b.length() <= 0) {
                x340Var.i0(-2111042550);
                x340Var.r(false);
            } else {
                x340Var.i0(-2112351432);
                boolean zG = x340Var.g(x6e1Var);
                Object objT = x340Var.T();
                if (zG || objT == obj) {
                    objT = new t6e1(x6e1Var);
                    x340Var.s0(objT);
                }
                b4e1 b4e1Var = (b4e1) objT;
                wat watVar = (wat) x340Var.k(t4k.h);
                hyp0 hyp0Var = x6e1Var.b;
                long j = x6e1Var.l().b;
                int i3 = nbe1.c;
                int iO = hyp0Var.o((int) (j >> 32));
                r1c0 r1c0Var2 = x6e1Var.d;
                z9e1 z9e1VarD = r1c0Var2 != null ? r1c0Var2.d() : null;
                z9e1VarD.getClass();
                y9e1 y9e1Var = z9e1VarD.a;
                n511 n511VarC = y9e1Var.c(yoi1.p(iO, 0, y9e1Var.a.a.b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((watVar.X0(2.0f) / 2.0f) + n511VarC.a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(n511VarC.d)));
                boolean zF = x340Var.f(jFloatToRawIntBits);
                Object objT2 = x340Var.T();
                if (zF || objT2 == obj) {
                    objT2 = new r7n(jFloatToRawIntBits);
                    x340Var.s0(objT2);
                }
                jyp0 jyp0Var = (jyp0) objT2;
                boolean zI = x340Var.i(b4e1Var) | x340Var.i(x6e1Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == obj) {
                    objT3 = new nrf(b4e1Var, x6e1Var, (byte) 3);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarB = f8d1.b(nim0.a, b4e1Var, (PointerInputEventHandler) objT3);
                boolean zF2 = x340Var.f(jFloatToRawIntBits);
                Object objT4 = x340Var.T();
                if (zF2 || objT4 == obj) {
                    objT4 = new gc4(b2, jFloatToRawIntBits);
                    x340Var.s0(objT4);
                }
                kc4.a(jyp0Var, s161.b(qim0VarB, false, (iu30) objT4), 0L, x340Var, 0, 4);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w9(x6e1Var, i, (byte) 5);
        }
    }

    public static final void r(evh1 evh1Var, dvh1 dvh1Var, int i, int i2, bih1 bih1Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i3) {
        x340 x340Var;
        qim0 qim0Var2;
        ven0 ven0Var;
        int i4;
        mvh1 mvh1Var;
        evh1 evh1Var2 = evh1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(374525434);
        int i5 = i3 | (x340Var2.i(evh1Var2) ? 4 : 2) | (x340Var2.i(dvh1Var) ? 32 : 16) | (x340Var2.e(i) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var2.e(i2) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var2.g(bih1Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | 196608 | (x340Var2.i(iu30Var) ? 1048576 : 524288);
        if (x340Var2.Y(i5 & 1, (i5 & 599187) != 599186)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = v8r.q(evh1Var2.a);
                x340Var2.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            mvh1 mvh1Var2 = (mvh1) ven0Var2.h();
            iu30 iu30VarB = ven0Var2.b();
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var3 = (ven0) objT2;
            ven0 ven0VarS = v8r.s(mvh1Var2, x340Var2);
            ven0 ven0VarS2 = v8r.s(iu30Var, x340Var2);
            boolean zI = x340Var2.i(ven0VarS) | x340Var2.i(ven0Var3) | x340Var2.i(evh1Var2) | x340Var2.i(ven0VarS2);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                ven0Var = ven0Var3;
                i4 = 0;
                mvh1Var = mvh1Var2;
                e971 e971Var = new e971(ven0VarS, ven0Var, evh1Var, ven0VarS2, (byte) 27);
                evh1Var2 = evh1Var;
                x340Var2.s0(e971Var);
                objT3 = e971Var;
            } else {
                mvh1Var = mvh1Var2;
                i4 = 0;
                ven0Var = ven0Var3;
            }
            qxd0.i(rih1.a, (iu30) objT3, x340Var2);
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var2).g;
            qim0Var2 = nim0.a;
            qim0 qim0VarO = td6.o(u85Var, 32, qim0Var2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarO);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, i4);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            uwo1.e(cwl1.o0(x340Var2, 2131961462), uyn1.z(0.0f, 12.0f, 1, qim0Var2), cbx.d(x340Var2).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2040);
            zl41 zl41Var = dvh1Var.a;
            x340Var2.i0(-908343208);
            String strO0 = cwl1.o0(x340Var2, 2131961470);
            mvh1 mvh1Var3 = evh1Var2.a;
            boolean zI2 = x340Var2.i(ven0Var);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new aya1(ven0Var, (byte) 21);
                x340Var2.s0(objT4);
            }
            mvh1 mvh1Var4 = mvh1Var;
            o(strO0, zl41Var, jvh1.a, 2, "UpdateScheduleCadenceRow_Never", mvh1Var4, mvh1Var3, (Function0) objT4, iu30Var, iu30VarB, bih1Var, x340Var2, ((i5 << 6) & 234881024) | 27648, (i5 >> 12) & 14);
            x340Var2.r(false);
            yl41 yl41Var = dvh1Var.b;
            x340Var2.i0(-907740072);
            String strO1 = cwl1.o0(x340Var2, 2131961465);
            mvh1 mvh1Var5 = evh1Var2.a;
            boolean zI3 = x340Var2.i(ven0Var);
            Object objT5 = x340Var2.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new aya1(ven0Var, (byte) 22);
                x340Var2.s0(objT5);
            }
            o(strO1, yl41Var, hvh1.a, 1, "UpdateScheduleCadenceRow_Daily", mvh1Var4, mvh1Var5, (Function0) objT5, iu30Var, iu30VarB, bih1Var, x340Var2, ((i5 << 6) & 234881024) | 27648, (i5 >> 12) & 14);
            x340Var2.r(false);
            am41 am41Var = dvh1Var.c;
            x340Var2.i0(-907140098);
            mvh1 mvh1Var6 = evh1Var2.a;
            boolean zI4 = x340Var2.i(ven0Var);
            Object objT6 = x340Var2.T();
            if (zI4 || objT6 == m4cVar) {
                objT6 = new aya1(ven0Var, (byte) 23);
                x340Var2.s0(objT6);
            }
            s(am41Var, mvh1Var4, iu30VarB, mvh1Var6, i, i2, (Function0) objT6, iu30Var, bih1Var, x340Var2, ((i5 << 6) & 516096) | ((i5 << 3) & 29360128) | ((i5 << 12) & 234881024));
            x340Var = x340Var2;
            x340Var.r(false);
            x340Var.i0(-906663784);
            x340Var.r(false);
            x340Var.i0(-906072800);
            x340Var.r(false);
            cvx cvxVar3 = cbx.b(x340Var).b;
            x0d.s(qim0Var2, 16.0f, x340Var, true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bxy(evh1Var2, dvh1Var, i, i2, bih1Var, qim0Var2, iu30Var, i3);
        }
    }

    public static final void s(am41 am41Var, mvh1 mvh1Var, iu30 iu30Var, mvh1 mvh1Var2, int i, int i2, Function0 function0, iu30 iu30Var2, bih1 bih1Var, b0k b0kVar, int i3) {
        int i4;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1446123882);
        j06 j06Var = x340Var2.a;
        if ((i3 & 6) == 0) {
            i4 = (x340Var2.i(am41Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var2.i(mvh1Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var2.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i3 & 3072) == 0) {
            i4 |= x340Var2.i(mvh1Var2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var2.e(i) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i3) == 0) {
            i4 |= x340Var2.e(i2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= x340Var2.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= x340Var2.i(iu30Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= (i3 & 134217728) == 0 ? x340Var2.g(bih1Var) : x340Var2.i(bih1Var) ? 67108864 : 33554432;
        }
        if (x340Var2.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarF);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            qim0 qim0VarN = anm1.N("UpdateScheduleCadenceRow_Weekly", kk0.q(x340Var2, qim0VarE2, lljVar4, 1.0f, true));
            String str = am41Var.d;
            boolean zI = ((i4 & 57344) == 16384) | x340Var2.i(mvh1Var) | ((234881024 & i4) == 67108864 || ((i4 & 134217728) != 0 && x340Var2.i(bih1Var))) | ((i4 & 896) == 256);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new ka0(mvh1Var, bih1Var, iu30Var, i);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarN, false, str, (pm31) null, (idn0) null, (Function0) objT, 13);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarX);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            uwo1.e(cwl1.o0(x340Var2, 2131961478), (qim0) null, cbx.d(x340Var2).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
            String str2 = am41Var.c;
            if (str2 == null) {
                x340Var2.i0(-1003689530);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1003689529);
                uwo1.e(str2, (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            boolean z2 = mvh1Var instanceof kvh1;
            if (z2) {
                x340Var2.i0(-1782830845);
                w0h1.a(ilx.c, isl.a, (qim0) null, cbx.a(x340Var2).c.c, 0L, false, x340Var2, ilx.d | 48, 52);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                x340Var.i0(-1782635142);
                x0d.s(nim0Var, cbx.b(x340Var).b.a, x340Var, false);
            }
            x340Var.r(true);
            x340 x340Var3 = x340Var;
            fq7.b(pbh.a, z2, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(-1395502072, new ni1(i2, function0, iu30Var, iu30Var2, bih1Var, mvh1Var, mvh1Var2), x340Var), x340Var3, 1572870, 30);
            x340Var2 = x340Var3;
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new cvh1(am41Var, mvh1Var, iu30Var, mvh1Var2, i, i2, function0, iu30Var2, bih1Var, i3);
        }
    }

    public static final void t(r1c0 r1c0Var) {
        c9e1 c9e1Var = r1c0Var.e;
        if (c9e1Var != null) {
            r1c0Var.v.invoke(c8e1.a((c8e1) r1c0Var.d.b, (af5) null, 0L, 3));
            z8e1 z8e1Var = c9e1Var.a;
            AtomicReference atomicReference = z8e1Var.b;
            while (!atomicReference.compareAndSet(c9e1Var, null)) {
                if (atomicReference.get() != c9e1Var) {
                }
            }
            z8e1Var.a.b();
        }
        r1c0Var.e = null;
    }

    public static int u(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < 6; i2++) {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    public static final Object v(o161 o161Var, d261 d261Var) {
        Object objG = o161Var.a.g(d261Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static void w(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + "0000".substring(0, 4 - hexString.length()).concat(hexString) + ')');
    }

    public static boolean x(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean y(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    public static boolean z(char c2) {
        if (c2 == '\r' || c2 == '*' || c2 == '>' || c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }
}
