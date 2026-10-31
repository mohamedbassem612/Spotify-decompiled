package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o6m extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6m(hw61 hw61Var, byte b) {
        super(1);
        this.a = b;
        this.b = hw61Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hw61 hw61Var = this.b;
        switch (b) {
            case 0:
                eqc eqcVar = (eqc) obj;
                return eqcVar.b(new ef6(hw61Var, Size.e(eqcVar.a.j()) * 0.038f, (byte) 3));
            default:
                eqc eqcVar2 = (eqc) obj;
                long j = u7h.b;
                float fE = Size.e(eqcVar2.a.j()) * 0.07f;
                eqcVar2.a.j();
                float f = 2.0f * fE;
                return eqcVar2.b(new of0(fE, hw61Var.a(Size.a(Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) + f, Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)) + f), eqcVar2.a.getLayoutDirection(), eqcVar2), j));
        }
    }
}
