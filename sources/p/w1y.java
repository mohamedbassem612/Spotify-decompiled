package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w1y implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ otu a;

    public w1y(otu otuVar) {
        this.a = otuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        char c;
        String str;
        rpu rpuVar = ((p1y) obj).a;
        otu otuVar = this.a;
        nqk0 nqk0VarN = otuVar.n(rpuVar);
        int iOrdinal = rpuVar.ordinal();
        if (iOrdinal == 0) {
            c = 1;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            c = 2;
        }
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        mmr0 mmr0Var = new mmr0("setting_name", "dj_commentary");
        if (c == 1) {
            str = "default";
        } else {
            if (c != 2) {
                throw null;
            }
            str = "sometimes";
        }
        ((i8h1) otuVar.b).m(new w7h1("", "", z7h1Var, new x7h1("set_multiple_choice_setting", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("option_selected", str)})), nqk0VarN.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
        return rih1.a;
    }
}
