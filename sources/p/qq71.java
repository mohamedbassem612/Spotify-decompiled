package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qq71 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ il71 c;
    public final /* synthetic */ tq71 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ z771 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq71(byte b, String str, lnm lnmVar, z771 z771Var, il71 il71Var, tq71 tq71Var) {
        super(2, lnmVar);
        this.a = b;
        this.c = il71Var;
        this.d = tq71Var;
        this.e = str;
        this.f = z771Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new qq71((byte) 0, this.e, lnmVar, this.f, this.c, this.d);
            case 1:
                return new qq71((byte) 1, this.e, lnmVar, this.f, this.c, this.d);
            case 2:
                return new qq71((byte) 2, this.e, lnmVar, this.f, this.c, this.d);
            case 3:
                return new qq71((byte) 3, this.e, lnmVar, this.f, this.c, this.d);
            case 4:
                return new qq71((byte) 4, this.e, lnmVar, this.f, this.c, this.d);
            default:
                return new qq71((byte) 5, this.e, lnmVar, this.f, this.c, this.d);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
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
                String str = this.e;
                z771 z771Var = this.f;
                il71 il71Var = this.c;
                pq71 pq71Var = new pq71((byte) 0, str, null, z771Var, il71Var, this.d);
                this.b = true;
                Object objA = il71Var.a("fetching_playlist_sticker", pq71Var, this);
                return objA == d9nVar ? d9nVar : objA;
            case 1:
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
                String str2 = this.e;
                z771 z771Var2 = this.f;
                il71 il71Var2 = this.c;
                pq71 pq71Var2 = new pq71((byte) 1, str2, null, z771Var2, il71Var2, this.d);
                this.b = true;
                Object objA2 = il71Var2.a("fetching_themed_sticker", pq71Var2, this);
                return objA2 == d9nVar ? d9nVar : objA2;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str3 = this.e;
                z771 z771Var3 = this.f;
                il71 il71Var3 = this.c;
                pq71 pq71Var3 = new pq71((byte) 2, str3, null, z771Var3, il71Var3, this.d);
                this.b = true;
                Object objA3 = il71Var3.a("fetching_sticker", pq71Var3, this);
                return objA3 == d9nVar ? d9nVar : objA3;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str4 = this.e;
                z771 z771Var4 = this.f;
                il71 il71Var4 = this.c;
                pq71 pq71Var4 = new pq71((byte) 3, str4, null, z771Var4, il71Var4, this.d);
                this.b = true;
                Object objA4 = il71Var4.a("fetching_themed_sticker", pq71Var4, this);
                return objA4 == d9nVar ? d9nVar : objA4;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str5 = this.e;
                z771 z771Var5 = this.f;
                il71 il71Var5 = this.c;
                pq71 pq71Var5 = new pq71((byte) 4, str5, null, z771Var5, il71Var5, this.d);
                this.b = true;
                Object objA5 = il71Var5.a("fetching_sticker", pq71Var5, this);
                return objA5 == d9nVar ? d9nVar : objA5;
            default:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str6 = this.e;
                z771 z771Var6 = this.f;
                il71 il71Var6 = this.c;
                pq71 pq71Var6 = new pq71((byte) 5, str6, null, z771Var6, il71Var6, this.d);
                this.b = true;
                Object objA6 = il71Var6.a("fetching_themed_sticker", pq71Var6, this);
                return objA6 == d9nVar ? d9nVar : objA6;
        }
    }
}
