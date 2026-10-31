package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ltw extends a8d1 implements vu30 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ q811 b;
    public final /* synthetic */ guj c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltw(Object obj, q811 q811Var, guj gujVar, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.a = obj;
        this.b = q811Var;
        this.c = gujVar;
        this.d = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ltw(this.a, this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ltw ltwVarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        ltwVarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        q811 q811Var = this.b;
        Object obj2 = q811Var.a;
        Object obj3 = this.a;
        if (!u890.j(obj3, obj2)) {
            q811Var.a = obj3;
            guj gujVar = this.c;
            if (!gujVar.b.w()) {
                gujVar.b.C(obj3);
            }
        }
        return rih1.a;
    }
}
