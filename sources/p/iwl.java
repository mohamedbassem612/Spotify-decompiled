package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iwl implements vr20 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ k8g1 c;

    public iwl(vr20 vr20Var, oi oiVar, k8g1 k8g1Var) {
        this.b = vr20Var;
        this.c = k8g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object emit(Object obj, lnm lnmVar) {
        hwl hwlVar;
        i1r i1rVar;
        ynt yntVar;
        Object wntVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k8g1 k8g1Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof hwl) {
                    hwlVar = (hwl) lnmVar;
                    int i = hwlVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hwlVar.b = i - Integer.MIN_VALUE;
                    } else {
                        hwlVar = new hwl(this, lnmVar);
                    }
                } else {
                    hwlVar = new hwl(this, lnmVar);
                }
                Object obj2 = hwlVar.a;
                int i2 = hwlVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    xnt xntVar = (xnt) obj;
                    if (xntVar instanceof wnt) {
                        i1rVar = new i1r(((wnt) xntVar).a, (Integer) null);
                    } else if ((xntVar instanceof unt) || (xntVar instanceof vnt)) {
                        i1rVar = new i1r(k8g1Var, (Integer) null);
                    } else {
                        eg.o();
                    }
                    hwlVar.b = 1;
                    return vr20Var.emit(i1rVar, hwlVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof ynt) {
                    yntVar = (ynt) lnmVar;
                    int i3 = yntVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yntVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        yntVar = new ynt(this, lnmVar);
                    }
                } else {
                    yntVar = new ynt(this, lnmVar);
                }
                Object obj3 = yntVar.a;
                int i4 = yntVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                x5s0 x5s0Var = (x5s0) obj;
                int iC = l1d.C(x5s0Var.b);
                if (iC == 1) {
                    wntVar = unt.a;
                } else if (iC != 2) {
                    wntVar = vnt.a;
                } else {
                    wntVar = new wnt(new k8g1(k8g1Var.a, k8g1Var.b, k8g1Var.c, k8g1Var.d, k8g1Var.e, k8g1Var.f, k8g1Var.g, k8g1Var.h, u2p1.k(k8g1Var.i, x5s0Var.c), k8g1Var.t, x5s0Var.d ? qpe1.d : qpe1.c, k8g1Var.Y, k8g1Var.Z));
                }
                yntVar.b = 1;
                return vr20Var.emit(wntVar, yntVar) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public iwl(vr20 vr20Var, k8g1 k8g1Var) {
        this.b = vr20Var;
        this.c = k8g1Var;
    }
}
