package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mwm0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ wdm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwm0(wdm wdmVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = wdmVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        wdm wdmVar = this.c;
        switch (b) {
            case 0:
                return new mwm0(wdmVar, lnmVar, (byte) 0);
            case 1:
                return new mwm0(wdmVar, lnmVar, (byte) 1);
            default:
                return new mwm0(wdmVar, lnmVar, (byte) 2);
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
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        wdm wdmVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = ((fal1) wdmVar.e).d;
                lwm0 lwm0Var = new lwm0(wdmVar, (byte) 0);
                this.b = true;
                bpb1Var.collect(lwm0Var, this);
                return d9nVar;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG = yoi1.g(((m0t) wdmVar.f).d);
                lwm0 lwm0Var2 = new lwm0(wdmVar, (byte) 1);
                this.b = true;
                return ezcVarG.collect(lwm0Var2, this) == d9nVar ? d9nVar : rih1Var;
            default:
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
                ezc ezcVarG2 = yoi1.g(((m0t) wdmVar.f).e);
                lwm0 lwm0Var3 = new lwm0(wdmVar, (byte) 2);
                this.b = true;
                return ezcVarG2.collect(lwm0Var3, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
