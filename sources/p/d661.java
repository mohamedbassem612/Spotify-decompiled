package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d661 extends z031 implements vu30 {
    public Iterator b;
    public Object c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i46 f;
    public final /* synthetic */ f6f0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d661(i46 i46Var, f6f0 f6f0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = i46Var;
        this.g = f6f0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        d661 d661Var = new d661(this.f, this.g, lnmVar);
        d661Var.e = obj;
        return d661Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((r561) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Object next;
        r561 r561Var = (r561) this.e;
        boolean z = this.d;
        if (!z) {
            hm5.M(obj);
            it = ((Iterable) this.f.b).iterator();
            if (it.hasNext()) {
                next = it.next();
            }
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        next = this.c;
        it = this.b;
        hm5.M(obj);
        if (it.hasNext()) {
            Object next2 = it.next();
            mmr0 mmr0Var = new mmr0(next, next2);
            this.e = r561Var;
            this.b = it;
            this.c = next2;
            this.d = true;
            r561Var.b(mmr0Var, this);
            return d9n.a;
        }
        return rih1.a;
    }
}
