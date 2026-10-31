package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f3u0 extends hab0 implements iu30 {
    public final /* synthetic */ p3u0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3u0(p3u0 p3u0Var, long j, long j2, int i) {
        super(1);
        this.a = p3u0Var;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public final Object invoke(Object obj) {
        ((Number) obj).longValue();
        p3u0 p3u0Var = this.a;
        p3u0Var.h.o(p3u0Var.i, this.b, this.c, this.d);
        return rih1.a;
    }
}
