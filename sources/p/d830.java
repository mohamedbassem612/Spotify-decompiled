package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d830 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ d830(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object a(onm onmVar) {
        c830 c830Var;
        zfc0 zfc0Var;
        imm0 imm0Var;
        tp01 tp01Var;
        byte b = this.a;
        uda1 uda1Var = uda1.a;
        Object obj = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (onmVar instanceof c830) {
                    c830Var = (c830) onmVar;
                    int i = c830Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c830Var.c = i - Integer.MIN_VALUE;
                    } else {
                        c830Var = new c830(this, onmVar);
                    }
                } else {
                    c830Var = new c830(this, onmVar);
                }
                Object objA = c830Var.a;
                int i2 = c830Var.c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(objA);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(objA);
                c830Var.c = 1;
                objA = ((y730) obj).a(c830Var);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                b830 b830Var = (b830) objA;
                if (b830Var instanceof a830) {
                    return new wda1(((a830) b830Var).a);
                }
                if (u890.j(b830Var, z730.a)) {
                    return uda1Var;
                }
                eg.o();
                return null;
            case 1:
                if (onmVar instanceof zfc0) {
                    zfc0Var = (zfc0) onmVar;
                    int i3 = zfc0Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zfc0Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        zfc0Var = new zfc0(this, onmVar);
                    }
                } else {
                    zfc0Var = new zfc0(this, onmVar);
                }
                Object objA2 = zfc0Var.a;
                int i4 = zfc0Var.c;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(objA2);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(objA2);
                zfc0Var.c = 1;
                objA2 = ((mfc0) obj).a(zfc0Var);
                if (objA2 == d9nVar) {
                    return d9nVar;
                }
                xfc0 xfc0Var = (xfc0) objA2;
                if (xfc0Var instanceof wfc0) {
                    return new vda1(((wfc0) xfc0Var).a);
                }
                if (u890.j(xfc0Var, vfc0.a)) {
                    return uda1Var;
                }
                eg.o();
                return null;
            case 2:
                if (onmVar instanceof imm0) {
                    imm0Var = (imm0) onmVar;
                    int i5 = imm0Var.c;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        imm0Var.c = i5 - Integer.MIN_VALUE;
                    } else {
                        imm0Var = new imm0(this, onmVar);
                    }
                } else {
                    imm0Var = new imm0(this, onmVar);
                }
                Object objA3 = imm0Var.a;
                int i6 = imm0Var.c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(objA3);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(objA3);
                imm0Var.c = 1;
                objA3 = ((kmm0) obj).a(imm0Var);
                if (objA3 == d9nVar) {
                    return d9nVar;
                }
                nmm0 nmm0Var = (nmm0) objA3;
                if (nmm0Var instanceof mmm0) {
                    return new vda1(((mmm0) nmm0Var).a);
                }
                if (u890.j(nmm0Var, lmm0.a)) {
                    return uda1Var;
                }
                eg.o();
                return null;
            default:
                if (onmVar instanceof tp01) {
                    tp01Var = (tp01) onmVar;
                    int i7 = tp01Var.c;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        tp01Var.c = i7 - Integer.MIN_VALUE;
                    } else {
                        tp01Var = new tp01(this, onmVar);
                    }
                } else {
                    tp01Var = new tp01(this, onmVar);
                }
                Object objA4 = tp01Var.a;
                int i8 = tp01Var.c;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(objA4);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(objA4);
                tp01Var.c = 1;
                objA4 = ((xp01) obj).a(tp01Var);
                if (objA4 == d9nVar) {
                    return d9nVar;
                }
                bq01 bq01Var = (bq01) objA4;
                if (bq01Var instanceof aq01) {
                    return new vda1(((aq01) bq01Var).a);
                }
                if (u890.j(bq01Var, zp01.a)) {
                    return uda1Var;
                }
                eg.o();
                return null;
        }
    }
}
