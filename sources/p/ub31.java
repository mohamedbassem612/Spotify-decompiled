package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ub31 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ccq a;
    public final /* synthetic */ String b;

    public ub31(ccq ccqVar, String str) {
        this.a = ccqVar;
        this.b = str;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        za31 za31Var = (za31) obj;
        String str = za31Var.b;
        ega1 ega1VarA = za31Var.a;
        kga1 kga1VarA = this.a.a(str);
        int i = za31Var.c;
        int i2 = i == 0 ? -1 : sb31.a[l1d.C(i)];
        String str2 = this.b;
        if (i2 != -1) {
            if (i2 == 1) {
                ega1VarA = ega1.a(kga1VarA.b(str2), ega1VarA.a, null, null, 6);
            } else {
                if (i2 != 2) {
                    eg.o();
                    return null;
                }
                ega1VarA = ega1.a(kga1VarA.b(str2), null, ega1VarA.b, null, 5);
            }
        }
        kga1VarA.c(str2, ega1VarA);
        return rih1.a;
    }
}
