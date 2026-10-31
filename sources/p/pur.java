package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pur extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ MobiusLoop d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pur(MobiusLoop mobiusLoop, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = mobiusLoop;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        MobiusLoop mobiusLoop = this.d;
        switch (b) {
            case 0:
                pur purVar = new pur(mobiusLoop, lnmVar, (byte) 0);
                purVar.c = obj;
                return purVar;
            default:
                pur purVar2 = new pur(mobiusLoop, lnmVar, (byte) 1);
                purVar2.c = obj;
                return purVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ssw0 ssw0Var = (ssw0) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(ssw0Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        MobiusLoop mobiusLoop = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                ssw0 ssw0Var = (ssw0) this.c;
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
                sqm sqmVar = new sqm(mobiusLoop.b(new our(ssw0Var, (byte) 0)), mobiusLoop, (byte) 28);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, sqmVar, this) == d9nVar ? d9nVar : rih1Var;
            default:
                ssw0 ssw0Var2 = (ssw0) this.c;
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
                w7m0 w7m0Var = new w7m0(mobiusLoop.b(new our(ssw0Var2, (byte) 2)), (byte) 1);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var2, w7m0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
