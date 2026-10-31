package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yqi1 {
    public static final yqi1 b = new yqi1(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ yqi1(byte b2) {
        this.a = b2;
    }

    public final boolean a(int i, float[] fArr) {
        switch (this.a) {
            case 0:
                return Math.max(((float) ((i >> 16) & 255)) / 255.0f, Math.max(((float) ((i >> 8) & 255)) / 255.0f, ((float) (i & 255)) / 255.0f)) > 0.2f;
            default:
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                        return true;
                    }
                }
                return false;
        }
    }
}
