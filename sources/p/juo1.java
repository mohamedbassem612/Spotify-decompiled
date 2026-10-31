package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class juo1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ alg1 c;
    public final /* synthetic */ xnn1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juo1(alg1 alg1Var, xnn1 xnn1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = alg1Var;
        this.d = xnn1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        xnn1 xnn1Var = this.d;
        alg1 alg1Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new juo1(alg1Var, xnn1Var, lnmVar, (byte) 0);
            default:
                return new juo1(alg1Var, xnn1Var, lnmVar, (byte) 1);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        xnn1 xnn1Var = this.d;
        alg1 alg1Var = this.c;
        qwo1 qwo1Var = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                hm5.M(obj);
                if (!z) {
                    exo1 exo1Var = (exo1) alg1Var.a;
                    String str = (String) ((brk1) alg1Var.b).a;
                    this.b = true;
                    obj = exo1Var.a(str, xnn1Var, this);
                    if (obj == qwo1Var) {
                        return qwo1Var;
                    }
                }
                return (yln1) obj;
            default:
                boolean z2 = this.b;
                hm5.M(obj);
                if (z2) {
                    return obj;
                }
                juo1 juo1Var = new juo1(alg1Var, xnn1Var, null, (byte) 0);
                this.b = true;
                qwo1 qwo1Var2 = new qwo1(juo1Var);
                return qwo1Var2 != qwo1Var ? qwo1Var2 : qwo1Var;
        }
    }
}
