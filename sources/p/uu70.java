package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uu70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wu70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu70(wu70 wu70Var, byte b) {
        super(1);
        this.a = b;
        this.b = wu70Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wu70 wu70Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayListF = wu70Var.f((hv70) obj);
                hs00 hs00Var = wu70Var.Y;
                ezc ezcVarG = hs00Var != null ? yoi1.g(hs00Var.d()) : new huz(w7x.a, (byte) 10);
                return arrayListF.isEmpty() ? new ry50(ezcVarG, (byte) 7) : new x010(t2p1.u(wu70Var.e(), pu70.a, arrayListF), ezcVarG, new qr0(arrayListF, (lnm) null, (byte) 23), (byte) 1);
            default:
                z2s z2sVar = (z2s) obj;
                z2sVar.Q(kv70.class, (lu70) wu70Var.S0.getValue(), zr70.b1, zr70.c1, vu70.b, g070.X);
                z2sVar.R(lv70.class, wu70Var.T0, zr70.d1, zr70.e1, vu70.c, false, g070.Y);
                return rih1.a;
        }
    }
}
