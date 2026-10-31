package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kqd1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xu30 c;
    public final /* synthetic */ p9w0 d;
    public final /* synthetic */ hav0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kqd1(xu30 xu30Var, p9w0 p9w0Var, hav0 hav0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = xu30Var;
        this.d = p9w0Var;
        this.e = hav0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new kqd1(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new kqd1(this.c, this.d, this.e, lnmVar, (byte) 1);
            default:
                return new kqd1(this.c, this.d, this.e, lnmVar, (byte) 2);
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
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hav0 hav0Var = this.e;
        p9w0 p9w0Var = this.d;
        xu30 xu30Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    Offset offset = new Offset(hav0Var.c);
                    this.b = true;
                    return xu30Var.invoke(p9w0Var, offset, this) == d9nVar ? d9nVar : rih1Var;
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
                    Offset offset2 = new Offset(hav0Var.c);
                    this.b = true;
                    return xu30Var.invoke(p9w0Var, offset2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    Offset offset3 = new Offset(hav0Var.c);
                    this.b = true;
                    return xu30Var.invoke(p9w0Var, offset3, this) == d9nVar ? d9nVar : rih1Var;
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
