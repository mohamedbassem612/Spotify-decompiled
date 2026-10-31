package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pr01 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Throwable d;
    public final /* synthetic */ vr01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr01(vr01 vr01Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = vr01Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr01 vr01Var = this.e;
        vr20 vr20Var = (vr20) obj;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                pr01 pr01Var = new pr01(vr01Var, lnmVar, (byte) 0);
                pr01Var.c = vr20Var;
                pr01Var.d = th;
                return pr01Var.invokeSuspend(rih1Var);
            case 1:
                pr01 pr01Var2 = new pr01(vr01Var, lnmVar, (byte) 1);
                pr01Var2.c = vr20Var;
                pr01Var2.d = th;
                return pr01Var2.invokeSuspend(rih1Var);
            case 2:
                pr01 pr01Var3 = new pr01(vr01Var, lnmVar, (byte) 2);
                pr01Var3.c = vr20Var;
                pr01Var3.d = th;
                return pr01Var3.invokeSuspend(rih1Var);
            case 3:
                pr01 pr01Var4 = new pr01(vr01Var, lnmVar, (byte) 3);
                pr01Var4.c = vr20Var;
                pr01Var4.d = th;
                return pr01Var4.invokeSuspend(rih1Var);
            default:
                pr01 pr01Var5 = new pr01(vr01Var, lnmVar, (byte) 4);
                pr01Var5.c = vr20Var;
                pr01Var5.d = th;
                return pr01Var5.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        vr01 vr01Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Throwable th = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vr01Var.f("Failed reactions decoration: " + th.getMessage());
                bbr bbrVar = new bbr(b7xVar);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var.emit(bbrVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = this.c;
                Throwable th2 = this.d;
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
                vr01Var.f("Failed to resolve username for reactions: " + th2.getMessage());
                bbr bbrVar2 = new bbr(b7xVar);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var2.emit(bbrVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = this.c;
                Throwable th3 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vr01Var.f("Failed to fetch share profile metadata: " + th3.getMessage());
                bbr bbrVar3 = new bbr(b7xVar);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var3.emit(bbrVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = this.c;
                Throwable th4 = this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vr01Var.f("Failed sponsorship decoration: " + th4.getMessage());
                bbr bbrVar4 = new bbr(b7xVar);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var4.emit(bbrVar4, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var5 = this.c;
                Throwable th5 = this.d;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vr01Var.f("Failed Wrapped share decoration: " + th5.getMessage());
                bbr bbrVar5 = new bbr(b7xVar);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var5.emit(bbrVar5, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
