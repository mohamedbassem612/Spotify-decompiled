package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s3s implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ k9r c;

    public /* synthetic */ s3s(vr20 vr20Var, k9r k9rVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = k9rVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        r3s r3sVar;
        v3s v3sVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k9r k9rVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof r3s) {
                    r3sVar = (r3s) lnmVar;
                    int i = r3sVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        r3sVar.b = i - Integer.MIN_VALUE;
                    } else {
                        r3sVar = new r3s(this, lnmVar);
                    }
                } else {
                    r3sVar = new r3s(this, lnmVar);
                }
                Object obj2 = r3sVar.a;
                int i2 = r3sVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Long l = new Long(((yqg) k9rVar.b).b());
                r3sVar.b = 1;
                return vr20Var.emit(l, r3sVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof v3s) {
                    v3sVar = (v3s) lnmVar;
                    int i3 = v3sVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        v3sVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        v3sVar = new v3s(this, lnmVar);
                    }
                } else {
                    v3sVar = new v3s(this, lnmVar);
                }
                Object obj3 = v3sVar.a;
                int i4 = v3sVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                Long l2 = new Long(((yqg) k9rVar.b).b());
                v3sVar.b = 1;
                return vr20Var.emit(l2, v3sVar) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
