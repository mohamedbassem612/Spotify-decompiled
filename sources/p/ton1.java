package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ton1 implements kq51 {
    public static final f6f0 a = new f6f0((byte) 0);
    public static b180 b;

    public static nw80 A(xm41 xm41Var) {
        return (nw80) eth.z(xm41Var, v3b1.b);
    }

    public static final dwl B(cvc0 cvc0Var) {
        if (cvc0Var instanceof vuc0) {
            xuc0 xuc0Var = ((vuc0) cvc0Var).b;
            return new evl(xuc0Var.b, xuc0Var.c);
        }
        if (cvc0Var instanceof wuc0) {
            xuc0 xuc0Var2 = ((wuc0) cvc0Var).b;
            return new jvl(xuc0Var2.b, xuc0Var2.c);
        }
        if (cvc0Var instanceof uuc0) {
            return new xul(((uuc0) cvc0Var).b);
        }
        eg.o();
        return null;
    }

    public static final void b(String str, String str2, long j, qim0 qim0Var, long j2, float f, b0k b0kVar, int i) {
        long j3;
        float f2;
        long j4;
        float f3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-194066769);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | 204800;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                j4 = u7h.k;
                f3 = 8.0f;
            } else {
                x340Var.b0();
                j4 = j2;
                f3 = f;
            }
            x340Var.s();
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                uwr uwrVar = cbx.a;
                yfu yfuVar = ajx.a;
                Object obj = yfuVar.b;
                objT = hm5.d(new a930[]{o0c.a(14, (FontWeight) null, new ja30(new ga30[]{u890.I(150.0f), u890.H(((FontWeight) ((bjx) yfuVar.c).e).a)}))});
                x340Var.s0(objT);
            }
            FontFamily fontFamily = (FontFamily) objT;
            long j5 = j4;
            gfx.b(8, apo.r(380413850, new ywc(j5, qim0Var, f3, j, str, new lee1(0L, fc11.Y(8.0f, 4294967296L), (FontWeight) null, fontFamily, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777181), str2, new lee1(0L, fc11.Y(16.0f, 4294967296L), (FontWeight) null, fontFamily, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777181)), x340Var), x340Var, 54);
            j3 = j5;
            f2 = f3;
        } else {
            x340Var.b0();
            j3 = j2;
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zwc(str, str2, j, qim0Var, j3, f2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:64:0x018b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0192  */
    /* JADX WARN: Code duplicated, block: B:67:0x0198  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x020e  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void f(int i, int i2, int i3, int i4, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        h311 h311VarV;
        int i9;
        lee1 lee1VarA;
        lee1 lee1VarA2;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1132401751);
        int i10 = (x340Var.g(str) ? 4 : 2) | i3 | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        int i11 = i4 & 8;
        if (i11 != 0) {
            i10 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i10 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024;
        }
        if ((i4 & 16) == 0) {
            i5 = i2;
            int i12 = x340Var.e(i5) ? 16384 : 8192;
            i6 = i10 | i12;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i6 & 1, z)) {
                x340Var.d0();
                if ((i3 & 1) != 0 || x340Var.E()) {
                    if (i11 != 0) {
                        i9 = 1;
                    } else {
                        i9 = i;
                    }
                    if ((i4 & 16) != 0) {
                        i6 &= -57345;
                        i5 = 2131102457;
                    }
                } else {
                    x340Var.b0();
                    if ((i4 & 16) != 0) {
                        i6 &= -57345;
                    }
                    i9 = i;
                }
                x340Var.s();
                if (i9 == 1) {
                    x340Var.i0(1587795343);
                    uwr uwrVar = cbx.a;
                    lee1VarA = cbx.d(x340Var).e;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1587844106);
                    uwr uwrVar2 = cbx.a;
                    lee1VarA = lee1.a(cbx.d(x340Var).e, 0L, fc11.Y(18.0f, 4294967296L), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                    x340Var.r(false);
                }
                if (i9 == 1) {
                    x340Var.i0(1587981901);
                    lee1VarA2 = cbx.d(x340Var).n;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1588032710);
                    lee1VarA2 = lee1.a(cbx.d(x340Var).n, 0L, fc11.Y(11.0f, 4294967296L), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                    x340Var.r(false);
                }
                era eraVar = een.Q0;
                qim0 qim0VarF = dug.f(i1p1.q(qim0Var, er31.b(4.0f)), f5p1.k(x340Var, i5), d4o1.a);
                mbhVarA = jbh.a(h36.e, eraVar, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                uwo1.e(str, null, lee1VarA2, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, i6 & 14, 0, 2026);
                uwo1.e(str2, null, lee1VarA, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i6 >> 3) & 14, 0, 2026);
                x340Var = x340Var;
                x340Var.r(true);
                i7 = i9;
            } else {
                x340Var.b0();
                i7 = i;
            }
            i8 = i5;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new axc(i7, i8, i3, i4, str, str2, qim0Var);
            }
        }
        i5 = i2;
        i6 = i10 | i12;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i6 & 1, z)) {
            x340Var.d0();
            if ((i3 & 1) != 0) {
                if (i11 != 0) {
                    i9 = 1;
                } else {
                    i9 = i;
                }
                if ((i4 & 16) != 0) {
                    i6 &= -57345;
                    i5 = 2131102457;
                }
            } else {
                if (i11 != 0) {
                    i9 = 1;
                } else {
                    i9 = i;
                }
                if ((i4 & 16) != 0) {
                    i6 &= -57345;
                    i5 = 2131102457;
                }
            }
            x340Var.s();
            if (i9 == 1) {
                x340Var.i0(1587795343);
                uwr uwrVar3 = cbx.a;
                lee1VarA = cbx.d(x340Var).e;
                x340Var.r(false);
            } else {
                x340Var.i0(1587844106);
                uwr uwrVar4 = cbx.a;
                lee1VarA = lee1.a(cbx.d(x340Var).e, 0L, fc11.Y(18.0f, 4294967296L), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                x340Var.r(false);
            }
            if (i9 == 1) {
                x340Var.i0(1587981901);
                lee1VarA2 = cbx.d(x340Var).n;
                x340Var.r(false);
            } else {
                x340Var.i0(1588032710);
                lee1VarA2 = lee1.a(cbx.d(x340Var).n, 0L, fc11.Y(11.0f, 4294967296L), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                x340Var.r(false);
            }
            era eraVar2 = een.Q0;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0Var, er31.b(4.0f)), f5p1.k(x340Var, i5), d4o1.a);
            mbhVarA = jbh.a(h36.e, eraVar2, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            uwo1.e(str, null, lee1VarA2, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, i6 & 14, 0, 2026);
            uwo1.e(str2, null, lee1VarA, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i6 >> 3) & 14, 0, 2026);
            x340Var = x340Var;
            x340Var.r(true);
            i7 = i9;
        } else {
            x340Var.b0();
            i7 = i;
        }
        i8 = i5;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new axc(i7, i8, i3, i4, str, str2, qim0Var);
        }
    }

    public static final void g(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(441837433);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new e6f0();
                x340Var.s0(objT);
            }
            e6f0 e6f0Var = (e6f0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new el70((byte) 13);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            g6f0 g6f0Var = new g6f0((byte) 0);
            if (x340Var.S) {
                x340Var.b(rih1.a, new dpb0(g6f0Var, (byte) 1));
            }
            nko1.H(e6f0Var, x340Var, new f6f0((byte) 1));
            j2iVar.invoke(e6f0Var, x340Var, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ai3(j2iVar, i, (byte) 3);
        }
    }

    public static final void h(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(89146464);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var2).b, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, i2 & 14, 0, 2034);
            uwo1.e(str2, null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, (i2 >> 3) & 14, 0, 2034);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 25);
        }
    }

    public static final void i(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-839085224);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.x(qim0Var3, 16.0f), 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            ogx ogxVar = ogx.e;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cwl1.b(qim0VarF, (tl3) null, cr31VarB, ogxVar, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, apo.r(-12788401, new f13(i, (byte) 23), x340Var), x340Var, 0, 48, 1506);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(i, i2, function0, qim0Var2);
        }
    }

    public static final void j(mox0 mox0Var, n1x n1xVar, l0x0 l0x0Var) {
        zz zzVar;
        ykm ykmVar;
        if (mox0Var.b() && (ykmVar = mox0Var.k) != null && ykmVar.c) {
            zzVar = zz.a;
        } else {
            zzVar = mox0Var.b() ? b00.a : a00.a;
        }
        l0x0Var.o(new d00(gho1.r(n1xVar), wgo1.w(n1xVar), zzVar));
    }

    public static final void k(String str, tqw tqwVar, lzn0 lzn0Var) {
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        lzn0Var.f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
    }

    public static final void l(n1x n1xVar, l0x0 l0x0Var) {
        l0x0Var.o(new qy(gho1.r(n1xVar), wgo1.w(n1xVar)));
    }

    public static final void m(boolean z, n1x n1xVar, l0x0 l0x0Var) {
        l0x0Var.o(new z00(wgo1.x(n1xVar), gho1.r(n1xVar), z));
    }

    public static final js20 o(iox0 iox0Var, hox0 hox0Var, lzn0 lzn0Var, l0x0 l0x0Var) {
        return x3p1.n(hox0Var, fft0.i, ibi0.Y, null, new d(lzn0Var, l0x0Var, (byte) 16), 8);
    }

    public static void p(eon0 eon0Var, String str, j2i j2iVar) {
        rzn0 rzn0Var = eon0Var.h;
        rzn0Var.getClass();
        eon0Var.k.add(new vvj(rzn0Var.b(rzn1.u(uvj.class)), str, j2iVar).a());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (p.o95.b(r2, r3, r4, (java.lang.Float) null, (p.iu30) null, r7, 12) == r15) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(p.o95 r16, p.onm r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof p.xlv
            if (r1 == 0) goto L16
            r1 = r0
            p.xlv r1 = (p.xlv) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.c = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            p.xlv r1 = new p.xlv
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.b
            int r1 = r7.c
            r9 = 6
            r10 = 0
            r11 = 200(0xc8, float:2.8E-43)
            r12 = 3
            r13 = 2
            r2 = 1
            r14 = 0
            p.d9n r15 = p.d9n.a
            if (r1 == 0) goto L49
            if (r1 == r2) goto L43
            if (r1 == r13) goto L3c
            if (r1 != r12) goto L36
            p.hm5.M(r0)
            goto L92
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r14
        L3c:
            p.o95 r1 = r7.a
            p.hm5.M(r0)
        L41:
            r2 = r1
            goto L79
        L43:
            p.o95 r1 = r7.a
            p.hm5.M(r0)
            goto L6c
        L49:
            p.hm5.M(r0)
            java.lang.Float r3 = new java.lang.Float
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r3.<init>(r0)
            p.pxg1 r4 = p.irn1.o0(r11, r10, r14, r9)
            r0 = r16
            r7.a = r0
            r7.c = r2
            r5 = 0
            r6 = 0
            r8 = 12
            r2 = r0
            java.lang.Object r0 = p.o95.b(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r15) goto L6a
            goto L91
        L6a:
            r1 = r16
        L6c:
            r7.a = r1
            r7.c = r13
            r2 = 600(0x258, double:2.964E-321)
            java.lang.Object r0 = p.hap1.i(r2, r7)
            if (r0 != r15) goto L41
            goto L91
        L79:
            java.lang.Float r3 = new java.lang.Float
            r0 = 0
            r3.<init>(r0)
            p.pxg1 r4 = p.irn1.o0(r11, r10, r14, r9)
            r7.a = r14
            r7.c = r12
            r5 = 0
            r6 = 0
            r8 = 12
            java.lang.Object r0 = p.o95.b(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r15) goto L92
        L91:
            return r15
        L92:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ton1.q(p.o95, p.onm):java.lang.Object");
    }

    public static final b180 t() {
        b180 b180Var = b;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.HomeActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(13.5f, 1.515f);
        cwh0VarG.c(3.0f, 3.0f, false, false, -3.0f, 0.0f);
        cwh0VarG.j(3.0f, 5.845f);
        cwh0VarG.c(2.0f, 2.0f, false, false, -1.0f, 1.732f);
        cwh0VarG.u(21.0f);
        cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        cwh0VarG.i(6.0f);
        cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        cwh0VarG.v(-6.0f);
        cwh0VarG.i(4.0f);
        cwh0VarG.v(6.0f);
        cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        cwh0VarG.i(6.0f);
        cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        cwh0VarG.u(7.577f);
        cwh0VarG.c(2.0f, 2.0f, false, false, -1.0f, -1.732f);
        cwh0VarG.e();
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        b = b180VarB;
        return b180VarB;
    }

    public static o8n u() {
        return (o8n) w55.Z.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00be A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x001d, B:21:0x003b, B:24:0x0049, B:37:0x0073, B:39:0x0081, B:45:0x0090, B:49:0x009e, B:51:0x00b2, B:53:0x00b8, B:54:0x00be, B:56:0x00c4, B:58:0x00cf, B:63:0x00d9, B:29:0x0056, B:30:0x005a, B:32:0x0060, B:34:0x006c, B:18:0x002f), top: B:74:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x001d, B:21:0x003b, B:24:0x0049, B:37:0x0073, B:39:0x0081, B:45:0x0090, B:49:0x009e, B:51:0x00b2, B:53:0x00b8, B:54:0x00be, B:56:0x00c4, B:58:0x00cf, B:63:0x00d9, B:29:0x0056, B:30:0x005a, B:32:0x0060, B:34:0x006c, B:18:0x002f), top: B:74:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00cf A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x001d, B:21:0x003b, B:24:0x0049, B:37:0x0073, B:39:0x0081, B:45:0x0090, B:49:0x009e, B:51:0x00b2, B:53:0x00b8, B:54:0x00be, B:56:0x00c4, B:58:0x00cf, B:63:0x00d9, B:29:0x0056, B:30:0x005a, B:32:0x0060, B:34:0x006c, B:18:0x002f), top: B:74:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x001d, B:21:0x003b, B:24:0x0049, B:37:0x0073, B:39:0x0081, B:45:0x0090, B:49:0x009e, B:51:0x00b2, B:53:0x00b8, B:54:0x00be, B:56:0x00c4, B:58:0x00cf, B:63:0x00d9, B:29:0x0056, B:30:0x005a, B:32:0x0060, B:34:0x006c, B:18:0x002f), top: B:74:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ed  */
    public static final ihm1 v(Intent intent) {
        String dataString;
        ihm1 m231Var;
        ihm1 ihm1Var;
        List<String> queryParameters;
        List<String> queryParameters2;
        String str;
        if (intent == null || (dataString = intent.getDataString()) == null || u890.j(intent.getStringExtra("com.spotify.wrapped.sharing.HANDLED_LINK"), dataString)) {
            return null;
        }
        try {
            String strT0 = ihc1.T0(dataString, '?', "");
            if (strT0.length() <= 0) {
                strT0 = null;
            }
            Uri uri = strT0 == null ? null : Uri.parse("https://open.spotify.com/?".concat(strT0));
            if (uri == null) {
                return null;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (!(queryParameterNames instanceof Collection) || !queryParameterNames.isEmpty()) {
                Iterator<T> it = queryParameterNames.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (!u890.j(str2, "spotify-apply-lenses") && !u890.j(str2, "spotify-clear-lenses")) {
                        }
                    }
                    queryParameters = uri.getQueryParameters("spotify-apply-lenses");
                    queryParameters2 = uri.getQueryParameters("spotify-clear-lenses");
                    if (u890.j(queryParameters2, Collections.singletonList("true")) || !queryParameters.isEmpty()) {
                        if (queryParameters2.isEmpty()) {
                            queryParameters.getClass();
                            str = (String) o7h.X0(queryParameters);
                            if (str != null) {
                                if (ihc1.y0(str)) {
                                    str = null;
                                }
                                if (str != null) {
                                    m231Var = new ihm1(str);
                                    ihm1Var = m231Var;
                                }
                            }
                        }
                        ihm1Var = null;
                    } else {
                        ihm1Var = new ihm1((String) null);
                    }
                    return ihm1Var instanceof m231 ? null : ihm1Var;
                }
            }
            String str3 = (String) o7h.X0(uri.getQueryParameters("target_url"));
            if (str3 != null) {
                String strT1 = ihc1.T0(str3, '?', "");
                if (strT1.length() <= 0) {
                    strT1 = null;
                }
                uri = strT1 == null ? null : Uri.parse("https://open.spotify.com/?".concat(strT1));
            }
            if (uri == null) {
                return null;
            }
            queryParameters = uri.getQueryParameters("spotify-apply-lenses");
            queryParameters2 = uri.getQueryParameters("spotify-clear-lenses");
            if (u890.j(queryParameters2, Collections.singletonList("true"))) {
                if (queryParameters2.isEmpty()) {
                    queryParameters.getClass();
                    str = (String) o7h.X0(queryParameters);
                    if (str != null) {
                        if (ihc1.y0(str)) {
                            str = null;
                        }
                        if (str != null) {
                            m231Var = new ihm1(str);
                            ihm1Var = m231Var;
                        }
                    }
                }
                ihm1Var = null;
            } else {
                if (queryParameters2.isEmpty()) {
                    queryParameters.getClass();
                    str = (String) o7h.X0(queryParameters);
                    if (str != null) {
                        if (ihc1.y0(str)) {
                            str = null;
                        }
                        if (str != null) {
                            m231Var = new ihm1(str);
                            ihm1Var = m231Var;
                        }
                    }
                }
                ihm1Var = null;
            }
            return ihm1Var instanceof m231 ? null : ihm1Var;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
    }

    public static final long w(d6f0 d6f0Var, elb0 elb0Var, elb0 elb0Var2) {
        a6f0 a6f0VarA = d6f0Var.a(elb0Var);
        a6f0 a6f0VarA2 = d6f0Var.a(elb0Var2);
        if (a6f0VarA instanceof a6f0) {
            return a6f0VarA.q(a6f0VarA2, 0L, true);
        }
        return a6f0VarA2 instanceof a6f0 ? a6f0VarA2.q(a6f0VarA, 0L, true) ^ (-9223372034707292160L) : a6f0VarA.q(a6f0VarA, 0L, true);
    }

    public static final ega1 y(pb31 pb31Var) {
        if (pb31Var instanceof kb31) {
            return new ega1((dga1) null, (l620) null, 7);
        }
        if (pb31Var instanceof ob31) {
            return ((ob31) pb31Var).d();
        }
        if (pb31Var instanceof lb31) {
            return ((lb31) pb31Var).d;
        }
        eg.o();
        return null;
    }

    public int a(int i) {
        int iX = x(i);
        if (iX == -1 || x(iX) == -1) {
            return -1;
        }
        return iX;
    }

    public int c(int i) {
        return z(i);
    }

    public int d(int i) {
        return x(i);
    }

    public int e(int i) {
        int iZ = z(i);
        if (iZ == -1 || z(iZ) == -1) {
            return -1;
        }
        return iZ;
    }

    public abstract String n();

    public abstract String r();

    public abstract String s();

    public abstract int x(int i);

    public abstract int z(int i);
}
