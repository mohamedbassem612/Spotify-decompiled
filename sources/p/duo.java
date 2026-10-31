package p;

import androidx.room.rxjava3.EmptyResultSetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class duo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ en31 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duo(lnm lnmVar, iu30 iu30Var, en31 en31Var) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.c = en31Var;
        this.d = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.d;
        en31 en31Var = this.c;
        switch (b) {
            case 0:
                return new duo(lnmVar, iu30Var, en31Var);
            case 1:
                return new duo((byte) 1, lnmVar, iu30Var, en31Var);
            default:
                return new duo((byte) 2, lnmVar, iu30Var, en31Var);
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
        iu30 iu30Var = this.d;
        en31 en31Var = this.c;
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
                guo guoVar = new guo((byte) 1, null, iu30Var, en31Var);
                this.b = true;
                Object objT = en31Var.t(false, guoVar, this);
                return objT == d9nVar ? d9nVar : objT;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (qyo1.z(this, iu30Var, en31Var, false, true) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    obj = qyo1.z(this, iu30Var, en31Var, true, false);
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
                if (obj != null) {
                    return obj;
                }
                throw new EmptyResultSetException("Query returned empty result set.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ duo(byte b, lnm lnmVar, iu30 iu30Var, en31 en31Var) {
        super(2, lnmVar);
        this.a = b;
        this.c = en31Var;
        this.d = iu30Var;
    }
}
