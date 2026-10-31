package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class toc implements nu11 {
    public final t45 a;
    public final ioc b;
    public final u7m0 c;
    public final b d;
    public volatile boolean e;
    public MobiusLoop f;

    public toc(t45 t45Var, lt0 lt0Var, iac0 iac0Var, o8n o8nVar, ioc iocVar) {
        this.a = t45Var;
        this.b = iocVar;
        MobiusCoroutines.Companion companion = MobiusCoroutines.a;
        l2 l2Var = new l2(this, (lnm) null, (byte) 19);
        companion.getClass();
        this.c = new u7m0(o8nVar, l2Var);
        FlowEventSources.Companion companion2 = FlowEventSources.a;
        mr20[] mr20VarArr = {new ik(lt0Var, (byte) 22)};
        companion2.getClass();
        this.d = new b(o8nVar, mr20VarArr);
        iac0Var.getLifecycle().a(new koc(this));
    }

    public final void d(long j, String str) {
        MobiusLoop mobiusLoop;
        if (this.e || (mobiusLoop = this.f) == null) {
            return;
        }
        mobiusLoop.a(new ooc(str, j));
    }

    public final void e(long j, String str) {
        MobiusLoop mobiusLoop;
        if (this.e || (mobiusLoop = this.f) == null) {
            return;
        }
        mobiusLoop.a(new noc(str, j));
    }

    public final void i(long j, String str) {
        MobiusLoop mobiusLoop;
        if (this.e || (mobiusLoop = this.f) == null) {
            return;
        }
        mobiusLoop.a(new poc(str, j));
    }
}
