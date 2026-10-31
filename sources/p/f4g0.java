package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f4g0 {
    public final xrc0 a;
    public final ynb0 b;
    public final idd1 c = new idd1(lxf0.e);

    public f4g0(xrc0 xrc0Var, ynb0 ynb0Var) {
        this.a = xrc0Var;
        this.b = ynb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(he51 he51Var, onm onmVar) {
        e4g0 e4g0Var;
        kby kbyVar;
        he51 he51Var2 = he51Var;
        if (onmVar instanceof e4g0) {
            e4g0Var = (e4g0) onmVar;
            int i = e4g0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4g0Var.d = i - Integer.MIN_VALUE;
            } else {
                e4g0Var = new e4g0(this, onmVar);
            }
        } else {
            e4g0Var = new e4g0(this, onmVar);
        }
        Object objF = e4g0Var.b;
        int i2 = e4g0Var.d;
        if (i2 == 0) {
            hm5.M(objF);
            String str = he51Var2.b;
            trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) this.c.getValue(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
            e4g0Var.a = he51Var2;
            e4g0Var.d = 1;
            objF = this.a.f(str, trc0Var, e4g0Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            he51Var2 = e4g0Var.a;
            hm5.M(objF);
        }
        wsc0 wsc0Var = (wsc0) ((py21) objF).c();
        if (wsc0Var != null && (kbyVar = wsc0Var.f) != null) {
            if (kbyVar.v.a() || !kbyVar.w.h.a.contains(wls0.c)) {
                kbyVar = null;
            }
            if (kbyVar != null) {
                return ((c1d0) this.b.get()).a(he51Var2.b, kbyVar.v);
            }
        }
        return null;
    }
}
