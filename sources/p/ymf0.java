package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ymf0 extends hab0 implements vu30 {
    public final /* synthetic */ yqg X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ double h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Flowable t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymf0(List list, String str, String str2, String str3, long j, long j2, long j3, double d, boolean z, Flowable flowable, yqg yqgVar, iu30 iu30Var, int i) {
        super(2);
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = d;
        this.i = z;
        this.t = flowable;
        this.X = yqgVar;
        this.Y = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        d9y0.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP);
        return rih1.a;
    }
}
