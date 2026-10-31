package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ov5 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ov5(vr20 vr20Var, Object obj, long j, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.d = obj;
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object emit(Object obj, lnm lnmVar) {
        nv5 nv5Var;
        yw9 yw9Var;
        int i;
        int i2;
        vr20 vr20Var;
        u7h u7hVar;
        u7h u7hVar2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var2 = this.b;
        d9n d9nVar = d9n.a;
        Object obj2 = this.d;
        long jE = this.c;
        switch (b) {
            case 0:
                if (lnmVar instanceof nv5) {
                    nv5Var = (nv5) lnmVar;
                    int i3 = nv5Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nv5Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        nv5Var = new nv5(this, lnmVar);
                    }
                } else {
                    nv5Var = new nv5(this, lnmVar);
                }
                Object obj3 = nv5Var.a;
                int i4 = nv5Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                yv5 yv5Var = (yv5) obj2;
                if (yv5Var.t <= 20 || yv5Var.d.b() <= jE) {
                    return rih1Var;
                }
                nv5Var.b = 1;
                return vr20Var2.emit(obj, nv5Var) == d9nVar ? d9nVar : rih1Var;
            default:
                yu3 yu3Var = (yu3) obj2;
                if (lnmVar instanceof yw9) {
                    yw9Var = (yw9) lnmVar;
                    int i5 = yw9Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        yw9Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        yw9Var = new yw9(this, lnmVar);
                    }
                } else {
                    yw9Var = new yw9(this, lnmVar);
                }
                Object objB = yw9Var.a;
                int i6 = yw9Var.b;
                if (i6 == 0) {
                    hm5.M(objB);
                    xw9 xw9Var = (xw9) obj;
                    bxh bxhVar = (uwh) yu3Var.b;
                    String str = xw9Var.a;
                    int i7 = xw9Var.b;
                    yw9Var.c = vr20Var2;
                    i = 0;
                    yw9Var.d = 0;
                    yw9Var.f = 0;
                    yw9Var.b = 1;
                    objB = bxhVar.b(i7, str, yw9Var);
                    if (objB != d9nVar) {
                        i2 = 0;
                    }
                    return d9nVar;
                }
                if (i6 == 1) {
                    int i8 = yw9Var.f;
                    int i9 = yw9Var.d;
                    vr20Var2 = yw9Var.c;
                    hm5.M(objB);
                    i = i8;
                    i2 = i9;
                } else {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            hm5.M(objB);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = yw9Var.d;
                    vr20Var = yw9Var.c;
                    hm5.M(objB);
                }
                u7hVar2 = (u7h) objB;
                if (u7hVar2 != null) {
                    jE = u7hVar2.a;
                }
                vr20Var2 = vr20Var;
                u7hVar = new u7h(jE);
                yw9Var.c = null;
                yw9Var.d = i2;
                yw9Var.b = 3;
                if (vr20Var2.emit(u7hVar, yw9Var) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
                rzh rzhVar = (rzh) objB;
                dlb dlbVar = rzhVar != null ? rzhVar.c : null;
                if (!(dlbVar instanceof blb)) {
                    if (dlbVar instanceof zkb) {
                        String str2 = ((zkb) dlbVar).a;
                        yw9Var.c = vr20Var2;
                        yw9Var.d = i2;
                        yw9Var.f = i;
                        yw9Var.b = 2;
                        objB = yu3Var.i(str2, yw9Var);
                        if (objB != d9nVar) {
                            vr20Var = vr20Var2;
                            u7hVar2 = (u7h) objB;
                            if (u7hVar2 != null) {
                                jE = u7hVar2.a;
                            }
                            vr20Var2 = vr20Var;
                        }
                    }
                    return d9nVar;
                }
                o8h o8hVar = ((blb) dlbVar).e;
                if (o8hVar != null) {
                    jE = z4p1.e((int) (4278190080L | ((long) o8hVar.c)));
                }
                u7hVar = new u7h(jE);
                yw9Var.c = null;
                yw9Var.d = i2;
                yw9Var.b = 3;
                if (vr20Var2.emit(u7hVar, yw9Var) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
