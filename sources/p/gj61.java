package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gj61 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p311 c;
    public final /* synthetic */ cy5 d;
    public final /* synthetic */ bpb1 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ e421 g;
    public final /* synthetic */ ove1 h;
    public final /* synthetic */ jve1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj61(p311 p311Var, cy5 cy5Var, bpb1 bpb1Var, Context context, e421 e421Var, ove1 ove1Var, jve1 jve1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = p311Var;
        this.d = cy5Var;
        this.e = bpb1Var;
        this.f = context;
        this.g = e421Var;
        this.h = ove1Var;
        this.i = jve1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        gj61 gj61Var = new gj61(this.c, this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
        gj61Var.b = obj;
        return gj61Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            c9n c9nVar = (c9n) this.b;
            o811 o811Var = new o811();
            p311 p311Var = this.c;
            o811Var.a = p311Var.a;
            bpb1 bpb1Var = p311Var.v;
            s73 s73Var = new s73(this.d, p311Var, o811Var, this.e, this.f, this.g, this.h, this.i, c9nVar, (lnm) null);
            this.a = true;
            Object objQ = l4p1.q(bpb1Var, s73Var, this);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
