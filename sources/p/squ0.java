package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class squ0 {
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void a(oqu0 oqu0Var, kge kgeVar, String str, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        kge kgeVar2;
        qim0 qim0Var2;
        Enum r8;
        long j;
        Enum r33;
        qim0 qim0Var3;
        pl3 pl3Var;
        Function0 function1;
        vu30 vu30Var;
        c36 c36Var;
        ?? r2;
        x340 x340Var;
        float f;
        qim0 qim0Var4;
        String strUri;
        String str2 = oqu0Var.c;
        Integer num = oqu0Var.f;
        String str3 = oqu0Var.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1985002551);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(oqu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            kgeVar2 = kgeVar;
            i2 |= x340Var2.i(kgeVar2) ? 32 : 16;
        } else {
            kgeVar2 = kgeVar;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function0) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            ven0 ven0VarG = rwq.g(kgeVar2, PlayerState.builder().build(), (o8n) null, x340Var2, (i3 >> 3) & 14, 2);
            ContextTrack contextTrack = (ContextTrack) ((PlayerState) ven0VarG.getValue()).track().h();
            boolean zJ = u890.j((contextTrack == null || (strUri = contextTrack.uri()) == null) ? null : ihc1.Z0(strUri, "?"), ihc1.Z0(str3, "?"));
            Enum r10 = zkt0.c;
            if (!zJ) {
                r8 = r10;
            } else if (((PlayerState) ven0VarG.getValue()).isPaused()) {
                r8 = zkt0.b;
            } else if (((PlayerState) ven0VarG.getValue()).isPlaying()) {
                r8 = zkt0.a;
            } else {
                r8 = r10;
            }
            int iOrdinal = r8.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                x340Var2.i0(621999939);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var2).b.c;
                x340Var2.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw p3d1.k(x340Var2, 621996346, false);
                }
                x340Var2.i0(622002075);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var2).b.a;
                x340Var2.r(false);
            }
            long j2 = j;
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarN = anm1.N(str, bin.x(u291.b(0.0f, dsa0.m(x340Var2, 2131166077), 1, u291.f(qim0Var5, 1.0f)), false, (String) null, (pm31) null, (idn0) null, function0, 15));
            pl3 pl3Var2 = een.N0;
            c36 c36Var2 = h36.a;
            jw31 jw31VarA = ew31.a(c36Var2, pl3Var2, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            Function0 function2 = hmb0.t1;
            if (z) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            vu30 vu30Var2 = y580.O0;
            nko1.H(jw31VarA, x340Var2, vu30Var2);
            llj lljVar = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar2);
            nko1.F(x340Var2);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar3);
            qim0 qim0VarR = u291.r(qim0Var5, dsa0.m(x340Var2, 2131166076));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarR);
            x340Var2.m0();
            Enum r19 = r8;
            if (x340Var2.S) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, vu30Var2);
            nko1.H(xos0VarM2, x340Var2, lljVar);
            x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar3);
            if (num != null) {
                x340Var2.i0(-1375290118);
                qim0Var3 = qim0Var5;
                c36Var = c36Var2;
                r33 = r10;
                pl3Var = pl3Var2;
                vu30Var = vu30Var2;
                function1 = function2;
                r2 = 0;
                uwo1.e(String.valueOf(num.intValue()), (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2018);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                r33 = r10;
                qim0Var3 = qim0Var5;
                pl3Var = pl3Var2;
                function1 = function2;
                vu30Var = vu30Var2;
                c36Var = c36Var2;
                r2 = 0;
                x340Var2.i0(-1375070297);
                tm80.c(oqu0Var.d, false, h2c.a.b(qim0Var3), (xb10) null, x340Var2, 48, 8);
                x340Var = x340Var2;
                x340Var.r(false);
            }
            x340Var.r(true);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var6 = qim0Var3;
            qim0 qim0VarH = kx40.h(1.0f, uyn1.B(qim0Var6, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, (int) r2);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, vu30Var);
            nko1.H(xos0VarM3, x340Var, lljVar);
            x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar3);
            pl3 pl3Var3 = pl3Var;
            jw31 jw31VarA2 = ew31.a(c36Var, pl3Var3, x340Var, (int) r2);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0Var6);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, vu30Var);
            nko1.H(xos0VarM4, x340Var, lljVar);
            x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar3);
            if (r19 != r33) {
                x340Var.i0(-2128809648);
                x340 x340Var3 = x340Var;
                f = 8.0f;
                qim0Var4 = qim0Var6;
                wkt0.a(r19, anm1.N("playlist_preview_track_row:" + str3 + ":play_indicator", u291.r(qim0Var6, 14.0f)), null, 0L, false, x340Var3, 0, 28);
                x340Var = x340Var3;
                cvx cvxVar2 = cbx.b(x340Var).b;
                ab80.p(qim0Var4, 8.0f, x340Var, (boolean) r2);
            } else {
                f = 8.0f;
                qim0Var4 = qim0Var6;
                x340Var.i0(-2128478103);
                x340Var.r((boolean) r2);
            }
            x340 x340Var4 = x340Var;
            uwo1.e(oqu0Var.b, (qim0) null, cbx.d(x340Var).g, j2, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var4, 0, 0, 1714);
            x340Var2 = x340Var4;
            x340Var2.r(true);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = ywx0.k(qim0Var4, 2.0f, x340Var2, x340Var2).b;
            jw31 jw31VarA3 = ew31.a(new d36(f, true, new um5((boolean) r2)), pl3Var3, x340Var2, (int) r2);
            int iHashCode5 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM5 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(x340Var2, qim0Var4);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA3, x340Var2, vu30Var);
            nko1.H(xos0VarM5, x340Var2, lljVar);
            x0d.q(iHashCode5, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE5, x340Var2, lljVar3);
            if (oqu0Var.g) {
                x340Var2.i0(-1416855903);
                kqn1.d(2, 6, 2, x340Var2, (qim0) null);
                x340Var2.r((boolean) r2);
            } else {
                x340Var2.i0(-1416764608);
                x340Var2.r((boolean) r2);
            }
            if (str2.length() > 0) {
                x340Var2.i0(-1416703445);
                uwo1.e(str2, (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1714);
                x340Var2 = x340Var2;
                x340Var2.r((boolean) r2);
            } else {
                x340Var2.i0(-1416458080);
                x340Var2.r((boolean) r2);
            }
            us71.m(x340Var2, true, true, true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(oqu0Var, kgeVar, str, function0, qim0Var2, i, (byte) 16);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1691781236);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N(str, u291.b(0.0f, dsa0.m(x340Var, 2131166077), 1, u291.f(qim0Var3, 1.0f)));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarR = u291.r(qim0Var3, dsa0.m(x340Var, 2131166076));
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarR, jC, er31.b(4.0f));
            long jC2 = cbx.a(x340Var).a.b.c();
            cua cuaVar2 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(qim0VarF, jC2, er31.b(4.0f), 12), x340Var, 0);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0Var2 = qim0Var3;
            qim0 qim0VarH = kx40.h(1.0f, uyn1.B(qim0Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
            tm80.p(0.7f, 14.0f, x340Var, 6);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = ywx0.k(qim0Var2, 2.0f, x340Var, x340Var).b;
            tm80.p(0.45f, 12.0f, x340Var, 6);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 15);
        }
    }
}
