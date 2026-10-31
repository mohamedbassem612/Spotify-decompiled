package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f16 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ vtf c;

    public /* synthetic */ f16(vr20 vr20Var, vtf vtfVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = vtfVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        e16 e16Var;
        xd61 xd61Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vtf vtfVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof e16) {
                    e16Var = (e16) lnmVar;
                    int i = e16Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        e16Var.b = i - Integer.MIN_VALUE;
                    } else {
                        e16Var = new e16(this, lnmVar);
                    }
                } else {
                    e16Var = new e16(this, lnmVar);
                }
                Object obj2 = e16Var.a;
                int i2 = e16Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                c16 c16Var = (c16) obj;
                if (c16Var.a.length() <= 0 || !u890.j(c16Var.c, vtfVar.b) || !u890.j(c16Var.b, vtfVar.c)) {
                    return rih1Var;
                }
                e16Var.b = 1;
                return vr20Var.emit(obj, e16Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof xd61) {
                    xd61Var = (xd61) lnmVar;
                    int i3 = xd61Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xd61Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        xd61Var = new xd61(this, lnmVar);
                    }
                } else {
                    xd61Var = new xd61(this, lnmVar);
                }
                Object obj3 = xd61Var.a;
                int i4 = xd61Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                wd61 wd61Var = (wd61) obj;
                if (!u890.j(wd61Var.b, vtfVar.b) || !u890.j(wd61Var.a, vtfVar.c)) {
                    return rih1Var;
                }
                xd61Var.b = 1;
                return vr20Var.emit(obj, xd61Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
