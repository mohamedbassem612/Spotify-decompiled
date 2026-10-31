package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mv30 extends hs40 {
    public final /* synthetic */ byte e = 1;

    public /* synthetic */ mv30(s1c1 s1c1Var, y5 y5Var) {
        super(s1c1Var, y5Var);
    }

    @Override // p.hs40
    public final List h() {
        byte b = this.e;
        z6x z6xVar = z6x.a;
        switch (b) {
            case 0:
                lv30 lv30Var = (lv30) this.b;
                yv30 yv30Var = lv30Var.g;
                if (u890.j(yv30Var, uv30.d)) {
                    return Collections.singletonList(tx9.m(lv30Var, false));
                }
                return u890.j(yv30Var, xv30.d) ? Collections.singletonList(tx9.m(lv30Var, true)) : z6xVar;
            default:
                return z6xVar;
        }
    }

    public mv30(eeg eegVar, s1c1 s1c1Var) {
        super(s1c1Var, eegVar);
    }
}
