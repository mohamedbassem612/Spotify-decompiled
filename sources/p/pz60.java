package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pz60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ c070 a;

    public pz60(c070 c070Var) {
        this.a = c070Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jz60 jz60Var = (jz60) obj;
        gid gidVar = this.a.b;
        fq0 fq0Var = jz60Var.a;
        String str = jz60Var.b;
        String str2 = jz60Var.c;
        String str3 = jz60Var.d;
        if (str3 == null) {
            str3 = "";
        }
        gidVar.h(fq0Var, str, str2, str3);
        return rih1.a;
    }
}
