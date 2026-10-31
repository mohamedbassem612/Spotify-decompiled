package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ng6 extends hab0 implements vu30 {
    public final /* synthetic */ yj41 N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ boolean P0;
    public final /* synthetic */ boolean Q0;
    public final /* synthetic */ Function0 R0;
    public final /* synthetic */ Function0 S0;
    public final /* synthetic */ vu30 T0;
    public final /* synthetic */ vu30 U0;
    public final /* synthetic */ vu30 V0;
    public final /* synthetic */ xu30 W0;
    public final /* synthetic */ float X;
    public final /* synthetic */ qim0 X0;
    public final /* synthetic */ float Y;
    public final /* synthetic */ int Y0;
    public final /* synthetic */ float Z;
    public final /* synthetic */ int Z0;
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ uh6 c;
    public final /* synthetic */ uh6 d;
    public final /* synthetic */ c380 e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ vu30 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng6(c380 c380Var, uh6 uh6Var, uh6 uh6Var2, c380 c380Var2, vu30 vu30Var, vu30 vu30Var2, String str, String str2, boolean z, float f, float f2, float f3, yj41 yj41Var, boolean z2, boolean z3, boolean z4, Function0 function0, Function0 function1, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5, xu30 xu30Var, qim0 qim0Var, int i, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = uh6Var;
        this.d = uh6Var2;
        this.e = c380Var2;
        this.f = vu30Var;
        this.g = vu30Var2;
        this.h = str;
        this.i = str2;
        this.t = z;
        this.X = f;
        this.Y = f2;
        this.Z = f3;
        this.N0 = yj41Var;
        this.O0 = z2;
        this.P0 = z3;
        this.Q0 = z4;
        this.R0 = function0;
        this.S0 = function1;
        this.T0 = vu30Var3;
        this.U0 = vu30Var4;
        this.V0 = vu30Var5;
        this.W0 = xu30Var;
        this.X0 = qim0Var;
        this.Y0 = i;
        this.Z0 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int i = this.Z0;
                int iP = czo1.p(1);
                oho1.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, this.X0, this.Y0, i, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int i2 = this.Z0;
                int iP2 = czo1.p(1);
                oho1.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, this.X0, this.Y0, i2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
