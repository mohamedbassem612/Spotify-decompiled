package p;

import android.content.Context;
import android.util.AttributeSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iod1 extends o6 {
    public gw70 N0;
    public final err0 O0;
    public final hrr0 P0;

    public iod1(Context context) {
        super(context, (AttributeSet) null, 0);
        this.O0 = new err0(0);
        this.P0 = v8r.q(z6x.a);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-207010943);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(1234317780, new znd1(this, (byte) 1), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new znd1(this, i);
        }
    }

    public final gw70 getImageLoader() {
        gw70 gw70Var = this.N0;
        if (gw70Var != null) {
            return gw70Var;
        }
        u890.C("imageLoader");
        throw null;
    }

    public final int getSelectedTabIndex() {
        return this.O0.s();
    }

    public final List<fod1> getTabContentList() {
        return (List) this.P0.getValue();
    }

    public final void setImageLoader(gw70 gw70Var) {
        this.N0 = gw70Var;
    }

    public final void setSelectedTabIndex(int i) {
        this.O0.t(i);
    }

    public final void setTabContentList(List<fod1> list) {
        this.P0.setValue(list);
    }
}
