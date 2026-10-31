package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mme1 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SceneTemplate.TimeMachineContent.Card2.YearEntry c;
    public final /* synthetic */ qme1 d;
    public final /* synthetic */ oi31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mme1(SceneTemplate.TimeMachineContent.Card2.YearEntry yearEntry, qme1 qme1Var, oi31 oi31Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = yearEntry;
        this.d = qme1Var;
        this.e = oi31Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        mme1 mme1Var = new mme1(this.c, this.d, this.e, lnmVar);
        mme1Var.b = obj;
        return mme1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        ni31 ni31Var = (ni31) this.b;
        boolean z = this.a;
        qme1 qme1Var = this.d;
        SceneTemplate.TimeMachineContent.Card2.YearEntry yearEntry = this.c;
        if (!z) {
            hm5.M(obj);
            if (!yearEntry.y()) {
                return null;
            }
            RiveAnimation riveAnimationS = yearEntry.s();
            cxc cxcVar = qme1Var.c;
            this.b = null;
            this.a = true;
            obj = mym.n(riveAnimationS, cxcVar, ni31Var, this);
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
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            uj31 uj31Var = (uj31) obj2;
            if (uj31Var instanceof qj31) {
                qj31 qj31Var = (qj31) uj31Var;
                linkedHashMap.put(qj31Var.a, qj31Var.b);
            } else {
                arrayList.add(obj2);
            }
        }
        return new gme1(qme1Var.e.a(new fme1(this.e, linkedHashMap)), o7h.O0(new pj31("enumYear", yearEntry.u()), arrayList));
    }
}
