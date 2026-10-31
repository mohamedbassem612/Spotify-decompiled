package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h27 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ jkr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h27(int i, c380 c380Var, jkr0 jkr0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i;
        this.d = c380Var;
        this.e = jkr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new h27(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new h27(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c380 c380Var = this.d;
        d9n d9nVar = d9n.a;
        int i = this.c;
        jkr0 jkr0Var = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (i < 0 || i >= c380Var.size() || i == ((err0) jkr0Var.d.c).s()) {
                    return rih1Var;
                }
                this.b = true;
                return jkr0.g(jkr0Var, i, (n8b1) null, this, 6) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (i < 0 || i >= c380Var.size() || i == ((err0) jkr0Var.d.c).s()) {
                    return rih1Var;
                }
                this.b = true;
                return jkr0.g(jkr0Var, i, (n8b1) null, this, 6) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
