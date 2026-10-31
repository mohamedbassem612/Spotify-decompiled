package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qko implements mko {
    public final a a;
    public final mr20 b;
    public final q8n c;
    public final q8n d;
    public volatile MobiusLoop e;
    public volatile Disposable f;
    public final bpb1 g = gio1.b(rko.a);
    public final oko h = new oko(this);

    public qko(a aVar, mr20 mr20Var, q8n q8nVar, q8n q8nVar2) {
        this.a = aVar;
        this.b = mr20Var;
        this.c = q8nVar;
        this.d = q8nVar2;
    }

    @Override // p.mko
    public final void a(Set set) {
        MobiusLoop mobiusLoop = this.e;
        if (mobiusLoop != null) {
            mobiusLoop.a(new y450(set));
        }
    }

    @Override // p.mko
    public final kko b() {
        return this.h;
    }

    @Override // p.mko
    public final void start() {
        Disposable disposable = this.f;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.e;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        MobiusLoop.Builder builderB = Mobius.d(rve0.c, this.a).d(new i6b(this, (byte) 24)).b(new rjn(this, (byte) 3));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = this.c;
        mr20[] mr20VarArr = {new lt0(this.b, (byte) 2)};
        companion.getClass();
        MobiusLoop mobiusLoopG = builderB.h(new b(q8nVar, mr20VarArr)).g(rko.a);
        this.e = mobiusLoopG;
        this.f = mobiusLoopG.b(new y11(this, (byte) 7));
    }

    @Override // p.mko
    public final void stop() {
        Disposable disposable = this.f;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.e;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        this.e = null;
        this.f = null;
        this.g.m((Object) null, rko.a);
    }
}
