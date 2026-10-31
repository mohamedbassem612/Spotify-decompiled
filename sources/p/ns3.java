package p;

import android.os.Bundle;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ns3 extends x7e0 implements b031 {
    public final rs3 d;
    public final hs3 e;
    public final edr0 f;
    public Bundle g;

    public ns3(rs3 rs3Var, hs3 hs3Var, edr0 edr0Var) {
        this.d = rs3Var;
        this.e = hs3Var;
        this.f = edr0Var;
    }

    public final void a(Bundle bundle) {
        this.g = bundle.getBundle("ALLBOARDING_HOST_FLOW_STATE");
        this.f.c(of61.a, bundle.getString("ALLBOARDING_HOST_FLOW_SESSION_ID"));
    }

    public final void e() {
        fn3 fn3Var;
        EntryPoint entryPoint = this.d.a;
        Bundle bundle = this.g;
        ks3 ks3Var = (ks3) this.e;
        if (ks3Var.i == null) {
            fn3 fn3Var2 = null;
            if (bundle != null && (fn3Var = (fn3) jhc1.t(bundle, "ALLBOARDING_PAGE_FLOW_STATE", fn3.class)) != null && (fn3Var.d != null || !u890.j(fn3Var.b, fn3.e.b))) {
                fn3Var2 = fn3Var;
            }
            MobiusLoop mobiusLoopG = l1d.g(Mobius.d(new drm1((byte) 3), RxConnectables.a(ks3Var.a.a(new js3(ks3Var, (byte) 1))))).d(new e4b1(ks3Var, (byte) 14)).b(new t4d1(ks3Var, (byte) 10)).g(fn3Var2 == null ? fn3.e : fn3Var2);
            mobiusLoopG.b(new js3(ks3Var, (byte) 0));
            mobiusLoopG.a(fn3Var2 != null ? vm3.a : new wm3(entryPoint));
            ks3Var.i = mobiusLoopG;
        }
        i();
    }

    public final Bundle serialize() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ks3 ks3Var = (ks3) this.e;
        fn3 fn3VarA = ks3Var.j;
        if (fn3VarA == null) {
            bundle = new Bundle();
        } else {
            ro41 ro41Var = ks3Var.k;
            if (ro41Var != null && fn3VarA.b.c.getClass() == ro41.class && u890.j(fn3VarA.b.a, ks3Var.l)) {
                fn3VarA = fn3.a(fn3VarA, (EntryPoint) null, wub1.a(fn3VarA.b, ro41Var), (ArrayList) null, (jm3) null, 13);
            }
            bundle = new Bundle();
            bundle.putParcelable("ALLBOARDING_PAGE_FLOW_STATE", fn3VarA);
        }
        bundle2.putBundle("ALLBOARDING_HOST_FLOW_STATE", bundle);
        bundle2.putString("ALLBOARDING_HOST_FLOW_SESSION_ID", this.f.b(of61.a).toString());
        return bundle2;
    }
}
