package p;

import android.content.Context;
import android.text.Spanned;
import com.spotify.identity.proto.v3.Identity;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class z1a1 implements q2a1 {
    public static final jc10 a = new jc10(Boolean.TRUE);
    public static b180 b;

    public static final void a(int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1901930026);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var2 = nim0.a;
            qim0Var = qim0Var2;
            k5p1.d(uyn1.B(qim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), (c36) null, (g36) null, (pl3) null, 0, 0, apo.r(-1452706545, new e6j(c380Var, iu30Var, (byte) 9), x340Var), x340Var, 1572864, 62);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ate((byte) 2, i, iu30Var, c380Var, qim0Var3);
        }
    }

    public static final yat b(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        lic0 lic0VarA = aa30.a(f);
        if (lic0VarA == null) {
            lic0VarA = new lic0(f);
        }
        return new yat(f2, f, lic0VarA);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1 A[PHI: r7
      0x00a1: PHI (r7v20 p.qim0) = (r7v4 p.qim0), (r7v2 p.qim0) binds: [B:62:0x00a9, B:57:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0118  */
    /* JADX WARN: Code duplicated, block: B:72:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0169 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:93:0x018a  */
    /* JADX WARN: Code duplicated, block: B:95:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x019a  */
    public static final void c(int i, float f, qim0 qim0Var, boolean z, float f2, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        float f3;
        boolean z2;
        qim0 qim0Var3;
        float f4;
        h311 h311VarV;
        int i5;
        qim0 qim0Var4;
        qim0 qim0Var5;
        cr31 cr31VarB;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int iC;
        pkx pkxVar;
        int i6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1589768287);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.d(f) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 384) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if (x340Var.h(z)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    f3 = f2;
                    int i8 = x340Var.d(f3) ? 16384 : 8192;
                    i4 |= i8;
                } else {
                    f3 = f2;
                }
                i4 |= i8;
            } else {
                f3 = f2;
            }
            if ((i4 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i4 & 1, z2)) {
                x340Var.d0();
                i5 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i5 != 0 || x340Var.E()) {
                    if (i7 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        f4 = 48.0f;
                        qim0Var5 = qim0Var2;
                    }
                    x340Var.s();
                    if (z) {
                        x340Var.i0(1241041388);
                        x340Var.r(false);
                        cr31VarB = er31.a;
                    } else {
                        x340Var.i0(1241041980);
                        uwr uwrVar2 = cbx.a;
                        cua cuaVar = cbx.b(x340Var).f;
                        cr31VarB = er31.b(2.0f);
                        x340Var.r(false);
                    }
                    qim0 qim0VarQ = i1p1.q(u291.r(qim0Var5, f), cr31VarB);
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var).a.b.a(), d4o1.a);
                    gfh0VarC = t1c.c(een.h, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarF);
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
                    iC = l1d.C(i);
                    if (iC != 0 || iC == 1) {
                        pkxVar = ltx.c;
                    } else if (iC == 2) {
                        pkxVar = nkx.c;
                    } else if (iC == 3) {
                        pkxVar = akx.c;
                    } else if (iC == 4) {
                        pkxVar = mrx.c;
                    } else {
                        if (iC != 5) {
                            eg.o();
                            return;
                        }
                        pkxVar = pkx.c;
                    }
                    w0h1.a(pkxVar, isl.a, u291.r(qim0Var4, f4), cbx.a(x340Var).b.b, 0L, false, x340Var, 56, 48);
                    x340Var.r(true);
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var.b0();
                }
                qim0Var5 = qim0Var2;
                f4 = f3;
                x340Var.s();
                if (z) {
                    x340Var.i0(1241041388);
                    x340Var.r(false);
                    cr31VarB = er31.a;
                } else {
                    x340Var.i0(1241041980);
                    uwr uwrVar4 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var).f;
                    cr31VarB = er31.b(2.0f);
                    x340Var.r(false);
                }
                qim0 qim0VarQ2 = i1p1.q(u291.r(qim0Var5, f), cr31VarB);
                uwr uwrVar5 = cbx.a;
                qim0 qim0VarF2 = dug.f(qim0VarQ2, cbx.a(x340Var).a.b.a(), d4o1.a);
                gfh0VarC = t1c.c(een.h, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF2);
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
                iC = l1d.C(i);
                if (iC != 0) {
                    pkxVar = ltx.c;
                } else {
                    pkxVar = ltx.c;
                }
                w0h1.a(pkxVar, isl.a, u291.r(qim0Var4, f4), cbx.a(x340Var).b.b, 0L, false, x340Var, 56, 48);
                x340Var.r(true);
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                f4 = f3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new iny(i, f, qim0Var3, z, f4, i2, i3);
            }
        }
        i4 |= 384;
        qim0Var2 = qim0Var;
        if ((i2 & 3072) == 0) {
            if (x340Var.h(z)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                f3 = f2;
                if (x340Var.d(f3)) {
                }
                i4 |= i8;
            } else {
                f3 = f2;
            }
            i4 |= i8;
        } else {
            f3 = f2;
        }
        if ((i4 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i4 & 1, z2)) {
            x340Var.d0();
            i5 = i2 & 1;
            qim0Var4 = nim0.a;
            if (i5 != 0) {
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar6 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    f4 = 48.0f;
                    qim0Var5 = qim0Var2;
                } else {
                    qim0Var5 = qim0Var2;
                    f4 = f3;
                }
            } else {
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar7 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    f4 = 48.0f;
                    qim0Var5 = qim0Var2;
                } else {
                    qim0Var5 = qim0Var2;
                    f4 = f3;
                }
            }
            x340Var.s();
            if (z) {
                x340Var.i0(1241041388);
                x340Var.r(false);
                cr31VarB = er31.a;
            } else {
                x340Var.i0(1241041980);
                uwr uwrVar8 = cbx.a;
                cua cuaVar3 = cbx.b(x340Var).f;
                cr31VarB = er31.b(2.0f);
                x340Var.r(false);
            }
            qim0 qim0VarQ3 = i1p1.q(u291.r(qim0Var5, f), cr31VarB);
            uwr uwrVar9 = cbx.a;
            qim0 qim0VarF3 = dug.f(qim0VarQ3, cbx.a(x340Var).a.b.a(), d4o1.a);
            gfh0VarC = t1c.c(een.h, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF3);
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
            iC = l1d.C(i);
            if (iC != 0) {
                pkxVar = ltx.c;
            } else {
                pkxVar = ltx.c;
            }
            w0h1.a(pkxVar, isl.a, u291.r(qim0Var4, f4), cbx.a(x340Var).b.b, 0L, false, x340Var, 56, 48);
            x340Var.r(true);
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            f4 = f3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iny(i, f, qim0Var3, z, f4, i2, i3);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(896685100);
        if (b0kVar3.Y(i & 1, i != 0)) {
            b0kVar3.i0(-1574043369);
            kiv kivVar = t4k.h;
            wat watVar = (wat) b0kVar3.k(kivVar);
            uwr uwrVar = cbx.a;
            float fY = watVar.y(cbx.d(b0kVar3).g.a.b);
            b0kVar3.r(false);
            b0kVar3.i0(-1574040202);
            float fY2 = ((wat) b0kVar3.k(kivVar)).y(cbx.d(b0kVar3).j.a.b);
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(nim0.a, 1.0f), new uvx(0, null, 0, null, null, null, null, 2, null, 383), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, a3j.a, (xu30) null, apo.r(-202471068, new yy2((byte) 7, fY2), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(-1604276632, new yy2((byte) 8, fY), b0kVar3), b0kVar2, 805306432, 196656, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 13);
        }
    }

    public static final void e(lq51 lq51Var, b0k b0kVar, int i) {
        x340 x340Var;
        String str = lq51Var.b;
        String str2 = lq51Var.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-265829244);
        int i2 = (x340Var2.g(lq51Var) ? 4 : 2) | i;
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            String strY0 = o7h.y0(f46.i0(new String[]{str2, str}), ", ", (String) null, (String) null, (iu30) null, 62);
            if (str != null) {
                x340Var2.i0(600971611);
                str2 = str2 + cwl1.o0(x340Var2, 2131963881) + str;
                x340Var2.r(false);
            } else {
                x340Var2.i0(601073415);
                x340Var2.r(false);
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = u291.b(0.0f, cbx.b(x340Var2).b.d, 1, qim0VarF);
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarB, 16.0f, 8.0f);
            boolean zG = x340Var2.g(strY0);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new bek1(strY0, (byte) 9);
                x340Var2.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarY, (iu30) objT);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            f(lq51Var.c, x340Var2, 0);
            uwo1.e(str2, new wnb0(1.0f, true), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fak1(lq51Var, i, (byte) 15);
        }
    }

    public static final void f(int i, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        int i4 = (kk0.t(-1910512663, i, x340Var) ? 4 : 2) | i2;
        if (x340Var.Y(i4 & 1, (i4 & 3) != 2)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                i3 = 2131233412;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                i3 = 2131233411;
            }
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(i1p1.q(u291.r(nim0Var, 24.0f), er31.a), cbx.a(x340Var).b.a, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            jmr0 jmr0VarN = i3o1.n(i3, x340Var, 0);
            long j = cbx.a(x340Var).a.c;
            zov0 zov0Var2 = cbx.b(x340Var).g;
            pl70.a(jmr0VarN, u291.r(nim0Var, 16.0f), j, x340Var, 56, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zxd1((byte) 6, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public static final void g(float f, float f2, float f3, b0k b0kVar, int i, int i2) {
        float f4;
        int i3;
        boolean z;
        float f5;
        h311 h311VarV;
        float f6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-323157430);
        int i4 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.d(f2) ? 32 : 16);
        if ((i2 & 4) == 0) {
            f4 = f3;
            int i5 = x340Var.d(f4) ? 256 : 128;
            i3 = i4 | i5;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if ((i2 & 4) != 0) {
                        f6 = 0.0f;
                    }
                    x340Var.s();
                    qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var).a.b.a();
                    cua cuaVar = cbx.b(x340Var).f;
                    t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                    f5 = f6;
                } else {
                    x340Var.b0();
                    int i6 = i2 & 4;
                }
                f6 = f4;
                x340Var.s();
                qim0 qim0VarB2 = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
                uwr uwrVar2 = cbx.a;
                long jA2 = cbx.a(x340Var).a.b.a();
                cua cuaVar2 = cbx.b(x340Var).f;
                t1c.a(cwl1.l0(dug.f(qim0VarB2, jA2, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                f5 = f6;
            } else {
                x340Var.b0();
                f5 = f4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ly00(f, f2, f5, i, i2, (byte) 2);
            }
        }
        f4 = f3;
        i3 = i4 | i5;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    f6 = 0.0f;
                } else {
                    f6 = f4;
                }
            } else if ((i2 & 4) != 0) {
                f6 = 0.0f;
            } else {
                f6 = f4;
            }
            x340Var.s();
            qim0 qim0VarB3 = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
            uwr uwrVar3 = cbx.a;
            long jA3 = cbx.a(x340Var).a.b.a();
            cua cuaVar3 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB3, jA3, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
            f5 = f6;
        } else {
            x340Var.b0();
            f5 = f4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ly00(f, f2, f5, i, i2, (byte) 2);
        }
    }

    public static final rcc h(laa laaVar, String str, qe41 qe41Var, Object obj) {
        return new rcc(str, qe41Var, laaVar.getBehavior().c(), true, laaVar.getBehavior().b((Object) null, (dts) null, (String) null), obj);
    }

    public static final LinkedHashSet i(x8v x8vVar, UUID uuid) {
        tr80 tr80VarQ = yoi1.Q(0, x8vVar.d);
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it = tr80VarQ.iterator();
        while (((sr80) it).c) {
            arrayList.add(x8vVar.a[it.nextInt()]);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((w8v) obj).a(uuid)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            byte[] bArr = ((w8v) it2.next()).e;
            if (bArr != null) {
                arrayList3.add(bArr);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            hmy0 hmy0VarU = n3o1.u((byte[]) it3.next());
            UUID[] uuidArr = hmy0VarU != null ? hmy0VarU.d : null;
            if (uuidArr != null) {
                arrayList4.add(uuidArr);
            }
        }
        ArrayList<UUID> arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            r7h.W(f46.Q0((UUID[]) it4.next()), arrayList5);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UUID uuid2 : arrayList5) {
            uuid2.getClass();
            linkedHashSet.add(new rpt0(String.format("%016x%016x", Arrays.copyOf(new Object[]{Long.valueOf(uuid2.getMostSignificantBits()), Long.valueOf(uuid2.getLeastSignificantBits())}, 2))));
        }
        return linkedHashSet;
    }

    public static final boolean k(gdx0 gdx0Var) {
        th4 th4Var = gdx0Var.a;
        return th4Var.d() || th4Var.e() || th4Var.f() || th4Var.s() || th4Var.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(do70 do70Var, s2w s2wVar, onm onmVar) {
        nc41 nc41Var;
        if (onmVar instanceof nc41) {
            nc41Var = (nc41) onmVar;
            int i = nc41Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nc41Var.b = i - Integer.MIN_VALUE;
            } else {
                nc41Var = new nc41(onmVar);
            }
        } else {
            nc41Var = new nc41(onmVar);
        }
        Object objJ = nc41Var.a;
        int i2 = nc41Var.b;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                un70 un70VarO = Identity.SocialHandleRequest.o();
                un70VarO.n(s2wVar.b);
                Identity.SocialHandleRequest socialHandleRequestBuild = un70VarO.build();
                String str = s2wVar.a;
                socialHandleRequestBuild.getClass();
                Single singleA = do70Var.a(str, socialHandleRequestBuild);
                nc41Var.b = 1;
                objJ = fc11.j(singleA, nc41Var);
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
            if (((sy21) objJ).a.Q0) {
                return h3w.a;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return g3w.a;
    }

    public static final boolean m(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static gp41 n(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return gp41.f;
        }
        if (iC == 1) {
            return gp41.e;
        }
        if (iC == 2) {
            return gp41.d;
        }
        if (iC == 3) {
            return gp41.c;
        }
        if (iC == 4) {
            return gp41.g;
        }
        eg.o();
        return null;
    }

    public static final int o(vaa0 vaa0Var) {
        switch (vaa0Var.ordinal()) {
            case 0:
                return 2131958747;
            case 1:
                return 2131958748;
            case 2:
                return 2131958749;
            case 3:
                return 2131958750;
            case 4:
                return 2131958754;
            case 5:
                return 2131958753;
            case 6:
                return 2131958752;
            case 7:
                return 2131958755;
            case 8:
                return 2131958751;
            default:
                eg.o();
                return 0;
        }
    }

    public abstract n511 j();
}
