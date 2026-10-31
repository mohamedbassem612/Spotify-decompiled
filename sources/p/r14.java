package p;

import androidx.compose.material.AnchoredDragFinishedSignal;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r14 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ c9n e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r14(vu30 vu30Var, Object obj, c9n c9nVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vu30Var;
        this.d = obj;
        this.e = c9nVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new r14(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new r14(this.c, this.d, this.e, lnmVar, (byte) 1);
            default:
                return new r14(this.c, this.d, this.e, lnmVar, (byte) 2);
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
        rih1 rih1Var = rih1.a;
        c9n c9nVar = this.e;
        Object obj2 = this.d;
        vu30 vu30Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (vu30Var.invoke(obj2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                smo1.p(c9nVar, new AnchoredDragFinishedSignal());
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (vu30Var.invoke(obj2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                smo1.p(c9nVar, new androidx.compose.material3.internal.AnchoredDragFinishedSignal());
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    if (vu30Var.invoke(obj2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                smo1.p(c9nVar, new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal());
                return rih1Var;
        }
    }
}
