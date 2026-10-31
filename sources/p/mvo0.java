package p;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mvo0 extends z511 {
    public final Activity d;
    public final gw70 e;
    public final pvo0 f;
    public List g = z6x.a;

    public mvo0(Activity activity, gw70 gw70Var, pvo0 pvo0Var) {
        this.d = activity;
        this.e = gw70Var;
        this.f = pvo0Var;
    }

    public final int e() {
        if (this.g.isEmpty()) {
            return 0;
        }
        return this.g.size() + 1;
    }

    public final int g(int i) {
        return i == 0 ? 1 : 2;
    }

    public final void n(int i, w611 w611Var) {
        tx31 tx31Var = ((ox40) w611Var).U0;
        if (tx31Var instanceof tx31) {
            y781 y781Var = (y781) this.g.get(i - 1);
            tx31 tx31Var2 = tx31Var;
            tx31Var2.getTitleView().setText(y781Var.b);
            tx31Var2.getSubtitleView().setText(y781Var.c);
            ixg ixgVarF = this.e.f(y781Var.d);
            ixgVarF.m(qz70.c(tx31Var2.getTitleView().getContext(), 2131232442, 4, 16));
            ixgVarF.k(tx31Var2.getImageView(), (ird1) null);
            SwitchCompat switchCompatO = tx31Var2.o();
            switchCompatO.setOnCheckedChangeListener(null);
            switchCompatO.setChecked(y781Var.e);
            switchCompatO.setOnCheckedChangeListener(new ldr(this, y781Var, (byte) 3));
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        Activity activity = this.d;
        if (i == 1) {
            return new ox40(new pto0(activity, viewGroup));
        }
        s7s0 s7s0VarR = t890.r(activity, viewGroup, 2131625039);
        ux31 ux31Var = new ux31(s7s0VarR);
        s7s0VarR.setTag(2131429011, ux31Var);
        ux31Var.i(new SwitchCompat(activity));
        return new ox40(ux31Var);
    }
}
