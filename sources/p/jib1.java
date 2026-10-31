package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jib1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ mib1 c;

    public /* synthetic */ jib1(vr20 vr20Var, mib1 mib1Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = mib1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        iib1 iib1Var;
        lib1 lib1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mib1 mib1Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        gd80 gd80Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof iib1) {
                    iib1Var = (iib1) lnmVar;
                    int i = iib1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iib1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        iib1Var = new iib1(this, lnmVar);
                    }
                } else {
                    iib1Var = new iib1(this, lnmVar);
                }
                Object obj2 = iib1Var.a;
                int i2 = iib1Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((pp90) obj) != null || ((bp90) ((c9c0) mib1Var.b.get()).e.a().getValue()).b);
                    iib1Var.b = 1;
                    return vr20Var.emit(boolValueOf, iib1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof lib1) {
                    lib1Var = (lib1) lnmVar;
                    int i3 = lib1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        lib1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        lib1Var = new lib1(this, lnmVar);
                    }
                } else {
                    lib1Var = new lib1(this, lnmVar);
                }
                Object obj3 = lib1Var.a;
                int i4 = lib1Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (((Boolean) obj).booleanValue()) {
                    gd80Var = new gd80(h5a0.a, (xpw) mib1Var.a.get());
                }
                lib1Var.b = 1;
                return vr20Var.emit(gd80Var, lib1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
