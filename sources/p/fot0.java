package p;

import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fot0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ lik1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fot0(List list, lik1 lik1Var, byte b) {
        super(1);
        this.a = b;
        this.b = list;
        this.c = lik1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lik1 lik1Var = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                p1l0 p1l0Var = (p1l0) obj;
                return list.size() == 1 ? p1l0Var.e(((ContextTrack) o7h.q0(list)).uri()) : p1l0Var.e(lik1Var.a);
            default:
                uyk0 uyk0Var = (uyk0) obj;
                return list.size() == 1 ? uyk0Var.e(((ContextTrack) o7h.q0(list)).uri()) : uyk0Var.e(lik1Var.a);
        }
    }
}
