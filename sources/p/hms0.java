package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hms0 {
    public final bpb1 a;
    public final xe01 b;
    public final MobiusLoop c;

    public hms0(qns0 qns0Var, iac0 iac0Var) {
        bpb1 bpb1VarB = gio1.b(new ad2());
        this.a = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
        MobiusLoop mobiusLoopG = l1d.g(Mobius.d(new drm1((byte) 1), new sc2(qns0Var)).h(new zc2(qns0Var))).g(new ad2());
        mobiusLoopG.b(new y11(this, (byte) 17));
        this.c = mobiusLoopG;
        iac0Var.getLifecycle().a(new awc(this, (byte) 2));
    }
}
