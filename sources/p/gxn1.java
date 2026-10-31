package p;

import com.google.android.recaptcha.internal.zzhm;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gxn1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxn1(long j, alg1 alg1Var, xnn1 xnn1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.d = j;
        this.f = alg1Var;
        this.e = xnn1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                gxn1 gxn1Var = new gxn1((tmc0) obj3, this.d, (yln1) obj2, lnmVar, (byte) 0);
                gxn1Var.c = obj;
                return gxn1Var;
            case 1:
                gxn1 gxn1Var2 = new gxn1((u9c) obj3, this.d, (yln1) obj2, lnmVar, (byte) 1);
                gxn1Var2.c = obj;
                return gxn1Var2;
            case 2:
                long j = this.d;
                gxn1 gxn1Var3 = new gxn1(j, (ayh) obj2, lnmVar, (yro1) obj3);
                gxn1Var3.c = obj;
                return gxn1Var3;
            case 3:
                gxn1 gxn1Var4 = new gxn1((cik1) obj3, this.d, (tmn1) obj2, lnmVar, (byte) 3);
                gxn1Var4.c = obj;
                return gxn1Var4;
            default:
                gxn1 gxn1Var5 = new gxn1(this.d, (alg1) obj3, (xnn1) obj2, lnmVar);
                gxn1Var5.c = obj;
                return gxn1Var5;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [p.bto1] */
    /* JADX WARN: Type inference failed for: r13v7, types: [p.bto1] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [p.jso1] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object invokeSuspend(Object obj) throws zzhm {
        ?? r13;
        ayh ayhVar;
        Object objD;
        Exception exc;
        Object objM;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                boolean z = this.b;
                hm5.M(obj);
                if (z) {
                    return rih1Var;
                }
                p18 p18Var = new p18((tmc0) obj3, (zwo1) this.c, this.d, (yln1) obj2, (lnm) null);
                this.b = true;
                return smo1.s(p18Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                hm5.M(obj);
                if (z2) {
                    return rih1Var;
                }
                zwn1 zwn1Var = new zwn1((rvo1) this.c, (u9c) obj3, this.d, (yln1) obj2, null, (byte) 1);
                this.b = true;
                return smo1.s(zwn1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                ayh ayhVar2 = (ayh) obj2;
                yro1 yro1Var = (yro1) obj3;
                boolean z3 = this.b;
                ?? r2 = bto1.d;
                try {
                    if (z3) {
                        hm5.M(obj);
                        objD = obj;
                        r13 = r2;
                        ayhVar = ayhVar2;
                        r2 = r2;
                    } else {
                        hm5.M(obj);
                        zwo1 zwo1Var = (zwo1) this.c;
                        n811 n811Var = new n811();
                        h2x0 h2x0Var = h2x0.Z0;
                        gla0 gla0Var = new gla0(n811Var, yro1Var);
                        oro1 oro1Var = new oro1(n811Var, zwo1Var, yro1Var, this.d, ayhVar2, (lnm) null);
                        ayhVar = ayhVar2;
                        try {
                            this.b = true;
                            r2 = 100;
                            r13 = r2;
                            try {
                                objD = h2x0Var.d(gla0Var, 100L, 15000L, 2.0d, oro1Var, this);
                                r13 = r13;
                                if (objD == d9nVar) {
                                    return d9nVar;
                                }
                            } catch (zzhm e) {
                                e = e;
                                yro1.i(yro1Var, e);
                                yro1.g(yro1Var, (bto1) r13);
                                ayhVar.y0(e);
                                return rih1Var;
                            } catch (Exception e2) {
                                e = e2;
                                zzhm zzhmVar = new zzhm(tgo1.c, ij81.c1, e.getMessage(), (Exception) null);
                                yro1.i(yro1Var, zzhmVar);
                                yro1.g(yro1Var, (bto1) r13);
                                ayhVar.y0(zzhmVar);
                                return rih1Var;
                            }
                        } catch (zzhm e3) {
                            e = e3;
                            r13 = r2;
                            yro1.i(yro1Var, e);
                            yro1.g(yro1Var, (bto1) r13);
                            ayhVar.y0(e);
                            return rih1Var;
                        } catch (Exception e4) {
                            e = e4;
                            r13 = r2;
                            zzhm zzhmVar2 = new zzhm(tgo1.c, ij81.c1, e.getMessage(), (Exception) null);
                            yro1.i(yro1Var, zzhmVar2);
                            yro1.g(yro1Var, (bto1) r13);
                            ayhVar.y0(zzhmVar2);
                            return rih1Var;
                        }
                    }
                    ((Boolean) objD).getClass();
                    return rih1Var;
                } catch (Exception e5) {
                    e = e5;
                    r13 = r2;
                    ayhVar = ayhVar2;
                } catch (zzhm e6) {
                    e = e6;
                    r13 = r2;
                    ayhVar = ayhVar2;
                }
                break;
            case 3:
                boolean z4 = this.b;
                hm5.M(obj);
                if (z4) {
                    return obj;
                }
                rvo1 rvo1Var = (rvo1) this.c;
                cik1 cik1Var = (cik1) obj3;
                o8n o8nVar = cik1.v(cik1Var).a().a;
                uwn1 uwn1Var = new uwn1(this.d, cik1Var, rvo1Var, (tmn1) obj2, null, (byte) 2);
                this.b = true;
                Object objH = c921.H(o8nVar, uwn1Var, this);
                return objH == d9nVar ? d9nVar : objH;
            default:
                alg1 alg1Var = (alg1) obj3;
                boolean z5 = this.b;
                tgo1 tgo1Var = tgo1.d;
                lnm lnmVar = null;
                try {
                    try {
                        if (z5) {
                            hm5.M(obj);
                            objM = obj;
                            exc = null;
                        } else {
                            hm5.M(obj);
                            rvo1 rvo1Var2 = (rvo1) this.c;
                            long j = this.d;
                            yah0.q(j);
                            l53 l53Var = new l53(rvo1Var2, (Object) alg1Var, (rin1) obj2, lnmVar, (byte) 4);
                            exc = null;
                            try {
                                this.b = true;
                                objM = rc2.M(j, l53Var, this);
                                if (objM == d9nVar) {
                                    return d9nVar;
                                }
                            } catch (TimeoutCancellationException e7) {
                                e = e7;
                                throw alg1.l(alg1Var).a(e, new zzhm(tgo1Var, ij81.e, e.getMessage(), exc));
                            } catch (Exception e8) {
                                e = e8;
                                throw alg1.l(alg1Var).a(e, new zzhm(tgo1Var, ij81.m1, e.getMessage(), exc));
                            }
                        }
                        return (yln1) objM;
                    } catch (zzhm e9) {
                        if (e9.a() != tgo1Var) {
                            throw e9;
                        }
                        throw alg1.l(alg1Var).a(e9, e9);
                    }
                } catch (TimeoutCancellationException e10) {
                    e = e10;
                    exc = null;
                } catch (Exception e11) {
                    e = e11;
                    exc = null;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxn1(long j, ayh ayhVar, lnm lnmVar, yro1 yro1Var) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.f = yro1Var;
        this.e = ayhVar;
        this.d = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxn1(Object obj, long j, rin1 rin1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.d = j;
        this.e = rin1Var;
    }
}
