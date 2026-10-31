package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zof0 extends hab0 implements zu30 {
    public final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zof0(long j) {
        super(4);
        this.a = j;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 129) != 128)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var2).e.b;
            cvx cvxVar = cbx.b(x340Var2).b;
            t1c.a(cwl1.l0(u291.h(uyn1.y(qim0VarF, f, 8.0f), cbx.b(x340Var2).b.b), this.a, (hw61) null, 10), x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
