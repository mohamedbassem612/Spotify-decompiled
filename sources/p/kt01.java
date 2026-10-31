package p;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kt01 implements tyq, cvl1 {
    public final boolean N0;
    public final idd1 O0 = new idd1(new vwz0(this, (byte) 9));
    public final o3r P0;
    public final f4r Q0;
    public final js20 R0;
    public final it01 S0;
    public final psw T0;
    public final uqv0 X;
    public final gw70 Y;
    public final i3h Z;
    public final d0r a;
    public final bpb1 b;
    public final Context c;
    public final lo60 d;
    public final vgm e;
    public final agc0 f;
    public final vyq0 g;
    public final fgx h;
    public final zwm1 i;
    public final vh4 t;

    public kt01(d0r d0rVar, bpb1 bpb1Var, Context context, lo60 lo60Var, vgm vgmVar, agc0 agc0Var, vyq0 vyq0Var, fgx fgxVar, zwm1 zwm1Var, vh4 vh4Var, uqv0 uqv0Var, gw70 gw70Var, i3h i3hVar, w25 w25Var) {
        this.a = d0rVar;
        this.b = bpb1Var;
        this.c = context;
        this.d = lo60Var;
        this.e = vgmVar;
        this.f = agc0Var;
        this.g = vyq0Var;
        this.h = fgxVar;
        this.i = zwm1Var;
        this.t = vh4Var;
        this.X = uqv0Var;
        this.Y = gw70Var;
        this.Z = i3hVar;
        this.N0 = w25Var.N();
        jd11 jd11Var = rc11.a;
        byte b = 13;
        o3r o3rVarJ = w3p1.j(new l4r(new wlu(jd11Var.b(jo70.class)), 2, jt01.c, new j4r(new ldz0(this, (byte) 13)), jt01.d), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, jt01.e, new j4r(new ldz0(this, (byte) 14)), jt01.f), new l4r(hvm.e, 2, jt01.g, new j4r(mm01.a1), jt01.h), new l4r(pwc0.A, 2, jt01.i, new j4r(mm01.b1), jt01.t), new l4r(pwc0.y, 2, jt01.X, new j4r(mm01.c1), mm01.d1), new l4r(pwc0.z, 2, mm01.e1, new j4r(new ht01(this, (byte) 2)), jt01.b), mcm.X);
        this.P0 = o3rVarJ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o3rVarJ);
        byte b2 = 1;
        this.Q0 = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.R0 = z0o1.j(new ht01(this, (byte) 0), new ziz0(this, b), new ht01(this, b2), 4);
        this.S0 = new it01();
        j2i j2iVar = new j2i(920128002, new dr01(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.T0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.S0;
    }

    public final jsw c() {
        return this.T0;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.R0;
    }

    public final f4r getData() {
        return this.Q0;
    }
}
