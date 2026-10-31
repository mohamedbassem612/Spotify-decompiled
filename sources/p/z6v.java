package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z6v extends hab0 implements iu30 {
    public final /* synthetic */ ss50 X;
    public final /* synthetic */ xtb0 Y;
    public final /* synthetic */ ven0 Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dw91 d;
    public final /* synthetic */ dw91 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6v(int i, int i2, dw91 dw91Var, dw91 dw91Var2, float f, float f2, float f3, float f4, ven0 ven0Var, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var2, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = dw91Var;
        this.e = dw91Var2;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.t = ven0Var;
        this.X = ss50Var;
        this.Y = xtb0Var;
        this.Z = ven0Var2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        int i2 = this.b;
        ven0 ven0Var = this.Z;
        xtb0 xtb0Var = this.Y;
        ss50 ss50Var = this.X;
        switch (b) {
            case 0:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & ((Offset) obj).a));
                float f = this.h;
                float f2 = this.i;
                dw91 dw91Var = this.d;
                dw91 dw91Var2 = this.e;
                float f3 = this.f;
                float f4 = this.g;
                ven0 ven0Var2 = this.t;
                bs51.d(ven0Var2, ss50Var, xtb0Var, ven0Var, new nz(fIntBitsToFloat, i2, i, bs51.e(dw91Var, dw91Var2, f3, f4, f, f2, ven0Var2)));
                break;
            default:
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & ((Offset) obj).a));
                float f5 = this.h;
                float f6 = this.i;
                dw91 dw91Var3 = this.d;
                dw91 dw91Var4 = this.e;
                float f7 = this.f;
                float f8 = this.g;
                ven0 ven0Var3 = this.t;
                bs51.d(ven0Var3, ss50Var, xtb0Var, ven0Var, new nz(fIntBitsToFloat2, i2, i, bs51.e(dw91Var3, dw91Var4, f7, f8, f5, f6, ven0Var3)));
                break;
        }
        return rih1Var;
    }
}
