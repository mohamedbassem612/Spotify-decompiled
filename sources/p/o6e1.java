package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o6e1 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ p9w0 b;
    public /* synthetic */ long c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ idn0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6e1(c9n c9nVar, ven0 ven0Var, idn0 idn0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.d = c9nVar;
        this.e = ven0Var;
        this.f = idn0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj2).a;
        ven0 ven0Var = this.e;
        idn0 idn0Var = this.f;
        o6e1 o6e1Var = new o6e1(this.d, ven0Var, idn0Var, (lnm) obj3);
        o6e1Var.b = (p9w0) obj;
        o6e1Var.c = j;
        return o6e1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objD;
        boolean z = this.a;
        c9n c9nVar = this.d;
        if (!z) {
            hm5.M(obj);
            p9w0 p9w0Var = this.b;
            fn31.T(c9nVar, null, 0, new d6(this.e, this.c, this.f, (lnm) null, (byte) 10), 3);
            this.a = true;
            objD = p9w0Var.d(this);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objD = obj;
        }
        fn31.T(c9nVar, null, 0, new du2(this.e, ((Boolean) objD).booleanValue(), this.f, (lnm) null, (byte) 20), 3);
        return rih1.a;
    }
}
