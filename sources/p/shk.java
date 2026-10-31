package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class shk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ kba e;
    public final /* synthetic */ dg8 f;
    public final /* synthetic */ yqg g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shk(Object obj, lnm lnmVar, kba kbaVar, dg8 dg8Var, yqg yqgVar, boolean z, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = kbaVar;
        this.f = dg8Var;
        this.g = yqgVar;
        this.h = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                shk shkVar = new shk(this.d, lnmVar, this.e, this.f, this.g, this.h, (byte) 0);
                shkVar.c = obj;
                return shkVar;
            default:
                shk shkVar2 = new shk(this.d, lnmVar, this.e, this.f, this.g, this.h, (byte) 1);
                shkVar2.c = obj;
                return shkVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                vr20 vr20Var = (vr20) this.c;
                String str = ((wfk) obj2).e;
                this.c = null;
                this.b = true;
                return jik.f(vr20Var, str, this.e, this.f, this.g, this.h, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                vr20 vr20Var2 = (vr20) this.c;
                String str2 = ((pfk) obj2).e;
                this.c = null;
                this.b = true;
                return jik.c(vr20Var2, str2, this.e, this.f, this.g, this.h, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
