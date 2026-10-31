package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.LocaleList;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class up30 {
    public static b180 a;
    public static b180 b;

    static {
        new jsg(0.0f, 0.33f);
        new jsg(0.67f, 1.0f);
    }

    public static final void a(i73 i73Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(161797726);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(i73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 32 : 16;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            cua cuaVar = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0Var2, (tl3) null, er31.b(16.0f), mgx.e, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-651620985, new wf((byte) 13, i73Var, iu30Var), b0kVar3), b0kVar2, (i2 >> 3) & 14, 48, 2018);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(i73Var, qim0Var, iu30Var, i, (byte) 12);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static final void b(atb1 atb1Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        float f;
        tl3 tl3Var;
        ksl kslVar;
        List list;
        boolean z2;
        boolean z3;
        xsb1 xsb1Var;
        List list2;
        qim0 qim0Var2;
        h2c h2cVar;
        ?? r3;
        ksl kslVar2;
        List list3;
        tl3 tl3Var2 = een.e;
        gra graVar = een.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1936318145);
        int i2 = i | (x340Var.i(atb1Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z4 = x340Var.k(t4k.n) == flb0.b;
            if (!z || atb1Var.d.size() <= 1) {
                x340Var.i0(-1080889343);
                x340Var.r(false);
                f = 0.0f;
            } else {
                x340Var.i0(852192917);
                int iOrdinal = atb1Var.a.ordinal();
                if (iOrdinal == 5) {
                    x340Var.i0(-1080883167);
                    x340Var.r(false);
                    f = 28.0f;
                } else if (iOrdinal != 6) {
                    x340Var.i0(-1080882495);
                    x340Var.r(false);
                    f = 0.0f;
                } else {
                    x340Var.i0(-1080886262);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    x340Var.r(false);
                    f = 22.0f;
                }
                x340Var.r(false);
            }
            qim0 qim0VarZ = u291.z(uyn1.B(qim0Var, f, 0.0f, 0.0f, 0.0f, 14), (fra) null, 3);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = y5a1.b;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarZ, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.X, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xsb1 xsb1Var2 = atb1Var.a;
            List list4 = atb1Var.d;
            int iOrdinal2 = xsb1Var2.ordinal();
            qim0 qim0Var3 = nim0.a;
            ksl kslVar3 = isl.a;
            h2c h2cVar2 = h2c.a;
            if (iOrdinal2 != 5) {
                if (iOrdinal2 != 6) {
                    x340Var.i0(-1251001315);
                    x340Var.r(false);
                    z2 = true;
                } else {
                    x340Var.i0(-129908903);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar = cbx.b(x340Var).f;
                    hw61 hw61VarB = er31.b(2.0f);
                    if (list4.size() > 1) {
                        x340Var.i0(-129812307);
                        Uri uri = Uri.parse((String) list4.get(1));
                        qim0 qim0VarR = u291.r(eqr0.C(h2cVar2.a(qim0Var3, graVar), -26.0f, -11.0f), 64.0f);
                        boolean zH = x340Var.h(z4);
                        Object objT2 = x340Var.T();
                        if (zH || objT2 == m4cVar) {
                            objT2 = new mj10((byte) 25, z4);
                            x340Var.s0(objT2);
                        }
                        qim0 qim0VarQ = i1p1.q(sto1.o(i541.C(qim0VarR, (iu30) objT2), 12.0f, hw61VarB, false, 0L, 0L, 28), hw61VarB);
                        zov0 zov0Var = cbx.b(x340Var).g;
                        boolean z5 = z4;
                        kslVar2 = kslVar3;
                        r3 = 0;
                        list2 = list4;
                        qim0Var2 = qim0Var3;
                        h2cVar = h2cVar2;
                        hw61VarB = hw61VarB;
                        z3 = z5;
                        xsb1Var = xsb1Var2;
                        eso1.e(uri, kslVar2, qim0VarQ, new p3v(88.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, y3o1.a0(xsb1Var2), false, false, x340Var, 1073766448, 0, 3552);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        z3 = z4;
                        xsb1Var = xsb1Var2;
                        list2 = list4;
                        qim0Var2 = qim0Var3;
                        h2cVar = h2cVar2;
                        r3 = 0;
                        kslVar2 = kslVar3;
                        x340Var.i0(-129221943);
                        x340Var.r(false);
                    }
                    if (list2.size() > 2) {
                        x340Var.i0(-129152162);
                        List list5 = list2;
                        Uri uri2 = Uri.parse((String) list5.get(2));
                        qim0 qim0VarR2 = u291.r(eqr0.D(24.0f, 0.0f, 2, h2cVar.a(qim0Var2, graVar)), 64.0f);
                        boolean z6 = z3;
                        boolean zH2 = x340Var.h(z6);
                        Object objT3 = x340Var.T();
                        if (zH2 || objT3 == m4cVar) {
                            objT3 = new mj10((byte) 26, z6);
                            x340Var.s0(objT3);
                        }
                        qim0 qim0VarQ2 = i1p1.q(sto1.o(i541.C(qim0VarR2, (iu30) objT3), 12.0f, hw61VarB, false, 0L, 0L, 28), hw61VarB);
                        zov0 zov0Var2 = cbx.b(x340Var).g;
                        x340 x340Var2 = x340Var;
                        list3 = list5;
                        eso1.e(uri2, kslVar2, qim0VarQ2, new p3v(88.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, y3o1.a0(xsb1Var), false, false, x340Var2, 1073766448, 0, 3552);
                        x340Var = x340Var2;
                        x340Var.r((boolean) r3);
                    } else {
                        list3 = list2;
                        x340Var.i0(-128578135);
                        x340Var.r((boolean) r3);
                    }
                    String str = (String) o7h.t0((int) r3, list3);
                    Uri uri3 = str != null ? Uri.parse(str) : Uri.EMPTY;
                    uri3.getClass();
                    qim0 qim0VarQ3 = i1p1.q(sto1.o(u291.r(h2cVar.a(qim0Var2, tl3Var2), 88.0f), 12.0f, hw61VarB, false, 0L, 0L, 28), hw61VarB);
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    x340 x340Var3 = x340Var;
                    eso1.e(uri3, kslVar2, qim0VarQ3, new p3v(88.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, y3o1.a0(xsb1Var), false, false, x340Var3, 1073766448, 0, 3552);
                    x340Var = x340Var3;
                    x340Var.r((boolean) r3);
                }
                x340Var.r(z2);
            } else {
                x340Var.i0(-127976146);
                if (list4.size() > 1) {
                    x340Var.i0(-127960429);
                    Uri uri4 = Uri.parse((String) list4.get(1));
                    qim0 qim0VarR3 = u291.r(eqr0.C(h2cVar2.a(qim0Var3, graVar), -50.0f, -19.0f), 50.0f);
                    cr31 cr31Var = er31.a;
                    qim0 qim0VarQ4 = i1p1.q(sto1.o(qim0VarR3, 12.0f, cr31Var, false, 0L, 0L, 28), cr31Var);
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var4 = cbx.b(x340Var).g;
                    kslVar = kslVar3;
                    tl3Var = tl3Var2;
                    eso1.e(uri4, kslVar, qim0VarQ4, new p3v(88.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, y3o1.a0(xsb1Var2), false, false, x340Var, 1073766448, 0, 3552);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    tl3Var = tl3Var2;
                    kslVar = kslVar3;
                    x340Var.i0(-127437335);
                    x340Var.r(false);
                }
                if (
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v14 java.util.List
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1195
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.up30.b(p.atb1, p.qim0, boolean, p.b0k, int):void");
            }

            public static final void c(float f, int i, b0k b0kVar, qim0 qim0Var) {
                float fM;
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1251222538);
                int i2 = i | 22;
                if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                    x340Var.d0();
                    if ((i & 1) == 0 || x340Var.E()) {
                        fM = dsa0.m(x340Var, 2131166195);
                        qim0Var2 = nim0.a;
                    } else {
                        x340Var.b0();
                        fM = f;
                        qim0Var2 = qim0Var;
                    }
                    x340Var.s();
                    db80 db80VarR = t5p1.r("infinite", x340Var, 0);
                    x9a0 x9a0Var = (x9a0) x340Var.k(y9a0.a);
                    cb80 cb80VarG = t5p1.g(db80VarR, 0.0f, 360.0f, irn1.Y(irn1.o0(4000, 0, mlv.d, 2), 1, 0L, 4), "rotation", x340Var, 29112, 0);
                    ceo ceoVar = mlv.a;
                    cb80 cb80VarG2 = t5p1.g(db80VarR, 0.0f, 0.33f, irn1.Y(irn1.o0(1800, 0, ceoVar, 2), 2, 0L, 4), "strokeStart", x340Var, 28680, 0);
                    cb80 cb80VarG3 = t5p1.g(db80VarR, 1.0f, 0.67f, irn1.Y(irn1.o0(1800, 0, ceoVar, 2), 2, 0L, 4), "strokeEnd", x340Var, 28680, 0);
                    qim0 qim0VarX = uyn1.x(u291.d(qim0Var2, 1.0f), fM);
                    boolean zG = x340Var.g(cb80VarG) | x340Var.g(cb80VarG2) | x340Var.g(cb80VarG3) | x340Var.g(x9a0Var);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        ggh gghVar = new ggh(cb80VarG, x9a0Var, cb80VarG2, cb80VarG3, (byte) 15);
                        x340Var.s0(gghVar);
                        objT = gghVar;
                    }
                    j0o1.b(0, x340Var, (iu30) objT, qim0VarX);
                } else {
                    x340Var.b0();
                    fM = f;
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ou(qim0Var2, fM, i, (byte) 2);
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public static final void d(okm0 okm0Var, srt0 srt0Var, int i, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
                int i3;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1680318471);
                if ((i2 & 6) == 0) {
                    i3 = (x340Var.g(okm0Var) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= x340Var.i(srt0Var) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i3 |= x340Var.e(i) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    i3 |= x340Var.i(vu30Var) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    i3 |= x340Var.i(vu30Var2) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    i3 |= x340Var.i(qim0Var) ? 131072 : 65536;
                }
                if (!x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
                    x340Var.b0();
                } else {
                    if (!(okm0Var instanceof nkm0)) {
                        if (!(okm0Var instanceof mkm0)) {
                            throw p3d1.k(x340Var, 121665267, false);
                        }
                        x340Var.i0(-520168036);
                        x340Var.r(false);
                        eg.m("Unable to render MoreLikePlaylistEntity in a List yet.");
                        return;
                    }
                    x340Var.i0(-523268036);
                    uvx uvxVar = new uvx((pgx) null, 5, (tvx) null, new p3v(88.0f), 10);
                    String strO0 = cwl1.o0(x340Var, 2131963624);
                    boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
                    Object objT = x340Var.T();
                    if (z || objT == fkj0.X) {
                        objT = new hkm0(vu30Var, okm0Var, i, (byte) 2);
                        x340Var.s0(objT);
                    }
                    jto1.b(qim0Var, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), (Function0) objT), (gbx) null, (xu30) null, apo.r(1874192410, new tkm0(okm0Var, (byte) 0), x340Var), (xu30) null, apo.r(478782265, new tkm0(okm0Var, (byte) 1), x340Var), apo.r(1773201112, new zo7(vu30Var2, okm0Var, i, (byte) 6), x340Var), (xu30) null, (xu30) null, apo.r(1361490357, new ukm0(srt0Var, okm0Var, (byte) 0), x340Var), x340Var, ((i3 >> 15) & 14) | 805306432, 197040, 26044);
                    x340Var.r(false);
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new bxy((Parcelable) okm0Var, (Object) srt0Var, i, (Object) vu30Var, (cv30) vu30Var2, qim0Var, i2, (byte) 3);
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public static final void e(qkm0 qkm0Var, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-147726124);
                int i2 = i | (x340Var.i(qkm0Var) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(vu30Var2) ? 256 : 128) | 3072;
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    pkm0 pkm0Var = qkm0Var.b;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarN = anm1.N("more-like-list", u291.f(uyn1.z(0.0f, 16.0f, 1, qim0Var3), 1.0f));
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    String str = pkm0Var.a;
                    lee1 lee1Var = cbx.d(x340Var).e;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    uwo1.e(str, uyn1.z(16.0f, 0.0f, 2, qim0Var3), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(qim0Var3, 4.0f));
                    x340Var.i0(-886644480);
                    int i3 = 0;
                    for (Object obj : pkm0Var.b) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        okm0 okm0Var = (okm0) obj;
                        srt0 srt0Var = qkm0Var.a;
                        boolean zE = x340Var.e(i3);
                        Object objT = x340Var.T();
                        if (zE || objT == fkj0.X) {
                            objT = new po60(i3, (byte) 17);
                            x340Var.s0(objT);
                        }
                        d(okm0Var, srt0Var, i3, vu30Var, vu30Var2, s161.b(qim0Var3, false, (iu30) objT), x340Var, (i2 << 6) & 64512);
                        i3 = i4;
                    }
                    x340Var.r(false);
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new w0f0(i, qkm0Var, vu30Var, vu30Var2, qim0Var2, (byte) 25);
                }
            }

            public static final void f(atb1 atb1Var, iu30 iu30Var, qim0 qim0Var, boolean z, Integer num, b0k b0kVar, int i) {
                b0k b0kVar2;
                qim0 qim0Var2;
                String strU;
                m4c m4cVar = fkj0.X;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(1081062377);
                int i2 = i | (b0kVar3.g(atb1Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.g(num) ? 16384 : 8192);
                if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    if (num == null) {
                        b0kVar3.i0(-2030202449);
                        b0kVar3.r(false);
                        strU = null;
                    } else {
                        b0kVar3.i0(-2030202448);
                        int iIntValue = num.intValue();
                        strU = cwl1.U(2131820932, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, b0kVar3);
                        b0kVar3.r(false);
                    }
                    String str = String.format("stats_tile_tag_%s", Arrays.copyOf(new Object[]{atb1Var.a}, 1));
                    String strO0 = cwl1.o0(b0kVar3, 2131962928);
                    boolean z2 = (i2 & 112) == 32;
                    int i3 = i2 & 14;
                    boolean z3 = z2 | (i3 == 4);
                    Object objT = b0kVar3.T();
                    if (z3 || objT == m4cVar) {
                        objT = new l5a1(iu30Var, atb1Var, (byte) 1);
                        b0kVar3.s0(objT);
                    }
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarS = hqn1.s(str, strO0, (Function0) objT, qim0Var3);
                    boolean zG = b0kVar3.g(strU) | (i3 == 4);
                    Object objT2 = b0kVar3.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new iv81(strU, atb1Var, (byte) 13);
                        b0kVar3.s0(objT2);
                    }
                    qim0 qim0VarY = u291.y(s161.a(qim0VarS, (iu30) objT2), een.Z, true);
                    mgx mgxVar = mgx.e;
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(b0kVar3).f;
                    cr31 cr31VarB = er31.b(8.0f);
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    cwl1.b(qim0VarY, (tl3) null, cr31VarB, mgxVar, new zzq0(8.0f, 8.0f, 8.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2019914272, new n8k0(num, atb1Var, z, (byte) 14), b0kVar3), b0kVar2, 0, 48, 2018);
                    qim0Var2 = qim0Var3;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ofi0(atb1Var, iu30Var, qim0Var2, z, num, i);
                }
            }

            public static final void g(qef1 qef1Var, iu30 iu30Var, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(511519535);
                int i2 = i | (x340Var.g(qef1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 24576;
                if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    nyx.a(2, (wux) null, apo.r(1910664444, new bvd1(qef1Var, iu30Var, j2iVar, j2iVar2), x340Var), x340Var, 3078, 6);
                    qim0Var2 = nim0.a;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tte1((byte) 2, i, qef1Var, iu30Var, j2iVar, j2iVar2, qim0Var2);
                }
            }

            public static final void h(int i, String str, b0k b0kVar, qim0 qim0Var) {
                b0k b0kVar2;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(1461486668);
                int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(qim0Var) ? 32 : 16);
                if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
                    uwr uwrVar = cbx.a;
                    long j = ((vex) zex.a.e).m;
                    zov0 zov0Var = cbx.b(b0kVar3).g;
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    wat watVar = (wat) b0kVar3.k(t4k.h);
                    d6t0 d6t0Var = new d6t0(7, watVar.s(16.0f), watVar.s(12.0f));
                    ye5 ye5Var = new ye5();
                    z6p1.s(ye5Var, "taste-profile");
                    ye5Var.g(str);
                    b0kVar2 = b0kVar3;
                    uwo1.d(ye5Var.p(), j, anm1.N("top_story_reasoning", qim0Var), cbx.d(b0kVar3).m, (a0e1) null, (iu30) null, 0, false, bjc0.a, 0, (qx8) null, mqo1.t(new mmr0[]{new mmr0("taste-profile", new gh80(d6t0Var, apo.r(614350168, new rvh((byte) 14, j), b0kVar3)))}), b0kVar2, 0, 0, 1776);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new uo50(str, qim0Var, i, (byte) 26);
                }
            }

            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r1v5 */
            public static final void i(nhb1 nhb1Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
                b0k b0kVar2;
                nl3 nl3Var;
                vu30 vu30Var;
                Function0 function2;
                ?? r1;
                g36 g36Var;
                vu30 vu30Var2;
                b0k b0kVar3;
                b0k b0kVar4 = (x340) b0kVar;
                b0kVar4.k0(1789401600);
                j06 j06Var = ((x340) b0kVar4).a;
                int i2 = i | (b0kVar4.i(nhb1Var) ? 4 : 2) | (b0kVar4.i(function0) ? 32 : 16) | (b0kVar4.i(function1) ? 256 : 128) | (b0kVar4.i(qim0Var) ? 2048 : 1024);
                if (b0kVar4.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(b0kVar4).a.a.a(), d4o1.a);
                    nl3 nl3Var2 = een.Q0;
                    g36 g36Var2 = h36.c;
                    mbh mbhVarA = jbh.a(g36Var2, nl3Var2, b0kVar4, 0);
                    int iHashCode = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM = b0kVar4.m();
                    qim0 qim0VarE = zr7.E(b0kVar4, qim0VarF2);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    boolean z = ((x340) b0kVar4).S;
                    Function0 function3 = hmb0.t1;
                    if (z) {
                        b0kVar4.l(function3);
                    } else {
                        b0kVar4.v0();
                    }
                    vu30 vu30Var3 = y580.O0;
                    nko1.H(mbhVarA, b0kVar4, vu30Var3);
                    llj lljVar = y580.N0;
                    nko1.H(xos0VarM, b0kVar4, lljVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar2 = y580.R0;
                    nko1.H(numValueOf, b0kVar4, lljVar2);
                    nko1.F(b0kVar4);
                    vu30 vu30Var4 = y580.Y;
                    nko1.H(qim0VarE, b0kVar4, vu30Var4);
                    boolean z2 = nhb1Var.e;
                    nim0 nim0Var = nim0.a;
                    if (z2) {
                        b0kVar4.i0(1280903718);
                        op71.g(b0kVar4, u291.r(nim0Var, 12.0f));
                        d7e.g(0, 1, b0kVar4, (qim0) null);
                        ywx0.n(nim0Var, 16.0f, b0kVar4, false);
                    } else {
                        b0kVar4.i0(1281001740);
                        b0kVar4.r(false);
                    }
                    String uri = nhb1Var.f.getUri();
                    if (uri == null) {
                        b0kVar4.i0(1281037389);
                        b0kVar4.r(false);
                        vu30Var = vu30Var3;
                        vu30Var2 = vu30Var4;
                        function2 = function3;
                        r1 = 0;
                        g36Var = g36Var2;
                        b0kVar3 = b0kVar4;
                        nl3Var = nl3Var2;
                    } else {
                        b0kVar4.i0(1281037390);
                        boolean zG = b0kVar4.g(uri);
                        Object objT = b0kVar4.T();
                        if (zG || objT == fkj0.X) {
                            objT = Uri.parse(uri);
                            b0kVar4.s0(objT);
                        }
                        Uri uri2 = (Uri) objT;
                        uri2.getClass();
                        nl3Var = nl3Var2;
                        vu30Var = vu30Var3;
                        function2 = function3;
                        r1 = 0;
                        g36Var = g36Var2;
                        vu30Var2 = vu30Var4;
                        eso1.e(uri2, isl.a, d7e.r(2.3333333f, u291.f(nim0Var, 1.0f), false), (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar4, 224304, 0, 3968);
                        b0kVar3 = b0kVar4;
                        b0kVar3.r(false);
                    }
                    qim0 qim0VarB = uyn1.B(nim0Var, 16.0f, 0.0f, 16.0f, 16.0f, 2);
                    mbh mbhVarA2 = jbh.a(g36Var, nl3Var, b0kVar3, (int) r1);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
                    xos0 xos0VarM2 = b0kVar3.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarB);
                    b0kVar3.m0();
                    if (((x340) b0kVar3).S) {
                        b0kVar3.l(function2);
                    } else {
                        b0kVar3.v0();
                    }
                    nko1.H(mbhVarA2, b0kVar3, vu30Var);
                    nko1.H(xos0VarM2, b0kVar3, lljVar);
                    x0d.q(iHashCode2, b0kVar3, lljVar2, b0kVar3);
                    nko1.H(qim0VarE2, b0kVar3, vu30Var2);
                    op71.g(b0kVar3, u291.r(nim0Var, 16.0f));
                    b0k b0kVar5 = b0kVar3;
                    uwo1.e(nhb1Var.a, (qim0) null, cbx.d(b0kVar5).h, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar5, 0, 0, 2026);
                    op71.g(b0kVar5, u291.r(nim0Var, 8.0f));
                    uwo1.e(nhb1Var.b, (qim0) null, cbx.d(b0kVar5).g, cbx.a(b0kVar5).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar5, 0, 0, 2018);
                    op71.g(b0kVar5, u291.r(nim0Var, 24.0f));
                    z50 z50Var = z50.c;
                    foo1.c(new gbx(z50Var, function0), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(479324779, new t52(nhb1Var, (byte) 2), b0kVar5), b0kVar5, 0, 48, 2044);
                    b0kVar2 = b0kVar5;
                    String str = nhb1Var.d;
                    if (str == null) {
                        b0kVar2.i0(1442532379);
                        b0kVar2.r((boolean) r1);
                    } else {
                        b0kVar2.i0(1442532380);
                        op71.g(b0kVar2, u291.r(nim0Var, 16.0f));
                        foo1.c(new gbx(z50Var, function1), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(2091029839, new avk1(str, (byte) 6), b0kVar2), b0kVar2, 0, 48, 2044);
                        b0kVar2 = b0kVar2;
                        b0kVar2.r((boolean) r1);
                    }
                    b0kVar2.r(true);
                    b0kVar2.r(true);
                } else {
                    b0kVar2 = b0kVar4;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ihb1(nhb1Var, function0, function1, qim0Var, i, (byte) 1);
                }
            }

            public static final int j(ziu ziuVar, b0k b0kVar) {
                int iT;
                if (!ziuVar.c) {
                    x340 x340Var = (x340) b0kVar;
                    x340Var.i0(-1609882230);
                    x340Var.r(false);
                    return 0;
                }
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.i0(-1610068879);
                boolean z = ziuVar.a;
                ngv ngvVar = ngv.d;
                if (z) {
                    x340Var2.i0(-1610049442);
                    uwr uwrVar = cbx.a;
                    iT = jfv.t(cbx.c(x340Var2).b.d, ngvVar);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1609965215);
                    uwr uwrVar2 = cbx.a;
                    iT = jfv.t(cbx.c(x340Var2).b.b, ngvVar);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
                return iT;
            }

            public static final qim0 k(long j, qim0 qim0Var) {
                return uyn1.B(exd0.r(qim0Var, new ps((byte) 4, j)), 0.0f, 0.0f, 0.0f, 6.0f, 7);
            }

            public static final apn0 l(h661 h661Var, Map map) {
                Object next;
                apn0 apn0Var;
                boolean zEquals;
                Iterator it = map.keySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    oma0 oma0Var = (oma0) next;
                    if (h661Var.b() != oma0Var.i()) {
                        zEquals = false;
                    } else {
                        nma0 nma0VarU = wmo1.u(j761.a, oma0Var, false);
                        if (nma0VarU == null) {
                            eg.m("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
                            return null;
                        }
                        zEquals = h661Var.equals(nma0VarU.getDescriptor());
                    }
                } while (!zEquals);
                oma0 oma0Var2 = (oma0) next;
                apn0 zon0Var = oma0Var2 != null ? (apn0) map.get(oma0Var2) : null;
                if (zon0Var == null) {
                    zon0Var = null;
                }
                apn0 apn0Var2 = e5h1.s;
                if (zon0Var == null) {
                    switch (l1d.C(upn1.A(h661Var))) {
                        case 0:
                            apn0Var = apn0.b;
                            zon0Var = apn0Var;
                            break;
                        case 1:
                            apn0Var = wpb1.a;
                            zon0Var = apn0Var;
                            break;
                        case 2:
                            apn0Var = apn0.l;
                            zon0Var = apn0Var;
                            break;
                        case 3:
                            apn0Var = wpb1.b;
                            zon0Var = apn0Var;
                            break;
                        case 4:
                            apn0Var = wpb1.c;
                            zon0Var = apn0Var;
                            break;
                        case 5:
                            apn0Var = wpb1.d;
                            zon0Var = apn0Var;
                            break;
                        case 6:
                            apn0Var = apn0.i;
                            zon0Var = apn0Var;
                            break;
                        case 7:
                            apn0Var = wpb1.e;
                            zon0Var = apn0Var;
                            break;
                        case 8:
                            apn0Var = apn0.f;
                            zon0Var = apn0Var;
                            break;
                        case 9:
                            apn0Var = wpb1.f;
                            zon0Var = apn0Var;
                            break;
                        case 10:
                            apn0Var = wpb1.g;
                            zon0Var = apn0Var;
                            break;
                        case 11:
                            apn0Var = apn0.o;
                            zon0Var = apn0Var;
                            break;
                        case 12:
                            apn0Var = apn0.d;
                            zon0Var = apn0Var;
                            break;
                        case 13:
                            apn0Var = apn0.m;
                            zon0Var = apn0Var;
                            break;
                        case 14:
                            apn0Var = wpb1.h;
                            zon0Var = apn0Var;
                            break;
                        case 15:
                            apn0Var = apn0.j;
                            zon0Var = apn0Var;
                            break;
                        case 16:
                            apn0Var = apn0.g;
                            zon0Var = apn0Var;
                            break;
                        case 17:
                            if (upn1.A(h661Var.g(0)) != 11) {
                                zon0Var = apn0Var2;
                            } else {
                                apn0Var = apn0.p;
                                zon0Var = apn0Var;
                            }
                            break;
                        case 18:
                            int iC = l1d.C(upn1.A(h661Var.g(0)));
                            if (iC == 0) {
                                apn0Var = apn0.e;
                            } else if (iC == 2) {
                                apn0Var = apn0.n;
                            } else if (iC == 6) {
                                apn0Var = apn0.k;
                            } else if (iC == 8) {
                                apn0Var = apn0.h;
                            } else if (iC != 10) {
                                zon0Var = apn0Var2;
                            } else {
                                apn0Var = apn0.q;
                            }
                            zon0Var = apn0Var;
                            break;
                        case 19:
                            Class clsL = upn1.l(h661Var);
                            if (Parcelable.class.isAssignableFrom(clsL)) {
                                zon0Var = new xon0(clsL);
                            } else if (Enum.class.isAssignableFrom(clsL)) {
                                zon0Var = new von0(clsL);
                            } else {
                                zon0Var = Serializable.class.isAssignableFrom(clsL) ? new zon0(clsL) : null;
                            }
                            if (zon0Var == null) {
                                zon0Var = apn0Var2;
                            }
                            break;
                        case 20:
                            Class clsL2 = upn1.l(h661Var);
                            zon0Var = !Enum.class.isAssignableFrom(clsL2) ? apn0Var2 : new m590(clsL2);
                            break;
                        default:
                            zon0Var = apn0Var2;
                            break;
                    }
                }
                if (zon0Var.equals(apn0Var2)) {
                    return null;
                }
                return zon0Var;
            }

            public static final int m(ldf0 ldf0Var, fcf0 fcf0Var) {
                if (ldf0Var.equals(qs10.N0)) {
                    return 0;
                }
                if (ldf0Var.equals(ws10.N0)) {
                    return (int) fcf0Var.m;
                }
                eg.o();
                return 0;
            }

            public static final int n(nma0 nma0Var) {
                int iHashCode = nma0Var.getDescriptor().h().hashCode();
                int iD = nma0Var.getDescriptor().d();
                for (int i = 0; i < iD; i++) {
                    iHashCode = (iHashCode * 31) + nma0Var.getDescriptor().e(i).hashCode();
                }
                return iHashCode;
            }

            public static final String o(Object obj, LinkedHashMap linkedHashMap) {
                nma0 nma0VarT = wmo1.t(rc11.a.b(obj.getClass()));
                xr31 xr31Var = new xr31(nma0VarT, linkedHashMap);
                nma0VarT.serialize(xr31Var, obj);
                Map mapU = sqg0.U(xr31Var.d);
                kdy0 kdy0Var = new kdy0(nma0VarT);
                rt11 rt11Var = new rt11((Object) mapU, (Object) kdy0Var, (byte) 6);
                int iD = nma0VarT.getDescriptor().d();
                for (int i = 0; i < iD; i++) {
                    String strE = nma0VarT.getDescriptor().e(i);
                    apn0 apn0Var = (apn0) linkedHashMap.get(strE);
                    if (apn0Var == null) {
                        bhn0.f(cy30.n("Cannot locate NavType for argument [", strE, ']'));
                        return null;
                    }
                    rt11Var.invoke(Integer.valueOf(i), strE, apn0Var);
                }
                return ((String) kdy0Var.d) + ((String) kdy0Var.e) + ((String) kdy0Var.b);
            }

            public static final Exception p(Context context, int i) {
                return new Exception(context.getString(2131963271, context.getString(i)));
            }

            public static LocaleList q(Configuration configuration) {
                return configuration.getLocales();
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public static final Object r(d0r d0rVar, o3r o3rVar, mp30 mp30Var, onm onmVar) {
                sp30 sp30Var;
                if (onmVar instanceof sp30) {
                    sp30Var = (sp30) onmVar;
                    int i = sp30Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sp30Var.b = i - Integer.MIN_VALUE;
                    } else {
                        sp30Var = new sp30(onmVar);
                    }
                } else {
                    sp30Var = new sp30(onmVar);
                }
                Object objJ = sp30Var.a;
                int i2 = sp30Var.b;
                if (i2 == 0) {
                    hm5.M(objJ);
                    ay8 ay8VarF = d3p1.F(d0rVar, o3rVar, mp30Var);
                    afv afvVar = new afv(2, (lnm) null, (byte) 15);
                    sp30Var.b = 1;
                    objJ = b5p1.j(ay8VarF, afvVar, sp30Var);
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

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public static final Object s(d0r d0rVar, vp30 vp30Var, onm onmVar) {
                tp30 tp30Var;
                wp30 wp30Var;
                wp30 wp30Var2;
                if (onmVar instanceof tp30) {
                    tp30Var = (tp30) onmVar;
                    int i = tp30Var.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tp30Var.e = i - Integer.MIN_VALUE;
                    } else {
                        tp30Var = new tp30(onmVar);
                    }
                } else {
                    tp30Var = new tp30(onmVar);
                }
                Object objR = tp30Var.d;
                int i2 = tp30Var.e;
                xkk1 xkk1Var = null;
                d9n d9nVar = d9n.a;
                if (i2 == 0) {
                    hm5.M(objR);
                    o3r o3rVar = hq30.g;
                    mp30 mp30Var = vp30Var.a;
                    tp30Var.a = d0rVar;
                    tp30Var.b = vp30Var;
                    tp30Var.e = 1;
                    objR = r(d0rVar, o3rVar, mp30Var, tp30Var);
                    if (objR != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i2 == 1) {
                    vp30Var = tp30Var.b;
                    d0rVar = tp30Var.a;
                    hm5.M(objR);
                } else {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wp30Var2 = tp30Var.c;
                    hm5.M(objR);
                }
                xkk1Var = (xkk1) objR;
                wp30Var = wp30Var2;
                return new yp30(wp30Var, xkk1Var);
                wp30Var = (wp30) objR;
                if (wp30Var == null) {
                    return xp30.a;
                }
                io70 io70Var = wp30Var.a.e;
                String str = io70Var != null ? io70Var.b : null;
                if (str != null) {
                    o3r o3rVar2 = hq30.h;
                    mp30 mp30Var2 = vp30Var.a;
                    mp30 mp30Var3 = new mp30(str);
                    tp30Var.a = null;
                    tp30Var.b = null;
                    tp30Var.c = wp30Var;
                    tp30Var.e = 2;
                    Object objR2 = r(d0rVar, o3rVar2, mp30Var3, tp30Var);
                    if (objR2 != d9nVar) {
                        objR = objR2;
                        wp30Var2 = wp30Var;
                        xkk1Var = (xkk1) objR;
                        wp30Var = wp30Var2;
                    }
                    return d9nVar;
                }
                return new yp30(wp30Var, xkk1Var);
            }

            public static final Observable t(Observable observable, List list) {
                return observable.map(new ilo(list, (byte) 1));
            }

            public static final Single u(Single single, List list) {
                return single.map(new i09(list));
            }

            public static final ArrayList v(List list) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Set set = s4b1.f;
                    if (uic.g((String) obj, blc0.fh)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public static final ArrayList w(List list) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Set set = s4b1.f;
                    if (uic.g((String) obj, blc0.Pg)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public static final ArrayList x(List list) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x((String) obj);
                    if (s4b1VarX.c == blc0.ti && !s4b1VarX.u()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public static final String y(String str, String str2, String str3, String str4) {
                return l1d.q(gvg.n("Route ", str3, " could not find any NavType for argument ", str, " of type "), str2, " - typeMap received was ", str4);
            }

            public static Next z(kak0 kak0Var, s3k0 s3k0Var) {
                return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -8388609, 1048575), Collections.singleton(new c1k0(s3k0Var.a)));
            }
        }
