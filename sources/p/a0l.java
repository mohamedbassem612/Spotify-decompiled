package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a0l extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ e0l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0l(e0l e0lVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = e0lVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        e0l e0lVar = this.c;
        switch (b) {
            case 0:
                return new a0l(e0lVar, lnmVar, (byte) 0);
            case 1:
                return new a0l(e0lVar, lnmVar, (byte) 1);
            case 2:
                return new a0l(e0lVar, lnmVar, (byte) 2);
            default:
                return new a0l(e0lVar, lnmVar, (byte) 3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        e0l e0lVar = this.c;
        d9n d9nVar = d9n.a;
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
                bpb1 bpb1Var = e0lVar.d.b;
                zzk zzkVar = new zzk(e0lVar, (byte) 0);
                this.b = true;
                bpb1Var.collect(zzkVar, this);
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
                c0l c0lVar = e0lVar.t;
                zzk zzkVar2 = new zzk(e0lVar, (byte) 1);
                this.b = true;
                return c0lVar.collect(zzkVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
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
                ezc ezcVarG = yoi1.g(e0lVar.a.d());
                zzk zzkVar3 = new zzk(e0lVar, (byte) 2);
                this.b = true;
                return ezcVarG.collect(zzkVar3, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var2 = e0lVar.d.b;
                zzk zzkVar4 = new zzk(e0lVar, (byte) 3);
                this.b = true;
                bpb1Var2.collect(zzkVar4, this);
                return d9nVar;
        }
    }
}
