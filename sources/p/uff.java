package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uff implements h0r0 {
    public final wgq A;
    public final vgq B;
    public final bqm C;
    public final h7q D;
    public final jed0 E;
    public final h9n F;
    public final dfd G;
    public final gv2 H;
    public final ahq I;
    public final bhq J;
    public final u1q K;
    public final dhq L;
    public final fhq M;
    public final v1q N;
    public final f5p O;
    public final v4p P;
    public final ghq Q;
    public final ihq R;
    public final khq S;
    public final yuu0 T;
    public final lhq U;
    public final ahu0 V;
    public final mhq W;
    public final nhq X;
    public final ohq Y;
    public final w4p Z;
    public final lik1 a;
    public final x4p a0;
    public final Context b;
    public final ynb0 b0;
    public final d0r c;
    public final pbr0 c0;
    public final lzn0 d;
    public final r3d d0;
    public final tgf e;
    public final igq e0;
    public final em0 f;
    public final res f0;
    public final l5f g;
    public final rwj g0;
    public final quc0 h;
    public final qkr h0;
    public final woa i;
    public final yqg i0;
    public final add j;
    public final cyp j0;
    public final jgq k;
    public final c9n k0;
    public final yuj l;
    public final q8n l0;
    public final kma m;
    public final boolean m0;
    public final rgq n;
    public final cbr0 n0;
    public final lte o;
    public final idd1 o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kly0 f119p;
    public final idd1 p0;
    public final fpf q;
    public final e5p r;
    public final i2j0 s;
    public final gqo0 t;
    public final dto0 u;
    public final kly0 v;
    public final t1q w;
    public final e821 x;
    public final z6q y;
    public final ugq z;

    /* JADX WARN: Multi-variable type inference failed */
    public uff(lik1 lik1Var, Context context, d0r d0rVar, lzn0 lzn0Var, tgf tgfVar, em0 em0Var, l5f l5fVar, quc0 quc0Var, woa woaVar, add addVar, jgq jgqVar, yuj yujVar, kma kmaVar, rgq rgqVar, lte lteVar, jly0 jly0Var, fpf fpfVar, e5p e5pVar, i2j0 i2j0Var, gqo0 gqo0Var, dto0 dto0Var, jly0 jly0Var2, t1q t1qVar, e821 e821Var, z6q z6qVar, ugq ugqVar, ngq ngqVar, ogq ogqVar, wgq wgqVar, vgq vgqVar, bqm bqmVar, xgq xgqVar, h7q h7qVar, jed0 jed0Var, h9n h9nVar, dfd dfdVar, gv2 gv2Var, ahq ahqVar, bhq bhqVar, u1q u1qVar, dhq dhqVar, fhq fhqVar, v1q v1qVar, f5p f5pVar, v4p v4pVar, ghq ghqVar, ihq ihqVar, khq khqVar, yuu0 yuu0Var, lhq lhqVar, ahu0 ahu0Var, mhq mhqVar, nhq nhqVar, ohq ohqVar, w4p w4pVar, x4p x4pVar, ynb0 ynb0Var, pbr0 pbr0Var, r3d r3dVar, igq igqVar, res resVar, rwj rwjVar, qkr qkrVar, yqg yqgVar, cyp cypVar, byb1 byb1Var, ztw0 ztw0Var, yko ykoVar, c9n c9nVar, q8n q8nVar) {
        this.a = lik1Var;
        this.b = context;
        this.c = d0rVar;
        this.d = lzn0Var;
        this.e = tgfVar;
        this.f = em0Var;
        this.g = l5fVar;
        this.h = quc0Var;
        this.i = woaVar;
        this.j = addVar;
        this.k = jgqVar;
        this.l = yujVar;
        this.m = kmaVar;
        this.n = rgqVar;
        this.o = lteVar;
        this.f119p = jly0Var;
        this.q = fpfVar;
        this.r = e5pVar;
        this.s = i2j0Var;
        this.t = gqo0Var;
        this.u = dto0Var;
        this.v = jly0Var2;
        this.w = t1qVar;
        this.x = e821Var;
        this.y = z6qVar;
        this.z = ugqVar;
        this.A = wgqVar;
        this.B = vgqVar;
        this.C = bqmVar;
        this.D = h7qVar;
        this.E = jed0Var;
        this.F = h9nVar;
        this.G = dfdVar;
        this.H = gv2Var;
        this.I = ahqVar;
        this.J = bhqVar;
        this.K = u1qVar;
        this.L = dhqVar;
        this.M = fhqVar;
        this.N = v1qVar;
        this.O = f5pVar;
        this.P = v4pVar;
        this.Q = ghqVar;
        this.R = ihqVar;
        this.S = khqVar;
        this.T = yuu0Var;
        this.U = lhqVar;
        this.V = ahu0Var;
        this.W = mhqVar;
        this.X = nhqVar;
        this.Y = ohqVar;
        this.Z = w4pVar;
        this.a0 = x4pVar;
        this.b0 = ynb0Var;
        this.c0 = pbr0Var;
        this.d0 = r3dVar;
        this.e0 = igqVar;
        this.f0 = resVar;
        this.g0 = rwjVar;
        this.h0 = qkrVar;
        this.i0 = yqgVar;
        this.j0 = cypVar;
        this.k0 = c9nVar;
        this.l0 = q8nVar;
        boolean zB = tgfVar.b();
        this.m0 = zB;
        smc0 smc0VarN = k4p1.n();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        smc0VarN.add(new bn70(yon1.p0(), lik1Var, (nar0) null));
        smc0VarN.add(new j0c0(mno1.e));
        if (zB) {
            smc0VarN.add(new hgr0(egr0.a, 2));
            smc0VarN.add(new tc30(1));
        } else {
            smc0VarN.add(new hgr0((ggr0) null, 2, 1));
        }
        smc0VarN.add(new q1r0(true));
        smc0VarN.add(new x7u0());
        smc0VarN.add(new kce0());
        smc0VarN.add(new t1r0(true));
        smc0VarN.add(new e5b0(30, p7h.M(new qua0[]{byb1Var, ztw0Var, yko.b(ykoVar, new ro8(this, (lnm) null, (byte) 3))}), (List) null));
        smc0VarN.add(new s9h1(14, true, false, false));
        smc0VarN.add(new ktl1(16));
        if (zB) {
            smc0VarN.add(new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837));
        }
        dbr0[] dbr0VarArr = (dbr0[]) k4p1.k(smc0VarN).toArray(new dbr0[0]);
        this.n0 = new cbr0((dbr0[]) Arrays.copyOf(dbr0VarArr, dbr0VarArr.length), false);
        this.o0 = new idd1(new pff(this, (byte) 0));
        this.p0 = new idd1(new pff(this, (byte) 1));
    }

    public final cbr0 a() {
        return this.n0;
    }

    public final p2r0 b() {
        return yuj.b(this.l, f610.e(new p6e0[0], new dt0(this, (lnm) null, (byte) 25)), apo.j(1557340420, new zee(this, (byte) 9), true), new n7e0(new off(this), eqe.h, ios.O0, nve.N0));
    }

    public final z9x c() {
        return (z9x) this.o0.getValue();
    }

    public final ArrayList d(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!u890.j(((w4i1) obj).getUsername(), this.e.a())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
