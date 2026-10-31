package p;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fj80 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public nsw0 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ Uri f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj80(Context context, Uri uri, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = context;
        this.f = uri;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                fj80 fj80Var = new fj80(this.e, this.f, lnmVar, (byte) 0);
                fj80Var.d = obj;
                return fj80Var;
            default:
                fj80 fj80Var2 = new fj80(this.e, this.f, lnmVar, (byte) 1);
                fj80Var2.d = obj;
                return fj80Var2;
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
        Uri uri = this.f;
        Context context = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                nsw0 nsw0Var = (nsw0) this.d;
                boolean z = this.c;
                if (!z) {
                    hm5.M(obj);
                    fns fnsVar = igu.a;
                    b3s b3sVar = b3s.c;
                    ej80 ej80Var = new ej80(context, uri, (lnm) null, (byte) 0);
                    this.d = null;
                    this.b = nsw0Var;
                    this.c = true;
                    obj = fn31.Y(b3sVar, ej80Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nsw0Var = this.b;
                    hm5.M(obj);
                }
                ((psw0) nsw0Var).setValue(obj);
                return rih1Var;
            default:
                nsw0 nsw0Var2 = (nsw0) this.d;
                boolean z2 = this.c;
                if (!z2) {
                    hm5.M(obj);
                    fns fnsVar2 = igu.a;
                    b3s b3sVar2 = b3s.c;
                    ej80 ej80Var2 = new ej80(context, uri, (lnm) null, (byte) 1);
                    this.d = null;
                    this.b = nsw0Var2;
                    this.c = true;
                    obj = fn31.Y(b3sVar2, ej80Var2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nsw0Var2 = this.b;
                    hm5.M(obj);
                }
                ((psw0) nsw0Var2).setValue(obj);
                return rih1Var;
        }
    }
}
