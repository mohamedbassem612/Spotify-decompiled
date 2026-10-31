package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i1p1 {
    public static b180 a;
    public static b180 b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(String str, boolean z, boolean z2, String str2, String str3, String str4, int i, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1488300330);
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.g(str3) ? 16384 : 8192) | (x340Var.g(str4) ? 131072 : 65536) | (x340Var.e(l1d.C(i)) ? 1048576 : 524288) | (x340Var.i(function0) ? 8388608 : 4194304) | (x340Var.i(function1) ? 67108864 : 33554432) | 805306368;
        if (x340Var.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(qim0Var3, 16.0f);
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            int i4 = i3 >> 6;
            c(i, (i3 & 14) | (i4 & 112) | ((i3 >> 12) & 896), str, str2, x340Var, null);
            f(z, z2, str3, str4, i, function0, function1, null, x340Var, ((i3 >> 3) & 126) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4));
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yo7(str, z, z2, str2, str3, str4, i, function0, function1, qim0Var2, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(String str, long j, String str2, String str3, int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        qim0 qim0Var;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1415326373);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.e(l1d.C(i)) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            d36 d36Var = new d36(16.0f, true, new um5(false));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var2);
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
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            bxc bxcVarZ = qon1.z(j, null, null, x340Var, (i3 >> 3) & 14, 6);
            int iC = l1d.C(i);
            if (iC != 0) {
                if (iC == 1) {
                    x340Var.i0(-1392528071);
                    long j2 = ((vex) zex.a.b).e;
                    cua cuaVar = cbx.b(x340Var).f;
                    cua cuaVar2 = cbx.b(x340Var).f;
                    k((i3 >> 6) & 126, 0, cbx.a(x340Var).b.a, str2, str3, x340Var, dug.f(qim0Var2, j2, new zvx()));
                    x340Var.r(false);
                    z = true;
                    x340Var = x340Var;
                } else {
                    if (iC != 2) {
                        throw p3d1.k(x340Var, 1479076562, false);
                    }
                    x340Var.i0(-1392117197);
                    long j3 = ((vex) zex.a.b).c;
                    cua cuaVar3 = cbx.b(x340Var).f;
                    cua cuaVar4 = cbx.b(x340Var).f;
                    k((i3 >> 6) & 112, 8, 0L, String.format(str2, Arrays.copyOf(new Object[]{bxcVarZ.d}, 1)), str3, x340Var, dug.f(qim0Var2, j3, new zvx()));
                    x340Var = x340Var;
                    x340Var.r(false);
                    z = true;
                }
                qim0Var = qim0Var2;
            } else {
                x340Var.i0(-1393238219);
                qon1.b(bxcVarZ.b, bxcVarZ.a, null, null, x340Var, 0, 12);
                wnb0 wnb0Var = new wnb0(1.0f, true);
                mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 0);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, wnb0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                x340Var = x340Var;
                uwo1.e(str2, anm1.N("Subtitle", qim0Var2), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, (i3 >> 6) & 14, 0, 2032);
                qim0Var = qim0Var2;
                uwo1.e(bxcVarZ.e, anm1.N("Accessory", qim0Var2), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                z = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z);
            x340Var.r(z);
            uwo1.e(str, anm1.N("Title", qim0Var), cbx.d(x340Var).c, 0L, null, null, 2, false, new cjc0(3), 0, null, x340Var, i3 & 14, 0, 1720);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q18(str, j, str2, str3, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(int i, int i2, String str, String str2, b0k b0kVar, qim0 qim0Var) throws NoWhenBranchMatchedException {
        int i3;
        String str3;
        qim0 qim0Var2;
        vu30 vu30Var;
        Function0 function0;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1050094228);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str3 = str2;
            i3 |= x340Var.g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
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
            int iC = l1d.C(i);
            if (iC == 0) {
                vu30Var = vu30Var2;
                function0 = function1;
                x340Var.i0(-1466655790);
                e(0, 6, cbx.a(x340Var).b.a, 0L, x340Var, null);
                i4 = 0;
                x340Var.r(false);
            } else if (iC == 1) {
                vu30Var = vu30Var2;
                function0 = function1;
                x340Var.i0(-1466561054);
                e(0, 2, cbx.a(x340Var).b.c, ((wex) ((gmt) zex.a.c).c).a, x340Var, null);
                i4 = 0;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1199613206, false);
                }
                x340Var.i0(-1466361073);
                function0 = function1;
                vu30Var = vu30Var2;
                e(0, 6, cbx.a(x340Var).b.b, 0L, x340Var, null);
                i4 = 0;
                x340Var.r(false);
            }
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, i4);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var);
            uwo1.e(str, anm1.N("CtaTitle", qim0Var3), cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(3), 0, null, x340Var, i5 & 14, 0, 1712);
            uwo1.e(str3, anm1.N("CtaSubtitle", qim0Var3), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(3), 0, null, x340Var, (i5 >> 3) & 14, 0, 1712);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(str, str2, i, qim0Var2, i2, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void d(String str, qim0 qim0Var, Function0 function0, vu30 vu30Var, max maxVar, b0k b0kVar, int i, int i2) {
        Function0 function1;
        int i3;
        vu30 vu30Var2;
        max maxVar2;
        int i4;
        boolean z;
        b0k b0kVar2;
        Function0 function2;
        vu30 vu30Var3;
        max maxVar3;
        h311 h311VarV;
        vu30 vu30Var4;
        vu30 vu30Var5;
        max maxVar4;
        Object objT;
        idx idxVar;
        String strO0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-988029425);
        int i5 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(qim0Var) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            function1 = function0;
        } else {
            function1 = function0;
            i3 = i5 | (b0kVar3.i(function1) ? 256 : 128);
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                vu30Var2 = vu30Var;
                i3 |= b0kVar3.i(vu30Var2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                maxVar2 = maxVar;
                int i8 = b0kVar3.i(maxVar2) ? 16384 : 8192;
                i4 = i3 | i8;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i4 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i6 != 0) {
                            objT = b0kVar3.T();
                            if (objT == fkj0.X) {
                                objT = fnc0.V0;
                                b0kVar3.s0(objT);
                            }
                            function2 = (Function0) objT;
                        } else {
                            function2 = function1;
                        }
                        if (i7 != 0) {
                            vu30Var4 = null;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            vu30Var5 = vu30Var4;
                            maxVar4 = jax.a;
                        } else {
                            vu30Var5 = vu30Var4;
                        }
                        b0kVar3.s();
                        idxVar = new idx(19);
                        strO0 = cwl1.o0(b0kVar3, 2131954724);
                        if (ihc1.y0(strO0)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        }
                        b0kVar2 = b0kVar3;
                        foo1.c(new gbx(new y50(strO0), function2), idxVar, qim0Var, maxVar4, yla.s(b0kVar3), null, null, null, vu30Var5, null, apo.r(-758273424, new y5d0(str, (byte) 5), b0kVar3), b0kVar2, ((i4 << 3) & 896) | (57344 & i4) | ((i4 << 18) & 1879048192), 48, 1480);
                        maxVar3 = maxVar4;
                        vu30Var3 = vu30Var5;
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                        }
                        function2 = function1;
                        vu30Var5 = vu30Var2;
                    }
                    maxVar4 = maxVar2;
                    b0kVar3.s();
                    idxVar = new idx(19);
                    strO0 = cwl1.o0(b0kVar3, 2131954724);
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    b0kVar2 = b0kVar3;
                    foo1.c(new gbx(new y50(strO0), function2), idxVar, qim0Var, maxVar4, yla.s(b0kVar3), null, null, null, vu30Var5, null, apo.r(-758273424, new y5d0(str, (byte) 5), b0kVar3), b0kVar2, ((i4 << 3) & 896) | (57344 & i4) | ((i4 << 18) & 1879048192), 48, 1480);
                    maxVar3 = maxVar4;
                    vu30Var3 = vu30Var5;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    function2 = function1;
                    vu30Var3 = vu30Var2;
                    maxVar3 = maxVar2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new nym(str, qim0Var, function2, vu30Var3, maxVar3, i, i2);
                }
            }
            maxVar2 = maxVar;
            i4 = i3 | i8;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        objT = b0kVar3.T();
                        if (objT == fkj0.X) {
                            objT = fnc0.V0;
                            b0kVar3.s0(objT);
                        }
                        function2 = (Function0) objT;
                    } else {
                        function2 = function1;
                    }
                    if (i7 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        vu30Var5 = vu30Var4;
                        maxVar4 = jax.a;
                    } else {
                        vu30Var5 = vu30Var4;
                        maxVar4 = maxVar2;
                    }
                } else {
                    if (i6 != 0) {
                        objT = b0kVar3.T();
                        if (objT == fkj0.X) {
                            objT = fnc0.V0;
                            b0kVar3.s0(objT);
                        }
                        function2 = (Function0) objT;
                    } else {
                        function2 = function1;
                    }
                    if (i7 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        vu30Var5 = vu30Var4;
                        maxVar4 = jax.a;
                    } else {
                        vu30Var5 = vu30Var4;
                        maxVar4 = maxVar2;
                    }
                }
                b0kVar3.s();
                idxVar = new idx(19);
                strO0 = cwl1.o0(b0kVar3, 2131954724);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strO0), function2), idxVar, qim0Var, maxVar4, yla.s(b0kVar3), null, null, null, vu30Var5, null, apo.r(-758273424, new y5d0(str, (byte) 5), b0kVar3), b0kVar2, ((i4 << 3) & 896) | (57344 & i4) | ((i4 << 18) & 1879048192), 48, 1480);
                maxVar3 = maxVar4;
                vu30Var3 = vu30Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                function2 = function1;
                vu30Var3 = vu30Var2;
                maxVar3 = maxVar2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new nym(str, qim0Var, function2, vu30Var3, maxVar3, i, i2);
            }
        }
        i3 |= 3072;
        vu30Var2 = vu30Var;
        if ((i2 & 16) == 0) {
            maxVar2 = maxVar;
            if (b0kVar3.i(maxVar2)) {
            }
            i4 = i3 | i8;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        objT = b0kVar3.T();
                        if (objT == fkj0.X) {
                            objT = fnc0.V0;
                            b0kVar3.s0(objT);
                        }
                        function2 = (Function0) objT;
                    } else {
                        function2 = function1;
                    }
                    if (i7 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        vu30Var5 = vu30Var4;
                        maxVar4 = jax.a;
                    } else {
                        vu30Var5 = vu30Var4;
                        maxVar4 = maxVar2;
                    }
                } else {
                    if (i6 != 0) {
                        objT = b0kVar3.T();
                        if (objT == fkj0.X) {
                            objT = fnc0.V0;
                            b0kVar3.s0(objT);
                        }
                        function2 = (Function0) objT;
                    } else {
                        function2 = function1;
                    }
                    if (i7 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        vu30Var5 = vu30Var4;
                        maxVar4 = jax.a;
                    } else {
                        vu30Var5 = vu30Var4;
                        maxVar4 = maxVar2;
                    }
                }
                b0kVar3.s();
                idxVar = new idx(19);
                strO0 = cwl1.o0(b0kVar3, 2131954724);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strO0), function2), idxVar, qim0Var, maxVar4, yla.s(b0kVar3), null, null, null, vu30Var5, null, apo.r(-758273424, new y5d0(str, (byte) 5), b0kVar3), b0kVar2, ((i4 << 3) & 896) | (57344 & i4) | ((i4 << 18) & 1879048192), 48, 1480);
                maxVar3 = maxVar4;
                vu30Var3 = vu30Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                function2 = function1;
                vu30Var3 = vu30Var2;
                maxVar3 = maxVar2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new nym(str, qim0Var, function2, vu30Var3, maxVar3, i, i2);
            }
        }
        maxVar2 = maxVar;
        i4 = i3 | i8;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = fnc0.V0;
                        b0kVar3.s0(objT);
                    }
                    function2 = (Function0) objT;
                } else {
                    function2 = function1;
                }
                if (i7 != 0) {
                    vu30Var4 = null;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    vu30Var5 = vu30Var4;
                    maxVar4 = jax.a;
                } else {
                    vu30Var5 = vu30Var4;
                    maxVar4 = maxVar2;
                }
            } else {
                if (i6 != 0) {
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = fnc0.V0;
                        b0kVar3.s0(objT);
                    }
                    function2 = (Function0) objT;
                } else {
                    function2 = function1;
                }
                if (i7 != 0) {
                    vu30Var4 = null;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    vu30Var5 = vu30Var4;
                    maxVar4 = jax.a;
                } else {
                    vu30Var5 = vu30Var4;
                    maxVar4 = maxVar2;
                }
            }
            b0kVar3.s();
            idxVar = new idx(19);
            strO0 = cwl1.o0(b0kVar3, 2131954724);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(new y50(strO0), function2), idxVar, qim0Var, maxVar4, yla.s(b0kVar3), null, null, null, vu30Var5, null, apo.r(-758273424, new y5d0(str, (byte) 5), b0kVar3), b0kVar2, ((i4 << 3) & 896) | (57344 & i4) | ((i4 << 18) & 1879048192), 48, 1480);
            maxVar3 = maxVar4;
            vu30Var3 = vu30Var5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            function2 = function1;
            vu30Var3 = vu30Var2;
            maxVar3 = maxVar2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nym(str, qim0Var, function2, vu30Var3, maxVar3, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public static final void e(int i, int i2, long j, long j2, b0k b0kVar, qim0 qim0Var) {
        long jA;
        int i3;
        boolean z;
        long j3;
        qim0 qim0Var2;
        h311 h311VarV;
        int i4;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-681600254);
        int i5 = (x340Var.f(j) ? 4 : 2) | i | 48;
        if ((i2 & 4) == 0) {
            jA = j2;
            int i6 = x340Var.f(jA) ? 256 : 128;
            i3 = i5 | i6;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    i4 = i2 & 4;
                    qim0 qim0Var4 = nim0.a;
                    if (i4 != 0) {
                        uwr uwrVar = cbx.a;
                        jA = cbx.a(x340Var).a.b.a();
                        i3 &= -897;
                    }
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    qim0Var3 = qim0Var;
                }
                x340Var.s();
                qim0 qim0VarR = u291.r(qim0Var3, 48.0f);
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                qim0 qim0VarQ = q(qim0VarR, new zvx());
                int i7 = i3 << 3;
                eso1.h(hso1.G(wox.c, j, jA, x340Var, wox.d | (i7 & 112) | (i7 & 7168), 20), isl.a, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 24632, 488);
                qim0Var2 = qim0Var3;
                j3 = jA;
            } else {
                x340Var.b0();
                j3 = jA;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hwx(j, qim0Var2, j3, i, i2);
            }
        }
        jA = j2;
        i3 = i5 | i6;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                i4 = i2 & 4;
                qim0 qim0Var5 = nim0.a;
                if (i4 != 0) {
                    uwr uwrVar3 = cbx.a;
                    jA = cbx.a(x340Var).a.b.a();
                    i3 &= -897;
                }
                qim0Var3 = qim0Var5;
            } else {
                i4 = i2 & 4;
                qim0 qim0Var6 = nim0.a;
                if (i4 != 0) {
                    uwr uwrVar4 = cbx.a;
                    jA = cbx.a(x340Var).a.b.a();
                    i3 &= -897;
                }
                qim0Var3 = qim0Var6;
            }
            x340Var.s();
            qim0 qim0VarR2 = u291.r(qim0Var3, 48.0f);
            uwr uwrVar5 = cbx.a;
            cua cuaVar3 = cbx.b(x340Var).f;
            cua cuaVar4 = cbx.b(x340Var).f;
            qim0 qim0VarQ2 = q(qim0VarR2, new zvx());
            int i8 = i3 << 3;
            eso1.h(hso1.G(wox.c, j, jA, x340Var, wox.d | (i8 & 112) | (i8 & 7168), 20), isl.a, qim0VarQ2, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 24632, 488);
            qim0Var2 = qim0Var3;
            j3 = jA;
        } else {
            x340Var.b0();
            j3 = jA;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwx(j, qim0Var2, j3, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(boolean z, boolean z2, String str, String str2, int i, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        String str3;
        Function0 function2;
        Function0 function3;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1662087190);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i2 & 6) == 0) {
            i3 = (b0kVar2.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar2.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            str3 = str;
            i3 |= b0kVar2.g(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar2.g(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar2.e(l1d.C(i)) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function2 = function0;
            i3 |= b0kVar2.i(function2) ? 131072 : 65536;
        } else {
            function2 = function0;
        }
        if ((1572864 & i2) == 0) {
            function3 = function1;
            i3 |= b0kVar2.i(function3) ? 1048576 : 524288;
        } else {
            function3 = function1;
        }
        int i4 = i3 | 12582912;
        if (b0kVar2.Y(i4 & 1, (4793491 & i4) != 4793490)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z3 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            vbe.s(str2, (qim0) null, 0L, 0L, (lee1) null, false, b0kVar2, (i4 >> 9) & 14, 62);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB);
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
            int i5 = i4 >> 3;
            b0kVar2 = b0kVar2;
            g(z, z2, str3, i, function2, function3, b0kVar2, (i4 & 1022) | (i5 & 7168) | (57344 & i5) | (i5 & 458752));
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new dkd0(z, z2, str, str2, i, function0, function1, qim0Var2, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(boolean z, boolean z2, String str, int i, Function0 function0, Function0 function1, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1141497830);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.i(function1) ? 131072 : 65536;
        }
        if (!x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            x340Var.b0();
        } else if (z2 && i == 1) {
            x340Var.i0(-1188936013);
            gfx.b(6, apo.r(-391028170, new y5d0(str, (byte) 6), x340Var), x340Var, 54);
            x340Var.r(false);
        } else if (z) {
            x340Var.i0(-1188427210);
            int iC = l1d.C(i);
            if (iC == 0) {
                x340Var.i0(1762779938);
                gfx.b(6, apo.r(132215383, new ql(str, function0, b2), x340Var), x340Var, 54);
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(1762796326);
                gfx.b(4, apo.r(157271232, new ql(str, function0, (byte) 17), x340Var), x340Var, 54);
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1762778956, false);
                }
                x340Var.i0(1762812709);
                gfx.b(6, apo.r(1339503967, new y5d0(str, (byte) 7), x340Var), x340Var, 54);
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            x340Var.i0(-1187023530);
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                x340Var.i0(1762825458);
                gfx.b(6, apo.r(1849668599, new ql(str, function1, (byte) 18), x340Var), x340Var, 54);
                x340Var.r(false);
            } else if (iC2 == 1) {
                x340Var.i0(1762834166);
                gfx.b(4, apo.r(1502716640, new ql(str, function1, (byte) 19), x340Var), x340Var, 54);
                x340Var.r(false);
            } else {
                if (iC2 != 2) {
                    throw p3d1.k(x340Var, 1762824236, false);
                }
                x340Var.i0(1762843109);
                gfx.b(6, apo.r(-681559297, new y5d0(str, (byte) 8), x340Var), x340Var, 54);
                x340Var.r(false);
            }
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ekd0(z, z2, str, i, function0, function1, i2);
        }
    }

    public static final void h(yr70 yr70Var, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0VarR;
        String str = yr70Var.d;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(480679174);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(yr70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(1.0f, x340Var2);
            }
            drr0 drr0Var = (drr0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = kaa0.h(0L, x340Var2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = kaa0.h(0L, x340Var2);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = p3d1.n(0L, x340Var2);
            }
            ven0 ven0Var3 = (ven0) objT4;
            boolean z = drr0Var.s() > 1.0f;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(anm1.N("compose-image-container", u291.f(qim0Var, 1.0f)), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            vex vexVar = (vex) zscVar.e;
            vex vexVar2 = (vex) zscVar.e;
            boolean z2 = z;
            qim0 qim0VarX = uyn1.x(dug.f(qim0VarB, vexVar.c, er31.b(8.0f)), 8.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
            Double d = yr70Var.g;
            if (d == null || (qim0VarR = d7e.r((float) d.doubleValue(), qim0Var, false)) == null) {
                qim0VarR = qim0Var;
            }
            jsl jslVar = str.length() > 0 ? new jsl(str) : isl.a;
            Uri uri = Uri.parse(yr70Var.c);
            qim0 qim0VarJ = u291.j(110.0f, 0.0f, 2, u291.f(qim0Var, 1.0f).then(qim0VarR));
            boolean zI = x340Var2.i(ven0Var2) | x340Var2.i(ven0Var3);
            Object objT5 = x340Var2.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new xs3(ven0Var2, ven0Var3, (byte) 8);
                x340Var2.s0(objT5);
            }
            qim0 qim0VarX2 = ern1.x(qim0VarJ, (iu30) objT5);
            boolean zI2 = x340Var2.i(drr0Var) | x340Var2.i(ven0Var);
            Object objT6 = x340Var2.T();
            if (zI2 || objT6 == m4cVar) {
                objT6 = new ep30(drr0Var, ven0Var, (byte) 1);
                x340Var2.s0(objT6);
            }
            qim0 qim0VarN = anm1.N("compose-image", q(f8d1.b(qim0VarX2, rih1.a, (PointerInputEventHandler) objT6), er31.b(8.0f)));
            boolean z3 = (i2 & 112) == 32;
            Object objT7 = x340Var2.T();
            if (z3 || objT7 == m4cVar) {
                objT7 = new j160(function0, (byte) 6);
                x340Var2.s0(objT7);
            }
            eso1.e(uri, jslVar, bin.x(qim0VarN, false, null, null, null, (Function0) objT7, 15), (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 224256, 0, 3968);
            x340Var = x340Var2;
            String str2 = yr70Var.e;
            if (str2 == null || str2.length() == 0) {
                x340Var.i0(1463344070);
                x340Var.r(false);
            } else {
                v8i0.i(8.0f, 1463029823, x340Var, x340Var, qim0Var);
                uwo1.e(yr70Var.e, anm1.N("compose-image-caption", qim0Var), cbx.d(x340Var).m, vexVar2.n, null, null, 0, false, new cjc0(6), 0, null, x340Var, 0, 0, 1776);
                x340Var = x340Var;
                x340Var.r(false);
            }
            String str3 = yr70Var.f;
            if (str3 == null || str3.length() == 0) {
                x340Var.i0(1463672422);
                x340Var.r(false);
            } else {
                v8i0.i(4.0f, 1463394693, x340Var, x340Var, qim0Var);
                x340 x340Var3 = x340Var;
                uwo1.e(yr70Var.f, anm1.N("compose-image-license", qim0Var), cbx.d(x340Var3).m, vexVar2.k, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2032);
                x340Var = x340Var3;
                x340Var.r(false);
            }
            String str4 = yr70Var.i;
            if (str4 == null || str4.length() == 0) {
                x340Var.i0(1464100966);
                x340Var.r(false);
            } else {
                v8i0.i(8.0f, 1463730020, x340Var, x340Var, qim0Var);
                String str5 = yr70Var.i;
                lee1 lee1Var = cbx.d(x340Var).m;
                long j = vexVar2.m;
                qim0 qim0VarN2 = anm1.N("compose-image-external-link", qim0Var);
                boolean z4 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                Object objT8 = x340Var.T();
                if (z4 || objT8 == m4cVar) {
                    objT8 = new hs20(iu30Var, yr70Var, (byte) 26);
                    x340Var.s0(objT8);
                }
                x340 x340Var4 = x340Var;
                uwo1.e(str5, bin.x(qim0VarN2, false, null, null, null, (Function0) objT8, 15), lee1Var, j, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2032);
                x340Var = x340Var4;
                x340Var.r(false);
            }
            x340Var.r(true);
            if (z2) {
                x340Var.i0(495516706);
                wat watVar = (wat) x340Var.k(t4k.h);
                sy4.a(new fza((byte) 13), (Function0) null, new nfv0(7, false, false, false), apo.r(-576923457, new bs70(yoi1.o((drr0Var.s() - 1.0f) / 2.0f, 0.0f, 0.7f), yr70Var, ven0Var2, watVar.M0((int) (((yr80) ven0Var3.getValue()).a >> 32)), watVar.M0((int) (((yr80) ven0Var3.getValue()).a & 4294967295L)), drr0Var, ven0Var), x340Var), x340Var, 3072, 2);
                x340Var.r(false);
            } else {
                x340Var.i0(496956284);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(yr70Var, function0, iu30Var, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void i(ckd0 ckd0Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        String str;
        boolean z2;
        Function0 function3;
        boolean z3;
        String str2;
        String str3;
        Function0 function4;
        bxc bxcVarZ;
        int iC;
        String strN;
        boolean zG;
        Object objT;
        ckd0 ckd0Var2 = ckd0Var;
        Function0 function5 = function1;
        int i4 = ckd0Var2.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(599907752);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(ckd0Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(function2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                str = ckd0Var2.k;
                if (ckd0Var2.m || i4 != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (ckd0Var2.b) {
                    function3 = function2;
                } else {
                    function3 = function5;
                }
                int i6 = i3 & 14;
                z3 = z2;
                long j = ckd0Var2.h;
                str2 = ckd0Var2.g;
                str3 = ckd0Var2.e;
                function4 = function3;
                bxcVarZ = qon1.z(j, null, null, x340Var, 0, 6);
                iC = l1d.C(i4);
                if (iC != 0) {
                    String str4 = bxcVarZ.a;
                    String str5 = bxcVarZ.b;
                    String str6 = bxcVarZ.e;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(". ");
                    sb.append(str4);
                    sb.append(" ");
                    sb.append(str5);
                    strN = l1d.n(". ", str6, sb);
                } else if (iC != 1) {
                    strN = f4i1.f(str2, ". ", str3);
                } else {
                    if (iC == 2) {
                        eg.o();
                        return;
                    }
                    strN = f4i1.f(str2, ". ", String.format(str3, Arrays.copyOf(new Object[]{bxcVarZ.d}, 1)));
                }
                qim0 qim0VarV = u291.v(qim0Var4, 343.0f);
                zG = (i6 == 4) | x340Var.g(strN) | x340Var.h(z3) | x340Var.g(str) | x340Var.g(function4);
                objT = x340Var.T();
                if (!zG || objT == fkj0.X) {
                    ckd0Var2 = ckd0Var;
                    o96 o96Var = new o96(ckd0Var2, strN, z3, str, function4);
                    x340Var.s0(o96Var);
                    objT = o96Var;
                } else {
                    ckd0Var2 = ckd0Var;
                }
                function5 = function1;
                cwl1.b(s161.b(qim0VarV, true, (iu30) objT), (tl3) null, er31.b(16.0f), mgx.e, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, apo.r(220802385, new cy00(ckd0Var2, function2, function5, (byte) 25), x340Var), x340Var, 0, 48, 1506);
                x340Var = x340Var;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(ckd0Var2, function0, function5, function2, qim0Var3, i, i2, (byte) 11);
            }
        }
        i3 |= 24576;
        qim0Var2 = qim0Var;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i5 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            str = ckd0Var2.k;
            if (ckd0Var2.m) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (ckd0Var2.b) {
                function3 = function2;
            } else {
                function3 = function5;
            }
            int i7 = i3 & 14;
            z3 = z2;
            long j2 = ckd0Var2.h;
            str2 = ckd0Var2.g;
            str3 = ckd0Var2.e;
            function4 = function3;
            bxcVarZ = qon1.z(j2, null, null, x340Var, 0, 6);
            iC = l1d.C(i4);
            if (iC != 0) {
                String str7 = bxcVarZ.a;
                String str8 = bxcVarZ.b;
                String str9 = bxcVarZ.e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(". ");
                sb2.append(str7);
                sb2.append(" ");
                sb2.append(str8);
                strN = l1d.n(". ", str9, sb2);
            } else if (iC != 1) {
                strN = f4i1.f(str2, ". ", str3);
            } else {
                if (iC == 2) {
                    eg.o();
                    return;
                }
                strN = f4i1.f(str2, ". ", String.format(str3, Arrays.copyOf(new Object[]{bxcVarZ.d}, 1)));
            }
            qim0 qim0VarV2 = u291.v(qim0Var4, 343.0f);
            zG = (i7 == 4) | x340Var.g(strN) | x340Var.h(z3) | x340Var.g(str) | x340Var.g(function4);
            objT = x340Var.T();
            if (zG) {
                ckd0Var2 = ckd0Var;
                o96 o96Var2 = new o96(ckd0Var2, strN, z3, str, function4);
                x340Var.s0(o96Var2);
                objT = o96Var2;
            } else {
                ckd0Var2 = ckd0Var;
                o96 o96Var3 = new o96(ckd0Var2, strN, z3, str, function4);
                x340Var.s0(o96Var3);
                objT = o96Var3;
            }
            function5 = function1;
            cwl1.b(s161.b(qim0VarV2, true, (iu30) objT), (tl3) null, er31.b(16.0f), mgx.e, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, apo.r(220802385, new cy00(ckd0Var2, function2, function5, (byte) 25), x340Var), x340Var, 0, 48, 1506);
            x340Var = x340Var;
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(ckd0Var2, function0, function5, function2, qim0Var3, i, i2, (byte) 11);
        }
    }

    public static final void j(int i, int i2, String str, b0k b0kVar, boolean z) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(195457457);
        int i3 = i2 | (x340Var.h(z) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.e(l1d.C(i)) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object objT = x340Var.T();
            if (z2 || objT == obj) {
                objT = Boolean.valueOf(z || i == 3);
                x340Var.s0(objT);
            }
            boolean zBooleanValue = ((Boolean) objT).booleanValue();
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarN = anm1.N("MainImage", u291.d(nim0Var, 1.0f));
            if (zBooleanValue) {
                qim0VarN = qim0VarN.then(fc11.n(nim0Var, 4.0f, 4.0f, d4o1.a));
            }
            cso1.d(Uri.parse(str), isl.a, qim0VarN, null, null, null, null, x340Var, 48, 248);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            boolean zH = x340Var.h(zBooleanValue);
            Object objT2 = x340Var.T();
            if (zH || objT2 == obj) {
                objT2 = new mj10((byte) 10, zBooleanValue);
                x340Var.s0(objT2);
            }
            t1c.a(exd0.q(qim0VarD, (iu30) objT2), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fkd0(str, i, i2, z);
        }
    }

    public static final void k(int i, int i2, long j, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        long j2;
        x340 x340Var;
        long j3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-153313873);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i3 |= ((i2 & 8) == 0 && x340Var2.f(j2)) ? 2048 : 1024;
        } else {
            j2 = j;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var2.d0();
            if ((i & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
                uwr uwrVar = cbx.a;
                j2 = cbx.a(x340Var2).b.b;
                i3 &= -7169;
            }
            int i4 = i3;
            long j4 = j2;
            x340Var2.s();
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarY = uyn1.y(qim0Var, 8.0f, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarY);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            qim0 qim0VarN = anm1.N("Badge", nim0Var);
            uwr uwrVar2 = cbx.a;
            uwo1.e(str2, qim0VarN, cbx.d(x340Var2).m, u7h.f, null, null, 0, false, null, 0, null, x340Var2, (i4 >> 3) & 14, 0, 2032);
            x340Var = x340Var2;
            x340Var.r(true);
            uwo1.e(str, anm1.N("Subtitle", nim0Var), cbx.d(x340Var).j, j4, null, null, 0, false, null, 0, null, x340Var2, i4 & 7182, 0, 2032);
            x340Var.r(true);
            j3 = j4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            j3 = j2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zpy(i, i2, j3, str, str2, qim0Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(int i, v6y0 v6y0Var, Function0 function0, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        hax haxVar;
        float f;
        b0k b0kVar3 = (x340) b0kVar;
        int i3 = (kk0.t(1054452707, i, b0kVar3) ? 4 : 2) | i2 | (b0kVar3.i(v6y0Var) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(16.0f);
            if (v6y0Var.d) {
                b0kVar3.i0(-189923071);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131959824));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-189825731);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            mgx mgxVar = mgx.e;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(0, mgxVar, 0, new zzq0(16.0f, 12.0f, 16.0f, 12.0f), (zzq0) null, (tvx) null, cr31VarB, 0, (p3v) null, 437);
            gbx gbxVar = new gbx(z50.c, function0);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            int iC = l1d.C(i);
            if (iC == 0) {
                b0kVar3.i0(-283185175);
                f = cbx.b(b0kVar3).b.a;
                b0kVar3.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(b0kVar3, -283188167, false);
                }
                b0kVar3.i0(-283182105);
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f = 16.0f;
            }
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            cvx cvxVar6 = cbx.b(b0kVar3).b;
            qim0 qim0VarQ = q(uyn1.A(qim0VarF, 16.0f, f, 16.0f, 16.0f), cr31VarB);
            boolean zI = b0kVar3.i(v6y0Var);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new fgs0(v6y0Var, (byte) 17);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(s161.b(qim0VarQ, true, (iu30) objT), uvxVar, haxVar, false, null, null, gbxVar, null, null, null, null, j8j.a, apo.r(210151882, new ukm0(v6y0Var, haxVar, (byte) 24), b0kVar3), null, null, j8j.b, b0kVar2, 64, 197040, 26552);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(i, v6y0Var, function0, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    public static final void m(String str, String str2, float f, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        ?? r4;
        float f2;
        boolean z2;
        j2i j2iVar = dtj.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1202171801);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(str2) ? 32 : 16) | (b0kVar2.d(f) ? 256 : 128) | (b0kVar2.h(z) ? 2048 : 1024) | (b0kVar2.i(function0) ? 131072 : 65536) | 1572864;
        if (b0kVar2.Y(i2 & 1, (599187 & i2) != 599186)) {
            float fO = yoi1.o(f, 0.0f, 1.0f);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            zov0 zov0Var2 = cbx.b(b0kVar2).g;
            float fT = dm5.T(16.0f, 24.0f, fO);
            cvx cvxVar = cbx.b(b0kVar2).b;
            float f3 = b0kVar2.k(t4k.n) == flb0.b ? -1.0f : 1.0f;
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar2);
            }
            idn0 idn0Var = (idn0) objT;
            fra fraVar = een.N0;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarV = bin.v(anm1.N("referral-toolbar-action", qim0Var4), idn0Var, jtr.f, false, null, new pm31(0), function0, 12);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarV, 0.0f, 0.0f, 12.0f, 0.0f, 11);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z3 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            if (fO < 1.0f) {
                b0kVar2.i0(1207108938);
                if (z) {
                    b0kVar2.i0(1207127259);
                    boolean zD = b0kVar2.d(fO) | b0kVar2.d(16.0f) | b0kVar2.d(f3);
                    Object objT2 = b0kVar2.T();
                    if (zD || objT2 == m4cVar) {
                        objT2 = new e8(fO, f3, (byte) 11);
                        b0kVar2.s0(objT2);
                    }
                    qim0 qim0VarC = i541.C(qim0Var4, (iu30) objT2);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM2 = b0kVar2.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarC);
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
                    j2iVar.invoke(b0kVar2, 6);
                    b0kVar2.r(true);
                    cvx cvxVar3 = cbx.b(b0kVar2).b;
                    f2 = 8.0f;
                    z2 = false;
                    ab80.p(qim0Var4, 8.0f, b0kVar2, false);
                } else {
                    f2 = 8.0f;
                    z2 = false;
                    b0kVar2.i0(1207452077);
                    b0kVar2.r(false);
                }
                lee1 lee1Var = cbx.d(b0kVar2).k;
                long j = cbx.a(b0kVar2).b.a;
                qim0 qim0VarN = anm1.N("referral-toolbar-cta-text", qim0Var4);
                float f4 = f3;
                boolean zD2 = b0kVar2.d(fO) | b0kVar2.d(16.0f) | b0kVar2.d(f4);
                Object objT3 = b0kVar2.T();
                if (zD2 || objT3 == m4cVar) {
                    objT3 = new e8(fO, f4, (byte) 12);
                    b0kVar2.s0(objT3);
                }
                boolean z4 = z2;
                qim0Var3 = qim0Var4;
                uwo1.e(str, i541.C(qim0VarN, (iu30) objT3), lee1Var, j, null, null, 0, false, null, 0, null, b0kVar2, i2 & 14, 0, 2032);
                b0kVar2 = b0kVar2;
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                ab80.p(qim0Var3, f2, b0kVar2, z4);
                r4 = z4;
            } else {
                qim0Var3 = qim0Var4;
                r4 = 0;
                b0kVar2.i0(1207880621);
                b0kVar2.r(false);
            }
            eso1.h(i3o1.n(2131233382, b0kVar2, r4), new jsl(str2), anm1.N("referral-toolbar-icon", qim0Var3), new p3v(fT), (zvx) null, (ecx) null, (j6m) null, (tl3) null, new f2b(cbx.a(b0kVar2).b.c, 5), b0kVar2, 221192, 192);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o08(str, str2, f, z, function0, qim0Var2, i);
        }
    }

    public static final void n(String str, String str2, long j, long j2, b0k b0kVar, int i) {
        int i2;
        long j3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(493264473);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g("\u0000") ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j3 = j;
            i2 |= x340Var.f(j3) ? 2048 : 1024;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.f(j2) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            zma1 zma1VarA = zma1.a(cbx.d(x340Var).k.a, j2, TextUnit.c, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65532);
            w2g0.c(u291.f(nim0.a, 1.0f), (tl3) null, apo.r(1523494703, new itd1(watVar, str, str2, lee1Var, zma1.a(zma1VarA, u7h.k, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534), cbx.d(x340Var).m.a.b, yae1VarQ, zma1VarA, j3), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fg6(i, j, j2, str, str2);
        }
    }

    public static final qim0 o(qim0 qim0Var, long j, long j2) {
        long jB = u7h.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14);
        long jB2 = u7h.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14);
        long jB3 = u7h.b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14);
        long jT = z4p1.t(jB, j2);
        long jT2 = z4p1.t(jB2, j2);
        long jT3 = z4p1.t(jB3, j2);
        return dug.e(qim0Var, v9c.p(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(jT)), new mmr0(Float.valueOf(0.5f), new u7h(jT2)), new mmr0(Float.valueOf(1.0f), new u7h(jT3))}, 0L, 0.0f, 14), er31.a, 0.0f, 4);
    }

    public static final af5 p(String str, String str2, zma1 zma1Var) {
        int iW0 = ihc1.w0(str, "\u0000", 0, false, 6);
        if (iW0 < 0) {
            return new af5(str);
        }
        ye5 ye5Var = new ye5();
        ye5Var.g(str.substring(0, iW0));
        ye5Var.o(zma1Var);
        ye5Var.g(str2);
        ye5Var.j();
        ye5Var.g(str.substring(1 + iW0));
        return ye5Var.p();
    }

    public static final qim0 q(qim0 qim0Var, hw61 hw61Var) {
        return i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, hw61Var, true, 0L, 0L, 0, null, 1042431);
    }

    public static final qim0 r(qim0 qim0Var) {
        return i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 0, null, 1044479);
    }

    public static k42 s(e140 e140Var, ivj ivjVar, h140 h140Var, q7r0 q7r0Var, rih1 rih1Var) {
        e140Var.getClass();
        ivjVar.getClass();
        rih1Var.getClass();
        return new k42(e140Var, ivjVar, h140Var, q7r0Var);
    }

    public static final boolean t(lee1 lee1Var, long j, int i, yae1 yae1Var, af5 af5Var) {
        return !yae1.b(yae1Var, af5Var, lee1.a(lee1Var, 0L, j, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), 1, true, 3, jjl.b(0, i, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1952).b.c;
    }

    public static csj0 u(csj0 csj0Var, flb0 flb0Var, lee1 lee1Var, wat watVar, f930 f930Var) {
        if (csj0Var != null && flb0Var == csj0Var.a && z6p1.F(lee1Var, flb0Var).equals(csj0Var.b) && watVar.h() == csj0Var.c.a && f930Var == csj0Var.d) {
            return csj0Var;
        }
        csj0 csj0Var2 = csj0.h;
        if (csj0Var2 != null && flb0Var == csj0Var2.a && z6p1.F(lee1Var, flb0Var).equals(csj0Var2.b) && watVar.h() == csj0Var2.c.a && f930Var == csj0Var2.d) {
            return csj0Var2;
        }
        csj0 csj0Var3 = new csj0(flb0Var, z6p1.F(lee1Var, flb0Var), new xat(watVar.h(), watVar.U0()), f930Var);
        csj0.h = csj0Var3;
        return csj0Var3;
    }

    public static ArrayList v(List list) {
        c9 c9Var = ya20.c;
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c9Var.listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (list.contains(((ya20) next).a)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final go80 w(klm klmVar, xbp0 xbp0Var, sap0 sap0Var) {
        return klmVar.a("NpvWidgetLogoutMonitorDaemon", new rap0(xbp0Var, sap0Var, (byte) 24));
    }

    public static final void x(jjz jjzVar) {
        jjzVar.a(new xiz(fjz.b, yiz.c, ajz.c), da71.d, da71.e);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long y(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1850883530);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            x340Var.r(false);
            return j;
        }
        if (iC == 1) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1850885357);
            uwr uwrVar2 = cbx.a;
            long j2 = cbx.a(x340Var2).b.b;
            x340Var2.r(false);
            return j2;
        }
        if (iC != 2) {
            throw p3d1.k((x340) b0kVar, 1850881552, false);
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(1850887314);
        uwr uwrVar3 = cbx.a;
        long j3 = cbx.a(x340Var3).b.c;
        x340Var3.r(false);
        return j3;
    }

    public static final qim0 z(qim0 qim0Var, es41 es41Var, float f) {
        return exd0.r(i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039), new o5j1(f, es41Var));
    }
}
