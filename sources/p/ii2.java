package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ii2 implements h0r0 {
    public final qyj a;
    public final ri2 b;
    public final f1n0 c;
    public final t3f0 d;
    public final i8h1 e;
    public final ihv0 f;
    public final cbr0 g;

    public ii2(qyj qyjVar, ri2 ri2Var, f1n0 f1n0Var, t3f0 t3f0Var, i8h1 i8h1Var, ihv0 ihv0Var) {
        int i;
        this.a = qyjVar;
        this.b = ri2Var;
        this.c = f1n0Var;
        this.d = t3f0Var;
        this.e = i8h1Var;
        this.f = ihv0Var;
        Object value = ri2Var.b.a.getValue();
        oi2 oi2Var = value instanceof oi2 ? (oi2) value : null;
        p6r0 p6r0VarU = lm5.u((oi2Var == null || (i = oi2Var.a) == 0) ? 1 : i);
        lik1 lik1Var = li2.b;
        this.g = new cbr0(new dbr0[]{new bn70(p6r0VarU, wm5.z(), (nar0) null), new q6b(2, true), new hgr0(egr0.a, 0, 2)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(-1120997224, new xb2(this, (byte) 5), true));
    }
}
