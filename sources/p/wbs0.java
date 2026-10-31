package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wbs0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j5c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbs0(boolean z, j5c j5cVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = j5cVar;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new wbs0(this.b, this.c, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((wbs0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if (this.b) {
                this.a = true;
                Object objB = j5c.b(this.c, this);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
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
