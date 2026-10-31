package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qrz0 extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrz0(long j, int i, String str) {
        super(1);
        this.a = i;
        this.b = j;
        this.c = str;
    }

    public final Object invoke(Object obj) throws Exception {
        d441 d441VarG1 = ((y341) obj).g1("\n            UPDATE RateLimitedEvents\n            SET count = ?,\n            timestamp = ?\n            WHERE eventName = ?\n        ");
        try {
            d441VarG1.r(1, this.a);
            d441VarG1.r(2, this.b);
            d441VarG1.K(3, this.c);
            d441VarG1.f1();
            return rih1.a;
        } finally {
            d441VarG1.close();
        }
    }
}
