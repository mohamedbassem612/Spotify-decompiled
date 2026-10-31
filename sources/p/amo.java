package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class amo extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public /* synthetic */ int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amo(zl5 zl5Var, int i, lnm lnmVar) {
        super(3, lnmVar);
        this.e = zl5Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                amo amoVar = new amo((toj0) obj4, (lnm) obj3);
                amoVar.d = (String) obj;
                amoVar.c = iIntValue;
                return amoVar.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                amo amoVar2 = new amo((zl5) obj4, this.c, (lnm) obj3);
                amoVar2.b = zBooleanValue;
                amoVar2.d = (List) obj2;
                return amoVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        rzh m231Var;
        Object value;
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                toj0 toj0Var = (toj0) obj2;
                String str = (String) this.d;
                int i = this.c;
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        bxh bxhVar = (uwh) toj0Var.b;
                        this.d = null;
                        this.c = i;
                        this.b = true;
                        obj = bxhVar.b(i, str, this);
                        d9n d9nVar = d9n.a;
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = (rzh) obj;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (e331.a(m231Var) == null) {
                    rzh rzhVar = m231Var;
                    if (rzhVar != null) {
                        return rzhVar.c;
                    }
                    return null;
                }
                bpb1 bpb1Var = (bpb1) toj0Var.e;
                do {
                    value = bpb1Var.getValue();
                    ((Boolean) value).getClass();
                } while (!bpb1Var.k(value, Boolean.FALSE));
                return null;
            default:
                boolean z2 = this.b;
                List list = (List) this.d;
                hm5.M(obj);
                return ((zl5) obj2).f(this.c, list, z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amo(toj0 toj0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.e = toj0Var;
    }
}
