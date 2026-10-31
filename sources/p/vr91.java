package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vr91 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ o95 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pxg1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr91(o95 o95Var, boolean z, pxg1 pxg1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = o95Var;
        this.c = z;
        this.d = pxg1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new vr91(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Float fO = yah0.o(this.c ? 1.0f : 0.8f);
            this.a = true;
            Object objB = o95.b(this.b, fO, this.d, null, null, this, 12);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
