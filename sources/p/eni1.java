package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eni1 extends hab0 implements iu30 {
    public final /* synthetic */ fni1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eni1(fni1 fni1Var) {
        super(1);
        this.a = fni1Var;
    }

    public final Object invoke(Object obj) {
        ani1 ani1Var = this.a.b;
        return Mobius.d(zmi1.a, ani1Var.a).c(ani1Var.d, new EventSource[]{ani1Var.b, ani1Var.c, ani1Var.e, ani1Var.f, ani1Var.g});
    }
}
