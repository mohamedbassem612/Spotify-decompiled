package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f7v extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7v(float f, float f2, float f3) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final Object invoke(Object obj) {
        int iU = jch0.U(this.a);
        return new qr80((((long) jch0.U(this.b - (this.c / 2.0f))) & 4294967295L) | (((long) iU) << 32));
    }
}
