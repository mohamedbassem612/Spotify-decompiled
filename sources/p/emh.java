package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class emh extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ gmh c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ emh(gmh gmhVar, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = gmhVar;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        gmh gmhVar = this.c;
        switch (b) {
            case 0:
                return new emh(gmhVar, str, lnmVar, (byte) 0);
            default:
                return new emh(gmhVar, str, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        byte b = this.a;
        String str = this.d;
        gmh gmhVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    dmh dmhVar = new dmh(gmhVar, str, null, (byte) 0);
                    this.b = true;
                    o3r o3rVar = gmh.c;
                    objA = gmhVar.a(dmhVar, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = ((e331) obj).a;
                }
                return new e331(objA);
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    dmh dmhVar2 = new dmh(gmhVar, str, null, (byte) 1);
                    this.b = true;
                    o3r o3rVar2 = gmh.c;
                    objA2 = gmhVar.a(dmhVar2, this);
                    if (objA2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA2 = ((e331) obj).a;
                }
                return new e331(objA2);
        }
    }
}
