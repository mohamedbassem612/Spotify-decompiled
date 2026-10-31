package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sih extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ hdn0 e;
    public final /* synthetic */ hdn0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sih(long j, tob1 tob1Var, ven0 ven0Var, hdn0 hdn0Var, hdn0 hdn0Var2, hdn0 hdn0Var3) {
        super(1);
        this.a = j;
        this.b = tob1Var;
        this.c = ven0Var;
        this.d = hdn0Var;
        this.e = hdn0Var2;
        this.f = hdn0Var3;
    }

    public final Object invoke(Object obj) {
        wat watVar = (wat) obj;
        long j = this.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        ven0 ven0Var = this.c;
        int iIntBitsToFloat = (int) (fIntBitsToFloat - Float.intBitsToFloat((int) (((Offset) ven0Var.getValue()).a >> 32)));
        int iS = this.d.s() - this.e.s();
        if (iS < 0) {
            iS = 0;
        }
        int iP = yoi1.p(iIntBitsToFloat, 0, iS);
        int iX0 = (int) ((watVar.X0(27.0f) * (1.0f - ((Number) this.b.getValue()).floatValue())) + ((Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (((Offset) ven0Var.getValue()).a & 4294967295L))) - this.f.s()));
        return new qr80((((long) iP) << 32) | (((long) (iX0 >= 0 ? iX0 : 0)) & 4294967295L));
    }
}
