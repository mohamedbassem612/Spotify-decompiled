package p;

import java.util.concurrent.CancellationException;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fuo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fuo(lnm lnmVar, iu30 iu30Var, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.d;
        switch (b) {
            case 0:
                fuo fuoVar = new fuo(lnmVar, iu30Var, (byte) 0);
                fuoVar.c = obj;
                return fuoVar;
            case 1:
                fuo fuoVar2 = new fuo(lnmVar, iu30Var, (byte) 1);
                fuoVar2.c = obj;
                return fuoVar2;
            case 2:
                fuo fuoVar3 = new fuo(iu30Var, lnmVar, (byte) 2);
                fuoVar3.c = obj;
                return fuoVar3;
            case 3:
                fuo fuoVar4 = new fuo(iu30Var, lnmVar, (byte) 3);
                fuoVar4.c = obj;
                return fuoVar4;
            default:
                fuo fuoVar5 = new fuo(iu30Var, lnmVar, (byte) 4);
                fuoVar5.c = obj;
                return fuoVar5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((t7g1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((t7g1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        CollectionAddRemoveItemsResponse m231Var;
        Boolean m231Var2;
        byte b = this.a;
        iu30 iu30Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
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
                this.b = true;
                Object objInvoke = iu30Var.invoke(this);
                return objInvoke == d9nVar ? d9nVar : objInvoke;
            case 1:
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
                this.b = true;
                Object objInvoke2 = iu30Var.invoke(this);
                return objInvoke2 == d9nVar ? d9nVar : objInvoke2;
            case 2:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        this.c = null;
                        this.b = true;
                        obj = iu30Var.invoke(this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = (CollectionAddRemoveItemsResponse) obj;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                return new e331(m231Var);
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (((c9n) this.c).J().A(p7g1.b) != null) {
                        this.b = true;
                        Object objInvoke3 = iu30Var.invoke(this);
                        return objInvoke3 == d9nVar ? d9nVar : objInvoke3;
                    }
                    eg.m("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                boolean z5 = this.b;
                try {
                    if (z5) {
                        if (z5) {
                            hm5.M(obj);
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    obj = iu30Var.invoke(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    m231Var2 = (Boolean) obj;
                    m231Var2.getClass();
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                if (!(m231Var2 instanceof m231)) {
                    return m231Var2;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fuo(iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = iu30Var;
    }
}
