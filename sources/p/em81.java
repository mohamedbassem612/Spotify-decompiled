package p;

import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class em81 {
    public static final PlaylistRequestDecorationPolicy a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.C();
        hru0VarS.v(iou0VarV);
        a = hru0VarS.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(xrc0 xrc0Var, String str, String str2, boolean z, onm onmVar) {
        dm81 dm81Var;
        if (onmVar instanceof dm81) {
            dm81Var = (dm81) onmVar;
            int i = dm81Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dm81Var.b = i - Integer.MIN_VALUE;
            } else {
                dm81Var = new dm81(onmVar);
            }
        } else {
            dm81Var = new dm81(onmVar);
        }
        Object objJ = dm81Var.a;
        int i2 = dm81Var.b;
        if (i2 == 0) {
            hm5.M(objJ);
            mr20 mr20VarM = ((rsc0) xrc0Var).m(str, str2, a);
            egv0 egv0Var = new egv0(z, (lnm) null);
            dm81Var.b = 1;
            objJ = b5p1.j(mr20VarM, egv0Var, dm81Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return ((py21) objJ).a(oa81.c1);
    }
}
