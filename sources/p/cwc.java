package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cwc extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ iwc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cwc(iwc iwcVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = iwcVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iwc iwcVar = this.c;
        switch (b) {
            case 0:
                return new cwc(iwcVar, lnmVar, (byte) 0);
            case 1:
                return new cwc(iwcVar, lnmVar, (byte) 1);
            case 2:
                return new cwc(iwcVar, lnmVar, (byte) 2);
            case 3:
                return new cwc(iwcVar, lnmVar, (byte) 3);
            case 4:
                return new cwc(iwcVar, lnmVar, (byte) 4);
            case 5:
                return new cwc(iwcVar, lnmVar, (byte) 5);
            default:
                return new cwc(iwcVar, lnmVar, (byte) 6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        byte b2 = 2;
        w8c0 w8c0Var = w8c0.d;
        rih1 rih1Var = rih1.a;
        iwc iwcVar = this.c;
        d9n d9nVar = d9n.a;
        byte b3 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441Var = (m441) iwcVar.e.b;
                bwc bwcVar = new bwc(iwcVar, b3);
                this.b = true;
                return m441Var.collect(bwcVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    cwc cwcVar = new cwc(iwcVar, lnmVar, (byte) 0);
                    this.b = true;
                    return z8p1.u(iwcVar, w8c0.c, cwcVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = iwcVar.N0;
                bwc bwcVar2 = new bwc(iwcVar, b2);
                this.b = true;
                bpb1Var.collect(bwcVar2, this);
                return d9nVar;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    cwc cwcVar2 = new cwc(iwcVar, lnmVar, b2);
                    this.b = true;
                    return z8p1.u(iwcVar, w8c0Var, cwcVar2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ve01 ve01Var = iwcVar.h.b;
                bwc bwcVar3 = new bwc(iwcVar, (byte) 3);
                this.b = true;
                return ve01Var.a.collect(bwcVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    cwc cwcVar3 = new cwc(iwcVar, lnmVar, (byte) 4);
                    this.b = true;
                    return z8p1.u(iwcVar, w8c0Var, cwcVar3, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qzn0 qzn0Var = (qzn0) iwcVar.f.get();
                this.b = true;
                qzn0Var.d();
                Object objE = qzn0Var.e(fqn0.a, this);
                if (objE != d9nVar) {
                    objE = rih1Var;
                }
                return objE == d9nVar ? d9nVar : rih1Var;
        }
    }
}
