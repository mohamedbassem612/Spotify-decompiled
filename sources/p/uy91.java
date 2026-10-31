package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uy91 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ qy91 c;
    public final /* synthetic */ xy91 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy91(qy91 qy91Var, xy91 xy91Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = qy91Var;
        this.d = xy91Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        qy91 qy91Var = this.c;
        xy91 xy91Var = this.d;
        switch (b) {
            case 0:
                return new uy91(xy91Var, qy91Var, lnmVar, (byte) 0);
            case 1:
                return new uy91(qy91Var, xy91Var, lnmVar);
            default:
                return new uy91(xy91Var, qy91Var, lnmVar, (byte) 2);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        xy91 xy91Var = this.d;
        qy91 qy91Var = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
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
                this.b = true;
                int i = xy91.j;
                Object objS = smo1.s(new tc1((Object) qy91Var, (Object) xy91Var, lnmVar, (byte) 27), this);
                return objS == d9nVar ? d9nVar : objS;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return (mfd) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (qy91Var.b) {
                    String str = qy91Var.d;
                    this.b = true;
                    int i2 = xy91.j;
                    obj = xy91Var.a(str, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    return (mfd) obj;
                }
                return null;
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
                String str2 = qy91Var.f;
                String str3 = qy91Var.d;
                this.b = true;
                int i3 = xy91.j;
                Object objS2 = smo1.s(new sh6(this.d, str2, str3, (lnm) null, (byte) 9), this);
                return objS2 == d9nVar ? d9nVar : objS2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy91(xy91 xy91Var, qy91 qy91Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = xy91Var;
        this.c = qy91Var;
    }
}
