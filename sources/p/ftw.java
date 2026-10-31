package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ftw extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ ven0 Y;
    public /* synthetic */ Object a;
    public final /* synthetic */ q811 b;
    public final /* synthetic */ px20 c;
    public final /* synthetic */ q811 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ q811 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftw(q811 q811Var, px20 px20Var, q811 q811Var2, String str, iu30 iu30Var, q811 q811Var3, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, lnm lnmVar) {
        super(2, lnmVar);
        this.b = q811Var;
        this.c = px20Var;
        this.d = q811Var2;
        this.e = str;
        this.f = iu30Var;
        this.g = q811Var3;
        this.h = ven0Var;
        this.i = ven0Var2;
        this.t = ven0Var3;
        this.X = ven0Var4;
        this.Y = ven0Var5;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ftw ftwVar = new ftw(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, lnmVar);
        ftwVar.a = obj;
        return ftwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ftw ftwVarCreate = create((op80) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        ftwVarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        op80 op80Var = (op80) this.a;
        hm5.M(obj);
        q811 q811Var = this.b;
        op80 op80Var2 = (op80) q811Var.a;
        q811Var.a = op80Var;
        auw auwVarI = sap1.i(op80Var);
        q811 q811Var2 = this.d;
        if (auwVarI != null) {
            tka0 tka0Var = otw.a;
            this.h.setValue(auwVarI);
            q811 q811Var3 = this.g;
            if (!u890.j(q811Var3.a, auwVarI)) {
                q811Var3.a = auwVarI;
                q811Var2.a = auwVarI.create();
            }
        }
        nml nmlVarH = hap1.h(op80Var);
        if (nmlVarH != null) {
            tka0 tka0Var2 = otw.a;
            this.i.setValue(nmlVarH);
        }
        i6r0 i6r0VarY = qon1.y(op80Var);
        tka0 tka0Var3 = otw.a;
        this.t.setValue(i6r0VarY);
        if (!u890.j(op80Var2, op80Var)) {
            ven0 ven0Var = this.X;
            if (!((guj) ven0Var.getValue()).b.b) {
                Object value = this.Y.getValue();
                guj gujVar = (guj) ven0Var.getValue();
                int i = this.c.f;
                Object obj2 = q811Var2.a;
                if (obj2 == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                otw.f(value, gujVar, i, (ztw) obj2, op80Var, this.e, this.f);
            }
        }
        return rih1.a;
    }
}
