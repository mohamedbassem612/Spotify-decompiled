package p;

import android.os.Bundle;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gas implements r7m0 {
    public final gzr a;
    public final boolean b;
    public MobiusLoop.Controller c;
    public final upa0 d;

    public gas(gzr gzrVar, bm00 bm00Var, boolean z) {
        this.a = gzrVar;
        this.b = z;
        fas fasVar = new fas(this);
        mh20 mh20Var = (mh20) ((uw0) ((khp) bm00Var.b).a.c).e;
        upa0 upa0Var = new upa0();
        ((zf30) mh20Var).s1.a(new s7m0(upa0Var, mh20Var));
        ((zf30) mh20Var).x1.j().c("find_in_show_mobius_controller_state", new uk(fasVar, (byte) 10));
        this.d = upa0Var;
    }

    public final MobiusLoop.Controller a() {
        MobiusLoop.Builder builderA = RxMobius.a(das.a, this.a.c);
        upa0 upa0Var = this.d;
        Bundle bundle = (Bundle) upa0Var.b;
        String string = bundle != null ? bundle.getString("search_query") : null;
        boolean z = ((Bundle) upa0Var.b) != null;
        MobiusLoop.Controller controllerB = Mobius.b(builderA, new ph20(string, null, true ^ z, b7x.a, this.b), eas.a, MainThreadWorkRunner.a());
        this.c = controllerB;
        return controllerB;
    }
}
