package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bz30 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ r091 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz30(r091 r091Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = r091Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        r091 r091Var = this.c;
        switch (b) {
            case 0:
                return new bz30(r091Var, lnmVar, (byte) 0);
            case 1:
                return new bz30(r091Var, lnmVar, (byte) 1);
            case 2:
                return new bz30(r091Var, lnmVar, (byte) 2);
            case 3:
                return new bz30(r091Var, lnmVar, (byte) 3);
            case 4:
                return new bz30(r091Var, lnmVar, (byte) 4);
            default:
                return new bz30(r091Var, lnmVar, (byte) 5);
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
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 4:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        r091 r091Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = r091Var.g;
                afv afvVar = new afv(2, (lnm) null, (byte) 16);
                this.b = true;
                Object objJ = b5p1.j(bpb1Var, afvVar, this);
                return objJ == d9nVar ? d9nVar : objJ;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var2 = r091Var.g;
                fca0 fca0Var = new fca0(2, (lnm) null, (byte) 14);
                this.b = true;
                Object objJ2 = b5p1.j(bpb1Var2, fca0Var, this);
                return objJ2 == d9nVar ? d9nVar : objJ2;
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
                bpb1 bpb1Var3 = r091Var.e.b;
                q091 q091Var = new q091(r091Var, (byte) 0);
                this.b = true;
                bpb1Var3.collect(q091Var, this);
                return d9nVar;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var4 = r091Var.d.d;
                q091 q091Var2 = new q091(r091Var, (byte) 1);
                this.b = true;
                bpb1Var4.collect(q091Var2, this);
                return d9nVar;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var5 = r091Var.d.e;
                q091 q091Var3 = new q091(r091Var, (byte) 2);
                this.b = true;
                bpb1Var5.collect(q091Var3, this);
                return d9nVar;
            default:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                w590 w590VarA = r091Var.a();
                w590VarA.getClass();
                bpb1 bpb1Var6 = (bpb1) w590VarA.i.b;
                q091 q091Var4 = new q091(r091Var, (byte) 3);
                this.b = true;
                bpb1Var6.collect(q091Var4, this);
                return d9nVar;
        }
    }
}
