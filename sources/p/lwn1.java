package p;

import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lwn1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public zwo1 b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lwn1(zwo1 zwo1Var, Object obj, Object obj2, rin1 rin1Var, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = zwo1Var;
        this.f = obj;
        this.g = obj2;
        this.h = rin1Var;
        this.e = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                return new lwn1((zwo1) this.d, (cwn1) obj4, (String) obj3, (sln1) obj2, this.e, lnmVar, (byte) 0);
            case 1:
                return new lwn1((zwo1) this.d, (cik1) obj4, (b1o1) obj3, (yln1) obj2, this.e, lnmVar, (byte) 1);
            default:
                lwn1 lwn1Var = new lwn1((yro1) obj4, this.e, (String) obj3, (vi01) obj2, lnmVar);
                lwn1Var.d = obj;
                return lwn1Var;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws zzhm {
        zwo1 zwo1Var;
        Object qwo1Var;
        zwo1 zwo1Var2;
        Object qwo1Var2;
        zwo1 zwo1Var3;
        Object qwo1Var3;
        zwo1 zwo1Var4;
        Object objA;
        yln1 yln1VarK;
        Object objS;
        Object objA2;
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        d9n d9nVar = d9n.a;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    zwo1Var = (zwo1) this.d;
                    this.b = zwo1Var;
                    this.c = (byte) 1;
                    qwo1Var = new qwo1(new evn1((cwn1) obj4, (String) obj3, (sln1) obj2, this.e, (lnm) null));
                    if (qwo1Var != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    hm5.M(obj);
                    return obj;
                }
                zwo1Var = this.b;
                hm5.M(obj);
                qwo1Var = obj;
                this.b = null;
                this.c = (byte) 2;
                Object objA3 = ((qwo1) qwo1Var).a(zwo1Var, this);
                if (objA3 != d9nVar) {
                    return objA3;
                }
                return d9nVar;
            case 1:
                byte b3 = this.c;
                if (b3 != 0) {
                    if (b3 != 1) {
                        hm5.M(obj);
                    } else {
                        zwo1Var2 = this.b;
                        hm5.M(obj);
                        qwo1Var2 = obj;
                    }
                    return rih1.a;
                }
                hm5.M(obj);
                zwo1Var2 = (zwo1) this.d;
                this.b = zwo1Var2;
                this.c = (byte) 1;
                qwo1Var2 = new qwo1(new mug((b1o1) obj3, this.e, (yln1) obj2, (cik1) obj4, (lnm) null));
                if (qwo1Var2 == d9nVar) {
                    return d9nVar;
                }
                this.b = null;
                this.c = (byte) 2;
                if (((qwo1) qwo1Var2).a(zwo1Var2, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1.a;
            default:
                yro1 yro1Var = (yro1) obj4;
                byte b4 = this.c;
                try {
                    if (b4 != 0) {
                        if (b4 == 1) {
                            zwo1Var3 = this.b;
                            zwo1 zwo1Var5 = (zwo1) this.d;
                            hm5.M(obj);
                            zwo1Var4 = zwo1Var5;
                            qwo1Var3 = obj;
                        } else if (b4 == 2) {
                            zwo1 zwo1Var6 = (zwo1) this.d;
                            hm5.M(obj);
                            zwo1Var4 = zwo1Var6;
                            objA = obj;
                            long jLongValue = ((Number) objA).longValue();
                            cik1 cik1VarL = yro1.l(yro1Var);
                            String str = (String) obj3;
                            ((vi01) obj2).getClass();
                            yln1VarK = yro1.k(yro1Var);
                            if (yln1VarK == null) {
                                yln1VarK = null;
                            }
                            this.d = zwo1Var4;
                            this.c = (byte) 3;
                            objS = cik1VarL.s(str, yln1VarK, jLongValue);
                            if (objS == d9nVar) {
                                return d9nVar;
                            }
                            this.d = null;
                            this.c = (byte) 4;
                            objA2 = ((qwo1) objS).a(zwo1Var4, this);
                            if (objA2 == d9nVar) {
                                return d9nVar;
                            }
                        } else if (b4 != 3) {
                            hm5.M(obj);
                            objA2 = obj;
                        } else {
                            zwo1 zwo1Var7 = (zwo1) this.d;
                            hm5.M(obj);
                            zwo1Var4 = zwo1Var7;
                            objS = obj;
                            this.d = null;
                            this.c = (byte) 4;
                            objA2 = ((qwo1) objS).a(zwo1Var4, this);
                            if (objA2 == d9nVar) {
                                return d9nVar;
                            }
                        }
                        return (String) objA2;
                    }
                    hm5.M(obj);
                    zwo1Var3 = (zwo1) this.d;
                    long j = this.e;
                    this.d = zwo1Var3;
                    this.b = zwo1Var3;
                    this.c = (byte) 1;
                    qwo1Var3 = new qwo1(new wc80(yro1Var, j, (lnm) null, (byte) 5));
                    if (qwo1Var3 == d9nVar) {
                        return d9nVar;
                    }
                    zwo1Var4 = zwo1Var3;
                    this.d = zwo1Var4;
                    this.b = null;
                    this.c = (byte) 2;
                    objA = ((qwo1) qwo1Var3).a(zwo1Var3, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    long jLongValue2 = ((Number) objA).longValue();
                    cik1 cik1VarL2 = yro1.l(yro1Var);
                    String str2 = (String) obj3;
                    ((vi01) obj2).getClass();
                    yln1VarK = yro1.k(yro1Var);
                    if (yln1VarK == null) {
                        yln1VarK = null;
                    }
                    this.d = zwo1Var4;
                    this.c = (byte) 3;
                    objS = cik1VarL2.s(str2, yln1VarK, jLongValue2);
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                    this.d = null;
                    this.c = (byte) 4;
                    objA2 = ((qwo1) objS).a(zwo1Var4, this);
                    if (objA2 == d9nVar) {
                        return d9nVar;
                    }
                    return (String) objA2;
                } catch (zzhm e) {
                    throw e;
                } catch (Exception e2) {
                    throw new zzhm(tgo1.c, ij81.n1, e2.getMessage(), (Exception) null);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwn1(yro1 yro1Var, long j, String str, vi01 vi01Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.f = yro1Var;
        this.e = j;
        this.g = str;
        this.h = vi01Var;
    }
}
