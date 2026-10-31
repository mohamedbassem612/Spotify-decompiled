package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w9c1 extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9c1(int i, boolean z) {
        super(3);
        this.a = z;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qim0 qim0Var = (qim0) obj;
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(999200112);
        Object objT = x340Var.T();
        Object obj4 = fkj0.X;
        if (objT == obj4) {
            objT = new ceo(0.3f, 0.0f, 0.4f, 1.0f);
            x340Var.s0(objT);
        }
        ceo ceoVar = (ceo) objT;
        wat watVar = (wat) x340Var.k(t4k.h);
        boolean zG = x340Var.g(watVar);
        Object objT2 = x340Var.T();
        if (zG || objT2 == obj4) {
            objT2 = Float.valueOf(watVar.X0(8.0f));
            x340Var.s0(objT2);
        }
        float fFloatValue = ((Number) objT2).floatValue();
        boolean z = this.a;
        if (z) {
            fFloatValue = 0.0f;
        }
        int i = this.b;
        tob1 tob1VarB = z95.b(fFloatValue, new pxg1(400, i, ceoVar), "translationYAnimation", (iu30) null, x340Var, 3072, 20);
        tob1 tob1VarB2 = z95.b(z ? 1.0f : 0.0f, new pxg1(400, i, ceoVar), "alphaAnimation", (iu30) null, x340Var, 3072, 20);
        boolean zG2 = x340Var.g(tob1VarB2) | x340Var.g(tob1VarB);
        Object objT3 = x340Var.T();
        if (zG2 || objT3 == obj4) {
            objT3 = new dy(tob1VarB2, tob1VarB, (byte) 10);
            x340Var.s0(objT3);
        }
        qim0 qim0VarC = i541.C(qim0Var, (iu30) objT3);
        x340Var.r(false);
        return qim0VarC;
    }
}
