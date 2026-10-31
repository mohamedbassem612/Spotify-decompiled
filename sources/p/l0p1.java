package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l0p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(final af5 af5Var, qim0 qim0Var, final lee1 lee1Var, boolean z, int i, int i2, iu30 iu30Var, final iu30 iu30Var2, b0k b0kVar, final int i3, final int i4) {
        qim0 qim0Var2;
        int i5;
        b0k b0kVar2;
        final int i6;
        final int i7;
        final iu30 iu30Var3;
        final qim0 qim0Var3;
        final boolean z2;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-246609449);
        int i8 = i3 | (b0kVar3.g(af5Var) ? 4 : 2);
        int i9 = i4 & 2;
        if (i9 != 0) {
            i5 = i8 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i5 = i8 | (b0kVar3.g(qim0Var2) ? 32 : 16);
        }
        int i10 = i5 | (b0kVar3.g(lee1Var) ? 256 : 128) | 1797120 | (b0kVar3.i(iu30Var2) ? 8388608 : 4194304);
        byte b2 = 1;
        if (b0kVar3.Y(i10 & 1, (4793491 & i10) != 4793490)) {
            qim0 qim0Var4 = nim0.a;
            if (i9 != 0) {
                qim0Var2 = qim0Var4;
            }
            Object objT = b0kVar3.T();
            if (objT == obj) {
                objT = new u1c((byte) 6);
                b0kVar3.s0(objT);
            }
            iu30 iu30Var4 = (iu30) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = v8r.q((Object) null);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean z3 = (29360128 & i10) == 8388608;
            Object objT3 = b0kVar3.T();
            if (z3 || objT3 == obj) {
                objT3 = new nrf(ven0Var, iu30Var2, b2);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarThen = qim0Var2.then(f8d1.b(qim0Var4, iu30Var2, (PointerInputEventHandler) objT3));
            Object objT4 = b0kVar3.T();
            if (objT4 == obj) {
                objT4 = new shg(ven0Var, iu30Var4, (byte) 0);
                b0kVar3.s0(objT4);
            }
            b0kVar2 = b0kVar3;
            jch0.b(af5Var, qim0VarThen, lee1Var, (iu30) objT4, 1, true, Integer.MAX_VALUE, 0, (Map) null, (x9h) null, (m0e1) null, b0kVar2, (58254 & i10) | 1769472, 1920);
            iu30Var3 = iu30Var4;
            qim0Var3 = qim0Var2;
            i6 = 1;
            z2 = true;
            i7 = Integer.MAX_VALUE;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            i6 = i;
            i7 = i2;
            iu30Var3 = iu30Var;
            qim0Var3 = qim0Var2;
            z2 = z;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30(af5Var, qim0Var3, lee1Var, z2, i6, i7, iu30Var3, iu30Var2, i3, i4) { // from class: p.thg
                public final /* synthetic */ af5 a;
                public final /* synthetic */ qim0 b;
                public final /* synthetic */ lee1 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ int f;
                public final /* synthetic */ iu30 g;
                public final /* synthetic */ iu30 h;
                public final /* synthetic */ byte i;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.i = i4;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = czo1.p(1);
                    af5 af5Var2 = this.a;
                    qim0 qim0Var5 = this.b;
                    lee1 lee1Var2 = this.c;
                    boolean z4 = this.d;
                    boolean z5 = this.e;
                    int i11 = this.f;
                    iu30 iu30Var5 = this.g;
                    iu30 iu30Var6 = this.h;
                    byte b3 = this.i;
                    l0p1.a(af5Var2, qim0Var5, lee1Var2, z4, z5 ? 1 : 0, i11, iu30Var5, iu30Var6, (b0k) obj2, iP, b3);
                    return rih1.a;
                }
            };
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(int i, String str, String str2, String str3, boolean z, boolean z2, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(380097658);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.e(l1d.C(i)) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536) | (x340Var.i(iu30Var) ? 1048576 : 524288) | 12582912;
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarY = uyn1.y(dug.f(i1p1.q(qim0VarF, er31.d(0.0f, 0.0f, 16.0f, 16.0f, 3)), cbx.a(x340Var).a.a.a(), d4o1.a), cbx.b(x340Var).e.b, cbx.b(x340Var).e.c);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 0.5f, true);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(wnb0VarQ, 0.0f, 0.0f, 12.0f, 0.0f, 11);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (i == 2 || z) {
                x340Var.i0(1991021224);
                c(i == 2, z, x340Var, (i3 >> 9) & 112);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x0d.s(qim0Var3, 2.0f, x340Var, false);
            } else {
                x340Var.i0(1991199970);
                x340Var.r(false);
            }
            uwo1.e(cwl1.n0(2131957468, new Object[]{str}, x340Var), null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 2.0f));
            int i4 = i3 & 14;
            int i5 = i3 >> 3;
            e(i, (i5 & 896) | (i5 & 112) | i4, str2, str3, x340Var);
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(ydh.g(2.0f, 2131957467, x340Var, x340Var, qim0Var3), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            int i6 = i3 >> 12;
            qim0Var2 = qim0Var3;
            d(i, z2, iu30Var, null, x340Var, i4 | (i6 & 112) | (i6 & 896));
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ez40(i, str, str2, str3, z, z2, iu30Var, qim0Var2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        byte b2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-482942057);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            if (z) {
                x340Var.i0(-1375804425);
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).c.d;
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarF = dug.f(nim0Var, j, er31.b(2.0f));
                cvx cvxVar = cbx.b(x340Var).b;
                z3 = false;
                uwo1.e(cwl1.o0(x340Var, 2131957462).toUpperCase(Locale.ROOT), uyn1.z(4.0f, 0.0f, 2, qim0VarF), cbx.d(x340Var).n, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                cvx cvxVar2 = cbx.b(x340Var).b;
                ab80.p(nim0Var, 4.0f, x340Var, false);
            } else {
                z3 = false;
                x340Var.i0(-1375258577);
                x340Var.r(false);
            }
            if (z2) {
                x340Var.i0(-1375226740);
                String strO0 = cwl1.o0(x340Var, 2131957466);
                uwr uwrVar2 = cbx.a;
                vbe.s(strO0, (qim0) null, cbx.a(x340Var).b.c, 0L, cbx.d(x340Var).k, false, x340Var, 196608, 10);
                x340Var.r(z3);
            } else {
                x340Var.i0(-1374977841);
                x340Var.r(z3);
            }
            x340Var.r(true);
            b2 = z3;
        } else {
            b2 = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xid0(z, z2, i, b2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(int i, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        x340 x340Var;
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(847962832);
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if (x340Var2.Y(i4 & 1, (i4 & 1171) != 1170)) {
            int iC = l1d.C(i);
            z50 z50Var = z50.c;
            qim0 qim0Var4 = nim0.a;
            if (iC == 0) {
                qim0Var3 = qim0Var4;
                x340Var2.i0(-1336675698);
                jdx jdxVar = jdx.c;
                gdx gdxVarS = yla.s(x340Var2);
                z2 = (i4 & 896) == 256;
                Object objT = x340Var2.T();
                if (z2 || objT == m4cVar) {
                    objT = new sya0(iu30Var, (byte) 27);
                    x340Var2.s0(objT);
                }
                foo1.c(new gbx(z50Var, (Function0) objT), jdxVar, qim0Var3, null, gdxVarS, null, null, null, null, null, cwi.a, x340Var2, (i4 >> 3) & 896, 48, 2008);
                x340Var = x340Var2;
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var2.i0(-1336138747);
                idx idxVar = new idx(4);
                gdx gdxVarS2 = yla.s(x340Var2);
                z2 = (i4 & 896) == 256;
                Object objT2 = x340Var2.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new sya0(iu30Var, (byte) 28);
                    x340Var2.s0(objT2);
                }
                qim0Var3 = qim0Var4;
                foo1.c(new gbx(z50Var, (Function0) objT2), idxVar, qim0Var3, null, gdxVarS2, null, null, null, null, null, apo.r(1854230256, new k750((byte) 5, z), x340Var2), x340Var2, (i4 >> 3) & 896, 48, 2008);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var2, -1151497243, false);
                }
                x340Var2.i0(-1335026436);
                qim0 qim0VarK = d9y0.k(qim0Var4, 0.3f);
                jdx jdxVar2 = jdx.c;
                gdx gdxVarS3 = yla.s(x340Var2);
                z2 = (i4 & 896) == 256;
                Object objT3 = x340Var2.T();
                if (z2 || objT3 == m4cVar) {
                    objT3 = new sya0(iu30Var, (byte) 29);
                    x340Var2.s0(objT3);
                }
                foo1.c(new gbx(z50Var, (Function0) objT3), jdxVar2, qim0VarK, null, gdxVarS3, null, null, null, null, null, cwi.b, x340Var2, 0, 48, 2008);
                x340Var = x340Var2;
                x340Var.r(false);
                qim0Var3 = qim0Var4;
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cc40(i, z, iu30Var, qim0Var2, i2);
        }
    }

    public static final void e(int i, int i2, String str, String str2, b0k b0kVar) {
        int i3;
        String str3;
        b0k b0kVar2;
        String strN0;
        int i4;
        int i5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-999741398);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str3 = str;
            i3 |= b0kVar3.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            int iC = l1d.C(i);
            if (iC != 0) {
                if (iC == 1) {
                    i4 = 1321202123;
                    i5 = 2131957458;
                } else {
                    if (iC != 2) {
                        throw p3d1.k(b0kVar3, 1321195024, false);
                    }
                    i4 = 1321205122;
                    i5 = 2131957461;
                }
                strN0 = x0d.k(b0kVar3, i4, i5, b0kVar3, false);
            } else {
                b0kVar3.i0(1321196729);
                strN0 = cwl1.n0(2131957459, new Object[]{str, str2}, b0kVar3);
                b0kVar3.r(false);
            }
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(strN0, null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.a, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(i, str3, str2, i2, (byte) 9);
        }
    }

    public static final l10 f(zmt0 zmt0Var, n1x n1xVar, nnt0 nnt0Var) {
        zz zzVar;
        if (zmt0Var instanceof vmt0) {
            return new qy(gho1.r(n1xVar), wgo1.w(n1xVar));
        }
        if (!(zmt0Var instanceof umt0)) {
            if (zmt0Var instanceof ymt0) {
                return new wy(gho1.r(n1xVar));
            }
            if (zmt0Var instanceof wmt0) {
                return new wy(gho1.r(n1xVar));
            }
            if (zmt0Var instanceof xmt0) {
                return new z00(wgo1.x(n1xVar), gho1.r(n1xVar), ((xmt0) zmt0Var).a);
            }
            eg.o();
            return null;
        }
        dm5 dm5Var = nnt0Var.e;
        if (!(dm5Var instanceof ydo) && dm5Var != null) {
            if (dm5Var instanceof vdo) {
                return new qy(gho1.r(n1xVar), wgo1.w(n1xVar));
            }
            eg.o();
            return null;
        }
        eln0 eln0VarR = gho1.r(n1xVar);
        List listW = wgo1.w(n1xVar);
        if (nnt0Var.f) {
            zzVar = zz.a;
        } else {
            zzVar = nnt0Var.g ? b00.a : a00.a;
        }
        return new d00(eln0VarR, listW, zzVar);
    }

    public static h72 g(vh00 vh00Var, wh00 wh00Var, q7r0 q7r0Var, rih1 rih1Var) {
        vh00Var.getClass();
        rih1Var.getClass();
        return new h72(vh00Var, wh00Var, q7r0Var);
    }

    public static y3j1 h(ehy0 ehy0Var) {
        return ehy0Var.b.size() == 0 ? y3j1.b : new y3j1(ehy0Var.b);
    }

    public static final Observable i(String str, uu00 uu00Var) {
        return ((zu00) uu00Var).b(new oi("playback_notification", false, new ry40(str, (byte) 13))).takeUntil(xj20.f).map(new yjp1(str, (byte) 10)).onErrorReturnItem(new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31)).distinctUntilChanged();
    }

    public static String j(p371 p371Var, String str) {
        mmr0 mmr0Var;
        if (p371Var instanceof a6j0) {
            a6j0 a6j0Var = (a6j0) p371Var;
            mmr0Var = new mmr0(a6j0Var.b, a6j0Var.c);
        } else if (p371Var instanceof pz70) {
            pz70 pz70Var = (pz70) p371Var;
            mmr0Var = new mmr0(pz70Var.f, pz70Var.g);
        } else {
            mmr0Var = new mmr0((Object) null, (Object) null);
        }
        String str2 = (String) mmr0Var.a;
        String str3 = (String) mmr0Var.b;
        if (str2 != null && str3 != null) {
            return cy30.p(str2, "\n", str, "\n", str3);
        }
        if (str2 != null) {
            return f4i1.f(str2, "\n", str);
        }
        return str3 != null ? f4i1.f(str, "\n", str3) : str;
    }

    public static final yn60 k(Context context, List list) {
        Object next;
        Object next2;
        Object next3;
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((c3f1) next).d);
        c3f1 c3f1Var = (c3f1) next;
        if (c3f1Var != null) {
            return new xn60(p(c3f1Var, context), (vn60) null);
        }
        Iterator it2 = list2.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            Iterator it3 = ((c3f1) next2).f.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!((c3f1) next3).d);
        } while (next3 == null);
        c3f1 c3f1Var2 = (c3f1) next2;
        if (c3f1Var2 == null) {
            return wn60.a;
        }
        for (c3f1 c3f1Var3 : c3f1Var2.f) {
            if (c3f1Var3.d) {
                String str = c3f1Var3.a;
                un60 un60VarP = p(c3f1Var2, context);
                ListIterator listIterator = un60VarP.d.listIterator(0);
                while (listIterator.hasNext()) {
                    vn60 vn60Var = (vn60) listIterator.next();
                    if (u890.j(vn60Var.b, str)) {
                        return new xn60(un60VarP, vn60Var);
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }

    public static final String l(apd apdVar) {
        j80 j80Var = apdVar.d;
        if (j80Var instanceof j80) {
            j80 j80Var2 = j80Var;
            String str = j80Var2.b;
            return str == null ? j80Var2.a : str;
        }
        if (j80Var instanceof i80) {
            return ((i80) j80Var).a;
        }
        if (j80Var instanceof k80) {
            return ((k80) j80Var).a;
        }
        if (j80Var instanceof m80) {
            return ((m80) j80Var).a;
        }
        if (j80Var instanceof g80) {
            return ((g80) j80Var).a.getUri();
        }
        if (!j80Var.equals(l80.a) && !j80Var.equals(o80.a)) {
            eg.o();
        }
        return null;
    }

    public static final go80 m(klm klmVar, wbp0 wbp0Var, wbp0 wbp0Var2, wbp0 wbp0Var3, wbp0 wbp0Var4, wbp0 wbp0Var5) {
        return klmVar.a("NavigationCommandListenerDaemon", new kbp0(wbp0Var, wbp0Var2, wbp0Var3, wbp0Var4, wbp0Var5, (byte) 6));
    }

    public static final ia00 n(maa maaVar, l0x0 l0x0Var) {
        return n3o1.q(maaVar).a(h40.e1, new i6a(l0x0Var, (byte) 4));
    }

    public static final boolean o(String str, List list) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (u890.j(((c3f1) it.next()).a, str)) {
                    return true;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            r7h.W(((c3f1) it2.next()).f, arrayList);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (u890.j(((c3f1) it3.next()).a, str)) {
                return true;
            }
        }
        return false;
    }

    public static final un60 p(c3f1 c3f1Var, Context context) {
        String string;
        String string2;
        String str = c3f1Var.a;
        e3f1 e3f1Var = c3f1Var.b;
        if (e3f1Var instanceof e3f1) {
            string = e3f1Var.d;
        } else {
            if (!(e3f1Var instanceof d3f1)) {
                eg.o();
                return null;
            }
            string = context.getString(((d3f1) e3f1Var).d);
        }
        String str2 = string;
        String str3 = c3f1Var.e;
        List<c3f1> list = c3f1Var.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (c3f1 c3f1Var2 : list) {
            String str4 = c3f1Var2.a;
            e3f1 e3f1Var2 = c3f1Var2.b;
            if (e3f1Var2 instanceof e3f1) {
                string2 = e3f1Var2.d;
            } else {
                if (!(e3f1Var2 instanceof d3f1)) {
                    eg.o();
                    return null;
                }
                string2 = context.getString(((d3f1) e3f1Var2).d);
            }
            arrayList.add(new vn60(str4, string2, c3f1Var2.e));
        }
        c9 c9VarF = mqo1.F(arrayList);
        boolean z = c3f1Var.g;
        int iOrdinal = c3f1Var.h.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i = 3;
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    i = 4;
                }
            } else {
                i = 2;
            }
        }
        String str5 = c3f1Var.i;
        a3f1 a3f1Var = c3f1Var.j;
        return new un60(str, str2, c9VarF, str3, z, i, str5, a3f1Var != null ? new on60(a3f1Var.a, a3f1Var.b) : null);
    }

    public static final Bundle q(brj0 brj0Var) {
        return mno1.h(new mmr0[]{new mmr0("mic_permission_page_consumer", brj0Var.name())});
    }

    public static i89 r(String str) {
        Integer numC0;
        Integer numC1;
        Integer numC2;
        if (!nhc1.Y(str, "av01", true)) {
            return null;
        }
        List listQ0 = ihc1.Q0(str, new String[]{"."}, 0, 6);
        if (listQ0.size() < 4 || (numC0 = nhc1.c0((String) listQ0.get(1))) == null) {
            return null;
        }
        int iIntValue = numC0.intValue();
        String str2 = (String) listQ0.get(2);
        if (str2.length() < 2 || (numC1 = nhc1.c0(ihc1.m0(1, str2))) == null) {
            return null;
        }
        int iIntValue2 = numC1.intValue();
        char cZ0 = ihc1.z0(str2);
        if ((cZ0 == 'M' || cZ0 == 'H') && (numC2 = nhc1.c0((String) listQ0.get(3))) != null) {
            return new i89(iIntValue, iIntValue2, cZ0, numC2.intValue());
        }
        return null;
    }

    public static final String s(jo70 jo70Var, ktl ktlVar, boolean z) {
        String str;
        List list = jo70Var.d;
        io70 io70Var = jo70Var.e;
        if (z) {
            str = io70Var != null ? io70Var.a : null;
            return str == null ? "" : str;
        }
        if (ktlVar == ktl.b) {
            if (!list.isEmpty()) {
                return o7h.y0(list, ", ", (String) null, (String) null, hh60.c1, 30);
            }
            str = io70Var != null ? io70Var.a : null;
            return str == null ? "" : str;
        }
        if (ktlVar != ktl.c) {
            return "";
        }
        str = io70Var != null ? io70Var.a : null;
        return str == null ? "" : str;
    }

    public static final Rect t(ur80 ur80Var) {
        return new Rect(ur80Var.a, ur80Var.b, ur80Var.c, ur80Var.d);
    }

    public static final Rect u(n511 n511Var) {
        return new Rect((int) n511Var.a, (int) n511Var.b, (int) n511Var.c, (int) n511Var.d);
    }

    public static final RectF v(n511 n511Var) {
        return new RectF(n511Var.a, n511Var.b, n511Var.c, n511Var.d);
    }

    public static final n511 w(Rect rect) {
        return new n511(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final n511 x(RectF rectF) {
        return new n511(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final int y(int i) {
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return 3;
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 7;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                eg.o();
                return 0;
        }
    }

    public static final int z(zqd1 zqd1Var) {
        switch (zqd1Var.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return 3;
            case 1:
                return 6;
            case 2:
                return 7;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            case 6:
                return 2;
            default:
                eg.o();
                return 0;
        }
    }
}
