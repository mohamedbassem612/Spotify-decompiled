package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oc5 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ lee1 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ dlv g;
    public final /* synthetic */ short h;
    public final /* synthetic */ byte i;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oc5(String str, boolean z, vu30 vu30Var, qim0 qim0Var, lee1 lee1Var, long j, dlv dlvVar, int i, int i2, List list, int i3) {
        super(2);
        this.a = str;
        this.b = z;
        this.c = vu30Var;
        this.d = qim0Var;
        this.e = lee1Var;
        this.f = j;
        this.g = dlvVar;
        this.h = i;
        this.i = i2;
        this.t = list;
        this.X = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wqn1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(this.X | 1));
        return rih1.a;
    }
}
