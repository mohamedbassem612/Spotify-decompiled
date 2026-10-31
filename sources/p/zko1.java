package p;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zko1 {
    public static final ky4 a = new ky4(1022);
    public static b180 b;

    public static final void a(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1974923832);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384 | (b0kVar3.g(str2) ? 2048 : 1024);
        byte b2 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("artist-headline-row", qim0Var3), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            ogx ogxVar = ogx.e;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(4.0f);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarX, (tl3) null, cr31VarB, ogxVar, new zzq0(8.0f, 8.0f, 8.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, apo.r(1144848815, new xo6(str2, str, b2), b0kVar3), b0kVar2, 0, 48, 1506);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hq6(str, function0, qim0Var2, str2, i, (byte) 0);
        }
    }

    public static final void b(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1837014096);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int iW0 = ihc1.w0(str2, str, 0, false, 6);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lee1 lee1Var = cbx.d(x340Var).j;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e("•", uyn1.B(qim0Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 6, 0, 2040);
            x340Var = x340Var;
            if (iW0 == -1) {
                x340Var.i0(-650552640);
                uwo1.e(str2, null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2042);
                x340Var.r(false);
            } else {
                x340Var.i0(-650454339);
                zma1 zma1Var = cbx.d(x340Var).k.a;
                boolean zG = ((i2 & 14) == 4) | ((i2 & 112) == 32) | x340Var.g(zma1Var);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    String strSubstring = str2.substring(0, iW0);
                    String strSubstring2 = str2.substring(str.length() + iW0);
                    ye5 ye5Var = new ye5();
                    ye5Var.g(strSubstring);
                    int iO = ye5Var.o(zma1Var);
                    try {
                        ye5Var.g(str);
                        ye5Var.k(iO);
                        ye5Var.g(strSubstring2);
                        objT = ye5Var.p();
                        x340Var.s0(objT);
                    } catch (Throwable th) {
                        ye5Var.k(iO);
                        throw th;
                    }
                }
                uwo1.f((af5) objT, null, cbx.d(x340Var).j, null, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4090);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 8);
        }
    }

    public static final void c(yxa0 yxa0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(132053729);
        int i2 = (x340Var.i(yxa0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            qim0 qim0VarN = anm1.N("parental_control_done_button", u291.f(nim0.a, 1.0f));
            jw31 jw31VarA = ew31.a(h36.e, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            s110.d(yxa0Var, apo.r(1989835779, new tse0(function0, (byte) 23), x340Var), x340Var, (i2 & 14) | 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p8w(yxa0Var, function0, i);
        }
    }

    public static final void d(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1406955838);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = uyn1.y(qim0Var, cbx.b(x340Var).b.c, cbx.b(x340Var).b.d);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qbh(qim0Var2, j2iVar, i, i2, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(da60 da60Var, float f, qim0 qim0Var, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        float f2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-205781607);
        int i3 = (x340Var.g(da60Var) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16);
        int i4 = i2 & 4;
        int i5 = i4 != 0 ? i3 | 384 : i3 | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0Var3 = qim0Var;
            if (da60Var instanceof x960) {
                x340Var.i0(-1521326296);
                ArrayList<ra60> arrayList = ((x960) da60Var).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (ra60 ra60Var : arrayList) {
                    arrayList2.add(new jf50(ra60Var.a, ra60Var.b));
                }
                k960 k960Var = if50.a;
                if50.b(arrayList2, u291.r(qim0Var3, 0.8333333f * f), x340Var, 0);
                x340Var.r(false);
                f2 = f;
            } else if (da60Var instanceof z960) {
                x340Var.i0(-1520994689);
                k37 k37Var = ((z960) da60Var).a;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                fy81.a(k37Var, f, qim0Var3, 88.0f, x340Var, i5 & 1008, 0);
                qim0Var3 = qim0Var3;
                f2 = f;
                x340Var.r(false);
            } else {
                f2 = f;
                if (da60Var instanceof y960) {
                    x340Var.i0(-1520747991);
                    y960 y960Var = (y960) da60Var;
                    quq0.a(y960Var.a, y960Var.b, f2, qim0Var3, x340Var, (i5 << 3) & 8064);
                    x340Var.r(false);
                } else if (da60Var instanceof ba60) {
                    x340Var.i0(-1520597021);
                    ba60 ba60Var = (ba60) da60Var;
                    gke1.a(ba60Var.a, ba60Var.b, f2, qim0Var3, x340Var, (i5 << 3) & 8064);
                    x340Var.r(false);
                } else if (da60Var instanceof ca60) {
                    x340Var.i0(-1520438270);
                    ca60 ca60Var = (ca60) da60Var;
                    hke1.a(ca60Var.a, ca60Var.b, ca60Var.c, f2, qim0Var3, x340Var, (i5 << 6) & 64512);
                    f2 = f2;
                    qim0Var3 = qim0Var3;
                    x340Var = x340Var;
                    x340Var.r(false);
                } else if (da60Var instanceof aa60) {
                    x340Var.i0(-1520224215);
                    aa60 aa60Var = (aa60) da60Var;
                    b8b1.a(aa60Var.a, aa60Var.b, aa60Var.c, f2, qim0Var3, x340Var, (i5 << 6) & 64512);
                    f2 = f2;
                    qim0Var3 = qim0Var3;
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    if (!(da60Var instanceof w960)) {
                        throw p3d1.k(x340Var, -187623051, false);
                    }
                    x340Var.i0(-1520013539);
                    w960 w960Var = (w960) da60Var;
                    i2u.a(w960Var.a, w960Var.b, w960Var.c, w960Var.d, f2, qim0Var3, x340Var, (i5 << 9) & 516096);
                    f2 = f2;
                    qim0Var3 = qim0Var3;
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            }
            qim0Var2 = qim0Var3;
        } else {
            f2 = f;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k950(da60Var, f2, qim0Var2, i, i2);
        }
    }

    public static final void f(da60 da60Var, qim0 qim0Var, List list, long j, b0k b0kVar, int i, int i2) {
        List list2;
        long j2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1411025022);
        int i3 = (x340Var.g(da60Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? x340Var.g(list) : x340Var.i(list) ? 256 : 128;
        }
        long j3 = j;
        int i5 = i3 | (((i2 & 8) == 0 && x340Var.f(j3)) ? 2048 : 1024);
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if (i4 != 0) {
                    list = z6x.a;
                }
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                    list2 = list;
                    j2 = u7h.k;
                }
                x340Var.s();
                w2g0.c(qim0Var, een.h, apo.r(2141987028, new no9((Object) da60Var, (Object) list2, j2, (byte) 5), x340Var), x340Var, ((i5 >> 3) & 14) | 3072, 4);
                list = list2;
                j3 = j2;
            } else {
                x340Var.b0();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
            }
            list2 = list;
            j2 = j3;
            x340Var.s();
            w2g0.c(qim0Var, een.h, apo.r(2141987028, new no9((Object) da60Var, (Object) list2, j2, (byte) 5), x340Var), x340Var, ((i5 >> 3) & 14) | 3072, 4);
            list = list2;
            j3 = j2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s960(da60Var, qim0Var, list, j3, i, i2);
        }
    }

    public static final void g(hxa0 hxa0Var, xk xkVar, qwr0 qwr0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1362342978);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hxa0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xkVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(qwr0Var) : x340Var.i(qwr0Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new ywr0(hxa0Var.c, new k2g0(iu30Var, (byte) 26));
                x340Var.s0(objT);
            }
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var).g;
            j2i j2iVarR = apo.r(1537296369, new vbn0(hxa0Var, xkVar, es41VarC, (byte) 25), x340Var);
            j2i j2iVarR2 = apo.r(70793655, new jb1((Object) hxa0Var, (Object) es41VarC, objT, (Object) qwr0Var, iu30Var, (byte) 27), x340Var);
            int i5 = ((i4 >> 9) & 14) | 24624;
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, j2iVarR, null, u85Var, j2iVarR2, x340Var, i5, 4);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uwr0(hxa0Var, xkVar, qwr0Var, qim0Var2, iu30Var, i, (byte) 0);
        }
    }

    public static final void h(upb0 upb0Var, String str, Function0 function0, qim0 qim0Var, int i, iu30 iu30Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        upb0 upb0Var2;
        ven0 ven0Var;
        ven0 ven0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-263922873);
        int i3 = i2 | (b0kVar3.g(upb0Var) ? 32 : 16) | (b0kVar3.g(str) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.g(qim0Var) ? 16384 : 8192) | (b0kVar3.e(i == 0 ? -1 : l1d.C(i)) ? 131072 : 65536);
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            wat watVar = (wat) b0kVar3.k(t4k.h);
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar3).h;
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var3 = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var4 = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = p3d1.m(((Number) function0.invoke()).longValue(), b0kVar3);
            }
            ven0 ven0Var5 = (frr0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = yv91.a(new d4v0(upb0Var, u85Var, watVar, (byte) 10));
                b0kVar3.s0(objT5);
            }
            tob1 tob1Var = (tob1) objT5;
            Object objT6 = b0kVar3.T();
            if (objT6 == m4cVar) {
                objT6 = us71.i(0.0f, b0kVar3);
            }
            drr0 drr0Var = (drr0) objT6;
            Object objT7 = b0kVar3.T();
            if (objT7 == m4cVar) {
                objT7 = v8r.q((Object) null);
                b0kVar3.s0(objT7);
            }
            ven0 ven0Var6 = (ven0) objT7;
            Object objT8 = b0kVar3.T();
            if (objT8 == m4cVar) {
                ven0Var = ven0Var3;
                ven0Var2 = ven0Var5;
                qi1 qi1Var = new qi1(function0, c9nVar, ven0Var, ven0Var2, ven0Var6, upb0Var, tob1Var, drr0Var, (byte) 10);
                upb0Var2 = upb0Var;
                bz0 bz0Var = k6v.a;
                objT8 = new xvr(qi1Var);
                b0kVar3.s0(objT8);
            } else {
                upb0Var2 = upb0Var;
                ven0Var = ven0Var3;
                ven0Var2 = ven0Var5;
            }
            r6v r6vVar = (r6v) objT8;
            float fM = dsa0.m(b0kVar3, 2131166888);
            float fX0 = watVar.X0(fM);
            Object objT9 = b0kVar3.T();
            if (objT9 == m4cVar) {
                objT9 = yv91.a(new pxj(upb0Var2, fX0, watVar, tob1Var));
                b0kVar3.s0(objT9);
            }
            tob1 tob1Var2 = (tob1) objT9;
            Object objT10 = b0kVar3.T();
            if (objT10 == m4cVar) {
                objT10 = yv91.a(new g1x0(upb0Var2, ven0Var, (byte) 26));
                b0kVar3.s0(objT10);
            }
            tob1 tob1Var3 = (tob1) objT10;
            Long lValueOf = Long.valueOf(ven0Var2.s());
            Object objT11 = b0kVar3.T();
            if (objT11 == m4cVar) {
                objT11 = new hj6(ven0Var, (lnm) 0, (byte) 20);
                b0kVar3.s0(objT11);
            }
            qxd0.t(lValueOf, b0kVar3, (vu30) objT11);
            bby bbyVarE = xay.e(3, (ni20) r6);
            ln00 ln00VarF = xay.f(3, (ni20) r6);
            boolean zBooleanValue = ((Boolean) tob1Var3.getValue()).booleanValue();
            boolean zD = b0kVar3.d(fM);
            Object objT12 = b0kVar3.T();
            if (zD || objT12 == m4cVar) {
                objT12 = new ja5(fM, (Object) tob1Var, (Object) tob1Var2, (byte) 8);
                b0kVar3.s0(objT12);
            }
            b0kVar2 = b0kVar3;
            fq7.g(zBooleanValue, eqr0.B(qim0Var, (iu30) objT12), bbyVarE, ln00VarF, (String) null, apo.r(-759315425, new tfz0(fM, i, str, r6vVar, iu30Var, ven0Var4), b0kVar3), b0kVar2, 200064, 16);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(upb0Var, str, function0, qim0Var, i, iu30Var, i2);
        }
    }

    public static final void i(kgc1 kgc1Var, Function0 function0, Function0 function1, String str, String str2, String str3, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z;
        boolean z2 = kgc1Var.a;
        egc1 egc1Var = kgc1Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1237766647);
        int i2 = 12582912 | i | (x340Var.g(kgc1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024) | (x340Var.g(str2) ? 16384 : 8192) | (x340Var.g(str3) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            qim0Var2 = nim0.a;
            if (z2 || (egc1Var instanceof egc1)) {
                x340Var.i0(-2011416623);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
                if (z2) {
                    x340Var.i0(1684740016);
                    int i3 = i2 >> 6;
                    eko1.p((i3 & 7168) | ((i2 >> 3) & 14) | (i3 & 112) | (i3 & 896), str, str2, str3, function0, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1684916840);
                    x340Var.r(false);
                }
                if (egc1Var instanceof egc1) {
                    x340Var.i0(1685017683);
                    iko1.p(egc1Var, function1, j2iVar, null, j2iVar2, x340Var, ((i2 >> 3) & 112) | 24960);
                    z = false;
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(1685283880);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(z);
            } else {
                x340Var.i0(-2010701639);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(kgc1Var, function0, function1, str, str2, str3, j2iVar, qim0Var2, j2iVar2, i);
        }
    }

    public static final void j(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(264934704);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            stx stxVar = stx.c;
            String strO0 = cwl1.o0(x340Var, 2131952950);
            String strO1 = cwl1.o0(x340Var, 2131952950);
            qim0Var2 = nim0.a;
            hqn1.h(stxVar, strO0, strO1, function0, anm1.N("artifact-page-upload-button", qim0Var2), 0L, false, false, null, null, x340Var, stx.d | ((i2 << 9) & 7168), 992);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var2, i, (byte) 12);
        }
    }

    public static final String k(boolean z, String str, String str2, String str3, String str4, b0k b0kVar, int i) {
        String strN0;
        String strN1;
        if ((i & 16) != 0) {
            str4 = null;
        }
        if (str4 == null || str4.length() == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1181336489);
            if (z) {
                x340Var.i0(-315201475);
                strN0 = cwl1.n0(2131951807, new Object[]{str, str2}, x340Var);
                x340Var.r(false);
            } else if (str3 != null) {
                x340Var.i0(-315195091);
                strN0 = cwl1.n0(2131951809, new Object[]{str, str2, str3}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-315188415);
                strN0 = cwl1.n0(2131951811, new Object[]{str, str2}, x340Var);
                x340Var.r(false);
            }
            x340Var.r(false);
            return strN0;
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-1182042421);
        if (z) {
            x340Var2.i0(-315224319);
            strN1 = cwl1.n0(2131951808, new Object[]{str, str2, str4}, x340Var2);
            x340Var2.r(false);
        } else if (str3 != null) {
            x340Var2.i0(-315216783);
            strN1 = cwl1.n0(2131951810, new Object[]{str, str2, str4, str3}, x340Var2);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-315208955);
            strN1 = cwl1.n0(2131951812, new Object[]{str, str2, str4}, x340Var2);
            x340Var2.r(false);
        }
        x340Var2.r(false);
        return strN1;
    }

    public static final boolean m(v161 v161Var) {
        o161 o161VarK = v161Var.k();
        return o161VarK.a.c(z161.B);
    }

    public static boolean n(dg30 dg30Var, String str) {
        fso0 fso0VarG = dg30Var.e0().G("NotificationPermissionLauncher");
        if ((fso0VarG instanceof fso0 ? fso0VarG : null) != null) {
            return false;
        }
        th30 th30VarE0 = dg30Var.e0();
        th30VarE0.getClass();
        nu9 nu9Var = new nu9(th30VarE0);
        fso0 fso0Var = new fso0();
        Bundle bundle = new Bundle();
        bundle.putString("request_id", str);
        fso0Var.T0(bundle);
        nu9Var.k(0, fso0Var, "NotificationPermissionLauncher", 1);
        nu9Var.g(true, true);
        return true;
    }

    public static final float o(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        return yoi1.o(f, 0.0f, 1.0f);
    }

    public static final int p(mpb0 mpb0Var, qqq0 qqq0Var) {
        return (int) (qqq0Var == qqq0.a ? mpb0Var.w & 4294967295L : mpb0Var.w >> 32);
    }

    public static Status q(int i) {
        String strW;
        switch (i) {
            case 4000:
                strW = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                strW = "DUPLICATE_LISTENER";
                break;
            case 4002:
                strW = "UNKNOWN_LISTENER";
                break;
            case 4003:
                strW = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                strW = "INVALID_TARGET_NODE";
                break;
            case 4005:
                strW = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                strW = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                strW = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                strW = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                strW = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                strW = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            case 4011:
            default:
                strW = gm50.w(i);
                break;
            case 4012:
                strW = "MIGRATION_NOT_CANCELLABLE";
                break;
            case 4013:
                strW = "NO_MIGRATION_FOUND_TO_CANCEL";
                break;
            case 4014:
                strW = "FEATURE_DISABLED";
                break;
            case 4015:
                strW = "WIFI_CONNECTION_FAILED";
                break;
        }
        return new Status(i, strW, (PendingIntent) null, (lal) null);
    }

    public void l(bx61 bx61Var, float f, float f2) {
        bx61Var.d(f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        bx61Var.c((float) (Math.sin(Math.toRadians(90.0d)) * d * d2), (float) (Math.sin(Math.toRadians(0.0d)) * d * d2));
    }
}
