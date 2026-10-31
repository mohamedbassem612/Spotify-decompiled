package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y0q0 implements tyq {
    public final ia00 X;
    public final psw Y;
    public final d0r a;
    public final z6k0 b;
    public final rxj0 c;
    public final jbk0 d;
    public final ll30 e;
    public final ylt0 f;
    public final iu30 g;
    public final o3r h;
    public final js20 i;
    public final i4r t;

    public y0q0(xlt0 xlt0Var, d0r d0rVar, r0s0 r0s0Var, a5m a5mVar, lc20 lc20Var, t0b t0bVar, z6k0 z6k0Var, rxj0 rxj0Var, jbk0 jbk0Var, ll30 ll30Var, q8n q8nVar) {
        this.a = d0rVar;
        this.b = z6k0Var;
        this.c = rxj0Var;
        this.d = jbk0Var;
        this.e = ll30Var;
        this.f = r0s0Var.r(xlt0Var);
        vlt0 vlt0Var = xlt0Var instanceof vlt0 ? (vlt0) xlt0Var : null;
        i5w i5wVar = vlt0Var != null ? vlt0Var.b : null;
        this.g = i5wVar;
        jd11 jd11Var = rc11.a;
        l4r l4rVar = new l4r(new xv00(jd11Var.b(jo70.class)), 2, cwp0.X, new j4r(cwp0.f), cwp0.Y);
        l4r l4rVar2 = new l4r(new xv00(jd11Var.b(hll.class)), 2, cwp0.Z, new j4r(cwp0.g), cwp0.N0);
        l4r l4rVar3 = new l4r(pwc0.b, 2, cwp0.O0, new j4r(new nrj0(this, (byte) 27)), cwp0.P0);
        hvm hvmVar = hvm.d;
        o3r o3rVarN = q3p1.n(p7h.M(new o3r[]{a5mVar.a, (o3r) lc20Var.d, w3p1.k(l4rVar, l4rVar2, l4rVar3, new l4r(hvmVar, 2, cwp0.Q0, new j4r(cwp0.h), cwp0.R0), new l4r(hvmVar, 2, cwp0.S0, new j4r(cwp0.i), cwp0.t), new aso0(this, (byte) 16))}), new jrf(mgn0.h, (byte) 1));
        o3rVarN = i5wVar == null ? q3p1.n(p7h.M(new o3r[]{o3rVarN, t0bVar.b}), new pm0(w0q0.c, (byte) 2)) : o3rVarN;
        this.h = o3rVarN;
        this.i = a4p1.h(new v0q0(this, (byte) 0), new v0q0(this, (byte) 1), w0q0.b, q8nVar, new v0q0(this, (byte) 2));
        this.t = new i4r(new nrj0(this, (byte) 26), o3rVarN);
        this.X = n3o1.q(this).a(rmp0.N0, rmp0.O0);
        j2i j2iVar = t4j.a;
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Y;
    }

    public final d0r e() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    public final s0q0 f(p0q0 p0q0Var, u0q0 u0q0Var, ast0 ast0Var, Set set) {
        i0q0 g0q0Var;
        String str;
        y4m y4mVar = u0q0Var.a;
        r840 r840Var = u0q0Var.b;
        r0q0 r0q0Var = u0q0Var.c;
        String str2 = r0q0Var.a;
        String strY = rc2.y(p0q0Var);
        Set set2 = s4b1.f;
        v5b1 v5b1Var = uic.x(strY).d;
        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
            ibk0 ibk0Var = r0q0Var.d;
            t0q0 t0q0Var = r0q0Var.c;
            Map map = t0q0Var.b;
            if (ibk0Var.a()) {
                this.b.getClass();
                if (z6k0.a(map)) {
                    g0q0Var = new g0q0(this.c.d, !t0q0Var.a && Boolean.parseBoolean((String) map.get("has-custom-transitions")));
                } else {
                    g0q0Var = h0q0.a;
                }
            } else {
                g0q0Var = h0q0.a;
            }
        } else {
            g0q0Var = h0q0.a;
        }
        boolean z = r0q0Var.b;
        String strY2 = rc2.y(p0q0Var);
        j840 j840Var = r840Var instanceof j840 ? (j840) r840Var : null;
        if (j840Var != null && (str = j840Var.b) != null) {
            strY2 = str;
        }
        return new s0q0(y4mVar, r840Var, ast0Var, str2, g0q0Var, z, set.contains(strY2));
    }

    public final mqw getBehavior() {
        return this.i;
    }

    public final f4r getData() {
        return this.t;
    }
}
