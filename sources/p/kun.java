package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kun implements syq {
    public final fai0 N0;
    public final WorkRunner O0;
    public final boolean P0;
    public final o3r Q0;
    public final i4r R0;
    public final e7m0 S0;
    public final eih1 T0;
    public final nsw U0;
    public final String X;
    public final String Y;
    public final nx50 Z;
    public final lls0 a;
    public final xfx b;
    public final qp11 c;
    public final asn d;
    public final iac0 e;
    public final ymd0 f;
    public final ymd0 g;
    public final fai0 h;
    public final quc0 i;
    public final d0r t;

    public kun(lls0 lls0Var, xfx xfxVar, qp11 qp11Var, asn asnVar, iac0 iac0Var, ymd0 ymd0Var, ymd0 ymd0Var2, fai0 fai0Var, quc0 quc0Var, d0r d0rVar, String str, String str2, nx50 nx50Var, fai0 fai0Var2, boolean z) {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        ImmediateWorkRunner immediateWorkRunner = new ImmediateWorkRunner();
        this.a = lls0Var;
        this.b = xfxVar;
        this.c = qp11Var;
        this.d = asnVar;
        this.e = iac0Var;
        this.f = ymd0Var;
        this.g = ymd0Var2;
        this.h = fai0Var;
        this.i = quc0Var;
        this.t = d0rVar;
        this.X = str;
        this.Y = str2;
        this.Z = nx50Var;
        this.N0 = fai0Var2;
        this.O0 = immediateWorkRunner;
        this.P0 = z;
        jd11 jd11Var = rc11.a;
        o3r o3rVarJ = w3p1.j(new l4r(new xv00(jd11Var.b(xkk1.class)), 3, eln.T0, new j4r(eln.X0), eln.U0), new l4r(new xv00(jd11Var.b(xkk1.class)), 3, eln.V0, new j4r(new kak(str2, (byte) 24)), eln.W0), new l4r(new xv00(jd11Var.b(a7q0.class)), 2, eln.Y, new j4r(eln.Y0), eln.Z), new l4r(new wlu(jd11Var.b(jo70.class)), 2, eln.N0, new j4r(eln.Z0), eln.O0), new l4r(new xv00(jd11Var.b(mdz.class)), 2, eln.P0, new j4r(eln.a1), eln.Q0), new l4r(new xv00(jd11Var.b(va81.class)), 2, eln.R0, new j4r(eln.b1), eln.S0), new sw1(str2, (byte) 8));
        this.Q0 = o3rVarJ;
        this.R0 = new i4r(eln.X, o3rVarJ);
        this.S0 = sbl.z(new gun(new dun(false), false), new dq7(this, (byte) 6), new ku1(this, (byte) 7), wmn.e, new fnn(this, (byte) 1));
        this.T0 = new eih1();
        this.U0 = jch0.j(new cml(this, (byte) 13));
    }

    public final rqw a() {
        return this.T0;
    }

    public final rsw c() {
        return this.U0;
    }

    public final d0r e() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.S0;
    }

    public final f4r getData() {
        return this.R0;
    }
}
