package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class imk0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public ven0 b;
    public boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ gw70 e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imk0(String str, gw70 gw70Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = str;
        this.e = gw70Var;
        this.f = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new imk0(this.d, this.e, this.f, lnmVar, (byte) 0);
            default:
                return new imk0(this.d, this.e, this.f, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        gw70 gw70Var = this.e;
        String str = this.d;
        ven0 ven0Var = this.f;
        d9n d9nVar = d9n.a;
        Bitmap bitmap = null;
        switch (b) {
            case 0:
                boolean z = this.c;
                if (!z) {
                    hm5.M(obj);
                    if (str != null) {
                        this.b = ven0Var;
                        this.c = true;
                        obj = x3p1.v(str, this, gw70Var);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    }
                    ven0Var.setValue(bitmap);
                    return rih1Var;
                }
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ven0Var = this.b;
                hm5.M(obj);
                bitmap = (Bitmap) obj;
                ven0Var.setValue(bitmap);
                return rih1Var;
            default:
                boolean z2 = this.c;
                if (!z2) {
                    hm5.M(obj);
                    if (str != null) {
                        this.b = ven0Var;
                        this.c = true;
                        obj = x3p1.v(str, this, gw70Var);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    }
                    ven0Var.setValue(bitmap);
                    return rih1Var;
                }
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ven0Var = this.b;
                hm5.M(obj);
                bitmap = (Bitmap) obj;
                ven0Var.setValue(bitmap);
                return rih1Var;
        }
    }
}
