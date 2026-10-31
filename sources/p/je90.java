package p;

import android.content.Intent;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class je90 implements rq21 {
    @Override // p.rq21
    public final nq21 b(Intent intent) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        String strM = s4b1VarX.m();
        if (strM == null || strM.length() == 0) {
            return mq21.a;
        }
        v5b1 v5b1Var = s4b1VarX.d;
        b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
        boolean z = u890.j(type, nyu0.e) || u890.j(type, wyu0.f);
        String strM2 = s4b1VarX.m();
        String strZ = (!z || strM2 == null || strM2.length() == 0) ? s4b1VarX.z() : gvg.h("spotify:internal:playlist:", s4b1VarX.h(), ":invite:", strM2);
        return new kq21(strZ == null ? "" : strZ, lfb.j(uic.x(strZ)));
    }
}
