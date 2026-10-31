package p;

import app.p000rive.ViewModelInstance;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class km31 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mm31 c;
    public final /* synthetic */ ViewModelInstance d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km31(mm31 mm31Var, ViewModelInstance viewModelInstance, String str, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = mm31Var;
        this.d = viewModelInstance;
        this.e = str;
        this.f = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new km31(this.c, this.d, this.e, this.f, lnmVar, (byte) 0);
            case 1:
                return new km31(this.c, this.d, this.e, this.f, lnmVar, (byte) 1);
            case 2:
                return new km31(this.c, this.d, this.e, this.f, lnmVar, (byte) 2);
            case 3:
                return new km31(this.c, this.d, this.e, this.f, lnmVar, (byte) 3);
            default:
                return new km31(this.c, this.d, this.e, this.f, lnmVar, (byte) 4);
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
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.f;
        ViewModelInstance viewModelInstance = this.d;
        mm31 mm31Var = this.c;
        d9n d9nVar = d9n.a;
        String str = this.e;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    mr20 numberFlow = viewModelInstance.getNumberFlow(str);
                    this.b = true;
                    return mm31Var.b(numberFlow, ven0Var, str, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    mr20 booleanFlow = viewModelInstance.getBooleanFlow(str);
                    this.b = true;
                    return mm31Var.b(booleanFlow, ven0Var, str, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    mr20 colorFlow = viewModelInstance.getColorFlow(str);
                    this.b = true;
                    return mm31Var.b(colorFlow, ven0Var, str, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    mr20 enumFlow = viewModelInstance.getEnumFlow(str);
                    this.b = true;
                    return mm31Var.b(enumFlow, ven0Var, str, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    mr20 stringFlow = viewModelInstance.getStringFlow(str);
                    this.b = true;
                    return mm31Var.b(stringFlow, ven0Var, str, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
