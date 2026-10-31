package p;

import com.spotify.lyrics.sharecard.events.proto.LyricsSharingV3;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class unf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cof0 a;
    public final /* synthetic */ wh71 b;

    public unf0(cof0 cof0Var, wh71 wh71Var) {
        this.a = cof0Var;
        this.b = wh71Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kcw kcwVar = (kcw) obj;
        rnf0 rnf0Var = kcwVar.c;
        String str = kcwVar.d;
        o571 o571Var = kcwVar.e;
        String str2 = o571Var.a;
        bef0 bef0Var = rnf0Var.c;
        String str3 = bef0Var.c;
        String str4 = bef0Var.a;
        Map map = rnf0Var.d.d;
        String str5 = String.format("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(4294967295L & ((long) rnf0Var.a.a))}, 1));
        t2j0 t2j0Var = this.a.a;
        ppf0 ppf0VarO = LyricsSharingV3.o();
        ppf0VarO.v(str);
        ppf0VarO.t(str3);
        ppf0VarO.u(str4);
        ppf0VarO.n(map);
        ppf0VarO.q(str5);
        ppf0VarO.r();
        ppf0VarO.s(str2);
        t2j0Var.a(ppf0VarO.build());
        Object objA = this.b.a(new dlw0(o571Var, kcwVar.f), onmVar);
        return objA == d9n.a ? objA : rih1.a;
    }
}
