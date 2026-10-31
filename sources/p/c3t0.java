package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c3t0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ dma1 c;

    public /* synthetic */ c3t0(vr20 vr20Var, dma1 dma1Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = dma1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        b3t0 b3t0Var;
        iy11 iy11Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dma1 dma1Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof b3t0) {
                    b3t0Var = (b3t0) lnmVar;
                    int i = b3t0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b3t0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        b3t0Var = new b3t0(this, lnmVar);
                    }
                } else {
                    b3t0Var = new b3t0(this, lnmVar);
                }
                Object obj2 = b3t0Var.a;
                int i2 = b3t0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Boolean boolValueOf = Boolean.valueOf(dma1Var.h(g3t0.c, true));
                b3t0Var.b = 1;
                return vr20Var.emit(boolValueOf, b3t0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof iy11) {
                    iy11Var = (iy11) lnmVar;
                    int i3 = iy11Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        iy11Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        iy11Var = new iy11(this, lnmVar);
                    }
                } else {
                    iy11Var = new iy11(this, lnmVar);
                }
                Object obj3 = iy11Var.a;
                int i4 = iy11Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                hy11.i0.getClass();
                Boolean boolValueOf2 = Boolean.valueOf(dma1Var.h(gy11.b, false));
                iy11Var.b = 1;
                return vr20Var.emit(boolValueOf2, iy11Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
