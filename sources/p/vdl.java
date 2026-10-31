package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vdl extends hab0 implements vu30 {
    public final /* synthetic */ wdl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdl(wdl wdlVar) {
        super(2);
        this.a = wdlVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        cir0 cir0Var = (cir0) obj2;
        hfl hflVar = this.a.c;
        hflVar.d.getClass();
        mzk mzkVar = new mzk(cir0Var, (byte) 2);
        MobiusCoroutines.Companion companion = MobiusCoroutines.a;
        e8p e8pVar = hflVar.c;
        tbr0 tbr0VarC = cir0Var.c();
        k9k k9kVar = (k9k) e8pVar.a.c;
        bel belVar = new bel((qfl) ((jly0) k9kVar.c).get());
        q8n q8nVar = (q8n) ((cel) k9kVar.b).c.get();
        c8o.l(q8nVar);
        MobiusLoop.Builder builderD = Mobius.d(gfl.a, new ffl(belVar, q8nVar, mzkVar, tbr0VarC));
        FlowEventSources.Companion companion2 = FlowEventSources.a;
        final q8n q8nVar2 = hflVar.a;
        final byte b = 1;
        final byte b2 = 0;
        mr20[] mr20VarArr = {k4p1.B(mzkVar.a)};
        companion2.getClass();
        MobiusLoop.Builder builderC = builderD.c(new b(q8nVar2, mr20VarArr), new EventSource[]{hflVar.e});
        companion.getClass();
        MobiusLoop.Builder builderD2 = builderC.d(new Producer() { // from class: p.t7m0
            public final Object get() {
                byte b3 = b2;
                o8n o8nVar = q8nVar2;
                switch (b3) {
                    case 0:
                        MobiusCoroutines.Companion companion3 = MobiusCoroutines.Companion.a;
                        break;
                    default:
                        MobiusCoroutines.Companion companion4 = MobiusCoroutines.Companion.a;
                        break;
                }
                return new DispatcherWorker(o8nVar);
            }
        });
        final q8n q8nVar3 = hflVar.b;
        return builderD2.b(new Producer() { // from class: p.t7m0
            public final Object get() {
                byte b3 = b;
                o8n o8nVar = q8nVar3;
                switch (b3) {
                    case 0:
                        MobiusCoroutines.Companion companion3 = MobiusCoroutines.Companion.a;
                        break;
                    default:
                        MobiusCoroutines.Companion companion4 = MobiusCoroutines.Companion.a;
                        break;
                }
                return new DispatcherWorker(o8nVar);
            }
        });
    }
}
