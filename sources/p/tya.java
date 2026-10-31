package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tya extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mr20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tya(mr20 mr20Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = mr20Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        mr20 mr20Var = this.d;
        switch (b) {
            case 0:
                tya tyaVar = new tya(mr20Var, lnmVar, (byte) 0);
                tyaVar.c = obj;
                return tyaVar;
            case 1:
                tya tyaVar2 = new tya(mr20Var, lnmVar, (byte) 1);
                tyaVar2.c = obj;
                return tyaVar2;
            case 2:
                tya tyaVar3 = new tya(mr20Var, lnmVar, (byte) 2);
                tyaVar3.c = obj;
                return tyaVar3;
            case 3:
                tya tyaVar4 = new tya(mr20Var, lnmVar, (byte) 3);
                tyaVar4.c = obj;
                return tyaVar4;
            case 4:
                tya tyaVar5 = new tya(mr20Var, lnmVar, (byte) 4);
                tyaVar5.c = obj;
                return tyaVar5;
            case 5:
                tya tyaVar6 = new tya(mr20Var, lnmVar, (byte) 5);
                tyaVar6.c = obj;
                return tyaVar6;
            case 6:
                tya tyaVar7 = new tya(mr20Var, lnmVar, (byte) 6);
                tyaVar7.c = obj;
                return tyaVar7;
            case 7:
                tya tyaVar8 = new tya(mr20Var, lnmVar, (byte) 7);
                tyaVar8.c = obj;
                return tyaVar8;
            case 8:
                tya tyaVar9 = new tya(mr20Var, lnmVar, (byte) 8);
                tyaVar9.c = obj;
                return tyaVar9;
            case 9:
                tya tyaVar10 = new tya(mr20Var, lnmVar, (byte) 9);
                tyaVar10.c = obj;
                return tyaVar10;
            default:
                tya tyaVar11 = new tya(mr20Var, lnmVar, (byte) 10);
                tyaVar11.c = obj;
                return tyaVar11;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mr20 mr20Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
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
                bt9 bt9Var = new bt9(vr20Var, (byte) 16);
                this.c = null;
                this.b = true;
                return mr20Var.collect(bt9Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    vs0 vs0Var = new vs0(cy30.u(obj), ssw0Var, false, (lnm) null, (byte) 14);
                    this.c = null;
                    this.b = true;
                    return l4p1.q(mr20Var, vs0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z3 = this.b;
                if (!z3) {
                    gbh gbhVar = new gbh(l1d.y(obj), vr20Var2, (byte) 0);
                    this.c = null;
                    this.b = true;
                    return mr20Var.collect(gbhVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                ssw0 ssw0Var2 = (ssw0) this.c;
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
                d9l d9lVar = new d9l(ygn0.a(), new p811(), new p811(), new p811(), ssw0Var2, (byte) 0);
                this.c = null;
                this.b = true;
                return mr20Var.collect(d9lVar, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var3 = (vr20) this.c;
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
                x5s x5sVar = new x5s(vr20Var3, (byte) 1);
                this.c = null;
                this.b = true;
                return mr20Var.collect(x5sVar, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                ssw0 ssw0Var3 = (ssw0) this.c;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cu cuVar = new cu(ssw0Var3, (byte) 6);
                this.c = null;
                this.b = true;
                return mr20Var.collect(cuVar, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                ssw0 ssw0Var4 = (ssw0) this.c;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cu cuVar2 = new cu(ssw0Var4, (byte) 7);
                this.c = null;
                this.b = true;
                return mr20Var.collect(cuVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                vr20 vr20Var4 = (vr20) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                w0b0 w0b0Var = new w0b0(vr20Var4, (byte) 25);
                this.c = null;
                this.b = true;
                return mr20Var.collect(w0b0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ft1 ft1Var = new ft1((byte) 8);
                this.c = null;
                this.b = true;
                return mr20Var.collect(ft1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                vr20 vr20Var5 = (vr20) this.c;
                boolean z10 = this.b;
                if (!z10) {
                    hv90 hv90Var = new hv90(cy30.u(obj), vr20Var5, (byte) 2);
                    this.c = null;
                    this.b = true;
                    return mr20Var.collect(hv90Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z10) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                vr20 vr20Var6 = (vr20) this.c;
                boolean z11 = this.b;
                if (!z11) {
                    hv90 hv90Var2 = new hv90(vr20Var6, cy30.u(obj), (byte) 3);
                    this.c = null;
                    this.b = true;
                    return mr20Var.collect(hv90Var2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z11) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
