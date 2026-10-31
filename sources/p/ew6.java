package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ew6 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mr20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew6(mr20 mr20Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = mr20Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        mr20 mr20Var = this.c;
        switch (b) {
            case 0:
                return new ew6(mr20Var, lnmVar, (byte) 0);
            case 1:
                return new ew6(mr20Var, lnmVar, (byte) 1);
            case 2:
                return new ew6(mr20Var, lnmVar, (byte) 2);
            case 3:
                return new ew6(mr20Var, lnmVar, (byte) 3);
            case 4:
                return new ew6(mr20Var, lnmVar, (byte) 4);
            default:
                return new ew6(mr20Var, lnmVar, (byte) 5);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
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
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        mr20 mr20Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    obj = b5p1.i(mr20Var, this);
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
                return ((th61) obj).a;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    obj = b5p1.i(mr20Var, this);
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
                return ((th61) obj).Y.a;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    obj = b5p1.i(mr20Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ((th61) obj).a;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                obj = b5p1.i(mr20Var, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                th61 th61Var = (th61) obj;
                String str = th61Var.a;
                if (th61Var.b && !ihc1.y0(str)) {
                    return str;
                }
                return null;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    obj = b5p1.i(mr20Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ((th61) obj).a;
            default:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    obj = b5p1.i(mr20Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ((th61) obj).a;
        }
    }
}
