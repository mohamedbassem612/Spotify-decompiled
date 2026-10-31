package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w13 {
    public final xrc0 a;

    public w13(xrc0 xrc0Var) {
        this.a = xrc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, onm onmVar) {
        v13 v13Var;
        kby kbyVar;
        if (onmVar instanceof v13) {
            v13Var = (v13) onmVar;
            int i = v13Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v13Var.c = i - Integer.MIN_VALUE;
            } else {
                v13Var = new v13(this, onmVar);
            }
        } else {
            v13Var = new v13(this, onmVar);
        }
        Object objF = v13Var.a;
        int i2 = v13Var.c;
        String str2 = null;
        if (i2 == 0) {
            hm5.M(objF);
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            sku0 sku0VarP = PlaylistDecorationPolicy.p();
            sku0VarP.r();
            hru0VarS.x(sku0VarP);
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
            v13Var.c = 1;
            objF = this.a.f(str, trc0Var, v13Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        wsc0 wsc0Var = (wsc0) ((py21) objF).c();
        if (wsc0Var != null && (kbyVar = wsc0Var.f) != null) {
            str2 = kbyVar.A;
        }
        return Boolean.valueOf(!(str2 == null || ihc1.y0(str2)));
    }
}
