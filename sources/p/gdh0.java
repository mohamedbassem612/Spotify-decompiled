package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.extras.SLF4JLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gdh0 extends hab0 implements iu30 {
    public final /* synthetic */ ldo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdh0(ldo ldoVar) {
        super(1);
        this.a = ldoVar;
    }

    public final Object invoke(Object obj) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        ldo ldoVar = this.a;
        q8n q8nVar = (q8n) ldoVar.d;
        yge0 yge0Var = (yge0) ldoVar.c;
        mr20[] mr20VarArr = {new f8f0((mr20) ((jqb0) yge0Var.b).invoke(), (byte) 11), new f8f0((mr20) ((vqb0) yge0Var.c).invoke(), (byte) 10)};
        companion.getClass();
        cas casVar = (a7m0) obj;
        casVar.b = new b(q8nVar, mr20VarArr);
        casVar.d = new tzf0(ldoVar, (byte) 22);
        casVar.g = CompositeLogger.g(new SLF4JLogger("max-quality-info-mobius"), new MobiusLoop.Logger[0]);
        return rih1.a;
    }
}
