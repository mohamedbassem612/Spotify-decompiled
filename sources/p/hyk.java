package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hyk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yyk a;

    public hyk(yyk yykVar) {
        this.a = yykVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[PHI: r2
      0x0022: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:5:0x0015, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        a1r0 a1r0Var = this.a.h;
        sxk sxkVar = ((nvk) obj).a;
        int iC = l1d.C(sxkVar.a);
        int i = 3;
        if (iC != 0) {
            int i2 = 1;
            if (iC != 1) {
                i2 = 2;
                if (iC == 2) {
                    i = i2;
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    i = 4;
                }
            } else {
                i = i2;
            }
        }
        int i3 = sxkVar.b;
        a1r0.m(a1r0Var, "spotify:internal:magpie:update-cadence", (tv80) null, i7w0.e(new jrr0(i, i3 != 0 ? rqg0.E(i3).a() : 0, bm41.b)), 8);
        return rih1.a;
    }
}
