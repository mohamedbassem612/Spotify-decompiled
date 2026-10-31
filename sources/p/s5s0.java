package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s5s0 implements EventSource {
    public final k8g1 a;
    public final b5s0 b;
    public final zuf c;
    public final q8n d;
    public final boolean e;

    public s5s0(k8g1 k8g1Var, b5s0 b5s0Var, zuf zufVar, q8n q8nVar) {
        this.a = k8g1Var;
        this.b = b5s0Var;
        this.c = zufVar;
        this.d = q8nVar;
        this.e = k8g1Var.Y && k8g1Var.X == qpe1.b;
    }

    public final Disposable a(Consumer consumer) {
        if (!this.e) {
            return yu2.e;
        }
        lt20 lt20VarB = this.b.b(this.a.a, true);
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new k6e0(new n5s0(lt20VarB, this, (byte) 1), (byte) 20), new n5s0(lt20VarB, this, (byte) 0), new x010(new n5s0(lt20VarB, this, (byte) 2), this.c.b, new r5s0(3, null), (byte) 1)};
        companion.getClass();
        return new b(this.d, mr20VarArr).a(new xu2(consumer, (byte) 17));
    }
}
