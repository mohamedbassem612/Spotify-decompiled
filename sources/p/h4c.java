package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h4c extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ boolean b;

    public final lnm create(Object obj, lnm lnmVar) {
        h4c h4cVar = new h4c(2, lnmVar);
        h4cVar.b = ((Boolean) obj).booleanValue();
        return h4cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((h4c) create(bool, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.b;
        boolean z2 = this.a;
        if (!z2) {
            hm5.M(obj);
            if (z) {
                this.b = z;
                this.a = true;
                Object objI = hap1.i(2000L, this);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (!z2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return Boolean.valueOf(z);
    }
}
