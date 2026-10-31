package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class owm0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ wdm c;
    public final /* synthetic */ o0i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ owm0(wdm wdmVar, o0i o0iVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = wdmVar;
        this.d = o0iVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        o0i o0iVar = this.d;
        wdm wdmVar = this.c;
        switch (b) {
            case 0:
                return new owm0(wdmVar, o0iVar, lnmVar, (byte) 0);
            case 1:
                return new owm0(wdmVar, o0iVar, lnmVar, (byte) 1);
            default:
                return new owm0(wdmVar, o0iVar, lnmVar, (byte) 2);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        bpb1 bpb1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o0i o0iVar = this.d;
        wdm wdmVar = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (z) {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        throw new KotlinNothingValueException();
                    }
                    hm5.M(obj);
                    r091 r091Var = (r091) wdmVar.X;
                    if (r091Var != null && (bpb1Var = r091Var.g) != null) {
                        nwm0 nwm0Var = new nwm0(o0iVar, wdmVar, (byte) 0);
                        this.b = true;
                        bpb1Var.collect(nwm0Var, this);
                        return d9nVar;
                    }
                    n2u0 n2u0Var = o0iVar.c.b;
                    if (n2u0Var == null) {
                        return rih1Var;
                    }
                    n2u0Var.b((l2u0) null);
                    return rih1Var;
                } catch (Throwable th) {
                    n2u0 n2u0Var2 = o0iVar.c.b;
                    if (n2u0Var2 != null) {
                        n2u0Var2.b((l2u0) null);
                    }
                    throw th;
                }
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
                ezc ezcVarG = yoi1.g(((m0t) wdmVar.f).f);
                nwm0 nwm0Var2 = new nwm0(o0iVar, wdmVar, (byte) 1);
                this.b = true;
                return ezcVarG.collect(nwm0Var2, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    az80 az80Var = new az80((Object) wdmVar, (Object) o0iVar, lnmVar, (byte) 29);
                    this.b = true;
                    return smo1.s(az80Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
