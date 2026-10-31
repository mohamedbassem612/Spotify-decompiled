package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vs61 implements l4h1 {
    public final aep a;
    public final npq b;
    public final tpq c;
    public final ufz0 d;

    public vs61(aep aepVar, npq npqVar, tpq tpqVar, ufz0 ufz0Var) {
        this.a = aepVar;
        this.b = npqVar;
        this.c = tpqVar;
        this.d = ufz0Var;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        MobiusLoop.Controller controller = ((ms61) ((gs61) obj)).h;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        u800 u800VarA = this.a.a(layoutInflater, viewGroup, new q961(this, (byte) 12));
        upq upqVar = (upq) this.b.a.c;
        cr6 cr6Var = new cr6(u800VarA, (tr61) ((jly0) upqVar.v).get(), (ufz0) ((jly0) upqVar.w).get());
        upq upqVar2 = (upq) this.c.a.c;
        return new us61(controller, new bfz(cr6Var, u800VarA, bundle, (qs61) ((jly0) upqVar2.f).get(), (ufz0) ((jly0) upqVar2.w).get()));
    }
}
