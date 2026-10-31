package p;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b9z implements yt11 {
    public final f1n0 a;
    public final vgm b;
    public final Function0 c;
    public final yzc0 d;
    public final lik1 e;

    public b9z(f1n0 f1n0Var, vgm vgmVar, Function0 function0, yzc0 yzc0Var, lik1 lik1Var) {
        this.a = f1n0Var;
        this.b = vgmVar;
        this.c = function0;
        this.d = yzc0Var;
        this.e = lik1Var;
    }

    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        if ((unb1Var instanceof jmb1) && tv80Var != null) {
            uv11 uv11Var = ((jmb1) unb1Var).a;
            Bundle bundleH = mno1.h(new mmr0[]{new mmr0("extra_playback_context_uri", uv11Var.b), new mmr0("extra_playback_row_id", uv11Var.d), new mmr0("extra_playback_state", this.d.f())});
            Object objE = this.a.e(uv11Var.a, tv80Var, bundleH, onmVar);
            if (objE == d9n.a) {
                return objE;
            }
        }
        return rih1.a;
    }

    public final s9d1 b() {
        return null;
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        if ((unb1Var instanceof jmb1) && tv80Var != null) {
            fns fnsVar = igu.a;
            Object objY = fn31.Y(pyf0.a.f, new piu((Object) this, (Object) unb1Var, (Object) tv80Var, (lnm) null, (byte) 11), onmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }
}
