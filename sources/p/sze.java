package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sze extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ o0f e;
    public vr20 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sze(Object obj, lnm lnmVar, o0f o0fVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = o0fVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        o0f o0fVar = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                sze szeVar = new sze(obj2, lnmVar, o0fVar, (byte) 0);
                szeVar.c = obj;
                return szeVar;
            default:
                sze szeVar2 = new sze(obj2, lnmVar, o0fVar, (byte) 1);
                szeVar2.c = obj;
                return szeVar2;
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
        Object objC;
        vr20 vr20Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o0f o0fVar = this.e;
        int i = 0;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    vr20Var = (vr20) this.c;
                    n801 n801Var = o0fVar.f;
                    String str = ((oxe) obj2).a;
                    this.c = null;
                    this.f = vr20Var;
                    this.g = 0;
                    this.b = (byte) 1;
                    objC = n801Var.c(str, this);
                    if (objC != d9nVar) {
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
                objC = ((e331) obj).a;
                if (!(objC instanceof m231)) {
                    return rih1Var;
                }
                this.c = null;
                this.f = null;
                this.g = i;
                this.b = (byte) 2;
                if (vr20Var.emit(f1f.a, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    vr20Var2 = (vr20) this.c;
                    lxh1 lxh1Var = o0fVar.y;
                    String str2 = ((lxe) obj2).a;
                    this.c = null;
                    this.f = vr20Var2;
                    this.g = 0;
                    this.b = (byte) 1;
                    obj = lxh1Var.m(str2, this);
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
