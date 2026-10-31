package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h3o extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ sd5 c;
    public final /* synthetic */ o0i d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3o(sd5 sd5Var, o0i o0iVar, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = sd5Var;
        this.d = o0iVar;
        this.e = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new h3o(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new h3o(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        String str = this.e;
        o0i o0iVar = this.d;
        sd5 sd5Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objM = ((sp00) sd5Var.e).m(str, this, bcl1.f((bcl1) sd5Var.c, o0iVar.e, "creator_row", (String) null, (String) null, new kak(str, (byte) 29), 12), true);
                    if (objM != d9nVar) {
                        objM = rih1Var;
                    }
                    if (objM == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objB = ((sp00) sd5Var.e).B(str, this, bcl1.f((bcl1) sd5Var.c, o0iVar.e, "creator_row", (String) null, (String) null, new i3o(str, (byte) 1), 12), true);
                    if (objB != d9nVar) {
                        objB = rih1Var;
                    }
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
