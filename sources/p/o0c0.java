package p;

import android.graphics.Bitmap;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o0c0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ gw70 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0c0(String str, lnm lnmVar, gw70 gw70Var) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.d = str;
        this.c = gw70Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new o0c0(this.c, this.d, lnmVar, (byte) 0);
            case 1:
                return new o0c0(this.c, this.d, lnmVar, (byte) 1);
            default:
                return new o0c0(this.d, lnmVar, this.c);
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
        gw70 gw70Var = this.c;
        d9n d9nVar = d9n.a;
        String str = this.d;
        byte b2 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objS = wpo1.s(gw70Var, str, (yr80) null, this);
                    return objS == d9nVar ? d9nVar : objS;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                Single singleI = gw70Var.f(str).i();
                this.b = true;
                Object objJ = fc11.j(singleI, this);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        o0c0 o0c0Var = new o0c0(gw70Var, str, lnmVar, b2);
                        this.b = true;
                        obj = rc2.M(5000L, o0c0Var, this);
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
                    Bitmap bitmap = (Bitmap) obj;
                    return new fpv0(str, bitmap.getWidth(), bitmap.getHeight());
                } catch (Exception unused) {
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0c0(gw70 gw70Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = gw70Var;
        this.d = str;
    }
}
