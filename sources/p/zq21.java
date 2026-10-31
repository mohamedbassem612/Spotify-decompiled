package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zq21 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ as21 c;
    public final /* synthetic */ br21 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq21(br21 br21Var, as21 as21Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = br21Var;
        this.c = as21Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        br21 br21Var = this.d;
        as21 as21Var = this.c;
        switch (b) {
            case 0:
                return new zq21(br21Var, as21Var, lnmVar);
            default:
                return new zq21(as21Var, br21Var, lnmVar);
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
        br21 br21Var = this.d;
        as21 as21Var = this.c;
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
                String str = as21Var.f;
                this.b = true;
                z771 z771Var = br21.g;
                Object objB = br21Var.b(624, str, this);
                return objB == d9nVar ? d9nVar : objB;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return (Bitmap) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str2 = as21Var.g;
                if (str2 != null) {
                    this.b = true;
                    z771 z771Var2 = br21.g;
                    obj = br21Var.b(164, str2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    return (Bitmap) obj;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq21(as21 as21Var, br21 br21Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = as21Var;
        this.d = br21Var;
    }
}
