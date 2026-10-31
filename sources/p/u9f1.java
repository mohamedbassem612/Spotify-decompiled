package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u9f1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Iterable d;
    public final /* synthetic */ bju e;
    public final /* synthetic */ gw70 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9f1(Iterable iterable, lnm lnmVar, bju bjuVar, gw70 gw70Var, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = iterable;
        this.e = bjuVar;
        this.f = gw70Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                u9f1 u9f1Var = new u9f1(this.d, lnmVar, this.e, this.f, (byte) 0);
                u9f1Var.c = obj;
                return u9f1Var;
            default:
                u9f1 u9f1Var2 = new u9f1(this.d, lnmVar, this.e, this.f, (byte) 1);
                u9f1Var2.c = obj;
                return u9f1Var2;
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
        Iterable iterable = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                int i = 0;
                for (Object obj2 : iterable) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList.add(fn31.q(c9nVar, (o8n) null, 0, new dk6(obj2, i, (Object) this.e, (Object) this.f, (lnm) null, (byte) 8), 3));
                    i = i2;
                }
                this.c = null;
                this.b = true;
                Object objU = o1p1.u(arrayList, this);
                return objU == d9nVar ? d9nVar : objU;
            default:
                c9n c9nVar2 = (c9n) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ArrayList arrayList2 = new ArrayList(q7h.U(iterable, 10));
                int i3 = 0;
                for (Object obj3 : iterable) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList2.add(fn31.q(c9nVar2, (o8n) null, 0, new chi0(i3, obj3, (lnm) null, this.e, this.f), 3));
                    i3 = i4;
                }
                this.c = null;
                this.b = true;
                Object objU2 = o1p1.u(arrayList2, this);
                return objU2 == d9nVar ? d9nVar : objU2;
        }
    }
}
