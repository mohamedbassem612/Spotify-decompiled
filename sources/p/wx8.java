package p;

import com.spotify.player.model.command.SkipToNextTrackCommand;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wx8 implements ux8 {
    public final w9u0 a;

    public wx8(w9u0 w9u0Var) {
        this.a = w9u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lnm lnmVar) {
        vx8 vx8Var;
        if (lnmVar instanceof vx8) {
            vx8Var = (vx8) lnmVar;
            int i = vx8Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vx8Var.c = i - Integer.MIN_VALUE;
            } else {
                vx8Var = new vx8(this, lnmVar);
            }
        } else {
            vx8Var = new vx8(this, lnmVar);
        }
        Object objJ = vx8Var.a;
        int i2 = vx8Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = this.a.a(new m9u0(SkipToNextTrackCommand.builder().build()));
            vx8Var.c = 1;
            objJ = fc11.j(singleA, vx8Var);
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
        beh behVar = (feh) objJ;
        return behVar instanceof beh ? new y5d1(new k6d1("ad_incentive_failed", behVar.a)) : z5d1.a;
    }
}
