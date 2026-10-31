package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ov11 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ n4m d;
    public final /* synthetic */ bv11 e;
    public final /* synthetic */ q1v f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ iix0 i;
    public final /* synthetic */ j2i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov11(boolean z, c380 c380Var, boolean z2, n4m n4mVar, bv11 bv11Var, q1v q1vVar, boolean z3, boolean z4, iix0 iix0Var, j2i j2iVar) {
        super(2);
        this.a = z;
        this.b = c380Var;
        this.c = z2;
        this.d = n4mVar;
        this.e = bv11Var;
        this.f = q1vVar;
        this.g = z3;
        this.h = z4;
        this.i = iix0Var;
        this.t = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0VarF = u291.f(pqo.h(nim0.a, this.a), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            k5p1.d(qim0VarF, new d36(4.0f, true, new um5(false)), h36.d, null, 0, 0, apo.r(598857705, new lv11(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t), x340Var2), x340Var2, 1572864, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
