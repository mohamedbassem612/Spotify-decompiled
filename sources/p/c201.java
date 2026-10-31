package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c201 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MobiusLoop.Controller b;
    public final /* synthetic */ sen0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c201(MobiusLoop.Controller controller, sen0 sen0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = controller;
        this.c = sen0Var;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        c201 c201Var = new c201(this.b, this.c, this.d, lnmVar);
        c201Var.a = obj;
        return c201Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        c201 c201VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        c201VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.a;
        hm5.M(obj);
        x2y x2yVar = new x2y(c9nVar, this.c, this.d, (byte) 5);
        MobiusLoop.Controller controller = this.b;
        controller.c(x2yVar);
        controller.start();
        return rih1.a;
    }
}
