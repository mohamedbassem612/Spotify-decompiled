package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.engage.service.AppEngageException;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.GifMedia;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class lmt0 {
    public static final kn5 a = new kn5((byte) 16);
    public static b180 b;

    public static final void a(hx3 hx3Var, int i, km3 km3Var, iu30 iu30Var, AtomicBoolean atomicBoolean, b0k b0kVar, int i2) {
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2085770260);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(hx3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? x340Var.g(km3Var) : x340Var.i(km3Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(atomicBoolean) ? 16384 : 8192;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            int i4 = i3 & 896;
            boolean z = i4 == 256 || ((i3 & 512) != 0 && x340Var.g(km3Var));
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                kzo kzoVar = (kzo) km3Var.b;
                lw3 lw3Var = new lw3(atomicBoolean, ven0VarS, b2);
                kzoVar.getClass();
                peu peuVar = new peu(lw3Var);
                x340Var.s0(peuVar);
                objT = peuVar;
            }
            peu peuVar2 = (peu) objT;
            if (i4 == 256 || ((i3 & 512) != 0 && x340Var.g(km3Var))) {
                b2 = 1;
            }
            Object objT2 = x340Var.T();
            if (b2 != 0 || objT2 == m4cVar) {
                lzo lzoVar = (lzo) km3Var.c;
                lw3 lw3Var2 = new lw3(atomicBoolean, ven0VarS, b3);
                lzoVar.getClass();
                qn21 qn21Var = new qn21(lw3Var2);
                x340Var.s0(qn21Var);
                objT2 = qn21Var;
            }
            nyx.a(0, (wux) null, apo.r(1372895225, new xx(hx3Var, i, peuVar2, (qn21) objT2, (byte) 15), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0((Object) hx3Var, i, (Object) km3Var, (Object) iu30Var, (Object) atomicBoolean, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX WARN: Code duplicated, block: B:62:0x016b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x0203  */
    public static final void b(c2b0 c2b0Var, boolean z, String str, int i, peu peuVar, qn21 qn21Var, b0k b0kVar, int i2) {
        c2b0 c2b0Var2;
        boolean z2;
        int i3;
        int i4;
        String strK;
        int iOrdinal;
        boolean z3;
        int i5;
        int i6;
        String strK2;
        int i7;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1108926141);
        int i8 = i2 | (b0kVar2.e(c2b0Var.ordinal()) ? 4 : 2) | (b0kVar2.h(z) ? 32 : 16) | (b0kVar2.g(str) ? 256 : 128) | (b0kVar2.e(l1d.C(i)) ? 2048 : 1024) | (b0kVar2.i(peuVar) ? 16384 : 8192) | (b0kVar2.i(qn21Var) ? 131072 : 65536);
        if (b0kVar2.Y(i8 & 1, (74899 & i8) != 74898)) {
            boolean z4 = i == 2;
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
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
            int iOrdinal2 = c2b0Var.ordinal();
            if (iOrdinal2 != 2) {
                if (iOrdinal2 != 4) {
                    i3 = 1860832565;
                    i4 = 2131952289;
                    z2 = false;
                } else {
                    z2 = false;
                    b0kVar2.i0(1860825976);
                    strK = cwl1.o0(b0kVar2, z4 ? 2131952291 : 2131952290);
                    b0kVar2.r(false);
                }
                uwr uwrVar = cbx.a;
                uwo1.e(strK, u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
                op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 10.0f));
                iOrdinal = c2b0Var.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 4) {
                        b0kVar2.i0(1860852110);
                        if (z4) {
                            i7 = 2131952296;
                        } else {
                            i7 = 2131952295;
                        }
                        strK2 = cwl1.o0(b0kVar2, i7);
                        z3 = false;
                        b0kVar2.r(false);
                    } else {
                        z3 = false;
                        i5 = 1860848891;
                        i6 = 2131952294;
                    }
                    uwo1.e(strK2, u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                    b0kVar2 = b0kVar2;
                    op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 32.0f));
                    c2b0Var2 = c2b0Var;
                    otw.c(peuVar, new oeu(str, c2b0Var2, z), (qim0) null, (ipb1) null, b0kVar2, (i8 >> 12) & 14, 12);
                    op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 16.0f));
                    if (c2b0Var2 == c2b0.b) {
                        b0kVar2.i0(1852710641);
                        otw.c(qn21Var, new pn21(z, str), (qim0) null, (ipb1) null, b0kVar2, (i8 >> 15) & 14, 12);
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(1852887465);
                        b0kVar2.r(false);
                    }
                    b0kVar2.r(true);
                } else {
                    z3 = false;
                    i5 = 1860845139;
                    i6 = 2131952297;
                }
                strK2 = x0d.k(b0kVar2, i5, i6, b0kVar2, z3);
                uwo1.e(strK2, u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                b0kVar2 = b0kVar2;
                op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 32.0f));
                c2b0Var2 = c2b0Var;
                otw.c(peuVar, new oeu(str, c2b0Var2, z), (qim0) null, (ipb1) null, b0kVar2, (i8 >> 12) & 14, 12);
                op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 16.0f));
                if (c2b0Var2 == c2b0.b) {
                    b0kVar2.i0(1852710641);
                    otw.c(qn21Var, new pn21(z, str), (qim0) null, (ipb1) null, b0kVar2, (i8 >> 15) & 14, 12);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(1852887465);
                    b0kVar2.r(false);
                }
                b0kVar2.r(true);
            } else {
                z2 = false;
                i3 = 1860822099;
                i4 = 2131952292;
            }
            strK = x0d.k(b0kVar2, i3, i4, b0kVar2, z2);
            uwr uwrVar2 = cbx.a;
            uwo1.e(strK, u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
            op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 10.0f));
            iOrdinal = c2b0Var.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 4) {
                    b0kVar2.i0(1860852110);
                    if (z4) {
                        i7 = 2131952296;
                    } else {
                        i7 = 2131952295;
                    }
                    strK2 = cwl1.o0(b0kVar2, i7);
                    z3 = false;
                    b0kVar2.r(false);
                } else {
                    z3 = false;
                    i5 = 1860848891;
                    i6 = 2131952294;
                }
                uwo1.e(strK2, u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                b0kVar2 = b0kVar2;
                op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 32.0f));
                c2b0Var2 = c2b0Var;
                otw.c(peuVar, new oeu(str, c2b0Var2, z), (qim0) null, (ipb1) null, b0kVar2, (i8 >> 12) & 14, 12);
                op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 16.0f));
                if (c2b0Var2 == c2b0.b) {
                    b0kVar2.i0(1852710641);
                    otw.c(qn21Var, new pn21(z, str), (qim0) null, (ipb1) null, b0kVar2, (i8 >> 15) & 14, 12);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(1852887465);
                    b0kVar2.r(false);
                }
                b0kVar2.r(true);
            } else {
                z3 = false;
                i5 = 1860845139;
                i6 = 2131952297;
            }
            strK2 = x0d.k(b0kVar2, i5, i6, b0kVar2, z3);
            uwo1.e(strK2, u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 32.0f));
            c2b0Var2 = c2b0Var;
            otw.c(peuVar, new oeu(str, c2b0Var2, z), (qim0) null, (ipb1) null, b0kVar2, (i8 >> 12) & 14, 12);
            op71.g(b0kVar2, u291.s(nim0Var, 0.0f, 16.0f));
            if (c2b0Var2 == c2b0.b) {
                b0kVar2.i0(1852710641);
                otw.c(qn21Var, new pn21(z, str), (qim0) null, (ipb1) null, b0kVar2, (i8 >> 15) & 14, 12);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1852887465);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            c2b0Var2 = c2b0Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(c2b0Var2, z, str, i, peuVar, qn21Var, i2);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1663634930);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0Var = nim0.a;
            xto1.e(u291.B(qim0Var, (gra) null, 3), 6, 0L, 0L, x340Var, 48, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 17);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1793987733);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarH = l6o1.H(u291.d(qim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, qim0VarH);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
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
            jmr0 jmr0VarN = i3o1.n(2131231303, x340Var, 0);
            zov0 zov0Var = cbx.b(x340Var).g;
            nim0 nim0Var = nim0.a;
            cwl1.f(jmr0VarN, (String) null, u291.r(nim0Var, 88.0f), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, x340Var, 56, 120);
            String strO0 = cwl1.o0(x340Var, 2131955045);
            lee1 lee1Var = cbx.d(x340Var).e;
            qim0 qim0VarX = u291.x(0.0f, 240.0f, 1, uyn1.B(nim0Var, 0.0f, cbx.b(x340Var).b.b, 0.0f, 0.0f, 13));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = wiu.V0;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarX, false, (iu30) objT), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
            String strO1 = cwl1.o0(x340Var, 2131955044);
            lee1 lee1Var2 = cbx.d(x340Var).g;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO1, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var2, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(482824032);
                foo1.c(new gbx(z50.c, function0), new idx(8), uyn1.B(nim0Var, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13), (max) null, yla.r(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, aki.a, x340Var, 0, 48, 2008);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(483211501);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var, i, (byte) 7);
        }
    }

    public static final void e(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        Function0 function1;
        int i4;
        x340 x340Var;
        Function0 function2;
        Function0 function3;
        Function0 function4;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(830982306);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i | (x340Var2.i(qim0Var2) ? 4 : 2);
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
            function1 = function0;
        } else {
            function1 = function0;
            i4 = i3 | (x340Var2.i(function1) ? 32 : 16);
        }
        int i7 = i4;
        if (x340Var2.Y(i7 & 1, (i7 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0Var4 = i5 != 0 ? qim0Var3 : qim0Var2;
            if (i6 != 0) {
                Object objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = i0f0.V0;
                    x340Var2.s0(objT);
                }
                function3 = (Function0) objT;
            } else {
                function3 = function1;
            }
            d36 d36Var = new d36(8.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            qim0 qim0VarA = uyn1.A(dug.f(qim0Var4, ((vex) zscVar.e).b, er31.b(8.0f)), 16.0f, 16.0f, 16.0f, 8.0f);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var2, 0);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0 qim0Var5 = qim0Var4;
            Function0 function5 = function3;
            uwo1.e(cwl1.o0(x340Var2, 2131953446), anm1.N("inline_message_text", qim0Var3), cbx.d(x340Var2).j, ((vex) zscVar.b).b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            String strO0 = cwl1.o0(x340Var2, 2131957860);
            boolean z = (i7 & 112) == 32;
            Object objT2 = x340Var2.T();
            if (z || objT2 == m4cVar) {
                function4 = function5;
                objT2 = new tze0(function4, (byte) 3);
                x340Var2.s0(objT2);
            } else {
                function4 = function5;
            }
            Function0 function6 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function6), new idx(8), (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, eyi.a, x340Var2, 0, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
            function2 = function4;
            qim0Var2 = qim0Var5;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            function2 = function1;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyu(qim0Var2, function2, i, i2, (byte) 2);
        }
    }

    public static final void f(ew90 ew90Var, boolean z, Function0 function0, vu30 vu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        gbx gbxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1045526391);
        int i2 = i | (b0kVar3.g(ew90Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(vu30Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarH = uyn1.h(1, 0.0f, 8.0f);
            if (ew90Var.e) {
                gbxVar = null;
            } else {
                String str = ew90Var.c;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbxVar = new gbx(new y50(str), function0);
            }
            b0kVar2 = b0kVar3;
            cwl1.b((qim0) null, (tl3) null, (hw61) null, (pgx) null, zzq0VarH, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-1396861760, new o3((byte) 21, ew90Var, vu30Var, z), b0kVar3), b0kVar2, 0, 48, 1519);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(ew90Var, z, function0, vu30Var, i, (byte) 0);
        }
    }

    public static final void g(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1371880876);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.b.c(), er31.a);
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
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(unx.c, isl.a, u291.r(nim0Var, 32.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, unx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 0);
        }
    }

    public static final void h(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(98623586);
        if (x340Var.Y(i & 1, i != 0)) {
            nyx.a(0, (wux) null, i6i.b, x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 17, i, false);
        }
    }

    public static final void i(z9h z9hVar, int i, whb1 whb1Var, z9h z9hVar2, b0k b0kVar, int i2, int i3) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1640513054);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(z9hVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(whb1Var) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= x340Var.h(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var.i(z9hVar2) ? 16384 : 8192;
        }
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            Context context = (Context) x340Var.k(p4k.b);
            kee1 kee1Var = nee1.k;
            et40 et40Var = et40.a;
            j2h1.b(d9y0.l(eqr0.F(dm5.Q(z9hVar2 != null ? ila0.k(et40Var, z9hVar2).c(new i8n(new t4u(48.0f))) : ila0.m(et40Var, new p05(i)), 48.0f), 16.0f, 0.0f), whb1Var), ql3.g, apo.r(663337152, new vbn0(context, kee1Var, z9hVar, (byte) 17), x340Var), x340Var, 384, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new za30(z9hVar, i, whb1Var, z9hVar2, i2, i3);
        }
    }

    public static final void j(ew90 ew90Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1309162482);
        int i2 = (x340Var.g(ew90Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(1338629284);
            kno1.e(er31.a, wti.a, u291.r(nim0.a, hcx.d.a(x340Var)), apo.r(-1434505952, new sy90(ew90Var), x340Var), x340Var, 25008, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(1338871053);
            k(ew90Var, x340Var, i2 & 14);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2(ew90Var, z, i, (byte) 11);
        }
    }

    public static final void k(ew90 ew90Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1259901650);
        int i2 = (x340Var.g(ew90Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("participantImage", nim0.a);
            String str = ew90Var.b;
            if (str == null) {
                str = "";
            }
            bmq0.a(Uri.parse(str), qim0VarN, hcx.d, (String) null, ew90Var.c, 0L, 0L, false, x340Var, 384, 232);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sy90(ew90Var, i);
        }
    }

    public static final void l(ew90 ew90Var, qim0 qim0Var, b0k b0kVar, int i) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1779451580);
        int i2 = (x340Var.g(ew90Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("participantName", nim0Var);
            if (ew90Var.e) {
                strK = x0d.k(x340Var, 1270002670, 2131956928, x340Var, false);
            } else {
                x340Var.i0(1270005490);
                x340Var.r(false);
                strK = ew90Var.c;
            }
            uwr uwrVar = cbx.a;
            uwo1.e(strK, qim0VarN, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            if (ew90Var.d) {
                x340Var.i0(715597301);
                uwo1.e(cwl1.o0(x340Var, 2131956936), anm1.N("participantRole", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                x340Var.r(false);
            } else {
                x340Var.i0(715848308);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(ew90Var, qim0Var, i, (byte) 2);
        }
    }

    public static final void m(los losVar, i8h1 i8h1Var, String str, c2b0 c2b0Var, AtomicBoolean atomicBoolean, b0k b0kVar, int i) {
        Object uh0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(732831825);
        int i2 = (x340Var.i(losVar) ? 4 : 2) | i | (x340Var.i(i8h1Var) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.e(c2b0Var.ordinal()) ? 2048 : 1024) | (x340Var.i(atomicBoolean) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zI = x340Var.i(losVar) | x340Var.i(i8h1Var) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | x340Var.i(atomicBoolean);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                uh0Var = new uh0(losVar, i8h1Var, str, c2b0Var, atomicBoolean, (byte) 2);
                x340Var.s0(uh0Var);
            } else {
                uh0Var = objT;
            }
            qxd0.i(losVar, (iu30) uh0Var, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m((byte) 9, i, losVar, i8h1Var, c2b0Var, atomicBoolean, str);
        }
    }

    public static final void n(int i, qim0 qim0Var, Function0 function0, xtb0 xtb0Var, h3h1 h3h1Var, vu30 vu30Var, vu30 vu30Var2, iu30 iu30Var, b0k b0kVar, int i2) {
        x340 x340Var;
        qim0 qim0Var2;
        qim0 qim0Var3;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1507559178);
        int i3 = i2 | (x340Var2.e(i) ? 4 : 2) | 48 | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(xtb0Var) ? 2048 : 1024) | (x340Var2.i(h3h1Var) ? 16384 : 8192);
        if ((i2 & 1572864) == 0) {
            i3 |= x340Var2.i(vu30Var2) ? 1048576 : 524288;
        }
        int i4 = i3 | (x340Var2.i(iu30Var) ? 8388608 : 4194304);
        if (x340Var2.Y(i4 & 1, (4793491 & i4) != 4793490)) {
            x340Var2.d0();
            int i5 = i2 & 1;
            qim0 qim0Var4 = nim0.a;
            if (i5 == 0 || x340Var2.E()) {
                qim0Var3 = qim0Var4;
            } else {
                x340Var2.b0();
                qim0Var3 = qim0Var;
            }
            x340Var2.s();
            wat watVar = (wat) x340Var2.k(t4k.h);
            int i6 = i4 >> 6;
            ven0 ven0VarS = v8r.s(function0, x340Var2);
            boolean zG = ((i4 & 14) == 4) | x340Var2.g(watVar);
            Object objT = x340Var2.T();
            if (zG || objT == obj) {
                objT = new hvb(i, new g8y0(ven0VarS, (byte) 27), watVar);
                x340Var2.s0(objT);
            }
            hvb hvbVar = (hvb) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            qim0 qim0Var5 = qim0Var3;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
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
            if (vu30Var != null) {
                c13.o(x340Var2, -439246465, 6, vu30Var, x340Var2);
                x0d.s(qim0Var4, cbx.b(x340Var2).b.b, x340Var2, false);
            } else {
                x340Var2.i0(-439162858);
                x340Var2.r(false);
            }
            if (vu30Var2 != null) {
                x340Var2.i0(-439134276);
                vu30Var2.invoke(x340Var2, Integer.valueOf((i4 >> 18) & 14));
                cvx cvxVar2 = cbx.b(x340Var2).b;
                x0d.s(qim0Var4, 8.0f, x340Var2, false);
            } else {
                x340Var2.i0(-439047786);
                x340Var2.r(false);
            }
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            kiv kivVar = xce0.a;
            s3o1.d(zr7.i(qim0VarD, gce0.c), xtb0Var, hvbVar, (g36) null, (nl3) null, (iq20) null, false, h3h1Var, iu30Var, x340Var2, (i6 & 112) | ((i4 << 12) & 234881024) | ((i4 << 6) & 1879048192), 248);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var5;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xy51(i, qim0Var2, function0, xtb0Var, h3h1Var, vu30Var, vu30Var2, iu30Var, i2);
        }
    }

    public static final j331 o(j331 j331Var, zw11 zw11Var) {
        if (j331Var instanceof v231) {
            return (j331) zw11Var.invoke(j331Var);
        }
        if ((j331Var instanceof c331) || (j331Var instanceof i231)) {
            return j331Var;
        }
        eg.o();
        return null;
    }

    public static final Observable p(Observable observable, Scheduler scheduler, q8n q8nVar, db4 db4Var, lxg lxgVar) {
        if (db4Var.a()) {
            p8n p8nVar = q8n.b;
            scheduler = w0h1.m(q8nVar.M(1));
        }
        Observable observableObserveOn = observable.observeOn(scheduler);
        if (lxgVar != null) {
            observableObserveOn = observableObserveOn.publish(new y1t0(lxgVar, (byte) 3));
        }
        return observableObserveOn.replay(1).a(0);
    }

    public static final js20 q(maa maaVar, iu30 iu30Var, lzn0 lzn0Var, vgm vgmVar) {
        return x3p1.n(iu30Var, fft0.c, ibi0.i, (o8n) null, new d(lzn0Var, vgmVar, (byte) 14), 8);
    }

    public static final tgm r(nnt0 nnt0Var) {
        String str = nnt0Var.i;
        String str2 = nnt0Var.a;
        jmt0 jmt0Var = nnt0Var.d;
        String str3 = jmt0Var != null ? jmt0Var.b : null;
        String str4 = nnt0Var.j;
        return new tgm((String) null, true, false, false, false, false, false, new yh10(str2, str3, (String) null, new ugo0(false, str4 == null ? str : str4, str, false, false, (String) null, (mgo0) null, 493), 20), false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -259, 1);
    }

    public static final erl1 s(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        u85 u85Var = (erl1) x340Var.k(szf0.b);
        if (u85Var == null) {
            x340Var.i0(-241884180);
            WeakHashMap weakHashMap = osl1.x;
            u85Var = lhc.g(x340Var).g;
        } else {
            x340Var.i0(-241885792);
        }
        x340Var.r(false);
        return u85Var;
    }

    public static final w7h1 t(zxk0 zxk0Var, c2l c2lVar) {
        r6h1 r6h1Var = zxk0Var.a;
        y6h1 y6h1Var = zxk0Var.b;
        String str = nik1.C2.a;
        boolean zEquals = c2lVar.equals(b2l.a);
        b7x b7xVar = b7x.a;
        if (zEquals) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("connect_button_unavailable", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (str == null) {
                str = "";
            }
            return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1Var, System.currentTimeMillis());
        }
        if (c2lVar instanceof a2l) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("connect_button_available", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
            if (str == null) {
                str = "";
            }
            return new w7h1("", "", z7h1Var2, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA2, r6h1Var, System.currentTimeMillis());
        }
        if (c2lVar instanceof z1l) {
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("connect_button_connecting", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA3 = x6h1VarC3.a();
            z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
            if (str == null) {
                str = "";
            }
            return new w7h1("", "", z7h1Var3, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA3, r6h1Var, System.currentTimeMillis());
        }
        if (!(c2lVar instanceof y1l)) {
            eg.o();
            return null;
        }
        x6h1 x6h1VarC4 = y6h1Var.c();
        x6h1VarC4.i.add(new a7h1("connect_button_connected", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC4.j = false;
        y6h1 y6h1VarA4 = x6h1VarC4.a();
        z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var4, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA4, r6h1Var, System.currentTimeMillis());
    }

    public static final Single u(Single single, int i) {
        return single.onErrorReturn(new ij81(i, (byte) 29));
    }

    public static final Exception v(Exception exc) {
        if (!(exc instanceof AppEngageException)) {
            return exc;
        }
        AppEngageException appEngageException = (AppEngageException) exc;
        int errorCode = appEngageException.getErrorCode();
        if (errorCode == 1 || errorCode == 2 || errorCode == 4 || errorCode == 5) {
            return null;
        }
        return appEngageException;
    }

    public static final wol w(GifMedia gifMedia) {
        return new wol(gifMedia.getId(), new lg31(gifMedia.p(), gifMedia.n(), gifMedia.getUrl(), gifMedia.getTitle(), gifMedia.q() ? gifMedia.o() : null), 4);
    }

    public static Next x(fu1 fu1Var, ns1 ns1Var) {
        ztm0 ztm0Var = ns1Var.a;
        fu1 fu1VarB = fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 1, false, (ma61) null, (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097135);
        boolean z = ztm0Var instanceof ytm0;
        qp1 qp1VarA = sp1.a;
        if (!z) {
            if (!(ztm0Var instanceof ztm0)) {
                qp1VarA = null;
                if (!(ztm0Var instanceof aum0)) {
                    eg.o();
                    return null;
                }
                if (fu1Var.e != 1) {
                    qp1VarA = fu1.a(fu1Var, false, (gv1) null, 6);
                }
            } else if (ztm0Var.a instanceof ey21) {
                qp1VarA = qp1.a;
            }
        }
        return qp1VarA != null ? Next.i(fu1VarB, Collections.singleton(qp1VarA)) : Next.h(fu1VarB);
    }
}
