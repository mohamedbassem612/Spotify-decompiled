package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oxj0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public s2t b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ kqi0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oxj0(kqi0 kqi0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = kqi0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        kqi0 kqi0Var = this.e;
        switch (b) {
            case 0:
                oxj0 oxj0Var = new oxj0(kqi0Var, lnmVar, (byte) 0);
                oxj0Var.d = obj;
                return oxj0Var;
            default:
                oxj0 oxj0Var2 = new oxj0(kqi0Var, lnmVar, (byte) 1);
                oxj0Var2.d = obj;
                return oxj0Var2;
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

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    public final Object invokeSuspend(Object obj) {
        s2t s2tVarQ;
        boolean z;
        s2t s2tVarQ2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        kqi0 kqi0Var = this.e;
        switch (b) {
            case 0:
                q8n q8nVar = (q8n) kqi0Var.c;
                c9n c9nVar = (c9n) this.d;
                byte b2 = this.c;
                if (b2 != 0) {
                    if (b2 == 1) {
                        s2tVarQ = this.b;
                        hm5.M(obj);
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    z = ((Boolean) obj).booleanValue();
                    return Boolean.valueOf(z);
                }
                hm5.M(obj);
                s2t s2tVarQ3 = fn31.q(c9nVar, q8nVar, 0, new lxj0(kqi0Var, null, (byte) 0), 2);
                s2tVarQ = fn31.q(c9nVar, q8nVar, 0, new lxj0(kqi0Var, null, (byte) 1), 2);
                this.d = null;
                this.b = s2tVarQ;
                this.c = (byte) 1;
                obj = s2tVarQ3.Q(this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    this.d = null;
                    this.b = null;
                    this.c = (byte) 2;
                    obj = s2tVarQ.E(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return Boolean.valueOf(z);
            default:
                q8n q8nVar2 = (q8n) kqi0Var.c;
                c9n c9nVar2 = (c9n) this.d;
                byte b3 = this.c;
                if (b3 != 0) {
                    if (b3 == 1) {
                        s2tVarQ2 = this.b;
                        hm5.M(obj);
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    z = ((Boolean) obj).booleanValue();
                    return Boolean.valueOf(z);
                }
                hm5.M(obj);
                s2t s2tVarQ4 = fn31.q(c9nVar2, q8nVar2, 0, new lxj0(kqi0Var, null, (byte) 2), 2);
                s2tVarQ2 = fn31.q(c9nVar2, q8nVar2, 0, new lxj0(kqi0Var, null, (byte) 3), 2);
                this.d = null;
                this.b = s2tVarQ2;
                this.c = (byte) 1;
                obj = s2tVarQ4.Q(this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    this.d = null;
                    this.b = null;
                    this.c = (byte) 2;
                    obj = s2tVarQ2.E(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
