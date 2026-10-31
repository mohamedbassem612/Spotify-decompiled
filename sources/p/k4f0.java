package p;

import com.google.protobuf.Empty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k4f0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ n4f0 c;
    public final /* synthetic */ yg8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4f0(n4f0 n4f0Var, yg8 yg8Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = n4f0Var;
        this.d = yg8Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        yg8 yg8Var = this.d;
        n4f0 n4f0Var = this.c;
        switch (b) {
            case 0:
                return new k4f0(n4f0Var, yg8Var, lnmVar, (byte) 0);
            default:
                return new k4f0(n4f0Var, yg8Var, lnmVar, (byte) 1);
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
        Object obj2 = rih1.a;
        yg8 yg8Var = this.d;
        n4f0 n4f0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (yg8Var != yg8.h && yg8Var != yg8.N0) {
                        uh8 uh8Var = (uh8) n4f0Var.b.b.getValue();
                        Object objJ = fc11.j(uh8Var.a.e(Empty.n()).map(new r6x0(uh8Var, (byte) 29)).cache(), this);
                        if (objJ == d9nVar) {
                            obj2 = objJ;
                        }
                    }
                    if (obj2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return n4f0Var.a(yg8Var, this) == d9nVar ? d9nVar : obj2;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
