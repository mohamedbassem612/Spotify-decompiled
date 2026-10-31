package p;

import android.graphics.DashPathEffect;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class cgj1 {
    public static final acn1 a = new acn1("KotlinTypeRefiner", (byte) 7);
    public static b180 b;

    public static boolean A(me4 me4Var) {
        return me4Var.c();
    }

    public static boolean B(me4 me4Var) {
        return me4Var.j();
    }

    public static boolean C(me4 me4Var) {
        return me4Var.d();
    }

    public static boolean D(vbs vbsVar) {
        return vbsVar.f;
    }

    public static boolean E(me4 me4Var) {
        return me4Var.i();
    }

    public static boolean F(me4 me4Var) {
        return me4Var.h();
    }

    public static final mwq0 G(b0k b0kVar) {
        df41 df41Var = j2h1.b;
        m4c m4cVar = fkj0.X;
        Object[] objArr = new Object[0];
        x340 x340Var = (x340) b0kVar;
        boolean zI = x340Var.i(df41Var);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new ewq0(1, (byte) 0);
            x340Var.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = new ewq0(1, (byte) 1);
            x340Var.s0(objT2);
        }
        return xfo1.n(objArr, iu30Var, (iu30) objT2, x340Var, 0, 4);
    }

    public static ku70 H(syq syqVar, qim0 qim0Var, FrameLayout.LayoutParams layoutParams, int i) {
        if ((i & 1) != 0) {
            qim0Var = nim0.a;
        }
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        return new ku70(syqVar, new fqg0(syqVar, false, layoutParams, qim0Var));
    }

    public static final String I(String str) {
        String strH;
        try {
            Set set = s4b1.f;
            strH = uic.x(str).h();
        } catch (UnsupportedOperationException unused) {
            strH = null;
        }
        if (strH != null) {
            return "spotify:internal:workout-settings:".concat(strH);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void a(p750 p750Var, dh30 dh30Var, iu30 iu30Var, String str, boolean z, b0k b0kVar, int i, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        int i3;
        boolean z6;
        int i4;
        boolean z7;
        boolean z8;
        Object objT;
        boolean z9;
        boolean z10;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1163762703);
        int i5 = i | (x340Var.g(p750Var) ? 32 : 16) | (x340Var.g(dh30Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.g(str) ? 16384 : 8192);
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 196608) == 0) {
                z2 = z;
                i5 |= x340Var.h(z2) ? 131072 : 65536;
            }
            if ((74897 & i5) != 74896) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i5 & 1, z3)) {
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                String strO0 = cwl1.o0(x340Var, 2131956354);
                boolean z11 = p750Var.b;
                boolean z12 = p750Var.c;
                i3 = i5 & 896;
                if (i3 != 256) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                i4 = i5 & 7168;
                if (i4 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objT = x340Var.T();
                if (z8 || objT == m4cVar) {
                    objT = new q750(dh30Var, iu30Var, (byte) 0);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (i3 != 256) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                z10 = z9 | (i4 == 2048);
                objT2 = x340Var.T();
                if (z10 || objT2 == m4cVar) {
                    objT2 = new q750(dh30Var, iu30Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                t4n1.g(str, strO0, z11, z12, function0, (Function0) objT2, (qim0) null, z5, x340Var, ((i5 >> 12) & 14) | ((i5 << 6) & 29360128), 64);
                z4 = z5;
            } else {
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(p750Var, dh30Var, iu30Var, str, z4, i, i2);
            }
        }
        i5 |= 196608;
        z2 = z;
        if ((74897 & i5) != 74896) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i5 & 1, z3)) {
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            String strO1 = cwl1.o0(x340Var, 2131956354);
            boolean z13 = p750Var.b;
            boolean z14 = p750Var.c;
            i3 = i5 & 896;
            if (i3 != 256) {
                z6 = false;
            } else {
                z6 = true;
            }
            i4 = i5 & 7168;
            if (i4 == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z6 | z7;
            objT = x340Var.T();
            if (z8) {
                objT = new q750(dh30Var, iu30Var, (byte) 0);
                x340Var.s0(objT);
            } else {
                objT = new q750(dh30Var, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (i3 != 256) {
                z9 = false;
            } else {
                z9 = true;
            }
            z10 = z9 | (i4 == 2048);
            objT2 = x340Var.T();
            if (z10) {
                objT2 = new q750(dh30Var, iu30Var, (byte) 1);
                x340Var.s0(objT2);
            } else {
                objT2 = new q750(dh30Var, iu30Var, (byte) 1);
                x340Var.s0(objT2);
            }
            t4n1.g(str, strO1, z13, z14, function1, (Function0) objT2, (qim0) null, z5, x340Var, ((i5 >> 12) & 14) | ((i5 << 6) & 29360128), 64);
            z4 = z5;
        } else {
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(p750Var, dh30Var, iu30Var, str, z4, i, i2);
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-547178660);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ldx ldxVar = ldx.c;
            qim0 qim0VarN = anm1.N("close_button", qim0Var);
            gdx gdxVarS = yla.s(x340Var);
            String strO0 = cwl1.o0(x340Var, 2131956217);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pj8(function0, (byte) 12);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function1), ldxVar, qim0VarN, (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, hai.a, x340Var, 48, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var, function0, i, (byte) 8);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(String str, dzf0 dzf0Var, boolean z, vzq0 vzq0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1192854067);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(dzf0Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.g(vzq0Var) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            tob1 tob1VarA = z95.a(z ? vzq0Var.d() : 0.0f, (fe5) null, "contentMarginTop", x340Var, 384, 10);
            tob1 tob1VarA2 = z95.a(z ? vzq0Var.d() : 0.0f, (fe5) null, "contentMarginBottom", x340Var, 384, 10);
            float f = ((p3v) tob1VarA.getValue()).a;
            float f2 = ((p3v) tob1VarA2.getValue()).a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, f, 0.0f, f2, 5);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (dzf0Var instanceof bzf0) {
                x340Var.i0(-114202912);
                f(str, (bzf0) dzf0Var, x340Var, i2 & 126);
                x340Var.r(false);
            } else {
                if (!(dzf0Var instanceof czf0)) {
                    throw p3d1.k(x340Var, -114204650, false);
                }
                x340Var.i0(-114200719);
                dv20.l(0, ((czf0) dzf0Var).b, x340Var, false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey(str, dzf0Var, z, vzq0Var, qim0Var2, i, (byte) 28);
        }
    }

    public static final void d(int i, int i2, int i3, int i4, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, b0k b0kVar, int i5) {
        qim0 qim0Var2;
        int i6 = i2;
        int i7 = i3;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1504881918);
        int i8 = i5 | (b0kVar2.e(i) ? 4 : 2) | (b0kVar2.e(i6) ? 32 : 16) | (b0kVar2.e(i7) ? 256 : 128) | (b0kVar2.e(i4) ? 2048 : 1024) | (b0kVar2.i(iu30Var) ? 16384 : 8192) | 196608 | (b0kVar2.i(iu30Var2) ? 1048576 : 524288);
        if (b0kVar2.Y(i8 & 1, (599187 & i8) != 599186)) {
            String strU = cwl1.U(2131820948, i, new Object[]{Integer.valueOf(i)}, b0kVar2);
            lee1 lee1VarV = w2g0.v(b0kVar2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
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
            String strValueOf = String.valueOf(i);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar2).b.a;
            boolean zG = b0kVar2.g(strU);
            Object objT = b0kVar2.T();
            if (zG || objT == m4cVar) {
                objT = new i3o(strU, (byte) 24);
                b0kVar2.s0(objT);
            }
            uwo1.e(strValueOf, s161.b(qim0Var3, false, (iu30) objT), lee1VarV, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
            String strO0 = cwl1.o0(b0kVar2, 2131963895);
            lee1 lee1Var = cbx.d(b0kVar2).g;
            long j2 = cbx.a(b0kVar2).b.b;
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = o6v.X0;
                b0kVar2.s0(objT2);
            }
            uwo1.e(strO0, s161.a(qim0Var3, (iu30) objT2), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
            i6 = i2;
            i7 = i3;
            b0kVar2 = b0kVar2;
            exd0.n(i, new tr80(i6, i7, 1), i4, i4 * 3, iu30Var, uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, cbx.b(b0kVar2).b.b, 0.0f, 0.0f, 13), iu30Var2, null, b0kVar2, (i8 & 14) | ((i8 >> 3) & 896) | (57344 & i8) | (i8 & 3670016));
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wla(i, i6, i7, i4, iu30Var, qim0Var2, iu30Var2, i5);
        }
    }

    public static final void e(String str, xpw xpwVar, Object obj, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1925927579);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xpwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 256 : 128;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = (i3 >> 6) & 8;
            int i5 = i3 >> 3;
            otw.c(xpwVar, obj, (qim0) null, wpb1.C(gvg.h("MainLayout.", str, ".", rc11.a.b(xpwVar.getClass()).o()), xpwVar, obj, x340Var, (i3 & 112) | 3072 | (i4 << 6) | (i3 & 896), 0), x340Var, (i5 & 14) | (i4 << 3) | (i5 & 112), 4);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(str, xpwVar, obj, i, (byte) 12);
        }
    }

    public static final void f(String str, bzf0 bzf0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1960868545);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(bzf0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            e(str, bzf0Var.a, bzf0Var.b, x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(str, bzf0Var, i, (byte) 5);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(p750 p750Var, dh30 dh30Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1387574910);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(p750Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(dh30Var) : x340Var.i(dh30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = p750Var.a.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(-2019617453);
                j(p750Var, dh30Var, iu30Var, x340Var, i2 & 1022);
                x340Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, -2019622037, false);
                }
                x340Var.i0(-2019620429);
                p(p750Var, dh30Var, iu30Var, x340Var, i2 & 1022);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r750(p750Var, dh30Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void h(String str, lee1 lee1Var, long j, boolean z, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        float f;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(302462729);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(lee1Var) ? 32 : 16) | (b0kVar3.f(j) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        int i3 = i2 | (b0kVar3.i(function0) ? 16384 : 8192);
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            ven0 ven0VarM = k1u.m(idn0Var, b0kVar3, 0);
            if (z) {
                f = ((Boolean) ven0VarM.getValue()).booleanValue() ? 0.5f : 1.0f;
            } else {
                f = 0.4f;
            }
            int i4 = i3 << 3;
            b0kVar2 = b0kVar3;
            uwo1.e(str, bin.v(d9y0.k(nim0.a, f), idn0Var, (ga80) null, z, (String) null, (pm31) null, function0, 24), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (i3 & 14) | (i4 & 896) | (i4 & 7168), 0, 2032);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mc60(str, lee1Var, j, z, function0, i);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1459306531);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new y96(z, function0, (byte) 6);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), kdx.c, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1333509796, new k750((byte) 3, z), x340Var), x340Var, 0, 48, 2012);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ie1(i, function0, z);
        }
    }

    public static final void j(p750 p750Var, dh30 dh30Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1795928577);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(p750Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(dh30Var) : x340Var.i(dh30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        byte b2 = 0;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ujo1.c(l6o1.C(0, 0, 1, x340Var), t3k1.t(v850.a), apo.r(-564860490, new s750(iu30Var, p750Var, dh30Var, b2), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r750(p750Var, dh30Var, iu30Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void k(u1g0 u1g0Var, String str, iu30 iu30Var, Object obj, iu30 iu30Var2, qim0 qim0Var, vzq0 vzq0Var, b0k b0kVar, int i, int i2) {
        int i3;
        iu30 iu30Var3;
        vzq0 vzq0Var2;
        boolean z;
        boolean z2;
        vzq0 vzq0VarH;
        h311 h311VarV;
        Object objT;
        m4c m4cVar;
        boolean z3;
        boolean z4;
        Object objT2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1716472322);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(u1g0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            iu30Var3 = iu30Var2;
            i3 |= x340Var.i(iu30Var3) ? 16384 : 8192;
        } else {
            iu30Var3 = iu30Var2;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var.g(qim0Var) ? 131072 : 65536;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                vzq0Var2 = vzq0Var;
                i3 |= x340Var.g(vzq0Var2) ? 1048576 : 524288;
            }
            z = true;
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                if (i4 != 0) {
                    vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                } else {
                    vzq0VarH = vzq0Var2;
                }
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(new jzf0(true));
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                if ((i3 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 7168) != 2048 && ((i3 & 4096) == 0 || !x340Var.g(obj))) {
                    z = false;
                }
                z4 = z3 | z;
                objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = ((pzf0) iu30Var.invoke(u1g0Var.b)).a(obj);
                    x340Var.s0(objT2);
                }
                l(u1g0Var, (jzf0) ven0Var.getValue(), iu30Var3, apo.r(436224925, new w0f0((zob1) objT2, qim0Var, str, vzq0VarH), x340Var), x340Var, ((i3 >> 6) & 896) | (i3 & 14) | 3072);
            } else {
                x340Var.b0();
                vzq0VarH = vzq0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ra5(u1g0Var, str, iu30Var, obj, iu30Var2, qim0Var, vzq0VarH, i, i2);
            }
        }
        i3 |= 1572864;
        vzq0Var2 = vzq0Var;
        z = true;
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            if (i4 != 0) {
                vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
            } else {
                vzq0VarH = vzq0Var2;
            }
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new jzf0(true));
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 7168) != 2048) {
                z = false;
            }
            z4 = z3 | z;
            objT2 = x340Var.T();
            if (z4) {
                objT2 = ((pzf0) iu30Var.invoke(u1g0Var.b)).a(obj);
                x340Var.s0(objT2);
            } else {
                objT2 = ((pzf0) iu30Var.invoke(u1g0Var.b)).a(obj);
                x340Var.s0(objT2);
            }
            l(u1g0Var, (jzf0) ven0Var2.getValue(), iu30Var3, apo.r(436224925, new w0f0((zob1) objT2, qim0Var, str, vzq0VarH), x340Var), x340Var, ((i3 >> 6) & 896) | (i3 & 14) | 3072);
        } else {
            x340Var.b0();
            vzq0VarH = vzq0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ra5(u1g0Var, str, iu30Var, obj, iu30Var2, qim0Var, vzq0VarH, i, i2);
        }
    }

    public static final void l(u1g0 u1g0Var, jzf0 jzf0Var, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(774374009);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(u1g0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(jzf0Var) : x340Var.i(jzf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = x340Var.g(u1g0Var.a.a) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = (erl1) iu30Var.invoke(u1g0Var.a.a.d);
                x340Var.s0(objT);
            }
            mod.c(new ely0[]{szf0.b.a((erl1) objT), kzf0.a.a(jzf0Var)}, apo.r(677094841, new ak10(j2iVar, (byte) 20), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, (Object) u1g0Var, (Object) jzf0Var, (Object) iu30Var, (Object) j2iVar, (byte) 24);
        }
    }

    public static final void m(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(988601274);
        int i2 = (x340Var.i(function0) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ldx ldxVar = ldx.c;
            qim0 qim0VarN = anm1.N("retake_button", qim0Var);
            String strO0 = cwl1.o0(x340Var, 2131956659);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pj8(function0, (byte) 13);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function1), ldxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, hai.c, x340Var, 48, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var, function0, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x014a  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:111:0x0154  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175  */
    /* JADX WARN: Code duplicated, block: B:126:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ae A[PHI: r33
      0x01ae: PHI (r33v3 p.vu30) = (r33v1 p.vu30), (r33v4 p.vu30) binds: [B:136:0x01ac, B:134:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:156:0x0237  */
    /* JADX WARN: Code duplicated, block: B:159:0x024f  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0120  */
    public static final void n(qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, int i, long j, long j2, erl1 erl1Var, j2i j2iVar, b0k b0kVar, int i2, int i3) {
        int i4;
        vu30 vu30Var5;
        int i5;
        vu30 vu30Var6;
        int i6;
        int i7;
        int i8;
        vu30 vu30Var7;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var2;
        vu30 vu30Var8;
        erl1 erl1Var2;
        vu30 vu30Var9;
        vu30 vu30Var10;
        int i13;
        long j3;
        long j4;
        h311 h311VarV;
        qim0 qim0Var3;
        vu30 vu30Var11;
        vu30 vu30Var12;
        vu30 vu30Var13;
        long j5;
        int i14;
        erl1 erl1VarV;
        long j6;
        int i15;
        vu30 vu30Var14;
        boolean z2;
        Object objT;
        ffn0 ffn0Var;
        boolean zG;
        Object objT2;
        int i16;
        int i17;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1211482744);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (b0kVar3.g(qim0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i19 = i3 & 2;
        if (i19 == 0) {
            if ((i2 & 48) == 0) {
                vu30Var5 = vu30Var;
                i4 |= b0kVar3.i(vu30Var5) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    vu30Var6 = vu30Var2;
                    if (b0kVar3.i(vu30Var6)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 3072;
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((i2 & 24576) == 0) {
                        vu30Var7 = vu30Var4;
                        if (b0kVar3.i(vu30Var7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i7 |= i9;
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        if ((196608 & i2) == 0) {
                            i11 = i;
                            if (b0kVar3.e(i11)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i7 |= i12;
                        }
                        if ((i2 & 1572864) != 0) {
                            if ((i3 & 64) == 0 || !b0kVar3.f(j)) {
                                i17 = 524288;
                            } else {
                                i17 = 1048576;
                            }
                            i7 |= i17;
                        }
                        if ((i2 & 12582912) == 0) {
                            i7 |= 4194304;
                        }
                        if ((i2 & 100663296) != 0) {
                            i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                        }
                        if ((i2 & 805306368) == 0) {
                            if (b0kVar3.i(j2iVar)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i7 |= i16;
                        }
                        if ((i7 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i7 & 1, z)) {
                            b0kVar3.d0();
                            if ((i2 & 1) != 0 || b0kVar3.E()) {
                                if (i18 != 0) {
                                    qim0Var3 = nim0.a;
                                } else {
                                    qim0Var3 = qim0Var;
                                }
                                if (i19 != 0) {
                                    vu30Var11 = iej.a;
                                } else {
                                    vu30Var11 = vu30Var5;
                                }
                                if (i5 != 0) {
                                    vu30Var12 = iej.b;
                                } else {
                                    vu30Var12 = vu30Var6;
                                }
                                vu30Var13 = iej.c;
                                if (i8 != 0) {
                                    vu30Var7 = iej.d;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((dah) b0kVar3.k(eah.a)).n;
                                    i7 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                long jB = eah.b(j5, b0kVar3);
                                i14 = i7 & (-29360129);
                                if ((i3 & 256) != 0) {
                                    erl1VarV = zxo1.v(b0kVar3);
                                    i14 = i7 & (-264241153);
                                } else {
                                    erl1VarV = erl1Var;
                                }
                                j6 = jB;
                            } else {
                                b0kVar3.b0();
                                if ((i3 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                int i20 = i7 & (-29360129);
                                if ((i3 & 256) != 0) {
                                    i20 = i7 & (-264241153);
                                }
                                vu30Var13 = vu30Var3;
                                j5 = j;
                                erl1VarV = erl1Var;
                                vu30Var11 = vu30Var5;
                                vu30Var12 = vu30Var6;
                                j6 = j2;
                                i14 = i20;
                                qim0Var3 = qim0Var;
                            }
                            b0kVar3.s();
                            i15 = (i14 & 234881024) ^ 100663296;
                            if (i15 > 67108864 || !b0kVar3.g(erl1VarV)) {
                                vu30Var14 = vu30Var7;
                                if ((i14 & 100663296) != 67108864) {
                                    z2 = false;
                                }
                                objT = b0kVar3.T();
                                if (z2 || objT == m4cVar) {
                                    objT = new ffn0(erl1VarV);
                                    b0kVar3.s0(objT);
                                }
                                ffn0Var = (ffn0) objT;
                                zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                                objT2 = b0kVar3.T();
                                if (zG || objT2 == m4cVar) {
                                    objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                                    b0kVar3.s0(objT2);
                                }
                                int i21 = i11;
                                vu30Var7 = vu30Var14;
                                b0kVar2 = b0kVar3;
                                long j7 = j5;
                                w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j7, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i21, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                                qim0Var2 = qim0Var3;
                                erl1Var2 = erl1VarV;
                                vu30Var9 = vu30Var11;
                                vu30Var10 = vu30Var12;
                                j4 = j6;
                                i13 = i21;
                                vu30Var8 = vu30Var13;
                                j3 = j7;
                            } else {
                                vu30Var14 = vu30Var7;
                            }
                            z2 = true;
                            objT = b0kVar3.T();
                            if (z2) {
                                objT = new ffn0(erl1VarV);
                                b0kVar3.s0(objT);
                            } else {
                                objT = new ffn0(erl1VarV);
                                b0kVar3.s0(objT);
                            }
                            ffn0Var = (ffn0) objT;
                            zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                            objT2 = b0kVar3.T();
                            if (zG) {
                                objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                                b0kVar3.s0(objT2);
                            } else {
                                objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                                b0kVar3.s0(objT2);
                            }
                            int i22 = i11;
                            vu30Var7 = vu30Var14;
                            b0kVar2 = b0kVar3;
                            long j8 = j5;
                            w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j8, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i22, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                            qim0Var2 = qim0Var3;
                            erl1Var2 = erl1VarV;
                            vu30Var9 = vu30Var11;
                            vu30Var10 = vu30Var12;
                            j4 = j6;
                            i13 = i22;
                            vu30Var8 = vu30Var13;
                            j3 = j8;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var2 = qim0Var;
                            vu30Var8 = vu30Var3;
                            erl1Var2 = erl1Var;
                            vu30Var9 = vu30Var5;
                            vu30Var10 = vu30Var6;
                            i13 = i11;
                            j3 = j;
                            j4 = j2;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                        }
                    }
                    i7 |= 196608;
                    i11 = i;
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 64) == 0) {
                            i17 = 524288;
                        } else {
                            i17 = 524288;
                        }
                        i7 |= i17;
                    }
                    if ((i2 & 12582912) == 0) {
                        i7 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i7 |= i16;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i7 & 1, z)) {
                        b0kVar3.d0();
                        if ((i2 & 1) != 0) {
                            if (i18 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var;
                            }
                            if (i19 != 0) {
                                vu30Var11 = iej.a;
                            } else {
                                vu30Var11 = vu30Var5;
                            }
                            if (i5 != 0) {
                                vu30Var12 = iej.b;
                            } else {
                                vu30Var12 = vu30Var6;
                            }
                            vu30Var13 = iej.c;
                            if (i8 != 0) {
                                vu30Var7 = iej.d;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((dah) b0kVar3.k(eah.a)).n;
                                i7 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            long jB2 = eah.b(j5, b0kVar3);
                            i14 = i7 & (-29360129);
                            if ((i3 & 256) != 0) {
                                erl1VarV = zxo1.v(b0kVar3);
                                i14 = i7 & (-264241153);
                            } else {
                                erl1VarV = erl1Var;
                            }
                            j6 = jB2;
                        } else {
                            if (i18 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var;
                            }
                            if (i19 != 0) {
                                vu30Var11 = iej.a;
                            } else {
                                vu30Var11 = vu30Var5;
                            }
                            if (i5 != 0) {
                                vu30Var12 = iej.b;
                            } else {
                                vu30Var12 = vu30Var6;
                            }
                            vu30Var13 = iej.c;
                            if (i8 != 0) {
                                vu30Var7 = iej.d;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((dah) b0kVar3.k(eah.a)).n;
                                i7 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            long jB3 = eah.b(j5, b0kVar3);
                            i14 = i7 & (-29360129);
                            if ((i3 & 256) != 0) {
                                erl1VarV = zxo1.v(b0kVar3);
                                i14 = i7 & (-264241153);
                            } else {
                                erl1VarV = erl1Var;
                            }
                            j6 = jB3;
                        }
                        b0kVar3.s();
                        i15 = (i14 & 234881024) ^ 100663296;
                        if (i15 > 67108864) {
                            vu30Var14 = vu30Var7;
                            if ((i14 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            vu30Var14 = vu30Var7;
                            if ((i14 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objT = b0kVar3.T();
                        if (z2) {
                            objT = new ffn0(erl1VarV);
                            b0kVar3.s0(objT);
                        } else {
                            objT = new ffn0(erl1VarV);
                            b0kVar3.s0(objT);
                        }
                        ffn0Var = (ffn0) objT;
                        zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                        objT2 = b0kVar3.T();
                        if (zG) {
                            objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                            b0kVar3.s0(objT2);
                        } else {
                            objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                            b0kVar3.s0(objT2);
                        }
                        int i23 = i11;
                        vu30Var7 = vu30Var14;
                        b0kVar2 = b0kVar3;
                        long j9 = j5;
                        w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j9, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i23, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                        qim0Var2 = qim0Var3;
                        erl1Var2 = erl1VarV;
                        vu30Var9 = vu30Var11;
                        vu30Var10 = vu30Var12;
                        j4 = j6;
                        i13 = i23;
                        vu30Var8 = vu30Var13;
                        j3 = j9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                        vu30Var8 = vu30Var3;
                        erl1Var2 = erl1Var;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = vu30Var6;
                        i13 = i11;
                        j3 = j;
                        j4 = j2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                    }
                }
                i7 = i4 | 27648;
                vu30Var7 = vu30Var4;
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((196608 & i2) == 0) {
                        i11 = i;
                        if (b0kVar3.e(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i7 |= i12;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 64) == 0) {
                            i17 = 524288;
                        } else {
                            i17 = 524288;
                        }
                        i7 |= i17;
                    }
                    if ((i2 & 12582912) == 0) {
                        i7 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i7 |= i16;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i7 & 1, z)) {
                        b0kVar3.d0();
                        if ((i2 & 1) != 0) {
                            if (i18 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var;
                            }
                            if (i19 != 0) {
                                vu30Var11 = iej.a;
                            } else {
                                vu30Var11 = vu30Var5;
                            }
                            if (i5 != 0) {
                                vu30Var12 = iej.b;
                            } else {
                                vu30Var12 = vu30Var6;
                            }
                            vu30Var13 = iej.c;
                            if (i8 != 0) {
                                vu30Var7 = iej.d;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((dah) b0kVar3.k(eah.a)).n;
                                i7 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            long jB4 = eah.b(j5, b0kVar3);
                            i14 = i7 & (-29360129);
                            if ((i3 & 256) != 0) {
                                erl1VarV = zxo1.v(b0kVar3);
                                i14 = i7 & (-264241153);
                            } else {
                                erl1VarV = erl1Var;
                            }
                            j6 = jB4;
                        } else {
                            if (i18 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var;
                            }
                            if (i19 != 0) {
                                vu30Var11 = iej.a;
                            } else {
                                vu30Var11 = vu30Var5;
                            }
                            if (i5 != 0) {
                                vu30Var12 = iej.b;
                            } else {
                                vu30Var12 = vu30Var6;
                            }
                            vu30Var13 = iej.c;
                            if (i8 != 0) {
                                vu30Var7 = iej.d;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((dah) b0kVar3.k(eah.a)).n;
                                i7 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            long jB5 = eah.b(j5, b0kVar3);
                            i14 = i7 & (-29360129);
                            if ((i3 & 256) != 0) {
                                erl1VarV = zxo1.v(b0kVar3);
                                i14 = i7 & (-264241153);
                            } else {
                                erl1VarV = erl1Var;
                            }
                            j6 = jB5;
                        }
                        b0kVar3.s();
                        i15 = (i14 & 234881024) ^ 100663296;
                        if (i15 > 67108864) {
                            vu30Var14 = vu30Var7;
                            if ((i14 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            vu30Var14 = vu30Var7;
                            if ((i14 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objT = b0kVar3.T();
                        if (z2) {
                            objT = new ffn0(erl1VarV);
                            b0kVar3.s0(objT);
                        } else {
                            objT = new ffn0(erl1VarV);
                            b0kVar3.s0(objT);
                        }
                        ffn0Var = (ffn0) objT;
                        zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                        objT2 = b0kVar3.T();
                        if (zG) {
                            objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                            b0kVar3.s0(objT2);
                        } else {
                            objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                            b0kVar3.s0(objT2);
                        }
                        int i24 = i11;
                        vu30Var7 = vu30Var14;
                        b0kVar2 = b0kVar3;
                        long j10 = j5;
                        w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j10, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i24, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                        qim0Var2 = qim0Var3;
                        erl1Var2 = erl1VarV;
                        vu30Var9 = vu30Var11;
                        vu30Var10 = vu30Var12;
                        j4 = j6;
                        i13 = i24;
                        vu30Var8 = vu30Var13;
                        j3 = j10;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                        vu30Var8 = vu30Var3;
                        erl1Var2 = erl1Var;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = vu30Var6;
                        i13 = i11;
                        j3 = j;
                        j4 = j2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                    }
                }
                i7 |= 196608;
                i11 = i;
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i17 = 524288;
                    } else {
                        i17 = 524288;
                    }
                    i7 |= i17;
                }
                if ((i2 & 12582912) == 0) {
                    i7 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i7 |= i16;
                }
                if ((i7 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i7 & 1, z)) {
                    b0kVar3.d0();
                    if ((i2 & 1) != 0) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB6 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB6;
                    } else {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB7 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB7;
                    }
                    b0kVar3.s();
                    i15 = (i14 & 234881024) ^ 100663296;
                    if (i15 > 67108864) {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objT = b0kVar3.T();
                    if (z2) {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    }
                    ffn0Var = (ffn0) objT;
                    zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                    objT2 = b0kVar3.T();
                    if (zG) {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    } else {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    }
                    int i25 = i11;
                    vu30Var7 = vu30Var14;
                    b0kVar2 = b0kVar3;
                    long j11 = j5;
                    w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j11, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i25, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                    qim0Var2 = qim0Var3;
                    erl1Var2 = erl1VarV;
                    vu30Var9 = vu30Var11;
                    vu30Var10 = vu30Var12;
                    j4 = j6;
                    i13 = i25;
                    vu30Var8 = vu30Var13;
                    j3 = j11;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var8 = vu30Var3;
                    erl1Var2 = erl1Var;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var6;
                    i13 = i11;
                    j3 = j;
                    j4 = j2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                }
            }
            i4 |= 384;
            vu30Var6 = vu30Var2;
            i7 = i4 | 3072;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    vu30Var7 = vu30Var4;
                    if (b0kVar3.i(vu30Var7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i7 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((196608 & i2) == 0) {
                        i11 = i;
                        if (b0kVar3.e(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i7 |= i12;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 64) == 0) {
                            i17 = 524288;
                        } else {
                            i17 = 524288;
                        }
                        i7 |= i17;
                    }
                    if ((i2 & 12582912) == 0) {
                        i7 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i7 |= i16;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i7 & 1, z)) {
                        b0kVar3.d0();
                        if ((i2 & 1) != 0) {
                            if (i18 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var;
                            }
                            if (i19 != 0) {
                                vu30Var11 = iej.a;
                            } else {
                                vu30Var11 = vu30Var5;
                            }
                            if (i5 != 0) {
                                vu30Var12 = iej.b;
                            } else {
                                vu30Var12 = vu30Var6;
                            }
                            vu30Var13 = iej.c;
                            if (i8 != 0) {
                                vu30Var7 = iej.d;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((dah) b0kVar3.k(eah.a)).n;
                                i7 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            long jB8 = eah.b(j5, b0kVar3);
                            i14 = i7 & (-29360129);
                            if ((i3 & 256) != 0) {
                                erl1VarV = zxo1.v(b0kVar3);
                                i14 = i7 & (-264241153);
                            } else {
                                erl1VarV = erl1Var;
                            }
                            j6 = jB8;
                        } else {
                            if (i18 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var;
                            }
                            if (i19 != 0) {
                                vu30Var11 = iej.a;
                            } else {
                                vu30Var11 = vu30Var5;
                            }
                            if (i5 != 0) {
                                vu30Var12 = iej.b;
                            } else {
                                vu30Var12 = vu30Var6;
                            }
                            vu30Var13 = iej.c;
                            if (i8 != 0) {
                                vu30Var7 = iej.d;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((dah) b0kVar3.k(eah.a)).n;
                                i7 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            long jB9 = eah.b(j5, b0kVar3);
                            i14 = i7 & (-29360129);
                            if ((i3 & 256) != 0) {
                                erl1VarV = zxo1.v(b0kVar3);
                                i14 = i7 & (-264241153);
                            } else {
                                erl1VarV = erl1Var;
                            }
                            j6 = jB9;
                        }
                        b0kVar3.s();
                        i15 = (i14 & 234881024) ^ 100663296;
                        if (i15 > 67108864) {
                            vu30Var14 = vu30Var7;
                            if ((i14 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            vu30Var14 = vu30Var7;
                            if ((i14 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objT = b0kVar3.T();
                        if (z2) {
                            objT = new ffn0(erl1VarV);
                            b0kVar3.s0(objT);
                        } else {
                            objT = new ffn0(erl1VarV);
                            b0kVar3.s0(objT);
                        }
                        ffn0Var = (ffn0) objT;
                        zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                        objT2 = b0kVar3.T();
                        if (zG) {
                            objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                            b0kVar3.s0(objT2);
                        } else {
                            objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                            b0kVar3.s0(objT2);
                        }
                        int i26 = i11;
                        vu30Var7 = vu30Var14;
                        b0kVar2 = b0kVar3;
                        long j12 = j5;
                        w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j12, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i26, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                        qim0Var2 = qim0Var3;
                        erl1Var2 = erl1VarV;
                        vu30Var9 = vu30Var11;
                        vu30Var10 = vu30Var12;
                        j4 = j6;
                        i13 = i26;
                        vu30Var8 = vu30Var13;
                        j3 = j12;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                        vu30Var8 = vu30Var3;
                        erl1Var2 = erl1Var;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = vu30Var6;
                        i13 = i11;
                        j3 = j;
                        j4 = j2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                    }
                }
                i7 |= 196608;
                i11 = i;
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i17 = 524288;
                    } else {
                        i17 = 524288;
                    }
                    i7 |= i17;
                }
                if ((i2 & 12582912) == 0) {
                    i7 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i7 |= i16;
                }
                if ((i7 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i7 & 1, z)) {
                    b0kVar3.d0();
                    if ((i2 & 1) != 0) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB10 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB10;
                    } else {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB11 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB11;
                    }
                    b0kVar3.s();
                    i15 = (i14 & 234881024) ^ 100663296;
                    if (i15 > 67108864) {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objT = b0kVar3.T();
                    if (z2) {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    }
                    ffn0Var = (ffn0) objT;
                    zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                    objT2 = b0kVar3.T();
                    if (zG) {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    } else {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    }
                    int i27 = i11;
                    vu30Var7 = vu30Var14;
                    b0kVar2 = b0kVar3;
                    long j13 = j5;
                    w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j13, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i27, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                    qim0Var2 = qim0Var3;
                    erl1Var2 = erl1VarV;
                    vu30Var9 = vu30Var11;
                    vu30Var10 = vu30Var12;
                    j4 = j6;
                    i13 = i27;
                    vu30Var8 = vu30Var13;
                    j3 = j13;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var8 = vu30Var3;
                    erl1Var2 = erl1Var;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var6;
                    i13 = i11;
                    j3 = j;
                    j4 = j2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                }
            }
            i7 = i4 | 27648;
            vu30Var7 = vu30Var4;
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((196608 & i2) == 0) {
                    i11 = i;
                    if (b0kVar3.e(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i7 |= i12;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i17 = 524288;
                    } else {
                        i17 = 524288;
                    }
                    i7 |= i17;
                }
                if ((i2 & 12582912) == 0) {
                    i7 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i7 |= i16;
                }
                if ((i7 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i7 & 1, z)) {
                    b0kVar3.d0();
                    if ((i2 & 1) != 0) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB12 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB12;
                    } else {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB13 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB13;
                    }
                    b0kVar3.s();
                    i15 = (i14 & 234881024) ^ 100663296;
                    if (i15 > 67108864) {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objT = b0kVar3.T();
                    if (z2) {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    }
                    ffn0Var = (ffn0) objT;
                    zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                    objT2 = b0kVar3.T();
                    if (zG) {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    } else {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    }
                    int i28 = i11;
                    vu30Var7 = vu30Var14;
                    b0kVar2 = b0kVar3;
                    long j14 = j5;
                    w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j14, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i28, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                    qim0Var2 = qim0Var3;
                    erl1Var2 = erl1VarV;
                    vu30Var9 = vu30Var11;
                    vu30Var10 = vu30Var12;
                    j4 = j6;
                    i13 = i28;
                    vu30Var8 = vu30Var13;
                    j3 = j14;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var8 = vu30Var3;
                    erl1Var2 = erl1Var;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var6;
                    i13 = i11;
                    j3 = j;
                    j4 = j2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                }
            }
            i7 |= 196608;
            i11 = i;
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i7 |= i17;
            }
            if ((i2 & 12582912) == 0) {
                i7 |= 4194304;
            }
            if ((i2 & 100663296) != 0) {
                i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i7 |= i16;
            }
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i7 & 1, z)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i19 != 0) {
                        vu30Var11 = iej.a;
                    } else {
                        vu30Var11 = vu30Var5;
                    }
                    if (i5 != 0) {
                        vu30Var12 = iej.b;
                    } else {
                        vu30Var12 = vu30Var6;
                    }
                    vu30Var13 = iej.c;
                    if (i8 != 0) {
                        vu30Var7 = iej.d;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((dah) b0kVar3.k(eah.a)).n;
                        i7 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    long jB14 = eah.b(j5, b0kVar3);
                    i14 = i7 & (-29360129);
                    if ((i3 & 256) != 0) {
                        erl1VarV = zxo1.v(b0kVar3);
                        i14 = i7 & (-264241153);
                    } else {
                        erl1VarV = erl1Var;
                    }
                    j6 = jB14;
                } else {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i19 != 0) {
                        vu30Var11 = iej.a;
                    } else {
                        vu30Var11 = vu30Var5;
                    }
                    if (i5 != 0) {
                        vu30Var12 = iej.b;
                    } else {
                        vu30Var12 = vu30Var6;
                    }
                    vu30Var13 = iej.c;
                    if (i8 != 0) {
                        vu30Var7 = iej.d;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((dah) b0kVar3.k(eah.a)).n;
                        i7 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    long jB15 = eah.b(j5, b0kVar3);
                    i14 = i7 & (-29360129);
                    if ((i3 & 256) != 0) {
                        erl1VarV = zxo1.v(b0kVar3);
                        i14 = i7 & (-264241153);
                    } else {
                        erl1VarV = erl1Var;
                    }
                    j6 = jB15;
                }
                b0kVar3.s();
                i15 = (i14 & 234881024) ^ 100663296;
                if (i15 > 67108864) {
                    vu30Var14 = vu30Var7;
                    if ((i14 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    vu30Var14 = vu30Var7;
                    if ((i14 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objT = b0kVar3.T();
                if (z2) {
                    objT = new ffn0(erl1VarV);
                    b0kVar3.s0(objT);
                } else {
                    objT = new ffn0(erl1VarV);
                    b0kVar3.s0(objT);
                }
                ffn0Var = (ffn0) objT;
                zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                objT2 = b0kVar3.T();
                if (zG) {
                    objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                    b0kVar3.s0(objT2);
                }
                int i29 = i11;
                vu30Var7 = vu30Var14;
                b0kVar2 = b0kVar3;
                long j15 = j5;
                w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j15, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i29, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                qim0Var2 = qim0Var3;
                erl1Var2 = erl1VarV;
                vu30Var9 = vu30Var11;
                vu30Var10 = vu30Var12;
                j4 = j6;
                i13 = i29;
                vu30Var8 = vu30Var13;
                j3 = j15;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                vu30Var8 = vu30Var3;
                erl1Var2 = erl1Var;
                vu30Var9 = vu30Var5;
                vu30Var10 = vu30Var6;
                i13 = i11;
                j3 = j;
                j4 = j2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
            }
        }
        i4 |= 48;
        vu30Var5 = vu30Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                vu30Var6 = vu30Var2;
                if (b0kVar3.i(vu30Var6)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i4 | 3072;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    vu30Var7 = vu30Var4;
                    if (b0kVar3.i(vu30Var7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i7 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((196608 & i2) == 0) {
                        i11 = i;
                        if (b0kVar3.e(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i7 |= i12;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 64) == 0) {
                            i17 = 524288;
                        } else {
                            i17 = 524288;
                        }
                        i7 |= i17;
                    }
                    if ((i2 & 12582912) == 0) {
                        i7 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i7 |= i16;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i7 & 1, z)) {
                        b0kVar3.d0();
                        if ((i2 & 1) != 0) {
                            if (i18 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var;
                            }
                            if (i19 != 0) {
                                vu30Var11 = iej.a;
                            } else {
                                vu30Var11 = vu30Var5;
                            }
                            if (i5 != 0) {
                                vu30Var12 = iej.b;
                            } else {
                                vu30Var12 = vu30Var6;
                            }
                            vu30Var13 = iej.c;
                            if (i8 != 0) {
                                vu30Var7 = iej.d;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((dah) b0kVar3.k(eah.a)).n;
                                i7 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            long jB16 = eah.b(j5, b0kVar3);
                            i14 = i7 & (-29360129);
                            if ((i3 & 256) != 0) {
                                erl1VarV = zxo1.v(b0kVar3);
                                i14 = i7 & (-264241153);
                            } else {
                                erl1VarV = erl1Var;
                            }
                            j6 = jB16;
                        } else {
                            if (i18 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var;
                            }
                            if (i19 != 0) {
                                vu30Var11 = iej.a;
                            } else {
                                vu30Var11 = vu30Var5;
                            }
                            if (i5 != 0) {
                                vu30Var12 = iej.b;
                            } else {
                                vu30Var12 = vu30Var6;
                            }
                            vu30Var13 = iej.c;
                            if (i8 != 0) {
                                vu30Var7 = iej.d;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((dah) b0kVar3.k(eah.a)).n;
                                i7 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            long jB17 = eah.b(j5, b0kVar3);
                            i14 = i7 & (-29360129);
                            if ((i3 & 256) != 0) {
                                erl1VarV = zxo1.v(b0kVar3);
                                i14 = i7 & (-264241153);
                            } else {
                                erl1VarV = erl1Var;
                            }
                            j6 = jB17;
                        }
                        b0kVar3.s();
                        i15 = (i14 & 234881024) ^ 100663296;
                        if (i15 > 67108864) {
                            vu30Var14 = vu30Var7;
                            if ((i14 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            vu30Var14 = vu30Var7;
                            if ((i14 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objT = b0kVar3.T();
                        if (z2) {
                            objT = new ffn0(erl1VarV);
                            b0kVar3.s0(objT);
                        } else {
                            objT = new ffn0(erl1VarV);
                            b0kVar3.s0(objT);
                        }
                        ffn0Var = (ffn0) objT;
                        zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                        objT2 = b0kVar3.T();
                        if (zG) {
                            objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                            b0kVar3.s0(objT2);
                        } else {
                            objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                            b0kVar3.s0(objT2);
                        }
                        int i210 = i11;
                        vu30Var7 = vu30Var14;
                        b0kVar2 = b0kVar3;
                        long j16 = j5;
                        w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j16, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i210, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                        qim0Var2 = qim0Var3;
                        erl1Var2 = erl1VarV;
                        vu30Var9 = vu30Var11;
                        vu30Var10 = vu30Var12;
                        j4 = j6;
                        i13 = i210;
                        vu30Var8 = vu30Var13;
                        j3 = j16;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                        vu30Var8 = vu30Var3;
                        erl1Var2 = erl1Var;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = vu30Var6;
                        i13 = i11;
                        j3 = j;
                        j4 = j2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                    }
                }
                i7 |= 196608;
                i11 = i;
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i17 = 524288;
                    } else {
                        i17 = 524288;
                    }
                    i7 |= i17;
                }
                if ((i2 & 12582912) == 0) {
                    i7 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i7 |= i16;
                }
                if ((i7 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i7 & 1, z)) {
                    b0kVar3.d0();
                    if ((i2 & 1) != 0) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB18 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB18;
                    } else {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB19 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB19;
                    }
                    b0kVar3.s();
                    i15 = (i14 & 234881024) ^ 100663296;
                    if (i15 > 67108864) {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objT = b0kVar3.T();
                    if (z2) {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    }
                    ffn0Var = (ffn0) objT;
                    zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                    objT2 = b0kVar3.T();
                    if (zG) {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    } else {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    }
                    int i211 = i11;
                    vu30Var7 = vu30Var14;
                    b0kVar2 = b0kVar3;
                    long j17 = j5;
                    w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j17, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i211, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                    qim0Var2 = qim0Var3;
                    erl1Var2 = erl1VarV;
                    vu30Var9 = vu30Var11;
                    vu30Var10 = vu30Var12;
                    j4 = j6;
                    i13 = i211;
                    vu30Var8 = vu30Var13;
                    j3 = j17;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var8 = vu30Var3;
                    erl1Var2 = erl1Var;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var6;
                    i13 = i11;
                    j3 = j;
                    j4 = j2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                }
            }
            i7 = i4 | 27648;
            vu30Var7 = vu30Var4;
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((196608 & i2) == 0) {
                    i11 = i;
                    if (b0kVar3.e(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i7 |= i12;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i17 = 524288;
                    } else {
                        i17 = 524288;
                    }
                    i7 |= i17;
                }
                if ((i2 & 12582912) == 0) {
                    i7 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i7 |= i16;
                }
                if ((i7 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i7 & 1, z)) {
                    b0kVar3.d0();
                    if ((i2 & 1) != 0) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB110 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB110;
                    } else {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB111 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB111;
                    }
                    b0kVar3.s();
                    i15 = (i14 & 234881024) ^ 100663296;
                    if (i15 > 67108864) {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objT = b0kVar3.T();
                    if (z2) {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    }
                    ffn0Var = (ffn0) objT;
                    zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                    objT2 = b0kVar3.T();
                    if (zG) {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    } else {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    }
                    int i212 = i11;
                    vu30Var7 = vu30Var14;
                    b0kVar2 = b0kVar3;
                    long j18 = j5;
                    w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j18, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i212, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                    qim0Var2 = qim0Var3;
                    erl1Var2 = erl1VarV;
                    vu30Var9 = vu30Var11;
                    vu30Var10 = vu30Var12;
                    j4 = j6;
                    i13 = i212;
                    vu30Var8 = vu30Var13;
                    j3 = j18;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var8 = vu30Var3;
                    erl1Var2 = erl1Var;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var6;
                    i13 = i11;
                    j3 = j;
                    j4 = j2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                }
            }
            i7 |= 196608;
            i11 = i;
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i7 |= i17;
            }
            if ((i2 & 12582912) == 0) {
                i7 |= 4194304;
            }
            if ((i2 & 100663296) != 0) {
                i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i7 |= i16;
            }
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i7 & 1, z)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i19 != 0) {
                        vu30Var11 = iej.a;
                    } else {
                        vu30Var11 = vu30Var5;
                    }
                    if (i5 != 0) {
                        vu30Var12 = iej.b;
                    } else {
                        vu30Var12 = vu30Var6;
                    }
                    vu30Var13 = iej.c;
                    if (i8 != 0) {
                        vu30Var7 = iej.d;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((dah) b0kVar3.k(eah.a)).n;
                        i7 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    long jB112 = eah.b(j5, b0kVar3);
                    i14 = i7 & (-29360129);
                    if ((i3 & 256) != 0) {
                        erl1VarV = zxo1.v(b0kVar3);
                        i14 = i7 & (-264241153);
                    } else {
                        erl1VarV = erl1Var;
                    }
                    j6 = jB112;
                } else {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i19 != 0) {
                        vu30Var11 = iej.a;
                    } else {
                        vu30Var11 = vu30Var5;
                    }
                    if (i5 != 0) {
                        vu30Var12 = iej.b;
                    } else {
                        vu30Var12 = vu30Var6;
                    }
                    vu30Var13 = iej.c;
                    if (i8 != 0) {
                        vu30Var7 = iej.d;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((dah) b0kVar3.k(eah.a)).n;
                        i7 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    long jB113 = eah.b(j5, b0kVar3);
                    i14 = i7 & (-29360129);
                    if ((i3 & 256) != 0) {
                        erl1VarV = zxo1.v(b0kVar3);
                        i14 = i7 & (-264241153);
                    } else {
                        erl1VarV = erl1Var;
                    }
                    j6 = jB113;
                }
                b0kVar3.s();
                i15 = (i14 & 234881024) ^ 100663296;
                if (i15 > 67108864) {
                    vu30Var14 = vu30Var7;
                    if ((i14 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    vu30Var14 = vu30Var7;
                    if ((i14 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objT = b0kVar3.T();
                if (z2) {
                    objT = new ffn0(erl1VarV);
                    b0kVar3.s0(objT);
                } else {
                    objT = new ffn0(erl1VarV);
                    b0kVar3.s0(objT);
                }
                ffn0Var = (ffn0) objT;
                zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                objT2 = b0kVar3.T();
                if (zG) {
                    objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                    b0kVar3.s0(objT2);
                }
                int i213 = i11;
                vu30Var7 = vu30Var14;
                b0kVar2 = b0kVar3;
                long j19 = j5;
                w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j19, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i213, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                qim0Var2 = qim0Var3;
                erl1Var2 = erl1VarV;
                vu30Var9 = vu30Var11;
                vu30Var10 = vu30Var12;
                j4 = j6;
                i13 = i213;
                vu30Var8 = vu30Var13;
                j3 = j19;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                vu30Var8 = vu30Var3;
                erl1Var2 = erl1Var;
                vu30Var9 = vu30Var5;
                vu30Var10 = vu30Var6;
                i13 = i11;
                j3 = j;
                j4 = j2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
            }
        }
        i4 |= 384;
        vu30Var6 = vu30Var2;
        i7 = i4 | 3072;
        i8 = i3 & 16;
        if (i8 != 0) {
            if ((i2 & 24576) == 0) {
                vu30Var7 = vu30Var4;
                if (b0kVar3.i(vu30Var7)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i7 |= i9;
            }
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((196608 & i2) == 0) {
                    i11 = i;
                    if (b0kVar3.e(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i7 |= i12;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i17 = 524288;
                    } else {
                        i17 = 524288;
                    }
                    i7 |= i17;
                }
                if ((i2 & 12582912) == 0) {
                    i7 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i7 |= i16;
                }
                if ((i7 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i7 & 1, z)) {
                    b0kVar3.d0();
                    if ((i2 & 1) != 0) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB114 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB114;
                    } else {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i19 != 0) {
                            vu30Var11 = iej.a;
                        } else {
                            vu30Var11 = vu30Var5;
                        }
                        if (i5 != 0) {
                            vu30Var12 = iej.b;
                        } else {
                            vu30Var12 = vu30Var6;
                        }
                        vu30Var13 = iej.c;
                        if (i8 != 0) {
                            vu30Var7 = iej.d;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((dah) b0kVar3.k(eah.a)).n;
                            i7 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        long jB115 = eah.b(j5, b0kVar3);
                        i14 = i7 & (-29360129);
                        if ((i3 & 256) != 0) {
                            erl1VarV = zxo1.v(b0kVar3);
                            i14 = i7 & (-264241153);
                        } else {
                            erl1VarV = erl1Var;
                        }
                        j6 = jB115;
                    }
                    b0kVar3.s();
                    i15 = (i14 & 234881024) ^ 100663296;
                    if (i15 > 67108864) {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        vu30Var14 = vu30Var7;
                        if ((i14 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objT = b0kVar3.T();
                    if (z2) {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new ffn0(erl1VarV);
                        b0kVar3.s0(objT);
                    }
                    ffn0Var = (ffn0) objT;
                    zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                    objT2 = b0kVar3.T();
                    if (zG) {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    } else {
                        objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                        b0kVar3.s0(objT2);
                    }
                    int i214 = i11;
                    vu30Var7 = vu30Var14;
                    b0kVar2 = b0kVar3;
                    long j110 = j5;
                    w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j110, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i214, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                    qim0Var2 = qim0Var3;
                    erl1Var2 = erl1VarV;
                    vu30Var9 = vu30Var11;
                    vu30Var10 = vu30Var12;
                    j4 = j6;
                    i13 = i214;
                    vu30Var8 = vu30Var13;
                    j3 = j110;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var8 = vu30Var3;
                    erl1Var2 = erl1Var;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var6;
                    i13 = i11;
                    j3 = j;
                    j4 = j2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
                }
            }
            i7 |= 196608;
            i11 = i;
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i7 |= i17;
            }
            if ((i2 & 12582912) == 0) {
                i7 |= 4194304;
            }
            if ((i2 & 100663296) != 0) {
                i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i7 |= i16;
            }
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i7 & 1, z)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i19 != 0) {
                        vu30Var11 = iej.a;
                    } else {
                        vu30Var11 = vu30Var5;
                    }
                    if (i5 != 0) {
                        vu30Var12 = iej.b;
                    } else {
                        vu30Var12 = vu30Var6;
                    }
                    vu30Var13 = iej.c;
                    if (i8 != 0) {
                        vu30Var7 = iej.d;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((dah) b0kVar3.k(eah.a)).n;
                        i7 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    long jB116 = eah.b(j5, b0kVar3);
                    i14 = i7 & (-29360129);
                    if ((i3 & 256) != 0) {
                        erl1VarV = zxo1.v(b0kVar3);
                        i14 = i7 & (-264241153);
                    } else {
                        erl1VarV = erl1Var;
                    }
                    j6 = jB116;
                } else {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i19 != 0) {
                        vu30Var11 = iej.a;
                    } else {
                        vu30Var11 = vu30Var5;
                    }
                    if (i5 != 0) {
                        vu30Var12 = iej.b;
                    } else {
                        vu30Var12 = vu30Var6;
                    }
                    vu30Var13 = iej.c;
                    if (i8 != 0) {
                        vu30Var7 = iej.d;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((dah) b0kVar3.k(eah.a)).n;
                        i7 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    long jB117 = eah.b(j5, b0kVar3);
                    i14 = i7 & (-29360129);
                    if ((i3 & 256) != 0) {
                        erl1VarV = zxo1.v(b0kVar3);
                        i14 = i7 & (-264241153);
                    } else {
                        erl1VarV = erl1Var;
                    }
                    j6 = jB117;
                }
                b0kVar3.s();
                i15 = (i14 & 234881024) ^ 100663296;
                if (i15 > 67108864) {
                    vu30Var14 = vu30Var7;
                    if ((i14 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    vu30Var14 = vu30Var7;
                    if ((i14 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objT = b0kVar3.T();
                if (z2) {
                    objT = new ffn0(erl1VarV);
                    b0kVar3.s0(objT);
                } else {
                    objT = new ffn0(erl1VarV);
                    b0kVar3.s0(objT);
                }
                ffn0Var = (ffn0) objT;
                zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                objT2 = b0kVar3.T();
                if (zG) {
                    objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                    b0kVar3.s0(objT2);
                }
                int i215 = i11;
                vu30Var7 = vu30Var14;
                b0kVar2 = b0kVar3;
                long j111 = j5;
                w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j111, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i215, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                qim0Var2 = qim0Var3;
                erl1Var2 = erl1VarV;
                vu30Var9 = vu30Var11;
                vu30Var10 = vu30Var12;
                j4 = j6;
                i13 = i215;
                vu30Var8 = vu30Var13;
                j3 = j111;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                vu30Var8 = vu30Var3;
                erl1Var2 = erl1Var;
                vu30Var9 = vu30Var5;
                vu30Var10 = vu30Var6;
                i13 = i11;
                j3 = j;
                j4 = j2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
            }
        }
        i7 = i4 | 27648;
        vu30Var7 = vu30Var4;
        i10 = i3 & 32;
        if (i10 != 0) {
            if ((196608 & i2) == 0) {
                i11 = i;
                if (b0kVar3.e(i11)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i7 |= i12;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i7 |= i17;
            }
            if ((i2 & 12582912) == 0) {
                i7 |= 4194304;
            }
            if ((i2 & 100663296) != 0) {
                i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i7 |= i16;
            }
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i7 & 1, z)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i19 != 0) {
                        vu30Var11 = iej.a;
                    } else {
                        vu30Var11 = vu30Var5;
                    }
                    if (i5 != 0) {
                        vu30Var12 = iej.b;
                    } else {
                        vu30Var12 = vu30Var6;
                    }
                    vu30Var13 = iej.c;
                    if (i8 != 0) {
                        vu30Var7 = iej.d;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((dah) b0kVar3.k(eah.a)).n;
                        i7 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    long jB118 = eah.b(j5, b0kVar3);
                    i14 = i7 & (-29360129);
                    if ((i3 & 256) != 0) {
                        erl1VarV = zxo1.v(b0kVar3);
                        i14 = i7 & (-264241153);
                    } else {
                        erl1VarV = erl1Var;
                    }
                    j6 = jB118;
                } else {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i19 != 0) {
                        vu30Var11 = iej.a;
                    } else {
                        vu30Var11 = vu30Var5;
                    }
                    if (i5 != 0) {
                        vu30Var12 = iej.b;
                    } else {
                        vu30Var12 = vu30Var6;
                    }
                    vu30Var13 = iej.c;
                    if (i8 != 0) {
                        vu30Var7 = iej.d;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((dah) b0kVar3.k(eah.a)).n;
                        i7 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    long jB119 = eah.b(j5, b0kVar3);
                    i14 = i7 & (-29360129);
                    if ((i3 & 256) != 0) {
                        erl1VarV = zxo1.v(b0kVar3);
                        i14 = i7 & (-264241153);
                    } else {
                        erl1VarV = erl1Var;
                    }
                    j6 = jB119;
                }
                b0kVar3.s();
                i15 = (i14 & 234881024) ^ 100663296;
                if (i15 > 67108864) {
                    vu30Var14 = vu30Var7;
                    if ((i14 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    vu30Var14 = vu30Var7;
                    if ((i14 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objT = b0kVar3.T();
                if (z2) {
                    objT = new ffn0(erl1VarV);
                    b0kVar3.s0(objT);
                } else {
                    objT = new ffn0(erl1VarV);
                    b0kVar3.s0(objT);
                }
                ffn0Var = (ffn0) objT;
                zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
                objT2 = b0kVar3.T();
                if (zG) {
                    objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                    b0kVar3.s0(objT2);
                }
                int i216 = i11;
                vu30Var7 = vu30Var14;
                b0kVar2 = b0kVar3;
                long j112 = j5;
                w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j112, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i216, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
                qim0Var2 = qim0Var3;
                erl1Var2 = erl1VarV;
                vu30Var9 = vu30Var11;
                vu30Var10 = vu30Var12;
                j4 = j6;
                i13 = i216;
                vu30Var8 = vu30Var13;
                j3 = j112;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                vu30Var8 = vu30Var3;
                erl1Var2 = erl1Var;
                vu30Var9 = vu30Var5;
                vu30Var10 = vu30Var6;
                i13 = i11;
                j3 = j;
                j4 = j2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
            }
        }
        i7 |= 196608;
        i11 = i;
        if ((i2 & 1572864) != 0) {
            if ((i3 & 64) == 0) {
                i17 = 524288;
            } else {
                i17 = 524288;
            }
            i7 |= i17;
        }
        if ((i2 & 12582912) == 0) {
            i7 |= 4194304;
        }
        if ((i2 & 100663296) != 0) {
            i7 |= ((i3 & 256) == 0 || !b0kVar3.g(erl1Var)) ? 33554432 : 67108864;
        }
        if ((i2 & 805306368) == 0) {
            if (b0kVar3.i(j2iVar)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i7 |= i16;
        }
        if ((i7 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i7 & 1, z)) {
            b0kVar3.d0();
            if ((i2 & 1) != 0) {
                if (i18 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if (i19 != 0) {
                    vu30Var11 = iej.a;
                } else {
                    vu30Var11 = vu30Var5;
                }
                if (i5 != 0) {
                    vu30Var12 = iej.b;
                } else {
                    vu30Var12 = vu30Var6;
                }
                vu30Var13 = iej.c;
                if (i8 != 0) {
                    vu30Var7 = iej.d;
                }
                if (i10 != 0) {
                    i11 = 2;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((dah) b0kVar3.k(eah.a)).n;
                    i7 &= -3670017;
                } else {
                    j5 = j;
                }
                long jB1110 = eah.b(j5, b0kVar3);
                i14 = i7 & (-29360129);
                if ((i3 & 256) != 0) {
                    erl1VarV = zxo1.v(b0kVar3);
                    i14 = i7 & (-264241153);
                } else {
                    erl1VarV = erl1Var;
                }
                j6 = jB1110;
            } else {
                if (i18 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if (i19 != 0) {
                    vu30Var11 = iej.a;
                } else {
                    vu30Var11 = vu30Var5;
                }
                if (i5 != 0) {
                    vu30Var12 = iej.b;
                } else {
                    vu30Var12 = vu30Var6;
                }
                vu30Var13 = iej.c;
                if (i8 != 0) {
                    vu30Var7 = iej.d;
                }
                if (i10 != 0) {
                    i11 = 2;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((dah) b0kVar3.k(eah.a)).n;
                    i7 &= -3670017;
                } else {
                    j5 = j;
                }
                long jB1111 = eah.b(j5, b0kVar3);
                i14 = i7 & (-29360129);
                if ((i3 & 256) != 0) {
                    erl1VarV = zxo1.v(b0kVar3);
                    i14 = i7 & (-264241153);
                } else {
                    erl1VarV = erl1Var;
                }
                j6 = jB1111;
            }
            b0kVar3.s();
            i15 = (i14 & 234881024) ^ 100663296;
            if (i15 > 67108864) {
                vu30Var14 = vu30Var7;
                if ((i14 & 100663296) != 67108864) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                vu30Var14 = vu30Var7;
                if ((i14 & 100663296) != 67108864) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            objT = b0kVar3.T();
            if (z2) {
                objT = new ffn0(erl1VarV);
                b0kVar3.s0(objT);
            } else {
                objT = new ffn0(erl1VarV);
                b0kVar3.s0(objT);
            }
            ffn0Var = (ffn0) objT;
            zG = b0kVar3.g(ffn0Var) | ((i15 <= 67108864 && b0kVar3.g(erl1VarV)) || (i14 & 100663296) == 67108864);
            objT2 = b0kVar3.T();
            if (zG) {
                objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new gub0(ffn0Var, erl1VarV, (byte) 17);
                b0kVar3.s0(objT2);
            }
            int i217 = i11;
            vu30Var7 = vu30Var14;
            b0kVar2 = b0kVar3;
            long j113 = j5;
            w3d1.a(too1.s(qim0Var3, (iu30) objT2), (hw61) null, j113, j6, 0.0f, 0.0f, (qqb) null, apo.r(848889571, new vf41(i217, vu30Var11, j2iVar, vu30Var13, vu30Var14, ffn0Var, vu30Var12), b0kVar3), b0kVar2, ((i14 >> 12) & 896) | 12582912, 114);
            qim0Var2 = qim0Var3;
            erl1Var2 = erl1VarV;
            vu30Var9 = vu30Var11;
            vu30Var10 = vu30Var12;
            j4 = j6;
            i13 = i217;
            vu30Var8 = vu30Var13;
            j3 = j113;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            vu30Var8 = vu30Var3;
            erl1Var2 = erl1Var;
            vu30Var9 = vu30Var5;
            vu30Var10 = vu30Var6;
            i13 = i11;
            j3 = j;
            j4 = j2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new of41(qim0Var2, vu30Var9, vu30Var10, vu30Var8, vu30Var7, i13, j3, j4, erl1Var2, j2iVar, i2, i3);
        }
    }

    public static final void o(int i, vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, vu30 vu30Var3, erl1 erl1Var, vu30 vu30Var4, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-280287501);
        int i4 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(j2iVar) ? 256 : 128) | (x340Var.i(vu30Var2) ? 2048 : 1024) | (x340Var.i(vu30Var3) ? 16384 : 8192) | (x340Var.g(erl1Var) ? 131072 : 65536) | (x340Var.i(vu30Var4) ? 1048576 : 524288);
        if (x340Var.Y(i4 & 1, (599187 & i4) != 599186)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new wf41();
                x340Var.s0(objT);
            }
            wf41 wf41Var = (wf41) objT;
            boolean z = (i4 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new j2i(605195056, new bi3(vu30Var, (byte) 6), true);
                x340Var.s0(objT2);
            }
            vu30 vu30Var5 = (vu30) objT2;
            boolean z2 = (i4 & 7168) == 2048;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new j2i(418899191, new bi3(vu30Var2, (byte) 5), true);
                x340Var.s0(objT3);
            }
            vu30 vu30Var6 = (vu30) objT3;
            boolean z3 = (57344 & i4) == 16384;
            Object objT4 = x340Var.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new j2i(338600263, new bi3(vu30Var3, (byte) 4), true);
                x340Var.s0(objT4);
            }
            vu30 vu30Var7 = (vu30) objT4;
            boolean z4 = (i4 & 896) == 256;
            Object objT5 = x340Var.T();
            if (z4 || objT5 == m4cVar) {
                objT5 = new j2i(-1776388365, new ek1(j2iVar, wf41Var, (byte) 14), true);
                x340Var.s0(objT5);
            }
            vu30 vu30Var8 = (vu30) objT5;
            boolean z5 = (i4 & 3670016) == 1048576;
            Object objT6 = x340Var.T();
            if (z5 || objT6 == m4cVar) {
                objT6 = new j2i(-1731662488, new bi3(vu30Var4, (byte) 3), true);
                x340Var.s0(objT6);
            }
            vu30 vu30Var9 = (vu30) objT6;
            boolean zG = ((i4 & 458752) == 131072) | x340Var.g(vu30Var5) | x340Var.g(vu30Var6) | x340Var.g(vu30Var7) | ((i4 & 14) == 4) | x340Var.g(vu30Var9) | x340Var.g(vu30Var8);
            Object objT7 = x340Var.T();
            if (zG || objT7 == m4cVar) {
                i3 = 0;
                qf41 qf41Var = new qf41(erl1Var, vu30Var5, vu30Var6, vu30Var7, i, vu30Var9, wf41Var, vu30Var8);
                x340Var.s0(qf41Var);
                objT7 = qf41Var;
            } else {
                i3 = 0;
            }
            ejo1.l(i3, 1, x340Var, (vu30) objT7, (qim0) null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sf41(i, vu30Var, j2iVar, vu30Var2, vu30Var3, erl1Var, vu30Var4, i2);
        }
    }

    public static final void p(p750 p750Var, dh30 dh30Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-858013842);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(p750Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(dh30Var) : x340Var.i(dh30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ujo1.c(l6o1.C(0, 0, 1, x340Var), t3k1.t(v850.b), apo.r(1076164387, new s750(iu30Var, p750Var, dh30Var, b2), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r750(p750Var, dh30Var, iu30Var, i, (byte) 2);
        }
    }

    public static final void q(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1544926522);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(12.0f));
            ni7 ni7VarA = oi7.a(Uri.parse("https://cdn-spotify-gen-alpha.spotifycdn.com/kids-graduation/TeenGraduationApproved.webp"), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070);
            as80 as80Var = mif1.S0;
            cbx.a.getClass();
            eso1.h(ni7VarA, isl.a, qim0VarQ, (p3v) null, (zvx) null, uwr.d(), as80Var, (tl3) null, (ColorFilter) null, x340Var, 3120, 400);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 11);
        }
    }

    public static final void r(qim0 qim0Var, hs20 hs20Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1646023061);
        int i2 = (x340Var.i(hs20Var) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("use_photo_button", qim0Var);
            idx idxVar = new idx(8);
            String strO0 = cwl1.o0(x340Var, 2131956660);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ptb(hs20Var, (byte) 6);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), idxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, hai.b, x340Var, 0, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(qim0Var, hs20Var, i, (byte) 24);
        }
    }

    public static final b6r0 s(k5t k5tVar, o7r0 o7r0Var, dg0 dg0Var, j7p j7pVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        dg30 dg30Var = (dg30) x340Var.k(mce0.a);
        cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
        q7r0 q7r0VarG = cir0Var.g();
        boolean zG = x340Var.g(k5tVar) | x340Var.g(o7r0Var) | x340Var.g(dg0Var) | x340Var.g(dg30Var) | x340Var.g(cir0Var) | x340Var.g(q7r0VarG) | x340Var.g(j7pVar);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            qe41 qe41VarD = cir0Var.d();
            l1k l1kVar = new l1k(0, j7pVar, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3);
            mr30 mr30Var = new mr30(dg30Var, false);
            Observable observableA = dg0Var.a(dg30Var);
            pa2 pa2Var = new pa2((byte) 3);
            b6r0 b6r0Var = new b6r0(dg30Var, qe41VarD, o7r0Var, mr30Var, (wbr0) null, (sbr0) null, new qa2(q7r0VarG, (byte) 11), s5o0.a, observableA, Observable.just(Boolean.TRUE), pa2Var, k5tVar, l1kVar, 240);
            x340Var.s0(b6r0Var);
            objT = b6r0Var;
        }
        return (b6r0) objT;
    }

    public static final uw4 t(float f, float[] fArr) {
        return new uw4(new DashPathEffect(fArr, f));
    }

    public static final void u(DrawScope drawScope, int i, long j, float f, float f2) {
        if (i == 1) {
            float f3 = f / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.j() >> 32)) - f3) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f;
            DrawScope.b0(drawScope, j, f3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), 0.0f, (DrawStyle) null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (drawScope.j() >> 32)) - f) - f2;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f) / 2.0f;
        DrawScope.d0(drawScope, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))), 0.0f, (phc1) null, (ColorFilter) null, 120);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(d0r d0rVar, o3r o3rVar, ufj1 ufj1Var, onm onmVar) {
        agj1 agj1Var;
        if (onmVar instanceof agj1) {
            agj1Var = (agj1) onmVar;
            int i = agj1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                agj1Var.b = i - Integer.MIN_VALUE;
            } else {
                agj1Var = new agj1(onmVar);
            }
        } else {
            agj1Var = new agj1(onmVar);
        }
        Object objJ = agj1Var.a;
        int i2 = agj1Var.b;
        if (i2 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F(d0rVar, o3rVar, ufj1Var);
            q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 24);
            agj1Var.b = 1;
            objJ = b5p1.j(ay8VarF, q1c1Var, agj1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (u890.j(i1rVar, j1r.a) || (i1rVar instanceof h1r)) {
            return null;
        }
        if (i1rVar instanceof i1r) {
            return i1rVar.a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object w(d0r d0rVar, wh41 wh41Var, fgj1 fgj1Var, onm onmVar) {
        bgj1 bgj1Var;
        d0r d0rVar2;
        fgj1 fgj1Var2;
        wh41 wh41Var2;
        if (onmVar instanceof bgj1) {
            bgj1Var = (bgj1) onmVar;
            int i = bgj1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgj1Var.e = i - Integer.MIN_VALUE;
            } else {
                bgj1Var = new bgj1(onmVar);
            }
        } else {
            bgj1Var = new bgj1(onmVar);
        }
        Object objV = bgj1Var.d;
        int i2 = bgj1Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objV);
            qgj1.f.getClass();
            o3r o3rVar = qgj1.h;
            ufj1 ufj1Var = fgj1Var.a;
            bgj1Var.a = d0rVar;
            bgj1Var.b = wh41Var;
            bgj1Var.c = fgj1Var;
            bgj1Var.e = 1;
            objV = v(d0rVar, o3rVar, ufj1Var, bgj1Var);
            if (objV != d9nVar) {
                d0rVar2 = d0rVar;
                fgj1Var2 = fgj1Var;
                wh41Var2 = wh41Var;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objV);
                return objV;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fgj1 fgj1Var3 = bgj1Var.c;
        wh41 wh41Var3 = bgj1Var.b;
        d0r d0rVar3 = bgj1Var.a;
        hm5.M(objV);
        fgj1Var2 = fgj1Var3;
        wh41Var2 = wh41Var3;
        d0rVar2 = d0rVar3;
        dgj1 dgj1Var = (dgj1) objV;
        if (dgj1Var != null) {
            io70 io70Var = dgj1Var.a.e;
            String str = io70Var != null ? io70Var.b : null;
            if (str != null) {
                sh6 sh6Var = new sh6((byte) 12, dgj1Var, d0rVar2, fgj1Var2, str, wh41Var2, (lnm) null);
                bgj1Var.a = null;
                bgj1Var.b = null;
                bgj1Var.c = null;
                bgj1Var.e = 2;
                Object objS = smo1.s(sh6Var, bgj1Var);
                return objS == d9nVar ? d9nVar : objS;
            }
        }
        return hgj1.a;
    }

    public static boolean x(me4 me4Var) {
        return me4Var.a();
    }

    public static boolean y(me4 me4Var) {
        return me4Var.b();
    }

    public static boolean z(me4 me4Var) {
        return me4Var.f();
    }
}
