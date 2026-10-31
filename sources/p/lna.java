package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lna extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lna(byte b, long j, long j2) {
        super(3);
        this.a = b;
        this.b = j;
        this.c = j2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return new jm51((i3i0) obj, (xcu0) obj2, (n900) obj3, this.b, this.c);
            default:
                return new tn51((i3i0) obj, (xcu0) obj2, (n900) obj3, this.b, this.c);
        }
    }
}
