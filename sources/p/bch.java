package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bch implements vr20 {
    public final /* synthetic */ o8n a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ rsw0 c;
    public final /* synthetic */ vr20 d;
    public final /* synthetic */ xu30 e;
    public final /* synthetic */ gaa0 f;

    public bch(o8n o8nVar, Object obj, rsw0 rsw0Var, vr20 vr20Var, xu30 xu30Var, gaa0 gaa0Var) {
        this.a = o8nVar;
        this.b = obj;
        this.c = rsw0Var;
        this.d = vr20Var;
        this.e = xu30Var;
        this.f = gaa0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        ach achVar;
        if (lnmVar instanceof ach) {
            achVar = (ach) lnmVar;
            int i = achVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                achVar.c = i - Integer.MIN_VALUE;
            } else {
                achVar = new ach(this, lnmVar);
            }
        } else {
            achVar = new ach(this, lnmVar);
        }
        Object obj2 = achVar.a;
        int i2 = achVar.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        xd1 xd1Var = new xd1(this.c, this.d, this.e, obj, this.f, (lnm) null);
        achVar.c = 1;
        Object objX = blo1.x(this.a, rih1Var, this.b, xd1Var, achVar);
        d9n d9nVar = d9n.a;
        return objX == d9nVar ? d9nVar : rih1Var;
    }
}
