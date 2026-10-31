package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o4h extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ p4h c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4h(p4h p4hVar, String str, String str2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = p4hVar;
        this.d = str;
        this.e = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new o4h(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new o4h(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        ubc0 ubc0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        d9n d9nVar = d9n.a;
        p4h p4hVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                y560 y560VarA = ((e4h) p4hVar.b.get()).a(str);
                y560 y560Var = y560VarA instanceof y560 ? y560VarA : null;
                String str2 = this.e;
                tv80 tv80VarD = y560Var != null ? y560Var.d(str2) : null;
                ccc0 ccc0Var = (ccc0) p4hVar.a.get();
                ubc0Var = tv80VarD != null ? new ubc0(tv80VarD) : null;
                this.b = true;
                return ccc0.b(ccc0Var, str2, false, ubc0Var, this, 2) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                y560 y560VarA2 = ((e4h) p4hVar.b.get()).a(str);
                y560 y560Var2 = y560VarA2 instanceof y560 ? y560VarA2 : null;
                String str3 = this.e;
                tv80 tv80VarC = y560Var2 != null ? y560Var2.c(str3) : null;
                ccc0 ccc0Var2 = (ccc0) p4hVar.a.get();
                ubc0Var = tv80VarC != null ? new ubc0(tv80VarC) : null;
                this.b = true;
                return ccc0.h(ccc0Var2, str3, ubc0Var, this, 2) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
