package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wv40 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public nsw0 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gw70 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv40(gw70 gw70Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = gw70Var;
        this.f = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                wv40 wv40Var = new wv40(this.e, this.f, lnmVar, (byte) 0);
                wv40Var.d = obj;
                return wv40Var;
            default:
                wv40 wv40Var2 = new wv40(this.e, this.f, lnmVar, (byte) 1);
                wv40Var2.d = obj;
                return wv40Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nsw0 nsw0Var = (nsw0) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(nsw0Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.f;
        gw70 gw70Var = this.e;
        d9n d9nVar = d9n.a;
        Bitmap bitmap = null;
        switch (b) {
            case 0:
                nsw0 nsw0Var = (nsw0) this.d;
                boolean z = this.c;
                if (!z) {
                    hm5.M(obj);
                    if (gw70Var != null && str != null) {
                        this.d = null;
                        this.b = nsw0Var;
                        this.c = true;
                        obj = ago1.t(str, this, gw70Var);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    }
                    ((psw0) nsw0Var).setValue(bitmap);
                    return rih1Var;
                }
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nsw0Var = this.b;
                hm5.M(obj);
                bitmap = (Bitmap) obj;
                ((psw0) nsw0Var).setValue(bitmap);
                return rih1Var;
            default:
                nsw0 nsw0Var2 = (nsw0) this.d;
                boolean z2 = this.c;
                if (!z2) {
                    hm5.M(obj);
                    if (gw70Var != null && str != null) {
                        this.d = null;
                        this.b = nsw0Var2;
                        this.c = true;
                        obj = ago1.t(str, this, gw70Var);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    }
                    ((psw0) nsw0Var2).setValue(bitmap);
                    return rih1Var;
                }
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nsw0Var2 = this.b;
                hm5.M(obj);
                bitmap = (Bitmap) obj;
                ((psw0) nsw0Var2).setValue(bitmap);
                return rih1Var;
        }
    }
}
