package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n0p0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o0p0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0p0(o0p0 o0p0Var, byte b) {
        super(0);
        this.a = b;
        this.b = o0p0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        o0p0 o0p0Var = this.b;
        switch (b) {
            case 0:
                m7p0 m7p0Var = o0p0Var.L1;
                if (m7p0Var != null) {
                    return new l7p0(m7p0Var.c.incrementAndGet());
                }
                u890.C("nowPlayingVisibilityStateUpdater");
                throw null;
            default:
                gh4 gh4Var = o0p0Var.M1;
                if (gh4Var != null) {
                    return Boolean.valueOf(gh4Var.h());
                }
                u890.C("props");
                throw null;
        }
    }
}
