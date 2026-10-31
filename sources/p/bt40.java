package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bt40 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kaa c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt40(kaa kaaVar, Context context, int i, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.c = kaaVar;
        this.d = context;
        this.e = i;
        this.f = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        bt40 bt40Var = new bt40(this.c, this.d, this.e, this.f, lnmVar);
        bt40Var.b = obj;
        return bt40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        c9n c9nVar = (c9n) this.b;
        Context context = this.d;
        kaa kaaVar = this.c;
        kaa.a(kaaVar, c9nVar, context);
        ws40 ws40VarB = kaaVar.b();
        this.a = true;
        ws40VarB.getClass();
        Object objB = ws40VarB.a.b(new xd1(this.d, new kx5(this.e), ws40VarB, (Object) null, new ew0(this.f, (lnm) null, (byte) 25), (lnm) null, (byte) 10), this);
        d9n d9nVar = d9n.a;
        if (objB != d9nVar) {
            objB = rih1Var;
        }
        if (objB != d9nVar) {
            objB = rih1Var;
        }
        return objB == d9nVar ? d9nVar : rih1Var;
    }
}
