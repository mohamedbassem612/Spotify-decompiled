package p;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ch91 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ dh91 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ hh91 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch91(long j, dh91 dh91Var, int i, hh91 hh91Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = j;
        this.c = dh91Var;
        this.d = i;
        this.e = hh91Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ch91(this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        d9n d9nVar = d9n.a;
        boolean z = this.a;
        try {
            if (!z) {
                hm5.M(obj);
                long j = this.b;
                b751 b751Var = new b751(this.c, (lnm) null, (byte) 25);
                this.a = true;
                if (rc2.M(j, b751Var, this) == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            dh91 dh91Var = this.c;
            int i = this.d;
            hh91 hh91Var = this.e;
            synchronized (dh91Var) {
                if (i == dh91Var.i) {
                    dh91Var.e.l(hh91Var);
                }
            }
        } catch (TimeoutCancellationException unused) {
            dh91 dh91Var2 = this.c;
            int i2 = this.d;
            synchronized (dh91Var2) {
                if (i2 == dh91Var2.i) {
                    dh91Var2.e();
                }
            }
        }
        return rih1.a;
    }
}
