package p;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f6z extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ smc0 b;
    public final /* synthetic */ z9p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6z(smc0 smc0Var, z9p z9pVar, byte b) {
        super(1);
        this.a = b;
        this.b = smc0Var;
        this.c = z9pVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z9p z9pVar = this.c;
        smc0 smc0Var = this.b;
        switch (b) {
            case 0:
                smc0Var.add(((oy1) z9pVar.e).b((lik1) z9pVar.z, Collections.singletonList((ContextTrack) obj)));
                break;
            default:
                smc0Var.add(((oy1) z9pVar.d).b((lik1) z9pVar.z, Collections.singletonList((ContextTrack) obj)));
                break;
        }
        return rih1Var;
    }
}
