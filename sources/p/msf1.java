package p;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class msf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ smc0 b;
    public final /* synthetic */ ib3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ msf1(smc0 smc0Var, ib3 ib3Var, byte b) {
        super(1);
        this.a = b;
        this.b = smc0Var;
        this.c = ib3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ib3 ib3Var = this.c;
        smc0 smc0Var = this.b;
        switch (b) {
            case 0:
                smc0Var.add(((oy1) ib3Var.h).b((lik1) ib3Var.I, Collections.singletonList((ContextTrack) obj)));
                break;
            default:
                smc0Var.add(((oy1) ib3Var.g).b((lik1) ib3Var.I, Collections.singletonList((ContextTrack) obj)));
                break;
        }
        return rih1Var;
    }
}
