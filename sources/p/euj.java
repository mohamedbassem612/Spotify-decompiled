package p;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class euj extends o6 implements tlv {
    public final bpb1 N0;
    public final bpb1 O0;

    public euj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.N0 = gio1.b((Object) null);
        this.O0 = gio1.b(cjj.Y);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1885145173);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(-1994006466, new swc(rwq.h(this.N0, x340Var, 0), this, rwq.h(this.O0, x340Var, 0), (byte) 26), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new boj(this, i, (byte) 6);
        }
    }

    public final void f(Object obj) {
        this.N0.l(obj);
    }

    public final void n(iu30 iu30Var) {
        bpb1 bpb1Var = this.O0;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, iu30Var);
    }

    public abstract void y(Object obj, iu30 iu30Var, x340 x340Var);
}
