package p;

import android.view.KeyEvent;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wt3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ az20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt3(az20 az20Var, byte b) {
        super(1);
        this.a = b;
        this.b = az20Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        dz20 dz20Var = this.b;
        switch (b) {
            case 0:
                KeyEvent keyEvent = ((cpa0) obj).a;
                if (ern1.t(keyEvent) == 2) {
                    long jD = mno1.d(keyEvent.getKeyCode());
                    if (toa0.a(jD, toa0.f) || toa0.a(jD, toa0.q)) {
                        dz20Var.i(6, true);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                az20.a(dz20Var);
                return rih1Var;
            case 2:
                KeyEvent keyEvent2 = ((cpa0) obj).a;
                long jD2 = mno1.d(keyEvent2.getKeyCode());
                long j = toa0.e;
                if (toa0.a(jD2, j) || toa0.a(jD2, toa0.f)) {
                    if (ern1.t(keyEvent2) == 2) {
                        dz20Var.i(toa0.a(mno1.d(keyEvent2.getKeyCode()), j) ? 5 : 6, true);
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                long j2 = ((Offset) obj).a;
                az20.a(dz20Var);
                return rih1Var;
            case 4:
                if (!dz20Var.i(6, true)) {
                    az20.a(dz20Var);
                }
                return rih1Var;
            default:
                long j3 = ((Offset) obj).a;
                az20.a(dz20Var);
                return rih1Var;
        }
    }
}
