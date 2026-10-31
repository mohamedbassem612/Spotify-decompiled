package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oko implements kko {
    public final /* synthetic */ qko a;

    public oko(qko qkoVar) {
        this.a = qkoVar;
    }

    @Override // p.kko
    public final zob1 a() {
        return this.a.g;
    }

    @Override // p.kko
    public final Object b(String str, tv80 tv80Var, onm onmVar) {
        MobiusLoop mobiusLoop = this.a.e;
        if (mobiusLoop != null) {
            mobiusLoop.a(new v450(str, tv80Var));
        }
        return rih1.a;
    }
}
