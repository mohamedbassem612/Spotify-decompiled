package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p2g implements dlv {
    public static final p2g b = new p2g(0);
    public static final p2g c = new p2g(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ p2g(byte b2) {
        this.a = b2;
    }

    public final float a(float f) {
        switch (this.a) {
            case 0:
                if (f < 0.5f) {
                    return 4.0f * f * f * f;
                }
                float f2 = (f * (-2.0f)) + 2.0f;
                return 1.0f - (((f2 * f2) * f2) / 2.0f);
            default:
                return vaw0.a.getInterpolation(f);
        }
    }
}
