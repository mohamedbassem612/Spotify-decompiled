package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import spotify.playlist.esperanto.proto.Signal;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class e9p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(fu1 fu1Var, iu30 iu30Var, dx1 dx1Var, ow1 ow1Var, mj11 mj11Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        Object obj;
        Object hb1Var;
        int i3;
        rih1 rih1Var;
        lnm lnmVar;
        mj11 mj11Var2;
        boolean z;
        fu1 fu1Var2 = fu1Var;
        dx1 dx1Var2 = dx1Var;
        ow1 ow1Var2 = ow1Var;
        mj11 mj11Var3 = mj11Var;
        boolean z2 = fu1Var2.o;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-29026281);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(fu1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(dx1Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(ow1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(mj11Var3) ? 16384 : 8192;
        }
        int i4 = i2 | 196608;
        if (b0kVar3.Y(i4 & 1, (74899 & i4) != 74898)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            Context baseContext = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    eg.m("No Activity found in context chain");
                    return;
                }
                if (baseContext instanceof Activity) {
                    Activity activity = (Activity) baseContext;
                    int i5 = activity.getResources().getDisplayMetrics().heightPixels;
                    rt1 rt1VarL = x8p1.l(b0kVar3);
                    int iJ = ywx0.j(rt1VarL.a, 250, 100, rt1VarL.b + rt1VarL.c);
                    if (iJ > i5) {
                        iJ = i5;
                    }
                    int i6 = iJ > i5 ? i5 : iJ;
                    upo upoVarR = byo1.r((dx1Var2.e || activity.getResources().getConfiguration().fontScale > 2.0f || i6 >= i5) ? wy71.b : mj11Var3.a, b0kVar3);
                    Object objT2 = b0kVar3.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(Integer.valueOf(i6 > 0 ? i6 : 0));
                        b0kVar3.s0(objT2);
                    }
                    ven0 ven0Var = (ven0) objT2;
                    Object objT3 = b0kVar3.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q((Object) null);
                        b0kVar3.s0(objT3);
                    }
                    ven0 ven0Var2 = (ven0) objT3;
                    Object objT4 = b0kVar3.T();
                    if (objT4 == m4cVar) {
                        objT4 = v8r.q(Boolean.FALSE);
                        b0kVar3.s0(objT4);
                    }
                    ven0 ven0Var3 = (ven0) objT4;
                    Object objT5 = b0kVar3.T();
                    if (objT5 == m4cVar) {
                        objT5 = yv91.a(new rr1(upoVarR, (byte) 3));
                        b0kVar3.s0(objT5);
                    }
                    tob1 tob1Var = (tob1) objT5;
                    ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
                    Object objT6 = b0kVar3.T();
                    if (objT6 == m4cVar) {
                        wwq0 wwq0Var = new wwq0(activity);
                        wwq0Var.b = new rr1(upoVarR, (byte) 4);
                        b0kVar3.s0(wwq0Var);
                        obj = wwq0Var;
                    } else {
                        obj = objT6;
                    }
                    wwq0 wwq0Var2 = (wwq0) obj;
                    int i7 = i4 & 7168;
                    boolean z3 = i7 == 2048;
                    int i8 = i4;
                    Object objT7 = b0kVar3.T();
                    if (z3 || objT7 == m4cVar) {
                        objT7 = new pv1(ow1Var2, (byte) 0);
                        b0kVar3.s0(objT7);
                    }
                    wwq0Var2.a = (Function0) objT7;
                    boolean zI = b0kVar3.i(wwq0Var2) | b0kVar3.i(activity);
                    Object objT8 = b0kVar3.T();
                    if (zI || objT8 == m4cVar) {
                        objT8 = new tt1(wwq0Var2, activity, (byte) 1);
                        b0kVar3.s0(objT8);
                    }
                    rih1 rih1Var2 = rih1.a;
                    qxd0.i(rih1Var2, (iu30) objT8, b0kVar3);
                    int i9 = i8 & 57344;
                    boolean zI2 = (i9 == 16384) | b0kVar3.i(upoVarR) | b0kVar3.g(ven0VarS);
                    Object objT9 = b0kVar3.T();
                    if (zI2 || objT9 == m4cVar) {
                        i3 = i9;
                        rih1Var = rih1Var2;
                        lnmVar = null;
                        hb1Var = new hb1(mj11Var, upoVarR, ven0VarS, (lnm) null, (byte) 5);
                        mj11Var2 = mj11Var;
                        b0kVar3.s0(hb1Var);
                    } else {
                        mj11Var2 = mj11Var;
                        i3 = i9;
                        rih1Var = rih1Var2;
                        hb1Var = objT9;
                        lnmVar = null;
                    }
                    qxd0.t(rih1Var, b0kVar3, (vu30) hb1Var);
                    boolean zI3 = b0kVar3.i(upoVarR) | (i3 == 16384);
                    Object objT10 = b0kVar3.T();
                    if (zI3 || objT10 == m4cVar) {
                        objT10 = new q4(upoVarR, mj11Var2, lnmVar, (byte) 21);
                        b0kVar3.s0(objT10);
                    }
                    qxd0.t(rih1Var, b0kVar3, (vu30) objT10);
                    if (z2 != 0) {
                        b0kVar3.i0(-1431308440);
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        boolean zI4 = b0kVar3.i(upoVarR) | ((i8 & 112) == 32);
                        Object objT11 = b0kVar3.T();
                        if (zI4 || objT11 == m4cVar) {
                            z = false;
                            objT11 = new rv1(upoVarR, iu30Var, lnmVar, (byte) 0);
                            b0kVar3.s0(objT11);
                        } else {
                            z = false;
                        }
                        qxd0.t(boolValueOf, b0kVar3, (vu30) objT11);
                        b0kVar3.r(z);
                    } else {
                        z = false;
                        b0kVar3.i0(-1431121045);
                        b0kVar3.r(false);
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(fu1Var2.e != 1 ? true : z);
                    boolean zI5 = b0kVar3.i(fu1Var2) | b0kVar3.i(upoVarR);
                    Object objT12 = b0kVar3.T();
                    if (zI5 || objT12 == m4cVar) {
                        objT12 = new q4(fu1Var2, upoVarR, lnmVar, (byte) 22);
                        b0kVar3.s0(objT12);
                    }
                    qxd0.t(boolValueOf2, b0kVar3, (vu30) objT12);
                    int iIntValue = ((Number) ven0Var.getValue()).intValue();
                    boolean zB = fu1Var2.b.b();
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(b0kVar3).a.a.a();
                    long j = u7h.k;
                    boolean z4 = i7 == 2048 ? true : z;
                    Object objT13 = b0kVar3.T();
                    if (z4 || objT13 == m4cVar) {
                        objT13 = new jm1(ow1Var2, (byte) 3);
                        b0kVar3.s0(objT13);
                    }
                    iu30 iu30Var2 = (iu30) objT13;
                    j2i j2iVarR = apo.r(1845919042, new vv1(ven0Var2, fu1Var2, dx1Var, ow1Var2, c9nVar, upoVarR, i6, mj11Var2, activity, tob1Var, ven0Var, ven0Var3), b0kVar3);
                    n8b1 n8b1Var = upo.l;
                    b0kVar2 = b0kVar3;
                    zxo1.n(upoVarR, iIntValue, iu30Var2, null, j, null, jA, false, false, false, zB, 0.0f, null, null, j2iVarR, b0kVar2, 24584, 15272);
                    qim0Var2 = nim0.a;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                dx1Var2 = dx1Var;
                ow1Var2 = ow1Var;
                mj11Var3 = mj11Var;
                m4cVar = m4cVar;
                i4 = i4;
                z2 = z2;
                fu1Var2 = fu1Var;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(fu1Var, iu30Var, dx1Var, ow1Var, mj11Var, qim0Var2, i, (byte) 2);
        }
    }

    public static final void b(d8a d8aVar, x4a x4aVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1609383338);
        int i2 = (x340Var.g(d8aVar) ? 4 : 2) | i | (x340Var.g(x4aVar) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfx.b(15, apo.r(-1220840245, new qth(qim0Var, d8aVar, x4aVar, function0), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qth(d8aVar, x4aVar, function0, qim0Var, i, (byte) 1);
        }
    }

    public static final void c(ziu ziuVar, lee1 lee1Var, yf yfVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        m4c m4cVar = fkj0.X;
        diu diuVar = ziuVar.f;
        ciu ciuVar = diuVar.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1123500379);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ziuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lee1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(yfVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 57344;
            boolean z2 = i3 == 16384;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new bb30(iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0P = d9p1.p((Function0) objT, x340Var, 0);
            boolean z3 = i3 == 16384;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new y720(iu30Var, (byte) 29);
                x340Var.s0(objT2);
            }
            Function0 function0P2 = d9p1.p((Function0) objT2, x340Var, 0);
            String str = diuVar.c.b;
            if (str == null || ihc1.y0(str)) {
                x340Var.i0(-479827780);
                boolean zB = ciuVar.b.b();
                boolean zG = x340Var.g(function0P);
                Object objT3 = x340Var.T();
                if (zG || objT3 == m4cVar) {
                    objT3 = new zg20(function0P, (byte) 1);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarX = bin.x(qim0Var, zB, null, null, null, (Function0) objT3, 14);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                d(lee1Var, uyn1.x(qim0VarX, 16.0f), x340Var, (i2 >> 3) & 14);
                x340Var.r(false);
            } else {
                x340Var.i0(-479561366);
                boolean zB2 = ciuVar.b.b();
                boolean zG2 = x340Var.g(function0P2);
                Object objT4 = x340Var.T();
                if (zG2 || objT4 == m4cVar) {
                    objT4 = new zg20(function0P2, (byte) 2);
                    x340Var.s0(objT4);
                }
                qim0 qim0VarX2 = bin.x(qim0Var, zB2, null, null, null, (Function0) objT4, 14);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarX3 = uyn1.x(qim0VarX2, 16.0f);
                boolean zI = x340Var.i(ziuVar);
                Object objT5 = x340Var.T();
                if (zI || objT5 == m4cVar) {
                    objT5 = new u830(ziuVar, (byte) 1);
                    x340Var.s0(objT5);
                }
                qim0 qim0VarB = s161.b(qim0VarX3, false, (iu30) objT5);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int i4 = i2;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                Function0 function0 = null;
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
                wnb0 wnb0Var = new wnb0(1.0f, true);
                Object objT6 = x340Var.T();
                if (objT6 == m4cVar) {
                    objT6 = m830.h;
                    x340Var.s0(objT6);
                }
                g(ziuVar, lee1Var, s161.b(wnb0Var, false, (iu30) objT6), x340Var, i4 & 126);
                String str2 = ciuVar.a;
                String str3 = zyd1.f;
                qim0 qim0VarX4 = j9k1.x(nim0.a, j830.e);
                if (ciuVar.b.b()) {
                    x340Var.i0(-1059576317);
                    boolean zG3 = x340Var.g(function0P);
                    Object objT7 = x340Var.T();
                    if (zG3 || objT7 == m4cVar) {
                        objT7 = new zg20(function0P, (byte) 3);
                        x340Var.s0(objT7);
                    }
                    function0 = (Function0) objT7;
                    z = false;
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(-1059527958);
                    x340Var.r(false);
                }
                cpn1.a(str2, str3, function0, qim0VarX4, yfVar, null, x340Var, (i4 << 6) & 57344, 32);
                x340Var.r(true);
                x340Var.r(z);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 10, i, ziuVar, lee1Var, yfVar, qim0Var, iu30Var);
        }
    }

    public static final void d(lee1 lee1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1048421425);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(lee1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131954910);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new kq00(strO0, (byte) 21);
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            uwo1.e(strO0, null, lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, (i2 << 6) & 896, 0, 2042);
            dnx dnxVar = dnx.c;
            jsl jslVar = new jsl(strO0);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(dnxVar, jslVar, u291.r(nim0.a, 16.0f), 0L, 0L, false, x340Var, dnx.d, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(lee1Var, qim0Var, i, (byte) 11);
        }
    }

    public static final void e(vhd0 vhd0Var, boolean z, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1265653612);
        byte b2 = 2;
        int i2 = (x340Var.i(vhd0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = x340Var.i(vhd0Var) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new cb8(vhd0Var, z, (byte) 1);
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI2 = x340Var.i(vhd0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                qka qkaVar = new qka(1, vhd0Var, vhd0.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 0);
                x340Var.s0(qkaVar);
                objT2 = qkaVar;
            }
            yhm1.a(boolValueOf, iu30Var, (iu30) objT2, x340Var, (i2 >> 3) & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2(vhd0Var, z, i, b2);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1216519814);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131961206);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new sc21(strO0, (byte) 1);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarB, 0.0f, 12.0f, 80.0f, 12.0f, 1);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF2 = dug.f(qim0Var2, cbx.a(x340Var).a.a.a(), er31.b(18.0f));
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF2, 16.0f, 12.0f);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            yto1.e(1, 48, 1, x340Var, null);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 16);
        }
    }

    public static final void g(ziu ziuVar, lee1 lee1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(394756144);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(ziuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(lee1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            gfh0 gfh0VarC = t1c.c(een.g, false);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0 qim0VarK = d9y0.k(nim0.a, 0.0f);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = m830.i;
                x340Var2.s0(objT);
            }
            int i3 = (i2 << 3) & 896;
            uwo1.e("", s161.a(qim0VarK, (iu30) objT), lee1Var, 0L, null, null, 0, false, new cjc0(2), 2, null, x340Var2, i3 | 805306374, 0, 1272);
            String str = ziuVar.f.c.b;
            if (str == null) {
                str = "";
            }
            uwo1.e(str, null, lee1Var, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var2, i3, 0, 1722);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(ziuVar, lee1Var, qim0Var, i, (byte) 9);
        }
    }

    public static dys h(r6h1 r6h1Var) {
        return new dys(r6h1Var);
    }

    public static dck1 i(Application application) {
        dck1 dck1Var = dck1.c;
        if (dck1Var != null) {
            return dck1Var;
        }
        dck1 dck1Var2 = new dck1(application);
        dck1.c = dck1Var2;
        return dck1Var2;
    }

    public static PlaylistRequestDecorationPolicy j() {
        return (PlaylistRequestDecorationPolicy) xqs.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(jc9 jc9Var, String str, onm onmVar) {
        pm80 pm80Var;
        List m231Var;
        if (onmVar instanceof pm80) {
            pm80Var = (pm80) onmVar;
            int i = pm80Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pm80Var.b = i - Integer.MIN_VALUE;
            } else {
                pm80Var = new pm80(onmVar);
            }
        } else {
            pm80Var = new pm80(onmVar);
        }
        Object objN = pm80Var.a;
        int i2 = pm80Var.b;
        try {
            if (i2 == 0) {
                hm5.M(objN);
                pm80Var.b = 1;
                objN = jc9Var.n(str, pm80Var);
                Object obj = d9n.a;
                if (objN == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objN);
            }
            m231Var = (List) objN;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new wm80(m231Var) : vm80.a;
    }

    public static final String l(Throwable th) {
        return f4i1.f(th.getClass().getName(), ": ", th.getMessage());
    }

    public static final c560 m(kai1 kai1Var) {
        if (kai1Var instanceof iai1) {
            iai1 iai1Var = (iai1) kai1Var;
            k560 k560Var = iai1Var.a;
            z9i1 z9i1Var = iai1Var.b;
            String str = z9i1Var.a;
            String str2 = z9i1Var.b;
            boolean z = z9i1Var.c;
            return new a560(k560Var, new me20(str, str2, z9i1Var.d, z9i1Var.e, z9i1Var.g, z, z9i1Var.f));
        }
        if (!(kai1Var instanceof jai1)) {
            eg.o();
            return null;
        }
        jai1 jai1Var = (jai1) kai1Var;
        l560 l560Var = jai1Var.a;
        z9i1 z9i1Var2 = jai1Var.b;
        String str3 = z9i1Var2.a;
        String str4 = z9i1Var2.b;
        boolean z2 = z9i1Var2.c;
        return new b560(l560Var, new me20(str3, str4, z9i1Var2.d, z9i1Var2.e, z9i1Var2.g, z2, z9i1Var2.f));
    }

    public static final Signal n(ayc0 ayc0Var, boolean z) {
        xk81 xk81VarN = Signal.n();
        xk81VarN.r(ayc0Var.a);
        phc phcVar = ayc0Var.b;
        if (phcVar != null) {
            xk81VarN.t(phcVar);
        }
        phc phcVar2 = ayc0Var.c;
        if (phcVar2 != null) {
            xk81VarN.n(phcVar2);
        }
        xk81VarN.q(ayc0Var.d || z);
        String str = ayc0Var.e;
        if (str != null) {
            xk81VarN.s(str);
        }
        return xk81VarN.build();
    }

    public static final ArrayList o(List list, boolean z) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(n((ayc0) it.next(), z));
        }
        return arrayList;
    }

    public static String p(Throwable th) {
        String strI = j2h1.I(th);
        if (strI.length() > 2500) {
            strI = strI.substring(0, 2499);
        }
        return strI.replace('\t', ' ').replace('\n', ' ');
    }
}
