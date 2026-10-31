package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nzr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ float c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzr(float f, xtb0 xtb0Var, tob1 tob1Var, tob1 tob1Var2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = f;
        this.d = xtb0Var;
        this.e = tob1Var;
        this.f = tob1Var2;
        this.g = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                return new nzr(this.c, (ozr) obj3, (bs41) obj2, lnmVar);
            case 1:
                nzr nzrVar = new nzr(this.c, (ven0) this.e, (o95) obj3, (o95) obj2, lnmVar);
                nzrVar.d = obj;
                return nzrVar;
            case 2:
                return new nzr(this.c, (xtb0) this.d, (tob1) this.e, (tob1) obj3, (ven0) obj2, lnmVar);
            default:
                return new nzr((fde1) this.d, (c380) this.e, (c380) obj3, (xtb0) obj2, this.c, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        m811 m811Var;
        ie5 ie5Var;
        int iIntValue;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        Object obj2 = this.g;
        Object obj3 = this.f;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ie5Var = (ie5) this.e;
                    m811Var = (m811) this.d;
                    try {
                        hm5.M(obj);
                    } catch (CancellationException unused) {
                        m811Var.a = ((Number) ie5Var.c()).floatValue();
                    }
                    f = m811Var.a;
                    break;
                } else {
                    hm5.M(obj);
                    if (Math.abs(f) > 1.0f) {
                        m811 m811Var2 = new m811();
                        m811Var2.a = f;
                        m811 m811Var3 = new m811();
                        ie5 ie5VarA = prn1.a(28, 0.0f, f);
                        try {
                            ozr ozrVar = (ozr) obj3;
                            e9r e9rVar = ozrVar.a;
                            pg pgVar = new pg(m811Var3, (bs41) obj2, m811Var2, ozrVar);
                            this.d = m811Var2;
                            this.e = ie5VarA;
                            this.b = true;
                            if (wwo1.u(ie5VarA, e9rVar, false, pgVar, this) == d9nVar) {
                                return d9nVar;
                            }
                            m811Var = m811Var2;
                            f = m811Var.a;
                        } catch (CancellationException unused2) {
                            m811Var = m811Var2;
                            ie5Var = ie5VarA;
                            m811Var.a = ((Number) ie5Var.c()).floatValue();
                        }
                    }
                }
                return new Float(f);
            case 1:
                c9n c9nVar = (c9n) this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.d = c9nVar;
                    this.b = true;
                    if (hap1.i(660L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                float f2 = ((int) (((yr80) ((ven0) this.e).getValue()).a & 4294967295L)) + f;
                fn31.T(c9nVar, (o8n) null, 0, new jpo((o95) obj3, f2, (lnm) null, (byte) 2), 3);
                fn31.T(c9nVar, (o8n) null, 0, new jpo((o95) obj2, f2, (lnm) null, (byte) 3), 3);
                return rih1Var;
            case 2:
                xtb0 xtb0Var = (xtb0) this.d;
                ven0 ven0Var = (ven0) obj2;
                tob1 tob1Var = (tob1) this.e;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                float fFloatValue = ((Number) ven0Var.getValue()).floatValue() + (f * (((Number) tob1Var.getValue()).intValue() / ((Number) ((tob1) obj3).getValue()).intValue()));
                int i = (int) fFloatValue;
                ven0Var.setValue(Float.valueOf(fFloatValue - i));
                int iP = yoi1.p(((err0) xtb0Var.e.b).s() + i, 0, ((Number) tob1Var.getValue()).intValue());
                this.b = true;
                return xtb0Var.k(iP, 0, this) == d9nVar ? d9nVar : rih1Var;
            default:
                c380 c380Var = (c380) this.e;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    int iOrdinal = ((fde1) this.d).ordinal();
                    if (iOrdinal == 0) {
                        iIntValue = ((Number) o7h.q0(c380Var)).intValue();
                    } else if (iOrdinal == 1) {
                        iIntValue = ((Number) o7h.A0(c380Var)).intValue();
                    } else {
                        eg.o();
                    }
                    if (iIntValue < 0 || iIntValue >= ((c380) obj3).size()) {
                        return rih1Var;
                    }
                    this.b = true;
                    return ((xtb0) obj2).k(iIntValue, -((int) f), this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzr(float f, ozr ozrVar, bs41 bs41Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = f;
        this.f = ozrVar;
        this.g = bs41Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzr(float f, ven0 ven0Var, o95 o95Var, o95 o95Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = f;
        this.e = ven0Var;
        this.f = o95Var;
        this.g = o95Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzr(fde1 fde1Var, c380 c380Var, c380 c380Var2, xtb0 xtb0Var, float f, lnm lnmVar) {
        super(2, lnmVar);
        this.d = fde1Var;
        this.e = c380Var;
        this.f = c380Var2;
        this.g = xtb0Var;
        this.c = f;
    }
}
