package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iq81 implements Init {
    public final /* synthetic */ pxw a;

    public iq81(pxw pxwVar) {
        this.a = pxwVar;
    }

    public final First e0(Object obj) {
        qq81 qq81Var = (qq81) obj;
        ko81 ko81Var = new ko81(false);
        th2 th2Var = qq81Var.d;
        HashSet hashSetA = Effects.a(new s9p1[]{ko81Var, new go81(new zf2(th2Var.c, th2Var.b, th2Var.a))});
        if (this.a.a) {
            hashSetA.add(new io81(new sww(qq81Var.b.b())));
        }
        return First.c(qq81Var, hashSetA);
    }
}
