package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oy20 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy20(byte b, long j) {
        super(1);
        this.a = b;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        long j = this.b;
        switch (b) {
            case 0:
                return new u7h(j);
            default:
                ((sp21) obj).l = Long.valueOf(j);
                return rih1.a;
        }
    }
}
