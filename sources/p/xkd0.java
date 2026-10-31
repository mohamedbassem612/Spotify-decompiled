package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xkd0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public long b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkd0(long j, hyy0 hyy0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = j;
        this.f = hyy0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        long j = this.e;
        switch (b) {
            case 0:
                xkd0 xkd0Var = new xkd0((ykd0) obj2, j, lnmVar);
                xkd0Var.d = obj;
                return xkd0Var;
            default:
                xkd0 xkd0Var2 = new xkd0(j, (hyy0) obj2, lnmVar);
                xkd0Var2.d = obj;
                return xkd0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        long jB;
        long j;
        long j2;
        long jL0;
        Boolean bool;
        byte b = this.a;
        Object obj2 = this.f;
        long j3 = this.e;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.d;
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    jB = ((ykd0) obj2).a.b();
                    if (j3 > jB) {
                        this.d = vr20Var;
                        this.b = jB;
                        this.c = (byte) 1;
                        if (vr20Var.emit(zkd0.a, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    this.d = null;
                    this.b = jB;
                    this.c = (byte) 3;
                    if (vr20Var.emit(zkd0.b, this) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                }
                if (b2 == 1) {
                    jB = this.b;
                    hm5.M(obj);
                } else if (b2 == 2) {
                    j = this.b;
                    hm5.M(obj);
                    jB = j;
                    this.d = null;
                    this.b = jB;
                    this.c = (byte) 3;
                    if (vr20Var.emit(zkd0.b, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (b2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
                this.d = vr20Var;
                this.b = jB;
                this.c = (byte) 2;
                if (hap1.i(j3 - jB, this) == d9nVar) {
                    return d9nVar;
                }
                j = jB;
                jB = j;
                this.d = null;
                this.b = jB;
                this.c = (byte) 3;
                if (vr20Var.emit(zkd0.b, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            default:
                vr20 vr20Var2 = (vr20) this.d;
                byte b3 = this.c;
                if (b3 != 0) {
                    if (b3 != 1 && b3 != 2) {
                        if (b3 == 3) {
                            j2 = this.b;
                            hm5.M(obj);
                            ytw0 ytw0Var = jfv.b;
                            jL0 = fdg1.l0(j2, ngv.e);
                            this.d = vr20Var2;
                            this.b = j2;
                            this.c = (byte) 4;
                            if (hap1.j(jL0, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else if (b3 == 4) {
                            j2 = this.b;
                            hm5.M(obj);
                        } else if (b3 != 5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bool = Boolean.TRUE;
                        this.d = null;
                        this.b = j2;
                        this.c = (byte) 5;
                        if (vr20Var2.emit(bool, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    hm5.M(obj);
                } else {
                    hm5.M(obj);
                    if (j3 <= 0) {
                        Boolean bool2 = Boolean.FALSE;
                        this.d = null;
                        this.c = (byte) 1;
                        if (vr20Var2.emit(bool2, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        long jB2 = j3 - (((yqg) ((hyy0) obj2).b).b() / 1000);
                        if (jB2 <= 0) {
                            Boolean bool3 = Boolean.TRUE;
                            this.d = null;
                            this.b = jB2;
                            this.c = (byte) 2;
                            if (vr20Var2.emit(bool3, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            Boolean bool4 = Boolean.FALSE;
                            this.d = vr20Var2;
                            this.b = jB2;
                            this.c = (byte) 3;
                            if (vr20Var2.emit(bool4, this) == d9nVar) {
                                return d9nVar;
                            }
                            j2 = jB2;
                            ytw0 ytw0Var2 = jfv.b;
                            jL0 = fdg1.l0(j2, ngv.e);
                            this.d = vr20Var2;
                            this.b = j2;
                            this.c = (byte) 4;
                            if (hap1.j(jL0, this) == d9nVar) {
                                return d9nVar;
                            }
                            bool = Boolean.TRUE;
                            this.d = null;
                            this.b = j2;
                            this.c = (byte) 5;
                            if (vr20Var2.emit(bool, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkd0(ykd0 ykd0Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.f = ykd0Var;
        this.e = j;
    }
}
