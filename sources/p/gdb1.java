package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gdb1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ d0r c;
    public final /* synthetic */ idb1 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gdb1(d0r d0rVar, idb1 idb1Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = d0rVar;
        this.d = idb1Var;
        this.e = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new gdb1(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new gdb1(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        idb1 idb1Var = this.d;
        d0r d0rVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ay8 ay8VarF = d3p1.F(d0rVar, idb1Var.e, str);
                    ck01 ck01Var = new ck01(2, (lnm) null, (byte) 24);
                    this.b = true;
                    obj = b5p1.j(ay8VarF, ck01Var, this);
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
                    ay8 ay8VarF2 = d3p1.F(d0rVar, idb1Var.d, str);
                    ck01 ck01Var2 = new ck01(2, (lnm) null, (byte) 25);
                    this.b = true;
                    obj = b5p1.j(ay8VarF2, ck01Var2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return u890.G((k1r) obj);
        }
    }
}
