package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k4a extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4a(boolean z, yu3 yu3Var, boolean z2, String str, String str2, String str3, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.e = yu3Var;
        this.d = z2;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                return new k4a(this.c, (yu3) this.e, this.d, (String) this.f, (String) obj3, (String) obj2, lnmVar);
            default:
                k4a k4aVar = new k4a(lnmVar, (iu30) obj2, (en31) obj3, this.c, this.d);
                k4aVar.f = obj;
                return k4aVar;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((v7g1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        v7g1 v7g1Var;
        u7g1 u7g1Var;
        Object objD;
        v7g1 v7g1Var2;
        u7g1 u7g1Var2;
        Object objA;
        Object objD2;
        Object obj2;
        byte b = this.a;
        boolean z = this.c;
        d9n d9nVar = d9n.a;
        boolean z2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                String str = (String) this.f;
                yu3 yu3Var = (yu3) this.e;
                ijr ijrVar = (ijr) yu3Var.b;
                String str2 = (String) obj4;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    if (z && (z2 || str.length() == 0 || str.equals(str2))) {
                        this.b = (byte) 1;
                        if (ijrVar.e(str2, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (z) {
                        this.b = (byte) 2;
                        if (ijrVar.f(str2, str, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (z2 || str.length() == 0 || str.equals(str2)) {
                        this.b = (byte) 3;
                        if (ijrVar.c(str2, this, true) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        ijr ijrVar2 = (ijr) yu3Var.b;
                        String str3 = (String) obj3;
                        hly0 fly0Var = str3 != null ? new fly0(str3) : gly0.a;
                        String str4 = (String) this.f;
                        this.b = (byte) 4;
                        if (ijrVar2.b((String) obj4, str4, true, fly0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (b2 != 1 && b2 != 2 && b2 != 3 && b2 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                iu30 iu30Var = (iu30) obj3;
                en31 en31Var = (en31) obj4;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    v7g1Var = (v7g1) this.f;
                    if (!z) {
                        return iu30Var.invoke(((uvz0) v7g1Var).b());
                    }
                    u7g1Var = z2 ? u7g1.a : u7g1.b;
                    if (!z2) {
                        this.f = v7g1Var;
                        this.e = u7g1Var;
                        this.b = (byte) 1;
                        objD = v7g1Var.d(this);
                        if (objD == d9nVar) {
                            return d9nVar;
                        }
                        u7g1 u7g1Var3 = u7g1Var;
                        v7g1Var2 = v7g1Var;
                        u7g1Var2 = u7g1Var3;
                    }
                    py5 py5Var = new py5((lnm) null, iu30Var, (byte) 2);
                    this.f = v7g1Var;
                    this.e = null;
                    this.b = (byte) 3;
                    objA = v7g1Var.a(u7g1Var, py5Var, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    if (!z2) {
                        return objA;
                    }
                    this.f = objA;
                    this.b = (byte) 4;
                    objD2 = v7g1Var.d(this);
                    if (objD2 == d9nVar) {
                        return d9nVar;
                    }
                    obj2 = objA;
                    if (((Boolean) objD2).booleanValue()) {
                        return obj2;
                    }
                    ec90 ec90VarH = en31Var.h();
                    ec90VarH.b.c(ec90VarH.e, ec90VarH.f);
                    return obj2;
                }
                if (b3 == 1) {
                    u7g1Var2 = (u7g1) this.e;
                    v7g1Var2 = (v7g1) this.f;
                    hm5.M(obj);
                    objD = obj;
                } else if (b3 == 2) {
                    u7g1Var2 = (u7g1) this.e;
                    v7g1Var2 = (v7g1) this.f;
                    hm5.M(obj);
                    v7g1 v7g1Var3 = v7g1Var2;
                    u7g1Var = u7g1Var2;
                    v7g1Var = v7g1Var3;
                    py5 py5Var2 = new py5((lnm) null, iu30Var, (byte) 2);
                    this.f = v7g1Var;
                    this.e = null;
                    this.b = (byte) 3;
                    objA = v7g1Var.a(u7g1Var, py5Var2, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    if (!z2) {
                        return objA;
                    }
                    this.f = objA;
                    this.b = (byte) 4;
                    objD2 = v7g1Var.d(this);
                    if (objD2 == d9nVar) {
                        return d9nVar;
                    }
                    obj2 = objA;
                } else if (b3 == 3) {
                    v7g1Var = (v7g1) this.f;
                    hm5.M(obj);
                    objA = obj;
                    if (!z2) {
                        return objA;
                    }
                    this.f = objA;
                    this.b = (byte) 4;
                    objD2 = v7g1Var.d(this);
                    if (objD2 == d9nVar) {
                        return d9nVar;
                    }
                    obj2 = objA;
                } else {
                    if (b3 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj5 = this.f;
                    hm5.M(obj);
                    obj2 = obj5;
                    objD2 = obj;
                }
                if (((Boolean) objD2).booleanValue()) {
                    return obj2;
                }
                ec90 ec90VarH2 = en31Var.h();
                ec90VarH2.b.c(ec90VarH2.e, ec90VarH2.f);
                return obj2;
                if (!((Boolean) objD).booleanValue()) {
                    ec90 ec90VarH3 = en31Var.h();
                    this.f = v7g1Var2;
                    this.e = u7g1Var2;
                    this.b = (byte) 2;
                    if (ec90VarH3.a(this) == d9nVar) {
                        return d9nVar;
                    }
                }
                v7g1 v7g1Var4 = v7g1Var2;
                u7g1Var = u7g1Var2;
                v7g1Var = v7g1Var4;
                py5 py5Var3 = new py5((lnm) null, iu30Var, (byte) 2);
                this.f = v7g1Var;
                this.e = null;
                this.b = (byte) 3;
                objA = v7g1Var.a(u7g1Var, py5Var3, this);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                if (!z2) {
                    return objA;
                }
                this.f = objA;
                this.b = (byte) 4;
                objD2 = v7g1Var.d(this);
                if (objD2 == d9nVar) {
                    return d9nVar;
                }
                obj2 = objA;
                if (((Boolean) objD2).booleanValue()) {
                    return obj2;
                }
                ec90 ec90VarH4 = en31Var.h();
                ec90VarH4.b.c(ec90VarH4.e, ec90VarH4.f);
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4a(lnm lnmVar, iu30 iu30Var, en31 en31Var, boolean z, boolean z2) {
        super(2, lnmVar);
        this.c = z;
        this.d = z2;
        this.g = en31Var;
        this.h = iu30Var;
    }
}
