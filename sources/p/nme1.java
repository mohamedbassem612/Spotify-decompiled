package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nme1 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ g7m1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SceneTemplate.TimeMachineContent.Card2.YearEntry d;
    public final /* synthetic */ qme1 e;
    public final /* synthetic */ oi31 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nme1(g7m1 g7m1Var, int i, SceneTemplate.TimeMachineContent.Card2.YearEntry yearEntry, qme1 qme1Var, oi31 oi31Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = g7m1Var;
        this.c = i;
        this.d = yearEntry;
        this.e = qme1Var;
        this.f = oi31Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new nme1(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        bju bjuVar = this.b.b;
        String strC = f4i1.c(this.c, "timeMachineEntityContent");
        mme1 mme1Var = new mme1(this.d, this.e, this.f, null);
        this.a = true;
        Object objD = bjuVar.d(strC, mme1Var, this);
        d9n d9nVar = d9n.a;
        return objD == d9nVar ? d9nVar : objD;
    }
}
