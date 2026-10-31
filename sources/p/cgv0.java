package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cgv0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ oei1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ l811 e;

    public /* synthetic */ cgv0(vr20 vr20Var, oei1 oei1Var, long j, l811 l811Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = oei1Var;
        this.d = j;
        this.e = l811Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public final Object b(vfv0 vfv0Var, lnm lnmVar) {
        bgv0 bgv0Var;
        long j;
        dgv0 dgv0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l811 l811Var = this.e;
        long j2 = this.d;
        oei1 oei1Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof bgv0) {
                    bgv0Var = (bgv0) lnmVar;
                    int i = bgv0Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bgv0Var.c = i - Integer.MIN_VALUE;
                    } else {
                        bgv0Var = new bgv0(this, lnmVar);
                    }
                } else {
                    bgv0Var = new bgv0(this, lnmVar);
                }
                Object obj = bgv0Var.a;
                int i2 = bgv0Var.c;
                if (i2 == 0) {
                    hm5.M(obj);
                    String str = oei1Var.a;
                    if (vfv0Var != null) {
                        j = (j2 - vfv0Var.a) + vfv0Var.b;
                    } else {
                        j = j2;
                    }
                    tfv0 tfv0Var = new tfv0(j, 2, str);
                    bgv0Var.c = 1;
                    if (vr20Var.emit(tfv0Var, bgv0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                l811Var.a = true;
                return rih1Var;
            default:
                if (lnmVar instanceof dgv0) {
                    dgv0Var = (dgv0) lnmVar;
                    int i3 = dgv0Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dgv0Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        dgv0Var = new dgv0(this, lnmVar);
                    }
                } else {
                    dgv0Var = new dgv0(this, lnmVar);
                }
                Object obj2 = dgv0Var.a;
                int i4 = dgv0Var.c;
                if (i4 == 0) {
                    hm5.M(obj2);
                    String str2 = oei1Var.a;
                    if (vfv0Var != null) {
                        j2 = (j2 - vfv0Var.a) + vfv0Var.b;
                    }
                    tfv0 tfv0Var2 = new tfv0(j2, vfv0Var == null ? 2 : 1, str2);
                    dgv0Var.c = 1;
                    if (vr20Var.emit(tfv0Var2, dgv0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj2);
                }
                l811Var.a = true;
                return rih1Var;
        }
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return b((vfv0) obj, lnmVar);
    }
}
