package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a4a extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public int b;
    public byte c;
    public /* synthetic */ tqw d;
    public Object e;
    public /* synthetic */ Object f;
    public Object g;
    public /* synthetic */ Object h;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4a(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.h = obj;
        this.i = obj2;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                a4a a4aVar = new a4a((hw2) this.f, (lnm) obj5);
                a4aVar.h = (v3a) obj2;
                a4aVar.i = (r3a) obj3;
                a4aVar.d = (tqw) obj4;
                return a4aVar.invokeSuspend(rih1Var);
            case 1:
                a4a a4aVar2 = new a4a((f1n0) this.h, (hj91) this.i, (lnm) obj5, (byte) 1);
                a4aVar2.f = (xej0) obj;
                a4aVar2.g = (wej0) obj3;
                a4aVar2.d = (tqw) obj4;
                return a4aVar2.invokeSuspend(rih1Var);
            default:
                a4a a4aVar3 = new a4a((ijv0) this.h, (qtr) this.i, (lnm) obj5, (byte) 2);
                a4aVar3.f = (ajv0) obj2;
                a4aVar3.g = (qiv0) obj3;
                a4aVar3.d = (tqw) obj4;
                return a4aVar3.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0245  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:10:0x0030, B:17:0x0042, B:56:0x00e4, B:58:0x00ea, B:40:0x009e, B:42:0x00a3, B:44:0x00a8, B:50:0x00c6, B:39:0x0097, B:29:0x006d, B:20:0x004d, B:31:0x0070, B:33:0x0076, B:35:0x007c), top: B:130:0x0026, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    public final Object invokeSuspend(Object obj) {
        int i;
        hw2 hw2Var;
        String str;
        yzc0 yzc0Var;
        tv80 tv80VarD;
        int i2;
        ?? r0;
        Object obj2;
        Object objY;
        ?? r1;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                v3a v3aVar = (v3a) this.h;
                r3a r3aVar = (r3a) this.i;
                tqw tqwVar = this.d;
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    hw2 hw2Var2 = (hw2) this.f;
                    ijr ijrVar = (ijr) hw2Var2.g;
                    v3aVar.getClass();
                    String str2 = v3aVar.a;
                    String str3 = v3aVar.b;
                    int iOrdinal = r3aVar.ordinal();
                    if (iOrdinal == 0) {
                        if (str3 == null) {
                            str3 = "";
                        }
                        this.h = null;
                        this.i = null;
                        this.d = tqwVar;
                        this.e = hw2Var2;
                        this.g = v3aVar;
                        i = 0;
                        this.b = 0;
                        this.c = (byte) 1;
                        if (ijrVar.b(str3, str2, true, gly0.a, this) == d9nVar) {
                            return d9nVar;
                        }
                        hw2Var = hw2Var2;
                        yzc0Var = (yzc0) hw2Var.f;
                        String str4 = v3aVar.b;
                        if (str4 != null) {
                        }
                        tv80VarD = cvl1.d(tqwVar);
                        this.h = null;
                        this.i = null;
                        this.d = null;
                        this.e = null;
                        this.g = null;
                        this.b = i;
                        this.c = (byte) 2;
                        if (yzc0Var.l(str, tv80VarD, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        str = str3 != null ? str3 : "";
                        this.h = null;
                        this.i = null;
                        this.d = null;
                        this.e = null;
                        this.b = 0;
                        this.c = (byte) 3;
                        if (ijrVar.f(str, str2, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else if (b2 == 1) {
                    int i3 = this.b;
                    v3a v3aVar2 = (v3a) this.g;
                    hw2Var = (hw2) this.e;
                    hm5.M(obj);
                    i = i3;
                    v3aVar = v3aVar2;
                    yzc0Var = (yzc0) hw2Var.f;
                    String str5 = v3aVar.b;
                    str = str5 != null ? str5 : "";
                    tv80VarD = cvl1.d(tqwVar);
                    this.h = null;
                    this.i = null;
                    this.d = null;
                    this.e = null;
                    this.g = null;
                    this.b = i;
                    this.c = (byte) 2;
                    if (yzc0Var.l(str, tv80VarD, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (b2 != 2 && b2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                f1n0 f1n0Var = (f1n0) this.h;
                xej0 xej0Var = (xej0) this.f;
                wej0 wej0Var = (wej0) this.g;
                tqw tqwVar2 = this.d;
                byte b3 = this.c;
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            i2 = this.b;
                            f1n0Var = (f1n0) this.e;
                            hm5.M(obj);
                            this.f = null;
                            this.g = null;
                            this.d = null;
                            this.e = null;
                            this.b = i2;
                            this.c = (byte) 3;
                            if (f1n0Var.a(this) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (b3 != 3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                    }
                    hm5.M(obj);
                } else {
                    hm5.M(obj);
                    int iOrdinal2 = wej0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        this.f = null;
                        this.g = null;
                        this.d = null;
                        this.c = (byte) 1;
                        if (f1n0Var.a(this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (iOrdinal2 != 1) {
                            eg.o();
                            return null;
                        }
                        if (tqwVar2 != null) {
                            Completable completableE = ((hj91) this.i).e(xej0Var.a, rp91.a, n3o1.y(tqwVar2));
                            this.f = null;
                            this.g = null;
                            this.d = null;
                            this.e = f1n0Var;
                            this.b = 0;
                            this.c = (byte) 2;
                            if (fc11.i(completableE, this) == d9nVar) {
                                return d9nVar;
                            }
                            i2 = 0;
                            this.f = null;
                            this.g = null;
                            this.d = null;
                            this.e = null;
                            this.b = i2;
                            this.c = (byte) 3;
                            if (f1n0Var.a(this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                }
                return rih1Var;
            default:
                ijv0 ijv0Var = (ijv0) this.h;
                od3 od3Var = ijv0Var.b;
                bpb1 bpb1Var = ijv0Var.d;
                ajv0 ajv0Var = (ajv0) this.f;
                qiv0 qiv0Var = (qiv0) this.g;
                tqw tqwVar3 = this.d;
                byte b4 = this.c;
                try {
                    try {
                        if (b4 == 0) {
                            hm5.M(obj);
                            if (ejv0.a[qiv0Var.ordinal()] != 1) {
                                eg.o();
                                return null;
                            }
                            if (bpb1Var.k(Boolean.FALSE, Boolean.TRUE)) {
                                ?? r2 = !ajv0Var.b;
                                Completable completableD = ijv0Var.a.d(ajv0Var.a, tqwVar3 != null ? n3o1.y(tqwVar3) : null, (boolean) r2);
                                this.f = null;
                                this.g = null;
                                this.d = null;
                                this.e = null;
                                this.b = r2;
                                this.c = (byte) 1;
                                r1 = r2;
                                if (fc11.i(completableD, this) == d9nVar) {
                                    return d9nVar;
                                }
                                r0 = r1;
                                obj2 = rih1Var;
                            }
                            return rih1Var;
                        }
                        if (b4 == 1) {
                            int i4 = this.b;
                            hm5.M(obj);
                            r1 = i4;
                            r0 = r1;
                            obj2 = rih1Var;
                        } else if (b4 == 2 || b4 == 3) {
                            r0 = this.b;
                            obj2 = this.e;
                            hm5.M(obj);
                            if (e331.a(obj2) != null) {
                                this.f = null;
                                this.g = null;
                                this.d = null;
                                this.e = obj2;
                                this.b = r0;
                                this.c = (byte) 4;
                                objY = fn31.Y(od3Var.c, new nd3(od3Var, null, (byte) 0), this);
                                if (objY != d9nVar) {
                                    objY = rih1Var;
                                }
                                if (objY == d9nVar) {
                                    return d9nVar;
                                }
                            }
                        } else {
                            if (b4 != 4) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                        }
                        Boolean bool = Boolean.FALSE;
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, bool);
                        return rih1Var;
                    } catch (Throwable th) {
                        m231 m231Var = new m231(th);
                        r0 = "call to 'resume' before 'invoke' with coroutine";
                        obj2 = m231Var;
                    }
                    if (!(obj2 instanceof m231)) {
                        if (r0 != 0) {
                            this.f = null;
                            this.g = null;
                            this.d = null;
                            this.e = obj2;
                            this.b = r0;
                            this.c = (byte) 2;
                            Object objY2 = fn31.Y(od3Var.c, new nd3(od3Var, null, (byte) 1), this);
                            if (objY2 != d9nVar) {
                                objY2 = rih1Var;
                            }
                            if (objY2 == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            this.f = null;
                            this.g = null;
                            this.d = null;
                            this.e = obj2;
                            this.b = r0;
                            this.c = (byte) 3;
                            Object objY3 = fn31.Y(od3Var.c, new nd3(od3Var, null, (byte) 2), this);
                            if (objY3 != d9nVar) {
                                objY3 = rih1Var;
                            }
                            if (objY3 == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                    if (e331.a(obj2) != null) {
                        this.f = null;
                        this.g = null;
                        this.d = null;
                        this.e = obj2;
                        this.b = r0;
                        this.c = (byte) 4;
                        objY = fn31.Y(od3Var.c, new nd3(od3Var, null, (byte) 0), this);
                        if (objY != d9nVar) {
                            objY = rih1Var;
                        }
                        if (objY == d9nVar) {
                            return d9nVar;
                        }
                    }
                    Boolean bool2 = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool2);
                    return rih1Var;
                } catch (Throwable th2) {
                    Boolean bool3 = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool3);
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4a(hw2 hw2Var, lnm lnmVar) {
        super(5, lnmVar);
        this.a = (byte) 0;
        this.f = hw2Var;
    }
}
