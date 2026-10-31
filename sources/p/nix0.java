package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nix0 {
    public final dcq a;
    public final mr20 b;
    public final n6r0 c;
    public final q8n d;
    public final q8n e;
    public volatile MobiusLoop f;
    public volatile Disposable g;
    public final bpb1 h = gio1.b(oix0.a);

    public nix0(dcq dcqVar, mr20 mr20Var, n6r0 n6r0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = dcqVar;
        this.b = mr20Var;
        this.c = n6r0Var;
        this.d = q8nVar;
        this.e = q8nVar2;
    }

    public final void a() {
        Disposable disposable = this.g;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.f;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        MobiusLoop.Builder builderB = Mobius.d(xxb0.f, this.a.a(this.c)).d(new rpv0(this, (byte) 6)).b(new hvp0(this, (byte) 23));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = this.d;
        mr20[] mr20VarArr = {new c1v0(this.b, (byte) 27)};
        companion.getClass();
        MobiusLoop mobiusLoopG = builderB.h(new b(q8nVar, mr20VarArr)).g(oix0.a);
        this.f = mobiusLoopG;
        this.g = mobiusLoopG.b(new y11(this, (byte) 19));
    }

    public final void b() {
        Disposable disposable = this.g;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.f;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        this.f = null;
        this.g = null;
        this.h.m((Object) null, oix0.a);
    }
}
