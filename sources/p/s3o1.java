package p;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.highlightsstats.Person;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.PositionChangeLabel;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.SocialStatsItem;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.Stats;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.StatsItem;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class s3o1 {
    public static final yky0 a = new yky0(new el70((byte) 27));
    public static b180 b;

    public static final void a(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        Function0 function3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(789185164);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function1) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String strO0 = cwl1.o0(x340Var, 2131952409);
            lee1 lee1Var = cbx.d(x340Var).e;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = k74.b1;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(ydh.g(8.0f, 2131952406, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            cvx cvxVar4 = cbx.b(x340Var).b;
            c9 c9VarS = mqo1.s(ydh.g(16.0f, 2131952408, x340Var, x340Var, nim0Var), cwl1.o0(x340Var, 2131952405));
            lee1 lee1Var2 = cbx.d(x340Var).g;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.a(c9VarS, u291.f(nim0Var, 1.0f), lee1Var2, j, 12.0f, x340Var, 0, 0);
            cvx cvxVar6 = cbx.b(x340Var).b;
            uwo1.e(ydh.g(16.0f, 2131952410, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            cvx cvxVar7 = cbx.b(x340Var).b;
            qim0 qim0VarO = ab80.o(nim0Var, 16.0f, x340Var, nim0Var, 1.0f);
            cvx cvxVar8 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarO);
            era eraVar2 = een.Q0;
            cvx cvxVar9 = cbx.b(x340Var).b;
            mbh mbhVarA3 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar2, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            z50 z50Var = z50.c;
            function2 = function0;
            foo1.c(new gbx(z50Var, function2), new idx(4), null, null, yla.r(x340Var), null, null, null, null, null, p6i.a, x340Var, 0, 48, 2012);
            function3 = function1;
            foo1.c(new gbx(z50Var, function1), ldx.c, null, null, yla.r(x340Var), null, null, null, null, null, p6i.b, x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            function2 = function0;
            function3 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k16(function2, function3, i, (byte) 0);
        }
    }

    public static final void b(q16 q16Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(557486494);
        int i2 = i | (x340Var.g(q16Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("approve_artist_confirmation_sheet", dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a));
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarN);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarP, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            c(q16Var.a, q16Var.b, x340Var, 0);
            rqo1.g(0, 1, x340Var, null);
            a(function0, function1, x340Var, (i2 >> 3) & 126);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(q16Var, function0, function1, i, (byte) 16);
        }
    }

    public static final void c(String str, String str2, b0k b0kVar, int i) {
        Uri uri;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1946373589);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(str2) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 16.0f, 8.0f, 16.0f, 16.0f);
            fra fraVar = een.N0;
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            if (str2 == null || (uri = Uri.parse(str2)) == null) {
                uri = Uri.EMPTY;
            }
            uri.getClass();
            nkx nkxVar = nkx.c;
            nux nuxVar = new nux(nkxVar, nkxVar);
            zov0 zov0Var = cbx.b(b0kVar2).g;
            eso1.e(uri, isl.a, i1p1.q(u291.r(nim0Var, 48.0f), er31.a), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar2, 1073741872, 0, 3576);
            b0kVar2 = b0kVar2;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            uwo1.e(str, null, cbx.d(b0kVar2).g, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, i2 & 14, 0, 1722);
            uwo1.e(cwl1.o0(b0kVar2, 2131952404), null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 2, i, str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x0144  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:124:0x0198  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    public static final void d(qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, g36 g36Var, nl3 nl3Var, iq20 iq20Var, boolean z, h3h1 h3h1Var, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        xtb0 xtb0VarA;
        vzq0 zzq0Var;
        g36 g36Var2;
        boolean z2;
        int i4;
        h3h1 h3h1Var2;
        int i5;
        iu30 iu30Var2;
        boolean z3;
        qim0 qim0Var3;
        xtb0 xtb0Var2;
        vzq0 vzq0Var2;
        g36 g36Var3;
        boolean z4;
        nl3 nl3Var2;
        iq20 iq20Var2;
        h3h1 h3h1Var3;
        h311 h311VarV;
        nl3 nl3Var3;
        e9r e9rVarA;
        boolean zG;
        Object objT;
        iq20 iq20Var3;
        nl3 nl3Var4;
        qim0 qim0Var4;
        iq20 iq20Var4;
        xtb0 xtb0Var3;
        vzq0 vzq0Var3;
        g36 g36Var4;
        h3h1 h3h1Var4;
        int i6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1800653091);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i3 = (x340Var.i(qim0Var2) ? 4 : 2) | i;
        } else {
            qim0Var2 = qim0Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xtb0VarA = xtb0Var;
                int i8 = x340Var.i(xtb0VarA) ? 32 : 16;
                i3 |= i8;
            } else {
                xtb0VarA = xtb0Var;
            }
            i3 |= i8;
        } else {
            xtb0VarA = xtb0Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                zzq0Var = vzq0Var;
                int i9 = x340Var.i(zzq0Var) ? 256 : 128;
                i3 |= i9;
            } else {
                zzq0Var = vzq0Var;
            }
            i3 |= i9;
        } else {
            zzq0Var = vzq0Var;
        }
        int i10 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                g36Var2 = g36Var;
                int i11 = x340Var.i(g36Var2) ? 16384 : 8192;
                i10 |= i11;
            } else {
                g36Var2 = g36Var;
            }
            i10 |= i11;
        } else {
            g36Var2 = g36Var;
        }
        if ((196608 & i) == 0) {
            i10 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i10 |= 524288;
        }
        int i12 = i2 & 128;
        if (i12 == 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                i10 |= x340Var.h(z2) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((100663296 & i) == 0) {
                    h3h1Var2 = h3h1Var;
                    if (x340Var.i(h3h1Var2)) {
                        i5 = 67108864;
                    } else {
                        i5 = 33554432;
                    }
                    i10 |= i5;
                }
                if ((805306368 & i) == 0) {
                    iu30Var2 = iu30Var;
                    if (x340Var.i(iu30Var2)) {
                        i6 = 536870912;
                    } else {
                        i6 = 268435456;
                    }
                    i10 |= i6;
                } else {
                    iu30Var2 = iu30Var;
                }
                if ((306783379 & i10) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i10 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i7 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            g36Var2 = h36.c;
                        }
                        nl3Var3 = een.P0;
                        e9rVarA = wxa1.a(x340Var);
                        zG = x340Var.g(e9rVarA);
                        objT = x340Var.T();
                        if (zG || objT == fkj0.X) {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        }
                        iq20Var3 = (ozr) objT;
                        if (i12 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            nl3Var4 = nl3Var3;
                            qim0Var4 = qim0Var2;
                            iq20Var4 = iq20Var3;
                            xtb0Var3 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            g36Var4 = g36Var2;
                            h3h1Var2 = null;
                        } else {
                            nl3Var4 = nl3Var3;
                            qim0Var4 = qim0Var2;
                            iq20Var4 = iq20Var3;
                        }
                        boolean z5 = z2;
                        x340Var.s();
                        if (h3h1Var2 != null) {
                            h3h1Var4 = h3h1Var2;
                        } else {
                            h3h1Var4 = q6x.b;
                        }
                        ago1.b(h3h1Var4, apo.r(-800053188, new q3(qim0Var4, xtb0Var3, vzq0Var3, g36Var4, nl3Var4, iq20Var4, z5, iu30Var2), x340Var), x340Var, 48);
                        qim0Var3 = qim0Var4;
                        xtb0Var2 = xtb0Var3;
                        vzq0Var2 = vzq0Var3;
                        g36Var3 = g36Var4;
                        nl3Var2 = nl3Var4;
                        iq20Var2 = iq20Var4;
                        z4 = z5;
                    } else {
                        x340Var.b0();
                        nl3Var4 = nl3Var;
                        iq20Var4 = iq20Var;
                        qim0Var4 = qim0Var2;
                    }
                    xtb0Var3 = xtb0VarA;
                    vzq0Var3 = zzq0Var;
                    g36Var4 = g36Var2;
                    boolean z6 = z2;
                    x340Var.s();
                    if (h3h1Var2 != null) {
                        h3h1Var4 = h3h1Var2;
                    } else {
                        h3h1Var4 = q6x.b;
                    }
                    ago1.b(h3h1Var4, apo.r(-800053188, new q3(qim0Var4, xtb0Var3, vzq0Var3, g36Var4, nl3Var4, iq20Var4, z6, iu30Var2), x340Var), x340Var, 48);
                    qim0Var3 = qim0Var4;
                    xtb0Var2 = xtb0Var3;
                    vzq0Var2 = vzq0Var3;
                    g36Var3 = g36Var4;
                    nl3Var2 = nl3Var4;
                    iq20Var2 = iq20Var4;
                    z4 = z6;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    xtb0Var2 = xtb0VarA;
                    vzq0Var2 = zzq0Var;
                    g36Var3 = g36Var2;
                    z4 = z2;
                    nl3Var2 = nl3Var;
                    iq20Var2 = iq20Var;
                }
                h3h1Var3 = h3h1Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new e0e(qim0Var3, xtb0Var2, vzq0Var2, g36Var3, nl3Var2, iq20Var2, z4, h3h1Var3, iu30Var, i, i2);
                }
            }
            i10 |= 100663296;
            h3h1Var2 = h3h1Var;
            if ((805306368 & i) == 0) {
                iu30Var2 = iu30Var;
                if (x340Var.i(iu30Var2)) {
                    i6 = 536870912;
                } else {
                    i6 = 268435456;
                }
                i10 |= i6;
            } else {
                iu30Var2 = iu30Var;
            }
            if ((306783379 & i10) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i10 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        g36Var2 = h36.c;
                    }
                    nl3Var3 = een.P0;
                    e9rVarA = wxa1.a(x340Var);
                    zG = x340Var.g(e9rVarA);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    } else {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    }
                    iq20Var3 = (ozr) objT;
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        nl3Var4 = nl3Var3;
                        qim0Var4 = qim0Var2;
                        iq20Var4 = iq20Var3;
                        xtb0Var3 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        g36Var4 = g36Var2;
                        h3h1Var2 = null;
                    } else {
                        nl3Var4 = nl3Var3;
                        qim0Var4 = qim0Var2;
                        iq20Var4 = iq20Var3;
                        xtb0Var3 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        g36Var4 = g36Var2;
                    }
                } else {
                    if (i7 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        g36Var2 = h36.c;
                    }
                    nl3Var3 = een.P0;
                    e9rVarA = wxa1.a(x340Var);
                    zG = x340Var.g(e9rVarA);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    } else {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    }
                    iq20Var3 = (ozr) objT;
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        nl3Var4 = nl3Var3;
                        qim0Var4 = qim0Var2;
                        iq20Var4 = iq20Var3;
                        xtb0Var3 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        g36Var4 = g36Var2;
                        h3h1Var2 = null;
                    } else {
                        nl3Var4 = nl3Var3;
                        qim0Var4 = qim0Var2;
                        iq20Var4 = iq20Var3;
                        xtb0Var3 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        g36Var4 = g36Var2;
                    }
                }
                boolean z7 = z2;
                x340Var.s();
                if (h3h1Var2 != null) {
                    h3h1Var4 = h3h1Var2;
                } else {
                    h3h1Var4 = q6x.b;
                }
                ago1.b(h3h1Var4, apo.r(-800053188, new q3(qim0Var4, xtb0Var3, vzq0Var3, g36Var4, nl3Var4, iq20Var4, z7, iu30Var2), x340Var), x340Var, 48);
                qim0Var3 = qim0Var4;
                xtb0Var2 = xtb0Var3;
                vzq0Var2 = vzq0Var3;
                g36Var3 = g36Var4;
                nl3Var2 = nl3Var4;
                iq20Var2 = iq20Var4;
                z4 = z7;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                xtb0Var2 = xtb0VarA;
                vzq0Var2 = zzq0Var;
                g36Var3 = g36Var2;
                z4 = z2;
                nl3Var2 = nl3Var;
                iq20Var2 = iq20Var;
            }
            h3h1Var3 = h3h1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new e0e(qim0Var3, xtb0Var2, vzq0Var2, g36Var3, nl3Var2, iq20Var2, z4, h3h1Var3, iu30Var, i, i2);
            }
        }
        i10 |= 12582912;
        z2 = z;
        i4 = i2 & 256;
        if (i4 != 0) {
            if ((100663296 & i) == 0) {
                h3h1Var2 = h3h1Var;
                if (x340Var.i(h3h1Var2)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i10 |= i5;
            }
            if ((805306368 & i) == 0) {
                iu30Var2 = iu30Var;
                if (x340Var.i(iu30Var2)) {
                    i6 = 536870912;
                } else {
                    i6 = 268435456;
                }
                i10 |= i6;
            } else {
                iu30Var2 = iu30Var;
            }
            if ((306783379 & i10) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i10 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        g36Var2 = h36.c;
                    }
                    nl3Var3 = een.P0;
                    e9rVarA = wxa1.a(x340Var);
                    zG = x340Var.g(e9rVarA);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    } else {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    }
                    iq20Var3 = (ozr) objT;
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        nl3Var4 = nl3Var3;
                        qim0Var4 = qim0Var2;
                        iq20Var4 = iq20Var3;
                        xtb0Var3 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        g36Var4 = g36Var2;
                        h3h1Var2 = null;
                    } else {
                        nl3Var4 = nl3Var3;
                        qim0Var4 = qim0Var2;
                        iq20Var4 = iq20Var3;
                        xtb0Var3 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        g36Var4 = g36Var2;
                    }
                } else {
                    if (i7 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        g36Var2 = h36.c;
                    }
                    nl3Var3 = een.P0;
                    e9rVarA = wxa1.a(x340Var);
                    zG = x340Var.g(e9rVarA);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    } else {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    }
                    iq20Var3 = (ozr) objT;
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        nl3Var4 = nl3Var3;
                        qim0Var4 = qim0Var2;
                        iq20Var4 = iq20Var3;
                        xtb0Var3 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        g36Var4 = g36Var2;
                        h3h1Var2 = null;
                    } else {
                        nl3Var4 = nl3Var3;
                        qim0Var4 = qim0Var2;
                        iq20Var4 = iq20Var3;
                        xtb0Var3 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        g36Var4 = g36Var2;
                    }
                }
                boolean z8 = z2;
                x340Var.s();
                if (h3h1Var2 != null) {
                    h3h1Var4 = h3h1Var2;
                } else {
                    h3h1Var4 = q6x.b;
                }
                ago1.b(h3h1Var4, apo.r(-800053188, new q3(qim0Var4, xtb0Var3, vzq0Var3, g36Var4, nl3Var4, iq20Var4, z8, iu30Var2), x340Var), x340Var, 48);
                qim0Var3 = qim0Var4;
                xtb0Var2 = xtb0Var3;
                vzq0Var2 = vzq0Var3;
                g36Var3 = g36Var4;
                nl3Var2 = nl3Var4;
                iq20Var2 = iq20Var4;
                z4 = z8;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                xtb0Var2 = xtb0VarA;
                vzq0Var2 = zzq0Var;
                g36Var3 = g36Var2;
                z4 = z2;
                nl3Var2 = nl3Var;
                iq20Var2 = iq20Var;
            }
            h3h1Var3 = h3h1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new e0e(qim0Var3, xtb0Var2, vzq0Var2, g36Var3, nl3Var2, iq20Var2, z4, h3h1Var3, iu30Var, i, i2);
            }
        }
        i10 |= 100663296;
        h3h1Var2 = h3h1Var;
        if ((805306368 & i) == 0) {
            iu30Var2 = iu30Var;
            if (x340Var.i(iu30Var2)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i10 |= i6;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((306783379 & i10) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i10 & 1, z3)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 2) != 0) {
                    xtb0VarA = aub0.a(0, x340Var, 3);
                }
                if ((i2 & 4) != 0) {
                    zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    g36Var2 = h36.c;
                }
                nl3Var3 = een.P0;
                e9rVarA = wxa1.a(x340Var);
                zG = x340Var.g(e9rVarA);
                objT = x340Var.T();
                if (zG) {
                    objT = new ozr(e9rVarA);
                    x340Var.s0(objT);
                } else {
                    objT = new ozr(e9rVarA);
                    x340Var.s0(objT);
                }
                iq20Var3 = (ozr) objT;
                if (i12 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    nl3Var4 = nl3Var3;
                    qim0Var4 = qim0Var2;
                    iq20Var4 = iq20Var3;
                    xtb0Var3 = xtb0VarA;
                    vzq0Var3 = zzq0Var;
                    g36Var4 = g36Var2;
                    h3h1Var2 = null;
                } else {
                    nl3Var4 = nl3Var3;
                    qim0Var4 = qim0Var2;
                    iq20Var4 = iq20Var3;
                    xtb0Var3 = xtb0VarA;
                    vzq0Var3 = zzq0Var;
                    g36Var4 = g36Var2;
                }
            } else {
                if (i7 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 2) != 0) {
                    xtb0VarA = aub0.a(0, x340Var, 3);
                }
                if ((i2 & 4) != 0) {
                    zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    g36Var2 = h36.c;
                }
                nl3Var3 = een.P0;
                e9rVarA = wxa1.a(x340Var);
                zG = x340Var.g(e9rVarA);
                objT = x340Var.T();
                if (zG) {
                    objT = new ozr(e9rVarA);
                    x340Var.s0(objT);
                } else {
                    objT = new ozr(e9rVarA);
                    x340Var.s0(objT);
                }
                iq20Var3 = (ozr) objT;
                if (i12 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    nl3Var4 = nl3Var3;
                    qim0Var4 = qim0Var2;
                    iq20Var4 = iq20Var3;
                    xtb0Var3 = xtb0VarA;
                    vzq0Var3 = zzq0Var;
                    g36Var4 = g36Var2;
                    h3h1Var2 = null;
                } else {
                    nl3Var4 = nl3Var3;
                    qim0Var4 = qim0Var2;
                    iq20Var4 = iq20Var3;
                    xtb0Var3 = xtb0VarA;
                    vzq0Var3 = zzq0Var;
                    g36Var4 = g36Var2;
                }
            }
            boolean z9 = z2;
            x340Var.s();
            if (h3h1Var2 != null) {
                h3h1Var4 = h3h1Var2;
            } else {
                h3h1Var4 = q6x.b;
            }
            ago1.b(h3h1Var4, apo.r(-800053188, new q3(qim0Var4, xtb0Var3, vzq0Var3, g36Var4, nl3Var4, iq20Var4, z9, iu30Var2), x340Var), x340Var, 48);
            qim0Var3 = qim0Var4;
            xtb0Var2 = xtb0Var3;
            vzq0Var2 = vzq0Var3;
            g36Var3 = g36Var4;
            nl3Var2 = nl3Var4;
            iq20Var2 = iq20Var4;
            z4 = z9;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            xtb0Var2 = xtb0VarA;
            vzq0Var2 = zzq0Var;
            g36Var3 = g36Var2;
            z4 = z2;
            nl3Var2 = nl3Var;
            iq20Var2 = iq20Var;
        }
        h3h1Var3 = h3h1Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e0e(qim0Var3, xtb0Var2, vzq0Var2, g36Var3, nl3Var2, iq20Var2, z4, h3h1Var3, iu30Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0143  */
    /* JADX WARN: Code duplicated, block: B:103:0x014a  */
    /* JADX WARN: Code duplicated, block: B:104:0x014c  */
    /* JADX WARN: Code duplicated, block: B:106:0x016f  */
    /* JADX WARN: Code duplicated, block: B:109:0x017f  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    /* JADX WARN: Code duplicated, block: B:94:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    public static final void e(qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, c36 c36Var, pl3 pl3Var, iq20 iq20Var, h3h1 h3h1Var, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        xtb0 xtb0Var2;
        vzq0 zzq0Var;
        int i4;
        c36 c36Var2;
        pl3 pl3Var2;
        iq20 iq20Var2;
        int i5;
        int i6;
        h3h1 h3h1Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        qim0 qim0Var3;
        xtb0 xtb0Var3;
        vzq0 vzq0Var2;
        c36 c36Var3;
        pl3 pl3Var3;
        iq20 iq20Var3;
        h3h1 h3h1Var3;
        h311 h311VarV;
        xtb0 xtb0VarA;
        xtb0 xtb0Var4;
        h3h1 h3h1Var4;
        vzq0 vzq0Var3;
        c36 c36Var4;
        pl3 pl3Var4;
        iq20 iq20Var4;
        e9r e9rVarA;
        boolean zG;
        Object objT;
        h3h1 h3h1Var5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2121613973);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = (x340Var.i(qim0Var2) ? 4 : 2) | i;
        }
        if ((i2 & 2) == 0) {
            xtb0Var2 = xtb0Var;
            int i12 = x340Var.i(xtb0Var2) ? 32 : 16;
            int i13 = i3 | i12;
            if ((i2 & 4) == 0) {
                zzq0Var = vzq0Var;
                int i14 = x340Var.i(zzq0Var) ? 256 : 128;
                i4 = i13 | i14 | 3072;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        c36Var2 = c36Var;
                        int i15 = x340Var.i(c36Var2) ? 16384 : 8192;
                        i4 |= i15;
                    } else {
                        c36Var2 = c36Var;
                    }
                    i4 |= i15;
                } else {
                    c36Var2 = c36Var;
                }
                if ((i2 & 32) == 0) {
                    pl3Var2 = pl3Var;
                    int i16 = x340Var.i(pl3Var2) ? 131072 : 65536;
                    int i17 = i4 | i16;
                    if ((i2 & 64) == 0) {
                        iq20Var2 = iq20Var;
                        int i18 = x340Var.i(iq20Var2) ? 1048576 : 524288;
                        i5 = i17 | i18;
                        i6 = i2 & 128;
                        if (i6 != 0) {
                            i8 = i5 | 12582912;
                            h3h1Var2 = h3h1Var;
                        } else {
                            h3h1Var2 = h3h1Var;
                            if (x340Var.i(h3h1Var2)) {
                                i7 = 8388608;
                            } else {
                                i7 = 4194304;
                            }
                            i8 = i5 | i7;
                        }
                        if (x340Var.i(iu30Var)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                        i10 = i8 | i9;
                        if ((38347923 & i10) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i10 & 1, z)) {
                            x340Var.d0();
                            if ((i & 1) != 0 || x340Var.E()) {
                                if (i11 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i2 & 2) != 0) {
                                    xtb0VarA = aub0.a(0, x340Var, 3);
                                } else {
                                    xtb0VarA = xtb0Var2;
                                }
                                if ((i2 & 4) != 0) {
                                    zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                if ((i2 & 16) != 0) {
                                    c36Var2 = h36.a;
                                }
                                if ((i2 & 32) != 0) {
                                    pl3Var2 = een.Z;
                                }
                                if ((i2 & 64) != 0) {
                                    e9rVarA = wxa1.a(x340Var);
                                    zG = x340Var.g(e9rVarA);
                                    objT = x340Var.T();
                                    if (zG || objT == fkj0.X) {
                                        objT = new ozr(e9rVarA);
                                        x340Var.s0(objT);
                                    }
                                    iq20Var2 = (ozr) objT;
                                }
                                if (i6 != 0) {
                                    h3h1Var4 = null;
                                    xtb0Var4 = xtb0VarA;
                                    vzq0Var3 = zzq0Var;
                                    c36Var4 = c36Var2;
                                    pl3Var4 = pl3Var2;
                                    iq20Var4 = iq20Var2;
                                } else {
                                    xtb0Var4 = xtb0VarA;
                                }
                                x340Var.s();
                                if (h3h1Var4 != null) {
                                    h3h1Var5 = h3h1Var4;
                                } else {
                                    h3h1Var5 = q6x.b;
                                }
                                qim0 qim0Var4 = qim0Var2;
                                ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var4, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                                h3h1Var3 = h3h1Var4;
                                qim0Var3 = qim0Var4;
                                xtb0Var3 = xtb0Var4;
                                vzq0Var2 = vzq0Var3;
                                c36Var3 = c36Var4;
                                pl3Var3 = pl3Var4;
                                iq20Var3 = iq20Var4;
                            } else {
                                x340Var.b0();
                                xtb0Var4 = xtb0Var2;
                            }
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                            x340Var.s();
                            if (h3h1Var4 != null) {
                                h3h1Var5 = h3h1Var4;
                            } else {
                                h3h1Var5 = q6x.b;
                            }
                            qim0 qim0Var5 = qim0Var2;
                            ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var5, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                            h3h1Var3 = h3h1Var4;
                            qim0Var3 = qim0Var5;
                            xtb0Var3 = xtb0Var4;
                            vzq0Var2 = vzq0Var3;
                            c36Var3 = c36Var4;
                            pl3Var3 = pl3Var4;
                            iq20Var3 = iq20Var4;
                        } else {
                            x340Var.b0();
                            qim0Var3 = qim0Var2;
                            xtb0Var3 = xtb0Var2;
                            vzq0Var2 = zzq0Var;
                            c36Var3 = c36Var2;
                            pl3Var3 = pl3Var2;
                            iq20Var3 = iq20Var2;
                            h3h1Var3 = h3h1Var2;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                        }
                    }
                    iq20Var2 = iq20Var;
                    i5 = i17 | i18;
                    i6 = i2 & 128;
                    if (i6 != 0) {
                        i8 = i5 | 12582912;
                        h3h1Var2 = h3h1Var;
                    } else {
                        h3h1Var2 = h3h1Var;
                        if (x340Var.i(h3h1Var2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i8 = i5 | i7;
                    }
                    if (x340Var.i(iu30Var)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i10 = i8 | i9;
                    if ((38347923 & i10) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i10 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 2) != 0) {
                                xtb0VarA = aub0.a(0, x340Var, 3);
                            } else {
                                xtb0VarA = xtb0Var2;
                            }
                            if ((i2 & 4) != 0) {
                                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                c36Var2 = h36.a;
                            }
                            if ((i2 & 32) != 0) {
                                pl3Var2 = een.Z;
                            }
                            if ((i2 & 64) != 0) {
                                e9rVarA = wxa1.a(x340Var);
                                zG = x340Var.g(e9rVarA);
                                objT = x340Var.T();
                                if (zG) {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                } else {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                }
                                iq20Var2 = (ozr) objT;
                            }
                            if (i6 != 0) {
                                h3h1Var4 = null;
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                            } else {
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                                h3h1Var4 = h3h1Var2;
                            }
                        } else {
                            if (i11 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 2) != 0) {
                                xtb0VarA = aub0.a(0, x340Var, 3);
                            } else {
                                xtb0VarA = xtb0Var2;
                            }
                            if ((i2 & 4) != 0) {
                                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                c36Var2 = h36.a;
                            }
                            if ((i2 & 32) != 0) {
                                pl3Var2 = een.Z;
                            }
                            if ((i2 & 64) != 0) {
                                e9rVarA = wxa1.a(x340Var);
                                zG = x340Var.g(e9rVarA);
                                objT = x340Var.T();
                                if (zG) {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                } else {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                }
                                iq20Var2 = (ozr) objT;
                            }
                            if (i6 != 0) {
                                h3h1Var4 = null;
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                            } else {
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                                h3h1Var4 = h3h1Var2;
                            }
                        }
                        x340Var.s();
                        if (h3h1Var4 != null) {
                            h3h1Var5 = h3h1Var4;
                        } else {
                            h3h1Var5 = q6x.b;
                        }
                        qim0 qim0Var6 = qim0Var2;
                        ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var6, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                        h3h1Var3 = h3h1Var4;
                        qim0Var3 = qim0Var6;
                        xtb0Var3 = xtb0Var4;
                        vzq0Var2 = vzq0Var3;
                        c36Var3 = c36Var4;
                        pl3Var3 = pl3Var4;
                        iq20Var3 = iq20Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        xtb0Var3 = xtb0Var2;
                        vzq0Var2 = zzq0Var;
                        c36Var3 = c36Var2;
                        pl3Var3 = pl3Var2;
                        iq20Var3 = iq20Var2;
                        h3h1Var3 = h3h1Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                    }
                }
                pl3Var2 = pl3Var;
                int i19 = i4 | i16;
                if ((i2 & 64) == 0) {
                    iq20Var2 = iq20Var;
                    if (x340Var.i(iq20Var2)) {
                    }
                    i5 = i19 | i18;
                    i6 = i2 & 128;
                    if (i6 != 0) {
                        i8 = i5 | 12582912;
                        h3h1Var2 = h3h1Var;
                    } else {
                        h3h1Var2 = h3h1Var;
                        if (x340Var.i(h3h1Var2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i8 = i5 | i7;
                    }
                    if (x340Var.i(iu30Var)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i10 = i8 | i9;
                    if ((38347923 & i10) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i10 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 2) != 0) {
                                xtb0VarA = aub0.a(0, x340Var, 3);
                            } else {
                                xtb0VarA = xtb0Var2;
                            }
                            if ((i2 & 4) != 0) {
                                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                c36Var2 = h36.a;
                            }
                            if ((i2 & 32) != 0) {
                                pl3Var2 = een.Z;
                            }
                            if ((i2 & 64) != 0) {
                                e9rVarA = wxa1.a(x340Var);
                                zG = x340Var.g(e9rVarA);
                                objT = x340Var.T();
                                if (zG) {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                } else {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                }
                                iq20Var2 = (ozr) objT;
                            }
                            if (i6 != 0) {
                                h3h1Var4 = null;
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                            } else {
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                                h3h1Var4 = h3h1Var2;
                            }
                        } else {
                            if (i11 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 2) != 0) {
                                xtb0VarA = aub0.a(0, x340Var, 3);
                            } else {
                                xtb0VarA = xtb0Var2;
                            }
                            if ((i2 & 4) != 0) {
                                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                c36Var2 = h36.a;
                            }
                            if ((i2 & 32) != 0) {
                                pl3Var2 = een.Z;
                            }
                            if ((i2 & 64) != 0) {
                                e9rVarA = wxa1.a(x340Var);
                                zG = x340Var.g(e9rVarA);
                                objT = x340Var.T();
                                if (zG) {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                } else {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                }
                                iq20Var2 = (ozr) objT;
                            }
                            if (i6 != 0) {
                                h3h1Var4 = null;
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                            } else {
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                                h3h1Var4 = h3h1Var2;
                            }
                        }
                        x340Var.s();
                        if (h3h1Var4 != null) {
                            h3h1Var5 = h3h1Var4;
                        } else {
                            h3h1Var5 = q6x.b;
                        }
                        qim0 qim0Var7 = qim0Var2;
                        ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var7, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                        h3h1Var3 = h3h1Var4;
                        qim0Var3 = qim0Var7;
                        xtb0Var3 = xtb0Var4;
                        vzq0Var2 = vzq0Var3;
                        c36Var3 = c36Var4;
                        pl3Var3 = pl3Var4;
                        iq20Var3 = iq20Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        xtb0Var3 = xtb0Var2;
                        vzq0Var2 = zzq0Var;
                        c36Var3 = c36Var2;
                        pl3Var3 = pl3Var2;
                        iq20Var3 = iq20Var2;
                        h3h1Var3 = h3h1Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                    }
                }
                iq20Var2 = iq20Var;
                i5 = i19 | i18;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i8 = i5 | 12582912;
                    h3h1Var2 = h3h1Var;
                } else {
                    h3h1Var2 = h3h1Var;
                    if (x340Var.i(h3h1Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i8 = i5 | i7;
                }
                if (x340Var.i(iu30Var)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i10 = i8 | i9;
                if ((38347923 & i10) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i10 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    } else {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    }
                    x340Var.s();
                    if (h3h1Var4 != null) {
                        h3h1Var5 = h3h1Var4;
                    } else {
                        h3h1Var5 = q6x.b;
                    }
                    qim0 qim0Var8 = qim0Var2;
                    ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var8, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                    h3h1Var3 = h3h1Var4;
                    qim0Var3 = qim0Var8;
                    xtb0Var3 = xtb0Var4;
                    vzq0Var2 = vzq0Var3;
                    c36Var3 = c36Var4;
                    pl3Var3 = pl3Var4;
                    iq20Var3 = iq20Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    xtb0Var3 = xtb0Var2;
                    vzq0Var2 = zzq0Var;
                    c36Var3 = c36Var2;
                    pl3Var3 = pl3Var2;
                    iq20Var3 = iq20Var2;
                    h3h1Var3 = h3h1Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                }
            }
            zzq0Var = vzq0Var;
            i4 = i13 | i14 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    c36Var2 = c36Var;
                    if (x340Var.i(c36Var2)) {
                    }
                    i4 |= i15;
                } else {
                    c36Var2 = c36Var;
                }
                i4 |= i15;
            } else {
                c36Var2 = c36Var;
            }
            if ((i2 & 32) == 0) {
                pl3Var2 = pl3Var;
                if (x340Var.i(pl3Var2)) {
                }
                int i110 = i4 | i16;
                if ((i2 & 64) == 0) {
                    iq20Var2 = iq20Var;
                    if (x340Var.i(iq20Var2)) {
                    }
                    i5 = i110 | i18;
                    i6 = i2 & 128;
                    if (i6 != 0) {
                        i8 = i5 | 12582912;
                        h3h1Var2 = h3h1Var;
                    } else {
                        h3h1Var2 = h3h1Var;
                        if (x340Var.i(h3h1Var2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i8 = i5 | i7;
                    }
                    if (x340Var.i(iu30Var)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i10 = i8 | i9;
                    if ((38347923 & i10) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i10 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 2) != 0) {
                                xtb0VarA = aub0.a(0, x340Var, 3);
                            } else {
                                xtb0VarA = xtb0Var2;
                            }
                            if ((i2 & 4) != 0) {
                                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                c36Var2 = h36.a;
                            }
                            if ((i2 & 32) != 0) {
                                pl3Var2 = een.Z;
                            }
                            if ((i2 & 64) != 0) {
                                e9rVarA = wxa1.a(x340Var);
                                zG = x340Var.g(e9rVarA);
                                objT = x340Var.T();
                                if (zG) {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                } else {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                }
                                iq20Var2 = (ozr) objT;
                            }
                            if (i6 != 0) {
                                h3h1Var4 = null;
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                            } else {
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                                h3h1Var4 = h3h1Var2;
                            }
                        } else {
                            if (i11 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 2) != 0) {
                                xtb0VarA = aub0.a(0, x340Var, 3);
                            } else {
                                xtb0VarA = xtb0Var2;
                            }
                            if ((i2 & 4) != 0) {
                                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                c36Var2 = h36.a;
                            }
                            if ((i2 & 32) != 0) {
                                pl3Var2 = een.Z;
                            }
                            if ((i2 & 64) != 0) {
                                e9rVarA = wxa1.a(x340Var);
                                zG = x340Var.g(e9rVarA);
                                objT = x340Var.T();
                                if (zG) {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                } else {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                }
                                iq20Var2 = (ozr) objT;
                            }
                            if (i6 != 0) {
                                h3h1Var4 = null;
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                            } else {
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                                h3h1Var4 = h3h1Var2;
                            }
                        }
                        x340Var.s();
                        if (h3h1Var4 != null) {
                            h3h1Var5 = h3h1Var4;
                        } else {
                            h3h1Var5 = q6x.b;
                        }
                        qim0 qim0Var9 = qim0Var2;
                        ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var9, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                        h3h1Var3 = h3h1Var4;
                        qim0Var3 = qim0Var9;
                        xtb0Var3 = xtb0Var4;
                        vzq0Var2 = vzq0Var3;
                        c36Var3 = c36Var4;
                        pl3Var3 = pl3Var4;
                        iq20Var3 = iq20Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        xtb0Var3 = xtb0Var2;
                        vzq0Var2 = zzq0Var;
                        c36Var3 = c36Var2;
                        pl3Var3 = pl3Var2;
                        iq20Var3 = iq20Var2;
                        h3h1Var3 = h3h1Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                    }
                }
                iq20Var2 = iq20Var;
                i5 = i110 | i18;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i8 = i5 | 12582912;
                    h3h1Var2 = h3h1Var;
                } else {
                    h3h1Var2 = h3h1Var;
                    if (x340Var.i(h3h1Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i8 = i5 | i7;
                }
                if (x340Var.i(iu30Var)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i10 = i8 | i9;
                if ((38347923 & i10) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i10 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    } else {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    }
                    x340Var.s();
                    if (h3h1Var4 != null) {
                        h3h1Var5 = h3h1Var4;
                    } else {
                        h3h1Var5 = q6x.b;
                    }
                    qim0 qim0Var10 = qim0Var2;
                    ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var10, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                    h3h1Var3 = h3h1Var4;
                    qim0Var3 = qim0Var10;
                    xtb0Var3 = xtb0Var4;
                    vzq0Var2 = vzq0Var3;
                    c36Var3 = c36Var4;
                    pl3Var3 = pl3Var4;
                    iq20Var3 = iq20Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    xtb0Var3 = xtb0Var2;
                    vzq0Var2 = zzq0Var;
                    c36Var3 = c36Var2;
                    pl3Var3 = pl3Var2;
                    iq20Var3 = iq20Var2;
                    h3h1Var3 = h3h1Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                }
            }
            pl3Var2 = pl3Var;
            int i111 = i4 | i16;
            if ((i2 & 64) == 0) {
                iq20Var2 = iq20Var;
                if (x340Var.i(iq20Var2)) {
                }
                i5 = i111 | i18;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i8 = i5 | 12582912;
                    h3h1Var2 = h3h1Var;
                } else {
                    h3h1Var2 = h3h1Var;
                    if (x340Var.i(h3h1Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i8 = i5 | i7;
                }
                if (x340Var.i(iu30Var)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i10 = i8 | i9;
                if ((38347923 & i10) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i10 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    } else {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    }
                    x340Var.s();
                    if (h3h1Var4 != null) {
                        h3h1Var5 = h3h1Var4;
                    } else {
                        h3h1Var5 = q6x.b;
                    }
                    qim0 qim0Var11 = qim0Var2;
                    ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var11, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                    h3h1Var3 = h3h1Var4;
                    qim0Var3 = qim0Var11;
                    xtb0Var3 = xtb0Var4;
                    vzq0Var2 = vzq0Var3;
                    c36Var3 = c36Var4;
                    pl3Var3 = pl3Var4;
                    iq20Var3 = iq20Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    xtb0Var3 = xtb0Var2;
                    vzq0Var2 = zzq0Var;
                    c36Var3 = c36Var2;
                    pl3Var3 = pl3Var2;
                    iq20Var3 = iq20Var2;
                    h3h1Var3 = h3h1Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                }
            }
            iq20Var2 = iq20Var;
            i5 = i111 | i18;
            i6 = i2 & 128;
            if (i6 != 0) {
                i8 = i5 | 12582912;
                h3h1Var2 = h3h1Var;
            } else {
                h3h1Var2 = h3h1Var;
                if (x340Var.i(h3h1Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i8 = i5 | i7;
            }
            if (x340Var.i(iu30Var)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i10 = i8 | i9;
            if ((38347923 & i10) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i10 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    } else {
                        xtb0VarA = xtb0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        c36Var2 = h36.a;
                    }
                    if ((i2 & 32) != 0) {
                        pl3Var2 = een.Z;
                    }
                    if ((i2 & 64) != 0) {
                        e9rVarA = wxa1.a(x340Var);
                        zG = x340Var.g(e9rVarA);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                    }
                    if (i6 != 0) {
                        h3h1Var4 = null;
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                    } else {
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                        h3h1Var4 = h3h1Var2;
                    }
                } else {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    } else {
                        xtb0VarA = xtb0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        c36Var2 = h36.a;
                    }
                    if ((i2 & 32) != 0) {
                        pl3Var2 = een.Z;
                    }
                    if ((i2 & 64) != 0) {
                        e9rVarA = wxa1.a(x340Var);
                        zG = x340Var.g(e9rVarA);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                    }
                    if (i6 != 0) {
                        h3h1Var4 = null;
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                    } else {
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                        h3h1Var4 = h3h1Var2;
                    }
                }
                x340Var.s();
                if (h3h1Var4 != null) {
                    h3h1Var5 = h3h1Var4;
                } else {
                    h3h1Var5 = q6x.b;
                }
                qim0 qim0Var12 = qim0Var2;
                ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var12, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                h3h1Var3 = h3h1Var4;
                qim0Var3 = qim0Var12;
                xtb0Var3 = xtb0Var4;
                vzq0Var2 = vzq0Var3;
                c36Var3 = c36Var4;
                pl3Var3 = pl3Var4;
                iq20Var3 = iq20Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                xtb0Var3 = xtb0Var2;
                vzq0Var2 = zzq0Var;
                c36Var3 = c36Var2;
                pl3Var3 = pl3Var2;
                iq20Var3 = iq20Var2;
                h3h1Var3 = h3h1Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
            }
        }
        xtb0Var2 = xtb0Var;
        int i112 = i3 | i12;
        if ((i2 & 4) == 0) {
            zzq0Var = vzq0Var;
            if (x340Var.i(zzq0Var)) {
            }
            i4 = i112 | i14 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    c36Var2 = c36Var;
                    if (x340Var.i(c36Var2)) {
                    }
                    i4 |= i15;
                } else {
                    c36Var2 = c36Var;
                }
                i4 |= i15;
            } else {
                c36Var2 = c36Var;
            }
            if ((i2 & 32) == 0) {
                pl3Var2 = pl3Var;
                if (x340Var.i(pl3Var2)) {
                }
                int i113 = i4 | i16;
                if ((i2 & 64) == 0) {
                    iq20Var2 = iq20Var;
                    if (x340Var.i(iq20Var2)) {
                    }
                    i5 = i113 | i18;
                    i6 = i2 & 128;
                    if (i6 != 0) {
                        i8 = i5 | 12582912;
                        h3h1Var2 = h3h1Var;
                    } else {
                        h3h1Var2 = h3h1Var;
                        if (x340Var.i(h3h1Var2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i8 = i5 | i7;
                    }
                    if (x340Var.i(iu30Var)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i10 = i8 | i9;
                    if ((38347923 & i10) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i10 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 2) != 0) {
                                xtb0VarA = aub0.a(0, x340Var, 3);
                            } else {
                                xtb0VarA = xtb0Var2;
                            }
                            if ((i2 & 4) != 0) {
                                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                c36Var2 = h36.a;
                            }
                            if ((i2 & 32) != 0) {
                                pl3Var2 = een.Z;
                            }
                            if ((i2 & 64) != 0) {
                                e9rVarA = wxa1.a(x340Var);
                                zG = x340Var.g(e9rVarA);
                                objT = x340Var.T();
                                if (zG) {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                } else {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                }
                                iq20Var2 = (ozr) objT;
                            }
                            if (i6 != 0) {
                                h3h1Var4 = null;
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                            } else {
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                                h3h1Var4 = h3h1Var2;
                            }
                        } else {
                            if (i11 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 2) != 0) {
                                xtb0VarA = aub0.a(0, x340Var, 3);
                            } else {
                                xtb0VarA = xtb0Var2;
                            }
                            if ((i2 & 4) != 0) {
                                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                c36Var2 = h36.a;
                            }
                            if ((i2 & 32) != 0) {
                                pl3Var2 = een.Z;
                            }
                            if ((i2 & 64) != 0) {
                                e9rVarA = wxa1.a(x340Var);
                                zG = x340Var.g(e9rVarA);
                                objT = x340Var.T();
                                if (zG) {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                } else {
                                    objT = new ozr(e9rVarA);
                                    x340Var.s0(objT);
                                }
                                iq20Var2 = (ozr) objT;
                            }
                            if (i6 != 0) {
                                h3h1Var4 = null;
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                            } else {
                                xtb0Var4 = xtb0VarA;
                                vzq0Var3 = zzq0Var;
                                c36Var4 = c36Var2;
                                pl3Var4 = pl3Var2;
                                iq20Var4 = iq20Var2;
                                h3h1Var4 = h3h1Var2;
                            }
                        }
                        x340Var.s();
                        if (h3h1Var4 != null) {
                            h3h1Var5 = h3h1Var4;
                        } else {
                            h3h1Var5 = q6x.b;
                        }
                        qim0 qim0Var13 = qim0Var2;
                        ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var13, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                        h3h1Var3 = h3h1Var4;
                        qim0Var3 = qim0Var13;
                        xtb0Var3 = xtb0Var4;
                        vzq0Var2 = vzq0Var3;
                        c36Var3 = c36Var4;
                        pl3Var3 = pl3Var4;
                        iq20Var3 = iq20Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        xtb0Var3 = xtb0Var2;
                        vzq0Var2 = zzq0Var;
                        c36Var3 = c36Var2;
                        pl3Var3 = pl3Var2;
                        iq20Var3 = iq20Var2;
                        h3h1Var3 = h3h1Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                    }
                }
                iq20Var2 = iq20Var;
                i5 = i113 | i18;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i8 = i5 | 12582912;
                    h3h1Var2 = h3h1Var;
                } else {
                    h3h1Var2 = h3h1Var;
                    if (x340Var.i(h3h1Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i8 = i5 | i7;
                }
                if (x340Var.i(iu30Var)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i10 = i8 | i9;
                if ((38347923 & i10) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i10 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    } else {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    }
                    x340Var.s();
                    if (h3h1Var4 != null) {
                        h3h1Var5 = h3h1Var4;
                    } else {
                        h3h1Var5 = q6x.b;
                    }
                    qim0 qim0Var14 = qim0Var2;
                    ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var14, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                    h3h1Var3 = h3h1Var4;
                    qim0Var3 = qim0Var14;
                    xtb0Var3 = xtb0Var4;
                    vzq0Var2 = vzq0Var3;
                    c36Var3 = c36Var4;
                    pl3Var3 = pl3Var4;
                    iq20Var3 = iq20Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    xtb0Var3 = xtb0Var2;
                    vzq0Var2 = zzq0Var;
                    c36Var3 = c36Var2;
                    pl3Var3 = pl3Var2;
                    iq20Var3 = iq20Var2;
                    h3h1Var3 = h3h1Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                }
            }
            pl3Var2 = pl3Var;
            int i114 = i4 | i16;
            if ((i2 & 64) == 0) {
                iq20Var2 = iq20Var;
                if (x340Var.i(iq20Var2)) {
                }
                i5 = i114 | i18;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i8 = i5 | 12582912;
                    h3h1Var2 = h3h1Var;
                } else {
                    h3h1Var2 = h3h1Var;
                    if (x340Var.i(h3h1Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i8 = i5 | i7;
                }
                if (x340Var.i(iu30Var)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i10 = i8 | i9;
                if ((38347923 & i10) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i10 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    } else {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    }
                    x340Var.s();
                    if (h3h1Var4 != null) {
                        h3h1Var5 = h3h1Var4;
                    } else {
                        h3h1Var5 = q6x.b;
                    }
                    qim0 qim0Var15 = qim0Var2;
                    ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var15, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                    h3h1Var3 = h3h1Var4;
                    qim0Var3 = qim0Var15;
                    xtb0Var3 = xtb0Var4;
                    vzq0Var2 = vzq0Var3;
                    c36Var3 = c36Var4;
                    pl3Var3 = pl3Var4;
                    iq20Var3 = iq20Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    xtb0Var3 = xtb0Var2;
                    vzq0Var2 = zzq0Var;
                    c36Var3 = c36Var2;
                    pl3Var3 = pl3Var2;
                    iq20Var3 = iq20Var2;
                    h3h1Var3 = h3h1Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                }
            }
            iq20Var2 = iq20Var;
            i5 = i114 | i18;
            i6 = i2 & 128;
            if (i6 != 0) {
                i8 = i5 | 12582912;
                h3h1Var2 = h3h1Var;
            } else {
                h3h1Var2 = h3h1Var;
                if (x340Var.i(h3h1Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i8 = i5 | i7;
            }
            if (x340Var.i(iu30Var)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i10 = i8 | i9;
            if ((38347923 & i10) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i10 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    } else {
                        xtb0VarA = xtb0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        c36Var2 = h36.a;
                    }
                    if ((i2 & 32) != 0) {
                        pl3Var2 = een.Z;
                    }
                    if ((i2 & 64) != 0) {
                        e9rVarA = wxa1.a(x340Var);
                        zG = x340Var.g(e9rVarA);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                    }
                    if (i6 != 0) {
                        h3h1Var4 = null;
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                    } else {
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                        h3h1Var4 = h3h1Var2;
                    }
                } else {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    } else {
                        xtb0VarA = xtb0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        c36Var2 = h36.a;
                    }
                    if ((i2 & 32) != 0) {
                        pl3Var2 = een.Z;
                    }
                    if ((i2 & 64) != 0) {
                        e9rVarA = wxa1.a(x340Var);
                        zG = x340Var.g(e9rVarA);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                    }
                    if (i6 != 0) {
                        h3h1Var4 = null;
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                    } else {
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                        h3h1Var4 = h3h1Var2;
                    }
                }
                x340Var.s();
                if (h3h1Var4 != null) {
                    h3h1Var5 = h3h1Var4;
                } else {
                    h3h1Var5 = q6x.b;
                }
                qim0 qim0Var16 = qim0Var2;
                ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var16, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                h3h1Var3 = h3h1Var4;
                qim0Var3 = qim0Var16;
                xtb0Var3 = xtb0Var4;
                vzq0Var2 = vzq0Var3;
                c36Var3 = c36Var4;
                pl3Var3 = pl3Var4;
                iq20Var3 = iq20Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                xtb0Var3 = xtb0Var2;
                vzq0Var2 = zzq0Var;
                c36Var3 = c36Var2;
                pl3Var3 = pl3Var2;
                iq20Var3 = iq20Var2;
                h3h1Var3 = h3h1Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
            }
        }
        zzq0Var = vzq0Var;
        i4 = i112 | i14 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                c36Var2 = c36Var;
                if (x340Var.i(c36Var2)) {
                }
                i4 |= i15;
            } else {
                c36Var2 = c36Var;
            }
            i4 |= i15;
        } else {
            c36Var2 = c36Var;
        }
        if ((i2 & 32) == 0) {
            pl3Var2 = pl3Var;
            if (x340Var.i(pl3Var2)) {
            }
            int i115 = i4 | i16;
            if ((i2 & 64) == 0) {
                iq20Var2 = iq20Var;
                if (x340Var.i(iq20Var2)) {
                }
                i5 = i115 | i18;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i8 = i5 | 12582912;
                    h3h1Var2 = h3h1Var;
                } else {
                    h3h1Var2 = h3h1Var;
                    if (x340Var.i(h3h1Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i8 = i5 | i7;
                }
                if (x340Var.i(iu30Var)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i10 = i8 | i9;
                if ((38347923 & i10) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i10 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    } else {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var, 3);
                        } else {
                            xtb0VarA = xtb0Var2;
                        }
                        if ((i2 & 4) != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            c36Var2 = h36.a;
                        }
                        if ((i2 & 32) != 0) {
                            pl3Var2 = een.Z;
                        }
                        if ((i2 & 64) != 0) {
                            e9rVarA = wxa1.a(x340Var);
                            zG = x340Var.g(e9rVarA);
                            objT = x340Var.T();
                            if (zG) {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            } else {
                                objT = new ozr(e9rVarA);
                                x340Var.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                        }
                        if (i6 != 0) {
                            h3h1Var4 = null;
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                        } else {
                            xtb0Var4 = xtb0VarA;
                            vzq0Var3 = zzq0Var;
                            c36Var4 = c36Var2;
                            pl3Var4 = pl3Var2;
                            iq20Var4 = iq20Var2;
                            h3h1Var4 = h3h1Var2;
                        }
                    }
                    x340Var.s();
                    if (h3h1Var4 != null) {
                        h3h1Var5 = h3h1Var4;
                    } else {
                        h3h1Var5 = q6x.b;
                    }
                    qim0 qim0Var17 = qim0Var2;
                    ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var17, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                    h3h1Var3 = h3h1Var4;
                    qim0Var3 = qim0Var17;
                    xtb0Var3 = xtb0Var4;
                    vzq0Var2 = vzq0Var3;
                    c36Var3 = c36Var4;
                    pl3Var3 = pl3Var4;
                    iq20Var3 = iq20Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    xtb0Var3 = xtb0Var2;
                    vzq0Var2 = zzq0Var;
                    c36Var3 = c36Var2;
                    pl3Var3 = pl3Var2;
                    iq20Var3 = iq20Var2;
                    h3h1Var3 = h3h1Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
                }
            }
            iq20Var2 = iq20Var;
            i5 = i115 | i18;
            i6 = i2 & 128;
            if (i6 != 0) {
                i8 = i5 | 12582912;
                h3h1Var2 = h3h1Var;
            } else {
                h3h1Var2 = h3h1Var;
                if (x340Var.i(h3h1Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i8 = i5 | i7;
            }
            if (x340Var.i(iu30Var)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i10 = i8 | i9;
            if ((38347923 & i10) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i10 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    } else {
                        xtb0VarA = xtb0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        c36Var2 = h36.a;
                    }
                    if ((i2 & 32) != 0) {
                        pl3Var2 = een.Z;
                    }
                    if ((i2 & 64) != 0) {
                        e9rVarA = wxa1.a(x340Var);
                        zG = x340Var.g(e9rVarA);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                    }
                    if (i6 != 0) {
                        h3h1Var4 = null;
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                    } else {
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                        h3h1Var4 = h3h1Var2;
                    }
                } else {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    } else {
                        xtb0VarA = xtb0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        c36Var2 = h36.a;
                    }
                    if ((i2 & 32) != 0) {
                        pl3Var2 = een.Z;
                    }
                    if ((i2 & 64) != 0) {
                        e9rVarA = wxa1.a(x340Var);
                        zG = x340Var.g(e9rVarA);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                    }
                    if (i6 != 0) {
                        h3h1Var4 = null;
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                    } else {
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                        h3h1Var4 = h3h1Var2;
                    }
                }
                x340Var.s();
                if (h3h1Var4 != null) {
                    h3h1Var5 = h3h1Var4;
                } else {
                    h3h1Var5 = q6x.b;
                }
                qim0 qim0Var18 = qim0Var2;
                ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var18, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                h3h1Var3 = h3h1Var4;
                qim0Var3 = qim0Var18;
                xtb0Var3 = xtb0Var4;
                vzq0Var2 = vzq0Var3;
                c36Var3 = c36Var4;
                pl3Var3 = pl3Var4;
                iq20Var3 = iq20Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                xtb0Var3 = xtb0Var2;
                vzq0Var2 = zzq0Var;
                c36Var3 = c36Var2;
                pl3Var3 = pl3Var2;
                iq20Var3 = iq20Var2;
                h3h1Var3 = h3h1Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
            }
        }
        pl3Var2 = pl3Var;
        int i116 = i4 | i16;
        if ((i2 & 64) == 0) {
            iq20Var2 = iq20Var;
            if (x340Var.i(iq20Var2)) {
            }
            i5 = i116 | i18;
            i6 = i2 & 128;
            if (i6 != 0) {
                i8 = i5 | 12582912;
                h3h1Var2 = h3h1Var;
            } else {
                h3h1Var2 = h3h1Var;
                if (x340Var.i(h3h1Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i8 = i5 | i7;
            }
            if (x340Var.i(iu30Var)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i10 = i8 | i9;
            if ((38347923 & i10) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i10 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    } else {
                        xtb0VarA = xtb0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        c36Var2 = h36.a;
                    }
                    if ((i2 & 32) != 0) {
                        pl3Var2 = een.Z;
                    }
                    if ((i2 & 64) != 0) {
                        e9rVarA = wxa1.a(x340Var);
                        zG = x340Var.g(e9rVarA);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                    }
                    if (i6 != 0) {
                        h3h1Var4 = null;
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                    } else {
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                        h3h1Var4 = h3h1Var2;
                    }
                } else {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    } else {
                        xtb0VarA = xtb0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        c36Var2 = h36.a;
                    }
                    if ((i2 & 32) != 0) {
                        pl3Var2 = een.Z;
                    }
                    if ((i2 & 64) != 0) {
                        e9rVarA = wxa1.a(x340Var);
                        zG = x340Var.g(e9rVarA);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            x340Var.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                    }
                    if (i6 != 0) {
                        h3h1Var4 = null;
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                    } else {
                        xtb0Var4 = xtb0VarA;
                        vzq0Var3 = zzq0Var;
                        c36Var4 = c36Var2;
                        pl3Var4 = pl3Var2;
                        iq20Var4 = iq20Var2;
                        h3h1Var4 = h3h1Var2;
                    }
                }
                x340Var.s();
                if (h3h1Var4 != null) {
                    h3h1Var5 = h3h1Var4;
                } else {
                    h3h1Var5 = q6x.b;
                }
                qim0 qim0Var19 = qim0Var2;
                ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var19, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
                h3h1Var3 = h3h1Var4;
                qim0Var3 = qim0Var19;
                xtb0Var3 = xtb0Var4;
                vzq0Var2 = vzq0Var3;
                c36Var3 = c36Var4;
                pl3Var3 = pl3Var4;
                iq20Var3 = iq20Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                xtb0Var3 = xtb0Var2;
                vzq0Var2 = zzq0Var;
                c36Var3 = c36Var2;
                pl3Var3 = pl3Var2;
                iq20Var3 = iq20Var2;
                h3h1Var3 = h3h1Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
            }
        }
        iq20Var2 = iq20Var;
        i5 = i116 | i18;
        i6 = i2 & 128;
        if (i6 != 0) {
            i8 = i5 | 12582912;
            h3h1Var2 = h3h1Var;
        } else {
            h3h1Var2 = h3h1Var;
            if (x340Var.i(h3h1Var2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i8 = i5 | i7;
        }
        if (x340Var.i(iu30Var)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        i10 = i8 | i9;
        if ((38347923 & i10) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i10 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 2) != 0) {
                    xtb0VarA = aub0.a(0, x340Var, 3);
                } else {
                    xtb0VarA = xtb0Var2;
                }
                if ((i2 & 4) != 0) {
                    zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    c36Var2 = h36.a;
                }
                if ((i2 & 32) != 0) {
                    pl3Var2 = een.Z;
                }
                if ((i2 & 64) != 0) {
                    e9rVarA = wxa1.a(x340Var);
                    zG = x340Var.g(e9rVarA);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    } else {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    }
                    iq20Var2 = (ozr) objT;
                }
                if (i6 != 0) {
                    h3h1Var4 = null;
                    xtb0Var4 = xtb0VarA;
                    vzq0Var3 = zzq0Var;
                    c36Var4 = c36Var2;
                    pl3Var4 = pl3Var2;
                    iq20Var4 = iq20Var2;
                } else {
                    xtb0Var4 = xtb0VarA;
                    vzq0Var3 = zzq0Var;
                    c36Var4 = c36Var2;
                    pl3Var4 = pl3Var2;
                    iq20Var4 = iq20Var2;
                    h3h1Var4 = h3h1Var2;
                }
            } else {
                if (i11 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 2) != 0) {
                    xtb0VarA = aub0.a(0, x340Var, 3);
                } else {
                    xtb0VarA = xtb0Var2;
                }
                if ((i2 & 4) != 0) {
                    zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    c36Var2 = h36.a;
                }
                if ((i2 & 32) != 0) {
                    pl3Var2 = een.Z;
                }
                if ((i2 & 64) != 0) {
                    e9rVarA = wxa1.a(x340Var);
                    zG = x340Var.g(e9rVarA);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    } else {
                        objT = new ozr(e9rVarA);
                        x340Var.s0(objT);
                    }
                    iq20Var2 = (ozr) objT;
                }
                if (i6 != 0) {
                    h3h1Var4 = null;
                    xtb0Var4 = xtb0VarA;
                    vzq0Var3 = zzq0Var;
                    c36Var4 = c36Var2;
                    pl3Var4 = pl3Var2;
                    iq20Var4 = iq20Var2;
                } else {
                    xtb0Var4 = xtb0VarA;
                    vzq0Var3 = zzq0Var;
                    c36Var4 = c36Var2;
                    pl3Var4 = pl3Var2;
                    iq20Var4 = iq20Var2;
                    h3h1Var4 = h3h1Var2;
                }
            }
            x340Var.s();
            if (h3h1Var4 != null) {
                h3h1Var5 = h3h1Var4;
            } else {
                h3h1Var5 = q6x.b;
            }
            qim0 qim0Var110 = qim0Var2;
            ago1.b(h3h1Var5, apo.r(-889555306, new ta5(qim0Var110, xtb0Var4, vzq0Var3, c36Var4, pl3Var4, iq20Var4, iu30Var, (byte) 18), x340Var), x340Var, 48);
            h3h1Var3 = h3h1Var4;
            qim0Var3 = qim0Var110;
            xtb0Var3 = xtb0Var4;
            vzq0Var2 = vzq0Var3;
            c36Var3 = c36Var4;
            pl3Var3 = pl3Var4;
            iq20Var3 = iq20Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            xtb0Var3 = xtb0Var2;
            vzq0Var2 = zzq0Var;
            c36Var3 = c36Var2;
            pl3Var3 = pl3Var2;
            iq20Var3 = iq20Var2;
            h3h1Var3 = h3h1Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new arw(qim0Var3, xtb0Var3, vzq0Var2, c36Var3, pl3Var3, iq20Var3, h3h1Var3, iu30Var, i, i2);
        }
    }

    public static final void f(l060 l060Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        l060 l060Var2;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2023262166);
        if ((i & 6) == 0) {
            l060Var2 = l060Var;
            i2 = (x340Var.i(l060Var2) ? 4 : 2) | i;
        } else {
            l060Var2 = l060Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = (i2 >> 6) & 14;
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(qim0Var, false, new tu(ufh0Var, (byte) 12)), apo.i(x340Var, -1488813576, new uk20(ven0Var2, xhlVar, i3, new su(ven0Var, nilVar, (byte) 8), l060Var2, iu30Var)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 8), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(l060Var, iu30Var, qim0Var, i, (byte) 23);
        }
    }

    public static final void g(hux huxVar, int i, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(397120822);
        byte b2 = 2;
        int i3 = i2 | ((i2 & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.i(gbxVar) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ldx ldxVar = ldx.c;
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            wro1.h(gbxVar, ldxVar, u291.r(qim0Var, 48.0f), null, null, null, false, null, null, apo.r(1212064525, new q4f(i, huxVar, b2), x340Var), x340Var, (i3 >> 6) & 14, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(huxVar, i, gbxVar, qim0Var, i2);
        }
    }

    public static final void h(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-182204817);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(775059091);
            ipx ipxVar = ipx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131964111));
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(ipxVar, jslVar, u291.r(qim0Var, 12.0f), cbx.a(x340Var).b.c, 0L, true, x340Var, ipx.d | 196608, 16);
            x340Var.r(false);
        } else {
            x340Var.i0(775397363);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var, i, (byte) 25);
        }
    }

    public static final void i(xfx xfxVar, tja tjaVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1104159737);
        int i2 = i | (x340Var.i(xfxVar) ? 4 : 2) | (x340Var.i(tjaVar) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(xfxVar) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new umr0(xfxVar, iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(tjaVar);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new vmr0(tjaVar, (byte) 1);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0Var, (iu30) objT2, x340Var, (i2 >> 3) & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wmr0(xfxVar, tjaVar, qim0Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void j(boolean z, Function0 function0, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1382444799);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            cmx cmxVar = cmx.c;
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new us21(function0, (byte) 23);
                x340Var.s0(objT);
            }
            n9d1 n9d1Var = new n9d1(3, (Function0) objT, cmxVar);
            qim0 qim0Var3 = nim0.a;
            j2iVar2 = j2iVar;
            puo1.c(u291.f(qim0Var3, 1.0f), null, n9d1Var, z, apo.r(-450497621, new j2r0(j2iVar2, (byte) 11), x340Var), x340Var, 24576 | ((i2 << 9) & 7168), 2);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kb51(z, function0, qim0Var2, j2iVar2, i, (byte) 1);
        }
    }

    public static String k(rhc rhcVar, rhc[] rhcVarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int iD = rhcVar.d();
        int i5 = 0;
        while (i5 < iD) {
            int i6 = (i5 + iD) / 2;
            while (i6 > -1 && rhcVar.i(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (rhcVar.i(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bI = rhcVarArr[i10].i(i11);
                    byte[] bArr = w4n1.a;
                    int i13 = bI & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bI2 = rhcVar.i(i7 + i12);
                byte[] bArr2 = w4n1.a;
                i4 = i3 - (bI2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (rhcVarArr[i10].d() != i11) {
                    z2 = z;
                } else {
                    if (i10 == rhcVarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iD2 = rhcVarArr[i10].d() - i11;
                    int length = rhcVarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iD2 += rhcVarArr[i15].d();
                    }
                    if (iD2 >= i14) {
                        if (iD2 <= i14) {
                            return rhcVar.n(i7, i9 + i7).m(nne.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iD = i6;
        }
        return null;
    }

    public static k7h1 l() {
        return new k7h1();
    }

    public static qsd m(long j, b0k b0kVar, int i) {
        long jB = eah.b(j, b0kVar);
        return p((dah) ((x340) b0kVar).k(eah.a)).a(j, jB, u7h.k, u7h.b(jB, 0.38f, 0.0f, 0.0f, 0.0f, 14));
    }

    public static final ig10 n(nfa0 nfa0Var, r8i0 r8i0Var) {
        return new ig10(r8i0Var, new y1t0(nfa0Var, (byte) 10));
    }

    public static qd00 o(int i) {
        qd00 qd00Var = (qd00) qd00.b.get(Integer.valueOf(i));
        return qd00Var == null ? qd00.Y : qd00Var;
    }

    public static qsd p(dah dahVar) {
        qsd qsdVar = dahVar.Y;
        if (qsdVar != null) {
            return qsdVar;
        }
        qsd qsdVar2 = new qsd(eah.d(dahVar, 39), eah.a(dahVar, eah.d(dahVar, 39)), z4p1.t(u7h.b(eah.d(dahVar, 44), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 39)), u7h.b(eah.a(dahVar, eah.d(dahVar, 39)), 0.38f, 0.0f, 0.0f, 0.0f, 14));
        dahVar.Y = qsdVar2;
        return qsdVar2;
    }

    public static final xsb1 q(rtb1 rtb1Var) {
        switch (rtb1Var.ordinal()) {
            case 1:
                return xsb1.d;
            case 2:
                return xsb1.f;
            case 3:
                return xsb1.e;
            case 4:
                return xsb1.g;
            case 5:
                return xsb1.h;
            case 6:
                return xsb1.i;
            default:
                return xsb1.c;
        }
    }

    public static final void r(sim0 sim0Var) {
        if (!((pim0) sim0Var).a.N0 || sim0Var.n1(a) == null) {
            return;
        }
        bhn0.d();
    }

    public static int s() {
        return qd00.d;
    }

    public static final LinkedHashMap t(Stats stats) {
        h290<StatsItem> h290VarS = stats.s();
        int iS = zno1.s(q7h.U(h290VarS, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (StatsItem statsItem : h290VarS) {
            xsb1 xsb1VarQ = q(statsItem.r());
            xsb1 xsb1VarQ2 = q(statsItem.r());
            String strP = statsItem.p();
            d761 d761VarA = b761.a(statsItem.q());
            String imageUrl = statsItem.getImageUrl();
            imageUrl.getClass();
            if (ihc1.y0(imageUrl)) {
                imageUrl = null;
            }
            linkedHashMap.put(xsb1VarQ, new zsb1(xsb1VarQ2, strP, d761VarA, imageUrl, y(statsItem.o()), statsItem.n(), stats.r().p() != ftb1.b ? 2 : 1, null));
        }
        return linkedHashMap;
    }

    public static Set u() {
        return qd00.c;
    }

    public static final boolean v(ContextTrack contextTrack, boolean z) {
        return (l4o1.X(contextTrack) || (z && !l4o1.F(contextTrack))) && l4o1.Z(contextTrack);
    }

    public static final usb1 w(Stats stats, String str, int i, String str2, boolean z) {
        xkg0 xkg0VarT;
        nks0 nks0Var = new nks0(i);
        int i2 = z ? 2 : 1;
        if (z) {
            xkg0 xkg0Var = new xkg0();
            xkg0Var.putAll(t(stats));
            h290 h290VarQ = stats.q();
            int i3 = 10;
            int iS = zno1.s(q7h.U(h290VarQ, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            Iterator it = h290VarQ.iterator();
            while (it.hasNext()) {
                SocialStatsItem socialStatsItem = (SocialStatsItem) it.next();
                xsb1 xsb1VarQ = q(socialStatsItem.u());
                xsb1 xsb1VarQ2 = q(socialStatsItem.u());
                String strQ = socialStatsItem.q();
                d761 d761VarA = b761.a(socialStatsItem.t());
                if (!socialStatsItem.x()) {
                    d761VarA = null;
                }
                h290 h290VarR = socialStatsItem.r();
                ArrayList arrayList = new ArrayList();
                for (Object obj : h290VarR) {
                    String str3 = (String) obj;
                    str3.getClass();
                    if (!ihc1.y0(str3)) {
                        arrayList.add(obj);
                    }
                }
                String strP = socialStatsItem.p();
                vxh vxhVarY = y(socialStatsItem.o());
                if (!socialStatsItem.v()) {
                    vxhVarY = null;
                }
                if (vxhVarY == null) {
                    vxhVarY = vxh.a;
                }
                vxh vxhVar = vxhVarY;
                String strN = socialStatsItem.n();
                String strN2 = socialStatsItem.n();
                d761 d761VarA2 = (socialStatsItem.w() && socialStatsItem.s().q()) ? b761.a(socialStatsItem.s().p()) : null;
                h290<Person> h290VarO = socialStatsItem.s().o();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, i3));
                for (Person person : h290VarO) {
                    arrayList2.add(new ctb1(person.q(), person.getName()));
                    it = it;
                }
                linkedHashMap.put(xsb1VarQ, new atb1(xsb1VarQ2, strQ, d761VarA, arrayList, vxhVar, strN, strN2, d761VarA2, arrayList2, strP, false, false, 1024));
                it = it;
                i3 = 10;
            }
            xkg0Var.putAll(linkedHashMap);
            xkg0VarT = xkg0Var.b();
        } else {
            xkg0VarT = t(stats);
        }
        return new usb1(str, nks0Var, xkg0VarT, str2, i2, false);
    }

    public static b8h0 x(nha0 nha0Var, fcf0 fcf0Var) {
        nha0Var.c();
        p95 p95VarE = null;
        int i = 0;
        boolean zH = false;
        p95 p95VarB = null;
        while (nha0Var.g()) {
            String strD = nha0Var.D();
            strD.getClass();
            switch (strD) {
                case "o":
                    p95VarB = xpn1.B(nha0Var, fcf0Var);
                    break;
                case "pt":
                    p95VarE = xpn1.E(nha0Var, fcf0Var);
                    break;
                case "inv":
                    zH = nha0Var.h();
                    break;
                case "mode":
                    String strM = nha0Var.m();
                    strM.getClass();
                    switch (strM) {
                        case "a":
                            break;
                        case "i":
                            fcf0Var.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            i = 3;
                            continue;
                            break;
                        case "n":
                            i = 4;
                            continue;
                            break;
                        case "s":
                            i = 2;
                            continue;
                            break;
                        default:
                            nue0.c("Unknown mask mode " + strD + ". Defaulting to Add.");
                            break;
                    }
                    i = 1;
                    break;
                default:
                    nha0Var.v();
                    break;
            }
        }
        nha0Var.e();
        return new b8h0(i, p95VarE, p95VarB, zH);
    }

    public static final xxh y(PositionChangeLabel positionChangeLabel) {
        int i = etb1.a[positionChangeLabel.n().ordinal()];
        if (i == 1) {
            return new wxh(positionChangeLabel.p());
        }
        if (i == 2) {
            return new txh(positionChangeLabel.p());
        }
        if (i == 3) {
            return uxh.a;
        }
        vxh vxhVar = vxh.a;
        if (i != 4) {
            n57.s("Unknown change type, defaulting to None. ChangeType: " + positionChangeLabel.n());
        }
        return vxhVar;
    }

    public static Map z(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return mmn1.t;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                map2.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(map2);
    }
}
