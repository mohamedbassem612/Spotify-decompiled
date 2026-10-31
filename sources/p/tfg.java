package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tfg extends o6 implements qzh {
    public final tfg N0;
    public iu30 O0;
    public final hrr0 P0;

    public tfg(Context context) {
        super(context, (AttributeSet) null, 0);
        this.N0 = this;
        this.P0 = v8r.q(new sfg(0, false, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sfg getState() {
        return (sfg) this.P0.getValue();
    }

    private final void setState(sfg sfgVar) {
        this.P0.setValue(sfgVar);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-972720844);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            fq7.g(getState().a && getState().b > 0, (qim0) null, xa4.q(), xa4.r(), (String) null, apo.r(-596754596, new dwd(this, (byte) 26), x340Var), x340Var, 196608, 18);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qff(this, i, (byte) 9);
        }
    }

    public final void f(Object obj) {
        setState((sfg) obj);
    }

    public View getView() {
        return this.N0;
    }

    public final void n(iu30 iu30Var) {
        this.O0 = iu30Var;
    }

    public final void z(sfg sfgVar) {
        setState(sfgVar);
    }
}
