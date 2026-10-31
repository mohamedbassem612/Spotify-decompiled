package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v2r extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jmq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2r(jmq jmqVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = jmqVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        jmq jmqVar = this.d;
        switch (b) {
            case 0:
                v2r v2rVar = new v2r(jmqVar, lnmVar, (byte) 0);
                v2rVar.c = obj;
                return v2rVar;
            default:
                v2r v2rVar2 = new v2r(jmqVar, lnmVar, (byte) 1);
                v2rVar2.c = obj;
                return v2rVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Boolean m231Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        jmq jmqVar = this.d;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        m2r m2rVar = (m2r) jmqVar.a;
                        this.c = null;
                        this.b = true;
                        obj = m2rVar.b(this);
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
                    m231Var = (Boolean) obj;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                Boolean bool = m231Var;
                Object x231Var = bool != null ? new x231(bool.booleanValue()) : n231.a;
                bpb1 bpb1Var = (bpb1) jmqVar.b;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, x231Var);
                return rih1Var;
            default:
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fn31.T(ssw0Var, (o8n) null, 0, new k53(jmqVar, ssw0Var, (lnm) null, (byte) 8), 3);
                fn31.T(ssw0Var, (o8n) null, 0, new v2r(jmqVar, lnmVar, (byte) 0), 3);
                n0r n0rVar = n0r.d;
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, n0rVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
