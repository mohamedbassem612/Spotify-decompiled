package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f4e0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ il71 c;
    public final /* synthetic */ dxy d;
    public final /* synthetic */ String e;
    public final /* synthetic */ w4k1 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4e0(il71 il71Var, dxy dxyVar, String str, w4k1 w4k1Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.c = il71Var;
        this.d = dxyVar;
        this.e = str;
        this.f = w4k1Var;
        this.g = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new f4e0(this.c, this.d, this.f, this.e, this.g, lnmVar);
            default:
                return new f4e0(this.c, this.d, this.e, this.f, this.g, lnmVar);
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
        byte b = this.a;
        il71 il71Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                e4e0 e4e0Var = new e4e0(this.d, this.f, this.e, this.g, (lnm) null);
                this.b = true;
                Object objA = il71Var.a("fetching_transcript", e4e0Var, this);
                return objA == d9nVar ? d9nVar : objA;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                e4e0 e4e0Var2 = new e4e0(this.d, this.e, this.f, this.g, (lnm) null);
                this.b = true;
                Object objA2 = il71Var.a("fetching_video_frame", e4e0Var2, this);
                return objA2 == d9nVar ? d9nVar : objA2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4e0(il71 il71Var, dxy dxyVar, w4k1 w4k1Var, String str, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.c = il71Var;
        this.d = dxyVar;
        this.f = w4k1Var;
        this.e = str;
        this.g = j;
    }
}
