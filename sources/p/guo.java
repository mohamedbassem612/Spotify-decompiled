package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class guo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public u7g1 b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ en31 e;
    public final /* synthetic */ iu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ guo(byte b, lnm lnmVar, iu30 iu30Var, en31 en31Var) {
        super(2, lnmVar);
        this.a = b;
        this.e = en31Var;
        this.f = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                guo guoVar = new guo((byte) 0, lnmVar, this.f, this.e);
                guoVar.d = obj;
                return guoVar;
            default:
                guo guoVar2 = new guo((byte) 1, lnmVar, this.f, this.e);
                guoVar2.d = obj;
                return guoVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        v7g1 v7g1Var = (v7g1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(v7g1Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[PHI: r0 r1
      0x0085: PHI (r0v16 p.u7g1) = (r0v15 p.u7g1), (r0v15 p.u7g1), (r0v22 p.u7g1) binds: [B:23:0x0072, B:25:0x0082, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r1v12 p.v7g1) = (r1v11 p.v7g1), (r1v11 p.v7g1), (r1v18 p.v7g1) binds: [B:23:0x0072, B:25:0x0082, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[PHI: r0 r14
      0x0099: PHI (r0v18 p.v7g1) = (r0v17 p.v7g1), (r0v24 p.v7g1) binds: [B:28:0x0096, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r14v32 java.lang.Object) = (r14v30 java.lang.Object), (r14v0 java.lang.Object) binds: [B:28:0x0096, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x0130 A[PHI: r0 r1
      0x0130: PHI (r0v4 p.u7g1) = (r0v3 p.u7g1), (r0v3 p.u7g1), (r0v10 p.u7g1) binds: [B:58:0x011d, B:60:0x012d, B:50:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r1v3 p.v7g1) = (r1v2 p.v7g1), (r1v2 p.v7g1), (r1v9 p.v7g1) binds: [B:58:0x011d, B:60:0x012d, B:50:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0145 A[PHI: r0 r14
      0x0145: PHI (r0v6 p.v7g1) = (r0v5 p.v7g1), (r0v12 p.v7g1) binds: [B:63:0x0142, B:49:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r14v12 java.lang.Object) = (r14v10 java.lang.Object), (r14v0 java.lang.Object) binds: [B:63:0x0142, B:49:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x015c  */
    public final Object invokeSuspend(Object obj) {
        u7g1 u7g1Var;
        v7g1 v7g1Var;
        u7g1 u7g1Var2;
        v7g1 v7g1Var2;
        Boolean boolD;
        Object obj2;
        u7g1 u7g1Var3;
        v7g1 v7g1Var3;
        u7g1 u7g1Var4;
        v7g1 v7g1Var4;
        Boolean boolD2;
        Object obj3;
        byte b = this.a;
        u7g1 u7g1Var5 = u7g1.b;
        Boolean bool = d9n.a;
        en31 en31Var = this.e;
        iu30 iu30Var = this.f;
        switch (b) {
            case 0:
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    v7g1 v7g1Var5 = (v7g1) this.d;
                    this.d = v7g1Var5;
                    this.b = u7g1Var5;
                    this.c = (byte) 1;
                    Boolean boolD3 = v7g1Var5.d(this);
                    if (boolD3 != bool) {
                        u7g1Var = u7g1Var5;
                        v7g1Var = v7g1Var5;
                        obj = boolD3;
                    }
                    return bool;
                }
                if (b2 == 1) {
                    u7g1 u7g1Var6 = this.b;
                    v7g1 v7g1Var6 = (v7g1) this.d;
                    hm5.M(obj);
                    u7g1Var = u7g1Var6;
                    v7g1Var = v7g1Var6;
                } else {
                    if (b2 == 2) {
                        u7g1Var2 = this.b;
                        v7g1Var = (v7g1) this.d;
                        hm5.M(obj);
                        u7g1 u7g1Var7 = u7g1Var2;
                        v7g1Var2 = v7g1Var;
                        fuo fuoVar = new fuo((lnm) null, iu30Var, (byte) 0);
                        this.d = v7g1Var2;
                        this.b = null;
                        this.c = (byte) 3;
                        obj = v7g1Var2.a(u7g1Var7, fuoVar, this);
                        if (obj != bool) {
                            this.d = obj;
                            this.c = (byte) 4;
                            boolD = v7g1Var2.d(this);
                            if (boolD != bool) {
                                Object obj4 = obj;
                                obj = boolD;
                                obj2 = obj4;
                            }
                        }
                        return bool;
                    }
                    if (b2 == 3) {
                        v7g1Var2 = (v7g1) this.d;
                        hm5.M(obj);
                        this.d = obj;
                        this.c = (byte) 4;
                        boolD = v7g1Var2.d(this);
                        if (boolD != bool) {
                            Object obj5 = obj;
                            obj = boolD;
                            obj2 = obj5;
                        }
                        return bool;
                    }
                    if (b2 != 4) {
                        if (b2 == 5) {
                            hm5.M(obj);
                            return obj;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.d;
                    hm5.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    ec90 ec90VarH = en31Var.h();
                    ec90VarH.b.c(ec90VarH.e, ec90VarH.f);
                }
                return obj2;
                u7g1Var2 = u7g1Var;
                if (((Boolean) obj).booleanValue()) {
                    u7g1 u7g1Var8 = u7g1Var2;
                    v7g1Var2 = v7g1Var;
                    fuo fuoVar2 = new fuo((lnm) null, iu30Var, (byte) 0);
                    this.d = v7g1Var2;
                    this.b = null;
                    this.c = (byte) 3;
                    obj = v7g1Var2.a(u7g1Var8, fuoVar2, this);
                    if (obj != bool) {
                        this.d = obj;
                        this.c = (byte) 4;
                        boolD = v7g1Var2.d(this);
                        if (boolD != bool) {
                            Object obj6 = obj;
                            obj = boolD;
                            obj2 = obj6;
                            if (!((Boolean) obj).booleanValue()) {
                                ec90 ec90VarH2 = en31Var.h();
                                ec90VarH2.b.c(ec90VarH2.e, ec90VarH2.f);
                            }
                            return obj2;
                        }
                    }
                } else {
                    ec90 ec90VarH3 = en31Var.h();
                    this.d = v7g1Var;
                    this.b = u7g1Var2;
                    this.c = (byte) 2;
                    if (ec90VarH3.a(this) != bool) {
                        u7g1 u7g1Var9 = u7g1Var2;
                        v7g1Var2 = v7g1Var;
                        fuo fuoVar3 = new fuo((lnm) null, iu30Var, (byte) 0);
                        this.d = v7g1Var2;
                        this.b = null;
                        this.c = (byte) 3;
                        obj = v7g1Var2.a(u7g1Var9, fuoVar3, this);
                        if (obj != bool) {
                            this.d = obj;
                            this.c = (byte) 4;
                            boolD = v7g1Var2.d(this);
                            if (boolD != bool) {
                                Object obj7 = obj;
                                obj = boolD;
                                obj2 = obj7;
                                if (!((Boolean) obj).booleanValue()) {
                                    ec90 ec90VarH4 = en31Var.h();
                                    ec90VarH4.b.c(ec90VarH4.e, ec90VarH4.f);
                                }
                                return obj2;
                            }
                        }
                    }
                }
                return bool;
            default:
                byte b3 = this.c;
                if (b3 == 0) {
                    hm5.M(obj);
                    v7g1 v7g1Var7 = (v7g1) this.d;
                    this.d = v7g1Var7;
                    this.b = u7g1Var5;
                    this.c = (byte) 1;
                    Boolean boolD4 = v7g1Var7.d(this);
                    if (boolD4 != bool) {
                        u7g1Var3 = u7g1Var5;
                        v7g1Var3 = v7g1Var7;
                        obj = boolD4;
                    }
                    return bool;
                }
                if (b3 == 1) {
                    u7g1 u7g1Var10 = this.b;
                    v7g1 v7g1Var8 = (v7g1) this.d;
                    hm5.M(obj);
                    u7g1Var3 = u7g1Var10;
                    v7g1Var3 = v7g1Var8;
                } else {
                    if (b3 == 2) {
                        u7g1Var4 = this.b;
                        v7g1Var3 = (v7g1) this.d;
                        hm5.M(obj);
                        u7g1 u7g1Var11 = u7g1Var4;
                        v7g1Var4 = v7g1Var3;
                        fuo fuoVar4 = new fuo((lnm) null, iu30Var, (byte) 1);
                        this.d = v7g1Var4;
                        this.b = null;
                        this.c = (byte) 3;
                        obj = v7g1Var4.a(u7g1Var11, fuoVar4, this);
                        if (obj != bool) {
                            this.d = obj;
                            this.c = (byte) 4;
                            boolD2 = v7g1Var4.d(this);
                            if (boolD2 != bool) {
                                Object obj8 = obj;
                                obj = boolD2;
                                obj3 = obj8;
                            }
                        }
                        return bool;
                    }
                    if (b3 == 3) {
                        v7g1Var4 = (v7g1) this.d;
                        hm5.M(obj);
                        this.d = obj;
                        this.c = (byte) 4;
                        boolD2 = v7g1Var4.d(this);
                        if (boolD2 != bool) {
                            Object obj9 = obj;
                            obj = boolD2;
                            obj3 = obj9;
                        }
                        return bool;
                    }
                    if (b3 != 4) {
                        if (b3 == 5) {
                            hm5.M(obj);
                            return obj;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = this.d;
                    hm5.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    ec90 ec90VarH5 = en31Var.h();
                    ec90VarH5.b.c(ec90VarH5.e, ec90VarH5.f);
                }
                return obj3;
                u7g1Var4 = u7g1Var3;
                if (((Boolean) obj).booleanValue()) {
                    u7g1 u7g1Var12 = u7g1Var4;
                    v7g1Var4 = v7g1Var3;
                    fuo fuoVar5 = new fuo((lnm) null, iu30Var, (byte) 1);
                    this.d = v7g1Var4;
                    this.b = null;
                    this.c = (byte) 3;
                    obj = v7g1Var4.a(u7g1Var12, fuoVar5, this);
                    if (obj != bool) {
                        this.d = obj;
                        this.c = (byte) 4;
                        boolD2 = v7g1Var4.d(this);
                        if (boolD2 != bool) {
                            Object obj10 = obj;
                            obj = boolD2;
                            obj3 = obj10;
                            if (!((Boolean) obj).booleanValue()) {
                                ec90 ec90VarH6 = en31Var.h();
                                ec90VarH6.b.c(ec90VarH6.e, ec90VarH6.f);
                            }
                            return obj3;
                        }
                    }
                } else {
                    ec90 ec90VarH7 = en31Var.h();
                    this.d = v7g1Var3;
                    this.b = u7g1Var4;
                    this.c = (byte) 2;
                    if (ec90VarH7.a(this) != bool) {
                        u7g1 u7g1Var13 = u7g1Var4;
                        v7g1Var4 = v7g1Var3;
                        fuo fuoVar6 = new fuo((lnm) null, iu30Var, (byte) 1);
                        this.d = v7g1Var4;
                        this.b = null;
                        this.c = (byte) 3;
                        obj = v7g1Var4.a(u7g1Var13, fuoVar6, this);
                        if (obj != bool) {
                            this.d = obj;
                            this.c = (byte) 4;
                            boolD2 = v7g1Var4.d(this);
                            if (boolD2 != bool) {
                                Object obj11 = obj;
                                obj = boolD2;
                                obj3 = obj11;
                                if (!((Boolean) obj).booleanValue()) {
                                    ec90 ec90VarH8 = en31Var.h();
                                    ec90VarH8.b.c(ec90VarH8.e, ec90VarH8.f);
                                }
                                return obj3;
                            }
                        }
                    }
                }
                return bool;
        }
    }
}
