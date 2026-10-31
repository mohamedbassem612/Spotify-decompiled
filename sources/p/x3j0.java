package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x3j0 extends a8d1 implements iu30 {
    public e4j0 a;
    public Iterator b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ m3j0 f;
    public final /* synthetic */ List g;
    public final /* synthetic */ n3j0 h;
    public final /* synthetic */ e4j0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3j0(m3j0 m3j0Var, List list, n3j0 n3j0Var, e4j0 e4j0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.f = m3j0Var;
        this.g = list;
        this.h = n3j0Var;
        this.i = e4j0Var;
    }

    public final lnm create(lnm lnmVar) {
        return new x3j0(this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator it;
        e4j0 e4j0Var;
        int i2;
        boolean z = this.e;
        if (!z) {
            hm5.M(obj);
            qim qimVar = this.f.b;
            if (qimVar != null) {
                List list = this.g;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (qimVar.a.contains(((k6w0) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                i = 0;
                it = arrayList.iterator();
                e4j0Var = this.i;
                i2 = 0;
            }
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.d;
        i2 = this.c;
        it = this.b;
        e4j0Var = this.a;
        hm5.M(obj);
        while (it.hasNext()) {
            k6w0 k6w0Var = (k6w0) it.next();
            this.a = e4j0Var;
            this.b = it;
            this.c = i2;
            this.d = i;
            this.e = true;
            int i3 = e4j0.k;
            Object objF = e4j0Var.f(k6w0Var, this);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
