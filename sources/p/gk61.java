package p;

import com.spotify.puffin_esperanto.proto.PuffinFilterRequestOuterClass$PuffinFilterRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableResumeNext;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gk61 implements bv30 {
    public final jkp0 a;
    public final nfb0 b;
    public final p5 c;
    public final e6u d;
    public final p8o e;

    public gk61(jkp0 jkp0Var, nfb0 nfb0Var, p5 p5Var, e6u e6uVar, p8o p8oVar) {
        this.a = jkp0Var;
        this.b = nfb0Var;
        this.c = p5Var;
        this.d = e6uVar;
        this.e = p8oVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        CompletableResumeNext completableResumeNextP;
        m560 m560Var = (m560) obj;
        List list = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
        Completable completable = this.e.a.h(nfo0.a, true) ? (Completable) this.c.invoke(m560Var) : (Completable) this.d.invoke();
        jkp0 jkp0Var = this.a;
        if (zBooleanValue || zBooleanValue2) {
            be beVar = (be) jkp0Var.b;
            aqy0 aqy0VarO = PuffinFilterRequestOuterClass$PuffinFilterRequest.o();
            aqy0VarO.n(list);
            aqy0VarO.r(zBooleanValue);
            aqy0VarO.q(zBooleanValue2);
            aqy0VarO.s(zBooleanValue3 ? bqy0.USER_INITIATED : bqy0.UNKNOWN);
            completableResumeNextP = beVar.callSingle("spotify.puffin_esperanto.proto.PuffinService", "Filter", (PuffinFilterRequestOuterClass$PuffinFilterRequest) aqy0VarO.build()).map(s9x0.c).ignoreElement().p(l9x0.X);
        } else {
            completableResumeNextP = jkp0Var.a(zBooleanValue3).p(y6x0.t);
        }
        return completable.c(completableResumeNextP.g(new ruz0(this, (byte) 10)));
    }
}
