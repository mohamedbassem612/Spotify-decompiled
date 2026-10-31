package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pu1 extends hab0 implements iu30 {
    public final /* synthetic */ mfe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu1(mfe mfeVar) {
        super(1);
        this.a = mfeVar;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.d = ou1.b;
        casVar.e = ou1.c;
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        int i = 1;
        mr20[] mr20VarArr = {this.a};
        companion.getClass();
        casVar.b = new b(bs50Var, mr20VarArr);
        casVar.a = ah1.Y;
        casVar.a(new tsm1(i, (byte) 18), new tsm1(i, (byte) 19));
        return rih1.a;
    }
}
