package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q5z implements l4h1 {
    public final v6r0 a;
    public final aep b;
    public final bep c;
    public final dep d;

    public q5z(v6r0 v6r0Var, aep aepVar, bep bepVar, dep depVar) {
        this.a = v6r0Var;
        this.b = aepVar;
        this.c = bepVar;
        this.d = depVar;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        MobiusLoop.Controller controllerA = this.a.a((ir61) obj);
        u800 u800VarA = this.b.a(layoutInflater, viewGroup, null);
        r5z r5zVar = new r5z(u800VarA, (i5z) ((jly0) ((uw0) this.c.a.c).Z).get());
        this.d.getClass();
        return new p5z(controllerA, new qn(r5zVar, u800VarA, bundle));
    }
}
