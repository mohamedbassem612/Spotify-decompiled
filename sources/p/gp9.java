package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gp9 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp9(xpw xpwVar, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.b = xpwVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        byte b = this.a;
        byte b2 = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                new gp9((xpw) this.b, (lnm) obj5, (byte) 0).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                new gp9((xpw) this.b, (lnm) obj5, (byte) 1).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                new gp9((xpw) this.b, (lnm) obj5, (byte) 2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                new gp9((xpw) this.b, (lnm) obj5, (byte) 3).invokeSuspend(rih1Var);
                throw null;
            case 4:
                gp9 gp9Var = new gp9((int) b2, (lnm) obj5, (byte) 4);
                gp9Var.b = (hzg) obj;
                gp9Var.invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                gp9 gp9Var2 = new gp9(b2, (lnm) obj5, b2);
                gp9Var2.b = (yc50) obj3;
                gp9Var2.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                gp9 gp9Var3 = new gp9((int) b2, (lnm) obj5, (byte) 6);
                gp9Var3.b = (dgi0) obj3;
                gp9Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                new gp9((xpw) this.b, (lnm) obj5, (byte) 7).invokeSuspend(rih1Var);
                throw null;
            case 8:
                gp9 gp9Var4 = new gp9((int) b2, (lnm) obj5, (byte) 8);
                gp9Var4.b = (z411) obj3;
                gp9Var4.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                gp9 gp9Var5 = new gp9((int) b2, (lnm) obj5, (byte) 9);
                gp9Var5.b = (r941) obj3;
                gp9Var5.invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                gp9 gp9Var6 = new gp9((int) b2, (lnm) obj5, (byte) 10);
                gp9Var6.b = (ojj1) obj;
                gp9Var6.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                gp9 gp9Var7 = new gp9((int) b2, (lnm) obj5, (byte) 11);
                gp9Var7.b = (spj1) obj;
                gp9Var7.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                np9 np9Var = ((ip9) this.b).b.a;
                lp9 lp9Var = (lp9) np9Var.f.getValue();
                if ((lp9Var instanceof jp9) && ((i = ((jp9) lp9Var).c) == 2 || i == 1)) {
                    np9Var.a();
                } else {
                    fdc fdcVar = np9Var.d;
                    if (fdcVar != null) {
                        fdc.d0(fdcVar, rky0.a);
                    }
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                rm9 rm9Var = ((ip9) this.b).b;
                lp9 lp9Var2 = (lp9) rm9Var.u.a.getValue();
                if (lp9Var2 instanceof jp9) {
                    long j = ((jp9) lp9Var2).a - 15000;
                    if (j < 0) {
                        j = 0;
                    }
                    fdc fdcVar2 = rm9Var.a.d;
                    if (fdcVar2 != null && !fdcVar2.b) {
                        ((w590) fdcVar2.d).s(j);
                    }
                }
                return rih1Var;
            case 2:
                hm5.M(obj);
                rm9 rm9Var2 = ((ip9) this.b).b;
                lp9 lp9Var3 = (lp9) rm9Var2.u.a.getValue();
                if (lp9Var3 instanceof jp9) {
                    jp9 jp9Var = (jp9) lp9Var3;
                    long j2 = jp9Var.a + 15000;
                    Long l = jp9Var.b;
                    long jLongValue = l != null ? l.longValue() : Long.MAX_VALUE;
                    if (j2 > jLongValue) {
                        j2 = jLongValue;
                    }
                    fdc fdcVar3 = rm9Var2.a.d;
                    if (fdcVar3 != null && !fdcVar3.b) {
                        ((w590) fdcVar3.d).s(j2);
                    }
                }
                return rih1Var;
            case 3:
                hm5.M(obj);
                throw new NoWhenBranchMatchedException();
            case 4:
                hzg hzgVar = (hzg) this.b;
                hm5.M(obj);
                hzgVar.a.invoke();
                return rih1Var;
            case 5:
                yc50 yc50Var = (yc50) this.b;
                hm5.M(obj);
                if (yc50Var != null) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 6:
                dgi0 dgi0Var = (dgi0) this.b;
                hm5.M(obj);
                if (dgi0Var != null) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 7:
                hm5.M(obj);
                throw new NoWhenBranchMatchedException();
            case 8:
                z411 z411Var = (z411) this.b;
                hm5.M(obj);
                if (z411Var != null) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                r941 r941Var = (r941) this.b;
                hm5.M(obj);
                if (r941Var != null) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 10:
                ojj1 ojj1Var = (ojj1) this.b;
                hm5.M(obj);
                ojj1Var.a.invoke();
                return rih1Var;
            default:
                spj1 spj1Var = (spj1) this.b;
                hm5.M(obj);
                spj1Var.a.invoke();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp9(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
