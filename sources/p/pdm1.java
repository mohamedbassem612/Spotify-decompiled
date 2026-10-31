package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class pdm1 {
    public static final yux a = new yux(((float) Math.tan(Math.toRadians(37.5d))) * 0.5f);

    public static float a(float f) {
        yux yuxVar = a;
        float f2 = yuxVar.b;
        float fMin = f2 - Math.min((float) Math.atan(f * yuxVar.a), f2);
        if (fMin < 0.0f) {
            return 0.0f;
        }
        return fMin;
    }
}
