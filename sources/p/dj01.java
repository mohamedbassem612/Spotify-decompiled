package p;

import com.google.android.recaptcha.RecaptchaException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dj01 extends a8d1 implements iu30 {
    public long a;
    public boolean b;
    public final /* synthetic */ hj01 c;
    public final /* synthetic */ a6b1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj01(hj01 hj01Var, a6b1 a6b1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.c = hj01Var;
        this.d = a6b1Var;
    }

    @Override // p.faa
    public final lnm create(lnm lnmVar) {
        return new dj01(this.c, this.d, lnmVar);
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        return ((dj01) create((lnm) obj)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        long j;
        Object objA;
        String message;
        d9n d9nVar = d9n.a;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            long jB = this.c.b.b();
            try {
                a6b1 a6b1Var = this.d;
                this.a = jB;
                this.b = true;
                objA = a6b1Var.a(this);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                j = jB;
            } catch (RecaptchaException e) {
                e = e;
                j = jB;
                objA = new m231(e);
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.a;
            try {
                hm5.M(obj);
                objA = ((e331) obj).a;
            } catch (RecaptchaException e2) {
                e = e2;
                objA = new m231(e);
            }
        }
        long jB2 = this.c.b.b() - j;
        if (objA instanceof m231) {
            Throwable thA = e331.a(objA);
            if (thA == null || (message = thA.getMessage()) == null) {
                message = "Unknown error";
            }
            npn0 npn0Var = this.c.k;
            if (npn0Var == null) {
                u890.C("recaptchaTracker");
                throw null;
            }
            npn0Var.h(jB2, this.c.n, message);
        } else {
            npn0 npn0Var2 = this.c.k;
            if (npn0Var2 == null) {
                u890.C("recaptchaTracker");
                throw null;
            }
            npn0Var2.f(jB2, this.c.n);
        }
        return new e331(objA);
    }
}
