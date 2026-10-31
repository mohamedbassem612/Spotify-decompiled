package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class jk6 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk6(byte b, float f) {
        super(1, t890.class, "x", "invoke$x(FF)F", 0);
        this.a = b;
        switch (b) {
            case 1:
                this.b = f;
                super(1, t890.class, "y", "invoke$y(FF)F", 0);
                break;
            case 2:
                this.b = f;
                super(1, t890.class, "y", "invoke$y(FF)F", 0);
                break;
            case 3:
                this.b = f;
                super(1, t890.class, "x", "invoke$x(FF)F", 0);
                break;
            case 4:
                this.b = f;
                super(1, t890.class, "y", "invoke$y(FF)F", 0);
                break;
            default:
                this.b = f;
                break;
        }
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new p3v(mk6.a(this.b, ((Number) obj).floatValue()));
            case 1:
                return new p3v(mk6.d(this.b, ((Number) obj).floatValue()));
            case 2:
                return new p3v(mk6.d(this.b, ((Number) obj).floatValue()));
            case 3:
                return new p3v(mk6.a(this.b, ((Number) obj).floatValue()));
            default:
                return new p3v(mk6.d(this.b, ((Number) obj).floatValue()));
        }
    }
}
