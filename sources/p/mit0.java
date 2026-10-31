package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mit0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fit0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mit0(fit0 fit0Var, byte b) {
        super(1);
        this.a = b;
        this.b = fit0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        fit0 fit0Var = this.b;
        switch (b) {
            case 0:
                bot0 bot0Var = (bot0) jhc1.t((Bundle) obj, "PLAY_MODEL", bot0.class);
                if (bot0Var != null) {
                    return bot0Var;
                }
                return new bot0(fit0Var.b, fit0Var.c, fit0Var.d.size(), fit0Var.e, fit0Var.d);
            default:
                cas casVar = (a7m0) obj;
                casVar.a = cps0.d1;
                casVar.a(iet0.Q0, new mit0(fit0Var, (byte) 0));
                return rih1.a;
        }
    }
}
