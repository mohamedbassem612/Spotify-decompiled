package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xvc0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ fkv c;

    public /* synthetic */ xvc0(vr20 vr20Var, fkv fkvVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = fkvVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) {
        wvc0 wvc0Var;
        ewc0 ewc0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fkv fkvVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof wvc0) {
                    wvc0Var = (wvc0) lnmVar;
                    int i = wvc0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wvc0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        wvc0Var = new wvc0(this, lnmVar);
                    }
                } else {
                    wvc0Var = new wvc0(this, lnmVar);
                }
                Object obj2 = wvc0Var.a;
                int i2 = wvc0Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    oy21 oy21Var = (py21) obj;
                    zvc0 zvc0Var = new zvc0(fkvVar, (byte) 0);
                    oy21Var.getClass();
                    if (oy21Var instanceof ly21) {
                        hhg1.l(((ly21) oy21Var).a, "Failed to get playlist: ");
                    } else {
                        if (oy21Var instanceof oy21) {
                            Object objInvoke = zvc0Var.invoke(oy21Var.a);
                            wvc0Var.b = 1;
                            return vr20Var.emit(objInvoke, wvc0Var) == d9nVar ? d9nVar : rih1Var;
                        }
                        eg.o();
                    }
                } else {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                if (lnmVar instanceof ewc0) {
                    ewc0Var = (ewc0) lnmVar;
                    int i3 = ewc0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ewc0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        ewc0Var = new ewc0(this, lnmVar);
                    }
                } else {
                    ewc0Var = new ewc0(this, lnmVar);
                }
                Object obj3 = ewc0Var.a;
                int i4 = ewc0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    oy21 oy21Var2 = (py21) obj;
                    zvc0 zvc0Var2 = new zvc0(fkvVar, (byte) 3);
                    oy21Var2.getClass();
                    if (oy21Var2 instanceof ly21) {
                        hhg1.l(((ly21) oy21Var2).a, "Failed to get playlist: ");
                    } else {
                        if (oy21Var2 instanceof oy21) {
                            Object objInvoke2 = zvc0Var2.invoke(oy21Var2.a);
                            ewc0Var.b = 1;
                            return vr20Var.emit(objInvoke2, ewc0Var) == d9nVar ? d9nVar : rih1Var;
                        }
                        eg.o();
                    }
                } else {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
