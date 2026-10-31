package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r0r extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public c0r b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d0r e;
    public final /* synthetic */ o3r f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0r(d0r d0rVar, o3r o3rVar, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = d0rVar;
        this.f = o3rVar;
        this.g = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                r0r r0rVar = new r0r(this.e, this.f, this.g, lnmVar, (byte) 0);
                r0rVar.d = obj;
                return r0rVar;
            default:
                r0r r0rVar2 = new r0r(this.e, this.f, this.g, lnmVar, (byte) 1);
                r0rVar2.d = obj;
                return r0rVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((jnd0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        c0r c0rVar;
        Throwable th2;
        c0r c0rVar2;
        byte b = this.a;
        Object obj2 = this.g;
        o3r o3rVar = this.f;
        d0r d0rVar = this.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                jnd0 jnd0Var = (jnd0) this.d;
                boolean z = this.c;
                if (!z) {
                    hm5.M(obj);
                    c0r c0rVarF = x2p1.f(d0rVar, o3rVar, obj2);
                    try {
                        ien0 ien0VarA = c0rVarF.a();
                        clo cloVar = new clo(jnd0Var, null, (byte) 5);
                        this.d = null;
                        this.b = c0rVarF;
                        this.c = true;
                        ien0VarA.b(cloVar, this);
                        return d9nVar;
                    } catch (Throwable th3) {
                        th = th3;
                        c0rVar = c0rVarF;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0rVar = this.b;
                    try {
                        hm5.M(obj);
                        c0rVar.dispose();
                        return rih1Var;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                c0rVar.dispose();
                throw th;
            default:
                vr20 vr20Var = (vr20) this.d;
                boolean z2 = this.c;
                if (!z2) {
                    hm5.M(obj);
                    c0r c0rVarF2 = x2p1.f(d0rVar, o3rVar, obj2);
                    try {
                        bpb1 bpb1Var = c0rVarF2.a().a;
                        wmo wmoVar = new wmo(vr20Var, (byte) 16);
                        this.d = null;
                        this.b = c0rVarF2;
                        this.c = true;
                        bpb1Var.collect(wmoVar, this);
                        return d9nVar;
                    } catch (Throwable th5) {
                        th2 = th5;
                        c0rVar2 = c0rVarF2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0rVar2 = this.b;
                    try {
                        hm5.M(obj);
                        c0rVar2.dispose();
                        return rih1Var;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                }
                c0rVar2.dispose();
                throw th2;
        }
    }
}
