package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e7v extends hab0 implements vu30 {
    public final /* synthetic */ long X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ flb0 a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ggv e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ fde1 h;
    public final /* synthetic */ List i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7v(int i, int i2, long j, String str, List list, ggv ggvVar, iu30 iu30Var, c380 c380Var, c380 c380Var2, flb0 flb0Var, qim0 qim0Var, fde1 fde1Var, boolean z) {
        super(2);
        this.a = flb0Var;
        this.b = c380Var;
        this.c = c380Var2;
        this.d = i;
        this.e = ggvVar;
        this.f = iu30Var;
        this.g = qim0Var;
        this.h = fde1Var;
        this.i = list;
        this.t = str;
        this.X = j;
        this.Y = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        bs51.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP);
        return rih1.a;
    }
}
