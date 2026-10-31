package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sa3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ ya3 c;
    public final /* synthetic */ d0r d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa3(ya3 ya3Var, d0r d0rVar, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.c = ya3Var;
        this.d = d0rVar;
        this.e = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.e;
        d0r d0rVar = this.d;
        ya3 ya3Var = this.c;
        switch (b) {
            case 0:
                return new sa3(d0rVar, ya3Var, str, lnmVar);
            default:
                return new sa3(ya3Var, d0rVar, str, lnmVar);
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
        d0r d0rVar = this.d;
        ya3 ya3Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ay8 ay8VarF = d3p1.F(d0rVar, ya3Var.c, str);
                    s4 s4Var = new s4(2, (lnm) null, (byte) 7);
                    this.b = true;
                    obj = b5p1.j(ay8VarF, s4Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return u890.G((k1r) obj);
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objO = rc2.O(200L, new sa3(d0rVar, ya3Var, str, (lnm) null), this);
                    return objO == d9nVar ? d9nVar : objO;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa3(d0r d0rVar, ya3 ya3Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.d = d0rVar;
        this.c = ya3Var;
        this.e = str;
    }
}
