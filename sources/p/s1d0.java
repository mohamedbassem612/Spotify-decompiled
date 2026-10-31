package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s1d0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ snc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1d0(snc0 snc0Var, byte b) {
        super(1);
        this.a = b;
        this.b = snc0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new r1d0(this.b, (byte) 0);
            default:
                return new r1d0(this.b, (byte) 1);
        }
    }
}
