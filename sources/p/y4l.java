package p;

import android.view.KeyEvent;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y4l implements u3b1 {
    public final kor a;
    public final fpr b;
    public final jo20 c;

    public y4l(kor korVar, fpr fprVar, jo20 jo20Var) {
        this.a = korVar;
        this.b = fprVar;
        this.c = jo20Var;
    }

    @Override // p.u3b1
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.c.isEnabled()) {
            fpr fprVar = this.b;
            if (((Boolean) fprVar.h.a.getValue()).booleanValue()) {
                Objects.toString(fprVar.h.a.getValue());
                return false;
            }
        }
        return this.a.a(keyEvent, "volume_on_key_down_main_activity", tqk.X0);
    }
}
