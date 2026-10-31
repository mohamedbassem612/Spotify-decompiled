package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mv3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ pv3 e;
    public vr20 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv3(Object obj, lnm lnmVar, pv3 pv3Var, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = pv3Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        pv3 pv3Var = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                mv3 mv3Var = new mv3(obj2, lnmVar, pv3Var, (byte) 0);
                mv3Var.c = obj;
                return mv3Var;
            default:
                mv3 mv3Var2 = new mv3(obj2, lnmVar, pv3Var, (byte) 1);
                mv3Var2.c = obj;
                return mv3Var2;
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
        vr20 vr20Var;
        vr20 vr20Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pv3 pv3Var = this.e;
        int i = 0;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    vr20Var = (vr20) this.c;
                    yu3 yu3Var = pv3Var.b;
                    hqq0 hqq0Var = ((su3) obj2).a;
                    this.c = null;
                    this.f = vr20Var;
                    this.g = 0;
                    this.b = (byte) 1;
                    obj = yu3Var.l(hqq0Var, this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                i = this.g;
                vr20Var = this.f;
                hm5.M(obj);
                this.c = null;
                this.f = null;
                this.g = i;
                this.b = (byte) 2;
                if (vr20Var.emit(obj, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    vr20Var2 = (vr20) this.c;
                    yu3 yu3Var2 = pv3Var.b;
                    String str = ((tu3) obj2).a;
                    this.c = null;
                    this.f = vr20Var2;
                    this.g = 0;
                    this.b = (byte) 1;
                    obj = yu3Var2.m(str, this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                i = this.g;
                vr20Var2 = this.f;
                hm5.M(obj);
                this.c = null;
                this.f = null;
                this.g = i;
                this.b = (byte) 2;
                if (vr20Var2.emit(obj, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
