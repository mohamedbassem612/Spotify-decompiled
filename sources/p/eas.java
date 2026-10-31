package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eas implements Init {
    public static final eas a = new eas();

    public final First e0(Object obj) {
        ph20 ph20Var = (ph20) obj;
        return First.c(ph20Var, Effects.a(new c2p1[]{new eh20(ph20Var.a)}));
    }
}
