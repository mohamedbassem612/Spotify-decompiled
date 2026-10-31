package p;

import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g6i0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ n6i0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6i0(n6i0 n6i0Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = n6i0Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        n6i0 n6i0Var = this.c;
        switch (b) {
            case 0:
                return new g6i0(n6i0Var, str, lnmVar, (byte) 0);
            default:
                return new g6i0(n6i0Var, str, lnmVar, (byte) 1);
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
        String str = this.d;
        Serializable serializable = d9n.a;
        n6i0 n6i0Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Serializable serializableL = n6i0Var.l(str, this);
                    return serializableL == serializable ? serializable : serializableL;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        q7i0 q7i0Var = n6i0Var.X;
                        this.b = true;
                        q7i0Var.getClass();
                        obj = smo1.s(new mug(q7i0Var, str, (lnm) null), this);
                        if (obj == serializable) {
                            return serializable;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return (i7i0) obj;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    n6i0Var.q("transcript_error", e2.getClass().getSimpleName());
                }
                break;
        }
    }
}
