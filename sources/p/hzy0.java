package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hzy0 extends a8d1 implements vu30 {
    public psw0 a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ izy0 g;
    public final /* synthetic */ dzy0 h;
    public final /* synthetic */ fzy0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzy0(String str, long j, long j2, izy0 izy0Var, dzy0 dzy0Var, fzy0 fzy0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = str;
        this.e = j;
        this.f = j2;
        this.g = izy0Var;
        this.h = dzy0Var;
        this.i = fzy0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        hzy0 hzy0Var = new hzy0(this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
        hzy0Var.c = obj;
        return hzy0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        psw0 psw0Var;
        psw0 psw0Var2 = (nsw0) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            psw0 psw0Var3 = psw0Var2;
            psw0Var3.setValue((Object) null);
            fns fnsVar = igu.a;
            n0c0 n0c0Var = new n0c0(this.d, this.e, this.f, this.g, this.h, this.i, (lnm) null);
            this.c = null;
            this.a = psw0Var3;
            this.b = true;
            Object objY = fn31.Y(fnsVar, n0c0Var, this);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            obj2 = objY;
            psw0Var = psw0Var3;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            psw0Var = this.a;
            hm5.M(obj);
            obj2 = obj;
        }
        psw0Var.setValue(obj2);
        return rih1.a;
    }
}
