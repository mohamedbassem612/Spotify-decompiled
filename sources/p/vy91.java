package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vy91 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xy91 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy91(xy91 xy91Var, String str, String str2, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = xy91Var;
        this.d = str;
        this.e = str2;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new vy91(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new vy91(this.c, this.d, this.e, lnmVar, (byte) 1);
            default:
                return new vy91(this.c, this.d, this.e, lnmVar, (byte) 2);
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
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.e;
        String str2 = this.d;
        xy91 xy91Var = this.c;
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
                j0a1 j0a1Var = xy91Var.h;
                this.b = true;
                Object objG = j0a1Var.g(str2, str, this);
                return objG == d9nVar ? d9nVar : objG;
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
                j0a1 j0a1Var2 = xy91Var.h;
                this.b = true;
                Object objF = j0a1Var2.f(str2, str, this);
                return objF == d9nVar ? d9nVar : objF;
            default:
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
                j0a1 j0a1Var3 = xy91Var.h;
                this.b = true;
                Object objE = j0a1Var3.e(str2, str, this);
                return objE == d9nVar ? d9nVar : objE;
        }
    }
}
