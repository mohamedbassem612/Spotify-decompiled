package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o1s0 implements BiFunction {
    public final g0l a;

    public Object apply(Object obj, Object obj2) {
        ContextTrack contextTrack;
        ContextTrack contextTrack2;
        rwj1 rwj1Var = (twj1) obj;
        PlayerState playerState = (PlayerState) obj2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        inr inrVar = this.a;
        l0l l0lVarC = inrVar.c();
        boolean z = false;
        boolean z2 = (l0lVarC == null || l0lVarC.l()) ? false : true;
        if (z2 && (contextTrack2 = (ContextTrack) playerState.track().h()) != null && !l4o1.X(contextTrack2)) {
            z = true;
        }
        if (z && (contextTrack = (ContextTrack) playerState.track().h()) != null && s3o1.v(contextTrack, true)) {
            l0l l0lVarC2 = inrVar.c();
            String name = l0lVarC2 != null ? l0lVarC2.getName() : null;
            if (name == null) {
                name = "";
            }
            String strD = l0lVarC2 != null ? l0lVarC2.d() : null;
            linkedHashSet.add(new k090(name, strD != null ? strD : ""));
        }
        if ((!z2 || z) && (rwj1Var instanceof rwj1) && rwj1Var.a.contains(ujj1.b)) {
            linkedHashSet.add(j090.b);
        }
        return o7h.p1(linkedHashSet);
    }
}
