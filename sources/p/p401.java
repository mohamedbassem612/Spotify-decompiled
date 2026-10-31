package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p401 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ o501 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ hdn0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ e601 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p401(boolean z, boolean z2, boolean z3, o501 o501Var, ven0 ven0Var, hdn0 hdn0Var, boolean z4, e601 e601Var) {
        super(2);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = o501Var;
        this.e = ven0Var;
        this.f = hdn0Var;
        this.g = z4;
        this.h = e601Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.a;
            boolean z2 = z && !this.b;
            boolean z3 = this.c;
            qim0 qim0VarY = nim0.a;
            qim0 qim0VarZ = (!z3 || z2) ? u291.z(u291.f(qim0VarY, 1.0f), (fra) null, 3) : u291.d(u291.j(390.0f, 0.0f, 2, qim0VarY), 1.0f);
            o501 o501Var = this.d;
            if (o501Var.a && !z) {
                qim0VarY = voo1.y(qim0VarY, voo1.g);
            }
            qim0 qim0VarL = bmq0.L(i1p1.q(o0c.d(qim0VarZ.then(qim0VarY), (ni20) null, 3), er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12)), k1o1.q(x340Var2), (g6o0) null);
            uwr uwrVar = cbx.a;
            w3d1.a(dug.f(qim0VarL, cbx.a(x340Var2).a.a.a(), d4o1.a), (hw61) null, 0L, 0L, 0.0f, 0.0f, (qqb) null, apo.r(-1074351830, new erc(this.e, this.f, o501Var, this.g, z2, this.h), x340Var2), x340Var2, 12582912, 126);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
