package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c140 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ d140 c;
    public final /* synthetic */ o531 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c140(d140 d140Var, o531 o531Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = d140Var;
        this.d = o531Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        o531 o531Var = this.d;
        d140 d140Var = this.c;
        switch (b) {
            case 0:
                return new c140(d140Var, o531Var, lnmVar, (byte) 0);
            case 1:
                return new c140(d140Var, o531Var, lnmVar, (byte) 1);
            default:
                return new c140(d140Var, o531Var, lnmVar, (byte) 2);
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
        Object objF;
        Object objG;
        Object objD;
        byte b = this.a;
        o531 o531Var = this.d;
        d140 d140Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    e5l0 e5l0Var = d140Var.d;
                    String str = o531Var.b;
                    this.b = true;
                    objF = e5l0Var.f(str, this);
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = ((e331) obj).a;
                }
                return new e331(objF);
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    e5l0 e5l0Var2 = d140Var.d;
                    String str2 = o531Var.b;
                    this.b = true;
                    objG = e5l0Var2.g(str2, this);
                    if (objG == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objG = ((e331) obj).a;
                }
                if (e331.a(objG) != null) {
                    return aka1.b;
                }
                aka1 aka1Var = aka1.b;
                return fn31.K((List) objG);
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    e5l0 e5l0Var3 = d140Var.d;
                    String str3 = o531Var.b;
                    this.b = true;
                    objD = e5l0Var3.d(str3, this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objD = ((e331) obj).a;
                }
                return new e331(objD);
        }
    }
}
