package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y3e0 extends a8d1 implements vu30 {
    public s2t a;
    public Object b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ z3e0 e;
    public final /* synthetic */ Effect.LoadMoreHomeStructure f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3e0(z3e0 z3e0Var, Effect.LoadMoreHomeStructure loadMoreHomeStructure, lnm lnmVar) {
        super(2, lnmVar);
        this.e = z3e0Var;
        this.f = loadMoreHomeStructure;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        y3e0 y3e0Var = new y3e0(this.e, this.f, lnmVar);
        y3e0Var.d = obj;
        return y3e0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        s2t s2tVarQ;
        Object obj2;
        c9n c9nVar = (c9n) this.d;
        byte b = this.c;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                s2tVarQ = this.a;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.b;
                hm5.M(obj);
            }
            return new mmr0(obj2, obj);
        }
        hm5.M(obj);
        z3e0 z3e0Var = this.e;
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new p6d0(z3e0Var, (lnm) null, (byte) 6), 3);
        s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new x3e0(z3e0Var, s2tVarQ2, this.f, null), 3);
        this.d = null;
        this.a = s2tVarQ;
        this.c = (byte) 1;
        obj = s2tVarQ2.Q(this);
        if (obj != d9nVar) {
        }
        return d9nVar;
        this.d = null;
        this.a = null;
        this.b = obj;
        this.c = (byte) 2;
        Object objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            Object obj3 = obj;
            obj = objE;
            obj2 = obj3;
            return new mmr0(obj2, obj);
        }
        return d9nVar;
    }
}
