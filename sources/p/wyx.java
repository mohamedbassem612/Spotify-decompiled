package p;

import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wyx extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ short O0;
    public final /* synthetic */ FontWeight X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ a0e1 e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ djc0 h;
    public final /* synthetic */ qx8 i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wyx(String str, qim0 qim0Var, lee1 lee1Var, long j, a0e1 a0e1Var, int i, boolean z, djc0 djc0Var, qx8 qx8Var, float f, FontWeight fontWeight, iu30 iu30Var, int i2, int i3, int i4) {
        super(2);
        this.a = str;
        this.b = qim0Var;
        this.c = lee1Var;
        this.d = j;
        this.e = a0e1Var;
        this.f = i;
        this.g = z;
        this.h = djc0Var;
        this.i = qx8Var;
        this.t = f;
        this.X = fontWeight;
        this.Y = iu30Var;
        this.Z = i2;
        this.N0 = i3;
        this.O0 = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        short s = this.O0;
        gxo1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
