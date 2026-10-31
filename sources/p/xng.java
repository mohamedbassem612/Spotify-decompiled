package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xng extends hab0 implements iu30 {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ dt71 b;
    public final /* synthetic */ drj0 c;
    public final /* synthetic */ yqg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xng(q8n q8nVar, dt71 dt71Var, drj0 drj0Var, yqg yqgVar) {
        super(1);
        this.a = q8nVar;
        this.b = dt71Var;
        this.c = drj0Var;
        this.d = yqgVar;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = new a7e(this.c, this.d, (byte) 21);
        casVar.d = nyf.X;
        casVar.e = nyf.Y;
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.b};
        companion.getClass();
        casVar.b = new b(this.a, mr20VarArr);
        return rih1.a;
    }
}
