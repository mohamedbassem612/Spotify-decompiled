package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iuo extends a8d1 implements vu30 {
    public u7g1 a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ en31 f;
    public final /* synthetic */ iu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuo(lnm lnmVar, iu30 iu30Var, en31 en31Var, boolean z, boolean z2) {
        super(2, lnmVar);
        this.d = z;
        this.e = z2;
        this.f = en31Var;
        this.g = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        iuo iuoVar = new iuo(lnmVar, this.g, this.f, this.d, this.e);
        iuoVar.c = obj;
        return iuoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((v7g1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT, PHI: r0 r12
      0x009c: PHI (r0v11 p.v7g1) = (r0v8 p.v7g1), (r0v16 p.v7g1) binds: [B:34:0x0099, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r12v15 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:34:0x0099, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        u7g1 u7g1Var;
        v7g1 v7g1Var;
        u7g1 u7g1Var2;
        v7g1 v7g1Var2;
        v7g1 v7g1Var3;
        Boolean boolD;
        Object obj2;
        byte b = this.b;
        iu30 iu30Var = this.g;
        en31 en31Var = this.f;
        boolean z = this.e;
        Boolean bool = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            v7g1 v7g1Var4 = (v7g1) this.c;
            if (!this.d) {
                return iu30Var.invoke(((uvz0) v7g1Var4).b());
            }
            u7g1Var = z ? u7g1.a : u7g1.b;
            if (z) {
                u7g1 u7g1Var3 = u7g1Var;
                v7g1Var = v7g1Var4;
                u7g1Var2 = u7g1Var3;
                py5 py5Var = new py5((lnm) null, iu30Var, (byte) 3);
                this.c = v7g1Var;
                this.a = null;
                this.b = (byte) 3;
                obj = v7g1Var.a(u7g1Var2, py5Var, this);
                if (obj != bool) {
                    if (z) {
                        return obj;
                    }
                    this.c = obj;
                    this.b = (byte) 4;
                    boolD = v7g1Var.d(this);
                    if (boolD != bool) {
                        Object obj3 = obj;
                        obj = boolD;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            ec90 ec90VarH = en31Var.h();
                            ec90VarH.b.c(ec90VarH.e, ec90VarH.f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.c = v7g1Var4;
                this.a = u7g1Var;
                this.b = (byte) 1;
                Boolean boolD2 = v7g1Var4.d(this);
                if (boolD2 != bool) {
                    v7g1Var2 = v7g1Var4;
                    obj = boolD2;
                }
            }
            return bool;
        }
        if (b == 1) {
            u7g1Var = this.a;
            v7g1Var2 = (v7g1) this.c;
            hm5.M(obj);
        } else {
            if (b == 2) {
                u7g1Var = this.a;
                v7g1Var3 = (v7g1) this.c;
                hm5.M(obj);
                u7g1Var2 = u7g1Var;
                v7g1Var = v7g1Var3;
                py5 py5Var2 = new py5((lnm) null, iu30Var, (byte) 3);
                this.c = v7g1Var;
                this.a = null;
                this.b = (byte) 3;
                obj = v7g1Var.a(u7g1Var2, py5Var2, this);
                if (obj != bool) {
                    if (z) {
                        return obj;
                    }
                    this.c = obj;
                    this.b = (byte) 4;
                    boolD = v7g1Var.d(this);
                    if (boolD != bool) {
                        Object obj4 = obj;
                        obj = boolD;
                        obj2 = obj4;
                    }
                }
                return bool;
            }
            if (b == 3) {
                v7g1Var = (v7g1) this.c;
                hm5.M(obj);
                if (z) {
                    return obj;
                }
                this.c = obj;
                this.b = (byte) 4;
                boolD = v7g1Var.d(this);
                if (boolD != bool) {
                    Object obj5 = obj;
                    obj = boolD;
                    obj2 = obj5;
                }
                return bool;
            }
            if (b != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.c;
            hm5.M(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            ec90 ec90VarH2 = en31Var.h();
            ec90VarH2.b.c(ec90VarH2.e, ec90VarH2.f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            u7g1Var2 = u7g1Var;
            v7g1Var = v7g1Var2;
            py5 py5Var3 = new py5((lnm) null, iu30Var, (byte) 3);
            this.c = v7g1Var;
            this.a = null;
            this.b = (byte) 3;
            obj = v7g1Var.a(u7g1Var2, py5Var3, this);
            if (obj != bool) {
                if (z) {
                    return obj;
                }
                this.c = obj;
                this.b = (byte) 4;
                boolD = v7g1Var.d(this);
                if (boolD != bool) {
                    Object obj6 = obj;
                    obj = boolD;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        ec90 ec90VarH3 = en31Var.h();
                        ec90VarH3.b.c(ec90VarH3.e, ec90VarH3.f);
                    }
                    return obj2;
                }
            }
        } else {
            ec90 ec90VarH4 = en31Var.h();
            this.c = v7g1Var2;
            this.a = u7g1Var;
            this.b = (byte) 2;
            if (ec90VarH4.a(this) != bool) {
                v7g1Var3 = v7g1Var2;
                u7g1Var2 = u7g1Var;
                v7g1Var = v7g1Var3;
                py5 py5Var4 = new py5((lnm) null, iu30Var, (byte) 3);
                this.c = v7g1Var;
                this.a = null;
                this.b = (byte) 3;
                obj = v7g1Var.a(u7g1Var2, py5Var4, this);
                if (obj != bool) {
                    if (z) {
                        return obj;
                    }
                    this.c = obj;
                    this.b = (byte) 4;
                    boolD = v7g1Var.d(this);
                    if (boolD != bool) {
                        Object obj7 = obj;
                        obj = boolD;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            ec90 ec90VarH5 = en31Var.h();
                            ec90VarH5.b.c(ec90VarH5.e, ec90VarH5.f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return bool;
    }
}
