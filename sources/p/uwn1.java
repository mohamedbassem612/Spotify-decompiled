package p;

import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uwn1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwn1(tmc0 tmc0Var, String str, sln1 sln1Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.f = tmc0Var;
        this.e = str;
        this.g = sln1Var;
        this.d = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                uwn1 uwn1Var = new uwn1((tmc0) obj4, (String) obj3, (sln1) obj2, this.d, lnmVar);
                uwn1Var.c = obj;
                return uwn1Var;
            case 1:
                uwn1 uwn1Var2 = new uwn1(this.d, (lqo1) obj4, (String) obj3, (i2x0) obj2, lnmVar, (byte) 1);
                uwn1Var2.c = obj;
                return uwn1Var2;
            default:
                return new uwn1(this.d, (cik1) obj4, (rvo1) obj3, (tmn1) obj2, lnmVar, (byte) 2);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((swo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws zzhm {
        p811 p811Var;
        Object objE;
        zzhm zzhmVar;
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        d9n d9nVar = d9n.a;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                boolean z = this.b;
                hm5.M(obj);
                if (z) {
                    return obj;
                }
                qwn1 qwn1Var = new qwn1((tmc0) obj4, (String) obj3, (zwo1) this.c, (sln1) obj2, this.d, null);
                this.b = true;
                Object objS = smo1.s(qwn1Var, this);
                return objS == d9nVar ? d9nVar : objS;
            case 1:
                boolean z2 = this.b;
                hm5.M(obj);
                if (z2) {
                    return obj;
                }
                swo1 swo1Var = (swo1) this.c;
                ie3 ie3Var = new ie3(this.d, (String) obj3, (lnm) null, (i2x0) obj2, (lqo1) obj4, swo1Var);
                this.b = true;
                Object objB = swo1Var.b(ie3Var, this);
                return objB == d9nVar ? d9nVar : objB;
            default:
                cik1 cik1Var = (cik1) obj4;
                try {
                    if (this.b) {
                        p811Var = (p811) this.c;
                        try {
                            hm5.M(obj);
                            objE = obj;
                        } catch (Exception e) {
                            e = e;
                            e.getMessage();
                            zzhmVar = (zzhm) p811Var.a;
                            if (zzhmVar == null) {
                                throw cik1.q(cik1Var, e);
                            }
                            throw zzhmVar;
                        }
                    } else {
                        p811 p811VarU = cy30.u(obj);
                        try {
                            long j = this.d;
                            m1o1 m1o1Var = new m1o1((rvo1) obj3, cik1Var, (tmn1) obj2, p811VarU, null, (byte) 1);
                            this.c = p811VarU;
                            this.b = true;
                            objE = h2x0.e(j, m1o1Var, this);
                            if (objE == d9nVar) {
                                return d9nVar;
                            }
                            p811Var = p811VarU;
                        } catch (Exception e2) {
                            e = e2;
                            p811Var = p811VarU;
                            e.getMessage();
                            zzhmVar = (zzhm) p811Var.a;
                            if (zzhmVar == null) {
                                throw cik1.q(cik1Var, e);
                            }
                            throw zzhmVar;
                        }
                    }
                    return (umn1) objE;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uwn1(long j, Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = j;
        this.f = obj;
        this.e = obj2;
        this.g = obj3;
    }
}
