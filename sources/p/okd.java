package p;

import android.content.Context;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class okd implements okf1 {
    public final pkd a;
    public final lid b;
    public final nid c;
    public final Context d;

    public okd(pkd pkdVar, l7m0 l7m0Var, lid lidVar, nid nidVar, Context context) {
        this.a = pkdVar;
        this.b = lidVar;
        this.c = nidVar;
        this.d = context;
    }

    public final nkf1 a(q2p0 q2p0Var) {
        return this.a.g(q2p0Var).a();
    }

    public final boolean b(kkf1 kkf1Var) {
        ContextTrack contextTrack = kkf1Var.a;
        nid nidVar = this.c;
        if (!nidVar.a.a(contextTrack, nidVar.b)) {
            return false;
        }
        String str = (String) contextTrack.metadata().get("canvas.type");
        sid sidVarValueOf = str != null ? sid.valueOf(str) : null;
        sidVarValueOf.getClass();
        return (sidVarValueOf == sid.b || sidVarValueOf == sid.c || sidVarValueOf == sid.d) && this.b.c.a(this.d);
    }
}
