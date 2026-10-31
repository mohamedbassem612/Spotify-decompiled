package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qae1 extends hab0 implements vu30 {
    public final /* synthetic */ String X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ flb0 c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ c380 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ggv g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ fde1 i;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qae1(int i, int i2, long j, String str, List list, ggv ggvVar, iu30 iu30Var, c380 c380Var, c380 c380Var2, flb0 flb0Var, qim0 qim0Var, fde1 fde1Var, boolean z) {
        super(2);
        this.a = i;
        this.b = qim0Var;
        this.c = flb0Var;
        this.d = c380Var;
        this.e = c380Var2;
        this.f = i2;
        this.g = ggvVar;
        this.h = iu30Var;
        this.i = fde1Var;
        this.t = list;
        this.X = str;
        this.Y = j;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i = this.a;
            flb0 flb0Var = this.c;
            qim0 qim0Var = this.b;
            if (i == 2) {
                x340Var2.i0(1957009680);
                bs51.c(flb0Var, this.d, this.e, this.f, this.g, this.h, anm1.N("draggable_text_content", qim0Var), this.i, this.t, this.X, this.Y, this.Z, x340Var2, 0);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1957622829);
                c1e1.a(flb0Var, this.d, this.e, this.f, this.h, anm1.N("text_content", qim0Var), this.i, this.X, this.Z, x340Var2, 0);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
