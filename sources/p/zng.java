package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zng implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dmr a;
    public final /* synthetic */ ltf1 b;

    public zng(dmr dmrVar, ltf1 ltf1Var) {
        this.a = dmrVar;
        this.b = ltf1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        mog mogVar = (mog) obj;
        i8g1 i8g1Var = mogVar.c;
        String str = mogVar.e;
        boolean z = i8g1Var instanceof e8g1;
        dmr dmrVar = this.a;
        if (z) {
            dmrVar.c(mogVar.i, str, mogVar.g, mogVar.f, true, 0, mogVar.j, mogVar.k);
        } else if (i8g1Var instanceof f8g1) {
            String str2 = mogVar.h;
            this.b.g(mogVar.d, str2, 102, "Failed to trim video for videoUri: ".concat(str), ((f8g1) i8g1Var).a);
            dmrVar.c(mogVar.i, str, mogVar.g, mogVar.f, false, 1, mogVar.j, mogVar.k);
        } else if (!(i8g1Var instanceof d8g1) && !(i8g1Var instanceof g8g1) && !(i8g1Var instanceof h8g1)) {
            eg.o();
            return null;
        }
        return rih1.a;
    }
}
