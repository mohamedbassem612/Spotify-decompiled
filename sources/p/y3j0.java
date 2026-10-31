package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y3j0 extends a8d1 implements iu30 {
    public e4j0 a;
    public Iterator b;
    public int c;
    public boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ e4j0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3j0(ArrayList arrayList, e4j0 e4j0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.e = arrayList;
        this.f = e4j0Var;
    }

    public final lnm create(lnm lnmVar) {
        return new y3j0(this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        e4j0 e4j0Var;
        Iterator it;
        boolean z = this.d;
        if (!z) {
            hm5.M(obj);
            Iterator it2 = this.e.iterator();
            i = 0;
            e4j0Var = this.f;
            it = it2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.c;
            it = this.b;
            e4j0Var = this.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            k6w0 k6w0Var = (k6w0) it.next();
            this.a = e4j0Var;
            this.b = it;
            this.c = i;
            this.d = true;
            int i2 = e4j0.k;
            Object objF = e4j0Var.f(k6w0Var, this);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
