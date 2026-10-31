package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lc5 extends hab0 implements vu30 {
    public final /* synthetic */ short X;
    public final /* synthetic */ String a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ dlv f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ short h;
    public final /* synthetic */ byte i;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lc5(String str, qim0 qim0Var, boolean z, lee1 lee1Var, long j, dlv dlvVar, iu30 iu30Var, int i, int i2, List list, int i3) {
        super(2);
        this.a = str;
        this.b = qim0Var;
        this.c = z;
        this.d = lee1Var;
        this.e = j;
        this.f = dlvVar;
        this.g = iu30Var;
        this.h = i;
        this.i = i2;
        this.t = list;
        this.X = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wqn1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(this.X | 1));
        return rih1.a;
    }
}
