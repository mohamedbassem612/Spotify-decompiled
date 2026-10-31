package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q5p0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ x5p0 c;
    public final /* synthetic */ hfu0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5p0(x5p0 x5p0Var, hfu0 hfu0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = x5p0Var;
        this.d = hfu0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hfu0 hfu0Var = this.d;
        x5p0 x5p0Var = this.c;
        switch (b) {
            case 0:
                return new q5p0(x5p0Var, hfu0Var, lnmVar, (byte) 0);
            default:
                return new q5p0(x5p0Var, hfu0Var, lnmVar, (byte) 1);
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
        hfu0 hfu0Var = this.d;
        x5p0 x5p0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                Single singleB = x5p0Var.f.b(hfu0Var.a);
                this.b = true;
                obj = fc11.j(singleB, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                if (obj instanceof yh90) {
                    return (yh90) obj;
                }
                return null;
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
                String str = hfu0Var.e;
                String str2 = hfu0Var.a;
                this.b = true;
                int i = x5p0.h;
                Object objF = x5p0Var.f(str, str2, this);
                return objF == d9nVar ? d9nVar : objF;
        }
    }
}
