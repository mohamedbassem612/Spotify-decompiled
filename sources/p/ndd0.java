package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ndd0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ur00 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndd0(byte b, lnm lnmVar, ur00 ur00Var) {
        super(3, lnmVar);
        this.a = b;
        this.e = ur00Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ur00 ur00Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                ndd0 ndd0Var = new ndd0((byte) 0, lnmVar, ur00Var);
                ndd0Var.c = vr20Var;
                ndd0Var.d = obj2;
                return ndd0Var.invokeSuspend(rih1Var);
            default:
                ndd0 ndd0Var2 = new ndd0((byte) 1, lnmVar, ur00Var);
                ndd0Var2.c = vr20Var;
                ndd0Var2.d = obj2;
                return ndd0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ur00 ur00Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = (bpb1) ur00Var.e;
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, bpb1Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((Boolean) obj3).getClass();
                m441 m441Var = new m441(new xtz(ur00Var, (lnm) null, (byte) 22));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, m441Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
