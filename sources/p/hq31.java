package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hq31 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iq31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq31(iq31 iq31Var, byte b) {
        super(1);
        this.a = b;
        this.b = iq31Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        iq31 iq31Var = this.b;
        switch (b) {
            case 0:
                rq31 rq31Var = (rq31) jhc1.t((Bundle) obj, "ROUND_PLAY_MODEL", rq31.class);
                if (rq31Var != null) {
                    return rq31Var;
                }
                gq31 gq31Var = iq31Var.a;
                vp31 vp31Var = gq31Var.c;
                boolean z = gq31Var.d;
                return new rq31(vp31Var, z6x.a, new sq31((k1z0) o7h.q0(vp31Var.g), (Long) null, (Long) null, false), z, false, false);
            default:
                cas casVar = (a7m0) obj;
                casVar.a = jh31.f;
                casVar.a(vm31.Y, new hq31(iq31Var, b2));
                return rih1.a;
        }
    }
}
