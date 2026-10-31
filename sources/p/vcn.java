package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vcn extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mko b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vcn(mko mkoVar, byte b) {
        super(1);
        this.a = b;
        this.b = mkoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        mko mkoVar = this.b;
        switch (b) {
            case 0:
                mkoVar.start();
                return new ucn(mkoVar, (byte) 0);
            default:
                mkoVar.start();
                return new ucn(mkoVar, (byte) 1);
        }
    }
}
