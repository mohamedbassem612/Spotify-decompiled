package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tno extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v5n e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tno(lnm lnmVar, v5n v5nVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = v5nVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        v5n v5nVar = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                tno tnoVar = new tno(lnmVar, v5nVar, (byte) 0);
                tnoVar.c = vr20Var;
                tnoVar.d = obj2;
                return tnoVar.invokeSuspend(rih1Var);
            default:
                tno tnoVar2 = new tno(lnmVar, v5nVar, (byte) 1);
                tnoVar2.c = vr20Var;
                tnoVar2.d = obj2;
                return tnoVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        v5n v5nVar = this.e;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    String str = (String) obj2;
                    huz huzVar = ihc1.y0(str) ? new huz((Object) null, (byte) 10) : new wef(yoi1.g(v5nVar.b(str)), (byte) 16);
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (l4p1.s(vr20Var, huzVar, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(v5nVar.b((String) obj3));
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    u4p1.S(vr20Var2);
                    Object objCollect = ezcVarG.collect(new rir(vr20Var2, (byte) 16), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
