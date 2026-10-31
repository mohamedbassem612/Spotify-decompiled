package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vfo0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wmy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vfo0(wmy wmyVar, byte b) {
        super(1);
        this.a = b;
        this.b = wmyVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wmy wmyVar = this.b;
        switch (b) {
            case 0:
                return new vm61(2131959835, 2131962072, 2131959834, new ufo0(wmyVar, null, (byte) 0), new um61(new sl11(12, (byte) 7), new n601(qfo0.c, (byte) 28), fft0.Z0));
            default:
                return new vm61(2131959835, 2131962073, 2131959834, new ufo0(wmyVar, null, (byte) 1), new um61(new sl11(13, (byte) 7), new n601(qfo0.d, (byte) 28), fft0.Z0));
        }
    }
}
