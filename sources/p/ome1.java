package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ome1 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SceneTemplate.TimeMachineContent.Card2 c;
    public final /* synthetic */ g7m1 d;
    public final /* synthetic */ qme1 e;
    public final /* synthetic */ oi31 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ome1(SceneTemplate.TimeMachineContent.Card2 card2, g7m1 g7m1Var, qme1 qme1Var, oi31 oi31Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = card2;
        this.d = g7m1Var;
        this.e = qme1Var;
        this.f = oi31Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ome1 ome1Var = new ome1(this.c, this.d, this.e, this.f, lnmVar);
        ome1Var.b = obj;
        return ome1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.b;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            h290 h290VarV = this.c.v();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarV, 10));
            int i = 0;
            for (Object obj2 : h290VarV) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                arrayList.add(fn31.q(c9nVar, (o8n) null, 0, new nme1(this.d, i, (SceneTemplate.TimeMachineContent.Card2.YearEntry) obj2, this.e, this.f, null), 3));
                i = i2;
            }
            this.b = null;
            this.a = true;
            obj = o1p1.u(arrayList, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return o7h.o0((Iterable) obj);
    }
}
